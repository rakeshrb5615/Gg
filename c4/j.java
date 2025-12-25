package c4;
public final class j extends c4.i {

    public final void zzb(android.os.Bundle p5)
    {
        super.zzb(p5);
        com.google.android.gms.tasks.TaskCompletionSource v3 = this.c;
        if (p5.getInt("error.code", -2) == 0) {
            v3.trySetResult(0);
            return;
        } else {
            v3.trySetException(new e4.a(p5.getInt("error.code", -2)));
            return;
        }
    }
}
