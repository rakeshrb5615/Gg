package com.google.android.gms.internal.firebase-auth-api;
public final class zzkg$zzd {
    private com.google.android.gms.internal.firebase-auth-api.zzkg$zzf zza;
    private com.google.android.gms.internal.firebase-auth-api.zzkg$zzc zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzkg$zzb zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzkg$zze zzd;

    private zzkg$zzd()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = com.google.android.gms.internal.firebase-auth-api.zzkg$zze.zzc;
        return;
    }

    public synthetic zzkg$zzd(com.google.android.gms.internal.firebase-auth-api.zzkj p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zzd zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zzb p1)
    {
        this.zzc = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zzd zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zzc p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zzd zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zze p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zzd zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf p1)
    {
        this.zza = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg zza()
    {
        String v1_0 = this.zza;
        if (v1_0 == null) {
            throw new java.security.GeneralSecurityException("HPKE KEM parameter is not set");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzc v2 = this.zzb;
            if (v2 == null) {
                throw new java.security.GeneralSecurityException("HPKE KDF parameter is not set");
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzkg$zzb v3 = this.zzc;
                if (v3 == null) {
                    throw new java.security.GeneralSecurityException("HPKE AEAD parameter is not set");
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzkg$zze v4 = this.zzd;
                    if (v4 == null) {
                        throw new java.security.GeneralSecurityException("HPKE variant is not set");
                    } else {
                        return new com.google.android.gms.internal.firebase-auth-api.zzkg(v1_0, v2, v3, v4, 0);
                    }
                }
            }
        }
    }
}
