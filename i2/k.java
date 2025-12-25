package i2;
public final synthetic class k implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic int a;
    public final synthetic android.widget.TextView b;

    public synthetic k(int p1, android.widget.TextView p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p2)
    {
        switch (this.a) {
            case 0:
                this.b.setTextColor(((Integer) p2.getAnimatedValue()).intValue());
                return;
            default:
                this.b.setTextColor(((Integer) p2.getAnimatedValue()).intValue());
                return;
        }
    }
}
