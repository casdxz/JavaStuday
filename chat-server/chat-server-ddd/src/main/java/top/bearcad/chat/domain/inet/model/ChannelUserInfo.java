package top.bearcad.chat.domain.inet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChannelUserInfo {

    private String userId;
    private String userNickName;
    private String userHead;
    /**
     * 状态[true在线、false不在线]
     */
    private boolean status;


}