package d8;
public final class l0 extends i8.q {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater e;
    private volatile synthetic int _decision$volatile;

    static l0()
    {
        d8.l0.e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.l0, "_decision$volatile");
        return;
    }

    public final void f(Object p1)
    {
        this.g(p1);
        return;
    }

    public final void g(Object p4)
    {
        do {
            String v0_0 = d8.l0.e;
            int v1_0 = v0_0.get(this);
            if (v1_0 == 0) {
            } else {
                if (v1_0 != 1) {
                    throw new IllegalStateException("Already resumed");
                } else {
                    i8.a.h(d8.f0.r(p4), q4.b.C(this.d));
                    return;
                }
            }
        } while(!v0_0.compareAndSet(this, 0, 2));
        return;
    }
}
