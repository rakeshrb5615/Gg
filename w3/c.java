package w3;
public final synthetic class c implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic com.google.android.material.sidesheet.SideSheetBehavior a;
    public final synthetic android.view.ViewGroup$MarginLayoutParams b;
    public final synthetic int c;
    public final synthetic android.view.View d;

    public synthetic c(com.google.android.material.sidesheet.SideSheetBehavior p1, android.view.ViewGroup$MarginLayoutParams p2, int p3, android.view.View p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p4)
    {
        this.a.a.g(this.b, d3.a.c(this.c, 0, p4.getAnimatedFraction()));
        this.d.requestLayout();
        return;
    }
}
