package m;
public abstract class u implements m.c0, m.y, android.widget.AdapterView$OnItemClickListener {
    public android.graphics.Rect a;

    public static int m(android.widget.ListAdapter p10, android.content.Context p11, int p12)
    {
        int v0 = 0;
        int v1 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
        int v2 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
        int v3 = p10.getCount();
        int v5 = 0;
        int v6 = 0;
        android.widget.FrameLayout v7_0 = 0;
        android.view.View v8 = 0;
        while (v0 < v3) {
            int v9_0 = p10.getItemViewType(v0);
            if (v9_0 != v6) {
                v8 = 0;
                v6 = v9_0;
            }
            if (v7_0 == null) {
                v7_0 = new android.widget.FrameLayout(p11);
            }
            v8 = p10.getView(v0, v8, v7_0);
            v8.measure(v1, v2);
            int v9_1 = v8.getMeasuredWidth();
            if (v9_1 < p12) {
                if (v9_1 > v5) {
                    v5 = v9_1;
                }
                v0++;
            } else {
                return p12;
            }
        }
        return v5;
    }

    public final boolean e(m.o p1)
    {
        return 0;
    }

    public final void g(android.content.Context p1, m.m p2)
    {
        return;
    }

    public final boolean k(m.o p1)
    {
        return 0;
    }

    public abstract void l();

    public abstract void n();

    public abstract void o();

    public final void onItemClick(android.widget.AdapterView p1, android.view.View p2, int p3, long p4)
    {
        m.m v2_1;
        android.view.MenuItem v1_4 = ((android.widget.ListAdapter) p1.getAdapter());
        if (!(v1_4 instanceof android.widget.HeaderViewListAdapter)) {
            v2_1 = ((m.j) v1_4);
        } else {
            v2_1 = ((m.j) ((android.widget.HeaderViewListAdapter) v1_4).getWrappedAdapter());
        }
        int v3_2;
        m.m v2_2 = v2_1.a;
        android.view.MenuItem v1_2 = v1_4.getItem(p3);
        if ((this instanceof m.g)) {
            v3_2 = 4;
        } else {
            v3_2 = 0;
        }
        v2_2.q(((android.view.MenuItem) v1_2), this, v3_2);
        return;
    }

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();
}
