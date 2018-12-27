package com.android.desl.androidstudy.android.downpic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 作者:追风小宝
 */

/**
 * 异步下载图片的任务。
 */
//public class BitmapWorkerTask extends AsyncTask<String, Void, BitmapDrawable> {
//
//    String imageUrl;
//
//    private WeakReference imageViewReference;
//
//    public BitmapWorkerTask(ImageView imageView) {
//        imageViewReference = new WeakReference(imageView);
//    }
//
//    @Override
//    protected BitmapDrawable doInBackground(String... params) {
//        imageUrl = params[0];
//        // 在后台开始下载图片
//        Bitmap bitmap = downloadBitmap(imageUrl);
//        BitmapDrawable drawable = new BitmapDrawable(context.getResources(), bitmap);
//        addBitmapToMemoryCache(imageUrl, drawable);
//        return drawable;
//    }
//
//    @Override
//    protected BitmapDrawable doInBackground(String... strings) {
//        return null;
//    }
//
//    @Override
//    protected void onPostExecute(BitmapDrawable drawable) {
//        ImageView imageView = getAttachedImageView();
//        if (imageView != null && drawable != null) {
//            imageView.setImageDrawable(drawable);
//        }
//    }
//
//    /**
//     * 获取当前BitmapWorkerTask所关联的ImageView。
//     */
//    private ImageView getAttachedImageView() {
//        ImageView imageView = imageViewReference.get();
//        BitmapWorkerTask bitmapWorkerTask = getBitmapWorkerTask(imageView);
//        if (this == bitmapWorkerTask) {
//            return imageView;
//        }
//        return null;
//    }
//
//    /**
//     * 建立HTTP请求，并获取Bitmap对象。
//     *
//     * @param imageUrl 图片的URL地址
//     * @return 解析后的Bitmap对象
//     */
//    private Bitmap downloadBitmap(String imageUrl) {
//        Bitmap bitmap = null;
//        HttpURLConnection con = null;
//        try {
//            URL url = new URL(imageUrl);
//            con = (HttpURLConnection) url.openConnection();
//            con.setConnectTimeout(5 * 1000);
//            con.setReadTimeout(10 * 1000);
//            bitmap = BitmapFactory.decodeStream(con.getInputStream());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (con != null) {
//                con.disconnect();
//            }
//        }
//        return bitmap;
//    }
//}
//
