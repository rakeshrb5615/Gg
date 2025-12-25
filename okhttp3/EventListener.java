package okhttp3;
public abstract class EventListener {
    public static final okhttp3.EventListener$Companion$NONE$1 a;

    static EventListener()
    {
        new okhttp3.EventListener$Companion(0);
        okhttp3.EventListener.a = new okhttp3.EventListener$Companion$NONE$1();
        return;
    }

    public EventListener()
    {
        return;
    }

    public void A(okhttp3.Call p1, okhttp3.Response p2)
    {
        return;
    }

    public void B(okhttp3.Call p1)
    {
        return;
    }

    public void C(okhttp3.internal.connection.RealCall p1, java.io.IOException p2)
    {
        return;
    }

    public void D(okhttp3.Call p1, okhttp3.Response p2)
    {
        kotlin.jvm.internal.j.e(p1, "call");
        return;
    }

    public void E(okhttp3.Call p1, okhttp3.Handshake p2)
    {
        return;
    }

    public void F(okhttp3.Call p1)
    {
        return;
    }

    public void a(okhttp3.Call p2, okhttp3.Response p3)
    {
        kotlin.jvm.internal.j.e(p2, "call");
        kotlin.jvm.internal.j.e(p3, "cachedResponse");
        return;
    }

    public void b(okhttp3.Call p1, okhttp3.Response p2)
    {
        kotlin.jvm.internal.j.e(p1, "call");
        return;
    }

    public void c(okhttp3.internal.connection.RealCall p1)
    {
        return;
    }

    public void d(okhttp3.internal.connection.RealCall p1, java.io.IOException p2)
    {
        return;
    }

    public void e(okhttp3.internal.connection.RealCall p1)
    {
        return;
    }

    public void f(okhttp3.internal.connection.RealCall p1)
    {
        return;
    }

    public void g(okhttp3.Call p1, java.net.InetSocketAddress p2, java.net.Proxy p3, okhttp3.Protocol p4)
    {
        kotlin.jvm.internal.j.e(p2, "inetSocketAddress");
        return;
    }

    public void h(okhttp3.Call p1, java.net.InetSocketAddress p2, java.net.Proxy p3, java.io.IOException p4)
    {
        kotlin.jvm.internal.j.e(p2, "inetSocketAddress");
        return;
    }

    public void i(okhttp3.Call p1, java.net.InetSocketAddress p2, java.net.Proxy p3)
    {
        kotlin.jvm.internal.j.e(p2, "inetSocketAddress");
        return;
    }

    public void j(okhttp3.Call p1, okhttp3.Connection p2)
    {
        kotlin.jvm.internal.j.e(p2, "connection");
        return;
    }

    public void k(okhttp3.Call p1, okhttp3.Connection p2)
    {
        kotlin.jvm.internal.j.e(p2, "connection");
        return;
    }

    public void l(okhttp3.internal.connection.RealCall p1, okhttp3.Dispatcher p2)
    {
        kotlin.jvm.internal.j.e(p2, "dispatcher");
        return;
    }

    public void m(okhttp3.internal.connection.RealCall p1, okhttp3.Dispatcher p2)
    {
        kotlin.jvm.internal.j.e(p2, "dispatcher");
        return;
    }

    public void n(okhttp3.internal.connection.RealCall p1, String p2, java.util.List p3)
    {
        return;
    }

    public void o(okhttp3.internal.connection.RealCall p1, String p2)
    {
        return;
    }

    public void p(okhttp3.internal.connection.RealCall p1, okhttp3.Response p2)
    {
        return;
    }

    public void q(okhttp3.internal.connection.RealCall p1, okhttp3.HttpUrl p2, java.util.List p3)
    {
        kotlin.jvm.internal.j.e(p2, "url");
        return;
    }

    public void r(okhttp3.internal.connection.RealCall p1, okhttp3.HttpUrl p2)
    {
        kotlin.jvm.internal.j.e(p2, "url");
        return;
    }

    public void s(okhttp3.Call p1, long p2)
    {
        return;
    }

    public void t(okhttp3.Call p1)
    {
        return;
    }

    public void u(okhttp3.Call p1, java.io.IOException p2)
    {
        kotlin.jvm.internal.j.e(p2, "ioe");
        return;
    }

    public void v(okhttp3.Call p1, okhttp3.Request p2)
    {
        return;
    }

    public void w(okhttp3.Call p1)
    {
        return;
    }

    public void x(okhttp3.Call p1, long p2)
    {
        return;
    }

    public void y(okhttp3.Call p1)
    {
        return;
    }

    public void z(okhttp3.Call p1, java.io.IOException p2)
    {
        kotlin.jvm.internal.j.e(p2, "ioe");
        return;
    }
}
