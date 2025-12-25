package com.google.android.gms.internal.auth;
final class zzhi {
    static final boolean zza;
    private static final sun.misc.Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final com.google.android.gms.internal.auth.zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    static zzhi()
    {
        java.nio.ByteOrder v1_2 = com.google.android.gms.internal.auth.zzhi.zzg();
        com.google.android.gms.internal.auth.zzhi.zzb = v1_2;
        com.google.android.gms.internal.auth.zzhi.zzc = com.google.android.gms.internal.auth.zzdr.zza();
        Class v2_1 = Long.TYPE;
        String v3_5 = com.google.android.gms.internal.auth.zzhi.zzs(v2_1);
        com.google.android.gms.internal.auth.zzhi.zzd = v3_5;
        Class v4 = Integer.TYPE;
        String v5_0 = com.google.android.gms.internal.auth.zzhi.zzs(v4);
        Class v6_0 = 0;
        if (v1_2 != null) {
            if (v3_5 == null) {
                if (v5_0 != null) {
                    v6_0 = new com.google.android.gms.internal.auth.zzhf(v1_2);
                }
            } else {
                v6_0 = new com.google.android.gms.internal.auth.zzhg(v1_2);
            }
        }
        Class v6_7;
        com.google.android.gms.internal.auth.zzhi.zze = v6_0;
        int v7 = 1;
        if (v6_0 != null) {
            try {
                Class v6_4 = v6_0.zza.getClass();
                v6_4.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                v6_4.getMethod("getLong", new Class[] {Object, v2_1}));
            } catch (Class v6_6) {
                com.google.android.gms.internal.auth.zzhi.zzh(v6_6);
                v6_7 = 0;
            }
            if (com.google.android.gms.internal.auth.zzhi.zzy() != null) {
                v6_7 = 1;
            }
        }
        Throwable v0_13;
        com.google.android.gms.internal.auth.zzhi.zzf = v6_7;
        Class v6_8 = com.google.android.gms.internal.auth.zzhi.zze;
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
                v0_13 = 1;
            } catch (Throwable v0_14) {
                com.google.android.gms.internal.auth.zzhi.zzh(v0_14);
                v0_13 = 0;
            }
        }
        com.google.android.gms.internal.auth.zzhi.zzg = v0_13;
        com.google.android.gms.internal.auth.zzhi.zzw(byte[]);
        com.google.android.gms.internal.auth.zzhi.zzw(boolean[]);
        com.google.android.gms.internal.auth.zzhi.zzx(boolean[]);
        com.google.android.gms.internal.auth.zzhi.zzw(int[]);
        com.google.android.gms.internal.auth.zzhi.zzx(int[]);
        com.google.android.gms.internal.auth.zzhi.zzw(long[]);
        com.google.android.gms.internal.auth.zzhi.zzx(long[]);
        com.google.android.gms.internal.auth.zzhi.zzw(float[]);
        com.google.android.gms.internal.auth.zzhi.zzx(float[]);
        com.google.android.gms.internal.auth.zzhi.zzw(double[]);
        com.google.android.gms.internal.auth.zzhi.zzx(double[]);
        com.google.android.gms.internal.auth.zzhi.zzw(Object[]);
        com.google.android.gms.internal.auth.zzhi.zzx(Object[]);
        Throwable v0_4 = com.google.android.gms.internal.auth.zzhi.zzy();
        if (v0_4 != null) {
            java.nio.ByteOrder v1_0 = com.google.android.gms.internal.auth.zzhi.zze;
            if (v1_0 != null) {
                v1_0.zzk(v0_4);
            }
        }
        if (java.nio.ByteOrder.nativeOrder() != java.nio.ByteOrder.BIG_ENDIAN) {
            v7 = 0;
        }
        com.google.android.gms.internal.auth.zzhi.zza = v7;
        return;
    }

    private zzhi()
    {
        return;
    }

    public static double zza(Object p1, long p2)
    {
        return com.google.android.gms.internal.auth.zzhi.zze.zza(p1, p2);
    }

    public static float zzb(Object p1, long p2)
    {
        return com.google.android.gms.internal.auth.zzhi.zze.zzb(p1, p2);
    }

    public static int zzc(Object p1, long p2)
    {
        return com.google.android.gms.internal.auth.zzhi.zze.zzi(p1, p2);
    }

    public static long zzd(Object p1, long p2)
    {
        return com.google.android.gms.internal.auth.zzhi.zze.zzj(p1, p2);
    }

    public static Object zze(Class p1)
    {
        try {
            return com.google.android.gms.internal.auth.zzhi.zzb.allocateInstance(p1);
        } catch (InstantiationException v1_2) {
            throw new IllegalStateException(v1_2);
        }
    }

    public static Object zzf(Object p1, long p2)
    {
        return com.google.android.gms.internal.auth.zzhi.zze.zzl(p1, p2);
    }

    public static sun.misc.Unsafe zzg()
    {
        try {
            return ((sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.auth.zzhe()));
        } catch (Throwable) {
            return 0;
        }
    }

    public static bridge synthetic void zzh(Throwable p4)
    {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.auth.zzhi.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(p4.toString()));
        return;
    }

    public static synthetic void zzi(Object p4, long p5, boolean p7)
    {
        long v0_1 = (-4 & p5);
        com.google.android.gms.internal.auth.zzhh v2 = com.google.android.gms.internal.auth.zzhi.zze;
        int v5_6 = (((~ ((int) p5)) & 3) << 3);
        v2.zzm(p4, v0_1, ((p7 << v5_6) | ((~ (255 << v5_6)) & v2.zzi(p4, v0_1))));
        return;
    }

    public static synthetic void zzj(Object p4, long p5, boolean p7)
    {
        long v0_1 = (-4 & p5);
        com.google.android.gms.internal.auth.zzhh v2 = com.google.android.gms.internal.auth.zzhi.zze;
        int v5_5 = ((((int) p5) & 3) << 3);
        v2.zzm(p4, v0_1, ((p7 << v5_5) | ((~ (255 << v5_5)) & v2.zzi(p4, v0_1))));
        return;
    }

    public static void zzk(Object p1, long p2, boolean p4)
    {
        com.google.android.gms.internal.auth.zzhi.zze.zzc(p1, p2, p4);
        return;
    }

    public static void zzl(Object p6, long p7, double p9)
    {
        com.google.android.gms.internal.auth.zzhi.zze.zzd(p6, p7, p9);
        return;
    }

    public static void zzm(Object p1, long p2, float p4)
    {
        com.google.android.gms.internal.auth.zzhi.zze.zze(p1, p2, p4);
        return;
    }

    public static void zzn(Object p1, long p2, int p4)
    {
        com.google.android.gms.internal.auth.zzhi.zze.zzm(p1, p2, p4);
        return;
    }

    public static void zzo(Object p6, long p7, long p9)
    {
        com.google.android.gms.internal.auth.zzhi.zze.zzn(p6, p7, p9);
        return;
    }

    public static void zzp(Object p1, long p2, Object p4)
    {
        com.google.android.gms.internal.auth.zzhi.zze.zzo(p1, p2, p4);
        return;
    }

    public static bridge synthetic boolean zzq(Object p3, long p4)
    {
        if (((byte) ((com.google.android.gms.internal.auth.zzhi.zze.zzi(p3, (-4 & p4)) >> ((int) (((~ p4) & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static bridge synthetic boolean zzr(Object p3, long p4)
    {
        if (((byte) ((com.google.android.gms.internal.auth.zzhi.zze.zzi(p3, (-4 & p4)) >> ((int) ((p4 & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean zzs(Class p6)
    {
        try {
            Class v1 = com.google.android.gms.internal.auth.zzhi.zzc;
            Class[] v2_4 = Boolean.TYPE;
            v1.getMethod("peekLong", new Class[] {p6, v2_4}));
            v1.getMethod("pokeLong", new Class[] {p6, Long.TYPE, v2_4}));
            Class v3_1 = Integer.TYPE;
            v1.getMethod("pokeInt", new Class[] {p6, v3_1, v2_4}));
            v1.getMethod("peekInt", new Class[] {p6, v2_4}));
            v1.getMethod("pokeByte", new Class[] {p6, Byte.TYPE}));
            v1.getMethod("peekByte", new Class[] {p6}));
            v1.getMethod("pokeByteArray", new Class[] {p6, byte[], v3_1, v3_1}));
            v1.getMethod("peekByteArray", new Class[] {p6, byte[], v3_1, v3_1}));
            return 1;
        } catch (Throwable) {
            return 0;
        }
    }

    public static boolean zzt(Object p1, long p2)
    {
        return com.google.android.gms.internal.auth.zzhi.zze.zzf(p1, p2);
    }

    public static boolean zzu()
    {
        return com.google.android.gms.internal.auth.zzhi.zzg;
    }

    public static boolean zzv()
    {
        return com.google.android.gms.internal.auth.zzhi.zzf;
    }

    private static int zzw(Class p1)
    {
        if (!com.google.android.gms.internal.auth.zzhi.zzg) {
            return -1;
        } else {
            return com.google.android.gms.internal.auth.zzhi.zze.zzg(p1);
        }
    }

    private static int zzx(Class p1)
    {
        if (!com.google.android.gms.internal.auth.zzhi.zzg) {
            return -1;
        } else {
            return com.google.android.gms.internal.auth.zzhi.zze.zzh(p1);
        }
    }

    private static reflect.Field zzy()
    {
        int v0_1 = com.google.android.gms.internal.auth.zzhi.zzz(java.nio.Buffer, "effectiveDirectAddress");
        if (v0_1 == 0) {
            int v0_3 = com.google.android.gms.internal.auth.zzhi.zzz(java.nio.Buffer, "address");
            if ((v0_3 == 0) || (v0_3.getType() != Long.TYPE)) {
                v0_1 = 0;
            } else {
                return v0_3;
            }
        }
        return v0_1;
    }

    private static reflect.Field zzz(Class p0, String p1)
    {
        try {
            return p0.getDeclaredField(p1);
        } catch (Throwable) {
            return 0;
        }
    }
}
