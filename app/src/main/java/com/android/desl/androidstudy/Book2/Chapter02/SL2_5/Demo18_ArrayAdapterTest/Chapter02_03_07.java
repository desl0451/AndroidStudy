package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo18_ArrayAdapterTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.QuickContactBadge;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_07 extends AppCompatActivity {

    QuickContactBadge badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2chapter02_03_07);
        ListView list1 = (ListView) findViewById(R.id.list1);
        //定义一个数组
        String[] arr1 = {"孙悟空", "猪八戒", "牛魔王"};
        //将数组包装为ArrayAdapter
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.book2chapter02_03_07_array_item, arr1);
        //为ListView设置Adapter
        list1.setAdapter(adapter1);


        String[] arr2 = {"Java", "Hibernate", "Spring", "Android"};
        ListView list2 = (ListView) findViewById(R.id.list2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.book2chapter02_03_07_array_item, arr2);
        //为ListView设置Adapter
        list2.setAdapter(adapter2);

    }
}
