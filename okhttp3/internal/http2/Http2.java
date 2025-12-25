package okhttp3.internal.http2;
public final class Http2 {
    public static final okhttp3.internal.http2.Http2 a;
    public static final x8.j b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;

    static Http2()
    {
        okhttp3.internal.http2.Http2.a = new okhttp3.internal.http2.Http2();
        okhttp3.internal.http2.Http2.b = v3.f.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        String v3 = "PRIORITY";
        int v5 = "SETTINGS";
        String[] v7 = "PING";
        okhttp3.internal.http2.Http2.c = new String[] {"DATA", "CONTINUATION"});
        int v0_4 = new String[64];
        okhttp3.internal.http2.Http2.d = v0_4;
        String[] v1_1 = new String[256];
        int v2 = 0;
        String v3_1 = 0;
        while (v3_1 < 256) {
            int v5_0 = Integer.toBinaryString(v3_1);
            kotlin.jvm.internal.j.d(v5_0, "toBinaryString(...)");
            String v4_0 = okhttp3.internal._UtilJvmKt.c("%8s", new Object[] {v5_0})).replace(32, 48);
            kotlin.jvm.internal.j.d(v4_0, "replace(...)");
            v1_1[v3_1] = v4_0;
            v3_1++;
        }
        okhttp3.internal.http2.Http2.e = v1_1;
        int v0_6 = okhttp3.internal.http2.Http2.d;
        v0_6[0] = "";
        v0_6[1] = "END_STREAM";
        String[] v1_4 = new int[] {1});
        v0_6[8] = "PADDED";
        String v3_4 = v1_4[0];
        v0_6[(v3_4 | 8)] = v1.a.n(new StringBuilder(), v0_6[v3_4], "|PADDED");
        v0_6[4] = "END_HEADERS";
        v0_6[32] = "PRIORITY";
        v0_6[36] = "END_HEADERS|PRIORITY";
        String v3_0 = 0;
        while (v3_0 < 3) {
            String v4_3 = new int[] {4, 32, 36})[v3_0];
            String v6_5 = v1_4[0];
            String[] v7_3 = okhttp3.internal.http2.Http2.d;
            int v9_0 = (v6_5 | v4_3);
            StringBuilder v10_1 = new StringBuilder();
            v10_1.append(v7_3[v6_5]);
            v10_1.append(124);
            v10_1.append(v7_3[v4_3]);
            v7_3[v9_0] = v10_1.toString();
            int v9_1 = (v9_0 | 8);
            StringBuilder v10_5 = new StringBuilder();
            v10_5.append(v7_3[v6_5]);
            v10_5.append(124);
            v7_3[v9_1] = v1.a.n(v10_5, v7_3[v4_3], "|PADDED");
            v3_0++;
        }
        while (v2 < okhttp3.internal.http2.Http2.d.length) {
            String[] v1_5 = okhttp3.internal.http2.Http2.d;
            if (v1_5[v2] == null) {
                v1_5[v2] = okhttp3.internal.http2.Http2.e[v2];
            }
            v2++;
        }
        return;
    }

    private Http2()
    {
        return;
    }

    public static String a(int p2)
    {
        String v0_0 = okhttp3.internal.http2.Http2.c;
        if (p2 >= v0_0.length) {
            return okhttp3.internal._UtilJvmKt.c("0x%02x", new Object[] {Integer.valueOf(p2)}));
        } else {
            return v0_0[p2];
        }
    }

    public static String b(boolean p4, int p5, int p6, int p7, int p8)
    {
        String v7_2;
        String v0 = okhttp3.internal.http2.Http2.a(p7);
        if (p8 != null) {
            int v2_2 = okhttp3.internal.http2.Http2.e;
            if ((p7 != 2) && (p7 != 3)) {
                if ((p7 == 4) || (p7 == 6)) {
                    if (p8 != 1) {
                        v7_2 = v2_2[p8];
                    } else {
                        v7_2 = "ACK";
                    }
                    String v4_1;
                    if (p4 == null) {
                        v4_1 = ">>";
                    } else {
                        v4_1 = "<<";
                    }
                    return okhttp3.internal._UtilJvmKt.c("%s 0x%08x %5d %-13s %s", new Object[] {v4_1, Integer.valueOf(p5), Integer.valueOf(p6), v0, v7_2}));
                } else {
                    if ((p7 != 7) && (p7 != 8)) {
                        String v1_4;
                        String v1_3 = okhttp3.internal.http2.Http2.d;
                        if (p8 >= v1_3.length) {
                            v1_4 = v2_2[p8];
                        } else {
                            v1_4 = v1_3[p8];
                            kotlin.jvm.internal.j.b(v1_4);
                        }
                        if ((p7 != 5) || ((p8 & 4) == 0)) {
                            if ((p7 != null) || ((p8 & 32) == 0)) {
                                v7_2 = v1_4;
                            } else {
                                v7_2 = b8.p.n0(v1_4, "PRIORITY", "COMPRESSED");
                            }
                        } else {
                            v7_2 = b8.p.n0(v1_4, "HEADERS", "PUSH_PROMISE");
                        }
                    }
                }
            }
            v7_2 = v2_2[p8];
        } else {
            v7_2 = "";
        }
    }

    public static String c(boolean p1, int p2, int p3, long p4)
    {
        String v1_3;
        String v0_1 = okhttp3.internal.http2.Http2.a(8);
        if (p1 == null) {
            v1_3 = ">>";
        } else {
            v1_3 = "<<";
        }
        return okhttp3.internal._UtilJvmKt.c("%s 0x%08x %5d %-13s %d", new Object[] {v1_3, Integer.valueOf(p2), Integer.valueOf(p3), v0_1, Long.valueOf(p4)}));
    }
}
