package com.google.android.material.sidesheet;
public class SideSheetBehavior extends b0.a implements r3.b {
    public w3.a a;
    public final v3.k b;
    public final android.content.res.ColorStateList c;
    public final v3.p d;
    public final h3.e e;
    public final float f;
    public final boolean g;
    public int h;
    public y0.e i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public ref.WeakReference p;
    public ref.WeakReference q;
    public final int r;
    public android.view.VelocityTracker s;
    public r3.h t;
    public int u;
    public final java.util.LinkedHashSet v;
    public final h3.b w;

    public SideSheetBehavior()
    {
        this.e = new h3.e(this);
        this.g = 1;
        this.h = 5;
        this.k = 1036831949;
        this.r = -1;
        this.v = new java.util.LinkedHashSet();
        this.w = new h3.b(this, 1);
        return;
    }

    public SideSheetBehavior(android.content.Context p7, android.util.AttributeSet p8)
    {
        this.e = new h3.e(this);
        this.g = 1;
        this.h = 5;
        this.k = 1036831949;
        this.r = -1;
        this.v = new java.util.LinkedHashSet();
        this.w = new h3.b(this, 1);
        android.content.res.TypedArray v3_5 = p7.obtainStyledAttributes(p8, c3.a.A);
        if (v3_5.hasValue(3)) {
            this.c = j5.t1.v(p7, v3_5, 3);
        }
        if (v3_5.hasValue(6)) {
            this.d = v3.p.b(p7, p8, 0, 2132018304).a();
        }
        if (v3_5.hasValue(5)) {
            boolean v8_4 = v3_5.getResourceId(5, -1);
            this.r = v8_4;
            v3.k v1_0 = this.q;
            if (v1_0 != null) {
                v1_0.clear();
            }
            this.q = 0;
            v3.k v1_2 = this.p;
            if (v1_2 != null) {
                v3.k v1_4 = ((android.view.View) v1_2.get());
                if ((v8_4 != -1) && (v1_4.isLaidOut())) {
                    v1_4.requestLayout();
                }
            }
        }
        boolean v8_6 = this.d;
        if (v8_6) {
            v3.k v1_7 = new v3.k(v8_6);
            this.b = v1_7;
            v1_7.l(p7);
            boolean v8_7 = this.c;
            if (!v8_7) {
                boolean v8_9 = new android.util.TypedValue();
                p7.getTheme().resolveAttribute(16842801, v8_9, 1);
                this.b.setTint(v8_9.data);
            } else {
                this.b.o(v8_7);
            }
        }
        this.f = v3_5.getDimension(2, -1082130432);
        this.g = v3_5.getBoolean(4, 1);
        v3_5.recycle();
        android.view.ViewConfiguration.get(p7).getScaledMaximumFlingVelocity();
        return;
    }

    public final void a()
    {
        r3.h v0 = this.t;
        if (v0 != null) {
            r3.g v1_0 = v0.f;
            int v2_0 = 0;
            v0.f = 0;
            int v3 = 5;
            if ((v1_0 != null) && (android.os.Build$VERSION.SDK_INT >= 34)) {
                f2.o v4_0 = this.a;
                if ((v4_0 != null) && (v4_0.d() != 0)) {
                    v3 = 3;
                }
                int v6_2;
                f2.o v4_3 = new f2.o(this, 8);
                int v6_1 = this.q;
                if (v6_1 == 0) {
                    v6_2 = 0;
                } else {
                    v6_2 = ((android.view.View) v6_1.get());
                }
                if (v6_2 != 0) {
                    int v7_1 = ((android.view.ViewGroup$MarginLayoutParams) v6_2.getLayoutParams());
                    if (v7_1 != 0) {
                        int v2_3;
                        switch (this.a.a) {
                            case 0:
                                v2_3 = v7_1.leftMargin;
                                break;
                            default:
                                v2_3 = v7_1.rightMargin;
                        }
                        v2_0 = new w3.c(this, v7_1, v2_3, v6_2);
                    }
                }
                int v7_3;
                int v6_4 = v0.b;
                if (v1_0.d != 0) {
                    v7_3 = 0;
                } else {
                    v7_3 = 1;
                }
                android.animation.ObjectAnimator v5_1;
                if ((android.view.Gravity.getAbsoluteGravity(v3, v6_4.getLayoutDirection()) & android.animation.ObjectAnimator v5_0) != 3) {
                    v5_1 = 0;
                } else {
                    v5_1 = 1;
                }
                android.util.Property v10_6;
                float v11_1 = (v6_4.getScaleX() * ((float) v6_4.getWidth()));
                android.util.Property v10_5 = v6_4.getLayoutParams();
                if (!(v10_5 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                    v10_6 = 0;
                } else {
                    android.util.Property v10_7 = ((android.view.ViewGroup$MarginLayoutParams) v10_5);
                    if (v5_1 == null) {
                        v10_6 = v10_7.rightMargin;
                    } else {
                        v10_6 = v10_7.leftMargin;
                    }
                }
                float v11_2 = (v11_1 + ((float) v10_6));
                if (v5_1 != null) {
                    v11_2 = (- v11_2);
                }
                android.animation.ObjectAnimator v5_2 = new float[1];
                v5_2[0] = v11_2;
                android.animation.ObjectAnimator v5_3 = android.animation.ObjectAnimator.ofFloat(v6_4, android.view.View.TRANSLATION_X, v5_2);
                if (v2_0 != 0) {
                    v5_3.addUpdateListener(v2_0);
                }
                v5_3.setInterpolator(new l1.a(1));
                v5_3.setDuration(((long) d3.a.c(v0.c, v0.d, v1_0.c)));
                v5_3.addListener(new r3.g(v0, v7_3, v3));
                v5_3.addListener(v4_3);
                v5_3.start();
                return;
            } else {
                this.v(5);
                return;
            }
        } else {
            return;
        }
    }

    public final void b(c.a p5)
    {
        int v0_0 = this.t;
        if (v0_0 != 0) {
            android.view.ViewGroup$MarginLayoutParams v1_4;
            android.view.ViewGroup$MarginLayoutParams v1_0 = this.a;
            if ((v1_0 != null) && (v1_0.d() != 0)) {
                v1_4 = 3;
            } else {
                v1_4 = 5;
            }
            if (v0_0.f == null) {
                android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            w3.a v2_1 = v0_0.f;
            v0_0.f = p5;
            if (v2_1 != null) {
                w3.a v2_3;
                if (p5.d != 0) {
                    v2_3 = 0;
                } else {
                    v2_3 = 1;
                }
                v0_0.a(p5.c, v2_3, v1_4);
            }
            int v5_2 = this.p;
            if ((v5_2 != 0) && (v5_2.get() != null)) {
                int v0_2;
                int v0_1 = this.q;
                if (v0_1 == 0) {
                    v0_2 = 0;
                } else {
                    v0_2 = ((android.view.View) v0_1.get());
                }
                if (v0_2 != 0) {
                    android.view.ViewGroup$MarginLayoutParams v1_2 = ((android.view.ViewGroup$MarginLayoutParams) v0_2.getLayoutParams());
                    if (v1_2 != null) {
                        this.a.g(v1_2, ((int) ((((android.view.View) this.p.get()).getScaleX() * ((float) this.l)) + ((float) this.o))));
                        v0_2.requestLayout();
                    }
                }
            }
        }
        return;
    }

    public final void c(c.a p2)
    {
        r3.h v0 = this.t;
        if (v0 != null) {
            v0.f = p2;
            return;
        } else {
            return;
        }
    }

    public final void d()
    {
        long v0_0 = this.t;
        if (v0_0 != 0) {
            android.view.ViewGroup v1_0 = v0_0.b;
            if (v0_0.f == null) {
                android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            android.animation.AnimatorSet v2_4 = v0_0.f;
            v0_0.f = 0;
            if (v2_4 != null) {
                android.animation.AnimatorSet v2_1 = new android.animation.AnimatorSet();
                android.animation.ObjectAnimator v5_0 = new float[1];
                v5_0[0] = 1065353216;
                int v3_1 = android.animation.ObjectAnimator.ofFloat(v1_0, android.view.View.SCALE_X, v5_0);
                android.animation.Animator[] v8_0 = new float[1];
                v8_0[0] = 1065353216;
                android.animation.ObjectAnimator v5_2 = android.animation.ObjectAnimator.ofFloat(v1_0, android.view.View.SCALE_Y, v8_0);
                android.animation.Animator[] v8_2 = new android.animation.Animator[2];
                v8_2[0] = v3_1;
                v8_2[1] = v5_2;
                v2_1.playTogether(v8_2);
                if ((v1_0 instanceof android.view.ViewGroup)) {
                    android.view.ViewGroup v1_1 = ((android.view.ViewGroup) v1_0);
                    int v3_3 = 0;
                    while (v3_3 < v1_1.getChildCount()) {
                        android.animation.ObjectAnimator v5_4 = v1_1.getChildAt(v3_3);
                        float[] v9 = new float[1];
                        v9[0] = 1065353216;
                        android.animation.Animator[] v8_4 = new android.animation.Animator[1];
                        v8_4[0] = android.animation.ObjectAnimator.ofFloat(v5_4, android.view.View.SCALE_Y, v9);
                        v2_1.playTogether(v8_4);
                        v3_3++;
                    }
                }
                v2_1.setDuration(((long) v0_0.e));
                v2_1.start();
                return;
            }
        }
        return;
    }

    public final void g(b0.d p1)
    {
        this.p = 0;
        this.i = 0;
        this.t = 0;
        return;
    }

    public final void i()
    {
        this.p = 0;
        this.i = 0;
        this.t = 0;
        return;
    }

    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout p3, android.view.View p4, android.view.MotionEvent p5)
    {
        if (((!p4.isShown()) && (q0.q0.f(p4) == null)) || (!this.g)) {
            this.j = 1;
            return 0;
        } else {
            boolean v3_1 = p5.getActionMasked();
            if (!v3_1) {
                int v4_1 = this.s;
                if (v4_1 != 0) {
                    v4_1.recycle();
                    this.s = 0;
                }
            }
            if (this.s == null) {
                this.s = android.view.VelocityTracker.obtain();
            }
            this.s.addMovement(p5);
            if (!v3_1) {
                this.u = ((int) p5.getX());
            } else {
                if (((v3_1 == 1) || (v3_1 == 3)) && (this.j)) {
                    this.j = 0;
                    return 0;
                }
            }
            if (!this.j) {
                boolean v3_6 = this.i;
                if ((v3_6) && (v3_6.p(p5))) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p11, android.view.View p12, int p13)
    {
        if ((p11.getFitsSystemWindows()) && (!p12.getFitsSystemWindows())) {
            p12.setFitsSystemWindows(1);
        }
        int v2_4 = this.b;
        int v4 = 0;
        if (this.p == null) {
            this.p = new ref.WeakReference(p12);
            this.t = new r3.h(p12);
            if (v2_4 == 0) {
                android.view.ViewGroup$LayoutParams v0_22 = this.c;
                if (v0_22 != null) {
                    q0.i0.g(p12, v0_22);
                }
            } else {
                p12.setBackground(v2_4);
                int v5_0 = this.f;
                if (v5_0 == -1082130432) {
                    v5_0 = p12.getElevation();
                }
                v2_4.n(v5_0);
            }
            android.view.ViewGroup$LayoutParams v0_26;
            if (this.h != 5) {
                v0_26 = 0;
            } else {
                v0_26 = 4;
            }
            if (p12.getVisibility() != v0_26) {
                p12.setVisibility(v0_26);
            }
            this.z();
            if (p12.getImportantForAccessibility() == 0) {
                p12.setImportantForAccessibility(1);
            }
            if (q0.q0.f(p12) == null) {
                q0.q0.o(p12, p12.getResources().getString(2131952343));
            }
        }
        android.view.ViewGroup$LayoutParams v0_36;
        if (android.view.Gravity.getAbsoluteGravity(((b0.d) p12.getLayoutParams()).c, p13) != 3) {
            v0_36 = 0;
        } else {
            v0_36 = 1;
        }
        b0.d v6_11 = this.a;
        if ((v6_11 == null) || (v6_11.d() != v0_36)) {
            b0.d v6_5 = 0;
            v3.p v8 = this.d;
            if (v0_36 != null) {
                if (v0_36 != 1) {
                    throw new IllegalArgumentException(v1.a.j("Invalid sheet edge position value: ", v0_36, ". Must be 0 or 1."));
                } else {
                    this.a = new w3.a(this, 0);
                    if (v8 != null) {
                        android.view.ViewGroup$LayoutParams v0_40 = this.p;
                        if (v0_40 != null) {
                            android.view.ViewGroup$LayoutParams v0_42 = ((android.view.View) v0_40.get());
                            if ((v0_42 != null) && ((v0_42.getLayoutParams() instanceof b0.d))) {
                                v6_5 = ((b0.d) v0_42.getLayoutParams());
                            }
                        }
                        if ((v6_5 == null) || (v6_5.leftMargin <= 0)) {
                            android.view.ViewGroup$LayoutParams v0_2 = v8.f();
                            v0_2.e = new v3.a(0);
                            v0_2.h = new v3.a(0);
                            android.view.ViewGroup$LayoutParams v0_3 = v0_2.a();
                            if (v2_4 != 0) {
                                v2_4.setShapeAppearanceModel(v0_3);
                            }
                        }
                    }
                }
            } else {
                this.a = new w3.a(this, 1);
                if (v8 != null) {
                    android.view.ViewGroup$LayoutParams v0_6 = this.p;
                    if (v0_6 != null) {
                        android.view.ViewGroup$LayoutParams v0_8 = ((android.view.View) v0_6.get());
                        if ((v0_8 != null) && ((v0_8.getLayoutParams() instanceof b0.d))) {
                            v6_5 = ((b0.d) v0_8.getLayoutParams());
                        }
                    }
                    if ((v6_5 == null) || (v6_5.rightMargin <= 0)) {
                        android.view.ViewGroup$LayoutParams v0_12 = v8.f();
                        v0_12.f = new v3.a(0);
                        v0_12.g = new v3.a(0);
                        android.view.ViewGroup$LayoutParams v0_14 = v0_12.a();
                        if (v2_4 != 0) {
                            v2_4.setShapeAppearanceModel(v0_14);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new y0.e(p11.getContext(), p11, this.w);
        }
        int v13_4;
        android.view.ViewGroup$LayoutParams v0_19 = this.a.c(p12);
        p11.q(p12, p13);
        this.m = p11.getWidth();
        switch (this.a.a) {
            case 0:
                v13_4 = p11.getLeft();
                break;
            default:
                v13_4 = p11.getRight();
        }
        int v13_8;
        this.n = v13_4;
        this.l = p12.getWidth();
        int v13_7 = ((android.view.ViewGroup$MarginLayoutParams) p12.getLayoutParams());
        if (v13_7 == 0) {
            v13_8 = 0;
        } else {
            switch (this.a.a) {
                case 0:
                    v13_8 = v13_7.leftMargin;
                    break;
                default:
                    v13_8 = v13_7.rightMargin;
            }
        }
        this.o = v13_8;
        int v13_9 = this.h;
        if ((v13_9 == 1) || (v13_9 == 2)) {
            v4 = (v0_19 - this.a.c(p12));
        } else {
            if (v13_9 != 3) {
                if (v13_9 != 5) {
                    Object v12_2 = new StringBuilder("Unexpected value: ");
                    v12_2.append(this.h);
                    throw new IllegalStateException(v12_2.toString());
                } else {
                    v4 = this.a.b();
                }
            }
        }
        p12.offsetLeftAndRight(v4);
        if (this.q == null) {
            int v13_15 = this.r;
            if (v13_15 != -1) {
                ClassCastException v11_3 = p11.findViewById(v13_15);
                if (v11_3 != null) {
                    this.q = new ref.WeakReference(v11_3);
                }
            }
        }
        ClassCastException v11_5 = this.v.iterator();
        while (v11_5.hasNext()) {
            if (v11_5.next() != null) {
                throw new ClassCastException();
            }
        }
        return 1;
    }

    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout p4, android.view.View p5, int p6, int p7, int p8)
    {
        android.view.ViewGroup$MarginLayoutParams v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p5.getLayoutParams());
        p5.measure(android.view.ViewGroup.getChildMeasureSpec(p6, ((((p4.getPaddingRight() + p4.getPaddingLeft()) + v0_1.leftMargin) + v0_1.rightMargin) + p7), v0_1.width), android.view.ViewGroup.getChildMeasureSpec(p8, (((p4.getPaddingBottom() + p4.getPaddingTop()) + v0_1.topMargin) + v0_1.bottomMargin), v0_1.height));
        return 1;
    }

    public final void q(android.view.View p1, android.os.Parcelable p2)
    {
        p1 = ((w3.d) p2).c;
        if ((p1 == 1) || (p1 == 2)) {
            p1 = 5;
        }
        this.h = p1;
        return;
    }

    public final android.os.Parcelable r(android.view.View p2)
    {
        return new w3.d(this);
    }

    public final boolean u(android.view.View p5, android.view.MotionEvent p6)
    {
        if (p5.isShown()) {
            int v0_5 = p6.getActionMasked();
            if ((this.h != 1) || (v0_5 != 0)) {
                if (this.x()) {
                    this.i.j(p6);
                }
                if (v0_5 == 0) {
                    y0.e v1_2 = this.s;
                    if (v1_2 != null) {
                        v1_2.recycle();
                        this.s = 0;
                    }
                }
                if (this.s == null) {
                    this.s = android.view.VelocityTracker.obtain();
                }
                this.s.addMovement(p6);
                if ((this.x()) && ((v0_5 == 2) && ((!this.j) && (this.x())))) {
                    y0.e v1_10 = this.i;
                    if (Math.abs((((float) this.u) - p6.getX())) > ((float) v1_10.b)) {
                        v1_10.b(p5, p6.getPointerId(p6.getActionIndex()));
                    }
                }
                return (this.j ^ 1);
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final void v(int p5)
    {
        if ((p5 != 1) && (p5 != 2)) {
            android.view.View v0_4 = this.p;
            if ((v0_4 != null) && (v0_4.get() != null)) {
                android.view.View v0_2 = ((android.view.View) this.p.get());
                g0.k v1_1 = new g0.k(this, p5, 5);
                boolean v5_1 = v0_2.getParent();
                if ((!v5_1) || ((!v5_1.isLayoutRequested()) || (!v0_2.isAttachedToWindow()))) {
                    v1_1.run();
                    return;
                } else {
                    v0_2.post(v1_1);
                    return;
                }
            } else {
                this.w(p5);
                return;
            }
        } else {
            boolean v5_4;
            int v2_2 = new StringBuilder("STATE_");
            if (p5 != 1) {
                v5_4 = "SETTLING";
            } else {
                v5_4 = "DRAGGING";
            }
            throw new IllegalArgumentException(v1.a.n(v2_2, v5_4, " should not be set externally."));
        }
    }

    public final void w(int p3)
    {
        if (this.h != p3) {
            this.h = p3;
            ClassCastException v3_4 = this.p;
            if (v3_4 != null) {
                ClassCastException v3_6 = ((android.view.View) v3_4.get());
                if (v3_6 != null) {
                    boolean v0_2;
                    if (this.h != 5) {
                        v0_2 = 0;
                    } else {
                        v0_2 = 4;
                    }
                    if (v3_6.getVisibility() != v0_2) {
                        v3_6.setVisibility(v0_2);
                    }
                    ClassCastException v3_2 = this.v.iterator();
                    if (v3_2.hasNext()) {
                        throw v1.a.e(v3_2);
                    } else {
                        this.z();
                        return;
                    }
                }
            }
        }
        return;
    }

    public final boolean x()
    {
        if ((this.i == null) || ((!this.g) && (this.h != 1))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void y(android.view.View p3, int p4, boolean p5)
    {
        int v0_2;
        if (p4 == 3) {
            v0_2 = this.a.a();
        } else {
            if (p4 != 5) {
                throw new IllegalArgumentException(g2.g.c(p4, "Invalid state to get outer edge offset: "));
            } else {
                v0_2 = this.a.b();
            }
        }
        y0.e v1 = this.i;
        if (v1 != null) {
            if (p5 == 0) {
                int v5_1 = p3.getTop();
                v1.r = p3;
                v1.c = -1;
                h3.e v3_4 = v1.h(v0_2, v5_1, 0, 0);
                if ((v3_4 == null) && ((v1.a == 0) && (v1.r != null))) {
                    v1.r = 0;
                }
                if (v3_4 == null) {
                    this.w(p4);
                    return;
                }
            } else {
                if (!v1.o(v0_2, p3.getTop())) {
                    this.w(p4);
                    return;
                }
            }
            this.w(2);
            this.e.a(p4);
            return;
        }
        this.w(p4);
        return;
    }

    public final void z()
    {
        android.view.View v0_0 = this.p;
        if (v0_0 != null) {
            android.view.View v0_2 = ((android.view.View) v0_0.get());
            if (v0_2 != null) {
                q0.q0.k(v0_2, 262144);
                q0.q0.i(v0_2, 0);
                q0.q0.k(v0_2, 1048576);
                q0.q0.i(v0_2, 0);
                if (this.h != 5) {
                    q0.q0.l(v0_2, r0.b.j, new w3.b(this, 5));
                }
                if (this.h != 3) {
                    q0.q0.l(v0_2, r0.b.h, new w3.b(this, 3));
                }
            }
        }
        return;
    }
}
