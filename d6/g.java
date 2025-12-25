package d6;
public final class g implements d6.i {
    public final com.google.android.gms.tasks.TaskCompletionSource a;

    public g(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.a = p1;
        return;
    }

    public final boolean a(e6.b p3)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_0 = p3.b;
        if ((v0_0 != 3) && ((v0_0 != 4) && (v0_0 != 5))) {
            return 0;
        } else {
            this.a.trySetResult(p3.a);
            return 1;
        }
    }

    public final boolean b(Exception p1)
    {
        return 0;
    }
}
