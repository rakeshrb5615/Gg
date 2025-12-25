package d8;
public class n extends d8.m0 implements d8.l, n7.d, d8.f2 {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater f;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater m;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater n;
    private volatile synthetic int _decisionAndIndex$volatile;
    private volatile synthetic Object _parentHandle$volatile;
    private volatile synthetic Object _state$volatile;
    public final l7.c d;
    public final l7.h e;

    static n()
    {
        d8.n.f = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.n, "_decisionAndIndex$volatile");
        d8.n.m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.n, Object, "_state$volatile");
        d8.n.n = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.n, Object, "_parentHandle$volatile");
        return;
    }

    public n(int p1, l7.c p2)
    {
        super(p1);
        super.d = p2;
        super.e = p2.getContext();
        super._decisionAndIndex$volatile = 536870911;
        super._state$volatile = d8.b.a;
        return;
    }

    public static Object C(d8.u1 p6, Object p7, int p8, u7.q p9)
    {
        if (!(p7 instanceof d8.w)) {
            if ((p8 != 1) && (p8 != 2)) {
                return p7;
            } else {
                if ((p9 != null) || ((p6 instanceof d8.k))) {
                    int v6_1;
                    if (!(p6 instanceof d8.k)) {
                        v6_1 = 0;
                    } else {
                        v6_1 = ((d8.k) p6);
                    }
                    return new d8.v(p7, v6_1, p9, 0, 16);
                } else {
                    return p7;
                }
            }
        } else {
            return p7;
        }
    }

    public static void w(d8.u1 p3, Object p4)
    {
        StringBuilder v1_1 = new StringBuilder("It\'s prohibited to register multiple handlers, tried to register ");
        v1_1.append(p3);
        v1_1.append(", already has ");
        v1_1.append(p4);
        throw new IllegalStateException(v1_1.toString().toString());
    }

    public final void A(Object p5, int p6, u7.q p7)
    {
        do {
            String v0_0 = d8.n.m;
            d8.o v1_0 = v0_0.get(this);
            if (!(v1_0 instanceof d8.u1)) {
                if ((v1_0 instanceof d8.o)) {
                    d8.o v1_1 = ((d8.o) v1_0);
                    if (d8.o.c.compareAndSet(v1_1, 0, 1)) {
                        if (p7 != null) {
                            this.k(p7, v1_1.a, p5);
                        }
                        return;
                    }
                }
                StringBuilder v7_2 = new StringBuilder("Already resumed, but proposed with update ");
                v7_2.append(p5);
                throw new IllegalStateException(v7_2.toString().toString());
            } else {
                int v2_4 = d8.n.C(((d8.u1) v1_0), p5, p6, p7);
                while (!v0_0.compareAndSet(this, v1_0, v2_4)) {
                }
                if (!this.v()) {
                    this.n();
                }
                this.o(p6);
                return;
            }
        } while(v0_0.get(this) == v1_0);
    }

    public final void B(d8.a0 p4)
    {
        h7.l v0_2;
        h7.l v0_0 = this.d;
        if (!(v0_0 instanceof i8.f)) {
            v0_2 = 0;
        } else {
            v0_2 = ((i8.f) v0_0);
        }
        h7.l v0_3;
        if (v0_2 == null) {
            v0_3 = 0;
        } else {
            v0_3 = v0_2.d;
        }
        int v4_1;
        if (v0_3 != p4) {
            v4_1 = this.c;
        } else {
            v4_1 = 4;
        }
        this.A(h7.l.a, v4_1, 0);
        return;
    }

    public final d4.l D(Object p6, u7.q p7)
    {
        do {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v1 = d8.n.m;
            Object v2 = v1.get(this);
            if (!(v2 instanceof d8.u1)) {
                return 0;
            } else {
                Object v3_0 = d8.n.C(((d8.u1) v2), p6, this.c, p7);
                while (!v1.compareAndSet(this, v2, v3_0)) {
                }
                if (!this.v()) {
                    this.n();
                }
                return d8.f0.a;
            }
        } while(v1.get(this) == v2);
    }

    public final void a(i8.r p5, int p6)
    {
        do {
            boolean v0_0 = d8.n.f;
            int v1 = v0_0.get(this);
            if ((v1 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            } else {
            }
        } while(!v0_0.compareAndSet(this, v1, (((v1 >> 29) << 29) + p6)));
        this.u(p5);
        return;
    }

    public final void b(java.util.concurrent.CancellationException p8)
    {
        while(true) {
            u7.q v0_0 = d8.n.m;
            Object v2 = v0_0.get(this);
            if ((v2 instanceof d8.u1)) {
                break;
            }
            if (!(v2 instanceof d8.w)) {
                IllegalStateException v5;
                if (!(v2 instanceof d8.v)) {
                    v5 = p8;
                    Object v1_2 = new d8.v(v2, 0, 0, p8, 14);
                    while (!v0_0.compareAndSet(this, v2, v1_2)) {
                        if (v0_0.get(this) != v2) {
                        }
                    }
                    return;
                } else {
                    Object v1_4 = ((d8.v) v2);
                    if (v1_4.e != null) {
                        throw new IllegalStateException("Must be called at most once");
                    } else {
                        d8.v v3_3 = d8.v.a(v1_4, 0, p8, 15);
                        while (!v0_0.compareAndSet(this, v2, v3_3)) {
                            if (v0_0.get(this) != v2) {
                                v5 = p8;
                            }
                        }
                        u7.q v0_2 = v1_4.b;
                        if (v0_2 != null) {
                            this.j(v0_2, p8);
                        }
                        u7.q v0_3 = v1_4.c;
                        if (v0_3 == null) {
                            return;
                        } else {
                            this.k(v0_3, p8, v1_4.a);
                            return;
                        }
                    }
                }
                p8 = v5;
            }
            return;
        }
        throw new IllegalStateException("Not completed");
    }

    public final d4.l c(Object p1, u7.q p2)
    {
        return this.D(p1, p2);
    }

    public final l7.c d()
    {
        return this.d;
    }

    public final void e(Object p1)
    {
        this.o(this.c);
        return;
    }

    public final Throwable f(Object p1)
    {
        int v1_1 = super.f(p1);
        if (v1_1 == 0) {
            return 0;
        } else {
            return v1_1;
        }
    }

    public final Object g(Object p2)
    {
        if ((p2 instanceof d8.v)) {
            p2 = ((d8.v) p2).a;
        }
        return p2;
    }

    public final n7.d getCallerFrame()
    {
        int v0_0 = this.d;
        if (!(v0_0 instanceof n7.d)) {
            return 0;
        } else {
            return ((n7.d) v0_0);
        }
    }

    public final l7.h getContext()
    {
        return this.e;
    }

    public final Object i()
    {
        return d8.n.m.get(this);
    }

    public final void j(d8.k p3, Throwable p4)
    {
        try {
            p3.a(p4);
            return;
        } catch (l7.h v3_2) {
            String v0_1 = new StringBuilder("Exception in invokeOnCancellation handler for ");
            v0_1.append(this);
            d8.f0.l(new a5.o(v0_1.toString(), v3_2), this.e);
            return;
        }
    }

    public final void k(u7.q p3, Throwable p4, Object p5)
    {
        l7.h v0 = this.e;
        try {
            p3.b(p4, p5, v0);
            return;
        } catch (Throwable v3_1) {
            String v5_3 = new StringBuilder("Exception in resume onCancellation handler for ");
            v5_3.append(this);
            d8.f0.l(new a5.o(v5_3.toString(), v3_1), v0);
            return;
        }
    }

    public final void l(i8.r p4, Throwable p5)
    {
        String v5_0 = this.e;
        a5.o v0_4 = (d8.n.f.get(this) & 536870911);
        if (v0_4 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        } else {
            try {
                p4.h(v0_4, v5_0);
                return;
            } catch (Throwable v4_1) {
                String v1_1 = new StringBuilder("Exception in invokeOnCancellation handler for ");
                v1_1.append(this);
                d8.f0.l(new a5.o(v1_1.toString(), v4_1), v5_0);
                return;
            }
        }
    }

    public final boolean m(Throwable p7)
    {
        do {
            boolean v0_0 = d8.n.m;
            i8.r v1_0 = v0_0.get(this);
            Object v3_0 = 0;
            if ((v1_0 instanceof d8.u1)) {
                if (((v1_0 instanceof d8.k)) || ((v1_0 instanceof i8.r))) {
                    v3_0 = 1;
                }
                boolean v2_0 = new d8.o(this, p7, v3_0);
                while (!v0_0.compareAndSet(this, v1_0, v2_0)) {
                }
                boolean v0_2 = ((d8.u1) v1_0);
                if (!(v0_2 instanceof d8.k)) {
                    if ((v0_2 instanceof i8.r)) {
                        this.l(((i8.r) v1_0), p7);
                    }
                } else {
                    this.j(((d8.k) v1_0), p7);
                }
                if (!this.v()) {
                    this.n();
                }
                this.o(this.c);
                return 1;
            } else {
                return 0;
            }
        } while(v0_0.get(this) == v1_0);
    }

    public final void n()
    {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0 = d8.n.n;
        d8.t1 v1_1 = ((d8.p0) v0.get(this));
        if (v1_1 != null) {
            v1_1.a();
            v0.set(this, d8.t1.a);
            return;
        } else {
            return;
        }
    }

    public final void o(int p7)
    {
        do {
            i7.g v0_0 = d8.n.f;
            Throwable v1_1 = v0_0.get(this);
            boolean v2_1 = (v1_1 >> 29);
            if (!v2_1) {
            } else {
                if (v2_1 != 1) {
                    throw new IllegalStateException("Already resumed");
                } else {
                    Throwable v1_2;
                    boolean v2_0 = 0;
                    if (p7 != 4) {
                        v1_2 = 0;
                    } else {
                        v1_2 = 1;
                    }
                    l7.c v3_0 = this.d;
                    if ((v1_2 == null) && ((v3_0 instanceof i8.f))) {
                        if ((p7 != 1) && (p7 != 2)) {
                            d8.x0 v7_3 = 0;
                        } else {
                            v7_3 = 1;
                        }
                        int v5 = this.c;
                        if ((v5 == 1) || (v5 == 2)) {
                            v2_0 = 1;
                        }
                        if (v7_3 == v2_0) {
                            d8.x0 v7_5 = ((i8.f) v3_0);
                            Throwable v1_3 = v7_5.d;
                            d8.x0 v7_7 = v7_5.e.getContext();
                            if (!v1_3.s(v7_7)) {
                                d8.x0 v7_8 = d8.z1.a();
                                if (v7_8.c < 4294967296) {
                                    v7_8.A(1);
                                    try {
                                        d8.f0.s(this, v3_0, 1);
                                    } catch (Throwable v1_6) {
                                        try {
                                            this.h(v1_6);
                                        } catch (Throwable v1_7) {
                                            v7_8.y(1);
                                            throw v1_7;
                                        }
                                        v7_8.y(1);
                                        return;
                                    }
                                    while (v7_8.C()) {
                                    }
                                } else {
                                    i7.g v0_4 = v7_8.e;
                                    if (v0_4 == null) {
                                        v0_4 = new i7.g();
                                        v7_8.e = v0_4;
                                    }
                                    v0_4.addLast(this);
                                    return;
                                }
                            } else {
                                v1_3.i(v7_7, this);
                                return;
                            }
                        }
                    }
                    d8.f0.s(this, v3_0, v1_2);
                    return;
                }
            }
            return;
        } while(!v0_0.compareAndSet(this, v1_1, (1073741824 + (536870911 & v1_1))));
    }

    public Throwable p(d8.r1 p1)
    {
        return p1.getCancellationException();
    }

    public final Object q()
    {
        java.util.concurrent.CancellationException v0_0 = this.v();
        do {
            d8.e1 v1_4 = d8.n.f;
            boolean v2_1 = v1_4.get(this);
            int v3_1 = (v2_1 >> 29);
            if (v3_1 == 0) {
            } else {
                if (v3_1 != 2) {
                    throw new IllegalStateException("Already suspended");
                } else {
                    if (v0_0 != null) {
                        this.y();
                    }
                    java.util.concurrent.CancellationException v0_5 = d8.n.m.get(this);
                    if ((v0_5 instanceof d8.w)) {
                        throw ((d8.w) v0_5).a;
                    } else {
                        boolean v2_2 = this.c;
                        if ((v2_2 == 1) || (v2_2 == 2)) {
                            d8.e1 v1_9 = ((d8.e1) this.e.get(d8.b0.b));
                            if ((v1_9 != null) && (!v1_9.isActive())) {
                                java.util.concurrent.CancellationException v0_8 = v1_9.getCancellationException();
                                this.b(v0_8);
                                throw v0_8;
                            }
                        }
                        return this.g(v0_5);
                    }
                }
            }
        } while(!v1_4.compareAndSet(this, v2_1, (536870912 + (536870911 & v2_1))));
        if (((d8.p0) d8.n.n.get(this)) == null) {
            this.s();
        }
        if (v0_0 != null) {
            this.y();
        }
        return m7.a.a;
    }

    public final void r()
    {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0_0 = this.s();
        if ((v0_0 != null) && (!(d8.n.m.get(this) instanceof d8.u1))) {
            v0_0.a();
            d8.n.n.set(this, d8.t1.a);
        }
        return;
    }

    public final void resumeWith(Object p3)
    {
        int v0_0 = h7.h.a(p3);
        if (v0_0 != 0) {
            p3 = new d8.w(0, v0_0);
        }
        this.A(p3, this.c, 0);
        return;
    }

    public final d8.p0 s()
    {
        d8.p0 v0_3 = ((d8.e1) this.e.get(d8.b0.b));
        if (v0_3 != null) {
            d8.p0 v0_1 = d8.f0.m(v0_3, 1, new d8.p(this, 0));
            do {
                Object v2_0 = d8.n.n;
            } while((!v2_0.compareAndSet(this, 0, v0_1)) && (v2_0.get(this) == null));
            return v0_1;
        } else {
            return 0;
        }
    }

    public final void t(u7.l p3)
    {
        this.u(new d8.j(p3, 1));
        return;
    }

    public final String toString()
    {
        String v1_4;
        String v0_1 = new StringBuilder();
        v0_1.append(this.x());
        v0_1.append(40);
        v0_1.append(d8.f0.u(this.d));
        v0_1.append("){");
        String v1_2 = d8.n.m.get(this);
        if (!(v1_2 instanceof d8.u1)) {
            if (!(v1_2 instanceof d8.o)) {
                v1_4 = "Completed";
            } else {
                v1_4 = "Cancelled";
            }
        } else {
            v1_4 = "Active";
        }
        v0_1.append(v1_4);
        v0_1.append("}@");
        v0_1.append(d8.f0.j(this));
        return v0_1.toString();
    }

    public final void u(d8.u1 p8)
    {
        do {
            Throwable v0_0 = d8.n.m;
            Object v2 = v0_0.get(this);
            if (!(v2 instanceof d8.b)) {
                if (((v2 instanceof d8.k)) || ((v2 instanceof i8.r))) {
                    d8.n.w(p8, v2);
                    throw 0;
                } else {
                    if (!(v2 instanceof d8.w)) {
                        if (!(v2 instanceof d8.v)) {
                            if (!(p8 instanceof i8.r)) {
                                d8.v v1_4 = new d8.v(v2, ((d8.k) p8), 0, 0, 28);
                                while (!v0_0.compareAndSet(this, v2, v1_4)) {
                                    if (v0_0.get(this) != v2) {
                                    }
                                }
                            }
                        } else {
                            d8.v v1_7 = ((d8.v) v2);
                            if (v1_7.b != null) {
                                d8.n.w(p8, v2);
                                throw 0;
                            } else {
                                if (!(p8 instanceof i8.r)) {
                                    int v5_1 = v1_7.e;
                                    if (v5_1 == 0) {
                                        d8.v v1_8 = d8.v.a(v1_7, ((d8.k) p8), 0, 29);
                                        while (!v0_0.compareAndSet(this, v2, v1_8)) {
                                            if (v0_0.get(this) != v2) {
                                            }
                                        }
                                    } else {
                                        this.j(((d8.k) p8), v5_1);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        Throwable v0_2 = ((d8.w) v2);
                        if (!d8.w.b.compareAndSet(v0_2, 0, 1)) {
                            d8.n.w(p8, v2);
                            throw 0;
                        } else {
                            if ((v2 instanceof d8.o)) {
                                Throwable v0_3 = v0_2.a;
                                if (!(p8 instanceof d8.k)) {
                                    this.l(((i8.r) p8), v0_3);
                                    return;
                                } else {
                                    this.j(((d8.k) p8), v0_3);
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
            }
            return;
        } while(!v0_0.compareAndSet(this, v2, p8));
        if (v0_0.get(this) != v2) {
        } else {
            while (!v0_0.compareAndSet(this, v2, p8)) {
            }
        }
        return;
    }

    public final boolean v()
    {
        if (this.c == 2) {
            i8.f v1_1 = this.d;
            kotlin.jvm.internal.j.c(v1_1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (i8.f.n.get(((i8.f) v1_1)) != null) {
                return 1;
            }
        }
        return 0;
    }

    public String x()
    {
        return "CancellableContinuation";
    }

    public final void y()
    {
        IllegalArgumentException v0_5;
        IllegalArgumentException v0_0 = this.d;
        Throwable v2_1 = 0;
        if (!(v0_0 instanceof i8.f)) {
            v0_5 = 0;
        } else {
            v0_5 = ((i8.f) v0_0);
        }
        if (v0_5 != null) {
            String v1_6 = i8.f.n;
            do {
                Object v3_2 = v1_6.get(v0_5);
                Object v4_0 = i8.a.c;
                if (v3_2 != v4_0) {
                    if (!(v3_2 instanceof Throwable)) {
                        String v1_2 = new StringBuilder("Inconsistent state ");
                        v1_2.append(v3_2);
                        throw new IllegalStateException(v1_2.toString().toString());
                    }
                    while (!v1_6.compareAndSet(v0_5, v3_2, 0)) {
                        if (v1_6.get(v0_5) != v3_2) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    v2_1 = ((Throwable) v3_2);
                } else {
                }
                if (v2_1 != null) {
                    this.n();
                    this.m(v2_1);
                    return;
                }
            } while(!v1_6.compareAndSet(v0_5, v4_0, this));
            if (v1_6.get(v0_5) != v4_0) {
            } else {
                while (!v1_6.compareAndSet(v0_5, v4_0, this)) {
                }
            }
        }
        return;
    }

    public final void z(Object p2, u7.q p3)
    {
        this.A(p2, this.c, p3);
        return;
    }
}
