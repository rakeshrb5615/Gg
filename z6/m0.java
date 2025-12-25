package z6;
public class m0 extends w6.z {

    public m0()
    {
        return;
    }

    public final Object b(e7.a p6)
    {
        if (p6.O() != 9) {
            StringBuilder v0_2 = p6.M();
            try {
                String v6_4 = java.util.UUID.fromString(v0_2);
                return v6_4;
            } catch (IllegalArgumentException v1_1) {
                StringBuilder v0_1 = v1.a.q("Failed parsing \'", v0_2, "\' as UUID; at path ");
                v0_1.append(v6_4.A(1));
                throw new w6.p(v0_1.toString(), v1_1);
            }
        } else {
            p6.K();
            return 0;
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        String v2_2;
        if (((java.util.UUID) p2) != null) {
            v2_2 = ((java.util.UUID) p2).toString();
        } else {
            v2_2 = 0;
        }
        p1.I(v2_2);
        return;
    }
}
