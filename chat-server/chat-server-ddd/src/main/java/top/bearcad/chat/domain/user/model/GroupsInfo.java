package top.bearcad.chat.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: chat-server
 * @description: 群组信息
 * @author: bearcad
 * @create: 2021-11-09 00:31
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupsInfo {

    private String groupId;
    private String groupName;
    private String groupHead;

}
