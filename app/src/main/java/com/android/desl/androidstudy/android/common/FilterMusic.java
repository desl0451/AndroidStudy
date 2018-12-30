package com.android.desl.androidstudy.android.common;

import android.util.Log;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 作者:追风小宝
 */
public class FilterMusic {

    public List<Music> LoadMusicPath(String path) {
        List<Music> mulist = new ArrayList<Music>();
        return mulist;
    }


    public List<Music> LoadMusic(String path) {
        List<Music> mulist = new ArrayList<Music>();
        try {
            path = ReplaceEM(path);
            // 创建 Pattern 对象
            Pattern pattern1 = Pattern.compile("id\":(\\d+),\"title");
            Pattern pattern2 = Pattern.compile("\"title\":\"[a-zA-Z\\u4e00-\\u9fa5\\s\\d-//().]+");
            Pattern pattern3 = Pattern.compile("\"headImg\":\"[//\\w\\s\\da-z.-]+");

            String s;
            // 现在创建 matcher 对象
            Matcher m1 = pattern1.matcher(path);
            Matcher m2 = pattern2.matcher(path);
            Matcher m3 = pattern3.matcher(path);

            while (m1.find()) {
                m2.find();
                m3.find();
                Music music = new Music();
                music.setMusicId(m1.group().substring(4, m1.group().length() - 7));
                music.setMusicName(m2.group().substring(9));
                music.setMusicPic("http:" + m3.group().substring(11));

                mulist.add(music);
            }
//            for (int i = 0; i < mulist.size(); i++) {
//                Music m = mulist.get(i);
//                Log.i("歌曲编号:", "" + m.getMusicId() + "\t");
//                Log.i("歌曲名称:", "" + m.getMusicName() + "\t");
//                Log.i("歌曲图片:", "" + m.getMusicPic() + "\t");
//            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mulist;
    }

    public String ReplaceEM(String path) {
        String oldChar1 = "\\u003c";
        String oldChar2 = "\\u003e";
        String oldChar3 = "\\u0026";
        String newChar = "";
        path = path.replace(oldChar1, newChar);
        path = path.replace(oldChar2, newChar);
        path = path.replace(oldChar3, newChar);
        return path;
    }
}
