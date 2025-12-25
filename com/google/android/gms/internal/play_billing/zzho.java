package com.google.android.gms.internal.play_billing;
final class zzho {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.play_billing.zzhn zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    static zzho()
    {
        sun.misc.Unsafe v1_3 = com.google.android.gms.internal.play_billing.zzho.zzg();
        com.google.android.gms.internal.play_billing.zzho.zzc = v1_3;
        com.google.android.gms.internal.play_billing.zzho.zzd = libcore.io.Memory;
        Class v2_1 = Long.TYPE;
        Class[] v3_6 = com.google.android.gms.internal.play_billing.zzho.zzv(v2_1);
        com.google.android.gms.internal.play_billing.zzho.zze = v3_6;
        Class v4 = Integer.TYPE;
        Class[] v5_0 = com.google.android.gms.internal.play_billing.zzho.zzv(v4);
        Class v6_0 = 0;
        if (v1_3 != null) {
            if (v3_6 == null) {
                if (v5_0 != null) {
                    v6_0 = new com.google.android.gms.internal.play_billing.zzhl(v1_3);
                }
            } else {
                v6_0 = new com.google.android.gms.internal.play_billing.zzhm(v1_3);
            }
        }
        Class v6_7;
        com.google.android.gms.internal.play_billing.zzho.zzf = v6_0;
        int v7 = 1;
        if (v6_0 != null) {
            try {
                Class v6_4 = v6_0.zza.getClass();
                v6_4.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                v6_4.getMethod("getLong", new Class[] {Object, v2_1}));
            } catch (Class v6_6) {
                com.google.android.gms.internal.play_billing.zzho.zzh(v6_6);
                v6_7 = 0;
            }
            if (com.google.android.gms.internal.play_billing.zzho.zzB() != null) {
                v6_7 = 1;
            }
        }
        Throwable v0_14;
        com.google.android.gms.internal.play_billing.zzho.zzg = v6_7;
        Class v6_8 = com.google.android.gms.internal.play_billing.zzho.zzf;
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
                com.google.android.gms.internal.play_billing.zzho.zzh(v0_15);
                v0_14 = 0;
            }
        }
        com.google.android.gms.internal.play_billing.zzho.zzh = v0_14;
        com.google.android.gms.internal.play_billing.zzho.zza = ((long) com.google.android.gms.internal.play_billing.zzho.zzz(byte[]));
        com.google.android.gms.internal.play_billing.zzho.zzz(boolean[]);
        com.google.android.gms.internal.play_billing.zzho.zzA(boolean[]);
        com.google.android.gms.internal.play_billing.zzho.zzz(int[]);
        com.google.android.gms.internal.play_billing.zzho.zzA(int[]);
        com.google.android.gms.internal.play_billing.zzho.zzz(long[]);
        com.google.android.gms.internal.play_billing.zzho.zzA(long[]);
        com.google.android.gms.internal.play_billing.zzho.zzz(float[]);
        com.google.android.gms.internal.play_billing.zzho.zzA(float[]);
        com.google.android.gms.internal.play_billing.zzho.zzz(double[]);
        com.google.android.gms.internal.play_billing.zzho.zzA(double[]);
        com.google.android.gms.internal.play_billing.zzho.zzz(Object[]);
        com.google.android.gms.internal.play_billing.zzho.zzA(Object[]);
        Throwable v0_5 = com.google.android.gms.internal.play_billing.zzho.zzB();
        if (v0_5 != null) {
            sun.misc.Unsafe v1_0 = com.google.android.gms.internal.play_billing.zzho.zzf;
            if (v1_0 != null) {
                v1_0.zza.objectFieldOffset(v0_5);
            }
        }
        if (java.nio.ByteOrder.nativeOrder() != java.nio.ByteOrder.BIG_ENDIAN) {
            v7 = 0;
        }
        com.google.android.gms.internal.play_billing.zzho.zzb = v7;
        return;
    }

    private zzho()
    {
        return;
    }

    private static int zzA(Class p1)
    {
        if (!com.google.android.gms.internal.play_billing.zzho.zzh) {
            return -1;
        } else {
            return com.google.android.gms.internal.play_billing.zzho.zzf.zza.arrayIndexScale(p1);
        }
    }

    private static reflect.Field zzB()
    {
        int v0_1 = com.google.android.gms.internal.play_billing.zzho.zzC(java.nio.Buffer, "effectiveDirectAddress");
        if (v0_1 == 0) {
            int v0_3 = com.google.android.gms.internal.play_billing.zzho.zzC(java.nio.Buffer, "address");
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
        sun.misc.Unsafe v0_1 = com.google.android.gms.internal.play_billing.zzho.zzf.zza;
        long v1_1 = (-4 & p6);
        int v6_6 = (((~ ((int) p6)) & 3) << 3);
        v0_1.putInt(p5, v1_1, (((255 & p8) << v6_6) | (v0_1.getInt(p5, v1_1) & (~ (255 << v6_6)))));
        return;
    }

    private static void zzE(Object p5, long p6, byte p8)
    {
        sun.misc.Unsafe v0_1 = com.google.android.gms.internal.play_billing.zzho.zzf.zza;
        long v1_1 = (-4 & p6);
        int v6_5 = ((((int) p6) & 3) << 3);
        v0_1.putInt(p5, v1_1, (((255 & p8) << v6_5) | (v0_1.getInt(p5, v1_1) & (~ (255 << v6_5)))));
        return;
    }

    public static double zza(Object p1, long p2)
    {
        return com.google.android.gms.internal.play_billing.zzho.zzf.zza(p1, p2);
    }

    public static float zzb(Object p1, long p2)
    {
        return com.google.android.gms.internal.play_billing.zzho.zzf.zzb(p1, p2);
    }

    public static int zzc(Object p1, long p2)
    {
        return com.google.android.gms.internal.play_billing.zzho.zzf.zza.getInt(p1, p2);
    }

    public static long zzd(Object p1, long p2)
    {
        return com.google.android.gms.internal.play_billing.zzho.zzf.zza.getLong(p1, p2);
    }

    public static Object zze(Class p1)
    {
        try {
            return com.google.android.gms.internal.play_billing.zzho.zzc.allocateInstance(p1);
        } catch (InstantiationException v1_2) {
            throw new IllegalStateException(v1_2);
        }
    }

    public static Object zzf(Object p1, long p2)
    {
        return com.google.android.gms.internal.play_billing.zzho.zzf.zza.getObject(p1, p2);
    }

    public static sun.misc.Unsafe zzg()
    {
        try {
            return ((sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.play_billing.zzhk()));
        } catch (Throwable) {
            return 0;
        }
    }

    public static bridge synthetic void zzh(Throwable p4)
    {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.zzho.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(p4.toString()));
        return;
    }

    public static synthetic void zzi(Object p0, long p1, boolean p3)
    {
        com.google.android.gms.internal.play_billing.zzho.zzD(p0, p1, p3);
        return;
    }

    public static synthetic void zzj(Object p0, long p1, boolean p3)
    {
        com.google.android.gms.internal.play_billing.zzho.zzE(p0, p1, p3);
        return;
    }

    public static bridge synthetic void zzk(Object p0, long p1, byte p3)
    {
        com.google.android.gms.internal.play_billing.zzho.zzD(p0, p1, p3);
        return;
    }

    public static bridge synthetic void zzl(Object p0, long p1, byte p3)
    {
        com.google.android.gms.internal.play_billing.zzho.zzE(p0, p1, p3);
        return;
    }

    public static void zzm(Object p1, long p2, boolean p4)
    {
        com.google.android.gms.internal.play_billing.zzho.zzf.zzc(p1, p2, p4);
        return;
    }

    public static void zzn(byte[] p3, long p4, byte p6)
    {
        com.google.android.gms.internal.play_billing.zzho.zzf.zzd(p3, (com.google.android.gms.internal.play_billing.zzho.zza + p4), p6);
        return;
    }

    public static void zzo(Object p6, long p7, double p9)
    {
        com.google.android.gms.internal.play_billing.zzho.zzf.zze(p6, p7, p9);
        return;
    }

    public static void zzp(Object p1, long p2, float p4)
    {
        com.google.android.gms.internal.play_billing.zzho.zzf.zzf(p1, p2, p4);
        return;
    }

    public static void zzq(Object p1, long p2, int p4)
    {
        com.google.android.gms.internal.play_billing.zzho.zzf.zza.putInt(p1, p2, p4);
        return;
    }

    public static void zzr(Object p7, long p8, long p10)
    {
        com.google.android.gms.internal.play_billing.zzho.zzf.zza.putLong(p7, p8, p10);
        return;
    }

    public static void zzs(Object p1, long p2, Object p4)
    {
        com.google.android.gms.internal.play_billing.zzho.zzf.zza.putObject(p1, p2, p4);
        return;
    }

    public static bridge synthetic boolean zzt(Object p3, long p4)
    {
        if (((byte) ((com.google.android.gms.internal.play_billing.zzho.zzf.zza.getInt(p3, (-4 & p4)) >> ((int) (((~ p4) & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static bridge synthetic boolean zzu(Object p3, long p4)
    {
        if (((byte) ((com.google.android.gms.internal.play_billing.zzho.zzf.zza.getInt(p3, (-4 & p4)) >> ((int) ((p4 & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean zzv(Class p6)
    {
        try {
            Class v1 = com.google.android.gms.internal.play_billing.zzho.zzd;
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

    public static boolean zzw(Object p1, long p2)
    {
        return com.google.android.gms.internal.play_billing.zzho.zzf.zzg(p1, p2);
    }

    public static boolean zzx()
    {
        return com.google.android.gms.internal.play_billing.zzho.zzh;
    }

    public static boolean zzy()
    {
        return com.google.android.gms.internal.play_billing.zzho.zzg;
    }

    private static int zzz(Class p1)
    {
        if (!com.google.android.gms.internal.play_billing.zzho.zzh) {
            return -1;
        } else {
            return com.google.android.gms.internal.play_billing.zzho.zzf.zza.arrayBaseOffset(p1);
        }
    }
}
