package okhttp3;
public final class CipherSuite$Companion {

    private CipherSuite$Companion()
    {
        return;
    }

    public synthetic CipherSuite$Companion(int p1)
    {
        return;
    }

    public static final okhttp3.CipherSuite a(okhttp3.CipherSuite$Companion p1, String p2)
    {
        okhttp3.CipherSuite v1_1 = new okhttp3.CipherSuite(p2);
        okhttp3.CipherSuite.d.put(p2, v1_1);
        return v1_1;
    }

    public final declared_synchronized okhttp3.CipherSuite b(String p7)
    {
        kotlin.jvm.internal.j.e(p7, "javaName");
        java.util.LinkedHashMap v0_1 = okhttp3.CipherSuite.d;
        okhttp3.CipherSuite v1_4 = ((okhttp3.CipherSuite) v0_1.get(p7));
        if (v1_4 == null) {
            okhttp3.CipherSuite v1_1;
            if (!b8.p.p0(p7, "TLS_")) {
                if (!b8.p.p0(p7, "SSL_")) {
                    v1_1 = p7;
                } else {
                    okhttp3.CipherSuite v1_2 = p7.substring(4);
                    kotlin.jvm.internal.j.d(v1_2, "substring(...)");
                    v1_1 = "TLS_".concat(v1_2);
                }
            } else {
                String v3_0 = p7.substring(4);
                kotlin.jvm.internal.j.d(v3_0, "substring(...)");
                v1_1 = "SSL_".concat(v3_0);
            }
            v1_4 = ((okhttp3.CipherSuite) v0_1.get(v1_1));
            if (v1_4 == null) {
                v1_4 = new okhttp3.CipherSuite(p7);
            }
            v0_1.put(p7, v1_4);
        }
        return v1_4;
    }
}
