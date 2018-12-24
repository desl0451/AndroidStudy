package com.android.desl.androidstudy.Book1.Chapter04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.desl.androidstudy.R;

public class Book1_Chapter04_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_main);

        //###############################################################################
        //按钮1
        Button Book1_Chapter04_04_01 = (Button) this.findViewById(R.id.Book1_Chapter04_04_01);
        Book1_Chapter04_04_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setAction("Book1_Chapter04_04_01");
                startActivity(intent1);
            }
        });

        //按钮2
        Button Book1_Chapter04_04_02 = (Button) this.findViewById(R.id.Book1_Chapter04_04_02);
        Book1_Chapter04_04_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setAction("Book1_Chapter04_04_02");
                startActivity(intent2);
            }
        });
        //按钮3
        Button Book1_Chapter04_04_03 = (Button) this.findViewById(R.id.Book1_Chapter04_04_03);
        Book1_Chapter04_04_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent();
                intent3.setAction("Book1_Chapter04_04_03");
                startActivity(intent3);
            }
        });
        //按钮4
        Button Book1_Chapter04_04_04 = (Button) this.findViewById(R.id.Book1_Chapter04_04_04);
        Book1_Chapter04_04_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent();
                intent4.setAction("Book1_Chapter04_04_04");
                startActivity(intent4);
            }
        });
        //按钮5
        Button Book1_Chapter04_04_05 = (Button) this.findViewById(R.id.Book1_Chapter04_04_05);
        Book1_Chapter04_04_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent();
                intent5.setAction("Book1_Chapter04_04_05");
                startActivity(intent5);
            }
        });
        //按钮6
        Button Book1_Chapter04_04_06 = (Button) this.findViewById(R.id.Book1_Chapter04_04_06);
        Book1_Chapter04_04_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent();
                intent6.setAction("Book1_Chapter04_04_06");
                startActivity(intent6);
            }
        });
        //按钮7
        Button Book1_Chapter04_04_07 = (Button) this.findViewById(R.id.Book1_Chapter04_04_07);
        Book1_Chapter04_04_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent();
                intent7.setAction("Book1_Chapter04_04_07");
                startActivity(intent7);
            }
        });
//        //按钮8
//        Button Book1_Chapter03_01_08 = (Button) this.findViewById(R.id.Book1_Chapter03_01_08);
//        Book1_Chapter03_01_08.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent8 = new Intent();
//                intent8.setAction("Book1_Chapter03_01_08");
//                startActivity(intent8);
//            }
//        });
//        //按钮9
//        Button Book1_Chapter03_01_09 = (Button) this.findViewById(R.id.Book1_Chapter03_01_09);
//        Book1_Chapter03_01_09.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent9 = new Intent();
//                intent9.setAction("Book1_Chapter03_01_09");
//                startActivity(intent9);
//            }
//        });
//
//        //按钮10
//        Button Book1_Chapter03_01_10 = (Button) this.findViewById(R.id.Book1_Chapter03_01_10);
//        Book1_Chapter03_01_10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent10 = new Intent();
//                intent10.setAction("Book1_Chapter03_01_10");
//                startActivity(intent10);
//            }
//        });
//
//        //按钮11
//        Button Book1_Chapter03_01_11 = (Button) this.findViewById(R.id.Book1_Chapter03_01_11);
//        Book1_Chapter03_01_11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent11 = new Intent();
//                intent11.setAction("Book1_Chapter03_01_11");
//                startActivity(intent11);
//            }
//        });
//
//        //按钮12
//        Button Book1_Chapter03_01_12 = (Button) this.findViewById(R.id.Book1_Chapter03_01_12);
//        Book1_Chapter03_01_12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent11 = new Intent();
//                intent11.setAction("Book1_Chapter03_01_12");
//                startActivity(intent11);
//            }
//        });
//
//        //按钮13
//        Button Book1_Chapter03_01_13 = (Button) this.findViewById(R.id.Book1_Chapter03_01_13);
//        Book1_Chapter03_01_13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent11 = new Intent();
//                intent11.setAction("Book1_Chapter03_01_13");
//                startActivity(intent11);
//            }
//        });
//
//        //按钮14
//        Button Book1_Chapter03_01_14 = (Button) this.findViewById(R.id.Book1_Chapter03_01_14);
//        Book1_Chapter03_01_14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent11 = new Intent();
//                intent11.setAction("Book1_Chapter03_01_14");
//                startActivity(intent11);
//            }
//        });
//
//
//        //按钮15
//        Button Book1_Chapter03_01_15 = (Button) this.findViewById(R.id.Book1_Chapter03_01_15);
//        Book1_Chapter03_01_15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent15 = new Intent();
//                intent15.setAction("Book1_Chapter03_01_15");
//                startActivity(intent15);
//            }
//        });
//
//        //按钮16
//        Button Book1_Chapter03_01_16 = (Button) this.findViewById(R.id.Book1_Chapter03_01_16);
//        Book1_Chapter03_01_16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent15 = new Intent();
//                intent15.setAction("Book1_Chapter03_01_16");
//                startActivity(intent15);
//            }
//        });
//
//        //按钮17
//        Button Book1_Chapter03_03_17 = (Button) this.findViewById(R.id.Book1_Chapter03_03_17);
//        Book1_Chapter03_03_17.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent17 = new Intent();
//                intent17.setAction("Book1_Chapter03_03_17");
//                startActivity(intent17);
//            }
//        });
//
//        //###############################################################################
//
//
//        //SL03_06
//        //Chapter03_03_18
//        Button Book1_Chapter03_03_18 = (Button) this.findViewById(R.id.Book1_Chapter03_03_18);
//        Book1_Chapter03_03_18.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_18");
//                startActivity(intent);
//            }
//        });
//
//        //Chapter03_03_19
//        Button Book1_Chapter03_03_19 = (Button) this.findViewById(R.id.Book1_Chapter03_03_19);
//        Book1_Chapter03_03_19.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_19");
//                startActivity(intent);
//            }
//        });
//
//        //Chapter03_03_20
//        Button Book1_Chapter03_03_20 = (Button) this.findViewById(R.id.Book1_Chapter03_03_20);
//        Book1_Chapter03_03_20.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_20");
//                startActivity(intent);
//            }
//        });
//
//
//        //Chapter03_03_21
//        Button Book1_Chapter03_03_21 = (Button) this.findViewById(R.id.Book1_Chapter03_03_21);
//        Book1_Chapter03_03_21.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_21");
//                startActivity(intent);
//            }
//        });
//
//        //Chapter03_03_22
//        Button Book1_Chapter03_03_22 = (Button) this.findViewById(R.id.Book1_Chapter03_03_22);
//        Book1_Chapter03_03_22.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_22");
//                startActivity(intent);
//            }
//        });
//
//        //Chapter03_03_23
//        Button Book1_Chapter03_03_23 = (Button) this.findViewById(R.id.Book1_Chapter03_03_23);
//        Book1_Chapter03_03_23.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_23");
//                startActivity(intent);
//            }
//        });
//
//        //Chapter03_03_24
//        Button Book1_Chapter03_03_24 = (Button) this.findViewById(R.id.Book1_Chapter03_03_24);
//        Book1_Chapter03_03_24.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_24");
//                startActivity(intent);
//            }
//        });
//        //Chapter03_03_25
//        Button Book1_Chapter03_03_25 = (Button) this.findViewById(R.id.Book1_Chapter03_03_25);
//        Book1_Chapter03_03_25.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_25");
//                startActivity(intent);
//            }
//        });
//        //Chapter03_03_26
//        Button Book1_Chapter03_03_26 = (Button) this.findViewById(R.id.Book1_Chapter03_03_26);
//        Book1_Chapter03_03_26.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("Book1_Chapter03_03_26");
//                startActivity(intent);
//            }
//        });
    }
}
