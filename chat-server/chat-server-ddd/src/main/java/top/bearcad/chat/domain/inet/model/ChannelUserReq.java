package top.bearcad.chat.domain.inet.model;

import lombok.*;
import top.bearcad.chat.infrastructure.common.PageReq;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:26
 **/
@Getter
@Setter
@ToString
public class ChannelUserReq extends PageReq {

    private String userId;
    private String userNickName;

}

