package com.google.android.gms.internal.firebase-auth-api;
public final class zzei {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzc;

    static zzei()
    {
        com.google.android.gms.internal.firebase-auth-api.zzei.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzel(), com.google.android.gms.internal.firebase-auth-api.zzej, com.google.android.gms.internal.firebase-auth-api.zzba);
        com.google.android.gms.internal.firebase-auth-api.zzei.zzb = new com.google.android.gms.internal.firebase-auth-api.zzek();
        com.google.android.gms.internal.firebase-auth-api.zzei.zzc = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzuv.zze());
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzej p1)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzhh.zzb()) {
            return com.google.android.gms.internal.firebase-auth-api.zzzc.zza(p1);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzhh.zza(p1);
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzej zza(com.google.android.gms.internal.firebase-auth-api.zzem p1, Integer p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzej.zza(p1.zzb(), com.google.android.gms.internal.firebase-auth-api.zzaal.zza(32), p2);
    }

    public static String zza()
    {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzhj.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzei.zza);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzei.zzb, com.google.android.gms.internal.firebase-auth-api.zzem);
            java.security.GeneralSecurityException v3_3 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_3 = new java.util.HashMap();
            v0_3.put("CHACHA20_POLY1305", com.google.android.gms.internal.firebase-auth-api.zzem.zza(com.google.android.gms.internal.firebase-auth-api.zzem$zza.zza));
            v0_3.put("CHACHA20_POLY1305_RAW", com.google.android.gms.internal.firebase-auth-api.zzem.zza(com.google.android.gms.internal.firebase-auth-api.zzem$zza.zzc));
            v3_3.zza(java.util.Collections.unmodifiableMap(v0_3));
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzei.zzc, 1);
            return;
        }
    }
}
