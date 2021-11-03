package top.bearcad.netty.demo.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import top.bearcad.netty.demo.util.SerializationUtil;

/**
 * @program: netty-demo
 * @description: ObjEncoder
 * @author: bearcad
 * @create: 2021-11-03 22:42
 **/
public class ObjEncoder extends MessageToByteEncoder {

    private final Class<?> genericClass;

    public ObjEncoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, Object in, ByteBuf out)  {
        if (genericClass.isInstance(in)) {
            byte[] data = SerializationUtil.serialize(in);
            out.writeInt(data.length);
            out.writeBytes(data);
        }
    }

}