package com.google.android.gms.internal.measurement;
final class zzop {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.measurement.zzoo zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    static zzop()
    {
        sun.misc.Unsafe v1_3 = com.google.android.gms.internal.measurement.zzop.zzq();
        com.google.android.gms.internal.measurement.zzop.zzc = v1_3;
        com.google.android.gms.internal.measurement.zzop.zzd = libcore.io.Memory;
        Class v2_1 = Long.TYPE;
        Class[] v3_6 = com.google.android.gms.internal.measurement.zzop.zzr(v2_1);
        com.google.android.gms.internal.measurement.zzop.zze = v3_6;
        Class v4 = Integer.TYPE;
        Class[] v5_0 = com.google.android.gms.internal.measurement.zzop.zzr(v4);
        Class v6_0 = 0;
        if (v1_3 != null) {
            if (v3_6 == null) {
                if (v5_0 != null) {
                    v6_0 = new com.google.android.gms.internal.measurement.zzom(v1_3);
                }
            } else {
                v6_0 = new com.google.android.gms.internal.measurement.zzon(v1_3);
            }
        }
        Class v6_7;
        com.google.android.gms.internal.measurement.zzop.zzf = v6_0;
        int v7 = 1;
        if (v6_0 != null) {
            try {
                Class v6_4 = v6_0.zza.getClass();
                v6_4.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                v6_4.getMethod("getLong", new Class[] {Object, v2_1}));
            } catch (Class v6_6) {
                com.google.android.gms.internal.measurement.zzop.zzy(v6_6);
                v6_7 = 0;
            }
            if (com.google.android.gms.internal.measurement.zzop.zzB() != null) {
                v6_7 = 1;
            }
        }
        Throwable v0_14;
        com.google.android.gms.internal.measurement.zzop.zzg = v6_7;
        Class v6_8 = com.google.android.gms.internal.measurement.zzop.zzf;
        if (v6_8 != null) {
            try {
                Class v6_10 = v6_8.zza.getClass();
                v6_10.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                v6_10.getMethod("arrayBaseOffset", new Class[] {Class}));
                v6_10.getMethod("arrayIndexScale", new Class[] {Class}));
                v6_10.getMethod("getInt", new Class[] {Object, v2_1}));
                v6_10.getMethod("putInt", new Class[] {Object, v2_1, v4}));
                v6_10.getMethod("getLong", new Class[] {Object, v2_1}));
                v6_10.getMethod("putLong", new Class[] {Object, v2_1, v2_1}));
                v6_10.getMethod("getObject", new Class[] {Object, v2_1}));
                v6_10.getMethod("putObject", new Class[] {Object, v2_1, Object}));
                v0_14 = 1;
            } catch (Throwable v0_15) {
                com.google.android.gms.internal.measurement.zzop.zzy(v0_15);
                v0_14 = 0;
            }
        }
        com.google.android.gms.internal.measurement.zzop.zzh = v0_14;
        com.google.android.gms.internal.measurement.zzop.zza = ((long) com.google.android.gms.internal.measurement.zzop.zzz(byte[]));
        com.google.android.gms.internal.measurement.zzop.zzz(boolean[]);
        com.google.android.gms.internal.measurement.zzop.zzA(boolean[]);
        com.google.android.gms.internal.measurement.zzop.zzz(int[]);
        com.google.android.gms.internal.measurement.zzop.zzA(int[]);
        com.google.android.gms.internal.measurement.zzop.zzz(long[]);
        com.google.android.gms.internal.measurement.zzop.zzA(long[]);
        com.google.android.gms.internal.measurement.zzop.zzz(float[]);
        com.google.android.gms.internal.measurement.zzop.zzA(float[]);
        com.google.android.gms.internal.measurement.zzop.zzz(double[]);
        com.google.android.gms.internal.measurement.zzop.zzA(double[]);
        com.google.android.gms.internal.measurement.zzop.zzz(Object[]);
        com.google.android.gms.internal.measurement.zzop.zzA(Object[]);
        Throwable v0_5 = com.google.android.gms.internal.measurement.zzop.zzB();
        if (v0_5 != null) {
            sun.misc.Unsafe v1_0 = com.google.android.gms.internal.measurement.zzop.zzf;
            if (v1_0 != null) {
                v1_0.zza.objectFieldOffset(v0_5);
            }
        }
        if (java.nio.ByteOrder.nativeOrder() != java.nio.ByteOrder.BIG_ENDIAN) {
            v7 = 0;
        }
        com.google.android.gms.internal.measurement.zzop.zzb = v7;
        return;
    }

    private zzop()
    {
        return;
    }

    private static int zzA(Class p1)
    {
        if (!com.google.android.gms.internal.measurement.zzop.zzh) {
            return -1;
        } else {
            return com.google.android.gms.internal.measurement.zzop.zzf.zza.arrayIndexScale(p1);
        }
    }

    private static reflect.Field zzB()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzop.zzC(java.nio.Buffer, "effectiveDirectAddress");
        if (v0_1 == 0) {
            int v0_3 = com.google.android.gms.internal.measurement.zzop.zzC(java.nio.Buffer, "address");
            if ((v0_3 == 0) || (v0_3.getType() != Long.TYPE)) {
                v0_1 = 0;
            } else {
                return v0_3;
            }
        }
        return v0_1;
    }

    private static reflect.Field zzC(Class p0, String p1)
    {
        try {
            return p0.getDeclaredField(p1);
        } catch (Throwable) {
            return 0;
        }
    }

    private static void zzD(Object p5, long p6, byte p8)
    {
        sun.misc.Unsafe v0_1 = com.google.android.gms.internal.measurement.zzop.zzf.zza;
        long v1_1 = (-4 & p6);
        int v6_6 = (((~ ((int) p6)) & 3) << 3);
        v0_1.putInt(p5, v1_1, (((255 & p8) << v6_6) | (v0_1.getInt(p5, v1_1) & (~ (255 << v6_6)))));
        return;
    }

    private static void zzE(Object p5, long p6, byte p8)
    {
        sun.misc.Unsafe v0_1 = com.google.android.gms.internal.measurement.zzop.zzf.zza;
        long v1_1 = (-4 & p6);
        int v6_5 = ((((int) p6) & 3) << 3);
        v0_1.putInt(p5, v1_1, (((255 & p8) << v6_5) | (v0_1.getInt(p5, v1_1) & (~ (255 << v6_5)))));
        return;
    }

    public static boolean zza()
    {
        return com.google.android.gms.internal.measurement.zzop.zzh;
    }

    public static boolean zzb()
    {
        return com.google.android.gms.internal.measurement.zzop.zzg;
    }

    public static Object zzc(Class p1)
    {
        try {
            return com.google.android.gms.internal.measurement.zzop.zzc.allocateInstance(p1);
        } catch (InstantiationException v1_2) {
            throw new IllegalStateException(v1_2);
        }
    }

    public static int zzd(Object p1, long p2)
    {
        return com.google.android.gms.internal.measurement.zzop.zzf.zza.getInt(p1, p2);
    }

    public static void zze(Object p1, long p2, int p4)
    {
        com.google.android.gms.internal.measurement.zzop.zzf.zza.putInt(p1, p2, p4);
        return;
    }

    public static long zzf(Object p1, long p2)
    {
        return com.google.android.gms.internal.measurement.zzop.zzf.zza.getLong(p1, p2);
    }

    public static void zzg(Object p7, long p8, long p10)
    {
        com.google.android.gms.internal.measurement.zzop.zzf.zza.putLong(p7, p8, p10);
        return;
    }

    public static boolean zzh(Object p1, long p2)
    {
        return com.google.android.gms.internal.measurement.zzop.zzf.zzb(p1, p2);
    }

    public static void zzi(Object p1, long p2, boolean p4)
    {
        com.google.android.gms.internal.measurement.zzop.zzf.zzc(p1, p2, p4);
        return;
    }

    public static float zzj(Object p1, long p2)
    {
        return com.google.android.gms.internal.measurement.zzop.zzf.zzd(p1, p2);
    }

    public static void zzk(Object p1, long p2, float p4)
    {
        com.google.android.gms.internal.measurement.zzop.zzf.zze(p1, p2, p4);
        return;
    }

    public static double zzl(Object p1, long p2)
    {
        return com.google.android.gms.internal.measurement.zzop.zzf.zzf(p1, p2);
    }

    public static void zzm(Object p6, long p7, double p9)
    {
        com.google.android.gms.internal.measurement.zzop.zzf.zzg(p6, p7, p9);
        return;
    }

    public static Object zzn(Object p1, long p2)
    {
        return com.google.android.gms.internal.measurement.zzop.zzf.zza.getObject(p1, p2);
    }

    public static void zzo(Object p1, long p2, Object p4)
    {
        com.google.android.gms.internal.measurement.zzop.zzf.zza.putObject(p1, p2, p4);
        return;
    }

    public static void zzp(byte[] p3, long p4, byte p6)
    {
        com.google.android.gms.internal.measurement.zzop.zzf.zza(p3, (com.google.android.gms.internal.measurement.zzop.zza + p4), p6);
        return;
    }

    public static sun.misc.Unsafe zzq()
    {
        try {
            return ((sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.measurement.zzol()));
        } catch (Throwable) {
            return 0;
        }
    }

    public static boolean zzr(Class p6)
    {
        try {
            Class v1 = com.google.android.gms.internal.measurement.zzop.zzd;
            Class[] v3_5 = Boolean.TYPE;
            v1.getMethod("peekLong", new Class[] {p6, v3_5}));
            v1.getMethod("pokeLong", new Class[] {p6, Long.TYPE, v3_5}));
            Class v4_1 = Integer.TYPE;
            v1.getMethod("pokeInt", new Class[] {p6, v4_1, v3_5}));
            v1.getMethod("peekInt", new Class[] {p6, v3_5}));
            v1.getMethod("pokeByte", new Class[] {p6, Byte.TYPE}));
            v1.getMethod("peekByte", new Class[] {p6}));
            v1.getMethod("pokeByteArray", new Class[] {p6, byte[], v4_1, v4_1}));
            v1.getMethod("peekByteArray", new Class[] {p6, byte[], v4_1, v4_1}));
            return 1;
        } catch (Throwable) {
            return 0;
        }
    }

    public static synthetic void zzs(Object p0, long p1, byte p3)
    {
        com.google.android.gms.internal.measurement.zzop.zzD(p0, p1, p3);
        return;
    }

    public static synthetic void zzt(Object p0, long p1, byte p3)
    {
        com.google.android.gms.internal.measurement.zzop.zzE(p0, p1, p3);
        return;
    }

    public static synthetic boolean zzu(Object p3, long p4)
    {
        if (((byte) ((com.google.android.gms.internal.measurement.zzop.zzf.zza.getInt(p3, (-4 & p4)) >> ((int) (((~ p4) & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static synthetic boolean zzv(Object p3, long p4)
    {
        if (((byte) ((com.google.android.gms.internal.measurement.zzop.zzf.zza.getInt(p3, (-4 & p4)) >> ((int) ((p4 & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static synthetic void zzw(Object p0, long p1, boolean p3)
    {
        com.google.android.gms.internal.measurement.zzop.zzD(p0, p1, p3);
        return;
    }

    public static synthetic void zzx(Object p0, long p1, boolean p3)
    {
        com.google.android.gms.internal.measurement.zzop.zzE(p0, p1, p3);
        return;
    }

    public static synthetic void zzy(Throwable p4)
    {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzop.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(p4.toString()));
        return;
    }

    private static int zzz(Class p1)
    {
        if (!com.google.android.gms.internal.measurement.zzop.zzh) {
            return -1;
        } else {
            return com.google.android.gms.internal.measurement.zzop.zzf.zza.arrayBaseOffset(p1);
        }
    }
}
