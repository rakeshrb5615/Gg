package com.google.android.gms.internal.firebase-auth-api;
public final class zzhv {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private final javax.crypto.SecretKey zzb;

    static zzhv()
    {
        com.google.android.gms.internal.firebase-auth-api.zzhv.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        return;
    }

    private zzhv(byte[] p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzhv.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzhv.zza()) {
                throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
            } else {
                if (p3.length != 32) {
                    throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
                } else {
                    this.zzb = new javax.crypto.spec.SecretKeySpec(p3, "ChaCha20");
                    return;
                }
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzhv zza(byte[] p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzhv(p1);
    }

    public static boolean zza()
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzhh.zza() == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final byte[] zza(byte[] p4, byte[] p5, int p6, byte[] p7)
    {
        if (p5 == null) {
            throw new NullPointerException("ciphertext is null");
        } else {
            if (p4.length != 12) {
                throw new java.security.GeneralSecurityException("nonce length must be 12 bytes.");
            } else {
                if (p5.length < (p6 + 16)) {
                    throw new java.security.GeneralSecurityException("ciphertext too short");
                } else {
                    int v0_2 = new javax.crypto.spec.IvParameterSpec(p4);
                    byte[] v4_5 = com.google.android.gms.internal.firebase-auth-api.zzhh.zza();
                    v4_5.init(2, this.zzb, v0_2);
                    if ((p7 != 0) && (p7.length != 0)) {
                        v4_5.updateAAD(p7);
                    }
                    return v4_5.doFinal(p5, p6, (p5.length - p6));
                }
            }
        }
    }
}
