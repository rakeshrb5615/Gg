package s8;
public final class f implements o8.a {
    public static final s8.f a;
    public static final s8.n b;

    static f()
    {
        s8.f.a = new s8.f();
        s8.f.b = new s8.n("kotlin.Int", q8.b.h);
        return;
    }

    public final void b(u8.i p1, Object p2)
    {
        p1.c(((Number) p2).intValue());
        return;
    }

    public final Object c(n.p p2)
    {
        kotlin.jvm.internal.j.e(p2, "decoder");
        return Integer.valueOf(p2.d());
    }

    public final q8.d d()
    {
        return s8.f.b;
    }
}
