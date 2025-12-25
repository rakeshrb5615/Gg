package okhttp3.internal.platform.android;
public final class AndroidCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {
    public static final okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion d;
    public final javax.net.ssl.X509TrustManager b;
    public final android.net.http.X509TrustManagerExtensions c;

    static AndroidCertificateChainCleaner()
    {
        okhttp3.internal.platform.android.AndroidCertificateChainCleaner.d = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion(0);
        return;
    }

    public AndroidCertificateChainCleaner(javax.net.ssl.X509TrustManager p1, android.net.http.X509TrustManagerExtensions p2)
    {
        this.b = p1;
        this.c = p2;
        return;
    }

    public final java.util.List a(String p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p4, "chain");
        kotlin.jvm.internal.j.e(p3, "hostname");
        String v0_4 = new java.security.cert.X509Certificate[0];
        try {
            java.security.cert.CertificateException v3_1 = this.c.checkServerTrusted(((java.security.cert.X509Certificate[]) p4.toArray(v0_4)), "RSA", p3);
            kotlin.jvm.internal.j.d(v3_1, "checkServerTrusted(...)");
            return v3_1;
        } catch (java.security.cert.CertificateException v3_2) {
            javax.net.ssl.SSLPeerUnverifiedException v4_3 = new javax.net.ssl.SSLPeerUnverifiedException(v3_2.getMessage());
            v4_3.initCause(v3_2);
            throw v4_3;
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof okhttp3.internal.platform.android.AndroidCertificateChainCleaner)) || (((okhttp3.internal.platform.android.AndroidCertificateChainCleaner) p2).b != this.b)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return System.identityHashCode(this.b);
    }
}
