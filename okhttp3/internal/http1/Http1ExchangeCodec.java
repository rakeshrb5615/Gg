package okhttp3.internal.http1;
public final class Http1ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    public static final okhttp3.Headers f;
    public final okhttp3.OkHttpClient a;
    public final okhttp3.internal.http.ExchangeCodec$Carrier b;
    public final okhttp3.internal.connection.BufferedSocket c;
    public int d;
    public final okhttp3.internal.http1.HeadersReader e;

    static Http1ExchangeCodec()
    {
        new okhttp3.internal.http1.Http1ExchangeCodec$Companion(0);
        okhttp3.Headers.b.getClass();
        okhttp3.internal.http1.Http1ExchangeCodec.f = okhttp3.Headers$Companion.a(new String[] {"OkHttp-Response-Body", "Truncated"}));
        return;
    }

    public Http1ExchangeCodec(okhttp3.OkHttpClient p2, okhttp3.internal.http.ExchangeCodec$Carrier p3, okhttp3.internal.connection.BufferedSocket p4)
    {
        kotlin.jvm.internal.j.e(p4, "socket");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.e = new okhttp3.internal.http1.HeadersReader(p4.a());
        return;
    }

    public final void a()
    {
        this.c.b().flush();
        return;
    }

    public final void b(okhttp3.Request p6)
    {
        String v1_5 = this.b.f().b.type();
        kotlin.jvm.internal.j.d(v1_5, "type(...)");
        okhttp3.internal.http.RequestLine.a.getClass();
        String v0_2 = new StringBuilder();
        v0_2.append(p6.b);
        v0_2.append(32);
        okhttp3.HttpUrl v2_2 = p6.a;
        if ((kotlin.jvm.internal.j.a(v2_2.a, "https")) || (v1_5 != java.net.Proxy$Type.HTTP)) {
            v0_2.append(okhttp3.internal.http.RequestLine.a(v2_2));
        } else {
            v0_2.append(v2_2);
        }
        v0_2.append(" HTTP/1.1");
        this.m(p6.c, v0_2.toString());
        return;
    }

    public final boolean c()
    {
        if (this.d != 6) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void cancel()
    {
        this.b.cancel();
        return;
    }

    public final void d()
    {
        this.c.b().flush();
        return;
    }

    public final x8.g0 e()
    {
        return this.c;
    }

    public final long f(okhttp3.Response p3)
    {
        if (okhttp3.internal.http.HttpHeaders.a(p3)) {
            long v0_6 = p3.f.b("Transfer-Encoding");
            if (v0_6 == 0) {
                v0_6 = 0;
            }
            if (!"chunked".equalsIgnoreCase(v0_6)) {
                return okhttp3.internal._UtilJvmKt.d(p3);
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    public final x8.h0 g(okhttp3.Response p10)
    {
        IllegalStateException v0_0 = p10.a;
        if (okhttp3.internal.http.HttpHeaders.a(p10)) {
            String v1_4 = p10.f.b("Transfer-Encoding");
            if (v1_4 == null) {
                v1_4 = 0;
            }
            if (!"chunked".equalsIgnoreCase(v1_4)) {
                long v5 = okhttp3.internal._UtilJvmKt.d(p10);
                if (v5 == -1) {
                    String v10_2 = v0_0.a;
                    if (this.d != 4) {
                        String v10_4 = new StringBuilder("state: ");
                        v10_4.append(this.d);
                        throw new IllegalStateException(v10_4.toString().toString());
                    } else {
                        this.d = 5;
                        this.b.h();
                        kotlin.jvm.internal.j.e(v10_2, "url");
                        return new okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource(this, v10_2);
                    }
                } else {
                    return this.k(v0_0.a, v5);
                }
            } else {
                String v10_9 = v0_0.a;
                if (this.d != 4) {
                    String v10_11 = new StringBuilder("state: ");
                    v10_11.append(this.d);
                    throw new IllegalStateException(v10_11.toString().toString());
                } else {
                    this.d = 5;
                    return new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource(this, v10_9);
                }
            }
        } else {
            return this.k(v0_0.a, 0);
        }
    }

    public final okhttp3.internal.http.ExchangeCodec$Carrier h()
    {
        return this.b;
    }

    public final x8.f0 i(okhttp3.Request p6, long p7)
    {
        if (!"chunked".equalsIgnoreCase(p6.c.b("Transfer-Encoding"))) {
            if (p7 == -1) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            } else {
                if (this.d != 1) {
                    String v6_7 = new StringBuilder("state: ");
                    v6_7.append(this.d);
                    throw new IllegalStateException(v6_7.toString().toString());
                } else {
                    this.d = 2;
                    return new okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink(this);
                }
            }
        } else {
            if (this.d != 1) {
                String v6_15 = new StringBuilder("state: ");
                v6_15.append(this.d);
                throw new IllegalStateException(v6_15.toString().toString());
            } else {
                this.d = 2;
                return new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink(this);
            }
        }
    }

    public final okhttp3.Response$Builder j(boolean p14)
    {
        IllegalStateException v0_0 = this.e;
        java.io.IOException v1_0 = this.d;
        if ((v1_0 != null) && ((v1_0 != 1) && ((v1_0 != 2) && (v1_0 != 3)))) {
            int v14_3 = new StringBuilder("state: ");
            v14_3.append(this.d);
            throw new IllegalStateException(v14_3.toString().toString());
        } else {
            int v4_1 = v0_0.a.l(v0_0.b);
            v0_0.b = (v0_0.b - ((long) v4_1.length()));
            okhttp3.internal.http.StatusLine.d.getClass();
            java.io.IOException v1_4 = okhttp3.internal.http.StatusLine$Companion.a(v4_1);
            int v4_2 = v1_4.b;
            okhttp3.Response$Builder v5_4 = new okhttp3.Response$Builder();
            String v6_0 = v1_4.a;
            kotlin.jvm.internal.j.e(v6_0, "protocol");
            v5_4.b = v6_0;
            v5_4.c = v4_2;
            java.io.IOException v1_5 = v1_4.c;
            kotlin.jvm.internal.j.e(v1_5, "message");
            v5_4.d = v1_5;
            java.io.IOException v1_7 = new okhttp3.Headers$Builder();
            while(true) {
                String v6_3 = v0_0.a.l(v0_0.b);
                v0_0.b = (v0_0.b - ((long) v6_3.length()));
                if (v6_3.length() == 0) {
                    break;
                }
                char v8_1 = b8.i.v0(v6_3, 58, 1, 4);
                if (v8_1 == -1) {
                    if (v6_3.charAt(0) != 58) {
                        v1_7.b("", v6_3);
                    } else {
                        String v6_4 = v6_3.substring(1);
                        kotlin.jvm.internal.j.d(v6_4, "substring(...)");
                        v1_7.b("", v6_4);
                    }
                } else {
                    String v7_8 = v6_3.substring(0, v8_1);
                    kotlin.jvm.internal.j.d(v7_8, "substring(...)");
                    String v6_5 = v6_3.substring((v8_1 + 1));
                    kotlin.jvm.internal.j.d(v6_5, "substring(...)");
                    v1_7.b(v7_8, v6_5);
                }
            }
            v5_4.f = v1_7.c().d();
            if ((p14 == 0) || (v4_2 != 100)) {
                if (v4_2 != 100) {
                    if ((102 > v4_2) || (v4_2 >= 200)) {
                        this.d = 4;
                        return v5_4;
                    } else {
                        this.d = 3;
                        return v5_4;
                    }
                } else {
                    this.d = 3;
                    return v5_4;
                }
            } else {
                return 0;
            }
        }
    }

    public final x8.h0 k(okhttp3.HttpUrl p3, long p4)
    {
        if (this.d != 4) {
            String v3_3 = new StringBuilder("state: ");
            v3_3.append(this.d);
            throw new IllegalStateException(v3_3.toString().toString());
        } else {
            this.d = 5;
            return new okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource(this, p3, p4);
        }
    }

    public final void l(okhttp3.Response p5)
    {
        int v0_0 = okhttp3.internal._UtilJvmKt.d(p5);
        if (v0_0 != -1) {
            okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource v5_4 = this.k(p5.a.a, v0_0);
            okhttp3.internal._UtilJvmKt.f(v5_4, 2147483647);
            ((okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource) v5_4).close();
            return;
        } else {
            return;
        }
    }

    public final void m(okhttp3.Headers p6, String p7)
    {
        kotlin.jvm.internal.j.e(p6, "headers");
        kotlin.jvm.internal.j.e(p7, "requestLine");
        if (this.d != 0) {
            int v6_6 = new StringBuilder("state: ");
            v6_6.append(this.d);
            throw new IllegalStateException(v6_6.toString().toString());
        } else {
            okhttp3.internal.connection.BufferedSocket v0_1 = this.c;
            v0_1.b().q(p7).q("\r\n");
            IllegalStateException v7_4 = p6.size();
            int v2 = 0;
            while (v2 < v7_4) {
                v0_1.b().q(p6.c(v2)).q(": ").q(p6.e(v2)).q("\r\n");
                v2++;
            }
            v0_1.b().q("\r\n");
            this.d = 1;
            return;
        }
    }
}
