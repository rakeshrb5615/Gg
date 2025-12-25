package h5;
public final class c implements java.util.concurrent.Executor {
    public final java.util.concurrent.ExecutorService a;
    public final Object b;
    public com.google.android.gms.tasks.Task c;

    public c(java.util.concurrent.ExecutorService p2)
    {
        this.b = new Object();
        this.c = com.google.android.gms.tasks.Tasks.forResult(0);
        this.a = p2;
        return;
    }

    public final com.google.android.gms.tasks.Task a(Runnable p6)
    {
        try {
            Throwable v6_2 = this.c.continueWithTask(this.a, new a5.a(p6, 7));
            this.c = v6_2;
            return v6_2;
        } catch (Throwable v6_1) {
            throw v6_1;
        }
    }

    public final void execute(Runnable p2)
    {
        this.a.execute(p2);
        return;
    }
}
