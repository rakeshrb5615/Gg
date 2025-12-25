package r3;
public final class h extends r3.a {
    public final float g;
    public final float h;
    public final float i;

    public h(android.view.View p2)
    {
        super(p2);
        float v2_2 = p2.getResources();
        super.g = v2_2.getDimension(2131165381);
        super.h = v2_2.getDimension(2131165380);
        super.i = v2_2.getDimension(2131165382);
        return;
    }

    public final void a(float p12, boolean p13, int p14)
    {
        int v14_1;
        float v12_1 = this.a.getInterpolation(p12);
        android.view.ViewGroup v0_1 = this.b;
        int v2 = 0;
        int v3 = 1;
        if ((android.view.Gravity.getAbsoluteGravity(p14, v0_1.getLayoutDirection()) & 3) != 3) {
            v14_1 = 0;
        } else {
            v14_1 = 1;
        }
        if (p13 != v14_1) {
            v3 = 0;
        }
        int v13_1 = v0_1.getWidth();
        float v1_0 = v0_1.getHeight();
        int v4_0 = ((float) v13_1);
        if (v4_0 > 0) {
            float v1_1 = ((float) v1_0);
            if (v1_1 > 0) {
                float v6_3 = (this.g / v4_0);
                android.view.View v7_1 = (this.h / v4_0);
                int v8_1 = (this.i / v1_1);
                if (v14_1 != 0) {
                    v4_0 = 0;
                }
                v0_1.setPivotX(v4_0);
                if (v3 == 0) {
                    v7_1 = (- v6_3);
                }
                float v1_2 = d3.a.a(0, v7_1, v12_1);
                float v6_4 = (v1_2 + 1065353216);
                float v12_3 = (1065353216 - d3.a.a(0, v8_1, v12_1));
                if ((!Float.isNaN(v6_4)) && (!Float.isNaN(v12_3))) {
                    v0_1.setScaleX(v6_4);
                    v0_1.setScaleY(v12_3);
                    if ((v0_1 instanceof android.view.ViewGroup)) {
                        android.view.ViewGroup v0_2 = ((android.view.ViewGroup) v0_1);
                        while (v2 < v0_2.getChildCount()) {
                            int v8_4;
                            android.view.View v7_6 = v0_2.getChildAt(v2);
                            if (v14_1 == 0) {
                                v8_4 = ((float) (- v7_6.getLeft()));
                            } else {
                                v8_4 = ((float) (v7_6.getWidth() + (v13_1 - v7_6.getRight())));
                            }
                            int v8_10;
                            v7_6.setPivotX(v8_4);
                            v7_6.setPivotY(((float) (- v7_6.getTop())));
                            if (v3 == 0) {
                                v8_10 = 1065353216;
                            } else {
                                v8_10 = (1065353216 - v1_2);
                            }
                            int v9_3;
                            if (v12_3 == 0) {
                                v9_3 = 1065353216;
                            } else {
                                v9_3 = ((v6_4 / v12_3) * v8_10);
                            }
                            if ((!Float.isNaN(v8_10)) && (!Float.isNaN(v9_3))) {
                                v7_6.setScaleX(v8_10);
                                v7_6.setScaleY(v9_3);
                            }
                            v2++;
                        }
                    }
                }
            }
        }
        return;
    }
}
