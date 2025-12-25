package com.google.android.gms.internal.measurement;
public final class zzmp {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;

    static zzmp()
    {
        java.nio.charset.Charset.forName("US-ASCII");
        com.google.android.gms.internal.measurement.zzmp.zza = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] v2 = new byte[0];
        com.google.android.gms.internal.measurement.zzmp.zzb = v2;
        java.nio.ByteBuffer.wrap(v2);
        try {
            new com.google.android.gms.internal.measurement.zzli(v2, 0, 0, 0, 0).zza(0);
            return;
        } catch (com.google.android.gms.internal.measurement.zzmr v0_2) {
            throw new IllegalArgumentException(v0_2);
        }
    }

    public static Object zza(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException("messageType");
        } else {
            return p0;
        }
    }

    public static int zzb(boolean p0)
    {
        if (p0 == 0) {
            return 1237;
        } else {
            return 1231;
        }
    }

    public static int zzc(int p1, byte[] p2, int p3, int p4)
    {
        p3 = 0;
        while (p3 < p4) {
            p1 = ((p1 * 31) + p2[p3]);
            p3++;
        }
        return p1;
    }

    public static boolean zzd(com.google.android.gms.internal.measurement.zznm p0)
    {
        if ((p0 instanceof com.google.android.gms.internal.measurement.zzkt)) {
            throw 0;
        } else {
            return 0;
        }
    }
}
