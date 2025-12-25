package okhttp3.internal.connection;
public final class FastFallbackExchangeFinder$launchTcpConnect$1 extends okhttp3.internal.concurrent.Task {
    public final synthetic okhttp3.internal.connection.RoutePlanner$Plan e;
    public final synthetic okhttp3.internal.connection.FastFallbackExchangeFinder f;

    public FastFallbackExchangeFinder$launchTcpConnect$1(String p1, okhttp3.internal.connection.RoutePlanner$Plan p2, okhttp3.internal.connection.FastFallbackExchangeFinder p3)
    {
        this.e = p2;
        this.f = p3;
        super(p1, 1);
        return;
    }

    public final long a()
    {
        long v0_0 = this.e;
        try {
            okhttp3.internal.connection.RoutePlanner$ConnectResult v1_0 = v0_0.g();
        } catch (okhttp3.internal.connection.RoutePlanner$ConnectResult v1_1) {
            v1_0 = new okhttp3.internal.connection.RoutePlanner$ConnectResult(v0_0, 0, v1_1, 2);
        }
        okhttp3.internal.connection.FastFallbackExchangeFinder v2_2 = this.f;
        if (v2_2.e.contains(v0_0)) {
            v2_2.f.put(v1_0);
        }
        return -1;
    }
}
