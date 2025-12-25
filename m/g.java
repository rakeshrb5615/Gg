package m;
public final class g extends m.u implements android.view.View$OnKeyListener, android.widget.PopupWindow$OnDismissListener {
    public boolean A;
    public boolean B;
    public m.x C;
    public android.view.ViewTreeObserver D;
    public android.widget.PopupWindow$OnDismissListener E;
    public boolean F;
    public final android.content.Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final android.os.Handler f;
    public final java.util.ArrayList m;
    public final java.util.ArrayList n;
    public final m.d o;
    public final f3.b p;
    public final j6.o q;
    public int r;
    public int s;
    public android.view.View t;
    public android.view.View u;
    public int v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public g(android.content.Context p3, android.view.View p4, int p5, boolean p6)
    {
        this.m = new java.util.ArrayList();
        this.n = new java.util.ArrayList();
        this.o = new m.d(this, 0);
        this.p = new f3.b(this, 2);
        this.q = new j6.o(this, 2);
        int v0_5 = 0;
        this.r = 0;
        this.s = 0;
        this.b = p3;
        this.t = p4;
        this.d = p5;
        this.e = p6;
        this.A = 0;
        if (p4.getLayoutDirection() != 1) {
            v0_5 = 1;
        }
        this.v = v0_5;
        android.os.Handler v3_1 = p3.getResources();
        this.c = Math.max((v3_1.getDisplayMetrics().widthPixels / 2), v3_1.getDimensionPixelSize(2131165207));
        this.f = new android.os.Handler();
        return;
    }

    public final void a(m.m p7, boolean p8)
    {
        java.util.ArrayList v0 = this.n;
        int v1_2 = v0.size();
        int v3_0 = 0;
        while (v3_0 < v1_2) {
            if (p7 != ((m.f) v0.get(v3_0)).b) {
                v3_0++;
            }
            if (v3_0 >= 0) {
                int v1_0 = (v3_0 + 1);
                if (v1_0 < v0.size()) {
                    ((m.f) v0.get(v1_0)).b.c(0);
                }
                int v1_6 = ((m.f) v0.remove(v3_0));
                int v1_7 = v1_6.a;
                int v4_2 = v1_7.F;
                v1_6.b.r(this);
                if (this.F) {
                    n.i2.b(v4_2, 0);
                    v4_2.setAnimationStyle(0);
                }
                v1_7.dismiss();
                int v1_8 = v0.size();
                if (v1_8 <= 0) {
                    int v4_5;
                    if (this.t.getLayoutDirection() != 1) {
                        v4_5 = 1;
                    } else {
                        v4_5 = 0;
                    }
                    this.v = v4_5;
                } else {
                    this.v = ((m.f) v0.get((v1_8 - 1))).c;
                }
                if (v1_8 != 0) {
                    if (p8 != null) {
                        ((m.f) v0.get(0)).b.c(0);
                    }
                } else {
                    this.dismiss();
                    m.d v8_1 = this.C;
                    if (v8_1 != null) {
                        v8_1.a(p7, 1);
                    }
                    android.view.ViewTreeObserver v7_4 = this.D;
                    if (v7_4 != null) {
                        if (v7_4.isAlive()) {
                            this.D.removeGlobalOnLayoutListener(this.o);
                        }
                        this.D = 0;
                    }
                    this.u.removeOnAttachStateChangeListener(this.p);
                    this.E.onDismiss();
                    return;
                }
            }
            return;
        }
        v3_0 = -1;
    }

    public final boolean b()
    {
        int v0_0 = this.n;
        if ((v0_0.size() <= 0) || (!((m.f) v0_0.get(0)).a.F.isShowing())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void c()
    {
        if (!this.b()) {
            android.view.View v0_4 = this.m;
            f3.b v1_3 = v0_4.size();
            int v2 = 0;
            int v3 = 0;
            while (v3 < v1_3) {
                m.m v4_0 = v0_4.get(v3);
                v3++;
                this.u(((m.m) v4_0));
            }
            v0_4.clear();
            android.view.View v0_1 = this.t;
            this.u = v0_1;
            if (v0_1 != null) {
                if (this.D == null) {
                    v2 = 1;
                }
                android.view.View v0_2 = v0_1.getViewTreeObserver();
                this.D = v0_2;
                if (v2 != 0) {
                    v0_2.addOnGlobalLayoutListener(this.o);
                }
                this.u.addOnAttachStateChangeListener(this.p);
            }
        }
        return;
    }

    public final void d()
    {
        java.util.ArrayList v0 = this.n;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            m.j v3_3;
            m.j v3_6 = v0.get(v2);
            v2++;
            m.j v3_2 = ((m.f) v3_6).a.c.getAdapter();
            if (!(v3_2 instanceof android.widget.HeaderViewListAdapter)) {
                v3_3 = ((m.j) v3_2);
            } else {
                v3_3 = ((m.j) ((android.widget.HeaderViewListAdapter) v3_2).getWrappedAdapter());
            }
            v3_3.notifyDataSetChanged();
        }
        return;
    }

    public final void dismiss()
    {
        m.f[] v0_0 = this.n;
        int v1_1 = v0_0.size();
        if (v1_1 > 0) {
            n.l2 v2_2 = new m.f[v1_1];
            m.f[] v0_2 = ((m.f[]) v0_0.toArray(v2_2));
            int v1_0 = (v1_1 - 1);
            while (v1_0 >= 0) {
                n.l2 v2_0 = v0_2[v1_0];
                if (v2_0.a.F.isShowing()) {
                    v2_0.a.dismiss();
                }
                v1_0--;
            }
        }
        return;
    }

    public final n.t1 f()
    {
        n.t1 v0_0 = this.n;
        if (!v0_0.isEmpty()) {
            return ((m.f) v0_0.get((v0_0.size() - 1))).a.c;
        } else {
            return 0;
        }
    }

    public final boolean h()
    {
        return 0;
    }

    public final boolean i(m.e0 p8)
    {
        m.x v0_0 = this.n;
        int v1 = v0_0.size();
        int v3 = 0;
        while (v3 < v1) {
            m.f v5_0 = v0_0.get(v3);
            v3++;
            m.f v5_1 = ((m.f) v5_0);
            if (p8 == v5_1.b) {
                v5_1.a.c.requestFocus();
                return 1;
            }
        }
        if (!p8.hasVisibleItems()) {
            return 0;
        } else {
            this.l(p8);
            m.x v0_1 = this.C;
            if (v0_1 != null) {
                v0_1.h(p8);
            }
            return 1;
        }
    }

    public final void j(m.x p1)
    {
        this.C = p1;
        return;
    }

    public final void l(m.m p2)
    {
        p2.b(this, this.b);
        if (!this.b()) {
            this.m.add(p2);
            return;
        } else {
            this.u(p2);
            return;
        }
    }

    public final void n(android.view.View p2)
    {
        if (this.t != p2) {
            this.t = p2;
            this.s = android.view.Gravity.getAbsoluteGravity(this.r, p2.getLayoutDirection());
        }
        return;
    }

    public final void o(boolean p1)
    {
        this.A = p1;
        return;
    }

    public final void onDismiss()
    {
        m.m v0_0 = this.n;
        int v1 = v0_0.size();
        int v3 = 0;
        while (v3 < v1) {
            int v4_0 = ((m.f) v0_0.get(v3));
            if (v4_0.a.F.isShowing()) {
                v3++;
            }
            if (v4_0 != 0) {
                v4_0.b.c(0);
            }
            return;
        }
        v4_0 = 0;
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

    public final void p(int p2)
    {
        if (this.r != p2) {
            this.r = p2;
            this.s = android.view.Gravity.getAbsoluteGravity(p2, this.t.getLayoutDirection());
        }
        return;
    }

    public final void q(int p2)
    {
        this.w = 1;
        this.y = p2;
        return;
    }

    public final void r(android.widget.PopupWindow$OnDismissListener p1)
    {
        this.E = p1;
        return;
    }

    public final void s(boolean p1)
    {
        this.B = p1;
        return;
    }

    public final void t(int p2)
    {
        this.x = 1;
        this.z = p2;
        return;
    }

    public final void u(m.m p18)
    {
        n.t1 v2_0 = this.b;
        android.widget.FrameLayout v3_2 = android.view.LayoutInflater.from(v2_0);
        android.widget.TextView v4_12 = new m.j(p18, v3_2, this.e, 2131558411);
        if ((this.b()) || (!this.A)) {
            if (this.b()) {
                int v5_10 = p18.f.size();
                int v8_0 = 0;
                while (v8_0 < v5_10) {
                    int v9_21 = p18.getItem(v8_0);
                    if ((!v9_21.isVisible()) || (v9_21.getIcon() == null)) {
                        v8_0++;
                    } else {
                        int v5_14 = 1;
                    }
                    v4_12.c = v5_14;
                }
                v5_14 = 0;
            }
        } else {
            v4_12.c = 1;
        }
        android.view.View v7_4;
        int v16;
        android.widget.TextView v4_8;
        int v5_9 = m.u.m(v4_12, v2_0, this.c);
        int v8_2 = new n.l2(v2_0, 0, this.d, 0);
        v8_2.I = this.q;
        v8_2.v = this;
        v8_2.F.setOnDismissListener(this);
        v8_2.u = this.t;
        v8_2.r = this.s;
        v8_2.E = 1;
        v8_2.F.setFocusable(1);
        v8_2.F.setInputMethodMode(2);
        v8_2.p(v4_12);
        v8_2.r(v5_9);
        v8_2.r = this.s;
        n.t1 v2_9 = this.n;
        if (v2_9.size() <= 0) {
            v16 = 1;
            v4_8 = 0;
            v7_4 = 0;
        } else {
            v4_8 = ((m.f) v2_9.get((v2_9.size() - 1)));
            int v11_4 = v4_8.b;
            int v12_6 = v11_4.f.size();
            int v13_3 = 0;
            while (v13_3 < v12_6) {
                boolean v14 = v11_4.getItem(v13_3);
                if ((!v14.hasSubMenu()) || (p18 != v14.getSubMenu())) {
                    v13_3++;
                }
                if (v14) {
                    int v12_2;
                    int v13_0;
                    int v11_6 = v4_8.a.c;
                    int v12_7 = v11_6.getAdapter();
                    if (!(v12_7 instanceof android.widget.HeaderViewListAdapter)) {
                        v12_2 = ((m.j) v12_7);
                        v13_0 = 0;
                    } else {
                        int v12_0 = ((android.widget.HeaderViewListAdapter) v12_7);
                        v13_0 = v12_0.getHeadersCount();
                        v12_2 = ((m.j) v12_0.getWrappedAdapter());
                    }
                    int v15_0 = v12_2.getCount();
                    v16 = 1;
                    android.view.View v7_0 = 0;
                    while (v7_0 < v15_0) {
                        if (v14 != v12_2.b(v7_0)) {
                            v7_0++;
                        }
                        if (v7_0 != -1) {
                            android.view.View v7_3 = ((v7_0 + v13_0) - v11_6.getFirstVisiblePosition());
                            if ((v7_3 >= null) && (v7_3 < v11_6.getChildCount())) {
                                v7_4 = v11_6.getChildAt(v7_3);
                            }
                        }
                    }
                    v7_0 = -1;
                } else {
                    v16 = 1;
                    v7_4 = 0;
                }
            }
            v14 = 0;
        }
        if (v7_4 == null) {
            if (this.w) {
                v8_2.f = this.y;
            }
            if (this.x) {
                v8_2.i(this.z);
            }
            int v10_1;
            int v5_6 = this.a;
            if (v5_6 == 0) {
                v10_1 = 0;
            } else {
                v10_1 = new android.graphics.Rect(v5_6);
            }
            v8_2.D = v10_1;
        } else {
            int v11_0 = v8_2.F;
            if (android.os.Build$VERSION.SDK_INT > 28) {
                n.j2.a(v11_0, 0);
            } else {
                int v9_4 = n.l2.J;
                if (v9_4 != 0) {
                    try {
                        v9_4.invoke(v11_0, new Object[] {Boolean.FALSE}));
                    } catch (Exception) {
                        android.util.Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            }
            int v13_2;
            int v9_18;
            n.i2.a(v8_2.F, 0);
            int v9_12 = ((m.f) v2_9.get((v2_9.size() - 1))).a.c;
            int v10_9 = new int[2];
            v9_12.getLocationOnScreen(v10_9);
            int v11_2 = new android.graphics.Rect();
            this.u.getWindowVisibleDisplayFrame(v11_2);
            if (this.v != v16) {
                if ((v10_9[0] - v5_9) >= 0) {
                    v13_2 = 0;
                    v9_18 = 1;
                } else {
                    v9_18 = 1;
                    v13_2 = 1;
                }
            } else {
                if (((v9_12.getWidth() + v10_9[0]) + v5_9) <= v11_2.right) {
                }
            }
            int v9_19;
            if (v13_2 != v9_18) {
                v9_19 = 0;
            } else {
                v9_19 = 1;
            }
            this.v = v13_2;
            v8_2.u = v7_4;
            if ((this.s & 5) != 5) {
                if (v9_19 == 0) {
                    v5_9 = (0 - v5_9);
                } else {
                    v5_9 = v7_4.getWidth();
                }
            } else {
                if (v9_19 == 0) {
                    v5_9 = (0 - v7_4.getWidth());
                }
            }
            v8_2.f = v5_9;
            v8_2.q = 1;
            v8_2.p = 1;
            v8_2.i(0);
        }
        v2_9.add(new m.f(v8_2, p18, this.v));
        v8_2.c();
        n.t1 v2_1 = v8_2.c;
        v2_1.setOnKeyListener(this);
        if ((v4_8 == null) && ((this.B) && (p18.m != null))) {
            android.widget.FrameLayout v3_1 = ((android.widget.FrameLayout) v3_2.inflate(2131558418, v2_1, 0));
            android.widget.TextView v4_5 = ((android.widget.TextView) v3_1.findViewById(16908310));
            v3_1.setEnabled(0);
            v4_5.setText(p18.m);
            v2_1.addHeaderView(v3_1, 0, 0);
            v8_2.c();
        }
        return;
    }
}
