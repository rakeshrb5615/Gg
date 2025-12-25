package z3;
public final class f extends v3.i {
    public final android.graphics.RectF s;

    public f(v3.p p1, android.graphics.RectF p2)
    {
        super(p1);
        super.s = p2;
        return;
    }

    public f(z3.f p1)
    {
        super(p1);
        super.s = p1.s;
        return;
    }

    public final android.graphics.drawable.Drawable newDrawable()
    {
        z3.g v0_1 = new z3.g(this);
        v0_1.M = this;
        v0_1.invalidateSelf();
        return v0_1;
    }
}
