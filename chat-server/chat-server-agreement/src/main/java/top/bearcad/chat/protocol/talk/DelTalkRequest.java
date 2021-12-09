package top.bearcad.chat.protocol.talk;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.bearcad.chat.protocol.Command;
import top.bearcad.chat.protocol.Packet;
/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:15
 **/
@Getter
@Setter
@ToString
public class DelTalkRequest extends Packet {

    private String userId;
    private String talkId;

    public DelTalkRequest() {
    }

    public DelTalkRequest(String userId, String talkId) {
        this.userId = userId;
        this.talkId = talkId;
    }

    @Override
    public Byte getCommand() {
        return Command.DelTalkRequest;
    }
}
