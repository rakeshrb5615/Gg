package a1;
public final class t extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public synthetic Object c;
    public final synthetic Object d;
    public Object e;

    public t(a1.g0 p2, u7.p p3, l7.c p4)
    {
        this.a = 1;
        this.d = p2;
        this.e = ((n7.i) p3);
        super(2, p4);
        return;
    }

    public t(g8.d p2, g8.b p3, l7.c p4)
    {
        this.a = 3;
        this.e = p2;
        this.d = p3;
        super(2, p4);
        return;
    }

    public synthetic t(Object p1, Object p2, Object p3, l7.c p4, int p5)
    {
        this.a = p5;
        this.e = p1;
        this.c = p2;
        this.d = p3;
        super(2, p4);
        return;
    }

    public synthetic t(Object p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.d = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p9, l7.c p10)
    {
        switch (this.a) {
            case 0:
                a1.t v10_8 = new a1.t(((a1.g0) this.d), p10, 0);
                v10_8.c = p9;
                return v10_8;
            case 1:
                a1.t v10_6 = new a1.t(((a1.g0) this.d), ((n7.i) this.e), p10);
                v10_6.c = p9;
                return v10_6;
            case 2:
                a1.t v10_4 = new a1.t(((java.io.File) this.d), p10, 2);
                v10_4.c = p9;
                return v10_4;
            case 3:
                a1.t v10_2 = new a1.t(((g8.d) this.e), ((g8.b) this.d), p10);
                v10_2.c = p9;
                return v10_2;
            case 4:
                return new a1.t(((q5.d) this.e), ((e1.e) this.c), ((Long) this.d), p10, 4);
            default:
                return new a1.t(((w1.a) this.e), ((android.net.Uri) this.c), ((android.view.InputEvent) this.d), p10, 5);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((a1.t) this.create(((g8.d) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 1:
                return ((a1.t) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 2:
                return ((a1.t) this.create(((f8.q) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 3:
                return ((a1.t) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 4:
                return ((a1.t) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((a1.t) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p13)
    {
        switch (this.a) {
            case 0:
                g8.b0 v8_8;
                a1.d1 v5_6;
                a1.a1 v0_21 = h7.l.a;
                a1.d v6_6 = ((a1.g0) this.d);
                a1.a1 v7_4 = m7.a.a;
                g8.b0 v8_5 = this.b;
                if (v8_5 == null) {
                    c4.b.e0(p13);
                    Throwable v13_20 = ((g8.d) this.c);
                    this.c = v13_20;
                    this.b = 1;
                    a1.d1 v5_2 = d8.f0.x(v6_6.c.a(), new a1.n(v6_6, 0, 2), this);
                    if (v5_2 != v7_4) {
                        v8_8 = v13_20;
                        p13 = v5_2;
                        v5_6 = ((a1.l1) p13);
                        if (!(((a1.l1) p13) instanceof a1.c)) {
                            if ((((a1.l1) p13) instanceof a1.m1)) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            } else {
                                if ((((a1.l1) p13) instanceof a1.d1)) {
                                    throw ((a1.d1) ((a1.l1) p13)).b;
                                } else {
                                    if (!(((a1.l1) p13) instanceof a1.r0)) {
                                        a1.q v3_12 = new g8.h(new l6.c(new k2.c(20, new k2.c(21, new k2.c(18, new a1.n(v6_6, 0, 0), ((g8.y) v6_6.h.b)), new a1.o(2, 0, 0)), new a1.p(v5_6, 0, 0)), 2), new a1.q(v6_6, 0));
                                        this.c = 0;
                                        this.e = 0;
                                        this.b = 3;
                                        if ((v8_8 instanceof g8.b0)) {
                                            throw ((g8.b0) v8_8).a;
                                        } else {
                                            Throwable v13_44 = v3_12.f(v8_8, this);
                                            if (v13_44 != v7_4) {
                                                v13_44 = v0_21;
                                            }
                                            if (v13_44 == v7_4) {
                                                v0_21 = v7_4;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Object v9_3 = ((a1.c) ((a1.l1) p13)).b;
                            this.c = v8_8;
                            this.e = ((a1.c) ((a1.l1) p13));
                            this.b = 2;
                            if (v8_8.a(v9_3, this) != v7_4) {
                            }
                        }
                    }
                } else {
                    if (v8_5 == 1) {
                        a1.d1 v5_4 = ((g8.d) this.c);
                        c4.b.e0(p13);
                        v8_8 = v5_4;
                    } else {
                        if (v8_5 == 2) {
                            v5_6 = ((a1.c) this.e);
                            v8_8 = ((g8.d) this.c);
                            c4.b.e0(p13);
                        } else {
                            if (v8_5 != 3) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            } else {
                                c4.b.e0(p13);
                            }
                        }
                    }
                }
                return v0_21;
            case 1:
                a1.a1 v0_4 = ((a1.g0) this.d);
                a1.q v2_1 = m7.a.a;
                a1.q v3_5 = this.b;
                if (v3_5 == null) {
                    c4.b.e0(p13);
                    Throwable v13_11 = ((d8.c0) this.c);
                    a1.q v3_6 = d8.f0.a();
                    Throwable v13_13 = v0_4.l;
                    a1.a1 v0_7 = ((f8.c) v13_13.d).d(new a1.t0(((n7.i) this.e), v3_6, v0_4.h.h(), v13_11.a()));
                    if (!(v0_7 instanceof f8.h)) {
                        if ((v0_7 instanceof f8.i)) {
                            throw new IllegalStateException("Check failed.");
                        } else {
                            if (((java.util.concurrent.atomic.AtomicInteger) ((l6.c) v13_13.e).b).getAndIncrement() == 0) {
                                d8.f0.p(((d8.c0) v13_13.b), new a1.d(v13_13, 0, 3));
                            }
                            this.b = 1;
                            p13 = v3_6.h(this);
                            if (p13 == v2_1) {
                                p13 = v2_1;
                            }
                        }
                    } else {
                        Throwable v13_15 = ((f8.h) v0_7).a;
                        if (v13_15 == null) {
                            v13_15 = new f8.m("Channel was closed normally");
                        }
                        throw v13_15;
                    }
                } else {
                    if (v3_5 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p13);
                    }
                }
                return p13;
            case 2:
                a1.a1 v1_3;
                a1.q v3_3;
                a1.a1 v0_2 = m7.a.a;
                a1.a1 v1_11 = this.b;
                if (v1_11 == null) {
                    c4.b.e0(p13);
                    Throwable v13_60 = ((f8.q) this.c);
                    a1.d v6_9 = ((java.io.File) this.d);
                    a1.a1 v1_14 = new a1.b1(0, v6_9, v13_60);
                    a1.d v6_10 = v6_9.getParentFile();
                    kotlin.jvm.internal.j.b(v6_10);
                    a1.d v6_12 = v6_10.getCanonicalFile().getPath();
                    g8.b0 v8_13 = a1.c1.c;
                    kotlin.jvm.internal.j.d(v6_12, "key");
                    Object v9_0 = v8_13.get(v6_12);
                    if (v9_0 == null) {
                        v9_0 = new a1.c1(v6_12);
                        v8_13.put(v6_12, v9_0);
                    }
                    Object v9_2 = ((a1.c1) v9_0);
                    v9_2.a.add(v1_14);
                    if (v9_2.a.size() == 1) {
                        v9_2.startWatching();
                    }
                    a1.a1 v7_1 = new a1.a1(0, v6_12, v1_14);
                    this.c = v13_60;
                    this.e = v7_1;
                    this.b = 1;
                    if (((f8.p) v13_60).d.b(h7.l.a, this) != v0_2) {
                        v3_3 = v13_60;
                        v1_3 = v7_1;
                        Throwable v13_6 = new a1.k0(v1_3, 1);
                        this.c = 0;
                        this.e = 0;
                        this.b = 2;
                        if (c4.b.e(v3_3, v13_6, this) != v0_2) {
                            v0_2 = h7.l.a;
                        }
                    }
                } else {
                    if (v1_11 == 1) {
                        v1_3 = ((a1.a1) this.e);
                        v3_3 = ((f8.q) this.c);
                        c4.b.e0(p13);
                    } else {
                        if (v1_11 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(p13);
                        }
                    }
                }
                return v0_2;
            case 3:
                a1.a1 v0_27 = h7.l.a;
                a1.a1 v1_10 = m7.a.a;
                a1.q v2_10 = this.b;
                if (v2_10 == null) {
                    c4.b.e0(p13);
                    Throwable v13_54 = ((d8.c0) this.c);
                    a1.q v2_12 = ((g8.d) this.e);
                    a1.q v3_15 = ((g8.b) this.d);
                    a1.d v6_7 = v3_15.a;
                    a1.a1 v7_5 = v3_15.b;
                    if (v7_5 == -3) {
                        v7_5 = -2;
                    }
                    g8.b0 v8_12 = v3_15.c;
                    k2.c v10_3 = new a1.d(v3_15, 0, 5);
                    f8.p v4_2 = new f8.p(d8.f0.q(v13_54, v6_7), a.a.a(v7_5, v8_12, 4));
                    v4_2.Q(d8.d0.b, v4_2, v10_3);
                    this.b = 1;
                    Throwable v13_56 = g8.z.c(v2_12, v4_2, 1, this);
                    if (v13_56 != v1_10) {
                        v13_56 = v0_27;
                    }
                    if (v13_56 == v1_10) {
                        v0_27 = v1_10;
                    }
                } else {
                    if (v2_10 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p13);
                    }
                }
                return v0_27;
            case 4:
                a1.a1 v0_28 = m7.a.a;
                a1.a1 v1_12 = this.b;
                if (v1_12 == null) {
                    c4.b.e0(p13);
                    Throwable v13_4 = ((q5.d) this.e).c;
                    a1.a1 v1_6 = new q5.c(((e1.e) this.c), ((Long) this.d), 0);
                    this.b = 1;
                    p13 = v13_4.a(new e1.c(v1_6, 0, 1), this);
                    if (p13 == v0_28) {
                        p13 = v0_28;
                    }
                } else {
                    if (v1_12 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p13);
                    }
                }
                return p13;
            default:
                a1.a1 v0_25 = m7.a.a;
                a1.a1 v1_7 = this.b;
                if (v1_7 == null) {
                    c4.b.e0(p13);
                    Throwable v13_49 = ((w1.a) this.e).a;
                    a1.a1 v1_9 = ((android.net.Uri) this.c);
                    a1.q v2_9 = ((android.view.InputEvent) this.d);
                    this.b = 1;
                    if (v13_49.c(v1_9, v2_9, this) != v0_25) {
                        v0_25 = h7.l.a;
                    }
                } else {
                    if (v1_7 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p13);
                    }
                }
                return v0_25;
        }
    }
}
