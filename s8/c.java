package s8;
public final class c implements o8.a {
    public static final s8.c a;
    public static final s8.n b;

    static c()
    {
        s8.c.a = new s8.c();
        s8.c.b = new s8.n("kotlin.Double", q8.b.g);
        return;
    }

    public final void b(u8.i p5, Object p6)
    {
        u8.d v0_0 = ((Number) p6).doubleValue();
        String v6_6 = ((i2.m) p5.c);
        if (!p5.b) {
            ((h.f) v6_6.b).i(String.valueOf(v0_0));
        } else {
            p5.j(String.valueOf(v0_0));
        }
        ((t8.d) p5.g).getClass();
        if ((Double.isInfinite(v0_0)) || (Double.isNaN(v0_0))) {
            String v5_5 = Double.valueOf(v0_0);
            String v6_4 = ((h.f) v6_6.b).toString();
            StringBuilder v1_1 = new StringBuilder("Unexpected special floating-point value ");
            v1_1.append(v5_5);
            v1_1.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'\nCurrent output: ");
            v1_1.append(u8.g.d(v6_4, -1));
            throw new u8.d(v1_1.toString());
        } else {
            return;
        }
    }

    public final Object c(n.p p4)
    {
        kotlin.jvm.internal.j.e(p4, "decoder");
        a2.d v0_2 = ((a2.d) p4.d);
        try {
            int v1_6 = Double.parseDouble(v0_2.j());
            ((t8.b) p4.b).a.getClass();
        } catch (IllegalArgumentException) {
            Double v4_4 = new StringBuilder("Failed to parse type \'double\' for input \'");
            v4_4.append(v1_6);
            v4_4.append(39);
            a2.d.n(v0_2, v4_4.toString(), 0, 6);
            throw 0;
        }
        if ((Double.isInfinite(v1_6)) || (Double.isNaN(v1_6))) {
            Double v4_8 = Double.valueOf(v1_6);
            int v1_3 = new StringBuilder("Unexpected special floating-point value ");
            v1_3.append(v4_8);
            v1_3.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification");
            a2.d.n(v0_2, v1_3.toString(), 0, 2);
            throw 0;
        } else {
            return Double.valueOf(v1_6);
        }
    }

    public final q8.d d()
    {
        return s8.c.b;
    }
}
