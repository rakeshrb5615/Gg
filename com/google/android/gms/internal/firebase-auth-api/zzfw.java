package com.google.android.gms.internal.firebase-auth-api;
public final class zzfw extends com.google.android.gms.internal.firebase-auth-api.zzcw {
    private final com.google.android.gms.internal.firebase-auth-api.zzfz zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaal zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzc;
    private final Integer zzd;

    private zzfw(com.google.android.gms.internal.firebase-auth-api.zzfz p1, com.google.android.gms.internal.firebase-auth-api.zzaal p2, com.google.android.gms.internal.firebase-auth-api.zzaaj p3, Integer p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzfw zza(com.google.android.gms.internal.firebase-auth-api.zzfz p3, com.google.android.gms.internal.firebase-auth-api.zzaal p4, Integer p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaaj v1_0 = com.google.android.gms.internal.firebase-auth-api.zzfz$zza.zzb;
        if ((p3.zzc() != v1_0) && (p5 == null)) {
            throw new java.security.GeneralSecurityException(v1.a.l("For given Variant ", String.valueOf(p3.zzc()), " the value of idRequirement must be non-null"));
        } else {
            if ((p3.zzc() == v1_0) && (p5 != null)) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            } else {
                if (p4.zza() != 32) {
                    throw new java.security.GeneralSecurityException(g2.g.c(p4.zza(), "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzaaj v1_3;
                    if (p3.zzc() != v1_0) {
                        if (p3.zzc() != com.google.android.gms.internal.firebase-auth-api.zzfz$zza.zza) {
                            throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(p3.zzc())));
                        } else {
                            v1_3 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p5.intValue());
                        }
                    } else {
                        v1_3 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza;
                    }
                    return new com.google.android.gms.internal.firebase-auth-api.zzfw(p3, p4, v1_3, p5);
                }
            }
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzfz) this.zzc());
    }

    public final Integer zzb()
    {
        return this.zzd;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcy zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzd()
    {
        return this.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaal zze()
    {
        return this.zzb;
    }
}
