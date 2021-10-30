package top.bearcad.netty.demo.aio;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;

/**
 * @program: netty-demo-1-00
 * @description: ChannelHandler
 * @author: bearcad
 * @create: 2021-10-30 22:32
 **/
public class ChannelHandler {
    private AsynchronousSocketChannel channel;
    private final Charset charset;

    public ChannelHandler(AsynchronousSocketChannel channel, Charset charset) {
        this.channel = channel;
        this.charset = charset;
    }

    public void writeAndFlush(Object msg) {
        byte[] bytes = msg.toString().getBytes(charset);
        ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
        writeBuffer.put(bytes);
        writeBuffer.flip();
        channel.write(writeBuffer);
    }

    public AsynchronousSocketChannel channel() {
        return channel;
    }

    public void setChannel(AsynchronousSocketChannel channel) {
        this.channel = channel;
    }

}
