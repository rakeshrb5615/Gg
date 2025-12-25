package n;
public final class f2 implements android.view.View$OnTouchListener {
    public final synthetic n.g2 a;

    public f2(n.g2 p1)
    {
        this.a = p1;
        return;
    }

    public final boolean onTouch(android.view.View p6, android.view.MotionEvent p7)
    {
        long v6_0 = this.a;
        n.c2 v0 = v6_0.x;
        android.os.Handler v1 = v6_0.B;
        long v6_4 = v6_0.F;
        int v2 = p7.getAction();
        int v3_1 = ((int) p7.getX());
        int v7_2 = ((int) p7.getY());
        if ((v2 != 0) || ((v6_4 == 0) || ((!v6_4.isShowing()) || ((v3_1 < 0) || ((v3_1 >= v6_4.getWidth()) || ((v7_2 < 0) || (v7_2 >= v6_4.getHeight()))))))) {
            if (v2 == 1) {
                v1.removeCallbacks(v0);
            }
        } else {
            v1.postDelayed(v0, 250);
        }
        return 0;
    }
}
