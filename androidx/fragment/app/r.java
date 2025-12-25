package androidx.fragment.app;
public final class r extends androidx.fragment.app.m0 {
    public final synthetic androidx.fragment.app.m0 a;
    public final synthetic androidx.fragment.app.s b;

    public r(androidx.fragment.app.s p1, androidx.fragment.app.m0 p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final android.view.View b(int p3)
    {
        androidx.fragment.app.s v0_0 = this.a;
        if (!v0_0.c()) {
            return this.b.onFindViewById(p3);
        } else {
            return v0_0.b(p3);
        }
    }

    public final boolean c()
    {
        if ((!this.a.c()) && (!this.b.onHasView())) {
            return 0;
        } else {
            return 1;
        }
    }
}
