package com.google.android.gms.internal.firebase-auth-api;
public final class zzgz implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final byte[] zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private final com.google.android.gms.internal.firebase-auth-api.zzhc zzf;
    private final javax.crypto.SecretKey zzg;
    private final byte[] zzh;

    static zzgz()
    {
        com.google.android.gms.internal.firebase-auth-api.zzgz.zza = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("7a806c");
        com.google.android.gms.internal.firebase-auth-api.zzgz.zzb = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("46bb91c3c5");
        com.google.android.gms.internal.firebase-auth-api.zzgz.zzc = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("36864200e0eaf5284d884a0e77d31646");
        com.google.android.gms.internal.firebase-auth-api.zzgz.zzd = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("bae8e37fc83441b16034566b");
        com.google.android.gms.internal.firebase-auth-api.zzgz.zze = com.google.android.gms.internal.firebase-auth-api.zzzx.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
        return;
    }

    private zzgz(byte[] p2, byte[] p3, com.google.android.gms.internal.firebase-auth-api.zzhc p4)
    {
        this.zzh = p3;
        com.google.android.gms.internal.firebase-auth-api.zzaai.zza(p2.length);
        this.zzg = new javax.crypto.spec.SecretKeySpec(p2, "AES");
        this.zzf = p4;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzdz p3, com.google.android.gms.internal.firebase-auth-api.zzhc p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzgz.zza(((javax.crypto.Cipher) p4.zza()))) {
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzgz(p3.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), p3.zzd().zzb(), p4);
        }
    }

    private static java.security.spec.AlgorithmParameterSpec zza(byte[] p2, int p3, int p4)
    {
        return new javax.crypto.spec.GCMParameterSpec(128, p2, p3, p4);
    }

    public static boolean zza(javax.crypto.Cipher p5)
    {
        try {
            byte[] v1_0 = com.google.android.gms.internal.firebase-auth-api.zzgz.zzd;
            p5.init(2, new javax.crypto.spec.SecretKeySpec(com.google.android.gms.internal.firebase-auth-api.zzgz.zzc, "AES"), com.google.android.gms.internal.firebase-auth-api.zzgz.zza(v1_0, 0, v1_0.length));
            p5.updateAAD(com.google.android.gms.internal.firebase-auth-api.zzgz.zzb);
            byte[] v1_2 = com.google.android.gms.internal.firebase-auth-api.zzgz.zze;
            return java.security.MessageDigest.isEqual(p5.doFinal(v1_2, 0, v1_2.length), com.google.android.gms.internal.firebase-auth-api.zzgz.zza);
        } catch (java.security.GeneralSecurityException) {
            return 0;
        }
    }

    public final byte[] zza(byte[] p6, byte[] p7)
    {
        int v1_0 = this.zzh;
        if (p6.length < (v1_0.length + 28)) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v1_0, p6)) {
                throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            } else {
                javax.crypto.Cipher v0_4 = ((javax.crypto.Cipher) this.zzf.zza());
                v0_4.init(2, this.zzg, com.google.android.gms.internal.firebase-auth-api.zzgz.zza(p6, this.zzh.length, 12));
                if ((p7 != 0) && (p7.length != 0)) {
                    v0_4.updateAAD(p7);
                }
                int v7_2 = this.zzh;
                return v0_4.doFinal(p6, (v7_2.length + 12), ((p6.length - v7_2.length) - 12));
            }
        }
    }

    public final byte[] zzb(byte[] p8, byte[] p9)
    {
        String v1_1 = ((javax.crypto.Cipher) this.zzf.zza());
        java.security.GeneralSecurityException v2_5 = this.zzh;
        if (p8.length > (2147483619 - v2_5.length)) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        } else {
            byte[] v5 = java.util.Arrays.copyOf(v2_5, (((v2_5.length + 12) + p8.length) + 16));
            String v0_6 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(12);
            System.arraycopy(v0_6, 0, v5, this.zzh.length, 12);
            v1_1.init(1, this.zzg, com.google.android.gms.internal.firebase-auth-api.zzgz.zza(v0_6, 0, v0_6.length));
            if ((p9 != null) && (p9.length != 0)) {
                v1_1.updateAAD(p9);
            }
            String v8_3 = v1_1.doFinal(p8, 0, p8.length, v5, (this.zzh.length + 12));
            if (v8_3 != (p8.length + 16)) {
                throw new java.security.GeneralSecurityException(v1.a.j("encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", (v8_3 - p8.length), " bytes"));
            } else {
                return v5;
            }
        }
    }
}
