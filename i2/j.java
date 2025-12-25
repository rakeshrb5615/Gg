package i2;
public final synthetic class j implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic j(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public synthetic j(l6.c p1, android.view.View p2)
    {
        this.a = 2;
        this.b = p1;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p9)
    {
        switch (this.a) {
            case 0:
                x3.e v0_6 = ((java.util.ArrayList) this.b);
                float v9_14 = ((Integer) p9.getAnimatedValue()).intValue();
                java.util.ArrayList v1_1 = v0_6.size();
                int v2_1 = 0;
                while (v2_1 < v1_1) {
                    int v3_1 = v0_6.get(v2_1);
                    v2_1++;
                    ((android.graphics.drawable.Drawable) v3_1).setTint(v9_14);
                }
                return;
            case 1:
                x3.e v0_4 = ((com.google.android.material.slider.Slider) this.b);
                if (v0_4.isAttachedToWindow()) {
                    v0_4.setValue(((Float) p9.getAnimatedValue()).floatValue());
                }
                return;
            case 2:
                ((android.view.View) ((h.n0) ((l6.c) this.b).b).i.getParent()).invalidate();
                return;
            case 3:
                x3.e v0_2 = ((x3.e) this.b);
                float v9_19 = ((Float) p9.getAnimatedValue()).floatValue();
                java.util.ArrayList v1_2 = v0_2.r;
                int v2_0 = v1_2.size();
                int v3_0 = 0;
                while (v3_0 < v2_0) {
                    b4.b v4_0 = v1_2.get(v3_0);
                    v3_0++;
                    b4.b v4_1 = ((b4.b) v4_0);
                    v4_1.Z = v9_19;
                    v4_1.a0 = v9_19;
                    v4_1.d0 = d3.a.b(0, 1065353216, 1044549468, 1065353216, v9_19);
                    v4_1.invalidateSelf();
                }
                v0_2.postInvalidateOnAnimation();
                return;
            default:
                x3.e v0_8 = ((z3.k) this.b);
                v0_8.getClass();
                v0_8.d.setAlpha(((Float) p9.getAnimatedValue()).floatValue());
                return;
        }
    }
}
