package z3;
public final class c extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic z3.d b;

    public synthetic c(z3.d p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public void onAnimationEnd(android.animation.Animator p2)
    {
        switch (this.a) {
            case 1:
                this.b.b.h(0);
                return;
            default:
                super.onAnimationEnd(p2);
                return;
        }
    }

    public void onAnimationStart(android.animation.Animator p2)
    {
        switch (this.a) {
            case 0:
                this.b.b.h(1);
                return;
            default:
                super.onAnimationStart(p2);
                return;
        }
    }
}
