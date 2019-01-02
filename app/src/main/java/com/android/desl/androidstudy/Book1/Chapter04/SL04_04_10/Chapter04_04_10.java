package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_10;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ViewSwitcher;

import com.android.desl.androidstudy.R;

public class Chapter04_04_10 extends AppCompatActivity {

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
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_10);
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
        //设置动画效果   设置淡入效果
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));

        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Chapter04_04_10.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
                ));
                return imageView;
            }
        });
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
                ImageView imageview = null;
                if (imageview == null) {
                    imageview = new ImageView(Chapter04_04_10.this);
                    imageview.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageview.setLayoutParams(new Gallery.LayoutParams(110, 83));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.book1_chapter04_04_10_Gallery);
                    imageview.setBackgroundResource(typedArray.getResourceId(
                            R.styleable.book1_chapter04_04_10_Gallery_android_galleryItemBackground,
                            0));
                    imageview.setPadding(5, 0, 5, 0); // 设置ImageView的内边距
                } else {
                    imageview = (ImageView) convertView;
                }
                imageview.setImageResource(imageId[position]); // 为ImageView设置要显示的图片
                return imageview; // 返回ImageView
            }
        };
        gallery.setAdapter(adapter);
        gallery.setSelection(imageId.length / 2);
        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imageSwitcher.setImageResource(imageId[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
