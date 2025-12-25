package r6;
public final class d implements t5.d {
    public static final r6.d a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;
    public static final t5.c f;
    public static final t5.c g;

    static d()
    {
        r6.d.a = new r6.d();
        r6.d.b = t5.c.a("appId");
        r6.d.c = t5.c.a("deviceModel");
        r6.d.d = t5.c.a("sessionSdkVersion");
        r6.d.e = t5.c.a("osVersion");
        r6.d.f = t5.c.a("logEnvironment");
        r6.d.g = t5.c.a("androidAppInfo");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(r6.d.b, ((r6.b) p3).a);
        ((t5.e) p4).f(r6.d.c, android.os.Build.MODEL);
        ((t5.e) p4).f(r6.d.d, "3.0.3");
        ((t5.e) p4).f(r6.d.e, android.os.Build$VERSION.RELEASE);
        ((t5.e) p4).f(r6.d.f, r6.x.b);
        ((t5.e) p4).f(r6.d.g, ((r6.b) p3).b);
        return;
    }
}
