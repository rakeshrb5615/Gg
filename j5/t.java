package j5;
public final class t implements t5.d {
    public static final j5.t a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;

    static t()
    {
        j5.t.a = new j5.t();
        j5.t.b = t5.c.a("timestamp");
        j5.t.c = t5.c.a("type");
        j5.t.d = t5.c.a("app");
        j5.t.e = t5.c.a("device");
        j5.t.f = t5.c.a("log");
        j5.t.g = t5.c.a("rollouts");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).c(j5.t.b, ((j5.p0) ((j5.j2) p4)).a);
        ((t5.e) p5).f(j5.t.c, ((j5.p0) ((j5.j2) p4)).b);
        ((t5.e) p5).f(j5.t.d, ((j5.p0) ((j5.j2) p4)).c);
        ((t5.e) p5).f(j5.t.e, ((j5.p0) ((j5.j2) p4)).d);
        ((t5.e) p5).f(j5.t.f, ((j5.p0) ((j5.j2) p4)).e);
        ((t5.e) p5).f(j5.t.g, ((j5.p0) ((j5.j2) p4)).f);
        return;
    }
}
