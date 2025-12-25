package c;
public final synthetic class e implements androidx.lifecycle.s {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic e(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void c(androidx.lifecycle.u p2, androidx.lifecycle.n p3)
    {
        switch (this.a) {
            case 0:
                if (p3 == androidx.lifecycle.n.ON_STOP) {
                    android.view.View v2_1 = ((c.n) this.b).getWindow();
                    if (v2_1 != null) {
                        android.view.View v2_2 = v2_1.peekDecorView();
                        if (v2_2 != null) {
                            v2_2.cancelPendingInputEvents();
                        }
                    }
                }
                return;
            case 1:
                c.n.d(((c.n) this.b), p2, p3);
                return;
            default:
                android.view.View v2_4 = ((c2.a) this.b);
                if (p3 != androidx.lifecycle.n.ON_START) {
                    if (p3 == androidx.lifecycle.n.ON_STOP) {
                        v2_4.h = 0;
                    }
                } else {
                    v2_4.h = 1;
                }
                return;
        }
    }
}
