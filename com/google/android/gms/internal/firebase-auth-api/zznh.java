package com.google.android.gms.internal.firebase-auth-api;
public final class zznh {
    private static final String[] zza;

    static zznh()
    {
        com.google.android.gms.internal.firebase-auth-api.zznh.zza = new String[] {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"});
        return;
    }

    public static java.security.Provider zza()
    {
        int v0_0 = com.google.android.gms.internal.firebase-auth-api.zznh.zza;
        int v1 = v0_0.length;
        int v2 = 0;
        while (v2 < v1) {
            java.security.Provider v3_1 = java.security.Security.getProvider(v0_0[v2]);
            if (v3_1 == null) {
                v2++;
            } else {
                return v3_1;
            }
        }
        return 0;
    }

    public static java.security.Provider zzb()
    {
        try {
            return ((java.security.Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", 0).invoke(0, 0));
        } catch (IllegalAccessException) {
            return 0;
        }
    }
}
