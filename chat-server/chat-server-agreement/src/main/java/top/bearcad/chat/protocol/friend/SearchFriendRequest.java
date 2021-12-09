package top.bearcad.chat.protocol.friend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.bearcad.chat.protocol.Command;
import top.bearcad.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 搜索好友请求
 * @author: bearcad
 * @create: 2021-11-08 23:48
 **/
@Getter
@Setter
@ToString
public class SearchFriendRequest extends Packet {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 搜索字段
     */
    private String searchKey;

    public SearchFriendRequest() {
    }

    public SearchFriendRequest(String userId, String searchKey) {
        this.userId = userId;
        this.searchKey = searchKey;
    }


    @Override
    public Byte getCommand() {
        return Command.SearchFriendRequest;
    }

}
