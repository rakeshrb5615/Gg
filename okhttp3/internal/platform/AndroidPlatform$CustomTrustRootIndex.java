package okhttp3.internal.platform;
public final class AndroidPlatform$CustomTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
    public final javax.net.ssl.X509TrustManager a;
    public final reflect.Method b;

    public AndroidPlatform$CustomTrustRootIndex(javax.net.ssl.X509TrustManager p1, reflect.Method p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate p3)
    {
        try {
            int v3_5 = this.b.invoke(this.a, new Object[] {p3}));
            kotlin.jvm.internal.j.c(v3_5, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((java.security.cert.TrustAnchor) v3_5).getTrustedCert();
        } catch (int v3_3) {
            throw new AssertionError("unable to get issues and signature", v3_3);
        } catch (reflect.InvocationTargetException) {
            return 0;
        }
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex)) {
                if (kotlin.jvm.internal.j.a(this.a, ((okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex) p5).b)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.b.hashCode() + (this.a.hashCode() * 31));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("CustomTrustRootIndex(trustManager=");
        v0_2.append(this.a);
        v0_2.append(", findByIssuerAndSignatureMethod=");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
