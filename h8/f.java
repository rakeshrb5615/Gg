package h8;
public abstract class f {
    public static final d4.l a;

    static f()
    {
        h8.f.a = new d4.l("NULL", 4, 0);
        return;
    }

    public static final Object a(l7.h p2, Object p3, Object p4, u7.p p5, l7.c p6)
    {
        Object v4_1 = i8.a.l(p2, p4);
        Object v3_1;
        h8.k v0_1 = new h8.k(p6, p2);
        if (p5 != null) {
            kotlin.jvm.internal.u.a(2, p5);
            v3_1 = p5.invoke(p3, v0_1);
        } else {
            v3_1 = q4.b.U(p5, p3, v0_1);
        }
        i8.a.g(p2, v4_1);
        if (v3_1 == m7.a.a) {
            kotlin.jvm.internal.j.e(p6, "frame");
        }
        return v3_1;
    }
}
