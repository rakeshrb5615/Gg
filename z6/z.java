package z6;
public class z extends w6.z {

    public z()
    {
        return;
    }

    public final Object b(e7.a p3)
    {
        if (p3.O() != 9) {
            return Float.valueOf(((float) p3.F()));
        } else {
            p3.K();
            return 0;
        }
    }

    public final void c(e7.b p2, Object p3)
    {
        Float v3_1 = ((Number) p3);
        if (((Number) p3) != null) {
            if (!(((Number) p3) instanceof Float)) {
                v3_1 = Float.valueOf(((Number) p3).floatValue());
            }
            p2.H(v3_1);
            return;
        } else {
            p2.B();
            return;
        }
    }
}
