package i2;
public final synthetic class s implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic int a;
    public final synthetic android.view.View b;

    public synthetic s(android.view.View p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p3)
    {
        switch (this.a) {
            case 0:
                android.view.View v0_1 = this.b;
                v0_1.getLayoutParams().height = ((Integer) p3.getAnimatedValue()).intValue();
                v0_1.requestLayout();
                return;
            case 1:
                android.view.View v0_2 = this.b;
                v0_2.getLayoutParams().height = ((Integer) p3.getAnimatedValue()).intValue();
                v0_2.requestLayout();
                return;
            default:
                android.view.View v0_3 = this.b;
                v0_3.getLayoutParams().height = ((Integer) p3.getAnimatedValue()).intValue();
                v0_3.requestLayout();
                return;
        }
    }
}
