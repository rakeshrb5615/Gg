package j5;
public final class o implements t5.d {
    public static final j5.o a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;

    static o()
    {
        j5.o.a = new j5.o();
        j5.o.b = t5.c.a("name");
        j5.o.c = t5.c.a("code");
        j5.o.d = t5.c.a("address");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).f(j5.o.b, ((j5.u0) ((j5.y1) p4)).a);
        ((t5.e) p5).f(j5.o.c, ((j5.u0) ((j5.y1) p4)).b);
        ((t5.e) p5).c(j5.o.d, ((j5.u0) ((j5.y1) p4)).c);
        return;
    }
}
