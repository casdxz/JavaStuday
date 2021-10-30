package top.bearcad.netty.demo.bio.server;

import top.bearcad.netty.demo.bio.ChannelAdapter;
import top.bearcad.netty.demo.bio.ChannelHandler;

import java.net.Socket;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @program: netty-demo-1-00
 * @description: BIO服务端消息处理器
 * @author: bearcad
 * @create: 2021-10-30 22:35
 **/
public class BioServerHandler extends ChannelAdapter {
    public BioServerHandler(Socket socket, Charset charset) {
        super(socket, charset);
    }

    @Override
    public void channelActive(ChannelHandler ctx) {
        System.out.println("LocalAddress:" + ctx.socket().getLocalAddress());
        ctx.writeAndFlush("我是BIO服务端的消息 \r\n");
    }

    @Override
    public void channelRead(ChannelHandler ctx, Object msg) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " 接收到消息：" + msg);
        ctx.writeAndFlush("hi 我已经收到你的消息！\r\n");
    }

}
