package okhttp3;
public final class CertificatePinner {
    public static final okhttp3.CertificatePinner$Companion c;
    public static final okhttp3.CertificatePinner d;
    public final java.util.Set a;
    public final okhttp3.internal.tls.CertificateChainCleaner b;

    static CertificatePinner()
    {
        okhttp3.CertificatePinner.c = new okhttp3.CertificatePinner$Companion(0);
        okhttp3.CertificatePinner.d = new okhttp3.CertificatePinner(i7.i.n0(new okhttp3.CertificatePinner$Builder().a), 0);
        return;
    }

    public CertificatePinner(java.util.Set p1, okhttp3.internal.tls.CertificateChainCleaner p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof okhttp3.CertificatePinner)) || ((!kotlin.jvm.internal.j.a(((okhttp3.CertificatePinner) p3).a, this.a)) || (!kotlin.jvm.internal.j.a(((okhttp3.CertificatePinner) p3).b, this.b)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_4 = ((this.a.hashCode() + 1517) * 41);
        int v1_0 = this.b;
        if (v1_0 == 0) {
            v1_1 = 0;
        } else {
            v1_1 = v1_0.hashCode();
        }
        return (v0_4 + v1_1);
    }
}
