package com.google.android.gms.internal.firebase-auth-api;
public final class zzks {
    private static final com.google.android.gms.internal.firebase-auth-api.zznp zza;

    static zzks()
    {
        com.google.android.gms.internal.firebase-auth-api.zzks.zza = com.google.android.gms.internal.firebase-auth-api.zzks.zzb();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbb zza()
    {
        if (com.google.android.gms.internal.firebase-auth-api.zziv.zzb()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzks.zza;
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zznp zzb()
    {
        try {
            com.google.android.gms.internal.firebase-auth-api.zzpy v2 = com.google.android.gms.internal.firebase-auth-api.zzpw.zza();
            com.google.android.gms.internal.firebase-auth-api.zzld.zza(v2);
            v2.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzkv(), com.google.android.gms.internal.firebase-auth-api.zzkh, com.google.android.gms.internal.firebase-auth-api.zzbg));
            v2.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzku(), com.google.android.gms.internal.firebase-auth-api.zzkq, com.google.android.gms.internal.firebase-auth-api.zzbg));
            com.google.android.gms.internal.firebase-auth-api.zzkz.zza(v2);
            v2.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzkx(), com.google.android.gms.internal.firebase-auth-api.zzke, com.google.android.gms.internal.firebase-auth-api.zzbd));
            v2.zza(com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzkw(), com.google.android.gms.internal.firebase-auth-api.zzki, com.google.android.gms.internal.firebase-auth-api.zzbd));
            return com.google.android.gms.internal.firebase-auth-api.zznp.zza(v2.zza());
        } catch (java.security.GeneralSecurityException v0_4) {
            throw new IllegalStateException(v0_4);
        }
    }
}
