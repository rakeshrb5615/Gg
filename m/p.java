package m;
public final class p implements android.view.ActionProvider$VisibilityListener {
    public j6.o a;
    public final android.view.ActionProvider b;

    public p(m.t p1, android.view.ActionProvider p2)
    {
        this.b = p2;
        return;
    }

    public final void onActionProviderVisibilityChanged(boolean p2)
    {
        m.m v2_0 = this.a;
        if (v2_0 != null) {
            m.m v2_3 = ((m.o) v2_0.b).n;
            v2_3.h = 1;
            v2_3.p(1);
        }
        return;
    }
}
