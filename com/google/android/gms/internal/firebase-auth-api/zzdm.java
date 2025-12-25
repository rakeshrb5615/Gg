package com.google.android.gms.internal.firebase-auth-api;
public final class zzdm {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzc;

    static zzdm()
    {
        com.google.android.gms.internal.firebase-auth-api.zzdm.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzdp(), com.google.android.gms.internal.firebase-auth-api.zzdl, com.google.android.gms.internal.firebase-auth-api.zzba);
        com.google.android.gms.internal.firebase-auth-api.zzdm.zzb = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zztu.zzf());
        com.google.android.gms.internal.firebase-auth-api.zzdm.zzc = new com.google.android.gms.internal.firebase-auth-api.zzdo();
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzdl zza(com.google.android.gms.internal.firebase-auth-api.zzdq p2, Integer p3)
    {
        if (p2.zzc() == 24) {
            throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzdl.zze().zza(p2).zza(p3).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p2.zzc())).zza();
        }
    }

    public static String zza()
    {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void zza(boolean p5)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzgl.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzdm.zza);
            java.security.GeneralSecurityException v5_2 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_2 = new java.util.HashMap();
            v0_2.put("AES128_EAX", com.google.android.gms.internal.firebase-auth-api.zzfm.zzc);
            com.google.android.gms.internal.firebase-auth-api.zzdq$zzb v3 = com.google.android.gms.internal.firebase-auth-api.zzdq$zzb.zzc;
            v0_2.put("AES128_EAX_RAW", com.google.android.gms.internal.firebase-auth-api.zzdq.zze().zza(16).zzb(16).zzc(16).zza(v3).zza());
            v0_2.put("AES256_EAX", com.google.android.gms.internal.firebase-auth-api.zzfm.zzd);
            v0_2.put("AES256_EAX_RAW", com.google.android.gms.internal.firebase-auth-api.zzdq.zze().zza(16).zzb(32).zzc(16).zza(v3).zza());
            v5_2.zza(java.util.Collections.unmodifiableMap(v0_2));
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzdm.zzc, com.google.android.gms.internal.firebase-auth-api.zzdq);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzdm.zzb, 1);
            return;
        }
    }
}
