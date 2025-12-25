package l2;
public final class w implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
    public final synthetic g0.k a;
    public final synthetic l2.v b;
    public final synthetic l2.a0 c;

    public w(l2.a0 p1, g0.k p2, l2.v p3)
    {
        this.c = p1;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final void onGlobalLayout()
    {
        a2.j0 v0_0 = this.c;
        try {
            if (v0_0.h2.getWidth() > 0) {
                v0_0.g2.getClass();
                this.a.run();
                v0_0.h2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                v0_0.g2.a.unregisterObserver(this.b);
            }
        } catch (Exception) {
        }
        return;
    }
}
