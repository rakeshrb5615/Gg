package com.google.android.gms.internal.firebase-auth-api;
public final class zzse implements com.google.android.gms.internal.firebase-auth-api.zzqw {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;

    static zzse()
    {
        com.google.android.gms.internal.firebase-auth-api.zzse.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        return;
    }

    private zzse(com.google.android.gms.internal.firebase-auth-api.zzqp p2, java.security.Provider p3)
    {
        if (p3 == null) {
            throw new IllegalArgumentException("conscrypt is null");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzse.zza.zza()) {
                throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
            } else {
                try {
                    javax.crypto.Mac.getInstance("AESCMAC", p3);
                    p2.zze().zzb();
                    new javax.crypto.spec.SecretKeySpec(p2.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), "AES");
                    return;
                } catch (java.security.NoSuchAlgorithmException v2_6) {
                    throw new java.security.GeneralSecurityException("AES-CMAC not available.", v2_6);
                }
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzqw zza(com.google.android.gms.internal.firebase-auth-api.zzqp p1, java.security.Provider p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzse(p1, p2);
    }
}
