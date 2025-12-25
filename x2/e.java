package x2;
public final synthetic class e implements java.lang.Runnable {
    public final synthetic o5.d a;
    public final synthetic r2.j b;
    public final synthetic int c;
    public final synthetic Runnable d;

    public synthetic e(o5.d p1, r2.j p2, int p3, Runnable p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final void run()
    {
        Throwable v0 = this.b;
        int v1 = this.c;
        Runnable v2 = this.d;
        b8.g v3_0 = this.a;
        y2.h v4_3 = ((z2.c) v3_0.f);
        x2.f v5_11 = ((y2.d) v3_0.c);
        java.util.Objects.requireNonNull(v5_11);
        ((y2.h) v4_3).y(new a5.a(v5_11, 23));
        x2.f v5_6 = ((android.net.ConnectivityManager) ((android.content.Context) v3_0.a).getSystemService("connectivity")).getActiveNetworkInfo();
        if ((v5_6 == null) || (!v5_6.isConnected())) {
            ((y2.h) v4_3).y(new x2.f(v3_0, v0, v1));
        } else {
            v3_0.c(v0, v1);
        }
        v2.run();
        return;
    }
}
