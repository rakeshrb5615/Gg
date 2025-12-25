package r2;
public final class f implements t5.d {
    public static final r2.f a;
    public static final t5.c b;
    public static final t5.c c;

    static f()
    {
        r2.f.a = new r2.f();
        r2.f.b = new t5.c("currentCacheSizeBytes", g2.g.i(g2.g.h(w5.e, new w5.a(1))));
        r2.f.c = new t5.c("maxCacheSizeBytes", g2.g.i(g2.g.h(w5.e, new w5.a(2))));
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).c(r2.f.b, ((u2.f) p4).a);
        ((t5.e) p5).c(r2.f.c, ((u2.f) p4).b);
        return;
    }
}
