package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo21_AutoCompleteText;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.android.desl.androidstudy.R;

import java.util.ArrayList;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_10 extends Activity {

    AutoCompleteTextView actv;
    MultiAutoCompleteTextView mauto;
    //定义字符串数组，作为提示的文本
    String[] books = new String[]{
            "疯狂Java讲义",
            "疯狂Ajax讲义",
            "疯狂XML讲义",
            "疯狂Workflow讲义"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            list.add(i + "");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_03_10);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, list);
        actv = (AutoCompleteTextView) findViewById(R.id.auto);
        actv.setAdapter(aa);
        mauto = (MultiAutoCompleteTextView) findViewById(R.id.mauto);
        mauto.setAdapter(aa);
        mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}