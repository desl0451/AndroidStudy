package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_09;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.android.desl.androidstudy.R;

public class Chapter04_04_09 extends AppCompatActivity {


    int[] imageId = new int[]{
            R.drawable.book1_chapter04_04_07_img01,
            R.drawable.book1_chapter04_04_07_img02,
            R.drawable.book1_chapter04_04_07_img03,
            R.drawable.book1_chapter04_04_07_img04,
            R.drawable.book1_chapter04_04_07_img05,
            R.drawable.book1_chapter04_04_07_img06,
            R.drawable.book1_chapter04_04_07_img07,
            R.drawable.book1_chapter04_04_07_img08,
            R.drawable.book1_chapter04_04_07_img09,
            R.drawable.book1_chapter04_04_07_img10,
            R.drawable.book1_chapter04_04_07_img11,
            R.drawable.book1_chapter04_04_07_img12
    };
    String[] title = new String[]{
            "花开富贵", "海天一色", "日出", "天路", "一枝独秀", "云", "独占鳌头", "蒲公英花", "花团锦簇", "争奇斗艳", "和谐", "林间小路"
    };

    private LinearLayout i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_PROGRESS);//显示水平进度条
        setContentView(R.layout.book1_chapter04_04_09);
        i = (LinearLayout) findViewById(R.id.linearlayout1);
        //获取布局文件中添加的垂直布局管理器中
        new MyTack().execute(); // 执行自定义任务
    }

    class MyTack extends AsyncTask<Void, Integer, LinearLayout> {
        @Override
        protected void onPreExecute() {
            setProgressBarVisibility(true);
            super.onPreExecute();
        }

        /**
         * 功能:要执行的耗时任务
         *
         * @param voids
         * @return
         */
        @Override
        protected LinearLayout doInBackground(Void... voids) {
            LinearLayout ll = new LinearLayout(Chapter04_04_09.this);
            for (int i = 1; i < 5; i++) {
                ImageView iv = new ImageView(Chapter04_04_09.this);//创建一个ImageView对象
                iv.setLayoutParams(new LayoutParams(120, 63));
                iv.setImageResource(imageId[i - 1]);//设置要显示的图片
                ll.addView(iv);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                publishProgress(i);//触发（Progress...)方法更新进度
            }
            return ll;
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            setProgress(values[0] * 2500);//动态更新最新进度
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(LinearLayout linearLayout) {
            setProgressBarVisibility(false);
            i.addView(linearLayout);
            super.onPostExecute(linearLayout);
        }

    }

}
