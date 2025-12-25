package i8;
public final class f extends d8.m0 implements n7.d, l7.c {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater n;
    private volatile synthetic Object _reusableCancellableContinuation$volatile;
    public final d8.a0 d;
    public final n7.c e;
    public Object f;
    public final Object m;

    static f()
    {
        i8.f.n = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.f, Object, "_reusableCancellableContinuation$volatile");
        return;
    }

    public f(d8.a0 p2, n7.c p3)
    {
        super(-1);
        super.d = p2;
        super.e = p3;
        super.f = i8.a.b;
        super.m = i8.a.k(p3.getContext());
        return;
    }

    public final l7.c d()
    {
        return this;
    }

    public final n7.d getCallerFrame()
    {
        return this.e;
    }

    public final l7.h getContext()
    {
        return this.e.getContext();
    }

    public final Object i()
    {
        Object v0 = this.f;
        this.f = i8.a.b;
        return v0;
    }

    public final void resumeWith(Object p9)
    {
        l7.h v2_2;
        n7.c v0_0 = h7.h.a(p9);
        if (v0_0 != null) {
            v2_2 = new d8.w(0, v0_0);
        } else {
            v2_2 = p9;
        }
        n7.c v0_1 = this.e;
        Object v4_0 = this.d;
        if (!v4_0.s(v0_1.getContext())) {
            d8.x0 v3_1 = d8.z1.a();
            if (v3_1.c < 4294967296) {
                v3_1.A(1);
                try {
                    l7.h v2_0 = v0_1.getContext();
                    Object v4_4 = i8.a.l(v2_0, this.m);
                    try {
                        v0_1.resumeWith(p9);
                    } catch (boolean v9_1) {
                        i8.a.g(v2_0, v4_4);
                        throw v9_1;
                    }
                    i8.a.g(v2_0, v4_4);
                    while (v3_1.C()) {
                    }
                    v3_1.y(1);
                    return;
                } catch (boolean v9_2) {
                    try {
                        this.h(v9_2);
                    } catch (boolean v9_3) {
                        v3_1.y(1);
                        throw v9_3;
                    }
                }
            } else {
                this.f = v2_2;
                this.c = 0;
                boolean v9_5 = v3_1.e;
                if (!v9_5) {
                    v9_5 = new i7.g();
                    v3_1.e = v9_5;
                }
                v9_5.addLast(this);
                return;
            }
        } else {
            this.f = v2_2;
            this.c = 0;
            v4_0.i(v0_1.getContext(), this);
            return;
        }
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("DispatchedContinuation[");
        v0_2.append(this.d);
        v0_2.append(", ");
        v0_2.append(d8.f0.u(this.e));
        v0_2.append(93);
        return v0_2.toString();
    }
}
