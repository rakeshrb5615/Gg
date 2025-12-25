package com.google.android.gms.internal.firebase-auth-api;
public final class zzyx implements com.google.android.gms.internal.firebase-auth-api.zzbe {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private static final java.util.Collection zzb;
    private static final byte[] zzc;
    private static final ThreadLocal zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzsq zze;
    private final byte[] zzf;
    private final byte[] zzg;

    static zzyx()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyx.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        com.google.android.gms.internal.firebase-auth-api.zzyx.zzb = java.util.Arrays.asList(new Integer[] {Integer.valueOf(64)}));
        com.google.android.gms.internal.firebase-auth-api.zzza v0_2 = new byte[16];
        com.google.android.gms.internal.firebase-auth-api.zzyx.zzc = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzyx.zzd = new com.google.android.gms.internal.firebase-auth-api.zzza();
        return;
    }

    private zzyx(byte[] p4, com.google.android.gms.internal.firebase-auth-api.zzaaj p5)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzyx.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzyx.zzb.contains(Integer.valueOf(p4.length))) {
                throw new java.security.InvalidKeyException(v1.a.j("invalid key size: ", p4.length, " bytes; key must have 64 bytes"));
            } else {
                String v0_5 = java.util.Arrays.copyOfRange(p4, 0, (p4.length / 2));
                this.zzf = java.util.Arrays.copyOfRange(p4, (p4.length / 2), p4.length);
                this.zze = com.google.android.gms.internal.firebase-auth-api.zzzz.zza(com.google.android.gms.internal.firebase-auth-api.zzso.zza(com.google.android.gms.internal.firebase-auth-api.zzsr.zza(v0_5.length), com.google.android.gms.internal.firebase-auth-api.zzaal.zza(v0_5, com.google.android.gms.internal.firebase-auth-api.zzbf.zza())));
                this.zzg = p5.zzb();
                return;
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzja p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzyx(p3.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), p3.zze());
    }

    public final byte[] zza(byte[] p9, byte[] p10)
    {
        byte[] v1_0 = this.zzg;
        if (p9.length < (v1_0.length + 16)) {
            throw new java.security.GeneralSecurityException("Ciphertext too short.");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v1_0, p9)) {
                throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            } else {
                int v0_5 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzyx.zzd.get());
                byte[] v1_1 = this.zzg;
                byte[] v1_4 = java.util.Arrays.copyOfRange(p9, v1_1.length, (v1_1.length + 16));
                byte[] v2_5 = ((byte[]) v1_4.clone());
                v2_5[8] = ((byte) (v2_5[8] & 127));
                v2_5[12] = ((byte) (v2_5[12] & 127));
                v0_5.init(2, new javax.crypto.spec.SecretKeySpec(this.zzf, "AES"), new javax.crypto.spec.IvParameterSpec(v2_5));
                byte[] v2_10 = (this.zzg.length + 16);
                int v4_6 = (p9.length - v2_10);
                javax.crypto.AEADBadTagException v9_5 = v0_5.doFinal(p9, v2_10, v4_6);
                int v0_2 = 0;
                if ((v4_6 == 0) && ((v9_5 == null) && (com.google.android.gms.internal.firebase-auth-api.zzaaf.zza()))) {
                    v9_5 = new byte[0];
                }
                String v10_3 = new byte[][] {p10, v9_5});
                byte[] v2_1 = this.zze.zza(com.google.android.gms.internal.firebase-auth-api.zzyx.zzc, 16);
                int v4_0 = 0;
                while (v4_0 <= 0) {
                    int v5_1 = v10_3[v4_0];
                    if (v5_1 == 0) {
                        v5_1 = new byte[0];
                    }
                    v2_1 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(com.google.android.gms.internal.firebase-auth-api.zzsf.zzb(v2_1), this.zze.zza(v5_1, 16));
                    v4_0++;
                }
                String v10_7;
                String v10_5 = v10_3[1];
                if (v10_5.length < 16) {
                    v10_7 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(com.google.android.gms.internal.firebase-auth-api.zzsf.zza(v10_5), com.google.android.gms.internal.firebase-auth-api.zzsf.zzb(v2_1));
                } else {
                    if (v10_5.length < v2_1.length) {
                        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                    } else {
                        int v4_12 = (v10_5.length - v2_1.length);
                        v10_7 = java.util.Arrays.copyOf(v10_5, v10_5.length);
                        while (v0_2 < v2_1.length) {
                            int v5_0 = (v4_12 + v0_2);
                            v10_7[v5_0] = ((byte) (v10_7[v5_0] ^ v2_1[v0_2]));
                            v0_2++;
                        }
                    }
                }
                if (!java.security.MessageDigest.isEqual(v1_4, this.zze.zza(v10_7, 16))) {
                    throw new javax.crypto.AEADBadTagException("Integrity check failed.");
                } else {
                    return v9_5;
                }
            }
        }
    }
}
