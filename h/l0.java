package h;
public final class l0 extends c4.b {
    public final synthetic int c;
    public final synthetic h.n0 d;

    public synthetic l0(h.n0 p1, int p2)
    {
        this.c = p2;
        this.d = p1;
        return;
    }

    public final void a()
    {
        h.n0 v2 = this.d;
        switch (this.c) {
            case 0:
                if (v2.t) {
                    androidx.appcompat.widget.ActionBarOverlayLayout v0_8 = v2.l;
                    if (v0_8 != null) {
                        v0_8.setTranslationY(0);
                        v2.i.setTranslationY(0);
                    }
                }
                v2.i.setVisibility(8);
                v2.i.setTransitioning(0);
                v2.x = 0;
                androidx.appcompat.widget.ActionBarOverlayLayout v0_4 = v2.p;
                if (v0_4 != null) {
                    v0_4.w(v2.o);
                    v2.o = 0;
                    v2.p = 0;
                }
                androidx.appcompat.widget.ActionBarOverlayLayout v0_5 = v2.h;
                if (v0_5 != null) {
                    q0.g0.c(v0_5);
                }
                return;
            default:
                v2.x = 0;
                v2.i.requestLayout();
                return;
        }
    }
}
