package okhttp3.internal;
public final class _UtilCommonKt {
    public static final byte[] a;
    public static final x8.x b;

    static _UtilCommonKt()
    {
        x8.x v0_1 = new byte[0];
        okhttp3.internal._UtilCommonKt.a = v0_1;
        okhttp3.internal._UtilCommonKt.b = x8.b.f(new x8.j[] {v3.f.h("efbbbf"), v3.f.h("feff"), v3.f.h("fffe0000"), v3.f.h("fffe"), v3.f.h("0000feff")}));
        return;
    }

    public static final void a(long p4, long p6, long p8)
    {
        if (((p6 | p8) < 0) || ((p6 > p4) || ((p4 - p6) < p8))) {
            StringBuilder v9_1 = new StringBuilder("length=");
            v9_1.append(p4);
            v9_1.append(", offset=");
            v9_1.append(p6);
            v9_1.append(", count=");
            v9_1.append(p6);
            throw new ArrayIndexOutOfBoundsException(v9_1.toString());
        } else {
            return;
        }
    }

    public static final void b(java.io.Closeable p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        try {
            p1.close();
        } catch (RuntimeException v1_1) {
            throw v1_1;
        } catch (Exception) {
        }
        return;
    }

    public static final int c(String p1, char p2, int p3, int p4)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        while (p3 < p4) {
            if (p1.charAt(p3) != p2) {
                p3++;
            } else {
                return p3;
            }
        }
        return p4;
    }

    public static final int d(String p1, int p2, int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        while (p2 < p3) {
            if (!b8.i.r0(p4, p1.charAt(p2))) {
                p2++;
            } else {
                return p2;
            }
        }
        return p3;
    }

    public static final boolean e(String[] p7, String[] p8, java.util.Comparator p9)
    {
        kotlin.jvm.internal.j.e(p7, "<this>");
        kotlin.jvm.internal.j.e(p9, "comparator");
        if ((p7.length != 0) && ((p8 != null) && (p8.length != 0))) {
            int v2 = 0;
            while (v2 < p7.length) {
                int v5 = 0;
                while (v5 < p8.length) {
                    if (p9.compare(p7[v2], p8[v5]) != 0) {
                        v5++;
                    } else {
                        return 1;
                    }
                }
                v2++;
            }
        }
        return 0;
    }

    public static final int f(String p4)
    {
        int v0 = p4.length();
        int v1 = 0;
        while (v1 < v0) {
            int v2_1 = p4.charAt(v1);
            if ((kotlin.jvm.internal.j.f(v2_1, 31) > 0) && (kotlin.jvm.internal.j.f(v2_1, 127) < 0)) {
                v1++;
            } else {
                return v1;
            }
        }
        return -1;
    }

    public static final int g(int p2, int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        while (p2 < p3) {
            char v0_1 = p4.charAt(p2);
            if ((v0_1 == 9) || ((v0_1 == 10) || ((v0_1 == 12) || ((v0_1 == 13) || (v0_1 == 32))))) {
                p2++;
            } else {
                return p2;
            }
        }
        return p3;
    }

    public static final int h(int p2, int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        int v3_1 = (p3 - 1);
        if (p2 <= v3_1) {
            while(true) {
                char v0_1 = p4.charAt(v3_1);
                if ((v0_1 != 9) && ((v0_1 != 10) && ((v0_1 != 12) && ((v0_1 != 13) && (v0_1 != 32))))) {
                    break;
                }
                if (v3_1 != p2) {
                    v3_1--;
                }
            }
            return (v3_1 + 1);
        }
        return p2;
    }

    public static final String[] i(String[] p8, String[] p9, java.util.Comparator p10)
    {
        kotlin.jvm.internal.j.e(p8, "<this>");
        kotlin.jvm.internal.j.e(p9, "other");
        kotlin.jvm.internal.j.e(p10, "comparator");
        java.util.ArrayList v0_4 = new java.util.ArrayList();
        int v1 = p8.length;
        int v3 = 0;
        while (v3 < v1) {
            String v4 = p8[v3];
            int v6 = 0;
            while (v6 < p9.length) {
                if (p10.compare(v4, p9[v6]) != 0) {
                    v6++;
                } else {
                    v0_4.add(v4);
                    break;
                }
            }
            v3++;
        }
        String[] v8_1 = new String[0];
        return ((String[]) v0_4.toArray(v8_1));
    }

    public static final boolean j(String p1)
    {
        kotlin.jvm.internal.j.e(p1, "name");
        if ((!p1.equalsIgnoreCase("Authorization")) && ((!p1.equalsIgnoreCase("Cookie")) && ((!p1.equalsIgnoreCase("Proxy-Authorization")) && (!p1.equalsIgnoreCase("Set-Cookie"))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final int k(char p2)
    {
        if ((48 > p2) || (p2 >= 58)) {
            if ((97 > p2) || (p2 >= 103)) {
                if ((65 > p2) || (p2 >= 71)) {
                    return -1;
                } else {
                    return (p2 - 55);
                }
            } else {
                return (p2 - 87);
            }
        } else {
            return (p2 - 48);
        }
    }

    public static final int l(x8.i p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        return ((p2.readByte() & 255) | (((p2.readByte() & 255) << 16) | ((p2.readByte() & 255) << 8)));
    }

    public static final int m(x8.g p3)
    {
        int v0 = 0;
        while ((!p3.h()) && (p3.A(0) == 61)) {
            v0++;
            p3.readByte();
        }
        return v0;
    }

    public static final int n(int p2, String p3)
    {
        try {
            if (p3 != null) {
                p2 = Long.parseLong(p3);
                if (p2 <= 2147483647) {
                    if (p2 >= 0) {
                        p2 = ((int) p2);
                    } else {
                        return 0;
                    }
                } else {
                    return 2147483647;
                }
            }
        } catch (NumberFormatException) {
        }
        return p2;
    }

    public static final String o(int p0, int p1, String p2)
    {
        String v0_1 = okhttp3.internal._UtilCommonKt.g(p0, p1, p2);
        String v0_2 = p2.substring(v0_1, okhttp3.internal._UtilCommonKt.h(v0_1, p1, p2));
        kotlin.jvm.internal.j.d(v0_2, "substring(...)");
        return v0_2;
    }
}
