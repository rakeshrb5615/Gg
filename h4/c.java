package h4;
public final class c extends android.os.ResultReceiver {
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource a;

    public c(android.os.Handler p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.a = p2;
        super(p1);
        return;
    }

    public final void onReceiveResult(int p1, android.os.Bundle p2)
    {
        this.a.trySetResult(0);
        return;
    }
}
