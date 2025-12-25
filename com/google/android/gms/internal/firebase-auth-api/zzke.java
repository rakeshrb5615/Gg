package com.google.android.gms.internal.firebase-auth-api;
public final class zzke extends com.google.android.gms.internal.firebase-auth-api.zzlj {
    private final com.google.android.gms.internal.firebase-auth-api.zzkh zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaam zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzaal zzc;

    private zzke(com.google.android.gms.internal.firebase-auth-api.zzkh p1, com.google.android.gms.internal.firebase-auth-api.zzaam p2, com.google.android.gms.internal.firebase-auth-api.zzaal p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzke zza(com.google.android.gms.internal.firebase-auth-api.zzkh p4, com.google.android.gms.internal.firebase-auth-api.zzaal p5)
    {
        if (p4 == null) {
            throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        } else {
            if (p4.zze() == null) {
                throw new java.security.GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
            } else {
                if (p5 == null) {
                    throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without secret");
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzke v0_1 = p5.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
                    int v1_1 = p4.zze().zzb();
                    if (v0_1.length != 32) {
                        throw new java.security.GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
                    } else {
                        if (!java.util.Arrays.equals(com.google.android.gms.internal.firebase-auth-api.zzaah.zza(v0_1), v1_1)) {
                            throw new java.security.GeneralSecurityException("Invalid private key for public key.");
                        } else {
                            return new com.google.android.gms.internal.firebase-auth-api.zzke(p4, 0, p5);
                        }
                    }
                }
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzke zza(com.google.android.gms.internal.firebase-auth-api.zzkh p6, com.google.android.gms.internal.firebase-auth-api.zzaam p7)
    {
        if (p6 == null) {
            throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        } else {
            if (p6.zzf() == null) {
                throw new java.security.GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            } else {
                if (p7 == null) {
                    throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without secret");
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzke v0_1 = p7.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
                    int v1_0 = p6.zzf();
                    java.security.spec.ECParameterSpec v2_3 = ((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p6.zza())).zzd();
                    int v3_1 = com.google.android.gms.internal.firebase-auth-api.zzke.zza(v2_3).getOrder();
                    if ((v0_1.signum() <= 0) || (v0_1.compareTo(v3_1) >= 0)) {
                        throw new java.security.GeneralSecurityException("Invalid private value");
                    } else {
                        if (!com.google.android.gms.internal.firebase-auth-api.zznj.zza(v0_1, com.google.android.gms.internal.firebase-auth-api.zzke.zza(v2_3)).equals(v1_0)) {
                            throw new java.security.GeneralSecurityException("Invalid private value");
                        } else {
                            return new com.google.android.gms.internal.firebase-auth-api.zzke(p6, p7, 0);
                        }
                    }
                }
            }
        }
    }

    private static java.security.spec.ECParameterSpec zza(com.google.android.gms.internal.firebase-auth-api.zzkb$zzc p2)
    {
        if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zza) {
            if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzb) {
                if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(p2)));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zznj.zzc;
                }
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zznj.zzb;
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zznj.zza;
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkb) this.zzd());
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzbi zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkh) this.zze());
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzlg zzd()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) this.zza.zza()));
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzli zze()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaam zzf()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaal zzg()
    {
        return this.zzc;
    }
}
