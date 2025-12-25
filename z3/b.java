package z3;
public final synthetic class b implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic int a;
    public final synthetic z3.d b;

    public synthetic b(z3.d p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p2)
    {
        switch (this.a) {
            case 0:
                com.google.android.material.internal.CheckableImageButton v0_3 = this.b;
                v0_3.getClass();
                v0_3.d.setAlpha(((Float) p2.getAnimatedValue()).floatValue());
                return;
            default:
                com.google.android.material.internal.CheckableImageButton v0_1 = this.b;
                v0_1.getClass();
                float v2_3 = ((Float) p2.getAnimatedValue()).floatValue();
                com.google.android.material.internal.CheckableImageButton v0_2 = v0_1.d;
                v0_2.setScaleX(v2_3);
                v0_2.setScaleY(v2_3);
                return;
        }
    }
}
