package com.google.android.gms.internal.firebase-auth-api;
public final class zzhh implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final ThreadLocal zze;
    private final javax.crypto.SecretKey zzf;
    private final byte[] zzg;

    static zzhh()
    {
        com.google.android.gms.internal.firebase-auth-api.zzhh.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        com.google.android.gms.internal.firebase-auth-api.zzhh.zzb = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
        com.google.android.gms.internal.firebase-auth-api.zzhh.zzc = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("070000004041424344454647");
        com.google.android.gms.internal.firebase-auth-api.zzhh.zzd = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("a0784d7a4716f3feb4f64e7f4b39bf04");
        com.google.android.gms.internal.firebase-auth-api.zzhh.zze = new com.google.android.gms.internal.firebase-auth-api.zzhk();
        return;
    }

    private zzhh(byte[] p3, byte[] p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzhh.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzhh.zzb()) {
                throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
            } else {
                if (p3.length != 32) {
                    throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
                } else {
                    this.zzf = new javax.crypto.spec.SecretKeySpec(p3, "ChaCha20");
                    this.zzg = p4;
                    return;
                }
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzej p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzhh(p3.zze().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), p3.zzd().zzb());
    }

    public static javax.crypto.Cipher zza()
    {
        return ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzhh.zze.get());
    }

    public static synthetic boolean zza(javax.crypto.Cipher p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzhh.zzb(p0);
    }

    public static boolean zzb()
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzhh.zze.get() == null) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zzb(javax.crypto.Cipher p7)
    {
        try {
            javax.crypto.spec.IvParameterSpec v2_1 = new javax.crypto.spec.IvParameterSpec(com.google.android.gms.internal.firebase-auth-api.zzhh.zzc);
            byte[] v4 = com.google.android.gms.internal.firebase-auth-api.zzhh.zzb;
            p7.init(2, new javax.crypto.spec.SecretKeySpec(v4, "ChaCha20"), v2_1);
            byte[] v3_0 = com.google.android.gms.internal.firebase-auth-api.zzhh.zzd;
        } catch (java.security.GeneralSecurityException) {
            return 0;
        }
        if (p7.doFinal(v3_0).length == 0) {
            p7.init(2, new javax.crypto.spec.SecretKeySpec(v4, "ChaCha20"), v2_1);
            if (p7.doFinal(v3_0).length == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final byte[] zza(byte[] p6, byte[] p7)
    {
        if (p6 == null) {
            throw new NullPointerException("ciphertext is null");
        } else {
            javax.crypto.Cipher v1_4 = this.zzg;
            if (p6.length < (v1_4.length + 28)) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            } else {
                if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v1_4, p6)) {
                    throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                } else {
                    javax.crypto.Cipher v1_0 = new byte[12];
                    System.arraycopy(p6, this.zzg.length, v1_0, 0, 12);
                    javax.crypto.Cipher v1_3 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzhh.zze.get());
                    v1_3.init(2, this.zzf, new javax.crypto.spec.IvParameterSpec(v1_0));
                    if ((p7 != 0) && (p7.length != 0)) {
                        v1_3.updateAAD(p7);
                    }
                    int v7_4 = this.zzg;
                    return v1_3.doFinal(p6, (v7_4.length + 12), ((p6.length - v7_4.length) - 12));
                }
            }
        }
    }

    public final byte[] zzb(byte[] p11, byte[] p12)
    {
        if (p11 == null) {
            throw new NullPointerException("plaintext is null");
        } else {
            int v1_2 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(12);
            javax.crypto.Cipher v4_1 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzhh.zze.get());
            v4_1.init(1, this.zzf, new javax.crypto.spec.IvParameterSpec(v1_2));
            if ((p12 != null) && (p12.length != 0)) {
                v4_1.updateAAD(p12);
            }
            String v12_3 = v4_1.getOutputSize(p11.length);
            int v2_1 = this.zzg;
            if (v12_3 > (2147483635 - v2_1.length)) {
                throw new java.security.GeneralSecurityException("plaintext too long");
            } else {
                byte[] v8 = java.util.Arrays.copyOf(v2_1, ((v2_1.length + 12) + v12_3));
                System.arraycopy(v1_2, 0, v8, this.zzg.length, 12);
                if (v4_1.doFinal(p11, 0, p11.length, v8, (this.zzg.length + 12)) != v12_3) {
                    throw new java.security.GeneralSecurityException("not enough data written");
                } else {
                    return v8;
                }
            }
        }
    }
}
