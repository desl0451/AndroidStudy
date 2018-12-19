package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

public class Chapter03_01_02 extends AppCompatActivity {

    public TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundResource(R.drawable.book1_chapter03_01_04_background);
        setContentView(frameLayout);

        //添加控件
        TextView text1 = new TextView(this);
        text1.setText("在代码中控制UI界面");
        text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24); //设置字体大小,单位SP
        text1.setTextColor(Color.rgb(1, 1, 1));
        frameLayout.addView(text1);

        text2 = new TextView(this);
        text2.setText("单击进入游戏.....");
        text2.setTextSize(TypedValue.COMPLEX_UNIT_PT, 24);//字体大小,单位PT 磅
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL;
        text2.setLayoutParams(params);

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Chapter03_01_02.this).setTitle("系统提示")
                        .setMessage("游戏有风险,进入需谨慎,真的要进入吗?")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //编写确定按钮
                                Log.i("3.2", "进入游戏");//输出 消息日志
                            }
                        }).setNegativeButton("退出", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                                 Log.i("3.2", "退出游戏");
                    }
                }).show();
            }
        });
        frameLayout.addView(text2);
    }
}
