package com.android.desl.androidstudy.Book2.Chapter02.SL2_4.Demo14_CheckButtonTest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_03 extends AppCompatActivity {
    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_03_03);
        showText = (TextView) findViewById(R.id.show);//显示的文本
        RadioGroup rdoCheck = (RadioGroup) findViewById(R.id.rg);//选择男
        rdoCheck.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String tip = checkedId == R.id.male ? "您的性别是男人" : "您的性别是女人";
                showText.setText(tip);
            }
        });

        CheckBox ck1 = (CheckBox) findViewById(R.id.red);
        CheckBox ck2 = (CheckBox) findViewById(R.id.yellow);
        CheckBox ck3 = (CheckBox) findViewById(R.id.green);
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    showText.setTextColor(Color.RED);
                } else {

                }
            }
        });
        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    showText.setTextColor(Color.YELLOW);
            }
        });
        ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    showText.setTextColor(Color.GREEN);
            }
        });


    }
}
