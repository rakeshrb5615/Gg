package okhttp3.internal.platform;
public final class Android10Platform extends okhttp3.internal.platform.Platform implements okhttp3.internal.platform.ContextAwarePlatform {
    public static final okhttp3.internal.platform.Android10Platform$Companion f;
    public static final boolean g;
    public android.content.Context d;
    public final java.util.ArrayList e;

    static Android10Platform()
    {
        int v1 = 0;
        okhttp3.internal.platform.Android10Platform.f = new okhttp3.internal.platform.Android10Platform$Companion(0);
        okhttp3.internal.platform.Platform.a.getClass();
        okhttp3.internal.platform.PlatformRegistry.a.getClass();
        if (android.os.Build$VERSION.SDK_INT >= 29) {
            v1 = 1;
        }
        okhttp3.internal.platform.Android10Platform.g = v1;
        return;
    }

    public Android10Platform()
    {
        java.util.ArrayList v0_1;
        okhttp3.internal.platform.android.Android10SocketAdapter.a.getClass();
        okhttp3.internal.platform.Platform.a.getClass();
        okhttp3.internal.platform.PlatformRegistry.a.getClass();
        if (android.os.Build$VERSION.SDK_INT < 29) {
            v0_1 = 0;
        } else {
            v0_1 = new okhttp3.internal.platform.android.Android10SocketAdapter();
        }
        okhttp3.internal.platform.android.AndroidSocketAdapter.e.getClass();
        java.util.ArrayList v1_1 = new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.AndroidSocketAdapter.f);
        okhttp3.internal.platform.android.ConscryptSocketAdapter.a.getClass();
        int v2_3 = new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.ConscryptSocketAdapter.b);
        okhttp3.internal.platform.android.BouncyCastleSocketAdapter.a.getClass();
        Object v3_3 = new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.BouncyCastleSocketAdapter.b);
        boolean v4_3 = new okhttp3.internal.platform.android.SocketAdapter[4];
        int v5 = 0;
        v4_3[0] = v0_1;
        v4_3[1] = v1_1;
        v4_3[2] = v2_3;
        v4_3[3] = v3_3;
        java.util.ArrayList v0_7 = i7.h.e0(v4_3);
        java.util.ArrayList v1_3 = new java.util.ArrayList();
        int v2_4 = v0_7.size();
        while (v5 < v2_4) {
            Object v3_4 = v0_7.get(v5);
            v5++;
            if (((okhttp3.internal.platform.android.SocketAdapter) v3_4).b()) {
                v1_3.add(v3_4);
            }
        }
        this.e = v1_3;
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

    public final okhttp3.internal.tls.TrustRootIndex d(javax.net.ssl.X509TrustManager p2)
    {
        android.os.StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(p2);
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

    public final Object h()
    {
        if (android.os.Build$VERSION.SDK_INT < 30) {
            return super.h();
        } else {
            Object v0_3 = new android.util.CloseGuard();
            v0_3.open("response.body().close()");
            return v0_3;
        }
    }

    public final boolean i(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "hostname");
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(p2);
    }

    public final void j(int p2, String p3, Throwable p4)
    {
        kotlin.jvm.internal.j.e(p3, "message");
        if (p2 != 5) {
            okhttp3.internal.platform.AndroidPlatform.f.getClass();
            android.util.Log.i(okhttp3.internal.platform.AndroidPlatform.g, p3, p4);
            return;
        } else {
            okhttp3.internal.platform.AndroidPlatform.f.getClass();
            android.util.Log.w(okhttp3.internal.platform.AndroidPlatform.g, p3, p4);
            return;
        }
    }

    public final void k(Object p3, String p4)
    {
        kotlin.jvm.internal.j.e(p4, "message");
        if (android.os.Build$VERSION.SDK_INT < 30) {
            super.k(p3, p4);
            return;
        } else {
            kotlin.jvm.internal.j.c(p3, "null cannot be cast to non-null type android.util.CloseGuard");
            ((android.util.CloseGuard) p3).warnIfOpen();
            return;
        }
    }

    public final javax.net.ssl.SSLContext l()
    {
        android.os.StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
