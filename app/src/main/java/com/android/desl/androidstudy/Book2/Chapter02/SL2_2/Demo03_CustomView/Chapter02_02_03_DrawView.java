package com.android.desl.androidstudy.Book2.Chapter02.SL2_2.Demo03_CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 作者:追风小宝
 */
public class Chapter02_02_03_DrawView extends View {
    public float currentX = 40;
    public float currentY = 50;


    Paint p = new Paint();

    public Chapter02_02_03_DrawView(Context context) {
        super(context);
    }

    public Chapter02_02_03_DrawView(Context context, AttributeSet set) {
        super(context, set);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.RED);
        canvas.drawCircle(currentX, currentY, 15, p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX = event.getX();
        currentY = event.getY();
        invalidate();
        return true;
    }
}
