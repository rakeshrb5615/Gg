package okhttp3;
public final class OkHttpClient$Builder {
    public final okhttp3.Dispatcher a;
    public okhttp3.ConnectionPool b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public final a5.a e;
    public final boolean f;
    public final boolean g;
    public final okhttp3.Authenticator h;
    public final boolean i;
    public final boolean j;
    public final okhttp3.CookieJar k;
    public final okhttp3.Dns l;
    public final okhttp3.Authenticator m;
    public final javax.net.SocketFactory n;
    public final java.util.List o;
    public final java.util.List p;
    public final okhttp3.internal.tls.OkHostnameVerifier q;
    public final okhttp3.CertificatePinner r;
    public final int s;
    public final int t;
    public final int u;

    public OkHttpClient$Builder()
    {
        this.a = new okhttp3.Dispatcher();
        this.c = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
        int v0_1 = okhttp3.EventListener.a;
        kotlin.jvm.internal.j.e(v0_1, "<this>");
        this.e = new a5.a(v0_1, 15);
        this.f = 1;
        this.g = 1;
        String v1_3 = okhttp3.Authenticator.a;
        this.h = v1_3;
        this.i = 1;
        this.j = 1;
        this.k = okhttp3.CookieJar.a;
        this.l = okhttp3.Dns.a;
        this.m = v1_3;
        int v0_6 = javax.net.SocketFactory.getDefault();
        kotlin.jvm.internal.j.d(v0_6, "getDefault(...)");
        this.n = v0_6;
        okhttp3.OkHttpClient.B.getClass();
        this.o = okhttp3.OkHttpClient.D;
        this.p = okhttp3.OkHttpClient.C;
        this.q = okhttp3.internal.tls.OkHostnameVerifier.a;
        this.r = okhttp3.CertificatePinner.d;
        this.s = 10000;
        this.t = 10000;
        this.u = 10000;
        return;
    }
}
