package com.google.android.material.datepicker;
public final class g implements java.lang.Runnable {
    public final synthetic int a;
    public int b;
    public final Object c;

    public synthetic g(Object p1, int p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public g(java.util.List p1, int p2, Throwable p3)
    {
        this.a = 1;
        p0.e.d(p1, "initCallbacks cannot be null");
        this.c = new java.util.ArrayList(p1);
        this.b = p2;
        return;
    }

    public g(x3.e p2)
    {
        this.a = 3;
        this.c = p2;
        this.b = -1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                ((com.google.android.material.datepicker.n) this.c).n.i0(this.b);
                return;
            case 1:
                g0.b v0_2 = ((java.util.ArrayList) this.c);
                int v1_0 = v0_2.size();
                int v4 = 0;
                if (this.b == 1) {
                    while (v4 < v1_0) {
                        ((g1.g) v0_2.get(v4)).b();
                        v4++;
                    }
                } else {
                    while (v4 < v1_0) {
                        ((g1.g) v0_2.get(v4)).a();
                        v4++;
                    }
                }
                return;
            case 2:
                g0.b v0_12 = ((g0.b) ((l6.c) this.c).b);
                if (v0_12 != null) {
                    v0_12.h(this.b);
                }
                return;
            default:
                ((x3.e) this.c).n.x(this.b, 4);
                return;
        }
    }
}
