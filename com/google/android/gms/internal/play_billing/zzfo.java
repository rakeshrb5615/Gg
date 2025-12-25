package com.google.android.gms.internal.play_billing;
public final class zzfo {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;

    static zzfo()
    {
        java.nio.charset.Charset.forName("US-ASCII");
        com.google.android.gms.internal.play_billing.zzfo.zza = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] v2 = new byte[0];
        com.google.android.gms.internal.play_billing.zzfo.zzb = v2;
        java.nio.ByteBuffer.wrap(v2);
        try {
            new com.google.android.gms.internal.play_billing.zzej(v2, 0, 0, 0, 0).zza(0);
            return;
        } catch (com.google.android.gms.internal.play_billing.zzfq v0_2) {
            throw new IllegalArgumentException(v0_2);
        }
    }

    public static int zza(boolean p0)
    {
        if (p0 == 0) {
            return 1237;
        } else {
            return 1231;
        }
    }

    public static int zzb(int p1, byte[] p2, int p3, int p4)
    {
        p3 = 0;
        while (p3 < p4) {
            p1 = ((p1 * 31) + p2[p3]);
            p3++;
        }
        return p1;
    }

    public static Object zzc(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException("messageType");
        } else {
            return p0;
        }
    }

    public static boolean zzd(com.google.android.gms.internal.play_billing.zzgl p0)
    {
        if ((p0 instanceof com.google.android.gms.internal.play_billing.zzdt)) {
            throw 0;
        } else {
            return 0;
        }
    }
}
