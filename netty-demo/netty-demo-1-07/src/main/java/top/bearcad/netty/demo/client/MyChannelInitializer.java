package top.bearcad.netty.demo.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @program: netty-demo
 * @description: MyChannelInitializer
 * @author: bearcad
 * @create: 2021-11-01 18:42
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        System.out.println("连接报告开始");
        System.out.println("连接报告信息：本客户端连接到服务端。channelId：" + channel.id());
        System.out.println("连接报告完毕");
    }

}
