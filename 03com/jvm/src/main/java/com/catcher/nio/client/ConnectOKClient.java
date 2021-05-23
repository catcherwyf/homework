package com.catcher.nio.client;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class ConnectOKClient {

    public String get(String url) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                    if(response.isSuccessful()){
                        System.out.println(response.body().string());
                    }
            }
        });

        Response response = okHttpClient.newCall(request).execute();
        return response.body().string();
    }
}
