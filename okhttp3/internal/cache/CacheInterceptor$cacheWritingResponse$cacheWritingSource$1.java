package okhttp3.internal.cache;
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements x8.h0 {
    public boolean a;

    public final x8.j0 b()
    {
        throw 0;
    }

    public final void close()
    {
        if (!this.a) {
            kotlin.jvm.internal.j.e(java.util.concurrent.TimeUnit.MILLISECONDS, "timeUnit");
            try {
                int v0_1 = okhttp3.internal._UtilJvmKt.f(this, 100);
            } catch (java.io.IOException) {
                v0_1 = 0;
            }
            if (v0_1 == 0) {
                this.a = 1;
                throw 0;
            }
        }
        throw 0;
    }

    public final long t(x8.g p1, long p2)
    {
        kotlin.jvm.internal.j.e(p1, "sink");
        throw 0;
    }
}
