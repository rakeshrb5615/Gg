package d8;
public class r1 implements d8.e1, d8.s, d8.v1 {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater a;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater b;
    private volatile synthetic Object _parentHandle$volatile;
    private volatile synthetic Object _state$volatile;

    static r1()
    {
        d8.r1.a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.r1, Object, "_state$volatile");
        d8.r1.b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.r1, Object, "_parentHandle$volatile");
        return;
    }

    public r1(boolean p1)
    {
        d8.r0 v1_1;
        if (p1 == null) {
            v1_1 = d8.f0.i;
        } else {
            v1_1 = d8.f0.j;
        }
        this._state$volatile = v1_1;
        return;
    }

    public static d8.r D(i8.j p2)
    {
        while (p2.h()) {
            boolean v0_2 = i8.j.b;
            boolean v1_0 = p2.e();
            if (v1_0) {
                p2 = v1_0;
            } else {
                p2 = ((i8.j) v0_2.get(p2));
                while (p2.h()) {
                    p2 = ((i8.j) v0_2.get(p2));
                }
            }
        }
        do {
            p2 = p2.g();
            if (!p2.h()) {
                if (!(p2 instanceof d8.r)) {
                } else {
                    return ((d8.r) p2);
                }
            }
        } while(!(p2 instanceof d8.s1));
        return 0;
    }

    public static String K(Object p2)
    {
        if (!(p2 instanceof d8.l1)) {
            if (!(p2 instanceof d8.b1)) {
                if (!(p2 instanceof d8.w)) {
                    return "Completed";
                } else {
                    return "Cancelled";
                }
            } else {
                if (!((d8.b1) p2).isActive()) {
                    return "New";
                } else {
                    return "Active";
                }
            }
        } else {
            if (!((d8.l1) p2).d()) {
                if (d8.l1.b.get(((d8.l1) p2)) == 0) {
                    return "Active";
                } else {
                    return "Completing";
                }
            } else {
                return "Cancelling";
            }
        }
    }

    public static java.util.concurrent.CancellationException L(d8.r1 p2, Throwable p3)
    {
        d8.f1 v0_1;
        if (!(p3 instanceof java.util.concurrent.CancellationException)) {
            v0_1 = 0;
        } else {
            v0_1 = ((java.util.concurrent.CancellationException) p3);
        }
        if (v0_1 == null) {
            v0_1 = new d8.f1(p2.l(), p3, p2);
        }
        return v0_1;
    }

    public final boolean A(Object p4)
    {
        do {
            Object v0_2 = this.M(d8.r1.a.get(this), p4);
            if (v0_2 != d8.f0.d) {
                if (v0_2 != d8.f0.e) {
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } while(v0_2 == d8.f0.f);
        this.f(v0_2);
        return 1;
    }

    public final Object B(Object p5)
    {
        do {
            IllegalStateException v0_3 = this.M(d8.r1.a.get(this), p5);
            if (v0_3 == d8.f0.d) {
                int v5_1;
                String v1_0 = new StringBuilder("Job ");
                v1_0.append(this);
                v1_0.append(" is already complete or completing, but is being completed with ");
                v1_0.append(p5);
                String v1_1 = v1_0.toString();
                Throwable v3 = 0;
                if (!(p5 instanceof d8.w)) {
                    v5_1 = 0;
                } else {
                    v5_1 = ((d8.w) p5);
                }
                if (v5_1 != 0) {
                    v3 = v5_1.a;
                }
                throw new IllegalStateException(v1_1, v3);
            } else {
            }
        } while(v0_3 == d8.f0.f);
        return v0_3;
    }

    public String C()
    {
        return this.getClass().getSimpleName();
    }

    public final void E(d8.s1 p6, Throwable p7)
    {
        p6.d(new i8.h(4), 4);
        i8.j v0_4 = i8.j.a.get(p6);
        kotlin.jvm.internal.j.c(v0_4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        i8.j v0_3 = ((i8.j) v0_4);
        a5.o v1_1 = 0;
        while (!v0_3.equals(p6)) {
            if (((v0_3 instanceof d8.i1)) && (((d8.i1) v0_3).j())) {
                try {
                    ((d8.i1) v0_3).k(p7);
                } catch (Throwable v2_7) {
                    if (v1_1 == null) {
                        String v3_1 = new StringBuilder("Exception in completion handler ");
                        v3_1.append(v0_3);
                        v3_1.append(" for ");
                        v3_1.append(this);
                        v1_1 = new a5.o(v3_1.toString(), v2_7);
                    } else {
                        q4.b.a(v1_1, v2_7);
                    }
                }
            }
            v0_3 = v0_3.g();
        }
        if (v1_1 != null) {
            this.w(v1_1);
        }
        this.k(p7);
        return;
    }

    public void F(Object p1)
    {
        return;
    }

    public void G()
    {
        return;
    }

    public final void H(d8.r0 p4)
    {
        d8.a1 v0_1 = new d8.s1();
        if (!p4.a) {
            v0_1 = new d8.a1(v0_1);
        }
        do {
            Object v1_4 = d8.r1.a;
        } while((!v1_4.compareAndSet(this, p4, v0_1)) && (v1_4.get(this) == p4));
        return;
    }

    public final void I(d8.i1 p4)
    {
        Object v0_1 = new d8.s1();
        p4.getClass();
        i8.j.b.set(v0_1, p4);
        boolean v1_2 = i8.j.a;
        v1_2.set(v0_1, p4);
        while (v1_2.get(p4) == p4) {
            while (!v1_2.compareAndSet(p4, p4, v0_1)) {
                if (v1_2.get(p4) != p4) {
                }
                Object v2_2 = p4.g();
                do {
                    Object v0_2 = d8.r1.a;
                    if (!v0_2.compareAndSet(this, p4, v2_2)) {
                    } else {
                        return;
                    }
                } while(v0_2.get(this) == p4);
                return;
            }
            v0_1.f(p4);
            break;
        }
    }

    public final int J(Object p5)
    {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v2 = d8.r1.a;
        if (!(p5 instanceof d8.r0)) {
            if (!(p5 instanceof d8.a1)) {
                return 0;
            }
            while (!v2.compareAndSet(this, p5, ((d8.a1) p5).a)) {
                if (v2.get(this) != p5) {
                    return -1;
                }
            }
            return 1;
        } else {
            if (((d8.r0) p5).a) {
                return 0;
            }
            while (!v2.compareAndSet(this, p5, d8.f0.j)) {
                if (v2.get(this) != p5) {
                    return -1;
                }
            }
            return 1;
        }
        return 0;
    }

    public final Object M(Object p7, Object p8)
    {
        if ((p7 instanceof d8.b1)) {
            if (((!(p7 instanceof d8.r0)) && (!(p7 instanceof d8.i1))) || (((p7 instanceof d8.r)) || ((p8 instanceof d8.w)))) {
                d8.b1 v0_1 = this.u(((d8.b1) p7));
                if (v0_1 != null) {
                    d8.l1 v1_1;
                    int v2_0 = 0;
                    if (!(((d8.b1) p7) instanceof d8.l1)) {
                        v1_1 = 0;
                    } else {
                        v1_1 = ((d8.l1) ((d8.b1) p7));
                    }
                    if (v1_1 == null) {
                        v1_1 = new d8.l1(v0_1, 0);
                    }
                    try {
                        Object v4_1;
                        Throwable v3_0 = d8.l1.b;
                    } catch (d4.l v7_7) {
                        throw v7_7;
                    }
                    if (v3_0.get(v1_1) == 0) {
                        v4_1 = 0;
                    } else {
                        v4_1 = 1;
                    }
                    if (v4_1 == null) {
                        v3_0.set(v1_1, 1);
                        if (v1_1 != ((d8.b1) p7)) {
                            Throwable v3_1 = d8.r1.a;
                            while (!v3_1.compareAndSet(this, ((d8.b1) p7), v1_1)) {
                                if (v3_1.get(this) != ((d8.b1) p7)) {
                                    return d8.f0.f;
                                }
                            }
                        }
                        Throwable v3_3;
                        d4.l v7_6 = v1_1.d();
                        if (!(p8 instanceof d8.w)) {
                            v3_3 = 0;
                        } else {
                            v3_3 = ((d8.w) p8);
                        }
                        if (v3_3 != null) {
                            v1_1.a(v3_3.a);
                        }
                        Throwable v3_6 = v1_1.b();
                        if (v7_6 == null) {
                            v2_0 = v3_6;
                        }
                        if (v2_0 != 0) {
                            this.E(v0_1, v2_0);
                        }
                        d4.l v7_8 = d8.r1.D(v0_1);
                        if ((v7_8 == null) || (!this.N(v1_1, v7_8, p8))) {
                            v0_1.d(new i8.h(2), 2);
                            d4.l v7_12 = d8.r1.D(v0_1);
                            if ((v7_12 == null) || (!this.N(v1_1, v7_12, p8))) {
                                return this.p(v1_1, p8);
                            } else {
                                return d8.f0.e;
                            }
                        } else {
                            return d8.f0.e;
                        }
                    } else {
                        return d8.f0.d;
                    }
                } else {
                    return d8.f0.f;
                }
            } else {
                int v2_2;
                d8.l1 v1_4 = d8.r1.a;
                if (!(p8 instanceof d8.b1)) {
                    v2_2 = p8;
                } else {
                    v2_2 = new d8.c1(((d8.b1) p8));
                }
                while (!v1_4.compareAndSet(this, ((d8.b1) p7), v2_2)) {
                    if (v1_4.get(this) != ((d8.b1) p7)) {
                        return d8.f0.f;
                    }
                }
                this.F(p8);
                this.n(((d8.b1) p7), p8);
                return p8;
            }
        } else {
            return d8.f0.d;
        }
    }

    public final boolean N(d8.l1 p4, d8.r p5, Object p6)
    {
        while (d8.f0.m(p5.e, 0, new d8.k1(this, p4, p5, p6)) == d8.t1.a) {
            p5 = d8.r1.D(p5);
            if (p5 == null) {
                return 0;
            }
        }
        return 1;
    }

    public final d8.q attachChild(d8.s p6)
    {
        d8.r v0_1 = new d8.r(p6);
        v0_1.d = this;
        do {
            Throwable v6_3 = d8.r1.a;
            boolean v1_5 = v6_3.get(this);
            if (!(v1_5 instanceof d8.r0)) {
                d8.t1 v3_1 = d8.t1.a;
                Throwable v4 = 0;
                if (!(v1_5 instanceof d8.b1)) {
                    Throwable v6_2;
                    Throwable v6_1 = v6_3.get(this);
                    if (!(v6_1 instanceof d8.w)) {
                        v6_2 = 0;
                    } else {
                        v6_2 = ((d8.w) v6_1);
                    }
                    if (v6_2 != null) {
                        v4 = v6_2.a;
                    }
                    v0_1.k(v4);
                    return v3_1;
                } else {
                    boolean v2_2 = ((d8.b1) v1_5).c();
                    if (v2_2) {
                        if (!v2_2.d(v0_1, 7)) {
                            boolean v1_4 = v2_2.d(v0_1, 3);
                            Throwable v6_4 = v6_3.get(this);
                            if (!(v6_4 instanceof d8.l1)) {
                                Throwable v6_5;
                                if (!(v6_4 instanceof d8.w)) {
                                    v6_5 = 0;
                                } else {
                                    v6_5 = ((d8.w) v6_4);
                                }
                                if (v6_5 != null) {
                                    v4 = v6_5.a;
                                }
                            } else {
                                v4 = ((d8.l1) v6_4).b();
                            }
                            v0_1.k(v4);
                            if (!v1_4) {
                                return v3_1;
                            }
                        }
                    } else {
                        this.I(((d8.i1) v1_5));
                        break;
                    }
                }
            } else {
                boolean v2_6 = ((d8.r0) v1_5);
                if (!v2_6.a) {
                    this.H(v2_6);
                    break;
                }
                while (!v6_3.compareAndSet(this, v1_5, v0_1)) {
                }
            }
            return v0_1;
        } while(v6_3.get(this) == v1_5);
    }

    public void cancel(java.util.concurrent.CancellationException p3)
    {
        if (p3 == null) {
            p3 = new d8.f1(this.l(), 0, this);
        }
        this.j(p3);
        return;
    }

    public void f(Object p1)
    {
        return;
    }

    public final Object fold(Object p1, u7.p p2)
    {
        return p2.invoke(p1, this);
    }

    public void g(Object p1)
    {
        this.f(p1);
        return;
    }

    public final l7.f get(l7.g p1)
    {
        return q4.b.r(this, p1);
    }

    public final java.util.concurrent.CancellationException getCancellationException()
    {
        d8.f1 v0_2 = d8.r1.a.get(this);
        java.util.concurrent.CancellationException v3_0 = 0;
        if (!(v0_2 instanceof d8.l1)) {
            if ((v0_2 instanceof d8.b1)) {
                String v1_1 = new StringBuilder("Job is still new or active: ");
                v1_1.append(this);
                throw new IllegalStateException(v1_1.toString().toString());
            } else {
                if (!(v0_2 instanceof d8.w)) {
                    return new d8.f1(this.getClass().getSimpleName().concat(" has completed normally"), 0, this);
                } else {
                    return d8.r1.L(this, ((d8.w) v0_2).a);
                }
            }
        } else {
            d8.f1 v0_9 = ((d8.l1) v0_2).b();
            if (v0_9 == null) {
                String v1_10 = new StringBuilder("Job is still new or active: ");
                v1_10.append(this);
                throw new IllegalStateException(v1_10.toString().toString());
            } else {
                String v1_15 = this.getClass().getSimpleName().concat(" is cancelling");
                if ((v0_9 instanceof java.util.concurrent.CancellationException)) {
                    v3_0 = ((java.util.concurrent.CancellationException) v0_9);
                }
                if (v3_0 != null) {
                    return v3_0;
                } else {
                    if (v1_15 == null) {
                        v1_15 = this.l();
                    }
                    return new d8.f1(v1_15, v0_9, this);
                }
            }
        }
    }

    public final a8.f getChildren()
    {
        return new a8.i(new d8.n1(this, 0));
    }

    public Object getCompleted()
    {
        return this.q();
    }

    public final Throwable getCompletionExceptionOrNull()
    {
        Throwable v0_3 = d8.r1.a.get(this);
        if ((v0_3 instanceof d8.b1)) {
            throw new IllegalStateException("This job has not completed yet");
        } else {
            Throwable v0_1;
            if (!(v0_3 instanceof d8.w)) {
                v0_1 = 0;
            } else {
                v0_1 = ((d8.w) v0_3);
            }
            if (v0_1 == null) {
                return 0;
            } else {
                return v0_1.a;
            }
        }
    }

    public final l7.g getKey()
    {
        return d8.b0.b;
    }

    public final Object h(l7.c p4)
    {
        do {
            m7.a v0_2 = d8.r1.a.get(this);
            if ((v0_2 instanceof d8.b1)) {
            } else {
                if ((v0_2 instanceof d8.w)) {
                    throw ((d8.w) v0_2).a;
                } else {
                    return d8.f0.v(v0_2);
                }
            }
        } while(this.J(v0_2) < 0);
        m7.a v0_1 = new d8.j1(this, q4.b.C(p4));
        v0_1.r();
        v0_1.u(new d8.j(d8.f0.m(this, 1, new d8.q0(v0_1, 3)), 2));
        return v0_1.q();
    }

    public final boolean i(Object p10)
    {
        Throwable v0_0 = d8.f0.d;
        if (!this.t()) {
            if (v0_0 == d8.f0.d) {
                Throwable v0_1 = 0;
                Throwable v1_10 = 0;
                while(true) {
                    d4.l v10_8;
                    boolean v4_2 = d8.r1.a;
                    d8.l1 v5_1 = v4_2.get(this);
                    if ((v5_1 instanceof d8.l1)) {
                        break;
                    }
                    if (!(v5_1 instanceof d8.b1)) {
                        v10_8 = d8.f0.g;
                    } else {
                        if (v1_10 == null) {
                            v1_10 = this.o(p10);
                        }
                        d4.l v6_3 = ((d8.b1) v5_1);
                        if (!v6_3.isActive()) {
                            boolean v4_5 = this.M(v5_1, new d8.w(0, v1_10));
                            if (v4_5 == d8.f0.d) {
                                Throwable v0_3 = new StringBuilder("Cannot happen in ");
                                v0_3.append(v5_1);
                                throw new IllegalStateException(v0_3.toString().toString());
                            } else {
                                if (v4_5 != d8.f0.f) {
                                    v0_0 = v4_5;
                                    if ((v0_0 != d8.f0.d) && (v0_0 != d8.f0.e)) {
                                        if (v0_0 != d8.f0.g) {
                                            this.f(v0_0);
                                            return 1;
                                        } else {
                                            return 0;
                                        }
                                    }
                                    return 1;
                                }
                            }
                        } else {
                            d8.s1 v7_1 = this.u(v6_3);
                            if (v7_1 != null) {
                                d8.l1 v8_1 = new d8.l1(v7_1, v1_10);
                                while (!v4_2.compareAndSet(this, v6_3, v8_1)) {
                                    if (v4_2.get(this) != v6_3) {
                                    }
                                }
                                this.E(v7_1, v1_10);
                                v10_8 = d8.f0.d;
                            }
                        }
                    }
                    v0_0 = v10_8;
                }
                try {
                    boolean v4_9;
                    if (d8.l1.d.get(((d8.l1) v5_1)) != d8.f0.h) {
                        v4_9 = 0;
                    } else {
                        v4_9 = 1;
                    }
                } catch (d4.l v10_1) {
                    throw v10_1;
                }
                if (!v4_9) {
                    boolean v4_12 = ((d8.l1) v5_1).d();
                    if (v1_10 == null) {
                        v1_10 = this.o(p10);
                    }
                    ((d8.l1) v5_1).a(v1_10);
                    d4.l v10_6 = ((d8.l1) v5_1).b();
                    if (!v4_12) {
                        v0_1 = v10_6;
                    }
                    if (v0_1 != null) {
                        this.E(((d8.l1) v5_1).a, v0_1);
                    }
                    v10_8 = d8.f0.d;
                } else {
                    v10_8 = d8.f0.g;
                }
            }
        } else {
            do {
                Throwable v0_7 = d8.r1.a.get(this);
                if (((v0_7 instanceof d8.b1)) && ((!(v0_7 instanceof d8.l1)) || (d8.l1.b.get(((d8.l1) v0_7)) == 0))) {
                    v0_0 = this.M(v0_7, new d8.w(0, this.o(p10)));
                } else {
                    v0_0 = d8.f0.d;
                    break;
                }
            } while(v0_0 == d8.f0.f);
            if (v0_0 != d8.f0.e) {
            }
        }
        return 1;
    }

    public final d8.p0 invokeOnCompletion(u7.l p3)
    {
        return this.y(1, new d8.q0(p3, 1));
    }

    public final d8.p0 invokeOnCompletion(boolean p2, boolean p3, u7.l p4)
    {
        d8.p0 v2_2;
        if (p2 == null) {
            v2_2 = new d8.q0(p4, 1);
        } else {
            v2_2 = new d8.d1(p4);
        }
        return this.y(p3, v2_2);
    }

    public boolean isActive()
    {
        int v0_2 = d8.r1.a.get(this);
        if ((!(v0_2 instanceof d8.b1)) || (!((d8.b1) v0_2).isActive())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isCancelled()
    {
        int v0_3 = d8.r1.a.get(this);
        if ((!(v0_3 instanceof d8.w)) && ((!(v0_3 instanceof d8.l1)) || (!((d8.l1) v0_3).d()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isCompleted()
    {
        return ((d8.r1.a.get(this) instanceof d8.b1) ^ 1);
    }

    public void j(java.util.concurrent.CancellationException p1)
    {
        this.i(p1);
        return;
    }

    public final Object join(l7.c p5)
    {
        do {
            m7.a v0_2 = d8.r1.a.get(this);
            h7.l v2 = h7.l.a;
            if ((v0_2 instanceof d8.b1)) {
            } else {
                d8.f0.g(p5.getContext());
                return v2;
            }
        } while(this.J(v0_2) < 0);
        m7.a v0_1 = new d8.n(1, q4.b.C(p5));
        v0_1.r();
        v0_1.u(new d8.j(d8.f0.m(this, 1, new d8.p(v0_1, 1)), 2));
        h7.l v5_5 = v0_1.q();
        m7.a v0_3 = m7.a.a;
        if (v5_5 != v0_3) {
            v5_5 = v2;
        }
        if (v5_5 != v0_3) {
            return v2;
        } else {
            return v5_5;
        }
    }

    public final boolean k(Throwable p4)
    {
        if (!this.z()) {
            boolean v0_1 = (p4 instanceof java.util.concurrent.CancellationException);
            d8.q v1_2 = ((d8.q) d8.r1.b.get(this));
            if ((v1_2 != null) && (v1_2 != d8.t1.a)) {
                if ((!v1_2.b(p4)) && (!v0_1)) {
                    return 0;
                }
            } else {
                return v0_1;
            }
        }
        return 1;
    }

    public String l()
    {
        return "Job was cancelled";
    }

    public boolean m(Throwable p2)
    {
        if ((!(p2 instanceof java.util.concurrent.CancellationException)) && ((!this.i(p2)) || (!this.s()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final l7.h minusKey(l7.g p1)
    {
        return q4.b.G(this, p1);
    }

    public final void n(d8.b1 p7, Object p8)
    {
        i8.j v0_0 = d8.r1.b;
        a5.o v1_1 = ((d8.q) v0_0.get(this));
        if (v1_1 != null) {
            v1_1.a();
            v0_0.set(this, d8.t1.a);
        }
        Throwable v8_1;
        a5.o v1_3 = 0;
        if (!(p8 instanceof d8.w)) {
            v8_1 = 0;
        } else {
            v8_1 = ((d8.w) p8);
        }
        Throwable v8_2;
        if (v8_1 == null) {
            v8_2 = 0;
        } else {
            v8_2 = v8_1.a;
        }
        if (!(p7 instanceof d8.i1)) {
            String v7_1 = p7.c();
            if (v7_1 != null) {
                v7_1.d(new i8.h(1), 1);
                i8.j v0_5 = i8.j.a.get(v7_1);
                kotlin.jvm.internal.j.c(v0_5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                i8.j v0_6 = ((i8.j) v0_5);
                while (!v0_6.equals(v7_1)) {
                    if ((v0_6 instanceof d8.i1)) {
                        try {
                            ((d8.i1) v0_6).k(v8_2);
                        } catch (Throwable v4_6) {
                            if (v1_3 == null) {
                                String v5_1 = new StringBuilder("Exception in completion handler ");
                                v5_1.append(v0_6);
                                v5_1.append(" for ");
                                v5_1.append(this);
                                v1_3 = new a5.o(v5_1.toString(), v4_6);
                            } else {
                                q4.b.a(v1_3, v4_6);
                            }
                        }
                    }
                    v0_6 = v0_6.g();
                }
                if (v1_3 != null) {
                    this.w(v1_3);
                }
            }
        } else {
            try {
                ((d8.i1) p7).k(v8_2);
                return;
            } catch (Throwable v8_3) {
                a5.o v1_6 = new StringBuilder("Exception in completion handler ");
                v1_6.append(p7);
                v1_6.append(" for ");
                v1_6.append(this);
                this.w(new a5.o(v1_6.toString(), v8_3));
            }
        }
        return;
    }

    public final Throwable o(Object p5)
    {
        if (!(p5 instanceof Throwable)) {
            StringBuilder v1_4;
            String v0_6 = d8.r1.a.get(((d8.r1) ((d8.v1) p5)));
            d8.f1 v2_2 = 0;
            if (!(v0_6 instanceof d8.l1)) {
                if (!(v0_6 instanceof d8.w)) {
                    if ((v0_6 instanceof d8.b1)) {
                        StringBuilder v1_3 = new StringBuilder("Cannot be cancelling child in this state: ");
                        v1_3.append(v0_6);
                        throw new IllegalStateException(v1_3.toString().toString());
                    } else {
                        v1_4 = 0;
                    }
                } else {
                    v1_4 = ((d8.w) v0_6).a;
                }
            } else {
                v1_4 = ((d8.l1) v0_6).b();
            }
            if ((v1_4 instanceof java.util.concurrent.CancellationException)) {
                v2_2 = ((java.util.concurrent.CancellationException) v1_4);
            }
            if (v2_2 == null) {
                v2_2 = new d8.f1("Parent job is ".concat(d8.r1.K(v0_6)), v1_4, ((d8.r1) ((d8.v1) p5)));
            }
            return v2_2;
        } else {
            return ((Throwable) p5);
        }
    }

    public final Object p(d8.l1 p11, Object p12)
    {
        d8.w v0_2;
        d8.w v1_0 = 0;
        if (!(p12 instanceof d8.w)) {
            v0_2 = 0;
        } else {
            v0_2 = ((d8.w) p12);
        }
        if (v0_2 != null) {
            v1_0 = v0_2.a;
        }
        try {
            p11.d();
            d8.w v0_1 = p11.e(v1_0);
            Object v2_0 = this.r(p11, v0_1);
        } catch (d8.w v12_1) {
            throw v12_1;
        }
        if (v2_0 != null) {
            if (v0_1.size() > 1) {
                java.util.Set v5_2 = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(v0_1.size()));
                int v6_2 = v0_1.size();
                int v7 = 0;
                while (v7 < v6_2) {
                    Throwable v8_0 = v0_1.get(v7);
                    v7++;
                    Throwable v8_1 = ((Throwable) v8_0);
                    if ((v8_1 != v2_0) && ((v8_1 != v2_0) && ((!(v8_1 instanceof java.util.concurrent.CancellationException)) && (v5_2.add(v8_1))))) {
                        q4.b.a(v2_0, v8_1);
                    }
                }
            } else {
            }
        }
        if ((v2_0 != null) && (v2_0 != v1_0)) {
            p12 = new d8.w(0, v2_0);
        }
        if ((v2_0 != null) && ((this.k(v2_0)) || (this.v(v2_0)))) {
            kotlin.jvm.internal.j.c(p12, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            d8.w.b.compareAndSet(((d8.w) p12), 0, 1);
        }
        d8.w v1_3;
        this.F(p12);
        d8.w v0_9 = d8.r1.a;
        if (!(p12 instanceof d8.b1)) {
            v1_3 = p12;
        } else {
            v1_3 = new d8.c1(((d8.b1) p12));
        }
        while (!v0_9.compareAndSet(this, p11, v1_3)) {
            if (v0_9.get(this) != p11) {
                break;
            }
        }
        this.n(p11, p12);
        return p12;
    }

    public final l7.h plus(l7.h p1)
    {
        return q4.b.L(this, p1);
    }

    public final Object q()
    {
        Throwable v0_4 = d8.r1.a.get(this);
        if ((v0_4 instanceof d8.b1)) {
            throw new IllegalStateException("This job has not completed yet");
        } else {
            if ((v0_4 instanceof d8.w)) {
                throw ((d8.w) v0_4).a;
            } else {
                return d8.f0.v(v0_4);
            }
        }
    }

    public final Throwable r(d8.l1 p6, java.util.ArrayList p7)
    {
        Object v1_0 = 0;
        if (!p7.isEmpty()) {
            Throwable v6_6 = p7.size();
            int v0_1 = 0;
            int v2_0 = 0;
            while (v2_0 < v6_6) {
                Object v3_0 = p7.get(v2_0);
                v2_0++;
                if (!(((Throwable) v3_0) instanceof java.util.concurrent.CancellationException)) {
                }
                Object v3_1 = ((Throwable) v3_0);
                if (v3_1 == null) {
                    Throwable v6_2 = ((Throwable) p7.get(0));
                    if ((v6_2 instanceof d8.a2)) {
                        int v2_2 = p7.size();
                        while (v0_1 < v2_2) {
                            Object v3_2 = p7.get(v0_1);
                            v0_1++;
                            boolean v4_4 = ((Throwable) v3_2);
                            if ((v4_4 != v6_2) && ((v4_4 instanceof d8.a2))) {
                                v1_0 = v3_2;
                                break;
                            }
                        }
                        Object v1_1 = ((Throwable) v1_0);
                        if (v1_1 != null) {
                            return v1_1;
                        }
                    }
                    return v6_2;
                } else {
                    return v3_1;
                }
            }
            v3_0 = 0;
        } else {
            if (!p6.d()) {
                return 0;
            } else {
                return new d8.f1(this.l(), 0, this);
            }
        }
    }

    public boolean s()
    {
        return 1;
    }

    public final boolean start()
    {
        do {
            int v0_2 = this.J(d8.r1.a.get(this));
            if (v0_2 == 0) {
                return 0;
            } else {
            }
        } while(v0_2 == 1);
        return 1;
    }

    public boolean t()
    {
        return (this instanceof d8.u);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        String v1_4 = new StringBuilder();
        v1_4.append(this.C());
        v1_4.append(123);
        v1_4.append(d8.r1.K(d8.r1.a.get(this)));
        v1_4.append(125);
        v0_1.append(v1_4.toString());
        v0_1.append(64);
        v0_1.append(d8.f0.j(this));
        return v0_1.toString();
    }

    public final d8.s1 u(d8.b1 p4)
    {
        IllegalStateException v0_0 = p4.c();
        if (v0_0 != null) {
            return v0_0;
        } else {
            if (!(p4 instanceof d8.r0)) {
                if (!(p4 instanceof d8.i1)) {
                    StringBuilder v1_0 = new StringBuilder("State should have list: ");
                    v1_0.append(p4);
                    throw new IllegalStateException(v1_0.toString().toString());
                } else {
                    this.I(((d8.i1) p4));
                    return 0;
                }
            } else {
                return new d8.s1();
            }
        }
    }

    public boolean v(Throwable p1)
    {
        return 0;
    }

    public void w(a5.o p1)
    {
        throw p1;
    }

    public final void x(d8.e1 p4)
    {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0 = d8.r1.b;
        d8.t1 v1 = d8.t1.a;
        if (p4 != null) {
            p4.start();
            d8.q v4_1 = p4.attachChild(this);
            v0.set(this, v4_1);
            if (this.isCompleted()) {
                v4_1.a();
                v0.set(this, v1);
            }
            return;
        } else {
            v0.set(this, v1);
            return;
        }
    }

    public final d8.p0 y(boolean p8, d8.i1 p9)
    {
        p9.d = this;
        do {
            boolean v0_0 = d8.r1.a;
            boolean v1_4 = v0_0.get(this);
            d8.t1 v3 = d8.t1.a;
            int v4 = 1;
            Throwable v5 = 0;
            if (!(v1_4 instanceof d8.r0)) {
                if (!(v1_4 instanceof d8.b1)) {
                    v4 = 0;
                    if (v4 == 0) {
                        if (p8 != 0) {
                            int v8_2;
                            int v8_1 = v0_0.get(this);
                            if (!(v8_1 instanceof d8.w)) {
                                v8_2 = 0;
                            } else {
                                v8_2 = ((d8.w) v8_1);
                            }
                            if (v8_2 != 0) {
                                v5 = v8_2.a;
                            }
                            p9.k(v5);
                        }
                    } else {
                        return p9;
                    }
                } else {
                    int v2_1 = ((d8.b1) v1_4);
                    d8.s1 v6_0 = v2_1.c();
                    if (v6_0 != null) {
                        boolean v1_1;
                        if (!p9.j()) {
                            v1_1 = v6_0.d(p9, 1);
                        } else {
                            int v2_2;
                            if (!(v2_1 instanceof d8.l1)) {
                                v2_2 = 0;
                            } else {
                                v2_2 = ((d8.l1) v2_1);
                            }
                            boolean v1_3;
                            if (v2_2 == 0) {
                                v1_3 = 0;
                            } else {
                                v1_3 = v2_2.b();
                            }
                            if (v1_3) {
                                if (p8 == 0) {
                                    return v3;
                                } else {
                                    p9.k(v1_3);
                                    return v3;
                                }
                            } else {
                                v1_1 = v6_0.d(p9, 5);
                            }
                        }
                        if (v1_1) {
                        }
                    } else {
                        this.I(((d8.i1) v1_4));
                    }
                }
            } else {
                int v2_5 = ((d8.r0) v1_4);
                if (!v2_5.a) {
                    this.H(v2_5);
                }
            }
            return v3;
        } while(!v0_0.compareAndSet(this, v1_4, p9));
        if (v0_0.get(this) != v1_4) {
        } else {
            while (!v0_0.compareAndSet(this, v1_4, p9)) {
            }
        }
        return v3;
    }

    public boolean z()
    {
        return (this instanceof d8.h);
    }
}
