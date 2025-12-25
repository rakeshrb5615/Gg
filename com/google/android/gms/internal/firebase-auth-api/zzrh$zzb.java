package com.google.android.gms.internal.firebase-auth-api;
public final class zzrh$zzb {
    private Integer zza;
    private Integer zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzrh$zza zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzrh$zzc zzd;

    private zzrh$zzb()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzd;
        return;
    }

    public synthetic zzrh$zzb(com.google.android.gms.internal.firebase-auth-api.zzrj p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzrh$zzb zza(int p1)
    {
        this.zza = Integer.valueOf(p1);
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzrh$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzrh$zza p1)
    {
        this.zzc = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzrh$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzrh$zzc p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzrh zza()
    {
        String v0_0 = this.zza;
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("key size is not set");
        } else {
            if (this.zzb == null) {
                throw new java.security.GeneralSecurityException("tag size is not set");
            } else {
                if (this.zzc == null) {
                    throw new java.security.GeneralSecurityException("hash type is not set");
                } else {
                    if (this.zzd == null) {
                        throw new java.security.GeneralSecurityException("variant is not set");
                    } else {
                        if (v0_0.intValue() < 16) {
                            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[] {this.zza})));
                        } else {
                            String v0_16 = this.zzb;
                            java.security.GeneralSecurityException v1_12 = v0_16.intValue();
                            String v2_3 = this.zzc;
                            if (v1_12 < 10) {
                                throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] {v0_16})));
                            } else {
                                if (v2_3 != com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zza) {
                                    if (v2_3 != com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zzb) {
                                        if (v2_3 != com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zzc) {
                                            if (v2_3 != com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zzd) {
                                                if (v2_3 != com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zze) {
                                                    throw new java.security.GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                                } else {
                                                    if (v1_12 > 64) {
                                                        throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] {v0_16})));
                                                    }
                                                }
                                            } else {
                                                if (v1_12 > 48) {
                                                    throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] {v0_16})));
                                                }
                                            }
                                        } else {
                                            if (v1_12 > 32) {
                                                throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] {v0_16})));
                                            }
                                        }
                                    } else {
                                        if (v1_12 > 28) {
                                            throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] {v0_16})));
                                        }
                                    }
                                } else {
                                    if (v1_12 > 20) {
                                        throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] {v0_16})));
                                    }
                                }
                                return new com.google.android.gms.internal.firebase-auth-api.zzrh(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzrh$zzb zzb(int p1)
    {
        this.zzb = Integer.valueOf(p1);
        return this;
    }
}
