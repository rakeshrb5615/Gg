package okhttp3.internal.connection;
public final class RealCall$AsyncCall implements java.lang.Runnable {
    public final n0.a a;
    public volatile java.util.concurrent.atomic.AtomicInteger b;
    public final synthetic okhttp3.internal.connection.RealCall c;

    public RealCall$AsyncCall(okhttp3.internal.connection.RealCall p1, n0.a p2)
    {
        this.c = p1;
        this.a = p2;
        this.b = new java.util.concurrent.atomic.AtomicInteger(0);
        return;
    }

    public final void run()
    {
        int v2_4 = new StringBuilder("OkHttp ");
        v2_4.append(this.c.b.a.g());
        int v2_0 = v2_4.toString();
        okhttp3.internal.connection.RealCall v3_0 = this.c;
        Thread v4 = Thread.currentThread();
        String v5 = v4.getName();
        v4.setName(v2_0);
        try {
            v3_0.e.h();
            try {
                java.io.IOException v7_0 = v3_0.g();
                try {
                    this.a.j(v3_0, v7_0);
                } catch (boolean v1_1) {
                    v7_0 = 1;
                    if (v7_0 == null) {
                        this.a.h(v3_0, v1_1);
                    } else {
                        okhttp3.internal.platform.Platform.a.getClass();
                        StringBuilder v8_4 = new StringBuilder("Callback failure for ");
                        v8_4.append(okhttp3.internal.connection.RealCall.a(v3_0));
                        okhttp3.internal.platform.Platform.b.j(4, v8_4.toString(), v1_1);
                    }
                    okhttp3.Dispatcher v0_4 = v3_0.a.a;
                    v0_4.getClass();
                    okhttp3.Dispatcher.c(v0_4, 0, this, 3);
                    v4.setName(v5);
                    return;
                } catch (okhttp3.Dispatcher v0_1) {
                    v7_0 = 1;
                    v3_0.cancel();
                    if (v7_0 == null) {
                        StringBuilder v8_2 = new StringBuilder("canceled due to ");
                        v8_2.append(v0_1);
                        java.io.IOException v7_2 = new java.io.IOException(v8_2.toString());
                        v7_2.initCause(v0_1);
                        this.a.h(v3_0, v7_2);
                    }
                    if (!(v0_1 instanceof InterruptedException)) {
                        throw v0_1;
                    } else {
                        Thread.currentThread().interrupt();
                        v0_4 = v3_0.a.a;
                    }
                }
                v0_4 = v3_0.a.a;
            } catch (okhttp3.Dispatcher v0_1) {
            }
        } catch (okhttp3.Dispatcher v0_11) {
            v4.setName(v5);
            throw v0_11;
        }
    }
}
