package com.android.desl.androidstudy.WeChat.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.WeChat.app.base.BaseApp;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.lqr.emoji.LQREmotionKit;
import com.lqr.imagepicker.ImagePicker;
import com.lqr.imagepicker.loader.ImageLoader;
import com.lqr.imagepicker.view.CropImageView;

import io.rong.common.SystemUtils;
import io.rong.imlib.RongIMClient;
import io.rong.imlib.model.Message;

import static io.rong.common.SystemUtils.getCurrentProcessName;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　  ┏┓     ┏┓
 * 　　┏┛┻━━━━━┛┻┓
 * 　　┃　　　　　 ┃
 * 　　┃　　━　　　┃
 * 　　┃　┳┛　┗┳  ┃
 * 　　┃　　　　　 ┃
 * 　　┃　　┻　　　┃
 * 　　┃　　　　　 ┃
 * 　　┗━┓　　　┏━┛
 * 　　　 ┃　　　┃ 神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　┣┓
 * 　　　　┃　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛━━
 * 　　　　 ┃┫┫ ┃┫┫
 * 　　　　 ┗┻┛ ┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 * BaseApp的拓展，用于设置其他第三方的初始化
 */

public class MyApp extends BaseApp implements RongIMClient.OnReceiveMessageListener {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化融云
        initRongCloud();

        //初始化红包
        //initRedPacket();

        //初始化仿微信控件ImagePicker
        initImagePicker();
        RequestOptions options = new RequestOptions()
                .placeholder(R.mipmap.ic_launcher)                //加载成功之前占位图
                .error(R.mipmap.ic_launcher)                    //加载错误之后的错误图
                .override(400, 400)                                //指定图片的尺寸
                //指定图片的缩放类型为fitCenter （等比例缩放图片，宽或者是高等于ImageView的宽或者是高。）
                .fitCenter()
                //指定图片的缩放类型为centerCrop （等比例缩放图片，直到图片的狂高都大于等于ImageView的宽度，然后截取中间的显示。）
                .centerCrop()
                .circleCrop()//指定图片的缩放类型为centerCrop （圆形）
                .skipMemoryCache(true)                            //跳过内存缓存
                .diskCacheStrategy(DiskCacheStrategy.ALL)        //缓存所有版本的图像
                .diskCacheStrategy(DiskCacheStrategy.NONE)        //跳过磁盘缓存
                .diskCacheStrategy(DiskCacheStrategy.DATA)        //只缓存原来分辨率的图片
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE);    //只缓存最终的图片


        //初始化表情控件
        LQREmotionKit.init(this, (content, path, imageview) -> Glide.with(content).load(path).apply(options).into(imageview));
    }

    private void initImagePicker() {
        ImagePicker imagePicker = ImagePicker.getInstance();
        imagePicker.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Activity activity, String path, ImageView imageView, int width, int height) {
                RequestOptions myOptions = new RequestOptions()
                        .centerCrop();

                Glide.with(getContext())
                        .load(Uri.parse("file://" + path).toString())
                        .apply(myOptions)
                        .into(imageView);
            }

            @Override
            public void clearMemoryCache() {

            }
        });

        //设置图片加载器
        imagePicker.setShowCamera(true); //显示拍照按钮
        imagePicker.setCrop(true); //允许裁剪(单选才有效)
        imagePicker.setSaveRectangle(true);//是否按矩形区域保存
        imagePicker.setSelectLimit(9);//选中数量限制
        imagePicker.setStyle(CropImageView.Style.RECTANGLE);//裁剪框的形状
        imagePicker.setFocusWidth(800);//裁剪框的宽度。单位像素
        imagePicker.setFocusHeight(800);//裁剪的高度。
        imagePicker.setOutPutX(1000);
        imagePicker.setOutPutY(1000);//保存文件的高度
    }

    /**
     * 初始化融云
     */
    private void initRongCloud() {
        /**
         * OnCreate 会被多个进程重入，这段保护代码，确保只有您需要使用 RongIMClient 的进程和 Push 进程执行了 init。
         * io.rong.push 为融云 push 进程名称，不可修改。
         */
        if (getApplicationInfo().packageName.equals(getCurProcessName(getApplicationContext())) ||
                "io.rong.push".equals(getCurProcessName(getApplicationContext()))) {
            RongIMClient.init(this);

        }
    }

    public static String getCurProcessName(Context context) {
        int pid = android.os.Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningAppProcessInfo appProcess : activityManager.getRunningAppProcesses()) {
            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return null;
    }

    @Override
    public boolean onReceived(Message message, int i) {
        return false;
    }
}
