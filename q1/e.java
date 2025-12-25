package q1;
public class e extends androidx.lifecycle.v0 {
    public static final androidx.fragment.app.e1 d;
    public final r.k b;
    public boolean c;

    static e()
    {
        q1.e.d = new androidx.fragment.app.e1(1);
        return;
    }

    public e()
    {
        this.b = new r.k();
        this.c = 0;
        return;
    }

    public final void b()
    {
        r.k v0 = this.b;
        int v1_0 = v0.c;
        int v3_0 = 0;
        while (v3_0 < v1_0) {
            int v4_2 = ((q1.c) v0.e(v3_0));
            int v5_1 = v4_2.l;
            v5_1.cancelLoad();
            v5_1.abandon();
            q1.d v6 = v4_2.n;
            if (v6 != null) {
                v4_2.g(v6);
                if (v6.c) {
                    v6.b.onLoaderReset(v6.a);
                }
            }
            v5_1.unregisterListener(v4_2);
            // Both branches of the condition point to the same code.
            // if (v6 == null) {
                v5_1.reset();
                v3_0++;
            // }
        }
        int v1_1 = v0.c;
        int v4_0 = 0;
        while (v4_0 < v1_1) {
            v0.b[v4_0] = 0;
            v4_0++;
        }
        v0.c = 0;
        return;
    }
}
