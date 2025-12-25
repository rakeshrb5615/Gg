package androidx.fragment.app;
public final class i1 implements android.view.View$OnAttachStateChangeListener {
    public final synthetic android.view.View a;

    public i1(android.view.View p1)
    {
        this.a = p1;
        return;
    }

    public final void onViewAttachedToWindow(android.view.View p2)
    {
        p2 = this.a;
        p2.removeOnAttachStateChangeListener(this);
        q0.g0.c(p2);
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p1)
    {
        return;
    }
}
