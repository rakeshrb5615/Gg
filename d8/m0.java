package d8;
public abstract class m0 extends k8.i {
    public int c;

    public m0(int p4)
    {
        super(0, 0);
        super.c = p4;
        return;
    }

    public void b(java.util.concurrent.CancellationException p1)
    {
        return;
    }

    public abstract l7.c d();

    public Throwable f(Object p3)
    {
        Throwable v3_1;
        if (!(p3 instanceof d8.w)) {
            v3_1 = 0;
        } else {
            v3_1 = ((d8.w) p3);
        }
        if (v3_1 == null) {
            return 0;
        } else {
            return v3_1.a;
        }
    }

    public Object g(Object p1)
    {
        return p1;
    }

    public final void h(Throwable p4)
    {
        String v1_1 = new StringBuilder("Fatal exception in coroutines machinery for ");
        v1_1.append(this);
        v1_1.append(". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers");
        d8.f0.l(new d8.e0(v1_1.toString(), p4), this.d().getContext());
        return;
    }

    public abstract Object i();

    public final void run()
    {
        try {
            boolean v3_1;
            Throwable v0_0 = this.d();
            kotlin.jvm.internal.j.c(v0_0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            Throwable v0_2 = ((i8.f) v0_0);
            boolean v1_1 = v0_2.e;
            Throwable v0_3 = v0_2.m;
            l7.h v2 = v1_1.getContext();
            Throwable v0_1 = i8.a.l(v2, v0_3);
            Object v4_0 = 0;
        } catch (Throwable v0_4) {
            this.h(v0_4);
            return;
        }
        if (v0_1 == i8.a.d) {
            v3_1 = 0;
        } else {
            v3_1 = d8.f0.w(v1_1, v2, v0_1);
        }
        boolean v5_0 = v1_1.getContext();
        Object v6 = this.i();
        Throwable v7 = this.f(v6);
        if (v7 == null) {
            int v8 = this.c;
            int v9 = 1;
            if (v8 != 1) {
                if (v8 != 2) {
                    v9 = 0;
                } else {
                }
            }
            if (v9 != 0) {
                v4_0 = ((d8.e1) v5_0.get(d8.b0.b));
            }
        }
        if ((v4_0 == null) || (v4_0.isActive())) {
            if (v7 == null) {
                v1_1.resumeWith(this.g(v6));
            } else {
                v1_1.resumeWith(c4.b.p(v7));
            }
        } else {
            Object v4_5 = v4_0.getCancellationException();
            this.b(v4_5);
            v1_1.resumeWith(c4.b.p(v4_5));
        }
        if (v3_1) {
            if (!v3_1.R()) {
                return;
            } else {
            }
        }
        i8.a.g(v2, v0_1);
        return;
    }
}
