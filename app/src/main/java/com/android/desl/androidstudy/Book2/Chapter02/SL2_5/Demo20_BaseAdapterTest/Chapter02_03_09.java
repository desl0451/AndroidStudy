package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo20_BaseAdapterTest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_09 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2chapter02_03_09);
        listView = (ListView) findViewById(R.id.myList);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                //指定一共包含40个选项
                return 40;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                //创建一个LinearLayout,并向其中添加两个组件
                LinearLayout line = new LinearLayout(Chapter02_03_09.this);
                line.setOrientation(LinearLayout.HORIZONTAL);
                ImageView imageView = new ImageView(Chapter02_03_09.this);
                imageView.setImageResource(R.drawable.background1);
                TextView test = new TextView(Chapter02_03_09.this);
                test.setText("第" + (position + 1) + "个列表项");
                test.setTextSize(20);
                test.setTextColor(Color.RED);
                line.addView(imageView);
                line.addView(test);
                return line;
            }
        };
        listView.setAdapter(adapter);
    }
}