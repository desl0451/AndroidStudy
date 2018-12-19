package com.android.desl.androidstudy.Book1.Chapter03.SL03_08;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

import java.util.Calendar;

public class Chapter03_03_22 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_03_22);
        final Chronometer ch = (Chronometer) findViewById(R.id.chronometer1);
        ch.setBase(SystemClock.elapsedRealtime());
        ch.setFormat("已用时间:%s");
        ch.start();
        //添加监听器
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if (SystemClock.elapsedRealtime() - ch.getBase() >= 10000) {
                    ch.stop();//停止计时器
                }
            }
        });
    }
}
