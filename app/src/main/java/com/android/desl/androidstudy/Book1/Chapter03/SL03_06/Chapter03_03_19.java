package com.android.desl.androidstudy.Book1.Chapter03.SL03_06;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter03_03_19 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1chapter03_01_19);
        final ListView listView = (ListView) findViewById(R.id.listView1);
        //        listView.addHeaderView(line());
        /******************************************************************/
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Book1_Chapter03_01_18_Ctype,
                android.R.layout.simple_list_item_checked);
        /******************************************************************/
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                Toast.makeText(Chapter03_03_19.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
