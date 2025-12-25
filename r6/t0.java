package r6;
public final class t0 {
    public final r6.g1 a;
    public final r6.h1 b;

    public t0(r6.g1 p2, r6.h1 p3)
    {
        kotlin.jvm.internal.j.e(p2, "timeProvider");
        kotlin.jvm.internal.j.e(p3, "uuidGenerator");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final r6.m0 a(r6.m0 p9)
    {
        String v5;
        this.b.getClass();
        String v0_4 = java.util.UUID.randomUUID();
        kotlin.jvm.internal.j.d(v0_4, "randomUUID(...)");
        String v0_5 = v0_4.toString();
        kotlin.jvm.internal.j.d(v0_5, "toString(...)");
        String v4 = b8.p.n0(v0_5, "-", "").toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.j.d(v4, "toLowerCase(...)");
        if (p9 == null) {
            v5 = v4;
        } else {
            String v0_3 = p9.b;
            if (v0_3 != null) {
                v5 = v0_3;
            }
        }
        r6.f1 v9_1;
        if (p9 == null) {
            v9_1 = 0;
        } else {
            v9_1 = (p9.c + 1);
        }
        return new r6.m0(v9_1, v4, v5, this.a.a().b);
    }
}
