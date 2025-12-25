package m;
public final class d0 extends m.u implements android.widget.PopupWindow$OnDismissListener, android.view.View$OnKeyListener {
    public final android.content.Context b;
    public final m.m c;
    public final m.j d;
    public final boolean e;
    public final int f;
    public final int m;
    public final n.l2 n;
    public final m.d o;
    public final f3.b p;
    public android.widget.PopupWindow$OnDismissListener q;
    public android.view.View r;
    public android.view.View s;
    public m.x t;
    public android.view.ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public d0(android.content.Context p5, m.m p6, android.view.View p7, int p8, boolean p9)
    {
        this.o = new m.d(this, 1);
        this.p = new f3.b(this, 3);
        this.y = 0;
        this.b = p5;
        this.c = p6;
        this.e = p9;
        this.d = new m.j(p6, android.view.LayoutInflater.from(p5), p9, 2131558419);
        this.m = p8;
        int v9_1 = p5.getResources();
        this.f = Math.max((v9_1.getDisplayMetrics().widthPixels / 2), v9_1.getDimensionPixelSize(2131165207));
        this.r = p7;
        this.n = new n.l2(p5, 0, p8, 0);
        p6.b(this, p5);
        return;
    }

    public final void a(m.m p2, boolean p3)
    {
        if (p2 == this.c) {
            this.dismiss();
            m.x v0_1 = this.t;
            if (v0_1 != null) {
                v0_1.a(p2, p3);
            }
        }
        return;
    }

    public final boolean b()
    {
        if ((this.v) || (!this.n.F.isShowing())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void c()
    {
        if (!this.b()) {
            if (!this.v) {
                n.l2 v0_3 = this.r;
                if (v0_3 != null) {
                    android.widget.FrameLayout v4_1;
                    this.s = v0_3;
                    n.l2 v0_1 = this.n;
                    int v2_0 = v0_1.F;
                    v0_1.F.setOnDismissListener(this);
                    v0_1.v = this;
                    v0_1.E = 1;
                    v2_0.setFocusable(1);
                    CharSequence v3_0 = this.s;
                    if (this.u != null) {
                        v4_1 = 0;
                    } else {
                        v4_1 = 1;
                    }
                    m.j v6_0 = v3_0.getViewTreeObserver();
                    this.u = v6_0;
                    if (v4_1 != null) {
                        v6_0.addOnGlobalLayoutListener(this.o);
                    }
                    v3_0.addOnAttachStateChangeListener(this.p);
                    v0_1.u = v3_0;
                    v0_1.r = this.y;
                    android.widget.FrameLayout v4_4 = this.b;
                    m.j v6_1 = this.d;
                    if (!this.w) {
                        this.x = m.u.m(v6_1, v4_4, this.f);
                        this.w = 1;
                    }
                    CharSequence v3_5;
                    v0_1.r(this.x);
                    v2_0.setInputMethodMode(2);
                    n.t1 v1_4 = this.a;
                    if (v1_4 == null) {
                        v3_5 = 0;
                    } else {
                        v3_5 = new android.graphics.Rect(v1_4);
                    }
                    v0_1.D = v3_5;
                    v0_1.c();
                    n.t1 v1_5 = v0_1.c;
                    v1_5.setOnKeyListener(this);
                    if (this.z) {
                        CharSequence v3_8 = this.c;
                        if (v3_8.m != null) {
                            android.widget.FrameLayout v4_7 = ((android.widget.FrameLayout) android.view.LayoutInflater.from(v4_4).inflate(2131558418, v1_5, 0));
                            android.widget.TextView v7_4 = ((android.widget.TextView) v4_7.findViewById(16908310));
                            if (v7_4 != null) {
                                v7_4.setText(v3_8.m);
                            }
                            v4_7.setEnabled(0);
                            v1_5.addHeaderView(v4_7, 0, 0);
                        }
                    }
                    v0_1.p(v6_1);
                    v0_1.c();
                    return;
                }
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        } else {
            return;
        }
    }

    public final void d()
    {
        this.w = 0;
        m.j v0_1 = this.d;
        if (v0_1 != null) {
            v0_1.notifyDataSetChanged();
        }
        return;
    }

    public final void dismiss()
    {
        if (this.b()) {
            this.n.dismiss();
        }
        return;
    }

    public final n.t1 f()
    {
        return this.n.c;
    }

    public final boolean h()
    {
        return 0;
    }

    public final boolean i(m.e0 p10)
    {
        if (p10.hasVisibleItems()) {
            m.w v2_0 = new m.w(this.b, p10, this.s, this.e, this.m, 0);
            m.x v10_1 = this.t;
            v2_0.h = v10_1;
            int v0_1 = v2_0.i;
            if (v0_1 != 0) {
                v0_1.j(v10_1);
            }
            m.x v10_3 = p10.f.size();
            int v0_2 = 0;
            while (v0_2 < v10_3) {
                android.view.View v5_0 = p10.getItem(v0_2);
                if ((!v5_0.isVisible()) || (v5_0.getIcon() == null)) {
                    v0_2++;
                } else {
                    m.x v10_4 = 1;
                }
                v2_0.g = v10_4;
                int v0_3 = v2_0.i;
                if (v0_3 != 0) {
                    v0_3.o(v10_4);
                }
                v2_0.j = this.q;
                this.q = 0;
                this.c.c(0);
                m.x v10_8 = this.n;
                int v0_4 = v10_8.f;
                m.x v10_9 = v10_8.m();
                if ((android.view.Gravity.getAbsoluteGravity(this.y, this.r.getLayoutDirection()) & 7) == 5) {
                    v0_4 += this.r.getWidth();
                }
                if (!v2_0.b()) {
                    if (v2_0.e != null) {
                        v2_0.d(v0_4, v10_9, 1, 1);
                    } else {
                        return 0;
                    }
                }
                m.x v10_10 = this.t;
                if (v10_10 != null) {
                    v10_10.h(p10);
                }
                return 1;
            }
            v10_4 = 0;
        }
        return 0;
    }

    public final void j(m.x p1)
    {
        this.t = p1;
        return;
    }

    public final void l(m.m p1)
    {
        return;
    }

    public final void n(android.view.View p1)
    {
        this.r = p1;
        return;
    }

    public final void o(boolean p2)
    {
        this.d.c = p2;
        return;
    }

    public final void onDismiss()
    {
        this.v = 1;
        this.c.c(1);
        int v0_6 = this.u;
        if (v0_6 != 0) {
            if (!v0_6.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener(this.o);
            this.u = 0;
        }
        this.s.removeOnAttachStateChangeListener(this.p);
        int v0_5 = this.q;
        if (v0_5 != 0) {
            v0_5.onDismiss();
        }
        return;
    }

    public final boolean onKey(android.view.View p1, int p2, android.view.KeyEvent p3)
    {
        if ((p3.getAction() != 1) || (p2 != 82)) {
            return 0;
        } else {
            this.dismiss();
            return 1;
        }
    }

    public final void p(int p1)
    {
        this.y = p1;
        return;
    }

    public final void q(int p2)
    {
        this.n.f = p2;
        return;
    }

    public final void r(android.widget.PopupWindow$OnDismissListener p1)
    {
        this.q = p1;
        return;
    }

    public final void s(boolean p1)
    {
        this.z = p1;
        return;
    }

    public final void t(int p2)
    {
        this.n.i(p2);
        return;
    }
}
