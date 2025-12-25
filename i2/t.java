package i2;
public final synthetic class t implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic android.view.View a;
    public final synthetic int b;

    public synthetic t(android.view.View p1, int p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p3)
    {
        float v3_4 = ((Integer) p3.getAnimatedValue()).intValue();
        android.view.View v0 = this.a;
        v0.getLayoutParams().height = v3_4;
        v0.requestLayout();
        v0.setTranslationY(((float) (this.b - v3_4)));
        return;
    }
}
