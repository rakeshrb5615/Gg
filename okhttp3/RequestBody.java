package okhttp3;
public abstract class RequestBody {
    public static final okhttp3.RequestBody$Companion a;

    static RequestBody()
    {
        okhttp3.RequestBody.a = new okhttp3.RequestBody$Companion(0);
        x8.j v0_2 = x8.j.d;
        kotlin.jvm.internal.j.e(v0_2, "<this>");
        new okhttp3.RequestBody$Companion$toRequestBody$1(0, v0_2);
        return;
    }

    public RequestBody()
    {
        return;
    }

    public long a()
    {
        return -1;
    }

    public abstract okhttp3.MediaType b();

    public boolean c()
    {
        return (this instanceof okhttp3.RequestBody$Companion$toRequestBody$2);
    }

    public abstract void d();
}
