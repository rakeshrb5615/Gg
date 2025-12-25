package com.google.android.gms.internal.firebase-auth-api;
abstract class zzhw {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzhu zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzhu zzc;

    static zzhw()
    {
        com.google.android.gms.internal.firebase-auth-api.zzhw.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        return;
    }

    public zzhw(byte[] p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzhw.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        } else {
            this.zzb = this.zza(p2, 1);
            this.zzc = this.zza(p2, 0);
            return;
        }
    }

    private final byte[] zza(byte[] p3)
    {
        byte[] v0_2 = new byte[32];
        this.zzc.zza(p3, 0).get(v0_2);
        return v0_2;
    }

    private static byte[] zza(byte[] p5, java.nio.ByteBuffer p6)
    {
        int v0_4;
        if ((p5.length % 16) != 0) {
            v0_4 = ((p5.length + 16) - (p5.length % 16));
        } else {
            v0_4 = p5.length;
        }
        int v3_1;
        int v1_0 = p6.remaining();
        java.nio.ByteBuffer v2_0 = (v1_0 % 16);
        if (v2_0 != null) {
            v3_1 = ((v1_0 + 16) - v2_0);
        } else {
            v3_1 = v1_0;
        }
        int v3_2 = (v3_1 + v0_4);
        java.nio.ByteBuffer v2_3 = java.nio.ByteBuffer.allocate((v3_2 + 16)).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        v2_3.put(p5);
        v2_3.position(v0_4);
        v2_3.put(p6);
        v2_3.position(v3_2);
        v2_3.putLong(((long) p5.length));
        v2_3.putLong(((long) v1_0));
        return v2_3.array();
    }

    public abstract com.google.android.gms.internal.firebase-auth-api.zzhu zza();

    public void zza(java.nio.ByteBuffer p3, byte[] p4, byte[] p5, byte[] p6)
    {
        if (p3.remaining() < (p5.length + 16)) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        } else {
            int v0_1 = p3.position();
            this.zzb.zza(p3, p4, p5);
            p3.position(v0_1);
            p3.limit((p3.limit() - 16));
            if (p6 == null) {
                p6 = new byte[0];
            }
            byte[] v4_2 = com.google.android.gms.internal.firebase-auth-api.zzic.zza(this.zza(p4), com.google.android.gms.internal.firebase-auth-api.zzhw.zza(p6, p3));
            p3.limit((p3.limit() + 16));
            p3.put(v4_2);
            return;
        }
    }

    public byte[] zza(java.nio.ByteBuffer p5, byte[] p6, byte[] p7)
    {
        if (p5.remaining() < 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            int v0_1 = p5.position();
            byte[] v2 = new byte[16];
            p5.position((p5.limit() - 16));
            p5.get(v2);
            p5.position(v0_1);
            p5.limit((p5.limit() - 16));
            if (p7 == null) {
                p7 = new byte[0];
            }
            try {
                if (!java.security.MessageDigest.isEqual(com.google.android.gms.internal.firebase-auth-api.zzic.zza(this.zza(p6), com.google.android.gms.internal.firebase-auth-api.zzhw.zza(p7, p5)), v2)) {
                    throw new java.security.GeneralSecurityException("invalid MAC");
                } else {
                    p5.position(v0_1);
                    return this.zzb.zza(p6, p5);
                }
            } catch (java.security.GeneralSecurityException v5_3) {
                throw new javax.crypto.AEADBadTagException(v5_3.toString());
            }
        }
    }

    public byte[] zza(byte[] p1, byte[] p2, byte[] p3)
    {
        return this.zza(java.nio.ByteBuffer.wrap(p2), p1, p3);
    }
}
