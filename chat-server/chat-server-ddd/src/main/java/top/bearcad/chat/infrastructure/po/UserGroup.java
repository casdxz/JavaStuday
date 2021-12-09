package top.bearcad.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: chat-server
 * @description: 用户群组
 * @author: bearcad
 * @create: 2021-11-09 00:45
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserGroup {

    private Long id;
    private String userId;
    private String groupId;
    private Date createTime;
    private Date updateTime;
}

