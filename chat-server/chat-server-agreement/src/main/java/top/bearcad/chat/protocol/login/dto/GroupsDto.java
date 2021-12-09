package top.bearcad.chat.protocol.login.dto;

import lombok.Data;

/**
 * @program: chat-server
 * @description: 群组Dto
 * @author: bearcad
 * @create: 2021-11-09 00:05
 **/
@Data
public class GroupsDto {

    private String groupId;
    private String groupName;
    private String groupHead;

}
