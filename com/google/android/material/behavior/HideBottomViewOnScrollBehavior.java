package com.google.android.material.behavior;
public class HideBottomViewOnScrollBehavior extends b0.a {
    public final java.util.LinkedHashSet a;
    public int b;
    public int c;
    public android.animation.TimeInterpolator d;
    public android.animation.TimeInterpolator e;
    public int f;
    public android.view.accessibility.AccessibilityManager g;
    public f3.a h;
    public final boolean i;
    public int j;
    public android.view.ViewPropertyAnimator k;

    public HideBottomViewOnScrollBehavior()
    {
        this.a = new java.util.LinkedHashSet();
        this.f = 0;
        this.i = 1;
        this.j = 2;
        return;
    }

    public HideBottomViewOnScrollBehavior(android.content.Context p1, android.util.AttributeSet p2)
    {
        this.a = new java.util.LinkedHashSet();
        this.f = 0;
        this.i = 1;
        this.j = 2;
        return;
    }

    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p2, android.view.View p3, int p4)
    {
        this.f = (p3.getMeasuredHeight() + ((android.view.ViewGroup$MarginLayoutParams) p3.getLayoutParams()).bottomMargin);
        this.b = j5.t1.P(p3.getContext(), 2130969523, 225);
        this.c = j5.t1.P(p3.getContext(), 2130969529, 175);
        this.d = j5.t1.Q(p3.getContext(), 2130969539, d3.a.d);
        this.e = j5.t1.Q(p3.getContext(), 2130969539, d3.a.c);
        if (this.g == null) {
            this.g = ((android.view.accessibility.AccessibilityManager) e0.c.getSystemService(p3.getContext(), android.view.accessibility.AccessibilityManager));
        }
        f3.b v2_13 = this.g;
        if ((v2_13 != null) && (this.h == null)) {
            int v4_8 = new f3.a(this, p3, 0);
            this.h = v4_8;
            v2_13.addTouchExplorationStateChangeListener(v4_8);
            p3.addOnAttachStateChangeListener(new f3.b(this, 0));
        }
        return 0;
    }

    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3, int p4, int p5, int[] p6)
    {
        if (p3 <= 0) {
            if (p3 < 0) {
                this.v(p2);
            }
        } else {
            if (this.j != 1) {
                if (this.i) {
                    ClassCastException v1_13 = this.g;
                    if ((v1_13 != null) && (v1_13.isTouchExplorationEnabled())) {
                        return;
                    }
                }
                ClassCastException v1_1 = this.k;
                if (v1_1 != null) {
                    v1_1.cancel();
                    p2.clearAnimation();
                }
                this.j = 1;
                ClassCastException v1_3 = this.a.iterator();
                if (v1_3.hasNext()) {
                    throw v1.a.e(v1_3);
                } else {
                    this.k = p2.animate().translationY(((float) this.f)).setInterpolator(this.e).setDuration(((long) this.c)).setListener(new f2.o(this, 1));
                    return;
                }
            }
        }
        return;
    }

    public boolean s(android.view.View p1, int p2, int p3)
    {
        if (p2 != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void v(android.view.View p5)
    {
        if (this.j != 2) {
            f2.o v0_4 = this.k;
            if (v0_4 != null) {
                v0_4.cancel();
                p5.clearAnimation();
            }
            this.j = 2;
            f2.o v0_1 = this.a.iterator();
            if (v0_1.hasNext()) {
                throw v1.a.e(v0_1);
            } else {
                this.k = p5.animate().translationY(((float) 0)).setInterpolator(this.d).setDuration(((long) this.b)).setListener(new f2.o(this, 1));
                return;
            }
        } else {
            return;
        }
    }
}
