package com.android.desl.androidstudy.android.entity;

/**
 * 作者:追风小宝
 */
public class ImageAndText {
    private String imageUrl;
    private String text;

    public ImageAndText(String imageUrl, String text) {
        this.imageUrl = imageUrl;
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getText() {
        return text;
    }
}