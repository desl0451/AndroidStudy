package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.android.desl.androidstudy.R;

public class Chapter03_01_04 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1chapter03_01_04);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.book1chapter03_01_04_mylayout);
        final Chapter03_01_04_RabbitView rabbit = new Chapter03_01_04_RabbitView(Chapter03_01_04.this);
        rabbit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                rabbit.bitmapX = event.getX();//设置小兔子显示的X坐标
                rabbit.bitmapY = event.getY();//
                rabbit.invalidate();          //重绘Rabbit
                return true;
            }
        });
        frameLayout.addView(rabbit);
    }
}
