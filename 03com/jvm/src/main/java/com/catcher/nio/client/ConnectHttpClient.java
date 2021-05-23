package com.catcher.nio.client;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

public class ConnectHttpClient {

    public String get(String url){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String content = "";
        try {
            HttpGet httpGet = new HttpGet(url);
            System.out.println("executing request:" + httpGet.getURI());
            CloseableHttpResponse response = httpClient.execute(httpGet);
            try {
                HttpEntity entity = response.getEntity();
//                System.out.println(response.getStatusLine());
                content = EntityUtils.toString(entity);
                System.out.println(content);
            }finally {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (ClientProtocolException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content;
    }
}
