package top.beacad.netty.demo.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.EmptyByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;

import java.nio.charset.StandardCharsets;


/**
 * @program: netty-demo
 * @description: MyServerHandler
 * @author: bearcad
 * @create: 2021-11-01 19:42
 **/
public class MyClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if (msg instanceof HttpRequest) {
            DefaultHttpRequest request = (DefaultHttpRequest) msg;
            System.out.println("URI:" + request.uri());
            System.err.println(msg);
        }

        if (msg instanceof HttpContent) {
            LastHttpContent httpContent = (LastHttpContent) msg;
            ByteBuf byteData = httpContent.content();
            if (!(byteData instanceof EmptyByteBuf)) {
                //接收msg消息
                byte[] msgByte = new byte[byteData.readableBytes()];
                byteData.readBytes(msgByte);
                System.out.println(new String(msgByte, StandardCharsets.UTF_8));
            }
        }

        String sendMsg = """
                人生只有一次，不妨勇敢一点，不会就学，不敢就拼，不能就做;
                人不努力的时候，老天爷是会一点一点把你的天赋收走的;
                当努力成为了人生的常态，那么你的生活就一直充满希望;
                不要让现在的自己，未来的你，讨厌困惑谁都有，但成功只配得上勇敢的行动派;
                即使没有人为你鼓掌，也要优雅地谢幕，感谢自己的认真付出。
                博客：https://bearcad.top""";

        FullHttpResponse response = new DefaultFullHttpResponse(
                HttpVersion.HTTP_1_1,
                HttpResponseStatus.OK,
                Unpooled.wrappedBuffer(sendMsg.getBytes(StandardCharsets.UTF_8)));

        response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain;charset=UTF-8");
        response.headers().set(HttpHeaderNames.CONTENT_LENGTH, response.content().readableBytes());
        response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        ctx.write(response);
        ctx.flush();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
        cause.printStackTrace();
    }

}
