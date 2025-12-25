package com.google.android.gms.internal.firebase-auth-api;
public final class zzdd$zza {
    private com.google.android.gms.internal.firebase-auth-api.zzdi zza;
    private com.google.android.gms.internal.firebase-auth-api.zzaal zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzaal zzc;
    private Integer zzd;

    private zzdd$zza()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        return;
    }

    public synthetic zzdd$zza(com.google.android.gms.internal.firebase-auth-api.zzdf p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdd$zza zza(com.google.android.gms.internal.firebase-auth-api.zzaal p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdd$zza zza(com.google.android.gms.internal.firebase-auth-api.zzdi p1)
    {
        this.zza = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdd$zza zza(Integer p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdd zza()
    {
        IllegalStateException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters");
        } else {
            if ((this.zzb == null) || (this.zzc == null)) {
                throw new java.security.GeneralSecurityException("Cannot build without key material");
            } else {
                if (v0_0.zzb() != this.zzb.zza()) {
                    throw new java.security.GeneralSecurityException("AES key size mismatch");
                } else {
                    if (this.zza.zzc() != this.zzc.zza()) {
                        throw new java.security.GeneralSecurityException("HMAC key size mismatch");
                    } else {
                        if ((this.zza.zza()) && (this.zzd == null)) {
                            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        } else {
                            if ((!this.zza.zza()) && (this.zzd != null)) {
                                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                            } else {
                                IllegalStateException v0_32;
                                if (this.zza.zzh() != com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzc) {
                                    if (this.zza.zzh() != com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzb) {
                                        if (this.zza.zzh() != com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zza) {
                                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                                        } else {
                                            v0_32 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(this.zzd.intValue());
                                        }
                                    } else {
                                        v0_32 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza(this.zzd.intValue());
                                    }
                                } else {
                                    v0_32 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza;
                                }
                                return new com.google.android.gms.internal.firebase-auth-api.zzdd(this.zza, this.zzb, this.zzc, v0_32, this.zzd, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdd$zza zzb(com.google.android.gms.internal.firebase-auth-api.zzaal p1)
    {
        this.zzc = p1;
        return this;
    }
}
