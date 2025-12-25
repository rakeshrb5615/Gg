package com.google.android.material.snackbar;
public class BaseTransientBottomBar$Behavior extends com.google.android.material.behavior.SwipeDismissBehavior {
    public final j6.o i;

    public BaseTransientBottomBar$Behavior()
    {
        j6.o v0_1 = new j6.o(21, 0);
        this.f = Math.min(Math.max(0, 1036831949), 1065353216);
        this.g = Math.min(Math.max(0, 1058642330), 1065353216);
        this.e = 0;
        this.i = v0_1;
        return;
    }

    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout p4, android.view.View p5, android.view.MotionEvent p6)
    {
        y3.f v0_0 = this.i;
        v0_0.getClass();
        j6.s v1_3 = p6.getActionMasked();
        if (v1_3 == null) {
            if (p4.o(p5, ((int) p6.getX()), ((int) p6.getY()))) {
                j6.s.h().o(((y3.f) v0_0.b));
            }
        } else {
            if ((v1_3 == 1) || (v1_3 == 3)) {
                j6.s.h().p(((y3.f) v0_0.b));
            }
        }
        return super.j(p4, p5, p6);
    }

    public final boolean v(android.view.View p2)
    {
        this.i.getClass();
        return (p2 instanceof y3.g);
    }
}
