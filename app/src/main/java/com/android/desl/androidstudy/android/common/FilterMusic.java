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
    public List<Music> LoadMusic(String path) {
        List<Music> mulist = new ArrayList<Music>();
        try {
            // 创建 Pattern 对象
            Pattern pattern1 = Pattern.compile("id\":(\\d+),\"title");
            Pattern pattern2 = Pattern.compile("\"title\":\"\\s*\",");
            String s;
            // 现在创建 matcher 对象
            Matcher m1 = pattern1.matcher(path);
            Matcher m2 = pattern2.matcher(path);


            while (m1.find()) {
                Music music = new Music();
                music.setMusicId(m1.group());
                Log.i("内容:",""+m1.group());
                //                music.setMusicName(m2.toString());
                mulist.add(music);
            }
            for (int i = 0; i < mulist.size(); i++) {
                Music m = mulist.get(i);
                Log.i("数量:", "" + m.getMusicId() + "\t");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mulist;
    }
}
