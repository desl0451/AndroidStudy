package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_15;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chapter04_04_15 extends AppCompatActivity {
    int[] imageId = new int[]{R.drawable.book1_chapter04_04_07_img01, R.drawable.book1_chapter04_04_07_img02, R.drawable.book1_chapter04_04_07_img03, R.drawable.book1_chapter04_04_07_img04, R.drawable.book1_chapter04_04_07_img05};
    final String[] title = new String[]{"程序管理", "保密设置", "安全设置", "邮件设置", "铃声设置"};
    List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_15);
        for (int i = 0; i < imageId.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", imageId[i]);
            map.put("title", title[i]);
            listItems.add(map);
        }
        final SimpleAdapter adapter = new SimpleAdapter(Chapter04_04_15.this, listItems, R.layout.book1_chapter04_04_15_item, new String[]{"title", "image"}, new int[]{R.id.title, R.id.image});

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Chapter04_04_15.this);
                builder.setIcon(R.drawable.book1_chapter04_04_11_advise);
                builder.setTitle("设置");
                //添加列表项
                builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Chapter04_04_15.this, "您选择了[" + title[which] + "]", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.create().show();
            }
        });
    }
}