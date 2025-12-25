package z3;
public final synthetic class h implements android.view.View$OnTouchListener {
    public final synthetic z3.k a;

    public synthetic h(z3.k p1)
    {
        this.a = p1;
        return;
    }

    public final boolean onTouch(android.view.View p6, android.view.MotionEvent p7)
    {
        if (p7.getAction() == 1) {
            z3.k v6_1 = this.a;
            long v1_2 = (android.os.SystemClock.uptimeMillis() - v6_1.o);
            if ((v1_2 < 0) || (v1_2 > 300)) {
                v6_1.m = 0;
            }
            v6_1.t();
            v6_1.m = 1;
            v6_1.o = android.os.SystemClock.uptimeMillis();
        }
        return 0;
    }
}
