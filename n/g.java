package n;
public final class g extends m.w {
    public final synthetic int l;
    public final synthetic n.k m;

    public g(n.k p9, android.content.Context p10, m.e0 p11, android.view.View p12)
    {
        this.l = 0;
        this.m = p9;
        n.g v1_0 = super(p10, p11, p12, 0, 2130968611, 0);
        if ((p11.A.x & 32) != 32) {
            android.view.View v10_4 = p9.o;
            if (v10_4 == null) {
                v10_4 = ((android.view.View) p9.n);
            }
            v1_0.e = v10_4;
        }
        j6.o v9_1 = p9.C;
        v1_0.h = v9_1;
        android.view.View v10_6 = v1_0.i;
        if (v10_6 != null) {
            v10_6.j(v9_1);
        }
        return;
    }

    public g(n.k p9, android.content.Context p10, m.m p11, android.view.View p12)
    {
        this.l = 1;
        this.m = p9;
        n.g v1_0 = super(p10, p11, p12, 1, 2130968611, 0);
        v1_0.f = 8388613;
        j6.o v9_1 = p9.C;
        v1_0.h = v9_1;
        m.u v10_2 = v1_0.i;
        if (v10_2 != null) {
            v10_2.j(v9_1);
        }
        return;
    }

    public final void c()
    {
        switch (this.l) {
            case 0:
                int v1_1 = this.m;
                v1_1.z = 0;
                v1_1.getClass();
                super.c();
                return;
            default:
                int v0_2 = this.m;
                int v1_2 = v0_2.c;
                if (v1_2 != 0) {
                    v1_2.c(1);
                }
                v0_2.y = 0;
                super.c();
                return;
        }
    }
}
