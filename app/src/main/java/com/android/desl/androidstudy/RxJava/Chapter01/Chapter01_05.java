package com.android.desl.androidstudy.RxJava.Chapter01;


import rx.Observable;
import rx.Subscriber;

/**
 * 作者:追风小宝
 * 日期: 2019/1/3 19:03
 */
public class Chapter01_05 {
    private static void defer() {

    }

    public static void main(String args[]) {
        create();
    }

    private static void create() {
        Observable.create(new rx.Observable.OnSubscribe<String>() {

            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("RxJava学习");
            }
        }).subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted();");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext():" + s);
            }
        });
    }

}
