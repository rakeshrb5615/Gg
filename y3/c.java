package y3;
public final class c implements android.os.Handler$Callback {

    public final boolean handleMessage(android.os.Message p9)
    {
        boolean v0_0 = p9.what;
        if (!v0_0) {
            y3.b v9_3 = ((y3.h) p9.obj);
            boolean v0_4 = v9_3.i;
            if (v0_4.getParent() == null) {
                android.animation.ValueAnimator v3_1 = v0_4.getLayoutParams();
                if ((v3_1 instanceof b0.d)) {
                    android.animation.ValueAnimator v3_2 = ((b0.d) v3_1);
                    y3.a v4_9 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior();
                    long v5_0 = v4_9.i;
                    v5_0.getClass();
                    v5_0.b = v9_3.t;
                    v4_9.b = new y3.e(v9_3);
                    long v5_3 = v3_2.a;
                    if (v5_3 != v4_9) {
                        if (v5_3 != 0) {
                            v5_3.i();
                        }
                        v3_2.a = v4_9;
                        v3_2.b = 1;
                    }
                    v3_2.g = 80;
                }
                android.animation.ValueAnimator v3_3 = v9_3.g;
                v0_4.q = 1;
                v3_3.addView(v0_4);
                v0_4.q = 0;
                v9_3.f();
                v0_4.setVisibility(4);
            }
            if (!v0_4.isLaidOut()) {
                v9_3.r = 1;
                return 1;
            } else {
                v9_3.e();
                return 1;
            }
        } else {
            if (v0_0 == 1) {
                boolean v0_3 = ((y3.h) p9.obj);
                y3.b v9_2 = p9.arg1;
                android.animation.ValueAnimator v3_4 = v0_3.i;
                y3.a v4_11 = v0_3.s;
                if (v4_11 != null) {
                    y3.a v4_12 = v4_11.getEnabledAccessibilityServiceList(1);
                    if ((v4_12 != null) && (v4_12.isEmpty())) {
                        if (v3_4.getVisibility() == 0) {
                            if (v3_4.getAnimationMode() != 1) {
                                android.animation.ValueAnimator v3_7 = new android.animation.ValueAnimator();
                                long v5_4 = v0_3.i;
                                int v6_1 = v5_4.getHeight();
                                long v5_5 = v5_4.getLayoutParams();
                                if ((v5_5 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                                    v6_1 += ((android.view.ViewGroup$MarginLayoutParams) v5_5).bottomMargin;
                                }
                                v3_7.setIntValues(new int[] {0, v6_1}));
                                v3_7.setInterpolator(v0_3.e);
                                v3_7.setDuration(((long) v0_3.c));
                                v3_7.addListener(new y3.a(v0_3, v9_2, 2));
                                v3_7.addUpdateListener(new y3.b(v0_3, 3));
                                v3_7.start();
                                return 1;
                            } else {
                                android.animation.ValueAnimator v3_9 = new float[2];
                                v3_9 = {1065353216, 0};
                                android.animation.ValueAnimator v3_0 = android.animation.ValueAnimator.ofFloat(v3_9);
                                v3_0.setInterpolator(v0_3.d);
                                v3_0.addUpdateListener(new y3.b(v0_3, 0));
                                v3_0.setDuration(((long) v0_3.b));
                                v3_0.addListener(new y3.a(v0_3, v9_2, 0));
                                v3_0.start();
                                return 1;
                            }
                        }
                    }
                }
                v0_3.c();
                return 1;
            } else {
                return 0;
            }
        }
    }
}
