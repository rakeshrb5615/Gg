package a2;
public final class o implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic o(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p4)
    {
        switch (this.a) {
            case 0:
                int v4_6 = ((int) (((Float) p4.getAnimatedValue()).floatValue() * 1132396544));
                v3.k v0_3 = ((a2.p) this.b);
                v0_3.c.setAlpha(v4_6);
                v0_3.d.setAlpha(v4_6);
                v0_3.s.invalidate();
                return;
            case 1:
                int v4_13 = ((Float) p4.getAnimatedValue()).floatValue();
                v3.k v0_9 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b).i;
                if (v0_9 != null) {
                    v3.i v1_0 = v0_9.b;
                    if (v1_0.j != v4_13) {
                        v1_0.j = v4_13;
                        v0_9.f = 1;
                        v0_9.m = 1;
                        v0_9.invalidateSelf();
                    }
                }
                return;
            default:
                ((com.google.android.material.textfield.TextInputLayout) this.b).C0.m(((Float) p4.getAnimatedValue()).floatValue());
                return;
        }
    }
}
