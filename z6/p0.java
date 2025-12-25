package z6;
public class p0 extends w6.z {

    public p0()
    {
        return;
    }

    public final Object b(e7.a p5)
    {
        String v2 = 0;
        if (p5.O() != 9) {
            int v5_2;
            java.util.Locale v0_8 = new java.util.StringTokenizer(p5.M(), "_");
            if (!v0_8.hasMoreElements()) {
                v5_2 = 0;
            } else {
                v5_2 = v0_8.nextToken();
            }
            int v1_1;
            if (!v0_8.hasMoreElements()) {
                v1_1 = 0;
            } else {
                v1_1 = v0_8.nextToken();
            }
            if (v0_8.hasMoreElements()) {
                v2 = v0_8.nextToken();
            }
            if ((v1_1 != 0) || (v2 != null)) {
                if (v2 != null) {
                    return new java.util.Locale(v5_2, v1_1, v2);
                } else {
                    return new java.util.Locale(v5_2, v1_1);
                }
            } else {
                return new java.util.Locale(v5_2);
            }
        } else {
            p5.K();
            return 0;
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        String v2_2;
        if (((java.util.Locale) p2) != null) {
            v2_2 = ((java.util.Locale) p2).toString();
        } else {
            v2_2 = 0;
        }
        p1.I(v2_2);
        return;
    }
}
