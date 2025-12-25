package j5;
public final class m implements t5.d {
    public static final j5.m a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;

    static m()
    {
        j5.m.a = new j5.m();
        j5.m.b = t5.c.a("threads");
        j5.m.c = t5.c.a("exception");
        j5.m.d = t5.c.a("appExitInfo");
        j5.m.e = t5.c.a("signal");
        j5.m.f = t5.c.a("binaries");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(j5.m.b, ((j5.r0) ((j5.b2) p3)).a);
        ((t5.e) p4).f(j5.m.c, ((j5.r0) ((j5.b2) p3)).b);
        ((t5.e) p4).f(j5.m.d, ((j5.r0) ((j5.b2) p3)).c);
        ((t5.e) p4).f(j5.m.e, ((j5.r0) ((j5.b2) p3)).d);
        ((t5.e) p4).f(j5.m.f, ((j5.r0) ((j5.b2) p3)).e);
        return;
    }
}
