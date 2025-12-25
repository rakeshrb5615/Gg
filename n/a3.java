package n;
public final class a3 implements m.y {
    public m.m a;
    public m.o b;
    public final synthetic androidx.appcompat.widget.Toolbar c;

    public a3(androidx.appcompat.widget.Toolbar p1)
    {
        this.c = p1;
        return;
    }

    public final void a(m.m p1, boolean p2)
    {
        return;
    }

    public final void d()
    {
        if (this.b != null) {
            m.o v0_1 = this.a;
            if (v0_1 != null) {
                m.o v0_3 = v0_1.f.size();
                int v1 = 0;
                while (v1 < v0_3) {
                    if (this.a.getItem(v1) != this.b) {
                        v1++;
                    }
                    return;
                }
            }
            this.k(this.b);
        }
        return;
    }

    public final boolean e(m.o p7)
    {
        androidx.appcompat.widget.Toolbar v0 = this.c;
        v0.c();
        int v1_8 = v0.n.getParent();
        if (v1_8 != v0) {
            if ((v1_8 instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) v1_8).removeView(v0.n);
            }
            v0.addView(v0.n);
        }
        int v1_1 = p7.getActionView();
        v0.o = v1_1;
        this.b = p7;
        int v1_2 = v1_1.getParent();
        if (v1_2 != v0) {
            if ((v1_2 instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) v1_2).removeView(v0.o);
            }
            int v1_5 = androidx.appcompat.widget.Toolbar.h();
            v1_5.a = ((v0.t & 112) | 8388611);
            v1_5.b = 2;
            v0.o.setLayoutParams(v1_5);
            v0.addView(v0.o);
        }
        int v1_9 = (v0.getChildCount() - 1);
        while (v1_9 >= 0) {
            android.view.View v4_1 = v0.getChildAt(v1_9);
            if ((((n.b3) v4_1.getLayoutParams()).b != 2) && (v4_1 != v0.a)) {
                v0.removeViewAt(v1_9);
                v0.K.add(v4_1);
            }
            v1_9--;
        }
        v0.requestLayout();
        p7.C = 1;
        p7.n.p(0);
        android.view.CollapsibleActionView v7_2 = v0.o;
        if ((v7_2 instanceof l.b)) {
            ((m.q) ((l.b) v7_2)).a.onActionViewExpanded();
        }
        v0.t();
        return 1;
    }

    public final void g(android.content.Context p2, m.m p3)
    {
        p2 = this.a;
        if (p2 != null) {
            m.o v0 = this.b;
            if (v0 != null) {
                p2.d(v0);
            }
        }
        this.a = p3;
        return;
    }

    public final boolean h()
    {
        return 0;
    }

    public final boolean i(m.e0 p1)
    {
        return 0;
    }

    public final boolean k(m.o p7)
    {
        androidx.appcompat.widget.Toolbar v0 = this.c;
        int v1_0 = v0.o;
        if ((v1_0 instanceof l.b)) {
            ((m.q) ((l.b) v1_0)).a.onActionViewCollapsed();
        }
        v0.removeView(v0.o);
        v0.removeView(v0.n);
        v0.o = 0;
        java.util.ArrayList v2_0 = v0.K;
        int v3_1 = (v2_0.size() - 1);
        while (v3_1 >= 0) {
            v0.addView(((android.view.View) v2_0.get(v3_1)));
            v3_1--;
        }
        v2_0.clear();
        this.b = 0;
        v0.requestLayout();
        p7.C = 0;
        p7.n.p(0);
        v0.t();
        return 1;
    }
}
