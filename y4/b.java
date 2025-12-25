package y4;
public final class b {
    public static final synthetic int c;
    public final String a;
    public final String b;

    static b()
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        v0_1.put("recoverEmail", Integer.valueOf(2));
        v0_1.put("resetPassword", Integer.valueOf(0));
        v0_1.put("signIn", Integer.valueOf(4));
        v0_1.put("verifyEmail", Integer.valueOf(1));
        v0_1.put("verifyBeforeChangeEmail", Integer.valueOf(5));
        v0_1.put("revertSecondFactorAddition", Integer.valueOf(6));
        com.google.android.gms.internal.firebase-auth-api.zzal.zza(v0_1);
        return;
    }

    public b(String p4)
    {
        String v0_6 = y4.b.a(p4, "apiKey");
        String v1_1 = y4.b.a(p4, "oobCode");
        String v2_1 = y4.b.a(p4, "mode");
        if ((v0_6 == null) || ((v1_1 == null) || (v2_1 == null))) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        } else {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_6);
            this.a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_1);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v2_1);
            y4.b.a(p4, "continueUrl");
            y4.b.a(p4, "lang");
            this.b = y4.b.a(p4, "tenantId");
            return;
        }
    }

    public static String a(String p3, String p4)
    {
        String v3_5 = android.net.Uri.parse(p3);
        try {
            boolean v1_0 = v3_5.getQueryParameterNames();
        } catch (NullPointerException) {
            return 0;
        }
        if (!v1_0.contains(p4)) {
            if (!v1_0.contains("link")) {
                return 0;
            } else {
                return android.net.Uri.parse(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_5.getQueryParameter("link"))).getQueryParameter(p4);
            }
        } else {
            return v3_5.getQueryParameter(p4);
        }
    }
}
