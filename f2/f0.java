package f2;
public final class f0 extends android.animation.AnimatorListenerAdapter implements f2.q {
    public final android.view.View a;
    public final int b;
    public final android.view.ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public f0(android.view.View p2, int p3)
    {
        this.f = 0;
        this.a = p2;
        this.b = p3;
        this.c = ((android.view.ViewGroup) p2.getParent());
        this.d = 1;
        this.g(1);
        return;
    }

    public final void a(f2.s p1)
    {
        return;
    }

    public final void b()
    {
        this.g(0);
        if (!this.f) {
            f2.c0.b(this.a, this.b);
        }
        return;
    }

    public final void c(f2.s p1)
    {
        return;
    }

    public final void d()
    {
        this.g(1);
        if (!this.f) {
            f2.c0.b(this.a, 0);
        }
        return;
    }

    public final void f(f2.s p1)
    {
        p1.A(this);
        return;
    }

    public final void g(boolean p2)
    {
        if ((this.d) && (this.e != p2)) {
            android.view.ViewGroup v0_2 = this.c;
            if (v0_2 != null) {
                this.e = p2;
                c4.b.d0(v0_2, p2);
            }
        }
        return;
    }

    public final void onAnimationCancel(android.animation.Animator p1)
    {
        this.f = 1;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p2)
    {
        if (!this.f) {
            f2.c0.b(this.a, this.b);
            int v2_2 = this.c;
            if (v2_2 != 0) {
                v2_2.invalidate();
            }
        }
        this.g(0);
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p1, boolean p2)
    {
        if (p2 == 0) {
            if (!this.f) {
                f2.c0.b(this.a, this.b);
                int v1_2 = this.c;
                if (v1_2 != 0) {
                    v1_2.invalidate();
                }
            }
            this.g(0);
        }
        return;
    }

    public final void onAnimationRepeat(android.animation.Animator p1)
    {
        return;
    }

    public final void onAnimationStart(android.animation.Animator p1)
    {
        return;
    }

    public final void onAnimationStart(android.animation.Animator p1, boolean p2)
    {
        if (p2 != 0) {
            f2.c0.b(this.a, 0);
            android.view.ViewGroup v1_1 = this.c;
            if (v1_1 != null) {
                v1_1.invalidate();
            }
        }
        return;
    }
}
