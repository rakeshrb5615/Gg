package z6;
public class x0 extends w6.z {

    public x0()
    {
        return;
    }

    public final Object b(e7.a p3)
    {
        if (p3.O() != 9) {
            try {
                return Integer.valueOf(p3.G());
            } catch (NumberFormatException v3_4) {
                throw new w6.p(v3_4);
            }
        } else {
            p3.K();
            return 0;
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        if (((Number) p4) != null) {
            p3.G(((long) ((Number) p4).intValue()));
            return;
        } else {
            p3.B();
            return;
        }
    }
}
