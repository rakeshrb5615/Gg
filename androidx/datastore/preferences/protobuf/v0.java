package androidx.datastore.preferences.protobuf;
public abstract class v0 {
    public static final Class a;
    public static final androidx.datastore.preferences.protobuf.c1 b;
    public static final androidx.datastore.preferences.protobuf.c1 c;

    static v0()
    {
        androidx.datastore.preferences.protobuf.c1 v0_0 = 0;
        try {
            androidx.datastore.preferences.protobuf.c1 v1_5 = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable) {
            v1_5 = 0;
        }
        androidx.datastore.preferences.protobuf.v0.a = v1_5;
        try {
            try {
                androidx.datastore.preferences.protobuf.c1 v1_0 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable) {
                v1_0 = 0;
            }
            if (v1_0 != null) {
                v0_0 = ((androidx.datastore.preferences.protobuf.c1) v1_0.getConstructor(0).newInstance(0));
                androidx.datastore.preferences.protobuf.v0.b = v0_0;
                androidx.datastore.preferences.protobuf.v0.c = new androidx.datastore.preferences.protobuf.c1();
                return;
            } else {
                androidx.datastore.preferences.protobuf.v0.b = v0_0;
                androidx.datastore.preferences.protobuf.v0.c = new androidx.datastore.preferences.protobuf.c1();
                return;
            }
        } catch (Throwable) {
            androidx.datastore.preferences.protobuf.v0.b = v0_0;
            androidx.datastore.preferences.protobuf.v0.c = new androidx.datastore.preferences.protobuf.c1();
            return;
        }
    }

    public static int a(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                v2 += androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p5.get(v1)).intValue()));
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static int b(int p0, java.util.List p1)
    {
        int v1_1 = p1.size();
        if (v1_1 != 0) {
            return ((androidx.datastore.preferences.protobuf.l.r0(p0) + 4) * v1_1);
        } else {
            return 0;
        }
    }

    public static int c(int p0, java.util.List p1)
    {
        int v1_1 = p1.size();
        if (v1_1 != 0) {
            return ((androidx.datastore.preferences.protobuf.l.r0(p0) + 8) * v1_1);
        } else {
            return 0;
        }
    }

    public static int d(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                v2 += androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p5.get(v1)).intValue()));
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static int e(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                v2 += androidx.datastore.preferences.protobuf.l.t0(((Long) p5.get(v1)).longValue());
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static int f(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                int v3_0 = ((Integer) p5.get(v1)).intValue();
                v2 += androidx.datastore.preferences.protobuf.l.s0(((v3_0 >> 31) ^ (v3_0 << 1)));
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static int g(java.util.List p8)
    {
        int v0 = p8.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                int v3_0 = ((Long) p8.get(v1)).longValue();
                v2 += androidx.datastore.preferences.protobuf.l.t0(((v3_0 >> 63) ^ (v3_0 << 1)));
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static int h(java.util.List p4)
    {
        int v0 = p4.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                v2 += androidx.datastore.preferences.protobuf.l.s0(((Integer) p4.get(v1)).intValue());
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static int i(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                v2 += androidx.datastore.preferences.protobuf.l.t0(((Long) p5.get(v1)).longValue());
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static Object j(Object p0, int p1, androidx.datastore.preferences.protobuf.w p2, Object p3, androidx.datastore.preferences.protobuf.c1 p4)
    {
        return p3;
    }

    public static void k(androidx.datastore.preferences.protobuf.c1 p6, Object p7, Object p8)
    {
        p6.getClass();
        UnsupportedOperationException v6_2 = ((androidx.datastore.preferences.protobuf.v) p7).unknownFields;
        int v8_3 = ((androidx.datastore.preferences.protobuf.v) p8).unknownFields;
        int v0_6 = androidx.datastore.preferences.protobuf.b1.f;
        if (!v0_6.equals(v8_3)) {
            if (!v0_6.equals(v6_2)) {
                v6_2.getClass();
                if (!v8_3.equals(v0_6)) {
                    if (!v6_2.e) {
                        throw new UnsupportedOperationException();
                    } else {
                        int v0_3 = (v6_2.a + v8_3.a);
                        v6_2.a(v0_3);
                        System.arraycopy(v8_3.b, 0, v6_2.b, v6_2.a, v8_3.a);
                        System.arraycopy(v8_3.c, 0, v6_2.c, v6_2.a, v8_3.a);
                        v6_2.a = v0_3;
                    }
                }
            } else {
                int v0_5 = (v6_2.a + v8_3.a);
                Object[] v1_6 = java.util.Arrays.copyOf(v6_2.b, v0_5);
                System.arraycopy(v8_3.b, 0, v1_6, v6_2.a, v8_3.a);
                Object[] v3_4 = java.util.Arrays.copyOf(v6_2.c, v0_5);
                System.arraycopy(v8_3.c, 0, v3_4, v6_2.a, v8_3.a);
                v6_2 = new androidx.datastore.preferences.protobuf.b1(v0_5, v1_6, v3_4, 1);
            }
        }
        ((androidx.datastore.preferences.protobuf.v) p7).unknownFields = v6_2;
        return;
    }

    public static boolean l(Object p0, Object p1)
    {
        if ((p0 != p1) && ((p0 == 0) || (!p0.equals(p1)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void m(int p2, java.util.List p3, androidx.datastore.preferences.protobuf.e0 p4, boolean p5)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v4_2 = ((androidx.datastore.preferences.protobuf.l) p4.a);
            int v0_0 = 0;
            if (p5 != 0) {
                v4_2.K0(p2, 2);
                byte v2_1 = 0;
                int v5_5 = 0;
                while (v2_1 < p3.size()) {
                    ((Boolean) p3.get(v2_1)).getClass();
                    v5_5++;
                    v2_1++;
                }
                v4_2.M0(v5_5);
                while (v0_0 < p3.size()) {
                    v4_2.w0(((byte) ((Boolean) p3.get(v0_0)).booleanValue()));
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p3.size()) {
                v4_2.y0(p2, ((Boolean) p3.get(v0_0)).booleanValue());
                v0_0++;
            }
        }
        return;
    }

    public static void n(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_1 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                Double v3_1 = 0;
                int v6_4 = 0;
                while (v3_1 < p4.size()) {
                    ((Double) p4.get(v3_1)).getClass();
                    v6_4 += 8;
                    v3_1++;
                }
                v5_2.M0(v6_4);
                while (v0_1 < p4.size()) {
                    v5_2.E0(Double.doubleToRawLongBits(((Double) p4.get(v0_1)).doubleValue()));
                    v0_1++;
                }
                return;
            }
            while (v0_1 < p4.size()) {
                long v1_0 = ((Double) p4.get(v0_1)).doubleValue();
                v5_2.getClass();
                v5_2.D0(p3, Double.doubleToRawLongBits(v1_0));
                v0_1++;
            }
        }
        return;
    }

    public static void o(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_0 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                int v3_1 = 0;
                int v6_5 = 0;
                while (v3_1 < p4.size()) {
                    v6_5 += androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p4.get(v3_1)).intValue()));
                    v3_1++;
                }
                v5_2.M0(v6_5);
                while (v0_0 < p4.size()) {
                    v5_2.G0(((Integer) p4.get(v0_0)).intValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p4.size()) {
                v5_2.F0(p3, ((Integer) p4.get(v0_0)).intValue());
                v0_0++;
            }
        }
        return;
    }

    public static void p(int p2, java.util.List p3, androidx.datastore.preferences.protobuf.e0 p4, boolean p5)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v4_2 = ((androidx.datastore.preferences.protobuf.l) p4.a);
            int v0_0 = 0;
            if (p5 != 0) {
                v4_2.K0(p2, 2);
                int v2_1 = 0;
                int v5_5 = 0;
                while (v2_1 < p3.size()) {
                    ((Integer) p3.get(v2_1)).getClass();
                    v5_5 += 4;
                    v2_1++;
                }
                v4_2.M0(v5_5);
                while (v0_0 < p3.size()) {
                    v4_2.C0(((Integer) p3.get(v0_0)).intValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p3.size()) {
                v4_2.B0(p2, ((Integer) p3.get(v0_0)).intValue());
                v0_0++;
            }
        }
        return;
    }

    public static void q(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_0 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                Long v3_1 = 0;
                int v6_4 = 0;
                while (v3_1 < p4.size()) {
                    ((Long) p4.get(v3_1)).getClass();
                    v6_4 += 8;
                    v3_1++;
                }
                v5_2.M0(v6_4);
                while (v0_0 < p4.size()) {
                    v5_2.E0(((Long) p4.get(v0_0)).longValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p4.size()) {
                v5_2.D0(p3, ((Long) p4.get(v0_0)).longValue());
                v0_0++;
            }
        }
        return;
    }

    public static void r(int p2, java.util.List p3, androidx.datastore.preferences.protobuf.e0 p4, boolean p5)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v4_2 = ((androidx.datastore.preferences.protobuf.l) p4.a);
            int v0_1 = 0;
            if (p5 != 0) {
                v4_2.K0(p2, 2);
                int v2_1 = 0;
                int v5_6 = 0;
                while (v2_1 < p3.size()) {
                    ((Float) p3.get(v2_1)).getClass();
                    v5_6 += 4;
                    v2_1++;
                }
                v4_2.M0(v5_6);
                while (v0_1 < p3.size()) {
                    v4_2.C0(Float.floatToRawIntBits(((Float) p3.get(v0_1)).floatValue()));
                    v0_1++;
                }
                return;
            }
            while (v0_1 < p3.size()) {
                int v5_3 = ((Float) p3.get(v0_1)).floatValue();
                v4_2.getClass();
                v4_2.B0(p2, Float.floatToRawIntBits(v5_3));
                v0_1++;
            }
        }
        return;
    }

    public static void s(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_0 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                int v3_1 = 0;
                int v6_5 = 0;
                while (v3_1 < p4.size()) {
                    v6_5 += androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p4.get(v3_1)).intValue()));
                    v3_1++;
                }
                v5_2.M0(v6_5);
                while (v0_0 < p4.size()) {
                    v5_2.G0(((Integer) p4.get(v0_0)).intValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p4.size()) {
                v5_2.F0(p3, ((Integer) p4.get(v0_0)).intValue());
                v0_0++;
            }
        }
        return;
    }

    public static void t(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_0 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                Long v3_1 = 0;
                int v6_4 = 0;
                while (v3_1 < p4.size()) {
                    v6_4 += androidx.datastore.preferences.protobuf.l.t0(((Long) p4.get(v3_1)).longValue());
                    v3_1++;
                }
                v5_2.M0(v6_4);
                while (v0_0 < p4.size()) {
                    v5_2.O0(((Long) p4.get(v0_0)).longValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p4.size()) {
                v5_2.N0(p3, ((Long) p4.get(v0_0)).longValue());
                v0_0++;
            }
        }
        return;
    }

    public static void u(int p2, java.util.List p3, androidx.datastore.preferences.protobuf.e0 p4, boolean p5)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v4_2 = ((androidx.datastore.preferences.protobuf.l) p4.a);
            int v0_0 = 0;
            if (p5 != 0) {
                v4_2.K0(p2, 2);
                int v2_1 = 0;
                int v5_5 = 0;
                while (v2_1 < p3.size()) {
                    ((Integer) p3.get(v2_1)).getClass();
                    v5_5 += 4;
                    v2_1++;
                }
                v4_2.M0(v5_5);
                while (v0_0 < p3.size()) {
                    v4_2.C0(((Integer) p3.get(v0_0)).intValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p3.size()) {
                v4_2.B0(p2, ((Integer) p3.get(v0_0)).intValue());
                v0_0++;
            }
        }
        return;
    }

    public static void v(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_0 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                Long v3_1 = 0;
                int v6_4 = 0;
                while (v3_1 < p4.size()) {
                    ((Long) p4.get(v3_1)).getClass();
                    v6_4 += 8;
                    v3_1++;
                }
                v5_2.M0(v6_4);
                while (v0_0 < p4.size()) {
                    v5_2.E0(((Long) p4.get(v0_0)).longValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p4.size()) {
                v5_2.D0(p3, ((Long) p4.get(v0_0)).longValue());
                v0_0++;
            }
        }
        return;
    }

    public static void w(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_1 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                int v3_1 = 0;
                int v6_7 = 0;
                while (v3_1 < p4.size()) {
                    int v1_4 = ((Integer) p4.get(v3_1)).intValue();
                    v6_7 += androidx.datastore.preferences.protobuf.l.s0(((v1_4 >> 31) ^ (v1_4 << 1)));
                    v3_1++;
                }
                v5_2.M0(v6_7);
                while (v0_1 < p4.size()) {
                    int v3_5 = ((Integer) p4.get(v0_1)).intValue();
                    v5_2.M0(((v3_5 >> 31) ^ (v3_5 << 1)));
                    v0_1++;
                }
                return;
            }
            while (v0_1 < p4.size()) {
                int v6_3 = ((Integer) p4.get(v0_1)).intValue();
                v5_2.L0(p3, ((v6_3 >> 31) ^ (v6_3 << 1)));
                v0_1++;
            }
        }
        return;
    }

    public static void x(int p7, java.util.List p8, androidx.datastore.preferences.protobuf.e0 p9, boolean p10)
    {
        if ((p8 != null) && (!p8.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v9_2 = ((androidx.datastore.preferences.protobuf.l) p9.a);
            int v2 = 0;
            if (p10 != 0) {
                v9_2.K0(p7, 2);
                Long v7_1 = 0;
                int v10_5 = 0;
                while (v7_1 < p8.size()) {
                    long v3_9 = ((Long) p8.get(v7_1)).longValue();
                    v10_5 += androidx.datastore.preferences.protobuf.l.t0(((v3_9 >> 63) ^ (v3_9 << 1)));
                    v7_1++;
                }
                v9_2.M0(v10_5);
                while (v2 < p8.size()) {
                    long v3_4 = ((Long) p8.get(v2)).longValue();
                    v9_2.O0(((v3_4 >> 63) ^ (v3_4 << 1)));
                    v2++;
                }
                return;
            }
            while (v2 < p8.size()) {
                long v3_0 = ((Long) p8.get(v2)).longValue();
                v9_2.N0(p7, ((v3_0 >> 63) ^ (v3_0 << 1)));
                v2++;
            }
        }
        return;
    }

    public static void y(int p2, java.util.List p3, androidx.datastore.preferences.protobuf.e0 p4, boolean p5)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v4_2 = ((androidx.datastore.preferences.protobuf.l) p4.a);
            int v0_0 = 0;
            if (p5 != 0) {
                v4_2.K0(p2, 2);
                int v2_1 = 0;
                int v5_5 = 0;
                while (v2_1 < p3.size()) {
                    v5_5 += androidx.datastore.preferences.protobuf.l.s0(((Integer) p3.get(v2_1)).intValue());
                    v2_1++;
                }
                v4_2.M0(v5_5);
                while (v0_0 < p3.size()) {
                    v4_2.M0(((Integer) p3.get(v0_0)).intValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p3.size()) {
                v4_2.L0(p2, ((Integer) p3.get(v0_0)).intValue());
                v0_0++;
            }
        }
        return;
    }

    public static void z(int p3, java.util.List p4, androidx.datastore.preferences.protobuf.e0 p5, boolean p6)
    {
        if ((p4 != null) && (!p4.isEmpty())) {
            androidx.datastore.preferences.protobuf.l v5_2 = ((androidx.datastore.preferences.protobuf.l) p5.a);
            int v0_0 = 0;
            if (p6 != 0) {
                v5_2.K0(p3, 2);
                Long v3_1 = 0;
                int v6_4 = 0;
                while (v3_1 < p4.size()) {
                    v6_4 += androidx.datastore.preferences.protobuf.l.t0(((Long) p4.get(v3_1)).longValue());
                    v3_1++;
                }
                v5_2.M0(v6_4);
                while (v0_0 < p4.size()) {
                    v5_2.O0(((Long) p4.get(v0_0)).longValue());
                    v0_0++;
                }
                return;
            }
            while (v0_0 < p4.size()) {
                v5_2.N0(p3, ((Long) p4.get(v0_0)).longValue());
                v0_0++;
            }
        }
        return;
    }
}
