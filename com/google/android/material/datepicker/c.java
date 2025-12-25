package com.google.android.material.datepicker;
public final class c {
    public final a6.e a;
    public final a6.e b;

    public c(android.content.Context p5)
    {
        android.content.res.TypedArray v0_1 = p5.obtainStyledAttributes(c4.b.W(p5, 2130969456, com.google.android.material.datepicker.n.getCanonicalName()).data, c3.a.m);
        a6.e.c(p5, v0_1.getResourceId(4, 0));
        a6.e.c(p5, v0_1.getResourceId(2, 0));
        a6.e.c(p5, v0_1.getResourceId(3, 0));
        a6.e.c(p5, v0_1.getResourceId(5, 0));
        int v1_9 = j5.t1.v(p5, v0_1, 7);
        this.a = a6.e.c(p5, v0_1.getResourceId(9, 0));
        a6.e.c(p5, v0_1.getResourceId(8, 0));
        this.b = a6.e.c(p5, v0_1.getResourceId(10, 0));
        new android.graphics.Paint().setColor(v1_9.getDefaultColor());
        v0_1.recycle();
        return;
    }
}
