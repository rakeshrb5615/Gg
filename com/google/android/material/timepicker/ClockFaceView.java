package com.google.android.material.timepicker;
 class ClockFaceView extends com.google.android.material.timepicker.h implements com.google.android.material.timepicker.f {
    public final android.graphics.Rect A;
    public final android.graphics.RectF B;
    public final android.graphics.Rect C;
    public final android.util.SparseArray D;
    public final com.google.android.material.timepicker.c E;
    public final int[] F;
    public final float[] G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final String[] L;
    public float M;
    public final android.content.res.ColorStateList N;
    public final com.google.android.material.timepicker.ClockHandView z;

    public ClockFaceView(android.content.Context p11, android.util.AttributeSet p12)
    {
        super(p11, p12);
        super.A = new android.graphics.Rect();
        super.B = new android.graphics.RectF();
        super.C = new android.graphics.Rect();
        android.util.SparseArray v0_2 = new android.util.SparseArray();
        super.D = v0_2;
        android.content.res.Resources v1_1 = new float[3];
        v1_1 = {0, 1063675494, 1065353216};
        super.G = v1_1;
        boolean v12_1 = p11.obtainStyledAttributes(p12, c3.a.d, 2130969464, 2132018451);
        android.content.res.Resources v1_3 = super.getResources();
        int v3_2 = j5.t1.v(p11, v12_1, 1);
        super.N = v3_2;
        android.view.LayoutInflater.from(p11).inflate(2131558479, super, 1);
        int v4_3 = ((com.google.android.material.timepicker.ClockHandView) super.findViewById(2131362188));
        super.z = v4_3;
        super.H = v1_3.getDimensionPixelSize(2131165985);
        super.F = new int[] {v3_2.getColorForState(new int[] {16842913}), v3_2.getDefaultColor()), v3_2.getColorForState(new int[] {16842913}), v3_2.getDefaultColor()), v3_2.getDefaultColor()});
        v4_3.c.add(super);
        int v3_8 = e0.c.getColorStateList(p11, 2131100577).getDefaultColor();
        int v11_7 = j5.t1.v(p11, v12_1, 0);
        if (v11_7 != 0) {
            v3_8 = v11_7.getDefaultColor();
        }
        super.setBackgroundColor(v3_8);
        super.getViewTreeObserver().addOnPreDrawListener(new com.google.android.material.timepicker.b(super));
        super.setFocusable(0);
        v12_1.recycle();
        super.E = new com.google.android.material.timepicker.c(super);
        int v11_12 = new String[12];
        java.util.Arrays.fill(v11_12, "");
        super.L = v11_12;
        int v11_14 = android.view.LayoutInflater.from(super.getContext());
        boolean v12_3 = v0_2.size();
        int v3_0 = 0;
        int v5_0 = 0;
        while (v3_0 < Math.max(super.L.length, v12_3)) {
            android.widget.TextView v6_1 = ((android.widget.TextView) v0_2.get(v3_0));
            if (v3_0 < super.L.length) {
                if (v6_1 == null) {
                    v6_1 = ((android.widget.TextView) v11_14.inflate(2131558478, super, 0));
                    v0_2.put(v3_0, v6_1);
                    super.addView(v6_1);
                }
                v6_1.setText(super.L[v3_0]);
                v6_1.setTag(2131362204, Integer.valueOf(v3_0));
                android.content.res.ColorStateList v7_6 = ((v3_0 / 12) + 1);
                v6_1.setTag(2131362189, Integer.valueOf(v7_6));
                if (v7_6 > 1) {
                    v5_0 = 1;
                }
                q0.q0.n(v6_1, super.E);
                v6_1.setTextColor(super.N);
            } else {
                super.removeView(v6_1);
                v0_2.remove(v3_0);
            }
            v3_0++;
        }
        int v11_15 = super.z;
        if ((v11_15.b) && (v5_0 == 0)) {
            v11_15.s = 1;
        }
        v11_15.b = v5_0;
        v11_15.invalidate();
        super.I = v1_3.getDimensionPixelSize(2131166014);
        super.J = v1_3.getDimensionPixelSize(2131166015);
        super.K = v1_3.getDimensionPixelSize(2131165992);
        return;
    }

    public final void m()
    {
        int v0_1 = new z.n();
        v0_1.b(this);
        android.widget.TextView v1_6 = new java.util.HashMap();
        int v3_0 = 0;
        while (v3_0 < this.getChildCount()) {
            java.util.List v4_3 = this.getChildAt(v3_0);
            if ((v4_3.getId() != 2131361965) && (!"skip".equals(v4_3.getTag()))) {
                java.util.List v5_2 = ((Integer) v4_3.getTag(2131362189));
                if (v5_2 == null) {
                    v5_2 = Integer.valueOf(1);
                }
                if (!v1_6.containsKey(v5_2)) {
                    v1_6.put(v5_2, new java.util.ArrayList());
                }
                ((java.util.List) v1_6.get(v5_2)).add(v4_3);
            }
            v3_0++;
        }
        android.widget.TextView v1_1 = v1_6.entrySet().iterator();
        while (v1_1.hasNext()) {
            int v3_8;
            int v3_4 = ((java.util.Map$Entry) v1_1.next());
            java.util.List v4_1 = ((java.util.List) v3_4.getValue());
            if (((Integer) v3_4.getKey()).intValue() != 2) {
                v3_8 = this.x;
            } else {
                v3_8 = Math.round((((float) this.x) * 1059648963));
            }
            java.util.Iterator v6_5 = v4_1.iterator();
            float v7 = 0;
            while (v6_5.hasNext()) {
                float v8_3 = ((android.view.View) v6_5.next()).getId();
                java.util.HashMap v10 = v0_1.c;
                if (!v10.containsKey(Integer.valueOf(v8_3))) {
                    v10.put(Integer.valueOf(v8_3), new z.i());
                }
                float v8_7 = ((z.i) v10.get(Integer.valueOf(v8_3))).d;
                v8_7.z = 2131361965;
                v8_7.A = v3_8;
                v8_7.B = v7;
                v7 += (1135869952 / ((float) v4_1.size()));
            }
        }
        v0_1.a(this);
        this.setConstraintSet(0);
        this.requestLayout();
        int v0_3 = 0;
        while(true) {
            android.widget.TextView v1_2 = this.D;
            if (v0_3 >= v1_2.size()) {
                break;
            }
            ((android.widget.TextView) v1_2.get(v0_3)).setVisibility(0);
            v0_3++;
        }
        return;
    }

    public final void n()
    {
        android.graphics.RectF v1_1 = this.z.m;
        int v2_1 = 2139095039;
        android.widget.TextView v6 = 0;
        android.widget.TextView v5_3 = 0;
        while(true) {
            android.widget.TextView v7_2 = this.D;
            float v9_0 = this.A;
            android.graphics.RectF v10 = this.B;
            if (v5_3 >= v7_2.size()) {
                break;
            }
            android.widget.TextView v7_1 = ((android.widget.TextView) v7_2.get(v5_3));
            if (v7_1 != null) {
                v7_1.getHitRect(v9_0);
                v10.set(v9_0);
                v10.union(v1_1);
                float v9_2 = (v10.height() * v10.width());
                if (v9_2 < v2_1) {
                    v6 = v7_1;
                    v2_1 = v9_2;
                }
            }
            v5_3++;
        }
        int v2_0 = 0;
        while (v2_0 < v7_2.size()) {
            android.widget.TextView v5_2 = ((android.widget.TextView) v7_2.get(v2_0));
            if (v5_2 != null) {
                android.text.TextPaint v8_1;
                if (v5_2 != v6) {
                    v8_1 = 0;
                } else {
                    v8_1 = 1;
                }
                android.graphics.RadialGradient v11_3;
                v5_2.setSelected(v8_1);
                v5_2.getHitRect(v9_0);
                v10.set(v9_0);
                android.text.TextPaint v8_2 = this.C;
                v5_2.getLineBounds(0, v8_2);
                v10.inset(((float) v8_2.left), ((float) v8_2.top));
                if (android.graphics.RectF.intersects(v1_1, v10)) {
                    v11_3 = new android.graphics.RadialGradient((v1_1.centerX() - v10.left), (v1_1.centerY() - v10.top), (1056964608 * v1_1.width()), this.F, this.G, android.graphics.Shader$TileMode.CLAMP);
                } else {
                    v11_3 = 0;
                }
                v5_2.getPaint().setShader(v11_3);
                v5_2.invalidate();
            }
            v2_0++;
        }
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p4)
    {
        super.onInitializeAccessibilityNodeInfo(p4);
        p4.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(1, this.L.length, 0, 1));
        return;
    }

    public final void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        super.onLayout(p1, p2, p3, p4, p5).n();
        return;
    }

    public final void onMeasure(int p3, int p4)
    {
        int v3_4 = this.getResources().getDisplayMetrics();
        int v3_3 = ((int) (((float) this.K) / Math.max(Math.max((((float) this.I) / ((float) v3_4.heightPixels)), (((float) this.J) / ((float) v3_4.widthPixels))), 1065353216)));
        int v4_5 = android.view.View$MeasureSpec.makeMeasureSpec(v3_3, 1073741824);
        this.setMeasuredDimension(v3_3, v3_3);
        super.onMeasure(v4_5, v4_5);
        return;
    }
}
