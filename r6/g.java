package r6;
public final class g implements t5.d {
    public static final r6.g a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;

    static g()
    {
        r6.g.a = new r6.g();
        r6.g.b = t5.c.a("eventType");
        r6.g.c = t5.c.a("sessionData");
        r6.g.d = t5.c.a("applicationInfo");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((r6.n0) p3).getClass();
        ((t5.e) p4).f(r6.g.b, r6.n.b);
        ((t5.e) p4).f(r6.g.c, ((r6.n0) p3).a);
        ((t5.e) p4).f(r6.g.d, ((r6.n0) p3).b);
        return;
    }
}
