package j5;
public final class r implements t5.d {
    public static final j5.r a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;

    static r()
    {
        j5.r.a = new j5.r();
        j5.r.b = t5.c.a("processName");
        j5.r.c = t5.c.a("pid");
        j5.r.d = t5.c.a("importance");
        j5.r.e = t5.c.a("defaultProcess");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(j5.r.b, ((j5.z0) ((j5.c2) p3)).a);
        ((t5.e) p4).d(j5.r.c, ((j5.z0) ((j5.c2) p3)).b);
        ((t5.e) p4).d(j5.r.d, ((j5.z0) ((j5.c2) p3)).c);
        ((t5.e) p4).a(j5.r.e, ((j5.z0) ((j5.c2) p3)).d);
        return;
    }
}
