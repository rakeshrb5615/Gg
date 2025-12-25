package okhttp3.internal.http1;
final class Http1ExchangeCodec$ChunkedSink implements x8.f0 {
    public final x8.p a;
    public boolean b;
    public final synthetic okhttp3.internal.http1.Http1ExchangeCodec c;

    public Http1ExchangeCodec$ChunkedSink(okhttp3.internal.http1.Http1ExchangeCodec p2)
    {
        this.c = p2;
        this.a = new x8.p(p2.c.b().b());
        return;
    }

    public final x8.j0 b()
    {
        return this.a;
    }

    public final declared_synchronized void close()
    {
        if (!this.b) {
            this.b = 1;
            this.c.c.b().q("0\r\n\r\n");
            okhttp3.internal.http1.Http1ExchangeCodec v0_1 = this.a;
            int v1_0 = v0_1.e;
            v0_1.e = x8.j0.d;
            v1_0.a();
            v1_0.b();
            this.c.d = 3;
            return;
        } else {
            return;
        }
    }

    public final declared_synchronized void flush()
    {
        if (!this.b) {
            this.c.c.b().flush();
            return;
        } else {
            return;
        }
    }

    public final void k(x8.g p3, long p4)
    {
        if (this.b) {
            throw new IllegalStateException("closed");
        } else {
            if (p4 != 0) {
                x8.h v0_2 = this.c.c.b();
                v0_2.d(p4);
                v0_2.q("\r\n");
                v0_2.k(p3, p4);
                v0_2.q("\r\n");
                return;
            } else {
                return;
            }
        }
    }
}
