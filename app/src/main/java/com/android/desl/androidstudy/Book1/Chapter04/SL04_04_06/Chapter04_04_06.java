package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_06;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.ViewSwitcher;

import com.android.desl.androidstudy.R;

public class Chapter04_04_06 extends AppCompatActivity {

    private int[] imageId = new int[]{
            R.drawable.book1_chapter03_01_09_img01,
            R.drawable.book1_chapter03_01_09_img02,
            R.drawable.book1_chapter03_01_09_img03,
            R.drawable.book1_chapter03_01_09_img04,
            R.drawable.book1_chapter03_01_09_img05,
            R.drawable.book1_chapter03_01_09_img06,
            R.drawable.book1_chapter03_01_09_img07,
            R.drawable.book1_chapter03_01_09_img08
    };
    private int index = 0;
    private ImageSwitcher imageSwitcher;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_06);
        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Chapter04_04_06.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        imageSwitcher.setImageResource(imageId[index]);
        Button up = (Button) findViewById(R.id.button1);
        Button down = (Button) findViewById(R.id.button2);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index > 0) {
                    index--;
                } else {
                    index = imageId.length - 1;
                }
                imageSwitcher.setImageResource(imageId[index]);
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < imageId.length - 1) {
                    index++;
                } else {
                    index = 0;
                }
                imageSwitcher.setImageResource(imageId[index]);
            }
        });
    }
}
