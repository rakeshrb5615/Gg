package okhttp3;
public class OkHttpClient implements okhttp3.Call$Factory, okhttp3.WebSocket$Factory {
    public static final okhttp3.OkHttpClient$Companion B;
    public static final java.util.List C;
    public static final java.util.List D;
    public final okhttp3.ConnectionPool A;
    public final okhttp3.Dispatcher a;
    public final java.util.List b;
    public final java.util.List c;
    public final a5.a d;
    public final boolean e;
    public final boolean f;
    public final okhttp3.Authenticator g;
    public final boolean h;
    public final boolean i;
    public final okhttp3.CookieJar j;
    public final okhttp3.Dns k;
    public final java.net.ProxySelector l;
    public final okhttp3.Authenticator m;
    public final javax.net.SocketFactory n;
    public final javax.net.ssl.SSLSocketFactory o;
    public final javax.net.ssl.X509TrustManager p;
    public final java.util.List q;
    public final java.util.List r;
    public final okhttp3.internal.tls.OkHostnameVerifier s;
    public final okhttp3.CertificatePinner t;
    public final okhttp3.internal.tls.CertificateChainCleaner u;
    public final int v;
    public final int w;
    public final int x;
    public final okhttp3.internal.connection.RouteDatabase y;
    public final okhttp3.internal.concurrent.TaskRunner z;

    static OkHttpClient()
    {
        okhttp3.OkHttpClient.B = new okhttp3.OkHttpClient$Companion(0);
        okhttp3.OkHttpClient.C = okhttp3.internal._UtilJvmKt.j(new okhttp3.Protocol[] {okhttp3.Protocol.f, okhttp3.Protocol.d}));
        okhttp3.OkHttpClient.D = okhttp3.internal._UtilJvmKt.j(new okhttp3.ConnectionSpec[] {okhttp3.ConnectionSpec.g, okhttp3.ConnectionSpec.h}));
        return;
    }

    public OkHttpClient()
    {
        this(new okhttp3.OkHttpClient$Builder());
        return;
    }

    public OkHttpClient(okhttp3.OkHttpClient$Builder p8)
    {
        this.a = p8.a;
        this.b = okhttp3.internal._UtilJvmKt.i(p8.c);
        this.c = okhttp3.internal._UtilJvmKt.i(p8.d);
        this.d = p8.e;
        this.e = p8.f;
        this.f = p8.g;
        this.g = p8.h;
        this.h = p8.i;
        this.i = p8.j;
        this.j = p8.k;
        this.k = p8.l;
        String v0_30 = java.net.ProxySelector.getDefault();
        if (v0_30 == null) {
            v0_30 = okhttp3.internal.proxy.NullProxySelector.a;
        }
        this.l = v0_30;
        this.m = p8.m;
        this.n = p8.n;
        String v0_34 = p8.o;
        this.q = v0_34;
        this.r = p8.p;
        this.s = p8.q;
        this.v = p8.s;
        this.w = p8.t;
        this.x = p8.u;
        this.y = new okhttp3.internal.connection.RouteDatabase();
        this.z = okhttp3.internal.concurrent.TaskRunner.r;
        String v1_15 = p8.b;
        if (v1_15 == null) {
            v1_15 = new okhttp3.ConnectionPool();
            p8.b = v1_15;
        }
        this.A = v1_15;
        if ((v0_34 == null) || (!v0_34.isEmpty())) {
            String v0_36 = v0_34.iterator();
            while (v0_36.hasNext()) {
                if (((okhttp3.ConnectionSpec) v0_36.next()).a) {
                    okhttp3.internal.platform.Platform.a.getClass();
                    okhttp3.internal.platform.Platform.b.getClass();
                    String v0_41 = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                    v0_41.init(0);
                    String v0_42 = v0_41.getTrustManagers();
                    kotlin.jvm.internal.j.b(v0_42);
                    if (v0_42.length == 1) {
                        javax.net.ssl.X509TrustManager v4_2 = v0_42[0];
                        if ((v4_2 instanceof javax.net.ssl.X509TrustManager)) {
                            javax.net.ssl.X509TrustManager v4_0 = ((javax.net.ssl.X509TrustManager) v4_2);
                            this.p = v4_0;
                            String v0_3 = okhttp3.internal.platform.Platform.b;
                            v0_3.getClass();
                            try {
                                String v0_5 = v0_3.l();
                                boolean v3_0 = new javax.net.ssl.TrustManager[1];
                                v3_0[0] = v4_0;
                                v0_5.init(0, v3_0, 0);
                                String v0_6 = v0_5.getSocketFactory();
                                kotlin.jvm.internal.j.d(v0_6, "getSocketFactory(...)");
                                this.o = v0_6;
                                okhttp3.internal.tls.CertificateChainCleaner.a.getClass();
                                String v0_9 = okhttp3.internal.platform.Platform.b.c(v4_0);
                                this.u = v0_9;
                                IllegalStateException v8_2 = p8.r;
                                v8_2.getClass();
                            } catch (IllegalStateException v8_3) {
                                String v1_1 = new StringBuilder("No System TLS: ");
                                v1_1.append(v8_3);
                                throw new AssertionError(v1_1.toString(), v8_3);
                            }
                            if (!kotlin.jvm.internal.j.a(v8_2.b, v0_9)) {
                                v8_2 = new okhttp3.CertificatePinner(v8_2.a, v0_9);
                            }
                            this.t = v8_2;
                            IllegalStateException v8_6 = this.p;
                            String v0_14 = this.u;
                            okhttp3.CertificatePinner v2_6 = this.o;
                            boolean v3_1 = this.c;
                            javax.net.ssl.X509TrustManager v4_1 = this.b;
                            kotlin.jvm.internal.j.c(v4_1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                            if (v4_1.contains(0)) {
                                IllegalStateException v8_8 = new StringBuilder("Null interceptor: ");
                                v8_8.append(v4_1);
                                throw new IllegalStateException(v8_8.toString().toString());
                            } else {
                                kotlin.jvm.internal.j.c(v3_1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (v3_1.contains(0)) {
                                    IllegalStateException v8_12 = new StringBuilder("Null network interceptor: ");
                                    v8_12.append(v3_1);
                                    throw new IllegalStateException(v8_12.toString().toString());
                                } else {
                                    String v1_4 = this.q;
                                    if ((v1_4 == null) || (!v1_4.isEmpty())) {
                                        String v1_5 = v1_4.iterator();
                                        while (v1_5.hasNext()) {
                                            if (((okhttp3.ConnectionSpec) v1_5.next()).a) {
                                                if (v2_6 == null) {
                                                    throw new IllegalStateException("sslSocketFactory == null");
                                                } else {
                                                    if (v0_14 == null) {
                                                        throw new IllegalStateException("certificateChainCleaner == null");
                                                    } else {
                                                        if (v8_6 == null) {
                                                            throw new IllegalStateException("x509TrustManager == null");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (v2_6 != null) {
                                            throw new IllegalStateException("Check failed.");
                                        } else {
                                            if (v0_14 != null) {
                                                throw new IllegalStateException("Check failed.");
                                            } else {
                                                if (v8_6 != null) {
                                                    throw new IllegalStateException("Check failed.");
                                                } else {
                                                    if (!kotlin.jvm.internal.j.a(this.t, okhttp3.CertificatePinner.d)) {
                                                        throw new IllegalStateException("Check failed.");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    IllegalStateException v8_31 = java.util.Arrays.toString(v0_42);
                    kotlin.jvm.internal.j.d(v8_31, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(v8_31).toString());
                }
            }
            this.o = 0;
            this.u = 0;
            this.p = 0;
            this.t = okhttp3.CertificatePinner.d;
        }
    }

    public final okhttp3.internal.connection.RealCall a(okhttp3.Request p2)
    {
        return new okhttp3.internal.connection.RealCall(this, p2);
    }
}
