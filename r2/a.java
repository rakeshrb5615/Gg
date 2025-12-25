package r2;
public final class a implements t5.d {
    public static final r2.a a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;

    static a()
    {
        r2.a.a = new r2.a();
        r2.a.b = new t5.c("window", g2.g.i(g2.g.h(w5.e, new w5.a(1))));
        r2.a.c = new t5.c("logSourceMetrics", g2.g.i(g2.g.h(w5.e, new w5.a(2))));
        r2.a.d = new t5.c("globalMetrics", g2.g.i(g2.g.h(w5.e, new w5.a(3))));
        r2.a.e = new t5.c("appNamespace", g2.g.i(g2.g.h(w5.e, new w5.a(4))));
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(r2.a.b, ((u2.a) p3).a);
        ((t5.e) p4).f(r2.a.c, ((u2.a) p3).b);
        ((t5.e) p4).f(r2.a.d, ((u2.a) p3).c);
        ((t5.e) p4).f(r2.a.e, ((u2.a) p3).d);
        return;
    }
}
