package okhttp3.internal.http2;
public final synthetic class a implements u7.a {
    public final synthetic okhttp3.internal.http2.Http2Connection a;
    public final synthetic int b;
    public final synthetic x8.g c;
    public final synthetic int d;

    public synthetic a(okhttp3.internal.http2.Http2Connection p1, int p2, x8.g p3, int p4, boolean p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final Object invoke()
    {
        h7.l v0_0 = this.a;
        Throwable v1_0 = this.b;
        java.util.LinkedHashSet v2_2 = this.c;
        okhttp3.internal.http2.ErrorCode v3_1 = this.d;
        try {
            ((okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel) v0_0.q).getClass();
            v2_2.skip(((long) v3_1));
            v0_0.C.z(v1_0, okhttp3.internal.http2.ErrorCode.n);
        } catch (java.io.IOException) {
            return h7.l.a;
        }
        v0_0.E.remove(Integer.valueOf(v1_0));
        return h7.l.a;
    }
}
