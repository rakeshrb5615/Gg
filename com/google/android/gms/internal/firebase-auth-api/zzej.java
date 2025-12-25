package com.google.android.gms.internal.firebase-auth-api;
public final class zzej extends com.google.android.gms.internal.firebase-auth-api.zzcw {
    private final com.google.android.gms.internal.firebase-auth-api.zzem zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaal zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzc;
    private final Integer zzd;

    private zzej(com.google.android.gms.internal.firebase-auth-api.zzem p1, com.google.android.gms.internal.firebase-auth-api.zzaal p2, com.google.android.gms.internal.firebase-auth-api.zzaaj p3, Integer p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzej zza(com.google.android.gms.internal.firebase-auth-api.zzem$zza p3, com.google.android.gms.internal.firebase-auth-api.zzaal p4, Integer p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaaj v0_0 = com.google.android.gms.internal.firebase-auth-api.zzem$zza.zzc;
        if ((p3 != v0_0) && (p5 == null)) {
            throw new java.security.GeneralSecurityException(v1.a.l("For given Variant ", String.valueOf(p3), " the value of idRequirement must be non-null"));
        } else {
            if ((p3 == v0_0) && (p5 != null)) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            } else {
                if (p4.zza() != 32) {
                    throw new java.security.GeneralSecurityException(g2.g.c(p4.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzaaj v0_4;
                    String v3_5 = com.google.android.gms.internal.firebase-auth-api.zzem.zza(p3);
                    if (v3_5.zzb() != v0_0) {
                        if (v3_5.zzb() != com.google.android.gms.internal.firebase-auth-api.zzem$zza.zzb) {
                            if (v3_5.zzb() != com.google.android.gms.internal.firebase-auth-api.zzem$zza.zza) {
                                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(v3_5.zzb())));
                            } else {
                                v0_4 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p5.intValue());
                            }
                        } else {
                            v0_4 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza(p5.intValue());
                        }
                    } else {
                        v0_4 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza;
                    }
                    return new com.google.android.gms.internal.firebase-auth-api.zzej(v3_5, p4, v0_4, p5);
                }
            }
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzem) this.zzc());
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
