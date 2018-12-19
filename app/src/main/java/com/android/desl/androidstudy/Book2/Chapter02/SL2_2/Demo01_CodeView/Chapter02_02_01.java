package com.android.desl.androidstudy.Book2.Chapter02.SL2_2.Demo01_CodeView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

import java.util.Date;

public class Chapter02_02_01 extends AppCompatActivity {
    int[] images = new int[]{R.drawable.book2_chapter02_02_02_java, R.drawable.book2_chapter02_02_02_ee, R.drawable.book2_chapter02_02_02_classic, R.drawable.book2_chapter02_02_02_ajax, R.drawable.book2_chapter02_02_02_xml};
    int currentImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建一个线性布局管理器
        LinearLayout layout = new LinearLayout(this);
        //设置该Activity显示layout
        super.setContentView(layout);

        layout.setOrientation(LinearLayout.VERTICAL);
        //创建一个TextView
        final TextView show = new TextView(this);
        //创建一个按钮
        Button btn = new Button(this);
        btn.setText(R.string.app_name);

        btn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //向Layout容器中添加TextVIew
        layout.addView(show);
        layout.addView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("Hello,Android," + new Date());
            }
        });

    }
}