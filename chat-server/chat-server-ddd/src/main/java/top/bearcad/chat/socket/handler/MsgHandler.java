package top.bearcad.chat.socket.handler;

import com.alibaba.fastjson.JSON;
import io.netty.channel.Channel;
import top.bearcad.chat.application.UserService;
import top.bearcad.chat.domain.user.model.ChatRecordInfo;
import top.bearcad.chat.infrastructure.common.Constants;
import top.bearcad.chat.infrastructure.common.SocketChannelUtil;
import top.bearcad.chat.protocol.msg.MsgRequest;
import top.bearcad.chat.protocol.msg.MsgResponse;
import top.bearcad.chat.socket.MyBizHandler;

/**
 * @program: chat-server
 * @description: 消息信息处理
 * @author: bearcad
 * @create: 2021-11-09 00:52
 **/
public class MsgHandler extends MyBizHandler<MsgRequest> {

    public MsgHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, MsgRequest msg) {
        logger.info("消息信息处理：{}", JSON.toJSONString(msg));
        // 异步写库
        userService.asyncAppendChatRecord(new ChatRecordInfo(msg.getUserId(), msg.getFriendId(), msg.getMsgText(), msg.getMsgType(), msg.getMsgDate()));
        // 添加对话框[如果对方没有你的对话框则添加]
        userService.addTalkBoxInfo(msg.getFriendId(), msg.getUserId(), Constants.TalkType.Friend.getCode());
        // 获取好友通信管道
        Channel friendChannel = SocketChannelUtil.getChannel(msg.getFriendId());
        if (null == friendChannel) {
            logger.info("用户id：{}未登录！", msg.getFriendId());
            return;
        }
        // 发送消息
        friendChannel.writeAndFlush(new MsgResponse(msg.getUserId(), msg.getMsgText(), msg.getMsgType(), msg.getMsgDate()));
    }

}
