package okhttp3.internal.http;
public final class HttpMethod {
    public static final okhttp3.internal.http.HttpMethod a;

    static HttpMethod()
    {
        okhttp3.internal.http.HttpMethod.a = new okhttp3.internal.http.HttpMethod();
        return;
    }

    private HttpMethod()
    {
        return;
    }

    public static final boolean a(String p1)
    {
        kotlin.jvm.internal.j.e(p1, "method");
        if ((p1.equals("GET")) || (p1.equals("HEAD"))) {
            return 0;
        } else {
            return 1;
        }
    }
}
