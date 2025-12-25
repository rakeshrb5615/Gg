package com.google.android.material.timepicker;
public final class l implements android.view.View$OnTouchListener {
    public final synthetic android.view.GestureDetector a;

    public l(android.view.GestureDetector p1)
    {
        this.a = p1;
        return;
    }

    public final boolean onTouch(android.view.View p1, android.view.MotionEvent p2)
    {
        if (!((android.widget.Checkable) p1).isChecked()) {
            return 0;
        } else {
            return this.a.onTouchEvent(p2);
        }
    }
}
