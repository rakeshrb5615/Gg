package d8;
public abstract class h0 {
    public static final d8.k0 a;

    static h0()
    {
        try {
            d8.g0 v0_2 = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException) {
            v0_2 = 0;
        }
        d8.g0 v0_3;
        if (v0_2 == null) {
            v0_3 = 0;
        } else {
            v0_3 = Boolean.parseBoolean(v0_2);
        }
        d8.g0 v0_1;
        if (v0_3 != null) {
            v0_1 = i8.n.a;
            if (v0_1 == null) {
                v0_1 = d8.g0.p;
            }
        } else {
            v0_1 = d8.g0.p;
        }
        d8.h0.a = v0_1;
        return;
    }
}
