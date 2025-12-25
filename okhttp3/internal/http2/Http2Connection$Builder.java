package okhttp3.internal.http2;
public final class Http2Connection$Builder {
    public final okhttp3.internal.concurrent.TaskRunner a;
    public okhttp3.internal.connection.BufferedSocket b;
    public String c;
    public okhttp3.internal.http2.Http2Connection$Listener d;
    public final okhttp3.internal.http2.PushObserver e;
    public okhttp3.internal.http2.FlowControlListener f;

    public Http2Connection$Builder(okhttp3.internal.concurrent.TaskRunner p2)
    {
        kotlin.jvm.internal.j.e(p2, "taskRunner");
        this.a = p2;
        this.d = okhttp3.internal.http2.Http2Connection$Listener.a;
        this.e = okhttp3.internal.http2.PushObserver.a;
        this.f = okhttp3.internal.http2.FlowControlListener$None.a;
        return;
    }
}
