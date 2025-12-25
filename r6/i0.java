package r6;
public final class i0 implements a1.f1 {
    public final r6.t0 a;

    public i0(r6.t0 p2)
    {
        kotlin.jvm.internal.j.e(p2, "sessionGenerator");
        this.a = p2;
        return;
    }

    public final void a(Object p3, a1.n1 p4)
    {
        byte[] v3_3 = t8.b.d.b(r6.h0.Companion.serializer(), ((r6.h0) p3)).getBytes(b8.a.a);
        kotlin.jvm.internal.j.d(v3_3, "getBytes(...)");
        p4.write(v3_3);
        return;
    }

    public final Object b()
    {
        return new r6.h0(this.a.a(0), 0, 0);
    }

    public final Object c(java.io.FileInputStream p4)
    {
        try {
            a1.b v0_0 = t8.b.d;
            String v1_2 = new String(c4.b.S(p4), b8.a.a);
            v0_0.getClass();
            return ((r6.h0) v0_0.a(r6.h0.Companion.serializer(), v1_2));
        } catch (Exception v4_3) {
            throw new a1.b("Cannot parse session data", v4_3);
        }
    }
}
