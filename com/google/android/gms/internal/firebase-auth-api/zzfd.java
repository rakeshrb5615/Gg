package com.google.android.gms.internal.firebase-auth-api;
public final class zzfd extends com.google.android.gms.internal.firebase-auth-api.zzcw {
    private final com.google.android.gms.internal.firebase-auth-api.zzfc zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzb;
    private final Integer zzc;

    private zzfd(com.google.android.gms.internal.firebase-auth-api.zzfc p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2, Integer p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzfd zza(com.google.android.gms.internal.firebase-auth-api.zzfc p2, Integer p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaaj v0_3;
        if (p2.zzc() != com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zzb) {
            if (p2.zzc() != com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zza) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(p2.zzc())));
            } else {
                if (p3 == null) {
                    throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
                } else {
                    v0_3 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p3.intValue());
                }
            }
        } else {
            if (p3 != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            } else {
                v0_3 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza;
            }
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzfd(p2, v0_3, p3);
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzfc) this.zzc());
    }

    public final Integer zzb()
    {
        return this.zzc;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcy zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzd()
    {
        return this.zzb;
    }
}
