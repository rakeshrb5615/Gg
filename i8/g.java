package i8;
public final class g extends d8.a0 implements d8.k0 {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater n;
    public final synthetic d8.k0 c;
    public final d8.a0 d;
    public final int e;
    public final i8.k f;
    public final Object m;
    private volatile synthetic int runningWorkers$volatile;

    static g()
    {
        i8.g.n = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(i8.g, "runningWorkers$volatile");
        return;
    }

    public g(d8.a0 p2, int p3)
    {
        d8.k0 v0_1;
        if (!(p2 instanceof d8.k0)) {
            v0_1 = 0;
        } else {
            v0_1 = ((d8.k0) p2);
        }
        if (v0_1 == null) {
            v0_1 = d8.h0.a;
        }
        this.c = v0_1;
        this.d = p2;
        this.e = p3;
        this.f = new i8.k();
        this.m = new Object();
        return;
    }

    public final d8.p0 c(long p2, d8.b2 p4, l7.h p5)
    {
        return this.c.c(p2, p4, p5);
    }

    public final void f(long p2, d8.n p4)
    {
        this.c.f(p2, p4);
        return;
    }

    public final void i(l7.h p3, Runnable p4)
    {
        this.f.a(p4);
        d8.a0 v3_3 = i8.g.n;
        if (v3_3.get(this) < this.e) {
            try {
                if (v3_3.get(this) < this.e) {
                    v3_3.incrementAndGet(this);
                    d8.a0 v3_1 = this.y();
                    if (v3_1 != null) {
                        this.d.i(this, new b5.l(this, v3_1));
                        return;
                    }
                } else {
                    return;
                }
            } catch (d8.a0 v3_2) {
                throw v3_2;
            }
        }
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.d);
        v0_1.append(".limitedParallelism(");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }

    public final Runnable y()
    {
        while(true) {
            int v0_3 = ((Runnable) this.f.d());
            if (v0_3 != 0) {
                return v0_3;
            } else {
                try {
                    Throwable v1_1 = i8.g.n;
                    v1_1.decrementAndGet(this);
                } catch (Throwable v1_0) {
                    throw v1_0;
                }
                if (this.f.c() == 0) {
                    break;
                }
                v1_1.incrementAndGet(this);
            }
        }
        return 0;
    }
}
