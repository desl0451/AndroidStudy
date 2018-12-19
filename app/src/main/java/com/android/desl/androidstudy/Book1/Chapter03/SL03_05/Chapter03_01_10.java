package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter03_01_10 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_01_10);
        ImageView img0 = (ImageView) findViewById(R.id.imageButton0);
        img0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Chapter03_01_10.this, "进入游戏", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
