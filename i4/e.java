package i4;
public abstract class e implements java.lang.Runnable {
    public final com.google.android.gms.tasks.TaskCompletionSource a;

    public e()
    {
        this.a = 0;
        return;
    }

    public e(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.a = p1;
        return;
    }

    public abstract void a();

    public final void run()
    {
        try {
            this.a();
            return;
        } catch (Exception v0) {
            com.google.android.gms.tasks.TaskCompletionSource v1 = this.a;
            if (v1 != null) {
                v1.trySetException(v0);
            }
            return;
        }
    }
}
