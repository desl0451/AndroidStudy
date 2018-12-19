package com.android.desl.androidstudy.Book1.Chapter03.SL03_05;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.android.desl.androidstudy.R;

public class Chapter03_01_04_RabbitView extends View {

    public float bitmapX;//小兔子显示位置X坐标
    public float bitmapY;//小兔子显示位置Y坐标

    public Chapter03_01_04_RabbitView(Context context) { //重写构造方法
        super(context);
        bitmapX = 290;
        bitmapY = 130;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();//创建并余家头例化Paint的对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.book1_chapter03_01_04_rabbit);//根据图片生成位图对象
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint); //绘制小兔子
        if (bitmap.isRecycled()) { //判断图片是否回收
            bitmap.recycle();  //强制回收图片
        }
    }
}
