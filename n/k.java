package n;
public final class k implements m.y {
    public n.i A;
    public n.h B;
    public final j6.o C;
    public final android.content.Context a;
    public android.content.Context b;
    public m.m c;
    public final android.view.LayoutInflater d;
    public m.x e;
    public final int f;
    public final int m;
    public m.a0 n;
    public n.j o;
    public android.graphics.drawable.Drawable p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public final android.util.SparseBooleanArray x;
    public n.g y;
    public n.g z;

    public k(android.content.Context p2)
    {
        this.a = p2;
        this.d = android.view.LayoutInflater.from(p2);
        this.f = 2131558403;
        this.m = 2131558402;
        this.x = new android.util.SparseBooleanArray();
        this.C = new j6.o(this, 4);
        return;
    }

    public final void a(m.m p3, boolean p4)
    {
        this.c();
        m.u v0_0 = this.z;
        if ((v0_0 != null) && (v0_0.b())) {
            v0_0.i.dismiss();
        }
        m.u v0_2 = this.e;
        if (v0_2 != null) {
            v0_2.a(p3, p4);
        }
        return;
    }

    public final android.view.View b(m.o p4, android.view.View p5, android.view.ViewGroup p6)
    {
        android.view.View v0_0 = p4.getActionView();
        int v1 = 0;
        if ((v0_0 == null) || (p4.e())) {
            boolean v5_2;
            if (!(p5 instanceof m.z)) {
                v5_2 = ((m.z) this.d.inflate(this.m, p6, 0));
            } else {
                v5_2 = ((m.z) p5);
            }
            v5_2.a(p4);
            androidx.appcompat.view.menu.ActionMenuItemView v2_1 = ((androidx.appcompat.view.menu.ActionMenuItemView) v5_2);
            v2_1.setItemInvoker(((androidx.appcompat.widget.ActionMenuView) this.n));
            if (this.B == null) {
                this.B = new n.h(this);
            }
            v2_1.setPopupCallback(this.B);
            v0_0 = ((android.view.View) v5_2);
        }
        if (p4.C) {
            v1 = 8;
        }
        v0_0.setVisibility(v1);
        n.m v4_2 = v0_0.getLayoutParams();
        ((androidx.appcompat.widget.ActionMenuView) p6).getClass();
        if (!(v4_2 instanceof n.m)) {
            v0_0.setLayoutParams(androidx.appcompat.widget.ActionMenuView.k(v4_2));
        }
        return v0_0;
    }

    public final boolean c()
    {
        m.u v0_0 = this.A;
        if (v0_0 != null) {
            boolean v2_2 = this.n;
            if (v2_2) {
                ((android.view.View) v2_2).removeCallbacks(v0_0);
                this.A = 0;
                return 1;
            }
        }
        m.u v0_3 = this.y;
        if (v0_3 == null) {
            return 0;
        } else {
            if (v0_3.b()) {
                v0_3.i.dismiss();
            }
            return 1;
        }
    }

    public final void d()
    {
        androidx.appcompat.widget.ActionMenuView v0_1 = ((android.view.ViewGroup) this.n);
        n.j v1_5 = 0;
        n.m v2_1 = 0;
        if (v0_1 != null) {
            int v6;
            android.view.View v3_3 = this.c;
            if (v3_3 == null) {
                v6 = 0;
            } else {
                v3_3.i();
                android.view.View v3_0 = this.c.l();
                int v4_1 = v3_0.size();
                int v5_2 = 0;
                v6 = 0;
                while (v5_2 < v4_1) {
                    android.view.ViewGroup v7_1 = ((m.o) v3_0.get(v5_2));
                    if ((v7_1.x & 32) == 32) {
                        java.util.ArrayList v9_2;
                        android.view.View v8_2 = v0_1.getChildAt(v6);
                        if (!(v8_2 instanceof m.z)) {
                            v9_2 = 0;
                        } else {
                            v9_2 = ((m.z) v8_2).getItemData();
                        }
                        android.view.View v10 = this.b(v7_1, v8_2, v0_1);
                        if (v7_1 != v9_2) {
                            v10.setPressed(0);
                            v10.jumpDrawablesToCurrentState();
                        }
                        if (v10 != v8_2) {
                            android.view.ViewGroup v7_3 = ((android.view.ViewGroup) v10.getParent());
                            if (v7_3 != null) {
                                v7_3.removeView(v10);
                            }
                            ((android.view.ViewGroup) this.n).addView(v10, v6);
                        }
                        v6++;
                    }
                    v5_2++;
                }
            }
            while (v6 < v0_1.getChildCount()) {
                if (v0_1.getChildAt(v6) != this.o) {
                    v0_1.removeViewAt(v6);
                } else {
                    v6++;
                }
            }
        }
        ((android.view.View) this.n).requestLayout();
        androidx.appcompat.widget.ActionMenuView v0_12 = this.c;
        if (v0_12 != null) {
            v0_12.i();
            androidx.appcompat.widget.ActionMenuView v0_13 = v0_12.i;
            android.view.View v3_4 = v0_13.size();
            int v4_0 = 0;
            while (v4_0 < v3_4) {
                v0_13.get(v4_0);
                v4_0++;
            }
        }
        androidx.appcompat.widget.ActionMenuView v0_14 = this.c;
        if (v0_14 != null) {
            v0_14.i();
            v1_5 = v0_14.j;
        }
        if ((this.r) && (v1_5 != null)) {
            androidx.appcompat.widget.ActionMenuView v0_16 = v1_5.size();
            if (v0_16 != 1) {
                if (v0_16 > null) {
                    v2_1 = 1;
                }
            } else {
                v2_1 = (((m.o) v1_5.get(0)).C ^ 1);
            }
        }
        if (v2_1 == null) {
            androidx.appcompat.widget.ActionMenuView v0_20 = this.o;
            if (v0_20 != null) {
                n.j v1_6 = this.n;
                if (v0_20.getParent() == v1_6) {
                    ((android.view.ViewGroup) v1_6).removeView(this.o);
                }
            }
        } else {
            if (this.o == null) {
                this.o = new n.j(this, this.a);
            }
            androidx.appcompat.widget.ActionMenuView v0_5 = ((android.view.ViewGroup) this.o.getParent());
            if (v0_5 != this.n) {
                if (v0_5 != null) {
                    v0_5.removeView(this.o);
                }
                androidx.appcompat.widget.ActionMenuView v0_7 = ((androidx.appcompat.widget.ActionMenuView) this.n);
                n.j v1_3 = this.o;
                v0_7.getClass();
                n.m v2_0 = androidx.appcompat.widget.ActionMenuView.j();
                v2_0.a = 1;
                v0_7.addView(v1_3, v2_0);
            }
        }
        ((androidx.appcompat.widget.ActionMenuView) this.n).setOverflowReserved(this.r);
        return;
    }

    public final boolean e(m.o p1)
    {
        return 0;
    }

    public final boolean f()
    {
        int v0_0 = this.y;
        if ((v0_0 == 0) || (!v0_0.b())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void g(android.content.Context p5, m.m p6)
    {
        this.b = p5;
        android.view.LayoutInflater.from(p5);
        this.c = p6;
        android.content.res.Resources v6_1 = p5.getResources();
        if (!this.s) {
            this.r = 1;
        }
        int v1_0 = 2;
        this.t = (p5.getResources().getDisplayMetrics().widthPixels / 2);
        int v5_2 = p5.getResources().getConfiguration();
        int v0_4 = v5_2.screenWidthDp;
        android.graphics.drawable.Drawable v2_0 = v5_2.screenHeightDp;
        if (((v5_2.smallestScreenWidthDp <= 600) && ((v0_4 <= 600) && ((v0_4 <= 960) || (v2_0 <= 720)))) && ((v0_4 <= 720) || (v2_0 <= 960))) {
            if (((v0_4 < 500) && ((v0_4 <= 640) || (v2_0 <= 480))) && ((v0_4 <= 480) || (v2_0 <= 640))) {
                if (v0_4 >= 360) {
                    v1_0 = 3;
                }
            } else {
                v1_0 = 4;
            }
        } else {
            v1_0 = 5;
        }
        this.v = v1_0;
        int v5_8 = this.t;
        if (!this.r) {
            this.o = 0;
        } else {
            if (this.o == null) {
                int v0_9 = new n.j(this, this.a);
                this.o = v0_9;
                if (this.q) {
                    v0_9.setImageDrawable(this.p);
                    this.p = 0;
                    this.q = 0;
                }
                this.o.measure(android.view.View$MeasureSpec.makeMeasureSpec(0, 0), android.view.View$MeasureSpec.makeMeasureSpec(0, 0));
            }
            v5_8 -= this.o.getMeasuredWidth();
        }
        this.u = v5_8;
        v6_1.getDisplayMetrics();
        return;
    }

    public final boolean h()
    {
        int v4;
        int v1_1;
        int v0_0 = this;
        int v1_0 = this.c;
        if (v1_0 == 0) {
            v4 = 0;
            v1_1 = 0;
        } else {
            v1_1 = v1_0.l();
            v4 = v1_1.size();
        }
        int v5_0 = this.v;
        int v6 = this.u;
        int v7 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup v8_1 = ((android.view.ViewGroup) this.n);
        int v9_1 = 0;
        m.o v10_0 = 0;
        int v11_2 = 0;
        int v12_1 = 0;
        while(true) {
            int v13_0 = 2;
            m.o v14_0 = 1;
            if (v9_1 >= v4) {
                break;
            }
            int v15_1 = ((m.o) v1_1.get(v9_1));
            int v3_1 = v15_1.y;
            if ((v3_1 & 2) != 2) {
                if ((v3_1 & 1) != 1) {
                    v10_0 = 1;
                } else {
                    v12_1++;
                }
            } else {
                v11_2++;
            }
            if ((this.w) && (v15_1.C)) {
                v5_0 = 0;
            }
            v9_1++;
        }
        if ((this.r) && ((v10_0 != null) || ((v12_1 + v11_2) > v5_0))) {
            v5_0--;
        }
        int v5_1 = (v5_0 - v11_2);
        boolean v2_5 = this.x;
        v2_5.clear();
        int v3_0 = 0;
        int v9_0 = 0;
        while (v3_0 < v4) {
            int v12_4;
            m.o v10_2 = ((m.o) v1_1.get(v3_0));
            int v11_3 = v10_2.y;
            if ((v11_3 & 2) != v13_0) {
                v12_4 = 0;
            } else {
                v12_4 = v14_0;
            }
            int v15_2 = v10_2.b;
            if (v12_4 == 0) {
                if ((v11_3 & 1) != v14_0) {
                    v10_2.f(0);
                } else {
                    int v12_5;
                    int v11_5 = v2_5.get(v15_2);
                    if (((v5_1 <= 0) && (v11_5 == 0)) || (v6 <= 0)) {
                        v12_5 = 0;
                    } else {
                        v12_5 = v14_0;
                    }
                    if (v12_5 != 0) {
                        m.o v14_1 = v0_0.b(v10_2, 0, v8_1);
                        v14_1.measure(v7, v7);
                        m.o v14_2 = v14_1.getMeasuredWidth();
                        v6 -= v14_2;
                        if (v9_0 == 0) {
                            v9_0 = v14_2;
                        }
                        m.o v14_4;
                        if ((v6 + v9_0) <= 0) {
                            v14_4 = 0;
                        } else {
                            v14_4 = 1;
                        }
                        v12_5 &= v14_4;
                    }
                    if ((v12_5 == 0) || (v15_2 == 0)) {
                        if (v11_5 != 0) {
                            v2_5.put(v15_2, 0);
                            int v11_7 = 0;
                            while (v11_7 < v3_0) {
                                m.o v14_6 = ((m.o) v1_1.get(v11_7));
                                if (v14_6.b == v15_2) {
                                    if ((v14_6.x & 32) == 32) {
                                        v5_1++;
                                    }
                                    v14_6.f(0);
                                }
                                v11_7++;
                                int v0 = this;
                            }
                        }
                    } else {
                        v2_5.put(v15_2, 1);
                    }
                    if (v12_5 != 0) {
                        v5_1--;
                    }
                    v10_2.f(v12_5);
                }
            } else {
                int v11_0 = v0_0.b(v10_2, 0, v8_1);
                v11_0.measure(v7, v7);
                int v11_1 = v11_0.getMeasuredWidth();
                v6 -= v11_1;
                if (v9_0 == 0) {
                    v9_0 = v11_1;
                }
                if (v15_2 != 0) {
                    v2_5.put(v15_2, v14_0);
                }
                v10_2.f(v14_0);
            }
            v3_0++;
            v13_0 = 2;
            v0_0 = this;
            v14_0 = 1;
        }
        return v14_0;
    }

    public final boolean i(m.e0 p9)
    {
        if (p9.hasVisibleItems()) {
            String v0_5 = p9;
            while(true) {
                android.view.View v2_3 = v0_5.z;
                if (v2_3 == this.c) {
                    break;
                }
                v0_5 = ((m.e0) v2_3);
            }
            String v0_10 = v0_5.A;
            android.view.View v2_0 = ((android.view.ViewGroup) this.n);
            boolean v3_0 = 0;
            if (v2_0 != null) {
                int v4_0 = v2_0.getChildCount();
                android.content.Context v5_0 = 0;
                while (v5_0 < v4_0) {
                    boolean v6_0 = v2_0.getChildAt(v5_0);
                    if ((!(v6_0 instanceof m.z)) || (((m.z) v6_0).getItemData() != v0_10)) {
                        v5_0++;
                    } else {
                        v3_0 = v6_0;
                        break;
                    }
                }
            }
            if (v3_0) {
                p9.A.getClass();
                String v0_3 = p9.f.size();
                android.view.View v2_1 = 0;
                while (v2_1 < v0_3) {
                    android.content.Context v5_1 = p9.getItem(v2_1);
                    if ((!v5_1.isVisible()) || (v5_1.getIcon() == null)) {
                        v2_1++;
                    } else {
                        String v0_4 = 1;
                    }
                    android.view.View v2_4 = new n.g(this, this.b, p9, v3_0);
                    this.z = v2_4;
                    v2_4.g = v0_4;
                    android.view.View v2_5 = v2_4.i;
                    if (v2_5 != null) {
                        v2_5.o(v0_4);
                    }
                    String v0_6 = this.z;
                    if (!v0_6.b()) {
                        if (v0_6.e == null) {
                            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                        } else {
                            v0_6.d(0, 0, 0, 0);
                        }
                    }
                    String v0_8 = this.e;
                    if (v0_8 != null) {
                        v0_8.h(p9);
                    }
                    return 1;
                }
                v0_4 = 0;
            }
        }
        return 0;
    }

    public final void j(m.x p1)
    {
        throw 0;
    }

    public final boolean k(m.o p1)
    {
        return 0;
    }

    public final boolean l()
    {
        if ((this.r) && (!this.f())) {
            int v0_10 = this.c;
            if ((v0_10 != 0) && ((this.n != null) && (this.A == null))) {
                v0_10.i();
                if (!v0_10.j.isEmpty()) {
                    n.i v1_2 = new n.i(this, new n.g(this, this.b, this.c, this.o));
                    this.A = v1_2;
                    ((android.view.View) this.n).post(v1_2);
                    return 1;
                }
            }
        }
        return 0;
    }
}
