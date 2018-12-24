package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_03;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter04_04_03 extends AppCompatActivity {

    private SeekBar seekbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_03);

        final TextView result = (TextView) findViewById(R.id.textView1);
        seekbar = (SeekBar) findViewById(R.id.seekBar1);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                result.setText("当前值:" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Chapter04_04_03.this, "开始滑动", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Chapter04_04_03.this, "结束滑动", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
