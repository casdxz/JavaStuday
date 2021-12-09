package top.bearcad.chat.protocol.friend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.bearcad.chat.protocol.Command;
import top.bearcad.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 添加好友应答
 * @author: bearcad
 * @create: 2021-11-08 23:48
 **/
@Getter
@Setter
@ToString
public class AddFriendResponse extends Packet {

    private String friendId;
    private String friendNickName;
    private String friendHead;

    public AddFriendResponse() {
    }

    public AddFriendResponse(String friendId, String friendNickName, String friendHead) {
        this.friendId = friendId;
        this.friendNickName = friendNickName;
        this.friendHead = friendHead;
    }

    @Override
    public Byte getCommand() {
        return Command.AddFriendResponse;
    }
}
