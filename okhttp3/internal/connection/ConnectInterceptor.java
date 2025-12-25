package okhttp3.internal.connection;
public final class ConnectInterceptor implements okhttp3.Interceptor {
    public static final okhttp3.internal.connection.ConnectInterceptor a;

    static ConnectInterceptor()
    {
        okhttp3.internal.connection.ConnectInterceptor.a = new okhttp3.internal.connection.ConnectInterceptor();
        return;
    }

    private ConnectInterceptor()
    {
        return;
    }

    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain p10)
    {
        String v0_0 = p10.a;
        try {
            if (!v0_0.v) {
                throw new IllegalStateException("released");
            } else {
                if ((v0_0.s) || ((v0_0.r) || ((v0_0.u) || (v0_0.t)))) {
                    throw new IllegalStateException("Check failed.");
                } else {
                    okhttp3.internal.http1.Http1ExchangeCodec v4_3;
                    int v1_4 = v0_0.n;
                    kotlin.jvm.internal.j.b(v1_4);
                    okhttp3.internal.connection.Exchange v2_0 = v1_4.a();
                    int v3_0 = v0_0.a;
                    v2_0.getClass();
                    okhttp3.internal.http1.Http1ExchangeCodec v4_0 = p10.g;
                    okhttp3.internal.connection.BufferedSocket v5 = v2_0.n;
                    x8.j0 v6_0 = v2_0.p;
                    if (v6_0 == null) {
                        v2_0.e.setSoTimeout(v4_0);
                        okhttp3.internal.http1.Http1ExchangeCodec v4_1 = java.util.concurrent.TimeUnit.MILLISECONDS;
                        v5.a().b().g(((long) v4_0), v4_1);
                        v5.b().b().g(((long) p10.h), v4_1);
                        v4_3 = new okhttp3.internal.http1.Http1ExchangeCodec(v3_0, v2_0, v5);
                    } else {
                        v4_3 = new okhttp3.internal.http2.Http2ExchangeCodec(v3_0, v2_0, p10, v6_0);
                    }
                    okhttp3.internal.connection.Exchange v2_2 = new okhttp3.internal.connection.Exchange(v0_0, v0_0.d, v1_4, v4_3);
                    v0_0.q = v2_2;
                    v0_0.x = v2_2;
                    try {
                        v0_0.r = 1;
                        v0_0.s = 1;
                    } catch (java.io.IOException v10_5) {
                        throw v10_5;
                    }
                    if (v0_0.w) {
                        throw new java.io.IOException("Canceled");
                    } else {
                        return okhttp3.internal.http.RealInterceptorChain.a(p10, 0, v2_2, 0, 61).b(p10.e);
                    }
                }
            }
        } catch (java.io.IOException v10_3) {
            throw v10_3;
        }
    }
}
