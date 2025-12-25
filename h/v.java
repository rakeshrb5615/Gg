package h;
public final synthetic class v implements android.window.OnBackInvokedCallback {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic v(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onBackInvoked()
    {
        switch (this.a) {
            case 0:
                ((h.c0) this.b).G();
                return;
            case 1:
                ((Runnable) this.b).run();
                return;
            case 2:
                ((r3.b) this.b).a();
                return;
            default:
                ((s1.l) this.b).a();
                return;
        }
    }
}
