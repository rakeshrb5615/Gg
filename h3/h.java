package h3;
public final class h extends h3.c {
    public final Boolean a;
    public final q0.s1 b;
    public android.view.Window c;
    public boolean d;

    public h(android.view.View p1, q0.s1 p2)
    {
        int v2_4;
        this.b = p2;
        int v2_3 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(p1).i;
        if (v2_3 == 0) {
            v2_4 = p1.getBackgroundTintList();
        } else {
            v2_4 = v2_3.b.d;
        }
        if (v2_4 == 0) {
            Boolean v1_3;
            Boolean v1_2 = f2.b0.d(p1.getBackground());
            if (v1_2 == null) {
                v1_3 = 0;
            } else {
                v1_3 = Integer.valueOf(v1_2.getDefaultColor());
            }
            if (v1_3 == null) {
                this.a = 0;
                return;
            } else {
                this.a = Boolean.valueOf(j5.t1.H(v1_3.intValue()));
                return;
            }
        } else {
            this.a = Boolean.valueOf(j5.t1.H(v2_4.getDefaultColor()));
            return;
        }
    }

    public final void a(android.view.View p1)
    {
        this.d(p1);
        return;
    }

    public final void b(android.view.View p1)
    {
        this.d(p1);
        return;
    }

    public final void c(android.view.View p1, int p2)
    {
        this.d(p1);
        return;
    }

    public final void d(android.view.View p8)
    {
        int v1_1 = this.b;
        if (p8.getTop() >= v1_1.d()) {
            if (p8.getTop() != 0) {
                int v0_1 = this.c;
                if (v0_1 != 0) {
                    q0.t1 v2_3;
                    int v1_0 = this.d;
                    int v5_1 = new v3.f(v0_1.getDecorView());
                    q0.t1 v2_1 = android.os.Build$VERSION.SDK_INT;
                    if (v2_1 < 35) {
                        if (v2_1 < 30) {
                            v2_3 = new q0.t1(v0_1, v5_1);
                        } else {
                            v2_3 = new q0.u1(v0_1, v5_1);
                        }
                    } else {
                        v2_3 = new q0.w1(v0_1, v5_1);
                    }
                    v2_3.Q(v1_0);
                }
                p8.setPadding(p8.getPaddingLeft(), 0, p8.getPaddingRight(), p8.getPaddingBottom());
            }
            return;
        } else {
            int v0_3 = this.c;
            if (v0_3 != 0) {
                q0.t1 v2_9;
                q0.t1 v2_7 = this.a;
                if (v2_7 != null) {
                    v2_9 = v2_7.booleanValue();
                } else {
                    v2_9 = this.d;
                }
                q0.t1 v3_3;
                v3.f v6_1 = new v3.f(v0_3.getDecorView());
                int v5_3 = android.os.Build$VERSION.SDK_INT;
                if (v5_3 < 35) {
                    if (v5_3 < 30) {
                        v3_3 = new q0.t1(v0_3, v6_1);
                    } else {
                        v3_3 = new q0.u1(v0_3, v6_1);
                    }
                } else {
                    v3_3 = new q0.w1(v0_3, v6_1);
                }
                v3_3.Q(v2_9);
            }
            p8.setPadding(p8.getPaddingLeft(), (v1_1.d() - p8.getTop()), p8.getPaddingRight(), p8.getPaddingBottom());
            return;
        }
    }

    public final void e(android.view.Window p4)
    {
        if (this.c != p4) {
            this.c = p4;
            if (p4) {
                q0.t1 v0_2;
                v3.f v1_1 = new v3.f(p4.getDecorView());
                q0.t1 v0_6 = android.os.Build$VERSION.SDK_INT;
                if (v0_6 < 35) {
                    if (v0_6 < 30) {
                        v0_2 = new q0.t1(p4, v1_1);
                    } else {
                        v0_2 = new q0.u1(p4, v1_1);
                    }
                } else {
                    v0_2 = new q0.w1(p4, v1_1);
                }
                this.d = v0_2.A();
            }
        }
        return;
    }
}
