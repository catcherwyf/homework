package com.catcher.client;

import com.catcher.netty.NettyClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class ConnectNettyClient {
    private final String host;
    private final int port;
    private Channel channel;

    public ConnectNettyClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void get() throws Exception {
        final EventLoopGroup group = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group).channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline();
                        pipeline.addLast(new NettyClientHandler());

                    }
                });
        final ChannelFuture future = bootstrap.connect(host, port).sync();

        future.addListener(new ChannelFutureListener() {

            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (future.isSuccess()) {
                    System.out.println("success");

                } else {
                    System.out.println("failure");
                    future.cause().printStackTrace();
                    group.shutdownGracefully();
                }
            }
        });

        this.channel = future.channel();
    }

    public Channel getChannel() {
        return channel;
    }
}
