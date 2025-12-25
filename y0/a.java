package y0;
public final class a extends j6.o {
    public final synthetic y0.b c;

    public a(y0.b p1)
    {
        this.c = p1;
        super(11);
        return;
    }

    public final boolean F(int p8, int p9, android.os.Bundle p10)
    {
        y0.b v0 = this.c;
        android.view.View v1 = v0.i;
        if (p8 == -1) {
            return v1.performAccessibilityAction(p9, p10);
        } else {
            if (p9 == 1) {
                return v0.w(p8);
            } else {
                if (p9 == 2) {
                    return v0.j(p8);
                } else {
                    if (p9 == 64) {
                        int v9_1 = v0.h;
                        if ((v9_1.isEnabled()) && (v9_1.isTouchExplorationEnabled())) {
                            int v9_3 = v0.k;
                            if (v9_3 != p8) {
                                if (v9_3 != -2147483648) {
                                    v0.k = -2147483648;
                                    v1.invalidate();
                                    v0.x(v9_3, 65536);
                                }
                                v0.k = p8;
                                v1.invalidate();
                                v0.x(p8, 32768);
                                return 1;
                            }
                        }
                        return 0;
                    } else {
                        if (p9 == 128) {
                            if (v0.k != p8) {
                                return 0;
                            } else {
                                v0.k = -2147483648;
                                v1.invalidate();
                                v0.x(p8, 65536);
                                return 1;
                            }
                        } else {
                            return v0.s(p8, p9, p10);
                        }
                    }
                }
            }
        }
    }

    public final r0.c p(int p2)
    {
        return new r0.c(android.view.accessibility.AccessibilityNodeInfo.obtain(this.c.r(p2).a));
    }

    public final r0.c r(int p3)
    {
        r0.c v3_2;
        y0.b v1 = this.c;
        if (p3 != 2) {
            v3_2 = v1.l;
        } else {
            v3_2 = v1.k;
        }
        if (v3_2 != -2147483648) {
            return this.p(v3_2);
        } else {
            return 0;
        }
    }
}
