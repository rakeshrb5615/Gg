package n;
public final class v1 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic n.w1 b;

    public synthetic v1(n.w1 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                android.view.ViewParent v0_4 = this.b.d.getParent();
                if (v0_4 != null) {
                    v0_4.requestDisallowInterceptTouchEvent(1);
                }
                return;
            default:
                android.view.ViewParent v0_1 = this.b;
                v0_1.a();
                int v1_0 = v0_1.d;
                if ((v1_0.isEnabled()) && ((!v1_0.isLongClickable()) && (v0_1.c()))) {
                    v1_0.getParent().requestDisallowInterceptTouchEvent(1);
                    long v4 = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent v2_4 = android.view.MotionEvent.obtain(v4, v4, 3, 0, 0, 0);
                    v1_0.onTouchEvent(v2_4);
                    v2_4.recycle();
                    v0_1.m = 1;
                }
                return;
        }
    }
}
