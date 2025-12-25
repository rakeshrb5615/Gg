package f8;
public final class p extends d8.a implements f8.q, f8.g {
    public final f8.c d;

    public p(l7.h p2, f8.c p3)
    {
        super(p2, 1);
        super.d = p3;
        return;
    }

    public final void O(boolean p3, Throwable p4)
    {
        if ((!this.d.g(0, p4)) && (p3 == null)) {
            d8.f0.l(p4, this.c);
        }
        return;
    }

    public final void P(Object p3)
    {
        this.d.g(0, 0);
        return;
    }

    public final void R(z8.u p6)
    {
        Throwable v0_0 = this.d;
        v0_0.getClass();
        String v1_1 = f8.c.p;
        while (!v1_1.compareAndSet(v0_0, 0, p6)) {
            if (v1_1.get(v0_0) != null) {
            }
            do {
                Object v2_0 = v1_1.get(v0_0);
                d4.l v3 = f8.e.q;
                if (v2_0 != v3) {
                    if (v2_0 != f8.e.r) {
                        Throwable v0_2 = new StringBuilder("Another handler is already registered: ");
                        v0_2.append(v2_0);
                        throw new IllegalStateException(v0_2.toString().toString());
                    } else {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                }
                while (!v1_1.compareAndSet(v0_0, v3, f8.e.r)) {
                }
                p6.invoke(v0_0.m());
                return;
            } while(v1_1.get(v0_0) == v3);
        }
        return;
    }

    public final Object b(Object p2, l7.c p3)
    {
        return this.d.b(p2, p3);
    }

    public final void cancel(java.util.concurrent.CancellationException p3)
    {
        if (!this.isCancelled()) {
            if (p3 == null) {
                p3 = new d8.f1(this.l(), 0, this);
            }
            this.j(p3);
            return;
        } else {
            return;
        }
    }

    public final Object d(Object p2)
    {
        return this.d.d(h7.l.a);
    }

    public final void j(java.util.concurrent.CancellationException p3)
    {
        java.util.concurrent.CancellationException v3_1 = d8.r1.L(this, p3);
        this.d.g(1, v3_1);
        this.i(v3_1);
        return;
    }
}
