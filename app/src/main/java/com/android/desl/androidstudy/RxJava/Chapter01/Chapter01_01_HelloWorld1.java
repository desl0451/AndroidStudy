package com.android.desl.androidstudy.RxJava.Chapter01;

import io.reactivex.Flowable;

public class Chapter01_01_HelloWorld1 {
    public static void main(String args[]) {
        Flowable.just("Hello World").subscribe(System.out::println);
    }
}
