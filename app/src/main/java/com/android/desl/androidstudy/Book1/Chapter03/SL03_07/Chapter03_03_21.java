package com.android.desl.androidstudy.Book1.Chapter03.SL03_07;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.android.desl.androidstudy.R;

import java.util.Calendar;

public class Chapter03_03_21 extends ListActivity {
    int year;
    int month;
    int day;
    int hour;
    int minute;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter03_03_21);
        DatePicker datePicker1 = (DatePicker) findViewById(R.id.datePicker1);
        TimePicker timePicker1 = (TimePicker) findViewById(R.id.timePicker1);
        timePicker1.setIs24HourView(true);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        datePicker1.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Chapter03_03_21.this.year = year;
                Chapter03_03_21.this.month = month;
                Chapter03_03_21.this.day = day;
                show(year, month, day, hour, minute);
            }
        });
    }

    private void show(int year, int month, int day, int hour, int minute) {
        String str = year + "年" + (month + 1) + "月" + day + "日" + hour + ":" + minute;
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
