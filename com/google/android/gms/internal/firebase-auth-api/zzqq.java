package com.google.android.gms.internal.firebase-auth-api;
public final class zzqq {
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzd;

    static zzqq()
    {
        com.google.android.gms.internal.firebase-auth-api.zzqq.zza = new com.google.android.gms.internal.firebase-auth-api.zzqt();
        com.google.android.gms.internal.firebase-auth-api.zzqq.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzqs(), com.google.android.gms.internal.firebase-auth-api.zzqp, com.google.android.gms.internal.firebase-auth-api.zzqw);
        com.google.android.gms.internal.firebase-auth-api.zzqq.zzc = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzqv(), com.google.android.gms.internal.firebase-auth-api.zzqp, com.google.android.gms.internal.firebase-auth-api.zzcc);
        com.google.android.gms.internal.firebase-auth-api.zzqq.zzd = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.android.gms.internal.firebase-auth-api.zzcc, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzsw.zzf());
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzcc zza(com.google.android.gms.internal.firebase-auth-api.zzqp p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzqq.zza(((com.google.android.gms.internal.firebase-auth-api.zzqu) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p1.zza())));
        return com.google.android.gms.internal.firebase-auth-api.zzaag.zza(p1);
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqp zza(com.google.android.gms.internal.firebase-auth-api.zzqu p1, Integer p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzqq.zza(p1);
        return com.google.android.gms.internal.firebase-auth-api.zzqp.zzc().zza(p1).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p1.zzc())).zza(p2).zza();
    }

    private static void zza(com.google.android.gms.internal.firebase-auth-api.zzqu p1)
    {
        if (p1.zzc() != 32) {
            throw new java.security.GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        } else {
            return;
        }
    }

    public static void zza(boolean p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzrz.zza();
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzqq.zza, com.google.android.gms.internal.firebase-auth-api.zzqu);
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzqq.zzb);
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzqq.zzc);
            java.security.GeneralSecurityException v3_5 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_4 = new java.util.HashMap();
            int v1_1 = com.google.android.gms.internal.firebase-auth-api.zzrt.zzc;
            v0_4.put("AES_CMAC", v1_1);
            v0_4.put("AES256_CMAC", v1_1);
            v0_4.put("AES256_CMAC_RAW", com.google.android.gms.internal.firebase-auth-api.zzqu.zzd().zza(32).zzb(16).zza(com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzd).zza());
            v3_5.zza(java.util.Collections.unmodifiableMap(v0_4));
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzqq.zzd, 1);
            return;
        }
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqw zzb(com.google.android.gms.internal.firebase-auth-api.zzqp p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzqq.zza(((com.google.android.gms.internal.firebase-auth-api.zzqu) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p1.zza())));
        return com.google.android.gms.internal.firebase-auth-api.zzsh.zza(p1);
    }
}
