package q2;
public final class j implements t5.d {
    public static final q2.j a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;
    public static final t5.c h;

    static j()
    {
        q2.j.a = new q2.j();
        q2.j.b = t5.c.a("requestTimeMs");
        q2.j.c = t5.c.a("requestUptimeMs");
        q2.j.d = t5.c.a("clientInfo");
        q2.j.e = t5.c.a("logSource");
        q2.j.f = t5.c.a("logSourceName");
        q2.j.g = t5.c.a("logEvent");
        q2.j.h = t5.c.a("qosTier");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).c(q2.j.b, ((q2.t) ((q2.f0) p4)).a);
        ((t5.e) p5).c(q2.j.c, ((q2.t) ((q2.f0) p4)).b);
        ((t5.e) p5).f(q2.j.d, ((q2.t) ((q2.f0) p4)).c);
        ((t5.e) p5).f(q2.j.e, ((q2.t) ((q2.f0) p4)).d);
        ((t5.e) p5).f(q2.j.f, ((q2.t) ((q2.f0) p4)).e);
        ((t5.e) p5).f(q2.j.g, ((q2.t) ((q2.f0) p4)).f);
        ((t5.e) p5).f(q2.j.h, q2.j0.a);
        return;
    }
}
