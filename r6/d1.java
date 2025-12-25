package r6;
public final synthetic class d1 implements s8.e {
    public static final r6.d1 a;
    private static final q8.d descriptor;

    static d1()
    {
        String v0_1 = new r6.d1();
        r6.d1.a = v0_1;
        s8.m v1_1 = new s8.m("com.google.firebase.sessions.Time", v0_1, 3);
        v1_1.k("ms", 0);
        v1_1.k("us", 1);
        v1_1.k("seconds", 1);
        r6.d1.descriptor = v1_1;
        return;
    }

    public final o8.a[] a()
    {
        o8.a[] v0_1 = new o8.a[3];
        s8.i v1 = s8.i.a;
        v0_1[0] = v1;
        v0_1[1] = v1;
        v0_1[2] = v1;
        return v0_1;
    }

    public final void b(u8.i p11, Object p12)
    {
        kotlin.jvm.internal.j.e(((r6.f1) p12), "value");
        q8.d v0_1 = r6.d1.descriptor;
        u8.i v11_1 = p11.a(v0_1);
        long v1_1 = ((r6.f1) p12).a;
        long v3 = ((r6.f1) p12).c;
        long v5_1 = ((r6.f1) p12).b;
        v11_1.e(v0_1, 0, v1_1);
        if ((v11_1.o(v0_1)) || (v5_1 != (((long) 1000) * v1_1))) {
            v11_1.e(v0_1, 1, v5_1);
        }
        if ((v11_1.o(v0_1)) || (v3 != (v1_1 / ((long) 1000)))) {
            v11_1.e(v0_1, 2, v3);
        }
        v11_1.l(v0_1);
        return;
    }

    public final Object c(n.p p14)
    {
        kotlin.jvm.internal.j.e(p14, "decoder");
        q8.d v0_1 = r6.d1.descriptor;
        o8.d v14_3 = p14.b(v0_1);
        int v6 = 0;
        long v7 = 0;
        long v9 = 0;
        long v11 = 0;
        int v3_0 = 1;
        while (v3_0 != 0) {
            int v4 = v14_3.c(v0_1);
            if (v4 == -1) {
                v3_0 = 0;
            } else {
                if (v4 == 0) {
                    v7 = v14_3.g(v0_1, 0);
                    v6 |= 1;
                } else {
                    if (v4 == 1) {
                        v9 = v14_3.g(v0_1, 1);
                        v6 |= 2;
                    } else {
                        if (v4 != 2) {
                            throw new o8.d(v4);
                        } else {
                            v11 = v14_3.g(v0_1, 2);
                            v6 |= 4;
                        }
                    }
                }
            }
        }
        v14_3.n(v0_1);
        return new r6.f1(v6, v7, v9, v11);
    }

    public final q8.d d()
    {
        return r6.d1.descriptor;
    }
}
