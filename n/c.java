package n;
public final class c implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic androidx.appcompat.widget.ActionBarOverlayLayout b;

    public synthetic c(androidx.appcompat.widget.ActionBarOverlayLayout p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                androidx.appcompat.widget.ActionBarOverlayLayout v0_2 = this.b;
                v0_2.h();
                v0_2.C = v0_2.d.animate().translationY(0).setListener(v0_2.D);
                return;
            default:
                androidx.appcompat.widget.ActionBarOverlayLayout v0_1 = this.b;
                v0_1.h();
                v0_1.C = v0_1.d.animate().translationY(((float) (- v0_1.d.getHeight()))).setListener(v0_1.D);
                return;
        }
    }
}
