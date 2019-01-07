package com.android.desl.androidstudy.Simple.Retrofit2_01.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.Simple.Retrofit2_01.model.GitHubInfo;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class GitHubAdapter extends RecyclerView.Adapter<GitHubAdapter.GitHubViewHolder> {

    private GitHubCallBack gCallBack;
    private List<GitHubInfo> gList = new ArrayList<>();

    public void setCallBack(GitHubCallBack callBack) {
        this.gCallBack = callBack;
    }

    @NonNull
    @Override
    public GitHubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.simple01_retrofit2_github_item, viewGroup, false);
        return new GitHubViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return gList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull GitHubViewHolder gitHubViewHolder, int i) {
        GitHubInfo gitHubInfo = gList.get(i);
        final String login = gitHubInfo.getLogin();
        String htmlUrl = gitHubInfo.getHtml_url();
        String avatarUrl = gitHubInfo.getAvatar_url();

        gitHubViewHolder.gitHubInfo = gitHubInfo;
        gitHubViewHolder.tvName.setText(login);
        gitHubViewHolder.tvUrl.setText(htmlUrl);
        Glide.with(gitHubViewHolder.ivAvatar.getContext()).load(avatarUrl).into(gitHubViewHolder.ivAvatar);

        gitHubViewHolder.contentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gCallBack != null) {
                    gCallBack.onItemClick(gitHubViewHolder.gitHubInfo);
                }
            }
        });
    }


    public class GitHubViewHolder extends RecyclerView.ViewHolder {
        View contentLayout;
        TextView tvName, tvUrl;
        ImageView ivAvatar;
        GitHubInfo gitHubInfo;

        public GitHubViewHolder(@NonNull View itemView) {
            super(itemView);
            contentLayout = itemView.findViewById(R.id.layout_content);
            tvName = itemView.findViewById(R.id.tv_name);
            tvUrl = itemView.findViewById(R.id.tv_url);
            ivAvatar = itemView.findViewById(R.id.iv_avatar);
        }
    }

    public void setData(List<GitHubInfo> list) {
        gList = list;
        notifyDataSetChanged();
    }

    public interface GitHubCallBack {
        void onItemClick(GitHubInfo info);
    }
}
