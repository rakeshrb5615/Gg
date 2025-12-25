package j6;
public abstract class g extends android.app.Service {
    public final java.util.concurrent.ExecutorService a;
    public j6.d0 b;
    public final Object c;
    public int d;
    public int e;

    public g()
    {
        int v0_0 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        v0_0.allowCoreThreadTimeOut(1);
        this.a = java.util.concurrent.Executors.unconfigurableExecutorService(v0_0);
        this.c = new Object();
        this.e = 0;
        return;
    }

    public final void a(android.content.Intent p2)
    {
        if (p2 != null) {
            j6.c0.a(p2);
        }
        int v0_2 = (this.e - 1);
        this.e = v0_2;
        if (v0_2 == 0) {
            this.stopSelfResult(this.d);
        }
        return;
    }

    public abstract void b();

    public final declared_synchronized android.os.IBinder onBind(android.content.Intent p3)
    {
        if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
            android.util.Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.b == null) {
            this.b = new j6.d0(new l6.c(this, 29));
        }
        return this.b;
    }

    public final void onDestroy()
    {
        this.a.shutdown();
        super.onDestroy();
        return;
    }

    public final int onStartCommand(android.content.Intent p5, int p6, int p7)
    {
        this.d = p7;
        this.e = (this.e + 1);
        com.google.android.gms.tasks.Task v6_1 = ((android.content.Intent) ((java.util.ArrayDeque) j6.s.g().e).poll());
        if (v6_1 != null) {
            a5.u v0_1 = new com.google.android.gms.tasks.TaskCompletionSource();
            this.a.execute(new androidx.fragment.app.l(this, v6_1, v0_1, 4));
            com.google.android.gms.tasks.Task v6_2 = v0_1.getTask();
            if (!v6_2.isComplete()) {
                v6_2.addOnCompleteListener(new x1.d(), new a5.u(2, this, p5));
                return 3;
            } else {
                this.a(p5);
                return 2;
            }
        } else {
            this.a(p5);
            return 2;
        }
    }
}
