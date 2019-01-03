package com.android.desl.androidstudy.Book1.Chapter04.SL04_04_12;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.desl.androidstudy.R;

public class Chapter04_04_12 extends AppCompatActivity {
    final int NOTIFYID_1 = 123; // 第一个通知的ID
    final int NOTIFYID_2 = 124; // 第二个通知的ID

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1_chapter04_04_12);
        // 获取通知管理器，用于发送通知
        final NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Button button1 = (Button) findViewById(R.id.button1); // 获取“显示通知”按钮
        // 为“显示通知”按钮添加单击事件监听器
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);// 获得通知管理器
                // 添加第一个通知
                Notification.Builder notification = new Notification.Builder(Chapter04_04_12.this);
                notification.setSmallIcon(R.drawable.book1_chapter04_04_11_advise); // 设置通知图标
                notification.setContentTitle("无题");// 设置通知标题
                notification.setContentText("每天进步一点点");// 设置通知内容
                notification.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE); // 设置响铃和振动
                manager.notify(NOTIFYID_1, notification.build());// 发送通知
                // 添加第二个通知
                Notification.Builder notification1 = new Notification.Builder(Chapter04_04_12.this);
                notification1.setSmallIcon(R.drawable.book1_chapter04_04_11_advise2); // 设置通知图标
                notification1.setContentTitle("通知");// 设置通知标题
                notification1.setContentText("查看详细内容");// 设置通知内容
                notification1.setAutoCancel(true);// 查看详细内容后自动关闭
                Intent intent = new Intent(Chapter04_04_12.this, Chapter04_04_12_ContentActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(Chapter04_04_12.this, 0, intent, 0);
                notification1.setContentIntent(pendingIntent);
                manager.notify(NOTIFYID_2, notification1.build());// 发送通知

            }
        });
        Button button2 = (Button) findViewById(R.id.button2); // 获取“删除通知”按钮
        // 为“删除通知”按钮添加单击事件监听器
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // notificationManager.cancel(NOTIFYID_1);
                // //清除ID号为常量NOTIFYID_1的通知
                notificationManager.cancelAll(); // 清除全部通知

            }
        });
    }
}