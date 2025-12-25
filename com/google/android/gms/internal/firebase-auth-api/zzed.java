package com.google.android.gms.internal.firebase-auth-api;
public final class zzed {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzot zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzd;

    static zzed()
    {
        com.google.android.gms.internal.firebase-auth-api.zzed.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzec(), com.google.android.gms.internal.firebase-auth-api.zzdz, com.google.android.gms.internal.firebase-auth-api.zzba);
        com.google.android.gms.internal.firebase-auth-api.zzed.zzb = new com.google.android.gms.internal.firebase-auth-api.zzef();
        com.google.android.gms.internal.firebase-auth-api.zzed.zzc = new com.google.android.gms.internal.firebase-auth-api.zzee();
        com.google.android.gms.internal.firebase-auth-api.zzed.zzd = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzuj.zze());
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzdz zza(com.google.android.gms.internal.firebase-auth-api.zzeg p1, Integer p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzdz.zze().zza(p1).zza(p2).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p1.zzb())).zza();
    }

    public static void zza(boolean p5)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzhb.zza();
            java.security.GeneralSecurityException v5_1 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_1 = new java.util.HashMap();
            String v3_0 = com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zza;
            v0_1.put("AES128_GCM_SIV", com.google.android.gms.internal.firebase-auth-api.zzeg.zzc().zza(16).zza(v3_0).zza());
            String v2_1 = com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zzc;
            v0_1.put("AES128_GCM_SIV_RAW", com.google.android.gms.internal.firebase-auth-api.zzeg.zzc().zza(16).zza(v2_1).zza());
            v0_1.put("AES256_GCM_SIV", com.google.android.gms.internal.firebase-auth-api.zzeg.zzc().zza(32).zza(v3_0).zza());
            v0_1.put("AES256_GCM_SIV_RAW", com.google.android.gms.internal.firebase-auth-api.zzeg.zzc().zza(32).zza(v2_1).zza());
            v5_1.zza(java.util.Collections.unmodifiableMap(v0_1));
            com.google.android.gms.internal.firebase-auth-api.zzou.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzed.zzc, com.google.android.gms.internal.firebase-auth-api.zzeg);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzed.zzb, com.google.android.gms.internal.firebase-auth-api.zzeg);
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzed.zza);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzed.zzd, 1);
            return;
        }
    }
}
