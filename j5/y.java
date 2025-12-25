package j5;
public final class y implements t5.d {
    public static final j5.y a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;

    static y()
    {
        j5.y.a = new j5.y();
        j5.y.b = t5.c.a("platform");
        j5.y.c = t5.c.a("version");
        j5.y.d = t5.c.a("buildVersion");
        j5.y.e = t5.c.a("jailbroken");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).d(j5.y.b, ((j5.i1) ((j5.k2) p3)).a);
        ((t5.e) p4).f(j5.y.c, ((j5.i1) ((j5.k2) p3)).b);
        ((t5.e) p4).f(j5.y.d, ((j5.i1) ((j5.k2) p3)).c);
        ((t5.e) p4).a(j5.y.e, ((j5.i1) ((j5.k2) p3)).d);
        return;
    }
}
