package okhttp3.internal.tls;
public abstract class CertificateChainCleaner {
    public static final okhttp3.internal.tls.CertificateChainCleaner$Companion a;

    static CertificateChainCleaner()
    {
        okhttp3.internal.tls.CertificateChainCleaner.a = new okhttp3.internal.tls.CertificateChainCleaner$Companion(0);
        return;
    }

    public CertificateChainCleaner()
    {
        return;
    }

    public abstract java.util.List a();
}
