package top.bearcad.chat.socket.handler;

import io.netty.channel.Channel;
import top.bearcad.chat.application.UserService;
import top.bearcad.chat.protocol.talk.DelTalkRequest;
import top.bearcad.chat.socket.MyBizHandler;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:49
 **/
public class DelTalkHandler extends MyBizHandler<DelTalkRequest> {

    public DelTalkHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, DelTalkRequest msg) {
        userService.deleteUserTalk(msg.getUserId(), msg.getTalkId());
    }
}