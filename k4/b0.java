package k4;
public final class b0 extends k4.a0 {
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource m;
    public final synthetic k4.a0 n;
    public final synthetic k4.d o;

    public b0(k4.d p1, com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.tasks.TaskCompletionSource p3, k4.a0 p4)
    {
        this.o = p1;
        this.m = p3;
        this.n = p4;
        super(p2);
        return;
    }

    public final void b()
    {
        k4.d v1_5 = this.o;
        k4.a0 v2_2 = this.m;
        v1_5.e.add(v2_2);
        v2_2.getTask().addOnCompleteListener(new k2.c(27, v1_5, v2_2));
        if (this.o.l.getAndIncrement() > 0) {
            Object[] v3_1 = new Object[0];
            this.o.b.b("Already connected to the service.", v3_1);
        }
        k4.d.b(this.o, this.n);
        return;
    }
}
