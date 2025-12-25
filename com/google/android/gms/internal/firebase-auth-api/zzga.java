package com.google.android.gms.internal.firebase-auth-api;
public final class zzga {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzot zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzd;

    static zzga()
    {
        com.google.android.gms.internal.firebase-auth-api.zzga.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzgd(), com.google.android.gms.internal.firebase-auth-api.zzgb, com.google.android.gms.internal.firebase-auth-api.zzba);
        com.google.android.gms.internal.firebase-auth-api.zzga.zzb = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzyo.zze());
        com.google.android.gms.internal.firebase-auth-api.zzga.zzc = new com.google.android.gms.internal.firebase-auth-api.zzgc();
        com.google.android.gms.internal.firebase-auth-api.zzga.zzd = new com.google.android.gms.internal.firebase-auth-api.zzgf();
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzgb p1)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzik.zza()) {
            return com.google.android.gms.internal.firebase-auth-api.zzaak.zza(p1);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzik.zza(p1);
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzgb zza(com.google.android.gms.internal.firebase-auth-api.zzge p1, Integer p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzgb.zza(p1.zzb(), com.google.android.gms.internal.firebase-auth-api.zzaal.zza(32), p2);
    }

    public static String zza()
    {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzij.zza();
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzga.zza);
            java.security.GeneralSecurityException v3_2 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_2 = new java.util.HashMap();
            v0_2.put("XCHACHA20_POLY1305", com.google.android.gms.internal.firebase-auth-api.zzge.zza(com.google.android.gms.internal.firebase-auth-api.zzge$zza.zza));
            v0_2.put("XCHACHA20_POLY1305_RAW", com.google.android.gms.internal.firebase-auth-api.zzge.zza(com.google.android.gms.internal.firebase-auth-api.zzge$zza.zzc));
            v3_2.zza(java.util.Collections.unmodifiableMap(v0_2));
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzga.zzd, com.google.android.gms.internal.firebase-auth-api.zzge);
            com.google.android.gms.internal.firebase-auth-api.zzou.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzga.zzc, com.google.android.gms.internal.firebase-auth-api.zzge);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzga.zzb, 1);
            return;
        }
    }
}
