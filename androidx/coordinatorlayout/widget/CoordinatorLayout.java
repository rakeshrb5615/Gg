package androidx.coordinatorlayout.widget;
public class CoordinatorLayout extends android.view.ViewGroup implements q0.r, q0.s {
    public static final Class[] A;
    public static final ThreadLocal B;
    public static final a2.q C;
    public static final p0.d D;
    public static final String z;
    public final java.util.ArrayList a;
    public final j6.s b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean m;
    public boolean n;
    public final int[] o;
    public android.view.View p;
    public android.view.View q;
    public b0.e r;
    public boolean s;
    public q0.s1 t;
    public boolean u;
    public android.graphics.drawable.Drawable v;
    public android.view.ViewGroup$OnHierarchyChangeListener w;
    public l6.c x;
    public final a2.o0 y;

    static CoordinatorLayout()
    {
        p0.d v0_9;
        p0.d v0_6 = androidx.coordinatorlayout.widget.CoordinatorLayout.getPackage();
        if (v0_6 == null) {
            v0_9 = 0;
        } else {
            v0_9 = v0_6.getName();
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.z = v0_9;
        androidx.coordinatorlayout.widget.CoordinatorLayout.C = new a2.q(1);
        androidx.coordinatorlayout.widget.CoordinatorLayout.A = new Class[] {android.content.Context, android.util.AttributeSet});
        androidx.coordinatorlayout.widget.CoordinatorLayout.B = new ThreadLocal();
        androidx.coordinatorlayout.widget.CoordinatorLayout.D = new p0.d();
        return;
    }

    public CoordinatorLayout(android.content.Context p9, android.util.AttributeSet p10)
    {
        androidx.coordinatorlayout.widget.CoordinatorLayout v0_10;
        int[] v1_2;
        super(p9, p10, 2130968950);
        super.a = new java.util.ArrayList();
        super.b = new j6.s(3);
        super.c = new java.util.ArrayList();
        super.d = new java.util.ArrayList();
        int[] v1_0 = new int[2];
        super.e = v1_0;
        androidx.coordinatorlayout.widget.CoordinatorLayout v0_4 = new int[2];
        super.f = v0_4;
        super.y = new a2.o0();
        int v2_0 = a0.a.a;
        int v7 = 0;
        android.content.res.TypedArray v4 = p9.obtainStyledAttributes(p10, v2_0, 2130968950, 0);
        if (android.os.Build$VERSION.SDK_INT < 29) {
            v0_10 = super;
            v1_2 = p9;
        } else {
            v0_10 = super;
            v1_2 = p9;
            super.saveAttributeDataForStyleable(p9, v2_0, p10, v4, 2130968950, 0);
        }
        int v9_1 = v4.getResourceId(0, 0);
        if (v9_1 != 0) {
            int v10_1 = v1_2.getResources();
            int v9_2 = v10_1.getIntArray(v9_1);
            v0_10.o = v9_2;
            int v9_3 = v9_2.length;
            while (v7 < v9_3) {
                int[] v1_4 = v0_10.o;
                v1_4[v7] = ((int) (((float) v1_4[v7]) * v10_1.getDisplayMetrics().density));
                v7++;
            }
        }
        v0_10.v = v4.getDrawable(1);
        v4.recycle();
        super.w();
        super.setOnHierarchyChangeListener(new b0.c(super));
        if (super.getImportantForAccessibility() == 0) {
            super.setImportantForAccessibility(1);
        }
        return;
    }

    public static android.graphics.Rect g()
    {
        android.graphics.Rect v0_2 = ((android.graphics.Rect) androidx.coordinatorlayout.widget.CoordinatorLayout.D.a());
        if (v0_2 == null) {
            v0_2 = new android.graphics.Rect();
        }
        return v0_2;
    }

    public static void l(int p6, android.graphics.Rect p7, android.graphics.Rect p8, b0.d p9, int p10, int p11)
    {
        int v0_0 = p9.c;
        if (v0_0 == 0) {
            v0_0 = 17;
        }
        int v0_2 = android.view.Gravity.getAbsoluteGravity(v0_0, p6);
        int v9_1 = p9.d;
        if ((v9_1 & 7) == 0) {
            v9_1 |= 8388611;
        }
        if ((v9_1 & 112) == 0) {
            v9_1 |= 48;
        }
        int v1_3;
        int v6_1 = android.view.Gravity.getAbsoluteGravity(v9_1, p6);
        int v9_2 = (v0_2 & 7);
        int v0_1 = (v0_2 & 112);
        int v1_1 = (v6_1 & 7);
        int v6_2 = (v6_1 & 112);
        if (v1_1 == 1) {
            v1_3 = (p7.left + (p7.width() / 2));
        } else {
            if (v1_1 == 5) {
                v1_3 = p7.right;
            } else {
                v1_3 = p7.left;
            }
        }
        int v6_4;
        if (v6_2 == 16) {
            v6_4 = (p7.top + (p7.height() / 2));
        } else {
            if (v6_2 == 80) {
                v6_4 = p7.bottom;
            } else {
                v6_4 = p7.top;
            }
        }
        if (v9_2 == 1) {
            v1_3 -= (p10 / 2);
        } else {
            if (v9_2 != 5) {
                v1_3 -= p10;
            }
        }
        if (v0_1 == 16) {
            v6_4 -= (p11 / 2);
        } else {
            if (v0_1 != 80) {
                v6_4 -= p11;
            }
        }
        p8.set(v1_3, v6_4, (p10 + v1_3), (p11 + v6_4));
        return;
    }

    public static b0.d n(android.view.View p5)
    {
        b0.d v0_1 = ((b0.d) p5.getLayoutParams());
        if (!v0_1.b) {
            Class v5_2 = p5.getClass();
            String v2_2 = 0;
            while (v5_2 != null) {
                v2_2 = ((b0.b) v5_2.getAnnotation(b0.b));
                if (v2_2 != null) {
                    break;
                }
                v5_2 = v5_2.getSuperclass();
            }
            if (v2_2 != null) {
                try {
                    Exception v1_1 = ((b0.a) v2_2.value().getDeclaredConstructor(0).newInstance(0));
                    String v3_2 = v0_1.a;
                } catch (Exception v1_3) {
                    String v3_4 = new StringBuilder("Default behavior class ");
                    v3_4.append(v2_2.value().getName());
                    v3_4.append(" could not be instantiated. Did you forget a default constructor?");
                    android.util.Log.e("CoordinatorLayout", v3_4.toString(), v1_3);
                }
                if (v3_2 != v1_1) {
                    if (v3_2 != null) {
                        v3_2.i();
                    }
                    v0_1.a = v1_1;
                    v0_1.b = 1;
                    if (v1_1 != null) {
                        v1_1.g(v0_1);
                    }
                }
            }
            v0_1.b = 1;
        }
        return v0_1;
    }

    public static void u(android.view.View p3, int p4)
    {
        b0.d v0_1 = ((b0.d) p3.getLayoutParams());
        int v1_0 = v0_1.i;
        if (v1_0 != p4) {
            p3.offsetLeftAndRight((p4 - v1_0));
            v0_1.i = p4;
        }
        return;
    }

    public static void v(android.view.View p3, int p4)
    {
        b0.d v0_1 = ((b0.d) p3.getLayoutParams());
        int v1_0 = v0_1.j;
        if (v1_0 != p4) {
            p3.offsetTopAndBottom((p4 - v1_0));
            v0_1.j = p4;
        }
        return;
    }

    public final void a(android.view.View p2, android.view.View p3, int p4, int p5)
    {
        a2.o0 v0 = this.y;
        if (p5 != 1) {
            v0.a = p4;
        } else {
            v0.b = p4;
        }
        this.q = p3;
        int v2_1 = this.getChildCount();
        int v3_1 = 0;
        while (v3_1 < v2_1) {
            ((b0.d) this.getChildAt(v3_1).getLayoutParams()).getClass();
            v3_1++;
        }
        return;
    }

    public final void b(android.view.View p8, int p9)
    {
        int v0_0 = this.y;
        if (p9 != 1) {
            v0_0.a = 0;
        } else {
            v0_0.b = 0;
        }
        int v0_1 = this.getChildCount();
        int v3 = 0;
        while (v3 < v0_1) {
            android.view.View v4 = this.getChildAt(v3);
            b0.d v5_1 = ((b0.d) v4.getLayoutParams());
            if (v5_1.a(p9)) {
                b0.a v6_1 = v5_1.a;
                if (v6_1 != null) {
                    v6_1.t(v4, p8, p9);
                }
                if (p9 == 0) {
                    v5_1.m = 0;
                } else {
                    if (p9 == 1) {
                        v5_1.n = 0;
                    }
                }
            }
            v3++;
        }
        this.q = 0;
        return;
    }

    public final void c(android.view.View p15, int p16, int p17, int[] p18, int p19)
    {
        int v8 = this.getChildCount();
        int v0_0 = 0;
        int v10 = 0;
        int v11 = 0;
        int v12 = 0;
        while (v10 < v8) {
            android.view.View v2 = this.getChildAt(v10);
            if (v2.getVisibility() != 8) {
                android.view.View v3_2 = ((b0.d) v2.getLayoutParams());
                if (v3_2.a(p19)) {
                    android.view.View v3_3 = v3_2.a;
                    if (v3_3 != null) {
                        int v0_3;
                        int[] v6 = this.e;
                        v6[0] = 0;
                        v6[1] = 0;
                        v3_3.n(this, v2, p15, p16, p17, v6, p19);
                        if (p16 <= 0) {
                            v0_3 = Math.min(v11, v6[0]);
                        } else {
                            v0_3 = Math.max(v11, v6[0]);
                        }
                        v11 = v0_3;
                        int v0_6;
                        if (p17 <= 0) {
                            v0_6 = Math.min(v12, v6[1]);
                        } else {
                            v0_6 = Math.max(v12, v6[1]);
                        }
                        v12 = v0_6;
                        v0_0 = 1;
                    }
                }
            }
            v10++;
        }
        p18[0] = v11;
        p18[1] = v12;
        if (v0_0 != 0) {
            this.p(1);
        }
        return;
    }

    public final boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
    {
        if ((!(p2 instanceof b0.d)) || (!super.checkLayoutParams(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(android.view.View p15, int p16, int p17, int p18, int p19, int p20, int[] p21)
    {
        int v15_0 = this.getChildCount();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4_4 = 0;
        while (v1 < v15_0) {
            android.view.View v8 = this.getChildAt(v1);
            if (v8.getVisibility() != 8) {
                b0.a v6_2 = ((b0.d) v8.getLayoutParams());
                if (v6_2.a(p20)) {
                    b0.a v6_3 = v6_2.a;
                    if (v6_3 != null) {
                        int[] v12 = this.e;
                        v12[0] = 0;
                        v12[1] = 0;
                        v6_3.o(this, v8, p17, p18, p19, v12);
                        if (p18 <= 0) {
                            v2 = Math.min(v2, v12[0]);
                        } else {
                            v2 = Math.max(v2, v12[0]);
                        }
                        if (p19 <= 0) {
                            v3 = Math.min(v3, v12[1]);
                        } else {
                            v3 = Math.max(v3, v12[1]);
                        }
                        v4_4 = 1;
                    }
                }
            }
            v1++;
        }
        p21[0] = (p21[0] + v2);
        p21[1] = (p21[1] + v3);
        if (v4_4 != 0) {
            this.p(1);
        }
        return;
    }

    public final boolean drawChild(android.graphics.Canvas p2, android.view.View p3, long p4)
    {
        b0.a v0_2 = ((b0.d) p3.getLayoutParams()).a;
        if (v0_2 != null) {
            v0_2.getClass();
        }
        return super.drawChild(p2, p3, p4);
    }

    public final void drawableStateChanged()
    {
        boolean v0_0;
        super.drawableStateChanged();
        boolean v0_1 = this.getDrawableState();
        android.graphics.drawable.Drawable v1 = this.v;
        if ((v1 == null) || (!v1.isStateful())) {
            v0_0 = 0;
        } else {
            v0_0 = v1.setState(v0_1);
        }
        if (v0_0) {
            this.invalidate();
        }
        return;
    }

    public final void e(android.view.View p9, int p10, int p11, int p12, int p13, int p14)
    {
        this.d(p9, p10, p11, p12, p13, 0, this.f);
        return;
    }

    public final boolean f(android.view.View p7, android.view.View p8, int p9, int p10)
    {
        p7 = this.getChildCount();
        int v0 = 0;
        int v1 = 0;
        while (v0 < p7) {
            boolean v2_1 = this.getChildAt(v0);
            if (v2_1.getVisibility() != 8) {
                b0.d v3_2 = ((b0.d) v2_1.getLayoutParams());
                b0.a v4_1 = v3_2.a;
                if (v4_1 == null) {
                    if (p10 == 0) {
                        v3_2.m = 0;
                    } else {
                        if (p10 == 1) {
                            v3_2.n = 0;
                        }
                    }
                } else {
                    boolean v2_0 = v4_1.s(v2_1, p9, p10);
                    v1 |= v2_0;
                    if (p10 == 0) {
                        v3_2.m = v2_0;
                    } else {
                        if (p10 == 1) {
                            v3_2.n = v2_0;
                        }
                    }
                }
            }
            v0++;
        }
        return v1;
    }

    public final android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        return new b0.d();
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
    {
        return new b0.d(this.getContext(), p3);
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
    {
        if (!(p2 instanceof b0.d)) {
            if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                return new b0.d(p2);
            } else {
                return new b0.d(((android.view.ViewGroup$MarginLayoutParams) p2));
            }
        } else {
            return new b0.d(((b0.d) p2));
        }
    }

    public final java.util.List getDependencySortedChildren()
    {
        this.s();
        return java.util.Collections.unmodifiableList(this.a);
    }

    public final q0.s1 getLastWindowInsets()
    {
        return this.t;
    }

    public int getNestedScrollAxes()
    {
        int v0_0 = this.y;
        return (v0_0.b | v0_0.a);
    }

    public android.graphics.drawable.Drawable getStatusBarBackground()
    {
        return this.v;
    }

    public int getSuggestedMinimumHeight()
    {
        return Math.max(super.getSuggestedMinimumHeight(), (this.getPaddingBottom() + this.getPaddingTop()));
    }

    public int getSuggestedMinimumWidth()
    {
        return Math.max(super.getSuggestedMinimumWidth(), (this.getPaddingRight() + this.getPaddingLeft()));
    }

    public final void h(b0.d p6, android.graphics.Rect p7, int p8, int p9)
    {
        int v0_0 = this.getWidth();
        int v1_3 = this.getHeight();
        int v0_5 = Math.max((this.getPaddingLeft() + p6.leftMargin), Math.min(p7.left, (((v0_0 - this.getPaddingRight()) - p8) - p6.rightMargin)));
        int v6_3 = Math.max((this.getPaddingTop() + p6.topMargin), Math.min(p7.top, (((v1_3 - this.getPaddingBottom()) - p9) - p6.bottomMargin)));
        p7.set(v0_5, v6_3, (p8 + v0_5), (p9 + v6_3));
        return;
    }

    public final void i(android.view.View p3, android.graphics.Rect p4, boolean p5)
    {
        if ((!p3.isLayoutRequested()) && (p3.getVisibility() != 8)) {
            if (p5 == 0) {
                p4.set(p3.getLeft(), p3.getTop(), p3.getRight(), p3.getBottom());
                return;
            } else {
                this.k(p3, p4);
                return;
            }
        } else {
            p4.setEmpty();
            return;
        }
    }

    public final java.util.ArrayList j(android.view.View p6)
    {
        r.j v0_2 = ((r.j) this.b.c);
        int v1 = v0_2.c;
        java.util.ArrayList v2_1 = 0;
        int v3 = 0;
        while (v3 < v1) {
            Object v4_1 = ((java.util.ArrayList) v0_2.j(v3));
            if ((v4_1 != null) && (v4_1.contains(p6))) {
                if (v2_1 == null) {
                    v2_1 = new java.util.ArrayList();
                }
                v2_1.add(v0_2.g(v3));
            }
            v3++;
        }
        java.util.ArrayList v6_1 = this.d;
        v6_1.clear();
        if (v2_1 != null) {
            v6_1.addAll(v2_1);
        }
        return v6_1;
    }

    public final void k(android.view.View p5, android.graphics.Rect p6)
    {
        p6.set(0, 0, p5.getWidth(), p5.getHeight());
        int v0_7 = b0.g.a;
        int v1_0 = ((android.graphics.Matrix) v0_7.get());
        if (v1_0 != 0) {
            v1_0.reset();
        } else {
            v1_0 = new android.graphics.Matrix();
            v0_7.set(v1_0);
        }
        b0.g.a(this, p5, v1_0);
        int v5_1 = b0.g.b;
        int v0_2 = ((android.graphics.RectF) v5_1.get());
        if (v0_2 == 0) {
            v0_2 = new android.graphics.RectF();
            v5_1.set(v0_2);
        }
        v0_2.set(p6);
        v1_0.mapRect(v0_2);
        p6.set(((int) (v0_2.left + 1056964608)), ((int) (v0_2.top + 1056964608)), ((int) (v0_2.right + 1056964608)), ((int) (v0_2.bottom + 1056964608)));
        return;
    }

    public final int m(int p5)
    {
        StringBuilder v2_1 = this.o;
        if (v2_1 != null) {
            if ((p5 >= null) && (p5 < v2_1.length)) {
                return v2_1[p5];
            } else {
                StringBuilder v2_0 = new StringBuilder("Keyline index ");
                v2_0.append(p5);
                v2_0.append(" out of range for ");
                v2_0.append(this);
                android.util.Log.e("CoordinatorLayout", v2_0.toString());
                return 0;
            }
        } else {
            StringBuilder v2_3 = new StringBuilder("No keylines defined for ");
            v2_3.append(this);
            v2_3.append(" - attempted index lookup ");
            v2_3.append(p5);
            android.util.Log.e("CoordinatorLayout", v2_3.toString());
            return 0;
        }
    }

    public final boolean o(android.view.View p3, int p4, int p5)
    {
        p0.d v0 = androidx.coordinatorlayout.widget.CoordinatorLayout.D;
        android.graphics.Rect v1 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
        this.k(p3, v1);
        try {
            Throwable v3_1 = v1.contains(p4, p5);
            v1.setEmpty();
            v0.c(v1);
            return v3_1;
        } catch (Throwable v3_2) {
            v1.setEmpty();
            v0.c(v1);
            throw v3_2;
        }
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        this.t(0);
        if (this.s) {
            if (this.r == null) {
                this.r = new b0.e(this, 0);
            }
            this.getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        if ((this.t == null) && (this.getFitsSystemWindows())) {
            q0.g0.c(this);
        }
        this.n = 1;
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        this.t(0);
        if ((this.s) && (this.r != null)) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        android.view.ViewTreeObserver v1_0 = this.q;
        if (v1_0 != null) {
            this.b(v1_0, 0);
        }
        this.n = 0;
        return;
    }

    public final void onDraw(android.graphics.Canvas p5)
    {
        super.onDraw(p5);
        if ((this.u) && (this.v != null)) {
            android.graphics.drawable.Drawable v0_1;
            android.graphics.drawable.Drawable v0_4 = this.t;
            if (v0_4 == null) {
                v0_1 = 0;
            } else {
                v0_1 = v0_4.d();
            }
            if (v0_1 > null) {
                this.v.setBounds(0, 0, this.getWidth(), v0_1);
                this.v.draw(p5);
            }
        }
        return;
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent p4)
    {
        int v0 = p4.getActionMasked();
        if (v0 == 0) {
            this.t(1);
        }
        boolean v4_1 = this.r(p4, 0);
        if ((v0 != 1) && (v0 != 3)) {
            return v4_1;
        } else {
            this.t(1);
            return v4_1;
        }
    }

    public final void onLayout(boolean p3, int p4, int p5, int p6, int p7)
    {
        p3 = this.getLayoutDirection();
        p4 = this.a;
        p5 = p4.size();
        p6 = 0;
        while (p6 < p5) {
            android.view.View v7_1 = ((android.view.View) p4.get(p6));
            if (v7_1.getVisibility() != 8) {
                boolean v0_3 = ((b0.d) v7_1.getLayoutParams()).a;
                if ((!v0_3) || (!v0_3.k(this, v7_1, p3))) {
                    this.q(v7_1, p3);
                }
            }
            p6++;
        }
        return;
    }

    public final void onMeasure(int p27, int p28)
    {
        androidx.coordinatorlayout.widget.CoordinatorLayout v0_0 = this;
        this.s();
        int v1_25 = this.getChildCount();
        int v2_11 = 0;
        while (v2_11 < v1_25) {
            int v4_0 = this.getChildAt(v2_11);
            int v5_2 = ((r.j) this.b.c);
            int v8_0 = 0;
            while (v8_0 < v5_2.c) {
                boolean v9_1 = ((java.util.ArrayList) v5_2.j(v8_0));
                if ((!v9_1) || (!v9_1.contains(v4_0))) {
                    v8_0++;
                } else {
                    int v1_24 = 1;
                }
                if (v1_24 != this.s) {
                    if (v1_24 == 0) {
                        if ((this.n) && (this.r != null)) {
                            this.getViewTreeObserver().removeOnPreDrawListener(this.r);
                        }
                        this.s = 0;
                    } else {
                        if (this.n) {
                            if (this.r == null) {
                                this.r = new b0.e(this, 0);
                            }
                            this.getViewTreeObserver().addOnPreDrawListener(this.r);
                        }
                        this.s = 1;
                    }
                }
                int v10;
                b0.e v7_2 = this.getPaddingLeft();
                int v1_34 = this.getPaddingTop();
                int v8_2 = this.getPaddingRight();
                int v2_25 = this.getPaddingBottom();
                boolean v9_3 = this.getLayoutDirection();
                if (v9_3 != 1) {
                    v10 = 0;
                } else {
                    v10 = 1;
                }
                int v17;
                int v11 = android.view.View$MeasureSpec.getMode(p27);
                int v12 = android.view.View$MeasureSpec.getSize(p27);
                int v13 = android.view.View$MeasureSpec.getMode(p28);
                int v14 = android.view.View$MeasureSpec.getSize(p28);
                int v15 = (v7_2 + v8_2);
                int v16 = (v1_34 + v2_25);
                int v1_23 = this.getSuggestedMinimumWidth();
                int v2_21 = this.getSuggestedMinimumHeight();
                if ((this.t == null) || (!this.getFitsSystemWindows())) {
                    v17 = 0;
                } else {
                    v17 = 1;
                }
                int v3_10 = this.a;
                int v4_5 = v3_10.size();
                int v5_5 = 0;
                int v18 = 0;
                while (v5_5 < v4_5) {
                    int v21_1;
                    int v22_1;
                    int v19_2;
                    int v23_1;
                    b0.e v20_1;
                    int v19_1 = ((android.view.View) v3_10.get(v5_5));
                    int v21_0 = v1_23;
                    if (v19_1.getVisibility() != 8) {
                        int v4_1;
                        int v23_0;
                        int v1_7;
                        int v6_2 = ((b0.d) v19_1.getLayoutParams());
                        int v1_2 = v6_2.e;
                        if ((v1_2 < 0) || (v11 == 0)) {
                            v23_0 = v2_21;
                            v1_7 = v4_5;
                            v4_1 = 0;
                        } else {
                            int v22_0 = v0_0.m(v1_2);
                            int v1_4 = v6_2.c;
                            if (v1_4 == 0) {
                                v1_4 = 8388661;
                            }
                            int v1_9;
                            int v1_6 = (android.view.Gravity.getAbsoluteGravity(v1_4, v9_3) & 7);
                            v23_0 = v2_21;
                            if (((v1_6 != 3) || (v10 != 0)) && ((v1_6 != 5) || (v10 == 0))) {
                                if (((v1_6 != 5) || (v10 != 0)) && ((v1_6 != 3) || (v10 == 0))) {
                                } else {
                                    v1_9 = Math.max(0, (v22_0 - v7_2));
                                }
                            } else {
                                v1_9 = Math.max(0, ((v12 - v8_2) - v22_0));
                            }
                            v4_1 = v1_9;
                            v1_7 = v4_5;
                        }
                        if ((v17 == 0) || (v19_1.getFitsSystemWindows())) {
                            v22_1 = v1_7;
                            int v2_8 = p27;
                            int v1_12 = p28;
                        } else {
                            v22_1 = v1_7;
                            int v24_0 = (v0_0.t.c() + v0_0.t.b());
                            int v1_18 = (v0_0.t.a() + v0_0.t.d());
                            v2_8 = android.view.View$MeasureSpec.makeMeasureSpec((v12 - v24_0), v11);
                            v1_12 = android.view.View$MeasureSpec.makeMeasureSpec((v14 - v1_18), v13);
                        }
                        b0.e v7_1;
                        int v3_1;
                        int v4_2;
                        int v1_20;
                        int v8_1;
                        androidx.coordinatorlayout.widget.CoordinatorLayout v0_1 = v6_2.a;
                        if (v0_1 == null) {
                            v20_1 = v7_2;
                            v7_1 = v21_0;
                            v21_1 = v8_2;
                            v8_1 = v23_0;
                            v23_1 = v3_10;
                            v3_1 = v4_1;
                            v4_2 = v1_12;
                            v1_20 = v19_1;
                            v19_2 = v5_5;
                            v0_0 = this;
                            this.measureChildWithMargins(v1_20, v2_8, v3_1, v4_2, 0);
                        } else {
                            v20_1 = v7_2;
                            v7_1 = v21_0;
                            v21_1 = v8_2;
                            v8_1 = v23_0;
                            v23_1 = v3_10;
                            int v3_2 = v2_8;
                            int v2_15 = v19_1;
                            v19_2 = v5_5;
                            int v5_3 = v1_12;
                            v1_20 = v2_15;
                            v2_8 = v3_2;
                            v3_1 = v4_1;
                            v4_2 = v5_3;
                            if (v0_1.l(this, v2_15, v3_2, v4_1, v5_3)) {
                                v0_0 = this;
                            }
                        }
                        int v2_20 = Math.max(v7_1, (((v1_20.getMeasuredWidth() + v15) + v6_2.leftMargin) + v6_2.rightMargin));
                        int v3_9 = Math.max(v8_1, (((v1_20.getMeasuredHeight() + v16) + v6_2.topMargin) + v6_2.bottomMargin));
                        v18 = android.view.View.combineMeasuredStates(v18, v1_20.getMeasuredState());
                        v1_23 = v2_20;
                        v2_21 = v3_9;
                    } else {
                        v23_1 = v3_10;
                        v22_1 = v4_5;
                        v19_2 = v5_5;
                        v20_1 = v7_2;
                        v1_23 = v21_0;
                        v21_1 = v8_2;
                    }
                    v5_5 = (v19_2 + 1);
                    v7_2 = v20_1;
                    v8_2 = v21_1;
                    v4_5 = v22_1;
                    v3_10 = v23_1;
                }
                int v6_5 = v18;
                v0_0.setMeasuredDimension(android.view.View.resolveSizeAndState(v1_23, p27, (-16777216 & v6_5)), android.view.View.resolveSizeAndState(v2_21, p28, (v6_5 << 16)));
                return;
            }
            v2_11++;
        }
        v1_24 = 0;
    }

    public final boolean onNestedFling(android.view.View p3, float p4, float p5, boolean p6)
    {
        p3 = this.getChildCount();
        p5 = 0;
        while (p5 < p3) {
            b0.a v6_2 = this.getChildAt(p5);
            // Both branches of the condition point to the same code.
            // if ((v6_2.getVisibility() != 8) && (((b0.d) v6_2.getLayoutParams()).a(0))) {
                p5++;
            // }
        }
        return 0;
    }

    public final boolean onNestedPreFling(android.view.View p6, float p7, float p8)
    {
        p7 = this.getChildCount();
        int v0 = 0;
        int v1 = 0;
        while (v0 < p7) {
            boolean v2_4 = this.getChildAt(v0);
            if (v2_4.getVisibility() != 8) {
                boolean v2_1 = ((b0.d) v2_4.getLayoutParams());
                if (v2_1.a(0)) {
                    boolean v2_2 = v2_1.a;
                    if (v2_2) {
                        v1 |= v2_2.m(p6);
                    }
                }
            }
            v0++;
        }
        return v1;
    }

    public final void onNestedPreScroll(android.view.View p7, int p8, int p9, int[] p10)
    {
        this.c(p7, p8, p9, p10, 0);
        return;
    }

    public final void onNestedScroll(android.view.View p8, int p9, int p10, int p11, int p12)
    {
        this.e(p8, p9, p10, p11, p12, 0);
        return;
    }

    public final void onNestedScrollAccepted(android.view.View p2, android.view.View p3, int p4)
    {
        this.a(p2, p3, p4, 0);
        return;
    }

    public final void onRestoreInstanceState(android.os.Parcelable p7)
    {
        if ((p7 instanceof b0.f)) {
            super.onRestoreInstanceState(((b0.f) p7).a);
            android.util.SparseArray v7_2 = ((b0.f) p7).c;
            int v0_2 = this.getChildCount();
            int v1 = 0;
            while (v1 < v0_2) {
                android.view.View v2 = this.getChildAt(v1);
                android.os.Parcelable v3_0 = v2.getId();
                b0.a v4_1 = androidx.coordinatorlayout.widget.CoordinatorLayout.n(v2).a;
                if ((v3_0 != -1) && (v4_1 != null)) {
                    android.os.Parcelable v3_2 = ((android.os.Parcelable) v7_2.get(v3_0));
                    if (v3_2 != null) {
                        v4_1.q(v2, v3_2);
                    }
                }
                v1++;
            }
            return;
        } else {
            super.onRestoreInstanceState(p7);
            return;
        }
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        b0.f v0_1 = new b0.f(super.onSaveInstanceState());
        android.util.SparseArray v1_2 = new android.util.SparseArray();
        int v2 = this.getChildCount();
        int v3 = 0;
        while (v3 < v2) {
            android.os.Parcelable v4_0 = this.getChildAt(v3);
            int v5 = v4_0.getId();
            b0.a v6_2 = ((b0.d) v4_0.getLayoutParams()).a;
            if ((v5 != -1) && (v6_2 != null)) {
                android.os.Parcelable v4_1 = v6_2.r(v4_0);
                if (v4_1 != null) {
                    v1_2.append(v5, v4_1);
                }
            }
            v3++;
        }
        v0_1.c = v1_2;
        return v0_1;
    }

    public final boolean onStartNestedScroll(android.view.View p2, android.view.View p3, int p4)
    {
        return this.f(p2, p3, p4, 0);
    }

    public final void onStopNestedScroll(android.view.View p2)
    {
        this.b(p2, 0);
        return;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p18)
    {
        int v3_0;
        int v6_4;
        int v2 = p18.getActionMasked();
        if (this.p != null) {
            v3_0 = 0;
            int v6_3 = ((b0.d) this.p.getLayoutParams()).a;
            if (v6_3 == 0) {
                v6_4 = 0;
            } else {
                v6_4 = v6_3.u(this.p, p18);
            }
        } else {
            v3_0 = this.r(p18, 1);
            if (v3_0 == 0) {
            }
        }
        android.view.MotionEvent v8 = 0;
        if (this.p != null) {
            if (v3_0 != 0) {
                long v9 = android.os.SystemClock.uptimeMillis();
                v8 = android.view.MotionEvent.obtain(v9, v9, 3, 0, 0, 0);
                super.onTouchEvent(v8);
            }
        } else {
            v6_4 |= super.onTouchEvent(p18);
        }
        if (v8 != null) {
            v8.recycle();
        }
        if ((v2 != 1) && (v2 != 3)) {
            return v6_4;
        } else {
            this.t(0);
            return v6_4;
        }
    }

    public final void p(int p23)
    {
        String v3_7 = this.getLayoutDirection();
        int v2_19 = this.a;
        java.util.WeakHashMap v9_3 = v2_19.size();
        android.graphics.Rect v10 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
        android.graphics.Rect v11 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
        android.graphics.Rect v12_1 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
        int v14_0 = 0;
        while(true) {
            p0.d v15 = androidx.coordinatorlayout.widget.CoordinatorLayout.D;
            if (v14_0 >= v9_3) {
                int v4_6 = v12_1;
                v10.setEmpty();
                v15.c(v10);
                v11.setEmpty();
                v15.c(v11);
                v4_6.setEmpty();
                v15.c(v4_6);
                return;
            } else {
                int v20_3;
                int v4_13;
                int v5_1;
                int v2_17;
                int v4_15 = ((android.view.View) v2_19.get(v14_0));
                int v5_4 = ((b0.d) v4_15.getLayoutParams());
                if ((p23 != 0) || (v4_15.getVisibility() != 8)) {
                    int v6_23 = 0;
                    while (v6_23 < v14_0) {
                        int v14_2;
                        android.graphics.Rect v21_0;
                        int v17_1;
                        int v18_0;
                        int v2_18;
                        int v19_0;
                        int v20_0;
                        if (v5_4.l != ((android.view.View) v2_19.get(v6_23))) {
                            v17_1 = v2_19;
                            v2_18 = v5_4;
                            v18_0 = v6_23;
                            v19_0 = v9_3;
                            v21_0 = v12_1;
                            v20_0 = v14_0;
                            v14_2 = v4_15;
                        } else {
                            int v7_16 = ((b0.d) v4_15.getLayoutParams());
                            if (v7_16.k == null) {
                            } else {
                                int v16;
                                int v8_12 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                                int v13_1 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                                int v17_2 = v5_4;
                                int v5_2 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                                int v18_1 = v3_7;
                                this.k(v7_16.k, v8_12);
                                this.i(v4_15, v13_1, 0);
                                String v3_6 = v6_23;
                                int v6_20 = v7_16;
                                int v7_17 = v4_15.getMeasuredWidth();
                                int v19_1 = v4_15;
                                int v4_16 = v8_12;
                                int v8_13 = v19_1.getMeasuredHeight();
                                v17_1 = v2_19;
                                v2_18 = v17_2;
                                v18_0 = v3_6;
                                v3_7 = v18_1;
                                v20_0 = v14_0;
                                v14_2 = v19_1;
                                androidx.coordinatorlayout.widget.CoordinatorLayout.l(v3_7, v4_16, v5_2, v6_20, v7_17, v8_13);
                                v19_0 = v9_3;
                                v21_0 = v12_1;
                                if ((v5_2.left == v13_1.left) && (v5_2.top == v13_1.top)) {
                                    v16 = 0;
                                } else {
                                    v16 = 1;
                                }
                                this.h(v6_20, v5_2, v7_17, v8_13);
                                int v7_19 = (v5_2.left - v13_1.left);
                                int v8_16 = (v5_2.top - v13_1.top);
                                if (v7_19 != 0) {
                                    v14_2.offsetLeftAndRight(v7_19);
                                }
                                if (v8_16 != 0) {
                                    v14_2.offsetTopAndBottom(v8_16);
                                }
                                if (v16 != 0) {
                                    int v7_20 = v6_20.a;
                                    if (v7_20 != 0) {
                                        v7_20.h(this, v14_2, v6_20.k);
                                    }
                                }
                                v4_16.setEmpty();
                                v15.c(v4_16);
                                v13_1.setEmpty();
                                v15.c(v13_1);
                                v5_2.setEmpty();
                                v15.c(v5_2);
                            }
                        }
                        v6_23 = (v18_0 + 1);
                        v5_4 = v2_18;
                        v4_15 = v14_2;
                        v2_19 = v17_1;
                        v9_3 = v19_0;
                        v14_0 = v20_0;
                        v12_1 = v21_0;
                    }
                    int v17_0 = v2_19;
                    int v2_20 = v5_4;
                    int v19_2 = v9_3;
                    android.graphics.Rect v21_1 = v12_1;
                    v20_3 = v14_0;
                    int v14_3 = v4_15;
                    this.i(v14_3, v11, 1);
                    if ((v2_20.g != 0) && (!v11.isEmpty())) {
                        int v5_8 = android.view.Gravity.getAbsoluteGravity(v2_20.g, v3_7);
                        android.graphics.Rect v12_4 = (v5_8 & 112);
                        if (v12_4 == 48) {
                            v10.top = Math.max(v10.top, v11.bottom);
                        } else {
                            if (v12_4 == 80) {
                                v10.bottom = Math.max(v10.bottom, (this.getHeight() - v11.top));
                            }
                        }
                        int v4_22 = (v5_8 & 7);
                        if (v4_22 == 3) {
                            v10.left = Math.max(v10.left, v11.right);
                        } else {
                            if (v4_22 == 5) {
                                v10.right = Math.max(v10.right, (this.getWidth() - v11.left));
                            }
                        }
                    }
                    if ((v2_20.h != 0) && ((v14_3.getVisibility() == 0) && ((v14_3.isLaidOut()) && ((v14_3.getWidth() > 0) && (v14_3.getHeight() > 0))))) {
                        int v2_3 = ((b0.d) v14_3.getLayoutParams());
                        int v4_0 = v2_3.a;
                        int v5_0 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                        android.graphics.Rect v12_0 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                        v12_0.set(v14_3.getLeft(), v14_3.getTop(), v14_3.getRight(), v14_3.getBottom());
                        if ((v4_0 == 0) || (!v4_0.e(v14_3))) {
                            v5_0.set(v12_0);
                        } else {
                            if (!v12_0.contains(v5_0)) {
                                break;
                            }
                        }
                        v12_0.setEmpty();
                        v15.c(v12_0);
                        if (!v5_0.isEmpty()) {
                            int v7_4;
                            int v4_5 = android.view.Gravity.getAbsoluteGravity(v2_3.h, v3_7);
                            if ((v4_5 & 48) != 48) {
                                v7_4 = 0;
                            } else {
                                int v6_4 = ((v5_0.top - v2_3.topMargin) - v2_3.j);
                                int v7_3 = v10.top;
                                if (v6_4 >= v7_3) {
                                } else {
                                    androidx.coordinatorlayout.widget.CoordinatorLayout.v(v14_3, (v7_3 - v6_4));
                                    v7_4 = 1;
                                }
                            }
                            if ((v4_5 & 80) == 80) {
                                int v6_9 = (((this.getHeight() - v5_0.bottom) - v2_3.bottomMargin) + v2_3.j);
                                int v8_5 = v10.bottom;
                                if (v6_9 < v8_5) {
                                    androidx.coordinatorlayout.widget.CoordinatorLayout.v(v14_3, (v6_9 - v8_5));
                                    v7_4 = 1;
                                }
                            }
                            if (v7_4 == 0) {
                                androidx.coordinatorlayout.widget.CoordinatorLayout.v(v14_3, 0);
                            }
                            int v7_10;
                            if ((v4_5 & 3) != 3) {
                                v7_10 = 0;
                            } else {
                                int v6_15 = ((v5_0.left - v2_3.leftMargin) - v2_3.i);
                                int v7_9 = v10.left;
                                if (v6_15 >= v7_9) {
                                } else {
                                    androidx.coordinatorlayout.widget.CoordinatorLayout.u(v14_3, (v7_9 - v6_15));
                                    v7_10 = 1;
                                }
                            }
                            if ((v4_5 & 5) == 5) {
                                int v4_11 = (((this.getWidth() - v5_0.right) - v2_3.rightMargin) + v2_3.i);
                                int v2_8 = v10.right;
                                if (v4_11 < v2_8) {
                                    androidx.coordinatorlayout.widget.CoordinatorLayout.u(v14_3, (v4_11 - v2_8));
                                    v7_10 = 1;
                                }
                            }
                            if (v7_10 == 0) {
                                androidx.coordinatorlayout.widget.CoordinatorLayout.u(v14_3, 0);
                            }
                            v5_0.setEmpty();
                            v15.c(v5_0);
                        } else {
                            v5_0.setEmpty();
                            v15.c(v5_0);
                        }
                    }
                    if (p23 == 2) {
                        v4_13 = v21_1;
                    } else {
                        v4_13 = v21_1;
                        v4_13.set(((b0.d) v14_3.getLayoutParams()).o);
                        if (!v4_13.equals(v11)) {
                            ((b0.d) v14_3.getLayoutParams()).o.set(v11);
                        } else {
                            v5_1 = v17_0;
                            v2_17 = v19_2;
                            v14_0 = (v20_3 + 1);
                            v9_3 = v2_17;
                            v12_1 = v4_13;
                            v2_19 = v5_1;
                        }
                    }
                    int v14_1 = (v20_3 + 1);
                    v2_17 = v19_2;
                    while(true) {
                        v5_1 = v17_0;
                        if (v14_1 >= v2_17) {
                            break;
                        }
                        int v7_13 = ((android.view.View) v5_1.get(v14_1));
                        int v8_8 = ((b0.d) v7_13.getLayoutParams()).a;
                        if (v8_8 != 0) {
                            v8_8.f(v7_13);
                        }
                        v14_1++;
                        v17_0 = v5_1;
                    }
                } else {
                    v5_1 = v2_19;
                    v2_17 = v9_3;
                    v4_13 = v12_1;
                    v20_3 = v14_0;
                }
            }
        }
        int v2_5 = new StringBuilder("Rect should be within the child\'s bounds. Rect:");
        v2_5.append(v5_0.toShortString());
        v2_5.append(" | Bounds:");
        v2_5.append(v12_0.toShortString());
        throw new IllegalArgumentException(v2_5.toString());
    }

    public final void q(android.view.View p13, int p14)
    {
        int v0_8 = ((b0.d) p13.getLayoutParams());
        int v1_8 = v0_8.k;
        if ((v1_8 == 0) && (v0_8.f != -1)) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else {
            int v2_1 = androidx.coordinatorlayout.widget.CoordinatorLayout.D;
            if (v1_8 == 0) {
                int v14_1 = v0_8.e;
                if (v14_1 < 0) {
                    int v14_7 = ((b0.d) p13.getLayoutParams());
                    android.graphics.Rect v9 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                    v9.set((this.getPaddingLeft() + v14_7.leftMargin), (this.getPaddingTop() + v14_7.topMargin), ((this.getWidth() - this.getPaddingRight()) - v14_7.rightMargin), ((this.getHeight() - this.getPaddingBottom()) - v14_7.bottomMargin));
                    if ((this.t != null) && ((this.getFitsSystemWindows()) && (!p13.getFitsSystemWindows()))) {
                        v9.left = (this.t.b() + v9.left);
                        v9.top = (this.t.d() + v9.top);
                        v9.right = (v9.right - this.t.c());
                        v9.bottom = (v9.bottom - this.t.a());
                    }
                    android.graphics.Rect v10 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                    int v14_9 = v14_7.c;
                    if ((v14_9 & 7) == 0) {
                        v14_9 |= 8388611;
                    }
                    if ((v14_9 & 112) == 0) {
                        v14_9 |= 48;
                    }
                    android.view.Gravity.apply(v14_9, p13.getMeasuredWidth(), p13.getMeasuredHeight(), v9, v10, p14);
                    p13.layout(v10.left, v10.top, v10.right, v10.bottom);
                    v9.setEmpty();
                    v2_1.c(v9);
                    v10.setEmpty();
                    v2_1.c(v10);
                    return;
                } else {
                    int v0_2 = ((b0.d) p13.getLayoutParams());
                    int v1_0 = v0_2.c;
                    if (v1_0 == 0) {
                        v1_0 = 8388661;
                    }
                    int v1_1 = android.view.Gravity.getAbsoluteGravity(v1_0, p14);
                    int v2_0 = (v1_1 & 7);
                    int v1_2 = (v1_1 & 112);
                    int v4_0 = this.getWidth();
                    int v5_0 = this.getHeight();
                    int v6_0 = p13.getMeasuredWidth();
                    int v7_0 = p13.getMeasuredHeight();
                    if (p14 == 1) {
                        v14_1 = (v4_0 - v14_1);
                    }
                    int v14_3 = (this.m(v14_1) - v6_0);
                    if (v2_0 == 1) {
                        v14_3 += (v6_0 / 2);
                    } else {
                        if (v2_0 == 5) {
                            v14_3 += v6_0;
                        }
                    }
                    int v1_3;
                    if (v1_2 == 16) {
                        v1_3 = (v7_0 / 2);
                    } else {
                        if (v1_2 == 80) {
                            v1_3 = v7_0;
                        } else {
                            v1_3 = 0;
                        }
                    }
                    int v14_5 = Math.max((this.getPaddingLeft() + v0_2.leftMargin), Math.min(v14_3, (((v4_0 - this.getPaddingRight()) - v6_0) - v0_2.rightMargin)));
                    int v0_5 = Math.max((this.getPaddingTop() + v0_2.topMargin), Math.min(v1_3, (((v5_0 - this.getPaddingBottom()) - v7_0) - v0_2.bottomMargin)));
                    p13.layout(v14_5, v0_5, (v6_0 + v14_5), (v7_0 + v0_5));
                    return;
                }
            } else {
                int v4_4 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                int v5_4 = androidx.coordinatorlayout.widget.CoordinatorLayout.g();
                try {
                    this.k(v1_8, v4_4);
                    int v6_3 = ((b0.d) p13.getLayoutParams());
                    int v7_2 = p13.getMeasuredWidth();
                    int v8_1 = p13.getMeasuredHeight();
                    androidx.coordinatorlayout.widget.CoordinatorLayout.l(p14, v4_4, v5_4, v6_3, v7_2, v8_1);
                    this.h(v6_3, v5_4, v7_2, v8_1);
                    p13.layout(v5_4.left, v5_4.top, v5_4.right, v5_4.bottom);
                    v4_4.setEmpty();
                    v2_1.c(v4_4);
                    v5_4.setEmpty();
                    v2_1.c(v5_4);
                    return;
                } catch (int v0_9) {
                    Throwable v13_2 = v0_9;
                    v4_4.setEmpty();
                    v2_1.c(v4_4);
                    v5_4.setEmpty();
                    v2_1.c(v5_4);
                    throw v13_2;
                }
            }
        }
    }

    public final boolean r(android.view.MotionEvent p21, int p22)
    {
        int v3 = p21.getActionMasked();
        java.util.ArrayList v4 = this.c;
        v4.clear();
        int v5_2 = this.isChildrenDrawingOrderEnabled();
        int v6_0 = this.getChildCount();
        boolean v7_0 = (v6_0 - 1);
        while (v7_0) {
            android.view.MotionEvent v8_1;
            if (v5_2 == 0) {
                v8_1 = v7_0;
            } else {
                v8_1 = this.getChildDrawingOrder(v6_0, v7_0);
            }
            v4.add(this.getChildAt(v8_1));
            v7_0--;
        }
        int v5_0 = androidx.coordinatorlayout.widget.CoordinatorLayout.C;
        if (v5_0 != 0) {
            java.util.Collections.sort(v4, v5_0);
        }
        int v5_1 = v4.size();
        int v6_1 = 0;
        android.view.MotionEvent v8_0 = 0;
        boolean v7_2 = 0;
        while (v6_1 < v5_1) {
            android.view.View v9_1 = ((android.view.View) v4.get(v6_1));
            b0.a v10_2 = ((b0.d) v9_1.getLayoutParams()).a;
            if ((!v7_2) || (v3 == 0)) {
                if ((!v7_2) && (v10_2 != null)) {
                    if (p22 == 0) {
                        v7_2 = v10_2.j(this, v9_1, p21);
                    } else {
                        if (p22 == 1) {
                            v7_2 = v10_2.u(v9_1, p21);
                        }
                    }
                    if (v7_2) {
                        this.p = v9_1;
                    }
                }
            } else {
                if (v10_2 != null) {
                    if (v8_0 == null) {
                        long v12 = android.os.SystemClock.uptimeMillis();
                        v8_0 = android.view.MotionEvent.obtain(v12, v12, 3, 0, 0, 0);
                    }
                    if (p22 == 0) {
                        v10_2.j(this, v9_1, v8_0);
                    } else {
                        if (p22 == 1) {
                            v10_2.u(v9_1, v8_0);
                        }
                    }
                }
            }
            v6_1++;
        }
        v4.clear();
        return v7_2;
    }

    public final boolean requestChildRectangleOnScreen(android.view.View p2, android.graphics.Rect p3, boolean p4)
    {
        b0.a v0_2 = ((b0.d) p2.getLayoutParams()).a;
        if (v0_2 != null) {
            v0_2.p(this, p2);
        }
        return super.requestChildRectangleOnScreen(p2, p3, p4);
    }

    public final void requestDisallowInterceptTouchEvent(boolean p1)
    {
        super.requestDisallowInterceptTouchEvent(p1);
        if ((p1 != 0) && (!this.m)) {
            this.t(0);
            this.m = 1;
        }
        return;
    }

    public final void s()
    {
        IllegalStateException v0_0 = this.a;
        v0_0.clear();
        String v1_3 = this.b;
        String v2_4 = ((r.j) v1_3.c);
        java.util.HashSet v3_3 = ((p0.c) v1_3.b);
        r.j v4_1 = ((r.j) v1_3.c);
        int v5_2 = v2_4.c;
        int v6 = 0;
        Object v7_0 = 0;
        while (v7_0 < v5_2) {
            b0.d v8_1 = ((java.util.ArrayList) v2_4.j(v7_0));
            if (v8_1 != null) {
                v8_1.clear();
                v3_3.c(v8_1);
            }
            v7_0++;
        }
        v2_4.clear();
        String v2_0 = this.getChildCount();
        int v5_0 = 0;
        while (v5_0 < v2_0) {
            Object v7_2 = this.getChildAt(v5_0);
            b0.d v8_2 = androidx.coordinatorlayout.widget.CoordinatorLayout.n(v7_2);
            android.view.ViewParent v9_4 = v8_2.f;
            if (v9_4 != -1) {
                android.view.View v10_3 = v8_2.k;
                if ((v10_3 != null) && (v10_3.getId() == v9_4)) {
                    android.view.View v10_5 = v8_2.k;
                    java.util.ArrayList v12_12 = v10_5.getParent();
                    while (v12_12 != this) {
                        if ((v12_12 != null) && (v12_12 != v7_2)) {
                            if ((v12_12 instanceof android.view.View)) {
                                v10_5 = ((android.view.View) v12_12);
                            }
                            v12_12 = v12_12.getParent();
                        } else {
                            v8_2.l = 0;
                            v8_2.k = 0;
                        }
                    }
                    v8_2.l = v10_5;
                    if (!v4_1.containsKey(v7_2)) {
                        v4_1.put(v7_2, 0);
                    }
                    android.view.ViewParent v9_3 = 0;
                    while (v9_3 < v2_0) {
                        if (v9_3 != v5_0) {
                            android.view.View v10_0 = this.getChildAt(v9_3);
                            if (v10_0 != v8_2.l) {
                                java.util.ArrayList v12_1 = this.getLayoutDirection();
                                boolean v13_3 = android.view.Gravity.getAbsoluteGravity(((b0.d) v10_0.getLayoutParams()).g, v12_1);
                                if ((!v13_3) || ((android.view.Gravity.getAbsoluteGravity(v8_2.h, v12_1) & v13_3) != v13_3)) {
                                    android.view.View v10_1 = v8_2.a;
                                    if (v10_1 == null) {
                                        v9_3++;
                                    } else {
                                        v10_1.f(v7_2);
                                    }
                                }
                            }
                            if ((!v4_1.containsKey(v10_0)) && (!v4_1.containsKey(v10_0))) {
                                v4_1.put(v10_0, 0);
                            }
                            if ((!v4_1.containsKey(v10_0)) || (!v4_1.containsKey(v7_2))) {
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            } else {
                                java.util.ArrayList v12_9 = ((java.util.ArrayList) v4_1.get(v10_0));
                                if (v12_9 == null) {
                                    v12_9 = ((java.util.ArrayList) v3_3.a());
                                    if (v12_9 == null) {
                                        v12_9 = new java.util.ArrayList();
                                    }
                                    v4_1.put(v10_0, v12_9);
                                }
                                v12_9.add(v7_2);
                            }
                        }
                    }
                    v5_0++;
                }
                android.view.View v10_7 = this.findViewById(v9_4);
                v8_2.k = v10_7;
                if (v10_7 == null) {
                    if (!this.isInEditMode()) {
                        String v1_5 = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                        v1_5.append(this.getResources().getResourceName(v9_4));
                        v1_5.append(" to anchor view ");
                        v1_5.append(v7_2);
                        throw new IllegalStateException(v1_5.toString());
                    } else {
                        v8_2.l = 0;
                        v8_2.k = 0;
                    }
                } else {
                    if (v10_7 != this) {
                        android.view.ViewParent v9_5 = v10_7.getParent();
                        while ((v9_5 != this) && (v9_5 != null)) {
                            if (v9_5 != v7_2) {
                                if ((v9_5 instanceof android.view.View)) {
                                    v10_7 = ((android.view.View) v9_5);
                                }
                                v9_5 = v9_5.getParent();
                            } else {
                                if (!this.isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                } else {
                                    v8_2.l = 0;
                                    v8_2.k = 0;
                                }
                            }
                        }
                        v8_2.l = v10_7;
                    } else {
                        if (!this.isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        } else {
                            v8_2.l = 0;
                            v8_2.k = 0;
                        }
                    }
                }
            } else {
                v8_2.l = 0;
                v8_2.k = 0;
            }
        }
        String v2_2 = ((java.util.ArrayList) v1_3.d);
        v2_2.clear();
        java.util.HashSet v3_1 = ((java.util.HashSet) v1_3.e);
        v3_1.clear();
        int v5_1 = v4_1.c;
        while (v6 < v5_1) {
            v1_3.d(v4_1.g(v6), v2_2, v3_1);
            v6++;
        }
        v0_0.addAll(v2_2);
        java.util.Collections.reverse(v0_0);
        return;
    }

    public void setFitsSystemWindows(boolean p1)
    {
        super.setFitsSystemWindows(p1);
        this.w();
        return;
    }

    public void setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener p1)
    {
        this.w = p1;
        return;
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable p3)
    {
        int v0_0 = this.v;
        if (v0_0 != p3) {
            int v1_0 = 0;
            if (v0_0 != 0) {
                v0_0.setCallback(0);
            }
            if (p3 != null) {
                v1_0 = p3.mutate();
            }
            this.v = v1_0;
            if (v1_0 != 0) {
                if (v1_0.isStateful()) {
                    this.v.setState(this.getDrawableState());
                }
                int v0_4;
                this.v.setLayoutDirection(this.getLayoutDirection());
                if (this.getVisibility() != 0) {
                    v0_4 = 0;
                } else {
                    v0_4 = 1;
                }
                this.v.setVisible(v0_4, 0);
                this.v.setCallback(this);
            }
            this.postInvalidateOnAnimation();
        }
        return;
    }

    public void setStatusBarBackgroundColor(int p2)
    {
        this.setStatusBarBackground(new android.graphics.drawable.ColorDrawable(p2));
        return;
    }

    public void setStatusBarBackgroundResource(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = e0.c.getDrawable(this.getContext(), p2);
        }
        this.setStatusBarBackground(v2_1);
        return;
    }

    public void setVisibility(int p3)
    {
        int v3_1;
        super.setVisibility(p3);
        if (p3 != 0) {
            v3_1 = 0;
        } else {
            v3_1 = 1;
        }
        android.graphics.drawable.Drawable v1_1 = this.v;
        if ((v1_1 != null) && (v1_1.isVisible() != v3_1)) {
            this.v.setVisible(v3_1, 0);
        }
        return;
    }

    public final void t(boolean p14)
    {
        int v0 = this.getChildCount();
        b0.d v2_3 = 0;
        while (v2_3 < v0) {
            android.view.View v3 = this.getChildAt(v2_3);
            b0.a v4_2 = ((b0.d) v3.getLayoutParams()).a;
            if (v4_2 != null) {
                android.view.MotionEvent v5_0 = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent v5_1 = android.view.MotionEvent.obtain(v5_0, v5_0, 3, 0, 0, 0);
                if (p14 == 0) {
                    v4_2.u(v3, v5_1);
                } else {
                    v4_2.j(this, v3, v5_1);
                }
                v5_1.recycle();
            }
            v2_3++;
        }
        int v14_1 = 0;
        while (v14_1 < v0) {
            ((b0.d) this.getChildAt(v14_1).getLayoutParams()).getClass();
            v14_1++;
        }
        this.p = 0;
        this.m = 0;
        return;
    }

    public final boolean verifyDrawable(android.graphics.drawable.Drawable p2)
    {
        if ((!super.verifyDrawable(p2)) && (p2 != this.v)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void w()
    {
        if (!this.getFitsSystemWindows()) {
            q0.i0.j(this, 0);
            return;
        } else {
            if (this.x == null) {
                this.x = new l6.c(this, 6);
            }
            q0.i0.j(this, this.x);
            this.setSystemUiVisibility(1280);
            return;
        }
    }
}
