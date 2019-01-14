package com.android.desl.androidstudy.Simple.Retrofit2_02.network;

import android.util.Log;

import com.android.desl.androidstudy.Simple.Retrofit2_02.model.Music;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

//public class MainPresenter extends BasePresenter<IMainView> {
//    public void getDataFromServer(int num) {
//        Retrofit retrofit = RetrofitUtil.getInstance().getRetrofit();
//        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
//        Observable<Music> observable = RetrofitUtil.getInstance("ss").getRetrofitInterface().getCallCount(num);
//        observable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<Music>() {
//                    @Override
//                    public void accept(Music mBean) throws Exception {
//                        Log.e("getDataFromServer", mBean.getArtists().size() + "");
//                    }
//                });
//map操作符使用
//        Observable<JavaBean> observable = RetrofitUtil.getInstance().getRetrofitInterface().getCall(num);
//        observable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .map(new Function<JavaBean, JavaBean.NewslistBean>() {
//                    @Override
//                    public JavaBean.NewslistBean apply(JavaBean javaBean) throws Exception {
//                        return javaBean.getNewslist().get(0);
//                    }
//                }).subscribe(new Consumer<JavaBean.NewslistBean>() {
//            @Override
//            public void accept(JavaBean.NewslistBean newslistBean) throws Exception {
//                Log.e("getDataFromServer",newslistBean.getTitle()+"");
//            }
//        });
//    }
//}
