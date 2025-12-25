package r2;
public final class r {
    public static volatile r2.k e;
    public final a3.a a;
    public final a3.a b;
    public final w2.b c;
    public final o5.d d;

    public r(a3.a p1, a3.a p2, w2.b p3, o5.d p4, j6.s p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        ((java.util.concurrent.Executor) p5.b).execute(new androidx.lifecycle.g0(p5, 14));
        return;
    }

    public static r2.r a()
    {
        IllegalStateException v0_0 = r2.r.e;
        if (v0_0 == null) {
            throw new IllegalStateException("Not initialized!");
        } else {
            return ((r2.r) v0_0.f.get());
        }
    }

    public static void b(android.content.Context p2)
    {
        if (r2.r.e != null) {
            return;
        } else {
            if (r2.r.e == null) {
                c4.f v1_2 = new c4.f();
                p2.getClass();
                v1_2.a = p2;
                r2.r.e = v1_2.b();
            }
            return;
        }
    }

    public final r2.p c(r2.l p7)
    {
        java.util.Set v1_2;
        if (p7 == null) {
            v1_2 = java.util.Collections.singleton(new o2.c("proto"));
        } else {
            v1_2 = java.util.Collections.unmodifiableSet(p2.a.d);
        }
        r2.j v7_4;
        b8.g v2_0 = r2.j.a();
        p7.getClass();
        v2_0.b = "cct";
        java.nio.charset.Charset v3_1 = ((p2.a) p7).a;
        r2.j v7_2 = ((p2.a) p7).b;
        if ((v7_2 != null) || (v3_1 != null)) {
            if (v7_2 == null) {
                v7_2 = "";
            }
            v7_4 = g2.g.f("1$", v3_1, "\\", v7_2).getBytes(java.nio.charset.Charset.forName("UTF-8"));
        } else {
            v7_4 = 0;
        }
        v2_0.c = v7_4;
        return new r2.p(v1_2, v2_0.a(), this);
    }
}
