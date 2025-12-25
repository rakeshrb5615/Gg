package n;
public final class d2 extends android.database.DataSetObserver {
    public final synthetic n.g2 a;

    public d2(n.g2 p1)
    {
        this.a = p1;
        return;
    }

    public final void onChanged()
    {
        n.g2 v0 = this.a;
        if (v0.F.isShowing()) {
            v0.c();
        }
        return;
    }

    public final void onInvalidated()
    {
        this.a.dismiss();
        return;
    }
}
