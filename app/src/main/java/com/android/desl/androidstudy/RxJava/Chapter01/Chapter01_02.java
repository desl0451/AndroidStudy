package com.android.desl.androidstudy.RxJava.Chapter01;

import rx.Observable;
import rx.functions.Action1;

/**
 * 作者:追风小宝
 */
public class Chapter01_02 {
    public static void main(String args[]) {
        String[] num = new String[]{"人", "口", "手", "上", "中", "下"};

        hello(num);
    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {

            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }

        });
    }
}
