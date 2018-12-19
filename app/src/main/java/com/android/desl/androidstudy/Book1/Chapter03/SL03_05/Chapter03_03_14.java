package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

/**
 * 作者:追风小宝
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

public class Chapter03_03_14 extends AppCompatActivity {
    TextView txtSex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_01_14);
        RadioGroup sex = (RadioGroup) findViewById(R.id.radioGroup1);
        txtSex = (TextView) findViewById(R.id.txtSex);
        sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton r = (RadioButton) findViewById(checkedId);
                txtSex.setText(r.getText());
                Log.i("单选按钮", "性别" + r.getText());
            }
        });
    }
}