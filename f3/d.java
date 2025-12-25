package f3;
public final class d extends w0.a {
    public int a;
    public int b;
    public final synthetic com.google.android.material.behavior.SwipeDismissBehavior c;

    public d(com.google.android.material.behavior.SwipeDismissBehavior p1)
    {
        this.c = p1;
        this.b = -1;
        return;
    }

    public final int b(android.view.View p4, int p5)
    {
        int v0_5;
        if (p4.getLayoutDirection() != 1) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        int v4_4;
        int v4_2;
        int v0_2;
        int v2_1 = this.c.e;
        if (v2_1 != 0) {
            if (v2_1 != 1) {
                v0_2 = (this.a - p4.getWidth());
                v4_2 = (p4.getWidth() + this.a);
            } else {
                if (v0_5 == 0) {
                    v0_2 = (this.a - p4.getWidth());
                    v4_2 = this.a;
                } else {
                    v0_2 = this.a;
                    v4_4 = p4.getWidth();
                    v4_2 = (v4_4 + v0_2);
                }
            }
        } else {
            if (v0_5 == 0) {
                v0_2 = this.a;
                v4_4 = p4.getWidth();
            } else {
                v0_2 = (this.a - p4.getWidth());
                v4_2 = this.a;
            }
        }
        return Math.min(Math.max(v0_2, p5), v4_2);
    }

    public final int c(android.view.View p1, int p2)
    {
        return p1.getTop();
    }

    public final int d(android.view.View p1)
    {
        return p1.getWidth();
    }

    public final void f(android.view.View p2, int p3)
    {
        this.b = p3;
        this.a = p2.getLeft();
        int v2_2 = p2.getParent();
        if (v2_2 != 0) {
            com.google.android.material.behavior.SwipeDismissBehavior v3_2 = this.c;
            v3_2.d = 1;
            v2_2.requestDisallowInterceptTouchEvent(1);
            v3_2.d = 0;
        }
        return;
    }

    public final void g(int p3)
    {
        y3.f v0_1 = this.c.b;
        if (v0_1 != null) {
            y3.f v0_3 = v0_1.a.t;
            if (p3 == null) {
                j6.s.h().p(v0_3);
            } else {
                if ((p3 == 1) || (p3 == 2)) {
                    j6.s.h().o(v0_3);
                    return;
                }
            }
        }
        return;
    }

    public final void h(android.view.View p5, int p6, int p7)
    {
        float v0_3 = this.c;
        float v7_2 = (((float) p5.getWidth()) * v0_3.f);
        float v1_0 = (((float) p5.getWidth()) * v0_3.g);
        float v6_3 = ((float) Math.abs((p6 - this.a)));
        if (v6_3 > v7_2) {
            if (v6_3 < v1_0) {
                p5.setAlpha(Math.min(Math.max(0, (1065353216 - ((v6_3 - v7_2) / (v1_0 - v7_2)))), 1065353216));
                return;
            } else {
                p5.setAlpha(0);
                return;
            }
        } else {
            p5.setAlpha(1065353216);
            return;
        }
    }

    public final void i(android.view.View p9, float p10, float p11)
    {
        int v0_1;
        this.b = -1;
        int v11_1 = p9.getWidth();
        float v1_5 = p10 cmp 0;
        int v2 = 0;
        com.google.android.material.behavior.SwipeDismissBehavior v3 = this.c;
        if (v1_5 == 0) {
            if (Math.abs((p9.getLeft() - this.a)) < Math.round((((float) p9.getWidth()) * 1056964608))) {
                v0_1 = this.a;
            } else {
                if (p10 < 0) {
                    v0_1 = (this.a - v11_1);
                } else {
                    int v0_2 = this.a;
                    if (p9.getLeft() >= v0_2) {
                        v0_1 = (v0_2 + v11_1);
                    }
                }
                v2 = 1;
            }
        } else {
            int v5_6;
            if (p9.getLayoutDirection() != 1) {
                v5_6 = 0;
            } else {
                v5_6 = 1;
            }
            int v6_1 = v3.e;
            if (v6_1 != 2) {
                if (v6_1 != 0) {
                    if (v6_1 != 1) {
                    } else {
                        if (v5_6 == 0) {
                            if (p10 >= 0) {
                            }
                        } else {
                            if (v1_5 <= 0) {
                            }
                        }
                    }
                } else {
                    if (v5_6 == 0) {
                        if (v1_5 <= 0) {
                        }
                    } else {
                        if (p10 >= 0) {
                        }
                    }
                }
            }
        }
        if (!v3.a.o(v0_1, p9.getTop())) {
            if (v2 != 0) {
                y3.e v10_6 = v3.b;
                if (v10_6 != null) {
                    v10_6.a(p9);
                }
            }
            return;
        } else {
            p9.postOnAnimation(new f3.e(v3, p9, v2));
            return;
        }
    }

    public final boolean j(android.view.View p3, int p4)
    {
        int v0 = this.b;
        if (((v0 != -1) && (v0 != p4)) || (!this.c.v(p3))) {
            return 0;
        } else {
            return 1;
        }
    }
}
