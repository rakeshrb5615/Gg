package a2;
public final class f extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic a2.k1 b;
    public final synthetic android.view.View c;
    public final synthetic android.view.ViewPropertyAnimator d;
    public final synthetic a2.k e;

    public f(a2.k p2, a2.k1 p3, android.view.View p4, android.view.ViewPropertyAnimator p5)
    {
        this.a = 1;
        this.e = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public f(a2.k p2, a2.k1 p3, android.view.ViewPropertyAnimator p4, android.view.View p5)
    {
        this.a = 0;
        this.e = p2;
        this.b = p3;
        this.d = p4;
        this.c = p5;
        return;
    }

    public void onAnimationCancel(android.animation.Animator p2)
    {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1065353216);
                return;
            default:
                super.onAnimationCancel(p2);
                return;
        }
    }

    public final void onAnimationEnd(android.animation.Animator p3)
    {
        switch (this.a) {
            case 0:
                this.d.setListener(0);
                this.c.setAlpha(1065353216);
                a2.k v3_5 = this.e;
                a2.k1 v0_4 = this.b;
                v3_5.c(v0_4);
                v3_5.q.remove(v0_4);
                v3_5.i();
                return;
            default:
                this.d.setListener(0);
                a2.k v3_2 = this.e;
                a2.k1 v0_1 = this.b;
                v3_2.c(v0_1);
                v3_2.o.remove(v0_1);
                v3_2.i();
                return;
        }
    }

    public final void onAnimationStart(android.animation.Animator p1)
    {
        switch (this.a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }
}
