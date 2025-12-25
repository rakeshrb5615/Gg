package n;
public abstract class w1 implements android.view.View$OnTouchListener, android.view.View$OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final android.view.View d;
    public n.v1 e;
    public n.v1 f;
    public boolean m;
    public int n;
    public final int[] o;

    public w1(android.view.View p3)
    {
        int v1_0 = new int[2];
        this.o = v1_0;
        this.d = p3;
        p3.setLongClickable(1);
        p3.addOnAttachStateChangeListener(this);
        this.a = ((float) android.view.ViewConfiguration.get(p3.getContext()).getScaledTouchSlop());
        int v3_4 = android.view.ViewConfiguration.getTapTimeout();
        this.b = v3_4;
        this.c = ((android.view.ViewConfiguration.getLongPressTimeout() + v3_4) / 2);
        return;
    }

    public final void a()
    {
        n.v1 v0_0 = this.f;
        android.view.View v1 = this.d;
        if (v0_0 != null) {
            v1.removeCallbacks(v0_0);
        }
        n.v1 v0_1 = this.e;
        if (v0_1 != null) {
            v1.removeCallbacks(v0_1);
        }
        return;
    }

    public abstract m.c0 b();

    public abstract boolean c();

    public boolean d()
    {
        int v0_0 = this.b();
        if ((v0_0 != 0) && (v0_0.b())) {
            v0_0.dismiss();
        }
        return 1;
    }

    public final boolean onTouch(android.view.View p13, android.view.MotionEvent p14)
    {
        float v14_5;
        p13 = this.m;
        boolean v1_7 = this.d;
        if (!p13) {
            if (v1_7.isEnabled()) {
                float v4_0 = p14.getActionMasked();
                if (v4_0 == 0) {
                    this.n = p14.getPointerId(0);
                    if (this.e == null) {
                        this.e = new n.v1(this, 0);
                    }
                    v1_7.postDelayed(this.e, ((long) this.b));
                    if (this.f == null) {
                        this.f = new n.v1(this, 1);
                    }
                    v1_7.postDelayed(this.f, ((long) this.c));
                    v14_5 = 0;
                } else {
                    if (v4_0 != 1) {
                        if (v4_0 == 2) {
                            float v0_6 = p14.findPointerIndex(this.n);
                            if (v0_6 < 0) {
                            } else {
                                float v4_4 = p14.getX(v0_6);
                                float v14_14 = p14.getY(v0_6);
                                float v0_7 = this.a;
                                int v5_3 = (- v0_7);
                                if ((v4_4 < v5_3) || ((v14_14 < v5_3) || ((v4_4 >= (((float) (v1_7.getRight() - v1_7.getLeft())) + v0_7)) || (v14_14 >= (((float) (v1_7.getBottom() - v1_7.getTop())) + v0_7))))) {
                                    this.a();
                                    v1_7.getParent().requestDisallowInterceptTouchEvent(1);
                                    if (!this.c()) {
                                    } else {
                                        v14_5 = 1;
                                        if (v14_5 != 0) {
                                            float v4_11 = android.os.SystemClock.uptimeMillis();
                                            float v0_8 = android.view.MotionEvent.obtain(v4_11, v4_11, 3, 0, 0, 0);
                                            v1_7.onTouchEvent(v0_8);
                                            v0_8.recycle();
                                        }
                                        this.m = v14_5;
                                        if ((v14_5 == 0) && (!p13)) {
                                            return 0;
                                        } else {
                                            return 1;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (v4_0 != 3) {
                            }
                        }
                    }
                    this.a();
                }
            }
        } else {
            float v4_12 = this.b();
            if ((v4_12 != 0) && (v4_12.b())) {
                float v4_1 = v4_12.f();
                if ((v4_1 != 0) && (v4_1.isShown())) {
                    float v14_3;
                    int v5_1 = android.view.MotionEvent.obtainNoHistory(p14);
                    int v6_0 = this.o;
                    v1_7.getLocationOnScreen(v6_0);
                    v5_1.offsetLocation(((float) v6_0[0]), ((float) v6_0[1]));
                    v4_1.getLocationOnScreen(v6_0);
                    v5_1.offsetLocation(((float) (- v6_0[0])), ((float) (- v6_0[1])));
                    boolean v1_6 = v4_1.b(v5_1, this.n);
                    v5_1.recycle();
                    float v14_1 = p14.getActionMasked();
                    if ((v14_1 == 1) || (v14_1 == 3)) {
                        v14_3 = 0;
                    } else {
                        v14_3 = 1;
                    }
                    if ((!v1_6) || (v14_3 == 0)) {
                        if (this.d()) {
                            v14_5 = 0;
                        }
                    }
                }
            }
            v14_5 = 1;
        }
    }

    public final void onViewAttachedToWindow(android.view.View p1)
    {
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p2)
    {
        this.m = 0;
        this.n = -1;
        n.v1 v2_2 = this.e;
        if (v2_2 != null) {
            this.d.removeCallbacks(v2_2);
        }
        return;
    }
}
