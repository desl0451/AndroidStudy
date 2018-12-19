package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class Chapter03_03_13 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_01_13);
        Toast toast = Toast.makeText(Chapter03_03_13.this, "您单击了普通按钮", Toast.LENGTH_SHORT);
        toast.show(); //显示提示信息
    }

    public void myClick(View view) {
        Toast toast = Toast.makeText(Chapter03_03_13.this, "您单击了图片按钮", Toast.LENGTH_SHORT);
        toast.show();
    }
}
