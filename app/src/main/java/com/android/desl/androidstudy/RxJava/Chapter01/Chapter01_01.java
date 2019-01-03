package com.android.desl.androidstudy.RxJava.Chapter01;

import io.reactivex.Flowable;

public class Chapter01_01 {
    public static void main(String args[]) {
        int num[] = new int[]{5, 76, 87, 3};



        Flowable.just(num[4]).subscribe(System.out::println);

        //        System.out.println(num[4]);
    }
}
