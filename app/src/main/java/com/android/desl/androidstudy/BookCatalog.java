package com.android.desl.androidstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 作者:追风小宝
 * ${date}
 */
public class BookCatalog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_catalog);
        //##########################################################
        //进入第一本书
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("book1_chapter_directory");
                startActivity(intent);
            }
        });
        //##########################################################
        //进入第二本书
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("book2_chapter_directory");
                startActivity(intent);
            }
        });

        //##########################################################
        //ILoveMusic 音悦台
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("music_down_yinyuetai");
                startActivity(intent);
            }
        });

        //##########################################################
        //RxJava学习示例
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("RxJava_Chapter_Directory");
                startActivity(intent);
            }
        });
        //##########################################################
        //RxJava完整示例
    }
}
