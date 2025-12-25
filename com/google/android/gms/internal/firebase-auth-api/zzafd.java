package com.google.android.gms.internal.firebase-auth-api;
public final class zzafd {

    public static String zza()
    {
        String v0_0 = java.util.Locale.getDefault();
        StringBuilder v1_1 = new StringBuilder();
        com.google.android.gms.internal.firebase-auth-api.zzafd.zza(v1_1, v0_0);
        java.util.Locale v2 = java.util.Locale.US;
        if (!v0_0.equals(v2)) {
            if (v1_1.length() > 0) {
                v1_1.append(", ");
            }
            com.google.android.gms.internal.firebase-auth-api.zzafd.zza(v1_1, v2);
        }
        return v1_1.toString();
    }

    private static void zza(StringBuilder p1, java.util.Locale p2)
    {
        String v0_0 = p2.getLanguage();
        if (v0_0 != null) {
            p1.append(v0_0);
            String v2_1 = p2.getCountry();
            if (v2_1 != null) {
                p1.append("-");
                p1.append(v2_1);
            }
        }
        return;
    }
}
