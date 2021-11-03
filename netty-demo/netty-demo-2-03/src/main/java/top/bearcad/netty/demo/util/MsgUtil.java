package top.bearcad.netty.demo.util;

import top.bearcad.netty.demo.domain.MsgInfo;

/**
 * @program: netty-demo
 * @description: MsgUtil
 * @author: bearcad
 * @create: 2021-11-03 22:02
 **/
public class MsgUtil {
    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}
