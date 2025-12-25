package com.google.android.gms.internal.firebase-auth-api;
public final class zzkq extends com.google.android.gms.internal.firebase-auth-api.zzli {
    private final com.google.android.gms.internal.firebase-auth-api.zzkg zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzc;
    private final Integer zzd;

    private zzkq(com.google.android.gms.internal.firebase-auth-api.zzkg p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2, com.google.android.gms.internal.firebase-auth-api.zzaaj p3, Integer p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzkq zza(com.google.android.gms.internal.firebase-auth-api.zzkg p6, com.google.android.gms.internal.firebase-auth-api.zzaaj p7, Integer p8)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaaj v0_0 = p6.zzf();
        com.google.android.gms.internal.firebase-auth-api.zzkg$zze v1_4 = com.google.android.gms.internal.firebase-auth-api.zzkg$zze.zzc;
        if ((!v0_0.equals(v1_4)) && (p8 == null)) {
            throw new java.security.GeneralSecurityException(v1.a.l("\'idRequirement\' must be non-null for ", String.valueOf(v0_0), " variant."));
        } else {
            if ((v0_0.equals(v1_4)) && (p8 != null)) {
                throw new java.security.GeneralSecurityException("\'idRequirement\' must be null for NO_PREFIX variant.");
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzaaj v0_11 = p6.zze();
                com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v2_6 = p7.zza();
                byte[] v3_1 = String.valueOf(v0_11);
                com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v4_1 = new StringBuilder("Encoded public key byte length for ");
                v4_1.append(v3_1);
                v4_1.append(" must be %d, not ");
                v4_1.append(v2_6);
                byte[] v3_3 = v4_1.toString();
                com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v4_2 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza;
                if (v0_11 != v4_2) {
                    if (v0_11 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                        if (v0_11 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                            if (v0_11 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd) {
                                throw new java.security.GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(v0_11)));
                            } else {
                                if (v2_6 != 32) {
                                    throw new java.security.GeneralSecurityException(String.format(v3_3, new Object[] {Integer.valueOf(32)})));
                                }
                            }
                        } else {
                            if (v2_6 != 133) {
                                throw new java.security.GeneralSecurityException(String.format(v3_3, new Object[] {Integer.valueOf(133)})));
                            }
                        }
                    } else {
                        if (v2_6 != 97) {
                            throw new java.security.GeneralSecurityException(String.format(v3_3, new Object[] {Integer.valueOf(97)})));
                        }
                    }
                } else {
                    if (v2_6 != 65) {
                        throw new java.security.GeneralSecurityException(String.format(v3_3, new Object[] {Integer.valueOf(65)})));
                    }
                }
                if ((v0_11 == v4_2) || ((v0_11 == com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) || (v0_11 == com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc))) {
                    com.google.android.gms.internal.firebase-auth-api.zzaaj v0_3;
                    if (v0_11 != v4_2) {
                        if (v0_11 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                            if (v0_11 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(v0_11)));
                            } else {
                                v0_3 = com.google.android.gms.internal.firebase-auth-api.zznj.zzc.getCurve();
                            }
                        } else {
                            v0_3 = com.google.android.gms.internal.firebase-auth-api.zznj.zzb.getCurve();
                        }
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zznj.zza.getCurve();
                    }
                    com.google.android.gms.internal.firebase-auth-api.zznj.zza(com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_3, com.google.android.gms.internal.firebase-auth-api.zzzh.zza, p7.zzb()), v0_3);
                }
                com.google.android.gms.internal.firebase-auth-api.zzaaj v0_8;
                com.google.android.gms.internal.firebase-auth-api.zzaaj v0_6 = p6.zzf();
                if (v0_6 != v1_4) {
                    if (p8 == null) {
                        throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(v0_6)));
                    } else {
                        if (v0_6 != com.google.android.gms.internal.firebase-auth-api.zzkg$zze.zzb) {
                            if (v0_6 != com.google.android.gms.internal.firebase-auth-api.zzkg$zze.zza) {
                                throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(String.valueOf(v0_6)));
                            } else {
                                v0_8 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p8.intValue());
                            }
                        } else {
                            v0_8 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza(p8.intValue());
                        }
                    }
                } else {
                    v0_8 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza;
                }
                return new com.google.android.gms.internal.firebase-auth-api.zzkq(p6, p7, v0_8, p8);
            }
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkg) this.zzc());
    }

    public final Integer zzb()
    {
        return this.zzd;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzlg zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzd()
    {
        return this.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zze()
    {
        return this.zzb;
    }
}
