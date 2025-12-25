package com.google.android.gms.internal.firebase-auth-api;
public final class zzeo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzc;

    static zzeo()
    {
        com.google.android.gms.internal.firebase-auth-api.zzeo.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzen(), com.google.android.gms.internal.firebase-auth-api.zzet, com.google.android.gms.internal.firebase-auth-api.zzba);
        com.google.android.gms.internal.firebase-auth-api.zzeo.zzb = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zze, com.google.android.gms.internal.firebase-auth-api.zzxn.zze());
        com.google.android.gms.internal.firebase-auth-api.zzeo.zzc = new com.google.android.gms.internal.firebase-auth-api.zzeq();
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzet p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzia.zza(com.google.android.gms.internal.firebase-auth-api.zzca.zza(((com.google.android.gms.internal.firebase-auth-api.zzev) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p2.zza())).zzc()).zza(((com.google.android.gms.internal.firebase-auth-api.zzev) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p2.zza())).zzc()), p2.zzd());
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzet zza(com.google.android.gms.internal.firebase-auth-api.zzev p0, Integer p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzet.zza(p0, p1);
    }

    public static void zza(boolean p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzex.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzeo.zza);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzeo.zzc, com.google.android.gms.internal.firebase-auth-api.zzev);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzeo.zzb, 1);
            return;
        }
    }
}
