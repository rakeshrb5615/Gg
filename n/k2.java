package n;
public final class k2 extends n.t1 {
    public final int s;
    public final int t;
    public n.h2 u;
    public m.o v;

    public k2(android.content.Context p3, boolean p4)
    {
        super(p3, p4);
        if (1 != p3.getResources().getConfiguration().getLayoutDirection()) {
            super.s = 22;
            super.t = 21;
            return;
        } else {
            super.s = 21;
            super.t = 22;
            return;
        }
    }

    public final boolean onHoverEvent(android.view.MotionEvent p5)
    {
        if (this.u != null) {
            m.m v0_2;
            m.o v1_0;
            m.m v0_3 = this.getAdapter();
            if (!(v0_3 instanceof android.widget.HeaderViewListAdapter)) {
                v0_2 = ((m.j) v0_3);
                v1_0 = 0;
            } else {
                m.m v0_5 = ((android.widget.HeaderViewListAdapter) v0_3);
                v1_0 = v0_5.getHeadersCount();
                v0_2 = ((m.j) v0_5.getWrappedAdapter());
            }
            m.o v1_2;
            if (p5.getAction() == 10) {
                v1_2 = 0;
            } else {
                n.h2 v2_3 = this.pointToPosition(((int) p5.getX()), ((int) p5.getY()));
                if (v2_3 == -1) {
                } else {
                    n.h2 v2_4 = (v2_3 - v1_0);
                    if ((v2_4 < null) || (v2_4 >= v0_2.getCount())) {
                    } else {
                        v1_2 = v0_2.b(v2_4);
                    }
                }
            }
            n.h2 v2_5 = this.v;
            if (v2_5 != v1_2) {
                m.m v0_4 = v0_2.a;
                if (v2_5 != null) {
                    this.u.n(v0_4, v2_5);
                }
                this.v = v1_2;
                if (v1_2 != null) {
                    this.u.d(v0_4, v1_2);
                }
            }
        }
        return super.onHoverEvent(p5);
    }

    public final boolean onKeyDown(int p5, android.view.KeyEvent p6)
    {
        int v0_1 = ((androidx.appcompat.view.menu.ListMenuItemView) this.getSelectedView());
        if ((v0_1 == 0) || (p5 != this.s)) {
            if ((v0_1 == 0) || (p5 != this.t)) {
                return super.onKeyDown(p5, p6);
            } else {
                m.m v5_4;
                this.setSelection(-1);
                m.m v5_3 = this.getAdapter();
                if (!(v5_3 instanceof android.widget.HeaderViewListAdapter)) {
                    v5_4 = ((m.j) v5_3);
                } else {
                    v5_4 = ((m.j) ((android.widget.HeaderViewListAdapter) v5_3).getWrappedAdapter());
                }
                v5_4.a.c(0);
                return 1;
            }
        } else {
            if ((v0_1.isEnabled()) && (v0_1.getItemData().hasSubMenu())) {
                this.performItemClick(v0_1, this.getSelectedItemPosition(), this.getSelectedItemId());
            }
            return 1;
        }
    }

    public void setHoverListener(n.h2 p1)
    {
        this.u = p1;
        return;
    }

    public bridge synthetic void setSelector(android.graphics.drawable.Drawable p1)
    {
        super.setSelector(p1);
        return;
    }
}
