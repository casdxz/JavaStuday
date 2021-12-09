package top.bearcad.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: chat-server
 * @description: 群组
 * @author: bearcad
 * @create: 2021-11-09 00:43
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Groups {

    private Long id;
    private String groupId;
    private String groupName;
    private String groupHead;
    private Date createTime;
    private Date updateTime;

}
