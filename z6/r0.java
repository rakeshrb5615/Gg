package z6;
public class r0 extends w6.z {

    public r0()
    {
        return;
    }

    public final Object b(e7.a p7)
    {
        w6.p v0_1 = new java.util.BitSet();
        p7.c();
        int v1_3 = p7.O();
        int v3_3 = 0;
        while (v1_3 != 2) {
            int v1_2;
            String v4_0 = u.e.c(v1_3);
            if ((v4_0 == 5) || (v4_0 == 6)) {
                int v1_0 = p7.G();
                if (v1_0 != 0) {
                    if (v1_0 != 1) {
                        int v1_1 = v1.a.p("Invalid bitset value ", v1_0, ", expected 0 or 1; at path ");
                        v1_1.append(p7.A(1));
                        throw new w6.p(v1_1.toString());
                    } else {
                        v1_2 = 1;
                    }
                } else {
                    v1_2 = 0;
                }
            } else {
                if (v4_0 != 7) {
                    int v3_2 = new StringBuilder("Invalid bitset value type: ");
                    v3_2.append(v1.a.z(v1_3));
                    v3_2.append("; at path ");
                    v3_2.append(p7.A(0));
                    throw new w6.p(v3_2.toString());
                } else {
                    v1_2 = p7.E();
                }
            }
            if (v1_2 != 0) {
                v0_1.set(v3_3);
            }
            v3_3++;
            v1_3 = p7.O();
        }
        p7.x();
        return v0_1;
    }

    public final void c(e7.b p5, Object p6)
    {
        p5.f();
        int v0 = ((java.util.BitSet) p6).length();
        int v1 = 0;
        while (v1 < v0) {
            p5.G(((long) ((java.util.BitSet) p6).get(v1)));
            v1++;
        }
        p5.x();
        return;
    }
}
