package b0;
public final class e implements android.view.ViewTreeObserver$OnPreDrawListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic e(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final boolean onPreDraw()
    {
        switch (this.a) {
            case 0:
                ((androidx.coordinatorlayout.widget.CoordinatorLayout) this.b).p(0);
                return 1;
            default:
                int v1_7;
                a2.j0 v0_9 = ((l2.a0) this.b);
                v0_9.h2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (v0_9.a.getResources().getConfiguration().orientation != 1) {
                    v1_7 = v0_9.h2.getHeight();
                } else {
                    v1_7 = v0_9.h2.getWidth();
                }
                a2.j0 v0_5 = ((i2.t0) v0_9.h2.getAdapter());
                if (v0_5 != null) {
                    v0_5.d = v1_7;
                    v0_5.a.b();
                }
                return 1;
        }
    }
}
