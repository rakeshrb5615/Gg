package okhttp3;
public interface CookieJar {
    public static final okhttp3.CookieJar a;

    static CookieJar()
    {
        okhttp3.CookieJar.a = new okhttp3.CookieJar$Companion$NoCookies();
        return;
    }

    public abstract void a();

    public abstract void b();
}
