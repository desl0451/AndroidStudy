package com.android.desl.androidstudy.android;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.android.desl.androidstudy.R;

import java.io.File;

public class AndroidPlayer extends AppCompatActivity {
    public String videoPath = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_player);
        VideoView video = (VideoView) findViewById(R.id.videoView);
        //http://sh.yinyuetai.com/uploads/videos/common/6286015FF2C75F064B7714802A974B52.mp4?sc=9f5d42854504f4a7
        File file = new File("sdcard/Tears.mp4");

        MediaController mc = new MediaController(AndroidPlayer.this);

        Toast.makeText(AndroidPlayer.this, "视频:" + file.getAbsolutePath(), Toast.LENGTH_SHORT).show(); // 弹出消息提示框显示播放完毕


        if (file.exists()) { // 判断要播放的视频文件是否存在
            video.setVideoPath(file.getAbsolutePath()); // 指定要播放的视频
            //            video.setVideoURI(Uri.parse("http://sh.yinyuetai.com/uploads/videos/common/6286015FF2C75F064B7714802A974B52.mp4"));
            video.setMediaController(mc); // 设置VideoView与MediaController相关联
            video.requestFocus(); // 让VideoView获得焦点
            try {
                video.start(); // 开始播放视频
            } catch (Exception e) {
                e.printStackTrace(); // 输出异常信息
            }
            // 为VideoView添加完成事件监听器
            video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mp) {
                    Toast.makeText(AndroidPlayer.this, "视频播放完毕！", Toast.LENGTH_SHORT).show(); // 弹出消息提示框显示播放完毕
                }
            });
        } else {
            Toast.makeText(AndroidPlayer.this, "要播放的视频文件不存在", Toast.LENGTH_SHORT).show(); // 弹出消息提示框提示文件不存在
        }

        //        videoView.setVideoURI(videoPath);
    }
}
