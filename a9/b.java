package a9;
public final class b implements z8.m {
    public static final okhttp3.MediaType c;
    public final w6.m a;
    public final w6.z b;

    static b()
    {
        okhttp3.MediaType.e.getClass();
        a9.b.c = okhttp3.MediaType$Companion.a("application/json; charset=UTF-8");
        return;
    }

    public b(w6.m p1, w6.z p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Object e(Object p5)
    {
        okhttp3.RequestBody$Companion$toRequestBody$1 v0_1 = new x8.g();
        okhttp3.MediaType v1_8 = new java.io.OutputStreamWriter(v0_1.r(), java.nio.charset.StandardCharsets.UTF_8);
        w6.m v2_1 = this.a;
        v2_1.getClass();
        e7.b v3_0 = new e7.b(v1_8);
        v3_0.D(v2_1.g);
        v3_0.o = v2_1.f;
        v3_0.n = 2;
        v3_0.q = 0;
        this.b.c(v3_0, p5);
        v3_0.close();
        x8.j v5_1 = v0_1.e(v0_1.b);
        okhttp3.RequestBody.a.getClass();
        kotlin.jvm.internal.j.e(v5_1, "content");
        return new okhttp3.RequestBody$Companion$toRequestBody$1(a9.b.c, v5_1);
    }
}
