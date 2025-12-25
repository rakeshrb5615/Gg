package com.google.android.material.internal;
public class TouchObserverFrameLayout extends android.widget.FrameLayout {
    public android.view.View$OnTouchListener a;

    public TouchObserverFrameLayout(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        return;
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent p2)
    {
        android.view.View$OnTouchListener v0 = this.a;
        if (v0 != null) {
            v0.onTouch(this, p2);
        }
        return super.onInterceptTouchEvent(p2);
    }

    public void setOnTouchListener(android.view.View$OnTouchListener p1)
    {
        this.a = p1;
        return;
    }
}
