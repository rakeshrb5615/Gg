package z6;
public class d0 extends w6.z {

    public d0()
    {
        return;
    }

    public final Object b(e7.a p6)
    {
        if (p6.O() != 9) {
            StringBuilder v0_2 = p6.M();
            try {
                String v6_4 = y6.i.i(v0_2);
                return v6_4;
            } catch (NumberFormatException v1_1) {
                StringBuilder v0_1 = v1.a.q("Failed parsing \'", v0_2, "\' as BigDecimal; at path ");
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
        p1.H(((java.math.BigDecimal) p2));
        return;
    }
}
