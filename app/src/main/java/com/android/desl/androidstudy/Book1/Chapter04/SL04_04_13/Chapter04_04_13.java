package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_13;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.desl.androidstudy.Book1.Chapter04.SL04_04_12.Chapter04_04_12;
import com.android.desl.androidstudy.R;

public class Chapter04_04_13 extends AppCompatActivity {

    private boolean[] checkedItems;
    private String[] items;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_13);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alert = new AlertDialog.Builder(Chapter04_04_13.this).create();
                alert.setIcon(R.drawable.book1_chapter04_04_11_advise);
                alert.setTitle("系统提示:");
                alert.setMessage("带取消、中立和确定按钮的对话框");
                //添加"取消"按钮
                alert.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Chapter04_04_13.this, "您单击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                //添加"确定"按钮
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Chapter04_04_13.this, "您单击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                //添加"中立"按钮
                alert.setButton(DialogInterface.BUTTON_NEUTRAL, "中立", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Chapter04_04_13.this, "您单击了中立按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] items = new String[]{"跑步", "羽毛球", "乒乓球", "网球", "体操"};
                AlertDialog.Builder builder = new AlertDialog.Builder(Chapter04_04_13.this);
                builder.setIcon(R.drawable.book1_chapter04_04_11_advise1);
                builder.setTitle("请选择你喜欢的运动项目:");
                //添加列表项
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Chapter04_04_13.this, "您选择了:" + items[which], Toast.LENGTH_SHORT).show();
                    }
                });
                builder.create().show();
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] items = new String[]{"标准", "无声", "会议", "户外", "离线"};
                //显示带单选列表项的对话框
                AlertDialog.Builder builder = new AlertDialog.Builder(Chapter04_04_13.this);
                builder.setIcon(R.drawable.book1_chapter04_04_11_advise2);
                builder.setTitle("请选择要使用的情景模式:");
                builder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Chapter04_04_13.this, "您选择了:" + items[which], Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("确定", null);//添加"确定"按钮
                builder.create().show();//创建对话框并显示
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkedItems = new boolean[]{false, true, false, true, false};//记录各列表项的状态
                //各列表项要显示的内容
                items = new String[]{"植物大战僵尸", "愤怒的小鸟", "泡泡龙", "开心农场", "超级玛丽"};
                //显示带单选列表项的对话框
                AlertDialog.Builder builder = new AlertDialog.Builder(Chapter04_04_13.this);
                builder.setIcon(R.drawable.book1_chapter04_04_11_advise2);
                builder.setTitle("请选择您喜欢的游戏:");
                builder.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        checkedItems[which] = isChecked;
                    }
                });
                //为对话框添加"确定"按钮
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String result = "";
                        for (int i = 0; i < checkedItems.length; i++) {
                            if (checkedItems[i]) {
                                result += items[i] + "、";
                            }
                        }
                        //当result不为空时,通过消息提示框显示选择的结果
                        if (!"".equals(result)) {
                            result = result.substring(0, result.length() - 1);
                            Toast.makeText(Chapter04_04_13.this, "您选择了:[" + result + "]", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.create().show();//创建对话框并显示
            }
        });
    }
}