package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

/**
 * 作者:追风小宝
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter03_03_15 extends AppCompatActivity {
    TextView txtSex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_01_15);


        CompoundButton.OnCheckedChangeListener ck_listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Log.i("复选框", "选中了" + buttonView.getText().toString());
                }
            }
        };

        final CheckBox like1 = (CheckBox) findViewById(R.id.like1);
        final CheckBox like2 = (CheckBox) findViewById(R.id.like2);
        final CheckBox like3 = (CheckBox) findViewById(R.id.like3);
        like1.setOnCheckedChangeListener(ck_listener);
        like2.setOnCheckedChangeListener(ck_listener);
        like3.setOnCheckedChangeListener(ck_listener);
        final Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String like = "";
                if (like1.isChecked()) {
                    like += like1.getText().toString() + "";
                }
                if (like2.isChecked()) {
                    like += like2.getText().toString() + "";
                }
                if (like3.isChecked()) {
                    like += like3.getText().toString() + "";
                }
                Toast.makeText(Chapter03_03_15.this, like, Toast.LENGTH_SHORT).show();
            }
        });
    }
}