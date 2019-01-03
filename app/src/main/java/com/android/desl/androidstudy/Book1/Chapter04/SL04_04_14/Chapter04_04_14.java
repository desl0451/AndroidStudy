package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_14;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter04_04_14 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_14);
        ImageButton imageButton = (ImageButton) findViewById(R.id.exit);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alert = new AlertDialog.Builder(Chapter04_04_14.this).create();
                alert.setIcon(R.drawable.book1_chapter04_04_11_advise);
                alert.setTitle("退出?");
                alert.setMessage("真的要退出泡泡龙游戏吗?");
                //添加"取消"按钮
                alert.setButton(DialogInterface.BUTTON_NEGATIVE, "不", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                //添加"确定"按钮
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "是的", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();//返回系统主界面
                    }
                });
                alert.show();//显示对话框
            }
        });
    }
}