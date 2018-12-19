package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

/**
 * 作者:追风小宝
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

public class Chapter03_03_17 extends AppCompatActivity {
    TextView txtSex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1chapter03_01_17);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        String result = spinner1.getSelectedItem().toString();
        Log.i("您选择的内容是:", result);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String r = parent.getItemAtPosition(position).toString();//获取选择项的值
                Log.i("Spinner示例", r);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}