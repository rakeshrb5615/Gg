package com.google.android.gms.internal.firebase-auth-api;
public final class zzsv implements com.google.android.gms.internal.firebase-auth-api.zzsq {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private static final ThreadLocal zzb;
    private final javax.crypto.SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    static zzsv()
    {
        com.google.android.gms.internal.firebase-auth-api.zzsv.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        com.google.android.gms.internal.firebase-auth-api.zzsv.zzb = new com.google.android.gms.internal.firebase-auth-api.zzsu();
        return;
    }

    private zzsv(byte[] p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaai.zza(p3.length);
        byte[] v0_4 = new javax.crypto.spec.SecretKeySpec(p3, "AES");
        this.zzc = v0_4;
        byte[] v3_4 = com.google.android.gms.internal.firebase-auth-api.zzsv.zza();
        v3_4.init(1, v0_4);
        byte[] v0_2 = new byte[16];
        byte[] v3_2 = com.google.android.gms.internal.firebase-auth-api.zzsf.zzb(v3_4.doFinal(v0_2));
        this.zzd = v3_2;
        this.zze = com.google.android.gms.internal.firebase-auth-api.zzsf.zzb(v3_2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzsq zza(com.google.android.gms.internal.firebase-auth-api.zzso p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzsv(p2.zzd().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()));
    }

    private static javax.crypto.Cipher zza()
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzsv.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        } else {
            return ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzsv.zzb.get());
        }
    }

    private static void zza(byte[] p3, byte[] p4, int p5, byte[] p6)
    {
        int v0 = 0;
        while (v0 < 16) {
            p6[v0] = ((byte) (p3[v0] ^ p4[(v0 + p5)]));
            v0++;
        }
        return;
    }

    public final byte[] zza(byte[] p12, int p13)
    {
        if (p13 > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        } else {
            int v2_3;
            javax.crypto.Cipher v1 = com.google.android.gms.internal.firebase-auth-api.zzsv.zza();
            v1.init(1, this.zzc);
            int v2_0 = p12.length;
            if (v2_0 != 0) {
                v2_3 = (((v2_0 - 1) / 16) + 1);
            } else {
                v2_3 = 1;
            }
            byte[] v4_5;
            if ((v2_3 << 4) != p12.length) {
                v4_5 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(com.google.android.gms.internal.firebase-auth-api.zzsf.zza(java.util.Arrays.copyOfRange(p12, ((v2_3 - 1) << 4), p12.length)), this.zze);
            } else {
                v4_5 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(p12, ((v2_3 - 1) << 4), this.zzd, 0, 16);
            }
            byte[] v5_4 = new byte[16];
            byte[] v7 = new byte[16];
            int v8 = 0;
            while (v8 < (v2_3 - 1)) {
                com.google.android.gms.internal.firebase-auth-api.zzsv.zza(v5_4, p12, (v8 << 4), v7);
                if (v1.doFinal(v7, 0, 16, v5_4) != 16) {
                    throw new IllegalStateException("Cipher didn\'t write full block");
                } else {
                    v8++;
                }
            }
            com.google.android.gms.internal.firebase-auth-api.zzsv.zza(v5_4, v4_5, 0, v7);
            if (v1.doFinal(v7, 0, 16, v5_4) != 16) {
                throw new IllegalStateException("Cipher didn\'t write full block");
            } else {
                if (16 != p13) {
                    return java.util.Arrays.copyOf(v5_4, p13);
                } else {
                    return v5_4;
                }
            }
        }
    }
}
