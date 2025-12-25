package r3;
public final class g extends android.animation.AnimatorListenerAdapter {
    public final synthetic boolean a;
    public final synthetic int b;
    public final synthetic r3.h c;

    public g(r3.h p1, boolean p2, int p3)
    {
        this.c = p1;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p4)
    {
        p4 = this.c;
        p4.b.setTranslationX(0);
        p4.a(0, this.a, this.b);
        return;
    }
}
