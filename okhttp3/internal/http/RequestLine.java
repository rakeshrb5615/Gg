package okhttp3.internal.http;
public final class RequestLine {
    public static final okhttp3.internal.http.RequestLine a;

    static RequestLine()
    {
        okhttp3.internal.http.RequestLine.a = new okhttp3.internal.http.RequestLine();
        return;
    }

    private RequestLine()
    {
        return;
    }

    public static String a(okhttp3.HttpUrl p2)
    {
        kotlin.jvm.internal.j.e(p2, "url");
        int v0_2 = p2.b();
        String v2_2 = p2.d();
        if (v2_2 == null) {
            return v0_2;
        } else {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(v0_2);
            v1_1.append(63);
            v1_1.append(v2_2);
            return v1_1.toString();
        }
    }
}
