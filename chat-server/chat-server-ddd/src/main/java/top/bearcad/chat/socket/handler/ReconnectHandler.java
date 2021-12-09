package top.bearcad.chat.socket.handler;

import io.netty.channel.Channel;
import top.bearcad.chat.application.UserService;
import top.bearcad.chat.infrastructure.common.SocketChannelUtil;
import top.bearcad.chat.protocol.login.ReconnectRequest;
import top.bearcad.chat.socket.MyBizHandler;


import java.util.List;

/**
 * @program: chat-server
 * @description: 重连处理
 * @author: bearcad
 * @create: 2021-11-09 00:52
 **/
public class ReconnectHandler extends MyBizHandler<ReconnectRequest> {

    public ReconnectHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, ReconnectRequest msg) {
        logger.info("客户端断线重连处理。userId：{}", msg.getUserId());
        // 添加用户Channel
        SocketChannelUtil.removeUserChannelByUserId(msg.getUserId());
        SocketChannelUtil.addChannel(msg.getUserId(), channel);
        // 添加群组Channel
        List<String> groupsIdList = userService.queryTalkBoxGroupsIdList(msg.getUserId());
        for (String groupsId : groupsIdList) {
            SocketChannelUtil.addChannelGroup(groupsId, channel);
        }
    }

}
