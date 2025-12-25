package g1;
public final class e extends q4.b {
    public final synthetic c5.b f;

    public e(c5.b p2)
    {
        super(7);
        super.f = p2;
        return;
    }

    public final void H(Throwable p2)
    {
        ((g1.i) this.f.a).d(p2);
        return;
    }

    public final void K(j6.s p7)
    {
        java.util.Set v4_0;
        Throwable v0_0 = this.f;
        v0_0.c = p7;
        android.os.Handler v1_9 = ((j6.s) v0_0.c);
        com.google.android.material.datepicker.g v2_3 = ((g1.i) v0_0.a);
        int v3_1 = v2_3.g;
        com.google.android.material.datepicker.g v2_4 = v2_3.i;
        if (android.os.Build$VERSION.SDK_INT < 34) {
            v4_0 = a.a.w();
        } else {
            v4_0 = g1.m.a();
        }
        v0_0.b = new b8.g(v1_9, v3_1, v2_4, v4_0);
        java.util.concurrent.locks.Lock v7_3 = ((g1.i) v0_0.a);
        v7_3.getClass();
        Throwable v0_2 = new java.util.ArrayList();
        v7_3.a.writeLock().lock();
        try {
            v7_3.c = 1;
            v0_2.addAll(v7_3.b);
            v7_3.b.clear();
            v7_3.a.writeLock().unlock();
            java.util.concurrent.locks.Lock v7_5 = v7_3.c;
            v7_3.d.post(new com.google.android.material.datepicker.g(v0_2, v7_5, 0));
            return;
        } catch (Throwable v0_3) {
            v7_5.a.writeLock().unlock();
            throw v0_3;
        }
    }
}
