package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.desl.androidstudy.R;

public class Chapter03_03_12 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1chapter03_01_12);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nicknameET = (EditText) findViewById(R.id.nickname);
                String nickname = nicknameET.getText().toString();
                EditText pwdET = (EditText) findViewById(R.id.pwd);
                String pwd = pwdET.getText().toString();
                EditText emailET = (EditText) findViewById(R.id.email);
                String email = emailET.getText().toString();
                Log.i("编辑框的应用:","会员昵称:"+nickname);
                Log.i("编辑框的应用:","密码:"+nickname);
                Log.i("编辑框的应用:","电子邮件地址:"+nickname);
            }
        });
    }
}
