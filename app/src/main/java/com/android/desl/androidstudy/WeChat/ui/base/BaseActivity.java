package com.android.desl.androidstudy.WeChat.ui.base;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity <V,T extends BasePresenter<V>> extends AppCompatActivity {
    protected T mPresenter;
//    private CustomDialog mDialogWaiting;
}
