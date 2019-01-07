package com.android.desl.androidstudy.Simple.Retrofit2_01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.Simple.Retrofit2_01.adapter.GitHubAdapter;
import com.android.desl.androidstudy.Simple.Retrofit2_01.model.GitHubInfo;
import com.android.desl.androidstudy.Simple.Retrofit2_01.network.GitHubService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitHubMain extends AppCompatActivity {
    private GitHubAdapter gAdapter;
    private RecyclerView gRecyclerView;

    List<GitHubInfo> gList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple01_retrofit2_github_main);
        gAdapter = new GitHubAdapter();

        gRecyclerView = (RecyclerView) findViewById(R.id.rcv);
        setupRecyclerView(gRecyclerView);

        initData();
    }

    private void initData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        Call<List<GitHubInfo>> call = service.getCall();

        call.enqueue(new Callback<List<GitHubInfo>>() {
            @Override
            public void onResponse(Call<List<GitHubInfo>> call, Response<List<GitHubInfo>> response) {
                if (response.isSuccessful()) {
                    gList = response.body();
                    if (gList != null && gList.size() > 0) {
                        gAdapter.setData(gList);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<GitHubInfo>> call, Throwable t) {

            }
        });

    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(gAdapter);
    }
}
