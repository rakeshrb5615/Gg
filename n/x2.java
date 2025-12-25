package n;
public final synthetic class x2 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic androidx.appcompat.widget.Toolbar b;

    public synthetic x2(androidx.appcompat.widget.Toolbar p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                m.o v0_4;
                m.o v0_3 = this.b.R;
                if (v0_3 != null) {
                    v0_4 = v0_3.b;
                } else {
                    v0_4 = 0;
                }
                if (v0_4 != null) {
                    v0_4.collapseActionView();
                }
                return;
            default:
                this.b.m();
                return;
        }
    }
}
