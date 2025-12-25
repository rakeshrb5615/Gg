package r6;
public final class h implements t5.d {
    public static final r6.h a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;
    public static final t5.c h;

    static h()
    {
        r6.h.a = new r6.h();
        r6.h.b = t5.c.a("sessionId");
        r6.h.c = t5.c.a("firstSessionId");
        r6.h.d = t5.c.a("sessionIndex");
        r6.h.e = t5.c.a("eventTimestampUs");
        r6.h.f = t5.c.a("dataCollectionStatus");
        r6.h.g = t5.c.a("firebaseInstallationId");
        r6.h.h = t5.c.a("firebaseAuthenticationToken");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).f(r6.h.b, ((r6.v0) p4).a);
        ((t5.e) p5).f(r6.h.c, ((r6.v0) p4).b);
        ((t5.e) p5).d(r6.h.d, ((r6.v0) p4).c);
        ((t5.e) p5).c(r6.h.e, ((r6.v0) p4).d);
        ((t5.e) p5).f(r6.h.f, ((r6.v0) p4).e);
        ((t5.e) p5).f(r6.h.g, ((r6.v0) p4).f);
        ((t5.e) p5).f(r6.h.h, ((r6.v0) p4).g);
        return;
    }
}
