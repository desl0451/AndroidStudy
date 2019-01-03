package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_16;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import com.android.desl.androidstudy.R;

public class Chapter04_04_16 extends AppCompatActivity {
    int[] imageId = new int[]{
            R.drawable.book1_chapter04_04_07_img01,
            R.drawable.book1_chapter04_04_07_img02,
            R.drawable.book1_chapter04_04_07_img03,
            R.drawable.book1_chapter04_04_07_img04,
            R.drawable.book1_chapter04_04_07_img05,
            R.drawable.book1_chapter04_04_07_img06,
            R.drawable.book1_chapter04_04_07_img07,
            R.drawable.book1_chapter04_04_07_img08,
            R.drawable.book1_chapter04_04_07_img09,
            R.drawable.book1_chapter04_04_07_img10,
            R.drawable.book1_chapter04_04_07_img11,
            R.drawable.book1_chapter04_04_07_img12
    };

    private ImageSwitcher imageSwitcher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_16);
        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
        //设置动画效果
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(Chapter04_04_16.this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(Chapter04_04_16.this, android.R.anim.fade_out));
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Chapter04_04_16.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        imageSwitcher.setImageResource(imageId[6]);
        GridView gridview = (GridView) findViewById(R.id.gridView1);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imageId.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageview;
                if (convertView == null) {
                    imageview = new ImageView(Chapter04_04_16.this);
                    imageview.setAdjustViewBounds(true);
                    imageview.setMaxWidth(110);
                    imageview.setMaxHeight(83);
                    imageview.setPadding(5, 5, 5, 5);
                } else {
                    imageview = (ImageView) convertView;
                }
                imageview.setImageResource(imageId[position]);
                return imageview;
            }
        };
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageSwitcher.setImageResource(imageId[position]);
            }
        });
    }
}