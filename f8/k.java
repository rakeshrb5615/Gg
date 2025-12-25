package f8;
public final class k extends i8.r {
    public final f8.c e;
    public final synthetic java.util.concurrent.atomic.AtomicReferenceArray f;

    public k(long p1, f8.k p3, f8.c p4, int p5)
    {
        super(p1, p3, p5);
        super.e = p4;
        super.f = new java.util.concurrent.atomic.AtomicReferenceArray((f8.e.b * 2));
        return;
    }

    public final int g()
    {
        return f8.e.b;
    }

    public final void h(int p5, l7.h p6)
    {
        StringBuilder v0_0;
        String v6_0 = f8.e.b;
        if (p5 < v6_0) {
            v0_0 = 0;
        } else {
            v0_0 = 1;
        }
        if (v0_0 != null) {
            p5 -= v6_0;
        }
        this.f.get((p5 * 2));
        do {
            String v6_1 = this.l(p5);
            f8.c v2 = this.e;
            if ((!(v6_1 instanceof d8.f2)) && (!(v6_1 instanceof f8.t))) {
                if ((v6_1 != f8.e.j) && (v6_1 != f8.e.k)) {
                } else {
                    this.n(p5, 0);
                    if (v0_0 != null) {
                        kotlin.jvm.internal.j.b(v2);
                        return;
                    }
                }
            } else {
                String v1_7;
                if (v0_0 == null) {
                    v1_7 = f8.e.k;
                } else {
                    v1_7 = f8.e.j;
                }
                if (this.k(p5, v6_1, v1_7)) {
                    this.n(p5, 0);
                    this.m(p5, (v0_0 ^ 1));
                    if (v0_0 != null) {
                        kotlin.jvm.internal.j.b(v2);
                    }
                }
            }
            return;
        } while((v6_1 != f8.e.g) && (v6_1 != f8.e.f));
        if ((v6_1 != f8.e.i) && ((v6_1 != f8.e.d) && (v6_1 != f8.e.l))) {
            StringBuilder v0_2 = new StringBuilder("unexpected state: ");
            v0_2.append(v6_1);
            throw new IllegalStateException(v0_2.toString().toString());
        }
        return;
    }

    public final boolean k(int p4, Object p5, Object p6)
    {
        int v4_3 = ((p4 * 2) + 1);
        do {
            Object v1_0 = this.f;
            if (!v1_0.compareAndSet(v4_3, p5, p6)) {
            } else {
                return 1;
            }
        } while(v1_0.get(v4_3) == p5);
        return 0;
    }

    public final Object l(int p2)
    {
        return this.f.get(((p2 * 2) + 1));
    }

    public final void m(int p5, boolean p6)
    {
        if (p6 != null) {
            f8.c v6_1 = this.e;
            kotlin.jvm.internal.j.b(v6_1);
            v6_1.B(((this.c * ((long) f8.e.b)) + ((long) p5)));
        }
        this.i();
        return;
    }

    public final void n(int p2, Object p3)
    {
        this.f.set((p2 * 2), p3);
        return;
    }

    public final void o(int p2, Object p3)
    {
        this.f.set(((p2 * 2) + 1), p3);
        return;
    }
}
