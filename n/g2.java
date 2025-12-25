package n;
public class g2 implements m.c0 {
    public static final reflect.Method G;
    public static final reflect.Method H;
    public final n.c2 A;
    public final android.os.Handler B;
    public final android.graphics.Rect C;
    public android.graphics.Rect D;
    public boolean E;
    public final n.b0 F;
    public final android.content.Context a;
    public android.widget.ListAdapter b;
    public n.t1 c;
    public final int d;
    public int e;
    public int f;
    public int m;
    public final int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public final int s;
    public n.d2 t;
    public android.view.View u;
    public android.widget.AdapterView$OnItemClickListener v;
    public android.widget.AdapterView$OnItemSelectedListener w;
    public final n.c2 x;
    public final n.f2 y;
    public final n.e2 z;

    static g2()
    {
        if (android.os.Build$VERSION.SDK_INT <= 28) {
            try {
                n.g2.G = android.widget.PopupWindow.getDeclaredMethod("setClipToScreenEnabled", new Class[] {Boolean.TYPE}));
                try {
                    n.g2.H = android.widget.PopupWindow.getDeclaredMethod("setEpicenterBounds", new Class[] {android.graphics.Rect}));
                } catch (NoSuchMethodException) {
                    android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
                }
            } catch (NoSuchMethodException) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        return;
    }

    public g2(android.content.Context p4, android.util.AttributeSet p5, int p6, int p7)
    {
        this.d = -2;
        this.e = -2;
        this.n = 1002;
        this.r = 0;
        this.s = 2147483647;
        this.x = new n.c2(this, 1);
        this.y = new n.f2(this);
        this.z = new n.e2(this);
        this.A = new n.c2(this, 0);
        this.C = new android.graphics.Rect();
        this.a = p4;
        this.B = new android.os.Handler(p4.getMainLooper());
        n.b0 v0_13 = p4.obtainStyledAttributes(p5, g.a.o, p6, 0);
        this.f = v0_13.getDimensionPixelOffset(0, 0);
        boolean v2_0 = v0_13.getDimensionPixelOffset(1, 0);
        this.m = v2_0;
        if (v2_0) {
            this.o = 1;
        }
        v0_13.recycle();
        n.b0 v0_15 = new n.b0(p4, p5, p6, 0);
        android.content.res.TypedArray v5_1 = p4.obtainStyledAttributes(p5, g.a.s, p6, 0);
        if (v5_1.hasValue(2)) {
            v0_15.setOverlapAnchor(v5_1.getBoolean(2, 0));
        }
        android.graphics.drawable.Drawable v4_1;
        if (!v5_1.hasValue(0)) {
            v4_1 = v5_1.getDrawable(0);
        } else {
            int v6_4 = v5_1.getResourceId(0, 0);
            if (v6_4 == 0) {
            } else {
                v4_1 = j5.t1.A(p4, v6_4);
            }
        }
        v0_15.setBackgroundDrawable(v4_1);
        v5_1.recycle();
        this.F = v0_15;
        v0_15.setInputMethodMode(1);
        return;
    }

    public final int a()
    {
        return this.f;
    }

    public final boolean b()
    {
        return this.F.isShowing();
    }

    public final void c()
    {
        n.c2 v1_0 = this.a;
        n.b0 v3 = this.F;
        if (this.c != null) {
            v3.getContentView();
        } else {
            android.os.Handler v0_2 = this.q(v1_0, (this.E ^ 1));
            this.c = v0_2;
            v0_2.setAdapter(this.b);
            this.c.setOnItemClickListener(this.v);
            this.c.setFocusable(1);
            this.c.setFocusableInTouchMode(1);
            this.c.setOnItemSelectedListener(new n.z1(this));
            this.c.setOnScrollListener(this.z);
            android.os.Handler v0_30 = this.w;
            if (v0_30 != null) {
                this.c.setOnItemSelectedListener(v0_30);
            }
            v3.setContentView(this.c);
        }
        int v6_1;
        android.os.Handler v0_32 = v3.getBackground();
        String v4_22 = this.C;
        int v5_3 = 0;
        if (v0_32 == null) {
            v4_22.setEmpty();
            v6_1 = 0;
        } else {
            v0_32.getPadding(v4_22);
            android.os.Handler v0_33 = v4_22.top;
            v6_1 = (v4_22.bottom + v0_33);
            if (!this.o) {
                this.m = (- v0_33);
            }
        }
        android.os.Handler v0_36;
        if (v3.getInputMethodMode() != 2) {
            v0_36 = 0;
        } else {
            v0_36 = 1;
        }
        android.os.Handler v0_1;
        android.os.Handler v0_37 = n.a2.a(v3, this.u, this.m, v0_36);
        int v8_0 = this.d;
        if (v8_0 != -1) {
            n.c2 v1_13;
            int v11_0 = this.e;
            if (v11_0 == -2) {
                v1_13 = android.view.View$MeasureSpec.makeMeasureSpec((v1_0.getResources().getDisplayMetrics().widthPixels - (v4_22.left + v4_22.right)), -2147483648);
            } else {
                if (v11_0 == -1) {
                    v1_13 = android.view.View$MeasureSpec.makeMeasureSpec((v1_0.getResources().getDisplayMetrics().widthPixels - (v4_22.left + v4_22.right)), 1073741824);
                } else {
                    v1_13 = android.view.View$MeasureSpec.makeMeasureSpec(v11_0, 1073741824);
                }
            }
            String v4_3;
            android.os.Handler v0_41 = this.c.a(v1_13, v0_37);
            if (v0_41 <= null) {
                v4_3 = 0;
            } else {
                v4_3 = ((this.c.getPaddingBottom() + this.c.getPaddingTop()) + v6_1);
            }
            v0_1 = (v0_41 + v4_3);
        } else {
            v0_1 = (v0_37 + v6_1);
        }
        n.c2 v1_3;
        if (v3.getInputMethodMode() != 2) {
            v1_3 = 0;
        } else {
            v1_3 = 1;
        }
        v3.setWindowLayoutType(this.n);
        if (!v3.isShowing()) {
            n.c2 v1_4 = this.e;
            if (v1_4 != -1) {
                if (v1_4 == -2) {
                    v1_4 = this.u.getWidth();
                }
            } else {
                v1_4 = -1;
            }
            if (v8_0 != -1) {
                if (v8_0 == -2) {
                    v8_0 = v0_1;
                }
            } else {
                v8_0 = -1;
            }
            v3.setWidth(v1_4);
            v3.setHeight(v8_0);
            if (android.os.Build$VERSION.SDK_INT > 28) {
                n.b2.b(v3, 1);
            } else {
                android.os.Handler v0_4 = n.g2.G;
                if (v0_4 != null) {
                    try {
                        v0_4.invoke(v3, new Object[] {Boolean.TRUE}));
                    } catch (Exception) {
                        android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            }
            v3.setOutsideTouchable(1);
            v3.setTouchInterceptor(this.y);
            if (this.q) {
                v3.setOverlapAnchor(this.p);
            }
            if (android.os.Build$VERSION.SDK_INT > 28) {
                n.b2.a(v3, this.D);
            } else {
                android.os.Handler v0_12 = n.g2.H;
                if (v0_12 != null) {
                    try {
                        v0_12.invoke(v3, new Object[] {this.D}));
                    } catch (android.os.Handler v0_13) {
                        android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", v0_13);
                    }
                }
            }
            v3.showAsDropDown(this.u, this.f, this.m, this.r);
            this.c.setSelection(-1);
            if ((!this.E) || (this.c.isInTouchMode())) {
                android.os.Handler v0_19 = this.c;
                if (v0_19 != null) {
                    v0_19.setListSelectionHidden(1);
                    v0_19.requestLayout();
                }
            }
            if (!this.E) {
                this.B.post(this.A);
            }
        } else {
            if (this.u.isAttachedToWindow()) {
                String v4_15 = this.e;
                if (v4_15 != -1) {
                    if (v4_15 == -2) {
                        v4_15 = this.u.getWidth();
                    }
                } else {
                    v4_15 = -1;
                }
                if (v8_0 != -1) {
                    if (v8_0 == -2) {
                        v8_0 = v0_1;
                    }
                } else {
                    if (v1_3 == null) {
                        v8_0 = -1;
                    } else {
                        v8_0 = v0_1;
                    }
                    if (v1_3 == null) {
                        if (this.e == -1) {
                            v5_3 = -1;
                        }
                        v3.setWidth(v5_3);
                        v3.setHeight(-1);
                    } else {
                        android.os.Handler v0_26;
                        if (this.e != -1) {
                            v0_26 = 0;
                        } else {
                            v0_26 = -1;
                        }
                        v3.setWidth(v0_26);
                        v3.setHeight(0);
                    }
                }
                reflect.Method v7_0;
                v3.setOutsideTouchable(1);
                android.os.Handler v0_27 = v4_15;
                if (v0_27 >= null) {
                    v7_0 = v0_27;
                } else {
                    v7_0 = -1;
                }
                if (v8_0 < 0) {
                    v8_0 = -1;
                }
                v3.update(this.u, this.f, this.m, v7_0, v8_0);
                return;
            }
        }
        return;
    }

    public final void dismiss()
    {
        android.os.Handler v0_0 = this.F;
        v0_0.dismiss();
        v0_0.setContentView(0);
        this.c = 0;
        this.B.removeCallbacks(this.x);
        return;
    }

    public final android.graphics.drawable.Drawable e()
    {
        return this.F.getBackground();
    }

    public final n.t1 f()
    {
        return this.c;
    }

    public final void h(android.graphics.drawable.Drawable p2)
    {
        this.F.setBackgroundDrawable(p2);
        return;
    }

    public final void i(int p1)
    {
        this.m = p1;
        this.o = 1;
        return;
    }

    public final void k(int p1)
    {
        this.f = p1;
        return;
    }

    public final int m()
    {
        if (this.o) {
            return this.m;
        } else {
            return 0;
        }
    }

    public void p(android.widget.ListAdapter p3)
    {
        android.widget.ListAdapter v0_0 = this.t;
        if (v0_0 != null) {
            android.widget.ListAdapter v1 = this.b;
            if (v1 != null) {
                v1.unregisterDataSetObserver(v0_0);
            }
        } else {
            this.t = new n.d2(this);
        }
        this.b = p3;
        if (p3 != null) {
            p3.registerDataSetObserver(this.t);
        }
        n.t1 v3_1 = this.c;
        if (v3_1 != null) {
            v3_1.setAdapter(this.b);
        }
        return;
    }

    public n.t1 q(android.content.Context p2, boolean p3)
    {
        return new n.t1(p2, p3);
    }

    public final void r(int p3)
    {
        int v0_3 = this.F.getBackground();
        if (v0_3 == 0) {
            this.e = p3;
            return;
        } else {
            int v1_0 = this.C;
            v0_3.getPadding(v1_0);
            this.e = ((v1_0.left + v1_0.right) + p3);
            return;
        }
    }
}
