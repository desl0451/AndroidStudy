package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_04;

import android.media.Rating;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter04_04_04 extends AppCompatActivity {

    private RatingBar ratingbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_04);
        ratingbar = (RatingBar) findViewById(R.id.ratingBar1);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = ratingbar.getProgress();
                float rating = ratingbar.getRating();
                float step = ratingbar.getStepSize();
                Log.i("星级评分条", "step=" + step + "result" + result + "rating=" + rating);
                Toast.makeText(Chapter04_04_04.this, "你得到了" + rating + "颗星", Toast.LENGTH_LONG).show();
            }
        });
    }
}
