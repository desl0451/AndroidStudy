package com.android.desl.androidstudy.Book1.Chapter03.SL03_12;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter03_03_26 extends AppCompatActivity {

    int[] imageIds = new int[]{
            R.drawable.book1_chapter03_03_26_shoe_ok,
            R.drawable.book1_chapter03_03_26_shoe_sorry,
            R.drawable.book1_chapter03_03_26_shoe_sorry
    };

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private TextView result;

    private void reset() {
        for (int i = 0; i < 3; i++) {
            int temp = imageIds[i];
            int index = (int) (Math.random() * 2);
            imageIds[i] = imageIds[index];
            imageIds[index] = temp;
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_03_26);
        result = (TextView) findViewById(R.id.textView1);
        image1 = (ImageView) findViewById(R.id.imageView1);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);
        reset();
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRight(v, 0);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRight(v, 1);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRight(v, 2);
            }
        });
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                result.setText(R.string.Book1_Chapter03_03_26_title);
                image1.setAlpha(255);
                image2.setAlpha(255);
                image3.setAlpha(255);
                image1.setImageDrawable(getResources().getDrawable(R.drawable.book1_chapter03_03_26_shoe_default));
                image2.setImageDrawable(getResources().getDrawable(R.drawable.book1_chapter03_03_26_shoe_default));
                image3.setImageDrawable(getResources().getDrawable(R.drawable.book1_chapter03_03_26_shoe_default));
            }
        });
    }

    private void isRight(View v, int index) {
        image1.setImageDrawable(getResources().getDrawable(imageIds[0]));
        image2.setImageDrawable(getResources().getDrawable(imageIds[1]));
        image3.setImageDrawable(getResources().getDrawable(imageIds[2]));
        image1.setAlpha(100);
        image2.setAlpha(100);
        image3.setAlpha(100);
        ImageView v1 = (ImageView) v;
        v1.setAlpha(255);
        if (imageIds[index] == R.drawable.book1_chapter03_03_26_shoe_ok) {
            result.setText("恭喜您,猜对了,祝你幸福!");
        } else {
            result.setText("很抱歉,猜错了,要不要再试一次?");
        }
        reset();
    }
}
