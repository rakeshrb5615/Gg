package okhttp3.internal.connection;
public final class RealConnectionPool {
    public final okhttp3.internal.connection.ConnectionListener a;
    public final long b;
    public final okhttp3.internal.concurrent.TaskQueue c;
    public final okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 d;
    public final java.util.concurrent.ConcurrentLinkedQueue e;

    static RealConnectionPool()
    {
        new okhttp3.internal.connection.RealConnectionPool$Companion(0);
        return;
    }

    public RealConnectionPool(okhttp3.internal.concurrent.TaskRunner p4, okhttp3.internal.connection.ConnectionListener p5)
    {
        String v0_0 = java.util.concurrent.TimeUnit.MINUTES;
        kotlin.jvm.internal.j.e(p4, "taskRunner");
        kotlin.jvm.internal.j.e(v0_0, "timeUnit");
        kotlin.jvm.internal.j.e(p5, "connectionListener");
        this.a = p5;
        this.b = v0_0.toNanos(5);
        this.c = p4.d();
        this.d = new okhttp3.internal.connection.RealConnectionPool$cleanupTask$1(this, v1.a.n(new StringBuilder(), okhttp3.internal._UtilJvmKt.b, " ConnectionPool connection closer"));
        this.e = new java.util.concurrent.ConcurrentLinkedQueue();
        return;
    }

    public final int a(okhttp3.internal.connection.RealConnection p7, long p8)
    {
        java.util.ArrayList v0 = p7.w;
        long v2_0 = 0;
        while (v2_0 < v0.size()) {
            boolean v3_1 = ((ref.Reference) v0.get(v2_0));
            if (v3_1.get() == null) {
                boolean v3_2 = ((okhttp3.internal.connection.RealCall$CallReference) v3_1);
                String v4_2 = new StringBuilder("A connection to ");
                v4_2.append(p7.c.a.h);
                v4_2.append(" was leaked. Did you forget to close a response body?");
                String v4_3 = v4_2.toString();
                okhttp3.internal.platform.Platform.a.getClass();
                okhttp3.internal.platform.Platform.b.k(v3_2.a, v4_3);
                v0.remove(v2_0);
                if (v0.isEmpty()) {
                    p7.x = (p8 - this.b);
                    return 0;
                }
            } else {
                v2_0++;
            }
        }
        return v0.size();
    }
}
