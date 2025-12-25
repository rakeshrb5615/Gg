package com.google.android.gms.internal.firebase-auth-api;
public final class zzkh extends com.google.android.gms.internal.firebase-auth-api.zzli {
    private final com.google.android.gms.internal.firebase-auth-api.zzkb zza;
    private final java.security.spec.ECPoint zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzd;
    private final Integer zze;

    private zzkh(com.google.android.gms.internal.firebase-auth-api.zzkb p1, java.security.spec.ECPoint p2, com.google.android.gms.internal.firebase-auth-api.zzaaj p3, com.google.android.gms.internal.firebase-auth-api.zzaaj p4, Integer p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzaaj zza(com.google.android.gms.internal.firebase-auth-api.zzkb$zzd p1, Integer p2)
    {
        if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zzc) {
            if (p2 == null) {
                throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(p1)));
            } else {
                if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zzb) {
                    if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zza) {
                        throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(p1)));
                    } else {
                        return com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p2.intValue());
                    }
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzpe.zza(p2.intValue());
                }
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzpe.zza;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzkh zza(com.google.android.gms.internal.firebase-auth-api.zzkb p7, com.google.android.gms.internal.firebase-auth-api.zzaaj p8, Integer p9)
    {
        if (!p7.zzd().equals(com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzd)) {
            throw new java.security.GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzkh.zzb(p7.zzg(), p9);
            if (p8.zza() != 32) {
                throw new java.security.GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzkh(p7, 0, p8, com.google.android.gms.internal.firebase-auth-api.zzkh.zza(p7.zzg(), p9), p9);
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzkh zza(com.google.android.gms.internal.firebase-auth-api.zzkb p7, java.security.spec.ECPoint p8, Integer p9)
    {
        if (p7.zzd().equals(com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzd)) {
            throw new java.security.GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        } else {
            java.security.spec.EllipticCurve v0_4;
            com.google.android.gms.internal.firebase-auth-api.zzkh.zzb(p7.zzg(), p9);
            java.security.spec.EllipticCurve v0_2 = p7.zzd();
            if (v0_2 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zza) {
                if (v0_2 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzb) {
                    if (v0_2 != com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzc) {
                        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(v0_2)));
                    } else {
                        v0_4 = com.google.android.gms.internal.firebase-auth-api.zznj.zzc.getCurve();
                    }
                } else {
                    v0_4 = com.google.android.gms.internal.firebase-auth-api.zznj.zzb.getCurve();
                }
            } else {
                v0_4 = com.google.android.gms.internal.firebase-auth-api.zznj.zza.getCurve();
            }
            com.google.android.gms.internal.firebase-auth-api.zznj.zza(p8, v0_4);
            return new com.google.android.gms.internal.firebase-auth-api.zzkh(p7, p8, 0, com.google.android.gms.internal.firebase-auth-api.zzkh.zza(p7.zzg(), p9), p9);
        }
    }

    private static void zzb(com.google.android.gms.internal.firebase-auth-api.zzkb$zzd p2, Integer p3)
    {
        String v0_0 = com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zzc;
        if ((!p2.equals(v0_0)) && (p3 == null)) {
            throw new java.security.GeneralSecurityException(v1.a.l("\'idRequirement\' must be non-null for ", String.valueOf(p2), " variant."));
        } else {
            if ((p2.equals(v0_0)) && (p3 != null)) {
                throw new java.security.GeneralSecurityException("\'idRequirement\' must be null for NO_PREFIX variant.");
            } else {
                return;
            }
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkb) this.zzc());
    }

    public final Integer zzb()
    {
        return this.zze;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzlg zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzd()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zze()
    {
        return this.zzc;
    }

    public final java.security.spec.ECPoint zzf()
    {
        return this.zzb;
    }
}
