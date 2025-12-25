package q0;
public class u1 extends a.a {
    public final android.view.WindowInsetsController b;
    public final android.view.Window c;

    public u1(android.view.Window p1, v3.f p2)
    {
        p2 = p1.getInsetsController();
        this.b = p2;
        this.c = p1;
        return;
    }

    public boolean A()
    {
        this.b.setSystemBarsAppearance(0, 0);
        if ((this.b.getSystemBarsAppearance() & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void P(boolean p3)
    {
        int v0_0 = this.c;
        if (p3 == null) {
            if (v0_0 != 0) {
                android.view.WindowInsetsController v3_4 = v0_0.getDecorView();
                v3_4.setSystemUiVisibility((v3_4.getSystemUiVisibility() & -17));
            }
            this.b.setSystemBarsAppearance(0, 16);
            return;
        } else {
            if (v0_0 != 0) {
                android.view.WindowInsetsController v3_2 = v0_0.getDecorView();
                v3_2.setSystemUiVisibility((v3_2.getSystemUiVisibility() | 16));
            }
            this.b.setSystemBarsAppearance(16, 16);
            return;
        }
    }

    public final void Q(boolean p3)
    {
        int v0_0 = this.c;
        if (p3 == null) {
            if (v0_0 != 0) {
                android.view.WindowInsetsController v3_4 = v0_0.getDecorView();
                v3_4.setSystemUiVisibility((v3_4.getSystemUiVisibility() & -8193));
            }
            this.b.setSystemBarsAppearance(0, 8);
            return;
        } else {
            if (v0_0 != 0) {
                android.view.WindowInsetsController v3_2 = v0_0.getDecorView();
                v3_2.setSystemUiVisibility((v3_2.getSystemUiVisibility() | 8192));
            }
            this.b.setSystemBarsAppearance(8, 8);
            return;
        }
    }
}
