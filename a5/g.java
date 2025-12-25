package a5;
public final synthetic class g implements c6.b {
    public final synthetic int a;

    public synthetic g(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object get()
    {
        switch (this.a) {
            case 0:
                return java.util.Collections.EMPTY_SET;
            case 1:
                return 0;
            case 2:
                j6.o v0_11 = new android.os.StrictMode$ThreadPolicy$Builder().detectNetwork();
                v0_11.detectResourceMismatches();
                v0_11.detectUnbufferedIo();
                return new b5.g(java.util.concurrent.Executors.newFixedThreadPool(4, new b5.a("Firebase Background", 10, v0_11.penaltyLog().build())), ((java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.d.get()));
            case 3:
                return new b5.g(java.util.concurrent.Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b5.a("Firebase Lite", 0, new android.os.StrictMode$ThreadPolicy$Builder().detectAll().penaltyLog().build())), ((java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.d.get()));
            case 4:
                return new b5.g(java.util.concurrent.Executors.newCachedThreadPool(new b5.a("Firebase Blocking", 11, 0)), ((java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.d.get()));
            case 5:
                return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new b5.a("Firebase Scheduler", 0, 0));
            case 6:
                return 0;
            default:
                return 0;
        }
    }
}
