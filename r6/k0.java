package r6;
public final synthetic class k0 implements s8.e {
    public static final r6.k0 a;
    private static final q8.d descriptor;

    static k0()
    {
        String v0_1 = new r6.k0();
        r6.k0.a = v0_1;
        s8.m v1_1 = new s8.m("com.google.firebase.sessions.SessionDetails", v0_1, 4);
        v1_1.k("sessionId", 0);
        v1_1.k("firstSessionId", 0);
        v1_1.k("sessionIndex", 0);
        v1_1.k("sessionStartTimestampUs", 0);
        r6.k0.descriptor = v1_1;
        return;
    }

    public final o8.a[] a()
    {
        o8.a[] v0_1 = new o8.a[4];
        s8.i v1_1 = s8.p.a;
        v0_1[0] = v1_1;
        v0_1[1] = v1_1;
        v0_1[2] = s8.f.a;
        v0_1[3] = s8.i.a;
        return v0_1;
    }

    public final void b(u8.i p5, Object p6)
    {
        kotlin.jvm.internal.j.e(((r6.m0) p6), "value");
        q8.d v0_1 = r6.k0.descriptor;
        u8.i v5_1 = p5.a(v0_1);
        v5_1.k(v0_1, 0, ((r6.m0) p6).a);
        v5_1.k(v0_1, 1, ((r6.m0) p6).b);
        int v1_0 = ((r6.m0) p6).c;
        v5_1.b(v0_1, 2);
        v5_1.c(v1_0);
        v5_1.e(v0_1, 3, ((r6.m0) p6).d);
        v5_1.l(v0_1);
        return;
    }

    public final Object c(n.p p14)
    {
        kotlin.jvm.internal.j.e(p14, "decoder");
        q8.d v0_1 = r6.k0.descriptor;
        o8.d v14_1 = p14.b(v0_1);
        int v10 = 0;
        int v11 = 0;
        String v9 = 0;
        String v12 = 0;
        long v7 = 0;
        int v3_0 = 1;
        while (v3_0 != 0) {
            int v4_0 = v14_1.c(v0_1);
            if (v4_0 == -1) {
                v3_0 = 0;
            } else {
                if (v4_0 == 0) {
                    v9 = v14_1.m(v0_1, 0);
                    v10 |= 1;
                } else {
                    if (v4_0 == 1) {
                        v12 = v14_1.m(v0_1, 1);
                        v10 |= 2;
                    } else {
                        if (v4_0 == 2) {
                            v11 = v14_1.e(v0_1, 2);
                            v10 |= 4;
                        } else {
                            if (v4_0 != 3) {
                                throw new o8.d(v4_0);
                            } else {
                                v7 = v14_1.g(v0_1, 3);
                                v10 |= 8;
                            }
                        }
                    }
                }
            }
        }
        v14_1.n(v0_1);
        return new r6.m0(v7, v9, v10, v11, v12);
    }

    public final q8.d d()
    {
        return r6.k0.descriptor;
    }
}
