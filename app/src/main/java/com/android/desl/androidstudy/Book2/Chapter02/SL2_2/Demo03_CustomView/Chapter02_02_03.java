package com.android.desl.androidstudy.Book2.Chapter02.SL2_2.Demo03_CustomView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.android.desl.androidstudy.R;

public class Chapter02_02_03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2chapter02_02_03);
        LinearLayout main = (LinearLayout) findViewById(R.id.book2chapter02_2_3);
        final Chapter02_02_03_DrawView draw = new Chapter02_02_03_DrawView(this);
        draw.setMinimumHeight(500);
        draw.setMinimumWidth(300);
        main.addView(draw);

    }
}