package z6;
public class e0 extends w6.z {

    public e0()
    {
        return;
    }

    public final Object b(e7.a p6)
    {
        if (p6.O() != 9) {
            StringBuilder v0_2 = p6.M();
            try {
                y6.i.c(v0_2);
                return new java.math.BigInteger(v0_2);
            } catch (NumberFormatException v1_0) {
                StringBuilder v0_1 = v1.a.q("Failed parsing \'", v0_2, "\' as BigInteger; at path ");
                v0_1.append(p6.A(1));
                throw new w6.p(v0_1.toString(), v1_0);
            }
        } else {
            p6.K();
            return 0;
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        p1.H(((java.math.BigInteger) p2));
        return;
    }
}
