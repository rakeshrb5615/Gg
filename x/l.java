package x;
public final class l {
    public x.o a;
    public java.util.ArrayList b;

    public static long a(x.f p9, long p10)
    {
        long v0_0 = p9.d;
        x.f v1_0 = p9.k;
        if (!(v0_0 instanceof x.j)) {
            long v2_3 = v1_0.size();
            int v3 = 0;
            long v4 = p10;
            while (v3 < v2_3) {
                long v6_1 = ((x.d) v1_0.get(v3));
                if ((v6_1 instanceof x.f)) {
                    long v6_2 = ((x.f) v6_1);
                    if (v6_2.d != v0_0) {
                        v4 = Math.min(v4, x.l.a(v6_2, (((long) v6_2.f) + p10)));
                    }
                }
                v3++;
            }
            long v2_0 = v0_0.h;
            if (p9 != v0_0.i) {
                return v4;
            } else {
                long v10_1 = (p10 - v0_0.j());
                return Math.min(Math.min(v4, x.l.a(v2_0, v10_1)), (v10_1 - ((long) v2_0.f)));
            }
        } else {
            return p10;
        }
    }

    public static long b(x.f p9, long p10)
    {
        long v0_0 = p9.d;
        x.f v1_0 = p9.k;
        if (!(v0_0 instanceof x.j)) {
            long v2_3 = v1_0.size();
            int v3 = 0;
            long v4 = p10;
            while (v3 < v2_3) {
                long v6_1 = ((x.d) v1_0.get(v3));
                if ((v6_1 instanceof x.f)) {
                    long v6_2 = ((x.f) v6_1);
                    if (v6_2.d != v0_0) {
                        v4 = Math.max(v4, x.l.b(v6_2, (((long) v6_2.f) + p10)));
                    }
                }
                v3++;
            }
            long v2_0 = v0_0.i;
            if (p9 != v0_0.h) {
                return v4;
            } else {
                long v0_2 = (v0_0.j() + p10);
                return Math.max(Math.max(v4, x.l.b(v2_0, v0_2)), (v0_2 - ((long) v2_0.f)));
            }
        } else {
            return p10;
        }
    }
}
