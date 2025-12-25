package com.google.android.gms.internal.firebase-auth-api;
public final synthetic class zzaer {

    public static String zza(com.google.android.gms.internal.firebase-auth-api.zzaes p4, String p5)
    {
        try {
            char[] v0_5 = new String(java.security.MessageDigest.getInstance("SHA-256").digest(p5.getBytes()));
            com.google.android.gms.common.logging.Logger v5_1 = v0_5.length();
            int v1 = 0;
        } catch (java.security.NoSuchAlgorithmException) {
            String v4_2 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzaes.zza.e("Failed to get SHA-256 MessageDigest", v4_2);
            return 0;
        }
        while (v1 < v5_1) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzg.zza(v0_5.charAt(v1))) {
                v1++;
            } else {
                char[] v0_1 = v0_5.toCharArray();
                while (v1 < v5_1) {
                    char v2_2 = v0_1[v1];
                    if (com.google.android.gms.internal.firebase-auth-api.zzg.zza(v2_2)) {
                        v0_1[v1] = ((char) (v2_2 ^ 32));
                    }
                    v1++;
                }
                return String.valueOf(v0_1);
            }
        }
        return v0_5;
    }

    public static void zzb(com.google.android.gms.internal.firebase-auth-api.zzaes p1, String p2)
    {
        p1.zza(p2, 0);
        return;
    }
}
