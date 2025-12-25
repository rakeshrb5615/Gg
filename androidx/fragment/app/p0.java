package androidx.fragment.app;
public final class p0 implements android.view.View$OnAttachStateChangeListener {
    public final synthetic androidx.fragment.app.j1 a;
    public final synthetic androidx.fragment.app.q0 b;

    public p0(androidx.fragment.app.q0 p1, androidx.fragment.app.j1 p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void onViewAttachedToWindow(android.view.View p2)
    {
        androidx.fragment.app.n v2_0 = this.a;
        androidx.fragment.app.b1 v0_0 = v2_0.c;
        v2_0.k();
        androidx.fragment.app.n.h(((android.view.ViewGroup) v0_0.mView.getParent()), this.b.a).g();
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p1)
    {
        return;
    }
}
