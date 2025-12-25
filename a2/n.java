package a2;
public final class n extends android.animation.AnimatorListenerAdapter {
    public boolean a;
    public final synthetic a2.p b;

    public n(a2.p p1)
    {
        this.b = p1;
        this.a = 0;
        return;
    }

    public final void onAnimationCancel(android.animation.Animator p1)
    {
        this.a = 1;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p4)
    {
        if (!this.a) {
            androidx.recyclerview.widget.RecyclerView v4_2 = this.b;
            if (((Float) v4_2.z.getAnimatedValue()).floatValue() != 0) {
                v4_2.A = 2;
                v4_2.s.invalidate();
                return;
            } else {
                v4_2.A = 0;
                v4_2.f(0);
                return;
            }
        } else {
            this.a = 0;
            return;
        }
    }
}
