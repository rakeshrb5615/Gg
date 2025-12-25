package m;
public final class j extends android.widget.BaseAdapter {
    public final m.m a;
    public int b;
    public boolean c;
    public final boolean d;
    public final android.view.LayoutInflater e;
    public final int f;

    public j(m.m p2, android.view.LayoutInflater p3, boolean p4, int p5)
    {
        this.b = -1;
        this.d = p4;
        this.e = p3;
        this.a = p2;
        this.f = p5;
        this.a();
        return;
    }

    public final void a()
    {
        int v0_0 = this.a;
        m.o v1 = v0_0.v;
        if (v1 != null) {
            v0_0.i();
            int v0_1 = v0_0.j;
            int v2 = v0_1.size();
            int v3 = 0;
            while (v3 < v2) {
                if (((m.o) v0_1.get(v3)) != v1) {
                    v3++;
                } else {
                    this.b = v3;
                    return;
                }
            }
        }
        this.b = -1;
        return;
    }

    public final m.o b(int p3)
    {
        java.util.ArrayList v0_1;
        int v1_0 = this.a;
        if (!this.d) {
            v0_1 = v1_0.l();
        } else {
            v1_0.i();
            v0_1 = v1_0.j;
        }
        int v1_1 = this.b;
        if ((v1_1 >= 0) && (p3 >= v1_1)) {
            p3++;
        }
        return ((m.o) v0_1.get(p3));
    }

    public final int getCount()
    {
        int v0_4;
        int v1_0 = this.a;
        if (!this.d) {
            v0_4 = v1_0.l();
        } else {
            v1_0.i();
            v0_4 = v1_0.j;
        }
        if (this.b >= 0) {
            return (v0_4.size() - 1);
        } else {
            return v0_4.size();
        }
    }

    public final bridge synthetic Object getItem(int p1)
    {
        return this.b(p1);
    }

    public final long getItemId(int p3)
    {
        return ((long) p3);
    }

    public final android.view.View getView(int p6, android.view.View p7, android.view.ViewGroup p8)
    {
        int v0_0 = 0;
        if (p7 == null) {
            p7 = this.e.inflate(this.f, p8, 0);
        }
        int v1_0;
        m.z v8_4 = this.b(p6).b;
        int v1_3 = (p6 - 1);
        if (v1_3 < 0) {
            v1_0 = v8_4;
        } else {
            v1_0 = this.b(v1_3).b;
        }
        if ((this.a.m()) && (v8_4 != v1_0)) {
            v0_0 = 1;
        }
        ((androidx.appcompat.view.menu.ListMenuItemView) p7).setGroupDividerEnabled(v0_0);
        if (this.c) {
            ((androidx.appcompat.view.menu.ListMenuItemView) p7).setForceShowIcon(1);
        }
        ((m.z) p7).a(this.b(p6));
        return p7;
    }

    public final void notifyDataSetChanged()
    {
        this.a();
        super.notifyDataSetChanged();
        return;
    }
}
