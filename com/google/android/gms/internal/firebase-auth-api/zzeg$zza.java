package com.google.android.gms.internal.firebase-auth-api;
public final class zzeg$zza {
    private Integer zza;
    private com.google.android.gms.internal.firebase-auth-api.zzeg$zzb zzb;

    private zzeg$zza()
    {
        this.zza = 0;
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zzc;
        return;
    }

    public synthetic zzeg$zza(com.google.android.gms.internal.firebase-auth-api.zzeh p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzeg$zza zza(int p3)
    {
        if ((p3 != 16) && (p3 != 32)) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zza = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzeg$zza zza(com.google.android.gms.internal.firebase-auth-api.zzeg$zzb p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzeg zza()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        } else {
            if (this.zzb == null) {
                throw new java.security.GeneralSecurityException("Variant is not set");
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzeg(v0_0.intValue(), this.zzb, 0);
            }
        }
    }
}
