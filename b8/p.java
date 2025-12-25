package b8;
public abstract class p extends b8.o {

    public static boolean l0(String p7, String p8, boolean p9)
    {
        kotlin.jvm.internal.j.e(p7, "<this>");
        if (p9 != 0) {
            return b8.p.m0((p7.length() - p8.length()), 0, p8.length(), p7, p8, 1);
        } else {
            return p7.endsWith(p8);
        }
    }

    public static boolean m0(int p6, int p7, int p8, String p9, String p10, boolean p11)
    {
        kotlin.jvm.internal.j.e(p9, "<this>");
        kotlin.jvm.internal.j.e(p10, "other");
        if (p11) {
            return p9.regionMatches(p11, p6, p10, p7, p8);
        } else {
            return p9.regionMatches(p6, p10, p7, p8);
        }
    }

    public static String n0(String p7, String p8, String p9)
    {
        kotlin.jvm.internal.j.e(p7, "<this>");
        kotlin.jvm.internal.j.e(p9, "newValue");
        int v1_1 = b8.i.u0(p7, p8, 0, 0);
        if (v1_1 >= 0) {
            int v2 = p8.length();
            int v3 = 1;
            if (v2 >= 1) {
                v3 = v2;
            }
            int v5_1 = (p9.length() + (p7.length() - v2));
            if (v5_1 < 0) {
                throw new OutOfMemoryError();
            } else {
                StringBuilder v4_3 = new StringBuilder(v5_1);
                int v5_2 = 0;
                do {
                    v4_3.append(p7, v5_2, v1_1);
                    v4_3.append(p9);
                    v5_2 = (v1_1 + v2);
                    if (v1_1 >= p7.length()) {
                        break;
                    }
                    v1_1 = b8.i.u0(p7, p8, (v1_1 + v3), 0);
                } while(v1_1 > 0);
                v4_3.append(p7, v5_2, p7.length());
                String v7_3 = v4_3.toString();
                kotlin.jvm.internal.j.d(v7_3, "toString(...)");
                return v7_3;
            }
        } else {
            return p7;
        }
    }

    public static boolean o0(String p6, String p7, int p8, boolean p9)
    {
        kotlin.jvm.internal.j.e(p6, "<this>");
        if (p9) {
            return b8.p.m0(p8, 0, p7.length(), p6, p7, p9);
        } else {
            return p6.startsWith(p7, p8);
        }
    }

    public static boolean p0(String p1, String p2)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        kotlin.jvm.internal.j.e(p2, "prefix");
        return p1.startsWith(p2);
    }

    public static Integer q0(String p10)
    {
        kotlin.jvm.internal.j.e(p10, "<this>");
        a.a.j(10);
        int v1 = p10.length();
        if (v1 != 0) {
            int v4_2;
            int v3_0;
            int v2_1 = 0;
            int v3_1 = p10.charAt(0);
            int v5_0 = -2147483647;
            if (kotlin.jvm.internal.j.f(v3_1, 48) >= 0) {
                v3_0 = 0;
                v4_2 = 0;
            } else {
                v4_2 = 1;
                if (v1 != 1) {
                    if (v3_1 == 43) {
                        v3_0 = 0;
                    } else {
                        if (v3_1 == 45) {
                            v5_0 = -2147483648;
                            v3_0 = 1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
            int v7 = -59652323;
            while (v4_2 < v1) {
                int v8_1 = Character.digit(p10.charAt(v4_2), 10);
                if (v8_1 >= 0) {
                    if (v2_1 < v7) {
                        if (v7 != -59652323) {
                            return 0;
                        } else {
                            v7 = (v5_0 / 10);
                            if (v2_1 < v7) {
                                return 0;
                            }
                        }
                    }
                    int v2_0 = (v2_1 * 10);
                    if (v2_0 >= (v5_0 + v8_1)) {
                        v2_1 = (v2_0 - v8_1);
                        v4_2++;
                    }
                }
            }
            if (v3_0 == 0) {
                return Integer.valueOf((- v2_1));
            } else {
                return Integer.valueOf(v2_1);
            }
        }
        return 0;
    }
}
