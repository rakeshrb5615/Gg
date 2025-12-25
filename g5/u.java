package g5;
public final class u implements java.lang.Thread$UncaughtExceptionHandler {
    public final l6.c a;
    public final o5.d b;
    public final Thread$UncaughtExceptionHandler c;
    public final d5.b d;
    public final java.util.concurrent.atomic.AtomicBoolean e;

    public u(l6.c p1, o5.d p2, Thread$UncaughtExceptionHandler p3, d5.b p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(0);
        this.d = p4;
        return;
    }

    public final boolean a(Thread p4, Throwable p5)
    {
        if (p4 != null) {
            if (p5 != null) {
                if (!this.d.b()) {
                    return 1;
                } else {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                        android.util.Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", 0);
                    }
                    return 0;
                }
            } else {
                android.util.Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", 0);
                return 0;
            }
        } else {
            android.util.Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", 0);
            return 0;
        }
    }

    public final void uncaughtException(Thread p14, Throwable p15)
    {
        Thread$UncaughtExceptionHandler v2 = this.c;
        java.util.concurrent.atomic.AtomicBoolean v4 = this.e;
        v4.set(1);
        if (!this.a(p14, p15)) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", 0);
            }
        } else {
            this.a.j(this.b, p14, p15);
        }
        if (v2 == null) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", 0);
            }
            System.exit(1);
        } else {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", 0);
            }
            v2.uncaughtException(p14, p15);
        }
        v4.set(0);
        return;
    }
}
