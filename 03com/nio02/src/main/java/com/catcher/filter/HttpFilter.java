package com.catcher.filter;

import io.github.kimmking.gateway.filter.HttpRequestFilter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

public class HttpFilter implements HttpRequestFilter {
    public static HttpFilter newInstance(){
        return new HttpFilter();
    }


    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        String uri = fullRequest.uri();
        String body = null;
        //logger.info("接收到的请求url为{}", uri);
        if (uri.contains("/httpClient")) {

        }else if(uri.contains("/okClient")){

        }else if(uri.contains("/nettyClient")){

        }else {

        }
        fullRequest.headers().set("filter","catcher");
    }
}
