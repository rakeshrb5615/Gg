package h3;
public final class e {
    public final synthetic int a;
    public int b;
    public boolean c;
    public final Runnable d;
    public final synthetic b0.a e;

    public e(com.google.android.material.bottomsheet.BottomSheetBehavior p2)
    {
        this.a = 0;
        this.e = p2;
        this.d = new a2.l(this, 3);
        return;
    }

    public e(com.google.android.material.sidesheet.SideSheetBehavior p2)
    {
        this.a = 1;
        this.e = p2;
        this.d = new androidx.lifecycle.g0(this, 13);
        return;
    }

    public final void a(int p3)
    {
        switch (this.a) {
            case 0:
                a2.l v0_6 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.e);
                Object v1_2 = v0_6.W;
                if ((v1_2 != null) && (v1_2.get() != null)) {
                    this.b = p3;
                    if (!this.c) {
                        ((android.view.View) v0_6.W.get()).postOnAnimation(((a2.l) this.d));
                        this.c = 1;
                    }
                }
                return;
            default:
                a2.l v0_5 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.e);
                Object v1_0 = v0_5.p;
                if ((v1_0 != null) && (v1_0.get() != null)) {
                    this.b = p3;
                    if (!this.c) {
                        ((android.view.View) v0_5.p.get()).postOnAnimation(((androidx.lifecycle.g0) this.d));
                        this.c = 1;
                    }
                }
                return;
        }
    }
}
