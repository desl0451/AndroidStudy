package com.android.desl.androidstudy.Book1.Chapter03.SL03_10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.android.desl.androidstudy.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chapter03_03_24 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_03_24);
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        int[] imagesId = new int[]{R.drawable.book1_chapter03_01_09_img01, R.drawable.book1_chapter03_01_09_img02, R.drawable.book1_chapter03_01_09_img03, R.drawable.book1_chapter03_01_09_img04, R.drawable.book1_chapter03_01_09_img05};
        String[] title = new String[]{"保存设置", "安全", "系统设置", "上网", "我的文档"};

        List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < imagesId.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", imagesId[i]);
            map.put("title", title[i]);
            lists.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, lists, R.layout.book1_chapter03_03_24_item, new String[]{"image", "title"}, new int[]{R.id.image, R.id.title});
        listView1.setAdapter(adapter);
    }
}
