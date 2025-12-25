package com.google.android.material.datepicker;
public final class p implements q0.t {
    public final synthetic int a;
    public final synthetic android.view.View b;
    public final synthetic int c;
    public final synthetic int d;
    public final synthetic int e;

    public p(android.view.View p1, int p2, int p3, int p4, int p5)
    {
        this.a = p2;
        this.b = p1;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final q0.s1 i(android.view.View p5, q0.s1 p6)
    {
        int v5_3 = p6.a.f(519);
        android.view.View v0_1 = this.b;
        int v1_4 = this.a;
        if (v1_4 >= 0) {
            v0_1.getLayoutParams().height = (v1_4 + v5_3.b);
            v0_1.setLayoutParams(v0_1.getLayoutParams());
        }
        v0_1.setPadding((this.c + v5_3.a), (this.d + v5_3.b), (this.e + v5_3.c), v0_1.getPaddingBottom());
        return p6;
    }
}
