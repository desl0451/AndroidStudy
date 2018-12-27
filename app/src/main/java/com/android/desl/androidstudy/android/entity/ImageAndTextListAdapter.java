package com.android.desl.androidstudy.android.entity;

/**
 * 作者:追风小宝
 */

import java.util.List;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

public class ImageAndTextListAdapter extends ArrayAdapter<ImageAndText> {

    private GridView gridView;
    private AsyncImageLoader asyncImageLoader;

    public ImageAndTextListAdapter(Activity activity, List<ImageAndText> imageAndTexts, GridView gridView1) {
        super(activity, 0, imageAndTexts);
        this.gridView = gridView1;
        asyncImageLoader = new AsyncImageLoader();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Activity activity = (Activity) getContext();

        // Inflate the views from XML
        View rowView = convertView;
        ViewCache viewCache;
        if (rowView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            rowView = inflater.inflate(R.layout.android_music_grid_item, null);
            viewCache = new ViewCache(rowView);
            rowView.setTag(viewCache);
        } else {
            viewCache = (ViewCache) rowView.getTag();
        }
        ImageAndText imageAndText = getItem(position);

        // Load the image and set it on the ImageView
        String imageUrl = imageAndText.getImageUrl();
        ImageView imageView = viewCache.getImageView();
        imageView.setTag(imageUrl);
        Drawable cachedImage = asyncImageLoader.loadDrawable(imageUrl, new AsyncImageLoader.ImageCallback() {
            public void imageLoaded(Drawable imageDrawable, String imageUrl) {
                ImageView imageViewByTag = (ImageView) gridView.findViewWithTag(imageUrl);
                if (imageViewByTag != null) {
                    imageViewByTag.setImageDrawable(imageDrawable);
                }
            }
        });
        if (cachedImage == null) {
            imageView.setImageResource(R.drawable.book1_chapter03_01_09_email);
        } else {
            imageView.setImageDrawable(cachedImage);
        }
        // Set the text on the TextView
        TextView textView = viewCache.getTextView();
        textView.setText(imageAndText.getText());
        return rowView;
    }

}
