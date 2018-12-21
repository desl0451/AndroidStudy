package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

public class Chapter04_04_01 extends AppCompatActivity {

    private static final String[] COUNTRIES = new String[]{"age", "aptech", "accp", "wt"};
    private AutoCompleteTextView auto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_01);
        auto = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        auto.setAdapter(adapter);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Chapter04_04_01.this, auto.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
