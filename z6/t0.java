package z6;
public class t0 extends w6.z {

    public t0()
    {
        return;
    }

    public final Object b(e7.a p3)
    {
        int v0 = p3.O();
        if (v0 != 9) {
            if (v0 != 6) {
                return Boolean.valueOf(p3.E());
            } else {
                return Boolean.valueOf(Boolean.parseBoolean(p3.M()));
            }
        } else {
            p3.K();
            return 0;
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        if (((Boolean) p2) != null) {
            String v2_3;
            p1.K();
            p1.c();
            if (!((Boolean) p2).booleanValue()) {
                v2_3 = "false";
            } else {
                v2_3 = "true";
            }
            p1.a.write(v2_3);
        } else {
            p1.B();
        }
        return;
    }
}
