package com.google.android.gms.internal.firebase-auth-api;
public final class zzyw implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private static final ThreadLocal zzb;
    private final byte[] zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzsq zzd;
    private final javax.crypto.spec.SecretKeySpec zze;
    private final int zzf;

    static zzyw()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyw.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        com.google.android.gms.internal.firebase-auth-api.zzyw.zzb = new com.google.android.gms.internal.firebase-auth-api.zzyv();
        return;
    }

    private zzyw(byte[] p2, int p3, byte[] p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzyw.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else {
            if ((p3 != 12) && (p3 != 16)) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            } else {
                this.zzf = p3;
                com.google.android.gms.internal.firebase-auth-api.zzaai.zza(p2.length);
                this.zze = new javax.crypto.spec.SecretKeySpec(p2, "AES");
                this.zzd = com.google.android.gms.internal.firebase-auth-api.zzzz.zza(com.google.android.gms.internal.firebase-auth-api.zzso.zza(com.google.android.gms.internal.firebase-auth-api.zzsr.zza(p2.length), com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p2, com.google.android.gms.internal.firebase-auth-api.zzbf.zza())));
                this.zzc = p4;
                return;
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzdl p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzyw.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else {
            if (((com.google.android.gms.internal.firebase-auth-api.zzdq) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzd() != 16) {
                throw new java.security.GeneralSecurityException(g2.g.c(((com.google.android.gms.internal.firebase-auth-api.zzdq) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzd(), "AesEaxJce only supports 16 byte tag size, not "));
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzyw(p3.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), ((com.google.android.gms.internal.firebase-auth-api.zzdq) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb(), p3.zzd().zzb());
            }
        }
    }

    private final byte[] zza(int p3, byte[] p4, int p5, int p6)
    {
        byte[] v0_1 = new byte[(p6 + 16)];
        v0_1[15] = ((byte) p3);
        System.arraycopy(p4, p5, v0_1, 16, p6);
        return this.zzd.zza(v0_1, 16);
    }

    public final byte[] zza(byte[] p11, byte[] p12)
    {
        int v1_0 = this.zzc;
        int v0_3 = (((p11.length - v1_0.length) - this.zzf) - 16);
        if (v0_3 < 0) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v1_0, p11)) {
                throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            } else {
                int v4 = 0;
                int v1_4 = this.zza(0, p11, this.zzc.length, this.zzf);
                if (p12 == null) {
                    p12 = new byte[0];
                }
                String v12_3 = this.zza(1, p12, 0, p12.length);
                javax.crypto.spec.IvParameterSpec v3_5 = this.zza(2, p11, (this.zzc.length + this.zzf), v0_3);
                byte v7_0 = 0;
                while (v4 < 16) {
                    v7_0 = ((byte) (v7_0 | (((p11[((p11.length - 16) + v4)] ^ v12_3[v4]) ^ v1_4[v4]) ^ v3_5[v4])));
                    v4++;
                }
                if (v7_0 != 0) {
                    throw new javax.crypto.AEADBadTagException("tag mismatch");
                } else {
                    String v12_7 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzyw.zzb.get());
                    v12_7.init(1, this.zze, new javax.crypto.spec.IvParameterSpec(v1_4));
                    return v12_7.doFinal(p11, (this.zzc.length + this.zzf), v0_3);
                }
            }
        }
    }

    public final byte[] zzb(byte[] p12, byte[] p13)
    {
        int v1_0 = this.zzc;
        int v2_4 = this.zzf;
        if (p12.length > (((2147483647 - v1_0.length) - v2_4) - 16)) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        } else {
            byte[] v9 = java.util.Arrays.copyOf(v1_0, (((v1_0.length + v2_4) + p12.length) + 16));
            byte[] v0_6 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(this.zzf);
            int v3_0 = 0;
            System.arraycopy(v0_6, 0, v9, this.zzc.length, this.zzf);
            byte[] v0_7 = this.zza(0, v0_6, 0, v0_6.length);
            if (p13 == null) {
                p13 = new byte[0];
            }
            byte[] v13_2 = this.zza(1, p13, 0, p13.length);
            byte v5_1 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzyw.zzb.get());
            v5_1.init(1, this.zze, new javax.crypto.spec.IvParameterSpec(v0_7));
            v5_1.doFinal(p12, 0, p12.length, v9, (this.zzc.length + this.zzf));
            byte[] vtmp7 = this.zza(2, v9, (this.zzc.length + this.zzf), p12.length);
            while (v3_0 < 16) {
                v9[(((this.zzc.length + p12.length) + this.zzf) + v3_0)] = ((byte) ((v13_2[v3_0] ^ v0_7[v3_0]) ^ vtmp7[v3_0]));
                v3_0++;
            }
            return v9;
        }
    }
}
