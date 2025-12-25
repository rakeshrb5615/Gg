package c4;
public final class h extends d4.m {
    public final synthetic int b;
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource c;
    public final synthetic Object d;
    public final synthetic Object e;

    public h(c4.l p2, com.google.android.gms.tasks.TaskCompletionSource p3, String p4, com.google.android.gms.tasks.TaskCompletionSource p5)
    {
        this.b = 0;
        this.e = p2;
        this.d = p4;
        this.c = p5;
        super(p3);
        return;
    }

    public synthetic h(Object p1, com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.tasks.TaskCompletionSource p3, Object p4, int p5)
    {
        this.b = p5;
        this.e = p1;
        this.c = p3;
        this.d = p4;
        super(p2);
        return;
    }

    public final void a()
    {
        switch (this.b) {
            case 0:
                com.google.android.gms.tasks.TaskCompletionSource v0_2 = this.c;
                android.os.RemoteException v1_3 = ((c4.l) this.e);
                RuntimeException v2_4 = ((String) this.d);
                try {
                    v1_3.a.m.c(v1_3.b, c4.l.a(v1_3, v2_4), new c4.k(v1_3, v0_2, v2_4));
                } catch (android.os.RemoteException v1_5) {
                    c4.l.e.f(v1_5, "requestUpdateInfo(%s)", new Object[] {v2_4}));
                    v0_2.trySetException(new RuntimeException(v1_5));
                }
                return;
            case 1:
                com.google.android.gms.tasks.TaskCompletionSource v0_1 = this.c;
                android.os.RemoteException v1_4 = ((c4.l) this.e);
                try {
                    v1_4.a.m.b(v1_4.b, c4.l.b(), new c4.j(v1_4, new d4.l("OnCompleteUpdateCallback", 0), v0_1));
                } catch (android.os.RemoteException v1_0) {
                    c4.l.e.f(v1_0, "completeUpdate(%s)", new Object[] {((String) this.d)}));
                    v0_1.trySetException(new RuntimeException(v1_0));
                }
                return;
            default:
                android.os.RemoteException v1_7 = ((d4.r) this.e);
                RuntimeException v2_9 = this.c;
                v1_7.e.add(v2_9);
                v2_9.getTask().addOnCompleteListener(new k2.c(7, v1_7, v2_9));
                if (((d4.r) this.e).k.getAndIncrement() > 0) {
                    Object[] v3_10 = new Object[0];
                    ((d4.r) this.e).b.h("Already connected to the service.", v3_10);
                }
                d4.r.b(((d4.r) this.e), ((d4.m) this.d));
                return;
        }
    }
}
