package com.google.android.gms.internal.firebase-auth-api;
public final class zzqp$zza {
    private com.google.android.gms.internal.firebase-auth-api.zzqu zza;
    private com.google.android.gms.internal.firebase-auth-api.zzaal zzb;
    private Integer zzc;

    private zzqp$zza()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        return;
    }

    public synthetic zzqp$zza(com.google.android.gms.internal.firebase-auth-api.zzqr p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqp$zza zza(com.google.android.gms.internal.firebase-auth-api.zzaal p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqp$zza zza(com.google.android.gms.internal.firebase-auth-api.zzqu p1)
    {
        this.zza = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqp$zza zza(Integer p1)
    {
        this.zzc = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqp zza()
    {
        IllegalStateException v0_0 = this.zza;
        if ((v0_0 == null) || (this.zzb == null)) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        } else {
            if (v0_0.zzc() != this.zzb.zza()) {
                throw new java.security.GeneralSecurityException("Key size mismatch");
            } else {
                if ((this.zza.zza()) && (this.zzc == null)) {
                    throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                } else {
                    if ((!this.zza.zza()) && (this.zzc != null)) {
                        throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    } else {
                        IllegalStateException v0_27;
                        if (this.zza.zze() != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzd) {
                            if ((this.zza.zze() != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzc) && (this.zza.zze() != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzb)) {
                                if (this.zza.zze() != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zza) {
                                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                                } else {
                                    v0_27 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(this.zzc.intValue());
                                }
                            } else {
                                v0_27 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza(this.zzc.intValue());
                            }
                        } else {
                            v0_27 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza;
                        }
                        return new com.google.android.gms.internal.firebase-auth-api.zzqp(this.zza, this.zzb, v0_27, this.zzc, 0);
                    }
                }
            }
        }
    }
}
