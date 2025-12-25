package u6;
public final synthetic class f implements s8.e {
    public static final u6.f a;
    private static final q8.d descriptor;

    static f()
    {
        String v0_1 = new u6.f();
        u6.f.a = v0_1;
        s8.m v1_1 = new s8.m("com.google.firebase.sessions.settings.SessionConfigs", v0_1, 5);
        v1_1.k("sessionsEnabled", 0);
        v1_1.k("sessionSamplingRate", 0);
        v1_1.k("sessionTimeoutSeconds", 0);
        v1_1.k("cacheDurationSeconds", 0);
        v1_1.k("cacheUpdatedTimeSeconds", 0);
        u6.f.descriptor = v1_1;
        return;
    }

    public final o8.a[] a()
    {
        int v0_2 = j5.t1.D(s8.a.a);
        o8.a v1_1 = j5.t1.D(s8.c.a);
        o8.a v2_1 = s8.f.a;
        o8.a v3 = j5.t1.D(v2_1);
        o8.a v2_0 = j5.t1.D(v2_1);
        o8.a v4_1 = j5.t1.D(s8.i.a);
        o8.a[] v5_1 = new o8.a[5];
        v5_1[0] = v0_2;
        v5_1[1] = v1_1;
        v5_1[2] = v3;
        v5_1[3] = v2_0;
        v5_1[4] = v4_1;
        return v5_1;
    }

    public final void b(u8.i p5, Object p6)
    {
        kotlin.jvm.internal.j.e(((u6.h) p6), "value");
        q8.d v0_1 = u6.f.descriptor;
        u8.i v5_1 = p5.a(v0_1);
        v5_1.g(v0_1, 0, s8.a.a, ((u6.h) p6).a);
        v5_1.g(v0_1, 1, s8.c.a, ((u6.h) p6).b);
        s8.i v1_1 = s8.f.a;
        v5_1.g(v0_1, 2, v1_1, ((u6.h) p6).c);
        v5_1.g(v0_1, 3, v1_1, ((u6.h) p6).d);
        v5_1.g(v0_1, 4, s8.i.a, ((u6.h) p6).e);
        v5_1.l(v0_1);
        return;
    }

    public final Object c(n.p p13)
    {
        kotlin.jvm.internal.j.e(p13, "decoder");
        q8.d v0_1 = u6.f.descriptor;
        o8.d v13_1 = p13.b(v0_1);
        int v5 = 0;
        Boolean v6_1 = 0;
        Double v7_0 = 0;
        Integer v8_0 = 0;
        Integer v9_0 = 0;
        Long v10_0 = 0;
        int v3_0 = 1;
        while (v3_0 != 0) {
            Object v4_2 = v13_1.c(v0_1);
            if (v4_2 == -1) {
                v3_0 = 0;
            } else {
                if (v4_2 == null) {
                    v6_1 = ((Boolean) v13_1.i(v0_1, 0, s8.a.a, v6_1));
                    v5 |= 1;
                } else {
                    if (v4_2 == 1) {
                        v7_0 = ((Double) v13_1.i(v0_1, 1, s8.c.a, v7_0));
                        v5 |= 2;
                    } else {
                        if (v4_2 == 2) {
                            v8_0 = ((Integer) v13_1.i(v0_1, 2, s8.f.a, v8_0));
                            v5 |= 4;
                        } else {
                            if (v4_2 == 3) {
                                v9_0 = ((Integer) v13_1.i(v0_1, 3, s8.f.a, v9_0));
                                v5 |= 8;
                            } else {
                                if (v4_2 != 4) {
                                    throw new o8.d(v4_2);
                                } else {
                                    v10_0 = ((Long) v13_1.i(v0_1, 4, s8.i.a, v10_0));
                                    v5 |= 16;
                                }
                            }
                        }
                    }
                }
            }
        }
        v13_1.n(v0_1);
        return new u6.h(v5, v6_1, v7_0, v8_0, v9_0, v10_0);
    }

    public final q8.d d()
    {
        return u6.f.descriptor;
    }
}
