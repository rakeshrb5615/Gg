package l2;
public final synthetic class k implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic android.view.View b;
    public final synthetic float c;
    public final synthetic float d;

    public synthetic k(android.view.View p1, float p2, float p3, int p4)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                android.view.ViewPropertyAnimator v0_1 = this.b;
                float v2_1 = this.c;
                float v3_1 = this.d;
                v0_1.animate().setDuration(100).translationXBy(((- v2_1) * 1073741824)).translationYBy(((- v3_1) * 1073741824)).withEndAction(new l2.k(v0_1, v2_1, v3_1, 1)).start();
                return;
            default:
                this.b.animate().setDuration(50).translationXBy(this.c).translationYBy(this.d).start();
                return;
        }
    }
}
