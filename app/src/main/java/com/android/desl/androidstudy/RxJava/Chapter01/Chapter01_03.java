package com.android.desl.androidstudy.RxJava.Chapter01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.desl.androidstudy.R;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;


/**
 * 作者:追风小宝
 * 日期: 2019/1/2 21:51
 */
public class Chapter01_03 extends AppCompatActivity {
    Button mSearchButton;
    EditText mQueryEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rxjava_chapter01_01_03);
        mSearchButton = (Button) findViewById(R.id.mSearchButton);
        mQueryEditText = (EditText) findViewById(R.id.mQueryEditText);
    }

    private Observable<String> createButtonClickObservable() {

        return Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(final ObservableEmitter<String> emitter) throws Exception {
                mSearchButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        emitter.onNext(mQueryEditText.getText().toString());
                    }
                });

                emitter.setCancellable(new Cancellable() {
                    @Override
                    public void cancel() throws Exception {
                        // 7
                        mSearchButton.setOnClickListener(null);
                    }
                });
            }
        });
    }

}
