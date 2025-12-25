package com.google.android.gms.internal.firebase-auth-api;
public final class zzdt {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzot zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zze;

    static zzdt()
    {
        com.google.android.gms.internal.firebase-auth-api.zzdt.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzdw(), com.google.android.gms.internal.firebase-auth-api.zzds, com.google.android.gms.internal.firebase-auth-api.zzba);
        com.google.android.gms.internal.firebase-auth-api.zzdt.zzb = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzud.zze());
        com.google.android.gms.internal.firebase-auth-api.zzdt.zzc = new com.google.android.gms.internal.firebase-auth-api.zzdv();
        com.google.android.gms.internal.firebase-auth-api.zzdt.zzd = new com.google.android.gms.internal.firebase-auth-api.zzdy();
        com.google.android.gms.internal.firebase-auth-api.zzdt.zze = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb;
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzds zza(com.google.android.gms.internal.firebase-auth-api.zzdx p2, Integer p3)
    {
        if (p2.zzc() == 24) {
            throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzds.zze().zza(p2).zza(p3).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p2.zzc())).zza();
        }
    }

    public static String zza()
    {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void zza(boolean p7)
    {
        java.security.GeneralSecurityException v7_0 = com.google.android.gms.internal.firebase-auth-api.zzdt.zze;
        if (!v7_0.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzgt.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzdt.zza);
            String v0_1 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            com.google.android.gms.internal.firebase-auth-api.zzbh v1_2 = new java.util.HashMap();
            v1_2.put("AES128_GCM", com.google.android.gms.internal.firebase-auth-api.zzfm.zza);
            com.google.android.gms.internal.firebase-auth-api.zzdx$zza v5 = com.google.android.gms.internal.firebase-auth-api.zzdx$zza.zzc;
            v1_2.put("AES128_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(16).zzc(16).zza(v5).zza());
            v1_2.put("AES256_GCM", com.google.android.gms.internal.firebase-auth-api.zzfm.zzb);
            v1_2.put("AES256_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(32).zzc(16).zza(v5).zza());
            v0_1.zza(java.util.Collections.unmodifiableMap(v1_2));
            com.google.android.gms.internal.firebase-auth-api.zzou.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzdt.zzc, com.google.android.gms.internal.firebase-auth-api.zzdx);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzdt.zzd, com.google.android.gms.internal.firebase-auth-api.zzdx);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzdt.zzb, v7_0, 1);
            return;
        }
    }
}
