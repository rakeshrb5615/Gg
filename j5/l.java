package j5;
public final class l implements t5.d {
    public static final j5.l a;
    public static final t5.c b;
    public static final t5.c c;
    public static final t5.c d;
    public static final t5.c e;

    static l()
    {
        j5.l.a = new j5.l();
        j5.l.b = t5.c.a("baseAddress");
        j5.l.c = t5.c.a("size");
        j5.l.d = t5.c.a("name");
        j5.l.e = t5.c.a("uuid");
        return;
    }

    public final void a(Object p4, Object p5)
    {
        int v4_3;
        ((t5.e) p5).c(j5.l.b, ((j5.s0) ((j5.w1) p4)).a);
        ((t5.e) p5).c(j5.l.c, ((j5.s0) ((j5.w1) p4)).b);
        ((t5.e) p5).f(j5.l.d, ((j5.s0) ((j5.w1) p4)).c);
        int v4_2 = ((j5.s0) ((j5.w1) p4)).d;
        if (v4_2 == 0) {
            v4_3 = 0;
        } else {
            v4_3 = v4_2.getBytes(j5.n2.a);
        }
        ((t5.e) p5).f(j5.l.e, v4_3);
        return;
    }
}
