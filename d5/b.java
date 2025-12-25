package d5;
public final class b {
    public static final d5.d c;
    public final a5.v a;
    public final java.util.concurrent.atomic.AtomicReference b;

    static b()
    {
        d5.b.c = new d5.d();
        return;
    }

    public b(a5.v p3)
    {
        this.b = new java.util.concurrent.atomic.AtomicReference(0);
        this.a = p3;
        p3.a(new a5.a(this, 3));
        return;
    }

    public final d5.d a(String p2)
    {
        d5.b v0_2 = ((d5.b) this.b.get());
        if (v0_2 != null) {
            return v0_2.a(p2);
        } else {
            return d5.b.c;
        }
    }

    public final boolean b()
    {
        int v0_3 = ((d5.b) this.b.get());
        if ((v0_3 == 0) || (!v0_3.b())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean c(String p2)
    {
        d5.b v0_2 = ((d5.b) this.b.get());
        if ((v0_2 == null) || (!v0_2.c(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(String p4, long p5, j5.k1 p7)
    {
        d5.a v0_3 = g2.g.l("Deferring native open session: ", p4);
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
            android.util.Log.v("FirebaseCrashlytics", v0_3, 0);
        }
        this.a.a(new d5.a(p4, p5, p7));
        return;
    }
}
