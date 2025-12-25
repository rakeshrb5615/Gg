package z6;
public class j0 extends w6.z {

    public j0()
    {
        return;
    }

    public final Object b(e7.a p4)
    {
        if (p4.O() != 9) {
            String v4_1 = p4.M();
            if (!v4_1.equals("null")) {
                return new java.net.URL(v4_1);
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
        if (((java.net.URL) p2) != null) {
            v2_2 = ((java.net.URL) p2).toExternalForm();
        } else {
            v2_2 = 0;
        }
        p1.I(v2_2);
        return;
    }
}
