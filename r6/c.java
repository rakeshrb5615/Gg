package r6;
public final class c implements t5.d {
    public static final r6.c a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;

    static c()
    {
        r6.c.a = new r6.c();
        r6.c.b = t5.c.a("packageName");
        r6.c.c = t5.c.a("versionName");
        r6.c.d = t5.c.a("appBuildVersion");
        r6.c.e = t5.c.a("deviceManufacturer");
        r6.c.f = t5.c.a("currentProcessDetails");
        r6.c.g = t5.c.a("appProcessDetails");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(r6.c.b, ((r6.a) p3).a);
        ((t5.e) p4).f(r6.c.c, ((r6.a) p3).b);
        ((t5.e) p4).f(r6.c.d, ((r6.a) p3).c);
        ((t5.e) p4).f(r6.c.e, android.os.Build.MANUFACTURER);
        ((t5.e) p4).f(r6.c.f, ((r6.a) p3).d);
        ((t5.e) p4).f(r6.c.g, ((r6.a) p3).e);
        return;
    }
}
