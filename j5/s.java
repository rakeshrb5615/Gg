package j5;
public final class s implements t5.d {
    public static final j5.s a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;

    static s()
    {
        j5.s.a = new j5.s();
        j5.s.b = t5.c.a("batteryLevel");
        j5.s.c = t5.c.a("batteryVelocity");
        j5.s.d = t5.c.a("proximityOn");
        j5.s.e = t5.c.a("orientation");
        j5.s.f = t5.c.a("ramUsed");
        j5.s.g = t5.c.a("diskUsed");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).f(j5.s.b, ((j5.b1) ((j5.e2) p4)).a);
        ((t5.e) p5).d(j5.s.c, ((j5.b1) ((j5.e2) p4)).b);
        ((t5.e) p5).a(j5.s.d, ((j5.b1) ((j5.e2) p4)).c);
        ((t5.e) p5).d(j5.s.e, ((j5.b1) ((j5.e2) p4)).d);
        ((t5.e) p5).c(j5.s.f, ((j5.b1) ((j5.e2) p4)).e);
        ((t5.e) p5).c(j5.s.g, ((j5.b1) ((j5.e2) p4)).f);
        return;
    }
}
