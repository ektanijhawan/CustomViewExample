package com.example.ekta.customviewexample.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Ekta on 09-05-2017.
 */

public class CustomView extends View{
    Rect mRectSquare;
    Paint mPaintSquare;

    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);

    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);

    }
    private void init(@Nullable AttributeSet set){

        mRectSquare = new Rect();
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintSquare.setColor(Color.BLUE);

    }
    public void swapColor()
    {
        mPaintSquare.setColor(mPaintSquare.getColor()==Color.GREEN? Color.BLUE :Color.GREEN);
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        canvas.drawColor(Color.CYAN);
        mRectSquare.left= 100;
        mRectSquare.top= 100;
        mRectSquare.right= mRectSquare.left+100;
        mRectSquare.bottom= mRectSquare.top+100;


        canvas.drawRect(mRectSquare, mPaintSquare);
    }
}
