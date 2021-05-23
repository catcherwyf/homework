package com.catcher.nio.client;

import com.catcher.netty.NettyClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class ConnectNettyClient {
    private String ip;
    private int port;
    private Channel channel;


    public ConnectNettyClient(String ip, int port){
        this.ip = ip;
        this.port = port;
    }

    public void get() throws Exception{
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();

        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        ChannelPipeline pipeline = socketChannel.pipeline();
                        pipeline.addLast(new NettyClientHandler());
                    }
                });
        final ChannelFuture future = bootstrap.connect(ip, port).sync();
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if(channelFuture.isSuccess()){
                    System.out.println("connect success");
                }else {
                    System.out.println("connect failure");
                    future.cause().printStackTrace();
                    group.shutdownGracefully();
                }
            }
        });
        this.channel = future.channel();
    }

    public Channel getChannel(){
        return channel;
    }
}
