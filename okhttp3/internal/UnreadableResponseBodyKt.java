package okhttp3.internal;
public final class UnreadableResponseBodyKt {

    public static final okhttp3.Response a(okhttp3.Response p5)
    {
        kotlin.jvm.internal.j.e(p5, "<this>");
        okhttp3.Response$Builder v0_1 = p5.c();
        okhttp3.Response v5_2 = p5.m;
        v0_1.g = new okhttp3.internal.UnreadableResponseBody(v5_2.f(), v5_2.c());
        return v0_1.a();
    }
}
