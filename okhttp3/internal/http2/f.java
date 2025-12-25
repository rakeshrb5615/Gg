package okhttp3.internal.http2;
public final synthetic class f implements u7.a {
    public final synthetic okhttp3.internal.http2.Http2Connection a;
    public final synthetic int b;
    public final synthetic int c;

    public synthetic f(okhttp3.internal.http2.Http2Connection p1, int p2, int p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object invoke()
    {
        h7.l v0_0 = this.a;
        try {
            v0_0.C.y(this.b, 1, this.c);
        } catch (java.io.IOException v1_1) {
            v0_0.c(okhttp3.internal.http2.ErrorCode.d, okhttp3.internal.http2.ErrorCode.d, v1_1);
        }
        return h7.l.a;
    }
}
