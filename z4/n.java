package z4;
public abstract class n {
    public static final com.google.android.gms.common.logging.Logger a;

    static n()
    {
        String[] v1_1 = new String[0];
        z4.n.a = new com.google.android.gms.common.logging.Logger("GetTokenResultFactory", v1_1);
        return;
    }

    public static j6.o a(String p3)
    {
        try {
            java.util.HashMap v3_1 = z4.m.b(p3);
        } catch (java.util.HashMap v3_2) {
            j6.o v0_3 = new Object[0];
            z4.n.a.e("Error parsing token claims", v3_2, v0_3);
            v3_1 = new java.util.HashMap();
        }
        j6.o v0_1 = new j6.o(22, 0);
        v0_1.b = v3_1;
        return v0_1;
    }
}
