package i2;
public final class x extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic android.view.View b;

    public synthetic x(android.view.View p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p2)
    {
        switch (this.a) {
            case 0:
                int v0_2 = this.b;
                v0_2.setVisibility(8);
                v0_2.getLayoutParams().height = -2;
                return;
            default:
                int v0_0 = this.b;
                v0_0.setVisibility(8);
                v0_0.getLayoutParams().height = -2;
                return;
        }
    }
}
