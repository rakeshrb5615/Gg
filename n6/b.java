package n6;
public final class b implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic long b;
    public final synthetic n6.c c;

    public b(n6.c p1, int p2, long p3)
    {
        this.c = p1;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final void run()
    {
        n6.c v1 = this.c;
        long v4 = this.b;
        int v6 = (this.a - 1);
        com.google.android.gms.tasks.Task v2_1 = v1.c.c((3 - v6));
        com.google.android.gms.tasks.Task v3 = v1.d.b();
        com.google.android.gms.tasks.Tasks.whenAllComplete(new com.google.android.gms.tasks.Task[] {v2_1, v3})).continueWithTask(v1.f, new n6.a(v1, v2_1, v3, v4, v6));
        return;
    }
}
