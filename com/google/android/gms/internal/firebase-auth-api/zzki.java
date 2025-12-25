package com.google.android.gms.internal.firebase-auth-api;
public final class zzki extends com.google.android.gms.internal.firebase-auth-api.zzlj {
    private final com.google.android.gms.internal.firebase-auth-api.zzkq zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaal zzb;

    private zzki(com.google.android.gms.internal.firebase-auth-api.zzkq p1, com.google.android.gms.internal.firebase-auth-api.zzaal p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzki zza(com.google.android.gms.internal.firebase-auth-api.zzkq p7, com.google.android.gms.internal.firebase-auth-api.zzaal p8)
    {
        byte[] v1_0 = Integer.valueOf(32);
        if (p7 == null) {
            throw new java.security.GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        } else {
            if (p8 == null) {
                throw new java.security.GeneralSecurityException("HPKE private key cannot be constructed without secret");
            } else {
                java.security.spec.ECPoint v2_5 = ((com.google.android.gms.internal.firebase-auth-api.zzkg) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p7.zza())).zze();
                String v3_1 = p8.zza();
                com.google.android.gms.internal.firebase-auth-api.zzzh v4_8 = String.valueOf(v2_5);
                int v5_2 = new StringBuilder("Encoded private key byte length for ");
                v5_2.append(v4_8);
                v5_2.append(" must be %d, not ");
                v5_2.append(v3_1);
                com.google.android.gms.internal.firebase-auth-api.zzzh v4_10 = v5_2.toString();
                int v5_3 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza;
                if (v2_5 != v5_3) {
                    if (v2_5 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                        if (v2_5 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                            if (v2_5 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd) {
                                throw new java.security.GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(v2_5)));
                            } else {
                                if (v3_1 != 32) {
                                    throw new java.security.GeneralSecurityException(String.format(v4_10, new Object[] {v1_0})));
                                }
                            }
                        } else {
                            if (v3_1 != 66) {
                                throw new java.security.GeneralSecurityException(String.format(v4_10, new Object[] {Integer.valueOf(66)})));
                            }
                        }
                    } else {
                        if (v3_1 != 48) {
                            throw new java.security.GeneralSecurityException(String.format(v4_10, new Object[] {Integer.valueOf(48)})));
                        }
                    }
                } else {
                    if (v3_1 != 32) {
                        throw new java.security.GeneralSecurityException(String.format(v4_10, new Object[] {v1_0})));
                    }
                }
                com.google.android.gms.internal.firebase-auth-api.zzki v0_17 = ((com.google.android.gms.internal.firebase-auth-api.zzkg) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p7.zza())).zze();
                byte[] v1_2 = p7.zze().zzb();
                java.security.spec.ECPoint v2_7 = p8.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
                if ((v0_17 != v5_3) && ((v0_17 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) && (v0_17 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc))) {
                    if (v0_17 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd) {
                        throw new IllegalArgumentException("Unable to validate key pair for ".concat(String.valueOf(v0_17)));
                    } else {
                        if (!java.util.Arrays.equals(com.google.android.gms.internal.firebase-auth-api.zzaah.zza(v2_7), v1_2)) {
                            throw new java.security.GeneralSecurityException("Invalid private key for public key.");
                        }
                    }
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzki v0_5;
                    if (v0_17 != v5_3) {
                        if (v0_17 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                            if (v0_17 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                                throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(String.valueOf(v0_17)));
                            } else {
                                v0_5 = com.google.android.gms.internal.firebase-auth-api.zznj.zzc;
                            }
                        } else {
                            v0_5 = com.google.android.gms.internal.firebase-auth-api.zznj.zzb;
                        }
                    } else {
                        v0_5 = com.google.android.gms.internal.firebase-auth-api.zznj.zza;
                    }
                    com.google.android.gms.internal.firebase-auth-api.zzzh v4_5 = v0_5.getOrder();
                    java.security.spec.ECPoint v2_1 = com.google.android.gms.internal.firebase-auth-api.zzne.zza(v2_7);
                    if ((v2_1.signum() <= 0) || (v2_1.compareTo(v4_5) >= 0)) {
                        throw new java.security.GeneralSecurityException("Invalid private key.");
                    } else {
                        if (!com.google.android.gms.internal.firebase-auth-api.zznj.zza(v2_1, v0_5).equals(com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_5.getCurve(), com.google.android.gms.internal.firebase-auth-api.zzzh.zza, v1_2))) {
                            throw new java.security.GeneralSecurityException("Invalid private key for public key.");
                        }
                    }
                }
                return new com.google.android.gms.internal.firebase-auth-api.zzki(p7, p8);
            }
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkg) this.zzd());
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzbi zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkq) this.zze());
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzlg zzd()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzkg) ((com.google.android.gms.internal.firebase-auth-api.zzlg) this.zza.zza()));
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzli zze()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaal zzf()
    {
        return this.zzb;
    }
}
