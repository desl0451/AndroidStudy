package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo22_GridViewTest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.SimpleAdapter;

import com.android.desl.androidstudy.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_11 extends Activity {

    GridView grid;
    ImageView imageView;
    int[] imageIds = new int[]{
            R.drawable.book2_chapter02_03_11_bomb5, R.drawable.book2_chapter02_03_11_bomb6, R.drawable.book2_chapter02_03_11_bomb7,
            R.drawable.book2_chapter02_03_11_bomb8, R.drawable.book2_chapter02_03_11_bomb9, R.drawable.book2_chapter02_03_11_bomb10,
            R.drawable.book2_chapter02_03_11_bomb11, R.drawable.book2_chapter02_03_11_bomb12, R.drawable.book2_chapter02_03_11_bomb13,
            R.drawable.book2_chapter02_03_11_bomb14, R.drawable.book2_chapter02_03_11_bomb15, R.drawable.book2_chapter02_03_11_bomb16
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_03_11);

        //创建一个List对象,List对象的元素是Map
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < imageIds.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("image", imageIds[i]);
            listItems.add(listItem);
        }
        imageView = (ImageView) findViewById(R.id.imageView);
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.book2_chapter02_03_11_cell, new String[]{"image"}, new int[]{R.id.image1});
        grid = (GridView) findViewById(R.id.grid01);
        grid.setAdapter(simpleAdapter);

        grid.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(imageIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //添加列表项被单击的监听器
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //显示被单击的图片
                imageView.setImageResource(imageIds[position]);
            }
        });
    }
}