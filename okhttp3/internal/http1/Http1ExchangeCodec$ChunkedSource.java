package okhttp3.internal.http1;
final class Http1ExchangeCodec$ChunkedSource extends okhttp3.internal.http1.Http1ExchangeCodec$AbstractSource {
    public long e;
    public boolean f;
    public final synthetic okhttp3.internal.http1.Http1ExchangeCodec m;

    public Http1ExchangeCodec$ChunkedSource(okhttp3.internal.http1.Http1ExchangeCodec p2, okhttp3.HttpUrl p3)
    {
        kotlin.jvm.internal.j.e(p3, "url");
        this.m = p2;
        super(p2, p3);
        super.e = -1;
        super.f = 1;
        return;
    }

    public final void close()
    {
        if (!this.c) {
            if (this.f) {
                kotlin.jvm.internal.j.e(java.util.concurrent.TimeUnit.MILLISECONDS, "timeUnit");
                try {
                    okhttp3.Headers v0_1 = okhttp3.internal._UtilJvmKt.f(this, 100);
                } catch (java.io.IOException) {
                    v0_1 = 0;
                }
                if (v0_1 == null) {
                    this.m.b.h();
                    this.c(okhttp3.internal.http1.Http1ExchangeCodec.f);
                }
            }
            this.c = 1;
            return;
        } else {
            return;
        }
    }

    public final long t(x8.g p13, long p14)
    {
        long v0_0 = this.m;
        okhttp3.Headers v1_0 = v0_0.c;
        kotlin.jvm.internal.j.e(p13, "sink");
        if (p14 < 0) {
            throw new IllegalArgumentException(v1.a.g(p14, "byteCount < 0: ").toString());
        } else {
            if (this.c) {
                throw new IllegalStateException("closed");
            } else {
                if (this.f) {
                    char v7_3 = this.e;
                    if ((v7_3 == 0) || (v7_3 == -1)) {
                        if (v7_3 != -1) {
                            v1_0.a().g();
                        }
                        try {
                            this.e = v1_0.a().u();
                            okhttp3.Headers v1_7 = b8.i.H0(v1_0.a().g()).toString();
                        } catch (String v13_11) {
                            throw new java.net.ProtocolException(v13_11.getMessage());
                        }
                        if ((this.e < 0) || ((v1_7.length() > 0) && (!b8.p.p0(v1_7, ";")))) {
                            java.net.ProtocolException v14_8 = new StringBuilder("expected chunk size and optional extensions but was \"");
                            v14_8.append(this.e);
                            v14_8.append(v1_7);
                            v14_8.append(34);
                            throw new java.net.ProtocolException(v14_8.toString());
                        } else {
                            if (this.e == 0) {
                                this.f = 0;
                                okhttp3.internal.http1.HeadersReader v2_3 = v0_0.e;
                                v2_3.getClass();
                                okhttp3.Headers$Builder v3_1 = new okhttp3.Headers$Builder();
                                while(true) {
                                    String v4_9 = v2_3.a.l(v2_3.b);
                                    v2_3.b = (v2_3.b - ((long) v4_9.length()));
                                    if (v4_9.length() == 0) {
                                        break;
                                    }
                                    char v7_0 = b8.i.v0(v4_9, 58, 1, 4);
                                    if (v7_0 == -1) {
                                        if (v4_9.charAt(0) != 58) {
                                            v3_1.b("", v4_9);
                                        } else {
                                            String v4_0 = v4_9.substring(1);
                                            kotlin.jvm.internal.j.d(v4_0, "substring(...)");
                                            v3_1.b("", v4_0);
                                        }
                                    } else {
                                        String v8_0 = v4_9.substring(0, v7_0);
                                        kotlin.jvm.internal.j.d(v8_0, "substring(...)");
                                        String v4_1 = v4_9.substring((v7_0 + 1));
                                        kotlin.jvm.internal.j.d(v4_1, "substring(...)");
                                        v3_1.b(v8_0, v4_1);
                                    }
                                }
                                this.c(v3_1.c());
                            }
                            if (!this.f) {
                                return -1;
                            }
                        }
                    }
                    String v13_2 = super.t(p13, Math.min(p14, this.e));
                    if (v13_2 == -1) {
                        v0_0.b.h();
                        String v13_5 = new java.net.ProtocolException("unexpected end of stream");
                        this.c(okhttp3.internal.http1.Http1ExchangeCodec.f);
                        throw v13_5;
                    } else {
                        this.e = (this.e - v13_2);
                        return v13_2;
                    }
                }
                return -1;
            }
        }
    }
}
