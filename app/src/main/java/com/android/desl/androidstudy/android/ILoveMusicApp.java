package com.android.desl.androidstudy.android;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.android.common.FilterMusic;
import com.android.desl.androidstudy.android.common.Music;
import com.android.desl.androidstudy.android.common.NetMusicHandler;

import java.util.ArrayList;
import java.util.List;


public class ILoveMusicApp extends AppCompatActivity {
    Button but;
    TextView textContent;
    TextView txtMusicName;
    NetMusicHandler netMusicList;
    String musicListInfo = "";
    //保存歌曲列表集合
    List<Music> MusicList = new ArrayList<Music>();

    //歌曲列表过滤
    FilterMusic musicFilter = new FilterMusic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_music);
        textContent = (TextView) findViewById(R.id.content);
        txtMusicName = (TextView) findViewById(R.id.txtMusicName);
        but = (Button) findViewById(R.id.txtFind);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*读取歌曲列表线程*/
                netMusicList = new NetMusicHandler(handler);
                netMusicList.start();
            }
        });


    }


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //读取搜索的网站列表
            if (msg.what == 0x123) {
                musicListInfo = netMusicList.message;
                MusicList = musicFilter.LoadMusic(musicListInfo);
                Toast.makeText(ILoveMusicApp.this, "集合数量是:" + MusicList.size(), Toast.LENGTH_LONG).show();

            }
        }
    };
}