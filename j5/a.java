package j5;
public final class a implements t5.d {
    public static final j5.a a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;

    static a()
    {
        j5.a.a = new j5.a();
        j5.a.b = t5.c.a("arch");
        j5.a.c = t5.c.a("libraryName");
        j5.a.d = t5.c.a("buildId");
        return;
    }

    public final void a(Object p3, Object p4)
    {
        ((t5.e) p4).f(j5.a.b, ((j5.e0) ((j5.o1) p3)).a);
        ((t5.e) p4).f(j5.a.c, ((j5.e0) ((j5.o1) p3)).b);
        ((t5.e) p4).f(j5.a.d, ((j5.e0) ((j5.o1) p3)).c);
        return;
    }
}
