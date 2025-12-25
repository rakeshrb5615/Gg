package com.google.android.recaptcha.internal;
public final class zznl {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;

    static zznl()
    {
        java.nio.charset.Charset.forName("US-ASCII");
        com.google.android.recaptcha.internal.zznl.zza = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] v1 = new byte[0];
        com.google.android.recaptcha.internal.zznl.zzb = v1;
        java.nio.ByteBuffer.wrap(v1);
        com.google.android.recaptcha.internal.zzli.zzH(v1, 0, 0, 0);
        return;
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
}
