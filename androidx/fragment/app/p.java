package androidx.fragment.app;
public final class p implements android.content.DialogInterface$OnCancelListener {
    public final synthetic androidx.fragment.app.s a;

    public p(androidx.fragment.app.s p1)
    {
        this.a = p1;
        return;
    }

    public final void onCancel(android.content.DialogInterface p2)
    {
        p2 = this.a;
        if (androidx.fragment.app.s.access$000(p2) != null) {
            p2.onCancel(androidx.fragment.app.s.access$000(p2));
        }
        return;
    }
}
