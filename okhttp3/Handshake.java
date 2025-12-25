package okhttp3;
public final class Handshake {
    public static final okhttp3.Handshake$Companion e;
    public final okhttp3.TlsVersion a;
    public final okhttp3.CipherSuite b;
    public final java.util.List c;
    public final h7.j d;

    static Handshake()
    {
        okhttp3.Handshake.e = new okhttp3.Handshake$Companion(0);
        return;
    }

    public Handshake(okhttp3.TlsVersion p1, okhttp3.CipherSuite p2, java.util.List p3, u7.a p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = a.a.F(new a8.j(p4, 3));
        return;
    }

    public final java.util.List a()
    {
        return ((java.util.List) this.d.getValue());
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof okhttp3.Handshake)) || ((((okhttp3.Handshake) p3).a != this.a) || ((!kotlin.jvm.internal.j.a(((okhttp3.Handshake) p3).b, this.b)) || ((!kotlin.jvm.internal.j.a(((okhttp3.Handshake) p3).a(), this.a())) || (!kotlin.jvm.internal.j.a(((okhttp3.Handshake) p3).c, this.c)))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.c.hashCode() + ((this.a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_0 = this.a();
        StringBuilder v1_3 = new java.util.ArrayList(i7.j.X(v0_0, 10));
        String v0_7 = v0_0.iterator();
        while (v0_7.hasNext()) {
            String v3_16;
            String v3_15 = ((java.security.cert.Certificate) v0_7.next());
            if (!(v3_15 instanceof java.security.cert.X509Certificate)) {
                v3_16 = v3_15.getType();
                kotlin.jvm.internal.j.d(v3_16, "getType(...)");
            } else {
                v3_16 = ((java.security.cert.X509Certificate) v3_15).getSubjectDN().toString();
            }
            v1_3.add(v3_16);
        }
        String v0_1 = v1_3.toString();
        StringBuilder v1_1 = new StringBuilder("Handshake{tlsVersion=");
        v1_1.append(this.a);
        v1_1.append(" cipherSuite=");
        v1_1.append(this.b);
        v1_1.append(" peerCertificates=");
        v1_1.append(v0_1);
        v1_1.append(" localCertificates=");
        String v3_6 = this.c;
        String v0_4 = new java.util.ArrayList(i7.j.X(v3_6, 10));
        java.util.Iterator v2_2 = v3_6.iterator();
        while (v2_2.hasNext()) {
            String v3_11;
            String v3_9 = ((java.security.cert.Certificate) v2_2.next());
            if (!(v3_9 instanceof java.security.cert.X509Certificate)) {
                v3_11 = v3_9.getType();
                kotlin.jvm.internal.j.d(v3_11, "getType(...)");
            } else {
                v3_11 = ((java.security.cert.X509Certificate) v3_9).getSubjectDN().toString();
            }
            v0_4.add(v3_11);
        }
        v1_1.append(v0_4);
        v1_1.append(125);
        return v1_1.toString();
    }
}
