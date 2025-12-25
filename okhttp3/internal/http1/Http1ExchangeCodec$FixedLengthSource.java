package okhttp3.internal.http1;
final class Http1ExchangeCodec$FixedLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec$AbstractSource {
    public long e;
    public final synthetic okhttp3.internal.http1.Http1ExchangeCodec f;

    public Http1ExchangeCodec$FixedLengthSource(okhttp3.internal.http1.Http1ExchangeCodec p2, okhttp3.HttpUrl p3, long p4)
    {
        kotlin.jvm.internal.j.e(p3, "url");
        this.f = p2;
        super(p2, p3);
        super.e = p4;
        if (p4 == 0) {
            super.c(okhttp3.Headers.c);
        }
        return;
    }

    public final void close()
    {
        if (!this.c) {
            if (this.e != 0) {
                kotlin.jvm.internal.j.e(java.util.concurrent.TimeUnit.MILLISECONDS, "timeUnit");
                try {
                    okhttp3.Headers v0_2 = okhttp3.internal._UtilJvmKt.f(this, 100);
                } catch (java.io.IOException) {
                    v0_2 = 0;
                }
                if (v0_2 == null) {
                    this.f.b.h();
                    this.c(okhttp3.internal.http1.Http1ExchangeCodec.f);
                }
            }
            this.c = 1;
            return;
        } else {
            return;
        }
    }

    public final long t(x8.g p8, long p9)
    {
        kotlin.jvm.internal.j.e(p8, "sink");
        if (p9 < 0) {
            throw new IllegalArgumentException(v1.a.g(p9, "byteCount < 0: ").toString());
        } else {
            if (this.c) {
                throw new IllegalStateException("closed");
            } else {
                long v2_1 = this.e;
                if (v2_1 != 0) {
                    java.net.ProtocolException v8_4 = super.t(p8, Math.min(v2_1, p9));
                    if (v8_4 == -1) {
                        this.f.b.h();
                        java.net.ProtocolException v8_8 = new java.net.ProtocolException("unexpected end of stream");
                        this.c(okhttp3.internal.http1.Http1ExchangeCodec.f);
                        throw v8_8;
                    } else {
                        long v2_4 = (this.e - v8_4);
                        this.e = v2_4;
                        if (v2_4 == 0) {
                            this.c(okhttp3.Headers.c);
                        }
                        return v8_4;
                    }
                } else {
                    return -1;
                }
            }
        }
    }
}
