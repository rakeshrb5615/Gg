package com.google.android.gms.internal.firebase-auth-api;
public final class zzln {
    private static final byte[] zza;

    static zzln()
    {
        byte[] v0_1 = new byte[0];
        com.google.android.gms.internal.firebase-auth-api.zzln.zza = v0_1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzlr zza(com.google.android.gms.internal.firebase-auth-api.zzkb p2)
    {
        String v2_1 = p2.zzb();
        if (!(v2_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzdx)) {
            if (!(v2_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzdi)) {
                if (!(v2_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzjf)) {
                    throw new java.security.GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(v2_1)));
                } else {
                    return new com.google.android.gms.internal.firebase-auth-api.zzlo(((com.google.android.gms.internal.firebase-auth-api.zzjf) v2_1));
                }
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzlm(((com.google.android.gms.internal.firebase-auth-api.zzdi) v2_1));
            }
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzlp(((com.google.android.gms.internal.firebase-auth-api.zzdx) v2_1));
        }
    }

    public static bridge synthetic byte[] zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzln.zza;
    }
}
