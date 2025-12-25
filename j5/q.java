package j5;
public final class q implements t5.d {
    public static final j5.q a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;

    static q()
    {
        j5.q.a = new j5.q();
        j5.q.b = t5.c.a("pc");
        j5.q.c = t5.c.a("symbol");
        j5.q.d = t5.c.a("file");
        j5.q.e = t5.c.a("offset");
        j5.q.f = t5.c.a("importance");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).c(j5.q.b, ((j5.x0) ((j5.z1) p4)).a);
        ((t5.e) p5).f(j5.q.c, ((j5.x0) ((j5.z1) p4)).b);
        ((t5.e) p5).f(j5.q.d, ((j5.x0) ((j5.z1) p4)).c);
        ((t5.e) p5).c(j5.q.e, ((j5.x0) ((j5.z1) p4)).d);
        ((t5.e) p5).d(j5.q.f, ((j5.x0) ((j5.z1) p4)).e);
        return;
    }
}
