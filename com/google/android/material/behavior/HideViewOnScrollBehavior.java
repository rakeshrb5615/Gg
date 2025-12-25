package com.google.android.material.behavior;
public class HideViewOnScrollBehavior extends b0.a {
    public q4.b a;
    public android.view.accessibility.AccessibilityManager b;
    public f3.a c;
    public final java.util.LinkedHashSet d;
    public int e;
    public int f;
    public android.animation.TimeInterpolator g;
    public android.animation.TimeInterpolator h;
    public int i;
    public int j;
    public android.view.ViewPropertyAnimator k;

    public HideViewOnScrollBehavior()
    {
        this.d = new java.util.LinkedHashSet();
        this.i = 0;
        this.j = 2;
        return;
    }

    public HideViewOnScrollBehavior(android.content.Context p1, android.util.AttributeSet p2)
    {
        this.d = new java.util.LinkedHashSet();
        this.i = 0;
        this.j = 2;
        return;
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p4, android.view.View p5, int p6)
    {
        if (this.b == null) {
            this.b = ((android.view.accessibility.AccessibilityManager) e0.c.getSystemService(p5.getContext(), android.view.accessibility.AccessibilityManager));
        }
        android.animation.TimeInterpolator v4_17 = this.b;
        if ((v4_17 != null) && (this.c == null)) {
            int v0_2 = new f3.a(this, p5, 1);
            this.c = v0_2;
            v4_17.addTouchExplorationStateChangeListener(v0_2);
            p5.addOnAttachStateChangeListener(new f3.b(this, 1));
        }
        android.animation.TimeInterpolator v4_4 = ((android.view.ViewGroup$MarginLayoutParams) p5.getLayoutParams());
        int v0_6 = ((b0.d) p5.getLayoutParams()).c;
        if ((v0_6 != 80) && (v0_6 != 81)) {
            int v6_2;
            int v6_1 = android.view.Gravity.getAbsoluteGravity(v0_6, p6);
            if ((v6_1 != 3) && (v6_1 != 19)) {
                v6_2 = 0;
            } else {
                v6_2 = 2;
            }
            this.v(v6_2);
        } else {
            this.v(1);
        }
        this.i = this.a.x(p5, v4_4);
        this.e = j5.t1.P(p5.getContext(), 2130969523, 225);
        this.f = j5.t1.P(p5.getContext(), 2130969529, 175);
        this.g = j5.t1.Q(p5.getContext(), 2130969539, d3.a.d);
        this.h = j5.t1.Q(p5.getContext(), 2130969539, d3.a.c);
        return 0;
    }

    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3, int p4, int p5, int[] p6)
    {
        if (p3 <= 0) {
            if (p3 < 0) {
                this.w(p2);
            }
        } else {
            if (this.j != 1) {
                ClassCastException v1_10 = this.b;
                if ((v1_10 == null) || (!v1_10.isTouchExplorationEnabled())) {
                    ClassCastException v1_0 = this.k;
                    if (v1_0 != null) {
                        v1_0.cancel();
                        p2.clearAnimation();
                    }
                    this.j = 1;
                    ClassCastException v1_2 = this.d.iterator();
                    if (v1_2.hasNext()) {
                        throw v1.a.e(v1_2);
                    } else {
                        this.k = this.a.A(p2, this.i).setInterpolator(this.h).setDuration(((long) this.f)).setListener(new f2.o(this, 2));
                        return;
                    }
                }
            }
        }
        return;
    }

    public final boolean s(android.view.View p1, int p2, int p3)
    {
        if (p2 != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void v(int p4)
    {
        IllegalArgumentException v0_0 = this.a;
        if ((v0_0 != null) && (v0_0.z() == p4)) {
            return;
        } else {
            if (p4 == null) {
                this.a = new f3.c(2);
                return;
            } else {
                if (p4 == 1) {
                    this.a = new f3.c(0);
                    return;
                } else {
                    if (p4 != 2) {
                        throw new IllegalArgumentException(v1.a.j("Invalid view edge position value: ", p4, ". Must be 0, 1 or 2."));
                    } else {
                        this.a = new f3.c(1);
                        return;
                    }
                }
            }
        }
    }

    public final void w(android.view.View p6)
    {
        if (this.j != 2) {
            f2.o v0_5 = this.k;
            if (v0_5 != null) {
                v0_5.cancel();
                p6.clearAnimation();
            }
            this.j = 2;
            f2.o v0_1 = this.d.iterator();
            if (v0_1.hasNext()) {
                throw v1.a.e(v0_1);
            } else {
                this.a.getClass();
                this.k = this.a.A(p6, 0).setInterpolator(this.g).setDuration(((long) this.e)).setListener(new f2.o(this, 2));
                return;
            }
        } else {
            return;
        }
    }
}
