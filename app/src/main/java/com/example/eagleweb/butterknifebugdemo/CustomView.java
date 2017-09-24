package com.example.eagleweb.butterknifebugdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @创建者 帅子
 * @创建时间 17/9/24.
 * @描述
 */

public class CustomView extends TextView {
    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        canvas.drawColor(Color.RED);
    }

    public void onDestory() {
        Handler handler = getHandler();
        System.out.println("获取的Handler handler：" + handler);
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
