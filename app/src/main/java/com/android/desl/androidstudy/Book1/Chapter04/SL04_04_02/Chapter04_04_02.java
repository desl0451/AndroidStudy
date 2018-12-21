package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_02;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter04_04_02 extends AppCompatActivity {

    private static final String[] COUNTRIES = new String[]{"age", "aptech", "accp", "wt"};
    private AutoCompleteTextView auto;
    private ProgressBar horizonP;//水平进度条
    private ProgressBar circleP;//圆形进度条
    private int mProgressStatus = 0;//完成进度
    private Handler mHandler;// 声明一个用于处理消息的Handler类的对象

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_02);
        horizonP = (ProgressBar) findViewById(R.id.progressBar1);
        circleP = (ProgressBar) findViewById(R.id.progressBar2);
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 0x111) {
                    horizonP.setProgress(mProgressStatus);
                } else {
                    Toast.makeText(Chapter04_04_02.this, "耗时操作已完成", Toast.LENGTH_SHORT).show();
                }
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    mProgressStatus = doWork();
                    Message m = new Message();
                    if (mProgressStatus < 100) {
                        m.what = 0x111;
                        mHandler.sendMessage(m);//发送信息
                    } else {
                        m.what = 0x110;
                        mHandler.sendMessage(m);
                        break;
                    }
                }
            }
        });

    }

    private int doWork() {
        mProgressStatus += Math.random() * 10;
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mProgressStatus;
    }
}
