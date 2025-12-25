package k4;
public final class b extends k4.a0 {
    public final synthetic android.os.IBinder m;
    public final synthetic d4.q n;

    public b(d4.q p1, android.os.IBinder p2)
    {
        this.n = p1;
        this.m = p2;
        return;
    }

    public final void b()
    {
        java.util.ArrayList v0_2 = ((k4.d) this.n.b);
        v0_2.n = ((android.os.IInterface) v0_2.i.a(this.m));
        java.util.ArrayList v1_4 = v0_2.b;
        int v2_0 = 0;
        int v3_0 = new Object[0];
        v1_4.b("linkToDeath", v3_0);
        try {
            v0_2.n.asBinder().linkToDeath(v0_2.k, 0);
        } catch (int v3_3) {
            Runnable v4_2 = new Object[0];
            v1_4.a(v3_3, "linkToDeath failed", v4_2);
        }
        v0_2.g = 0;
        java.util.ArrayList v1_0 = v0_2.d;
        int v3_4 = v1_0.size();
        while (v2_0 < v3_4) {
            Runnable v4_3 = v1_0.get(v2_0);
            v2_0++;
            ((Runnable) v4_3).run();
        }
        v0_2.d.clear();
        return;
    }
}
