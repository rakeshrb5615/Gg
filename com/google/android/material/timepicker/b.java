package com.google.android.material.timepicker;
public final class b implements android.view.ViewTreeObserver$OnPreDrawListener {
    public final synthetic com.google.android.material.timepicker.ClockFaceView a;

    public b(com.google.android.material.timepicker.ClockFaceView p1)
    {
        this.a = p1;
        return;
    }

    public final boolean onPreDraw()
    {
        int v0_0 = this.a;
        if (v0_0.isShown()) {
            v0_0.getViewTreeObserver().removeOnPreDrawListener(this);
            com.google.android.material.timepicker.ClockHandView v1_2 = (((v0_0.getHeight() / 2) - v0_0.z.d) - v0_0.H);
            if (v1_2 != v0_0.x) {
                v0_0.x = v1_2;
                v0_0.m();
                com.google.android.material.timepicker.ClockHandView v1_4 = v0_0.z;
                v1_4.r = v0_0.x;
                v1_4.invalidate();
            }
            return 1;
        } else {
            return 1;
        }
    }
}
