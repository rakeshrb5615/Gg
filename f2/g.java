package f2;
public final class g extends android.animation.AnimatorListenerAdapter implements f2.q {
    public final android.view.View a;
    public boolean b;

    public g(android.view.View p2)
    {
        this.b = 0;
        this.a = p2;
        return;
    }

    public final void a(f2.s p1)
    {
        return;
    }

    public final void b()
    {
        Float v1_2;
        android.view.View v0 = this.a;
        if (v0.getVisibility() != 0) {
            v1_2 = 0;
        } else {
            v1_2 = f2.c0.a.G(v0);
        }
        v0.setTag(2131362552, Float.valueOf(v1_2));
        return;
    }

    public final void c(f2.s p1)
    {
        return;
    }

    public final void d()
    {
        this.a.setTag(2131362552, 0);
        return;
    }

    public final void e(f2.s p1)
    {
        return;
    }

    public final void f(f2.s p1)
    {
        return;
    }

    public final void onAnimationCancel(android.animation.Animator p3)
    {
        f2.c0.a.S(this.a, 1065353216);
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p2)
    {
        this.onAnimationEnd(p2, 0);
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p3, boolean p4)
    {
        android.view.View v0 = this.a;
        if (this.b) {
            v0.setLayerType(0, 0);
        }
        if (p4 == 0) {
            f2.d0 v3_2 = f2.c0.a;
            v3_2.S(v0, 1065353216);
            v3_2.getClass();
        }
        return;
    }

    public final void onAnimationStart(android.animation.Animator p3)
    {
        p3 = this.a;
        if ((p3.hasOverlappingRendering()) && (p3.getLayerType() == 0)) {
            this.b = 1;
            p3.setLayerType(2, 0);
        }
        return;
    }
}
