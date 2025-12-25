package com.google.android.material.behavior;
public class SwipeDismissBehavior extends b0.a {
    public y0.e a;
    public y3.e b;
    public boolean c;
    public boolean d;
    public int e;
    public float f;
    public float g;
    public final f3.d h;

    public SwipeDismissBehavior()
    {
        this.e = 2;
        this.f = 0;
        this.g = 1056964608;
        this.h = new f3.d(this);
        return;
    }

    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout p5, android.view.View p6, android.view.MotionEvent p7)
    {
        android.content.Context v0_0 = this.c;
        f3.d v1_2 = p7.getActionMasked();
        if (v1_2 == null) {
            v0_0 = p5.o(p6, ((int) p7.getX()), ((int) p7.getY()));
            this.c = v0_0;
        } else {
            if ((v1_2 == 1) || (v1_2 == 3)) {
                this.c = 0;
            }
        }
        if (v0_0 != null) {
            if (this.a == null) {
                this.a = new y0.e(p5.getContext(), p5, this.h);
            }
            if ((!this.d) && (this.a.p(p7))) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p3, android.view.View p4, int p5)
    {
        if (p4.getImportantForAccessibility() == 0) {
            p4.setImportantForAccessibility(1);
            q0.q0.k(p4, 1048576);
            q0.q0.i(p4, 0);
            if (this.v(p4)) {
                q0.q0.l(p4, r0.b.j, new l6.c(this, 17));
            }
        }
        return 0;
    }

    public final boolean u(android.view.View p2, android.view.MotionEvent p3)
    {
        if (this.a == null) {
            return 0;
        } else {
            if ((!this.d) || (p3.getActionMasked() != 3)) {
                this.a.j(p3);
            }
            return 1;
        }
    }

    public boolean v(android.view.View p1)
    {
        return 1;
    }
}
