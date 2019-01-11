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

public class YinYueTaiAdapter extends RecyclerView.Adapter<YinYueTaiAdapter.YinYueTaiViewHolder> {

    private List<Music> mList = new ArrayList<>();

    @NonNull
    @Override
    public YinYueTaiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.simple02_retrofit2_yinyuetai_item, viewGroup, false);
        return new YinYueTaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YinYueTaiViewHolder holder, int i) {
        Music data = mList.get(i);
//        holder.title.setText(data.getTitle());
//        holder.abstract1.setText(data.getUserName());
//        Glide.with(holder.image_url.getContext()).load(data.getHeadImg()).into(holder.image_url);

        final String title = data.getTitle();
        String userName = data.getUserName();
        String headImg = data.getHeadImg();

        holder.title.setText(title);
        holder.name.setText(userName);
        headImg="http:"+headImg;
        Glide.with(holder.image_url.getContext()).load(headImg).into(holder.image_url);

    }

    public class YinYueTaiViewHolder extends RecyclerView.ViewHolder {
        View contentLayout;
        TextView title, name;
        ImageView image_url;

        public YinYueTaiViewHolder(@NonNull View itemView) {
            super(itemView);
            contentLayout = itemView.findViewById(R.id.layout_content);
            title = itemView.findViewById(R.id.title);
            name = itemView.findViewById(R.id.name);
            image_url = itemView.findViewById(R.id.image_url);
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setData(List<Music> list) {
        mList = list;
        notifyDataSetChanged();
    }
}
