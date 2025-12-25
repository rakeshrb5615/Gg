package okhttp3.internal.cache;
public final class CacheInterceptor implements okhttp3.Interceptor {
    public static final okhttp3.internal.cache.CacheInterceptor$Companion a;

    static CacheInterceptor()
    {
        okhttp3.internal.cache.CacheInterceptor.a = new okhttp3.internal.cache.CacheInterceptor$Companion(0);
        return;
    }

    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain p33)
    {
        boolean v27_2;
        String v1_0 = p33.a;
        System.currentTimeMillis();
        okhttp3.Response$Builder v2_0 = p33.e;
        boolean v3_5 = new okhttp3.internal.cache.CacheStrategy(v2_0, 0);
        int v5_38 = v2_0.f;
        if (v5_38 != 0) {
            v27_2 = v3_5;
        } else {
            okhttp3.Headers$Builder v7_0 = v2_0.c;
            okhttp3.CacheControl.n.getClass();
            kotlin.jvm.internal.j.e(v7_0, "headers");
            int v5_2 = v7_0.size();
            boolean v12_1 = 0;
            String v10_3 = 0;
            boolean v11_1 = 1;
            String v13_6 = 0;
            int v14_1 = 0;
            int v15_4 = -1;
            int v16 = -1;
            int v17 = 0;
            int v18 = 0;
            int v19 = 0;
            int v20 = -1;
            int v21 = -1;
            int v22 = 0;
            int v23 = 0;
            int v24 = 0;
            while (v10_3 < v5_2) {
                String v6_2 = v7_0.c(v10_3);
                int v8_1 = v7_0.e(v10_3);
                if (!v6_2.equalsIgnoreCase("Cache-Control")) {
                    if (v6_2.equalsIgnoreCase("Pragma")) {
                        v11_1 = 0;
                        int v4_9 = 0;
                        while (v4_9 < v8_1.length()) {
                            String v6_4 = v8_1.length();
                            int v9_2 = v4_9;
                            while (v9_2 < v6_4) {
                                boolean v27_1 = v3_5;
                                String v28_1 = v5_2;
                                if (!b8.i.r0("=,;", v8_1.charAt(v9_2))) {
                                    v9_2++;
                                    v3_5 = v27_1;
                                    v5_2 = v28_1;
                                }
                                String v6_12;
                                boolean v3_8 = v8_1.substring(v4_9, v9_2);
                                kotlin.jvm.internal.j.d(v3_8, "substring(...)");
                                boolean v3_10 = b8.i.H0(v3_8).toString();
                                if ((v9_2 != v8_1.length()) && ((v8_1.charAt(v9_2) != 44) && (v8_1.charAt(v9_2) != 59))) {
                                    int v9_3 = (v9_2 + 1);
                                    int v5_7 = v8_1.length();
                                    while (v9_3 < v5_7) {
                                        String v6_7 = v8_1.charAt(v9_3);
                                        if ((v6_7 == 32) || (v6_7 == 9)) {
                                            v9_3++;
                                        }
                                        if ((v9_3 >= v8_1.length()) || (v8_1.charAt(v9_3) != 34)) {
                                            int v5_12 = v8_1.length();
                                            String v6_9 = v9_3;
                                            while (v6_9 < v5_12) {
                                                String v30 = v6_9;
                                                if (!b8.i.r0(",;", v8_1.charAt(v6_9))) {
                                                    v6_9 = (v30 + 1);
                                                } else {
                                                    String v6_10 = v30;
                                                }
                                                int v5_15 = v8_1.substring(v9_3, v6_10);
                                                kotlin.jvm.internal.j.d(v5_15, "substring(...)");
                                                v6_12 = b8.i.H0(v5_15).toString();
                                                v4_9 = v6_10;
                                            }
                                            v6_10 = v8_1.length();
                                        } else {
                                            int v9_4 = (v9_3 + 1);
                                            int v5_17 = b8.i.v0(v8_1, 34, v9_4, 4);
                                            v6_12 = v8_1.substring(v9_4, v5_17);
                                            kotlin.jvm.internal.j.d(v6_12, "substring(...)");
                                            v4_9 = (v5_17 + 1);
                                        }
                                    }
                                    v9_3 = v8_1.length();
                                } else {
                                    v4_9 = (v9_2 + 1);
                                    v6_12 = 0;
                                }
                                if (!"no-cache".equalsIgnoreCase(v3_10)) {
                                    if (!"no-store".equalsIgnoreCase(v3_10)) {
                                        if (!"max-age".equalsIgnoreCase(v3_10)) {
                                            if (!"s-maxage".equalsIgnoreCase(v3_10)) {
                                                if (!"private".equalsIgnoreCase(v3_10)) {
                                                    if (!"public".equalsIgnoreCase(v3_10)) {
                                                        if (!"must-revalidate".equalsIgnoreCase(v3_10)) {
                                                            if (!"max-stale".equalsIgnoreCase(v3_10)) {
                                                                if (!"min-fresh".equalsIgnoreCase(v3_10)) {
                                                                    if (!"only-if-cached".equalsIgnoreCase(v3_10)) {
                                                                        if (!"no-transform".equalsIgnoreCase(v3_10)) {
                                                                            if ("immutable".equalsIgnoreCase(v3_10)) {
                                                                                v24 = 1;
                                                                            }
                                                                        } else {
                                                                            v23 = 1;
                                                                        }
                                                                    } else {
                                                                        v22 = 1;
                                                                    }
                                                                } else {
                                                                    v21 = okhttp3.internal._UtilCommonKt.n(-1, v6_12);
                                                                }
                                                            } else {
                                                                v20 = okhttp3.internal._UtilCommonKt.n(2147483647, v6_12);
                                                            }
                                                        } else {
                                                            v19 = 1;
                                                        }
                                                    } else {
                                                        v18 = 1;
                                                    }
                                                } else {
                                                    v17 = 1;
                                                }
                                            } else {
                                                v16 = okhttp3.internal._UtilCommonKt.n(-1, v6_12);
                                            }
                                        } else {
                                            v15_4 = okhttp3.internal._UtilCommonKt.n(-1, v6_12);
                                        }
                                    } else {
                                        v14_1 = 1;
                                    }
                                } else {
                                    v13_6 = 1;
                                }
                                v3_5 = v27_1;
                                v5_2 = v28_1;
                            }
                            v27_1 = v3_5;
                            v28_1 = v5_2;
                            v9_2 = v8_1.length();
                        }
                    }
                } else {
                    if (!v12_1) {
                        v12_1 = v8_1;
                    }
                }
                v10_3++;
            }
            int v25_1;
            v27_2 = v3_5;
            if (v11_1) {
                v25_1 = v12_1;
            } else {
                v25_1 = 0;
            }
            boolean v12_3 = new okhttp3.CacheControl(v13_6, v14_1, v15_4, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25_1);
            v2_0.f = v12_3;
            v5_38 = v12_3;
        }
        boolean v3_14;
        if (!v5_38.j) {
            v3_14 = v27_2;
        } else {
            v3_14 = new okhttp3.internal.cache.CacheStrategy(0, 0);
        }
        okhttp3.Response$Builder v2_3 = v1_0.d;
        if (v2_3 == null) {
            v2_3 = okhttp3.EventListener.a;
        }
        int v4_14 = v3_14.a;
        boolean v3_16 = v3_14.b;
        if ((v4_14 != 0) || (v3_16)) {
            if (v4_14 != 0) {
                if (v3_16) {
                    v2_3.a(v1_0, v3_16);
                }
                int v26_1;
                okhttp3.ResponseBody v0_9 = p33.b(v4_14);
                if (!v3_16) {
                    v26_1 = 0;
                } else {
                    if (v0_9.d != 304) {
                        v26_1 = 0;
                        okhttp3.internal._UtilCommonKt.b(v3_16.m);
                    } else {
                        okhttp3.Response$Builder v2_7 = v3_16.c();
                        int v4_17 = v3_16.f;
                        String v6_18 = v0_9.f;
                        okhttp3.internal.cache.CacheInterceptor.a.getClass();
                        okhttp3.Headers$Builder v7_3 = new okhttp3.Headers$Builder();
                        int v8_2 = v4_17.size();
                        int v9_1 = 0;
                        while (v9_1 < v8_2) {
                            String v13_5 = v4_17.c(v9_1);
                            int v14_0 = v4_17.e(v9_1);
                            if (((!"Warning".equalsIgnoreCase(v13_5)) || (!b8.p.p0(v14_0, "1"))) && (("Content-Length".equalsIgnoreCase(v13_5)) || (("Content-Encoding".equalsIgnoreCase(v13_5)) || (("Content-Type".equalsIgnoreCase(v13_5)) || ((!okhttp3.internal.cache.CacheInterceptor$Companion.a(v13_5)) || (v6_18.b(v13_5) == null)))))) {
                                v7_3.b(v13_5, v14_0);
                            }
                            v9_1++;
                        }
                        int v4_0 = v6_18.size();
                        int v8_0 = 0;
                        while (v8_0 < v4_0) {
                            int v9_0 = v6_18.c(v8_0);
                            if ((!"Content-Length".equalsIgnoreCase(v9_0)) && ((!"Content-Encoding".equalsIgnoreCase(v9_0)) && ((!"Content-Type".equalsIgnoreCase(v9_0)) && (okhttp3.internal.cache.CacheInterceptor$Companion.a(v9_0))))) {
                                v7_3.b(v9_0, v6_18.e(v8_0));
                            }
                            v8_0++;
                        }
                        v2_7.f = v7_3.c().d();
                        v2_7.l = v0_9.r;
                        v2_7.m = v0_9.s;
                        boolean v3_0 = okhttp3.internal.UnreadableResponseBodyKt.a(v3_16);
                        okhttp3.Response$Builder.b("cacheResponse", v3_0);
                        v2_7.j = v3_0;
                        boolean v3_1 = okhttp3.internal.UnreadableResponseBodyKt.a(v0_9);
                        okhttp3.Response$Builder.b("networkResponse", v3_1);
                        v2_7.i = v3_1;
                        v2_7.a();
                        v0_9.m.close();
                        kotlin.jvm.internal.j.b(0);
                        throw 0;
                    }
                }
                int v4_16;
                okhttp3.Response$Builder v2_6 = v0_9.c();
                if (!v3_16) {
                    v4_16 = v26_1;
                } else {
                    v4_16 = okhttp3.internal.UnreadableResponseBodyKt.a(v3_16);
                }
                okhttp3.Response$Builder.b("cacheResponse", v4_16);
                v2_6.j = v4_16;
                okhttp3.ResponseBody v0_10 = okhttp3.internal.UnreadableResponseBodyKt.a(v0_9);
                okhttp3.Response$Builder.b("networkResponse", v0_10);
                v2_6.i = v0_10;
                return v2_6.a();
            } else {
                kotlin.jvm.internal.j.b(v3_16);
                okhttp3.ResponseBody v0_2 = v3_16.c();
                boolean v3_2 = okhttp3.internal.UnreadableResponseBodyKt.a(v3_16);
                okhttp3.Response$Builder.b("cacheResponse", v3_2);
                v0_2.j = v3_2;
                okhttp3.ResponseBody v0_3 = v0_2.a();
                v2_3.b(v1_0, v0_3);
                return v0_3;
            }
        } else {
            boolean v3_4 = new okhttp3.Response$Builder();
            v3_4.a = p33.e;
            v3_4.b = okhttp3.Protocol.d;
            v3_4.c = 504;
            v3_4.d = "Unsatisfiable Request (only-if-cached)";
            v3_4.l = -1;
            v3_4.m = System.currentTimeMillis();
            okhttp3.ResponseBody v0_8 = v3_4.a();
            v2_3.D(v1_0, v0_8);
            return v0_8;
        }
    }
}
