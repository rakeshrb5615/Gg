package i2;
public final synthetic class u implements android.view.View$OnTouchListener {
    public final synthetic i2.w a;
    public final synthetic int b;
    public final synthetic com.google.android.material.slider.Slider c;

    public synthetic u(i2.w p1, int p2, com.google.android.material.slider.Slider p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final boolean onTouch(android.view.View p6, android.view.MotionEvent p7)
    {
        boolean v6_0 = p7.getAction();
        int v0_1 = this.a;
        if (!v6_0) {
            v0_1.b = p7.getX();
            v0_1.a = 0;
            return 1;
        } else {
            com.google.android.material.slider.Slider v3 = this.c;
            if (v6_0 == 1) {
                if (!v0_1.a) {
                    i2.y.a(v3, p7, 0, 300);
                    return 1;
                } else {
                    return v3.onTouchEvent(p7);
                }
            } else {
                if (v6_0 == 2) {
                    if ((!v0_1.a) && (Math.abs((p7.getX() - v0_1.b)) > ((float) this.b))) {
                        v0_1.a = 1;
                    }
                    if (!v0_1.a) {
                        return 1;
                    } else {
                        return v3.onTouchEvent(p7);
                    }
                } else {
                    if (v6_0 == 3) {
                        v0_1.a = 0;
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}
