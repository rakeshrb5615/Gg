package com.google.android.gms.internal.firebase-auth-api;
public final class zzdq$zza {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzdq$zzb zzd;

    private zzdq$zza()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = com.google.android.gms.internal.firebase-auth-api.zzdq$zzb.zzc;
        return;
    }

    public synthetic zzdq$zza(com.google.android.gms.internal.firebase-auth-api.zzdr p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdq$zza zza(int p3)
    {
        if ((p3 != 12) && (p3 != 16)) {
            throw new java.security.GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zzb = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdq$zza zza(com.google.android.gms.internal.firebase-auth-api.zzdq$zzb p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdq zza()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        } else {
            if (this.zzb == null) {
                throw new java.security.GeneralSecurityException("IV size is not set");
            } else {
                if (this.zzd == null) {
                    throw new java.security.GeneralSecurityException("Variant is not set");
                } else {
                    if (this.zzc == null) {
                        throw new java.security.GeneralSecurityException("Tag size is not set");
                    } else {
                        return new com.google.android.gms.internal.firebase-auth-api.zzdq(v0_0.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd, 0);
                    }
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdq$zza zzb(int p3)
    {
        if ((p3 != 16) && ((p3 != 24) && (p3 != 32))) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zza = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdq$zza zzc(int p1)
    {
        this.zzc = Integer.valueOf(16);
        return this;
    }
}
