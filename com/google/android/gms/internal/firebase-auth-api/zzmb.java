package com.google.android.gms.internal.firebase-auth-api;
public final class zzmb {
    private static final byte[] zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzly zzb;
    private final java.math.BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private java.math.BigInteger zzf;

    static zzmb()
    {
        byte[] v0_1 = new byte[0];
        com.google.android.gms.internal.firebase-auth-api.zzmb.zza = v0_1;
        return;
    }

    private zzmb(byte[] p1, byte[] p2, byte[] p3, java.math.BigInteger p4, com.google.android.gms.internal.firebase-auth-api.zzly p5)
    {
        this.zzd = p2;
        this.zze = p3;
        this.zzf = java.math.BigInteger.ZERO;
        this.zzc = p4;
        this.zzb = p5;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzmb zza(byte[] p9, com.google.android.gms.internal.firebase-auth-api.zzme p10, com.google.android.gms.internal.firebase-auth-api.zzmf p11, com.google.android.gms.internal.firebase-auth-api.zzmc p12, com.google.android.gms.internal.firebase-auth-api.zzly p13, byte[] p14)
    {
        byte[] v10_1 = p11.zza(p9, p10);
        byte[] v7 = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(p11.zza(), p12.zzb(), p13.zzc());
        byte[] v11_1 = com.google.android.gms.internal.firebase-auth-api.zzmk.zzl;
        byte[] v1_0 = com.google.android.gms.internal.firebase-auth-api.zzmb.zza;
        byte[] v5 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {com.google.android.gms.internal.firebase-auth-api.zzmk.zza, p12.zza(v11_1, v1_0, "psk_id_hash", v7), p12.zza(v11_1, p14, "info_hash", v7)}));
        byte[] v4 = p12.zza(v10_1, v1_0, "secret", v7);
        byte[] v11_5 = p12.zza(v4, v5, "key", v7, p13.zza());
        byte[] v12_1 = p12.zza(v4, v5, "base_nonce", v7, p13.zzb());
        p13.zzb();
        byte[] v10_2 = java.math.BigInteger.ONE;
        return new com.google.android.gms.internal.firebase-auth-api.zzmb(p9, v11_5, v12_1, v10_2.shiftLeft(96).subtract(v10_2), p13);
    }

    private final declared_synchronized byte[] zza()
    {
        try {
            java.security.GeneralSecurityException v0_4 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(this.zze, com.google.android.gms.internal.firebase-auth-api.zzne.zza(this.zzf, this.zzb.zzb()));
        } catch (java.security.GeneralSecurityException v0_3) {
            throw v0_3;
        }
        if (this.zzf.compareTo(this.zzc) >= 0) {
            throw new java.security.GeneralSecurityException("message limit reached");
        } else {
            this.zzf = this.zzf.add(java.math.BigInteger.ONE);
            return v0_4;
        }
    }

    public final byte[] zza(byte[] p7, int p8, byte[] p9)
    {
        return this.zzb.zza(this.zzd, this.zza(), p7, p8, p9);
    }
}
