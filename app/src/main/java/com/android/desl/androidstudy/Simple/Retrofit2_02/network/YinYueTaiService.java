package com.android.desl.androidstudy.Simple.Retrofit2_02.network;

import com.android.desl.androidstudy.Simple.Retrofit2_02.model.Music;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Path;

public interface YinYueTaiService {
    /**
     * method：网络请求的方法（区分大小写）
     * path：网络请求地址路径
     * hasBody：是否有请求体
     */
    @HTTP(method = "GET", path = "openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q={id}", hasBody = false)
    Call<List<Music>> getCall(@Path("id") String id);
}
