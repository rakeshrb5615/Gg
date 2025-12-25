package okhttp3.internal.http1;
abstract class Http1ExchangeCodec$AbstractSource implements x8.h0 {
    public final okhttp3.HttpUrl a;
    public final x8.p b;
    public boolean c;
    public final synthetic okhttp3.internal.http1.Http1ExchangeCodec d;

    public Http1ExchangeCodec$AbstractSource(okhttp3.internal.http1.Http1ExchangeCodec p2, okhttp3.HttpUrl p3)
    {
        kotlin.jvm.internal.j.e(p3, "url");
        this.d = p2;
        this.a = p3;
        this.b = new x8.p(p2.c.a().b());
        return;
    }

    public final x8.j0 b()
    {
        return this.b;
    }

    public final void c(okhttp3.Headers p6)
    {
        kotlin.jvm.internal.j.e(p6, "trailers");
        okhttp3.CookieJar v0_3 = this.d;
        okhttp3.HttpUrl v1_3 = v0_3.d;
        if (v1_3 != 6) {
            if (v1_3 != 5) {
                okhttp3.HttpUrl v1_0 = new StringBuilder("state: ");
                v1_0.append(v0_3.d);
                throw new IllegalStateException(v1_0.toString());
            } else {
                okhttp3.HttpUrl v1_1 = this.b;
                x8.j0 v3_0 = v1_1.e;
                v1_1.e = x8.j0.d;
                v3_0.a();
                v3_0.b();
                v0_3.d = 6;
                if (p6.size() > 0) {
                    okhttp3.CookieJar v0_4 = v0_3.a;
                    if (v0_4 != null) {
                        okhttp3.CookieJar v0_5 = v0_4.j;
                        if (v0_5 != null) {
                            okhttp3.internal.http.HttpHeaders.d(v0_5, this.a, p6);
                        }
                    }
                }
            }
        }
        return;
    }

    public long t(x8.g p3, long p4)
    {
        okhttp3.internal.http1.Http1ExchangeCodec v0 = this.d;
        kotlin.jvm.internal.j.e(p3, "sink");
        try {
            return v0.c.a().t(p3, p4);
        } catch (java.io.IOException v3_2) {
            v0.b.h();
            this.c(okhttp3.internal.http1.Http1ExchangeCodec.f);
            throw v3_2;
        }
    }
}
