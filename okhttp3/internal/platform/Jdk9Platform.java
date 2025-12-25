package okhttp3.internal.platform;
public class Jdk9Platform extends okhttp3.internal.platform.Platform {
    public static final Integer d;

    static Jdk9Platform()
    {
        Class v0_1;
        new okhttp3.internal.platform.Jdk9Platform$Companion(0);
        Class v0_4 = System.getProperty("java.specification.version");
        if (v0_4 == null) {
            v0_1 = 0;
        } else {
            v0_1 = b8.p.q0(v0_4);
        }
        okhttp3.internal.platform.Jdk9Platform.d = v0_1;
        if (v0_1 == null) {
            try {
                javax.net.ssl.SSLSocket.getMethod("getApplicationProtocol", 0);
            } catch (NoSuchMethodException) {
            }
            return;
        } else {
            return;
        }
    }

    public Jdk9Platform()
    {
        return;
    }

    public final void e(javax.net.ssl.SSLSocket p2, String p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p4, "protocols");
        javax.net.ssl.SSLParameters v3_1 = p2.getSSLParameters();
        okhttp3.internal.platform.Platform.a.getClass();
        String[] v0_2 = new String[0];
        v3_1.setApplicationProtocols(((String[]) okhttp3.internal.platform.Platform$Companion.a(p4).toArray(v0_2)));
        p2.setSSLParameters(v3_1);
        return;
    }

    public final String g(javax.net.ssl.SSLSocket p2)
    {
        try {
            int v2_1 = p2.getApplicationProtocol();
        } catch (UnsupportedOperationException) {
            return 0;
        }
        if ((v2_1 != 0) && (!v2_1.equals(""))) {
            return v2_1;
        } else {
            return 0;
        }
    }

    public final javax.net.ssl.SSLContext l()
    {
        String v1_0 = okhttp3.internal.platform.Jdk9Platform.d;
        if ((v1_0 == null) || (v1_0.intValue() < 9)) {
            try {
                javax.net.ssl.SSLContext v0_1 = javax.net.ssl.SSLContext.getInstance("TLSv1.3");
            } catch (java.security.NoSuchAlgorithmException) {
                v0_1 = javax.net.ssl.SSLContext.getInstance(v0_1);
            }
            kotlin.jvm.internal.j.b(v0_1);
            return v0_1;
        } else {
            javax.net.ssl.SSLContext v0_2 = javax.net.ssl.SSLContext.getInstance("TLS");
            kotlin.jvm.internal.j.d(v0_2, "getInstance(...)");
            return v0_2;
        }
    }
}
