package okhttp3.internal.platform;
public final class AndroidPlatform extends okhttp3.internal.platform.Platform implements okhttp3.internal.platform.ContextAwarePlatform {
    public static final okhttp3.internal.platform.AndroidPlatform$Companion f;
    public static final String g;
    public static final boolean h;
    public android.content.Context d;
    public final java.util.ArrayList e;

    static AndroidPlatform()
    {
        int v1 = 0;
        okhttp3.internal.platform.AndroidPlatform.f = new okhttp3.internal.platform.AndroidPlatform$Companion(0);
        okhttp3.internal.platform.AndroidPlatform.g = "OkHttp";
        okhttp3.internal.platform.Platform.a.getClass();
        okhttp3.internal.platform.PlatformRegistry.a.getClass();
        if (android.os.Build$VERSION.SDK_INT < 29) {
            v1 = 1;
        }
        okhttp3.internal.platform.AndroidPlatform.h = v1;
        return;
    }

    public AndroidPlatform()
    {
        okhttp3.internal.platform.android.StandardAndroidSocketAdapter.g.getClass();
        try {
            Object v3_0 = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            java.util.ArrayList v0_3 = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter(v3_0);
        } catch (java.util.ArrayList v0_4) {
            int v2_2 = okhttp3.OkHttpClient.getName();
            okhttp3.internal.platform.android.AndroidLog.a.getClass();
            okhttp3.internal.platform.android.AndroidLog.a(v2_2, 5, "unable to load android socket classes", v0_4);
            v0_3 = 0;
        }
        okhttp3.internal.platform.android.AndroidSocketAdapter.e.getClass();
        java.util.ArrayList v1_4 = new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.AndroidSocketAdapter.f);
        okhttp3.internal.platform.android.ConscryptSocketAdapter.a.getClass();
        int v2_6 = new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.ConscryptSocketAdapter.b);
        okhttp3.internal.platform.android.BouncyCastleSocketAdapter.a.getClass();
        Object v3_5 = new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.BouncyCastleSocketAdapter.b);
        boolean v4_3 = new okhttp3.internal.platform.android.SocketAdapter[4];
        int v5 = 0;
        v4_3[0] = v0_3;
        v4_3[1] = v1_4;
        v4_3[2] = v2_6;
        v4_3[3] = v3_5;
        java.util.ArrayList v0_9 = i7.h.e0(v4_3);
        java.util.ArrayList v1_6 = new java.util.ArrayList();
        int v2_8 = v0_9.size();
        while (v5 < v2_8) {
            Object v3_7 = v0_9.get(v5);
            v5++;
            if (((okhttp3.internal.platform.android.SocketAdapter) v3_7).b()) {
                v1_6.add(v3_7);
            }
        }
        this.e = v1_6;
        return;
    }

    public final void a(android.content.Context p1)
    {
        this.d = p1;
        return;
    }

    public final android.content.Context b()
    {
        return this.d;
    }

    public final okhttp3.internal.tls.CertificateChainCleaner c(javax.net.ssl.X509TrustManager p3)
    {
        okhttp3.internal.platform.android.AndroidCertificateChainCleaner.d.getClass();
        okhttp3.internal.tls.BasicCertificateChainCleaner v0_3 = 0;
        try {
            int v1_1 = new android.net.http.X509TrustManagerExtensions(p3);
        } catch (IllegalArgumentException) {
            v1_1 = 0;
        }
        if (v1_1 != 0) {
            v0_3 = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner(p3, v1_1);
        }
        if (v0_3 == null) {
            return new okhttp3.internal.tls.BasicCertificateChainCleaner(this.d(p3));
        } else {
            return v0_3;
        }
    }

    public final okhttp3.internal.tls.TrustRootIndex d(javax.net.ssl.X509TrustManager p4)
    {
        try {
            android.os.StrictMode.noteSlowCall("buildTrustRootIndex");
            reflect.Method v0_2 = p4.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[] {java.security.cert.X509Certificate}));
            v0_2.setAccessible(1);
            return new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex(p4, v0_2);
        } catch (NoSuchMethodException) {
            return super.d(p4);
        }
    }

    public final void e(javax.net.ssl.SSLSocket p6, String p7, java.util.List p8)
    {
        kotlin.jvm.internal.j.e(p8, "protocols");
        java.util.ArrayList v0_1 = this.e;
        int v1 = v0_1.size();
        int v2 = 0;
        while (v2 < v1) {
            okhttp3.internal.platform.android.SocketAdapter v3_1 = v0_1.get(v2);
            v2++;
            if (((okhttp3.internal.platform.android.SocketAdapter) v3_1).a(p6)) {
            }
            okhttp3.internal.platform.android.SocketAdapter v3_0 = ((okhttp3.internal.platform.android.SocketAdapter) v3_1);
            if (v3_0 != null) {
                v3_0.d(p6, p7, p8);
            }
            return;
        }
        v3_1 = 0;
    }

    public final void f(java.net.Socket p2, java.net.InetSocketAddress p3, int p4)
    {
        kotlin.jvm.internal.j.e(p3, "address");
        try {
            p2.connect(p3, p4);
            return;
        } catch (ClassCastException v2_1) {
            if (android.os.Build$VERSION.SDK_INT != 26) {
                throw v2_1;
            } else {
                throw new java.io.IOException("Exception in connect", v2_1);
            }
        }
    }

    public final String g(javax.net.ssl.SSLSocket p7)
    {
        java.util.ArrayList v0 = this.e;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            okhttp3.internal.platform.android.SocketAdapter v4_1 = v0.get(v2);
            v2++;
            if (((okhttp3.internal.platform.android.SocketAdapter) v4_1).a(p7)) {
            }
            okhttp3.internal.platform.android.SocketAdapter v4_0 = ((okhttp3.internal.platform.android.SocketAdapter) v4_1);
            if (v4_0 == null) {
                return 0;
            } else {
                return v4_0.c(p7);
            }
        }
        v4_1 = 0;
    }

    public final boolean i(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "hostname");
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(p2);
    }

    public final void j(int p3, String p4, Throwable p5)
    {
        kotlin.jvm.internal.j.e(p4, "message");
        String v1 = okhttp3.internal.platform.AndroidPlatform.g;
        if (p3 != 5) {
            android.util.Log.i(v1, p4, p5);
            return;
        } else {
            android.util.Log.w(v1, p4, p5);
            return;
        }
    }

    public final javax.net.ssl.SSLContext l()
    {
        android.os.StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
