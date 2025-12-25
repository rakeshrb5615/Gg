package okhttp3;
public interface Dns {
    public static final okhttp3.Dns a;

    static Dns()
    {
        okhttp3.Dns.a = new okhttp3.Dns$Companion$DnsSystem();
        return;
    }

    public abstract java.util.List a();
}
