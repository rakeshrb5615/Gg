package okhttp3.internal.connection;
public final synthetic class a implements u7.a {
    public final synthetic okhttp3.CertificatePinner a;
    public final synthetic okhttp3.Handshake b;
    public final synthetic okhttp3.Address c;

    public synthetic a(okhttp3.CertificatePinner p1, okhttp3.Handshake p2, okhttp3.Address p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object invoke()
    {
        java.util.List v0_2 = this.a.b;
        kotlin.jvm.internal.j.b(v0_2);
        return v0_2.a(this.c.h.d, this.b.a());
    }
}
