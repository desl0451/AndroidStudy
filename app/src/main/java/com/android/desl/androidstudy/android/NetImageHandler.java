package com.android.desl.androidstudy.android;

import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetImageHandler implements Runnable {
    @Override
    public void run() {
        try {
            String JsonPath = "http://soapi.yinyuetai.com/search/video-search?callback=jQuery110209198637949302793_1543807647534&keyword=神话&pageIndex=1&pageSize=24&offset=0&orderType=TOTALVIEWS&area=&property=&durationStart=0&durationEnd=&regdateStart=&regdateEnd=1544596502&clarityGrade=&source=&thirdSource=&_=154459648995";
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
            Log.i("读取的信息:",buffer.toString());
            //关闭连接
            read.close();
            conn.disconnect();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}