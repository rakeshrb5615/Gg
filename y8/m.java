package y8;
public abstract class m {
    public static final java.util.logging.Logger a;

    static m()
    {
        y8.m.a = java.util.logging.Logger.getLogger("okio.Okio");
        return;
    }

    public static final boolean a(AssertionError p2)
    {
        if (p2.getCause() != null) {
            int v2_1;
            int v2_3 = p2.getMessage();
            if (v2_3 == 0) {
                v2_1 = 0;
            } else {
                v2_1 = b8.i.s0(v2_3, "getsockname failed");
            }
            if (v2_1 != 0) {
                return 1;
            }
        }
        return 0;
    }
}
