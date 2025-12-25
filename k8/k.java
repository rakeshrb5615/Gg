package k8;
public abstract class k {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final k8.g f;

    static k()
    {
        try {
            k8.g v0_6 = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException) {
            v0_6 = 0;
        }
        if (v0_6 == null) {
            v0_6 = "DefaultDispatcher";
        }
        k8.k.a = v0_6;
        k8.k.b = i8.a.i(100000, 1, 9223372036854775807, "kotlinx.coroutines.scheduler.resolution.ns");
        k8.g v0_2 = i8.t.a;
        if (v0_2 < 2) {
            v0_2 = 2;
        }
        k8.k.c = i8.a.j(v0_2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        k8.k.d = i8.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        k8.k.e = java.util.concurrent.TimeUnit.SECONDS.toNanos(i8.a.i(60, 1, 9223372036854775807, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        k8.k.f = k8.g.a;
        return;
    }
}
