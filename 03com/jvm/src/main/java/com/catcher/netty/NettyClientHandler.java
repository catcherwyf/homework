package com.catcher.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class NettyClientHandler extends SimpleChannelInboundHandler<String> {
    @Override
    public void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        try {
//            ByteBuf byteBuf = (ByteBuf) msg;
//            System.out.println(byteBuf.toString());

            System.out.println(msg);
            ctx.writeAndFlush(msg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
