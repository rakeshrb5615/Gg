package com.google.android.material.bottomsheet;
public class BottomSheetBehavior extends b0.a implements r3.b {
    public final h3.e A;
    public final android.animation.ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public y0.e O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public ref.WeakReference W;
    public ref.WeakReference X;
    public final java.util.ArrayList Y;
    public android.view.VelocityTracker Z;
    public final int a;
    public r3.f a0;
    public boolean b;
    public int b0;
    public final float c;
    public int c0;
    public final int d;
    public boolean d0;
    public int e;
    public java.util.HashMap e0;
    public boolean f;
    public final android.util.SparseIntArray f0;
    public int g;
    public final h3.b g0;
    public final int h;
    public final v3.k i;
    public final android.content.res.ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final v3.p y;
    public boolean z;

    public BottomSheetBehavior()
    {
        this.a = 0;
        this.b = 1;
        this.k = -1;
        this.l = -1;
        this.A = new h3.e(this);
        this.F = 1056964608;
        this.H = -1082130432;
        this.K = 1;
        this.L = 1;
        this.N = 4;
        this.S = 1036831949;
        this.Y = new java.util.ArrayList();
        this.c0 = -1;
        this.f0 = new android.util.SparseIntArray();
        this.g0 = new h3.b(this, 0);
        return;
    }

    public BottomSheetBehavior(android.content.Context p13, android.util.AttributeSet p14)
    {
        this.a = 0;
        this.b = 1;
        this.k = -1;
        this.l = -1;
        this.A = new h3.e(this);
        this.F = 1056964608;
        this.H = -1082130432;
        this.K = 1;
        this.L = 1;
        this.N = 4;
        this.S = 1036831949;
        this.Y = new java.util.ArrayList();
        this.c0 = -1;
        this.f0 = new android.util.SparseIntArray();
        this.g0 = new h3.b(this, 0);
        this.h = p13.getResources().getDimensionPixelSize(2131166140);
        android.content.res.TypedArray v6_10 = p13.obtainStyledAttributes(p14, c3.a.a);
        int v7_0 = 3;
        if (v6_10.hasValue(3)) {
            this.j = j5.t1.v(p13, v6_10, 3);
        }
        if (v6_10.hasValue(22)) {
            this.y = v3.p.b(p13, p14, 2130968713, 2132018126).a();
        }
        boolean v14_29 = this.y;
        if (v14_29) {
            int v8_9 = new v3.k(v14_29);
            this.i = v8_9;
            v8_9.l(p13);
            boolean v14_30 = this.j;
            if (!v14_30) {
                boolean v14_32 = new android.util.TypedValue();
                p13.getTheme().resolveAttribute(16842801, v14_32, 1);
                this.i.setTint(v14_32.data);
            } else {
                this.i.o(v14_30);
            }
        }
        int v9_2 = new float[2];
        v9_2[0] = this.w();
        v9_2[1] = 1065353216;
        int v9_3 = android.animation.ValueAnimator.ofFloat(v9_2);
        this.B = v9_3;
        v9_3.setDuration(500);
        this.B.addUpdateListener(new a2.o(this, 1));
        this.H = v6_10.getDimension(2, -1082130432);
        if (v6_10.hasValue(0)) {
            this.k = v6_10.getDimensionPixelSize(0, -1);
        }
        if (v6_10.hasValue(1)) {
            this.l = v6_10.getDimensionPixelSize(1, -1);
        }
        int v8_0 = v6_10.peekValue(10);
        if (v8_0 == 0) {
            this.G(v6_10.getDimensionPixelSize(10, -1));
        } else {
            int v8_1 = v8_0.data;
            if (v8_1 != -1) {
            } else {
                this.G(v8_1);
            }
        }
        this.F(v6_10.getBoolean(9, 0));
        this.n = v6_10.getBoolean(14, 0);
        int v2_6 = v6_10.getBoolean(7, 1);
        if (this.b != v2_6) {
            this.b = v2_6;
            if (this.W != null) {
                this.v();
            }
            if ((!this.b) || (this.N != 6)) {
                v7_0 = this.N;
            }
            this.I(v7_0);
            this.M(this.N, 1);
            this.L();
        }
        this.J = v6_10.getBoolean(13, 0);
        this.K = v6_10.getBoolean(4, 1);
        this.L = v6_10.getBoolean(5, 1);
        this.a = v6_10.getInt(11, 0);
        int v2_19 = v6_10.getFloat(8, 1056964608);
        if ((v2_19 <= 0) || (v2_19 >= 1065353216)) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        } else {
            this.F = v2_19;
            if (this.W != null) {
                this.E = ((int) ((1065353216 - v2_19) * ((float) this.V)));
            }
            boolean v14_5 = v6_10.peekValue(6);
            if ((!v14_5) || (v14_5.type != 16)) {
                boolean v14_6 = v6_10.getDimensionPixelOffset(6, 0);
                if (v14_6) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                } else {
                    this.C = v14_6;
                    this.M(this.N, 1);
                }
            } else {
                boolean v14_8 = v14_5.data;
                if (v14_8) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                } else {
                    this.C = v14_8;
                    this.M(this.N, 1);
                }
            }
            this.d = v6_10.getInt(12, 500);
            this.o = v6_10.getBoolean(18, 0);
            this.p = v6_10.getBoolean(19, 0);
            this.q = v6_10.getBoolean(20, 0);
            this.r = v6_10.getBoolean(21, 1);
            this.s = v6_10.getBoolean(15, 0);
            this.t = v6_10.getBoolean(16, 0);
            this.u = v6_10.getBoolean(17, 0);
            this.x = v6_10.getBoolean(24, 1);
            v6_10.recycle();
            this.c = ((float) android.view.ViewConfiguration.get(p13).getScaledMaximumFlingVelocity());
            return;
        }
    }

    public static com.google.android.material.bottomsheet.BottomSheetBehavior A(android.view.View p1)
    {
        IllegalArgumentException v1_1 = p1.getLayoutParams();
        if (!(v1_1 instanceof b0.d)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        } else {
            IllegalArgumentException v1_8 = ((b0.d) v1_1).a;
            if (!(v1_8 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior)) {
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            } else {
                return ((com.google.android.material.bottomsheet.BottomSheetBehavior) v1_8);
            }
        }
    }

    public static int B(int p0, int p1, int p2, int p3)
    {
        int v0_1 = android.view.ViewGroup.getChildMeasureSpec(p0, p1, p3);
        if (p2 != -1) {
            int v1_2 = android.view.View$MeasureSpec.getMode(v0_1);
            int v0_6 = android.view.View$MeasureSpec.getSize(v0_1);
            if (v1_2 == 1073741824) {
                return android.view.View$MeasureSpec.makeMeasureSpec(Math.min(v0_6, p2), 1073741824);
            } else {
                if (v0_6 != 0) {
                    p2 = Math.min(v0_6, p2);
                }
                return android.view.View$MeasureSpec.makeMeasureSpec(p2, -2147483648);
            }
        } else {
            return v0_1;
        }
    }

    public static android.view.View z(android.view.View p3)
    {
        if (p3.getVisibility() == 0) {
            if (!p3.isNestedScrollingEnabled()) {
                if ((p3 instanceof android.view.ViewGroup)) {
                    int v0_1 = ((android.view.ViewGroup) p3).getChildCount();
                    int v1 = 0;
                    while (v1 < v0_1) {
                        android.view.View v2_1 = com.google.android.material.bottomsheet.BottomSheetBehavior.z(((android.view.ViewGroup) p3).getChildAt(v1));
                        if (v2_1 == null) {
                            v1++;
                        } else {
                            return v2_1;
                        }
                    }
                }
            } else {
                return p3;
            }
        }
        return 0;
    }

    public final int C()
    {
        if (!this.b) {
            int v0_3;
            if (!this.r) {
                v0_3 = this.w;
            } else {
                v0_3 = 0;
            }
            return Math.max(this.C, v0_3);
        } else {
            return this.D;
        }
    }

    public final int D(int p3)
    {
        if (p3 == 3) {
            return this.C();
        } else {
            if (p3 == 4) {
                return this.G;
            } else {
                if (p3 == 5) {
                    return this.V;
                } else {
                    if (p3 != 6) {
                        throw new IllegalArgumentException(g2.g.c(p3, "Invalid state to get top offset: "));
                    } else {
                        return this.E;
                    }
                }
            }
        }
    }

    public final boolean E()
    {
        int v0_0 = this.W;
        if ((v0_0 != 0) && (v0_0.get() != null)) {
            int v0_4 = new int[2];
            ((android.view.View) this.W.get()).getLocationOnScreen(v0_4);
            if (v0_4[1] == 0) {
                return 1;
            }
        }
        return 0;
    }

    public final void F(boolean p2)
    {
        if (this.I != p2) {
            this.I = p2;
            if ((p2 == 0) && (this.N == 5)) {
                this.H(4);
            }
            this.L();
        }
        return;
    }

    public final void G(int p2)
    {
        if (p2 != -1) {
            if ((!this.f) && (this.e == p2)) {
                return;
            } else {
                this.f = 0;
                this.e = Math.max(0, p2);
            }
        } else {
            if (this.f) {
                return;
            } else {
                this.f = 1;
            }
        }
        this.O();
        return;
    }

    public final void H(int p5)
    {
        if ((p5 != 1) && (p5 != 2)) {
            if ((this.I) || (p5 != 5)) {
                if ((p5 != 6) || ((!this.b) || (this.D(p5) > this.D))) {
                    boolean v0_3 = p5;
                } else {
                    v0_3 = 3;
                }
                h3.a v1_1 = this.W;
                if ((v1_1 != null) && (v1_1.get() != null)) {
                    android.view.View v5_3 = ((android.view.View) this.W.get());
                    h3.a v1_5 = new h3.a(this, v5_3, v0_3);
                    boolean v0_4 = v5_3.getParent();
                    if ((!v0_4) || ((!v0_4.isLayoutRequested()) || (!v5_3.isAttachedToWindow()))) {
                        v1_5.run();
                        return;
                    } else {
                        v5_3.post(v1_5);
                        return;
                    }
                } else {
                    this.I(p5);
                    return;
                }
            } else {
                boolean v0_9 = new StringBuilder("Cannot set state: ");
                v0_9.append(p5);
                android.util.Log.w("BottomSheetBehavior", v0_9.toString());
                return;
            }
        } else {
            android.view.View v5_5;
            StringBuilder v2_1 = new StringBuilder("STATE_");
            if (p5 != 1) {
                v5_5 = "SETTLING";
            } else {
                v5_5 = "DRAGGING";
            }
            throw new IllegalArgumentException(v1.a.n(v2_1, v5_5, " should not be set externally."));
        }
    }

    public final void I(int p8)
    {
        if (this.N != p8) {
            this.N = p8;
            // Both branches of the condition point to the same code.
            // if ((p8 != 4) && ((p8 != 3) && (p8 == 6))) {
                boolean v4_0 = this.W;
                if (v4_0) {
                    boolean v4_2 = ((android.view.View) v4_0.get());
                    if (v4_2) {
                        int v5 = 0;
                        if (p8 != 3) {
                            if ((p8 == 6) || ((p8 == 5) || (p8 == 4))) {
                                this.N(0);
                            }
                        } else {
                            this.N(1);
                        }
                        this.M(p8, 1);
                        while(true) {
                            h3.c v0_1 = this.Y;
                            if (v5 >= v0_1.size()) {
                                break;
                            }
                            ((h3.c) v0_1.get(v5)).c(v4_2, p8);
                            v5++;
                        }
                        this.L();
                        return;
                    }
                }
            // }
        }
        return;
    }

    public final boolean J(android.view.View p5, float p6)
    {
        if (!this.J) {
            if (p5.getTop() >= this.G) {
                if ((Math.abs((((p6 * this.S) + ((float) p5.getTop())) - ((float) this.G))) / ((float) this.x())) <= 1056964608) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final void K(android.view.View p3, int p4, boolean p5)
    {
        int v0 = this.D(p4);
        y0.e v1 = this.O;
        if (v1 != null) {
            if (p5 == 0) {
                int v5_4 = p3.getLeft();
                v1.r = p3;
                v1.c = -1;
                h3.e v3_2 = v1.h(v5_4, v0, 0, 0);
                if ((v3_2 == null) && ((v1.a == 0) && (v1.r != null))) {
                    v1.r = 0;
                }
                if (v3_2 == null) {
                    this.I(p4);
                    return;
                }
            } else {
                if (!v1.o(p3.getLeft(), v0)) {
                    this.I(p4);
                    return;
                }
            }
            this.I(2);
            this.M(p4, 1);
            this.A.a(p4);
            return;
        }
        this.I(p4);
        return;
    }

    public final void L()
    {
        android.view.View v0_0 = this.W;
        if (v0_0 != null) {
            android.view.View v0_2 = ((android.view.View) v0_0.get());
            if (v0_2 != null) {
                q0.q0.k(v0_2, 524288);
                q0.q0.i(v0_2, 0);
                q0.q0.k(v0_2, 262144);
                q0.q0.i(v0_2, 0);
                q0.q0.k(v0_2, 1048576);
                q0.q0.i(v0_2, 0);
                h.f v2_10 = this.f0;
                q0.b v4_4 = v2_10.get(0, -1);
                if (v4_4 != -1) {
                    q0.q0.k(v0_2, v4_4);
                    q0.q0.i(v0_2, 0);
                    v2_10.delete(0);
                }
                int v5_0 = 6;
                if ((!this.b) && (this.N != 6)) {
                    String v10 = v0_2.getResources().getString(2131951710);
                    h.f v11_1 = new h.f(this, 6, 1);
                    q0.b v4_9 = q0.q0.g(v0_2);
                    int v6_1 = 0;
                    while (v6_1 < v4_9.size()) {
                        if (!android.text.TextUtils.equals(v10, ((android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction) ((r0.b) v4_9.get(v6_1)).a).getLabel())) {
                            v6_1++;
                        } else {
                            int v9_1 = ((r0.b) v4_9.get(v6_1)).a();
                        }
                        if (v9_1 != -1) {
                            java.util.ArrayList v3_1;
                            int v7_9 = new r0.b(0, v9_1, v10, v11_1, 0);
                            java.util.ArrayList v3_11 = q0.q0.e(v0_2);
                            if (v3_11 != null) {
                                if (!(v3_11 instanceof q0.a)) {
                                    v3_1 = new q0.b(v3_11);
                                } else {
                                    v3_1 = ((q0.a) v3_11).a;
                                }
                            } else {
                                v3_1 = 0;
                            }
                            if (v3_1 == null) {
                                v3_1 = new q0.b();
                            }
                            q0.q0.n(v0_2, v3_1);
                            q0.q0.k(v0_2, v7_9.a());
                            q0.q0.g(v0_2).add(v7_9);
                            q0.q0.i(v0_2, 0);
                        }
                        v2_10.put(0, v9_1);
                    }
                    int v7_1 = 0;
                    int v6_2 = -1;
                    while ((v7_1 < 32) && (v6_2 == -1)) {
                        int v8_1 = q0.q0.d[v7_1];
                        int v12_0 = 0;
                        int v13 = 1;
                        while (v12_0 < v4_9.size()) {
                            r0.b v14_4;
                            if (((r0.b) v4_9.get(v12_0)).a() == v8_1) {
                                v14_4 = 0;
                            } else {
                                v14_4 = 1;
                            }
                            v13 &= v14_4;
                            v12_0++;
                        }
                        if (v13 != 0) {
                            v6_2 = v8_1;
                        }
                        v7_1++;
                    }
                    v9_1 = v6_2;
                }
                if ((this.I) && (this.N != 5)) {
                    q0.q0.l(v0_2, r0.b.j, new h.f(this, 5, 1));
                }
                r0.b v1_3 = this.N;
                if (v1_3 == 3) {
                    if (this.b) {
                        v5_0 = 4;
                    }
                    q0.q0.l(v0_2, r0.b.i, new h.f(this, v5_0, 1));
                } else {
                    if (v1_3 == 4) {
                        if (this.b) {
                            v5_0 = 3;
                        }
                        q0.q0.l(v0_2, r0.b.h, new h.f(this, v5_0, 1));
                        return;
                    } else {
                        if (v1_3 == 6) {
                            q0.q0.l(v0_2, r0.b.i, new h.f(this, 4, 1));
                            q0.q0.l(v0_2, r0.b.h, new h.f(this, 3, 1));
                            return;
                        }
                    }
                }
            }
        }
        return;
    }

    public final void M(int p7, boolean p8)
    {
        if (p7 != 2) {
            if ((this.N != 3) || ((!this.x) && (!this.E()))) {
                float[] v7_2 = 0;
            } else {
                v7_2 = 1;
            }
            if (this.z != v7_2) {
                v3.k v1_1 = this.i;
                if (v1_1 != null) {
                    this.z = v7_2;
                    android.animation.ValueAnimator v4 = this.B;
                    float v5 = 1065353216;
                    if ((p8 == 0) || (v4 == null)) {
                        if ((v4 != null) && (v4.isRunning())) {
                            v4.cancel();
                        }
                        if (this.z) {
                            v5 = this.w();
                        }
                        float[] v7_6 = v1_1.b;
                        if (v7_6.j != v5) {
                            v7_6.j = v5;
                            v1_1.f = 1;
                            v1_1.m = 1;
                            v1_1.invalidateSelf();
                        }
                    } else {
                        if (!v4.isRunning()) {
                            float v8_5 = v1_1.b.j;
                            if (v7_2 != null) {
                                v5 = this.w();
                            }
                            float[] v7_7 = new float[2];
                            v7_7[0] = v8_5;
                            v7_7[1] = v5;
                            v4.setFloatValues(v7_7);
                            v4.start();
                            return;
                        } else {
                            v4.reverse();
                            return;
                        }
                    }
                }
            }
        }
        return;
    }

    public final void N(boolean p7)
    {
        androidx.coordinatorlayout.widget.CoordinatorLayout v0_0 = this.W;
        if (v0_0 != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout v0_3 = ((android.view.View) v0_0.get()).getParent();
            if ((v0_3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout)) {
                androidx.coordinatorlayout.widget.CoordinatorLayout v0_4 = ((androidx.coordinatorlayout.widget.CoordinatorLayout) v0_3);
                int v1_0 = v0_4.getChildCount();
                if (p7 != 0) {
                    if (this.e0 != null) {
                        return;
                    } else {
                        this.e0 = new java.util.HashMap(v1_0);
                    }
                }
                int v2_3 = 0;
                while (v2_3 < v1_0) {
                    android.view.View v3 = v0_4.getChildAt(v2_3);
                    if ((v3 != this.W.get()) && (p7 != 0)) {
                        this.e0.put(v3, Integer.valueOf(v3.getImportantForAccessibility()));
                    }
                    v2_3++;
                }
                if (p7 == 0) {
                    this.e0 = 0;
                }
            }
        }
        return;
    }

    public final void O()
    {
        if (this.W != null) {
            this.v();
            if (this.N == 4) {
                android.view.View v0_4 = ((android.view.View) this.W.get());
                if (v0_4 != null) {
                    v0_4.requestLayout();
                }
            }
        }
        return;
    }

    public final void a()
    {
        android.animation.AnimatorSet v0_0 = this.a0;
        if (v0_0 != null) {
            long v1_2 = v0_0.d;
            int v2_0 = v0_0.c;
            float v3_0 = v0_0.f;
            v0_0.f = 0;
            android.animation.ObjectAnimator v4_3 = 4;
            if (v3_0 != 0) {
                float v3_1 = v3_0.c;
                if (android.os.Build$VERSION.SDK_INT >= 34) {
                    if (!this.I) {
                        android.animation.AnimatorSet v0_1 = v0_0.a();
                        v0_1.setDuration(((long) d3.a.c(v2_0, v1_2, v3_1)));
                        v0_1.start();
                        this.H(4);
                        return;
                    } else {
                        f2.o v5_3 = new f2.o(this, 4);
                        android.animation.ObjectAnimator v4_0 = v0_0.b;
                        float[] v9 = new float[1];
                        v9[0] = (v4_0.getScaleY() * ((float) v4_0.getHeight()));
                        android.animation.ObjectAnimator v4_1 = android.animation.ObjectAnimator.ofFloat(v4_0, android.view.View.TRANSLATION_Y, v9);
                        v4_1.setInterpolator(new l1.a(1));
                        v4_1.setDuration(((long) d3.a.c(v2_0, v1_2, v3_1)));
                        v4_1.addListener(new f2.o(v0_0, 7));
                        v4_1.addListener(v5_3);
                        v4_1.start();
                        return;
                    }
                }
            }
            if (this.I) {
                v4_3 = 5;
            }
            this.H(v4_3);
            return;
        } else {
            return;
        }
    }

    public final void b(c.a p4)
    {
        r3.f v0 = this.a0;
        if (v0 != null) {
            if (v0.f == null) {
                android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            c.a v1_2 = v0.f;
            v0.f = p4;
            if (v1_2 != null) {
                v0.b(p4.c);
                return;
            }
        }
        return;
    }

    public final void c(c.a p2)
    {
        r3.f v0 = this.a0;
        if (v0 != null) {
            v0.f = p2;
            return;
        } else {
            return;
        }
    }

    public final void d()
    {
        int v0_0 = this.a0;
        if (v0_0 != 0) {
            if (v0_0.f == null) {
                android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            android.animation.AnimatorSet v1_3 = v0_0.f;
            v0_0.f = 0;
            if (v1_3 != null) {
                android.animation.AnimatorSet v1_0 = v0_0.a();
                v1_0.setDuration(((long) v0_0.e));
                v1_0.start();
                return;
            }
        }
        return;
    }

    public final void g(b0.d p1)
    {
        this.W = 0;
        this.O = 0;
        this.a0 = 0;
        return;
    }

    public final void i()
    {
        this.W = 0;
        this.O = 0;
        this.a0 = 0;
        return;
    }

    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout p10, android.view.View p11, android.view.MotionEvent p12)
    {
        if ((p11.isShown()) && (this.K)) {
            int v0_2 = p12.getActionMasked();
            android.view.View v3_1 = 0;
            if (v0_2 == 0) {
                this.b0 = -1;
                this.c0 = -1;
                int v5_0 = this.Z;
                if (v5_0 != 0) {
                    v5_0.recycle();
                    this.Z = 0;
                }
            }
            if (this.Z == null) {
                this.Z = android.view.VelocityTracker.obtain();
            }
            this.Z.addMovement(p12);
            if (v0_2 == 0) {
                int v6_1 = ((int) p12.getX());
                int v7_1 = ((int) p12.getY());
                this.c0 = v7_1;
                if (this.N != 2) {
                    int v8_2;
                    int v8_1 = this.X;
                    if (v8_1 == 0) {
                        v8_2 = 0;
                    } else {
                        v8_2 = ((android.view.View) v8_1.get());
                    }
                    if ((v8_2 != 0) && (p10.o(v8_2, v6_1, v7_1))) {
                        this.b0 = p12.getPointerId(p12.getActionIndex());
                        this.d0 = 1;
                    }
                }
                if ((this.b0 != -1) || (p10.o(p11, v6_1, this.c0))) {
                    float v11_6 = 0;
                } else {
                    v11_6 = 1;
                }
                this.P = v11_6;
            } else {
                if ((v0_2 == 1) || (v0_2 == 3)) {
                    this.d0 = 0;
                    this.b0 = -1;
                    if (this.P) {
                        this.P = 0;
                        return 0;
                    }
                }
            }
            if (this.P) {
                float v11_12 = this.X;
                if (v11_12 != 0) {
                    v3_1 = ((android.view.View) v11_12.get());
                }
                if ((v0_2 == 2) && ((v3_1 != null) && ((!this.P) && ((this.N != 1) && ((!p10.o(v3_1, ((int) p12.getX()), ((int) p12.getY()))) && (this.O != null)))))) {
                    float v10_1 = this.c0;
                    if ((v10_1 != -1) && (Math.abs((((float) v10_1) - p12.getY())) > ((float) this.O.b))) {
                        return 1;
                    }
                }
                return 0;
            } else {
                float v11_10 = this.O;
                if ((v11_10 == 0) || (!v11_10.p(p12))) {
                }
            }
            return 1;
        } else {
            this.P = 1;
            return 0;
        }
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p10, android.view.View p11, int p12)
    {
        if ((p10.getFitsSystemWindows()) && (!p11.getFitsSystemWindows())) {
            p11.setFitsSystemWindows(1);
        }
        int v3 = 0;
        if (this.W == null) {
            float v4_9;
            this.g = p10.getResources().getDimensionPixelSize(2131165299);
            int v0_8 = android.os.Build$VERSION.SDK_INT;
            if ((v0_8 < 29) || ((this.n) || (this.f))) {
                v4_9 = 0;
            } else {
                v4_9 = 1;
            }
            if ((this.o) || ((this.p) || ((this.q) || ((this.s) || ((this.t) || ((this.u) || (v4_9 != 0))))))) {
                float v5_10 = new i2.m(this, v4_9);
                n0.a v6_1 = p11.getPaddingStart();
                p11.getPaddingTop();
                int v7_0 = p11.getPaddingEnd();
                int v8 = p11.getPaddingBottom();
                float v4_11 = new q3.m();
                v4_11.a = v6_1;
                v4_11.b = v7_0;
                v4_11.c = v8;
                q0.i0.j(p11, new n0.a(7, v5_10, v4_11));
                if (!p11.isAttachedToWindow()) {
                    p11.addOnAttachStateChangeListener(new q3.l());
                } else {
                    p11.requestApplyInsets();
                }
            }
            float v4_16 = new h3.k();
            float v5_11 = new int[2];
            v4_16.e = v5_11;
            v4_16.d = p11;
            if (v0_8 < 30) {
                int v0_12 = new q0.w0(p11, v4_16);
                p11.setTag(2131362489, v0_12);
                if ((p11.getTag(2131362479) == null) && (p11.getTag(2131362480) == null)) {
                    p11.setOnApplyWindowInsetsListener(v0_12);
                }
            } else {
                q0.a1.g(p11, v4_16);
            }
            this.W = new ref.WeakReference(p11);
            this.a0 = new r3.f(p11);
            int v0_18 = this.i;
            if (v0_18 == 0) {
                int v0_19 = this.j;
                if (v0_19 != 0) {
                    q0.i0.g(p11, v0_19);
                }
            } else {
                p11.setBackground(v0_18);
                float v5_0 = this.H;
                if (v5_0 == -1082130432) {
                    v5_0 = p11.getElevation();
                }
                v0_18.n(v5_0);
            }
            this.L();
            if (p11.getImportantForAccessibility() == 0) {
                p11.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new y0.e(p10.getContext(), p10, this.g0);
        }
        int v0_5 = p11.getTop();
        p10.q(p11, p12);
        this.U = p10.getWidth();
        this.V = p10.getHeight();
        java.util.WeakHashMap v10_2 = p11.getHeight();
        this.T = v10_2;
        java.util.WeakHashMap v12_2 = this.V;
        float v4_3 = this.w;
        if ((v12_2 - v10_2) < v4_3) {
            float v5_2 = this.l;
            if (!this.r) {
                java.util.WeakHashMap v12_3 = (v12_2 - v4_3);
                if (v5_2 != -1) {
                    v12_3 = Math.min(v12_3, v5_2);
                }
                this.T = v12_3;
            } else {
                if (v5_2 != -1) {
                    v12_2 = Math.min(v12_2, v5_2);
                }
                this.T = v12_2;
            }
        }
        this.D = Math.max(0, (this.V - this.T));
        this.E = ((int) ((1065353216 - this.F) * ((float) this.V)));
        this.v();
        java.util.WeakHashMap v10_11 = this.N;
        if (v10_11 != 3) {
            if (v10_11 != 6) {
                if ((!this.I) || (v10_11 != 5)) {
                    if (v10_11 != 4) {
                        if ((v10_11 == 1) || (v10_11 == 2)) {
                            p11.offsetTopAndBottom((v0_5 - p11.getTop()));
                        }
                    } else {
                        p11.offsetTopAndBottom(this.G);
                    }
                } else {
                    p11.offsetTopAndBottom(this.V);
                }
            } else {
                p11.offsetTopAndBottom(this.E);
            }
        } else {
            p11.offsetTopAndBottom(this.C());
        }
        this.M(this.N, 0);
        this.X = new ref.WeakReference(com.google.android.material.bottomsheet.BottomSheetBehavior.z(p11));
        while(true) {
            java.util.WeakHashMap v10_20 = this.Y;
            if (v3 >= v10_20.size()) {
                break;
            }
            ((h3.c) v10_20.get(v3)).a(p11);
            v3++;
        }
        return 1;
    }

    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout p4, android.view.View p5, int p6, int p7, int p8)
    {
        int v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p5.getLayoutParams());
        p5.measure(com.google.android.material.bottomsheet.BottomSheetBehavior.B(p6, ((((p4.getPaddingRight() + p4.getPaddingLeft()) + v0_1.leftMargin) + v0_1.rightMargin) + p7), this.k, v0_1.width), com.google.android.material.bottomsheet.BottomSheetBehavior.B(p8, (((p4.getPaddingBottom() + p4.getPaddingTop()) + v0_1.topMargin) + v0_1.bottomMargin), this.l, v0_1.height));
        return 1;
    }

    public final boolean m(android.view.View p2)
    {
        int v0_0 = this.X;
        if ((v0_0 != 0) && ((p2 == v0_0.get()) && ((this.N != 3) && (!this.M)))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final void n(androidx.coordinatorlayout.widget.CoordinatorLayout p6, android.view.View p7, android.view.View p8, int p9, int p10, int[] p11, int p12)
    {
        if (p12 != 1) {
            java.util.WeakHashMap v9_2;
            java.util.WeakHashMap v9_0 = this.X;
            if (v9_0 == null) {
                v9_2 = 0;
            } else {
                v9_2 = ((android.view.View) v9_0.get());
            }
            if (p8 == v9_2) {
                int v12_1 = p7.getTop();
                int v0 = (v12_1 - p10);
                boolean v1 = this.K;
                boolean v2 = this.L;
                if (p10 <= 0) {
                    if (p10 < 0) {
                        boolean v3_1 = p8.canScrollVertically(-1);
                        if ((this.R) || ((v2) || ((p8 != v9_2) || (!v3_1)))) {
                            if (!v3_1) {
                                int v8_1 = this.G;
                                if ((v0 > v8_1) && (!this.I)) {
                                    int v12_2 = (v12_1 - v8_1);
                                    p11[1] = v12_2;
                                    p7.offsetTopAndBottom((- v12_2));
                                    this.I(4);
                                } else {
                                    if (v1) {
                                        p11[1] = p10;
                                        p7.offsetTopAndBottom((- p10));
                                        this.I(1);
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } else {
                            this.M = 1;
                            return;
                        }
                    }
                } else {
                    if ((this.R) || ((v2) || ((p8 != v9_2) || (!p8.canScrollVertically(1))))) {
                        if (v0 >= this.C()) {
                            if (v1) {
                                p11[1] = p10;
                                p7.offsetTopAndBottom((- p10));
                                this.I(1);
                            }
                        } else {
                            int v12_3 = (v12_1 - this.C());
                            p11[1] = v12_3;
                            p7.offsetTopAndBottom((- v12_3));
                            this.I(3);
                        }
                    } else {
                        this.M = 1;
                        return;
                    }
                }
                this.y(p7.getTop());
                this.Q = p10;
                this.R = 1;
                this.M = 0;
                return;
            }
        }
        return;
    }

    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3, int p4, int p5, int[] p6)
    {
        return;
    }

    public final void q(android.view.View p6, android.os.Parcelable p7)
    {
        boolean v2_2 = this.a;
        if (v2_2) {
            if ((v2_2 == -1) || ((v2_2 & 1) == 1)) {
                this.e = ((h3.d) p7).d;
            }
            if ((v2_2 == -1) || ((v2_2 & 2) == 2)) {
                this.b = ((h3.d) p7).e;
            }
            if ((v2_2 == -1) || ((v2_2 & 4) == 4)) {
                this.I = ((h3.d) p7).f;
            }
            if ((v2_2 == -1) || ((v2_2 & 8) == 8)) {
                this.J = ((h3.d) p7).m;
            }
        }
        int v7_2 = ((h3.d) p7).c;
        if ((v7_2 != 1) && (v7_2 != 2)) {
            this.N = v7_2;
            return;
        } else {
            this.N = 4;
            return;
        }
    }

    public final android.os.Parcelable r(android.view.View p2)
    {
        return new h3.d(this);
    }

    public final boolean s(android.view.View p1, int p2, int p3)
    {
        p1 = 0;
        this.Q = 0;
        this.R = 0;
        if ((p2 & 2) != 0) {
            p1 = 1;
        }
        return p1;
    }

    public final void t(android.view.View p4, android.view.View p5, int p6)
    {
        int v1_2 = 3;
        if (p4.getTop() != this.C()) {
            int v6_2 = this.X;
            if ((v6_2 != 0) && ((p5 == v6_2.get()) && (this.R))) {
                if (this.Q <= 0) {
                    if (this.I) {
                        int v5_6;
                        int v5_4 = this.Z;
                        if (v5_4 != 0) {
                            v5_4.computeCurrentVelocity(1000, this.c);
                            v5_6 = this.Z.getYVelocity(this.b0);
                        } else {
                            v5_6 = 0;
                        }
                        if (this.J(p4, v5_6)) {
                            v1_2 = 5;
                            this.K(p4, v1_2, 0);
                            this.R = 0;
                            return;
                        }
                    }
                    if (this.Q != 0) {
                        if (!this.b) {
                            int v5_10 = p4.getTop();
                            if (Math.abs((v5_10 - this.E)) < Math.abs((v5_10 - this.G))) {
                                v1_2 = 6;
                            }
                        }
                    } else {
                        int v5_13 = p4.getTop();
                        if (!this.b) {
                            int v2_3 = this.E;
                            if (v5_13 >= v2_3) {
                                if (Math.abs((v5_13 - v2_3)) < Math.abs((v5_13 - this.G))) {
                                }
                            } else {
                                if (v5_13 >= Math.abs((v5_13 - this.G))) {
                                }
                            }
                        } else {
                            if (Math.abs((v5_13 - this.D)) < Math.abs((v5_13 - this.G))) {
                            }
                        }
                    }
                    v1_2 = 4;
                } else {
                    if ((!this.b) && (p4.getTop() > this.E)) {
                    }
                }
            }
            return;
        } else {
            this.I(3);
            return;
        }
    }

    public final boolean u(android.view.View p6, android.view.MotionEvent p7)
    {
        if (p6.isShown()) {
            int v0_2 = p7.getActionMasked();
            y0.e v1_12 = this.N;
            if ((v1_12 != 1) || (v0_2 != 0)) {
                float v3_2 = this.O;
                if ((v3_2 != 0) && ((this.K) || (v1_12 == 1))) {
                    v3_2.j(p7);
                }
                if (v0_2 == 0) {
                    this.b0 = -1;
                    this.c0 = -1;
                    y0.e v1_1 = this.Z;
                    if (v1_1 != null) {
                        v1_1.recycle();
                        this.Z = 0;
                    }
                }
                if (this.Z == null) {
                    this.Z = android.view.VelocityTracker.obtain();
                }
                this.Z.addMovement(p7);
                if (((this.O != null) && ((this.K) || (this.N == 1))) && ((v0_2 == 2) && (!this.P))) {
                    y0.e v1_11 = this.O;
                    if (Math.abs((((float) this.c0) - p7.getY())) > ((float) v1_11.b)) {
                        v1_11.b(p6, p7.getPointerId(p7.getActionIndex()));
                    }
                }
                return (this.P ^ 1);
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final void v()
    {
        int v0_0 = this.x();
        if (!this.b) {
            this.G = (this.V - v0_0);
            return;
        } else {
            this.G = Math.max((this.V - v0_0), this.D);
            return;
        }
    }

    public final float w()
    {
        float v1 = 0;
        if (this.i != null) {
            float v0_5 = this.W;
            if ((v0_5 != 0) && ((v0_5.get() != null) && ((android.os.Build$VERSION.SDK_INT >= 31) && (this.E())))) {
                float v0_4 = ((android.view.View) this.W.get()).getRootWindowInsets();
                if (v0_4 != 0) {
                    float v2_3;
                    float v2_1 = this.i;
                    float v3_0 = v2_1.H;
                    if (v3_0 == 0) {
                        v2_3 = v2_1.b.a.e.a(v2_1.h());
                    } else {
                        v2_3 = v3_0[3];
                    }
                    float v4_3;
                    float v4_0 = v0_4.getRoundedCorner(0);
                    if (v4_0 == 0) {
                        v4_3 = 0;
                    } else {
                        float v4_2 = ((float) v4_0.getRadius());
                        if ((v4_2 <= 0) || (v2_3 <= 0)) {
                        } else {
                            v4_3 = (v4_2 / v2_3);
                        }
                    }
                    float v2_7;
                    float v2_5 = this.i;
                    float[] v5_2 = v2_5.H;
                    if (v5_2 == null) {
                        v2_7 = v2_5.b.a.f.a(v2_5.h());
                    } else {
                        v2_7 = v5_2[0];
                    }
                    float v0_7 = v0_4.getRoundedCorner(1);
                    if (v0_7 != 0) {
                        float v0_9 = ((float) v0_7.getRadius());
                        if ((v0_9 > 0) && (v2_7 > 0)) {
                            v1 = (v0_9 / v2_7);
                        }
                    }
                    return Math.max(v4_3, v1);
                }
            }
        }
        return 0;
    }

    public final int x()
    {
        if (!this.f) {
            if ((!this.n) && (!this.o)) {
                int v0_10 = this.m;
                if (v0_10 > 0) {
                    return Math.max(this.e, (v0_10 + this.h));
                }
            }
            return (this.e + this.v);
        } else {
            return (Math.min(Math.max(this.g, (this.V - ((this.U * 9) / 16))), this.T) + this.v);
        }
    }

    public final void y(int p4)
    {
        android.view.View v0_2 = ((android.view.View) this.W.get());
        if (v0_2 != null) {
            java.util.ArrayList v1 = this.Y;
            if (!v1.isEmpty()) {
                h3.c v2_4 = this.G;
                if ((p4 <= v2_4) && (v2_4 != this.C())) {
                    this.C();
                }
                int v4_2 = 0;
                while (v4_2 < v1.size()) {
                    ((h3.c) v1.get(v4_2)).b(v0_2);
                    v4_2++;
                }
            }
        }
        return;
    }
}
