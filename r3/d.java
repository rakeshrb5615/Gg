package r3;
public final class d implements android.window.OnBackAnimationCallback {
    public final synthetic r3.b a;
    public final synthetic r3.e b;

    public d(r3.e p1, r3.b p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void onBackCancelled()
    {
        if (this.b.a != null) {
            this.a.d();
        }
        return;
    }

    public final void onBackInvoked()
    {
        this.a.a();
        return;
    }

    public final void onBackProgressed(android.window.BackEvent p2)
    {
        if (this.b.a != null) {
            this.a.b(new c.a(p2));
        }
        return;
    }

    public final void onBackStarted(android.window.BackEvent p2)
    {
        if (this.b.a != null) {
            this.a.c(new c.a(p2));
        }
        return;
    }
}
