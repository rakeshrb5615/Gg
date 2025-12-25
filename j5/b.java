package j5;
public final class b implements t5.d {
    public static final j5.b a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;
    public static final t5.c h;
    public static final t5.c i;
    public static final t5.c j;

    static b()
    {
        j5.b.a = new j5.b();
        j5.b.b = t5.c.a("pid");
        j5.b.c = t5.c.a("processName");
        j5.b.d = t5.c.a("reasonCode");
        j5.b.e = t5.c.a("importance");
        j5.b.f = t5.c.a("pss");
        j5.b.g = t5.c.a("rss");
        j5.b.h = t5.c.a("timestamp");
        j5.b.i = t5.c.a("traceFile");
        j5.b.j = t5.c.a("buildIdMappingForArch");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).d(j5.b.b, ((j5.d0) ((j5.p1) p4)).a);
        ((t5.e) p5).f(j5.b.c, ((j5.d0) ((j5.p1) p4)).b);
        ((t5.e) p5).d(j5.b.d, ((j5.d0) ((j5.p1) p4)).c);
        ((t5.e) p5).d(j5.b.e, ((j5.d0) ((j5.p1) p4)).d);
        ((t5.e) p5).c(j5.b.f, ((j5.d0) ((j5.p1) p4)).e);
        ((t5.e) p5).c(j5.b.g, ((j5.d0) ((j5.p1) p4)).f);
        ((t5.e) p5).c(j5.b.h, ((j5.d0) ((j5.p1) p4)).g);
        ((t5.e) p5).f(j5.b.i, ((j5.d0) ((j5.p1) p4)).h);
        ((t5.e) p5).f(j5.b.j, ((j5.d0) ((j5.p1) p4)).i);
        return;
    }
}
