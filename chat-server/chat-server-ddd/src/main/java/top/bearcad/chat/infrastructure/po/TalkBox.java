package top.bearcad.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:43
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TalkBox {

    private Long id;
    private String userId;
    private String talkId;
    private Integer talkType;
    private Date createTime;
    private Date updateTime;

}

