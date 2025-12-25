package y8;
public final class g extends x8.o {
    public final long b;
    public final boolean c;
    public long d;

    public g(x8.h0 p1, long p2, boolean p4)
    {
        super(p1);
        super.b = p2;
        super.c = p4;
        return;
    }

    public final long t(x8.g p10, long p11)
    {
        kotlin.jvm.internal.j.e(p10, "sink");
        x8.g v0_3 = this.d;
        long v2 = this.b;
        if (v0_3 <= v2) {
            if (this.c) {
                x8.g v0_1 = (v2 - v0_3);
                if (v0_1 != 0) {
                    p11 = Math.min(p11, v0_1);
                } else {
                    return -1;
                }
            }
        } else {
            p11 = 0;
        }
        long v11_1 = super.t(p10, p11);
        x8.g v0_2 = v11_1 cmp -1;
        if (v0_2 != null) {
            this.d = (this.d + v11_1);
        }
        long v4_3 = this.d;
        long v1 = v4_3 cmp v2;
        if (((v1 >= 0) || (v0_2 != null)) && (v1 <= 0)) {
            return v11_1;
        } else {
            if ((v11_1 > 0) && (v1 > 0)) {
                long v11_4 = (p10.b - (v4_3 - v2));
                x8.g v0_5 = new x8.g();
                v0_5.L(p10);
                p10.k(v0_5, v11_4);
                v0_5.s();
            }
            long v11_6 = new StringBuilder("expected ");
            v11_6.append(v2);
            v11_6.append(" bytes but got ");
            v11_6.append(this.d);
            throw new java.io.IOException(v11_6.toString());
        }
    }
}
