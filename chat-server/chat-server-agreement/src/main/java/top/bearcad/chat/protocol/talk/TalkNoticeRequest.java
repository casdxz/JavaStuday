package top.bearcad.chat.protocol.talk;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.bearcad.chat.protocol.Command;
import top.bearcad.chat.protocol.Packet;
/**
 * @program: chat-server
 * @description: 对话通知请求
 * @author: bearcad
 * @create: 2021-11-09 00:15
 **/
@Getter
@Setter
@ToString
public class TalkNoticeRequest extends Packet {

    private String userId;
    private String friendUserId;
    /**
     * 对话框类型[0好友、1群组]
     */
    private Integer talkType;

    public TalkNoticeRequest() {
    }

    public TalkNoticeRequest(String userId, String friendUserId, Integer talkType) {
        this.userId = userId;
        this.friendUserId = friendUserId;
        this.talkType = talkType;
    }

    @Override
    public Byte getCommand() {
        return Command.TalkNoticeRequest;
    }
}
