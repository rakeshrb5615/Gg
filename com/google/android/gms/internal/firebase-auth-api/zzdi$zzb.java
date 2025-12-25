package com.google.android.gms.internal.firebase-auth-api;
public final class zzdi$zzb {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private Integer zzd;
    private com.google.android.gms.internal.firebase-auth-api.zzdi$zza zze;
    private com.google.android.gms.internal.firebase-auth-api.zzdi$zzc zzf;

    private zzdi$zzb()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzc;
        return;
    }

    public synthetic zzdi$zzb(com.google.android.gms.internal.firebase-auth-api.zzdk p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zzb zza(int p3)
    {
        if ((p3 != 16) && ((p3 != 24) && (p3 != 32))) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zza = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdi$zza p1)
    {
        this.zze = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdi$zzc p1)
    {
        this.zzf = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi zza()
    {
        if (this.zza == null) {
            throw new java.security.GeneralSecurityException("AES key size is not set");
        } else {
            if (this.zzb == null) {
                throw new java.security.GeneralSecurityException("HMAC key size is not set");
            } else {
                if (this.zzc == null) {
                    throw new java.security.GeneralSecurityException("iv size is not set");
                } else {
                    String v0_10 = this.zzd;
                    if (v0_10 == null) {
                        throw new java.security.GeneralSecurityException("tag size is not set");
                    } else {
                        if (this.zze == null) {
                            throw new java.security.GeneralSecurityException("hash type is not set");
                        } else {
                            if (this.zzf == null) {
                                throw new java.security.GeneralSecurityException("variant is not set");
                            } else {
                                java.security.GeneralSecurityException v1_8 = v0_10.intValue();
                                String v2_0 = this.zze;
                                if (v2_0 != com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zza) {
                                    if (v2_0 != com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzb) {
                                        if (v2_0 != com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzc) {
                                            if (v2_0 != com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzd) {
                                                if (v2_0 != com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zze) {
                                                    throw new java.security.GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                                } else {
                                                    if (v1_8 > 64) {
                                                        throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] {v0_10})));
                                                    }
                                                }
                                            } else {
                                                if (v1_8 > 48) {
                                                    throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] {v0_10})));
                                                }
                                            }
                                        } else {
                                            if (v1_8 > 32) {
                                                throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] {v0_10})));
                                            }
                                        }
                                    } else {
                                        if (v1_8 > 28) {
                                            throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] {v0_10})));
                                        }
                                    }
                                } else {
                                    if (v1_8 > 20) {
                                        throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] {v0_10})));
                                    }
                                }
                                return new com.google.android.gms.internal.firebase-auth-api.zzdi(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zzb zzb(int p3)
    {
        if (p3 < 16) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zzb = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zzb zzc(int p3)
    {
        if ((p3 < 12) || (p3 > 16)) {
            throw new java.security.GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zzc = Integer.valueOf(p3);
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zzb zzd(int p3)
    {
        if (p3 < 10) {
            throw new java.security.GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zzd = Integer.valueOf(p3);
            return this;
        }
    }
}
