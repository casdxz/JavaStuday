package top.bearcad.netty.demo.server;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @program: netty-demo
 * @description: Channel信息处理器
 * @author: bearcad
 * @create: 2021-10-31 23:17
 **/
public class ChannelHandler {

    /**
     * 用于存放用户Channel信息，也可以建立map结构模拟不同的消息群
     */
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}
