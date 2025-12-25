package com.google.android.gms.internal.firebase-auth-api;
public final class zzjf$zzb {
    private Integer zza;
    private com.google.android.gms.internal.firebase-auth-api.zzjf$zza zzb;

    private zzjf$zzb()
    {
        this.zza = 0;
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzjf$zza.zzc;
        return;
    }

    public synthetic zzjf$zzb(com.google.android.gms.internal.firebase-auth-api.zzji p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzjf$zzb zza(int p3)
    {
        if ((p3 != 32) && ((p3 != 48) && (p3 != 64))) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zza = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzjf$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzjf$zza p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzjf zza()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        } else {
            if (this.zzb == null) {
                throw new java.security.GeneralSecurityException("Variant is not set");
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzjf(v0_0.intValue(), this.zzb, 0);
            }
        }
    }
}
