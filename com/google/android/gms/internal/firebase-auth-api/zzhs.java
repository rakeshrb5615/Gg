package com.google.android.gms.internal.firebase-auth-api;
public final class zzhs {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private final javax.crypto.SecretKey zzb;

    static zzhs()
    {
        com.google.android.gms.internal.firebase-auth-api.zzhs.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb;
        return;
    }

    public zzhs(byte[] p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzhs.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        } else {
            this.zzb = com.google.android.gms.internal.firebase-auth-api.zzgr.zzb(p2);
            return;
        }
    }

    public final byte[] zza(byte[] p4, byte[] p5, int p6, byte[] p7)
    {
        if (p4.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        } else {
            if (p5.length < (p6 + 16)) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            } else {
                byte[] v4_3 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza(p4);
                javax.crypto.Cipher v0_1 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza();
                v0_1.init(2, this.zzb, v4_3);
                if ((p7 != null) && (p7.length != 0)) {
                    v0_1.updateAAD(p7);
                }
                return v0_1.doFinal(p5, p6, (p5.length - p6));
            }
        }
    }

    public final byte[] zzb(byte[] p7, byte[] p8, int p9, byte[] p10)
    {
        if (p7.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        } else {
            java.security.GeneralSecurityException v7_10 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza(p7);
            javax.crypto.Cipher v0_1 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza();
            v0_1.init(1, this.zzb, v7_10);
            if ((p10 != 0) && (p10.length != 0)) {
                v0_1.updateAAD(p10);
            }
            java.security.GeneralSecurityException v7_3 = v0_1.getOutputSize(p8.length);
            if (v7_3 > (2147483647 - p9)) {
                throw new java.security.GeneralSecurityException("plaintext too long");
            } else {
                byte[] v4 = new byte[(p9 + v7_3)];
                if (v0_1.doFinal(p8, 0, p8.length, v4, p9) != v7_3) {
                    throw new java.security.GeneralSecurityException("not enough data written");
                } else {
                    return v4;
                }
            }
        }
    }
}
