package q6;
public final class a implements t5.d {
    public static final q6.a a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;

    static a()
    {
        q6.a.a = new q6.a();
        q6.a.b = t5.c.a("rolloutId");
        q6.a.c = t5.c.a("variantId");
        q6.a.d = t5.c.a("parameterKey");
        q6.a.e = t5.c.a("parameterValue");
        q6.a.f = t5.c.a("templateVersion");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).f(q6.a.b, ((q6.c) ((q6.e) p4)).b);
        ((t5.e) p5).f(q6.a.c, ((q6.c) ((q6.e) p4)).c);
        ((t5.e) p5).f(q6.a.d, ((q6.c) ((q6.e) p4)).d);
        ((t5.e) p5).f(q6.a.e, ((q6.c) ((q6.e) p4)).e);
        ((t5.e) p5).c(q6.a.f, ((q6.c) ((q6.e) p4)).f);
        return;
    }
}
