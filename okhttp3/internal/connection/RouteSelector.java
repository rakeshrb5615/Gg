package okhttp3.internal.connection;
public final class RouteSelector {
    public static final okhttp3.internal.connection.RouteSelector$Companion i;
    public final okhttp3.Address a;
    public final okhttp3.internal.connection.RouteDatabase b;
    public final okhttp3.internal.connection.RealCall c;
    public final boolean d;
    public final java.util.List e;
    public int f;
    public Object g;
    public final java.util.ArrayList h;

    static RouteSelector()
    {
        okhttp3.internal.connection.RouteSelector.i = new okhttp3.internal.connection.RouteSelector$Companion(0);
        return;
    }

    public RouteSelector(okhttp3.Address p3, okhttp3.internal.connection.RouteDatabase p4, okhttp3.internal.connection.RealCall p5, boolean p6)
    {
        java.util.List v3_3;
        kotlin.jvm.internal.j.e(p4, "routeDatabase");
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
        okhttp3.HttpUrl v4_4 = i7.n.a;
        this.e = v4_4;
        this.g = v4_4;
        this.h = new java.util.ArrayList();
        okhttp3.HttpUrl v4_3 = p3.h;
        okhttp3.EventListener v6_1 = p5.d;
        v6_1.r(p5, v4_3);
        boolean v0_1 = v4_3.h();
        if (v0_1.getHost() != null) {
            java.util.List v3_2 = p3.g.select(v0_1);
            if ((v3_2 != null) && (!v3_2.isEmpty())) {
                v3_3 = okhttp3.internal._UtilJvmKt.i(v3_2);
            } else {
                v3_3 = okhttp3.internal._UtilJvmKt.j(new java.net.Proxy[] {java.net.Proxy.NO_PROXY}));
            }
        } else {
            v3_3 = okhttp3.internal._UtilJvmKt.j(new java.net.Proxy[] {java.net.Proxy.NO_PROXY}));
        }
        this.e = v3_3;
        this.f = 0;
        v6_1.q(p5, v4_3, v3_3);
        return;
    }

    public final boolean a()
    {
        if ((this.f >= this.e.size()) && (this.h.isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }
}
