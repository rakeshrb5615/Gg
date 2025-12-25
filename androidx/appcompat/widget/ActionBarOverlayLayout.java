package androidx.appcompat.widget;
public class ActionBarOverlayLayout extends android.view.ViewGroup implements n.j1, q0.r, q0.s {
    public static final int[] I;
    public static final q0.s1 J;
    public static final android.graphics.Rect K;
    public n.d A;
    public android.widget.OverScroller B;
    public android.view.ViewPropertyAnimator C;
    public final f2.o D;
    public final n.c E;
    public final n.c F;
    public final a2.o0 G;
    public final n.f H;
    public int a;
    public int b;
    public androidx.appcompat.widget.ContentFrameLayout c;
    public androidx.appcompat.widget.ActionBarContainer d;
    public n.k1 e;
    public android.graphics.drawable.Drawable f;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final android.graphics.Rect s;
    public final android.graphics.Rect t;
    public final android.graphics.Rect u;
    public final android.graphics.Rect v;
    public q0.s1 w;
    public q0.s1 x;
    public q0.s1 y;
    public q0.s1 z;

    static ActionBarOverlayLayout()
    {
        q0.d1 v0_2;
        androidx.appcompat.widget.ActionBarOverlayLayout.I = new int[] {2130968582, 16842841});
        q0.d1 v0_10 = android.os.Build$VERSION.SDK_INT;
        if (v0_10 < 34) {
            if (v0_10 < 30) {
                if (v0_10 < 29) {
                    v0_2 = new q0.d1();
                } else {
                    v0_2 = new q0.f1();
                }
            } else {
                v0_2 = new q0.g1();
            }
        } else {
            v0_2 = new q0.h1();
        }
        v0_2.g(h0.b.b(0, 1, 0, 1));
        androidx.appcompat.widget.ActionBarOverlayLayout.J = v0_2.b();
        androidx.appcompat.widget.ActionBarOverlayLayout.K = new android.graphics.Rect();
        return;
    }

    public ActionBarOverlayLayout(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3);
        super.b = 0;
        super.s = new android.graphics.Rect();
        super.t = new android.graphics.Rect();
        super.u = new android.graphics.Rect();
        super.v = new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        n.f v3_9 = q0.s1.b;
        super.w = v3_9;
        super.x = v3_9;
        super.y = v3_9;
        super.z = v3_9;
        super.D = new f2.o(super, 5);
        super.E = new n.c(super, 0);
        super.F = new n.c(super, 1);
        super.i(p2);
        super.G = new a2.o0();
        n.f v3_21 = new n.f(p2);
        v3_21.setWillNotDraw(1);
        super.H = v3_21;
        super.addView(v3_21);
        return;
    }

    public static boolean g(android.view.View p4, android.graphics.Rect p5, boolean p6)
    {
        int v0_0;
        n.e v4_2 = ((n.e) p4.getLayoutParams());
        int v1_2 = p5.left;
        if (v4_2.leftMargin == v1_2) {
            v0_0 = 0;
        } else {
            v4_2.leftMargin = v1_2;
            v0_0 = 1;
        }
        int v3_0 = p5.top;
        if (v4_2.topMargin != v3_0) {
            v4_2.topMargin = v3_0;
            v0_0 = 1;
        }
        int v3_1 = p5.right;
        if (v4_2.rightMargin != v3_1) {
            v4_2.rightMargin = v3_1;
            v0_0 = 1;
        }
        if (p6 != 0) {
            int v5_1 = p5.bottom;
            if (v4_2.bottomMargin != v5_1) {
                v4_2.bottomMargin = v5_1;
                return 1;
            }
        }
        return v0_0;
    }

    public final void a(android.view.View p1, android.view.View p2, int p3, int p4)
    {
        if (p4 == 0) {
            this.onNestedScrollAccepted(p1, p2, p3);
        }
        return;
    }

    public final void b(android.view.View p1, int p2)
    {
        if (p2 == 0) {
            this.onStopNestedScroll(p1);
        }
        return;
    }

    public final void c(android.view.View p1, int p2, int p3, int[] p4, int p5)
    {
        return;
    }

    public final boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        return (p1 instanceof n.e);
    }

    public final void d(android.view.View p1, int p2, int p3, int p4, int p5, int p6, int[] p7)
    {
        this.e(p1, p2, p3, p4, p5, p6);
        return;
    }

    public final void draw(android.graphics.Canvas p6)
    {
        super.draw(p6);
        if (this.f != null) {
            android.graphics.drawable.Drawable v0_4;
            if (this.d.getVisibility() != 0) {
                v0_4 = 0;
            } else {
                v0_4 = ((int) ((this.d.getTranslationY() + ((float) this.d.getBottom())) + 1056964608));
            }
            this.f.setBounds(0, v0_4, this.getWidth(), (this.f.getIntrinsicHeight() + v0_4));
            this.f.draw(p6);
        }
        return;
    }

    public final void e(android.view.View p1, int p2, int p3, int p4, int p5, int p6)
    {
        if (p6 == 0) {
            this.onNestedScroll(p1, p2, p3, p4, p5);
        }
        return;
    }

    public final boolean f(android.view.View p1, android.view.View p2, int p3, int p4)
    {
        if ((p4 != 0) || (!this.onStartNestedScroll(p1, p2, p3))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean fitSystemWindows(android.graphics.Rect p1)
    {
        return super.fitSystemWindows(p1);
    }

    public final android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        return new n.e(-1, -1);
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
    {
        return new n.e(this.getContext(), p3);
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
    {
        return new n.e(p2);
    }

    public int getActionBarHideOffset()
    {
        int v0_0 = this.d;
        if (v0_0 == 0) {
            return 0;
        } else {
            return (- ((int) v0_0.getTranslationY()));
        }
    }

    public int getNestedScrollAxes()
    {
        int v0_0 = this.G;
        return (v0_0.b | v0_0.a);
    }

    public CharSequence getTitle()
    {
        this.k();
        return ((n.f3) this.e).a.getTitle();
    }

    public final void h()
    {
        this.removeCallbacks(this.E);
        this.removeCallbacks(this.F);
        android.view.ViewPropertyAnimator v0_2 = this.C;
        if (v0_2 != null) {
            v0_2.cancel();
        }
        return;
    }

    public final void i(android.content.Context p5)
    {
        android.widget.OverScroller v0_4 = this.getContext().getTheme().obtainStyledAttributes(androidx.appcompat.widget.ActionBarOverlayLayout.I);
        int v1_0 = 0;
        this.a = v0_4.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable v3 = v0_4.getDrawable(1);
        this.f = v3;
        if (v3 == null) {
            v1_0 = 1;
        }
        this.setWillNotDraw(v1_0);
        v0_4.recycle();
        this.B = new android.widget.OverScroller(p5);
        return;
    }

    public final void j(int p4)
    {
        this.k();
        if (p4 == 2) {
            ((n.f3) this.e).getClass();
            android.util.Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
            return;
        } else {
            if (p4 == 5) {
                ((n.f3) this.e).getClass();
                android.util.Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            } else {
                if (p4 == 109) {
                    this.setOverlayMode(1);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void k()
    {
        if (this.c != null) {
            return;
        } else {
            String v0_10;
            this.c = ((androidx.appcompat.widget.ContentFrameLayout) this.findViewById(2131361847));
            this.d = ((androidx.appcompat.widget.ActionBarContainer) this.findViewById(2131361848));
            String v0_4 = this.findViewById(2131361846);
            if (!(v0_4 instanceof n.k1)) {
                if (!(v0_4 instanceof androidx.appcompat.widget.Toolbar)) {
                    throw new IllegalStateException("Can\'t make a decor toolbar out of ".concat(v0_4.getClass().getSimpleName()));
                } else {
                    v0_10 = ((androidx.appcompat.widget.Toolbar) v0_4).getWrapper();
                }
            } else {
                v0_10 = ((n.k1) v0_4);
            }
            this.e = v0_10;
            return;
        }
    }

    public final void l(android.view.Menu p5, m.x p6)
    {
        this.k();
        n.k v0_2 = ((n.f3) this.e);
        androidx.appcompat.widget.Toolbar v1 = v0_2.a;
        if (v0_2.m == null) {
            v0_2.m = new n.k(v1.getContext());
        }
        n.k v0_1 = v0_2.m;
        v0_1.e = p6;
        if ((((m.m) p5) != null) || (v1.a != null)) {
            v1.f();
            int v6_3 = v1.a.v;
            if (v6_3 != ((m.m) p5)) {
                if (v6_3 != 0) {
                    v6_3.r(v1.Q);
                    v6_3.r(v1.R);
                }
                if (v1.R == null) {
                    v1.R = new n.a3(v1);
                }
                v0_1.w = 1;
                if (((m.m) p5) == null) {
                    v0_1.g(v1.p, 0);
                    v1.R.g(v1.p, 0);
                    v0_1.d();
                    v1.R.d();
                } else {
                    ((m.m) p5).b(v0_1, v1.p);
                    ((m.m) p5).b(v1.R, v1.p);
                }
                v1.a.setPopupTheme(v1.q);
                v1.a.setPresenter(v0_1);
                v1.Q = v0_1;
                v1.t();
                return;
            }
        }
        return;
    }

    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p7)
    {
        this.k();
        android.view.WindowInsets v7_1 = q0.s1.g(this, p7);
        int v0_1 = androidx.appcompat.widget.ActionBarOverlayLayout.g(this.d, new android.graphics.Rect(v7_1.b(), v7_1.d(), v7_1.c(), v7_1.a()), 0);
        android.graphics.Rect v1_1 = this.s;
        q0.i0.b(this, v7_1, v1_1);
        android.view.WindowInsets v7_2 = v7_1.a;
        android.graphics.Rect v2_2 = v7_2.l(v1_1.left, v1_1.top, v1_1.right, v1_1.bottom);
        this.w = v2_2;
        int v3_2 = 1;
        if (!this.x.equals(v2_2)) {
            this.x = this.w;
            v0_1 = 1;
        }
        android.graphics.Rect v2_4 = this.t;
        if (v2_4.equals(v1_1)) {
            v3_2 = v0_1;
        } else {
            v2_4.set(v1_1);
        }
        if (v3_2 != 0) {
            this.requestLayout();
        }
        return v7_2.a().a.c().a.b().f();
    }

    public final void onConfigurationChanged(android.content.res.Configuration p1)
    {
        super.onConfigurationChanged(p1);
        this.i(this.getContext());
        q0.g0.c(this);
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        this.h();
        return;
    }

    public final void onLayout(boolean p5, int p6, int p7, int p8, int p9)
    {
        p5 = this.getChildCount();
        p6 = this.getPaddingLeft();
        p7 = this.getPaddingTop();
        p8 = 0;
        while (p8 < p5) {
            p9 = this.getChildAt(p8);
            if (p9.getVisibility() != 8) {
                int v0_2 = ((n.e) p9.getLayoutParams());
                int v3_1 = (v0_2.leftMargin + p6);
                int v0_4 = (v0_2.topMargin + p7);
                p9.layout(v3_1, v0_4, (p9.getMeasuredWidth() + v3_1), (p9.getMeasuredHeight() + v0_4));
            }
            p8++;
        }
        return;
    }

    public final void onMeasure(int p13, int p14)
    {
        int v5_22;
        this.k();
        this.measureChildWithMargins(this.d, p13, 0, p14, 0);
        int v13_2 = ((n.e) this.d.getLayoutParams());
        int v14_10 = Math.max(0, ((this.d.getMeasuredWidth() + v13_2.leftMargin) + v13_2.rightMargin));
        int v13_8 = Math.max(0, ((this.d.getMeasuredHeight() + v13_2.topMargin) + v13_2.bottomMargin));
        int v3_11 = android.view.View.combineMeasuredStates(0, this.d.getMeasuredState());
        if ((this.getWindowSystemUiVisibility() & 256) == 0) {
            v5_22 = 0;
        } else {
            v5_22 = 1;
        }
        androidx.appcompat.widget.ContentFrameLayout v7_8;
        if (v5_22 == 0) {
            if (this.d.getVisibility() == 8) {
                v7_8 = 0;
            } else {
                v7_8 = this.d.getMeasuredHeight();
            }
        } else {
            v7_8 = this.a;
            if ((this.n) && (this.d.getTabContainer() != null)) {
                v7_8 += this.a;
            }
        }
        int v9_1 = this.u;
        v9_1.set(this.s);
        this.y = androidx.appcompat.widget.ActionBarOverlayLayout v0.w;
        if ((this.m) || (v5_22 != 0)) {
            androidx.appcompat.widget.ContentFrameLayout v7_1;
            int v1_20 = h0.b.b(this.y.b(), (this.y.d() + v7_8), this.y.c(), this.y.a());
            int v5_29 = this.y;
            androidx.appcompat.widget.ContentFrameLayout v7_12 = android.os.Build$VERSION.SDK_INT;
            if (v7_12 < 34) {
                if (v7_12 < 30) {
                    if (v7_12 < 29) {
                        v7_1 = new q0.d1(v5_29);
                    } else {
                        v7_1 = new q0.f1(v5_29);
                    }
                } else {
                    v7_1 = new q0.g1(v5_29);
                }
            } else {
                v7_1 = new q0.h1(v5_29);
            }
            v7_1.g(v1_20);
            this.y = v7_1.b();
        } else {
            int v10_1 = this.v;
            q0.i0.b(this.H, androidx.appcompat.widget.ActionBarOverlayLayout.J, v10_1);
            if (v10_1.equals(androidx.appcompat.widget.ActionBarOverlayLayout.K)) {
            } else {
                v9_1.top = (v9_1.top + v7_8);
                v9_1.bottom = v9_1.bottom;
                this.y = this.y.a.l(0, v7_8, 0, 0);
            }
        }
        androidx.appcompat.widget.ActionBarOverlayLayout.g(this.c, v9_1, 1);
        if (!this.z.equals(this.y)) {
            int v1_6 = this.y;
            this.z = v1_6;
            q0.q0.c(this.c, v1_6);
        }
        this.measureChildWithMargins(this.c, p13, 0, p14, 0);
        int v1_9 = ((n.e) this.c.getLayoutParams());
        int v14_3 = Math.max(v14_10, ((this.c.getMeasuredWidth() + v1_9.leftMargin) + v1_9.rightMargin));
        int v13_3 = Math.max(v13_8, ((this.c.getMeasuredHeight() + v1_9.topMargin) + v1_9.bottomMargin));
        int v1_14 = android.view.View.combineMeasuredStates(v3_11, this.c.getMeasuredState());
        this.setMeasuredDimension(android.view.View.resolveSizeAndState(Math.max(((this.getPaddingRight() + this.getPaddingLeft()) + v14_3), this.getSuggestedMinimumWidth()), p13, v1_14), android.view.View.resolveSizeAndState(Math.max(((this.getPaddingBottom() + this.getPaddingTop()) + v13_3), this.getSuggestedMinimumHeight()), p14, (v1_14 << 16)));
        return;
    }

    public final boolean onNestedFling(android.view.View p10, float p11, float p12, boolean p13)
    {
        if ((this.o) && (p13)) {
            this.B.fling(0, 0, 0, ((int) p12), 0, 0, -2147483648, 2147483647);
            if (this.B.getFinalY() <= this.d.getHeight()) {
                this.h();
                this.E.run();
            } else {
                this.h();
                this.F.run();
            }
            this.p = 1;
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean onNestedPreFling(android.view.View p1, float p2, float p3)
    {
        return 0;
    }

    public final void onNestedPreScroll(android.view.View p1, int p2, int p3, int[] p4)
    {
        return;
    }

    public final void onNestedScroll(android.view.View p1, int p2, int p3, int p4, int p5)
    {
        int v1_1 = (this.q + p3);
        this.q = v1_1;
        this.setActionBarHideOffset(v1_1);
        return;
    }

    public final void onNestedScrollAccepted(android.view.View p1, android.view.View p2, int p3)
    {
        this.G.a = p3;
        this.q = this.getActionBarHideOffset();
        this.h();
        h.n0 v1_2 = this.A;
        if (v1_2 != null) {
            h.n0 v1_3 = ((h.n0) v1_2);
            int v2_1 = v1_3.x;
            if (v2_1 != 0) {
                v2_1.a();
                v1_3.x = 0;
            }
        }
        return;
    }

    public final boolean onStartNestedScroll(android.view.View p1, android.view.View p2, int p3)
    {
        if (((p3 & 2) != 0) && (this.d.getVisibility() == 0)) {
            return this.o;
        } else {
            return 0;
        }
    }

    public final void onStopNestedScroll(android.view.View p4)
    {
        if ((this.o) && (!this.p)) {
            if (this.q > this.d.getHeight()) {
                this.h();
                this.postDelayed(this.F, 600);
            } else {
                this.h();
                this.postDelayed(this.E, 600);
            }
        }
        return;
    }

    public final void onWindowSystemUiVisibilityChanged(int p7)
    {
        int v1_0;
        super.onWindowSystemUiVisibilityChanged(p7);
        this.k();
        int v0_1 = (this.r ^ p7);
        this.r = p7;
        if ((p7 & 4) != 0) {
            v1_0 = 0;
        } else {
            v1_0 = 1;
        }
        java.util.WeakHashMap v7_2;
        if ((p7 & 256) == 0) {
            v7_2 = 0;
        } else {
            v7_2 = 1;
        }
        h.n0 v4_0 = this.A;
        if (v4_0 != null) {
            h.n0 v4_1 = ((h.n0) v4_0);
            v4_1.t = (v7_2 ^ 1);
            if ((v1_0 == 0) && (v7_2 != null)) {
                if (!v4_1.u) {
                    v4_1.u = 1;
                    v4_1.b0(1);
                }
            } else {
                if (v4_1.u) {
                    v4_1.u = 0;
                    v4_1.b0(1);
                }
            }
        }
        if (((v0_1 & 256) != 0) && (this.A != null)) {
            q0.g0.c(this);
        }
        return;
    }

    public final void onWindowVisibilityChanged(int p2)
    {
        super.onWindowVisibilityChanged(p2);
        this.b = p2;
        h.n0 v0_0 = this.A;
        if (v0_0 != null) {
            ((h.n0) v0_0).s = p2;
        }
        return;
    }

    public void setActionBarHideOffset(int p3)
    {
        this.h();
        this.d.setTranslationY(((float) (- Math.max(0, Math.min(p3, this.d.getHeight())))));
        return;
    }

    public void setActionBarVisibilityCallback(n.d p2)
    {
        this.A = p2;
        if (this.getWindowToken() != null) {
            ((h.n0) this.A).s = this.b;
            java.util.WeakHashMap v2_4 = this.r;
            if (v2_4 != null) {
                this.onWindowSystemUiVisibilityChanged(v2_4);
                q0.g0.c(this);
            }
        }
        return;
    }

    public void setHasNonEmbeddedTabs(boolean p1)
    {
        this.n = p1;
        return;
    }

    public void setHideOnContentScrollEnabled(boolean p2)
    {
        if (p2 != this.o) {
            this.o = p2;
            if (p2 == 0) {
                this.h();
                this.setActionBarHideOffset(0);
            }
        }
        return;
    }

    public void setIcon(int p3)
    {
        int v3_1;
        this.k();
        n.f3 v0_1 = ((n.f3) this.e);
        if (p3 == 0) {
            v3_1 = 0;
        } else {
            v3_1 = j5.t1.A(v0_1.a.getContext(), p3);
        }
        v0_1.d = v3_1;
        v0_1.c();
        return;
    }

    public void setIcon(android.graphics.drawable.Drawable p2)
    {
        this.k();
        n.f3 v0_1 = ((n.f3) this.e);
        v0_1.d = p2;
        v0_1.c();
        return;
    }

    public void setLogo(int p3)
    {
        int v3_1;
        this.k();
        n.f3 v0_1 = ((n.f3) this.e);
        if (p3 == 0) {
            v3_1 = 0;
        } else {
            v3_1 = j5.t1.A(v0_1.a.getContext(), p3);
        }
        v0_1.e = v3_1;
        v0_1.c();
        return;
    }

    public void setOverlayMode(boolean p1)
    {
        this.m = p1;
        return;
    }

    public void setShowingForActionMode(boolean p1)
    {
        return;
    }

    public void setUiOptions(int p1)
    {
        return;
    }

    public void setWindowCallback(android.view.Window$Callback p2)
    {
        this.k();
        ((n.f3) this.e).k = p2;
        return;
    }

    public void setWindowTitle(CharSequence p4)
    {
        this.k();
        android.view.View v0_3 = ((n.f3) this.e);
        if (!v0_3.g) {
            androidx.appcompat.widget.Toolbar v1_1 = v0_3.a;
            v0_3.h = p4;
            if ((v0_3.b & 8) != 0) {
                v1_1.setTitle(p4);
                if (v0_3.g) {
                    q0.q0.o(v1_1.getRootView(), p4);
                }
            }
        }
        return;
    }

    public final boolean shouldDelayChildPressedState()
    {
        return 0;
    }
}
