package m;
public final class b extends n.w1 {
    public final synthetic int p;
    public final synthetic android.view.View q;

    public b(androidx.appcompat.view.menu.ActionMenuItemView p2)
    {
        this.p = 0;
        this.q = p2;
        super(p2);
        return;
    }

    public b(n.j p2, n.j p3)
    {
        this.p = 1;
        this.q = p2;
        super(p3);
        return;
    }

    public final m.c0 b()
    {
        switch (this.p) {
            case 0:
                m.u v0_1;
                m.u v0_9 = ((androidx.appcompat.view.menu.ActionMenuItemView) this.q).s;
                if (v0_9 == null) {
                    v0_1 = 0;
                } else {
                    m.u v0_12 = ((n.h) v0_9).a.z;
                    if (v0_12 == null) {
                    } else {
                        v0_1 = v0_12.a();
                    }
                }
                return v0_1;
            default:
                m.u v0_7;
                m.u v0_5 = ((n.j) this.q).d.y;
                if (v0_5 != null) {
                    v0_7 = v0_5.a();
                } else {
                    v0_7 = 0;
                }
                return v0_7;
        }
    }

    public final boolean c()
    {
        switch (this.p) {
            case 0:
                int v0_3;
                int v0_9 = ((androidx.appcompat.view.menu.ActionMenuItemView) this.q);
                m.l v1 = v0_9.q;
                if ((v1 == null) || (!v1.c(v0_9.n))) {
                    v0_3 = 0;
                } else {
                    int v0_1 = this.b();
                    if ((v0_1 == 0) || (!v0_1.b())) {
                    } else {
                        v0_3 = 1;
                    }
                }
                return v0_3;
            default:
                ((n.j) this.q).d.l();
                return 1;
        }
    }

    public boolean d()
    {
        switch (this.p) {
            case 1:
                int v0_5;
                int v0_4 = ((n.j) this.q).d;
                if (v0_4.A == null) {
                    v0_4.c();
                    v0_5 = 1;
                } else {
                    v0_5 = 0;
                }
                return v0_5;
            default:
                return super.d();
        }
    }
}
