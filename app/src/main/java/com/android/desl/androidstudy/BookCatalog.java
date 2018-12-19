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
        Button btnA = (Button) findViewById(R.id.button1);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("book1_chapter_directory");
                startActivity(intent);
            }
        });
        //##########################################################
        //进入第二本书
        Button btnB = (Button) findViewById(R.id.button2);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("book2_chapter_directory");
                startActivity(intent);
            }
        });
    }
}
