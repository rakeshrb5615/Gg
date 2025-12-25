package x3;
public final class c extends y0.b {
    public final com.google.android.material.slider.Slider q;
    public final android.graphics.Rect r;

    public c(com.google.android.material.slider.Slider p2)
    {
        super(p2);
        super.r = new android.graphics.Rect();
        super.q = p2;
        return;
    }

    public final int n(float p5, float p6)
    {
        int v0 = 0;
        while(true) {
            boolean v1_0 = this.q;
            if (v0 >= v1_0.getValues().size()) {
                return -1;
            } else {
                android.graphics.Rect v2_2 = this.r;
                v1_0.B(v0, v2_2);
                if (v2_2.contains(((int) p5), ((int) p6))) {
                    break;
                }
                v0++;
            }
        }
        return v0;
    }

    public final void o(java.util.ArrayList p3)
    {
        int v0 = 0;
        while (v0 < this.q.getValues().size()) {
            p3.add(Integer.valueOf(v0));
            v0++;
        }
        return;
    }

    public final boolean s(int p7, int p8, android.os.Bundle p9)
    {
        com.google.android.material.slider.Slider v0 = this.q;
        if (v0.isEnabled()) {
            if ((p8 == 4096) || (p8 == 8192)) {
                int v9_1 = v0.v0;
                if (v9_1 == 0) {
                    v9_1 = 1065353216;
                }
                float v1_4 = ((v0.r0 - v0.q0) / v9_1);
                if (v1_4 > ((float) 20)) {
                    v9_1 *= ((float) Math.round((v1_4 / ((float) 20))));
                }
                if (p8 == 8192) {
                    v9_1 = (- v9_1);
                }
                if (v0.r()) {
                    v9_1 = (- v9_1);
                }
                if (v0.z(p7, c4.b.g((((Float) v0.getValues().get(p7)).floatValue() + v9_1), v0.getValueFrom(), v0.getValueTo()))) {
                    v0.setActiveThumbIndex(p7);
                    androidx.lifecycle.g0 v8_9 = v0.Z0;
                    v0.removeCallbacks(v8_9);
                    v0.postDelayed(v8_9, ((long) v0.W0));
                    v0.C();
                    v0.postInvalidate();
                    this.p(p7);
                    return 1;
                }
            } else {
                if ((p8 == 16908349) && ((p9 != 0) && ((p9.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) && (v0.z(p7, p9.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))))) {
                    v0.C();
                    v0.postInvalidate();
                    this.p(p7);
                    return 1;
                }
            }
        }
        return 0;
    }

    public final void u(int p11, r0.c p12)
    {
        android.view.accessibility.AccessibilityNodeInfo v0 = p12.a;
        p12.b(r0.b.n);
        com.google.android.material.slider.Slider v1_1 = this.q;
        android.os.Bundle v2_9 = v1_1.getValues();
        String v3_11 = ((Float) v2_9.get(p11));
        String v4_0 = v3_11.floatValue();
        String v5_1 = v1_1.getValueFrom();
        int v6_3 = v1_1.getValueTo();
        if (v1_1.isEnabled()) {
            if (v4_0 > v5_1) {
                p12.a(8192);
            }
            if (v4_0 < v6_3) {
                p12.a(4096);
            }
        }
        boolean v7_8 = java.text.NumberFormat.getNumberInstance();
        v7_8.setMaximumFractionDigits(2);
        try {
            String v5_2 = v7_8.parse(v7_8.format(((double) v5_1))).floatValue();
            int v6_4 = v7_8.parse(v7_8.format(((double) v6_3))).floatValue();
            String v4_1 = v7_8.parse(v7_8.format(((double) v4_0))).floatValue();
        } catch (java.text.ParseException) {
            boolean v7_11 = new StringBuilder("Error parsing value(");
            v7_11.append(v3_11);
            v7_11.append("), valueFrom(");
            v7_11.append(v5_2);
            v7_11.append("), and valueTo(");
            v7_11.append(v6_4);
            v7_11.append(") into a float.");
            android.util.Log.w("e", v7_11.toString());
        }
        v0.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo$RangeInfo.obtain(1, v5_2, v6_4, v4_1));
        p12.i(android.widget.SeekBar.getName());
        android.graphics.Rect v12_4 = new StringBuilder();
        if (v1_1.getContentDescription() != null) {
            v12_4.append(v1_1.getContentDescription());
            v12_4.append(",");
        }
        String v4_2 = v1_1.l(v4_1);
        String v5_0 = v1_1.getContext().getString(2131952074);
        if (v2_9.size() > 1) {
            android.os.Bundle v2_1;
            if (p11 != (v1_1.getValues().size() - 1)) {
                if (p11 != 0) {
                    v2_1 = "";
                } else {
                    v2_1 = v1_1.getContext().getString(2131952073);
                }
            } else {
                v2_1 = v1_1.getContext().getString(2131952072);
            }
            v5_0 = v2_1;
        }
        int v6_1;
        android.os.Bundle v2_4 = android.os.Build$VERSION.SDK_INT;
        if (v2_4 < 30) {
            v6_1 = v1_1.getTag(2131362484);
            if (!CharSequence.isInstance(v6_1)) {
                v6_1 = 0;
            }
        } else {
            v6_1 = q0.n0.b(v1_1);
        }
        int v6_2 = ((CharSequence) v6_1);
        if (android.text.TextUtils.isEmpty(v6_2)) {
            java.util.Locale.getDefault();
            android.os.Bundle v2_6 = new StringBuilder();
            v2_6.append(v5_0);
            v2_6.append(", ");
            v2_6.append(v4_2);
            v12_4.append(v2_6.toString());
        } else {
            if (v2_4 < 30) {
                v0.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", v6_2);
            } else {
                e0.b.j(v0, v6_2);
            }
        }
        v0.setContentDescription(v12_4.toString());
        android.graphics.Rect v12_2 = this.r;
        v1_1.B(p11, v12_2);
        v0.setBoundsInParent(v12_2);
        return;
    }
}
