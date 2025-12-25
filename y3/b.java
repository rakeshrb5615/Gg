package y3;
public final class b implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic int a;
    public final synthetic y3.h b;

    public synthetic b(y3.h p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p3)
    {
        switch (this.a) {
            case 0:
                this.b.i.setAlpha(((Float) p3.getAnimatedValue()).floatValue());
                return;
            case 1:
                float v3_3 = ((Float) p3.getAnimatedValue()).floatValue();
                y3.g v0_1 = this.b;
                v0_1.i.setScaleX(v3_3);
                v0_1.i.setScaleY(v3_3);
                return;
            case 2:
                this.b.i.setTranslationY(((float) ((Integer) p3.getAnimatedValue()).intValue()));
                return;
            default:
                this.b.i.setTranslationY(((float) ((Integer) p3.getAnimatedValue()).intValue()));
                return;
        }
    }
}
