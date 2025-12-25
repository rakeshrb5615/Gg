package com.google.android.gms.internal.firebase-auth-api;
public final class zzco {
    private static final com.google.android.gms.internal.firebase-auth-api.zznp zza;

    static zzco()
    {
        com.google.android.gms.internal.firebase-auth-api.zzco.zza = com.google.android.gms.internal.firebase-auth-api.zzco.zzb();
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

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzgb p1)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzik.zza()) {
            return com.google.android.gms.internal.firebase-auth-api.zzaak.zza(p1);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzik.zza(p1);
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbb zza()
    {
        if (com.google.android.gms.internal.firebase-auth-api.zziv.zzb()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzco.zza;
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zznp zzb()
    {
        try {
            IllegalStateException v1_0 = com.google.android.gms.internal.firebase-auth-api.zzpw.zza();
            com.google.android.gms.internal.firebase-auth-api.zzcx.zza(v1_0);
            v1_0.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzcn(), com.google.android.gms.internal.firebase-auth-api.zzdd, com.google.android.gms.internal.firebase-auth-api.zzba));
            v1_0.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzcq(), com.google.android.gms.internal.firebase-auth-api.zzds, com.google.android.gms.internal.firebase-auth-api.zzba));
            v1_0.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzcp(), com.google.android.gms.internal.firebase-auth-api.zzdz, com.google.android.gms.internal.firebase-auth-api.zzba));
            v1_0.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzcs(), com.google.android.gms.internal.firebase-auth-api.zzdl, com.google.android.gms.internal.firebase-auth-api.zzba));
            v1_0.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzcr(), com.google.android.gms.internal.firebase-auth-api.zzej, com.google.android.gms.internal.firebase-auth-api.zzba));
            v1_0.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzcu(), com.google.android.gms.internal.firebase-auth-api.zzgb, com.google.android.gms.internal.firebase-auth-api.zzba));
            v1_0.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzct(), com.google.android.gms.internal.firebase-auth-api.zzfw, com.google.android.gms.internal.firebase-auth-api.zzba));
            return com.google.android.gms.internal.firebase-auth-api.zznp.zza(v1_0.zza());
        } catch (java.security.GeneralSecurityException v0_4) {
            throw new IllegalStateException(v0_4);
        }
    }
}
