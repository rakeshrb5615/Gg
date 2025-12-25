package okhttp3.internal.url;
public final class _UrlKt {
    public static final char[] a;

    static _UrlKt()
    {
        char[] v0_1 = new char[16];
        v0_1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        okhttp3.internal.url._UrlKt.a = v0_1;
        return;
    }

    public static String a(String p11, int p12, int p13, String p14, int p15)
    {
        int v3;
        if ((p15 & 1) == 0) {
            v3 = p12;
        } else {
            v3 = 0;
        }
        if ((p15 & 2) != 0) {
            p13 = p11.length();
        }
        int v6;
        if ((p15 & 8) == 0) {
            v6 = 1;
        } else {
            v6 = 0;
        }
        int v7;
        if ((p15 & 16) == 0) {
            v7 = 1;
        } else {
            v7 = 0;
        }
        int v8;
        if ((p15 & 32) == 0) {
            v8 = 1;
        } else {
            v8 = 0;
        }
        int v9;
        if ((p15 & 64) == 0) {
            v9 = 1;
        } else {
            v9 = 0;
        }
        kotlin.jvm.internal.j.e(p11, "<this>");
        return okhttp3.internal.url._UrlKt.b(p11, v3, p13, p14, v6, v7, v8, v9, 128);
    }

    public static String b(String p17, int p18, int p19, String p20, boolean p21, boolean p22, boolean p23, boolean p24, int p25)
    {
        x8.g v2_3;
        boolean v3 = 0;
        if ((p25 & 1) == 0) {
            v2_3 = p18;
        } else {
            v2_3 = 0;
        }
        int v4_0;
        if ((p25 & 2) == 0) {
            v4_0 = p19;
        } else {
            v4_0 = p17.length();
        }
        boolean v5_1;
        if ((p25 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = 0;
        }
        boolean v6_1;
        if ((p25 & 16) == 0) {
            v6_1 = p22;
        } else {
            v6_1 = 0;
        }
        if ((p25 & 64) == 0) {
            v3 = p24;
        }
        kotlin.jvm.internal.j.e(p17, "<this>");
        int v7_0 = v2_3;
        while (v7_0 < v4_0) {
            int v8_0 = p17.codePointAt(v7_0);
            int v9_2 = 128;
            if (((v8_0 >= 32) && ((v8_0 != 127) && ((v8_0 < 128) || (v3)))) && (((!b8.i.r0(p20, ((char) v8_0))) && ((v8_0 != 37) || ((v5_1) && ((!v6_1) || (okhttp3.internal.url._UrlKt.c(v7_0, v4_0, p17)))))) && ((v8_0 != 43) || (!p23)))) {
                v7_0 += Character.charCount(v8_0);
            } else {
                int v8_3 = new x8.g();
                v8_3.R(v2_3, v7_0, p17);
                x8.g v2_1 = 0;
                while (v7_0 < v4_0) {
                    boolean v14_3 = p17.codePointAt(v7_0);
                    if ((!v5_1) || ((v14_3 != 9) && ((v14_3 != 10) && ((v14_3 != 12) && (v14_3 != 13))))) {
                        char v15_4 = "+";
                        if ((v14_3 != 32) || (p20 != " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~")) {
                            if ((v14_3 != 43) || (!p23)) {
                                if (((v14_3 >= 32) && ((v14_3 != 127) && ((v14_3 < v9_2) || (v3)))) && ((!b8.i.r0(p20, ((char) v14_3))) && ((v14_3 != 37) || ((v5_1) && ((!v6_1) || (okhttp3.internal.url._UrlKt.c(v7_0, v4_0, p17))))))) {
                                    v8_3.T(v14_3);
                                } else {
                                    if (v2_1 == null) {
                                        v2_1 = new x8.g();
                                    }
                                    v2_1.T(v14_3);
                                    while (!v2_1.h()) {
                                        boolean v12_1 = v2_1.readByte();
                                        char v15_0 = (v12_1 & 255);
                                        v8_3.M(37);
                                        char[] v16 = okhttp3.internal.url._UrlKt.a;
                                        v8_3.M(v16[((v15_0 >> 4) & 15)]);
                                        v8_3.M(v16[(v12_1 & 15)]);
                                    }
                                }
                            } else {
                                if (!v5_1) {
                                    v15_4 = "%2B";
                                }
                                v8_3.S(v15_4);
                            }
                        } else {
                            v8_3.S("+");
                        }
                    }
                    v7_0 += Character.charCount(v14_3);
                    v9_2 = 128;
                }
                return v8_3.G();
            }
        }
        String v0_1 = p17.substring(v2_3, v4_0);
        kotlin.jvm.internal.j.d(v0_1, "substring(...)");
        return v0_1;
    }

    public static final boolean c(int p2, int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        int v0_1 = (p2 + 2);
        if ((v0_1 >= p3) || ((p4.charAt(p2) != 37) || ((okhttp3.internal._UtilCommonKt.k(p4.charAt((p2 + 1))) == -1) || (okhttp3.internal._UtilCommonKt.k(p4.charAt(v0_1)) == -1)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String d(int p8, int p9, int p10, String p11)
    {
        int v1 = 0;
        if ((p10 & 1) != 0) {
            p8 = 0;
        }
        if ((p10 & 2) != 0) {
            p9 = p11.length();
        }
        if ((p10 & 4) == 0) {
            v1 = 1;
        }
        kotlin.jvm.internal.j.e(p11, "<this>");
        int v10_2 = p8;
        while (v10_2 < p9) {
            x8.g v0_1 = p11.charAt(v10_2);
            if ((v0_1 != 37) && ((v0_1 != 43) || (v1 == 0))) {
                v10_2++;
            } else {
                x8.g v0_3 = new x8.g();
                v0_3.R(p8, v10_2, p11);
                while (v10_2 < p9) {
                    int v8_3 = p11.codePointAt(v10_2);
                    if (v8_3 != 37) {
                        if ((v8_3 == 43) && (v1 != 0)) {
                            v0_3.M(32);
                            v10_2++;
                        }
                    } else {
                        int v4 = (v10_2 + 2);
                        if (v4 >= p9) {
                        } else {
                            int v5_2 = okhttp3.internal._UtilCommonKt.k(p11.charAt((v10_2 + 1)));
                            int v6_1 = okhttp3.internal._UtilCommonKt.k(p11.charAt(v4));
                            if ((v5_2 != -1) && (v6_1 != -1)) {
                                v0_3.M(((v5_2 << 4) + v6_1));
                                v10_2 = (Character.charCount(v8_3) + v4);
                            }
                        }
                    }
                    v0_3.T(v8_3);
                    v10_2 += Character.charCount(v8_3);
                }
                return v0_3.G();
            }
        }
        int v8_1 = p11.substring(p8, p9);
        kotlin.jvm.internal.j.d(v8_1, "substring(...)");
        return v8_1;
    }
}
