package okhttp3.logging;
public final class HttpLoggingInterceptor implements okhttp3.Interceptor {
    public final okhttp3.logging.HttpLoggingInterceptor$Logger a;
    public volatile i7.p b;
    public volatile i7.p c;
    public volatile okhttp3.logging.HttpLoggingInterceptor$Level d;

    static HttpLoggingInterceptor()
    {
        new okhttp3.logging.HttpLoggingInterceptor$Companion(0);
        return;
    }

    public HttpLoggingInterceptor()
    {
        okhttp3.logging.HttpLoggingInterceptor$Level v0_0 = okhttp3.logging.HttpLoggingInterceptor$Logger.a;
        kotlin.jvm.internal.j.e(v0_0, "logger");
        this.a = v0_0;
        okhttp3.logging.HttpLoggingInterceptor$Level v0_1 = i7.p.a;
        this.b = v0_1;
        this.c = v0_1;
        this.d = okhttp3.logging.HttpLoggingInterceptor$Level.a;
        return;
    }

    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain p27)
    {
        String v2_3 = this.d;
        String v3_3 = p27.e;
        if (v2_3 != okhttp3.logging.HttpLoggingInterceptor$Level.a) {
            StringBuilder v4_0;
            StringBuilder v6_0 = 1;
            if (v2_3 != okhttp3.logging.HttpLoggingInterceptor$Level.c) {
                v4_0 = 0;
            } else {
                v4_0 = 1;
            }
            if ((v4_0 == null) && (v2_3 != okhttp3.logging.HttpLoggingInterceptor$Level.b)) {
                v6_0 = 0;
            }
            StringBuilder v7_2;
            String v2_1 = v3_3.d;
            StringBuilder v7_1 = p27.d;
            if (v7_1 == null) {
                v7_2 = 0;
            } else {
                v7_2 = v7_1.c();
            }
            StringBuilder v7_5;
            StringBuilder v9_5 = new StringBuilder("--> ");
            v9_5.append(v3_3.b);
            v9_5.append(32);
            String v10_3 = v3_3.a;
            kotlin.jvm.internal.j.e(v10_3, "url");
            this.c.getClass();
            v9_5.append(v10_3.i);
            if (v7_2 == null) {
                v7_5 = "";
            } else {
                boolean v13_7 = new StringBuilder(" ");
                v13_7.append(v7_2.m);
                v7_5 = v13_7.toString();
            }
            int v16;
            v9_5.append(v7_5);
            StringBuilder v7_9 = v9_5.toString();
            if ((v6_0 != null) || (v2_1 == null)) {
                v16 = v6_0;
            } else {
                String v14_1 = new StringBuilder();
                v14_1.append(v7_9);
                v14_1.append(" (");
                v16 = v6_0;
                v14_1.append(v2_1.a());
                v14_1.append("-byte body)");
                v7_9 = v14_1.toString();
            }
            long v20;
            String v15_0;
            int v19;
            String v21;
            this.a.a(v7_9);
            if (v16 == 0) {
                v19 = v4_0;
                v20 = "url";
                v21 = " ";
                v15_0 = " (";
            } else {
                long v8_27 = v3_3.c;
                if (v2_1 == null) {
                    v19 = v4_0;
                    v20 = "url";
                    v21 = " ";
                    v15_0 = " (";
                } else {
                    String v15_1 = v2_1.b();
                    v19 = v4_0;
                    if ((v15_1 == null) || (v8_27.b("Content-Type") != null)) {
                        v20 = "url";
                        v21 = " ";
                    } else {
                        StringBuilder v4_53 = this.a;
                        v20 = "url";
                        v21 = " ";
                        String v11_33 = new StringBuilder("Content-Type: ");
                        v11_33.append(v15_1);
                        v4_53.a(v11_33.toString());
                    }
                    if ((v2_1.a() == -1) || (v8_27.b("Content-Length") != null)) {
                    } else {
                        StringBuilder v4_4 = this.a;
                        String v11_2 = new StringBuilder("Content-Length: ");
                        v15_0 = " (";
                        v11_2.append(v2_1.a());
                        v4_4.a(v11_2.toString());
                    }
                }
                StringBuilder v4_5 = v8_27.size();
                String v11_4 = 0;
                while (v11_4 < v4_5) {
                    this.b(v8_27, v11_4);
                    v11_4++;
                }
                if ((v19 != 0) && (v2_1 != null)) {
                    String v11_6 = v3_3.c.b("Content-Encoding");
                    if ((v11_6 == null) || ((v11_6.equalsIgnoreCase("identity")) || (v11_6.equalsIgnoreCase("gzip")))) {
                        if (!v2_1.c()) {
                            long v8_4;
                            String v11_10 = new x8.g();
                            v2_1.d(v11_10);
                            if (!"gzip".equalsIgnoreCase(v8_27.b("Content-Encoding"))) {
                                v8_4 = 0;
                            } else {
                                v8_4 = Long.valueOf(v11_10.b);
                                long v12_5 = new x8.r(v11_10);
                                try {
                                    v11_10 = new x8.g();
                                    v11_10.L(v12_5);
                                    v12_5.close();
                                } catch (Throwable v0_1) {
                                    String v2_2 = v0_1;
                                    try {
                                        throw v2_2;
                                    } catch (Throwable v0_2) {
                                        j5.t1.f(v12_5, v2_2);
                                        throw v0_2;
                                    }
                                }
                            }
                            long v12_7 = okhttp3.internal.Internal.a(v2_1.b());
                            this.a.a("");
                            if (okhttp3.internal.IsProbablyUtf8Kt.a(v11_10)) {
                                if (v8_4 == 0) {
                                    this.a.a(v11_10.v(v12_7));
                                    long v8_6 = this.a;
                                    String v11_14 = new StringBuilder("--> END ");
                                    v11_14.append(v3_3.b);
                                    v11_14.append(v15_0);
                                    v11_14.append(v2_1.a());
                                    v11_14.append("-byte body)");
                                    v8_6.a(v11_14.toString());
                                } else {
                                    String v2_5 = this.a;
                                    StringBuilder v9_1 = new StringBuilder("--> END ");
                                    v9_1.append(v3_3.b);
                                    v9_1.append(v15_0);
                                    v9_1.append(v11_10.b);
                                    v9_1.append("-byte, ");
                                    v9_1.append(v8_4.longValue());
                                    v9_1.append("-gzipped-byte body)");
                                    v2_5.a(v9_1.toString());
                                }
                            } else {
                                long v8_7 = this.a;
                                StringBuilder v9_4 = new StringBuilder("--> END ");
                                v9_4.append(v3_3.b);
                                v9_4.append(" (binary ");
                                v9_4.append(v2_1.a());
                                v9_4.append("-byte body omitted)");
                                v8_7.a(v9_4.toString());
                            }
                        } else {
                            String v2_7 = this.a;
                            long v8_9 = new StringBuilder("--> END ");
                            v8_9.append(v3_3.b);
                            v8_9.append(" (one-shot body omitted)");
                            v2_7.a(v8_9.toString());
                        }
                    } else {
                        String v2_0 = this.a;
                        long v8_1 = new StringBuilder("--> END ");
                        v8_1.append(v3_3.b);
                        v8_1.append(" (encoded body omitted)");
                        v2_0.a(v8_1.toString());
                    }
                } else {
                    String v2_8 = this.a;
                    long v8_11 = new StringBuilder("--> END ");
                    v8_11.append(v3_3.b);
                    v2_8.a(v8_11.toString());
                }
            }
            long v8_12 = System.nanoTime();
            try {
                boolean v13_3;
                Throwable v0_3 = p27.b(v3_3);
                String v3_1 = (System.nanoTime() - v8_12);
                String v2_10 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(v3_1);
                StringBuilder v4_22 = v0_3.m;
                kotlin.jvm.internal.j.b(v4_22);
                String v11_18 = v4_22.c();
                okhttp3.ResponseBody v17_0 = v4_22;
            } catch (Throwable v0_4) {
                String v2_11 = v20;
                long v12_9 = v21;
                StringBuilder v4_25 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - v8_12));
                StringBuilder v6_1 = this.a;
                StringBuilder v7_4 = new StringBuilder();
                long v8_14 = new StringBuilder("<-- HTTP FAILED: ");
                v8_14.append(v0_4);
                v8_14.append(46);
                v7_4.append(v8_14.toString());
                long v8_17 = new StringBuilder(v12_9);
                String v3_2 = v3_1.a;
                kotlin.jvm.internal.j.e(v3_2, v2_11);
                this.c.getClass();
                v8_17.append(v3_2.i);
                v8_17.append(v15_0);
                v8_17.append(v4_25);
                v8_17.append("ms)");
                v7_4.append(v8_17.toString());
                v6_1.a(v7_4.toString());
                throw v0_4;
            }
            if (v11_18 == -1) {
                v13_3 = "unknown-length";
            } else {
                boolean v13_5 = new StringBuilder();
                v13_5.append(v11_18);
                v13_5.append("-byte");
                v13_3 = v13_5.toString();
            }
            String v27_1;
            long v12_13;
            StringBuilder v22_1 = v8_12;
            long v8_18 = this.a;
            StringBuilder v9_9 = new StringBuilder();
            int v24 = v11_18;
            String v11_21 = new StringBuilder("<-- ");
            v11_21.append(v0_3.d);
            v9_9.append(v11_21.toString());
            if (v0_3.c.length() <= 0) {
                v27_1 = "-byte";
                v12_13 = v21;
            } else {
                v12_13 = v21;
                String v11_26 = new StringBuilder(v12_13);
                v27_1 = "-byte";
                v11_26.append(v0_3.c);
                v9_9.append(v11_26.toString());
            }
            StringBuilder v4_29 = new StringBuilder(v12_13);
            String v11_28 = v0_3.a.a;
            kotlin.jvm.internal.j.e(v11_28, v20);
            this.c.getClass();
            v4_29.append(v11_28.i);
            v4_29.append(v15_0);
            v4_29.append(v2_10);
            v4_29.append("ms");
            v9_9.append(v4_29.toString());
            if (v16 == 0) {
                String v3_5 = new StringBuilder(", ");
                v3_5.append(v13_3);
                v3_5.append(" body");
                v9_9.append(v3_5.toString());
            }
            v9_9.append(")");
            v8_18.a(v9_9.toString());
            if (v16 != 0) {
                String v3_9 = v0_3.f;
                StringBuilder v4_31 = v3_9.size();
                long v8_19 = 0;
                while (v8_19 < v4_31) {
                    this.b(v3_9, v8_19);
                    v8_19++;
                }
                if ((v19 != 0) && (okhttp3.internal.http.HttpHeaders.a(v0_3))) {
                    StringBuilder v4_34 = v0_3.f.b("Content-Encoding");
                    if ((v4_34 == null) || ((v4_34.equalsIgnoreCase("identity")) || (v4_34.equalsIgnoreCase("gzip")))) {
                        StringBuilder v4_38 = v0_3.m.f();
                        if ((v4_38 == null) || ((!v4_38.b.equals("text")) || (!v4_38.c.equals("event-stream")))) {
                            String v3_13;
                            StringBuilder v4_41 = v17_0.i();
                            v4_41.request(9223372036854775807);
                            long v8_24 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - v22_1));
                            StringBuilder v4_42 = v4_41.a();
                            if (!"gzip".equalsIgnoreCase(v3_9.b("Content-Encoding"))) {
                                v3_13 = 0;
                            } else {
                                v3_13 = Long.valueOf(v4_42.b);
                                okhttp3.logging.HttpLoggingInterceptor$Logger v5_8 = new x8.r(v4_42.x());
                                try {
                                    v4_42 = new x8.g();
                                    v4_42.L(v5_8);
                                    v5_8.close();
                                } catch (Throwable v0_5) {
                                    String v2_21 = v0_5;
                                    try {
                                        throw v2_21;
                                    } catch (Throwable v0_6) {
                                        j5.t1.f(v5_8, v2_21);
                                        throw v0_6;
                                    }
                                }
                            }
                            okhttp3.logging.HttpLoggingInterceptor$Logger v5_10 = okhttp3.internal.Internal.a(v17_0.f());
                            if (okhttp3.internal.IsProbablyUtf8Kt.a(v4_42)) {
                                if (v24 != 0) {
                                    this.a.a("");
                                    this.a.a(v4_42.x().v(v5_10));
                                }
                                okhttp3.logging.HttpLoggingInterceptor$Logger v5_12 = this.a;
                                StringBuilder v6_7 = new StringBuilder();
                                StringBuilder v7_11 = new StringBuilder("<-- END HTTP (");
                                v7_11.append(v8_24);
                                v7_11.append("ms, ");
                                v7_11.append(v4_42.b);
                                v7_11.append(v27_1);
                                v6_7.append(v7_11.toString());
                                if (v3_13 != null) {
                                    StringBuilder v4_48 = new StringBuilder(", ");
                                    v4_48.append(v3_13.longValue());
                                    v4_48.append("-gzipped-byte");
                                    v6_7.append(v4_48.toString());
                                }
                                v6_7.append(" body)");
                                v5_12.a(v6_7.toString());
                                return v0_3;
                            } else {
                                this.a.a("");
                                String v2_28 = this.a;
                                String v3_15 = new StringBuilder("<-- END HTTP (");
                                v3_15.append(v8_24);
                                v3_15.append("ms, binary ");
                                v3_15.append(v4_42.b);
                                v3_15.append("-byte body omitted)");
                                v2_28.a(v3_15.toString());
                                return v0_3;
                            }
                        } else {
                            this.a.a("<-- END HTTP (streaming)");
                            return v0_3;
                        }
                    } else {
                        this.a.a("<-- END HTTP (encoded body omitted)");
                        return v0_3;
                    }
                } else {
                    this.a.a("<-- END HTTP");
                }
            }
            return v0_3;
        } else {
            return p27.b(v3_3);
        }
    }

    public final void b(okhttp3.Headers p4, int p5)
    {
        String v0_0 = this.b;
        p4.c(p5);
        v0_0.getClass();
        String v0_1 = p4.e(p5);
        okhttp3.logging.HttpLoggingInterceptor$Logger v1 = this.a;
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append(p4.c(p5));
        v2_1.append(": ");
        v2_1.append(v0_1);
        v1.a(v2_1.toString());
        return;
    }
}
