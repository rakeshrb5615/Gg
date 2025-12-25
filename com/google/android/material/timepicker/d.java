package com.google.android.material.timepicker;
public final synthetic class d implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic com.google.android.material.timepicker.ClockHandView a;

    public synthetic d(com.google.android.material.timepicker.ClockHandView p1)
    {
        this.a = p1;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p2)
    {
        this.a.c(((Float) p2.getAnimatedValue()).floatValue());
        return;
    }
}
