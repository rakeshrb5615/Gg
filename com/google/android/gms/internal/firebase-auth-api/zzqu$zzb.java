package com.google.android.gms.internal.firebase-auth-api;
public final class zzqu$zzb {
    private Integer zza;
    private Integer zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzqu$zza zzc;

    private zzqu$zzb()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzd;
        return;
    }

    public synthetic zzqu$zzb(com.google.android.gms.internal.firebase-auth-api.zzqx p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqu$zzb zza(int p3)
    {
        if ((p3 != 16) && (p3 != 32)) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] {Integer.valueOf((p3 << 3))})));
        } else {
            this.zza = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqu$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzqu$zza p1)
    {
        this.zzc = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqu zza()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("key size not set");
        } else {
            if (this.zzb == null) {
                throw new java.security.GeneralSecurityException("tag size not set");
            } else {
                if (this.zzc == null) {
                    throw new java.security.GeneralSecurityException("variant not set");
                } else {
                    return new com.google.android.gms.internal.firebase-auth-api.zzqu(v0_0.intValue(), this.zzb.intValue(), this.zzc, 0);
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqu$zzb zzb(int p3)
    {
        if ((p3 < 10) || (16 < p3)) {
            throw new java.security.GeneralSecurityException(g2.g.c(p3, "Invalid tag size for AesCmacParameters: "));
        } else {
            this.zzb = Integer.valueOf(p3);
            return this;
        }
    }
}
