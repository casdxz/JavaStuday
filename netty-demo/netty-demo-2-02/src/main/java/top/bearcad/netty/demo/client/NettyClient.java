package top.bearcad.netty.demo.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import top.bearcad.netty.demo.util.MsgUtil;


/**
 * @program: netty-demo
 * @description: NettyClient
 * @author: bearcad
 * @create: 2021-11-02 23:48
 **/
public class NettyClient {

    public static void main(String[] args) {
        new NettyClient().connect("127.0.0.1", 7397);
    }

    private void connect(String host, int port) {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.AUTO_READ, true);
            b.handler(new MyChannelInitializer());
            ChannelFuture f = b.connect(host, port).sync();
            System.out.println("Netty客户端启动！");

            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "如果你想得到，你就会得到，你所需要付出的只是行动。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "天空黑暗到一定程度，星辰就会熠熠生辉。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "耐心点，坚强点;总有一天，你承受过的疼痛会有助于你。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "成功需要成本，时间也是一种成本，对时间的珍惜就是对成本的节约。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "奋斗者在汗水汇集的江河里，将事业之舟驶到了理想的彼岸。"));
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }

}