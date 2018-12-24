package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_05;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TabHost;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter04_04_05 extends AppCompatActivity {

    private TabHost tabHost;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_05);
        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();

        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(R.layout.book1_chapter04_04_05_tab1, tabHost.getTabContentView());
        inflater.inflate(R.layout.book1_chapter04_04_05_tab2, tabHost.getTabContentView());
        inflater.inflate(R.layout.book1_chapter04_04_05_tab3, tabHost.getTabContentView());

        tabHost.addTab(tabHost.newTabSpec("tab01").setIndicator("神族")
                .setContent(R.id.LinearLayout01));
        tabHost.addTab(tabHost.newTabSpec("tab02").setIndicator("人族")
                .setContent(R.id.FrameLayout02));
        tabHost.addTab(tabHost.newTabSpec("tab03").setIndicator("虫族")
                .setContent(R.id.FrameLayout03));
    }
}
