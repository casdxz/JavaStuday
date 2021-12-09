package top.bearcad.chat.protocol.friend;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.bearcad.chat.protocol.Command;
import top.bearcad.chat.protocol.Packet;
import top.bearcad.chat.protocol.friend.dto.UserDto;

import java.util.List;
/**
 * @program: chat-server
 * @description: 搜索好友应答
 * @author: bearcad
 * @create: 2021-11-08 23:48
 **/

@Getter
@Setter
@ToString
public class SearchFriendResponse extends Packet {

    private List<UserDto> list;

    @Override
    public Byte getCommand() {
        return Command.SearchFriendResponse;
    }
}
