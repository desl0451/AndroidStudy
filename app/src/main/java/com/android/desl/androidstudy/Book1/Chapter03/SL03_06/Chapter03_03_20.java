package com.android.desl.androidstudy.Book1.Chapter03.SL03_06;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter03_03_20 extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /********************************************/
        String[] ctype = new String[]{"情景模式", "主题模式", "手机", "程序管理"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, ctype);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String result = l.getItemAtPosition(position).toString();
        Toast.makeText(Chapter03_03_20.this, result, Toast.LENGTH_SHORT).show();
    }
}
