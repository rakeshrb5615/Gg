package r2;
public final class d implements t5.d {
    public static final r2.d a;
    public static final t5.c b;
    public static final t5.c c;

    static d()
    {
        r2.d.a = new r2.d();
        r2.d.b = new t5.c("logSource", g2.g.i(g2.g.h(w5.e, new w5.a(1))));
        r2.d.c = new t5.c("logEventDropped", g2.g.i(g2.g.h(w5.e, new w5.a(2))));
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(r2.d.b, ((u2.e) p3).a);
        ((t5.e) p4).f(r2.d.c, ((u2.e) p3).b);
        return;
    }
}
