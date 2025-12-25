package m;
public final class i implements m.y, android.widget.AdapterView$OnItemClickListener {
    public android.content.Context a;
    public android.view.LayoutInflater b;
    public m.m c;
    public androidx.appcompat.view.menu.ExpandedMenuView d;
    public m.x e;
    public m.h f;

    public i(android.content.ContextWrapper p1)
    {
        this.a = p1;
        this.b = android.view.LayoutInflater.from(p1);
        return;
    }

    public final void a(m.m p2, boolean p3)
    {
        m.x v0 = this.e;
        if (v0 != null) {
            v0.a(p2, p3);
        }
        return;
    }

    public final void d()
    {
        m.h v0 = this.f;
        if (v0 != null) {
            v0.notifyDataSetChanged();
        }
        return;
    }

    public final boolean e(m.o p1)
    {
        return 0;
    }

    public final void g(android.content.Context p2, m.m p3)
    {
        if (this.a != null) {
            this.a = p2;
            if (this.b == null) {
                this.b = android.view.LayoutInflater.from(p2);
            }
        }
        this.c = p3;
        android.view.LayoutInflater v2_2 = this.f;
        if (v2_2 != null) {
            v2_2.notifyDataSetChanged();
        }
        return;
    }

    public final boolean h()
    {
        return 0;
    }

    public final boolean i(m.e0 p7)
    {
        android.view.WindowManager$LayoutParams v1_1 = p7.a;
        if (p7.hasVisibleItems()) {
            m.x v0_3 = new m.n();
            v0_3.a = p7;
            int v2_4 = new h.f(v1_1);
            h.b v4_1 = ((h.b) v2_4.c);
            int v3_0 = new m.i(v4_1.a);
            v0_3.c = v3_0;
            v3_0.e = v0_3;
            p7.b(v3_0, v1_1);
            android.view.WindowManager$LayoutParams v1_0 = v0_3.c;
            if (v1_0.f == null) {
                v1_0.f = new m.h(v1_0);
            }
            v4_1.g = v1_0.f;
            v4_1.h = v0_3;
            android.view.WindowManager$LayoutParams v1_3 = p7.o;
            if (v1_3 == null) {
                v4_1.c = p7.n;
                v4_1.d = p7.m;
            } else {
                v4_1.e = v1_3;
            }
            v4_1.f = v0_3;
            android.view.WindowManager$LayoutParams v1_6 = v2_4.b();
            v0_3.b = v1_6;
            v1_6.setOnDismissListener(v0_3);
            android.view.WindowManager$LayoutParams v1_9 = v0_3.b.getWindow().getAttributes();
            v1_9.type = 1003;
            v1_9.flags = (v1_9.flags | 131072);
            v0_3.b.show();
            m.x v0_4 = this.e;
            if (v0_4 != null) {
                v0_4.h(p7);
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final void j(m.x p1)
    {
        throw 0;
    }

    public final boolean k(m.o p1)
    {
        return 0;
    }

    public final void onItemClick(android.widget.AdapterView p1, android.view.View p2, int p3, long p4)
    {
        this.c.q(this.f.b(p3), this, 0);
        return;
    }
}
