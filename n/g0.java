package n;
public final class g0 extends android.widget.SeekBar {
    public final n.h0 a;

    public g0(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 2130969700);
        n.t2.a(super, super.getContext());
        n.h0 v2_3 = new n.h0(super);
        super.a = v2_3;
        v2_3.b(p3, 2130969700);
        return;
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable v0_0 = this.a;
        n.g0 v1 = v0_0.e;
        android.graphics.drawable.Drawable v0_1 = v0_0.f;
        if ((v0_1 != null) && ((v0_1.isStateful()) && (v0_1.setState(v1.getDrawableState())))) {
            v1.invalidateDrawable(v0_1);
        }
        return;
    }

    public final void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable v0_1 = this.a.f;
        if (v0_1 != null) {
            v0_1.jumpToCurrentState();
        }
        return;
    }

    public final declared_synchronized void onDraw(android.graphics.Canvas p2)
    {
        super.onDraw(p2);
        this.a.g(p2);
        return;
    }
}
