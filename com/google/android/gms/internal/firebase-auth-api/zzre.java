package com.google.android.gms.internal.firebase-auth-api;
public final class zzre {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzot zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zze;
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zzf;

    static zzre()
    {
        com.google.android.gms.internal.firebase-auth-api.zzre.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzrd(), com.google.android.gms.internal.firebase-auth-api.zzra, com.google.android.gms.internal.firebase-auth-api.zzqw);
        com.google.android.gms.internal.firebase-auth-api.zzre.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzrg(), com.google.android.gms.internal.firebase-auth-api.zzra, com.google.android.gms.internal.firebase-auth-api.zzcc);
        com.google.android.gms.internal.firebase-auth-api.zzre.zzc = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.HmacKey", com.google.android.gms.internal.firebase-auth-api.zzcc, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzwb.zzg());
        com.google.android.gms.internal.firebase-auth-api.zzre.zzd = new com.google.android.gms.internal.firebase-auth-api.zzrf();
        com.google.android.gms.internal.firebase-auth-api.zzre.zze = new com.google.android.gms.internal.firebase-auth-api.zzri();
        com.google.android.gms.internal.firebase-auth-api.zzre.zzf = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzra zza(com.google.android.gms.internal.firebase-auth-api.zzrh p1, Integer p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzra.zzc().zza(p1).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p1.zzc())).zza(p2).zza();
    }

    public static void zza(boolean p10)
    {
        java.security.GeneralSecurityException v10_0 = com.google.android.gms.internal.firebase-auth-api.zzre.zzf;
        if (!v10_0.zza()) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzsj.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzre.zza);
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzre.zzb);
            String v0_5 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            com.google.android.gms.internal.firebase-auth-api.zzbh v1_7 = new java.util.HashMap();
            v1_7.put("HMAC_SHA256_128BITTAG", com.google.android.gms.internal.firebase-auth-api.zzrt.zza);
            com.google.android.gms.internal.firebase-auth-api.zzrh$zzc v5 = com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzd;
            int v6_0 = com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zzc;
            v1_7.put("HMAC_SHA256_128BITTAG_RAW", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(32).zzb(16).zza(v5).zza(v6_0).zza());
            com.google.android.gms.internal.firebase-auth-api.zzrh$zzc v7_1 = com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zza;
            v1_7.put("HMAC_SHA256_256BITTAG", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(32).zzb(32).zza(v7_1).zza(v6_0).zza());
            v1_7.put("HMAC_SHA256_256BITTAG_RAW", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(32).zzb(32).zza(v5).zza(v6_0).zza());
            com.google.android.gms.internal.firebase-auth-api.zzrh$zza v8_1 = com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zze;
            v1_7.put("HMAC_SHA512_128BITTAG", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(64).zzb(16).zza(v7_1).zza(v8_1).zza());
            v1_7.put("HMAC_SHA512_128BITTAG_RAW", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(64).zzb(16).zza(v5).zza(v8_1).zza());
            v1_7.put("HMAC_SHA512_256BITTAG", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(64).zzb(32).zza(v7_1).zza(v8_1).zza());
            v1_7.put("HMAC_SHA512_256BITTAG_RAW", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(64).zzb(32).zza(v5).zza(v8_1).zza());
            v1_7.put("HMAC_SHA512_512BITTAG", com.google.android.gms.internal.firebase-auth-api.zzrt.zzb);
            v1_7.put("HMAC_SHA512_512BITTAG_RAW", com.google.android.gms.internal.firebase-auth-api.zzrh.zzd().zza(64).zzb(64).zza(v5).zza(v8_1).zza());
            v0_5.zza(java.util.Collections.unmodifiableMap(v1_7));
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzre.zze, com.google.android.gms.internal.firebase-auth-api.zzrh);
            com.google.android.gms.internal.firebase-auth-api.zzou.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzre.zzd, com.google.android.gms.internal.firebase-auth-api.zzrh);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzre.zzc, v10_0, 1);
            return;
        }
    }
}
