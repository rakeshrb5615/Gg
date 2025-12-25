package okhttp3.internal.connection;
final class Exchange$RequestBodySink extends x8.n {
    public final long b;
    public final boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean m;
    public final synthetic okhttp3.internal.connection.Exchange n;

    public Exchange$RequestBodySink(okhttp3.internal.connection.Exchange p2, x8.f0 p3, long p4, boolean p6)
    {
        kotlin.jvm.internal.j.e(p3, "delegate");
        this.n = p2;
        super(p3);
        super.b = p4;
        super.c = p6;
        super.f = p6;
        return;
    }

    public final java.io.IOException c(java.io.IOException p8)
    {
        if (!this.d) {
            this.d = 1;
            return okhttp3.internal.connection.Exchange.a(this.n, this.e, this.c, p8, 4);
        } else {
            return p8;
        }
    }

    public final void close()
    {
        if (!this.m) {
            this.m = 1;
            long v2 = this.b;
            if ((v2 != -1) && (this.e != v2)) {
                throw new java.net.ProtocolException("unexpected end of stream");
            } else {
                try {
                    super.close();
                    this.c(0);
                    return;
                } catch (java.io.IOException v0_4) {
                    java.io.IOException v0_6 = this.c(v0_4);
                    kotlin.jvm.internal.j.b(v0_6);
                    throw v0_6;
                }
            }
        } else {
            return;
        }
    }

    public final void flush()
    {
        try {
            super.flush();
            return;
        } catch (java.io.IOException v0_0) {
            java.io.IOException v0_1 = this.c(v0_0);
            kotlin.jvm.internal.j.b(v0_1);
            throw v0_1;
        }
    }

    public final void k(x8.g p5, long p6)
    {
        if (this.m) {
            throw new IllegalStateException("closed");
        } else {
            long v2 = this.b;
            if ((v2 != -1) && ((this.e + p6) > v2)) {
                long v0_5 = new StringBuilder("expected ");
                v0_5.append(v2);
                v0_5.append(" bytes but received ");
                v0_5.append((this.e + p6));
                throw new java.net.ProtocolException(v0_5.toString());
            } else {
                if (this.f) {
                    this.f = 0;
                    long v0_8 = this.n;
                    v0_8.b.t(v0_8.a);
                }
                super.k(p5, p6);
                this.e = (this.e + p6);
                return;
            }
        }
    }
}
