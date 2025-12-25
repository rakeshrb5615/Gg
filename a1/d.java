package a1;
public final class d extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public Object c;
    public final synthetic Object d;

    public synthetic d(Object p1, Object p2, l7.c p3, int p4)
    {
        this.a = p4;
        this.c = p1;
        this.d = p2;
        super(2, p3);
        return;
    }

    public synthetic d(Object p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.d = p1;
        super(2, p2);
        return;
    }

    public d(u7.p p2, a1.c p3, l7.c p4)
    {
        this.a = 1;
        this.c = ((n7.i) p2);
        this.d = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        switch (this.a) {
            case 0:
                a1.d v0_26 = new a1.d(((java.util.List) this.d), p5, 0);
                v0_26.c = p4;
                return v0_26;
            case 1:
                return new a1.d(((n7.i) this.c), ((a1.c) this.d), p5);
            case 2:
                a1.d v0_22 = new a1.d(((a1.g0) this.d), p5, 2);
                v0_22.c = p4;
                return v0_22;
            case 3:
                return new a1.d(((j6.s) this.d), p5, 3);
            case 4:
                a1.d v0_18 = new a1.d(((f8.s) this.d), p5, 4);
                v0_18.c = p4;
                return v0_18;
            case 5:
                a1.d v0_15 = new a1.d(((g8.b) this.d), p5, 5);
                v0_15.c = p4;
                return v0_15;
            case 6:
                a1.d v0_13 = new a1.d(((g8.b) this.d), p5, 6);
                v0_13.c = p4;
                return v0_13;
            case 7:
                a1.d v0_11 = new a1.d(((g8.d) this.d), p5, 7);
                v0_11.c = p4;
                return v0_11;
            case 8:
                return new a1.d(((q5.d) this.c), ((u7.l) this.d), p5, 8);
            case 9:
                return new a1.d(((q5.d) this.c), ((e1.e) this.d), p5, 9);
            case 10:
                return new a1.d(((r6.o) this.c), ((r6.w0) this.d), p5, 10);
            case 11:
                return new a1.d(((r6.c1) this.c), ((r6.h0) this.d), p5, 11);
            case 12:
                a1.d v0_16 = new a1.d(((u6.c) this.d), p5, 12);
                v0_16.c = p4;
                return v0_16;
            default:
                return new a1.d(((w1.a) this.c), ((android.net.Uri) this.d), p5, 13);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((a1.d) this.create(((a1.k) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 1:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 2:
                return ((a1.d) this.create(((a1.t0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 3:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 4:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 5:
                return ((a1.d) this.create(((f8.q) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 6:
                return ((a1.d) this.create(((g8.d) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 7:
                return ((a1.d) this.create(p2, ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 8:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 9:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 10:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 11:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 12:
                return ((a1.d) this.create(((org.json.JSONObject) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((a1.d) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p21)
    {
        f8.k v4_1 = 0;
        d4.l v5_0 = h7.l.a;
        Integer v6_12 = this.d;
        int v8_1 = 1;
        switch (this.a) {
            case 0:
                d4.l v5_12;
                int v18_2 = v5_0;
                IllegalStateException v0_79 = m7.a.a;
                f8.k v2_79 = this.b;
                if (v2_79 == null) {
                    c4.b.e0(p21);
                    f8.k v2_81 = ((a1.k) this.c);
                    Integer v6_15 = ((java.util.List) v6_12);
                    this.b = 1;
                    if (a.a.c(v6_15, v2_81, this) != v0_79) {
                        v5_12 = v18_2;
                    } else {
                        v5_12 = v0_79;
                    }
                } else {
                    if (v2_79 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                    }
                }
                return v5_12;
            case 1:
                IllegalStateException v0_76 = m7.a.a;
                f8.k v2_75 = this.b;
                if (v2_75 == null) {
                    c4.b.e0(p21);
                    f8.k v2_77 = ((n7.i) this.c);
                    int v3_35 = ((a1.c) v6_12).b;
                    this.b = 1;
                    f8.k v2_78 = v2_77.invoke(v3_35, this);
                    if (v2_78 != v0_76) {
                        v0_76 = v2_78;
                    }
                } else {
                    if (v2_75 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                        v0_76 = p21;
                    }
                }
                return v0_76;
            case 2:
                d4.l v5_11;
                int v18_1 = v5_0;
                IllegalStateException v0_73 = m7.a.a;
                f8.k v2_71 = this.b;
                if (v2_71 == null) {
                    c4.b.e0(p21);
                    f8.k v2_73 = ((a1.t0) this.c);
                    Integer v6_13 = ((a1.g0) v6_12);
                    this.b = 1;
                    if (a1.g0.d(v6_13, v2_73, this) != v0_73) {
                        v5_11 = v18_1;
                    } else {
                        v5_11 = v0_73;
                    }
                } else {
                    if (v2_71 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                    }
                }
                return v5_11;
            case 3:
                d4.l v5_10;
                int v3_20;
                int v18_0;
                f8.k v2_49;
                Integer v6_11 = ((j6.s) v6_12);
                IllegalStateException v0_62 = m7.a.a;
                f8.k v2_40 = this.b;
                if (v2_40 == null) {
                    c4.b.e0(p21);
                    if (((java.util.concurrent.atomic.AtomicInteger) ((l6.c) v6_11.e).b).get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    } else {
                        d8.f0.g(((d8.c0) v6_11.b).a());
                        f8.k v2_59 = ((a1.d) v6_11.c);
                        int v9_14 = ((f8.c) v6_11.d);
                        this.c = v2_59;
                        this.b = v8_1;
                        v9_14.getClass();
                        String v7_20 = f8.c.b;
                        Object v15_1 = f8.c.c;
                        long v10_3 = f8.c.m;
                        int v11_2 = ((f8.k) v10_3.get(v9_14));
                        while (!v9_14.r(v7_20.get(v9_14), v8_1)) {
                            f8.k v2_62;
                            long v12_10 = v15_1.getAndIncrement(v9_14);
                            int v3_21 = ((long) f8.e.b);
                            int v21_1 = v9_14;
                            int v8_2 = (v12_10 / v3_21);
                            f8.k v4_2 = v2_59;
                            d8.n v14_2 = ((int) (v12_10 % v3_21));
                            if (v11_2.c == v8_2) {
                                v2_62 = v21_1;
                            } else {
                                v2_62 = v21_1;
                                int v3_24 = v2_62.l(v8_2, v11_2);
                                if (v3_24 != 0) {
                                    v11_2 = v3_24;
                                } else {
                                    v9_14 = v2_62;
                                    v2_59 = v4_2;
                                    f8.k v4 = 0;
                                    v8_1 = 1;
                                }
                            }
                            v9_14 = v2_62;
                            f8.k v2_63 = v10_3;
                            long v10_5 = v11_2;
                            int v11_3 = v14_2;
                            int v3_26 = v9_14.z(v10_5, v11_3, v12_10, 0);
                            int v8_3 = f8.e.m;
                            if (v3_26 == v8_3) {
                                throw new IllegalStateException("unexpected");
                            } else {
                                int v21_2 = v4_2;
                                f8.k v4_3 = f8.e.o;
                                if (v3_26 != v4_3) {
                                    v18_0 = v5_0;
                                    if (v3_26 != f8.e.n) {
                                        v10_5.b();
                                        v2_49 = v3_26;
                                    } else {
                                        d8.n v14_5 = d8.f0.k(q4.b.C(this));
                                        d4.l v5_6 = v9_14.z(v10_5, v11_3, v12_10, v14_5);
                                        if (v5_6 != v8_3) {
                                            if (v5_6 != v4_3) {
                                                v10_5.b();
                                                v14_5.z(v5_6, 0);
                                            } else {
                                                if (v12_10 < v9_14.p()) {
                                                    v10_5.b();
                                                }
                                                f8.k v2_65 = ((f8.k) v2_63.get(v9_14));
                                                while (!v9_14.r(v7_20.get(v9_14), 1)) {
                                                    long v10_7;
                                                    long v12_12 = v15_1.getAndIncrement(v9_14);
                                                    f8.k v4_9 = ((long) f8.e.b);
                                                    long v10_6 = (v12_12 / v4_9);
                                                    int v8_5 = ((int) (v12_12 % v4_9));
                                                    if (v2_65.c == v10_6) {
                                                        v10_7 = v2_65;
                                                    } else {
                                                        f8.k v4_14 = v9_14.l(v10_6, v2_65);
                                                        if (v4_14 != null) {
                                                            v10_7 = v4_14;
                                                        } else {
                                                        }
                                                    }
                                                    int v11_4 = v8_5;
                                                    f8.k v2_66 = v9_14.z(v10_7, v11_4, v12_12, v14_5);
                                                    f8.k v4_15 = v10_7;
                                                    if (v2_66 != f8.e.m) {
                                                        if (v2_66 != f8.e.o) {
                                                            if (v2_66 == f8.e.n) {
                                                                throw new IllegalStateException("unexpected");
                                                            } else {
                                                                v4_15.b();
                                                                v14_5.z(v2_66, 0);
                                                            }
                                                        } else {
                                                            if (v12_12 < v9_14.p()) {
                                                                v4_15.b();
                                                            }
                                                            v2_65 = v4_15;
                                                        }
                                                    } else {
                                                        v14_5.a(v4_15, v11_4);
                                                    }
                                                }
                                                v14_5.resumeWith(c4.b.p(v9_14.n()));
                                            }
                                        } else {
                                            v14_5.a(v10_5, v11_3);
                                        }
                                        v2_49 = v14_5.q();
                                    }
                                    if (v2_49 != v0_62) {
                                        v3_20 = v21_2;
                                        v4_1 = 0;
                                        this.c = v4_1;
                                        this.b = 2;
                                        if (v3_20.invoke(v2_49, this) == v0_62) {
                                            v5_10 = v0_62;
                                        } else {
                                            if (((java.util.concurrent.atomic.AtomicInteger) ((l6.c) v6_11.e).b).decrementAndGet() != 0) {
                                                v5_0 = v18_0;
                                                v8_1 = 1;
                                            } else {
                                                v5_10 = v18_0;
                                            }
                                        }
                                    }
                                } else {
                                    if (v12_10 < v9_14.p()) {
                                        v10_5.b();
                                    }
                                    v11_2 = v10_5;
                                    v4 = 0;
                                    v8_1 = 1;
                                    v10_3 = v2_63;
                                    v2_59 = v21_2;
                                }
                            }
                        }
                        throw v9_14.n();
                    }
                } else {
                    if (v2_40 == 1) {
                        f8.k v2_48 = ((a1.d) this.c);
                        c4.b.e0(p21);
                        v3_20 = v2_48;
                        v18_0 = v5_0;
                        v2_49 = p21;
                    } else {
                        if (v2_40 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(p21);
                            v18_0 = v5_0;
                        }
                    }
                }
                return v5_10;
            case 4:
                IllegalStateException v0_54 = m7.a.a;
                f8.k v2_36 = this.b;
                try {
                    if (v2_36 == null) {
                        c4.b.e0(p21);
                        Integer v6_10 = ((f8.s) v6_12);
                        this.b = 1;
                        if (v6_10.b(v5_0, this) != v0_54) {
                            IllegalStateException v0_58 = v5_0;
                            if ((v0_58 instanceof h7.g)) {
                                v5_0 = new f8.h(h7.h.a(v0_58));
                            }
                            v0_54 = new f8.j(v5_0);
                        }
                    } else {
                        if (v2_36 != 1) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(p21);
                        }
                    }
                } catch (IllegalStateException v0_57) {
                    v0_58 = c4.b.p(v0_57);
                }
                return v0_54;
            case 5:
                IllegalStateException v0_51 = m7.a.a;
                f8.k v2_30 = this.b;
                if (v2_30 == null) {
                    f8.k v2_33;
                    c4.b.e0(p21);
                    f8.k v2_32 = ((f8.q) this.c);
                    Integer v6_9 = ((g8.b) v6_12);
                    this.b = 1;
                    switch (v6_9.d) {
                        case 0:
                            v2_33 = ((a1.t) v6_9.e).invoke(v2_32, this);
                            if (v2_33 != m7.a.a) {
                                v2_33 = v5_0;
                            } else {
                            }
                            break;
                        default:
                            v2_33 = ((g8.c) v6_9.e).f(new h8.j(v2_32), this);
                            int v3_18 = m7.a.a;
                            if (v2_33 != v3_18) {
                                v2_33 = v5_0;
                            }
                            if (v2_33 != v3_18) {
                            } else {
                            }
                    }
                    if (v2_33 == v0_51) {
                        v5_0 = v0_51;
                    }
                } else {
                    if (v2_30 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                    }
                }
                return v5_0;
            case 6:
                IllegalStateException v0_48 = m7.a.a;
                f8.k v2_26 = this.b;
                if (v2_26 == null) {
                    c4.b.e0(p21);
                    f8.k v2_28 = ((g8.d) this.c);
                    Integer v6_8 = ((g8.b) v6_12);
                    this.b = 1;
                    f8.k v2_29 = ((g8.c) v6_8.e).f(v2_28, this);
                    if (v2_29 != v0_48) {
                        v2_29 = v5_0;
                    }
                    if (v2_29 == v0_48) {
                        v5_0 = v0_48;
                    }
                } else {
                    if (v2_26 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                    }
                }
                return v5_0;
            case 7:
                IllegalStateException v0_45 = m7.a.a;
                f8.k v2_23 = this.b;
                if (v2_23 == null) {
                    c4.b.e0(p21);
                    f8.k v2_24 = this.c;
                    Integer v6_7 = ((g8.d) v6_12);
                    this.b = 1;
                    if (v6_7.a(v2_24, this) == v0_45) {
                        v5_0 = v0_45;
                    }
                } else {
                    if (v2_23 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                    }
                }
                return v5_0;
            case 8:
                IllegalStateException v0_40;
                IllegalStateException v0_36 = ((q5.d) this.c);
                f8.k v2_21 = v0_36.b;
                d4.l v5_1 = m7.a.a;
                int v9_10 = this.b;
                try {
                    if (v9_10 == 0) {
                        c4.b.e0(p21);
                        int v9_11 = Boolean.TRUE;
                        if (kotlin.jvm.internal.j.a(v2_21.get(), v9_11)) {
                            throw new IllegalStateException("Don\'t call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don\'t do everything in a single callback. ");
                        } else {
                            v2_21.set(v9_11);
                            IllegalStateException v0_39 = v0_36.c;
                            String v7_16 = new a1.p(((u7.l) v6_12), 0, 2);
                            this.b = 1;
                            v0_40 = v0_39.a(new e1.c(v7_16, 0, 1), this);
                            if (v0_40 != v5_1) {
                                v5_1 = ((e1.b) v0_40);
                                v2_21.set(Boolean.FALSE);
                            } else {
                            }
                        }
                    } else {
                        if (v9_10 != 1) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(p21);
                            v0_40 = p21;
                        }
                    }
                } catch (IllegalStateException v0_43) {
                    v2_21.set(Boolean.FALSE);
                    throw v0_43;
                }
                return v5_1;
            case 9:
                f8.k v2_15;
                IllegalStateException v0_29 = m7.a.a;
                f8.k v2_9 = this.b;
                if (v2_9 == null) {
                    c4.b.e0(p21);
                    f8.k v2_14 = ((q5.d) this.c).c.a.b();
                    this.b = 1;
                    v2_15 = g8.z.e(v2_14, this);
                    if (v2_15 != v0_29) {
                        f8.k v2_16 = ((e1.b) v2_15);
                        if (v2_16 != null) {
                            Integer v6_5 = ((e1.e) v6_12);
                            kotlin.jvm.internal.j.e(v6_5, "key");
                            v0_29 = v2_16.a.get(v6_5);
                            if ((v0_29 instanceof byte[])) {
                                IllegalStateException v0_34 = ((byte[]) v0_29);
                                v0_29 = java.util.Arrays.copyOf(v0_34, v0_34.length);
                                kotlin.jvm.internal.j.d(v0_29, "copyOf(this, size)");
                            }
                            if (v0_29 != null) {
                                return v0_29;
                            }
                        }
                        v0_29 = Long.valueOf(-1);
                    }
                } else {
                    if (v2_9 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                        v2_15 = p21;
                    }
                }
                return v0_29;
            case 10:
                String v7_7;
                IllegalStateException v0_20 = ((r6.o) this.c);
                f8.k v4_0 = v0_20.b;
                Integer v6_4 = m7.a.a;
                int v9_3 = this.b;
                if (v9_3 == 0) {
                    c4.b.e0(p21);
                    this.b = 1;
                    v7_7 = s6.c.a.b(this);
                    if (v7_7 != v6_4) {
                        String v7_9 = ((java.util.Map) v7_7).values();
                        if ((v7_9 == null) || (!v7_9.isEmpty())) {
                            String v7_11 = v7_9.iterator();
                            while (v7_11.hasNext()) {
                                if (((g5.k) v7_11.next()).a.a()) {
                                    this.b = 2;
                                    if (v4_0.b(this) != v6_4) {
                                        int v3_3 = v4_0.a.a();
                                        if (v3_3 == 0) {
                                            v3_3 = v4_0.b.a();
                                            if (v3_3 != 0) {
                                                v8_1 = v3_3.booleanValue();
                                            }
                                        }
                                        if (v8_1 != 0) {
                                            IllegalStateException v0_25 = v0_20.a;
                                            f8.k v2_8 = new r2.q(5);
                                            v0_25.a();
                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_8);
                                            v0_25.j.add(v2_8);
                                        } else {
                                            n7.f.a(android.util.Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                                        }
                                        return v5_0;
                                    } else {
                                        v5_0 = v6_4;
                                        return v5_0;
                                    }
                                }
                            }
                        }
                        n7.f.a(android.util.Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                    }
                } else {
                    if (v9_3 == 1) {
                        c4.b.e0(p21);
                        v7_7 = p21;
                    } else {
                        if (v9_3 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(p21);
                        }
                    }
                }
                return v5_0;
            case 11:
                Integer v6_1 = ((r6.h0) v6_12);
                int v9_1 = ((r6.c1) this.c);
                long v10_0 = m7.a.a;
                IllegalStateException v0_6 = this.b;
                try {
                    if (v0_6 == null) {
                        c4.b.e0(p21);
                        IllegalStateException v0_7 = v9_1.e;
                        String v7_1 = new r6.a1(v9_1, 0, 1);
                        this.b = 1;
                        if (v0_7.a(v7_1, this) == v10_0) {
                            v5_0 = v10_0;
                        }
                    } else {
                        if (v0_6 == 1) {
                            c4.b.e0(p21);
                        } else {
                            if (v0_6 != 2) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            } else {
                                c4.b.e0(p21);
                            }
                        }
                    }
                } catch (IllegalStateException v0_9) {
                    String v7_3 = new StringBuilder("App foregrounded, failed to update data. Message: ");
                    v7_3.append(v0_9.getMessage());
                    android.util.Log.d("FirebaseSessions", v7_3.toString());
                    if (v9_1.d(v6_1)) {
                        IllegalStateException v0_14 = v9_1.b.a(v6_1.a);
                        v9_1.h = r6.h0.a(v6_1, v0_14, 0, 0, 4);
                        f8.k v2_4 = ((r6.s0) v9_1.c);
                        d8.f0.p(d8.f0.b(v2_4.e), new r6.q0(v2_4, v0_14, 0));
                        IllegalStateException v0_15 = v0_14.a;
                        this.b = 2;
                        if (r6.c1.a(v9_1, v0_15, r6.z0.b, this) == v10_0) {
                        }
                    }
                }
                return v5_0;
            case 12:
                Integer v6_0 = ((u6.c) v6_12);
                int v11_0 = m7.a.a;
                long v12_1 = this.b;
                if (v12_1 == 0) {
                    int v13_2;
                    Object v15_0;
                    d8.n v14_0;
                    c4.b.e0(p21);
                    String v7_12 = ((org.json.JSONObject) this.c);
                    long v12_3 = new StringBuilder("Fetched settings: ");
                    v12_3.append(v7_12);
                    android.util.Log.d("FirebaseSessions", v12_3.toString());
                    if (!v7_12.has("app_quality")) {
                        v13_2 = 0;
                        v14_0 = 0;
                        v15_0 = 0;
                    } else {
                        String v7_17 = v7_12.get("app_quality");
                        kotlin.jvm.internal.j.c(v7_17, "null cannot be cast to non-null type org.json.JSONObject");
                        String v7_18 = ((org.json.JSONObject) v7_17);
                        try {
                            long v10_2;
                            if (!v7_18.has("sessions_enabled")) {
                                v10_2 = 0;
                                try {
                                    int v9_12;
                                    if (!v7_18.has("sampling_rate")) {
                                        v9_12 = 0;
                                    } else {
                                        v9_12 = ((Double) v7_18.get("sampling_rate"));
                                    }
                                    try {
                                        int v3_19;
                                        if (!v7_18.has("session_timeout_seconds")) {
                                            v3_19 = 0;
                                        } else {
                                            v3_19 = ((Integer) v7_18.get("session_timeout_seconds"));
                                        }
                                        try {
                                            if (v7_18.has("cache_duration")) {
                                                v4_1 = ((Integer) v7_18.get("cache_duration"));
                                            }
                                        } catch (IllegalStateException v0_61) {
                                            n7.f.a(android.util.Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", v0_61));
                                        }
                                    } catch (IllegalStateException v0_61) {
                                        v3_19 = 0;
                                    }
                                } catch (IllegalStateException v0_61) {
                                    v3_19 = 0;
                                    v9_12 = 0;
                                }
                            } else {
                                v10_2 = ((Boolean) v7_18.get("sessions_enabled"));
                            }
                        } catch (IllegalStateException v0_61) {
                            v3_19 = 0;
                            v9_12 = 0;
                            v10_2 = 0;
                        }
                        v15_0 = v3_19;
                        v14_0 = v9_12;
                        v13_2 = v10_2;
                    }
                    f8.k v2_88;
                    IllegalStateException v0_88 = v6_0.e;
                    if (v4_1 == null) {
                        v2_88 = u6.c.g;
                    } else {
                        v2_88 = v4_1.intValue();
                    }
                    long v12_0 = new u6.h(v13_2, v14_0, v15_0, new Integer(v2_88), new Long(v6_0.a.a().c));
                    this.b = 1;
                    if (v0_88.c(v12_0, this) == v11_0) {
                        v5_0 = v11_0;
                    }
                } else {
                    if (v12_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                    }
                }
                return v5_0;
            default:
                IllegalStateException v0_82 = m7.a.a;
                f8.k v2_83 = this.b;
                if (v2_83 == null) {
                    c4.b.e0(p21);
                    f8.k v2_86 = ((w1.a) this.c).a;
                    Integer v6_16 = ((android.net.Uri) v6_12);
                    this.b = 1;
                    if (v2_86.d(v6_16, this) == v0_82) {
                        v5_0 = v0_82;
                    }
                } else {
                    if (v2_83 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p21);
                    }
                }
                return v5_0;
        }
    }
}
