package m;
public final class e0 extends m.m implements android.view.SubMenu {
    public final m.o A;
    public final m.m z;

    public e0(android.content.Context p1, m.m p2, m.o p3)
    {
        super(p1);
        super.z = p2;
        super.A = p3;
        return;
    }

    public final boolean d(m.o p2)
    {
        return this.z.d(p2);
    }

    public final boolean e(m.m p2, android.view.MenuItem p3)
    {
        if ((!super.e(p2, p3)) && (!this.z.e(p2, p3))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean f(m.o p2)
    {
        return this.z.f(p2);
    }

    public final android.view.MenuItem getItem()
    {
        return this.A;
    }

    public final String j()
    {
        String v0_1;
        String v0_0 = this.A;
        if (v0_0 == null) {
            v0_1 = 0;
        } else {
            v0_1 = v0_0.a;
        }
        if (v0_1 != null) {
            return g2.g.c(v0_1, "android:menu:actionviewstates:");
        } else {
            return 0;
        }
    }

    public final m.m k()
    {
        return this.z.k();
    }

    public final boolean m()
    {
        return this.z.m();
    }

    public final boolean n()
    {
        return this.z.n();
    }

    public final boolean o()
    {
        return this.z.o();
    }

    public final void setGroupDividerEnabled(boolean p2)
    {
        this.z.setGroupDividerEnabled(p2);
        return;
    }

    public final android.view.SubMenu setHeaderIcon(int p7)
    {
        this.u(0, 0, p7, 0, 0);
        return this;
    }

    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable p7)
    {
        this.u(0, 0, 0, p7, 0);
        return this;
    }

    public final android.view.SubMenu setHeaderTitle(int p7)
    {
        this.u(p7, 0, 0, 0, 0);
        return this;
    }

    public final android.view.SubMenu setHeaderTitle(CharSequence p7)
    {
        this.u(0, p7, 0, 0, 0);
        return this;
    }

    public final android.view.SubMenu setHeaderView(android.view.View p7)
    {
        this.u(0, 0, 0, 0, p7);
        return this;
    }

    public final android.view.SubMenu setIcon(int p2)
    {
        this.A.setIcon(p2);
        return this;
    }

    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable p2)
    {
        this.A.setIcon(p2);
        return this;
    }

    public final void setQwertyMode(boolean p2)
    {
        this.z.setQwertyMode(p2);
        return;
    }
}
