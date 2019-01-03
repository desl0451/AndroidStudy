package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_11;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.android.desl.androidstudy.R;

public class Chapter04_04_11 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_11);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Chapter04_04_11.this, "我是通过makeText()方法创建的消息提示框", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //自定义Toast显示内容
                Toast toast = new Toast(Chapter04_04_11.this);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout ll = new LinearLayout(Chapter04_04_11.this);
                ImageView iv = new ImageView(Chapter04_04_11.this);
                iv.setImageResource(R.drawable.book1_chapter04_04_11_advise);
                iv.setPadding(0, 0, 5, 0);
                ll.addView(iv);
                TextView tv = new TextView(Chapter04_04_11.this);
                tv.setText("我是通过构造方法创建的消息提示框");
                ll.addView(tv);
                toast.setView(ll);
                toast.show();
            }
        });
    }

}
