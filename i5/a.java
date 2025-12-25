package i5;
public final class a implements t5.d {
    public static final i5.a a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;

    static a()
    {
        i5.a.a = new i5.a();
        i5.a.b = t5.c.a("rolloutId");
        i5.a.c = t5.c.a("parameterKey");
        i5.a.d = t5.c.a("parameterValue");
        i5.a.e = t5.c.a("variantId");
        i5.a.f = t5.c.a("templateVersion");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).f(i5.a.b, ((i5.b) ((i5.m) p4)).b);
        ((t5.e) p5).f(i5.a.c, ((i5.b) ((i5.m) p4)).c);
        ((t5.e) p5).f(i5.a.d, ((i5.b) ((i5.m) p4)).d);
        ((t5.e) p5).f(i5.a.e, ((i5.b) ((i5.m) p4)).e);
        ((t5.e) p5).c(i5.a.f, ((i5.b) ((i5.m) p4)).f);
        return;
    }
}
