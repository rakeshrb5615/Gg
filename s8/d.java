package s8;
public final class d {
    public static final long[] e;
    public final q8.d a;
    public final u8.e b;
    public long c;
    public final long[] d;

    static d()
    {
        long[] v0_1 = new long[0];
        s8.d.e = v0_1;
        return;
    }

    public d(q8.d p5, u8.e p6)
    {
        kotlin.jvm.internal.j.e(p5, "descriptor");
        this.a = p5;
        this.b = p6;
        long[] v5_2 = p5.d();
        long v2_1 = 0;
        if (v5_2 > 64) {
            this.c = 0;
            int v6_2 = ((v5_2 - 1) >> 6);
            long[] v3 = new long[v6_2];
            if ((v5_2 & 63) != 0) {
                v3[(v6_2 - 1)] = (-1 << v5_2);
            }
            this.d = v3;
            return;
        } else {
            if (v5_2 != 64) {
                v2_1 = (-1 << v5_2);
            }
            this.c = v2_1;
            this.d = s8.d.e;
            return;
        }
    }
}
