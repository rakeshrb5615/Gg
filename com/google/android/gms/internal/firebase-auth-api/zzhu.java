package com.google.android.gms.internal.firebase-auth-api;
abstract class zzhu {
    int[] zza;
    private final int zzb;

    public zzhu(byte[] p3, int p4)
    {
        if (p3.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        } else {
            this.zza = com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p3);
            this.zzb = p4;
            return;
        }
    }

    private final void zza(byte[] p7, java.nio.ByteBuffer p8, java.nio.ByteBuffer p9)
    {
        if (p7.length != this.zza()) {
            throw new java.security.GeneralSecurityException(g2.g.c(this.zza(), "The nonce length (in bytes) must be "));
        } else {
            int v0_1 = p9.remaining();
            int v1_0 = (v0_1 / 64);
            int v2 = (v1_0 + 1);
            int v3 = 0;
            while (v3 < v2) {
                java.nio.ByteBuffer v4_2 = this.zza(p7, (this.zzb + v3));
                if (v3 != v1_0) {
                    com.google.android.gms.internal.firebase-auth-api.zzyz.zza(p8, p9, v4_2, 64);
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzyz.zza(p8, p9, v4_2, (v0_1 % 64));
                }
                v3++;
            }
            return;
        }
    }

    public abstract int zza();

    public final java.nio.ByteBuffer zza(byte[] p5, int p6)
    {
        int[] v5_2 = this.zza(com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p5), p6);
        java.nio.ByteBuffer v6_5 = ((int[]) v5_2.clone());
        com.google.android.gms.internal.firebase-auth-api.zzhp.zza(v6_5);
        java.nio.IntBuffer v1_2 = 0;
        while (v1_2 < v5_2.length) {
            v5_2[v1_2] = (v5_2[v1_2] + v6_5[v1_2]);
            v1_2++;
        }
        java.nio.ByteBuffer v6_3 = java.nio.ByteBuffer.allocate(64).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        v6_3.asIntBuffer().put(v5_2, 0, 16);
        return v6_3;
    }

    public void zza(java.nio.ByteBuffer p3, byte[] p4, byte[] p5)
    {
        if (p3.remaining() < p5.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        } else {
            this.zza(p4, p3, java.nio.ByteBuffer.wrap(p5));
            return;
        }
    }

    public byte[] zza(byte[] p2, java.nio.ByteBuffer p3)
    {
        java.nio.ByteBuffer v0_1 = java.nio.ByteBuffer.allocate(p3.remaining());
        this.zza(p2, v0_1, p3);
        return v0_1.array();
    }

    public abstract int[] zza();
}
