package n;
public final class i implements java.lang.Runnable {
    public final n.g a;
    public final synthetic n.k b;

    public i(n.k p1, n.g p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void run()
    {
        n.k v0 = this.b;
        n.g v1_0 = v0.c;
        if (v1_0 != null) {
            int v2_3 = v1_0.e;
            if (v2_3 != 0) {
                v2_3.f(v1_0);
            }
        }
        n.g v1_5 = ((android.view.View) v0.n);
        if ((v1_5 != null) && (v1_5.getWindowToken() != null)) {
            n.g v1_2 = this.a;
            if (!v1_2.b()) {
                if (v1_2.e != null) {
                    v1_2.d(0, 0, 0, 0);
                } else {
                    v0.A = 0;
                    return;
                }
            }
            v0.y = v1_2;
        }
        v0.A = 0;
        return;
    }
}
