package n3;
public final class a implements android.view.View$OnTouchListener {
    public final android.app.Dialog a;
    public final int b;
    public final int c;
    public final int d;

    public a(android.app.Dialog p2, android.graphics.Rect p3)
    {
        this.a = p2;
        this.b = p3.left;
        this.c = p3.top;
        this.d = android.view.ViewConfiguration.get(p2.getContext()).getScaledWindowTouchSlop();
        return;
    }

    public final boolean onTouch(android.view.View p6, android.view.MotionEvent p7)
    {
        android.view.MotionEvent v0_3 = p6.findViewById(16908290);
        int v2_3 = (v0_3.getLeft() + this.b);
        float v1_8 = (v0_3.getWidth() + v2_3);
        float v4_1 = (v0_3.getTop() + this.c);
        if (!new android.graphics.RectF(((float) v2_3), ((float) v4_1), ((float) v1_8), ((float) (v0_3.getHeight() + v4_1))).contains(p7.getX(), p7.getY())) {
            android.view.MotionEvent v0_7 = android.view.MotionEvent.obtain(p7);
            if (p7.getAction() == 1) {
                v0_7.setAction(4);
            }
            if (android.os.Build$VERSION.SDK_INT < 28) {
                v0_7.setAction(0);
                float v7_4 = this.d;
                v0_7.setLocation(((float) ((- v7_4) - 1)), ((float) ((- v7_4) - 1)));
            }
            p6.performClick();
            return this.a.onTouchEvent(v0_7);
        } else {
            return 0;
        }
    }
}
