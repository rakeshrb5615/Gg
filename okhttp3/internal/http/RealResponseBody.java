package okhttp3.internal.http;
public final class RealResponseBody extends okhttp3.ResponseBody {
    public final String d;
    public final long e;
    public final x8.b0 f;

    public RealResponseBody(String p1, long p2, x8.b0 p4)
    {
        this.d = p1;
        this.e = p2;
        this.f = p4;
        return;
    }

    public final long c()
    {
        return this.e;
    }

    public final okhttp3.MediaType f()
    {
        okhttp3.MediaType v0 = 0;
        String v1 = this.d;
        try {
            if (v1 != null) {
                okhttp3.MediaType.e.getClass();
                v0 = okhttp3.MediaType$Companion.a(v1);
            }
        } catch (IllegalArgumentException) {
        }
        return v0;
    }

    public final x8.i i()
    {
        return this.f;
    }
}
