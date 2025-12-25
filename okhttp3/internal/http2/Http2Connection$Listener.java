package okhttp3.internal.http2;
public abstract class Http2Connection$Listener {
    public static final okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 a;

    static Http2Connection$Listener()
    {
        new okhttp3.internal.http2.Http2Connection$Listener$Companion(0);
        okhttp3.internal.http2.Http2Connection$Listener.a = new okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();
        return;
    }

    public Http2Connection$Listener()
    {
        return;
    }

    public void a(okhttp3.internal.http2.Http2Connection p1, okhttp3.internal.http2.Settings p2)
    {
        kotlin.jvm.internal.j.e(p2, "settings");
        return;
    }

    public abstract void c();
}
