package com.android.desl.androidstudy.Simple.Retrofit2_01.network;

import com.android.desl.androidstudy.Simple.Retrofit2_01.model.GitHubInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService {
    @GET("/repos/square/retrofit/contributors")
    Call<List<GitHubInfo>> getCall();
}
