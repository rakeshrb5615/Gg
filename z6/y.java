package z6;
public class y extends w6.z {

    public y()
    {
        return;
    }

    public final Object b(e7.a p3)
    {
        if (p3.O() != 9) {
            try {
                return Long.valueOf(p3.H());
            } catch (NumberFormatException v3_3) {
                throw new w6.p(v3_3);
            }
        } else {
            p3.K();
            return 0;
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        if (((Number) p4) != null) {
            p3.G(((Number) p4).longValue());
            return;
        } else {
            p3.B();
            return;
        }
    }
}
