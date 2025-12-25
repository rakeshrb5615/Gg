package com.google.android.gms.internal.firebase-auth-api;
public final class zzet extends com.google.android.gms.internal.firebase-auth-api.zzcw {
    private final com.google.android.gms.internal.firebase-auth-api.zzev zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzb;
    private final Integer zzc;

    private zzet(com.google.android.gms.internal.firebase-auth-api.zzev p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2, Integer p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzet zza(com.google.android.gms.internal.firebase-auth-api.zzev p2, Integer p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaaj v0_4;
        if (p2.zzb() != com.google.android.gms.internal.firebase-auth-api.zzev$zza.zza) {
            if (p2.zzb() != com.google.android.gms.internal.firebase-auth-api.zzev$zza.zzb) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(p2.zzb())));
            } else {
                if (p3 != null) {
                    throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzaaj v0_3 = new byte[0];
                    v0_4 = com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(v0_3);
                }
            }
        } else {
            if (p3 == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            } else {
                v0_4 = com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(java.nio.ByteBuffer.allocate(5).put(1).putInt(p3.intValue()).array());
            }
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzet(p2, v0_4, p3);
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzev) this.zzc());
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
