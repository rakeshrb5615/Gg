package d8;
public final class d implements d8.k {
    public final d8.c[] a;

    public d(d8.c[] p1)
    {
        this.a = p1;
        return;
    }

    public final void a(Throwable p1)
    {
        this.b();
        return;
    }

    public final void b()
    {
        int v0_0 = this.a;
        int v1 = v0_0.length;
        int v2 = 0;
        while (v2 < v1) {
            d8.p0 v3_1 = v0_0[v2].f;
            if (v3_1 == null) {
                kotlin.jvm.internal.j.i("handle");
                throw 0;
            } else {
                v3_1.a();
                v2++;
            }
        }
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("DisposeHandlersOnCancel[");
        v0_1.append(this.a);
        v0_1.append(93);
        return v0_1.toString();
    }
}
