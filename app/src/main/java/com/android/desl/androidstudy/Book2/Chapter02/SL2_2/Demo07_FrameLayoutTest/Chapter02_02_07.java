package com.android.desl.androidstudy.Book2.Chapter02.SL2_2.Demo07_FrameLayoutTest;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 作者:追风小宝
 */
public class Chapter02_02_07 extends AppCompatActivity {
    private int currentColor = 0;

    final int[] colors = new int[]{R.color.Book2book2chapter02_02_07color1,
            R.color.Book2book2chapter02_02_07color2,
            R.color.Book2book2chapter02_02_07color3,
            R.color.Book2book2chapter02_02_07color4,
            R.color.Book2book2chapter02_02_07color5,
            R.color.Book2book2chapter02_02_07color6};

    final int[] names = new int[]{R.id.view01,
            R.id.view02,
            R.id.view03,
            R.id.view04,
            R.id.view05,
            R.id.view06};
    TextView[] views = new TextView[names.length];

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //            super.handleMessage(msg);
            //表明消息来自本程序所发送
            if (msg.what == 0x123) {
                for (int i = 0; i < names.length; i++) {
                    views[i].setBackgroundResource(colors[(i + currentColor) % names.length]);
                }
                currentColor++;
                super.handleMessage(msg);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_02_07);
        for (int i = 0; i < names.length; i++) {
            views[i] = (TextView) findViewById(names[i]);
        }
        //定义一个线程周期性地改变currentColor变量值
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        }, 0, 200);
    }
}
