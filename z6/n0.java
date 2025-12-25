package z6;
public class n0 extends w6.z {

    public n0()
    {
        return;
    }

    public final Object b(e7.a p6)
    {
        StringBuilder v0_0 = p6.M();
        try {
            String v6_3 = java.util.Currency.getInstance(v0_0);
            return v6_3;
        } catch (IllegalArgumentException v1) {
            StringBuilder v0_1 = v1.a.q("Failed parsing \'", v0_0, "\' as Currency; at path ");
            v0_1.append(v6_3.A(1));
            throw new w6.p(v0_1.toString(), v1);
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        p1.I(((java.util.Currency) p2).getCurrencyCode());
        return;
    }
}
