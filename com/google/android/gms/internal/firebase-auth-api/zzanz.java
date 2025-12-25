package com.google.android.gms.internal.firebase-auth-api;
final class zzanz {
    static final boolean zza;
    private static final sun.misc.Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.firebase-auth-api.zzanz$zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    static zzanz()
    {
        sun.misc.Unsafe v1_0;
        int v0_0 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzb();
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzb = v0_0;
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc = com.google.android.gms.internal.firebase-auth-api.zzajs.zza();
        sun.misc.Unsafe v1_7 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(Long.TYPE);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzd = v1_7;
        java.nio.ByteOrder v2_1 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(Integer.TYPE);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zze = v2_1;
        if (v0_0 == 0) {
            v1_0 = 0;
        } else {
            if (v1_7 == null) {
                if (v2_1 == null) {
                } else {
                    v1_0 = new com.google.android.gms.internal.firebase-auth-api.zzanz$zzb(v0_0);
                }
            } else {
                v1_0 = new com.google.android.gms.internal.firebase-auth-api.zzanz$zza(v0_0);
            }
        }
        java.nio.ByteOrder v2_2;
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf = v1_0;
        int v0_1 = 0;
        if (v1_0 != null) {
            v2_2 = v1_0.zzb();
        } else {
            v2_2 = 0;
        }
        java.nio.ByteOrder v2_3;
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzg = v2_2;
        if (v1_0 != null) {
            v2_3 = v1_0.zza();
        } else {
            v2_3 = 0;
        }
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzh = v2_3;
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzi = ((long) com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(byte[]));
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(boolean[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(boolean[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(int[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(int[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(long[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(long[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(float[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(float[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(double[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(double[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(Object[]);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(Object[]);
        java.nio.ByteOrder v2_13 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze();
        if ((v2_13 != null) && (v1_0 != null)) {
            v1_0.zza.objectFieldOffset(v2_13);
        }
        if (java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN) {
            v0_1 = 1;
        }
        com.google.android.gms.internal.firebase-auth-api.zzanz.zza = v0_1;
        return;
    }

    private zzanz()
    {
        return;
    }

    public static double zza(Object p1, long p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza(p1, p2);
    }

    public static Object zza(Class p1)
    {
        try {
            return com.google.android.gms.internal.firebase-auth-api.zzanz.zzb.allocateInstance(p1);
        } catch (InstantiationException v1_2) {
            throw new IllegalStateException(v1_2);
        }
    }

    public static synthetic reflect.Field zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zze();
    }

    private static reflect.Field zza(Class p0, String p1)
    {
        try {
            return p0.getDeclaredField(p1);
        } catch (Throwable) {
            return 0;
        }
    }

    public static synthetic void zza(Object p0, long p1, byte p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p0, p1, p3);
        return;
    }

    public static void zza(Object p6, long p7, double p9)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza(p6, p7, p9);
        return;
    }

    public static void zza(Object p1, long p2, float p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza(p1, p2, p4);
        return;
    }

    public static void zza(Object p1, long p2, int p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza(p1, p2, p4);
        return;
    }

    public static void zza(Object p6, long p7, long p9)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza(p6, p7, p9);
        return;
    }

    public static void zza(Object p1, long p2, Object p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza.putObject(p1, p2, p4);
        return;
    }

    public static synthetic void zza(Object p0, long p1, boolean p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p0, p1, ((byte) p3));
        return;
    }

    public static synthetic void zza(Throwable p4)
    {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zzanz.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(p4)));
        return;
    }

    public static void zza(byte[] p3, long p4, byte p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza(p3, (com.google.android.gms.internal.firebase-auth-api.zzanz.zzi + p4), p6);
        return;
    }

    public static float zzb(Object p1, long p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zzb(p1, p2);
    }

    private static int zzb(Class p1)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzanz.zzh) {
            return -1;
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza.arrayBaseOffset(p1);
        }
    }

    public static sun.misc.Unsafe zzb()
    {
        try {
            return ((sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.firebase-auth-api.zzany()));
        } catch (Throwable) {
            return 0;
        }
    }

    public static synthetic void zzb(Object p0, long p1, byte p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p0, p1, p3);
        return;
    }

    public static synthetic void zzb(Object p0, long p1, boolean p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p0, p1, ((byte) p3));
        return;
    }

    private static int zzc(Class p1)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzanz.zzh) {
            return -1;
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza.arrayIndexScale(p1);
        }
    }

    public static int zzc(Object p1, long p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zzd(p1, p2);
    }

    private static void zzc(Object p4, long p5, byte p7)
    {
        long v0_1 = (-4 & p5);
        int v5_6 = (((~ ((int) p5)) & 3) << 3);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p4, v0_1, (((255 & p7) << v5_6) | (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p4, v0_1) & (~ (255 << v5_6)))));
        return;
    }

    public static void zzc(Object p1, long p2, boolean p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza(p1, p2, p4);
        return;
    }

    public static boolean zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzh;
    }

    public static long zzd(Object p1, long p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zze(p1, p2);
    }

    private static void zzd(Object p4, long p5, byte p7)
    {
        long v0_1 = (-4 & p5);
        int v5_5 = ((((int) p5) & 3) << 3);
        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p4, v0_1, (((255 & p7) << v5_5) | (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p4, v0_1) & (~ (255 << v5_5)))));
        return;
    }

    public static boolean zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzg;
    }

    private static boolean zzd(Class p6)
    {
        try {
            Class v1 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc;
            Class[] v3_4 = Boolean.TYPE;
            v1.getMethod("peekLong", new Class[] {p6, v3_4}));
            v1.getMethod("pokeLong", new Class[] {p6, Long.TYPE, v3_4}));
            Class v4_1 = Integer.TYPE;
            v1.getMethod("pokeInt", new Class[] {p6, v4_1, v3_4}));
            v1.getMethod("peekInt", new Class[] {p6, v3_4}));
            v1.getMethod("pokeByte", new Class[] {p6, Byte.TYPE}));
            v1.getMethod("peekByte", new Class[] {p6}));
            v1.getMethod("pokeByteArray", new Class[] {p6, byte[], v4_1, v4_1}));
            v1.getMethod("peekByteArray", new Class[] {p6, byte[], v4_1, v4_1}));
            return 1;
        } catch (Throwable) {
            return 0;
        }
    }

    public static Object zze(Object p1, long p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zza.getObject(p1, p2);
    }

    private static reflect.Field zze()
    {
        int v0_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zza(java.nio.Buffer, "effectiveDirectAddress");
        if (v0_2 == 0) {
            int v0_4 = com.google.android.gms.internal.firebase-auth-api.zzanz.zza(java.nio.Buffer, "address");
            if ((v0_4 == 0) || (v0_4.getType() != Long.TYPE)) {
                return 0;
            } else {
                return v0_4;
            }
        } else {
            return v0_2;
        }
    }

    public static synthetic boolean zzf(Object p2, long p3)
    {
        if (((byte) (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p2, (-4 & p3)) >> ((int) (((~ p3) & 3) << 3)))) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static synthetic boolean zzg(Object p2, long p3)
    {
        if (((byte) (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p2, (-4 & p3)) >> ((int) ((p3 & 3) << 3)))) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean zzh(Object p1, long p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanz.zzf.zzc(p1, p2);
    }
}
