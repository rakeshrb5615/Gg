package androidx.loader.content;
public final class g implements java.util.concurrent.Callable {
    public final synthetic androidx.loader.content.a a;

    public g(androidx.loader.content.a p1)
    {
        this.a = p1;
        return;
    }

    public final Object call()
    {
        androidx.loader.content.a v0 = this.a;
        v0.e.set(1);
        try {
            android.os.Process.setThreadPriority(10);
            Object v3 = v0.n.onLoadInBackground();
            android.os.Binder.flushPendingCommands();
            v0.a(v3);
            return v3;
        } catch (Throwable v1_1) {
            try {
                v0.d.set(1);
                throw v1_1;
            } catch (Throwable v1_2) {
                v0.a(v3);
                throw v1_2;
            }
        }
    }
}
