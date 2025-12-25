package com.google.android.gms.internal.firebase-auth-api;
public final class zzsf {

    public static byte[] zza(byte[] p2)
    {
        if (p2.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        } else {
            String v0_2 = java.util.Arrays.copyOf(p2, 16);
            v0_2[p2.length] = -128;
            return v0_2;
        }
    }

    public static byte[] zzb(byte[] p6)
    {
        if (p6.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        } else {
            String v0_2 = new byte[16];
            int v3 = 0;
            while (v3 < 16) {
                byte v5_3 = ((byte) ((p6[v3] << 1) & 254));
                v0_2[v3] = v5_3;
                if (v3 < 15) {
                    v0_2[v3] = ((byte) (((byte) ((p6[(v3 + 1)] >> 7) & 1)) | v5_3));
                }
                v3++;
            }
            v0_2[15] = ((byte) (((byte) ((p6[0] >> 7) & 135)) ^ v0_2[15]));
            return v0_2;
        }
    }
}
