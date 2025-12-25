package r6;
public final synthetic class f0 implements s8.e {
    public static final r6.f0 a;
    private static final q8.d descriptor;

    static f0()
    {
        String v0_1 = new r6.f0();
        r6.f0.a = v0_1;
        s8.m v1_1 = new s8.m("com.google.firebase.sessions.SessionData", v0_1, 3);
        v1_1.k("sessionDetails", 0);
        v1_1.k("backgroundTime", 1);
        v1_1.k("processDataMap", 1);
        r6.f0.descriptor = v1_1;
        return;
    }

    public final o8.a[] a()
    {
        o8.a v1_1 = j5.t1.D(r6.d1.a);
        o8.a v0_2 = j5.t1.D(r6.h0.d[2]);
        o8.a[] v3_1 = new o8.a[3];
        v3_1[0] = r6.k0.a;
        v3_1[1] = v1_1;
        v3_1[2] = v0_2;
        return v3_1;
    }

    public final void b(u8.i p7, Object p8)
    {
        kotlin.jvm.internal.j.e(((r6.h0) p8), "value");
        q8.d v0_1 = r6.f0.descriptor;
        u8.i v7_1 = p7.a(v0_1);
        java.util.Map v4 = ((r6.h0) p8).c;
        int v8_2 = ((r6.h0) p8).b;
        v7_1.h(v0_1, 0, r6.k0.a, ((r6.h0) p8).a);
        if ((v7_1.o(v0_1)) || (v8_2 != 0)) {
            v7_1.g(v0_1, 1, r6.d1.a, v8_2);
        }
        if ((v7_1.o(v0_1)) || (v4 != null)) {
            v7_1.g(v0_1, 2, r6.h0.d[2], v4);
        }
        v7_1.l(v0_1);
        return;
    }

    public final Object c(n.p p12)
    {
        kotlin.jvm.internal.j.e(p12, "decoder");
        q8.d v0_1 = r6.f0.descriptor;
        o8.d v12_5 = p12.b(v0_1);
        r6.m0 v4_1 = 0;
        int v7 = 1;
        int v8 = 0;
        r6.f1 v5_0 = 0;
        java.util.Map v6_0 = 0;
        while (v7 != 0) {
            o8.a v9_0 = v12_5.c(v0_1);
            if (v9_0 == -1) {
                v7 = 0;
            } else {
                if (v9_0 == null) {
                    v4_1 = ((r6.m0) v12_5.j(v0_1, 0, r6.k0.a, v4_1));
                    v8 |= 1;
                } else {
                    if (v9_0 == 1) {
                        v5_0 = ((r6.f1) v12_5.i(v0_1, 1, r6.d1.a, v5_0));
                        v8 |= 2;
                    } else {
                        if (v9_0 != 2) {
                            throw new o8.d(v9_0);
                        } else {
                            v6_0 = ((java.util.Map) v12_5.i(v0_1, 2, r6.h0.d[2], v6_0));
                            v8 |= 4;
                        }
                    }
                }
            }
        }
        v12_5.n(v0_1);
        return new r6.h0(v8, v4_1, v5_0, v6_0);
    }

    public final q8.d d()
    {
        return r6.f0.descriptor;
    }
}
