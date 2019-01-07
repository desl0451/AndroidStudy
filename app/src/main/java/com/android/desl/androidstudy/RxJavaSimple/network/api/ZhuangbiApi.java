package com.android.desl.androidstudy.RxJavaSimple.network.api;

import com.android.desl.androidstudy.RxJavaSimple.model.PicImage;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者:追风小宝
 * 日期: 2019/1/4 21:48
 */
public interface ZhuangbiApi {
    @GET("search")
    Observable<List<PicImage>> search(@Query("q") String query);
}
