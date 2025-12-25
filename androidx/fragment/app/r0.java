package androidx.fragment.app;
public final synthetic class r0 implements p0.a {
    public final synthetic int a;
    public final synthetic androidx.fragment.app.b1 b;

    public synthetic r0(androidx.fragment.app.b1 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void accept(Object p3)
    {
        switch (this.a) {
            case 0:
                androidx.fragment.app.b1 v0_2 = this.b;
                if (v0_2.J()) {
                    v0_2.h(0, ((android.content.res.Configuration) p3));
                }
                return;
            case 1:
                androidx.fragment.app.b1 v0_1 = this.b;
                if ((v0_1.J()) && (((Integer) p3).intValue() == 80)) {
                    v0_1.l(0);
                }
                return;
            case 2:
                androidx.fragment.app.b1 v0_3 = this.b;
                if (v0_3.J()) {
                    v0_3.m(((d0.i) p3).a, 0);
                }
                return;
            default:
                androidx.fragment.app.b1 v0_4 = this.b;
                if (v0_4.J()) {
                    v0_4.r(((d0.a0) p3).a, 0);
                }
                return;
        }
    }
}
