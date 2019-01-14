package com.android.desl.androidstudy.Simple.Retrofit2_02.network.XXXXX;


import com.android.desl.androidstudy.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private static Retrofit mRetrofit;

    /**
     * 默认服务器
     */
    public static Retrofit get() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_SERVER)
                    .client(Client.get())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return mRetrofit;
    }


    public static Retrofit getConnResources(String PATH) {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(PATH)
                    .client(Client.get())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

    public static <T> T get(Class<T> tClass) {
        return get().create(tClass);
    }

}
