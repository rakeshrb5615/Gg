package okhttp3.internal.http1;
final class Http1ExchangeCodec$KnownLengthSink implements x8.f0 {
    public final x8.p a;
    public boolean b;
    public final synthetic okhttp3.internal.http1.Http1ExchangeCodec c;

    public Http1ExchangeCodec$KnownLengthSink(okhttp3.internal.http1.Http1ExchangeCodec p2)
    {
        this.c = p2;
        this.a = new x8.p(p2.c.b().b());
        return;
    }

    public final x8.j0 b()
    {
        return this.a;
    }

    public final void close()
    {
        if (!this.b) {
            this.b = 1;
            int v0_3 = this.a;
            okhttp3.internal.http1.Http1ExchangeCodec v1_1 = v0_3.e;
            v0_3.e = x8.j0.d;
            v1_1.a();
            v1_1.b();
            this.c.d = 3;
            return;
        } else {
            return;
        }
    }

    public final void flush()
    {
        if (!this.b) {
            this.c.c.b().flush();
            return;
        } else {
            return;
        }
    }

    public final void k(x8.g p8, long p9)
    {
        if (this.b) {
            throw new IllegalStateException("closed");
        } else {
            okhttp3.internal._UtilCommonKt.a(p8.b, 0, p9);
            this.c.c.b().k(p8, p9);
            return;
        }
    }
}
