package com.android.desl.androidstudy.Simple.Retrofit2_02.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.Simple.Retrofit2_02.model.del.Data;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class YinYueTaiAdapter extends RecyclerView.Adapter<YinYueTaiAdapter.YinYueTaiViewHolder> {

    private List<Data> mList = new ArrayList<>();

    @NonNull
    @Override
    public YinYueTaiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.simple02_retrofit2_yinyuetai_item, viewGroup, false);
        return new YinYueTaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YinYueTaiViewHolder holder, int i) {
        Data data = mList.get(i);
        holder.title.setText(data.getTitle());
        holder.abstract1.setText(data.getUserName());
        Glide.with(holder.image_url.getContext()).load(data.getUserHeadImg()).into(holder.image_url);
    }

    public class YinYueTaiViewHolder extends RecyclerView.ViewHolder {
        View contentLayout;
        TextView title, abstract1;
        ImageView image_url;

        public YinYueTaiViewHolder(@NonNull View itemView) {
            super(itemView);
            contentLayout = itemView.findViewById(R.id.layout_content);
            title = itemView.findViewById(R.id.tv_name);
            abstract1 = itemView.findViewById(R.id.tv_url);
            image_url = itemView.findViewById(R.id.iv_avatar);
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setData(List<Data> list) {
        mList = list;
        notifyDataSetChanged();
    }
}
