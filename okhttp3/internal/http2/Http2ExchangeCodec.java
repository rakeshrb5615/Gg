package okhttp3.internal.http2;
public final class Http2ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    public static final okhttp3.internal.http2.Http2ExchangeCodec$Companion g;
    public static final java.util.List h;
    public static final java.util.List i;
    public final okhttp3.internal.connection.RealConnection a;
    public final okhttp3.internal.http.RealInterceptorChain b;
    public final okhttp3.internal.http2.Http2Connection c;
    public volatile okhttp3.internal.http2.Http2Stream d;
    public final okhttp3.Protocol e;
    public volatile boolean f;

    static Http2ExchangeCodec()
    {
        okhttp3.internal.http2.Http2ExchangeCodec.g = new okhttp3.internal.http2.Http2ExchangeCodec$Companion(0);
        String v4 = "keep-alive";
        String v6 = "te";
        String v8 = "encoding";
        String v10 = ":method";
        okhttp3.internal.http2.Http2ExchangeCodec.h = okhttp3.internal._UtilJvmKt.j(new String[] {"connection", ":authority"}));
        String v3 = "keep-alive";
        String v5 = "te";
        okhttp3.internal.http2.Http2ExchangeCodec.i = okhttp3.internal._UtilJvmKt.j(new String[] {"connection", "upgrade"}));
        return;
    }

    public Http2ExchangeCodec(okhttp3.OkHttpClient p2, okhttp3.internal.connection.RealConnection p3, okhttp3.internal.http.RealInterceptorChain p4, okhttp3.internal.http2.Http2Connection p5)
    {
        kotlin.jvm.internal.j.e(p5, "http2Connection");
        this.a = p3;
        this.b = p4;
        this.c = p5;
        okhttp3.Protocol v3_1 = okhttp3.Protocol.m;
        if (!p2.r.contains(v3_1)) {
            v3_1 = okhttp3.Protocol.f;
        }
        this.e = v3_1;
        return;
    }

    public final void a()
    {
        okhttp3.internal.http2.Http2Stream$FramingSink v0_0 = this.d;
        kotlin.jvm.internal.j.b(v0_0);
        v0_0.o.close();
        return;
    }

    public final void b(okhttp3.Request p15)
    {
        if (this.d == null) {
            String v0_11;
            int v1 = 0;
            if (p15.d == null) {
                v0_11 = 0;
            } else {
                v0_11 = 1;
            }
            okhttp3.internal.http2.Http2ExchangeCodec.g.getClass();
            int v3_0 = p15.c;
            java.util.ArrayList v4_1 = new java.util.ArrayList((v3_0.size() + 4));
            v4_1.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.f, p15.b));
            String v8_3 = p15.a;
            okhttp3.internal.http.RequestLine.a.getClass();
            v4_1.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.g, okhttp3.internal.http.RequestLine.a(v8_3)));
            java.io.IOException v15_8 = p15.c.b("Host");
            if (v15_8 != null) {
                v4_1.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.i, v15_8));
            }
            v4_1.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.h, v8_3.a));
            java.io.IOException v15_11 = v3_0.size();
            int v5_2 = 0;
            while (v5_2 < v15_11) {
                okhttp3.internal.http2.Http2Stream v6_0 = v3_0.c(v5_2);
                int v7_0 = java.util.Locale.US;
                kotlin.jvm.internal.j.d(v7_0, "US");
                okhttp3.internal.http2.Http2Stream v6_1 = v6_0.toLowerCase(v7_0);
                kotlin.jvm.internal.j.d(v6_1, "toLowerCase(...)");
                if ((!okhttp3.internal.http2.Http2ExchangeCodec.h.contains(v6_1)) || ((v6_1.equals("te")) && (v3_0.e(v5_2).equals("trailers")))) {
                    v4_1.add(new okhttp3.internal.http2.Header(v6_1, v3_0.e(v5_2)));
                }
                v5_2++;
            }
            String v8_4 = this.c;
            v8_4.getClass();
            int v9 = (v0_11 ^ 1);
            try {
            } catch (String v0_19) {
                throw v0_19;
            }
            if (v8_4.e > 1073741823) {
                v8_4.s(okhttp3.internal.http2.ErrorCode.m);
            }
            if (v8_4.f) {
                throw new okhttp3.internal.http2.ConnectionShutdownException();
            } else {
                int v7_13 = v8_4.e;
                v8_4.e = (v7_13 + 2);
                okhttp3.internal.http2.Http2Stream v6_7 = new okhttp3.internal.http2.Http2Stream(v7_13, v8_4, v9, 0, 0);
                if ((v0_11 == null) || ((v8_4.z >= v8_4.A) || (v6_7.d >= v6_7.e))) {
                    v1 = 1;
                }
                if (v6_7.j()) {
                    v8_4.b.put(Integer.valueOf(v7_13), v6_7);
                }
                v8_4.C.x(v9, v7_13, v4_1);
                if (v1 != 0) {
                    v8_4.C.flush();
                }
                this.d = v6_7;
                if (this.f) {
                    java.io.IOException v15_14 = this.d;
                    kotlin.jvm.internal.j.b(v15_14);
                    v15_14.g(okhttp3.internal.http2.ErrorCode.n);
                    throw new java.io.IOException("Canceled");
                } else {
                    java.io.IOException v15_3 = this.d;
                    kotlin.jvm.internal.j.b(v15_3);
                    java.util.concurrent.TimeUnit v2_0 = java.util.concurrent.TimeUnit.MILLISECONDS;
                    v15_3.p.g(((long) this.b.g), v2_0);
                    java.io.IOException v15_5 = this.d;
                    kotlin.jvm.internal.j.b(v15_5);
                    v15_5.q.g(((long) this.b.h), v2_0);
                    return;
                }
            }
        } else {
            return;
        }
    }

    public final boolean c()
    {
        okhttp3.internal.http2.Http2Stream v0 = this.d;
        if (v0 == null) {
            return 0;
        } else {
            try {
                int v2_2;
                int v2_3 = v0.n;
            } catch (Throwable v1_1) {
                throw v1_1;
            }
            if ((!v2_3.b) || (!v2_3.d.h())) {
                v2_2 = 0;
            } else {
                v2_2 = 1;
            }
            if (v2_2 != 1) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final void cancel()
    {
        this.f = 1;
        okhttp3.internal.http2.Http2Stream v0_1 = this.d;
        if (v0_1 != null) {
            v0_1.g(okhttp3.internal.http2.ErrorCode.n);
        }
        return;
    }

    public final void d()
    {
        this.c.flush();
        return;
    }

    public final x8.g0 e()
    {
        okhttp3.internal.http2.Http2Stream v0 = this.d;
        kotlin.jvm.internal.j.b(v0);
        return v0;
    }

    public final long f(okhttp3.Response p3)
    {
        if (okhttp3.internal.http.HttpHeaders.a(p3)) {
            return okhttp3.internal._UtilJvmKt.d(p3);
        } else {
            return 0;
        }
    }

    public final x8.h0 g(okhttp3.Response p1)
    {
        okhttp3.internal.http2.Http2Stream$FramingSource v1_0 = this.d;
        kotlin.jvm.internal.j.b(v1_0);
        return v1_0.n;
    }

    public final okhttp3.internal.http.ExchangeCodec$Carrier h()
    {
        return this.a;
    }

    public final x8.f0 i(okhttp3.Request p1, long p2)
    {
        okhttp3.internal.http2.Http2Stream$FramingSink v1_0 = this.d;
        kotlin.jvm.internal.j.b(v1_0);
        return v1_0.o;
    }

    public final okhttp3.Response$Builder j(boolean p11)
    {
        int v0_0 = this.d;
        if (v0_0 == 0) {
            throw new java.io.IOException("stream wasn\'t created");
        }
        try {
            do {
                int v2_0 = 0;
            } while(v2_0 == 0);
            v0_0.p.l();
        } catch (int v11_5) {
            throw v11_5;
        }
        if ((!v0_0.f.isEmpty()) || (v0_0.h() != null)) {
            if (v0_0.f.isEmpty()) {
                int v11_6 = v0_0.s;
                if (v11_6 == 0) {
                    okhttp3.internal.http2.Http2Stream$StreamTimeout v1_6 = v0_0.h();
                    kotlin.jvm.internal.j.b(v1_6);
                    v11_6 = new okhttp3.internal.http2.StreamResetException(v1_6);
                } else {
                }
                throw v11_6;
            } else {
                okhttp3.internal.http2.Http2Stream$StreamTimeout v1_8 = v0_0.f.removeFirst();
                kotlin.jvm.internal.j.d(v1_8, "removeFirst(...)");
                okhttp3.internal.http2.Http2Stream$StreamTimeout v1_9 = ((okhttp3.Headers) v1_8);
                String v3_2 = this.e;
                okhttp3.internal.http2.Http2ExchangeCodec.g.getClass();
                kotlin.jvm.internal.j.e(v3_2, "protocol");
                int v0_5 = new okhttp3.Headers$Builder();
                boolean v4_0 = v1_9.size();
                okhttp3.internal.http.StatusLine v6_0 = 0;
                while (v2_0 < v4_0) {
                    String v7_0 = v1_9.c(v2_0);
                    String v8 = v1_9.e(v2_0);
                    if (!v7_0.equals(":status")) {
                        if (!okhttp3.internal.http2.Http2ExchangeCodec.i.contains(v7_0)) {
                            v0_5.b(v7_0, v8);
                        }
                    } else {
                        String v7_2 = "HTTP/1.1 ".concat(v8);
                        okhttp3.internal.http.StatusLine.d.getClass();
                        v6_0 = okhttp3.internal.http.StatusLine$Companion.a(v7_2);
                    }
                    v2_0++;
                }
                if (v6_0 == null) {
                    throw new java.net.ProtocolException("Expected \':status\' header not present");
                } else {
                    okhttp3.internal.http2.Http2Stream$StreamTimeout v1_11 = new okhttp3.Response$Builder();
                    v1_11.b = v3_2;
                    v1_11.c = v6_0.b;
                    int v2_2 = v6_0.c;
                    kotlin.jvm.internal.j.e(v2_2, "message");
                    v1_11.d = v2_2;
                    v1_11.f = v0_5.c().d();
                    if ((p11 == 0) || (v1_11.c != 100)) {
                        return v1_11;
                    } else {
                        return 0;
                    }
                }
            }
        } else {
            if (p11 != 0) {
                v2_0 = 1;
            } else {
                String v3_0;
                v0_0.b.getClass();
                String v3_5 = v0_0.o;
                if (v3_5.c) {
                    v3_0 = 1;
                } else {
                    if (!v3_5.a) {
                        v3_0 = 0;
                    } else {
                    }
                }
                if (v3_0 != null) {
                }
            }
            if (v2_0 != 0) {
                v0_0.p.h();
            }
            try {
                v0_0.wait();
            } catch (int v11_4) {
                if (v2_0 != 0) {
                    v0_0.p.l();
                }
                throw v11_4;
            }
            if (v2_0 != 0) {
            }
        }
    }
}
