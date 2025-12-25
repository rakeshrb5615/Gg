package z3;
public final class g extends v3.k {
    public static final synthetic int N;
    public z3.f M;

    public final void g(android.graphics.Canvas p2)
    {
        if (!this.M.s.isEmpty()) {
            p2.save();
            p2.clipOutRect(this.M.s);
            super.g(p2);
            p2.restore();
            return;
        } else {
            super.g(p2);
            return;
        }
    }

    public final android.graphics.drawable.Drawable mutate()
    {
        this.M = new z3.f(this.M);
        return this;
    }

    public final void w(float p3, float p4, float p5, float p6)
    {
        android.graphics.RectF v0_1 = this.M.s;
        if ((p3 == v0_1.left) && ((p4 == v0_1.top) && ((p5 == v0_1.right) && (p6 == v0_1.bottom)))) {
            return;
        } else {
            v0_1.set(p3, p4, p5, p6);
            this.invalidateSelf();
            return;
        }
    }
}
