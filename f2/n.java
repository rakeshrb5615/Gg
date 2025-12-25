package f2;
public final class n extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public n(f2.s p2, r.e p3)
    {
        this.a = 0;
        this.c = p2;
        this.b = p3;
        return;
    }

    public n(q0.c1 p2, android.view.View p3)
    {
        this.a = 1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p2)
    {
        switch (this.a) {
            case 0:
                ((r.e) this.b).remove(p2);
                ((f2.s) this.c).t.remove(p2);
                return;
            default:
                ((q0.c1) this.b).a.d(1065353216);
                q0.x0.e(((android.view.View) this.c));
                return;
        }
    }

    public void onAnimationStart(android.animation.Animator p2)
    {
        switch (this.a) {
            case 0:
                ((f2.s) this.c).t.add(p2);
                return;
            default:
                super.onAnimationStart(p2);
                return;
        }
    }
}
