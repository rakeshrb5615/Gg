package okhttp3;
public class Request$Builder {
    public okhttp3.HttpUrl a;
    public String b;
    public okhttp3.Headers$Builder c;
    public okhttp3.RequestBody d;
    public okhttp3.internal.Tags e;

    public Request$Builder()
    {
        this.e = okhttp3.internal.EmptyTags.a;
        this.b = "GET";
        this.c = new okhttp3.Headers$Builder();
        return;
    }

    public final void a(String p2, String p3)
    {
        kotlin.jvm.internal.j.e(p3, "value");
        okhttp3.Headers$Builder v0_1 = this.c;
        v0_1.getClass();
        okhttp3.internal._HeadersCommonKt.b(p2);
        okhttp3.internal._HeadersCommonKt.c(p3, p2);
        v0_1.d(p2);
        okhttp3.internal._HeadersCommonKt.a(v0_1, p2, p3);
        return;
    }

    public final void b(String p3, okhttp3.RequestBody p4)
    {
        kotlin.jvm.internal.j.e(p3, "method");
        if (p3.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        } else {
            if (p4 != null) {
                if (!okhttp3.internal.http.HttpMethod.a(p3)) {
                    throw new IllegalArgumentException(v1.a.l("method ", p3, " must not have a request body.").toString());
                }
            } else {
                if ((p3.equals("POST")) || ((p3.equals("PUT")) || ((p3.equals("PATCH")) || ((p3.equals("PROPPATCH")) || ((p3.equals("QUERY")) || (p3.equals("REPORT"))))))) {
                    throw new IllegalArgumentException(v1.a.l("method ", p3, " must have a request body.").toString());
                }
            }
            this.b = p3;
            this.d = p4;
            return;
        }
    }
}
