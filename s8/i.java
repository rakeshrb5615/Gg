package s8;
public final class i implements o8.a {
    public static final s8.i a;
    public static final s8.n b;

    static i()
    {
        s8.i.a = new s8.i();
        s8.i.b = new s8.n("kotlin.Long", q8.b.i);
        return;
    }

    public final void b(u8.i p3, Object p4)
    {
        p3.d(((Number) p4).longValue());
        return;
    }

    public final Object c(n.p p3)
    {
        kotlin.jvm.internal.j.e(p3, "decoder");
        return Long.valueOf(p3.f());
    }

    public final q8.d d()
    {
        return s8.i.b;
    }
}
