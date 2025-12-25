package j5;
public final class v implements t5.d {
    public static final j5.v a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;

    static v()
    {
        j5.v.a = new j5.v();
        j5.v.b = t5.c.a("rolloutVariant");
        j5.v.c = t5.c.a("parameterKey");
        j5.v.d = t5.c.a("parameterValue");
        j5.v.e = t5.c.a("templateVersion");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).f(j5.v.b, ((j5.e1) ((j5.h2) p4)).a);
        ((t5.e) p5).f(j5.v.c, ((j5.e1) ((j5.h2) p4)).b);
        ((t5.e) p5).f(j5.v.d, ((j5.e1) ((j5.h2) p4)).c);
        ((t5.e) p5).c(j5.v.e, ((j5.e1) ((j5.h2) p4)).d);
        return;
    }
}
