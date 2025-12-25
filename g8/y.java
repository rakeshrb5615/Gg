package g8;
public final class y extends h8.b implements g8.u, g8.c, h8.d {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater e;
    private volatile synthetic Object _state$volatile;
    public int d;

    static y()
    {
        g8.y.e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(g8.y, Object, "_state$volatile");
        return;
    }

    public y(Object p1)
    {
        this._state$volatile = p1;
        return;
    }

    public final Object a(Object p1, l7.c p2)
    {
        this.d(p1);
        return h7.l.a;
    }

    public final Object b()
    {
        int v0_1 = g8.y.e.get(this);
        if (v0_1 == h8.f.a) {
            v0_1 = 0;
        }
        return v0_1;
    }

    public final g8.c c(l7.h p1, int p2, f8.a p3)
    {
        return g8.z.f(this, p1, p2, p3);
    }

    public final void d(Object p2)
    {
        if (p2 == null) {
            p2 = h8.f.a;
        }
        this.e(0, p2);
        return;
    }

    public final boolean e(Object p10, Object p11)
    {
        try {
            int v0_0 = g8.y.e;
            int v1_1 = v0_0.get(this);
        } catch (int v10_3) {
            throw v10_3;
        }
        if ((p10 == 0) || (kotlin.jvm.internal.j.a(v1_1, p10))) {
            if (!kotlin.jvm.internal.j.a(v1_1, p11)) {
                v0_0.set(this, p11);
                int v10_1 = this.d;
                if ((v10_1 & 1) != 0) {
                    this.d = (v10_1 + 2);
                    return 1;
                } else {
                    int v10_4 = (v10_1 + 1);
                    this.d = v10_4;
                    g8.a0[] v11_2 = this.a;
                    while(true) {
                        g8.a0[] v11_3 = ((g8.a0[]) v11_2);
                        if (v11_3 != null) {
                            break;
                        }
                        try {
                            g8.a0[] v11_4 = this.d;
                        } catch (int v10_6) {
                            throw v10_6;
                        }
                        if (v11_4 != v10_4) {
                            v11_2 = this.a;
                            v10_4 = v11_4;
                        } else {
                            this.d = (v10_4 + 1);
                            return 1;
                        }
                    }
                    int v0_1 = v11_3.length;
                    int v3 = 0;
                    while (v3 < v0_1) {
                        h7.l v4_0 = v11_3[v3];
                        if (v4_0 != null) {
                            h7.l v4_1 = v4_0.a;
                            do {
                                d8.n v5_0 = v4_1.get();
                                if (v5_0 != null) {
                                    Object v6_0 = g8.z.b;
                                    if (v5_0 != v6_0) {
                                        Object v7_0 = g8.z.a;
                                        if (v5_0 != v7_0) {
                                            while (!v4_1.compareAndSet(v5_0, v7_0)) {
                                                if (v4_1.get() != v5_0) {
                                                }
                                            }
                                            ((d8.n) v5_0).resumeWith(h7.l.a);
                                            v3++;
                                        }
                                        while (!v4_1.compareAndSet(v5_0, v6_0)) {
                                        }
                                    }
                                }
                            } while(v4_1.get() == v5_0);
                        }
                    }
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final Object f(g8.d p18, n7.c p19)
    {
        java.util.concurrent.atomic.AtomicReference v2_1;
        if (!(p19 instanceof g8.x)) {
            v2_1 = new g8.x(this, p19);
        } else {
            v2_1 = ((g8.x) p19);
            m7.a v3_2 = ((g8.x) p19).n;
            if ((v3_2 & -2147483648) == 0) {
            } else {
                ((g8.x) p19).n = (v3_2 - -2147483648);
            }
        }
        Object v4_1;
        Object v12_1;
        Object v4_13;
        g8.a0 v10_4;
        g8.y v13;
        Object v0_5;
        g8.a0 v11_2;
        Object v0_6 = v2_1.f;
        m7.a v3_1 = m7.a.a;
        Object v4_5 = v2_1.n;
        Object v5_3 = 3;
        int v8_0 = 2;
        try {
            if (v4_5 == null) {
                c4.b.e0(v0_6);
                Object v0_9 = this.a;
                if (v0_9 != null) {
                    if (this.b >= v0_9.length) {
                        Object v0_10 = java.util.Arrays.copyOf(v0_9, (v0_9.length * 2));
                        kotlin.jvm.internal.j.d(v0_10, "copyOf(...)");
                        this.a = ((g8.a0[]) v0_10);
                        v0_9 = ((g8.a0[]) v0_10);
                    }
                } else {
                    v0_9 = new g8.a0[2];
                    this.a = v0_9;
                }
                Object v4_12 = this.c;
                while(true) {
                    g8.a0 v10_1 = v0_9[v4_12];
                    if (v10_1 == null) {
                        v10_1 = new g8.a0();
                        v0_9[v4_12] = v10_1;
                    }
                    v4_12++;
                    if (v4_12 >= v0_9.length) {
                        v4_12 = 0;
                    }
                    g8.a0 v11_1 = v10_1.a;
                    if (v11_1.get() == null) {
                        break;
                    }
                }
                v11_1.set(g8.z.a);
                this.c = v4_12;
                this.b = (this.b + 1);
                v4_13 = p18;
                v13 = this;
                v11_2 = v10_1;
                v10_4 = ((d8.e1) v2_1.getContext().get(d8.b0.b));
                v12_1 = v4_13;
                v0_5 = 0;
                v4_1 = g8.y.e.get(v13);
                if (v10_4 != null) {
                    if (!v10_4.isActive()) {
                        throw v10_4.getCancellationException();
                    } else {
                    }
                }
                if ((v0_5 != null) && (v0_5.equals(v4_1))) {
                    boolean v14_2 = g8.z.a;
                    Object v4_3 = v11_2.a.getAndSet(v14_2);
                    kotlin.jvm.internal.j.b(v4_3);
                    if (v4_3 != g8.z.b) {
                        v2_1.a = v13;
                        v2_1.b = v12_1;
                        v2_1.c = v11_2;
                        v2_1.d = v10_4;
                        v2_1.e = v0_5;
                        v2_1.n = v5_3;
                        Object v4_4 = h7.l.a;
                        d8.n v15_2 = new d8.n(1, q4.b.C(v2_1));
                        v15_2.r();
                        Object v5_1 = v11_2.a;
                        while (!v5_1.compareAndSet(v14_2, v15_2)) {
                            if (v5_1.get() != v14_2) {
                                v15_2.resumeWith(v4_4);
                            }
                            Object v5_2 = v15_2.q();
                            if (v5_2 == m7.a.a) {
                                v4_4 = v5_2;
                            }
                            if (v4_4 == v3_1) {
                            }
                        }
                    } else {
                    }
                } else {
                    Object v0_3;
                    if (v4_1 != h8.f.a) {
                        v0_3 = v4_1;
                    } else {
                        v0_3 = 0;
                    }
                    v2_1.a = v13;
                    v2_1.b = v12_1;
                    v2_1.c = v11_2;
                    v2_1.d = v10_4;
                    v2_1.e = v4_1;
                    v2_1.n = v8_0;
                    if (v12_1.a(v0_3, v2_1) != v3_1) {
                        v0_5 = v4_1;
                    } else {
                    }
                }
            } else {
                if (v4_5 == 1) {
                    v11_2 = v2_1.c;
                    v4_13 = v2_1.b;
                    v13 = v2_1.a;
                    c4.b.e0(v0_6);
                } else {
                    if (v4_5 == 2) {
                        v4_1 = v2_1.e;
                        v10_4 = v2_1.d;
                        v11_2 = v2_1.c;
                        v12_1 = v2_1.b;
                        v13 = v2_1.a;
                        c4.b.e0(v0_6);
                    } else {
                        if (v4_5 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            Object v4_15 = v2_1.e;
                            v10_4 = v2_1.d;
                            v11_2 = v2_1.c;
                            v12_1 = v2_1.b;
                            v13 = v2_1.a;
                            c4.b.e0(v0_6);
                            v0_5 = v4_15;
                            v5_3 = 3;
                            v8_0 = 2;
                        }
                    }
                }
            }
        } catch (Object v0_7) {
            java.util.concurrent.atomic.AtomicReference v2_3 = (v13.b - 1);
            v13.b = v2_3;
            if (v2_3 == null) {
                v13.c = 0;
            }
            kotlin.jvm.internal.j.c(v11_2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            v11_2.a.set(0);
            throw v0_7;
        }
        return v3_1;
    }
}
