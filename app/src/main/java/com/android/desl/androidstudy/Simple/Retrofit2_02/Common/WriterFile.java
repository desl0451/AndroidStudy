package com.android.desl.androidstudy.Simple.Retrofit2_02.Common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterFile {
    public void FileWriter(String result) {
        //传入路径 + 文件名
        File saveFile = new File("test.txt");
        // 判断文件是否存在，存在就删除
        FileOutputStream outStream = null;
        try {
            outStream = new FileOutputStream(saveFile);
            outStream.write(result.getBytes());
            outStream.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}
