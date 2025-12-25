package p0;
public abstract class e {
    public static final Object a;
    public static char[] b;

    static e()
    {
        p0.e.a = new Object();
        char[] v0_3 = new char[24];
        p0.e.b = v0_3;
        return;
    }

    public static void a(Object p2, StringBuilder p3)
    {
        if (p2 != null) {
            String v0_0 = p2.getClass().getSimpleName();
            if (v0_0.length() <= 0) {
                v0_0 = p2.getClass().getName();
                int v1_1 = v0_0.lastIndexOf(46);
                if (v1_1 > 0) {
                    v0_0 = v0_0.substring((v1_1 + 1));
                }
            }
            p3.append(v0_0);
            p3.append(123);
            p3.append(Integer.toHexString(System.identityHashCode(p2)));
            return;
        } else {
            p3.append("null");
            return;
        }
    }

    public static void b(String p0, boolean p1)
    {
        if (p1 == null) {
            throw new IllegalArgumentException(p0);
        } else {
            return;
        }
    }

    public static void c(int p0)
    {
        if (p0 < null) {
            throw new IllegalArgumentException();
        } else {
            return;
        }
    }

    public static void d(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException(p1);
        } else {
            return;
        }
    }

    public static void e(long p3, java.io.PrintWriter p5)
    {
        try {
            p5.print(new String(p0.e.b, 0, p0.e.f(p3)));
            return;
        } catch (Throwable v3_2) {
            throw v3_2;
        }
    }

    public static int f(long p12)
    {
        if (p0.e.b.length < 0) {
            int v0_3 = new char[0];
            p0.e.b = v0_3;
        }
        char[] v2 = p0.e.b;
        int v0_5 = p12 cmp 0;
        if (v0_5 != 0) {
            int v0_2;
            if (v0_5 <= 0) {
                p12 = (- p12);
                v0_2 = 45;
            } else {
                v0_2 = 43;
            }
            int v3_1;
            int v9 = ((int) (p12 % 1000));
            int v12_4 = ((int) Math.floor(((double) (p12 / 1000))));
            if (v12_4 <= 86400) {
                v3_1 = 0;
            } else {
                v3_1 = (v12_4 / 86400);
                v12_4 -= (86400 * v3_1);
            }
            int v13_3;
            if (v12_4 <= 3600) {
                v13_3 = 0;
            } else {
                v13_3 = (v12_4 / 3600);
                v12_4 -= (v13_3 * 3600);
            }
            int v10;
            if (v12_4 <= 60) {
                v10 = 0;
            } else {
                int v4_2 = (v12_4 / 60);
                v12_4 -= (v4_2 * 60);
                v10 = v4_2;
            }
            int v6_1;
            v2[0] = v0_2;
            int v0_4 = p0.e.g(v2, v3_1, 100, 1, 0, 0);
            if (v0_4 == 1) {
                v6_1 = 0;
            } else {
                v6_1 = 1;
            }
            int v6_2;
            int v5_4 = p0.e.g(v2, v13_3, 104, v0_4, v6_1, 0);
            if (v5_4 == 1) {
                v6_2 = 0;
            } else {
                v6_2 = 1;
            }
            int v6_3;
            int v5_5 = p0.e.g(v2, v10, 109, v5_4, v6_2, 0);
            if (v5_5 == 1) {
                v6_3 = 0;
            } else {
                v6_3 = 1;
            }
            int v12_5 = p0.e.g(v2, v9, 109, p0.e.g(v2, v12_4, 115, v5_5, v6_3, 0), 1, 0);
            v2[v12_5] = 115;
            return (v12_5 + 1);
        } else {
            v2[0] = 48;
            return 1;
        }
    }

    public static int g(char[] p2, int p3, char p4, int p5, boolean p6, int p7)
    {
        if ((p6 == 0) && (p3 <= 0)) {
            return p5;
        } else {
            if (((p6 == 0) || (p7 < 3)) && (p3 <= 99)) {
                int v1_2 = p5;
            } else {
                int v0_4 = (p3 / 100);
                p2[p5] = ((char) (v0_4 + 48));
                v1_2 = (p5 + 1);
                p3 -= (v0_4 * 100);
            }
            if (((p6 != 0) && (p7 >= 2)) || ((p3 > 9) || (p5 != v1_2))) {
                int v5_1 = (p3 / 10);
                p2[v1_2] = ((char) (v5_1 + 48));
                v1_2++;
                p3 -= (v5_1 * 10);
            }
            p2[v1_2] = ((char) (p3 + 48));
            p2[(v1_2 + 1)] = p4;
            return (v1_2 + 2);
        }
    }
}
