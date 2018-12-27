package com.android.desl.androidstudy.android.entity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

/**
 * 作者:追风小宝
 */
public class ViewCache {

    private View baseView;
    private TextView textView;
    private ImageView imageView;

    public ViewCache(View baseView) {
        this.baseView = baseView;
    }

    public TextView getTextView() {
        if (textView == null) {
            textView = (TextView) baseView.findViewById(R.id.title);
        }
        return textView;
    }

    public ImageView getImageView() {
        if (imageView == null) {
            imageView = (ImageView) baseView.findViewById(R.id.image);
        }
        return imageView;
    }

}
