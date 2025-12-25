package com.google.android.gms.internal.auth;
public final class zzez {
    static final java.nio.charset.Charset zza;
    static final java.nio.charset.Charset zzb;
    static final java.nio.charset.Charset zzc;
    public static final byte[] zzd;
    public static final java.nio.ByteBuffer zze;
    public static final com.google.android.gms.internal.auth.zzei zzf;

    static zzez()
    {
        com.google.android.gms.internal.auth.zzez.zza = java.nio.charset.Charset.forName("US-ASCII");
        com.google.android.gms.internal.auth.zzez.zzb = java.nio.charset.Charset.forName("UTF-8");
        com.google.android.gms.internal.auth.zzez.zzc = java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] v2 = new byte[0];
        com.google.android.gms.internal.auth.zzez.zzd = v2;
        com.google.android.gms.internal.auth.zzez.zze = java.nio.ByteBuffer.wrap(v2);
        IllegalArgumentException v1_2 = new com.google.android.gms.internal.auth.zzeg(v2, 0, 0, 0, 0);
        try {
            v1_2.zza(0);
            com.google.android.gms.internal.auth.zzez.zzf = v1_2;
            return;
        } catch (com.google.android.gms.internal.auth.zzfa v0_4) {
            throw new IllegalArgumentException(v0_4);
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

    public static int zzb(byte[] p2)
    {
        int v2_1 = com.google.android.gms.internal.auth.zzez.zzd(p2.length, p2, 0, p2.length);
        if (v2_1 == 0) {
            v2_1 = 1;
        }
        return v2_1;
    }

    public static int zzc(long p2)
    {
        return ((int) (p2 ^ (p2 >> 32)));
    }

    public static int zzd(int p1, byte[] p2, int p3, int p4)
    {
        p3 = 0;
        while (p3 < p4) {
            p1 = ((p1 * 31) + p2[p3]);
            p3++;
        }
        return p1;
    }

    public static Object zze(Object p0)
    {
        p0.getClass();
        return p0;
    }

    public static Object zzf(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException(p1);
        } else {
            return p0;
        }
    }

    public static Object zzg(Object p0, Object p1)
    {
        return ((com.google.android.gms.internal.auth.zzfw) p0).zzd().zzc(((com.google.android.gms.internal.auth.zzfw) p1)).zzg();
    }

    public static String zzh(byte[] p2)
    {
        return new String(p2, com.google.android.gms.internal.auth.zzez.zzb);
    }

    public static boolean zzi(byte[] p0)
    {
        return com.google.android.gms.internal.auth.zzhm.zzc(p0);
    }
}
