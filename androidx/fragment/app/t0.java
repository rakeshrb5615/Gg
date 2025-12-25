package androidx.fragment.app;
public final class t0 {
    public final java.util.ArrayList a;
    public boolean b;
    public final java.util.concurrent.CopyOnWriteArrayList c;
    public final synthetic int d;
    public final synthetic Object e;

    public t0(androidx.fragment.app.b1 p2)
    {
        this.d = 0;
        this.e = p2;
        this(0);
        return;
    }

    public t0(com.chilllive.chillwallpaperproject.MainActivity p2)
    {
        this.d = 1;
        this.e = p2;
        this(1);
        return;
    }

    public t0(boolean p2)
    {
        this.a = new java.util.ArrayList();
        this.b = p2;
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        return;
    }

    public final void a(boolean p5)
    {
        this.b = p5;
        java.util.ArrayList v0 = this.a;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            c.r v3_1 = v0.get(v2);
            v2++;
            ((c.r) v3_1).b(p5);
        }
        return;
    }
}
