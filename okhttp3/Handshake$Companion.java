package okhttp3;
public final class Handshake$Companion {

    private Handshake$Companion()
    {
        return;
    }

    public synthetic Handshake$Companion(int p1)
    {
        return;
    }

    public static okhttp3.Handshake a(javax.net.ssl.SSLSession p6)
    {
        String v0_0 = p6.getCipherSuite();
        if (v0_0 == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else {
            if ((v0_0.equals("TLS_NULL_WITH_NULL_NULL")) || (v0_0.equals("SSL_NULL_WITH_NULL_NULL"))) {
                throw new java.io.IOException("cipherSuite == ".concat(v0_0));
            } else {
                String v0_2 = okhttp3.CipherSuite.b.b(v0_0);
                okhttp3.TlsVersion v1_4 = p6.getProtocol();
                if (v1_4 == null) {
                    throw new IllegalStateException("tlsVersion == null");
                } else {
                    if ("NONE".equals(v1_4)) {
                        throw new java.io.IOException("tlsVersion == NONE");
                    } else {
                        okhttp3.TlsVersion.b.getClass();
                        okhttp3.TlsVersion v1_5 = okhttp3.TlsVersion$Companion.a(v1_4);
                        try {
                            i7.n v2_4 = okhttp3.internal._UtilJvmKt.j(p6.getPeerCertificates());
                        } catch (javax.net.ssl.SSLPeerUnverifiedException) {
                            v2_4 = i7.n.a;
                        }
                        return new okhttp3.Handshake(v1_5, v0_2, okhttp3.internal._UtilJvmKt.j(p6.getLocalCertificates()), new a8.j(v2_4, 4));
                    }
                }
            }
        }
    }
}
