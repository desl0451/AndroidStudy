package com.android.desl.androidstudy.android.common;

import android.os.Handler;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetMusicDownHandler extends Thread {
    public String SongId;
    public Handler handler;
    public String message;

    public NetMusicDownHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void run() {
        try {
            String JsonPath = "http://www.yinyuetai.com/insite/get-video-info?flex=true&videoId=" + SongId;
            URL url = new URL(JsonPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setRequestProperty("Content-type", "application/x-javascript->json");
            conn.connect();
            InputStream is = conn.getInputStream();
            StringBuffer buffer = null;
            Reader read;
            //获取读取的方式
            read = new InputStreamReader(conn.getInputStream());
            BufferedReader bufferReader = new BufferedReader(read);

            //获取服务器返回的字符串
            String str;//读取每一行数据
            buffer = new StringBuffer();//接受全部数据
            while ((str = bufferReader.readLine()) != null) {
                buffer.append(str + "\n");
            }
            Log.i("读取的信息:", buffer.toString());

            message = buffer.toString();
            handler.sendEmptyMessage(0x123);
            //关闭连接
            read.close();
            conn.disconnect();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

