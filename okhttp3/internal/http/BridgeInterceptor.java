package okhttp3.internal.http;
public final class BridgeInterceptor implements okhttp3.Interceptor {
    public final okhttp3.CookieJar a;

    public BridgeInterceptor(okhttp3.CookieJar p2)
    {
        kotlin.jvm.internal.j.e(p2, "cookieJar");
        this.a = p2;
        return;
    }

    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain p12)
    {
        okhttp3.Response$Builder v0_0 = p12.e;
        x8.b0 v1_0 = v0_0.c;
        okhttp3.Headers v2_0 = v0_0.a();
        x8.r v3_0 = v0_0.a;
        okhttp3.Response$Builder v0_9 = v0_0.d;
        if (v0_9 != null) {
            String v8_1 = v0_9.b();
            if (v8_1 != null) {
                v2_0.a("Content-Type", v8_1.a);
            }
            String v8_3 = v0_9.a();
            if (v8_3 == -1) {
                v2_0.a("Transfer-Encoding", "chunked");
                v2_0.c.d("Content-Length");
            } else {
                v2_0.a("Content-Length", String.valueOf(v8_3));
                v2_0.c.d("Transfer-Encoding");
            }
        }
        int v9 = 0;
        if (v1_0.b("Host") == null) {
            v2_0.a("Host", okhttp3.internal._UtilJvmKt.h(v3_0, 0));
        }
        if (v1_0.b("Connection") == null) {
            v2_0.a("Connection", "Keep-Alive");
        }
        if ((v1_0.b("Accept-Encoding") == null) && (v1_0.b("Range") == null)) {
            v2_0.a("Accept-Encoding", "gzip");
            v9 = 1;
        }
        okhttp3.Response$Builder v0_10 = this.a;
        v0_10.a(v3_0);
        if (v1_0.b("User-Agent") == null) {
            v2_0.a("User-Agent", "okhttp/5.3.2");
        }
        x8.b0 v1_5 = new okhttp3.Request(v2_0);
        okhttp3.internal.http.RealResponseBody v12_5 = p12.b(v1_5);
        okhttp3.Headers v2_1 = v12_5.f;
        okhttp3.internal.http.HttpHeaders.d(v0_10, v1_5.a, v2_1);
        okhttp3.Response$Builder v0_11 = v12_5.c();
        v0_11.a = v1_5;
        if (v9 != 0) {
            x8.r v3_3 = v2_1.b("Content-Encoding");
            String v8_0 = 0;
            if (v3_3 == null) {
                v3_3 = 0;
            }
            if (("gzip".equalsIgnoreCase(v3_3)) && (okhttp3.internal.http.HttpHeaders.a(v12_5))) {
                okhttp3.internal.http.RealResponseBody v12_6 = v12_5.m;
                if (v12_6 != null) {
                    x8.r v3_7 = new x8.r(v12_6.i());
                    okhttp3.internal.http.RealResponseBody v12_8 = v2_1.d();
                    v12_8.d("Content-Encoding");
                    v12_8.d("Content-Length");
                    v0_11.f = v12_8.c().d();
                    okhttp3.internal.http.RealResponseBody v12_1 = v2_1.b("Content-Type");
                    if (v12_1 != null) {
                        v8_0 = v12_1;
                    }
                    v0_11.g = new okhttp3.internal.http.RealResponseBody(v8_0, -1, x8.b.c(v3_7));
                }
            }
        }
        return v0_11.a();
    }
}
