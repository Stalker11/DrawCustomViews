package com.olegel.testcircularlayout.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Oleg on 08.11.2017.
 */

public class TestView extends View{
  private Paint strokePaint = new Paint();
  private Paint fillPaint = new Paint();
  private Paint circlePaint = new Paint();
  public static final String TAG = TestView.class.getSimpleName();
  private Context mContext;
  RectF r;
  public TestView(Context context) {
    super(context);
  }

  public TestView(Context context, @Nullable AttributeSet attrs) {
     super(context, attrs);
  }

  public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    mContext = context;
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
   // canvas.drawRect(r, fillPaint);    // fill
   // canvas.drawRect(r, strokePaint);  // stroke
    circlePaint.setStyle(Paint.Style.FILL);
    circlePaint.setColor(Color.BLACK);

    fillPaint.setStyle(Paint.Style.FILL);
    fillPaint.setColor(Color.GREEN);
    fillPaint.setStrokeWidth(25);
    r = new RectF(0, 0, getWidth(), 150);
    Log.d(TAG, "TestView: "+getHeight()+" "+getWidth()+" "+getPaddingLeft());
    // stroke
    strokePaint.setStyle(Paint.Style.FILL);
    strokePaint.setColor(Color.RED);

    //strokePaint.setStrokeWidth(25);
    //strokePaint.setStrokeWidth(100);
    //canvas.translate(10, 60);
    Path path = new Path();
    path.setFillType(Path.FillType.EVEN_ODD);
    Point point1_draw = new Point(0, 0);
    Point point2_draw = new Point(50, 180);
    Point point3_draw = new Point(150, 180);
    Point point4_draw = new Point(200,0);
    path.moveTo(0,0);
    path.lineTo(point2_draw.x,point2_draw.y);
    path.lineTo(point3_draw.x,point3_draw.y);
    path.lineTo(point4_draw.x,point4_draw.y);
    path.lineTo(250,0);
    path.lineTo(300,180);
    path.lineTo(450,180);
    path.lineTo(500,0);
    //path.close();
    // Second rectangle
    int cornerRadius = 50;
    //canvas.drawRoundRect(r, cornerRadius, cornerRadius, fillPaint);    // fill
    //canvas.drawRoundRect(r, cornerRadius, cornerRadius, strokePaint);
   // canvas.clipRect(100,1000,1000,1000);
    canvas.drawRect(r,strokePaint);
    canvas.drawPath(path,fillPaint);
    canvas.drawCircle(50,120,50,circlePaint);
  }
}
