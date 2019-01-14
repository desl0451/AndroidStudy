package com.android.desl.androidstudy.Simple.Retrofit2_02.network.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface YinYueTaiAPI {
    /************************************************************************************************
     * 常用的注解：
     *
     * @GET GET请求方式
     * @POST POST请求方式
     * @Query GET请求参数
     * @Header 用来添加Header请求头
     * @FormUrlEncoded post请求头标示
     * <p>
     * 其他注解请求方式：
     * @PUT 表示这是一个PUT请求
     * @DELETE 表示这是一个DELETE请求
     * @HEAD 表示这是一个HEAD请求
     * @OPTIONS 表示这是一个OPTION请求
     * @PATCH 表示这是一个PAT请求
     ***********************************************************************************************/


    //    @GET("/repos/square/retrofit/contributors")
    // 第1部分：在网络请求接口的注解设置
    @GET("search/video-search?callback=jQuery1102026645501348161504_1547032822321&keyword=%E7%A5%9E%E8%AF%9D&pageIndex=1&pageSize=24&offset=1&orderType=&area=&property=&durationStart=0&durationEnd=&regdateStart=&regdateEnd=1547032823&clarityGrade=&source=&thirdSource=&_=1547032822331")
    Call<ResponseBody> getCall();

    Call<ResponseBody> getCallCount(int num);

    //https://www.toutiao.com/api/pc/feed/?category=news_hot&utm_source=toutiao&widen=1&max_behot_time=0&max_behot_time_tmp=0&tadrequire=true&as=A1951CB3C5C71A2&cp=5C35D711EAA26E1&_signature=hM7TPQAA2QgNL-qnu5I9L4TO0y
    //    @HTTP(method = "GET", path = "openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q={id}", hasBody = false)

}
