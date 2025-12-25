package com.google.android.gms.internal.firebase-auth-api;
public final class zzes {
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzc;

    static zzes()
    {
        com.google.android.gms.internal.firebase-auth-api.zzes.zza = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", com.google.android.gms.internal.firebase-auth-api.zzba, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzxt.zze());
        com.google.android.gms.internal.firebase-auth-api.zzes.zzb = new com.google.android.gms.internal.firebase-auth-api.zzer();
        com.google.android.gms.internal.firebase-auth-api.zzes.zzc = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzeu(), com.google.android.gms.internal.firebase-auth-api.zzfd, com.google.android.gms.internal.firebase-auth-api.zzba);
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzfd p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzba v0_5 = ((com.google.android.gms.internal.firebase-auth-api.zzfc) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzd();
        return com.google.android.gms.internal.firebase-auth-api.zzia.zza(com.google.android.gms.internal.firebase-auth-api.zzep.zza(((com.google.android.gms.internal.firebase-auth-api.zzfc) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb(), com.google.android.gms.internal.firebase-auth-api.zzca.zza(v0_5).zza(v0_5)), p3.zzd());
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzfd zza(com.google.android.gms.internal.firebase-auth-api.zzfc p0, Integer p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzfd.zza(p0, p1);
    }

    public static void zza(boolean p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzfg.zza();
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzes.zzb, com.google.android.gms.internal.firebase-auth-api.zzfc);
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzes.zzc);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzes.zza, 1);
            return;
        }
    }
}
