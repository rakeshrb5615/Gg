package androidx.datastore.preferences.protobuf;
public abstract class h1 {
    public static final sun.misc.Unsafe a;
    public static final Class b;
    public static final androidx.datastore.preferences.protobuf.g1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static h1()
    {
        int v0_0 = androidx.datastore.preferences.protobuf.h1.i();
        androidx.datastore.preferences.protobuf.h1.a = v0_0;
        androidx.datastore.preferences.protobuf.h1.b = androidx.datastore.preferences.protobuf.c.a;
        java.nio.ByteOrder v1_17 = androidx.datastore.preferences.protobuf.h1.h(Long.TYPE);
        java.nio.ByteOrder v2_0 = androidx.datastore.preferences.protobuf.h1.h(Integer.TYPE);
        androidx.datastore.preferences.protobuf.e1 v3_0 = 0;
        if (v0_0 != 0) {
            if (!androidx.datastore.preferences.protobuf.c.a()) {
                v3_0 = new androidx.datastore.preferences.protobuf.f1(v0_0);
            } else {
                if (v1_17 == null) {
                    if (v2_0 != null) {
                        v3_0 = new androidx.datastore.preferences.protobuf.e1(v0_0, 0);
                    }
                } else {
                    v3_0 = new androidx.datastore.preferences.protobuf.e1(v0_0, 1);
                }
            }
        }
        java.nio.ByteOrder v1_3;
        androidx.datastore.preferences.protobuf.h1.c = v3_0;
        int v0_1 = 0;
        if (v3_0 != null) {
            v1_3 = v3_0.r();
        } else {
            v1_3 = 0;
        }
        java.nio.ByteOrder v1_4;
        androidx.datastore.preferences.protobuf.h1.d = v1_3;
        if (v3_0 != null) {
            v1_4 = v3_0.q();
        } else {
            v1_4 = 0;
        }
        androidx.datastore.preferences.protobuf.h1.e = v1_4;
        androidx.datastore.preferences.protobuf.h1.f = ((long) androidx.datastore.preferences.protobuf.h1.e(byte[]));
        androidx.datastore.preferences.protobuf.h1.e(boolean[]);
        androidx.datastore.preferences.protobuf.h1.f(boolean[]);
        androidx.datastore.preferences.protobuf.h1.e(int[]);
        androidx.datastore.preferences.protobuf.h1.f(int[]);
        androidx.datastore.preferences.protobuf.h1.e(long[]);
        androidx.datastore.preferences.protobuf.h1.f(long[]);
        androidx.datastore.preferences.protobuf.h1.e(float[]);
        androidx.datastore.preferences.protobuf.h1.f(float[]);
        androidx.datastore.preferences.protobuf.h1.e(double[]);
        androidx.datastore.preferences.protobuf.h1.f(double[]);
        androidx.datastore.preferences.protobuf.h1.e(Object[]);
        androidx.datastore.preferences.protobuf.h1.f(Object[]);
        java.nio.ByteOrder v1_15 = androidx.datastore.preferences.protobuf.h1.g();
        if ((v1_15 != null) && (v3_0 != null)) {
            v3_0.i(v1_15);
        }
        if (java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN) {
            v0_1 = 1;
        }
        androidx.datastore.preferences.protobuf.h1.g = v0_1;
        return;
    }

    public static void a(Throwable p4)
    {
        java.util.logging.Logger v0_2 = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.h1.getName());
        StringBuilder v2_1 = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
        v2_1.append(p4);
        v0_2.log(java.util.logging.Level.WARNING, v2_1.toString());
        return;
    }

    public static boolean b(long p3, Object p5)
    {
        if (((byte) ((androidx.datastore.preferences.protobuf.h1.c.f((-4 & p3), p5) >> ((int) (((~ p3) & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean c(long p3, Object p5)
    {
        if (((byte) ((androidx.datastore.preferences.protobuf.h1.c.f((-4 & p3), p5) >> ((int) ((p3 & 3) << 3))) & 255)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static Object d(Class p1)
    {
        try {
            return androidx.datastore.preferences.protobuf.h1.a.allocateInstance(p1);
        } catch (InstantiationException v1_2) {
            throw new IllegalStateException(v1_2);
        }
    }

    public static int e(Class p1)
    {
        if (!androidx.datastore.preferences.protobuf.h1.e) {
            return -1;
        } else {
            return androidx.datastore.preferences.protobuf.h1.c.a(p1);
        }
    }

    public static void f(Class p1)
    {
        if (androidx.datastore.preferences.protobuf.h1.e) {
            androidx.datastore.preferences.protobuf.h1.c.b(p1);
        }
        return;
    }

    public static reflect.Field g()
    {
        int v2 = 0;
        if (androidx.datastore.preferences.protobuf.c.a()) {
            try {
                int v0_4 = java.nio.Buffer.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable) {
                v0_4 = 0;
            }
            if (v0_4 != 0) {
                return v0_4;
            }
        }
        try {
            int v0_2 = java.nio.Buffer.getDeclaredField("address");
        } catch (Throwable) {
            v0_2 = 0;
        }
        if ((v0_2 != 0) && (v0_2.getType() == Long.TYPE)) {
            v2 = v0_2;
        }
        return v2;
    }

    public static boolean h(Class p7)
    {
        if (androidx.datastore.preferences.protobuf.c.a()) {
            try {
                Class v1_1 = androidx.datastore.preferences.protobuf.h1.b;
                Class[] v4_5 = Boolean.TYPE;
                v1_1.getMethod("peekLong", new Class[] {p7, v4_5}));
                v1_1.getMethod("pokeLong", new Class[] {p7, Long.TYPE, v4_5}));
                Class v5_2 = Integer.TYPE;
                v1_1.getMethod("pokeInt", new Class[] {p7, v5_2, v4_5}));
                v1_1.getMethod("peekInt", new Class[] {p7, v4_5}));
                v1_1.getMethod("pokeByte", new Class[] {p7, Byte.TYPE}));
                v1_1.getMethod("peekByte", new Class[] {p7}));
                v1_1.getMethod("pokeByteArray", new Class[] {p7, byte[], v5_2, v5_2}));
                v1_1.getMethod("peekByteArray", new Class[] {p7, byte[], v5_2, v5_2}));
                return 1;
            } catch (Throwable) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static sun.misc.Unsafe i()
    {
        try {
            return ((sun.misc.Unsafe) java.security.AccessController.doPrivileged(new androidx.datastore.preferences.protobuf.d1()));
        } catch (Throwable) {
            return 0;
        }
    }

    public static void j(byte[] p2, long p3, byte p5)
    {
        androidx.datastore.preferences.protobuf.h1.c.k(p2, (androidx.datastore.preferences.protobuf.h1.f + p3), p5);
        return;
    }

    public static void k(Object p4, long p5, byte p7)
    {
        long v0_1 = (-4 & p5);
        int v5_6 = (((~ ((int) p5)) & 3) << 3);
        androidx.datastore.preferences.protobuf.h1.m(p4, v0_1, (((255 & p7) << v5_6) | (androidx.datastore.preferences.protobuf.h1.c.f(v0_1, p4) & (~ (255 << v5_6)))));
        return;
    }

    public static void l(Object p4, long p5, byte p7)
    {
        long v0_1 = (-4 & p5);
        int v5_5 = ((((int) p5) & 3) << 3);
        androidx.datastore.preferences.protobuf.h1.m(p4, v0_1, (((255 & p7) << v5_5) | (androidx.datastore.preferences.protobuf.h1.c.f(v0_1, p4) & (~ (255 << v5_5)))));
        return;
    }

    public static void m(Object p1, long p2, int p4)
    {
        androidx.datastore.preferences.protobuf.h1.c.n(p1, p2, p4);
        return;
    }

    public static void n(Object p6, long p7, long p9)
    {
        androidx.datastore.preferences.protobuf.h1.c.o(p6, p7, p9);
        return;
    }

    public static void o(Object p1, long p2, Object p4)
    {
        androidx.datastore.preferences.protobuf.h1.c.p(p1, p2, p4);
        return;
    }
}
