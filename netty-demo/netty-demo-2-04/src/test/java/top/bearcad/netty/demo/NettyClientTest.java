package top.bearcad.netty.demo;

import io.netty.channel.ChannelFuture;
import top.bearcad.netty.demo.client.NettyClient;
import top.bearcad.netty.demo.domain.FileTransferProtocol;
import top.bearcad.netty.demo.util.MsgUtil;
import java.io.File;
/**
 * @program: netty-demo
 * @description: NettyClientTest
 * @author: bearcad
 * @create: 2021-11-03 22:48
 **/
public class NettyClientTest {
    public static void main(String[] args) {
        //启动客户端
        ChannelFuture channelFuture = new NettyClient().connect("127.0.0.1", 7397);

        //文件信息{文件大于1024kb方便测试断点续传}
        File file = new File("C:/Users/Bear/Downloads/源程序代码.rar");
        FileTransferProtocol fileTransferProtocol = MsgUtil.buildRequestTransferFile(file.getAbsolutePath(), file.getName(), file.length());
        //发送信息；请求传输文件
        channelFuture.channel().writeAndFlush(fileTransferProtocol);
    }

}
