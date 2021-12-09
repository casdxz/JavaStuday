package top.bearcad.chat.protocol.login.dto;

import lombok.Data;

/**
 * @program: chat-server
 * @description: 用户好友Dto
 * @author: bearcad
 * @create: 2021-11-09 00:05
 **/
@Data
public class UserFriendDto {

    private String friendId;
    private String friendName;
    private String friendHead;
}
