package okhttp3.internal.cache;
public final class CacheInterceptor$Companion {

    private CacheInterceptor$Companion()
    {
        return;
    }

    public synthetic CacheInterceptor$Companion(int p1)
    {
        return;
    }

    public static boolean a(String p1)
    {
        if (("Connection".equalsIgnoreCase(p1)) || (("Keep-Alive".equalsIgnoreCase(p1)) || (("Proxy-Authenticate".equalsIgnoreCase(p1)) || (("Proxy-Authorization".equalsIgnoreCase(p1)) || (("TE".equalsIgnoreCase(p1)) || (("Trailers".equalsIgnoreCase(p1)) || (("Transfer-Encoding".equalsIgnoreCase(p1)) || ("Upgrade".equalsIgnoreCase(p1))))))))) {
            return 0;
        } else {
            return 1;
        }
    }
}
