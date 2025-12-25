package a2;
public final class g extends android.animation.AnimatorListenerAdapter {
    public final synthetic a2.k1 a;
    public final synthetic int b;
    public final synthetic android.view.View c;
    public final synthetic int d;
    public final synthetic android.view.ViewPropertyAnimator e;
    public final synthetic a2.k f;

    public g(a2.k p1, a2.k1 p2, int p3, android.view.View p4, int p5, android.view.ViewPropertyAnimator p6)
    {
        this.f = p1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        return;
    }

    public final void onAnimationCancel(android.animation.Animator p3)
    {
        android.view.View v1 = this.c;
        if (this.b != 0) {
            v1.setTranslationX(0);
        }
        if (this.d != 0) {
            v1.setTranslationY(0);
        }
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p3)
    {
        this.e.setListener(0);
        a2.k v3_1 = this.f;
        a2.k1 v0_1 = this.a;
        v3_1.c(v0_1);
        v3_1.p.remove(v0_1);
        v3_1.i();
        return;
    }

    public final void onAnimationStart(android.animation.Animator p1)
    {
        this.f.getClass();
        return;
    }
}
