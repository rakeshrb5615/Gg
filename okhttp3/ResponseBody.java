package okhttp3;
public abstract class ResponseBody implements java.io.Closeable {
    public static final okhttp3.ResponseBody$Companion b;
    public static final okhttp3.ResponseBody$Companion$asResponseBody$1 c;
    public okhttp3.ResponseBody$BomAwareReader a;

    static ResponseBody()
    {
        okhttp3.ResponseBody.b = new okhttp3.ResponseBody$Companion(0);
        okhttp3.ResponseBody$Companion$asResponseBody$1 v0_6 = x8.j.d;
        kotlin.jvm.internal.j.e(v0_6, "<this>");
        x8.g v1_3 = new x8.g();
        v1_3.K(v0_6);
        okhttp3.ResponseBody.c = new okhttp3.ResponseBody$Companion$asResponseBody$1(0, ((long) v0_6.a.length), v1_3);
        return;
    }

    public ResponseBody()
    {
        return;
    }

    public abstract long c();

    public void close()
    {
        okhttp3.internal._UtilCommonKt.b(this.i());
        return;
    }

    public abstract okhttp3.MediaType f();

    public abstract x8.i i();
}
