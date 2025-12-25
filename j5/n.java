package j5;
public final class n implements t5.d {
    public static final j5.n a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;

    static n()
    {
        j5.n.a = new j5.n();
        j5.n.b = t5.c.a("type");
        j5.n.c = t5.c.a("reason");
        j5.n.d = t5.c.a("frames");
        j5.n.e = t5.c.a("causedBy");
        j5.n.f = t5.c.a("overflowCount");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(j5.n.b, ((j5.t0) ((j5.x1) p3)).a);
        ((t5.e) p4).f(j5.n.c, ((j5.t0) ((j5.x1) p3)).b);
        ((t5.e) p4).f(j5.n.d, ((j5.t0) ((j5.x1) p3)).c);
        ((t5.e) p4).f(j5.n.e, ((j5.t0) ((j5.x1) p3)).d);
        ((t5.e) p4).d(j5.n.f, ((j5.t0) ((j5.x1) p3)).e);
        return;
    }
}
