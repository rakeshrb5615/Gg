package com.google.android.gms.internal.firebase-auth-api;
public final class zzjb {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzot zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzd;

    static zzjb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzjb.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzje(), com.google.android.gms.internal.firebase-auth-api.zzja, com.google.android.gms.internal.firebase-auth-api.zzbe);
        com.google.android.gms.internal.firebase-auth-api.zzjb.zzb = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.AesSivKey", com.google.android.gms.internal.firebase-auth-api.zzbe, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzup.zze());
        com.google.android.gms.internal.firebase-auth-api.zzjb.zzc = new com.google.android.gms.internal.firebase-auth-api.zzjd();
        com.google.android.gms.internal.firebase-auth-api.zzjb.zzd = new com.google.android.gms.internal.firebase-auth-api.zzjg();
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzja p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzjb.zza(((com.google.android.gms.internal.firebase-auth-api.zzjf) ((com.google.android.gms.internal.firebase-auth-api.zzjj) p1.zza())));
        return com.google.android.gms.internal.firebase-auth-api.zzyx.zza(p1);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzja zza(com.google.android.gms.internal.firebase-auth-api.zzjf p1, Integer p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzjb.zza(p1);
        return com.google.android.gms.internal.firebase-auth-api.zzja.zzc().zza(p1).zza(p2).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p1.zzb())).zza();
    }

    private static void zza(com.google.android.gms.internal.firebase-auth-api.zzjf p3)
    {
        if (p3.zzb() != 64) {
            throw new java.security.InvalidAlgorithmParameterException(v1.a.j("invalid key size: ", p3.zzb(), ". Valid keys must have 64 bytes."));
        } else {
            return;
        }
    }

    public static void zza(boolean p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzjs.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjb.zza);
            java.security.GeneralSecurityException v3_2 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_2 = new java.util.HashMap();
            v0_2.put("AES256_SIV", com.google.android.gms.internal.firebase-auth-api.zzjq.zza);
            v0_2.put("AES256_SIV_RAW", com.google.android.gms.internal.firebase-auth-api.zzjf.zzc().zza(64).zza(com.google.android.gms.internal.firebase-auth-api.zzjf$zza.zzc).zza());
            v3_2.zza(java.util.Collections.unmodifiableMap(v0_2));
            com.google.android.gms.internal.firebase-auth-api.zzou.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjb.zzc, com.google.android.gms.internal.firebase-auth-api.zzjf);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjb.zzd, com.google.android.gms.internal.firebase-auth-api.zzjf);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjb.zzb, 1);
            return;
        }
    }
}
