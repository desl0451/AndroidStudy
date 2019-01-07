package com.android.desl.androidstudy.Simple.Retrofit2_02.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.Simple.Retrofit2_02.model.Music;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class YinYueTaiAdapter extends RecyclerView.Adapter<YinYueTaiAdapter.YinYueTaiViewHolder> {

    private List<Music> mList = new ArrayList<>();


    @Override
    public void onBindViewHolder(@NonNull YinYueTaiViewHolder holder, int i) {
        Music music = mList.get(i);
        holder.music = music;
        holder.musicName.setText(music.getMusicName());
        holder.musicUrl.setText(music.getMusicUrl());
        Glide.with(holder.ivAvatar.getContext()).load(music.getMusicPic()).into(holder.ivAvatar);
    }

    @NonNull
    @Override
    public YinYueTaiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.simple02_retrofit2_yinyuetai_item, viewGroup, false);
        return new YinYueTaiViewHolder(view);
    }

    public class YinYueTaiViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.layout_content)
        View contentLayout;
        @BindView(R.id.TextView)
        TextView musicName, musicUrl;
        @BindView(R.id.iv_avatar)
        ImageView ivAvatar;
        Music music;

        public YinYueTaiViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
