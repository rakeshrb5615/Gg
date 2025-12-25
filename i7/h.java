package i7;
public abstract class h extends q4.b {

    public static java.util.List V(Object[] p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        java.util.List v1_1 = java.util.Arrays.asList(p1);
        kotlin.jvm.internal.j.d(v1_1, "asList(...)");
        return v1_1;
    }

    public static boolean W(Object[] p4, Object p5)
    {
        Object v1_0;
        kotlin.jvm.internal.j.e(p4, "<this>");
        if (p5 != 0) {
            int v2_0 = 0;
            while (v2_0 < p4.length) {
                if (!p5.equals(p4[v2_0])) {
                    v2_0++;
                } else {
                    v1_0 = v2_0;
                }
            }
            v1_0 = -1;
        } else {
            v1_0 = 0;
            while (v1_0 < p4.length) {
                if (p4[v1_0] != 0) {
                    v1_0++;
                }
            }
        }
        if (v1_0 < null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void X(int p1, int p2, int p3, int[] p4, int[] p5)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        kotlin.jvm.internal.j.e(p5, "destination");
        System.arraycopy(p4, p2, p5, p1, (p3 - p2));
        return;
    }

    public static void Y(byte[] p1, int p2, byte[] p3, int p4, int p5)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        kotlin.jvm.internal.j.e(p3, "destination");
        System.arraycopy(p1, p4, p3, p2, (p5 - p4));
        return;
    }

    public static void Z(Object[] p1, int p2, Object[] p3, int p4, int p5)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        kotlin.jvm.internal.j.e(p3, "destination");
        System.arraycopy(p1, p4, p3, p2, (p5 - p4));
        return;
    }

    public static synthetic void a0(Object[] p2, int p3, Object[] p4, int p5, int p6)
    {
        if ((p6 & 4) != 0) {
            p3 = 0;
        }
        if ((p6 & 8) != 0) {
            p5 = p2.length;
        }
        i7.h.Z(p2, 0, p4, p3, p5);
        return;
    }

    public static byte[] b0(byte[] p1, int p2, int p3)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        q4.b.i(p3, p1.length);
        byte[] v1_1 = java.util.Arrays.copyOfRange(p1, p2, p3);
        kotlin.jvm.internal.j.d(v1_1, "copyOfRange(...)");
        return v1_1;
    }

    public static Object[] c0(Object[] p1, int p2, int p3)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        q4.b.i(p3, p1.length);
        Object[] v1_1 = java.util.Arrays.copyOfRange(p1, p2, p3);
        kotlin.jvm.internal.j.d(v1_1, "copyOfRange(...)");
        return v1_1;
    }

    public static void d0(Object[] p1, int p2, int p3)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        java.util.Arrays.fill(p1, p2, p3, 0);
        return;
    }

    public static java.util.ArrayList e0(Object[] p4)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = p4.length;
        int v2 = 0;
        while (v2 < v1) {
            Object v3 = p4[v2];
            if (v3 != null) {
                v0_1.add(v3);
            }
            v2++;
        }
        return v0_1;
    }

    public static Object f0(int p1, Object[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        if ((p1 < null) || (p1 >= p2.length)) {
            return 0;
        } else {
            return p2[p1];
        }
    }

    public static String g0(Object[] p6)
    {
        kotlin.jvm.internal.j.e(p6, "<this>");
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append("[");
        int v1_1 = p6.length;
        int v2 = 0;
        int v3 = 0;
        while (v2 < v1_1) {
            Object v4 = p6[v2];
            v3++;
            if (v3 > 1) {
                v0_2.append(",");
            }
            c4.b.d(v0_2, v4, 0);
            v2++;
        }
        v0_2.append("]");
        return v0_2.toString();
    }

    public static java.util.List h0(long[] p5)
    {
        kotlin.jvm.internal.j.e(p5, "<this>");
        i7.n v0_3 = p5.length;
        if (v0_3 == null) {
            return i7.n.a;
        } else {
            int v1 = 0;
            if (v0_3 == 1) {
                return a.a.G(Long.valueOf(p5[0]));
            } else {
                i7.n v0_2 = new java.util.ArrayList(p5.length);
                int v2_1 = p5.length;
                while (v1 < v2_1) {
                    v0_2.add(Long.valueOf(p5[v1]));
                    v1++;
                }
                return v0_2;
            }
        }
    }

    public static java.util.List i0(Object[] p3)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        java.util.ArrayList v0_3 = p3.length;
        if (v0_3 == null) {
            return i7.n.a;
        } else {
            if (v0_3 == 1) {
                return a.a.G(p3[0]);
            } else {
                return new java.util.ArrayList(new i7.f(p3, 0));
            }
        }
    }
}
