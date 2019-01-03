package com.android.desl.androidstudy.RxJava.Chapter01;


import rx.Observable;
import rx.Subscriber;
import rx.Observable.OnSubscribe;

/**
 * 作者:追风小宝
 * 日期: 2019/1/3 18:42
 */
public class Chapter01_04 {
    public static void main(String args[]) {
        //第一步 创建被观察者
        Observable mObservable = Observable.create(new OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello World!");
                subscriber.onCompleted();
            }
        });
        //创建观察者
        Subscriber subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted()：");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError()：");
            }

            @Override
            public void onNext(String arg0) {
                System.out.println("onNext()：" + arg0);
            }
        };
        //订阅事件
        mObservable.subscribe(subscriber);
    }
}
