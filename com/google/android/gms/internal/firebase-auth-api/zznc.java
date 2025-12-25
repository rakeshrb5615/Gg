package com.google.android.gms.internal.firebase-auth-api;
final class zznc implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private final javax.crypto.SecretKey zza;

    public zznc(String p2, java.security.KeyStore p3)
    {
        java.security.InvalidKeyException v3_3 = ((javax.crypto.SecretKey) p3.getKey(p2, 0));
        this.zza = v3_3;
        if (v3_3 == null) {
            throw new java.security.InvalidKeyException(g2.g.l("Keystore cannot load the key with ID: ", p2));
        } else {
            return;
        }
    }

    public final byte[] zza(byte[] p6, byte[] p7)
    {
        if (p6.length < 28) {
            throw new javax.crypto.BadPaddingException("ciphertext too short");
        } else {
            javax.crypto.spec.GCMParameterSpec v0_1 = new javax.crypto.spec.GCMParameterSpec(128, p6, 0, 12);
            javax.crypto.Cipher v1_2 = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            v1_2.init(2, this.zza, v0_1);
            v1_2.updateAAD(p7);
            return v1_2.doFinal(p6, 12, (p6.length - 12));
        }
    }

    public final byte[] zzb(byte[] p8, byte[] p9)
    {
        if (p8.length > 2147483619) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        } else {
            byte[] v5 = new byte[(p8.length + 28)];
            javax.crypto.Cipher v1_1 = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            v1_1.init(1, this.zza);
            v1_1.updateAAD(p9);
            if (v1_1.doFinal(p8, 0, p8.length, v5, 12) != (p8.length + 16)) {
                throw new java.security.GeneralSecurityException("encryption failed: bytesWritten is wrong");
            } else {
                java.security.GeneralSecurityException v8_5 = v1_1.getIV();
                if (v8_5.length != 12) {
                    throw new java.security.GeneralSecurityException("IV has unexpected length");
                } else {
                    System.arraycopy(v8_5, 0, v5, 0, 12);
                    return v5;
                }
            }
        }
    }
}
