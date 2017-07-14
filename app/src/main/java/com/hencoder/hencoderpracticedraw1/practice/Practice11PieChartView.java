package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path1 = new Path(); // 初始化 Path 对象
    Path path2 = new Path(); // 初始化 Path 对象
    Path path3 = new Path(); // 初始化 Path 对象
    Path path4 = new Path(); // 初始化 Path 对象
    Path path5 = new Path(); // 初始化 Path 对象
    Path path6 = new Path(); // 初始化 Path 对象
    Path path7 = new Path(); // 初始化 Path 对象

    Paint paintTv = new Paint(Paint.ANTI_ALIAS_FLAG);

    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint4 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint5 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint6 = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        //canvas.drawCircle(450,300,300,paint);
//        paint.setStyle(Paint.Style.FILL); // 填充模式
//        canvas.drawArc(150, 30, 750, 630, 0, 360, true, paint); // 绘制扇形

        paint1.setColor(Color.parseColor("#FF9933")); //泥黄色
        canvas.drawArc(150, 30, 750, 630, -50, 50, true, paint1); // 绘制扇形

        paint2.setColor(Color.parseColor("#663399")); //紫红色
        canvas.drawArc(150, 30, 750, 630, 3, 8, true, paint2); // 绘制扇形

        paint3.setColor(Color.parseColor("#808080")); //浅灰色
        canvas.drawArc(150, 30, 750, 630, 13, 5, true, paint3); // 绘制扇形

        paint4.setColor(Color.parseColor("#009933")); //老绿色
        canvas.drawArc(150, 30, 750, 630, 20, 60, true, paint4); // 绘制扇形

        paint5.setColor(Color.parseColor("#00CCFF")); //天蓝色
        canvas.drawArc(150, 30, 750, 630, 82, 95, true, paint5); // 绘制扇形

        //设置位置偏离一些
        paint6.setColor(Color.parseColor("#FF0000")); //大红色
        canvas.drawArc(140, 15, 740, 615, 180, 128, true, paint6); // 绘制扇形

        paintTv.setColor(Color.WHITE);
        paintTv.setTextSize(30);
        canvas.drawText("饼图",420, 680, paintTv);


        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);

        //绘制第一条折线
        path1.moveTo(120, 50); // 我移~~
        path1.lineTo(250, 50); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path1.rLineTo(20, 20); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
        canvas.drawPath(path1,paint);
        canvas.drawText("Lollipop",5, 50, paintTv);

        //绘制第二条折线
        path2.moveTo(130, 600); // 我移~~
        path2.lineTo(250, 600); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path2.rLineTo(24, -24);
        canvas.drawPath(path2,paint);
        canvas.drawText("KitKat",30, 600, paintTv);

        //绘制第三条折线
        path3.moveTo(getWidth()-250, 540); // 我移~~
        path3.lineTo(getWidth()-370, 540); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path3.rLineTo(-24, -24);
        canvas.drawPath(path3,paint);
        canvas.drawText("Jelly Bean",getWidth()-240, 540, paintTv);

        //绘制第四条折线
        path4.moveTo(getWidth()-250, 445); // 我移~~
        path4.lineTo(getWidth()-280, 445); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path4.rLineTo(-32, -32);
        path4.rLineTo(-30, 0);
        canvas.drawPath(path4,paint);
        canvas.drawText("lce Sandwich ",getWidth()-240, 445, paintTv);

        //绘制第五条折线
        path5.moveTo(getWidth()-250, 400); // 我移~~
        path5.lineTo(getWidth()-280, 400); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path5.rLineTo(-30, -30);
        path5.rLineTo(-20, 0);
        canvas.drawPath(path5,paint);
        canvas.drawText("GingerBread",getWidth()-240, 400, paintTv);

        //绘制第六条折线
        path6.moveTo(getWidth()-250, 340); // 我移~~
        path6.lineTo(getWidth()-330, 340); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        canvas.drawPath(path6,paint);
        canvas.drawText("Froyo",getWidth()-240, 340, paintTv);

        //绘制第七条折线
        path7.moveTo(getWidth()-250, 200); // 我移~~
        path7.lineTo(getWidth()-320, 200); // 由当前位置 (getWidth()-250, 200) 向 (getWidth()-350, 200) 画一条直线
        path7.rLineTo(-30, 30);
        canvas.drawPath(path7,paint);
        canvas.drawText("Marshmallow",getWidth()-240, 200, paintTv);

    }
}
