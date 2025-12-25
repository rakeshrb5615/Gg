package com.google.android.gms.internal.firebase-auth-api;
public final class zzjx {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzcd zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zze;

    static zzjx()
    {
        com.google.android.gms.internal.firebase-auth-api.zzjx.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzka(), com.google.android.gms.internal.firebase-auth-api.zzke, com.google.android.gms.internal.firebase-auth-api.zzbd);
        com.google.android.gms.internal.firebase-auth-api.zzjx.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzjz(), com.google.android.gms.internal.firebase-auth-api.zzkh, com.google.android.gms.internal.firebase-auth-api.zzbg);
        com.google.android.gms.internal.firebase-auth-api.zzjx.zzc = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", com.google.android.gms.internal.firebase-auth-api.zzbd, com.google.android.gms.internal.firebase-auth-api.zzvn.zzf());
        com.google.android.gms.internal.firebase-auth-api.zzjx.zzd = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", com.google.android.gms.internal.firebase-auth-api.zzbg, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzd, com.google.android.gms.internal.firebase-auth-api.zzvq.zzh());
        com.google.android.gms.internal.firebase-auth-api.zzjx.zze = new com.google.android.gms.internal.firebase-auth-api.zzkc();
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzke zza(com.google.android.gms.internal.firebase-auth-api.zzkb p2, Integer p3)
    {
        String v0_2;
        String v0_0 = p2.zzd();
        if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zza) {
            if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzb) {
                if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzc) {
                    throw new java.security.GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(v0_0)));
                } else {
                    v0_2 = com.google.android.gms.internal.firebase-auth-api.zznj.zzc;
                }
            } else {
                v0_2 = com.google.android.gms.internal.firebase-auth-api.zznj.zzb;
            }
        } else {
            v0_2 = com.google.android.gms.internal.firebase-auth-api.zznj.zza;
        }
        String v0_3 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_2);
        return com.google.android.gms.internal.firebase-auth-api.zzke.zza(com.google.android.gms.internal.firebase-auth-api.zzkh.zza(p2, ((java.security.interfaces.ECPublicKey) v0_3.getPublic()).getW(), p3), com.google.android.gms.internal.firebase-auth-api.zzaam.zza(((java.security.interfaces.ECPrivateKey) v0_3.getPrivate()).getS(), com.google.android.gms.internal.firebase-auth-api.zzbf.zza()));
    }

    public static String zza()
    {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean p13)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzlq.zza();
            java.security.GeneralSecurityException v13_1 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_1 = new java.util.HashMap();
            String v2_0 = com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zza;
            com.google.android.gms.internal.firebase-auth-api.zzkb$zzb v3 = com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zzc;
            String v4_1 = com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zzb;
            com.google.android.gms.internal.firebase-auth-api.zzkb$zzd v5 = com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zza;
            int v9_1 = com.google.android.gms.internal.firebase-auth-api.zzdx$zza.zzc;
            v0_1.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v4_1).zza(v5).zza(com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(16).zzc(16).zza(v9_1).zza()).zza());
            com.google.android.gms.internal.firebase-auth-api.zzkb$zzd v6_7 = com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zzc;
            v0_1.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v4_1).zza(v6_7).zza(com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(int v8).zzc(16).zza(v9_1).zza()).zza());
            com.google.android.gms.internal.firebase-auth-api.zzkb$zze v10_7 = com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zza;
            v0_1.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v10_7).zza(v5).zza(com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(v8).zzc(16).zza(v9_1).zza()).zza());
            v0_1.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v10_7).zza(v6_7).zza(com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(v8).zzc(16).zza(v9_1).zza()).zza());
            v0_1.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v10_7).zza(v6_7).zza(com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(16).zzc(16).zza(v9_1).zza()).zza());
            com.google.android.gms.internal.firebase-auth-api.zzdi$zza v11_9 = com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzc;
            com.google.android.gms.internal.firebase-auth-api.zzdi$zzc v12 = com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzc;
            v0_1.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v4_1).zza(v5).zza(com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(v11_9).zza(v12).zza()).zza());
            v0_1.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v4_1).zza(v6_7).zza(com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(v11_9).zza(v12).zza()).zza());
            v0_1.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v10_7).zza(v5).zza(com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(v11_9).zza(v12).zza()).zza());
            v0_1.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", com.google.android.gms.internal.firebase-auth-api.zzkb.zzc().zza(v2_0).zza(v3).zza(v10_7).zza(v6_7).zza(com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(v11_9).zza(v12).zza()).zza());
            v13_1.zza(java.util.Collections.unmodifiableMap(v0_1));
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjx.zza);
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjx.zzb);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjx.zze, com.google.android.gms.internal.firebase-auth-api.zzkb);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjx.zzc, 1);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjx.zzd, 0);
            return;
        }
    }
}
