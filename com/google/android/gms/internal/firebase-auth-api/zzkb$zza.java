package com.google.android.gms.internal.firebase-auth-api;
public final class zzkb$zza {
    private com.google.android.gms.internal.firebase-auth-api.zzkb$zzc zza;
    private com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzkb$zze zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzcb zzd;
    private com.google.android.gms.internal.firebase-auth-api.zzkb$zzd zze;
    private com.google.android.gms.internal.firebase-auth-api.zzaaj zzf;

    private zzkb$zza()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zzc;
        this.zzf = 0;
        return;
    }

    public synthetic zzkb$zza(com.google.android.gms.internal.firebase-auth-api.zzkf p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zza zza(com.google.android.gms.internal.firebase-auth-api.zzaaj p2)
    {
        if (p2.zza() != 0) {
            this.zzf = p2;
            return this;
        } else {
            this.zzf = 0;
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zza zza(com.google.android.gms.internal.firebase-auth-api.zzcb p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzkb.zzi().contains(p4)) {
            throw new java.security.GeneralSecurityException(v1.a.l("Invalid DEM parameters ", String.valueOf(p4), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        } else {
            this.zzd = p4;
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zza zza(com.google.android.gms.internal.firebase-auth-api.zzkb$zzb p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zza zza(com.google.android.gms.internal.firebase-auth-api.zzkb$zzc p1)
    {
        this.zza = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zza zza(com.google.android.gms.internal.firebase-auth-api.zzkb$zzd p1)
    {
        this.zze = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zza zza(com.google.android.gms.internal.firebase-auth-api.zzkb$zze p1)
    {
        this.zzc = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb zza()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Elliptic curve type is not set");
        } else {
            if (this.zzb == null) {
                throw new java.security.GeneralSecurityException("Hash type is not set");
            } else {
                if (this.zzd == null) {
                    throw new java.security.GeneralSecurityException("DEM parameters are not set");
                } else {
                    if (this.zze == null) {
                        throw new java.security.GeneralSecurityException("Variant is not set");
                    } else {
                        String v1_4 = com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzd;
                        if ((v0_0 != v1_4) && (this.zzc == null)) {
                            throw new java.security.GeneralSecurityException("Point format is not set");
                        } else {
                            if ((v0_0 == v1_4) && (this.zzc != null)) {
                                throw new java.security.GeneralSecurityException("For Curve25519 point format must not be set");
                            } else {
                                return new com.google.android.gms.internal.firebase-auth-api.zzkb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, 0);
                            }
                        }
                    }
                }
            }
        }
    }
}
