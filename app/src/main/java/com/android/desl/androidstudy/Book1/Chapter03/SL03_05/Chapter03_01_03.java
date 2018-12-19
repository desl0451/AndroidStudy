package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.android.desl.androidstudy.R;

public class Chapter03_01_03 extends AppCompatActivity {

    private ImageView[] img = new ImageView[4];   //声明一个保存ImageView组件的数组
    private int[] imagePath = new int[]{
            R.drawable.book1_chapter03_01_03_img01, R.drawable.book1_chapter03_01_03_img02, R.drawable.book1_chapter03_01_03_img03, R.drawable.book1_chapter03_01_03_img04
    };    //声明并初始化一个保存访问图片的数组

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1chapter03_01_03);

        LinearLayout layout = (LinearLayout) findViewById(R.id.book1chapter03_01_03_layout);//获取XML文件中定义的线性布局管理器
        for (int i = 0; i < imagePath.length; i++) {
            img[i] = new ImageView(this);    //创建一个ImageView组件
            img[i].setImageResource(imagePath[i]);        //为ImageView组件指定要显示的图片
            img[i].setPadding(5, 5, 5, 5);    //设置ImageView组件的内边距
            LayoutParams params = new LayoutParams(300, 240);        //设置图片的宽度和高度
            img[i].setLayoutParams(params);    //为ImageView组件设置布局参数
            layout.addView(img[i]);    //将ImageView组件添加到布局管理器中
        }
    }
}
