package top.bearcad.netty.demo.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import top.bearcad.netty.demo.codec.ObjDecoder;
import top.bearcad.netty.demo.codec.ObjEncoder;
import top.bearcad.netty.demo.domain.MsgInfo;

/**
 * @program: netty-demo
 * @description: MyChannelInitializer
 * @author: bearcad
 * @create: 2021-11-03 22:01
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(MsgInfo.class));
        channel.pipeline().addLast(new ObjEncoder(MsgInfo.class));
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyServerHandler());
    }

}