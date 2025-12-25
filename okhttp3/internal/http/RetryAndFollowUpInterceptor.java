package okhttp3.internal.http;
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {
    public final okhttp3.OkHttpClient a;

    static RetryAndFollowUpInterceptor()
    {
        new okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion(0);
        return;
    }

    public RetryAndFollowUpInterceptor(okhttp3.OkHttpClient p1)
    {
        this.a = p1;
        return;
    }

    public static int d(okhttp3.Response p1, int p2)
    {
        int v1_5 = p1.f.b("Retry-After");
        if (v1_5 == 0) {
            v1_5 = 0;
        }
        if (v1_5 != 0) {
            String v2_5 = java.util.regex.Pattern.compile("\\d+");
            kotlin.jvm.internal.j.d(v2_5, "compile(...)");
            if (!v2_5.matcher(v1_5).matches()) {
                return 2147483647;
            } else {
                int v1_3 = Integer.valueOf(v1_5);
                kotlin.jvm.internal.j.d(v1_3, "valueOf(...)");
                return v1_3.intValue();
            }
        } else {
            return p2;
        }
    }

    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain p36)
    {
        okhttp3.internal.connection.RealCall v14 = p36.a;
        i7.n v3_5 = i7.n.a;
        int v5_0 = 1;
        okhttp3.Request v15 = p36.e;
        int v18 = 0;
        java.net.ProtocolException v0_0 = 1;
        Throwable v17 = 0;
        while (v14.q == null) {
            try {
                if (v14.s) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                } else {
                    if ((v14.r) || ((v14.u) || (v14.t))) {
                        throw new IllegalStateException("Check failed.");
                    } else {
                        i7.n v34;
                        if (v0_0 == null) {
                            v34 = v3_5;
                        } else {
                            javax.net.ssl.SSLSocketFactory v27;
                            okhttp3.CertificatePinner v29;
                            okhttp3.internal.tls.OkHostnameVerifier v28;
                            java.net.ProtocolException v0_21 = v14.a;
                            String v4_13 = v0_21.z;
                            int v5_1 = v14.c;
                            i7.n v6_8 = v0_21.w;
                            int v7_4 = v0_21.x;
                            int v8_3 = p36.f;
                            okhttp3.Address v12_1 = v3_5;
                            int v9_1 = p36.g;
                            boolean v10_1 = v0_21.e;
                            int v19 = v5_0;
                            boolean v11_1 = v0_21.f;
                            okhttp3.internal.connection.RouteDatabase v13_1 = v15.a;
                            kotlin.jvm.internal.j.e(v13_1, "url");
                            if (!kotlin.jvm.internal.j.a(v13_1.a, "https")) {
                                v27 = 0;
                                v28 = 0;
                                v29 = 0;
                            } else {
                                i7.n v3_19 = v0_21.o;
                                if (v3_19 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                } else {
                                    v29 = v0_21.t;
                                    v28 = v0_21.s;
                                    v27 = v3_19;
                                }
                            }
                            String v4_3;
                            v34 = v12_1;
                            i7.n v3_1 = new okhttp3.internal.connection.RealRoutePlanner(v4_13, v5_1, v6_8, v7_4, v8_3, v9_1, v10_1, v11_1, new okhttp3.Address(v13_1.d, v13_1.e, v0_21.k, v0_21.n, v27, v28, v29, v0_21.m, v0_21.r, v0_21.q, v0_21.l), v14.a.y, v14, v15);
                            java.net.ProtocolException v0_2 = v14.a;
                            if (!v0_2.f) {
                                v4_3 = new okhttp3.internal.connection.SequentialExchangeFinder(v3_1);
                            } else {
                                v4_3 = new okhttp3.internal.connection.FastFallbackExchangeFinder(v3_1, v0_2.z);
                            }
                            v14.n = v4_3;
                        }
                        try {
                            int v8_0;
                            if (v14.w) {
                                v8_0 = 1;
                                throw new java.io.IOException("Canceled");
                            } else {
                                i7.n v3_9;
                                java.net.ProtocolException v0_11 = p36.b(v15).c();
                                v0_11.a = v15;
                                try {
                                    if (v17 == null) {
                                        v3_9 = 0;
                                    } else {
                                        v3_9 = okhttp3.internal.UnreadableResponseBodyKt.a(v17);
                                    }
                                    v0_11.k = v3_9;
                                    java.net.ProtocolException v0_12 = v0_11.a();
                                    v15 = this.b(v0_12, v14.q);
                                    if (v15 != null) {
                                        int v7_1 = 0;
                                        i7.n v3_11 = v15.d;
                                        if ((v3_11 == null) || (!v3_11.c())) {
                                            okhttp3.internal._UtilCommonKt.b(v0_12.m);
                                            i7.n v3_14 = (v18 + 1);
                                            if (v3_14 > 20) {
                                                v8_0 = 1;
                                                v14.d.p(v14, v0_12);
                                                String v2_7 = new StringBuilder();
                                                v2_7.append("Too many follow-up requests: ");
                                                v2_7.append(v3_14);
                                                throw new java.net.ProtocolException(v2_7.toString());
                                            } else {
                                                v14.d.p(v14, v0_12);
                                                v14.e(1);
                                                v17 = v0_12;
                                                v18 = v3_14;
                                                v0_0 = 1;
                                                v5_0 = 1;
                                                v3_5 = v34;
                                            }
                                        } else {
                                            try {
                                                v14.d.p(v14, v0_12);
                                                v14.e(0);
                                                return v0_12;
                                            } catch (java.net.ProtocolException v0_13) {
                                            }
                                        }
                                    } else {
                                        try {
                                            v14.d.p(v14, v0_12);
                                            v14.e(0);
                                            return v0_12;
                                        } catch (java.net.ProtocolException v0_13) {
                                            v7_1 = 0;
                                        }
                                    }
                                    String v4_9 = v7_1;
                                } catch (java.net.ProtocolException v0_13) {
                                    v4_9 = 1;
                                }
                            }
                            v14.e(v4_9);
                            throw v0_13;
                        } catch (java.net.ProtocolException v0_13) {
                            v8_0 = 1;
                            v4_9 = v8_0;
                        }
                    }
                }
            } catch (java.net.ProtocolException v0_20) {
                throw v0_20;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final okhttp3.Request b(okhttp3.Response p12, okhttp3.internal.connection.Exchange p13)
    {
        int v1_3;
        okhttp3.RequestBody v0_0 = 0;
        if (p13 == null) {
            v1_3 = 0;
        } else {
            v1_3 = p13.c().c;
        }
        String v2_11 = p12.d;
        okhttp3.Request v3_2 = p12.a;
        String v4 = v3_2.b;
        int v5 = 0;
        if ((v2_11 == 307) || (v2_11 == 308)) {
            int v1_0 = this.a;
            if (v1_0.h) {
                String v2_2 = p12.f.b("Location");
                if (v2_2 == null) {
                    v2_2 = 0;
                }
                okhttp3.Request v3_1 = p12.a;
                if (v2_2 != null) {
                    String v2_4;
                    boolean v9_0 = v3_1.a;
                    v9_0.getClass();
                    String v2_3 = v9_0.f(v2_2);
                    if (v2_3 == null) {
                        v2_4 = 0;
                    } else {
                        v2_4 = v2_3.a();
                    }
                    if ((v2_4 != null) && ((kotlin.jvm.internal.j.a(v2_4.a, v3_1.a.a)) || (v1_0.i))) {
                        int v1_2 = v3_1.a();
                        if (okhttp3.internal.http.HttpMethod.a(v4)) {
                            String v12_2 = p12.d;
                            okhttp3.internal.http.HttpMethod.a.getClass();
                            if ((v4.equals("PROPFIND")) || ((v12_2 == 308) || (v12_2 == 307))) {
                                v5 = 1;
                            }
                            if ((v4.equals("PROPFIND")) || ((v12_2 == 308) || (v12_2 == 307))) {
                                if (v5 != 0) {
                                    v0_0 = v3_1.d;
                                }
                                v1_2.b(v4, v0_0);
                            } else {
                                v1_2.b("GET", 0);
                            }
                            if (v5 == 0) {
                                v1_2.c.d("Transfer-Encoding");
                                v1_2.c.d("Content-Length");
                                v1_2.c.d("Content-Type");
                            }
                        }
                        if (!okhttp3.internal._UtilJvmKt.a(v3_1.a, v2_4)) {
                            v1_2.c.d("Authorization");
                        }
                        v1_2.a = v2_4;
                        return new okhttp3.Request(v1_2);
                    }
                }
            }
        } else {
            if (v2_11 == 401) {
                return this.a.g.a(v1_3, p12);
            } else {
                if (v2_11 == 421) {
                    int v1_4 = v3_2.d;
                    if (((v1_4 == 0) || (!v1_4.c())) && ((p13 != null) && (!kotlin.jvm.internal.j.a(p13.c.b().b().h.d, p13.d.h().f().a.h.d)))) {
                        try {
                            p13.c().r = 1;
                            return p12.a;
                        } catch (String v12_14) {
                            throw v12_14;
                        }
                    }
                } else {
                    if (v2_11 == 503) {
                        int v1_13 = p12.q;
                        if (((v1_13 == 0) || (v1_13.d != 503)) && (okhttp3.internal.http.RetryAndFollowUpInterceptor.d(p12, 2147483647) == 0)) {
                            return p12.a;
                        }
                    } else {
                        if (v2_11 == 407) {
                            kotlin.jvm.internal.j.b(v1_3);
                            if (v1_3.b.type() != java.net.Proxy$Type.HTTP) {
                                throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                            } else {
                                return this.a.m.a(v1_3, p12);
                            }
                        } else {
                            if (v2_11 == 408) {
                                if (this.a.e) {
                                    int v1_17 = v3_2.d;
                                    if ((v1_17 == 0) || (!v1_17.c())) {
                                        int v1_19 = p12.q;
                                        if (((v1_19 == 0) || (v1_19.d != 408)) && (okhttp3.internal.http.RetryAndFollowUpInterceptor.d(p12, 0) <= 0)) {
                                            return p12.a;
                                        }
                                    }
                                }
                            } else {
                                switch (v2_11) {
                                    default:
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public final boolean c(java.io.IOException p3, okhttp3.internal.connection.RealCall p4, okhttp3.Request p5)
    {
        boolean v0 = (p3 instanceof okhttp3.internal.http2.ConnectionShutdownException);
        if (this.a.e) {
            if (!v0) {
                int v5_8 = p5.d;
                if (((v5_8 != 0) && (v5_8.c())) || ((p3 instanceof java.io.FileNotFoundException))) {
                    return 0;
                }
            }
            if (!(p3 instanceof java.net.ProtocolException)) {
                if (!(p3 instanceof java.io.InterruptedIOException)) {
                    if ((((p3 instanceof javax.net.ssl.SSLHandshakeException)) && ((p3.getCause() instanceof java.security.cert.CertificateException))) || ((p3 instanceof javax.net.ssl.SSLPeerUnverifiedException))) {
                        return 0;
                    }
                } else {
                    if ((!(p3 instanceof java.net.SocketTimeoutException)) || (!v0)) {
                        return 0;
                    }
                }
                boolean v3_3 = p4.x;
                if ((v3_3) && (v3_3.e == 1)) {
                    int v4_2;
                    boolean v3_5 = p4.n;
                    kotlin.jvm.internal.j.b(v3_5);
                    boolean v3_6 = v3_5.b();
                    int v4_1 = p4.x;
                    if (v4_1 == 0) {
                        v4_2 = 0;
                    } else {
                        v4_2 = v4_1.c();
                    }
                    if (v3_6.a(v4_2)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
