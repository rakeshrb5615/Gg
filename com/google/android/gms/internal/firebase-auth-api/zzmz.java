package com.google.android.gms.internal.firebase-auth-api;
public final class zzmz {

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(String p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zznc(p2, com.google.android.gms.internal.firebase-auth-api.zzmz.zza());
    }

    private static java.security.KeyStore zza()
    {
        try {
            java.io.IOException v0_1 = java.security.KeyStore.getInstance("AndroidKeyStore");
            v0_1.load(0);
            return v0_1;
        } catch (java.io.IOException v0_2) {
            throw new java.security.GeneralSecurityException(v0_2);
        }
    }

    public static boolean zzb(String p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzmz.zza().containsAlias(p1);
    }
}
