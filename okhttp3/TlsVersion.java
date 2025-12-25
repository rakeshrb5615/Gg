package okhttp3;
public final enum class TlsVersion extends java.lang.Enum {
    public static final okhttp3.TlsVersion$Companion b;
    public static final enum okhttp3.TlsVersion c;
    public static final enum okhttp3.TlsVersion d;
    public static final enum okhttp3.TlsVersion e;
    public static final enum okhttp3.TlsVersion f;
    public static final enum okhttp3.TlsVersion m;
    public static final synthetic okhttp3.TlsVersion[] n;
    public final String a;

    static TlsVersion()
    {
        okhttp3.TlsVersion$Companion v0_4 = new okhttp3.TlsVersion("TLS_1_3", 0, "TLSv1.3");
        okhttp3.TlsVersion.c = v0_4;
        okhttp3.TlsVersion v1_1 = new okhttp3.TlsVersion("TLS_1_2", 1, "TLSv1.2");
        okhttp3.TlsVersion.d = v1_1;
        okhttp3.TlsVersion v2_1 = new okhttp3.TlsVersion("TLS_1_1", 2, "TLSv1.1");
        okhttp3.TlsVersion.e = v2_1;
        okhttp3.TlsVersion v4_2 = new okhttp3.TlsVersion("TLS_1_0", 3, "TLSv1");
        okhttp3.TlsVersion.f = v4_2;
        okhttp3.TlsVersion v5_3 = new okhttp3.TlsVersion("SSL_3_0", 4, "SSLv3");
        okhttp3.TlsVersion.m = v5_3;
        okhttp3.TlsVersion$Companion v0_1 = new okhttp3.TlsVersion[] {v0_4, v1_1, v2_1, v4_2, v5_3});
        okhttp3.TlsVersion.n = v0_1;
        c4.b.x(v0_1);
        okhttp3.TlsVersion.b = new okhttp3.TlsVersion$Companion(0);
        return;
    }

    public TlsVersion(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static okhttp3.TlsVersion valueOf(String p1)
    {
        return ((okhttp3.TlsVersion) Enum.valueOf(okhttp3.TlsVersion, p1));
    }

    public static okhttp3.TlsVersion[] values()
    {
        return ((okhttp3.TlsVersion[]) okhttp3.TlsVersion.n.clone());
    }
}
