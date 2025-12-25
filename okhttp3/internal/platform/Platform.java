package okhttp3.internal.platform;
public class Platform {
    public static final okhttp3.internal.platform.Platform$Companion a;
    public static volatile okhttp3.internal.platform.Platform b;
    public static final java.util.logging.Logger c;

    static Platform()
    {
        okhttp3.internal.platform.Platform.a = new okhttp3.internal.platform.Platform$Companion(0);
        okhttp3.internal.platform.PlatformRegistry.a.getClass();
        okhttp3.internal.platform.android.AndroidLog.a.getClass();
        try {
            IllegalStateException v1_2 = okhttp3.internal.platform.android.AndroidLog.c.entrySet().iterator();
        } catch (IllegalStateException v1_4) {
            System.err.println("Possibly running android unit test without robolectric");
            v1_4.printStackTrace();
            String v0_4;
            okhttp3.internal.platform.Android10Platform.f.getClass();
            IllegalStateException v1_5 = 0;
            if (!okhttp3.internal.platform.Android10Platform.g) {
                v0_4 = 0;
            } else {
                v0_4 = new okhttp3.internal.platform.Android10Platform();
            }
            if (v0_4 == null) {
                okhttp3.internal.platform.AndroidPlatform.f.getClass();
                if (okhttp3.internal.platform.AndroidPlatform.h) {
                    v1_5 = new okhttp3.internal.platform.AndroidPlatform();
                }
                v0_4 = v1_5;
            }
            if (v0_4 == null) {
                throw new IllegalStateException(g2.g.c(android.os.Build$VERSION.SDK_INT, "Expected Android API level 21+ but was "));
            } else {
                okhttp3.internal.platform.Platform.b = v0_4;
                okhttp3.internal.platform.Platform.c = java.util.logging.Logger.getLogger(okhttp3.OkHttpClient.getName());
                return;
            }
        } catch (IllegalStateException v1_3) {
            System.err.println("Possibly running android unit test without robolectric");
            v1_3.printStackTrace();
        }
        while (v1_2.hasNext()) {
            String v2_5 = ((java.util.Map$Entry) v1_2.next());
            okhttp3.internal.platform.android.AndroidLog.b(((String) v2_5.getKey()), ((String) v2_5.getValue()));
        }
    }

    public Platform()
    {
        return;
    }

    public okhttp3.internal.tls.CertificateChainCleaner c(javax.net.ssl.X509TrustManager p2)
    {
        return new okhttp3.internal.tls.BasicCertificateChainCleaner(this.d(p2));
    }

    public okhttp3.internal.tls.TrustRootIndex d(javax.net.ssl.X509TrustManager p3)
    {
        java.security.cert.X509Certificate[] v3_1 = p3.getAcceptedIssuers();
        return new okhttp3.internal.tls.BasicTrustRootIndex(((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(v3_1, v3_1.length)));
    }

    public void e(javax.net.ssl.SSLSocket p1, String p2, java.util.List p3)
    {
        kotlin.jvm.internal.j.e(p3, "protocols");
        return;
    }

    public void f(java.net.Socket p2, java.net.InetSocketAddress p3, int p4)
    {
        kotlin.jvm.internal.j.e(p3, "address");
        p2.connect(p3, p4);
        return;
    }

    public String g(javax.net.ssl.SSLSocket p1)
    {
        return 0;
    }

    public Object h()
    {
        if (!okhttp3.internal.platform.Platform.c.isLoggable(java.util.logging.Level.FINE)) {
            return 0;
        } else {
            return new Throwable("response.body().close()");
        }
    }

    public boolean i(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "hostname");
        return 1;
    }

    public void j(int p2, String p3, Throwable p4)
    {
        java.util.logging.Level v2_1;
        kotlin.jvm.internal.j.e(p3, "message");
        if (p2 != 5) {
            v2_1 = java.util.logging.Level.INFO;
        } else {
            v2_1 = java.util.logging.Level.WARNING;
        }
        okhttp3.internal.platform.Platform.c.log(v2_1, p3, p4);
        return;
    }

    public void k(Object p2, String p3)
    {
        kotlin.jvm.internal.j.e(p3, "message");
        if (p2 == null) {
            p3 = p3.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        this.j(5, p3, ((Throwable) p2));
        return;
    }

    public javax.net.ssl.SSLContext l()
    {
        javax.net.ssl.SSLContext v0_1 = javax.net.ssl.SSLContext.getInstance("TLS");
        kotlin.jvm.internal.j.d(v0_1, "getInstance(...)");
        return v0_1;
    }

    public final String toString()
    {
        return this.getClass().getSimpleName();
    }
}
