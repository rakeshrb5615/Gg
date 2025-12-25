package okhttp3;
public final class TlsVersion$Companion {

    private TlsVersion$Companion()
    {
        return;
    }

    public synthetic TlsVersion$Companion(int p1)
    {
        return;
    }

    public static okhttp3.TlsVersion a(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "javaName");
        boolean v0_7 = p2.hashCode();
        if (v0_7 == 79201641) {
            if (p2.equals("SSLv3")) {
                return okhttp3.TlsVersion.m;
            }
        } else {
            if (v0_7 == 79923350) {
                if (p2.equals("TLSv1")) {
                    return okhttp3.TlsVersion.f;
                }
            } else {
                switch (v0_7) {
                    case -503070503:
                        if (p2.equals("TLSv1.1")) {
                            return okhttp3.TlsVersion.e;
                        }
                    case -503070502:
                        if (p2.equals("TLSv1.2")) {
                            return okhttp3.TlsVersion.d;
                        }
                    case -503070501:
                        if (p2.equals("TLSv1.3")) {
                            return okhttp3.TlsVersion.c;
                        }
                    default:
                }
            }
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(p2));
    }
}
