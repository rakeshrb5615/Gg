package n;
public final class n0 implements android.widget.PopupWindow$OnDismissListener {
    public final synthetic m.d a;
    public final synthetic n.o0 b;

    public n0(n.o0 p1, m.d p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void onDismiss()
    {
        android.view.ViewTreeObserver v0_2 = this.b.M.getViewTreeObserver();
        if (v0_2 != null) {
            v0_2.removeGlobalOnLayoutListener(this.a);
        }
        return;
    }
}
