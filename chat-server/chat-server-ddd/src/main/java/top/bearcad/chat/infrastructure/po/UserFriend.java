package top.bearcad.chat.infrastructure.po;
import lombok.Data;

import java.util.Date;

/**
 * @program: chat-server
 * @description: 用户好友
 * @author: bearcad
 * @create: 2021-11-09 00:44
 **/
@Data
public class UserFriend {

    private Long id;
    private String userId;
    private String userFriendId;
    private Date createTime;
    private Date updateTime;

    public UserFriend() {
    }

    public UserFriend(String userId, String userFriendId) {
        this.userId = userId;
        this.userFriendId = userFriendId;
    }

}