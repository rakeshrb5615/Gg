package okhttp3;
public final class Address {
    public final okhttp3.Dns a;
    public final javax.net.SocketFactory b;
    public final javax.net.ssl.SSLSocketFactory c;
    public final javax.net.ssl.HostnameVerifier d;
    public final okhttp3.CertificatePinner e;
    public final okhttp3.Authenticator f;
    public final java.net.ProxySelector g;
    public final okhttp3.HttpUrl h;
    public final java.util.List i;
    public final java.util.List j;

    public Address(String p2, int p3, okhttp3.Dns p4, javax.net.SocketFactory p5, javax.net.ssl.SSLSocketFactory p6, okhttp3.internal.tls.OkHostnameVerifier p7, okhttp3.CertificatePinner p8, okhttp3.Authenticator p9, java.util.List p10, java.util.List p11, java.net.ProxySelector p12)
    {
        int v6_1;
        kotlin.jvm.internal.j.e(p2, "uriHost");
        kotlin.jvm.internal.j.e(p4, "dns");
        kotlin.jvm.internal.j.e(p5, "socketFactory");
        kotlin.jvm.internal.j.e(p9, "proxyAuthenticator");
        kotlin.jvm.internal.j.e(p10, "protocols");
        kotlin.jvm.internal.j.e(p11, "connectionSpecs");
        kotlin.jvm.internal.j.e(p12, "proxySelector");
        this.a = p4;
        this.b = p5;
        this.c = p6;
        this.d = p7;
        this.e = p8;
        this.f = p9;
        this.g = p12;
        String v4_2 = new okhttp3.HttpUrl$Builder();
        if (p6 == 0) {
            v6_1 = "http";
        } else {
            v6_1 = "https";
        }
        if (!v6_1.equalsIgnoreCase("http")) {
            if (!v6_1.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(v6_1));
            } else {
                v4_2.a = "https";
            }
        } else {
            v4_2.a = "http";
        }
        String v5_5 = okhttp3.internal._HostnamesCommonKt.b(okhttp3.internal.url._UrlKt.d(0, 0, 7, p2));
        if (v5_5 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(p2));
        } else {
            v4_2.d = v5_5;
            if ((1 > p3) || (p3 >= 65536)) {
                throw new IllegalArgumentException(g2.g.c(p3, "unexpected port: ").toString());
            } else {
                v4_2.e = p3;
                this.h = v4_2.a();
                this.i = okhttp3.internal._UtilJvmKt.i(p10);
                this.j = okhttp3.internal._UtilJvmKt.i(p11);
                return;
            }
        }
    }

    public final boolean a(okhttp3.Address p3)
    {
        kotlin.jvm.internal.j.e(p3, "that");
        if ((!kotlin.jvm.internal.j.a(this.a, p3.a)) || ((!kotlin.jvm.internal.j.a(this.f, p3.f)) || ((!kotlin.jvm.internal.j.a(this.i, p3.i)) || ((!kotlin.jvm.internal.j.a(this.j, p3.j)) || ((!kotlin.jvm.internal.j.a(this.g, p3.g)) || ((!kotlin.jvm.internal.j.a(this.c, p3.c)) || ((!kotlin.jvm.internal.j.a(this.d, p3.d)) || ((!kotlin.jvm.internal.j.a(this.e, p3.e)) || (this.h.e != p3.h.e))))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof okhttp3.Address)) || ((!kotlin.jvm.internal.j.a(this.h, ((okhttp3.Address) p3).h)) || (!this.a(((okhttp3.Address) p3))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (java.util.Objects.hashCode(this.e) + ((java.util.Objects.hashCode(this.d) + ((java.util.Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + ((this.h.i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Address{");
        int v1_6 = this.h;
        v0_1.append(v1_6.d);
        v0_1.append(58);
        v0_1.append(v1_6.e);
        v0_1.append(", ");
        int v1_3 = new StringBuilder("proxySelector=");
        v1_3.append(this.g);
        v0_1.append(v1_3.toString());
        v0_1.append(125);
        return v0_1.toString();
    }
}
