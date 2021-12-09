package top.bearcad.chat.protocol.login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.bearcad.chat.protocol.Command;
import top.bearcad.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 重连请求
 * @author: bearcad
 * @create: 2021-11-09 00:05
 **/
@Getter
@Setter
@ToString
public class ReconnectRequest extends Packet {

    private String userId;

    public ReconnectRequest(String userId) {
        this.userId = userId;
    }

    @Override
    public Byte getCommand() {
        return Command.ReconnectRequest;
    }
}