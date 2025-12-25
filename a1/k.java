package a1;
public final class k {
    public final synthetic m8.a a;
    public final synthetic kotlin.jvm.internal.o b;
    public final synthetic kotlin.jvm.internal.r c;
    public final synthetic a1.g0 d;

    public k(m8.a p1, kotlin.jvm.internal.o p2, kotlin.jvm.internal.r p3, a1.g0 p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final Object a(a1.g p10, n7.c p11)
    {
        String v0_6;
        if (!(p11 instanceof a1.j)) {
            v0_6 = new a1.j(this, p11);
        } else {
            v0_6 = ((a1.j) p11);
            kotlin.jvm.internal.r v1_4 = ((a1.j) p11).n;
            if ((v1_4 & -2147483648) == 0) {
            } else {
                ((a1.j) p11).n = (v1_4 - -2147483648);
            }
        }
        Throwable v10_3;
        Throwable v10_9;
        kotlin.jvm.internal.r v1_2;
        String v0_2;
        String v4_1;
        kotlin.jvm.internal.r v2_0;
        boolean v5_2;
        a1.g0 v8_0;
        Throwable v11_4;
        Throwable v11_2 = v0_6.f;
        kotlin.jvm.internal.r v1_3 = m7.a.a;
        kotlin.jvm.internal.r v2_1 = v0_6.n;
        try {
            if (v2_1 == null) {
                c4.b.e0(v11_2);
                v0_6.a = p10;
                Throwable v11_3 = this.a;
                v0_6.b = v11_3;
                kotlin.jvm.internal.r v2_2 = this.b;
                v0_6.c = v2_2;
                m8.a v7_0 = this.c;
                v0_6.d = v7_0;
                v8_0 = this.d;
                v0_6.e = v8_0;
                v0_6.n = 1;
                v11_4 = ((m8.c) v11_3);
                if (v11_4.d(v0_6) != v1_3) {
                    v5_2 = v2_2;
                    v2_0 = v7_0;
                    try {
                        if (v5_2.a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        } else {
                            boolean v5_5 = v2_0.a;
                            v0_6.a = v11_4;
                            v0_6.b = v2_0;
                            v0_6.c = v8_0;
                            v0_6.d = 0;
                            v0_6.e = 0;
                            v0_6.n = 2;
                            Throwable v10_8 = p10.invoke(v5_5, v0_6);
                            if (v10_8 != v1_3) {
                                v4_1 = v11_4;
                                v11_2 = v10_8;
                                v10_9 = v8_0;
                                if (kotlin.jvm.internal.j.a(v11_2, v2_0.a)) {
                                    v0_2 = v4_1;
                                } else {
                                    v0_6.a = v4_1;
                                    v0_6.b = v2_0;
                                    v0_6.c = v11_2;
                                    v0_6.n = 3;
                                    if (v10_9.k(v11_2, 0, v0_6) != v1_3) {
                                        v10_3 = v11_2;
                                        v1_2 = v2_0;
                                        v0_2 = v4_1;
                                        v1_2.a = v10_3;
                                        v2_0 = v1_2;
                                    } else {
                                        return v1_3;
                                    }
                                }
                            }
                        }
                    } catch (Throwable v10_4) {
                        v0_2 = v11_4;
                        ((m8.c) v0_2).f(0);
                        throw v10_4;
                    }
                }
            } else {
                if (v2_1 == 1) {
                    Throwable v10_6 = v0_6.e;
                    v2_0 = v0_6.d;
                    v5_2 = ((kotlin.jvm.internal.o) v0_6.c);
                    m8.a v7_2 = ((m8.a) v0_6.b);
                    a1.g0 v8_2 = ((u7.p) v0_6.a);
                    c4.b.e0(v11_2);
                    v8_0 = v10_6;
                    p10 = v8_2;
                    v11_4 = v7_2;
                } else {
                    if (v2_1 == 2) {
                        v10_9 = ((a1.g0) v0_6.c);
                        v2_0 = ((kotlin.jvm.internal.r) v0_6.b);
                        v4_1 = ((m8.a) v0_6.a);
                        c4.b.e0(v11_2);
                    } else {
                        if (v2_1 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v10_3 = v0_6.c;
                            v1_2 = ((kotlin.jvm.internal.r) v0_6.b);
                            v0_2 = ((m8.a) v0_6.a);
                            c4.b.e0(v11_2);
                        }
                    }
                }
            }
        } catch (Throwable v10_4) {
            v0_2 = v4_1;
        } catch (Throwable v10_4) {
        }
        Throwable v10_5 = v2_0.a;
        ((m8.c) v0_2).f(0);
        return v10_5;
    }
}
