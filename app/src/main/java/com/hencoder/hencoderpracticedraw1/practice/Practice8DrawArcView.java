package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);


    Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        paint1.setStyle(Paint.Style.FILL); // 填充模式
        paint2.setStyle(Paint.Style.FILL); // 填充模式

        //绘制扇形,连接到圆心
        canvas.drawArc(getWidth()/2-200,getHeight()/2-150,getWidth()/2+200,getHeight()/2+100, -110, 100,true,paint1);

        //绘制弧形,不连接到圆心
        canvas.drawArc(getWidth()/2-200,getHeight()/2-150,getWidth()/2+200,getHeight()/2+100,20,140, false,paint2);

        paint3.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(getWidth()/2-200,getHeight()/2-150,getWidth()/2+200,getHeight()/2+100,170,70, false,paint3);

    }
}
