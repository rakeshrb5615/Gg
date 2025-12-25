package z3;
public final class q extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic android.widget.TextView b;
    public final synthetic int c;
    public final synthetic android.widget.TextView d;
    public final synthetic z3.s e;

    public q(z3.s p1, int p2, android.widget.TextView p3, int p4, android.widget.TextView p5)
    {
        this.e = p1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p4)
    {
        int v0_0 = this.e;
        v0_0.n = this.a;
        v0_0.l = 0;
        int v1_0 = this.b;
        if (v1_0 != 0) {
            v1_0.setVisibility(4);
            if (this.c == 1) {
                int v0_1 = v0_0.r;
                if (v0_1 != 0) {
                    v0_1.setText(0);
                }
            }
        }
        android.widget.TextView v4_1 = this.d;
        if (v4_1 != null) {
            v4_1.setTranslationY(0);
            v4_1.setAlpha(1065353216);
        }
        return;
    }

    public final void onAnimationStart(android.animation.Animator p2)
    {
        p2 = this.d;
        if (p2 != null) {
            p2.setVisibility(0);
            p2.setAlpha(0);
        }
        return;
    }
}
