package com.android.desl.androidstudy.android;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Stream;

public class MusicUtils {

    /**
     * 抓取网页信息
     */
    public static String DownHTML(String searchName) {
        //        //        String JsonPath = "http://soapi.yinyuetai.com/search/video-search?callback=jQuery110209198637949302793_1543807647534&keyword=" + searchName + "&pageIndex=1&pageSize=24&offset=0&orderType=TOTALVIEWS&area=&property=&durationStart=0&durationEnd=&regdateStart=&regdateEnd=1544596502&clarityGrade=&source=&thirdSource=&_=154459648995";
        //        String JsonPath = "https://www.baidu.com/";
        //        String result = "";
        //        File file = null;
        //        String path = null;
        //        try {
        //            // 统一资源
        //            URL url = new URL(JsonPath);
        //            // 通過url对象，创建一个HttpURLConnection对象（连接）
        //            HttpURLConnection urlConnection = (HttpURLConnection) url
        //                    .openConnection();
        ////            urlConnection.setRequestMethod("POST");
        ////            urlConnection.addRequestProperty("Connection", "Keep-Alive");
        //            urlConnection.addRequestProperty("Charset", "UTF-8");
        //            //            urlConnection.addRequestProperty("Content-Type","multipart/form-data;boundary="+boundary);
        //            // 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在
        //            // http正文内，因此需要设为true, 默认情况下是false;
        //            urlConnection.setDoOutput(true);
        //            //设置是否从httpUrlConnection读入，默认情况下是true;
        //            urlConnection.setDoInput(true);
        //            // Post 请求不能使用缓存  ?
        //            urlConnection.setUseCaches(false);
        //            urlConnection.setConnectTimeout(20000);
        //            //            urlConnection.setRequestMethod("POST");
        //            //            urlConnection.setDoOutput(true);
        //            //            urlConnection.setDoInput(true);
        //            //            urlConnection.setUseCaches(false);
        //            //            urlConnection.setConnectTimeout(30000);
        //            //            urlConnection.setReadTimeout(30000);
        //            urlConnection.setRequestProperty("Content-type", "application/x-javascript->json");
        //            urlConnection.connect();
        ////            urlConnection.connect();
        //            InputStreamReader is = new InputStreamReader(urlConnection.getInputStream());
        //            BufferedReader reader = new BufferedReader(is);
        //            StringBuffer sb = new StringBuffer();
        //            String line = null;
        //            // 使用io流读取文件
        //            while ((line = reader.readLine()) != null) {
        //                sb.append(line);
        //            }
        //            result = sb.toString();
        //            // 关闭InputStream、关闭http连接
        //            is.close();
        //            urlConnection.disconnect();
        //
        //        } catch (MalformedURLException e) {
        //            // TODO Auto-generated catch block
        //            e.printStackTrace();
        //        } catch (IOException e) {
        //            // TODO Auto-generated catch block
        //            e.printStackTrace();
        //        } finally {
        //            return result;
        //        }
        return null;
    }


    /**
     * 调用接口
     *
     * @param wsurl
     * @param Parameters
     * @return
     */
    public static String RequestUrl(String wsurl, String Parameters) {
        String rvalue = "";
        try {
            //声明URL
            URL url = new URL(wsurl);
            //打开连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //设置连接方式
            conn.setRequestMethod("POST");
            //设置是否输入参数
            conn.setDoOutput(true);
            //输入参数
            conn.getOutputStream().write(Parameters.getBytes());
            //获取返回值
            InputStream inStream = conn.getInputStream();
            //流转化为字符串
            //            rvalue = StreamTools.streamToStr(inStream);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rvalue;
    }

    public static String GetHTML(String searchName) {
//        String JsonPath = "http://soapi.yinyuetai.com/search/video-search?callback=jQuery110209198637949302793_1543807647534&keyword=" + searchName + "&pageIndex=1&pageSize=24&offset=0&orderType=TOTALVIEWS&area=&property=&durationStart=0&durationEnd=&regdateStart=&regdateEnd=1544596502&clarityGrade=&source=&thirdSource=&_=154459648995";
        String JsonPath = "http://www.baidu.com";
        HttpURLConnection connection = null;
        Reader read;
        StringBuffer buffer = null;
        BufferedReader bufferReader;
        try {
            URL url = new URL(JsonPath);
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(8000);
            connection.setRequestMethod("GET");
            connection.setReadTimeout(8000);
            InputStream in = connection.getInputStream();
            //获取读取的方式
            read = new InputStreamReader(connection.getInputStream());
            bufferReader = new BufferedReader(read);

            //获取服务器返回的字符串
            String str;//读取每一行数据
            buffer = new StringBuffer();//接受全部数据
            while ((str = bufferReader.readLine()) != null) {
                buffer.append(str + "\n");
            }

            //关闭连接
            read.close();
            connection.disconnect();

            //测试
            Log.d("发出去的请求", JsonPath.toString());
            Log.d("读取来的数据", buffer.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return buffer.toString();
    }

}
