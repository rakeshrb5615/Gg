package com.google.android.gms.internal.firebase-auth-api;
public final class zzaag implements com.google.android.gms.internal.firebase-auth-api.zzcc {
    private static final byte[] zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzsq zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    static zzaag()
    {
        byte[] v0_1 = new byte[1];
        v0_1[0] = 0;
        com.google.android.gms.internal.firebase-auth-api.zzaag.zza = v0_1;
        return;
    }

    private zzaag(com.google.android.gms.internal.firebase-auth-api.zzqp p3)
    {
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzzz.zza(com.google.android.gms.internal.firebase-auth-api.zzso.zza(com.google.android.gms.internal.firebase-auth-api.zzsr.zza(((com.google.android.gms.internal.firebase-auth-api.zzqu) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p3.zza())).zzc()), p3.zzf()));
        this.zzc = ((com.google.android.gms.internal.firebase-auth-api.zzqu) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p3.zza())).zzb();
        this.zzd = p3.zze().zzb();
        if (!((com.google.android.gms.internal.firebase-auth-api.zzqu) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p3.zza())).zze().equals(com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzc)) {
            byte[] v3_7 = new byte[0];
            this.zze = v3_7;
            return;
        } else {
            byte[] v3_8 = com.google.android.gms.internal.firebase-auth-api.zzaag.zza;
            this.zze = java.util.Arrays.copyOf(v3_8, v3_8.length);
            return;
        }
    }

    private zzaag(com.google.android.gms.internal.firebase-auth-api.zzra p7)
    {
        this.zzb = new com.google.android.gms.internal.firebase-auth-api.zzaae("HMAC".concat(String.valueOf(((com.google.android.gms.internal.firebase-auth-api.zzrh) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p7.zza())).zze())), new javax.crypto.spec.SecretKeySpec(p7.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), "HMAC"));
        this.zzc = ((com.google.android.gms.internal.firebase-auth-api.zzrh) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p7.zza())).zzb();
        this.zzd = p7.zze().zzb();
        if (!((com.google.android.gms.internal.firebase-auth-api.zzrh) ((com.google.android.gms.internal.firebase-auth-api.zzrn) p7.zza())).zzf().equals(com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzc)) {
            byte[] v7_7 = new byte[0];
            this.zze = v7_7;
            return;
        } else {
            byte[] v7_8 = com.google.android.gms.internal.firebase-auth-api.zzaag.zza;
            this.zze = java.util.Arrays.copyOf(v7_8, v7_8.length);
            return;
        }
    }

    public zzaag(com.google.android.gms.internal.firebase-auth-api.zzsq p3, int p4)
    {
        this.zzb = p3;
        this.zzc = p4;
        int v1_0 = new byte[0];
        this.zzd = v1_0;
        int v1_1 = new byte[0];
        this.zze = v1_1;
        if (p4 < 10) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        } else {
            byte[] v0_0 = new byte[0];
            p3.zza(v0_0, p4);
            return;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzcc zza(com.google.android.gms.internal.firebase-auth-api.zzqp p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaag(p1);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzcc zza(com.google.android.gms.internal.firebase-auth-api.zzra p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaag(p1);
    }

    public final void zza(byte[] p1, byte[] p2)
    {
        if (!java.security.MessageDigest.isEqual(this.zza(p2), p1)) {
            throw new java.security.GeneralSecurityException("invalid MAC");
        } else {
            return;
        }
    }

    public final byte[] zza(byte[] p4)
    {
        byte[] v0_0 = this.zze;
        if (v0_0.length <= 0) {
            return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {this.zzd, this.zzb.zza(p4, this.zzc)}));
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {this.zzd, this.zzb.zza(com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p4, v0_0})), this.zzc)}));
        }
    }
}
