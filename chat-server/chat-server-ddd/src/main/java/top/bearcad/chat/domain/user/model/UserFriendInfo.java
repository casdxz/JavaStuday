package top.bearcad.chat.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: chat-server
 * @description: 好友信息
 * @author: bearcad
 * @create: 2021-11-09 00:33
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserFriendInfo {

    private String friendId;
    private String friendName;
    private String friendHead;

}