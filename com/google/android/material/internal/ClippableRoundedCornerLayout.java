package com.google.android.material.internal;
public class ClippableRoundedCornerLayout extends android.widget.FrameLayout {
    public final float[] a;

    public ClippableRoundedCornerLayout(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        float[] v1_2 = new float[8];
        v1_2 = {0, 0, 0, 0, 0, 0, 0, 0};
        super.a = v1_2;
        return;
    }

    public final void dispatchDraw(android.graphics.Canvas p1)
    {
        super.dispatchDraw(p1);
        return;
    }

    public float[] getCornerRadii()
    {
        return this.a;
    }
}
