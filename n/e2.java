package n;
public final class e2 implements android.widget.AbsListView$OnScrollListener {
    public final synthetic n.g2 a;

    public e2(n.g2 p1)
    {
        this.a = p1;
        return;
    }

    public final void onScroll(android.widget.AbsListView p1, int p2, int p3, int p4)
    {
        return;
    }

    public final void onScrollStateChanged(android.widget.AbsListView p4, int p5)
    {
        android.os.Handler v4_0 = this.a;
        n.c2 v0 = v4_0.x;
        n.b0 v1 = v4_0.F;
        if (p5 == 1) {
            if (v1.getInputMethodMode() != 2) {
                if (v1.getContentView() != null) {
                    v4_0.B.removeCallbacks(v0);
                    v0.run();
                }
            } else {
                return;
            }
        }
        return;
    }
}
