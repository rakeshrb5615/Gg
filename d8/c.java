package d8;
public final class c extends d8.i1 {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater n;
    private volatile synthetic Object _disposer$volatile;
    public final d8.n e;
    public d8.p0 f;
    public final synthetic d8.e m;

    static c()
    {
        d8.c.n = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.c, Object, "_disposer$volatile");
        return;
    }

    public c(d8.e p1, d8.n p2)
    {
        this.m = p1;
        this.e = p2;
        return;
    }

    public final boolean j()
    {
        return 0;
    }

    public final void k(Throwable p6)
    {
        d8.n v0 = this.e;
        if (p6 == null) {
            java.util.ArrayList v1_3 = this.m;
            if (d8.e.b.decrementAndGet(v1_3) == 0) {
                d8.i0[] v6_8 = v1_3.a;
                java.util.ArrayList v1_0 = new java.util.ArrayList(v6_8.length);
                int v2_0 = v6_8.length;
                int v3 = 0;
                while (v3 < v2_0) {
                    v1_0.add(v6_8[v3].getCompleted());
                    v3++;
                }
                v0.resumeWith(v1_0);
            }
        } else {
            v0.getClass();
            d8.i0[] v6_3 = v0.D(new d8.w(0, p6), 0);
            if (v6_3 != null) {
                v0.e(v6_3);
                d8.i0[] v6_6 = ((d8.d) d8.c.n.get(this));
                if (v6_6 != null) {
                    v6_6.b();
                    return;
                }
            }
        }
        return;
    }
}
