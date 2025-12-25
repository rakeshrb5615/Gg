package okhttp3.internal.connection;
public final class ReusePlan implements okhttp3.internal.connection.RoutePlanner$Plan {
    public final okhttp3.internal.connection.RealConnection a;

    public ReusePlan(okhttp3.internal.connection.RealConnection p2)
    {
        kotlin.jvm.internal.j.e(p2, "connection");
        this.a = p2;
        return;
    }

    public final okhttp3.internal.connection.RoutePlanner$Plan a()
    {
        throw new IllegalStateException("unexpected retry");
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult c()
    {
        throw new IllegalStateException("already connected");
    }

    public final void cancel()
    {
        throw new IllegalStateException("unexpected cancel");
    }

    public final okhttp3.internal.connection.RealConnection d()
    {
        return this.a;
    }

    public final boolean e()
    {
        return 1;
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult g()
    {
        throw new IllegalStateException("already connected");
    }
}
