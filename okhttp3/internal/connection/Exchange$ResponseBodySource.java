package okhttp3.internal.connection;
public final class Exchange$ResponseBodySource extends x8.o {
    public final long b;
    public final boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean m;
    public final synthetic okhttp3.internal.connection.Exchange n;

    public Exchange$ResponseBodySource(okhttp3.internal.connection.Exchange p2, x8.h0 p3, long p4, boolean p6)
    {
        kotlin.jvm.internal.j.e(p3, "delegate");
        this.n = p2;
        super(p3);
        super.b = p4;
        super.c = p6;
        super.e = 1;
        if (p4 == 0) {
            super.c(0);
        }
        return;
    }

    public final java.io.IOException c(java.io.IOException p8)
    {
        if (!this.f) {
            this.f = 1;
            okhttp3.internal.connection.Exchange v1 = this.n;
            if ((p8 == null) && (this.e)) {
                this.e = 0;
                v1.b.y(v1.a);
            }
            return okhttp3.internal.connection.Exchange.a(v1, this.d, this.c, p8, 8);
        } else {
            return p8;
        }
    }

    public final void close()
    {
        if (!this.m) {
            this.m = 1;
            try {
                super.close();
                this.c(0);
                return;
            } catch (java.io.IOException v0_4) {
                java.io.IOException v0_1 = this.c(v0_4);
                kotlin.jvm.internal.j.b(v0_1);
                throw v0_1;
            }
        } else {
            return;
        }
    }

    public final long t(x8.g p10, long p11)
    {
        kotlin.jvm.internal.j.e(p10, "sink");
        if (this.m) {
            throw new IllegalStateException("closed");
        } else {
            java.net.ProtocolException v10_1 = this.a.t(p10, p11);
            okhttp3.internal.connection.Exchange v1_1 = this.n;
            if (this.e) {
                this.e = 0;
                v1_1.b.y(v1_1.a);
            }
            if (v10_1 != -1) {
                long v5_1 = (this.d + v10_1);
                long v7 = this.b;
                if ((v7 != -1) && (v5_1 > v7)) {
                    String v11_2 = new StringBuilder("expected ");
                    v11_2.append(v7);
                    v11_2.append(" bytes but received ");
                    v11_2.append(v5_1);
                    throw new java.net.ProtocolException(v11_2.toString());
                } else {
                    this.d = v5_1;
                    if (v1_1.d.c()) {
                        this.c(0);
                    }
                    return v10_1;
                }
            } else {
                this.c(0);
                return -1;
            }
        }
    }
}
