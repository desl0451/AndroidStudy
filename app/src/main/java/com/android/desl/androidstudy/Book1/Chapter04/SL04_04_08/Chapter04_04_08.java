package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_08;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chapter04_04_08 extends AppCompatActivity {


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
    String[] title = new String[]{
            "花开富贵", "海天一色", "日出", "天路", "一枝独秀", "云", "独占鳌头", "蒲公英花", "花团锦簇", "争奇斗艳", "和谐", "林间小路"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_08);
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
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
                    imageview = new ImageView(Chapter04_04_08.this);//实例化ImageView的对象
                    imageview.setScaleType(ImageView.ScaleType.FIT_XY);//设置缩放方式
                    imageview.setLayoutParams(new Gallery.LayoutParams(120, 90));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.book2_chapter02_03_14_Gallery);
                    imageview.setBackgroundResource(typedArray.getResourceId(R.styleable.book2_chapter02_03_14_Gallery_android_galleryItemBackground, 0));
                    imageview.setPadding(5, 0, 5, 0);
                } else {
                    imageview = (ImageView) convertView;
                }
                imageview.setImageResource(imageId[position]);
                return imageview;
            }
        };
        gallery.setAdapter(adapter);
        gallery.setSelection(imageId.length / 2);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Chapter04_04_08.this, "您选择了第" + String.valueOf(position) + "张图片", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
