package d4;
public final class p extends d4.m {
    public final synthetic android.os.IBinder b;
    public final synthetic d4.q c;

    public p(d4.q p1, android.os.IBinder p2)
    {
        this.c = p1;
        this.b = p2;
        return;
    }

    public final void a()
    {
        java.util.ArrayList v1_0;
        java.util.ArrayList v0_2 = ((d4.r) this.c.b);
        java.util.ArrayList v1_5 = this.b;
        if (v1_5 != null) {
            int v2_8 = v1_5.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (!(v2_8 instanceof d4.h)) {
                v1_0 = new d4.f(v1_5);
            } else {
                v1_0 = ((d4.h) v2_8);
            }
        } else {
            v1_0 = 0;
        }
        v0_2.m = ((d4.h) v1_0);
        java.util.ArrayList v1_3 = v0_2.b;
        int v3_0 = 0;
        Runnable v4_0 = new Object[0];
        v1_3.h("linkToDeath", v4_0);
        try {
            v0_2.m.asBinder().linkToDeath(v0_2.j, 0);
        } catch (int v2_5) {
            Runnable v4_2 = new Object[0];
            v1_3.f(v2_5, "linkToDeath failed", v4_2);
        }
        v0_2.g = 0;
        java.util.ArrayList v1_4 = v0_2.d;
        int v2_6 = v1_4.size();
        while (v3_0 < v2_6) {
            Runnable v4_3 = v1_4.get(v3_0);
            v3_0++;
            ((Runnable) v4_3).run();
        }
        v0_2.d.clear();
        return;
    }
}
