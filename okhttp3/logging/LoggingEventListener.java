package okhttp3.logging;
public final class LoggingEventListener extends okhttp3.EventListener {
    public long b;

    static LoggingEventListener()
    {
        new okhttp3.logging.LoggingEventListener$Companion(0);
        return;
    }

    public final void A(okhttp3.Call p2, okhttp3.Response p3)
    {
        String v2_1 = new StringBuilder("responseHeadersEnd: ");
        v2_1.append(p3);
        this.G(v2_1.toString());
        return;
    }

    public final void B(okhttp3.Call p1)
    {
        this.G("responseHeadersStart");
        return;
    }

    public final void D(okhttp3.Call p2, okhttp3.Response p3)
    {
        kotlin.jvm.internal.j.e(p2, "call");
        String v2_2 = new StringBuilder("satisfactionFailure: ");
        v2_2.append(p3);
        this.G(v2_2.toString());
        return;
    }

    public final void E(okhttp3.Call p2, okhttp3.Handshake p3)
    {
        String v2_1 = new StringBuilder("secureConnectEnd: ");
        v2_1.append(p3);
        this.G(v2_1.toString());
        return;
    }

    public final void F(okhttp3.Call p1)
    {
        this.G("secureConnectStart");
        return;
    }

    public final void G(String p6)
    {
        String v0_2 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - this.b));
        StringBuilder v2_1 = new StringBuilder("[");
        v2_1.append(v0_2);
        v2_1.append(" ms] ");
        v2_1.append(p6);
        throw 0;
    }

    public final void a(okhttp3.Call p2, okhttp3.Response p3)
    {
        kotlin.jvm.internal.j.e(p2, "call");
        kotlin.jvm.internal.j.e(p3, "cachedResponse");
        String v2_3 = new StringBuilder("cacheConditionalHit: ");
        v2_3.append(p3);
        this.G(v2_3.toString());
        return;
    }

    public final void b(okhttp3.Call p2, okhttp3.Response p3)
    {
        kotlin.jvm.internal.j.e(p2, "call");
        String v2_2 = new StringBuilder("cacheHit: ");
        v2_2.append(p3);
        this.G(v2_2.toString());
        return;
    }

    public final void c(okhttp3.internal.connection.RealCall p1)
    {
        this.G("callEnd");
        return;
    }

    public final void d(okhttp3.internal.connection.RealCall p2, java.io.IOException p3)
    {
        String v2_1 = new StringBuilder("callFailed: ");
        v2_1.append(p3);
        this.G(v2_1.toString());
        return;
    }

    public final void e(okhttp3.internal.connection.RealCall p3)
    {
        this.b = System.nanoTime();
        StringBuilder v0_2 = new StringBuilder("callStart: ");
        v0_2.append(p3.b);
        this.G(v0_2.toString());
        return;
    }

    public final void f(okhttp3.internal.connection.RealCall p1)
    {
        this.G("canceled");
        return;
    }

    public final void g(okhttp3.Call p1, java.net.InetSocketAddress p2, java.net.Proxy p3, okhttp3.Protocol p4)
    {
        kotlin.jvm.internal.j.e(p2, "inetSocketAddress");
        String v1_2 = new StringBuilder("connectEnd: ");
        v1_2.append(p4);
        this.G(v1_2.toString());
        return;
    }

    public final void h(okhttp3.Call p1, java.net.InetSocketAddress p2, java.net.Proxy p3, java.io.IOException p4)
    {
        kotlin.jvm.internal.j.e(p2, "inetSocketAddress");
        String v1_2 = new StringBuilder("connectFailed: null ");
        v1_2.append(p4);
        this.G(v1_2.toString());
        return;
    }

    public final void i(okhttp3.Call p2, java.net.InetSocketAddress p3, java.net.Proxy p4)
    {
        kotlin.jvm.internal.j.e(p3, "inetSocketAddress");
        String v2_3 = new StringBuilder("connectStart: ");
        v2_3.append(p3);
        v2_3.append(32);
        v2_3.append(p4);
        this.G(v2_3.toString());
        return;
    }

    public final void j(okhttp3.Call p2, okhttp3.Connection p3)
    {
        kotlin.jvm.internal.j.e(p3, "connection");
        String v2_2 = new StringBuilder("connectionAcquired: ");
        v2_2.append(p3);
        this.G(v2_2.toString());
        return;
    }

    public final void k(okhttp3.Call p1, okhttp3.Connection p2)
    {
        kotlin.jvm.internal.j.e(p2, "connection");
        this.G("connectionReleased");
        return;
    }

    public final void l(okhttp3.internal.connection.RealCall p3, okhttp3.Dispatcher p4)
    {
        kotlin.jvm.internal.j.e(p4, "dispatcher");
        StringBuilder v0_2 = new StringBuilder("dispatcherQueueEnd: ");
        v0_2.append(p3);
        v0_2.append(" queuedCallsCount=");
        v0_2.append(p4.b.size());
        this.G(v0_2.toString());
        return;
    }

    public final void m(okhttp3.internal.connection.RealCall p3, okhttp3.Dispatcher p4)
    {
        kotlin.jvm.internal.j.e(p4, "dispatcher");
        StringBuilder v0_2 = new StringBuilder("dispatcherQueueStart: ");
        v0_2.append(p3);
        v0_2.append(" queuedCallsCount=");
        v0_2.append(p4.b.size());
        this.G(v0_2.toString());
        return;
    }

    public final void n(okhttp3.internal.connection.RealCall p1, String p2, java.util.List p3)
    {
        String v1_1 = new StringBuilder("dnsEnd: ");
        v1_1.append(p3);
        this.G(v1_1.toString());
        return;
    }

    public final void o(okhttp3.internal.connection.RealCall p1, String p2)
    {
        this.G("dnsStart: ".concat(p2));
        return;
    }

    public final void q(okhttp3.internal.connection.RealCall p1, okhttp3.HttpUrl p2, java.util.List p3)
    {
        kotlin.jvm.internal.j.e(p2, "url");
        String v1_2 = new StringBuilder("proxySelectEnd: ");
        v1_2.append(p3);
        this.G(v1_2.toString());
        return;
    }

    public final void r(okhttp3.internal.connection.RealCall p2, okhttp3.HttpUrl p3)
    {
        kotlin.jvm.internal.j.e(p3, "url");
        String v2_2 = new StringBuilder("proxySelectStart: ");
        v2_2.append(p3);
        this.G(v2_2.toString());
        return;
    }

    public final void s(okhttp3.Call p2, long p3)
    {
        String v2_1 = new StringBuilder("requestBodyEnd: byteCount=");
        v2_1.append(p3);
        this.G(v2_1.toString());
        return;
    }

    public final void t(okhttp3.Call p1)
    {
        this.G("requestBodyStart");
        return;
    }

    public final void u(okhttp3.Call p2, java.io.IOException p3)
    {
        kotlin.jvm.internal.j.e(p3, "ioe");
        String v2_2 = new StringBuilder("requestFailed: ");
        v2_2.append(p3);
        this.G(v2_2.toString());
        return;
    }

    public final void v(okhttp3.Call p1, okhttp3.Request p2)
    {
        this.G("requestHeadersEnd");
        return;
    }

    public final void w(okhttp3.Call p1)
    {
        this.G("requestHeadersStart");
        return;
    }

    public final void x(okhttp3.Call p2, long p3)
    {
        String v2_1 = new StringBuilder("responseBodyEnd: byteCount=");
        v2_1.append(p3);
        this.G(v2_1.toString());
        return;
    }

    public final void y(okhttp3.Call p1)
    {
        this.G("responseBodyStart");
        return;
    }

    public final void z(okhttp3.Call p2, java.io.IOException p3)
    {
        kotlin.jvm.internal.j.e(p3, "ioe");
        String v2_2 = new StringBuilder("responseFailed: ");
        v2_2.append(p3);
        this.G(v2_2.toString());
        return;
    }
}
