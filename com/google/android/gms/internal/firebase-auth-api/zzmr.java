package com.google.android.gms.internal.firebase-auth-api;
final class zzmr implements com.google.android.gms.internal.firebase-auth-api.zzmf {
    private final com.google.android.gms.internal.firebase-auth-api.zzzi zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzlz zzb;

    private zzmr(com.google.android.gms.internal.firebase-auth-api.zzlz p1, com.google.android.gms.internal.firebase-auth-api.zzzi p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzmr zza(com.google.android.gms.internal.firebase-auth-api.zzzi p2)
    {
        java.security.GeneralSecurityException v0_4 = com.google.android.gms.internal.firebase-auth-api.zzmq.zza[p2.ordinal()];
        if (v0_4 == 1) {
            return new com.google.android.gms.internal.firebase-auth-api.zzmr(new com.google.android.gms.internal.firebase-auth-api.zzlz("HmacSha256"), com.google.android.gms.internal.firebase-auth-api.zzzi.zza);
        } else {
            if (v0_4 == 2) {
                return new com.google.android.gms.internal.firebase-auth-api.zzmr(new com.google.android.gms.internal.firebase-auth-api.zzlz("HmacSha384"), com.google.android.gms.internal.firebase-auth-api.zzzi.zzb);
            } else {
                if (v0_4 != 3) {
                    throw new java.security.GeneralSecurityException("invalid curve type: ".concat(String.valueOf(p2)));
                } else {
                    return new com.google.android.gms.internal.firebase-auth-api.zzmr(new com.google.android.gms.internal.firebase-auth-api.zzlz("HmacSha512"), com.google.android.gms.internal.firebase-auth-api.zzzi.zzc);
                }
            }
        }
    }

    public final byte[] zza()
    {
        java.security.GeneralSecurityException v0_5 = com.google.android.gms.internal.firebase-auth-api.zzmq.zza[this.zza.ordinal()];
        if (v0_5 == 1) {
            return com.google.android.gms.internal.firebase-auth-api.zzmk.zzc;
        } else {
            if (v0_5 == 2) {
                return com.google.android.gms.internal.firebase-auth-api.zzmk.zzd;
            } else {
                if (v0_5 != 3) {
                    throw new java.security.GeneralSecurityException("Could not determine HPKE KEM ID");
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzmk.zze;
                }
            }
        }
    }

    public final byte[] zza(byte[] p11, com.google.android.gms.internal.firebase-auth-api.zzme p12)
    {
        com.google.android.gms.internal.firebase-auth-api.zzlz v2_0 = this.zzb;
        return v2_0.zza(0, com.google.android.gms.internal.firebase-auth-api.zzzf.zza(com.google.android.gms.internal.firebase-auth-api.zzzf.zza(this.zza, p12.zza().zzb()), com.google.android.gms.internal.firebase-auth-api.zzzf.zza(com.google.android.gms.internal.firebase-auth-api.zzzf.zza(this.zza), com.google.android.gms.internal.firebase-auth-api.zzzh.zza, p11)), "eae_prk", com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p11, p12.zzb().zzb()})), "shared_secret", com.google.android.gms.internal.firebase-auth-api.zzmk.zza(this.zza()), v2_0.zza());
    }
}
