package r6;
public final class e implements t5.d {
    public static final r6.e a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;

    static e()
    {
        r6.e.a = new r6.e();
        r6.e.b = t5.c.a("performance");
        r6.e.c = t5.c.a("crashlytics");
        r6.e.d = t5.c.a("sessionSamplingRate");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        ((t5.e) p5).f(r6.e.b, ((r6.k) p4).a);
        ((t5.e) p5).f(r6.e.c, ((r6.k) p4).b);
        ((t5.e) p5).b(r6.e.d, ((r6.k) p4).c);
        return;
    }
}
