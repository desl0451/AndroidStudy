package com.android.desl.androidstudy.WeChat.app;

import com.android.desl.androidstudy.WeChat.app.base.BaseApp;

import io.rong.imlib.RongIMClient;

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
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　 ┃┫┫ ┃┫┫
 * 　　　　 ┗┻┛ ┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 * BaseApp的拓展，用于设置其他第三方的初始化
 */

public class MyApp extends BaseApp implements RongIMClient.OnReceiveDestructionMessageListener {
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化融云
//        initRongCloud();
    }
}
