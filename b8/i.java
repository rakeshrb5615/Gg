package b8;
public abstract class i extends b8.p {

    public static int A0(String p2, String p3)
    {
        int v0 = b8.i.t0(p2);
        kotlin.jvm.internal.j.e(p2, "<this>");
        return p2.lastIndexOf(p3, v0);
    }

    public static String B0(int p2, String p3)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        if (p2 < null) {
            throw new IllegalArgumentException(v1.a.j("Desired length ", p2, " is less than zero."));
        } else {
            StringBuilder v2_2;
            if (p2 > p3.length()) {
                StringBuilder v0_3 = new StringBuilder(p2);
                v0_3.append(p3);
                StringBuilder v2_1 = (p2 - p3.length());
                int v3_2 = 1;
                if (1 <= v2_1) {
                    while(true) {
                        v0_3.append(32);
                        if (v3_2 == v2_1) {
                            break;
                        }
                        v3_2++;
                    }
                }
                v2_2 = v0_3;
            } else {
                v2_2 = p3.subSequence(0, p3.length());
            }
            return v2_2.toString();
        }
    }

    public static String C0(int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        if (p3 < null) {
            throw new IllegalArgumentException(v1.a.j("Desired length ", p3, " is less than zero."));
        } else {
            StringBuilder v3_2;
            if (p3 > p4.length()) {
                StringBuilder v0_3 = new StringBuilder(p3);
                StringBuilder v3_1 = (p3 - p4.length());
                int v1_1 = 1;
                if (1 <= v3_1) {
                    while(true) {
                        v0_3.append(48);
                        if (v1_1 == v3_1) {
                            break;
                        }
                        v1_1++;
                    }
                }
                v0_3.append(p4);
                v3_2 = v0_3;
            } else {
                v3_2 = p4.subSequence(0, p4.length());
            }
            return v3_2.toString();
        }
    }

    public static String D0(String p1, String p2)
    {
        if (b8.p.p0(p1, p2)) {
            p1 = p1.substring(p2.length());
            kotlin.jvm.internal.j.d(p1, "substring(...)");
        }
        return p1;
    }

    public static java.util.List E0(String p5, char[] p6)
    {
        kotlin.jvm.internal.j.e(p5, "<this>");
        if (p6.length != 1) {
            int v6_2 = new a8.k(new a8.e(p5, new b8.q(0, p6)));
            java.util.ArrayList v0_3 = new java.util.ArrayList(i7.j.X(v6_2, 10));
            int v6_3 = v6_2.iterator();
            while(true) {
                String v1_2 = ((b8.b) v6_3);
                if (!v1_2.hasNext()) {
                    break;
                }
                String v1_4 = ((y7.e) v1_2.next());
                kotlin.jvm.internal.j.e(v1_4, "range");
                v0_3.add(p5.subSequence(v1_4.a, (v1_4.b + 1)).toString());
            }
            return v0_3;
        } else {
            int v6_5 = String.valueOf(p6[0]);
            int v2_1 = b8.i.u0(p5, v6_5, 0, 0);
            if (v2_1 == -1) {
                return a.a.G(p5.toString());
            } else {
                java.util.ArrayList v4_1 = new java.util.ArrayList(10);
                String v1_10 = 0;
                do {
                    v4_1.add(p5.subSequence(v1_10, v2_1).toString());
                    v1_10 = (v6_5.length() + v2_1);
                    v2_1 = b8.i.u0(p5, v6_5, v1_10, 0);
                } while(v2_1 != -1);
                v4_1.add(p5.subSequence(v1_10, p5.length()).toString());
                return v4_1;
            }
        }
    }

    public static String F0(String p2, String p3, String p4)
    {
        kotlin.jvm.internal.j.e(p3, "delimiter");
        int v0_2 = b8.i.w0(p2, p3, 0, 6);
        if (v0_2 != -1) {
            String v2_1 = p2.substring((p3.length() + v0_2), p2.length());
            kotlin.jvm.internal.j.d(v2_1, "substring(...)");
            return v2_1;
        } else {
            return p4;
        }
    }

    public static String G0(int p1, String p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        if (p1 < null) {
            throw new IllegalArgumentException(v1.a.j("Requested character count ", p1, " is less than zero.").toString());
        } else {
            int v0_1 = p2.length();
            if (p1 > v0_1) {
                p1 = v0_1;
            }
            String v1_1 = p2.substring(0, p1);
            kotlin.jvm.internal.j.d(v1_1, "substring(...)");
            return v1_1;
        }
    }

    public static CharSequence H0(String p5)
    {
        kotlin.jvm.internal.j.e(p5, "<this>");
        int v0_1 = (p5.length() - 1);
        int v2 = 0;
        int v3 = 0;
        while (v2 <= v0_1) {
            boolean v4_0;
            if (v3 != 0) {
                v4_0 = v0_1;
            } else {
                v4_0 = v2;
            }
            boolean v4_2 = a.a.D(p5.charAt(v4_0));
            if (v3 != 0) {
                if (!v4_2) {
                    break;
                }
                v0_1--;
            } else {
                if (v4_2) {
                    v2++;
                } else {
                    v3 = 1;
                }
            }
        }
        return p5.subSequence(v2, (v0_1 + 1));
    }

    public static boolean r0(CharSequence p2, char p3)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        if (b8.i.v0(p2, p3, 0, 2) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean s0(CharSequence p2, String p3)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        if (b8.i.w0(p2, p3, 0, 2) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final int t0(CharSequence p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        return (p1.length() - 1);
    }

    public static final int u0(CharSequence p10, String p11, int p12, boolean p13)
    {
        kotlin.jvm.internal.j.e(p10, "<this>");
        kotlin.jvm.internal.j.e(p11, "string");
        if ((p13 == 0) && ((p10 instanceof String))) {
            return ((String) p10).indexOf(p11, p12);
        } else {
            int v0_1 = p10.length();
            int v1 = -1;
            if (p12 < 0) {
                p12 = 0;
            }
            int v2_1 = p10.length();
            if (v0_1 > v2_1) {
                v0_1 = v2_1;
            }
            int v3_1 = new y7.e(p12, v0_1, 1);
            int v0_3 = v3_1.c;
            int v2_3 = v3_1.b;
            int v3_2 = v3_1.a;
            if ((!(p10 instanceof String)) || (!(p11 instanceof String))) {
                if (((v0_3 <= 0) || (v3_2 > v2_3)) && ((v0_3 >= 0) || (v2_3 > v3_2))) {
                    return v1;
                }
                while(true) {
                    int v11_1 = p11.length();
                    kotlin.jvm.internal.j.e(p11, "<this>");
                    kotlin.jvm.internal.j.e(p10, "other");
                    int v12_5 = 0;
                    if ((v3_2 >= 0) && (((p11.length() - v11_1) >= 0) && (v3_2 <= (p10.length() - v11_1)))) {
                        int v4_4 = 0;
                        while (v4_4 < v11_1) {
                            if (a.a.s(p11.charAt((0 + v4_4)), p10.charAt((v3_2 + v4_4)), p13)) {
                                v4_4++;
                            }
                        }
                        v12_5 = 1;
                    }
                    if (v12_5 == 0) {
                        break;
                    }
                    v1 = v3_2;
                }
                if (v3_2 != v2_3) {
                    v3_2 += v0_3;
                }
            } else {
                if (((v0_3 > 0) && (v3_2 <= v2_3)) || ((v0_3 < 0) && (v2_3 <= v3_2))) {
                    boolean v5_3 = v3_2;
                    while (!b8.p.m0(0, v5_3, p11.length(), p11, ((String) p10), p13)) {
                        if (v5_3 != v2_3) {
                            v5_3 += v0_3;
                        }
                    }
                    v1 = v5_3;
                }
            }
            return v1;
        }
    }

    public static int v0(CharSequence p1, char p2, int p3, int p4)
    {
        if ((p4 & 2) != 0) {
            p3 = 0;
        }
        kotlin.jvm.internal.j.e(p1, "<this>");
        if ((p1 instanceof String)) {
            return ((String) p1).indexOf(p2, p3);
        } else {
            char[] v4_3 = new char[1];
            v4_3[0] = p2;
            return b8.i.x0(p1, v4_3, p3, 0);
        }
    }

    public static synthetic int w0(CharSequence p1, String p2, int p3, int p4)
    {
        if ((p4 & 2) != 0) {
            p3 = 0;
        }
        return b8.i.u0(p1, p2, p3, 0);
    }

    public static final int x0(CharSequence p6, char[] p7, int p8, boolean p9)
    {
        kotlin.jvm.internal.j.e(p6, "<this>");
        if ((p9 != 0) || ((p7.length != 1) || (!(p6 instanceof String)))) {
            if (p8 < 0) {
                p8 = 0;
            }
            int v1_0 = b8.i.t0(p6);
            if (p8 <= v1_0) {
                do {
                    char v2 = p6.charAt(p8);
                    int v4 = 0;
                    if (v4 >= p7.length) {
                    } else {
                        if (!a.a.s(p7[v4], v2, p9)) {
                            v4++;
                            while (v4 < p7.length) {
                            }
                        } else {
                            return p8;
                        }
                    }
                } while(p8 == v1_0);
            }
            return -1;
        } else {
            int v9_1 = p7.length;
            if (v9_1 == 0) {
                throw new java.util.NoSuchElementException("Array is empty.");
            } else {
                if (v9_1 != 1) {
                    throw new IllegalArgumentException("Array has more than one element.");
                } else {
                    return ((String) p6).indexOf(p7[0], p8);
                }
            }
        }
    }

    public static boolean y0(String p3)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        int v1 = 0;
        while (v1 < p3.length()) {
            if (a.a.D(p3.charAt(v1))) {
                v1++;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static int z0(String p0, char p1, int p2, int p3)
    {
        if ((p3 & 2) != 0) {
            p2 = b8.i.t0(p0);
        }
        return p0.lastIndexOf(p1, p2);
    }
}
