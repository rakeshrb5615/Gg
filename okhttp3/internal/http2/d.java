package okhttp3.internal.http2;
public final synthetic class d implements u7.a {
    public final synthetic int a;
    public final synthetic okhttp3.internal.http2.Http2Connection b;
    public final synthetic int c;
    public final synthetic Object d;

    public synthetic d(okhttp3.internal.http2.Http2Connection p1, int p2, Object p3, int p4)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public synthetic d(okhttp3.internal.http2.Http2Connection p1, int p2, java.util.List p3, boolean p4)
    {
        this.a = 1;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                h7.l v0_2 = this.b;
                Throwable v1_2 = this.c;
                ((okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel) v0_2.q).getClass();
                try {
                    v0_2.C.z(v1_2, okhttp3.internal.http2.ErrorCode.n);
                } catch (java.io.IOException) {
                    return h7.l.a;
                }
                v0_2.E.remove(Integer.valueOf(v1_2));
                return h7.l.a;
            case 1:
                h7.l v0_3 = this.b;
                Throwable v1_4 = this.c;
                ((okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel) v0_3.q).getClass();
                try {
                    v0_3.C.z(v1_4, okhttp3.internal.http2.ErrorCode.n);
                } catch (java.io.IOException) {
                    return h7.l.a;
                }
                v0_3.E.remove(Integer.valueOf(v1_4));
                return h7.l.a;
            default:
                h7.l v0_5 = this.b;
                try {
                    v0_5.C.z(this.c, ((okhttp3.internal.http2.ErrorCode) this.d));
                } catch (Throwable v1_7) {
                    v0_5.c(okhttp3.internal.http2.ErrorCode.d, okhttp3.internal.http2.ErrorCode.d, v1_7);
                }
                return h7.l.a;
        }
    }
}
