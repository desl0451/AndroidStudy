package com.android.desl.androidstudy.RxJavaSimple;

import android.app.AlertDialog;
import android.app.Fragment;

import com.android.desl.androidstudy.R;

import butterknife.OnClick;
import io.reactivex.disposables.Disposable;

/**
 * 作者:追风小宝
 * 日期: 2019/1/3 21:07
 */
public abstract class BaseFragment extends Fragment {
    protected Disposable disposable;

    @OnClick(R.id.tipBt)
    void tip() {
        new AlertDialog.Builder(getActivity())
                .setTitle(getTitleRes())
                .setView(getActivity().getLayoutInflater().inflate(getDialogRes(), null))
                .show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unsubscribe();
    }

    protected void unsubscribe() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    protected abstract int getDialogRes();

    protected abstract int getTitleRes();
}
