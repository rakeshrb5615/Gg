package androidx.fragment.app;
public final class t1 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic java.util.ArrayList b;
    public final synthetic java.util.ArrayList c;
    public final synthetic java.util.ArrayList d;
    public final synthetic java.util.ArrayList e;

    public t1(int p1, java.util.ArrayList p2, java.util.ArrayList p3, java.util.ArrayList p4, java.util.ArrayList p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final void run()
    {
        int v0 = 0;
        while (v0 < this.a) {
            q0.i0.k(((android.view.View) this.b.get(v0)), ((String) this.c.get(v0)));
            q0.i0.k(((android.view.View) this.d.get(v0)), ((String) this.e.get(v0)));
            v0++;
        }
        return;
    }
}
