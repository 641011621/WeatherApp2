package com.example.weatherapp.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
/*和服务器进行交互，通过OKHttp调用sendOkHttpRequest方法，传入请求地址，并注册一个回调来处理服务器响应*/
public class HttpUtil {
    public static void sendOkHttpRequest(final String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).get().build();
        client.newCall(request).enqueue(callback);
    }

}
