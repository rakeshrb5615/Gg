package com.google.android.gms.internal.firebase-auth-api;
final class zzlp implements com.google.android.gms.internal.firebase-auth-api.zzlr {
    private final int zza;

    public zzlp(com.google.android.gms.internal.firebase-auth-api.zzdx p3)
    {
        if (p3.zzb() != 12) {
            throw new java.security.GeneralSecurityException("invalid IV size");
        } else {
            if (p3.zzd() != 16) {
                throw new java.security.GeneralSecurityException("invalid tag size");
            } else {
                if (p3.zzf() != com.google.android.gms.internal.firebase-auth-api.zzdx$zza.zzc) {
                    throw new java.security.GeneralSecurityException("invalid variant");
                } else {
                    this.zza = p3.zzc();
                    return;
                }
            }
        }
    }

    public final int zza()
    {
        return this.zza;
    }

    public final byte[] zza(byte[] p6, byte[] p7, int p8)
    {
        if (p7.length < p8) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            if (p6.length != this.zza) {
                throw new java.security.GeneralSecurityException("invalid key size");
            } else {
                java.security.GeneralSecurityException v6_2 = com.google.android.gms.internal.firebase-auth-api.zzgr.zzb(p6);
                int v2_0 = (p8 + 12);
                if (p7.length < (p8 + 28)) {
                    throw new java.security.GeneralSecurityException("ciphertext too short");
                } else {
                    java.security.spec.AlgorithmParameterSpec v1_1 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza(p7, p8, 12);
                    javax.crypto.Cipher v3_1 = com.google.android.gms.internal.firebase-auth-api.zzgr.zza();
                    v3_1.init(2, v6_2, v1_1);
                    return v3_1.doFinal(p7, v2_0, ((p7.length - p8) - 12));
                }
            }
        }
    }
}
