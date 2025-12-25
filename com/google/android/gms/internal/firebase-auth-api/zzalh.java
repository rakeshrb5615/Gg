package com.google.android.gms.internal.firebase-auth-api;
public final class zzalh {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;

    static zzalh()
    {
        java.nio.charset.Charset.forName("US-ASCII");
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] v1 = new byte[0];
        com.google.android.gms.internal.firebase-auth-api.zzalh.zzb = v1;
        java.nio.ByteBuffer.wrap(v1);
        com.google.android.gms.internal.firebase-auth-api.zzakh.zza(v1, 0, v1.length, 0);
        return;
    }

    public static int zza(int p2, byte[] p3, int p4, int p5)
    {
        int v0 = p4;
        while (v0 < (p4 + p5)) {
            p2 = ((p2 * 31) + p3[v0]);
            v0++;
        }
        return p2;
    }

    public static int zza(long p2)
    {
        return ((int) (p2 ^ (p2 >> 32)));
    }

    public static int zza(boolean p0)
    {
        if (p0 == 0) {
            return 1237;
        } else {
            return 1231;
        }
    }

    public static int zza(byte[] p2)
    {
        int v2_1 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p2.length, p2, 0, p2.length);
        if (v2_1 == 0) {
            v2_1 = 1;
        }
        return v2_1;
    }

    public static Object zza(Object p0)
    {
        p0.getClass();
        return p0;
    }

    public static Object zza(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException(p1);
        } else {
            return p0;
        }
    }

    public static boolean zza(com.google.android.gms.internal.firebase-auth-api.zzamm p0)
    {
        return 0;
    }
}
