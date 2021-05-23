package com.catcher.netty;

import com.catcher.nio.client.ConnectHttpClient;
import com.catcher.nio.client.ConnectNettyClient;
import com.catcher.nio.client.ConnectOKClient;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpUtil;
import io.netty.util.ReferenceCountUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static io.netty.handler.codec.http.HttpHeaderNames.CONNECTION;
import static io.netty.handler.codec.http.HttpHeaderValues.KEEP_ALIVE;
import static io.netty.handler.codec.http.HttpResponseStatus.NO_CONTENT;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

public class HttpHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        try {
            //logger.info("channelRead流量接口请求开始，时间为{}", startTime);
            FullHttpRequest fullRequest = (FullHttpRequest) msg;
            String uri = fullRequest.uri();
            String body = null;
            //logger.info("接收到的请求url为{}", uri);
            if (uri.contains("/httpClient")) {
                ConnectHttpClient httpClient = new ConnectHttpClient();
                body =  httpClient.get("http://localhost:8801");
                handlerTest(fullRequest, ctx, body);
            }else if(uri.contains("/okClient")){
                ConnectOKClient okClient = new ConnectOKClient();
                body = okClient.get("http://localhost:8802");
                handlerTest(fullRequest, ctx, body);
            }else if(uri.contains("/nettyClient")){
                ConnectNettyClient nettyClient = new ConnectNettyClient("localhost", 8803);
                nettyClient.get();
                Channel channel = nettyClient.getChannel();
                System.out.println(channel.read().toString());
                handlerTest(fullRequest, ctx, "hello, netty");
            }else {
                handlerTest(fullRequest, ctx, "hello, others");
            }

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    private void handlerTest(FullHttpRequest fullRequest, ChannelHandlerContext ctx, String content) {
        FullHttpResponse response = null;
        try {
            String value =  content; //"hello,kimmking"; // 对接上次作业的httpclient或者okhttp请求另一个url的响应数据
            response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(value.getBytes("UTF-8")));
            response.headers().set("Content-Type", "application/json");
            response.headers().setInt("Content-Length", response.content().readableBytes());
        } catch (Exception e) {
            System.out.println("处理出错:"+e.getMessage());
            response = new DefaultFullHttpResponse(HTTP_1_1, NO_CONTENT);
        } finally {
            if (fullRequest != null) {
                if (!HttpUtil.isKeepAlive(fullRequest)) {
                    ctx.write(response).addListener(ChannelFutureListener.CLOSE);
                } else {
                    response.headers().set(CONNECTION, KEEP_ALIVE);
                    ctx.write(response);
                }
            }
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

}