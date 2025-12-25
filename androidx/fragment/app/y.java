package androidx.fragment.app;
public final class y implements androidx.lifecycle.s {
    public final synthetic androidx.fragment.app.e0 a;

    public y(androidx.fragment.app.e0 p1)
    {
        this.a = p1;
        return;
    }

    public final void c(androidx.lifecycle.u p1, androidx.lifecycle.n p2)
    {
        if (p2 == androidx.lifecycle.n.ON_STOP) {
            android.view.View v1_2 = this.a.mView;
            if (v1_2 != null) {
                v1_2.cancelPendingInputEvents();
            }
        }
        return;
    }
}
