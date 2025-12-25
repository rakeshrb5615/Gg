package f2;
public final class g0 extends android.animation.AnimatorListenerAdapter implements f2.q {
    public final android.view.ViewGroup a;
    public final android.view.View b;
    public final android.view.View c;
    public boolean d;
    public final synthetic f2.h e;

    public g0(f2.h p1, android.view.ViewGroup p2, android.view.View p3, android.view.View p4)
    {
        this.e = p1;
        this.d = 1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public final void a(f2.s p1)
    {
        return;
    }

    public final void b()
    {
        return;
    }

    public final void c(f2.s p1)
    {
        if (this.d) {
            this.g();
        }
        return;
    }

    public final void d()
    {
        return;
    }

    public final void f(f2.s p1)
    {
        p1.A(this);
        return;
    }

    public final void g()
    {
        this.c.setTag(2131362366, 0);
        this.a.getOverlay().remove(this.b);
        this.d = 0;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p1)
    {
        this.g();
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p1, boolean p2)
    {
        if (!p2) {
            this.g();
        }
        return;
    }

    public final void onAnimationPause(android.animation.Animator p2)
    {
        this.a.getOverlay().remove(this.b);
        return;
    }

    public final void onAnimationResume(android.animation.Animator p2)
    {
        f2.h v2_0 = this.b;
        if (v2_0.getParent() != null) {
            this.e.cancel();
            return;
        } else {
            q0.q0.a(this.a, v2_0);
            return;
        }
    }

    public final void onAnimationStart(android.animation.Animator p2, boolean p3)
    {
        if (p3 != 0) {
            android.view.View v0 = this.b;
            this.c.setTag(2131362366, v0);
            q0.q0.a(this.a, v0);
            this.d = 1;
        }
        return;
    }
}
