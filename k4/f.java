package k4;
public abstract class f {
    public static final k4.z a;

    static f()
    {
        k4.f.a = new k4.z("PhoneskyVerificationUtils");
        return;
    }

    public static boolean a(android.content.pm.Signature[] p6)
    {
        if (p6 == 0) {
            int v6_2 = new Object[0];
            String v1_2 = k4.f.a;
            v1_2.getClass();
            if (android.util.Log.isLoggable("PlayCore", 5)) {
                android.util.Log.w("PlayCore", k4.z.c(v1_2.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", v6_2));
            }
        } else {
            String v1_1 = p6.length;
            if (v1_1 == null) {
            } else {
                int v2_2 = 0;
                while (v2_2 < v1_1) {
                    boolean v3_1 = p6[v2_2].toByteArray();
                    try {
                        String v4_1 = java.security.MessageDigest.getInstance("SHA-256");
                        v4_1.update(v3_1);
                        boolean v3_3 = android.util.Base64.encodeToString(v4_1.digest(), 11);
                    } catch (java.security.NoSuchAlgorithmException) {
                        v3_3 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(v3_3)) {
                        String v4_5 = android.os.Build.TAGS;
                        if (((!v4_5.contains("dev-keys")) && (!v4_5.contains("test-keys"))) || (!"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(v3_3))) {
                            v2_2++;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
