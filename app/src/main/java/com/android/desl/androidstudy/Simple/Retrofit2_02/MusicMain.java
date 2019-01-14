package com.android.desl.androidstudy.Simple.Retrofit2_02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.Simple.Retrofit2_02.adapter.YinYueTaiAdapter;
import com.android.desl.androidstudy.Simple.Retrofit2_02.model.Music;
import com.android.desl.androidstudy.Simple.Retrofit2_02.network.RetrofitUtil;
import com.android.desl.androidstudy.Simple.Retrofit2_02.network.service.YinYueTaiAPI;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MusicMain extends AppCompatActivity {


    private YinYueTaiAdapter mAdapter;
    private static OkHttpClient okHttpClient = new OkHttpClient();

    Retrofit retrofit;

    @BindView(R.id.rcv)
    public RecyclerView mRecyclerView;

    List<Music> musicList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple02_retrofit2_yinyuetai_main);
        mAdapter = new YinYueTaiAdapter();

        ButterKnife.bind(this);
        setupRecyclerView(mRecyclerView);

        initData();
    }

    private void initData() {
        //封装RetrofitUtil类
        Retrofit retrofit = RetrofitUtil.getInstance("http://soapi.yinyuetai.com/").getRetrofit();

        YinYueTaiAPI service = retrofit.create(YinYueTaiAPI.class);
        Call<ResponseBody> call = service.getCall();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i("显示信息：", "成功了!");
                try {
                    String jsonString = response.body().string();

                    int index = jsonString.indexOf("(");
                    jsonString = jsonString.substring(index + 1, jsonString.length() - 1);

                    int delIndex = jsonString.indexOf("totalCount");
                    //Log.i("totalCount", "下标:" + delIndex);
                    Log.i("显示信息开始：", "==========================================");
                    //Log.i("显示信息内容：", "=" + result);
                    Log.i("显示信息结束：", "==========================================");
                    jsonString = jsonString.substring(0, delIndex - 2);
                    //查找[
                    int kuohao = jsonString.indexOf("[");
                    jsonString = jsonString.substring(kuohao);
                    Gson gson = new Gson();

                    // json转为简单Bean
                    // Music music = gson.fromJson(jsonString, Music.class);
                    //                    Log.i("显示信息结束：", "Json转为简单Bean===" + music);
                    //json转为带泛型的list
                    musicList = gson.fromJson(jsonString, new TypeToken<List<Music>>() {
                    }.getType());


                    //                    Music[] array = new Gson().fromJson(jsonString,Music[].class);
                    //                    List<Music> musicList = Arrays.asList(array);
                    for (int i = 0; i < musicList.size(); i++) {
                        Music music = musicList.get(i);
                        Log.i("显示信息开始：", "==========================================");
                        Log.i("显示信息标题：", "=" + music.getTitle());
                        Log.i("显示信息用户：", "=" + music.getUserName());
                        Log.i("显示信息图片：", "=" + music.getHeadImg());

                        Log.i("显示信息结束：", "==========================================");
                    }
                    mAdapter.setData(musicList);
                    //                    //Json的解析类对象
                    //                    JsonParser parser = new JsonParser();
                    //                    //将JSON的String 转成一个JsonArray对象
                    //                    JsonArray jsonArray = parser.parse(result).getAsJsonArray();
                    //
                    //                    Gson gson = new Gson();
                    //                    ArrayList<Music> musicBeanList = new ArrayList<>();
                    //
                    //                    //加强for循环遍历JsonArray
                    //                    for (JsonElement music : jsonArray) {
                    //                        //使用GSON，直接转成Bean对象
                    //                        Music musicBean = gson.fromJson(music, Music.class);
                    //                        musicBeanList.add(musicBean);
                    //                    }
                    //textView.setText(jsonString);
                    //                    for (int i = 0; i < musicList.size(); i++) {
                    //                        Music music = musicList.get(i);
                    //                        Log.i("显示信息开始：", "==========================================");
                    //                        Log.i("显示信息内容：", "=" + music.getTitle());
                    //                        Log.i("显示信息内容：", "=" + music.getHeadImg());
                    //
                    //                        Log.i("显示信息结束：", "==========================================");
                    //                    }
                    //                    //传入路径 + 文件名
                    //                    File saveFile = new File("test.txt");
                    //                    // 判断文件是否存在，存在就删除
                    //                    FileOutputStream outStream = null;
                    //                    try {
                    //                        outStream = new FileOutputStream(saveFile);
                    //                        outStream.write(result.getBytes());
                    //                        outStream.close();
                    //                    } catch (FileNotFoundException e) {
                    //                    } catch (IOException e) {
                    //                    }

                    //                    Log.i("写入文件:", "完成");
                    //                    Log.d("路径", "initView: getCacheDir==" + getCacheDir());
                    //                    Log.d("路径", "initView: getFilesDir==" + getFilesDir());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i("显示信息：", "错误!");
            }
        });
    }

    private void setupRecyclerView(RecyclerView mRecyclerView) {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));//设置线性布局
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
    }
}
