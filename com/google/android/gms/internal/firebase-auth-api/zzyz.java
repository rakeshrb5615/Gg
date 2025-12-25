package com.google.android.gms.internal.firebase-auth-api;
public final class zzyz {

    public static final void zza(java.nio.ByteBuffer p3, java.nio.ByteBuffer p4, java.nio.ByteBuffer p5, int p6)
    {
        if ((p6 < 0) || ((p4.remaining() < p6) || ((p5.remaining() < p6) || (p3.remaining() < p6)))) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        } else {
            int v0_0 = 0;
            while (v0_0 < p6) {
                p3.put(((byte) (p4.get() ^ p5.get())));
                v0_0++;
            }
            return;
        }
    }

    public static final byte[] zza(byte[] p3, int p4, byte[] p5, int p6, int p7)
    {
        if ((p7 < 0) || (((p3.length - p7) < p4) || ((p5.length - p7) < 0))) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        } else {
            byte[] v6_1 = new byte[p7];
            int v0 = 0;
            while (v0 < p7) {
                v6_1[v0] = ((byte) (p3[(v0 + p4)] ^ p5[v0]));
                v0++;
            }
            return v6_1;
        }
    }

    public static final byte[] zza(byte[] p2, byte[] p3)
    {
        if (p2.length != p3.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(p2, 0, p3, 0, p2.length);
        }
    }

    public static varargs byte[] zza(byte[][] p7)
    {
        int v2_0 = 0;
        int v3_1 = 0;
        while (v2_0 < p7.length) {
            int v4_1 = p7[v2_0];
            if (v3_1 > (2147483647 - v4_1.length)) {
                throw new java.security.GeneralSecurityException("exceeded size limit");
            } else {
                v3_1 += v4_1.length;
                v2_0++;
            }
        }
        String v0_2 = new byte[v3_1];
        int v2_1 = p7.length;
        int v3_0 = 0;
        int v4_0 = 0;
        while (v3_0 < v2_1) {
            int v5_0 = p7[v3_0];
            System.arraycopy(v5_0, 0, v0_2, v4_0, v5_0.length);
            v4_0 += v5_0.length;
            v3_0++;
        }
        return v0_2;
    }
}
