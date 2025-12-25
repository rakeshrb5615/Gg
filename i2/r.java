package i2;
public final synthetic class r implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic android.view.View b;
    public final synthetic float c;

    public synthetic r(android.view.View p1, float p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                android.view.ViewPropertyAnimator v0_2 = this.b;
                i2.v v2_4 = this.c;
                v0_2.animate().scaleX(v2_4).scaleY(v2_4).setDuration(((long) 50)).withEndAction(new i2.v(v0_2, 0)).start();
                return;
            default:
                android.view.ViewPropertyAnimator v1_1 = this.c;
                this.b.animate().scaleX(v1_1).scaleY(v1_1).setDuration(((long) 80)).start();
                return;
        }
    }
}
