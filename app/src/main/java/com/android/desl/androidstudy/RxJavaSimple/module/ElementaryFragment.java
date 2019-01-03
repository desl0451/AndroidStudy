package com.android.desl.androidstudy.RxJavaSimple.module;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.RxJavaSimple.BaseFragment;
import com.android.desl.androidstudy.RxJavaSimple.adapter.ZhuangbiListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者:追风小宝
 * 日期: 2019/1/3 21:02
 */
public class ElementaryFragment extends BaseFragment {
    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    @BindView(R.id.gridRv)
    RecyclerView gridRv;
    ZhuangbiListAdapter adapter = new ZhuangbiListAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rxjavasimple_fragment_elementary, container, false);
        ButterKnife.bind(this, view);
        gridRv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        gridRv.setAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected int getDialogRes() {
        return R.layout.rxjavasimple_dialog_elementary;
    }

    @Override
    protected int getTitleRes() {
        return R.string.RxJavaSimple_Title_Elementary;
    }
}
