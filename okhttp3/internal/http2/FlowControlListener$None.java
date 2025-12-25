package okhttp3.internal.http2;
public final class FlowControlListener$None implements okhttp3.internal.http2.FlowControlListener {
    public static final okhttp3.internal.http2.FlowControlListener$None a;

    static FlowControlListener$None()
    {
        okhttp3.internal.http2.FlowControlListener$None.a = new okhttp3.internal.http2.FlowControlListener$None();
        return;
    }

    private FlowControlListener$None()
    {
        return;
    }

    public final void a(okhttp3.internal.http2.flowcontrol.WindowCounter p1)
    {
        return;
    }

    public final void b(okhttp3.internal.http2.flowcontrol.WindowCounter p2)
    {
        kotlin.jvm.internal.j.e(p2, "windowCounter");
        return;
    }
}
