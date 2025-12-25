package u6;
public final class i implements a1.f1 {
    public static final u6.i a;
    public static final u6.h b;

    static i()
    {
        u6.i.a = new u6.i();
        u6.i.b = new u6.h(0, 0, 0, 0, 0);
        return;
    }

    public final void a(Object p3, a1.n1 p4)
    {
        byte[] v3_3 = t8.b.d.b(u6.h.Companion.serializer(), ((u6.h) p3)).getBytes(b8.a.a);
        kotlin.jvm.internal.j.d(v3_3, "getBytes(...)");
        p4.write(v3_3);
        return;
    }

    public final bridge synthetic Object b()
    {
        return u6.i.b;
    }

    public final Object c(java.io.FileInputStream p4)
    {
        try {
            a1.b v0_0 = t8.b.d;
            String v1_2 = new String(c4.b.S(p4), b8.a.a);
            v0_0.getClass();
            return ((u6.h) v0_0.a(u6.h.Companion.serializer(), v1_2));
        } catch (Exception v4_3) {
            throw new a1.b("Cannot parse session configs", v4_3);
        }
    }
}
