package com.android.desl.androidstudy.Simple.Retrofit2_02.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface YinYueTaiService {
    /**
     * method：网络请求的方法（区分大小写）
     * path：网络请求地址路径
     * hasBody：是否有请求体
     */
    //    @HTTP(method = "GET", path = "openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q={id}", hasBody = false)
    // 第1部分：在网络请求接口的注解设置
    //https://www.toutiao.com/api/pc/feed/?category=news_hot&utm_source=toutiao&widen=1&max_behot_time=0&max_behot_time_tmp=0&tadrequire=true&as=A1951CB3C5C71A2&cp=5C35D711EAA26E1&_signature=hM7TPQAA2QgNL-qnu5I9L4TO0y
    @GET("search/video-search?callback=jQuery1102026645501348161504_1547032822321&keyword=%E7%A5%9E%E8%AF%9D&pageIndex=1&pageSize=24&offset=1&orderType=&area=&property=&durationStart=0&durationEnd=&regdateStart=&regdateEnd=1547032823&clarityGrade=&source=&thirdSource=&_=1547032822331")
    //    @GET("/repos/square/retrofit/contributors")
    Call<ResponseBody> getCall();

}
