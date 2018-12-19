package com.android.desl.androidstudy.Book2.Chapter02.SL2_2.Demo02_MixView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.desl.androidstudy.R;

public class Chapter02_02_02 extends AppCompatActivity {
    int[] images = new int[]{R.drawable.book2_chapter02_02_02_java, R.drawable.book2_chapter02_02_02_ee, R.drawable.book2_chapter02_02_02_classic, R.drawable.book2_chapter02_02_02_ajax, R.drawable.book2_chapter02_02_02_xml};
    int currentImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_02_02);
        LinearLayout main = (LinearLayout) findViewById(R.id.book2chapter02_02_02);
        final ImageView image = new ImageView(this);
        main.addView(image);

        image.setImageResource(images[0]);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(images[++currentImg % images.length]);
            }
        });

    }
}