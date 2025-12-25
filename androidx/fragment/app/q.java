package androidx.fragment.app;
public final class q implements android.content.DialogInterface$OnDismissListener {
    public final synthetic androidx.fragment.app.s a;

    public q(androidx.fragment.app.s p1)
    {
        this.a = p1;
        return;
    }

    public final void onDismiss(android.content.DialogInterface p2)
    {
        p2 = this.a;
        if (androidx.fragment.app.s.access$000(p2) != null) {
            p2.onDismiss(androidx.fragment.app.s.access$000(p2));
        }
        return;
    }
}
