package com.google.android.gms.internal.firebase-auth-api;
public final class zzyy implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private final javax.crypto.SecretKey zzb;
    private final byte[] zzc;

    static zzyy()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyy.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb;
        return;
    }

    private zzyy(byte[] p2, com.google.android.gms.internal.firebase-auth-api.zzaaj p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzyy.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        } else {
            this.zzb = com.google.android.gms.internal.firebase-auth-api.zzgr.zzb(p2);
            this.zzc = p3.zzb();
            return;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzds p3)
    {
        if (((com.google.android.gms.internal.firebase-auth-api.zzdx) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb() != 12) {
            throw new java.security.GeneralSecurityException(g2.g.c(((com.google.android.gms.internal.firebase-auth-api.zzdx) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb(), "Expected IV Size 12, got "));
        } else {
            if (((com.google.android.gms.internal.firebase-auth-api.zzdx) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzd() != 16) {
                throw new java.security.GeneralSecurityException(g2.g.c(((com.google.android.gms.internal.firebase-auth-api.zzdx) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzd(), "Expected tag Size 16, got "));
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzyy(p3.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), p3.zzd());
            }
        }
    }

    public final byte[] zza(byte[] p6, byte[] p7)
    {
        if (p6 == null) {
            throw new NullPointerException("ciphertext is null");
        } else {
            int v1_1 = this.zzc;
            if (p6.length < (v1_1.length + 28)) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            } else {
                if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v1_1, p6)) {
                    throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                } else {
                    int v0_3 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza(p6, this.zzc.length, 12);
                    javax.crypto.Cipher v2_0 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza();
                    v2_0.init(2, this.zzb, v0_3);
                    if ((p7 != 0) && (p7.length != 0)) {
                        v2_0.updateAAD(p7);
                    }
                    int v7_4 = this.zzc;
                    return v2_0.doFinal(p6, (v7_4.length + 12), ((p6.length - v7_4.length) - 12));
                }
            }
        }
    }

    public final byte[] zzb(byte[] p10, byte[] p11)
    {
        if (p10 == null) {
            throw new NullPointerException("plaintext is null");
        } else {
            int v1_2 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(12);
            int v2_4 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza(v1_2);
            javax.crypto.Cipher v3 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza();
            v3.init(1, this.zzb, v2_4);
            if ((p11 != null) && (p11.length != 0)) {
                v3.updateAAD(p11);
            }
            String v11_3 = v3.getOutputSize(p10.length);
            int v2_1 = this.zzc;
            if (v11_3 > (2147483635 - v2_1.length)) {
                throw new java.security.GeneralSecurityException("plaintext too long");
            } else {
                byte[] v7 = java.util.Arrays.copyOf(v2_1, ((v2_1.length + 12) + v11_3));
                System.arraycopy(v1_2, 0, v7, this.zzc.length, 12);
                if (v3.doFinal(p10, 0, p10.length, v7, (this.zzc.length + 12)) != v11_3) {
                    throw new java.security.GeneralSecurityException("not enough data written");
                } else {
                    return v7;
                }
            }
        }
    }
}
