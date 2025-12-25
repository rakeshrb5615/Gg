package h;
public final class a0 extends androidx.appcompat.widget.ContentFrameLayout {
    public final synthetic h.c0 o;

    public a0(h.c0 p1, l.c p2)
    {
        this.o = p1;
        super(p2, 0);
        return;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p2)
    {
        if ((!this.o.x(p2)) && (!super.dispatchKeyEvent(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent p4)
    {
        if (p4.getAction() == 0) {
            int v0_5 = ((int) p4.getX());
            int v1_2 = ((int) p4.getY());
            if ((v0_5 < -5) || ((v1_2 < -5) || ((v0_5 > (this.getWidth() + 5)) || (v1_2 > (this.getHeight() + 5))))) {
                int v0_3 = this.o;
                v0_3.v(v0_3.C(0), 1);
                return 1;
            }
        }
        return super.onInterceptTouchEvent(p4);
    }

    public final void setBackgroundResource(int p2)
    {
        this.setBackgroundDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }
}
