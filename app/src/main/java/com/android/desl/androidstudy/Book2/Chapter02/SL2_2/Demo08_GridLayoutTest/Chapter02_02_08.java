package com.android.desl.androidstudy.Book2.Chapter02.SL2_2.Demo08_GridLayoutTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class Chapter02_02_08 extends AppCompatActivity {
    GridLayout gridLayout;
    //定义16个按钮的文本
    String[] chars = new String[]{
            "7", "8", "9", "➗",
            "4", "5", "6", "✖",
            "1", "", "3", "-",
            ".", "0", "=", "+"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_02_08);
        gridLayout = (GridLayout) findViewById(R.id.book2chapter02_02_08);
        for (int i = 0; i < chars.length; i++) {
            Button btn = new Button(this);
            btn.setText(chars[i]);
            btn.setTextSize(40);
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, columnSpec);
            params.setGravity(Gravity.FILL);
            gridLayout.addView(btn, params);
        }
    }
}
