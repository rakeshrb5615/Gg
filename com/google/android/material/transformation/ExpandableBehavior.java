package com.google.android.material.transformation;
public abstract class ExpandableBehavior extends b0.a {

    public ExpandableBehavior()
    {
        return;
    }

    public ExpandableBehavior(android.content.Context p1, android.util.AttributeSet p2)
    {
        return;
    }

    public abstract void f();

    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, android.view.View p3)
    {
        p3.getClass();
        throw new ClassCastException();
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p4, android.view.View p5, int p6)
    {
        if (!p5.isLaidOut()) {
            java.util.ArrayList v4_1 = p4.j(p5);
            int v6_1 = v4_1.size();
            int v1 = 0;
            while (v1 < v6_1) {
                v4_1.get(v1);
                this.f(p5);
                v1++;
            }
        }
        return 0;
    }
}
