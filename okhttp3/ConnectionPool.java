package okhttp3;
public final class ConnectionPool {
    public final okhttp3.internal.connection.RealConnectionPool a;

    public ConnectionPool()
    {
        kotlin.jvm.internal.j.e(java.util.concurrent.TimeUnit.MINUTES, "timeUnit");
        okhttp3.internal.concurrent.TaskRunner v0_1 = okhttp3.internal.concurrent.TaskRunner.r;
        okhttp3.internal.connection.ConnectionListener.a.getClass();
        okhttp3.internal.connection.ConnectionListener$Companion$NONE$1 v1_2 = okhttp3.internal.connection.ConnectionListener.b;
        kotlin.jvm.internal.j.e(v0_1, "taskRunner");
        kotlin.jvm.internal.j.e(v1_2, "connectionListener");
        okhttp3.internal.connection.RealConnectionPool v2_1 = new okhttp3.internal.connection.RealConnectionPool(v0_1, v1_2);
        this.a = v2_1;
        return;
    }
}
