package androidx.fragment.app;
public final class o implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic o(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                androidx.fragment.app.n v0_7 = ((androidx.fragment.app.s) this.b);
                androidx.fragment.app.s.access$100(v0_7).onDismiss(androidx.fragment.app.s.access$000(v0_7));
                return;
            case 1:
                ((androidx.fragment.app.n) this.b).d();
                return;
            default:
                ((androidx.fragment.app.b1) this.b).x(1);
                return;
        }
    }
}
