package z6;
public class k0 extends w6.z {

    public k0()
    {
        return;
    }

    public final Object b(e7.a p4)
    {
        if (p4.O() != 9) {
            try {
                java.net.URISyntaxException v4_2 = p4.M();
            } catch (java.net.URISyntaxException v4_1) {
                throw new w6.p(v4_1);
            }
            if (!v4_2.equals("null")) {
                return new java.net.URI(v4_2);
            } else {
                return 0;
            }
        } else {
            p4.K();
            return 0;
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        String v2_2;
        if (((java.net.URI) p2) != null) {
            v2_2 = ((java.net.URI) p2).toASCIIString();
        } else {
            v2_2 = 0;
        }
        p1.I(v2_2);
        return;
    }
}
