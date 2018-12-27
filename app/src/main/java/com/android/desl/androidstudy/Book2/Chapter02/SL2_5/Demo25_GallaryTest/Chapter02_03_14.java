package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo25_GallaryTest;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_14 extends Activity {
    int[] imageIds = new int[]{
            R.drawable.book2_chapter02_03_14_baiyang,
            R.drawable.book2_chapter02_03_14_chunv,
            R.drawable.book2_chapter02_03_14_jinniu,
            R.drawable.book2_chapter02_03_14_juxie,
            R.drawable.book2_chapter02_03_14_mojie,
            R.drawable.book2_chapter02_03_14_sheshou,
            R.drawable.book2_chapter02_03_14_shizi,
            R.drawable.book2_chapter02_03_14_shuangyu,
            R.drawable.book2_chapter02_03_14_shuangzi,
            R.drawable.book2_chapter02_03_14_shuiping,
            R.drawable.book2_chapter02_03_14_tiancheng,
            R.drawable.book2_chapter02_03_14_tianxie

    };
    Gallery gallery;
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_03_14);
        gallery = (Gallery) findViewById(R.id.gallery);
        imageView = (ImageView) findViewById(R.id.imageView);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imageIds.length;
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
                ImageView imageView = new ImageView(Chapter02_03_14.this);
                imageView.setImageResource(imageIds[position]);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setLayoutParams(new Gallery.LayoutParams(75, 100));
                TypedArray typedArray = obtainStyledAttributes(R.styleable.book2_chapter02_03_14_Gallery);
                imageView.setBackgroundResource(((TypedArray) typedArray).getResourceId(R.styleable.book2_chapter02_03_14_Gallery_android_galleryItemBackground, 0));
                return imageView;
            }
        };
        gallery.setAdapter(adapter);
        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imageView.setBackgroundResource(imageIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}