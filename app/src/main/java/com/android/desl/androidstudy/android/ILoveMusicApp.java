package com.android.desl.androidstudy.android;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ILoveMusicApp extends AppCompatActivity {
    Button but;
    TextView textContent;
    TextView txtMusicName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_music);
        textContent = (TextView) findViewById(R.id.content);
        txtMusicName = (TextView) findViewById(R.id.txtMusicName);
        but = (Button) findViewById(R.id.txtFind);


        Thread imageViewHander = new Thread(new NetImageHandler());
        imageViewHander.start();

    }

}

