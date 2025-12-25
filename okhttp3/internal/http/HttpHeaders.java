package okhttp3.internal.http;
public final class HttpHeaders {
    public static final x8.j a;
    public static final x8.j b;

    static HttpHeaders()
    {
        okhttp3.internal.http.HttpHeaders.a = v3.f.i("\"\\");
        okhttp3.internal.http.HttpHeaders.b = v3.f.i("\t ,=");
        return;
    }

    public static final boolean a(okhttp3.Response p4)
    {
        if (!kotlin.jvm.internal.j.a(p4.a.b, "HEAD")) {
            String v0_7 = p4.d;
            if ((((v0_7 >= 100) && (v0_7 < 200)) || ((v0_7 == 204) || (v0_7 == 304))) && (okhttp3.internal._UtilJvmKt.d(p4) == -1)) {
                boolean v4_2 = p4.f.b("Transfer-Encoding");
                if (!v4_2) {
                    v4_2 = 0;
                }
                if (!"chunked".equalsIgnoreCase(v4_2)) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static final void b(x8.g p18, java.util.ArrayList p19)
    {
        do {
            String v3 = 0;
            if (v3 != null) {
                okhttp3.Challenge v4_0 = okhttp3.internal.http.HttpHeaders.e(p18);
                i7.o v5_1 = okhttp3.internal.http.HttpHeaders.c(p18);
                if (v5_1 != null) {
                    String v6_1 = okhttp3.internal._UtilCommonKt.m(p18);
                    String v7_3 = okhttp3.internal.http.HttpHeaders.e(p18);
                    if ((v4_0 != null) || ((v7_3 == null) && (!p18.h()))) {
                        okhttp3.Challenge v4_5 = new java.util.LinkedHashMap();
                        String v7_5 = (okhttp3.internal._UtilCommonKt.m(p18) + v6_1);
                        do {
                            if (v5_1 != null) {
                                if (v7_5 != null) {
                                    if ((v7_5 <= 1) && (!okhttp3.internal.http.HttpHeaders.e(p18))) {
                                        if ((p18.h()) || (p18.A(0) != 34)) {
                                            String v6_9 = okhttp3.internal.http.HttpHeaders.c(p18);
                                        } else {
                                            if (p18.readByte() != 34) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            } else {
                                                String v6_12 = new x8.g();
                                                while(true) {
                                                    long v10_1 = p18.C(okhttp3.internal.http.HttpHeaders.a);
                                                    if (v10_1 != -1) {
                                                        if (p18.A(v10_1) == 34) {
                                                            break;
                                                        }
                                                        if (p18.b != (v10_1 + 1)) {
                                                            v6_12.k(p18, v10_1);
                                                            p18.readByte();
                                                            v6_12.k(p18, 1);
                                                        }
                                                    }
                                                    v6_9 = 0;
                                                }
                                                v6_12.k(p18, v10_1);
                                                p18.readByte();
                                                v6_9 = v6_12.G();
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                v5_1 = okhttp3.internal.http.HttpHeaders.c(p18);
                                if (!okhttp3.internal.http.HttpHeaders.e(p18)) {
                                    v7_5 = okhttp3.internal._UtilCommonKt.m(p18);
                                }
                            }
                            p19.add(new okhttp3.Challenge(v3, v4_5));
                            v3 = v5_1;
                            while(true) {
                            }
                        } while((v6_9 != null) && ((((String) v4_5.put(v5_1, v6_9)) == null) && ((okhttp3.internal.http.HttpHeaders.e(p18)) || (p18.h()))));
                        v5_1 = 0;
                    } else {
                        i7.o v5_0 = u.e.b(v5_1);
                        if (v6_1 < null) {
                            IllegalArgumentException v0_2 = new StringBuilder("Count \'n\' must be non-negative, but was ");
                            v0_2.append(v6_1);
                            v0_2.append(46);
                            throw new IllegalArgumentException(v0_2.toString().toString());
                        } else {
                            String v7_0;
                            if (v6_1 == null) {
                                v7_0 = "";
                            } else {
                                v7_0 = "=";
                                if (v6_1 != 1) {
                                    int v8_0 = 0;
                                    String v7_1 = "=".charAt(0);
                                    int v9_0 = new char[v6_1];
                                    while (v8_0 < v6_1) {
                                        v9_0[v8_0] = v7_1;
                                        v8_0++;
                                    }
                                    v7_0 = new String(v9_0);
                                }
                            }
                            v5_0.append(v7_0);
                            i7.o v5_3 = java.util.Collections.singletonMap(0, v5_0.toString());
                            kotlin.jvm.internal.j.d(v5_3, "singletonMap(...)");
                            p19.add(new okhttp3.Challenge(v3, v5_3));
                        }
                    }
                } else {
                }
            } else {
                okhttp3.internal.http.HttpHeaders.e(p18);
                v3 = okhttp3.internal.http.HttpHeaders.c(p18);
                if (v3 != null) {
                }
            }
            return;
        } while(p18.h());
        p19.add(new okhttp3.Challenge(v3, i7.o.a));
        return;
    }

    public static final String c(x8.g p4)
    {
        long v0_1 = p4.C(okhttp3.internal.http.HttpHeaders.b);
        if (v0_1 == -1) {
            v0_1 = p4.b;
        }
        if (v0_1 == 0) {
            return 0;
        } else {
            return p4.F(v0_1, b8.a.a);
        }
    }

    public static final void d(okhttp3.CookieJar p38, okhttp3.HttpUrl p39, okhttp3.Headers p40)
    {
        kotlin.jvm.internal.j.e(p38, "<this>");
        kotlin.jvm.internal.j.e(p39, "url");
        kotlin.jvm.internal.j.e(p40, "headers");
        if (p38 != okhttp3.CookieJar.a) {
            okhttp3.Cookie.k.getClass();
            String v3_1 = p40.size();
            String v5_0 = 0;
            int v6_3 = 0;
            int v7_0 = 0;
            while (v6_3 < v3_1) {
                if ("Set-Cookie".equalsIgnoreCase(p40.c(v6_3))) {
                    if (v7_0 == 0) {
                        v7_0 = new java.util.ArrayList(2);
                    }
                    v7_0.add(p40.e(v6_3));
                }
                v6_3++;
            }
            boolean v0_15;
            if (v7_0 == 0) {
                v0_15 = 0;
            } else {
                v0_15 = java.util.Collections.unmodifiableList(v7_0);
                kotlin.jvm.internal.j.d(v0_15, "unmodifiableList(...)");
            }
            int v7_1;
            int v6_6 = i7.n.a;
            if (v0_15) {
                v7_1 = v0_15;
            } else {
                v7_1 = v6_6;
            }
            int v8_0 = v7_1.size();
            int v9_0 = 0;
            java.util.ArrayList v10_1 = 0;
            while (v9_0 < v8_0) {
                int v40_1;
                int v36_1;
                boolean v0_12;
                String v14_1;
                String v11_1 = ((String) v7_1.get(v9_0));
                kotlin.jvm.internal.j.e(v11_1, "setCookie");
                long v12 = System.currentTimeMillis();
                String v14_19 = 59;
                boolean v0_36 = okhttp3.internal._UtilCommonKt.c(v11_1, 59, v5_0, v11_1.length());
                String v4_21 = okhttp3.internal._UtilCommonKt.c(v11_1, 61, v5_0, v0_36);
                if (v4_21 != v0_36) {
                    String v17 = okhttp3.internal._UtilCommonKt.o(v5_0, v4_21, v11_1);
                    if ((v17.length() != 0) && (okhttp3.internal._UtilCommonKt.f(v17) == -1)) {
                        String v18 = okhttp3.internal._UtilCommonKt.o((v4_21 + 1), v0_36, v11_1);
                        if (okhttp3.internal._UtilCommonKt.f(v18) == -1) {
                            boolean v0_31 = (v0_36 + 1);
                            String v4_19 = v11_1.length();
                            int v23_1 = -1;
                            long v29 = 253402300799999;
                            String v5_3 = 0;
                            boolean v15_0 = 0;
                            int v25_1 = 0;
                            int v26 = 1;
                            String v27_1 = 0;
                            String v28 = 0;
                            int v31 = 0;
                            while(true) {
                                long v32_0 = 9223372036854775807;
                                if (v0_31 >= v4_19) {
                                    break;
                                }
                                String v4_15;
                                int v36_0 = v6_6;
                                int v6_5 = okhttp3.internal._UtilCommonKt.c(v11_1, v14_19, v0_31, v4_19);
                                int v40_2 = v4_19;
                                String v4_14 = okhttp3.internal._UtilCommonKt.c(v11_1, 61, v0_31, v6_5);
                                boolean v0_14 = okhttp3.internal._UtilCommonKt.o(v0_31, v4_14, v11_1);
                                if (v4_14 >= v6_5) {
                                    v4_15 = "";
                                } else {
                                    v4_15 = okhttp3.internal._UtilCommonKt.o((v4_14 + 1), v6_5, v11_1);
                                }
                                try {
                                    if (!v0_14.equalsIgnoreCase("expires")) {
                                        if (!v0_14.equalsIgnoreCase("max-age")) {
                                            if (!v0_14.equalsIgnoreCase("domain")) {
                                                if (!v0_14.equalsIgnoreCase("path")) {
                                                    if (!v0_14.equalsIgnoreCase("secure")) {
                                                        if (!v0_14.equalsIgnoreCase("httponly")) {
                                                            if (v0_14.equalsIgnoreCase("samesite")) {
                                                                v28 = v4_15;
                                                            }
                                                        } else {
                                                            v25_1 = 1;
                                                        }
                                                    } else {
                                                        v31 = 1;
                                                    }
                                                } else {
                                                    v5_3 = v4_15;
                                                }
                                            } else {
                                                if (b8.p.l0(v4_15, ".", 0)) {
                                                    throw new IllegalArgumentException("Failed requirement.");
                                                } else {
                                                    boolean v0_20 = okhttp3.internal._HostnamesCommonKt.b(b8.i.D0(v4_15, "."));
                                                    if (!v0_20) {
                                                        throw new IllegalArgumentException();
                                                    } else {
                                                        v15_0 = v0_20;
                                                        v26 = 0;
                                                    }
                                                }
                                            }
                                        } else {
                                            try {
                                                v23_1 = Long.parseLong(v4_15);
                                                long v32_3 = 0;
                                            } catch (boolean v0_24) {
                                                String v14_18 = java.util.regex.Pattern.compile("-?\\d+");
                                                long v37 = v0_24;
                                                kotlin.jvm.internal.j.d(v14_18, "compile(...)");
                                                if (!v14_18.matcher(v4_15).matches()) {
                                                    throw v37;
                                                } else {
                                                    if (b8.p.p0(v4_15, "-")) {
                                                        v32_3 = -9223372036854775808;
                                                    }
                                                    v23_1 = v32_3;
                                                    v27_1 = 1;
                                                }
                                            }
                                            if (v23_1 > 0) {
                                            } else {
                                                v23_1 = -9223372036854775808;
                                            }
                                        }
                                    } else {
                                        v29 = okhttp3.Cookie$Companion.b(v4_15.length(), v4_15);
                                    }
                                    v0_31 = (v6_5 + 1);
                                    v4_19 = v40_2;
                                    v6_6 = v36_0;
                                    v14_19 = 59;
                                } catch (NumberFormatException) {
                                }
                            }
                            boolean v19_0;
                            v36_1 = v6_6;
                            if (v23_1 != -9223372036854775808) {
                                if (v23_1 == -1) {
                                    v40_1 = v7_1;
                                    v19_0 = v29;
                                } else {
                                    if (v23_1 > 9223372036854775) {
                                        v40_1 = v7_1;
                                    } else {
                                        v40_1 = v7_1;
                                        v32_0 = (v23_1 * ((long) 1000));
                                    }
                                    long v32_1 = (v12 + v32_0);
                                    if ((v32_1 >= v12) && (v32_1 <= 253402300799999)) {
                                        v19_0 = v32_1;
                                    } else {
                                        v19_0 = 253402300799999;
                                    }
                                }
                            } else {
                                v40_1 = v7_1;
                                v19_0 = -9223372036854775808;
                            }
                            okhttp3.Cookie v16_1;
                            boolean v0_6 = p39.d;
                            if (v15_0) {
                                if (!kotlin.jvm.internal.j.a(v0_6, v15_0)) {
                                    if ((!b8.p.l0(v0_6, v15_0, 0)) || (v0_6.charAt(((v0_6.length() - v15_0.length()) - 1)) != 46)) {
                                        v14_1 = 0;
                                        v16_1 = 0;
                                    } else {
                                        String v4_6 = okhttp3.internal._HostnamesCommonKt.a;
                                        v4_6.getClass();
                                        if (v4_6.a.matcher(v0_6).matches()) {
                                        } else {
                                            if (v0_6.length() != v15_0.length()) {
                                                okhttp3.internal.publicsuffix.PublicSuffixDatabase.b.getClass();
                                                if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.e.a(v15_0) == null) {
                                                }
                                            }
                                            boolean v0_11 = "/";
                                            if ((v5_3 != null) && (b8.p.p0(v5_3, "/"))) {
                                                v14_1 = 0;
                                            } else {
                                                String v4_12 = p39.b();
                                                v14_1 = 0;
                                                String v5_2 = b8.i.z0(v4_12, 47, 0, 6);
                                                if (v5_2 != null) {
                                                    v0_11 = v4_12.substring(0, v5_2);
                                                    kotlin.jvm.internal.j.d(v0_11, "substring(...)");
                                                }
                                                v5_3 = v0_11;
                                            }
                                            v16_1 = new okhttp3.Cookie(v17, v18, v19_0, v15_0, v5_3, v31, v25_1, v27_1, v26, v28);
                                        }
                                    }
                                }
                            } else {
                                v15_0 = v0_6;
                            }
                            v0_12 = v16_1;
                        } else {
                            v36_1 = v6_6;
                            v40_1 = v7_1;
                            v0_12 = 0;
                            v14_1 = 0;
                        }
                    }
                }
                if (v0_12) {
                    if (v10_1 == null) {
                        v10_1 = new java.util.ArrayList();
                    }
                    v10_1.add(v0_12);
                }
                v9_0++;
                v7_1 = v40_1;
                v5_0 = v14_1;
                v6_6 = v36_1;
            }
            String v4_20;
            int v36_2 = v6_6;
            if (v10_1 == null) {
                v4_20 = 0;
            } else {
                v4_20 = java.util.Collections.unmodifiableList(v10_1);
                kotlin.jvm.internal.j.d(v4_20, "unmodifiableList(...)");
            }
            int v6_7;
            if (v4_20 != null) {
                v6_7 = v4_20;
            } else {
                v6_7 = v36_2;
            }
            if (!v6_7.isEmpty()) {
                p38.b(p39, v6_7);
                return;
            }
        }
        return;
    }

    public static final boolean e(x8.g p3)
    {
        int v0 = 0;
        while (!p3.h()) {
            byte v1_2 = p3.A(0);
            if (v1_2 != 44) {
                if ((v1_2 != 32) && (v1_2 != 9)) {
                    break;
                }
                p3.readByte();
            } else {
                p3.readByte();
                v0 = 1;
            }
        }
        return v0;
    }
}
