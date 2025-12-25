package r6;
public final class f implements t5.d {
    public static final r6.f a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;

    static f()
    {
        r6.f.a = new r6.f();
        r6.f.b = t5.c.a("processName");
        r6.f.c = t5.c.a("pid");
        r6.f.d = t5.c.a("importance");
        r6.f.e = t5.c.a("defaultProcess");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(r6.f.b, ((r6.d0) p3).a);
        ((t5.e) p4).d(r6.f.c, ((r6.d0) p3).b);
        ((t5.e) p4).d(r6.f.d, ((r6.d0) p3).c);
        ((t5.e) p4).a(r6.f.e, ((r6.d0) p3).d);
        return;
    }
}
