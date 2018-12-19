package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo19_SimpleAdapterTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.android.desl.androidstudy.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_08 extends AppCompatActivity {


    private String[] names = new String[]{"虎王", "弄玉", "李清照", "李白"};
    private String[] descs = new String[]{"可爱的小孩", "一个擅长音乐的女孩", "一个擅长文学的女性", "浪漫主义诗人"};
    private int[] imageIds = new int[]{R.drawable.book2_chapter02_03_08_tiger, R.drawable.book2_chapter02_03_08_nongyu, R.drawable.book2_chapter02_03_08_qingzhao, R.drawable.book2_chapter02_03_08_libai};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_03_08);
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", descs[i]);
            listItems.add(listItem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.book2_chapter02_03_08_simple_item, new String[]{"personName", "header", "desc"}, new int[]{R.id.name, R.id.header, R.id.desc});

        ListView list = (ListView) findViewById(R.id.mylist);

        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("单击", "被单击了" + names[position]);
            }
        });
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.i("选中", "被选中了" + names[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}