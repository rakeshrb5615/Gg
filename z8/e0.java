package z8;
public final class e0 extends z8.z0 {
    public final synthetic int d;
    public final reflect.Method e;
    public final int f;

    public synthetic e0(reflect.Method p1, int p2, int p3)
    {
        this.d = p3;
        this.e = p1;
        this.f = p2;
        return;
    }

    public final void a(z8.n0 p5, Object p6)
    {
        switch (this.d) {
            case 0:
                int v0_1 = 0;
                if (((okhttp3.Headers) p6) == null) {
                    Object[] v6_4 = new Object[0];
                    throw z8.z0.n(this.e, this.f, "Headers parameter must not be null.", v6_4);
                } else {
                    IllegalArgumentException v5_2 = p5.f;
                    v5_2.getClass();
                    int v1_0 = ((okhttp3.Headers) p6).size();
                    while (v0_1 < v1_0) {
                        okhttp3.internal._HeadersCommonKt.a(v5_2, ((okhttp3.Headers) p6).c(v0_1), ((okhttp3.Headers) p6).e(v0_1));
                        v0_1++;
                    }
                    return;
                }
            default:
                if (p6 == null) {
                    IllegalArgumentException v5_4 = new Object[0];
                    throw z8.z0.n(this.e, this.f, "@Url parameter is null.", v5_4);
                } else {
                    p5.c = p6.toString();
                    return;
                }
        }
    }
}
