package top.bearcad.chat.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: chat-server
 * @description: 用户信息
 * @author: bearcad
 * @create: 2021-11-09 00:34
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfo {

    private String userId;
    private String userNickName;
    private String userHead;

}
