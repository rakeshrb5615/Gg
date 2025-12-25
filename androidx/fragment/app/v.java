package androidx.fragment.app;
public final class v implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic androidx.fragment.app.e0 b;

    public synthetic v(androidx.fragment.app.e0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                this.b.startPostponedEnterTransition();
                return;
            default:
                this.b.callStartTransitionListener(0);
                return;
        }
    }
}
