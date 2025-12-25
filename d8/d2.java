package d8;
public final class d2 extends i8.q {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public d2(l7.c p3, l7.h p4)
    {
        l7.d v0_2;
        l7.d v0_0 = d8.e2.a;
        if (p4.get(v0_0) != null) {
            v0_2 = p4;
        } else {
            v0_2 = p4.plus(v0_0);
        }
        super(p3, v0_2);
        super.e = new ThreadLocal();
        if (!(p3.getContext().get(l7.d.a) instanceof d8.a0)) {
            Object v3_5 = i8.a.l(p4, 0);
            i8.a.g(p4, v3_5);
            super.S(p4, v3_5);
        }
        return;
    }

    public final boolean R()
    {
        if ((!this.threadLocalIsSet) || (this.e.get() != null)) {
            int v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        this.e.remove();
        return (v0_4 ^ 1);
    }

    public final void S(l7.h p3, Object p4)
    {
        this.threadLocalIsSet = 1;
        this.e.set(new h7.f(p3, p4));
        return;
    }

    public final void g(Object p6)
    {
        if (this.threadLocalIsSet) {
            boolean v0_7 = ((h7.f) this.e.get());
            if (v0_7) {
                i8.a.g(((l7.h) v0_7.a), v0_7.b);
            }
            this.e.remove();
        }
        boolean v6_1 = d8.f0.r(p6);
        boolean v0_2 = this.d;
        l7.h v1_0 = v0_2.getContext();
        d8.d2 v2 = 0;
        Object v3 = i8.a.l(v1_0, 0);
        if (v3 != i8.a.d) {
            v2 = d8.f0.w(v0_2, v1_0, v3);
        }
        try {
            this.d.resumeWith(v6_1);
        } catch (boolean v6_2) {
            if (v2 == null) {
                i8.a.g(v1_0, v3);
            } else {
                if (v2.R()) {
                }
            }
            throw v6_2;
        }
        if ((v2 != null) && (!v2.R())) {
            return;
        } else {
            i8.a.g(v1_0, v3);
            return;
        }
    }
}
