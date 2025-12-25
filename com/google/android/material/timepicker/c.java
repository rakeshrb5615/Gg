package com.google.android.material.timepicker;
public final class c extends q0.b {
    public final synthetic com.google.android.material.timepicker.ClockFaceView d;

    public c(com.google.android.material.timepicker.ClockFaceView p1)
    {
        this.d = p1;
        return;
    }

    public final void d(android.view.View p5, r0.c p6)
    {
        android.view.accessibility.AccessibilityNodeInfo v0 = p6.a;
        this.a.onInitializeAccessibilityNodeInfo(p5, v0);
        int v1_4 = ((Integer) p5.getTag(2131362204)).intValue();
        if (v1_4 > 0) {
            v0.setTraversalAfter(((android.view.View) this.d.D.get((v1_4 - 1))));
        }
        p6.j(k4.i.c(p5.isSelected(), 0, 1, v1_4, 1));
        v0.setClickable(1);
        p6.b(r0.b.e);
        return;
    }

    public final boolean g(android.view.View p10, int p11, android.os.Bundle p12)
    {
        if (p11 != 16) {
            return super.g(p10, p11, p12);
        } else {
            long v1 = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent v11_2 = this.d;
            p10.getHitRect(v11_2.A);
            float v6 = ((float) v11_2.A.centerX());
            float v7 = ((float) v11_2.A.centerY());
            long v3 = v1;
            v11_2.z.onTouchEvent(android.view.MotionEvent.obtain(v1, v3, 0, v6, v7, 0));
            v11_2.z.onTouchEvent(android.view.MotionEvent.obtain(v1, v3, 1, v6, v7, 0));
            return 1;
        }
    }
}
