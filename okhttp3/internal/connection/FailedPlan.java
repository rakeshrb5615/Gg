package okhttp3.internal.connection;
public final class FailedPlan implements okhttp3.internal.connection.RoutePlanner$Plan {
    public final okhttp3.internal.connection.RoutePlanner$ConnectResult a;

    public FailedPlan(Throwable p4)
    {
        this.a = new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, 0, p4, 2);
        return;
    }

    public final okhttp3.internal.connection.RoutePlanner$Plan a()
    {
        throw new IllegalStateException("unexpected retry");
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult c()
    {
        return this.a;
    }

    public final void cancel()
    {
        throw new IllegalStateException("unexpected cancel");
    }

    public final okhttp3.internal.connection.RealConnection d()
    {
        throw new IllegalStateException("unexpected call");
    }

    public final boolean e()
    {
        return 0;
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult g()
    {
        return this.a;
    }
}
