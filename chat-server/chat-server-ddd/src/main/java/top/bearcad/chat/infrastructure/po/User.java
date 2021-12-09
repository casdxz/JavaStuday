package top.bearcad.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: chat-server
 * @description: 用户
 * @author: bearcad
 * @create: 2021-11-09 00:44
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private Long id;
    private String userId;
    private String userNickName;
    private String userHead;
    private String userPassword;
    private Date createTime;
    private Date updateTime;

}
