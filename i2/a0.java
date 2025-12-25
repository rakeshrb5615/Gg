package i2;
public final synthetic class a0 implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic java.util.concurrent.atomic.AtomicReference b;

    public synthetic a0(java.util.concurrent.atomic.AtomicReference p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onClick(android.view.View p2)
    {
        java.util.concurrent.atomic.AtomicReference v0 = this.b;
        switch (this.a) {
            case 0:
                v0.set("fr");
                return;
            case 1:
                v0.set("ja");
                return;
            case 2:
                v0.set("zh");
                return;
            default:
                v0.set("en");
                return;
        }
    }
}
