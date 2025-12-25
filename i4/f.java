package i4;
public final class f extends i4.e {
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource b;
    public final synthetic h4.d c;
    public final synthetic i4.h d;

    public f(i4.h p1, com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.tasks.TaskCompletionSource p3, h4.d p4)
    {
        this.b = p3;
        this.c = p4;
        this.d = p1;
        super(p2);
        return;
    }

    public final void a()
    {
        i4.h v1_5 = this.d;
        h4.d v2_2 = this.b;
        v1_5.e.add(v2_2);
        v2_2.getTask().addOnCompleteListener(new k2.c(25, v1_5, v2_2));
        if (this.d.k.getAndIncrement() > 0) {
            Object[] v3_1 = new Object[0];
            this.d.b.g("Already connected to the service.", v3_1);
        }
        i4.h.b(this.d, this.c);
        return;
    }
}
