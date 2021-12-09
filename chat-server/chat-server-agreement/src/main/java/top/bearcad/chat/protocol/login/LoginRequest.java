package top.bearcad.chat.protocol.login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.bearcad.chat.protocol.Command;
import top.bearcad.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 登录请求
 * @author: bearcad
 * @create: 2021-11-09 00:04
 **/
@Getter
@Setter
@ToString
public class LoginRequest extends Packet {

    private String userId;
    private String userPassword;

    public LoginRequest(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }


    @Override
    public Byte getCommand() {
        return Command.LoginRequest;
    }

}