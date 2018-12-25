package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo24_SpinnerTest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_13 extends Activity {

    Spinner spinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_03_13);
        spinner = (Spinner) findViewById(R.id.spinner);
        String[] arr = {"孙悟空", "猪八戒", "唐僧"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, arr);
        spinner.setAdapter(adapter);
    }
}