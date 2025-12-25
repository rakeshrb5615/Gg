package r3;
public final class f extends r3.a {
    public final float g;
    public final float h;

    public f(android.view.View p2)
    {
        super(p2);
        float v2_1 = p2.getResources();
        super.g = v2_1.getDimension(2131165376);
        super.h = v2_1.getDimension(2131165377);
        return;
    }

    public final android.animation.AnimatorSet a()
    {
        android.animation.AnimatorSet v0_1 = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator v3_5 = new float[1];
        v3_5[0] = 1065353216;
        android.view.ViewGroup v6_1 = this.b;
        int v1_0 = android.animation.ObjectAnimator.ofFloat(v6_1, android.view.View.SCALE_X, v3_5);
        android.animation.Animator[] v7_0 = new float[1];
        v7_0[0] = 1065353216;
        android.animation.ObjectAnimator v3_1 = android.animation.ObjectAnimator.ofFloat(v6_1, android.view.View.SCALE_Y, v7_0);
        android.animation.Animator[] v7_2 = new android.animation.Animator[2];
        v7_2[0] = v1_0;
        v7_2[1] = v3_1;
        v0_1.playTogether(v7_2);
        if ((v6_1 instanceof android.view.ViewGroup)) {
            android.view.ViewGroup v6_0 = ((android.view.ViewGroup) v6_1);
            int v1_3 = 0;
            while (v1_3 < v6_0.getChildCount()) {
                android.animation.ObjectAnimator v3_3 = v6_0.getChildAt(v1_3);
                float[] v8 = new float[1];
                v8[0] = 1065353216;
                android.animation.Animator[] v7_4 = new android.animation.Animator[1];
                v7_4[0] = android.animation.ObjectAnimator.ofFloat(v3_3, android.view.View.SCALE_Y, v8);
                v0_1.playTogether(v7_4);
                v1_3++;
            }
        }
        v0_1.setInterpolator(new l1.a(1));
        return v0_1;
    }

    public final void b(float p8)
    {
        float v8_1 = this.a.getInterpolation(p8);
        android.view.ViewGroup v0_1 = this.b;
        int v1_4 = ((float) v0_1.getWidth());
        int v2_3 = ((float) v0_1.getHeight());
        if ((v1_4 > 0) && (v2_3 > 0)) {
            int v1_1 = (this.h / v2_3);
            float v4_5 = (1065353216 - d3.a.a(0, (this.g / v1_4), v8_1));
            float v8_3 = (1065353216 - d3.a.a(0, v1_1, v8_1));
            if ((!Float.isNaN(v4_5)) && (!Float.isNaN(v8_3))) {
                v0_1.setScaleX(v4_5);
                v0_1.setPivotY(v2_3);
                v0_1.setScaleY(v8_3);
                if ((v0_1 instanceof android.view.ViewGroup)) {
                    android.view.ViewGroup v0_2 = ((android.view.ViewGroup) v0_1);
                    int v2_1 = 0;
                    while (v2_1 < v0_2.getChildCount()) {
                        int v6_4;
                        android.view.View v5_3 = v0_2.getChildAt(v2_1);
                        v5_3.setPivotY(((float) (- v5_3.getTop())));
                        if (v8_3 == 0) {
                            v6_4 = 1065353216;
                        } else {
                            v6_4 = (v4_5 / v8_3);
                        }
                        v5_3.setScaleY(v6_4);
                        v2_1++;
                    }
                }
            }
        }
        return;
    }
}
