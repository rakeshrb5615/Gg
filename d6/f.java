package d6;
public final class f implements d6.i {
    public final d6.j a;
    public final com.google.android.gms.tasks.TaskCompletionSource b;

    public f(d6.j p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean a(e6.b p8)
    {
        if ((p8.b != 4) || (this.a.a(p8))) {
            return 0;
        } else {
            String v2 = p8.c;
            if (v2 == null) {
                throw new NullPointerException("Null token");
            } else {
                this.b.setResult(new d6.a(v2, p8.e, p8.f));
                return 1;
            }
        }
    }

    public final boolean b(Exception p2)
    {
        this.b.trySetException(p2);
        return 1;
    }
}
