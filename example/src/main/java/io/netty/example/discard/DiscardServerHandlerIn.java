package io.netty.example.discard;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;


/**
 * @author yanweiqi
 * <H1>Handles a server-side channel. <br>
 * 处理服务端的 channel</H1>
 * <p>
 * DiscardServerHandlerIn继承ChannelInboundHandlerAdapter,这个类实现了ChannelInboundHnadler接口,
 * channelInboundHandler提供了许多时间处理的接口方法可以进行覆盖这些方法，现在仅仅只需要继承ChannelInboundHandler
 * Adapter这个类，而不是你自己去实现这个方法。
 * </p>
 * 
 * 
 */
public class DiscardServerHandlerIn extends ChannelInboundHandlerAdapter {

	/**
	 * 覆盖channelRead这个方法，每当从客户端收到新的数据时，这个方式在收到消息是会被调用，在这个例子中收到的消息类型是ByteBuf，
	 * ByteBuf是一个引用计数对象，这个对象必须显示的调用release()方法来释放，请记住处理器的职责是释放所有传递到处理器的引用计数对象。
	 * 通常，channelRead()方法的实现就像下面的这段代码
	 */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // discard
    	ByteBuf in = (ByteBuf) msg;
    	try{
        	while(in.isReadable()){
                System.out.print((char) in.readByte());
                System.out.flush();
        	}
    	} finally{
    		ReferenceCountUtil.release(msg);
    	}
    	

    }

    /** 
	 * Close the connection when an exception is raised.<br>
	 * 当有异常时关掉连接.
	 * 
	 */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

}
