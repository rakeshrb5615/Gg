package androidx.recyclerview.widget;
public class RecyclerView extends android.view.ViewGroup {
    public static boolean F0 = False;
    public static boolean G0 = False;
    public static final int[] H0;
    public static final float I0;
    public static final boolean J0;
    public static final boolean K0;
    public static final Class[] L0;
    public static final a2.g0 M0;
    public static final a2.h1 N0;
    public int A;
    public int A0;
    public boolean B;
    public int B0;
    public boolean C;
    public final boolean C0;
    public boolean D;
    public final a2.h0 D0;
    public int E;
    public final q0.h E0;
    public final android.view.accessibility.AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public a2.n0 K;
    public android.widget.EdgeEffect L;
    public android.widget.EdgeEffect M;
    public android.widget.EdgeEffect N;
    public android.widget.EdgeEffect O;
    public a2.p0 P;
    public int Q;
    public int R;
    public android.view.VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final float a;
    public int a0;
    public final a2.b1 b;
    public a2.v0 b0;
    public final a2.z0 c;
    public final int c0;
    public a2.d1 d;
    public final int d0;
    public final a2.b e;
    public final float e0;
    public final a2.d f;
    public final float f0;
    public boolean g0;
    public final a2.j1 h0;
    public a2.t i0;
    public final a2.r j0;
    public final a2.g1 k0;
    public a2.w0 l0;
    public final k2.c m;
    public java.util.ArrayList m0;
    public boolean n;
    public boolean n0;
    public final android.graphics.Rect o;
    public boolean o0;
    public final android.graphics.Rect p;
    public final a2.h0 p0;
    public final android.graphics.RectF q;
    public boolean q0;
    public a2.i0 r;
    public a2.m1 r0;
    public a2.t0 s;
    public final int[] s0;
    public final java.util.ArrayList t;
    public q0.q t0;
    public final java.util.ArrayList u;
    public final int[] u0;
    public final java.util.ArrayList v;
    public final int[] v0;
    public a2.p w;
    public final int[] w0;
    public boolean x;
    public final java.util.ArrayList x0;
    public boolean y;
    public final a2.l y0;
    public boolean z;
    public boolean z0;

    static RecyclerView()
    {
        androidx.recyclerview.widget.RecyclerView.H0 = new int[] {16843830});
        androidx.recyclerview.widget.RecyclerView.I0 = ((float) (Math.log(4605200834963974390) / Math.log(4606281698874543309)));
        androidx.recyclerview.widget.RecyclerView.J0 = 1;
        androidx.recyclerview.widget.RecyclerView.K0 = 1;
        androidx.recyclerview.widget.RecyclerView.L0 = new Class[] {android.content.Context, android.util.AttributeSet, Integer.TYPE, Integer.TYPE});
        androidx.recyclerview.widget.RecyclerView.M0 = new a2.g0(0);
        androidx.recyclerview.widget.RecyclerView.N0 = new a2.h1();
        return;
    }

    public RecyclerView(android.content.Context p2, android.util.AttributeSet p3)
    {
        this(p2, p3, 2130969672);
        return;
    }

    public RecyclerView(android.content.Context p21, android.util.AttributeSet p22, int p23)
    {
        String v3_1;
        super(p21, p22, p23);
        super.b = new a2.b1(super);
        super.c = new a2.z0(super);
        super.m = new k2.c(4);
        super.o = new android.graphics.Rect();
        super.p = new android.graphics.Rect();
        super.q = new android.graphics.RectF();
        super.t = new java.util.ArrayList();
        super.u = new java.util.ArrayList();
        super.v = new java.util.ArrayList();
        super.A = 0;
        super.G = 0;
        super.H = 0;
        super.I = 0;
        super.J = 0;
        super.K = androidx.recyclerview.widget.RecyclerView.N0;
        NoSuchMethodException v0_40 = new a2.k();
        v0_40.a = 0;
        v0_40.b = new java.util.ArrayList();
        v0_40.c = 120;
        v0_40.d = 120;
        v0_40.e = 250;
        v0_40.f = 250;
        v0_40.g = 1;
        v0_40.h = new java.util.ArrayList();
        v0_40.i = new java.util.ArrayList();
        v0_40.j = new java.util.ArrayList();
        v0_40.k = new java.util.ArrayList();
        v0_40.l = new java.util.ArrayList();
        v0_40.m = new java.util.ArrayList();
        v0_40.n = new java.util.ArrayList();
        v0_40.o = new java.util.ArrayList();
        v0_40.p = new java.util.ArrayList();
        v0_40.q = new java.util.ArrayList();
        v0_40.r = new java.util.ArrayList();
        super.P = v0_40;
        super.Q = 0;
        super.R = -1;
        super.e0 = 1;
        super.f0 = 1;
        super.g0 = 1;
        super.h0 = new a2.j1(super);
        if (!androidx.recyclerview.widget.RecyclerView.K0) {
            v3_1 = 0;
        } else {
            v3_1 = new a2.r();
        }
        String v5_21;
        super.j0 = v3_1;
        String v3_4 = new a2.g1();
        v3_4.a = -1;
        v3_4.b = 0;
        v3_4.c = 0;
        v3_4.d = 1;
        v3_4.e = 0;
        v3_4.f = 0;
        v3_4.g = 0;
        v3_4.h = 0;
        v3_4.i = 0;
        v3_4.j = 0;
        v3_4.k = 0;
        super.k0 = v3_4;
        super.n0 = 0;
        super.o0 = 0;
        String v3_6 = new a2.h0(super);
        super.p0 = v3_6;
        super.q0 = 0;
        String v5_0 = new int[2];
        super.s0 = v5_0;
        String v5_1 = new int[2];
        super.u0 = v5_1;
        String v5_2 = new int[2];
        super.v0 = v5_2;
        String v5_3 = new int[2];
        super.w0 = v5_3;
        super.x0 = new java.util.ArrayList();
        super.y0 = new a2.l(super, 1);
        super.A0 = 0;
        super.B0 = 0;
        super.D0 = new a2.h0(super);
        super.E0 = new q0.h(super.getContext(), new a2.h0(super));
        super.setScrollContainer(1);
        super.setFocusableInTouchMode(1);
        String v5_12 = android.view.ViewConfiguration.get(p21);
        super.a0 = v5_12.getScaledTouchSlop();
        super.e0 = v5_12.getScaledHorizontalScrollFactor();
        super.f0 = v5_12.getScaledVerticalScrollFactor();
        super.c0 = v5_12.getScaledMinimumFlingVelocity();
        super.d0 = v5_12.getScaledMaximumFlingVelocity();
        super.a = (((p21.getResources().getDisplayMetrics().density * 1126170624) * 1136724797) * 1062668861);
        if (super.getOverScrollMode() != 2) {
            v5_21 = 0;
        } else {
            v5_21 = 1;
        }
        super.setWillNotDraw(v5_21);
        super.P.a = v3_6;
        super.e = new a2.b(new a2.h0(super));
        super.f = new a2.d(new a2.h0(super));
        if (q0.k0.a(super) == 0) {
            q0.k0.b(super, 8);
        }
        if (super.getImportantForAccessibility() == 0) {
            super.setImportantForAccessibility(1);
        }
        super.F = ((android.view.accessibility.AccessibilityManager) super.getContext().getSystemService("accessibility"));
        super.setAccessibilityDelegateCompat(new a2.m1(super));
        String v3_18 = z1.a.a;
        String v5_28 = p21.obtainStyledAttributes(p22, v3_18, p23, 0);
        q0.q0.m(super, p21, v3_18, p22, v5_28, p23);
        IllegalStateException v2_1 = v5_28;
        String v16 = v2_1.getString(8);
        if (v2_1.getInt(2, -1) == -1) {
            super.setDescendantFocusability(262144);
        }
        int v19;
        int v12_0;
        android.content.res.TypedArray v18;
        int v17;
        Boolean v13_1;
        super.n = v2_1.getBoolean(1, 1);
        if (!v2_1.getBoolean(3, 0)) {
            v17 = 3;
            v19 = 1;
            v18 = 2;
            v12_0 = p23;
            v13_1 = v2_1;
        } else {
            String v3_23 = ((android.graphics.drawable.StateListDrawable) v2_1.getDrawable(6));
            IllegalStateException v4_2 = v2_1.getDrawable(7);
            String v5_30 = ((android.graphics.drawable.StateListDrawable) v2_1.getDrawable(4));
            String v6_1 = v2_1.getDrawable(5);
            if ((v3_23 == null) || ((v4_2 == null) || ((v5_30 == null) || (v6_1 == null)))) {
                throw new IllegalArgumentException(v1.a.h(super, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            } else {
                int v7_11 = super.getContext().getResources();
                v18 = 2;
                v19 = 1;
                v13_1 = v2_1;
                v12_0 = p23;
                v17 = 3;
                new a2.p(super, v3_23, v4_2, v5_30, v6_1, v7_11.getDimensionPixelSize(2131165338), v7_11.getDimensionPixelSize(2131165340), v7_11.getDimensionPixelOffset(2131165339));
            }
        }
        v13_1.recycle();
        super.C0 = p21.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (v16 != null) {
            NoSuchMethodException v0_22 = v16.trim();
            if (!v0_22.isEmpty()) {
                if (v0_22.charAt(0) != 46) {
                    if (!v0_22.contains(".")) {
                        String v3_31 = new StringBuilder();
                        v3_31.append(androidx.recyclerview.widget.RecyclerView.getPackage().getName());
                        v3_31.append(46);
                        v3_31.append(v0_22);
                        v0_22 = v3_31.toString();
                    }
                } else {
                    String v3_33 = new StringBuilder();
                    v3_33.append(p21.getPackageName());
                    v3_33.append(v0_22);
                    v0_22 = v3_33.toString();
                }
                String v3_34 = v0_22;
                NoSuchMethodException v0_24;
                if (!super.isInEditMode()) {
                    v0_24 = p21.getClassLoader();
                } else {
                    v0_24 = super.getClass().getClassLoader();
                }
                IllegalStateException v4_7 = Class.forName(v3_34, 0, v0_24).asSubclass(a2.t0);
                try {
                    NoSuchMethodException v0_28 = v4_7.getConstructor(androidx.recyclerview.widget.RecyclerView.L0);
                    String v5_35 = new Object[4];
                    v5_35[0] = p21;
                    v5_35[v19] = p22;
                    v5_35[v18] = Integer.valueOf(v12_0);
                    v5_35[v17] = Integer.valueOf(0);
                    Object[] v11_0 = v5_35;
                } catch (NoSuchMethodException v0_29) {
                    String v5_36 = v0_29;
                    v0_28 = v4_7.getConstructor(v11_0);
                }
                v0_28.setAccessible(v19);
                super.setLayoutManager(((a2.t0) v0_28.newInstance(v11_0)));
            }
        }
        String v3_40 = androidx.recyclerview.widget.RecyclerView.H0;
        String v5_50 = p21.obtainStyledAttributes(p22, v3_40, v12_0, 0);
        q0.q0.m(super, p21, v3_40, p22, v5_50, v12_0);
        NoSuchMethodException v0_41 = v5_50.getBoolean(0, 1);
        v5_50.recycle();
        super.setNestedScrollingEnabled(v0_41);
        super.setTag(2131362129, Boolean.TRUE);
        return;
    }

    public static androidx.recyclerview.widget.RecyclerView G(android.view.View p4)
    {
        if ((p4 instanceof android.view.ViewGroup)) {
            if (!(p4 instanceof androidx.recyclerview.widget.RecyclerView)) {
                int v0_2 = ((android.view.ViewGroup) p4).getChildCount();
                int v2 = 0;
                while (v2 < v0_2) {
                    androidx.recyclerview.widget.RecyclerView v3_1 = androidx.recyclerview.widget.RecyclerView.G(((android.view.ViewGroup) p4).getChildAt(v2));
                    if (v3_1 == null) {
                        v2++;
                    } else {
                        return v3_1;
                    }
                }
                return 0;
            } else {
                return ((androidx.recyclerview.widget.RecyclerView) p4);
            }
        } else {
            return 0;
        }
    }

    public static a2.k1 M(android.view.View p0)
    {
        if (p0 != null) {
            return ((a2.u0) p0.getLayoutParams()).a;
        } else {
            return 0;
        }
    }

    public static synthetic void a(androidx.recyclerview.widget.RecyclerView p0, android.view.View p1, int p2, android.view.ViewGroup$LayoutParams p3)
    {
        p0.attachViewToParent(p1, p2, p3);
        return;
    }

    public static synthetic void c(androidx.recyclerview.widget.RecyclerView p0, int p1)
    {
        p0.detachViewFromParent(p1);
        return;
    }

    public static synthetic boolean d(androidx.recyclerview.widget.RecyclerView p0)
    {
        return p0.awakenScrollBars();
    }

    public static synthetic void e(androidx.recyclerview.widget.RecyclerView p0, android.view.View p1, int p2, android.view.ViewGroup$LayoutParams p3)
    {
        p0.attachViewToParent(p1, p2, p3);
        return;
    }

    public static synthetic void f(androidx.recyclerview.widget.RecyclerView p0, android.view.View p1)
    {
        p0.detachViewFromParent(p1);
        return;
    }

    public static synthetic void g(androidx.recyclerview.widget.RecyclerView p0, int p1, int p2)
    {
        p0.setMeasuredDimension(p1, p2);
        return;
    }

    private q0.q getScrollingChildHelper()
    {
        if (this.t0 == null) {
            this.t0 = new q0.q(this);
        }
        return this.t0;
    }

    public static void l(a2.k1 p3)
    {
        int v0_0 = p3.b;
        if (v0_0 != 0) {
            int v0_2 = ((android.view.View) v0_0.get());
            while (v0_2 != 0) {
                if (v0_2 != p3.a) {
                    int v0_1 = v0_2.getParent();
                    if (!(v0_1 instanceof android.view.View)) {
                        v0_2 = 0;
                    } else {
                        v0_2 = ((android.view.View) v0_1);
                    }
                }
            }
            p3.b = 0;
        }
        return;
    }

    public static int o(int p4, android.widget.EdgeEffect p5, android.widget.EdgeEffect p6, int p7)
    {
        if ((p4 <= 0) || ((p5 == 0) || (a.a.u(p5) == 0))) {
            if ((p4 < 0) && ((p6 != 0) && (a.a.u(p6) != 0))) {
                int v5_8 = Math.round((a.a.N(p6, ((((float) p4) * 1082130432) / ((float) p7)), 1056964608) * (((float) p7) / 1082130432)));
                if (v5_8 != p4) {
                    p6.finish();
                }
                p4 -= v5_8;
            }
            return p4;
        } else {
            int v6_7 = Math.round((a.a.N(p5, ((((float) (- p4)) * 1082130432) / ((float) p7)), 1056964608) * (((float) (- p7)) / 1082130432)));
            if (v6_7 != p4) {
                p5.finish();
            }
            return (p4 - v6_7);
        }
    }

    public static void setDebugAssertionsEnabled(boolean p0)
    {
        androidx.recyclerview.widget.RecyclerView.F0 = p0;
        return;
    }

    public static void setVerboseLoggingEnabled(boolean p0)
    {
        androidx.recyclerview.widget.RecyclerView.G0 = p0;
        return;
    }

    public final void A()
    {
        if (this.M == null) {
            ((a2.h1) this.K).getClass();
            android.widget.EdgeEffect v0_4 = new android.widget.EdgeEffect(this.getContext());
            this.M = v0_4;
            if (!this.n) {
                v0_4.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
                return;
            } else {
                v0_4.setSize(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()));
                return;
            }
        } else {
            return;
        }
    }

    public final String B()
    {
        String v0_1 = new StringBuilder(" ");
        v0_1.append(super.toString());
        v0_1.append(", adapter:");
        v0_1.append(this.r);
        v0_1.append(", layout:");
        v0_1.append(this.s);
        v0_1.append(", context:");
        v0_1.append(this.getContext());
        return v0_1.toString();
    }

    public final void C(a2.g1 p3)
    {
        if (this.getScrollState() != 2) {
            p3.getClass();
            return;
        } else {
            android.widget.OverScroller v0_2 = this.h0.c;
            v0_2.getFinalX();
            v0_2.getCurrX();
            p3.getClass();
            v0_2.getFinalY();
            v0_2.getCurrY();
            return;
        }
    }

    public final android.view.View D(android.view.View p3)
    {
        android.view.ViewParent v0 = p3.getParent();
        while ((v0 != null) && ((v0 != this) && ((v0 instanceof android.view.View)))) {
            p3 = ((android.view.View) v0);
            v0 = p3.getParent();
        }
        if (v0 != this) {
            return 0;
        } else {
            return p3;
        }
    }

    public final boolean E(android.view.MotionEvent p12)
    {
        int v0 = p12.getAction();
        java.util.ArrayList v1 = this.v;
        int v2 = v1.size();
        int v4 = 0;
        while (v4 < v2) {
            a2.p v5_1 = ((a2.p) v1.get(v4));
            float v6_0 = v5_1.v;
            if (v6_0 != 1) {
                if (v6_0 == 2) {
                    if (v0 != 3) {
                        this.w = v5_1;
                        return 1;
                    }
                }
            } else {
                float v6_2 = v5_1.d(p12.getX(), p12.getY());
                boolean v9_2 = v5_1.c(p12.getX(), p12.getY());
                if ((p12.getAction() == 0) && ((v6_2 != 0) || (v9_2))) {
                    if (!v9_2) {
                        if (v6_2 != 0) {
                            v5_1.w = 2;
                            v5_1.m = ((float) ((int) p12.getY()));
                        }
                    } else {
                        v5_1.w = 1;
                        v5_1.p = ((float) ((int) p12.getX()));
                    }
                    v5_1.f(2);
                }
            }
            v4++;
        }
        return 0;
    }

    public final void F(int[] p9)
    {
        int v0_1 = this.f.r();
        if (v0_1 != 0) {
            int v3 = 2147483647;
            int v4 = -2147483648;
            int v5 = 0;
            while (v5 < v0_1) {
                int v6_2 = androidx.recyclerview.widget.RecyclerView.M(this.f.q(v5));
                if (!v6_2.o()) {
                    int v6_3 = v6_2.b();
                    if (v6_3 < v3) {
                        v3 = v6_3;
                    }
                    if (v6_3 > v4) {
                        v4 = v6_3;
                    }
                }
                v5++;
            }
            p9[0] = v3;
            p9[1] = v4;
            return;
        } else {
            p9[0] = -1;
            p9[1] = -1;
            return;
        }
    }

    public final a2.k1 H(int p6)
    {
        a2.k1 v1_0 = 0;
        if (!this.G) {
            int v0_2 = this.f.u();
            int v2 = 0;
            while (v2 < v0_2) {
                a2.k1 v3_1 = androidx.recyclerview.widget.RecyclerView.M(this.f.t(v2));
                if ((v3_1 != null) && ((!v3_1.h()) && (this.J(v3_1) == p6))) {
                    if (!((java.util.ArrayList) this.f.e).contains(v3_1.a)) {
                        return v3_1;
                    } else {
                        v1_0 = v3_1;
                    }
                }
                v2++;
            }
            return v1_0;
        } else {
            return 0;
        }
    }

    public final boolean I(int p20, int p21, int p22, int p23)
    {
        int v3_4 = this.s;
        if (v3_4 != 0) {
            int v17_0;
            if (!this.C) {
                int v6_1;
                int v3_7 = v3_4.d();
                a2.t0 v5_1 = this.s.e();
                if ((v3_7 != 0) && (Math.abs(p20) >= p22)) {
                    v6_1 = p20;
                } else {
                    v6_1 = 0;
                }
                if ((v5_1 != null) && (Math.abs(p21) >= p22)) {
                    int v1_2 = p21;
                } else {
                    v1_2 = 0;
                }
                if ((v6_1 != 0) || (v1_2 != 0)) {
                    a2.f0 v8_1;
                    if (v6_1 == 0) {
                        v8_1 = 0;
                    } else {
                        a2.f0 v8_14 = this.L;
                        if ((v8_14 == null) || (a.a.u(v8_14) == 0)) {
                            a2.f0 v8_17 = this.N;
                            if ((v8_17 == null) || (a.a.u(v8_17) == 0)) {
                            } else {
                                if (this.g0(this.N, v6_1, this.getWidth())) {
                                    this.N.onAbsorb(v6_1);
                                    v6_1 = 0;
                                }
                            }
                        } else {
                            int v9_1 = (- v6_1);
                            if (this.g0(this.L, v9_1, this.getWidth())) {
                                this.L.onAbsorb(v9_1);
                            }
                        }
                        v8_1 = v6_1;
                        v6_1 = 0;
                    }
                    android.widget.EdgeEffect v7_3;
                    if (v1_2 == 0) {
                        v7_3 = v1_2;
                        v1_2 = 0;
                    } else {
                        int v9_2 = this.M;
                        if ((v9_2 == 0) || (a.a.u(v9_2) == 0)) {
                            int v9_5 = this.O;
                            if ((v9_5 == 0) || (a.a.u(v9_5) == 0)) {
                            } else {
                                if (this.g0(this.O, v1_2, this.getHeight())) {
                                    this.O.onAbsorb(v1_2);
                                    v1_2 = 0;
                                }
                            }
                        } else {
                            int v9_8 = (- v1_2);
                            if (this.g0(this.M, v9_8, this.getHeight())) {
                                this.M.onAbsorb(v9_8);
                            }
                        }
                        v7_3 = 0;
                    }
                    int v9_9 = this.h0;
                    float v10_9 = 1;
                    if ((v8_1 != null) || (v1_2 != 0)) {
                        android.graphics.PointF v11_0 = (- p23);
                        v8_1 = Math.max(v11_0, Math.min(v8_1, p23));
                        v1_2 = Math.max(v11_0, Math.min(v1_2, p23));
                        this.k0(1);
                        v9_9.a(v8_1, v1_2);
                    }
                    if ((v6_1 != 0) || (v7_3 != null)) {
                        int v1_3 = ((float) v6_1);
                        a2.f0 v8_2 = ((float) v7_3);
                        if (this.dispatchNestedPreFling(v1_3, v8_2)) {
                            v17_0 = 0;
                        } else {
                            if ((v3_7 == 0) && (v5_1 == null)) {
                                int v3_0 = 0;
                            } else {
                                v3_0 = 1;
                            }
                            int v18_0;
                            android.view.View v22_1;
                            this.dispatchNestedFling(v1_3, v8_2, v3_0);
                            int v1_4 = this.b0;
                            if (v1_4 == 0) {
                                v18_0 = v3_0;
                                v17_0 = 0;
                                v22_1 = 1;
                            } else {
                                int v1_5 = ((a2.c0) v1_4);
                                a2.t0 v5_3 = v1_5.a.getLayoutManager();
                                if ((v5_3 != null) && (v1_5.a.getAdapter() != null)) {
                                    a2.f0 v8_6 = v1_5.a.getMinFlingVelocity();
                                    if (((Math.abs(v7_3) > v8_6) || (Math.abs(v6_1) > v8_6)) && ((v5_3 instanceof a2.f1))) {
                                        a2.f0 v8_11;
                                        switch (v1_5.d) {
                                            case 1:
                                                if ((v5_3 instanceof a2.f1)) {
                                                    v8_11 = new a2.f0(v1_5, v1_5.a.getContext(), 0);
                                                } else {
                                                    v8_11 = 0;
                                                }
                                                break;
                                            default:
                                                if ((v5_3 instanceof a2.f1)) {
                                                    v8_11 = new a2.f0(v1_5, v1_5.a.getContext(), 1);
                                                }
                                        }
                                        if (v8_11 != null) {
                                            int v12_2;
                                            switch (v1_5.d) {
                                                case 0:
                                                    v18_0 = v3_0;
                                                    v17_0 = 0;
                                                    v22_1 = 1;
                                                    if ((v5_3 instanceof a2.f1)) {
                                                        int v3_2 = v5_3.B();
                                                        if (v3_2 != 0) {
                                                            float v10_0 = v1_5.g(v5_3);
                                                            if (v10_0 != 0) {
                                                                float v10_1 = a2.t0.G(v10_0);
                                                                if (v10_1 != -1) {
                                                                    v12_2 = (v3_2 - 1);
                                                                    android.graphics.PointF v11_11 = ((a2.f1) v5_3).a(v12_2);
                                                                    if (v11_11 != null) {
                                                                        int v13_1;
                                                                        int v15_0 = 0;
                                                                        if (!v5_3.d()) {
                                                                            v13_1 = 0;
                                                                        } else {
                                                                            v13_1 = v1_5.d(v5_3, v1_5.h(v5_3), v6_1, 0);
                                                                            if (v11_11.x < 0) {
                                                                                v13_1 = (- v13_1);
                                                                            }
                                                                        }
                                                                        int v1_6;
                                                                        if (!v5_3.e()) {
                                                                            v1_6 = 0;
                                                                        } else {
                                                                            v1_6 = v1_5.d(v5_3, v1_5.j(v5_3), 0, v7_3);
                                                                            if (v11_11.y < 0) {
                                                                                v1_6 = (- v1_6);
                                                                            }
                                                                        }
                                                                        if (v5_3.e()) {
                                                                            v13_1 = v1_6;
                                                                        }
                                                                        if (v13_1 != 0) {
                                                                            float v10_2 = (v10_1 + v13_1);
                                                                            if (v10_2 >= 0) {
                                                                                v15_0 = v10_2;
                                                                            }
                                                                            if (v15_0 < v3_2) {
                                                                                v12_2 = v15_0;
                                                                            } else {
                                                                            }
                                                                        } else {
                                                                            v12_2 = -1;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    android.graphics.PointF v11_12 = v5_3.B();
                                                    if (v11_12 != null) {
                                                        int v1_7;
                                                        android.view.View v14_1 = 0;
                                                        if (!v5_3.e()) {
                                                            if (!v5_3.d()) {
                                                                v1_7 = 0;
                                                            } else {
                                                                v1_7 = v1_5.i(v5_3);
                                                            }
                                                        } else {
                                                            v1_7 = v1_5.k(v5_3);
                                                        }
                                                        if (v1_7 != 0) {
                                                            int v13_5 = v5_3.v();
                                                            int v12_3 = 2147483647;
                                                            int v15_1 = 0;
                                                            v17_0 = 0;
                                                            int v4_8 = -2147483648;
                                                            android.view.View v16_1 = 0;
                                                            while (v15_1 < v13_5) {
                                                                int v18_1;
                                                                android.view.View v22_2 = v10_9;
                                                                float v10_8 = v5_3.u(v15_1);
                                                                if (v10_8 != 0) {
                                                                    v18_1 = v3_0;
                                                                    int v3_5 = a2.c0.c(v10_8, v1_7);
                                                                    if ((v3_5 <= 0) && (v3_5 > v4_8)) {
                                                                        v4_8 = v3_5;
                                                                        v16_1 = v10_8;
                                                                    }
                                                                    if ((v3_5 >= 0) && (v3_5 < v12_3)) {
                                                                        v12_3 = v3_5;
                                                                        v14_1 = v10_8;
                                                                    }
                                                                } else {
                                                                    v18_1 = v3_0;
                                                                }
                                                                v15_1++;
                                                                v10_9 = v22_2;
                                                                v3_0 = v18_1;
                                                            }
                                                            int v1_9;
                                                            v18_0 = v3_0;
                                                            v22_1 = v10_9;
                                                            int v3_3 = 1;
                                                            if (!v5_3.d()) {
                                                                if (v7_3 <= null) {
                                                                    v1_9 = 0;
                                                                } else {
                                                                    v1_9 = 1;
                                                                }
                                                            } else {
                                                                if (v6_1 <= 0) {
                                                                }
                                                            }
                                                            if ((v1_9 == 0) || (v14_1 == null)) {
                                                                if ((v1_9 != 0) || (v16_1 == null)) {
                                                                    if (v1_9 != 0) {
                                                                        v14_1 = v16_1;
                                                                    }
                                                                    if (v14_1 != null) {
                                                                        int v15_2;
                                                                        int v4_9 = a2.t0.G(v14_1);
                                                                        float v10_3 = v5_3.B();
                                                                        if (!(v5_3 instanceof a2.f1)) {
                                                                            v15_2 = 0;
                                                                        } else {
                                                                            float v10_5 = ((a2.f1) v5_3).a((v10_3 - 1));
                                                                            if ((v10_5 == 0) || ((v10_5.x >= 0) && (v10_5.y >= 0))) {
                                                                            } else {
                                                                                v15_2 = 1;
                                                                            }
                                                                        }
                                                                        if (v15_2 == v1_9) {
                                                                            v3_3 = -1;
                                                                        }
                                                                        int v4_10 = (v4_9 + v3_3);
                                                                        if ((v4_10 >= 0) && (v4_10 < v11_12)) {
                                                                            v12_2 = v4_10;
                                                                        }
                                                                    }
                                                                } else {
                                                                    v12_2 = a2.t0.G(v16_1);
                                                                }
                                                            } else {
                                                                v12_2 = a2.t0.G(v14_1);
                                                            }
                                                        }
                                                    }
                                                    v18_0 = v3_0;
                                                    v17_0 = 0;
                                                    v22_1 = 1;
                                            }
                                            if (v12_2 != -1) {
                                                v8_11.a = v12_2;
                                                v5_3.B0(v8_11);
                                                return v22_1;
                                            }
                                        }
                                    }
                                }
                            }
                            if (v18_0 != 0) {
                                int v1_11 = v22_1;
                                this.k0(v1_11);
                                int v3_6 = (- p23);
                                v9_9.a(Math.max(v3_6, Math.min(v6_1, p23)), Math.max(v3_6, Math.min(v7_3, p23)));
                                return v1_11;
                            }
                        }
                    } else {
                        if ((v8_1 == null) && (v1_2 == 0)) {
                        } else {
                            return 1;
                        }
                    }
                }
            }
            return v17_0;
        } else {
            android.util.Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return 0;
        }
    }

    public final int J(a2.k1 p8)
    {
        if ((p8.j & 524) == 0) {
            if (p8.e()) {
                int v8_1 = p8.c;
                java.util.ArrayList v0_2 = ((java.util.ArrayList) this.e.c);
                int v2 = v0_2.size();
                int v3 = 0;
                while (v3 < v2) {
                    int v4_1 = ((a2.a) v0_2.get(v3));
                    int v5_0 = v4_1.a;
                    if (v5_0 == 1) {
                        if (v4_1.b <= v8_1) {
                            v8_1 += v4_1.c;
                        }
                    } else {
                        if (v5_0 == 2) {
                            int v5_2 = v4_1.b;
                            if (v5_2 <= v8_1) {
                                int v4_3 = v4_1.c;
                                if ((v5_2 + v4_3) <= v8_1) {
                                    v8_1 -= v4_3;
                                } else {
                                    return -1;
                                }
                            }
                        } else {
                            if (v5_0 == 8) {
                                int v5_4 = v4_1.b;
                                if (v5_4 != v8_1) {
                                    if (v5_4 < v8_1) {
                                        v8_1--;
                                    }
                                    if (v4_1.c <= v8_1) {
                                        v8_1++;
                                    }
                                } else {
                                    v8_1 = v4_1.c;
                                }
                            }
                        }
                    }
                    v3++;
                }
                return v8_1;
            }
            return -1;
        } else {
            return -1;
        }
    }

    public final long K(a2.k1 p3)
    {
        if (!this.r.b) {
            return ((long) p3.c);
        } else {
            return p3.e;
        }
    }

    public final a2.k1 L(android.view.View p4)
    {
        IllegalArgumentException v0_0 = p4.getParent();
        if ((v0_0 != null) && (v0_0 != this)) {
            StringBuilder v1_1 = new StringBuilder("View ");
            v1_1.append(p4);
            v1_1.append(" is not a direct child of ");
            v1_1.append(this);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            return androidx.recyclerview.widget.RecyclerView.M(p4);
        }
    }

    public final android.graphics.Rect N(android.view.View p10)
    {
        a2.u0 v0_1 = ((a2.u0) p10.getLayoutParams());
        android.graphics.Rect v2 = v0_1.b;
        if ((v0_1.c) && ((!this.k0.g) || ((!v0_1.a.k()) && (!v0_1.a.f())))) {
            v2.set(0, 0, 0, 0);
            java.util.ArrayList v3 = this.u;
            int v4 = v3.size();
            int v5 = 0;
            while (v5 < v4) {
                int v6_0 = this.o;
                v6_0.set(0, 0, 0, 0);
                ((a2.q0) v3.get(v5)).getClass();
                ((a2.u0) p10.getLayoutParams()).a.getClass();
                v6_0.set(0, 0, 0, 0);
                v2.left = (v2.left + v6_0.left);
                v2.top = (v2.top + v6_0.top);
                v2.right = (v2.right + v6_0.right);
                v2.bottom = (v2.bottom + v6_0.bottom);
                v5++;
            }
            v0_1.c = 0;
            return v2;
        } else {
            return v2;
        }
    }

    public final boolean O()
    {
        if ((this.z) && ((!this.G) && (!this.e.h()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean P()
    {
        if (this.I <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void Q(int p2)
    {
        if (this.s != null) {
            this.setScrollState(2);
            this.s.q0(p2);
            this.awakenScrollBars();
            return;
        } else {
            return;
        }
    }

    public final void R()
    {
        java.util.ArrayList v0_1 = this.f.u();
        int v1 = 0;
        int v2_1 = 0;
        while (v2_1 < v0_1) {
            ((a2.u0) this.f.t(v2_1).getLayoutParams()).c = 1;
            v2_1++;
        }
        java.util.ArrayList v0_3 = this.c.c;
        int v2_0 = v0_3.size();
        while (v1 < v2_0) {
            a2.u0 v4_4 = ((a2.u0) ((a2.k1) v0_3.get(v1)).a.getLayoutParams());
            if (v4_4 != null) {
                v4_4.c = 1;
            }
            v1++;
        }
        return;
    }

    public final void S(int p13, boolean p14, int p15)
    {
        int v0 = (p13 + p15);
        a2.z0 v1_2 = this.f.u();
        int v2_1 = 0;
        while (v2_1 < v1_2) {
            int v8_4 = androidx.recyclerview.widget.RecyclerView.M(this.f.t(v2_1));
            if ((v8_4 != 0) && (!v8_4.o())) {
                int v9_7 = v8_4.c;
                int v10_3 = this.k0;
                if (v9_7 < v0) {
                    if (v9_7 >= p13) {
                        if (androidx.recyclerview.widget.RecyclerView.G0) {
                            int v4_3 = new StringBuilder("offsetPositionRecordsForRemove attached child ");
                            v4_3.append(v2_1);
                            v4_3.append(" holder ");
                            v4_3.append(v8_4);
                            v4_3.append(" now REMOVED");
                            android.util.Log.d("RecyclerView", v4_3.toString());
                        }
                        int v4_5 = (p13 - 1);
                        int v5_2 = (- p15);
                        v8_4.a(8);
                        v8_4.l(v5_2, p14);
                        v8_4.c = v4_5;
                        v10_3.f = 1;
                    }
                } else {
                    if (androidx.recyclerview.widget.RecyclerView.G0) {
                        int v3_3 = new StringBuilder("offsetPositionRecordsForRemove attached child ");
                        v3_3.append(v2_1);
                        v3_3.append(" holder ");
                        v3_3.append(v8_4);
                        v3_3.append(" now at position ");
                        v3_3.append((v8_4.c - p15));
                        android.util.Log.d("RecyclerView", v3_3.toString());
                    }
                    v8_4.l((- p15), p14);
                    v10_3.f = 1;
                }
            }
            v2_1++;
        }
        a2.z0 v1_1 = this.c;
        int v2_0 = v1_1.c;
        int v8_1 = (v2_0.size() - 1);
        while (v8_1 >= 0) {
            a2.k1 v7_1 = ((a2.k1) v2_0.get(v8_1));
            if (v7_1 != null) {
                int v9_0 = v7_1.c;
                if (v9_0 < v0) {
                    if (v9_0 >= p13) {
                        v7_1.a(8);
                        v1_1.h(v8_1);
                    }
                } else {
                    if (androidx.recyclerview.widget.RecyclerView.G0) {
                        int v9_3 = new StringBuilder("offsetPositionRecordsForRemove cached ");
                        v9_3.append(v8_1);
                        v9_3.append(" holder ");
                        v9_3.append(v7_1);
                        v9_3.append(" now at position ");
                        v9_3.append((v7_1.c - p15));
                        android.util.Log.d("RecyclerView", v9_3.toString());
                    }
                    v7_1.l((- p15), p14);
                }
            }
            v8_1--;
        }
        this.requestLayout();
        return;
    }

    public final void T()
    {
        this.I = (this.I + 1);
        return;
    }

    public final void U(boolean p6)
    {
        int v0_4 = (this.I - 1);
        this.I = v0_4;
        if (v0_4 < 1) {
            if ((androidx.recyclerview.widget.RecyclerView.F0) && (v0_4 < 0)) {
                throw new IllegalStateException(v1.a.h(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            } else {
                this.I = 0;
                if (p6 != null) {
                    java.util.ArrayList v6_2 = this.E;
                    this.E = 0;
                    if (v6_2 != null) {
                        int v0_5 = this.F;
                        if ((v0_5 != 0) && (v0_5.isEnabled())) {
                            int v0_7 = android.view.accessibility.AccessibilityEvent.obtain();
                            v0_7.setEventType(2048);
                            v0_7.setContentChangeTypes(v6_2);
                            this.sendAccessibilityEventUnchecked(v0_7);
                        }
                    }
                    java.util.ArrayList v6_3 = this.x0;
                    int v0_9 = (v6_3.size() - 1);
                    while (v0_9 >= 0) {
                        a2.k1 v1_3 = ((a2.k1) v6_3.get(v0_9));
                        if ((v1_3.a.getParent() == this) && (!v1_3.o())) {
                            int v2_5 = v1_3.q;
                            if (v2_5 != -1) {
                                v1_3.a.setImportantForAccessibility(v2_5);
                                v1_3.q = -1;
                            }
                        }
                        v0_9--;
                    }
                    v6_3.clear();
                }
            }
        }
        return;
    }

    public final void V(android.view.MotionEvent p4)
    {
        int v0_0 = p4.getActionIndex();
        if (p4.getPointerId(v0_0) == this.R) {
            int v0_1;
            if (v0_0 != 0) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
            this.R = p4.getPointerId(v0_1);
            int v1_3 = ((int) (p4.getX(v0_1) + 1056964608));
            this.V = v1_3;
            this.T = v1_3;
            int v4_3 = ((int) (p4.getY(v0_1) + 1056964608));
            this.W = v4_3;
            this.U = v4_3;
        }
        return;
    }

    public final void W()
    {
        if ((!this.q0) && (this.x)) {
            this.postOnAnimation(this.y0);
            this.q0 = 1;
        }
        return;
    }

    public final void X(boolean p7)
    {
        this.H = (p7 | this.H);
        this.G = 1;
        a2.z0 v7_5 = this.f.u();
        boolean v0_4 = 0;
        int v1_1 = 0;
        while (v1_1 < v7_5) {
            int v3_3 = androidx.recyclerview.widget.RecyclerView.M(this.f.t(v1_1));
            if ((v3_3 != 0) && (!v3_3.o())) {
                v3_3.a(6);
            }
            v1_1++;
        }
        this.R();
        a2.z0 v7_2 = this.c;
        int v1_0 = v7_2.c;
        int v3_0 = v1_0.size();
        while (v0_4 < v3_0) {
            a2.k1 v4_1 = ((a2.k1) v1_0.get(v0_4));
            if (v4_1 != null) {
                v4_1.a(6);
                v4_1.a(1024);
            }
            v0_4++;
        }
        boolean v0_2 = v7_2.h.r;
        if ((v0_2) && (v0_2.b)) {
            return;
        } else {
            v7_2.g();
            return;
        }
    }

    public final void Y(a2.k1 p5, a2.o0 p6)
    {
        p5.j = (p5.j & -8193);
        a2.u1 v1_2 = this.m;
        if ((this.k0.h) && ((p5.k()) && ((!p5.h()) && (!p5.o())))) {
            ((r.g) v1_2.c).e(this.K(p5), p5);
        }
        r.g v0_7 = ((r.j) v1_2.b);
        a2.u1 v1_1 = ((a2.u1) v0_7.get(p5));
        if (v1_1 == null) {
            v1_1 = a2.u1.a();
            v0_7.put(p5, v1_1);
        }
        v1_1.b = p6;
        v1_1.a = (v1_1.a | 4);
        return;
    }

    public final void Z()
    {
        int v0_1;
        int v0_0 = this.L;
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            v0_0.onRelease();
            v0_1 = this.L.isFinished();
        }
        boolean v1_8 = this.M;
        if (v1_8) {
            v1_8.onRelease();
            v0_1 |= this.M.isFinished();
        }
        boolean v1_2 = this.N;
        if (v1_2) {
            v1_2.onRelease();
            v0_1 |= this.N.isFinished();
        }
        boolean v1_5 = this.O;
        if (v1_5) {
            v1_5.onRelease();
            v0_1 |= this.O.isFinished();
        }
        if (v0_1 != 0) {
            this.postInvalidateOnAnimation();
        }
        return;
    }

    public final int a0(int p4, float p5)
    {
        android.widget.EdgeEffect v5_2 = (p5 / ((float) this.getHeight()));
        float v4_11 = (((float) p4) / ((float) this.getWidth()));
        android.widget.EdgeEffect v0_15 = this.L;
        float v1_0 = 0;
        if ((v0_15 == null) || (a.a.u(v0_15) == 0)) {
            android.widget.EdgeEffect v0_3 = this.N;
            if ((v0_3 != null) && (a.a.u(v0_3) != 0)) {
                if (!this.canScrollHorizontally(1)) {
                    float v4_1 = a.a.N(this.N, v4_11, v5_2);
                    if (a.a.u(this.N) == 0) {
                        this.N.onRelease();
                    }
                    v1_0 = v4_1;
                } else {
                    this.N.onRelease();
                }
                this.invalidate();
            }
        } else {
            if (!this.canScrollHorizontally(-1)) {
                float v4_6 = (- a.a.N(this.L, (- v4_11), (1065353216 - v5_2)));
                if (a.a.u(this.L) == 0) {
                    this.L.onRelease();
                }
                v1_0 = v4_6;
            } else {
                this.L.onRelease();
            }
            this.invalidate();
        }
        return Math.round((v1_0 * ((float) this.getWidth())));
    }

    public final void addFocusables(java.util.ArrayList p2, int p3, int p4)
    {
        a2.t0 v0 = this.s;
        if (v0 != null) {
            v0.getClass();
        }
        super.addFocusables(p2, p3, p4);
        return;
    }

    public final int b0(int p4, float p5)
    {
        android.widget.EdgeEffect v5_1 = (p5 / ((float) this.getWidth()));
        float v4_11 = (((float) p4) / ((float) this.getHeight()));
        android.widget.EdgeEffect v0_15 = this.M;
        float v1_0 = 0;
        if ((v0_15 == null) || (a.a.u(v0_15) == 0)) {
            android.widget.EdgeEffect v0_3 = this.O;
            if ((v0_3 != null) && (a.a.u(v0_3) != 0)) {
                if (!this.canScrollVertically(1)) {
                    float v4_1 = a.a.N(this.O, v4_11, (1065353216 - v5_1));
                    if (a.a.u(this.O) == 0) {
                        this.O.onRelease();
                    }
                    v1_0 = v4_1;
                } else {
                    this.O.onRelease();
                }
                this.invalidate();
            }
        } else {
            if (!this.canScrollVertically(-1)) {
                float v4_6 = (- a.a.N(this.M, (- v4_11), v5_1));
                if (a.a.u(this.M) == 0) {
                    this.M.onRelease();
                }
                v1_0 = v4_6;
            } else {
                this.M.onRelease();
            }
            this.invalidate();
        }
        return Math.round((v1_0 * ((float) this.getHeight())));
    }

    public final void c0(android.view.View p12, android.view.View p13)
    {
        boolean v0_0;
        if (p13 == null) {
            v0_0 = p12;
        } else {
            v0_0 = p13;
        }
        android.graphics.Rect v3 = this.o;
        v3.set(0, 0, v0_0.getWidth(), v0_0.getHeight());
        boolean v0_1 = v0_0.getLayoutParams();
        if ((v0_1 instanceof a2.u0)) {
            boolean v0_2 = ((a2.u0) v0_1);
            if (!v0_2.c) {
                boolean v0_3 = v0_2.b;
                v3.left = (v3.left - v0_3.left);
                v3.right = (v3.right + v0_3.right);
                v3.top = (v3.top - v0_3.top);
                v3.bottom = (v3.bottom + v0_3.bottom);
            }
        }
        if (p13 != null) {
            this.offsetDescendantRectToMyCoords(p13, v3);
            this.offsetRectIntoDescendantCoords(p12, v3);
        }
        int v10;
        if (p13 != null) {
            v10 = 0;
        } else {
            v10 = 1;
        }
        this.s.n0(this, p12, this.o, (this.z ^ 1), v10);
        return;
    }

    public final boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
    {
        if ((!(p2 instanceof a2.u0)) || (!this.s.f(((a2.u0) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int computeHorizontalScrollExtent()
    {
        int v0_0 = this.s;
        if ((v0_0 == 0) || (!v0_0.d())) {
            return 0;
        } else {
            return this.s.j(this.k0);
        }
    }

    public final int computeHorizontalScrollOffset()
    {
        int v0_0 = this.s;
        if ((v0_0 == 0) || (!v0_0.d())) {
            return 0;
        } else {
            return this.s.k(this.k0);
        }
    }

    public final int computeHorizontalScrollRange()
    {
        int v0_0 = this.s;
        if ((v0_0 == 0) || (!v0_0.d())) {
            return 0;
        } else {
            return this.s.l(this.k0);
        }
    }

    public final int computeVerticalScrollExtent()
    {
        int v0_0 = this.s;
        if ((v0_0 == 0) || (!v0_0.e())) {
            return 0;
        } else {
            return this.s.m(this.k0);
        }
    }

    public final int computeVerticalScrollOffset()
    {
        int v0_0 = this.s;
        if ((v0_0 == 0) || (!v0_0.e())) {
            return 0;
        } else {
            return this.s.n(this.k0);
        }
    }

    public final int computeVerticalScrollRange()
    {
        int v0_0 = this.s;
        if ((v0_0 == 0) || (!v0_0.e())) {
            return 0;
        } else {
            return this.s.o(this.k0);
        }
    }

    public final boolean d0(int p19, int p20, android.view.MotionEvent p21, int p22)
    {
        int v1_0;
        boolean v3_0;
        int v2;
        int v4_0;
        this.p();
        android.widget.EdgeEffect v7_8 = this.w0;
        if (this.r == null) {
            v1_0 = 0;
            v2 = 0;
            v3_0 = 0;
            v4_0 = 0;
        } else {
            v7_8[0] = 0;
            v7_8[1] = 0;
            this.e0(p19, p20, v7_8);
            v1_0 = v7_8[0];
            v2 = v7_8[1];
            v3_0 = (p19 - v1_0);
            v4_0 = (p20 - v2);
        }
        if (!this.u.isEmpty()) {
            this.invalidate();
        }
        int v5_4;
        v7_8[0] = 0;
        v7_8[1] = 0;
        this.v(v1_0, v2, v3_0, v4_0, this.u0, p22, v7_8);
        int v5_3 = v7_8[0];
        boolean v3_7 = (v3_0 - v5_3);
        float v6_3 = v7_8[1];
        int v4_2 = (v4_0 - v6_3);
        if ((v5_3 == 0) && (v6_3 == 0)) {
            v5_4 = 0;
        } else {
            v5_4 = 1;
        }
        float v16;
        float v17;
        android.widget.EdgeEffect v7_5 = this.u0;
        int v13_0 = v7_5[0];
        this.V = (this.V - v13_0);
        android.widget.EdgeEffect v7_6 = v7_5[1];
        this.W = (this.W - v7_6);
        float v6_8 = this.v0;
        v6_8[0] = (v6_8[0] + v13_0);
        v6_8[1] = (v6_8[1] + v7_6);
        if (this.getOverScrollMode() == 2) {
            v16 = 1;
            v17 = 0;
        } else {
            if ((p21 == null) || (a.a.C(p21, 8194))) {
                v16 = 1;
                v17 = 0;
            } else {
                android.widget.EdgeEffect v7_2;
                float v6_12 = p21.getX();
                boolean v3_8 = ((float) v3_7);
                android.widget.EdgeEffect v7_9 = p21.getY();
                int v4_3 = ((float) v4_2);
                if (v3_8 >= 0) {
                    v16 = 1;
                    v17 = 0;
                    if (v3_8 <= 0) {
                        v7_2 = 0;
                    } else {
                        this.z();
                        a.a.N(this.N, (v3_8 / ((float) this.getWidth())), (v7_9 / ((float) this.getHeight())));
                        v7_2 = v16;
                    }
                } else {
                    this.y();
                    v16 = 1;
                    v17 = 0;
                    a.a.N(this.L, ((- v3_8) / ((float) this.getWidth())), (1065353216 - (v7_9 / ((float) this.getHeight()))));
                }
                if (v4_3 >= 0) {
                    if (v4_3 > 0) {
                        this.x();
                        a.a.N(this.O, (v4_3 / ((float) this.getHeight())), (1065353216 - (v6_12 / ((float) this.getWidth()))));
                        v7_2 = v16;
                    }
                } else {
                    this.A();
                    a.a.N(this.M, ((- v4_3) / ((float) this.getHeight())), (v6_12 / ((float) this.getWidth())));
                }
                if ((v7_2 != null) || ((v3_8 != 0) || (v4_3 != 0))) {
                    this.postInvalidateOnAnimation();
                }
                if ((android.os.Build$VERSION.SDK_INT >= 31) && (a.a.C(p21, 4194304))) {
                    this.Z();
                }
            }
            this.n(p19, p20);
        }
        if ((v1_0 != 0) || (v2 != 0)) {
            this.w(v1_0, v2);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        if ((v5_4 == 0) && ((v1_0 == 0) && (v2 == 0))) {
            return v17;
        } else {
            return v16;
        }
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p9)
    {
        if (!super.dispatchKeyEvent(p9)) {
            boolean v0_3 = this.getLayoutManager();
            int v2 = 0;
            if (v0_3) {
                if (!v0_3.e()) {
                    if (v0_3.d()) {
                        a2.i0 v9_1 = p9.getKeyCode();
                        if ((v9_1 == 92) || (v9_1 == 93)) {
                            boolean v0_1 = this.getMeasuredWidth();
                            if (v9_1 != 93) {
                                this.h0((- v0_1), 0, 0);
                                return 1;
                            } else {
                                this.h0(v0_1, 0, 0);
                                return 1;
                            }
                        } else {
                            if ((v9_1 == 122) || (v9_1 == 123)) {
                                boolean v0_2 = v0_3.L();
                                if (v9_1 != 122) {
                                    if (!v0_2) {
                                        v2 = this.getAdapter().a();
                                    }
                                } else {
                                    if (v0_2) {
                                        v2 = this.getAdapter().a();
                                    }
                                }
                                this.i0(v2);
                                return 1;
                            }
                        }
                    }
                } else {
                    a2.i0 v9_5 = p9.getKeyCode();
                    if ((v9_5 == 92) || (v9_5 == 93)) {
                        boolean v0_4 = this.getMeasuredHeight();
                        if (v9_5 != 93) {
                            this.h0(0, 0, (- v0_4));
                            return 1;
                        } else {
                            this.h0(0, 0, v0_4);
                            return 1;
                        }
                    } else {
                        if ((v9_5 == 122) || (v9_5 == 123)) {
                            boolean v0_5 = v0_3.L();
                            if (v9_5 != 122) {
                                if (!v0_5) {
                                    v2 = this.getAdapter().a();
                                }
                            } else {
                                if (v0_5) {
                                    v2 = this.getAdapter().a();
                                }
                            }
                            this.i0(v2);
                            return 1;
                        }
                    }
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean dispatchNestedFling(float p2, float p3, boolean p4)
    {
        return this.getScrollingChildHelper().a(p2, p3, p4);
    }

    public final boolean dispatchNestedPreFling(float p2, float p3)
    {
        return this.getScrollingChildHelper().b(p2, p3);
    }

    public final boolean dispatchNestedPreScroll(int p7, int p8, int[] p9, int[] p10)
    {
        return this.getScrollingChildHelper().c(p7, p8, 0, p9, p10);
    }

    public final boolean dispatchNestedScroll(int p9, int p10, int p11, int p12, int[] p13)
    {
        return this.getScrollingChildHelper().d(p9, p10, p11, p12, p13, 0, 0);
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p1)
    {
        this.onPopulateAccessibilityEvent(p1);
        return 1;
    }

    public final void dispatchRestoreInstanceState(android.util.SparseArray p1)
    {
        this.dispatchThawSelfOnly(p1);
        return;
    }

    public final void dispatchSaveInstanceState(android.util.SparseArray p1)
    {
        this.dispatchFreezeSelfOnly(p1);
        return;
    }

    public final void draw(android.graphics.Canvas p9)
    {
        super.draw(p9);
        java.util.ArrayList v0 = this.u;
        int v1_2 = v0.size();
        int v2 = 0;
        int v3_1 = 0;
        while (v3_1 < v1_2) {
            ((a2.q0) v0.get(v3_1)).b(p9, this);
            v3_1++;
        }
        int v4_0;
        int v1_9 = this.L;
        int v3_0 = 1;
        if ((v1_9 == 0) || (v1_9.isFinished())) {
            v4_0 = 0;
        } else {
            int v4_4;
            int v1_1 = p9.save();
            if (!this.n) {
                v4_4 = 0;
            } else {
                v4_4 = this.getPaddingBottom();
            }
            p9.rotate(1132920832);
            p9.translate(((float) ((- this.getHeight()) + v4_4)), 0);
            int v4_6 = this.L;
            if ((v4_6 == 0) || (!v4_6.draw(p9))) {
                v4_0 = 0;
            } else {
                v4_0 = 1;
            }
            p9.restoreToCount(v1_1);
        }
        int v1_3 = this.M;
        if ((v1_3 != 0) && (!v1_3.isFinished())) {
            int v1_5 = p9.save();
            if (this.n) {
                p9.translate(((float) this.getPaddingLeft()), ((float) this.getPaddingTop()));
            }
            boolean v5_19;
            boolean v5_17 = this.M;
            if ((!v5_17) || (!v5_17.draw(p9))) {
                v5_19 = 0;
            } else {
                v5_19 = 1;
            }
            v4_0 |= v5_19;
            p9.restoreToCount(v1_5);
        }
        int v1_6 = this.N;
        if ((v1_6 != 0) && (!v1_6.isFinished())) {
            float v6_11;
            int v1_8 = p9.save();
            boolean v5_20 = this.getWidth();
            if (!this.n) {
                v6_11 = 0;
            } else {
                v6_11 = this.getPaddingTop();
            }
            boolean v5_25;
            p9.rotate(1119092736);
            p9.translate(((float) v6_11), ((float) (- v5_20)));
            boolean v5_23 = this.N;
            if ((!v5_23) || (!v5_23.draw(p9))) {
                v5_25 = 0;
            } else {
                v5_25 = 1;
            }
            v4_0 |= v5_25;
            p9.restoreToCount(v1_8);
        }
        int v1_10 = this.O;
        if ((v1_10 != 0) && (!v1_10.isFinished())) {
            int v1_12 = p9.save();
            p9.rotate(1127481344);
            if (!this.n) {
                p9.translate(((float) (- this.getWidth())), ((float) (- this.getHeight())));
            } else {
                p9.translate(((float) (this.getPaddingRight() + (- this.getWidth()))), ((float) (this.getPaddingBottom() + (- this.getHeight()))));
            }
            boolean v5_7 = this.O;
            if ((v5_7) && (v5_7.draw(p9))) {
                v2 = 1;
            }
            v4_0 |= v2;
            p9.restoreToCount(v1_12);
        }
        if ((v4_0 != 0) || ((this.P == null) || ((v0.size() <= 0) || (!this.P.f())))) {
            v3_0 = v4_0;
        }
        if (v3_0 != 0) {
            this.postInvalidateOnAnimation();
        }
        return;
    }

    public final boolean drawChild(android.graphics.Canvas p1, android.view.View p2, long p3)
    {
        return super.drawChild(p1, p2, p3);
    }

    public final void e0(int p9, int p10, int[] p11)
    {
        int v9_1;
        this.j0();
        this.T();
        android.os.Trace.beginSection("RV Scroll");
        int v0_4 = this.k0;
        this.C(v0_4);
        int v1_1 = this.c;
        if (p9 == 0) {
            v9_1 = 0;
        } else {
            v9_1 = this.s.p0(p9, v1_1, v0_4);
        }
        int v10_1;
        if (p10 == 0) {
            v10_1 = 0;
        } else {
            v10_1 = this.s.r0(p10, v1_1, v0_4);
        }
        android.os.Trace.endSection();
        int v0_2 = this.f.r();
        int v1_0 = 0;
        while (v1_0 < v0_2) {
            int v3_3 = this.f.q(v1_0);
            android.view.View v4_0 = this.L(v3_3);
            if (v4_0 != null) {
                android.view.View v4_1 = v4_0.i;
                if (v4_1 != null) {
                    android.view.View v4_2 = v4_1.a;
                    int v5 = v3_3.getLeft();
                    int v3_4 = v3_3.getTop();
                    if ((v5 != v4_2.getLeft()) || (v3_4 != v4_2.getTop())) {
                        v4_2.layout(v5, v3_4, (v4_2.getWidth() + v5), (v4_2.getHeight() + v3_4));
                    }
                }
            }
            v1_0++;
        }
        this.U(1);
        this.l0(0);
        if (p11 != null) {
            p11[0] = v9_1;
            p11[1] = v10_1;
        }
        return;
    }

    public final void f0(int p2)
    {
        if (!this.C) {
            this.n0();
            String v0_1 = this.s;
            if (v0_1 != null) {
                v0_1.q0(p2);
                this.awakenScrollBars();
                return;
            } else {
                android.util.Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
        } else {
            return;
        }
    }

    public final android.view.View focusSearch(android.view.View p17, int p18)
    {
        StringBuilder v3_2;
        this.s.getClass();
        String v4_1 = 1;
        if ((this.r == null) || ((this.s == null) || ((this.P()) || (this.C)))) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        StringBuilder v3_6;
        int v6_9 = android.view.FocusFinder.getInstance();
        int v7_7 = this.k0;
        int v8_2 = this.c;
        if ((v3_2 == null) || ((p18 != 2) && (p18 != 1))) {
            int v6_10 = v6_9.findNextFocus(this, p17, p18);
            if ((v6_10 != 0) || (v3_2 == null)) {
                v3_6 = v6_10;
                if ((v3_6 == null) || (v3_6.hasFocusable())) {
                    if ((v3_6 != null) && ((v3_6 != this) && (v3_6 != p17))) {
                        if (this.D(v3_6) != null) {
                            if ((p17 != null) && (this.D(p17) != null)) {
                                int v6_6;
                                int v8_0 = this.o;
                                v8_0.set(0, 0, p17.getWidth(), p17.getHeight());
                                android.graphics.Rect v13_0 = this.p;
                                v13_0.set(0, 0, v3_6.getWidth(), v3_6.getHeight());
                                this.offsetDescendantRectToMyCoords(p17, v8_0);
                                this.offsetDescendantRectToMyCoords(v3_6, v13_0);
                                if (this.s.b.getLayoutDirection() != 1) {
                                    v6_6 = 1;
                                } else {
                                    v6_6 = -1;
                                }
                                int v5_1;
                                int v15_0 = v8_0.left;
                                int v5_0 = v13_0.left;
                                if (((v15_0 >= v5_0) && (v8_0.right > v5_0)) || (v8_0.right >= v13_0.right)) {
                                    int v12_1 = v13_0.right;
                                    if (((v8_0.right <= v12_1) && (v15_0 < v12_1)) || (v15_0 <= v5_0)) {
                                        v5_1 = 0;
                                    } else {
                                        v5_1 = -1;
                                    }
                                } else {
                                    v5_1 = 1;
                                }
                                int v7_6;
                                int v7_5 = v8_0.top;
                                int v12_2 = v13_0.top;
                                if (((v7_5 >= v12_2) && (v8_0.bottom > v12_2)) || (v8_0.bottom >= v13_0.bottom)) {
                                    int v10_1 = v13_0.bottom;
                                    if (((v8_0.bottom <= v10_1) && (v7_5 < v10_1)) || (v7_5 <= v12_2)) {
                                        v7_6 = 0;
                                    } else {
                                        v7_6 = -1;
                                    }
                                } else {
                                    v7_6 = 1;
                                }
                                if (p18 == 1) {
                                    if ((v7_6 >= 0) && ((v7_6 != 0) || ((v5_1 * v6_6) >= 0))) {
                                        v4_1 = 0;
                                    }
                                } else {
                                    if (p18 == 2) {
                                        if ((v7_6 <= 0) && ((v7_6 != 0) || ((v5_1 * v6_6) <= 0))) {
                                        }
                                    } else {
                                        if (p18 == 17) {
                                            if (v5_1 >= 0) {
                                            }
                                        } else {
                                            if (p18 == 33) {
                                                if (v7_6 >= 0) {
                                                }
                                            } else {
                                                if (p18 == 66) {
                                                    if (v5_1 <= 0) {
                                                    }
                                                } else {
                                                    if (p18 != 130) {
                                                        StringBuilder v3_4 = new StringBuilder("Invalid direction: ");
                                                        v3_4.append(p18);
                                                        throw new IllegalArgumentException(v1.a.h(this, v3_4));
                                                    } else {
                                                        if (v7_6 <= 0) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            v4_1 = 0;
                        }
                    }
                    if (v4_1 == null) {
                        return super.focusSearch(p17, p18);
                    } else {
                        return v3_6;
                    }
                } else {
                    if (this.getFocusedChild() != null) {
                        this.c0(v3_6, 0);
                        return p17;
                    } else {
                        return super.focusSearch(p17, p18);
                    }
                }
            } else {
                this.p();
                if (this.D(p17) != null) {
                    this.j0();
                    v3_6 = this.s.T(p17, p18, v8_2, v7_7);
                    this.l0(0);
                }
            }
        } else {
            StringBuilder v3_14;
            if (!this.s.e()) {
                v3_14 = 0;
            } else {
                StringBuilder v3_11;
                if (p18 != 2) {
                    v3_11 = 33;
                } else {
                    v3_11 = 130;
                }
                if (v6_9.findNextFocus(this, p17, v3_11) != null) {
                } else {
                    v3_14 = 1;
                }
            }
            if ((v3_14 == null) && (this.s.d())) {
                StringBuilder v3_18;
                if (this.s.b.getLayoutDirection() != 1) {
                    v3_18 = 0;
                } else {
                    v3_18 = 1;
                }
                int v15_5;
                if (p18 != 2) {
                    v15_5 = 0;
                } else {
                    v15_5 = 1;
                }
                StringBuilder v3_20;
                if ((v3_18 ^ v15_5) == 0) {
                    v3_20 = 17;
                } else {
                    v3_20 = 66;
                }
                if (v6_9.findNextFocus(this, p17, v3_20) != null) {
                    v3_14 = 0;
                } else {
                    v3_14 = 1;
                }
            }
            if (v3_14 != null) {
                this.p();
                if (this.D(p17) != null) {
                    this.j0();
                    this.s.T(p17, p18, v8_2, v7_7);
                    this.l0(0);
                } else {
                    return 0;
                }
            }
            v3_6 = v6_9.findNextFocus(this, p17, p18);
        }
        return 0;
    }

    public final boolean g0(android.widget.EdgeEffect p8, int p9, int p10)
    {
        if (p9 <= 0) {
            float v0_1 = (this.a * 1014350479);
            double v1_1 = ((double) androidx.recyclerview.widget.RecyclerView.I0);
            if (((float) (Math.exp(((v1_1 / (v1_1 - 4607182418800017408)) * Math.log(((double) ((((float) Math.abs((- p9))) * 1051931443) / v0_1))))) * ((double) v0_1))) >= (a.a.u(p8) * ((float) p10))) {
                return 0;
            }
        }
        return 1;
    }

    public final android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        IllegalStateException v0_0 = this.s;
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
        } else {
            return v0_0.r();
        }
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
    {
        String v0_0 = this.s;
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
        } else {
            return v0_0.s(this.getContext(), p3);
        }
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p3)
    {
        String v0_0 = this.s;
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
        } else {
            return v0_0.t(p3);
        }
    }

    public CharSequence getAccessibilityClassName()
    {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public a2.i0 getAdapter()
    {
        return this.r;
    }

    public int getBaseline()
    {
        int v0_0 = this.s;
        if (v0_0 == 0) {
            return super.getBaseline();
        } else {
            v0_0.getClass();
            return -1;
        }
    }

    public final int getChildDrawingOrder(int p1, int p2)
    {
        return super.getChildDrawingOrder(p1, p2);
    }

    public boolean getClipToPadding()
    {
        return this.n;
    }

    public a2.m1 getCompatAccessibilityDelegate()
    {
        return this.r0;
    }

    public a2.n0 getEdgeEffectFactory()
    {
        return this.K;
    }

    public a2.p0 getItemAnimator()
    {
        return this.P;
    }

    public int getItemDecorationCount()
    {
        return this.u.size();
    }

    public a2.t0 getLayoutManager()
    {
        return this.s;
    }

    public int getMaxFlingVelocity()
    {
        return this.d0;
    }

    public int getMinFlingVelocity()
    {
        return this.c0;
    }

    public long getNanoTime()
    {
        if (!androidx.recyclerview.widget.RecyclerView.K0) {
            return 0;
        } else {
            return System.nanoTime();
        }
    }

    public a2.v0 getOnFlingListener()
    {
        return this.b0;
    }

    public boolean getPreserveFocusAfterLayout()
    {
        return this.g0;
    }

    public a2.y0 getRecycledViewPool()
    {
        return this.c.c();
    }

    public int getScrollState()
    {
        return this.Q;
    }

    public final void h(a2.k1 p6)
    {
        StringBuilder v1_8;
        String v0_0 = p6.a;
        if (v0_0.getParent() != this) {
            v1_8 = 0;
        } else {
            v1_8 = 1;
        }
        this.c.m(this.L(v0_0));
        if (!p6.j()) {
            if (v1_8 != null) {
                IllegalArgumentException v6_2 = this.f;
                StringBuilder v1_4 = ((a2.h0) v6_2.c).a.indexOfChild(v0_0);
                if (v1_4 < null) {
                    StringBuilder v1_6 = new StringBuilder("view is not a child, cannot hide ");
                    v1_6.append(v0_0);
                    throw new IllegalArgumentException(v1_6.toString());
                } else {
                    ((a2.c) v6_2.d).h(v1_4);
                    v6_2.v(v0_0);
                    return;
                }
            } else {
                this.f.a(v0_0, -1, 1);
                return;
            }
        } else {
            this.f.c(v0_0, -1, v0_0.getLayoutParams(), 1);
            return;
        }
    }

    public final void h0(int p3, boolean p4, int p5)
    {
        q0.q v0_0 = this.s;
        if (v0_0 != null) {
            if (!this.C) {
                int v1_0 = 0;
                if (!v0_0.d()) {
                    p3 = 0;
                }
                if (!this.s.e()) {
                    p5 = 0;
                }
                if ((p3 != 0) || (p5 != 0)) {
                    if (p4 != null) {
                        if (p3 != 0) {
                            v1_0 = 1;
                        }
                        if (p5 != 0) {
                            v1_0 |= 2;
                        }
                        this.getScrollingChildHelper().g(v1_0, 1);
                    }
                    this.h0.c(p3, p5, -2147483648, 0);
                    return;
                }
            }
            return;
        } else {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
    }

    public final boolean hasNestedScrollingParent()
    {
        return this.getScrollingChildHelper().f(0);
    }

    public final void i(a2.q0 p3)
    {
        java.util.ArrayList v0_0 = this.s;
        if (v0_0 != null) {
            v0_0.c("Cannot add item decoration during a scroll  or layout");
        }
        java.util.ArrayList v0_1 = this.u;
        if (v0_1.isEmpty()) {
            this.setWillNotDraw(0);
        }
        v0_1.add(p3);
        this.R();
        this.requestLayout();
        return;
    }

    public final void i0(int p2)
    {
        if (!this.C) {
            String v0_1 = this.s;
            if (v0_1 != null) {
                v0_1.A0(this, p2);
                return;
            } else {
                android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
        } else {
            return;
        }
    }

    public final boolean isAttachedToWindow()
    {
        return this.x;
    }

    public final boolean isLayoutSuppressed()
    {
        return this.C;
    }

    public final boolean isNestedScrollingEnabled()
    {
        return this.getScrollingChildHelper().d;
    }

    public final void j(a2.w0 p2)
    {
        if (this.m0 == null) {
            this.m0 = new java.util.ArrayList();
        }
        this.m0.add(p2);
        return;
    }

    public final void j0()
    {
        int v0_1 = (this.A + 1);
        this.A = v0_1;
        if ((v0_1 == 1) && (!this.C)) {
            this.B = 0;
        }
        return;
    }

    public final void k(String p3)
    {
        if (!this.P()) {
            if (this.J > 0) {
                android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(v1.a.h(this, new StringBuilder(""))));
            }
            return;
        } else {
            if (p3 != null) {
                throw new IllegalStateException(p3);
            } else {
                throw new IllegalStateException(v1.a.h(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
        }
    }

    public final void k0(int p3)
    {
        int v0_1 = this.s.d();
        if (this.s.e()) {
            v0_1 |= 2;
        }
        this.getScrollingChildHelper().g(v0_1, p3);
        return;
    }

    public final void l0(boolean p4)
    {
        if (this.A < 1) {
            if (androidx.recyclerview.widget.RecyclerView.F0) {
                throw new IllegalStateException(v1.a.h(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            } else {
                this.A = 1;
            }
        }
        if ((p4 == null) && (!this.C)) {
            this.B = 0;
        }
        if (this.A == 1) {
            if ((p4 != null) && ((this.B) && ((!this.C) && ((this.s != null) && (this.r != null))))) {
                this.r();
            }
            if (!this.C) {
                this.B = 0;
            }
        }
        this.A = (this.A - 1);
        return;
    }

    public final void m()
    {
        a2.z0 v0_1 = this.f.u();
        int v1 = 0;
        int v2_2 = 0;
        while (v2_2 < v0_1) {
            a2.k1 v4_6 = androidx.recyclerview.widget.RecyclerView.M(this.f.t(v2_2));
            if (!v4_6.o()) {
                v4_6.d = -1;
                v4_6.g = -1;
            }
            v2_2++;
        }
        a2.z0 v0_2 = this.c;
        int v2_3 = v0_2.a;
        a2.k1 v4_7 = v0_2.c;
        int v5_0 = v4_7.size();
        a2.k1 v6_0 = 0;
        while (v6_0 < v5_0) {
            a2.k1 v7_1 = ((a2.k1) v4_7.get(v6_0));
            v7_1.d = -1;
            v7_1.g = -1;
            v6_0++;
        }
        a2.k1 v4_0 = v2_3.size();
        int v5_1 = 0;
        while (v5_1 < v4_0) {
            a2.k1 v6_2 = ((a2.k1) v2_3.get(v5_1));
            v6_2.d = -1;
            v6_2.g = -1;
            v5_1++;
        }
        int v2_0 = v0_2.b;
        if (v2_0 != 0) {
            int v2_1 = v2_0.size();
            while (v1 < v2_1) {
                a2.k1 v4_3 = ((a2.k1) v0_2.b.get(v1));
                v4_3.d = -1;
                v4_3.g = -1;
                v1++;
            }
        }
        return;
    }

    public final void m0(int p2)
    {
        this.getScrollingChildHelper().h(p2);
        return;
    }

    public final void n(int p3, int p4)
    {
        int v0_1;
        int v0_0 = this.L;
        if ((v0_0 == 0) || ((v0_0.isFinished()) || (p3))) {
            v0_1 = 0;
        } else {
            this.L.onRelease();
            v0_1 = this.L.isFinished();
        }
        boolean v1_0 = this.N;
        if ((v1_0) && ((!v1_0.isFinished()) && (p3))) {
            this.N.onRelease();
            v0_1 |= this.N.isFinished();
        }
        boolean v3_4 = this.M;
        if ((v3_4) && ((!v3_4.isFinished()) && (p4 > 0))) {
            this.M.onRelease();
            v0_1 |= this.M.isFinished();
        }
        boolean v3_9 = this.O;
        if ((v3_9) && ((!v3_9.isFinished()) && (p4 < 0))) {
            this.O.onRelease();
            v0_1 |= this.O.isFinished();
        }
        if (v0_1 != 0) {
            this.postInvalidateOnAnimation();
        }
        return;
    }

    public final void n0()
    {
        this.setScrollState(0);
        a2.b0 v0_1 = this.h0;
        v0_1.m.removeCallbacks(v0_1);
        v0_1.c.abortAnimation();
        a2.b0 v0_3 = this.s;
        if (v0_3 != null) {
            a2.b0 v0_4 = v0_3.e;
            if (v0_4 != null) {
                v0_4.i();
            }
        }
        return;
    }

    public final void onAttachedToWindow()
    {
        a2.t v2_0;
        super.onAttachedToWindow();
        this.I = 0;
        this.x = 1;
        if ((!this.z) || (this.isLayoutRequested())) {
            v2_0 = 0;
        } else {
            v2_0 = 1;
        }
        this.z = v2_0;
        this.c.e();
        a2.t v2_2 = this.s;
        if (v2_2 != null) {
            v2_2.g = 1;
            v2_2.R(this);
        }
        this.q0 = 0;
        if (androidx.recyclerview.widget.RecyclerView.K0) {
            IllegalStateException v0_2 = a2.t.e;
            String v1_1 = ((a2.t) v0_2.get());
            this.i0 = v1_1;
            if (v1_1 == null) {
                String v1_6;
                this.i0 = new a2.t();
                String v1_5 = this.getDisplay();
                if ((this.isInEditMode()) || (v1_5 == null)) {
                    v1_6 = 1114636288;
                } else {
                    v1_6 = v1_5.getRefreshRate();
                    if (v1_6 < 1106247680) {
                    }
                }
                a2.t v2_6 = this.i0;
                v2_6.c = ((long) (1315859240 / v1_6));
                v0_2.set(v2_6);
            }
            IllegalStateException v0_4 = this.i0.a;
            if ((androidx.recyclerview.widget.RecyclerView.F0) && (v0_4.contains(this))) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            } else {
                v0_4.add(this);
            }
        }
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        IllegalStateException v0_0 = this.P;
        if (v0_0 != null) {
            v0_0.e();
        }
        this.n0();
        IllegalStateException v0_8 = 0;
        this.x = 0;
        String v1_10 = this.s;
        if (v1_10 != null) {
            v1_10.g = 0;
            v1_10.S(this);
        }
        this.x0.clear();
        this.removeCallbacks(this.y0);
        this.m.getClass();
        while (a2.u1.d.a() != null) {
        }
        String v1_5 = this.c;
        int v2_0 = v1_5.c;
        int v3_0 = 0;
        while (v3_0 < v2_0.size()) {
            w0.a.a(((a2.k1) v2_0.get(v3_0)).a);
            v3_0++;
        }
        v1_5.f(v1_5.h.r, 0);
        while (v0_8 < this.getChildCount()) {
            String v1_9 = (v0_8 + 1);
            IllegalStateException v0_9 = this.getChildAt(v0_8);
            if (v0_9 == null) {
                throw new IndexOutOfBoundsException();
            } else {
                int v3_2 = ((w0.b) v0_9.getTag(2131362307));
                if (v3_2 == 0) {
                    v3_2 = new w0.b();
                    v0_9.setTag(2131362307, v3_2);
                }
                IllegalStateException v0_12 = v3_2.a;
                int v2_4 = a.a.y(v0_12);
                if (-1 < v2_4) {
                    v0_12.get(v2_4).getClass();
                    throw new ClassCastException();
                } else {
                    v0_8 = v1_9;
                }
            }
        }
        if (androidx.recyclerview.widget.RecyclerView.K0) {
            IllegalStateException v0_2 = this.i0;
            if (v0_2 != null) {
                boolean vtmp10 = v0_2.a.remove(this);
                if ((androidx.recyclerview.widget.RecyclerView.F0) && (!vtmp10)) {
                    throw new IllegalStateException("RecyclerView removal failed!");
                } else {
                    this.i0 = 0;
                }
            }
        }
        return;
    }

    public final void onDraw(android.graphics.Canvas p4)
    {
        super.onDraw(p4);
        java.util.ArrayList v4_1 = this.u;
        int v0 = v4_1.size();
        int v1 = 0;
        while (v1 < v0) {
            ((a2.q0) v4_1.get(v1)).a(this);
            v1++;
        }
        return;
    }

    public final boolean onGenericMotionEvent(android.view.MotionEvent p18)
    {
        if ((this.s != null) && ((!this.C) && (p18.getAction() == 8))) {
            boolean v9;
            int v3_5;
            int v8;
            int v2_3 = 0;
            if ((p18.getSource() & 2) == 0) {
                if ((p18.getSource() & 4194304) == 0) {
                    v3_5 = 0;
                    v8 = 0;
                    v9 = 0;
                } else {
                    v3_5 = p18.getAxisValue(26);
                    if (!this.s.e()) {
                        if (!this.s.d()) {
                            v3_5 = 0;
                        }
                    } else {
                        boolean v16 = (- v3_5);
                        v3_5 = 0;
                        v2_3 = v16;
                    }
                    v8 = 26;
                    v9 = this.C0;
                }
            } else {
                a2.t v1_19;
                if (!this.s.e()) {
                    v1_19 = 0;
                } else {
                    v1_19 = (- p18.getAxisValue(9));
                }
                if (this.s.d()) {
                    v2_3 = p18.getAxisValue(10);
                }
                v3_5 = v2_3;
                v8 = 0;
                v9 = 0;
                v2_3 = v1_19;
            }
            a2.t v1_24 = ((int) (v2_3 * this.f0));
            int v2_7 = ((int) (v3_5 * this.e0));
            if (!v9) {
                int v3_10 = this.s;
                if (v3_10 != 0) {
                    if (!this.C) {
                        int v3_12;
                        int[] v11 = this.w0;
                        v11[0] = 0;
                        v11[1] = 0;
                        boolean v12 = v3_10.d();
                        boolean v13 = this.s.e();
                        if (!v13) {
                            v3_12 = v12;
                        } else {
                            v3_12 = (v12 | 2);
                        }
                        a2.t v1_0;
                        int[] v4_10 = p18.getY();
                        int[] v5_2 = p18.getX();
                        int v14 = (v2_7 - this.a0(v2_7, v4_10));
                        int v15 = (v1_24 - this.b0(v1_24, v5_2));
                        this.getScrollingChildHelper().g(v3_12, 1);
                        if (!v12) {
                            v1_0 = 0;
                        } else {
                            v1_0 = v14;
                        }
                        int v2_0;
                        if (!v13) {
                            v2_0 = 0;
                        } else {
                            v2_0 = v15;
                        }
                        if (this.u(v1_0, v2_0, 1, this.w0, this.u0)) {
                            v14 -= v11[0];
                            v15 -= v11[1];
                        }
                        a2.t v1_4;
                        if (!v12) {
                            v1_4 = 0;
                        } else {
                            v1_4 = v14;
                        }
                        int v2_1;
                        if (!v13) {
                            v2_1 = 0;
                        } else {
                            v2_1 = v15;
                        }
                        this.d0(v1_4, v2_1, p18, 1);
                        a2.t v1_6 = this.i0;
                        if ((v1_6 != null) && ((v14 != 0) || (v15 != 0))) {
                            v1_6.a(this, v14, v15);
                        }
                        this.m0(1);
                    }
                } else {
                    android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                }
            } else {
                int v3_2 = this.h0.c;
                this.h0(((v3_2.getFinalX() - v3_2.getCurrX()) + v2_7), 1, ((v3_2.getFinalY() - v3_2.getCurrY()) + v1_24));
            }
            if ((v8 != 0) && (!v9)) {
                this.E0.a(p18, v8);
            }
        }
        return 0;
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent p10)
    {
        if (!this.C) {
            this.w = 0;
            if (!this.E(p10)) {
                int v0_33 = this.s;
                if (v0_33 != 0) {
                    int v0_3 = v0_33.d();
                    float v3_2 = this.s.e();
                    if (this.S == null) {
                        this.S = android.view.VelocityTracker.obtain();
                    }
                    this.S.addMovement(p10);
                    float v4_18 = p10.getActionMasked();
                    int v5_3 = p10.getActionIndex();
                    if (v4_18 == 0) {
                        if (this.D) {
                            this.D = 0;
                        }
                        int v0_1;
                        this.R = p10.getPointerId(0);
                        int v0_22 = ((int) (p10.getX() + 1056964608));
                        this.V = v0_22;
                        this.T = v0_22;
                        int v0_25 = ((int) (p10.getY() + 1056964608));
                        this.W = v0_25;
                        this.U = v0_25;
                        int v0_26 = this.L;
                        if ((v0_26 == 0) || ((a.a.u(v0_26) == 0) || (this.canScrollHorizontally(-1)))) {
                            v0_1 = 0;
                        } else {
                            a.a.N(this.L, 0, (1065353216 - (p10.getY() / ((float) this.getHeight()))));
                            v0_1 = 1;
                        }
                        float v7_6 = this.N;
                        if ((v7_6 != 0) && ((a.a.u(v7_6) != 0) && (!this.canScrollHorizontally(1)))) {
                            a.a.N(this.N, 0, (p10.getY() / ((float) this.getHeight())));
                            v0_1 = 1;
                        }
                        float v7_12 = this.M;
                        if ((v7_12 != 0) && ((a.a.u(v7_12) != 0) && (!this.canScrollVertically(-1)))) {
                            a.a.N(this.M, 0, (p10.getX() / ((float) this.getWidth())));
                            v0_1 = 1;
                        }
                        float v4_2 = this.O;
                        if ((v4_2 != 0) && ((a.a.u(v4_2) != 0) && (!this.canScrollVertically(1)))) {
                            a.a.N(this.O, 0, (1065353216 - (p10.getX() / ((float) this.getWidth()))));
                            v0_1 = 1;
                        }
                        if ((v0_1 != 0) || (this.Q == 2)) {
                            this.getParent().requestDisallowInterceptTouchEvent(1);
                            this.setScrollState(1);
                            this.m0(1);
                        }
                        int[] v10_5 = this.v0;
                        v10_5[1] = 0;
                        v10_5[0] = 0;
                        this.k0(0);
                    } else {
                        if (v4_18 == 1) {
                            this.S.clear();
                            this.m0(0);
                        } else {
                            if (v4_18 == 2) {
                                float v4_9 = p10.findPointerIndex(this.R);
                                if (v4_9 >= 0) {
                                    int v5_2 = ((int) (p10.getX(v4_9) + 1056964608));
                                    int[] v10_9 = ((int) (p10.getY(v4_9) + 1056964608));
                                    if (this.Q != 1) {
                                        int v0_5;
                                        int v6_1 = (v10_9 - this.U);
                                        if ((v0_3 == 0) || (Math.abs((v5_2 - this.T)) <= this.a0)) {
                                            v0_5 = 0;
                                        } else {
                                            this.V = v5_2;
                                            v0_5 = 1;
                                        }
                                        if ((v3_2 != 0) && (Math.abs(v6_1) > this.a0)) {
                                            this.W = v10_9;
                                            v0_5 = 1;
                                        }
                                        if (v0_5 != 0) {
                                            this.setScrollState(1);
                                        }
                                    }
                                } else {
                                    int[] v10_11 = new StringBuilder("Error processing scroll; pointer index for id ");
                                    v10_11.append(this.R);
                                    v10_11.append(" not found. Did any MotionEvents get skipped?");
                                    android.util.Log.e("RecyclerView", v10_11.toString());
                                    return 0;
                                }
                            } else {
                                if (v4_18 == 3) {
                                    int[] v10_13 = this.S;
                                    if (v10_13 != null) {
                                        v10_13.clear();
                                    }
                                    this.m0(0);
                                    this.Z();
                                    this.setScrollState(0);
                                } else {
                                    if (v4_18 == 5) {
                                        this.R = p10.getPointerId(v5_3);
                                        int v0_15 = ((int) (p10.getX(v5_3) + 1056964608));
                                        this.V = v0_15;
                                        this.T = v0_15;
                                        int[] v10_16 = ((int) (p10.getY(v5_3) + 1056964608));
                                        this.W = v10_16;
                                        this.U = v10_16;
                                    } else {
                                        if (v4_18 == 6) {
                                            this.V(p10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.Q == 1) {
                        return 1;
                    }
                }
            } else {
                int[] v10_18 = this.S;
                if (v10_18 != null) {
                    v10_18.clear();
                }
                this.m0(0);
                this.Z();
                this.setScrollState(0);
                return 1;
            }
        }
        return 0;
    }

    public final void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        android.os.Trace.beginSection("RV OnLayout");
        this.r();
        android.os.Trace.endSection();
        this.z = 1;
        return;
    }

    public final void onMeasure(int p7, int p8)
    {
        a2.t0 v0_0 = this.s;
        if (v0_0 != null) {
            int v1_0 = 0;
            a2.g1 v2 = this.k0;
            if (!v0_0.K()) {
                if (!this.y) {
                    if (!v2.k) {
                        a2.t0 v0_1 = this.r;
                        if (v0_1 == null) {
                            v2.e = 0;
                        } else {
                            v2.e = v0_1.a();
                        }
                        this.j0();
                        this.s.b.q(p7, p8);
                        this.l0(0);
                        v2.g = 0;
                        return;
                    } else {
                        this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
                        return;
                    }
                } else {
                    this.s.b.q(p7, p8);
                    return;
                }
            } else {
                a2.t0 v0_8 = android.view.View$MeasureSpec.getMode(p7);
                int v3_0 = android.view.View$MeasureSpec.getMode(p8);
                this.s.b.q(p7, p8);
                if ((v0_8 == 1073741824) && (v3_0 == 1073741824)) {
                    v1_0 = 1;
                }
                this.z0 = v1_0;
                if ((v1_0 == 0) && (this.r != null)) {
                    if (v2.d == 1) {
                        this.s();
                    }
                    this.s.t0(p7, p8);
                    v2.i = 1;
                    this.t();
                    this.s.v0(p7, p8);
                    if (this.s.y0()) {
                        this.s.t0(android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824));
                        v2.i = 1;
                        this.t();
                        this.s.v0(p7, p8);
                    }
                    this.A0 = this.getMeasuredWidth();
                    this.B0 = this.getMeasuredHeight();
                }
                return;
            }
        } else {
            this.q(p7, p8);
            return;
        }
    }

    public final boolean onRequestFocusInDescendants(int p2, android.graphics.Rect p3)
    {
        if (!this.P()) {
            return super.onRequestFocusInDescendants(p2, p3);
        } else {
            return 0;
        }
    }

    public final void onRestoreInstanceState(android.os.Parcelable p2)
    {
        if ((p2 instanceof a2.d1)) {
            this.d = ((a2.d1) p2);
            super.onRestoreInstanceState(((a2.d1) p2).a);
            this.requestLayout();
            return;
        } else {
            super.onRestoreInstanceState(p2);
            return;
        }
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        a2.d1 v0_1 = new a2.d1(super.onSaveInstanceState());
        int v1_3 = this.d;
        if (v1_3 == 0) {
            int v1_4 = this.s;
            if (v1_4 == 0) {
                v0_1.c = 0;
                return v0_1;
            } else {
                v0_1.c = v1_4.g0();
                return v0_1;
            }
        } else {
            v0_1.c = v1_3.c;
            return v0_1;
        }
    }

    public final void onSizeChanged(int p1, int p2, int p3, int p4)
    {
        super.onSizeChanged(p1, p2, p3, p4);
        if ((p1 == p3) && (p2 == p4)) {
            return;
        } else {
            this.O = 0;
            this.M = 0;
            this.N = 0;
            this.L = 0;
            return;
        }
    }

    public final boolean onTouchEvent(android.view.MotionEvent p19)
    {
        android.view.MotionEvent v6 = p19;
        if ((!this.C) && (!this.D)) {
            int v1_2;
            int v1_59 = this.w;
            if (v1_59 != 0) {
                int[] v5_6 = v1_59.b;
                if (v1_59.v != 0) {
                    if (p19.getAction() != 0) {
                        if ((p19.getAction() != 1) || (v1_59.v != 2)) {
                            if ((p19.getAction() == 2) && (v1_59.v == 2)) {
                                v1_59.g();
                                if (v1_59.w == 1) {
                                    androidx.recyclerview.widget.RecyclerView v9_12 = p19.getX();
                                    int v13_5 = v1_59.y;
                                    v13_5[0] = v5_6;
                                    float v11_2 = (v1_59.q - v5_6);
                                    v13_5[1] = v11_2;
                                    float v12_2 = Math.max(((float) v5_6), Math.min(((float) v11_2), v9_12));
                                    if (Math.abs((((float) v1_59.o) - v12_2)) >= 1073741824) {
                                        androidx.recyclerview.widget.RecyclerView v9_22 = a2.p.e(v1_59.p, v12_2, v13_5, v1_59.s.computeHorizontalScrollRange(), v1_59.s.computeHorizontalScrollOffset(), v1_59.q);
                                        if (v9_22 != null) {
                                            v1_59.s.scrollBy(v9_22, 0);
                                        }
                                        v1_59.p = v12_2;
                                    }
                                }
                                if (v1_59.w == 2) {
                                    androidx.recyclerview.widget.RecyclerView v9_24 = p19.getY();
                                    int v13_6 = v1_59.x;
                                    v13_6[0] = v5_6;
                                    float v11_7 = (v1_59.r - v5_6);
                                    v13_6[1] = v11_7;
                                    float v12_3 = Math.max(((float) v5_6), Math.min(((float) v11_7), v9_24));
                                    if (Math.abs((((float) v1_59.l) - v12_3)) >= 1073741824) {
                                        int[] v5_0 = a2.p.e(v1_59.m, v12_3, v13_6, v1_59.s.computeVerticalScrollRange(), v1_59.s.computeVerticalScrollOffset(), v1_59.r);
                                        if (v5_0 != null) {
                                            v1_59.s.scrollBy(0, v5_0);
                                        }
                                        v1_59.m = v12_3;
                                    }
                                }
                            }
                        } else {
                            v1_59.m = 0;
                            v1_59.p = 0;
                            v1_59.f(1);
                            v1_59.w = 0;
                        }
                    } else {
                        int[] v5_2 = v1_59.d(p19.getX(), p19.getY());
                        androidx.recyclerview.widget.RecyclerView v9_3 = v1_59.c(v6.getX(), v6.getY());
                        if ((v5_2 != null) || (v9_3 != null)) {
                            if (v9_3 == null) {
                                if (v5_2 != null) {
                                    v1_59.w = 2;
                                    v1_59.m = ((float) ((int) p19.getY()));
                                }
                            } else {
                                v1_59.w = 1;
                                v1_59.p = ((float) ((int) p19.getX()));
                            }
                            v1_59.f(2);
                        }
                    }
                }
                int v1_0 = p19.getAction();
                if ((v1_0 == 3) || (v1_0 == 1)) {
                    this.w = 0;
                }
                v1_2 = 1;
            } else {
                if (p19.getAction() != 0) {
                    v1_2 = this.E(p19);
                } else {
                    v1_2 = 0;
                }
            }
            if (v1_2 == 0) {
                int v1_4 = this.s;
                if (v1_4 != 0) {
                    androidx.recyclerview.widget.RecyclerView v9_5 = v1_4.d();
                    int v10_1 = this.s.e();
                    if (this.S == null) {
                        this.S = android.view.VelocityTracker.obtain();
                    }
                    int v1_8 = p19.getActionMasked();
                    int[] v5_10 = p19.getActionIndex();
                    float v11_0 = this.v0;
                    if (v1_8 == 0) {
                        v11_0[1] = 0;
                        v11_0[0] = 0;
                    }
                    float v12_0 = android.view.MotionEvent.obtain(p19);
                    v12_0.offsetLocation(((float) v11_0[0]), ((float) v11_0[1]));
                    if (v1_8 == 0) {
                        this.R = p19.getPointerId(0);
                        int v1_12 = ((int) (p19.getX() + 1056964608));
                        this.V = v1_12;
                        this.T = v1_12;
                        int v1_15 = ((int) (p19.getY() + 1056964608));
                        this.W = v1_15;
                        this.U = v1_15;
                        this.k0(0);
                        this.S.addMovement(v12_0);
                    } else {
                        if (v1_8 == 1) {
                            int v1_19;
                            this.S.addMovement(v12_0);
                            int v3_0 = this.d0;
                            this.S.computeCurrentVelocity(1000, ((float) v3_0));
                            if (v9_5 == null) {
                                v1_19 = 0;
                            } else {
                                v1_19 = (- this.S.getXVelocity(this.R));
                            }
                            a2.t v2_2;
                            if (v10_1 == 0) {
                                v2_2 = 0;
                            } else {
                                v2_2 = (- this.S.getYVelocity(this.R));
                            }
                            if (((v1_19 == 0) && (v2_2 == 0)) || (!this.I(((int) v1_19), ((int) v2_2), this.c0, v3_0))) {
                                this.setScrollState(0);
                            }
                            int v1_24 = this.S;
                            if (v1_24 != 0) {
                                v1_24.clear();
                            }
                            this.m0(0);
                            this.Z();
                        } else {
                            if (v1_8 == 2) {
                                int v1_26 = p19.findPointerIndex(this.R);
                                if (v1_26 >= 0) {
                                    int v14_2 = ((int) (p19.getX(v1_26) + 1056964608));
                                    int v13_3 = ((int) (p19.getY(v1_26) + 1056964608));
                                    int v1_30 = (this.V - v14_2);
                                    a2.t v2_9 = (this.W - v13_3);
                                    if (this.Q != 1) {
                                        int v3_4;
                                        if (v9_5 == null) {
                                            v3_4 = 0;
                                        } else {
                                            if (v1_30 <= 0) {
                                                v1_30 = Math.min(0, (v1_30 + this.a0));
                                            } else {
                                                v1_30 = Math.max(0, (v1_30 - this.a0));
                                            }
                                            if (v1_30 == 0) {
                                            } else {
                                                v3_4 = 1;
                                            }
                                        }
                                        if (v10_1 != 0) {
                                            if (v2_9 <= null) {
                                                v2_9 = Math.min(0, (v2_9 + this.a0));
                                            } else {
                                                v2_9 = Math.max(0, (v2_9 - this.a0));
                                            }
                                            if (v2_9 != null) {
                                                v3_4 = 1;
                                            }
                                        }
                                        if (v3_4 != 0) {
                                            this.setScrollState(1);
                                        }
                                    }
                                    if (this.Q != 1) {
                                    } else {
                                        int v1_35;
                                        int[] v15_0 = this.w0;
                                        v15_0[0] = 0;
                                        v15_0[1] = 0;
                                        int v16_0 = (v1_30 - this.a0(v1_30, p19.getY()));
                                        int v17 = (v2_9 - this.b0(v2_9, p19.getX()));
                                        if (v9_5 == null) {
                                            v1_35 = 0;
                                        } else {
                                            v1_35 = v16_0;
                                        }
                                        a2.t v2_12;
                                        if (v10_1 == 0) {
                                            v2_12 = 0;
                                        } else {
                                            v2_12 = v17;
                                        }
                                        a2.t v2_13 = this.u0;
                                        if (this.u(v1_35, v2_12, 0, this.w0, this.u0)) {
                                            v16_0 -= v15_0[0];
                                            v17 -= v15_0[1];
                                            v11_0[0] = (v11_0[0] + v2_13[0]);
                                            v11_0[1] = (v11_0[int v8] + v2_13[1]);
                                            this.getParent().requestDisallowInterceptTouchEvent(1);
                                        }
                                        a2.t v2_15;
                                        int v1_44 = v16_0;
                                        int v3_11 = v17;
                                        this.V = (v14_2 - v2_13[0]);
                                        this.W = (v13_3 - v2_13[1]);
                                        if (v9_5 == null) {
                                            v2_15 = 0;
                                        } else {
                                            v2_15 = v1_44;
                                        }
                                        int v4_7;
                                        if (v10_1 == 0) {
                                            v4_7 = 0;
                                        } else {
                                            v4_7 = v3_11;
                                        }
                                        if (this.d0(v2_15, v4_7, p19, 0)) {
                                            this.getParent().requestDisallowInterceptTouchEvent(1);
                                        }
                                        a2.t v2_18 = this.i0;
                                        if ((v2_18 == null) || ((v1_44 == 0) && (v3_11 == 0))) {
                                        } else {
                                            v2_18.a(this, v1_44, v3_11);
                                        }
                                    }
                                } else {
                                    int v1_46 = new StringBuilder("Error processing scroll; pointer index for id ");
                                    v1_46.append(this.R);
                                    v1_46.append(" not found. Did any MotionEvents get skipped?");
                                    android.util.Log.e("RecyclerView", v1_46.toString());
                                    return 0;
                                }
                            } else {
                                if (v1_8 == 3) {
                                    int v1_48 = this.S;
                                    if (v1_48 != 0) {
                                        v1_48.clear();
                                    }
                                    this.m0(0);
                                    this.Z();
                                    this.setScrollState(0);
                                } else {
                                    if (v1_8 == 5) {
                                        this.R = p19.getPointerId(v5_10);
                                        int v1_52 = ((int) (p19.getX(v5_10) + 1056964608));
                                        this.V = v1_52;
                                        this.T = v1_52;
                                        int v1_55 = ((int) (p19.getY(v5_10) + 1056964608));
                                        this.W = v1_55;
                                        this.U = v1_55;
                                    } else {
                                        if (v1_8 == 6) {
                                            this.V(p19);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    v12_0.recycle();
                    return 1;
                }
            } else {
                int v1_57 = this.S;
                if (v1_57 != 0) {
                    v1_57.clear();
                }
                this.m0(0);
                this.Z();
                this.setScrollState(0);
                return 1;
            }
        }
        return 0;
    }

    public final void p()
    {
        if ((this.z) && (!this.G)) {
            if (this.e.h()) {
                this.e.getClass();
                if (this.e.h()) {
                    android.os.Trace.beginSection("RV FullInvalidate");
                    this.r();
                    android.os.Trace.endSection();
                }
            }
            return;
        } else {
            android.os.Trace.beginSection("RV FullInvalidate");
            this.r();
            android.os.Trace.endSection();
            return;
        }
    }

    public final void q(int p3, int p4)
    {
        this.setMeasuredDimension(a2.t0.g(p3, (this.getPaddingRight() + this.getPaddingLeft()), this.getMinimumWidth()), a2.t0.g(p4, (this.getPaddingBottom() + this.getPaddingTop()), this.getMinimumHeight()));
        return;
    }

    public final void r()
    {
        if (this.r != null) {
            if (this.s != null) {
                String v4_9;
                IllegalStateException v1_10 = this.k0;
                android.view.View v3_9 = 0;
                v1_10.i = 0;
                boolean v5_0 = 1;
                if ((!this.z0) || ((this.A0 == this.getWidth()) && (this.B0 == this.getHeight()))) {
                    v4_9 = 0;
                } else {
                    v4_9 = 1;
                }
                this.A0 = 0;
                this.B0 = 0;
                this.z0 = 0;
                if (v1_10.d != 1) {
                    int v6_6 = this.e;
                    if (((((java.util.ArrayList) v6_6.d).isEmpty()) || (((java.util.ArrayList) v6_6.c).isEmpty())) && ((v4_9 == null) && ((this.s.n == this.getWidth()) && (this.s.o == this.getHeight())))) {
                        this.s.s0(this);
                    } else {
                        this.s.s0(this);
                        this.t();
                    }
                } else {
                    this.s();
                    this.s.s0(this);
                    this.t();
                }
                int v17_1;
                v1_10.a(4);
                this.j0();
                this.T();
                v1_10.d = 1;
                boolean v8_15 = this.c;
                android.view.View v9_2 = this.m;
                if (!v1_10.j) {
                    v17_1 = 1;
                } else {
                    int v6_22 = (this.f.r() - 1);
                    while (v6_22 >= 0) {
                        int v17_0;
                        boolean v10_9 = androidx.recyclerview.widget.RecyclerView.M(this.f.q(v6_22));
                        if (!v10_9.o()) {
                            a2.k1 v11_6 = this.K(v10_9);
                            this.P.getClass();
                            java.util.ArrayList v13_10 = new a2.o0();
                            v13_10.a(v10_9);
                            long v15_3 = ((r.j) v9_2.b);
                            int v14_4 = ((a2.k1) ((r.g) v9_2.c).b(v11_6));
                            if ((v14_4 == 0) || (v14_4.o())) {
                                v17_0 = v5_0;
                                v9_2.i(v10_9, v13_10);
                            } else {
                                boolean v5_9;
                                v17_0 = v5_0;
                                boolean v5_6 = ((a2.u1) v15_3.get(v14_4));
                                if ((!v5_6) || ((v5_6.a & 1) == 0)) {
                                    v5_9 = 0;
                                } else {
                                    v5_9 = v17_0;
                                }
                                long v15_8;
                                long v15_5 = ((a2.u1) v15_3.get(v10_9));
                                if ((v15_5 == 0) || ((v15_5.a & 1) == 0)) {
                                    v15_8 = 0;
                                } else {
                                    v15_8 = v17_0;
                                }
                                if ((!v5_9) || (v14_4 != v10_9)) {
                                    android.view.View v7_14 = v9_2.z(v14_4, 4);
                                    v9_2.i(v10_9, v13_10);
                                    java.util.ArrayList v13_12 = v9_2.z(v10_9, 8);
                                    if (v7_14 != null) {
                                        v14_4.n(0);
                                        if (v5_9) {
                                            this.h(v14_4);
                                        }
                                        if (v14_4 != v10_9) {
                                            if (v15_8 != 0) {
                                                this.h(v10_9);
                                            }
                                            v14_4.h = v10_9;
                                            this.h(v14_4);
                                            v8_15.m(v14_4);
                                            v10_9.n(0);
                                            v10_9.i = v14_4;
                                        }
                                        if (this.P.a(v14_4, v10_9, v7_14, v13_12)) {
                                            this.W();
                                        }
                                    } else {
                                        boolean v5_13 = this.f.r();
                                        android.view.View v7_15 = 0;
                                        while (v7_15 < v5_13) {
                                            java.util.ArrayList v13_15 = androidx.recyclerview.widget.RecyclerView.M(this.f.q(v7_15));
                                            if ((v13_15 == v10_9) || (this.K(v13_15) != v11_6)) {
                                                v7_15++;
                                            } else {
                                                IllegalStateException v1_2 = this.r;
                                                if ((v1_2 == null) || (!v1_2.b)) {
                                                    android.view.View v3_15 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                                    v3_15.append(v13_15);
                                                    v3_15.append(" \n View Holder 2:");
                                                    v3_15.append(v10_9);
                                                    throw new IllegalStateException(v1.a.h(this, v3_15));
                                                } else {
                                                    android.view.View v3_17 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                    v3_17.append(v13_15);
                                                    v3_17.append(" \n View Holder 2:");
                                                    v3_17.append(v10_9);
                                                    throw new IllegalStateException(v1.a.h(this, v3_17));
                                                }
                                            }
                                        }
                                        boolean v5_15 = new StringBuilder("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
                                        v5_15.append(v14_4);
                                        v5_15.append(" cannot be found but it is necessary for ");
                                        v5_15.append(v10_9);
                                        v5_15.append(this.B());
                                        android.util.Log.e("RecyclerView", v5_15.toString());
                                    }
                                } else {
                                    v9_2.i(v10_9, v13_10);
                                }
                            }
                        } else {
                            v17_0 = v5_0;
                        }
                        v6_22--;
                        v5_0 = v17_0;
                    }
                    v17_1 = v5_0;
                    int v2_31 = ((r.j) v9_2.b);
                    String v4_10 = (v2_31.c - 1);
                    while (v4_10 >= null) {
                        android.view.View v7_5;
                        a2.k1 v11_4 = ((a2.k1) v2_31.g(v4_10));
                        boolean v5_4 = ((a2.u1) v2_31.h(v4_10));
                        int v6_5 = v5_4.a;
                        boolean v10_2 = this.D0;
                        if ((v6_5 & 3) != 3) {
                            if ((v6_5 & 1) == 0) {
                                if ((v6_5 & 14) != 14) {
                                    if ((v6_5 & 12) != 12) {
                                        if ((v6_5 & 4) == 0) {
                                            v7_5 = 0;
                                            if ((v6_5 & 8) != 0) {
                                                v10_2.f(v11_4, v5_4.b, v5_4.c);
                                            }
                                        } else {
                                            v7_5 = 0;
                                            v10_2.h(v11_4, v5_4.b, 0);
                                        }
                                        v3_9 = 0;
                                    } else {
                                        int v6_8 = v5_4.b;
                                        android.view.View v7_7 = v5_4.c;
                                        v10_2.getClass();
                                        v11_4.n(v3_9);
                                        boolean v10_3 = v10_2.a;
                                        if (!v10_3.G) {
                                            android.view.View v3_11;
                                            int v6_9;
                                            a2.k1 v12_8 = ((a2.k) v10_3.P);
                                            v12_8.getClass();
                                            java.util.ArrayList v13_6 = v6_8.a;
                                            int v14_0 = v7_7.a;
                                            if ((v13_6 == v14_0) && (v6_8.b == v7_7.b)) {
                                                v12_8.c(v11_4);
                                                v3_11 = v10_3;
                                                v6_9 = 0;
                                            } else {
                                                v3_11 = v10_3;
                                                v6_9 = v12_8.g(v11_4, v13_6, v6_8.b, v14_0, v7_7.b);
                                            }
                                            if (v6_9 != 0) {
                                                v3_11.W();
                                            }
                                        } else {
                                            if (v10_3.P.a(v11_4, v11_4, v6_8, v7_7)) {
                                                v10_3.W();
                                            }
                                        }
                                        v3_9 = 0;
                                        v7_5 = 0;
                                    }
                                } else {
                                    v10_2.f(v11_4, v5_4.b, v5_4.c);
                                }
                            } else {
                                int v6_12 = v5_4.b;
                                if (v6_12 != 0) {
                                    v10_2.h(v11_4, v6_12, v5_4.c);
                                } else {
                                    int v6_13 = v10_2.a;
                                    v6_13.s.l0(v11_4.a, v6_13.c);
                                }
                            }
                        } else {
                            int v6_16 = v10_2.a;
                            v6_16.s.l0(v11_4.a, v6_16.c);
                        }
                        v5_4.a = v3_9;
                        v5_4.b = v7_5;
                        v5_4.c = v7_5;
                        a2.u1.d.c(v5_4);
                        v4_10--;
                        v3_9 = 0;
                    }
                }
                android.view.View v7_0 = 0;
                this.s.k0(v8_15);
                v1_10.b = v1_10.e;
                android.view.View v3_0 = 0;
                this.G = 0;
                this.H = 0;
                v1_10.j = 0;
                v1_10.k = 0;
                this.s.f = 0;
                int v2_35 = v8_15.b;
                if (v2_35 != 0) {
                    v2_35.clear();
                }
                int v2_36 = this.s;
                if (v2_36.k) {
                    v2_36.j = 0;
                    v2_36.k = 0;
                    v8_15.n();
                }
                int v2_2;
                this.s.e0(v1_10);
                int v2_1 = v17_1;
                this.U(v2_1);
                this.l0(0);
                ((r.j) v9_2.b).clear();
                ((r.g) v9_2.c).a();
                String v4_4 = this.s0;
                boolean v5_1 = v4_4[0];
                int v6_0 = v4_4[v2_1];
                this.F(v4_4);
                if ((v4_4[0] == v5_1) && (v4_4[v2_1] == v6_0)) {
                    v2_2 = 0;
                } else {
                    v2_2 = 1;
                }
                if (v2_2 != 0) {
                    this.w(0, 0);
                }
                if (((this.g0) && ((this.r != null) && ((this.hasFocus()) && ((this.getDescendantFocusability() != 393216) && ((this.getDescendantFocusability() != 131072) || (!this.isFocused())))))) && ((this.isFocused()) || (((java.util.ArrayList) this.f.e).contains(this.getFocusedChild())))) {
                    a2.k1 v11_0;
                    boolean v8_6 = v1_10.m;
                    if (v8_6 == -1) {
                        v11_0 = 0;
                    } else {
                        int v2_14 = this.r.b;
                        if ((v2_14 != 0) && (v2_14 != 0)) {
                            int v2_16 = this.f.u();
                            boolean v10_0 = 0;
                            v11_0 = 0;
                            while (v10_0 < v2_16) {
                                a2.k1 v12_2 = androidx.recyclerview.widget.RecyclerView.M(this.f.t(v10_0));
                                if ((v12_2 != null) && ((!v12_2.h()) && (v12_2.e == v8_6))) {
                                    if (!((java.util.ArrayList) this.f.e).contains(v12_2.a)) {
                                        v11_0 = v12_2;
                                        break;
                                    } else {
                                        v11_0 = v12_2;
                                    }
                                }
                                v10_0++;
                            }
                        }
                    }
                    if (v11_0 == null) {
                        if (this.f.r() > 0) {
                            int v2_21 = v1_10.l;
                            if (v2_21 != -1) {
                                v3_0 = v2_21;
                            }
                            int v2_22 = v1_10.b();
                            boolean v8_12 = v3_0;
                            while (v8_12 < v2_22) {
                                android.view.View v9_0 = this.H(v8_12);
                                if (v9_0 == null) {
                                    break;
                                }
                                android.view.View v9_1 = v9_0.a;
                                if (!v9_1.hasFocusable()) {
                                    v8_12++;
                                } else {
                                    v7_0 = v9_1;
                                    if (v7_0 != null) {
                                        int v2_25 = v1_10.n;
                                        if (((long) v2_25) != -1) {
                                            int v2_26 = v7_0.findViewById(v2_25);
                                            if ((v2_26 != 0) && (v2_26.isFocusable())) {
                                                v7_0 = v2_26;
                                            }
                                        }
                                        v7_0.requestFocus();
                                    }
                                    v1_10.m = -1;
                                    v1_10.l = -1;
                                    v1_10.n = -1;
                                    return;
                                }
                            }
                            int v2_24 = (Math.min(v2_22, v3_0) - 1);
                            while (v2_24 >= 0) {
                                android.view.View v3_1 = this.H(v2_24);
                                if (v3_1 == null) {
                                    break;
                                }
                                android.view.View v3_2 = v3_1.a;
                                if (!v3_2.hasFocusable()) {
                                    v2_24--;
                                } else {
                                    v7_0 = v3_2;
                                    break;
                                }
                            }
                        }
                    } else {
                        int v2_17 = v11_0.a;
                        if ((!((java.util.ArrayList) this.f.e).contains(v2_17)) && (v2_17.hasFocusable())) {
                            v7_0 = v2_17;
                        }
                    }
                }
                v1_10.m = -1;
                v1_10.l = -1;
                v1_10.n = -1;
                return;
            } else {
                android.util.Log.e("RecyclerView", "No layout manager attached; skipping layout");
                return;
            }
        } else {
            android.util.Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
    }

    public final void removeDetachedView(android.view.View p3, boolean p4)
    {
        StringBuilder v0_0 = androidx.recyclerview.widget.RecyclerView.M(p3);
        if (v0_0 == null) {
            if (androidx.recyclerview.widget.RecyclerView.F0) {
                StringBuilder v0_3 = new StringBuilder("No ViewHolder found for child: ");
                v0_3.append(p3);
                throw new IllegalArgumentException(v1.a.h(this, v0_3));
            }
        } else {
            if (!v0_0.j()) {
                if (!v0_0.o()) {
                    String v4_3 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                    v4_3.append(v0_0);
                    throw new IllegalArgumentException(v1.a.h(this, v4_3));
                }
            } else {
                v0_0.j = (v0_0.j & -257);
            }
        }
        p3.clearAnimation();
        androidx.recyclerview.widget.RecyclerView.M(p3);
        super.removeDetachedView(p3, p4);
        return;
    }

    public final void requestChildFocus(android.view.View p2, android.view.View p3)
    {
        boolean v0_1 = this.s.e;
        if (((!v0_1) || (!v0_1.e)) && ((!this.P()) && (p3 != null))) {
            this.c0(p2, p3);
        }
        super.requestChildFocus(p2, p3);
        return;
    }

    public final boolean requestChildRectangleOnScreen(android.view.View p7, android.graphics.Rect p8, boolean p9)
    {
        return this.s.n0(this, p7, p8, p9, 0);
    }

    public final void requestDisallowInterceptTouchEvent(boolean p5)
    {
        java.util.ArrayList v0 = this.v;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            ((a2.p) v0.get(v2)).getClass();
            v2++;
        }
        super.requestDisallowInterceptTouchEvent(p5);
        return;
    }

    public final void requestLayout()
    {
        if ((this.A != 0) || (this.C)) {
            this.B = 1;
            return;
        } else {
            super.requestLayout();
            return;
        }
    }

    public final void s()
    {
        IllegalStateException v1_0 = this.k0;
        v1_0.a(1);
        this.C(v1_0);
        v1_0.i = 0;
        this.j0();
        int v4_40 = this.m;
        a2.o0 v6_2 = ((r.j) v4_40.b);
        ((r.j) v4_40.b).clear();
        int v4_6 = ((r.g) v4_40.c);
        v4_6.a();
        this.T();
        if (this.G) {
            a2.u1 v5_7 = this.e;
            v5_7.k(((java.util.ArrayList) v5_7.c));
            v5_7.k(((java.util.ArrayList) v5_7.d));
            if (this.H) {
                this.s.Z();
            }
        }
        if ((this.P == null) || (!this.s.C0())) {
            a2.o0 v21_0 = v4_6;
            int v22_0 = v6_2;
            this.e.b();
        } else {
            a2.u1 v5_28 = this.e;
            int v7_7 = ((p0.c) v5_28.b);
            long v8_10 = ((a2.h0) v5_28.e);
            int v9_5 = ((l6.c) v5_28.f);
            java.util.ArrayList v10_1 = ((java.util.ArrayList) v5_28.c);
            v9_5.getClass();
            while(true) {
                int v11_6 = (v10_1.size() - 1);
                a2.k1 v14_11 = 0;
                if (v11_6 < 0) {
                    v11_6 = -1;
                } else {
                    if (((a2.a) v10_1.get(v11_6)).a != 8) {
                        break;
                    }
                    if (v14_11 != null) {
                        if (v11_6 == -1) {
                            v21_0 = v4_6;
                            v22_0 = v6_2;
                            int v2_30 = v10_1.size();
                            int v3_23 = 0;
                            while (v3_23 < v2_30) {
                                int v4_11 = ((a2.a) v10_1.get(v3_23));
                                a2.o0 v6_26 = v4_11.a;
                                if (v6_26 == 1) {
                                    int v12 = 2;
                                    v5_28.j(v4_11);
                                } else {
                                    if (v6_26 == 2) {
                                        int v9_1 = v4_11.b;
                                        int v11_1 = (v4_11.c + v9_1);
                                        int v12_1 = v9_1;
                                        int v13_0 = 0;
                                        a2.k1 v14_0 = -1;
                                        while (v12_1 < v11_1) {
                                            if ((v8_10.b(v12_1) == null) && (!v5_28.a(v12_1))) {
                                                if (v14_0 != 1) {
                                                    a2.k1 v14_1 = 0;
                                                } else {
                                                    v5_28.j(v5_28.i(2, v9_1, v13_0));
                                                    v14_1 = 1;
                                                }
                                                a2.o0 v6_30 = 0;
                                            } else {
                                                a2.o0 v6_32;
                                                if (v14_0 != null) {
                                                    v6_32 = 0;
                                                } else {
                                                    v5_28.d(v5_28.i(2, v9_1, v13_0));
                                                    v6_32 = 1;
                                                }
                                                v14_1 = v6_32;
                                                v6_30 = 1;
                                            }
                                            if (v14_1 == null) {
                                                v13_0++;
                                            } else {
                                                v12_1 -= v13_0;
                                                v11_1 -= v13_0;
                                                v13_0 = 1;
                                            }
                                            v12_1++;
                                            v14_0 = v6_30;
                                        }
                                        if (v13_0 != v4_11.c) {
                                            v7_7.c(v4_11);
                                            v4_11 = v5_28.i(2, v9_1, v13_0);
                                        }
                                        if (v14_0 != null) {
                                            v5_28.j(v4_11);
                                        } else {
                                            v5_28.d(v4_11);
                                        }
                                    } else {
                                        if (v6_26 == 4) {
                                            a2.o0 v6_33 = v4_11.b;
                                            int v9_3 = (v4_11.c + v6_33);
                                            int v11_2 = v6_33;
                                            int v12_4 = 0;
                                            int v13_1 = -1;
                                            while (v6_33 < v9_3) {
                                                if ((v8_10.b(v6_33) == null) && (!v5_28.a(v6_33))) {
                                                    if (v13_1 == 1) {
                                                        v5_28.j(v5_28.i(4, v11_2, v12_4));
                                                        v11_2 = v6_33;
                                                        v12_4 = 0;
                                                    }
                                                    v13_1 = 0;
                                                } else {
                                                    if (v13_1 == 0) {
                                                        v5_28.d(v5_28.i(4, v11_2, v12_4));
                                                        v11_2 = v6_33;
                                                        v12_4 = 0;
                                                    }
                                                    v13_1 = 1;
                                                }
                                                v12_4++;
                                                v6_33++;
                                            }
                                            if (v12_4 != v4_11.c) {
                                                v7_7.c(v4_11);
                                                v4_11 = v5_28.i(4, v11_2, v12_4);
                                            }
                                            if (v13_1 != 0) {
                                                v5_28.j(v4_11);
                                            } else {
                                                v5_28.d(v4_11);
                                            }
                                        } else {
                                            if (v6_26 == 8) {
                                                v5_28.j(v4_11);
                                            }
                                        }
                                        int v20 = 1;
                                    }
                                }
                                v3_23++;
                            }
                            v10_1.clear();
                            int v2_33;
                            int v3_0 = 1;
                            if ((!this.n0) && (!this.o0)) {
                                v2_33 = 0;
                            } else {
                                v2_33 = 1;
                            }
                            if ((!this.z) || (this.P == null)) {
                                a2.u1 v5_1 = 0;
                            } else {
                                a2.u1 v5_32 = this.G;
                                if (((v5_32 == null) && ((v2_33 == 0) && (!this.s.f))) || ((v5_32 != null) && (!this.r.b))) {
                                } else {
                                    v5_1 = 1;
                                }
                            }
                            a2.o0 v6_0 = this.k0;
                            v6_0.j = v5_1;
                            if ((v5_1 == null) || ((v2_33 == 0) || ((this.G) || ((this.P == null) || (!this.s.C0()))))) {
                                v3_0 = 0;
                            }
                            int v2_7;
                            v6_0.k = v3_0;
                            int v3_1 = 0;
                            if ((!this.g0) || ((!this.hasFocus()) || (this.r == null))) {
                                v2_7 = 0;
                            } else {
                                v2_7 = this.getFocusedChild();
                            }
                            if (v2_7 != 0) {
                                int v2_8 = this.D(v2_7);
                                if (v2_8 != 0) {
                                    v3_1 = this.L(v2_8);
                                }
                            }
                            int v4_0 = -1;
                            if (v3_1 != 0) {
                                if (this.r.b) {
                                    v4_0 = v3_1.e;
                                }
                                int v4_5;
                                v1_0.m = v4_0;
                                if (!this.G) {
                                    if (!v3_1.h()) {
                                        int v4_4 = v3_1.r;
                                        if (v4_4 != 0) {
                                            v4_5 = v4_4.J(v3_1);
                                        } else {
                                            v4_5 = -1;
                                        }
                                    } else {
                                        v4_5 = v3_1.d;
                                    }
                                }
                                v1_0.l = v4_5;
                                int v3_2 = v3_1.a;
                                int v4_7 = v3_2.getId();
                                while ((!v3_2.isFocused()) && (((v3_2 instanceof android.view.ViewGroup)) && (v3_2.hasFocus()))) {
                                    v3_2 = ((android.view.ViewGroup) v3_2).getFocusedChild();
                                    if (v3_2.getId() != -1) {
                                        v4_7 = v3_2.getId();
                                    }
                                }
                                v1_0.n = v4_7;
                            } else {
                                v1_0.m = -1;
                                v1_0.l = -1;
                                v1_0.n = -1;
                            }
                            if ((!v1_0.j) || (!this.o0)) {
                                int v3_6 = 0;
                            } else {
                                v3_6 = 1;
                            }
                            v1_0.h = v3_6;
                            this.o0 = 0;
                            this.n0 = 0;
                            v1_0.g = v1_0.k;
                            v1_0.e = this.r.a();
                            this.F(androidx.recyclerview.widget.RecyclerView v0.s0);
                            if (v1_0.j) {
                                int v3_14 = this.f.r();
                                int v4_8 = 0;
                                while (v4_8 < v3_14) {
                                    int v7_5;
                                    a2.o0 v6_25;
                                    a2.u1 v5_24 = androidx.recyclerview.widget.RecyclerView.M(this.f.q(v4_8));
                                    if ((!v5_24.o()) && ((!v5_24.f()) || (this.r.b))) {
                                        a2.o0 v6_15 = this.P;
                                        a2.p0.b(v5_24);
                                        v5_24.c();
                                        v6_15.getClass();
                                        a2.o0 v6_17 = new a2.o0();
                                        v6_17.a(v5_24);
                                        v7_5 = v22_0;
                                        long v8_7 = ((a2.u1) v7_5.get(v5_24));
                                        if (v8_7 == 0) {
                                            v8_7 = a2.u1.a();
                                            v7_5.put(v5_24, v8_7);
                                        }
                                        v8_7.b = v6_17;
                                        v8_7.a = (v8_7.a | 4);
                                        if ((!v1_0.h) || ((!v5_24.k()) || ((v5_24.h()) || ((v5_24.o()) || (v5_24.f()))))) {
                                            v6_25 = v21_0;
                                        } else {
                                            v6_25 = v21_0;
                                            v6_25.e(this.K(v5_24), v5_24);
                                        }
                                    } else {
                                        v6_25 = v21_0;
                                        v7_5 = v22_0;
                                    }
                                    v4_8++;
                                    v21_0 = v6_25;
                                    v22_0 = v7_5;
                                }
                            }
                            int v7_0 = v22_0;
                            if (!v1_0.k) {
                                this.m();
                            } else {
                                int v3_17 = this.f.u();
                                a2.u1 v5_8 = 0;
                                while (v5_8 < v3_17) {
                                    a2.o0 v6_10 = androidx.recyclerview.widget.RecyclerView.M(this.f.t(v5_8));
                                    if ((androidx.recyclerview.widget.RecyclerView.F0) && ((v6_10.c == -1) && (!v6_10.h()))) {
                                        throw new IllegalStateException(v1.a.h(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                                    } else {
                                        if ((!v6_10.o()) && (v6_10.d == -1)) {
                                            v6_10.d = v6_10.c;
                                        }
                                        v5_8++;
                                    }
                                }
                                int v2_11 = v1_0.f;
                                v1_0.f = 0;
                                this.s.d0(this.c, v1_0);
                                v1_0.f = v2_11;
                                int v3_20 = 0;
                                while (v3_20 < this.f.r()) {
                                    int v2_17 = androidx.recyclerview.widget.RecyclerView.M(this.f.q(v3_20));
                                    if (!v2_17.o()) {
                                        a2.u1 v5_12 = ((a2.u1) v7_0.get(v2_17));
                                        if ((v5_12 == null) || ((v5_12.a & 4) == 0)) {
                                            a2.u1 v5_17;
                                            a2.p0.b(v2_17);
                                            if ((v2_17.j & 8192) == 0) {
                                                v5_17 = 0;
                                            } else {
                                                v5_17 = 1;
                                            }
                                            a2.o0 v6_5 = this.P;
                                            v2_17.c();
                                            v6_5.getClass();
                                            a2.o0 v6_7 = new a2.o0();
                                            v6_7.a(v2_17);
                                            if (v5_17 == null) {
                                                a2.u1 v5_19 = ((a2.u1) v7_0.get(v2_17));
                                                if (v5_19 == null) {
                                                    v5_19 = a2.u1.a();
                                                    v7_0.put(v2_17, v5_19);
                                                }
                                                v5_19.a = (v5_19.a | 2);
                                                v5_19.b = v6_7;
                                            } else {
                                                this.Y(v2_17, v6_7);
                                            }
                                        }
                                    }
                                    v3_20++;
                                }
                                this.m();
                            }
                            this.U(1);
                            this.l0(0);
                            v1_0.d = 2;
                            return;
                        } else {
                            int v22_1;
                            a2.o0 v21_1;
                            int v15_0 = (v11_6 + 1);
                            int v13_3 = ((a2.b) v9_5.b);
                            int v3_25 = ((p0.c) v13_3.b);
                            a2.k1 v14_10 = ((a2.a) v10_1.get(v11_6));
                            int v2_25 = ((a2.a) v10_1.get(v15_0));
                            boolean v18_4 = v9_5;
                            int v9_6 = v2_25.a;
                            if (v9_6 == 1) {
                                int v13_4;
                                v21_1 = v4_6;
                                v22_1 = v6_2;
                                int v3_26 = v14_10.c;
                                int v4_12 = v2_25.b;
                                if (v3_26 >= v4_12) {
                                    v13_4 = 0;
                                } else {
                                    v13_4 = -1;
                                }
                                a2.o0 v6_36 = v14_10.b;
                                if (v6_36 < v4_12) {
                                    v13_4++;
                                }
                                if (v4_12 <= v6_36) {
                                    v14_10.b = (v6_36 + v2_25.c);
                                }
                                int v4_14 = v2_25.b;
                                if (v4_14 <= v3_26) {
                                    v14_10.c = (v3_26 + v2_25.c);
                                }
                                v2_25.b = (v4_14 + v13_4);
                                v10_1.set(v11_6, v2_25);
                                v10_1.set(v15_0, v14_10);
                            } else {
                                a2.a v17_0 = 0;
                                if (v9_6 == 2) {
                                    int v4_18;
                                    int v16_0;
                                    v21_1 = v4_6;
                                    v22_1 = v6_2;
                                    int v4_16 = v14_10.b;
                                    a2.o0 v6_39 = v14_10.c;
                                    if (v4_16 >= v6_39) {
                                        if ((v2_25.b != (v6_39 + 1)) || (v2_25.c != (v4_16 - v6_39))) {
                                            v4_18 = 1;
                                            v16_0 = 0;
                                        } else {
                                            v4_18 = 1;
                                            v16_0 = 1;
                                        }
                                    } else {
                                        if ((v2_25.b != v4_16) || (v2_25.c != (v6_39 - v4_16))) {
                                            v4_18 = 0;
                                        } else {
                                            v4_18 = 0;
                                        }
                                    }
                                    int v9_11 = v2_25.b;
                                    if (v6_39 >= v9_11) {
                                        int v12_8 = v2_25.c;
                                        if (v6_39 < (v9_11 + v12_8)) {
                                            v2_25.c = (v12_8 - 1);
                                            v14_10.a = 2;
                                            v14_10.c = 1;
                                            if (v2_25.c != 0) {
                                                v9_5 = v18_4;
                                                v4_6 = v21_1;
                                                v6_2 = v22_1;
                                                int v3 = 0;
                                            } else {
                                                v10_1.remove(v15_0);
                                                v3_25.c(v2_25);
                                            }
                                        }
                                    } else {
                                        v2_25.b = (v9_11 - 1);
                                    }
                                    a2.o0 v6_40 = v14_10.b;
                                    int v9_14 = v2_25.b;
                                    if (v6_40 > v9_14) {
                                        int v9_15 = (v9_14 + v2_25.c);
                                        if (v6_40 < v9_15) {
                                            v17_0 = v13_3.i(2, (v6_40 + 1), (v9_15 - v6_40));
                                            v2_25.c = (v14_10.b - v2_25.b);
                                        }
                                    } else {
                                        v2_25.b = (v9_14 + 1);
                                    }
                                    a2.o0 v6_44 = v17_0;
                                    if (v16_0 == 0) {
                                        if (v4_18 == 0) {
                                            if (v6_44 != null) {
                                                int v3_29 = v14_10.b;
                                                if (v3_29 >= v6_44.b) {
                                                    v14_10.b = (v3_29 - v6_44.c);
                                                }
                                                int v3_31 = v14_10.c;
                                                if (v3_31 >= v6_44.b) {
                                                    v14_10.c = (v3_31 - v6_44.c);
                                                }
                                            }
                                            int v3_33 = v14_10.b;
                                            if (v3_33 >= v2_25.b) {
                                                v14_10.b = (v3_33 - v2_25.c);
                                            }
                                            int v3_35 = v14_10.c;
                                            if (v3_35 >= v2_25.b) {
                                                v14_10.c = (v3_35 - v2_25.c);
                                            }
                                        } else {
                                            if (v6_44 != null) {
                                                int v3_37 = v14_10.b;
                                                if (v3_37 > v6_44.b) {
                                                    v14_10.b = (v3_37 - v6_44.c);
                                                }
                                                int v3_39 = v14_10.c;
                                                if (v3_39 > v6_44.b) {
                                                    v14_10.c = (v3_39 - v6_44.c);
                                                }
                                            }
                                            int v3_41 = v14_10.b;
                                            if (v3_41 > v2_25.b) {
                                                v14_10.b = (v3_41 - v2_25.c);
                                            }
                                            int v3_43 = v14_10.c;
                                            if (v3_43 > v2_25.b) {
                                                v14_10.c = (v3_43 - v2_25.c);
                                            }
                                        }
                                        v10_1.set(v11_6, v2_25);
                                        if (v14_10.b == v14_10.c) {
                                            v10_1.remove(v15_0);
                                        } else {
                                            v10_1.set(v15_0, v14_10);
                                        }
                                        if (v6_44 != null) {
                                            v10_1.add(v11_6, v6_44);
                                        }
                                    } else {
                                        v10_1.set(v11_6, v2_25);
                                        v10_1.remove(v15_0);
                                        v3_25.c(v14_10);
                                    }
                                } else {
                                    if (v9_6 == 4) {
                                        int v4_39;
                                        int v9_19 = v14_10.c;
                                        int v12_14 = v2_25.b;
                                        if (v9_19 >= v12_14) {
                                            int v19 = v2_25.c;
                                            if (v9_19 >= (v12_14 + v19)) {
                                                v21_1 = v4_6;
                                                v4_39 = 0;
                                            } else {
                                                v2_25.c = (v19 - 1);
                                                v21_1 = v4_6;
                                                v4_39 = v13_3.i(4, v14_10.b, 1);
                                            }
                                        } else {
                                            v2_25.b = (v12_14 - 1);
                                        }
                                        int v9_21 = v14_10.b;
                                        int v12_20 = v2_25.b;
                                        if (v9_21 > v12_20) {
                                            int v12_22 = (v12_20 + v2_25.c);
                                            if (v9_21 >= v12_22) {
                                                v22_1 = v6_2;
                                            } else {
                                                int v12_23 = (v12_22 - v9_21);
                                                v22_1 = v6_2;
                                                v17_0 = v13_3.i(4, (v9_21 + 1), v12_23);
                                                v2_25.c = (v2_25.c - v12_23);
                                            }
                                        } else {
                                            v2_25.b = (v12_20 + 1);
                                        }
                                        a2.o0 v6_48 = v17_0;
                                        v10_1.set(v15_0, v14_10);
                                        if (v2_25.c <= 0) {
                                            v10_1.remove(v11_6);
                                            v3_25.c(v2_25);
                                        } else {
                                            v10_1.set(v11_6, v2_25);
                                        }
                                        if (v4_39 != 0) {
                                            v10_1.add(v11_6, v4_39);
                                        }
                                        if (v6_48 != null) {
                                            v10_1.add(v11_6, v6_48);
                                        }
                                    } else {
                                        v21_1 = v4_6;
                                        v22_1 = v6_2;
                                    }
                                }
                            }
                        }
                    }
                    v11_6--;
                    while (v11_6 >= 0) {
                    }
                }
            }
            v14_11 = 1;
        }
    }

    public final void scrollBy(int p4, int p5)
    {
        int v0_0 = this.s;
        if (v0_0 != 0) {
            if (!this.C) {
                int v0_2 = v0_0.d();
                boolean v1_2 = this.s.e();
                if ((v0_2 != 0) || (v1_2)) {
                    if (v0_2 == 0) {
                        p4 = 0;
                    }
                    if (!v1_2) {
                        p5 = 0;
                    }
                    this.d0(p4, p5, 0, 0);
                    return;
                }
            }
            return;
        } else {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
    }

    public final void scrollTo(int p1, int p2)
    {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
        return;
    }

    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent p2)
    {
        if (!this.P()) {
            super.sendAccessibilityEventUnchecked(p2);
            return;
        } else {
            int v2_3;
            int v0_1 = 0;
            if (p2 == 0) {
                v2_3 = 0;
            } else {
                v2_3 = p2.getContentChangeTypes();
            }
            if (v2_3 != 0) {
                v0_1 = v2_3;
            }
            this.E = (this.E | v0_1);
            return;
        }
    }

    public void setAccessibilityDelegateCompat(a2.m1 p1)
    {
        this.r0 = p1;
        q0.q0.n(this, p1);
        return;
    }

    public void setAdapter(a2.i0 p12)
    {
        this.setLayoutFrozen(0);
        android.util.SparseArray v1_3 = this.r;
        int v2_0 = this.b;
        if (v1_3 != null) {
            v1_3.a.unregisterObserver(v2_0);
            this.r.getClass();
        }
        android.util.SparseArray v1_12 = this.P;
        if (v1_12 != null) {
            v1_12.e();
        }
        android.util.SparseArray v1_0 = this.s;
        a2.z0 v3 = this.c;
        if (v1_0 != null) {
            v1_0.j0(v3);
            this.s.k0(v3);
        }
        v3.a.clear();
        v3.g();
        android.util.SparseArray v1_4 = this.e;
        v1_4.k(((java.util.ArrayList) v1_4.c));
        v1_4.k(((java.util.ArrayList) v1_4.d));
        android.util.SparseArray v1_5 = this.r;
        this.r = p12;
        if (p12 != null) {
            p12.a.registerObserver(v2_0);
        }
        a2.g1 v12_2 = this.s;
        if (v12_2 != null) {
            v12_2.Q();
        }
        a2.g1 v12_3 = this.r;
        v3.a.clear();
        v3.g();
        v3.f(v1_5, 1);
        a2.y0 v4_4 = v3.c();
        if (v1_5 != null) {
            v4_4.b = (v4_4.b - 1);
        }
        if (v4_4.b == 0) {
            android.util.SparseArray v1_10 = v4_4.a;
            int v5 = 0;
            while (v5 < v1_10.size()) {
                java.util.ArrayList v6_2 = ((a2.x0) v1_10.valueAt(v5));
                java.util.ArrayList v7 = v6_2.a;
                int v8 = v7.size();
                int v9 = 0;
                while (v9 < v8) {
                    android.view.View v10_0 = v7.get(v9);
                    v9++;
                    w0.a.a(((a2.k1) v10_0).a);
                }
                v6_2.a.clear();
                v5++;
            }
        }
        if (v12_3 != null) {
            v4_4.b = (v4_4.b + 1);
        }
        v3.e();
        this.k0.f = 1;
        this.X(0);
        this.requestLayout();
        return;
    }

    public void setChildDrawingOrderCallback(a2.m0 p1)
    {
        if (p1 != 0) {
            this.setChildrenDrawingOrderEnabled(0);
            return;
        } else {
            return;
        }
    }

    public void setClipToPadding(boolean p2)
    {
        if (p2 != this.n) {
            this.O = 0;
            this.M = 0;
            this.N = 0;
            this.L = 0;
        }
        this.n = p2;
        super.setClipToPadding(p2);
        if (this.z) {
            this.requestLayout();
        }
        return;
    }

    public void setEdgeEffectFactory(a2.n0 p1)
    {
        p1.getClass();
        this.K = p1;
        this.O = 0;
        this.M = 0;
        this.N = 0;
        this.L = 0;
        return;
    }

    public void setHasFixedSize(boolean p1)
    {
        this.y = p1;
        return;
    }

    public void setItemAnimator(a2.p0 p3)
    {
        a2.h0 v0_0 = this.P;
        if (v0_0 != null) {
            v0_0.e();
            this.P.a = 0;
        }
        this.P = p3;
        if (p3 != null) {
            p3.a = this.p0;
        }
        return;
    }

    public void setItemViewCacheSize(int p2)
    {
        a2.z0 v0 = this.c;
        v0.e = p2;
        v0.n();
        return;
    }

    public void setLayoutFrozen(boolean p1)
    {
        this.suppressLayout(p1);
        return;
    }

    public void setLayoutManager(a2.t0 p10)
    {
        if (p10 != this.s) {
            this.n0();
            StringBuilder v1_0 = 0;
            String v2_0 = this.c;
            if (this.s == null) {
                v2_0.a.clear();
                v2_0.g();
            } else {
                IllegalArgumentException v0_1 = this.P;
                if (v0_1 != null) {
                    v0_1.e();
                }
                this.s.j0(v2_0);
                this.s.k0(v2_0);
                v2_0.a.clear();
                v2_0.g();
                if (this.x) {
                    IllegalArgumentException v0_6 = this.s;
                    v0_6.g = 0;
                    v0_6.S(this);
                }
                this.s.w0(0);
                this.s = 0;
            }
            IllegalArgumentException v0_8 = this.f;
            int v3_3 = ((a2.h0) v0_8.c).a;
            ((a2.c) v0_8.d).g();
            IllegalArgumentException v0_11 = ((java.util.ArrayList) v0_8.e);
            android.view.View v4_3 = (v0_11.size() - 1);
            while (v4_3 >= null) {
                a2.k1 v6_2 = androidx.recyclerview.widget.RecyclerView.M(((android.view.View) v0_11.get(v4_3)));
                if (v6_2 != null) {
                    java.util.ArrayList v7_0 = v6_2.p;
                    if (!v3_3.P()) {
                        v6_2.a.setImportantForAccessibility(v7_0);
                    } else {
                        v6_2.q = v7_0;
                        v3_3.x0.add(v6_2);
                    }
                    v6_2.p = 0;
                }
                v0_11.remove(v4_3);
                v4_3--;
            }
            IllegalArgumentException v0_12 = v3_3.getChildCount();
            while (v1_0 < v0_12) {
                android.view.View v4_4 = v3_3.getChildAt(v1_0);
                androidx.recyclerview.widget.RecyclerView.M(v4_4);
                v4_4.clearAnimation();
                v1_0++;
            }
            v3_3.removeAllViews();
            this.s = p10;
            if (p10 != null) {
                if (p10.b != null) {
                    StringBuilder v1_2 = new StringBuilder("LayoutManager ");
                    v1_2.append(p10);
                    v1_2.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(v1.a.h(p10.b, v1_2));
                } else {
                    p10.w0(this);
                    if (this.x) {
                        a2.t0 v10_4 = this.s;
                        v10_4.g = 1;
                        v10_4.R(this);
                    }
                }
            }
            v2_0.n();
            this.requestLayout();
            return;
        } else {
            return;
        }
    }

    public void setLayoutTransition(android.animation.LayoutTransition p2)
    {
        if (p2 != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        } else {
            super.setLayoutTransition(0);
            return;
        }
    }

    public void setNestedScrollingEnabled(boolean p4)
    {
        q0.q v0 = this.getScrollingChildHelper();
        if (v0.d) {
            q0.i0.l(v0.c);
        }
        v0.d = p4;
        return;
    }

    public void setOnFlingListener(a2.v0 p1)
    {
        this.b0 = p1;
        return;
    }

    public void setOnScrollListener(a2.w0 p1)
    {
        this.l0 = p1;
        return;
    }

    public void setPreserveFocusAfterLayout(boolean p1)
    {
        this.g0 = p1;
        return;
    }

    public void setRecycledViewPool(a2.y0 p5)
    {
        a2.z0 v0 = this.c;
        int v1_0 = v0.h;
        v0.f(v1_0.r, 0);
        a2.y0 v2_1 = v0.g;
        if (v2_1 != null) {
            v2_1.b = (v2_1.b - 1);
        }
        v0.g = p5;
        if ((p5 != null) && (v1_0.getAdapter() != null)) {
            a2.y0 v5_2 = v0.g;
            v5_2.b = (v5_2.b + 1);
        }
        v0.e();
        return;
    }

    public void setRecyclerListener(a2.a1 p1)
    {
        return;
    }

    public void setScrollState(int p4)
    {
        if (p4 != this.Q) {
            if (androidx.recyclerview.widget.RecyclerView.G0) {
                int v0_14 = v1.a.p("setting scroll state to ", p4, " from ");
                v0_14.append(this.Q);
                android.util.Log.d("RecyclerView", v0_14.toString(), new Exception());
            }
            this.Q = p4;
            if (p4 != 2) {
                int v0_3 = this.h0;
                v0_3.m.removeCallbacks(v0_3);
                v0_3.c.abortAnimation();
                int v0_6 = this.s;
                if (v0_6 != 0) {
                    int v0_7 = v0_6.e;
                    if (v0_7 != 0) {
                        v0_7.i();
                    }
                }
            }
            int v0_8 = this.s;
            if (v0_8 != 0) {
                v0_8.h0(p4);
            }
            int v0_9 = this.l0;
            if (v0_9 != 0) {
                v0_9.a(this, p4);
            }
            int v0_10 = this.m0;
            if (v0_10 != 0) {
                int v0_12 = (v0_10.size() - 1);
                while (v0_12 >= 0) {
                    ((a2.w0) this.m0.get(v0_12)).a(this, p4);
                    v0_12--;
                }
            }
        }
        return;
    }

    public void setScrollingTouchSlop(int p4)
    {
        android.view.ViewConfiguration v0_1 = android.view.ViewConfiguration.get(this.getContext());
        if (p4 != 0) {
            if (p4 == 1) {
                this.a0 = v0_1.getScaledPagingTouchSlop();
                return;
            } else {
                String v1_1 = new StringBuilder("setScrollingTouchSlop(): bad argument constant ");
                v1_1.append(p4);
                v1_1.append("; using default value");
                android.util.Log.w("RecyclerView", v1_1.toString());
            }
        }
        this.a0 = v0_1.getScaledTouchSlop();
        return;
    }

    public void setViewCacheExtension(a2.i1 p1)
    {
        this.c.getClass();
        return;
    }

    public final boolean startNestedScroll(int p3)
    {
        return this.getScrollingChildHelper().g(p3, 0);
    }

    public final void stopNestedScroll()
    {
        this.getScrollingChildHelper().h(0);
        return;
    }

    public final void suppressLayout(boolean p10)
    {
        if (p10 != this.C) {
            this.k("Do not suppressLayout in layout or scroll");
            if (p10 != 0) {
                long v1 = android.os.SystemClock.uptimeMillis();
                this.onTouchEvent(android.view.MotionEvent.obtain(v1, v1, 3, 0, 0, 0));
                this.C = 1;
                this.D = 1;
                this.n0();
            } else {
                this.C = 0;
                if ((this.B) && ((this.s != null) && (this.r != null))) {
                    this.requestLayout();
                }
                this.B = 0;
                return;
            }
        }
        return;
    }

    public final void t()
    {
        this.j0();
        this.T();
        a2.g1 v1 = this.k0;
        v1.a(6);
        this.e.b();
        v1.e = this.r.a();
        v1.c = 0;
        if (this.d != null) {
            int v2_1 = this.r;
            a2.t0 v4_1 = u.e.c(v2_1.c);
            if (v4_1 == 1) {
                if (v2_1.a() <= 0) {
                    int v2_10;
                    v1.g = 0;
                    this.s.d0(this.c, v1);
                    v1.f = 0;
                    if ((!v1.j) || (this.P == null)) {
                        v2_10 = 0;
                    } else {
                        v2_10 = 1;
                    }
                    v1.j = v2_10;
                    v1.d = 4;
                    this.U(1);
                    this.l0(0);
                    return;
                }
            } else {
                if (v4_1 == 2) {
                }
            }
            int v2_5 = this.d.c;
            if (v2_5 != 0) {
                this.s.f0(v2_5);
            }
            this.d = 0;
        }
    }

    public final boolean u(int p7, int p8, int p9, int[] p10, int[] p11)
    {
        return this.getScrollingChildHelper().c(p7, p8, p9, p10, p11);
    }

    public final void v(int p9, int p10, int p11, int p12, int[] p13, int p14, int[] p15)
    {
        this.getScrollingChildHelper().d(p9, p10, p11, p12, p13, p14, p15);
        return;
    }

    public final void w(int p5, int p6)
    {
        this.J = (this.J + 1);
        int v0_6 = this.getScrollX();
        a2.w0 v1_3 = this.getScrollY();
        this.onScrollChanged(v0_6, v1_3, (v0_6 - p5), (v1_3 - p6));
        int v0_2 = this.l0;
        if (v0_2 != 0) {
            v0_2.b(this, p5, p6);
        }
        int v0_3 = this.m0;
        if (v0_3 != 0) {
            int v0_5 = (v0_3.size() - 1);
            while (v0_5 >= 0) {
                ((a2.w0) this.m0.get(v0_5)).b(this, p5, p6);
                v0_5--;
            }
        }
        this.J = (this.J - 1);
        return;
    }

    public final void x()
    {
        if (this.O == null) {
            ((a2.h1) this.K).getClass();
            android.widget.EdgeEffect v0_4 = new android.widget.EdgeEffect(this.getContext());
            this.O = v0_4;
            if (!this.n) {
                v0_4.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
                return;
            } else {
                v0_4.setSize(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()));
                return;
            }
        } else {
            return;
        }
    }

    public final void y()
    {
        if (this.L == null) {
            ((a2.h1) this.K).getClass();
            android.widget.EdgeEffect v0_4 = new android.widget.EdgeEffect(this.getContext());
            this.L = v0_4;
            if (!this.n) {
                v0_4.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
                return;
            } else {
                v0_4.setSize(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()));
                return;
            }
        } else {
            return;
        }
    }

    public final void z()
    {
        if (this.N == null) {
            ((a2.h1) this.K).getClass();
            android.widget.EdgeEffect v0_4 = new android.widget.EdgeEffect(this.getContext());
            this.N = v0_4;
            if (!this.n) {
                v0_4.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
                return;
            } else {
                v0_4.setSize(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()));
                return;
            }
        } else {
            return;
        }
    }
}
