package com.google.android.gms.internal.firebase-auth-api;
public final class zzmh {

    public static com.google.android.gms.internal.firebase-auth-api.zzly zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zzb p1)
    {
        if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zza) {
            if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zzb) {
                if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zzc) {
                    throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
                } else {
                    return new com.google.android.gms.internal.firebase-auth-api.zzlk();
                }
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzll(32);
            }
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzll(16);
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzmc zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zzc p1)
    {
        if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zza) {
            if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zzb) {
                if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zzc) {
                    throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
                } else {
                    return new com.google.android.gms.internal.firebase-auth-api.zzlz("HmacSha512");
                }
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzlz("HmacSha384");
            }
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzlz("HmacSha256");
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzmf zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf p2)
    {
        if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd) {
            if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza) {
                if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                    if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
                    } else {
                        return com.google.android.gms.internal.firebase-auth-api.zzmr.zza(com.google.android.gms.internal.firebase-auth-api.zzzi.zzc);
                    }
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzmr.zza(com.google.android.gms.internal.firebase-auth-api.zzzi.zzb);
                }
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzmr.zza(com.google.android.gms.internal.firebase-auth-api.zzzi.zza);
            }
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzmu(new com.google.android.gms.internal.firebase-auth-api.zzlz("HmacSha256"));
        }
    }
}
