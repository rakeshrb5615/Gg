package com.google.android.gms.internal.firebase-auth-api;
public final class zzde {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzot zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zze;

    static zzde()
    {
        com.google.android.gms.internal.firebase-auth-api.zzde.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzdh(), com.google.android.gms.internal.firebase-auth-api.zzdd, com.google.android.gms.internal.firebase-auth-api.zzba);
        com.google.android.gms.internal.firebase-auth-api.zzde.zzb = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zztf.zzf());
        com.google.android.gms.internal.firebase-auth-api.zzde.zzc = new com.google.android.gms.internal.firebase-auth-api.zzdg();
        com.google.android.gms.internal.firebase-auth-api.zzde.zzd = new com.google.android.gms.internal.firebase-auth-api.zzdj();
        com.google.android.gms.internal.firebase-auth-api.zzde.zze = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzdd zza(com.google.android.gms.internal.firebase-auth-api.zzdi p2, Integer p3)
    {
        if ((p2.zzb() != 16) && (p2.zzb() != 32)) {
            throw new java.security.GeneralSecurityException("AES key size must be 16 or 32 bytes");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzdd.zze().zza(p2).zza(p3).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p2.zzb())).zzb(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p2.zzc())).zza();
        }
    }

    public static String zza()
    {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void zza(boolean p8)
    {
        java.security.GeneralSecurityException v8_0 = com.google.android.gms.internal.firebase-auth-api.zzde.zze;
        if (!v8_0.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzgg.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzde.zza);
            String v0_1 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            com.google.android.gms.internal.firebase-auth-api.zzbh v1_2 = new java.util.HashMap();
            v1_2.put("AES128_CTR_HMAC_SHA256", com.google.android.gms.internal.firebase-auth-api.zzfm.zze);
            com.google.android.gms.internal.firebase-auth-api.zzdi$zza v5 = com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzc;
            com.google.android.gms.internal.firebase-auth-api.zzdi$zzc v6 = com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzc;
            v1_2.put("AES128_CTR_HMAC_SHA256_RAW", com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(v5).zza(v6).zza());
            v1_2.put("AES256_CTR_HMAC_SHA256", com.google.android.gms.internal.firebase-auth-api.zzfm.zzf);
            v1_2.put("AES256_CTR_HMAC_SHA256_RAW", com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(v5).zza(v6).zza());
            v0_1.zza(java.util.Collections.unmodifiableMap(v1_2));
            com.google.android.gms.internal.firebase-auth-api.zzou.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzde.zzc, com.google.android.gms.internal.firebase-auth-api.zzdi);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzde.zzd, com.google.android.gms.internal.firebase-auth-api.zzdi);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzde.zzb, v8_0, 1);
            return;
        }
    }
}
