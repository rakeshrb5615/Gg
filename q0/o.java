package q0;
public final class o {
    public final Runnable a;
    public final java.util.concurrent.CopyOnWriteArrayList b;
    public final java.util.HashMap c;

    public o(Runnable p2)
    {
        this.b = new java.util.concurrent.CopyOnWriteArrayList();
        this.c = new java.util.HashMap();
        this.a = p2;
        return;
    }

    public final boolean a(android.view.MenuItem p3)
    {
        java.util.Iterator v0_1 = this.b.iterator();
        while (v0_1.hasNext()) {
            if (((androidx.fragment.app.u0) ((q0.p) v0_1.next())).a.o(p3)) {
                return 1;
            }
        }
        return 0;
    }

    public final void b(q0.p p3)
    {
        this.b.remove(p3);
        Runnable v3_3 = ((q0.n) this.c.remove(p3));
        if (v3_3 != null) {
            v3_3.a.b(v3_3.b);
            v3_3.b = 0;
        }
        this.a.run();
        return;
    }
}
