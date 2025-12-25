package com.google.android.gms.internal.firebase-auth-api;
public final class zzsh implements com.google.android.gms.internal.firebase-auth-api.zzqw {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;

    static zzsh()
    {
        com.google.android.gms.internal.firebase-auth-api.zzsh.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        return;
    }

    private zzsh(com.google.android.gms.internal.firebase-auth-api.zzqp p1)
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzqw zza(com.google.android.gms.internal.firebase-auth-api.zzqp p1)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzsh.zza.zza()) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzsh v0_5 = com.google.android.gms.internal.firebase-auth-api.zznh.zza();
            try {
                if (v0_5 == null) {
                    return new com.google.android.gms.internal.firebase-auth-api.zzsh(p1);
                } else {
                    p1 = com.google.android.gms.internal.firebase-auth-api.zzse.zza(p1, v0_5);
                    return p1;
                }
            } catch (java.security.GeneralSecurityException) {
                return new com.google.android.gms.internal.firebase-auth-api.zzsh(p1);
            }
        }
    }
}
