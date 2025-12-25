package y3;
public final class d implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic y3.h b;

    public synthetic d(y3.h p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        int v1_0 = this.b;
        switch (this.a) {
            case 0:
                String v0_8 = v1_0.i;
                if (v0_8 != null) {
                    y3.a v4_9;
                    y3.a v4_6 = ((android.view.WindowManager) v1_0.h.getSystemService("window"));
                    if (android.os.Build$VERSION.SDK_INT < 30) {
                        y3.a v4_7 = v4_6.getDefaultDisplay();
                        int v5_3 = new android.graphics.Point();
                        v4_7.getRealSize(v5_3);
                        v4_9 = new android.graphics.Rect();
                        v4_9.right = v5_3.x;
                        v4_9.bottom = v5_3.y;
                    } else {
                        v4_9 = q3.n.a(v4_6);
                    }
                    y3.a v4_10 = v4_9.height();
                    android.view.ViewGroup$MarginLayoutParams v2_4 = new int[2];
                    v0_8.getLocationInWindow(v2_4);
                    y3.a v4_12 = ((v4_10 - (v0_8.getHeight() + v2_4[1])) + ((int) v0_8.getTranslationY()));
                    android.view.ViewGroup$MarginLayoutParams v2_8 = v1_0.p;
                    if (v4_12 < v2_8) {
                        android.view.ViewGroup$MarginLayoutParams v2_9 = v0_8.getLayoutParams();
                        if ((v2_9 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                            int v3_4 = v1_0.p;
                            v1_0.q = v3_4;
                            android.view.ViewGroup$MarginLayoutParams v2_10 = ((android.view.ViewGroup$MarginLayoutParams) v2_9);
                            v2_10.bottomMargin = ((v3_4 - v4_12) + v2_10.bottomMargin);
                            v0_8.requestLayout();
                        } else {
                            android.util.Log.w(y3.h.z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        }
                    } else {
                        v1_0.q = v2_8;
                    }
                }
                return;
            case 1:
                v1_0.c();
                return;
            default:
                String v0_7 = v1_0.i;
                if (v0_7 != null) {
                    if (v0_7.getParent() != null) {
                        v0_7.setVisibility(0);
                    }
                    if (v0_7.getAnimationMode() != 1) {
                        y3.a v4_15 = v0_7.getHeight();
                        float v6_7 = v0_7.getLayoutParams();
                        if ((v6_7 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                            v4_15 += ((android.view.ViewGroup$MarginLayoutParams) v6_7).bottomMargin;
                        }
                        v0_7.setTranslationY(((float) v4_15));
                        String v0_10 = new android.animation.ValueAnimator();
                        v0_10.setIntValues(new int[] {v4_15, 0}));
                        v0_10.setInterpolator(v1_0.e);
                        v0_10.setDuration(((long) v1_0.c));
                        v0_10.addListener(new y3.a(v1_0, 1));
                        v0_10.addUpdateListener(new y3.b(v1_0, 2));
                        v0_10.start();
                    } else {
                        String v0_1 = new float[2];
                        v0_1 = {0, 1065353216};
                        String v0_2 = android.animation.ValueAnimator.ofFloat(v0_1);
                        v0_2.setInterpolator(v1_0.d);
                        v0_2.addUpdateListener(new y3.b(v1_0, 0));
                        y3.a v4_3 = new float[2];
                        v4_3 = {1061997773, 1065353216};
                        y3.a v4_4 = android.animation.ValueAnimator.ofFloat(v4_3);
                        v4_4.setInterpolator(v1_0.f);
                        v4_4.addUpdateListener(new y3.b(v1_0, 1));
                        float v6_4 = new android.animation.AnimatorSet();
                        android.view.ViewGroup$MarginLayoutParams v2_0 = new android.animation.Animator[2];
                        v2_0[0] = v0_2;
                        v2_0[1] = v4_4;
                        v6_4.playTogether(v2_0);
                        v6_4.setDuration(((long) v1_0.a));
                        v6_4.addListener(new y3.a(v1_0, 3));
                        v6_4.start();
                    }
                }
                return;
        }
    }
}
