package g5;
public final class w implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;

    public w(Runnable p2)
    {
        this.a = 0;
        this.b = p2;
        return;
    }

    public w(java.util.concurrent.ExecutorService p2)
    {
        this.a = 1;
        this.b = p2;
        return;
    }

    public final void run()
    {
        android.os.Process.setThreadPriority(10);
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            default:
                Runnable v0_5 = ((java.util.concurrent.ExecutorService) this.b);
                try {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                        android.util.Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", 0);
                    }
                } catch (InterruptedException) {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                        android.util.Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", 0);
                    }
                    v0_5.shutdownNow();
                }
                v0_5.shutdown();
                if (v0_5.awaitTermination(2, java.util.concurrent.TimeUnit.SECONDS)) {
                } else {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                        android.util.Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", 0);
                    }
                    v0_5.shutdownNow();
                }
        }
        return;
    }
}
