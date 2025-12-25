package com.google.android.gms.internal.firebase-auth-api;
public final class zzik implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private final byte[] zzb;
    private final byte[] zzc;

    static zzik()
    {
        com.google.android.gms.internal.firebase-auth-api.zzik.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        return;
    }

    private zzik(byte[] p3, byte[] p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzik.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzik.zza()) {
                throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
            } else {
                if (p3.length != 32) {
                    throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
                } else {
                    this.zzb = p3;
                    this.zzc = p4;
                    return;
                }
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzgb p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzik(p3.zze().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), p3.zzd().zzb());
    }

    public static boolean zza()
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzhh.zza() == null) {
            return 0;
        } else {
            return 1;
        }
    }

    private static byte[] zza(byte[] p4)
    {
        byte[] v0_1 = new byte[12];
        System.arraycopy(p4, 16, v0_1, 4, 8);
        return v0_1;
    }

    public final byte[] zza(byte[] p6, byte[] p7)
    {
        if (p6 == null) {
            throw new NullPointerException("ciphertext is null");
        } else {
            javax.crypto.Cipher v1_3 = this.zzc;
            if (p6.length < (v1_3.length + 40)) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            } else {
                if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v1_3, p6)) {
                    throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                } else {
                    javax.crypto.Cipher v1_0 = new byte[24];
                    System.arraycopy(p6, this.zzc.length, v1_0, 0, 24);
                    int v3_2 = new javax.crypto.spec.SecretKeySpec(com.google.android.gms.internal.firebase-auth-api.zzhp.zza(this.zzb, v1_0), "ChaCha20");
                    int v2_5 = new javax.crypto.spec.IvParameterSpec(com.google.android.gms.internal.firebase-auth-api.zzik.zza(v1_0));
                    javax.crypto.Cipher v1_2 = com.google.android.gms.internal.firebase-auth-api.zzhh.zza();
                    v1_2.init(2, v3_2, v2_5);
                    if ((p7 != 0) && (p7.length != 0)) {
                        v1_2.updateAAD(p7);
                    }
                    int v7_4 = this.zzc;
                    return v1_2.doFinal(p6, (v7_4.length + 24), ((p6.length - v7_4.length) - 24));
                }
            }
        }
    }

    public final byte[] zzb(byte[] p12, byte[] p13)
    {
        if (p12 == null) {
            throw new NullPointerException("plaintext is null");
        } else {
            int v1_2 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(24);
            int v3_1 = new javax.crypto.spec.SecretKeySpec(com.google.android.gms.internal.firebase-auth-api.zzhp.zza(this.zzb, v1_2), "ChaCha20");
            int v2_2 = new javax.crypto.spec.IvParameterSpec(com.google.android.gms.internal.firebase-auth-api.zzik.zza(v1_2));
            javax.crypto.Cipher v5 = com.google.android.gms.internal.firebase-auth-api.zzhh.zza();
            v5.init(1, v3_1, v2_2);
            if ((p13 != null) && (p13.length != 0)) {
                v5.updateAAD(p13);
            }
            String v13_3 = v5.getOutputSize(p12.length);
            int v2_4 = this.zzc;
            if (v13_3 > (2147483623 - v2_4.length)) {
                throw new java.security.GeneralSecurityException("plaintext too long");
            } else {
                byte[] v9 = java.util.Arrays.copyOf(v2_4, ((v2_4.length + 24) + v13_3));
                System.arraycopy(v1_2, 0, v9, this.zzc.length, 24);
                if (v5.doFinal(p12, 0, p12.length, v9, (this.zzc.length + 24)) != v13_3) {
                    throw new java.security.GeneralSecurityException("not enough data written");
                } else {
                    return v9;
                }
            }
        }
    }
}
