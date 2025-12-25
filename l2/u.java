package l2;
public final class u implements android.view.View$OnLayoutChangeListener {
    public final synthetic int a;
    public final synthetic l2.a0 b;

    public u(l2.a0 p1, int p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void onLayoutChange(android.view.View p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9)
    {
        androidx.recyclerview.widget.RecyclerView v1_0 = this.b;
        v1_0.h2.removeOnLayoutChangeListener(this);
        p3 = this.a;
        g0.k v2_8 = v1_0.i2.q(p3);
        if (v2_8 == null) {
            v1_0.i2.d1(p3, 0);
            v1_0.h2.post(new g0.k(this, p3, 4));
            return;
        } else {
            v1_0.i2.d1(p3, ((v1_0.h2.getWidth() / 2) - ((int) (((float) v2_8.getWidth()) * 1052938076))));
            return;
        }
    }
}
