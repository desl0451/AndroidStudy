package com.android.desl.androidstudy.Simple.Retrofit2_02.network;

import android.util.Log;

import com.android.desl.androidstudy.Simple.Retrofit2_02.network.service.YinYueTaiAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

    private static final int DEFAULT_TIME_OUT = 5;//超时时间 5s
    private static final int DEFAULT_READ_TIME_OUT = 10;

    private Retrofit retrofit;
    private static RetrofitUtil retrofitUtil;

    private RetrofitUtil() {
    }

    private RetrofitUtil(String baseUrl) {

        //第三方的日志拦截器
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor(new HttpLogger());
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //OKhttp3  设置拦截器打印日志
        // 创建 OKHttpClient
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .addNetworkInterceptor(logInterceptor)
                .addInterceptor(new LoggingInterceptor())//自定义拦截器
                .retryOnConnectionFailure(true)//失败重试
                .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)//连接超时
                .writeTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)//写操作 超时时间
                .readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)//读操作超时时间
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl) //设置网络请求的Url地址
                .addConverterFactory(GsonConverterFactory.create()) //将返回的数据转为Gson
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//支持RxJava2平台
                .client(okHttpClient)//OKhttp3添加到Retrofit
                .build();

    }

    //指定baseUrl
    public static RetrofitUtil getInstance(String baseUrl) {
        if (retrofitUtil == null) {
            synchronized (RetrofitUtil.class) {
                if (null == retrofitUtil) {
                    retrofitUtil = new RetrofitUtil(baseUrl);
                }
            }
        }
        return retrofitUtil;
    }

    //默认的baseUrl
    public static RetrofitUtil getInstance() {
        if (null == retrofitUtil) {
            return getInstance("http://api.tianapi.com/");
        }
        return retrofitUtil;
    }

    //获得Retrofit
    public Retrofit getRetrofit() {
        return retrofit;
    }

    //直接获得RetrofitInterface
    public YinYueTaiAPI getRetrofitInterface() {
        YinYueTaiAPI retrofitInterface = retrofit.create(YinYueTaiAPI.class);
        return retrofitInterface;
    }

    //自定义拦截器/上传公共参数
    public static class LoggingInterceptor implements Interceptor {
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            //请求前--打印请求信息
            long t1 = System.nanoTime();
            Log.e("myMessage", String.format("Sending url %s \n %s \n\n%s \n\n %s",
                    request.url(), chain.connection(), request.headers(), request.body()));

            //网络请求
            okhttp3.Response response = chain.proceed(request);

            //网络响应后--打印响应信息
            long t2 = System.nanoTime();
            Log.e("myMessage", String.format("Received response for %s in %.1fms%n%s",
                    response.request().url(), (t2 - t1) / 1e6d, response.headers()));

            return response;

            //            上传公共参数
            //            Request request = chain.request();
            //            Response response = null;
            //            Request requestProcess = null ;
            //            if("GET".equals(request.method())){
            //                String url =  request.url().toString() + "&source=android";
            //                Request.Builder builder =  request.newBuilder() ;
            //                builder.get().url(url);
            //                requestProcess =  builder.build();
            //                response = chain.proceed(requestProcess);
            //            } else {
            //                FormBody.Builder builder = new FormBody.Builder() ;
            //                RequestBody requestBody =  request.body() ;
            //                if(requestBody instanceof FormBody){
            //                    FormBody formBody = (FormBody)requestBody ;
            //                    for (int i=0;i<formBody.size();i++){
            //                        builder.add(formBody.encodedName(i),formBody.encodedValue(i));
            //                    }
            //                    builder.add("source","android");
            //                }
            //                requestProcess =  request.newBuilder().url(request.url().toString()).post(builder.build()).build() ;
            //                response = chain.proceed(requestProcess);
            //            }
            //            return response;
        }
    }

    //日志信息
    public static class HttpLogger implements HttpLoggingInterceptor.Logger {
        @Override
        public void log(String message) {
            Log.e("myMessage", message);
        }
    }
}
