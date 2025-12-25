package z6;
public class l0 extends w6.z {

    public l0()
    {
        return;
    }

    public final Object b(e7.a p3)
    {
        if (p3.O() != 9) {
            return java.net.InetAddress.getByName(p3.M());
        } else {
            p3.K();
            return 0;
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        String v2_2;
        if (((java.net.InetAddress) p2) != null) {
            v2_2 = ((java.net.InetAddress) p2).getHostAddress();
        } else {
            v2_2 = 0;
        }
        p1.I(v2_2);
        return;
    }
}
