package com.google.android.material.timepicker;
public abstract class h extends androidx.constraintlayout.widget.ConstraintLayout {
    public final com.google.android.material.timepicker.g w;
    public int x;
    public final v3.k y;

    public h(android.content.Context p5, android.util.AttributeSet p6)
    {
        super(p5, p6, 2130969464);
        android.view.LayoutInflater.from(p5).inflate(2131558480, super);
        int[] v1_5 = new v3.k();
        super.y = v1_5;
        int v2_0 = new v3.m(1056964608);
        v3.o v3_3 = v1_5.b.a.f();
        v3_3.e = v2_0;
        v3_3.f = v2_0;
        v3_3.g = v2_0;
        v3_3.h = v2_0;
        v1_5.setShapeAppearanceModel(v3_3.a());
        super.y.o(android.content.res.ColorStateList.valueOf(-1));
        super.setBackground(super.y);
        android.content.res.TypedArray v5_1 = p5.obtainStyledAttributes(p6, c3.a.x, 2130969464, 0);
        super.x = v5_1.getDimensionPixelSize(0, 0);
        super.w = new com.google.android.material.timepicker.g(super);
        v5_1.recycle();
        return;
    }

    public final void addView(android.view.View p1, int p2, android.view.ViewGroup$LayoutParams p3)
    {
        super.addView(p1, p2, p3);
        if (p1.getId() == -1) {
            p1.setId(android.view.View.generateViewId());
        }
        android.os.Handler v1_1 = this.getHandler();
        if (v1_1 != null) {
            com.google.android.material.timepicker.g v2_1 = this.w;
            v1_1.removeCallbacks(v2_1);
            v1_1.post(v2_1);
        }
        return;
    }

    public abstract void m();

    public final void onFinishInflate()
    {
        super.onFinishInflate();
        this.m();
        return;
    }

    public final void onViewRemoved(android.view.View p2)
    {
        super.onViewRemoved(p2);
        android.os.Handler v2_1 = this.getHandler();
        if (v2_1 != null) {
            com.google.android.material.timepicker.g v0 = this.w;
            v2_1.removeCallbacks(v0);
            v2_1.post(v0);
        }
        return;
    }

    public final void setBackgroundColor(int p2)
    {
        this.y.o(android.content.res.ColorStateList.valueOf(p2));
        return;
    }
}
