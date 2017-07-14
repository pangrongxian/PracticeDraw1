package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintTv = new Paint(Paint.ANTI_ALIAS_FLAG);

    int widthLeft = 120;

    int widthRight = widthLeft + 100;

    int height = 530;

    int widthText = 140;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(110, 30, 110, 550, paint);

        canvas.drawLine(110, 550, getWidth()- 100, 550, paint);

        //绘制矩形
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.GREEN);
        canvas.drawRect(widthLeft, 545, widthRight, 550, paint1); //宽度90

        for (int i = 0; i < 6; i++) {
            widthLeft = widthRight + 20;
            widthRight = widthLeft + 100;
            height = height - 30;
            canvas.drawRect(widthLeft, height, widthRight, 550, paint1);
        }

        paintTv.setColor(Color.WHITE);
        paintTv.setTextSize(22);
        canvas.drawText("Froyo",widthText, 575, paintTv);

        widthText = widthText + 125;
        canvas.drawText("GB",widthText, 575, paintTv);

        widthText = widthText + 120;
        canvas.drawText("IC S",widthText, 575, paintTv);

        widthText = widthText + 120;
        canvas.drawText("JB",widthText, 575, paintTv);

        widthText = widthText + 120;
        canvas.drawText("KitKat",widthText, 575, paintTv);

        widthText = widthText + 120;
        canvas.drawText("L",widthText, 575, paintTv);

        widthText = widthText + 120;
        canvas.drawText("M",widthText, 575, paintTv);


    }
}
