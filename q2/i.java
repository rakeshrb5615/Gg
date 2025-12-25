package q2;
public final class i implements t5.d {
    public static final q2.i a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;
    public static final t5.c h;
    public static final t5.c i;
    public static final t5.c j;

    static i()
    {
        q2.i.a = new q2.i();
        q2.i.b = t5.c.a("eventTimeMs");
        q2.i.c = t5.c.a("eventCode");
        q2.i.d = t5.c.a("complianceData");
        q2.i.e = t5.c.a("eventUptimeMs");
        q2.i.f = t5.c.a("sourceExtension");
        q2.i.g = t5.c.a("sourceExtensionJsonProto3");
        q2.i.h = t5.c.a("timezoneOffsetSeconds");
        q2.i.i = t5.c.a("networkConnectionInfo");
        q2.i.j = t5.c.a("experimentIds");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).c(q2.i.b, ((q2.s) ((q2.e0) p4)).a);
        ((t5.e) p5).f(q2.i.c, ((q2.s) ((q2.e0) p4)).b);
        ((t5.e) p5).f(q2.i.d, ((q2.s) ((q2.e0) p4)).c);
        ((t5.e) p5).c(q2.i.e, ((q2.s) ((q2.e0) p4)).d);
        ((t5.e) p5).f(q2.i.f, ((q2.s) ((q2.e0) p4)).e);
        ((t5.e) p5).f(q2.i.g, ((q2.s) ((q2.e0) p4)).f);
        ((t5.e) p5).c(q2.i.h, ((q2.s) ((q2.e0) p4)).g);
        ((t5.e) p5).f(q2.i.i, ((q2.s) ((q2.e0) p4)).h);
        ((t5.e) p5).f(q2.i.j, ((q2.s) ((q2.e0) p4)).i);
        return;
    }
}
