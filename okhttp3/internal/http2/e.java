package okhttp3.internal.http2;
public final synthetic class e implements u7.a {
    public final synthetic okhttp3.internal.http2.Http2Connection a;
    public final synthetic int b;

    public synthetic e(okhttp3.internal.http2.Http2Connection p1, int p2, okhttp3.internal.http2.ErrorCode p3)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Object invoke()
    {
        h7.l v0_0 = this.a;
        Throwable v1_0 = this.b;
        ((okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel) v0_0.q).getClass();
        try {
            v0_0.E.remove(Integer.valueOf(v1_0));
            return h7.l.a;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }
}
