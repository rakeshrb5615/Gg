package androidx.fragment.app;
public final synthetic class g implements java.lang.Runnable {
    public final synthetic androidx.fragment.app.y1 a;
    public final synthetic androidx.fragment.app.y1 b;
    public final synthetic boolean c;

    public synthetic g(androidx.fragment.app.y1 p1, androidx.fragment.app.y1 p2, boolean p3, r.e p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void run()
    {
        androidx.fragment.app.e0 v0_1 = this.a.c;
        androidx.fragment.app.e0 v1_1 = this.b.c;
        kotlin.jvm.internal.j.e(v0_1, "inFragment");
        kotlin.jvm.internal.j.e(v1_1, "outFragment");
        if (!this.c) {
            v0_1.getEnterTransitionCallback();
            return;
        } else {
            v1_1.getEnterTransitionCallback();
            return;
        }
    }
}
