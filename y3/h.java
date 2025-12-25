package y3;
public abstract class h {
    public static final l1.a u;
    public static final android.view.animation.LinearInterpolator v;
    public static final l1.a w;
    public static final android.os.Handler x;
    public static final int[] y;
    public static final String z;
    public final int a;
    public final int b;
    public final int c;
    public final android.animation.TimeInterpolator d;
    public final android.animation.TimeInterpolator e;
    public final android.animation.TimeInterpolator f;
    public final android.view.ViewGroup g;
    public final android.content.Context h;
    public final y3.g i;
    public final y3.i j;
    public int k;
    public final y3.d l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final android.view.accessibility.AccessibilityManager s;
    public final y3.f t;

    static h()
    {
        y3.h.u = d3.a.b;
        y3.h.v = d3.a.a;
        y3.h.w = d3.a.d;
        y3.h.y = new int[] {2130969756});
        y3.h.z = y3.h.getSimpleName();
        y3.h.x = new android.os.Handler(android.os.Looper.getMainLooper(), new y3.c());
        return;
    }

    public h(android.content.Context p5, android.view.ViewGroup p6, android.view.View p7, y3.i p8)
    {
        this.l = new y3.d(this, 0);
        this.t = new y3.f(this);
        if (p7 == 0) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else {
            if (p8 == 0) {
                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            } else {
                int v0_5;
                this.g = p6;
                this.j = p8;
                this.h = p5;
                q3.k.c(p5, q3.k.a, "Theme.AppCompat");
                int v8_2 = android.view.LayoutInflater.from(p5);
                int v0_3 = p5.obtainStyledAttributes(y3.h.y);
                int v3 = v0_3.getResourceId(0, -1);
                v0_3.recycle();
                if (v3 == -1) {
                    v0_5 = 2131558437;
                } else {
                    v0_5 = 2131558506;
                }
                l1.a v6_7 = ((y3.g) v8_2.inflate(v0_5, p6, 0));
                this.i = v6_7;
                y3.g.a(v6_7, this);
                if ((p7 instanceof com.google.android.material.snackbar.SnackbarContentLayout)) {
                    int v0_6 = v6_7.getActionTextColorAlpha();
                    if (v0_6 != 1065353216) {
                        ((com.google.android.material.snackbar.SnackbarContentLayout) p7).b.setTextColor(j5.t1.L(j5.t1.u(((com.google.android.material.snackbar.SnackbarContentLayout) p7), 2130968890), ((com.google.android.material.snackbar.SnackbarContentLayout) p7).b.getCurrentTextColor(), v0_6));
                    }
                    ((com.google.android.material.snackbar.SnackbarContentLayout) p7).setMaxInlineActionWidth(v6_7.getMaxInlineActionWidth());
                }
                v6_7.addView(p7);
                v6_7.setAccessibilityLiveRegion(1);
                v6_7.setImportantForAccessibility(1);
                v6_7.setFitsSystemWindows(1);
                q0.i0.j(v6_7, new y3.e(this));
                q0.q0.n(v6_7, new com.google.android.material.datepicker.k(this, 5));
                this.s = ((android.view.accessibility.AccessibilityManager) p5.getSystemService("accessibility"));
                this.c = j5.t1.P(p5, 2130969523, 250);
                this.a = j5.t1.P(p5, 2130969523, 150);
                this.b = j5.t1.P(p5, 2130969526, 75);
                this.d = j5.t1.Q(p5, 2130969539, y3.h.v);
                this.f = j5.t1.Q(p5, 2130969539, y3.h.w);
                this.e = j5.t1.Q(p5, 2130969539, y3.h.u);
                return;
            }
        }
    }

    public final void a(int p5)
    {
        j6.s v0 = j6.s.h();
        y3.l v1_3 = this.t;
        if (!v0.l(v1_3)) {
            y3.l v1_0;
            Object v3_4 = ((y3.l) v0.e);
            if ((v3_4 == null) || (v3_4.a.get() != v1_3)) {
                v1_0 = 0;
            } else {
                v1_0 = 1;
            }
            if (v1_0 != null) {
                v0.c(((y3.l) v0.e), p5);
            }
        } else {
            v0.c(((y3.l) v0.d), p5);
        }
        return;
    }

    public final void b()
    {
        if (android.os.Build$VERSION.SDK_INT >= 29) {
            int v0_3 = this.i.getRootWindowInsets();
            if (v0_3 != 0) {
                this.p = l4.h.f(v0_3.getMandatorySystemGestureInsets());
                this.f();
            }
        }
        return;
    }

    public final void c()
    {
        android.view.ViewGroup v0_0 = j6.s.h();
        if (v0_0.l(this.t)) {
            v0_0.d = 0;
            if (((y3.l) v0_0.e) != null) {
                v0_0.s();
            }
        }
        android.view.ViewGroup v0_3 = this.i.getParent();
        if ((v0_3 instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) v0_3).removeView(this.i);
        }
        return;
    }

    public final void d()
    {
        Throwable v0_0 = j6.s.h();
        if (v0_0.l(this.t)) {
            v0_0.r(((y3.l) v0_0.d));
        }
        return;
    }

    public final void e()
    {
        y3.g v0 = this.i;
        int v1_0 = this.s;
        if (v1_0 != 0) {
            int v1_5 = v1_0.getEnabledAccessibilityServiceList(1);
            if ((v1_5 == 0) || (!v1_5.isEmpty())) {
                if (v0.getParent() != null) {
                    v0.setVisibility(0);
                }
                this.d();
                return;
            }
        }
        v0.post(new y3.d(this, 2));
        return;
    }

    public final void f()
    {
        String v0_0 = this.i;
        y3.d v1_1 = v0_0.getLayoutParams();
        int v3_2 = y3.h.z;
        if ((v1_1 instanceof android.view.ViewGroup$MarginLayoutParams)) {
            if (v0_0.p != null) {
                if (v0_0.getParent() != null) {
                    int v6_5;
                    y3.d v1_0 = ((android.view.ViewGroup$MarginLayoutParams) v1_1);
                    int v3_0 = v0_0.p;
                    int v4_1 = (v3_0.bottom + this.m);
                    boolean v2_2 = (v3_0.left + this.n);
                    int v5_2 = (v3_0.right + this.o);
                    int v3_1 = v3_0.top;
                    if ((v1_0.bottomMargin == v4_1) && ((v1_0.leftMargin == v2_2) && ((v1_0.rightMargin == v5_2) && (v1_0.topMargin == v3_1)))) {
                        v6_5 = 0;
                    } else {
                        v6_5 = 1;
                    }
                    if (v6_5 != 0) {
                        v1_0.bottomMargin = v4_1;
                        v1_0.leftMargin = v2_2;
                        v1_0.rightMargin = v5_2;
                        v1_0.topMargin = v3_1;
                        v0_0.requestLayout();
                    }
                    if (((v6_5 != 0) || (this.q != this.p)) && ((android.os.Build$VERSION.SDK_INT >= 29) && (this.p > 0))) {
                        y3.d v1_5 = v0_0.getLayoutParams();
                        if (((v1_5 instanceof b0.d)) && ((((b0.d) v1_5).a instanceof com.google.android.material.behavior.SwipeDismissBehavior))) {
                            y3.d v1_9 = this.l;
                            v0_0.removeCallbacks(v1_9);
                            v0_0.post(v1_9);
                        }
                    }
                }
                return;
            } else {
                android.util.Log.w(v3_2, "Unable to update margins because original view margins are not set");
                return;
            }
        } else {
            android.util.Log.w(v3_2, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
    }
}
