package com.google.android.gms.internal.firebase-auth-api;
public final class zzdx$zzb {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzdx$zza zzd;

    private zzdx$zzb()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = com.google.android.gms.internal.firebase-auth-api.zzdx$zza.zzc;
        return;
    }

    public synthetic zzdx$zzb(com.google.android.gms.internal.firebase-auth-api.zzea p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdx$zzb zza(int p1)
    {
        this.zzb = Integer.valueOf(12);
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdx$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdx$zza p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdx zza()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        } else {
            if (this.zzd == null) {
                throw new java.security.GeneralSecurityException("Variant is not set");
            } else {
                if (this.zzb == null) {
                    throw new java.security.GeneralSecurityException("IV size is not set");
                } else {
                    if (this.zzc == null) {
                        throw new java.security.GeneralSecurityException("Tag size is not set");
                    } else {
                        return new com.google.android.gms.internal.firebase-auth-api.zzdx(v0_0.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd, 0);
                    }
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdx$zzb zzb(int p3)
    {
        if ((p3 != 16) && ((p3 != 24) && (p3 != 32))) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zza = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdx$zzb zzc(int p1)
    {
        this.zzc = Integer.valueOf(16);
        return this;
    }
}
