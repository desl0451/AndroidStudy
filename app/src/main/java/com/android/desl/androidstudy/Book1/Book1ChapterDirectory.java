package com.android.desl.androidstudy.Book1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.desl.androidstudy.R;

public class Book1ChapterDirectory extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter_directory);

//
//        Button btn1 = (Button) findViewById(R.id.button1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("book1chapter01main");
//                startActivity(intent);
//            }
//        });

//
//        Button btn2 = (Button) findViewById(R.id.button2);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("book1chapter02main");
//                startActivity(intent);
//            }
//        });
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("Book1_Chapter03_Main");
                startActivity(intent);
            }
        });
//        Button btn4 = (Button) findViewById(R.id.button4);
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("book1chapter04main");
//                startActivity(intent);
//            }
//        });
//        Button btn5 = (Button) findViewById(R.id.button5);
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("book1chapter05main");
//                startActivity(intent);
//            }
//        });
//        Button btn6 = (Button) findViewById(R.id.button6);
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("book1chapter06main");
//                startActivity(intent);
//            }
//        });
    }
}
