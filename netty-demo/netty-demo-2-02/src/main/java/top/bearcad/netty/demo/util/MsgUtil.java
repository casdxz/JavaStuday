package top.bearcad.netty.demo.util;

import top.bearcad.netty.demo.domain.MsgBody;

/**
 * @program: netty-demo
 * @description:  MsgUtil
 * @author: bearcad
 * @create: 2021-11-02 23:50
 **/
public class MsgUtil {
    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo(msgInfo);
        return msg.build();
    }

}
