package com.google.android.material.appbar;
public class AppBarLayout$ScrollingViewBehavior extends e3.a {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior()
    {
        new android.graphics.Rect();
        new android.graphics.Rect();
        return;
    }

    public AppBarLayout$ScrollingViewBehavior(android.content.Context p2, android.util.AttributeSet p3)
    {
        new android.graphics.Rect();
        new android.graphics.Rect();
        android.content.res.TypedArray v2_1 = p2.obtainStyledAttributes(p3, c3.a.y);
        this.b = v2_1.getDimensionPixelSize(0, 0);
        v2_1.recycle();
        return;
    }

    public static void w(java.util.ArrayList p3)
    {
        int v0 = p3.size();
        int v1 = 0;
        while (v1 < v0) {
            p3.get(v1);
            v1++;
        }
        return;
    }

    public final void f(android.view.View p1)
    {
        return;
    }

    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout p4, android.view.View p5, android.view.View p6)
    {
        if ((((b0.d) p6.getLayoutParams()).a instanceof com.google.android.material.appbar.AppBarLayout$BaseBehavior)) {
            java.util.WeakHashMap v6_3;
            int v4_1 = (p6.getBottom() - p5.getTop());
            java.util.WeakHashMap v6_2 = this.b;
            if (v6_2 != null) {
                v6_3 = c4.b.h(((int) (0 * ((float) v6_2))), 0, v6_2);
            } else {
                v6_3 = 0;
            }
            p5.offsetTopAndBottom((v4_1 - v6_3));
        }
        return 0;
    }

    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3, int p4, int p5)
    {
        int v3_1 = p2.getLayoutParams().height;
        if ((v3_1 == -1) || (v3_1 == -2)) {
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior.w(p1.j(p2));
        }
        return 0;
    }

    public final void p(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2)
    {
        com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior.w(p1.j(p2));
        return;
    }

    public final void v(androidx.coordinatorlayout.widget.CoordinatorLayout p2, android.view.View p3, int p4)
    {
        com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior.w(p2.j(p3));
        p2.q(p3, p4);
        return;
    }
}
