package okhttp3.internal.http1;
final class Http1ExchangeCodec$UnknownLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec$AbstractSource {
    public boolean e;

    public final void close()
    {
        if (!this.c) {
            if (!this.e) {
                this.c(okhttp3.internal.http1.Http1ExchangeCodec.f);
            }
            this.c = 1;
            return;
        } else {
            return;
        }
    }

    public final long t(x8.g p4, long p5)
    {
        kotlin.jvm.internal.j.e(p4, "sink");
        if (p5 < 0) {
            throw new IllegalArgumentException(v1.a.g(p5, "byteCount < 0: ").toString());
        } else {
            if (this.c) {
                throw new IllegalStateException("closed");
            } else {
                if (!this.e) {
                    okhttp3.Headers v4_4 = super.t(p4, p5);
                    if (v4_4 != -1) {
                        return v4_4;
                    } else {
                        this.e = 1;
                        this.c(okhttp3.Headers.c);
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
        }
    }
}
