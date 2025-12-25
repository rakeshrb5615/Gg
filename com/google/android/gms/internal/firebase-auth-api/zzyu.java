package com.google.android.gms.internal.firebase-auth-api;
public final class zzyu implements com.google.android.gms.internal.firebase-auth-api.zzaaa {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private static final ThreadLocal zzb;
    private final javax.crypto.spec.SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    static zzyu()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyu.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzyu.zzb = new com.google.android.gms.internal.firebase-auth-api.zzyt();
        return;
    }

    public zzyu(byte[] p3, int p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzyu.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzaai.zza(p3.length);
            this.zzc = new javax.crypto.spec.SecretKeySpec(p3, "AES");
            java.security.GeneralSecurityException v3_4 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzyu.zzb.get()).getBlockSize();
            this.zze = v3_4;
            if ((p4 < 12) || (p4 > v3_4)) {
                throw new java.security.GeneralSecurityException("invalid IV size");
            } else {
                this.zzd = p4;
                return;
            }
        }
    }

    private final void zza(byte[] p5, int p6, int p7, byte[] p8, int p9, byte[] p10, boolean p11)
    {
        javax.crypto.Cipher v0_2 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzyu.zzb.get());
        javax.crypto.spec.SecretKeySpec v1_3 = new byte[this.zze];
        System.arraycopy(p10, 0, v1_3, 0, this.zzd);
        int v10_1 = new javax.crypto.spec.IvParameterSpec(v1_3);
        if (p11 == 0) {
            v0_2.init(2, this.zzc, v10_1);
        } else {
            v0_2.init(1, this.zzc, v10_1);
        }
        if (v0_2.doFinal(p5, p6, p7, p8, p9) != p7) {
            throw new java.security.GeneralSecurityException("stored output\'s length does not match input\'s length");
        } else {
            return;
        }
    }

    public final byte[] zza(byte[] p11)
    {
        int v1 = this.zzd;
        if (p11.length < v1) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            byte[] v8 = new byte[v1];
            System.arraycopy(p11, 0, v8, 0, v1);
            int v4 = this.zzd;
            byte[] v6 = new byte[(p11.length - v4)];
            this.zza(p11, v4, (p11.length - v4), v6, 0, v8, 0);
            return v6;
        }
    }

    public final byte[] zzb(byte[] p11)
    {
        String v1_0 = this.zzd;
        if (p11.length > (2147483647 - v1_0)) {
            throw new java.security.GeneralSecurityException(g2.g.c((2147483647 - this.zzd), "plaintext length can not exceed "));
        } else {
            byte[] v6 = new byte[(p11.length + v1_0)];
            byte[] v8 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(v1_0);
            System.arraycopy(v8, 0, v6, 0, this.zzd);
            this.zza(p11, 0, p11.length, v6, this.zzd, v8, 1);
            return v6;
        }
    }
}
