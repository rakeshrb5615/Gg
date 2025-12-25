package h5;
public final class f {
    public static final h5.e d;
    public final h5.c a;
    public final h5.c b;
    public final h5.c c;

    static f()
    {
        h5.f.d = new h5.e();
        return;
    }

    public f(java.util.concurrent.ExecutorService p2, java.util.concurrent.ExecutorService p3)
    {
        kotlin.jvm.internal.j.e(p2, "backgroundExecutorService");
        kotlin.jvm.internal.j.e(p3, "blockingExecutorService");
        this.a = new h5.c(p2);
        this.b = new h5.c(p2);
        com.google.android.gms.tasks.Tasks.forResult(0);
        this.c = new h5.c(p3);
        return;
    }

    public static final void a()
    {
        if (!((Boolean) new h5.d(0, h5.f.d, h5.e, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            String v0_5 = new StringBuilder("Must be called on a background thread, was called on ");
            v0_5.append(Thread.currentThread().getName());
            v0_5.append(46);
            String v0_6 = v0_5.toString();
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", v0_6, 0);
            }
        }
        return;
    }

    public static final void b()
    {
        if (!((Boolean) new h5.d(0, h5.f.d, h5.e, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            String v0_5 = new StringBuilder("Must be called on a blocking thread, was called on ");
            v0_5.append(Thread.currentThread().getName());
            v0_5.append(46);
            String v0_6 = v0_5.toString();
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", v0_6, 0);
            }
        }
        return;
    }
}
