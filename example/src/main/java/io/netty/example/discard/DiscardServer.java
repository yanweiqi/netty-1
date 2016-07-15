/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.example.discard;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.SelfSignedCertificate;

/**
 * Discards any incoming data.
 */
public final class DiscardServer {

    static final boolean SSL = System.getProperty("ssl") != null;
    static final int PORT = Integer.parseInt(System.getProperty("port", "8009"));

    public static void main(String[] args) throws Exception {
       new DiscardServer().run();
    }
    
    /**
     * <p>
     * <ul>
     * 
     * <li>NioEventLoopGroup是用来处理I/O操作的多线程事件循环器，Netty提供了许多不同的EventLoopGroup的实现用来处理不同的传输，
     * 在这个例子中我们实现一个服务端的应用，因此会有2个NioEventLoopGroup会被使用，第一个经常叫做BOSS，用来接收进来的连接，第二个经常
     * 会被叫做Worker，用来处理已经被接收的连接，一旦boos接收到连接，就会把连接信息注册到worker上。<br>
     * <li>如何知道多个个线程已经被使用，如何映射到已经创建的Channel上都需要依赖于EventLoopGroup的实现，并通过构造函数来配置他们的关系。
     * <li>ServerBootStrap是一个启动的NIO服务的辅助类，你可以在这个中直接使用Channel，但是这回一个复杂的处理过程，这很多情况下并不需要这么做
     * <li>这里我们指定使用NioServerSocketChannel类来举例说明一个新的Channel如何接收进来的连接。
     * <li>这里的事件处理类经常会被用来处理一个最近的已经接收的 Channel。ChannelInitializer 是一个特殊的处理类，他的目的是帮助使用者配置一个新的
     *  Channel。也许你想通过增加一些处理类比如DiscardServerHandler 来配置一个新的 Channel 或者其对应的ChannelPipeline 来实现你的网络程序。当
     *  你的程序变的复杂时，可能你会增加更多的处理类到 pipline 上，然后提取这些匿名类到最顶层的类上。<br>
     *  
     *  <li>你可以设置这里指定的 Channel 实现的配置参数。我们正在写一个TCP/IP 的服务端，因此我们被允许设置 socket 的参数选项比如tcpNoDelay 和
     *   keepAlive。请参考 ChannelOption 和详细的 ChannelConfig 实现的接口文档以此可以对ChannelOption 的有一个大概的认识。
     *   
     *   <li>你关注过 option() 和 childOption() 吗？option() 是提供给NioServerSocketChannel 用来接收进来的连接。childOption() 是提供给由父管道 
     *   ServerChannel 接收到的连接，在这个例子中也是 NioServerSocketChannel。
     * </ul>
     * </p>
     * 
     */
    private void run() throws Exception{
    	 // Configure SSL.
        final SslContext sslCtx;
        if (SSL) {
            SelfSignedCertificate ssc = new SelfSignedCertificate();
            sslCtx = SslContextBuilder.forServer(ssc.certificate(), ssc.privateKey()).build();
        } else {
            sslCtx = null;
        }
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
             .channel(NioServerSocketChannel.class)
             .handler(new LoggingHandler(LogLevel.INFO))
             .childHandler(new ChannelInitializer<SocketChannel>() {
                 @Override
                 public void initChannel(SocketChannel ch) {
                     ChannelPipeline p = ch.pipeline();
                     if (sslCtx != null) {
                         p.addLast(sslCtx.newHandler(ch.alloc()));
                     }
                     p.addLast(new DiscardServerHandlerIn());
                 }
             });

            // Bind and start to accept incoming connections. 
            // 绑定端口，开始接受进来的连接
            ChannelFuture f = b.bind(PORT).sync();

            // Wait until the server socket is closed. 
            // 等待服务器 socket的关闭
            // In this example, this does not happen, but you can do that to gracefully shut down your server.
            // 在这个例子中，这个不会发生，但是你可长优雅的关闭你的服务
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
