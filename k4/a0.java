package k4;
public abstract class a0 implements java.lang.Runnable {
    private final com.google.android.gms.tasks.TaskCompletionSource a;

    public a0()
    {
        this.a = 0;
        return;
    }

    public a0(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.a = p1;
        return;
    }

    public void a(Exception p2)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0 = this.a;
        if (v0 != null) {
            v0.trySetException(p2);
        }
        return;
    }

    public abstract void b();

    public final com.google.android.gms.tasks.TaskCompletionSource c()
    {
        return this.a;
    }

    public final void run()
    {
        try {
            this.b();
            return;
        } catch (Exception v0) {
            this.a(v0);
            return;
        }
    }
}
