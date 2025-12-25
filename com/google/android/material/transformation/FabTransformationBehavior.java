package com.google.android.material.transformation;
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    public FabTransformationBehavior()
    {
        new android.graphics.Rect();
        new android.graphics.RectF();
        new android.graphics.RectF();
        return;
    }

    public FabTransformationBehavior(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        new android.graphics.Rect();
        new android.graphics.RectF();
        new android.graphics.RectF();
        return;
    }

    public final void f(android.view.View p2)
    {
        if (p2.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else {
            return;
        }
    }

    public final void g(b0.d p2)
    {
        if (p2.h == 0) {
            p2.h = 80;
        }
        return;
    }
}
