package r6;
public final synthetic class y implements s8.e {
    public static final r6.y a;
    private static final q8.d descriptor;

    static y()
    {
        String v0_1 = new r6.y();
        r6.y.a = v0_1;
        s8.m v1_1 = new s8.m("com.google.firebase.sessions.ProcessData", v0_1, 2);
        v1_1.k("pid", 0);
        v1_1.k("uuid", 0);
        r6.y.descriptor = v1_1;
        return;
    }

    public final o8.a[] a()
    {
        o8.a[] v0_1 = new o8.a[2];
        v0_1[0] = s8.f.a;
        v0_1[1] = s8.p.a;
        return v0_1;
    }

    public final void b(u8.i p4, Object p5)
    {
        kotlin.jvm.internal.j.e(((r6.a0) p5), "value");
        q8.d v0_1 = r6.y.descriptor;
        u8.i v4_1 = p4.a(v0_1);
        int v1_1 = ((r6.a0) p5).a;
        v4_1.b(v0_1, 0);
        v4_1.c(v1_1);
        v4_1.k(v0_1, 1, ((r6.a0) p5).b);
        v4_1.l(v0_1);
        return;
    }

    public final Object c(n.p p10)
    {
        kotlin.jvm.internal.j.e(p10, "decoder");
        q8.d v0_1 = r6.y.descriptor;
        o8.d v10_5 = p10.b(v0_1);
        String v3 = 0;
        int v4 = 1;
        int v5 = 0;
        int v6 = 0;
        while (v4 != 0) {
            int v7 = v10_5.c(v0_1);
            if (v7 == -1) {
                v4 = 0;
            } else {
                if (v7 == 0) {
                    v6 = v10_5.e(v0_1, 0);
                    v5 |= 1;
                } else {
                    if (v7 != 1) {
                        throw new o8.d(v7);
                    } else {
                        v3 = v10_5.m(v0_1, 1);
                        v5 |= 2;
                    }
                }
            }
        }
        v10_5.n(v0_1);
        return new r6.a0(v5, v6, v3);
    }

    public final q8.d d()
    {
        return r6.y.descriptor;
    }
}
