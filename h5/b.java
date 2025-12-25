package h5;
public abstract class b {
    public static final x1.d a;

    static b()
    {
        h5.b.a = new x1.d();
        return;
    }

    public static com.google.android.gms.tasks.Task a(com.google.android.gms.tasks.Task p5, com.google.android.gms.tasks.Task p6)
    {
        x1.d v0_1 = new com.google.android.gms.tasks.CancellationTokenSource();
        com.google.android.gms.tasks.TaskCompletionSource v1_1 = new com.google.android.gms.tasks.TaskCompletionSource(v0_1.getToken());
        h5.a v3_0 = new h5.a(v1_1, new java.util.concurrent.atomic.AtomicBoolean(0), v0_1, 0);
        x1.d v0_2 = h5.b.a;
        p5.continueWithTask(v0_2, v3_0);
        p6.continueWithTask(v0_2, v3_0);
        return v1_1.getTask();
    }
}
