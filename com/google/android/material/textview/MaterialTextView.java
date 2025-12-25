package com.google.android.material.textview;
public class MaterialTextView extends n.b1 {

    public MaterialTextView(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 16842884, 0), p9, 16842884);
        android.content.res.TypedArray v8_6 = super.getContext();
        if (c4.b.U(v8_6, 2130969906, 1)) {
            android.content.res.Resources$Theme v2_1 = v8_6.getTheme();
            int[] v4 = c3.a.v;
            android.content.res.TypedArray v5 = v2_1.obtainStyledAttributes(p9, v4, 16842884, 0);
            android.content.res.TypedArray v8_1 = com.google.android.material.textview.MaterialTextView.g(v8_6, v5, new int[] {1, 2}));
            v5.recycle();
            if (v8_1 == -1) {
                android.content.res.TypedArray v8_2 = v2_1.obtainStyledAttributes(p9, v4, 16842884, 0);
                int v9_1 = v8_2.getResourceId(0, -1);
                v8_2.recycle();
                if (v9_1 != -1) {
                    android.content.res.TypedArray v8_5 = v2_1.obtainStyledAttributes(v9_1, c3.a.u);
                    int v9_3 = com.google.android.material.textview.MaterialTextView.g(super.getContext(), v8_5, new int[] {2, 4}));
                    v8_5.recycle();
                    if (v9_3 >= 0) {
                        super.setLineHeight(v9_3);
                    }
                }
            }
        }
        return;
    }

    public static varargs int g(android.content.Context p7, android.content.res.TypedArray p8, int[] p9)
    {
        int v3_1 = -1;
        int v2 = 0;
        while ((v2 < p9.length) && (v3_1 < 0)) {
            int v3_3 = p9[v2];
            int v4_0 = new android.util.TypedValue();
            if ((p8.getValue(v3_3, v4_0)) && (v4_0.type == 2)) {
                int v3_2 = p7.getTheme().obtainStyledAttributes(new int[] {v4_0.data}));
                int v4_3 = v3_2.getDimensionPixelSize(0, -1);
                v3_2.recycle();
                v3_1 = v4_3;
            } else {
                v3_1 = p8.getDimensionPixelSize(v3_3, -1);
            }
            v2++;
        }
        return v3_1;
    }

    public final void setTextAppearance(android.content.Context p3, int p4)
    {
        super.setTextAppearance(p3, p4);
        if (c4.b.U(p3, 2130969906, 1)) {
            android.content.res.TypedArray v3_1 = p3.getTheme().obtainStyledAttributes(p4, c3.a.u);
            int v4_2 = com.google.android.material.textview.MaterialTextView.g(this.getContext(), v3_1, new int[] {2, 4}));
            v3_1.recycle();
            if (v4_2 >= 0) {
                this.setLineHeight(v4_2);
            }
        }
        return;
    }
}
