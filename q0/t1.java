package q0;
public final class t1 extends a.a {
    public final android.view.Window b;

    public t1(android.view.Window p1, v3.f p2)
    {
        this.b = p1;
        return;
    }

    public final boolean A()
    {
        if ((this.b.getDecorView().getSystemUiVisibility() & 8192) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void P(boolean p3)
    {
        if (p3 == null) {
            this.X(16);
            return;
        } else {
            int v1_1 = this.b;
            v1_1.clearFlags(134217728);
            v1_1.addFlags(-2147483648);
            android.view.View v3_1 = v1_1.getDecorView();
            v3_1.setSystemUiVisibility((16 | v3_1.getSystemUiVisibility()));
            return;
        }
    }

    public final void Q(boolean p3)
    {
        if (p3 == null) {
            this.X(8192);
            return;
        } else {
            int v1_1 = this.b;
            v1_1.clearFlags(67108864);
            v1_1.addFlags(-2147483648);
            android.view.View v3_1 = v1_1.getDecorView();
            v3_1.setSystemUiVisibility((8192 | v3_1.getSystemUiVisibility()));
            return;
        }
    }

    public final void X(int p3)
    {
        android.view.View v0_1 = this.b.getDecorView();
        v0_1.setSystemUiVisibility(((~ p3) & v0_1.getSystemUiVisibility()));
        return;
    }
}
