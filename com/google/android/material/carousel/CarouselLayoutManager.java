package com.google.android.material.carousel;
public class CarouselLayoutManager extends a2.t0 implements a2.f1 {
    public final f1.f p;
    public j3.c q;
    public final android.view.View$OnLayoutChangeListener r;

    public CarouselLayoutManager()
    {
        int v0_1 = new f1.f();
        new j3.b();
        this.r = new j3.a(this);
        this.p = v0_1;
        this.o0();
        this.G0(0);
        return;
    }

    public CarouselLayoutManager(android.content.Context p1, android.util.AttributeSet p2, int p3, int p4)
    {
        new j3.b();
        this.r = new j3.a(this);
        this.p = new f1.f();
        this.o0();
        if (p2 != 0) {
            android.content.res.TypedArray v1_1 = p1.obtainStyledAttributes(p2, c3.a.b);
            v1_1.getInt(0, 0);
            this.o0();
            this.G0(v1_1.getInt(0, 0));
            v1_1.recycle();
        }
        return;
    }

    public final void A0(androidx.recyclerview.widget.RecyclerView p2, int p3)
    {
        com.google.android.material.datepicker.y v0_1 = new com.google.android.material.datepicker.y(this, p2.getContext());
        v0_1.a = p3;
        this.B0(v0_1);
        return;
    }

    public final float D0(float p2, float p3)
    {
        if (!this.F0()) {
            return (p2 + p3);
        } else {
            return (p2 - p3);
        }
    }

    public final boolean E0()
    {
        if (this.q.a != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean F0()
    {
        if ((!this.E0()) || (this.b.getLayoutDirection() != 1)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void G0(int p3)
    {
        if ((p3 != null) && (p3 != 1)) {
            throw new IllegalArgumentException(g2.g.c(p3, "invalid orientation:"));
        } else {
            this.c(0);
            int v1_0 = this.q;
            if ((v1_0 != 0) && (p3 == v1_0.a)) {
                return;
            } else {
                IllegalArgumentException v3_2;
                if (p3 == null) {
                    v3_2 = new j3.c(this, 1);
                } else {
                    if (p3 != 1) {
                        throw new IllegalArgumentException("invalid orientation");
                    } else {
                        v3_2 = new j3.c(this, 0);
                    }
                }
                this.q = v3_2;
                this.o0();
                return;
            }
        }
    }

    public final boolean K()
    {
        return 1;
    }

    public final void R(androidx.recyclerview.widget.RecyclerView p6)
    {
        android.view.View$OnLayoutChangeListener v0_0 = p6.getContext();
        f1.f v1 = this.p;
        float v2_0 = v1.a;
        if (v2_0 <= 0) {
            v2_0 = v0_0.getResources().getDimension(2131165447);
        }
        v1.a = v2_0;
        float v2_1 = v1.b;
        if (v2_1 <= 0) {
            v2_1 = v0_0.getResources().getDimension(2131165446);
        }
        v1.b = v2_1;
        this.o0();
        p6.addOnLayoutChangeListener(this.r);
        return;
    }

    public final void S(androidx.recyclerview.widget.RecyclerView p2)
    {
        p2.removeOnLayoutChangeListener(this.r);
        return;
    }

    public final android.view.View T(android.view.View p4, int p5, a2.z0 p6, a2.g1 p7)
    {
        if (this.v() != 0) {
            int v5_3;
            int v6_5 = this.q.a;
            if (p5 == 1) {
                v5_3 = -1;
            } else {
                if (p5 != 2) {
                    if (p5 == 17) {
                        if (v6_5 == 0) {
                            if (!this.F0()) {
                            } else {
                                v5_3 = 1;
                                if (v5_3 != -2147483648) {
                                    int v6_6 = 0;
                                    if (v5_3 != -1) {
                                        if (a2.t0.G(p4) != (this.B() - 1)) {
                                            android.view.View v4_6 = (a2.t0.G(this.u((this.v() - 1))) + 1);
                                            if ((v4_6 >= null) && (v4_6 < this.B())) {
                                                this.q.a();
                                                throw 0;
                                            } else {
                                                if (!this.F0()) {
                                                    v6_6 = (this.v() - 1);
                                                }
                                                return this.u(v6_6);
                                            }
                                        }
                                    } else {
                                        if (a2.t0.G(p4) != 0) {
                                            android.view.View v4_15 = (a2.t0.G(this.u(0)) - 1);
                                            if ((v4_15 >= null) && (v4_15 < this.B())) {
                                                this.q.a();
                                                throw 0;
                                            } else {
                                                if (this.F0()) {
                                                    v6_6 = (this.v() - 1);
                                                }
                                                return this.u(v6_6);
                                            }
                                        }
                                    }
                                }
                                return 0;
                            }
                        }
                    } else {
                        if (p5 == 33) {
                            if (v6_5 == 1) {
                            }
                        } else {
                            if (p5 == 66) {
                                if (v6_5 == 0) {
                                    if (!this.F0()) {
                                    }
                                }
                            } else {
                                if (p5 == 130) {
                                    if (v6_5 == 1) {
                                    }
                                } else {
                                    int v6_3 = new StringBuilder("Unknown focus request:");
                                    v6_3.append(p5);
                                    android.util.Log.d("CarouselLayoutManager", v6_3.toString());
                                }
                            }
                        }
                    }
                    v5_3 = -2147483648;
                }
            }
        }
        return 0;
    }

    public final void U(android.view.accessibility.AccessibilityEvent p2)
    {
        super.U(p2);
        if (this.v() > 0) {
            p2.setFromIndex(a2.t0.G(this.u(0)));
            p2.setToIndex(a2.t0.G(this.u((this.v() - 1))));
        }
        return;
    }

    public final void Y(int p1, int p2)
    {
        this.B();
        return;
    }

    public final void Z()
    {
        this.B();
        return;
    }

    public final android.graphics.PointF a(int p1)
    {
        return 0;
    }

    public final void b0(int p1, int p2)
    {
        this.B();
        return;
    }

    public final boolean d()
    {
        return this.E0();
    }

    public final void d0(a2.z0 p2, a2.g1 p3)
    {
        if (p3.b() > 0) {
            String v3_6;
            if (!this.E0()) {
                v3_6 = this.o;
            } else {
                v3_6 = this.n;
            }
            if (((float) v3_6) > 0) {
                this.F0();
                p2.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        this.j0(p2);
        return;
    }

    public final boolean e()
    {
        return (this.E0() ^ 1);
    }

    public final void e0(a2.g1 p1)
    {
        if (this.v() != 0) {
            a2.t0.G(this.u(0));
            return;
        } else {
            return;
        }
    }

    public final int j(a2.g1 p1)
    {
        this.v();
        return 0;
    }

    public final int k(a2.g1 p1)
    {
        return 0;
    }

    public final int l(a2.g1 p1)
    {
        return 0;
    }

    public final int m(a2.g1 p1)
    {
        this.v();
        return 0;
    }

    public final int n(a2.g1 p1)
    {
        return 0;
    }

    public final boolean n0(androidx.recyclerview.widget.RecyclerView p1, android.view.View p2, android.graphics.Rect p3, boolean p4, boolean p5)
    {
        return 0;
    }

    public final int o(a2.g1 p1)
    {
        return 0;
    }

    public final int p0(int p2, a2.z0 p3, a2.g1 p4)
    {
        if ((this.E0()) && ((this.v() != 0) && (p2 != null))) {
            p3.d(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        } else {
            return 0;
        }
    }

    public final void q0(int p1)
    {
        return;
    }

    public final a2.u0 r()
    {
        return new a2.u0(-2, -2);
    }

    public final int r0(int p2, a2.z0 p3, a2.g1 p4)
    {
        if ((this.e()) && ((this.v() != 0) && (p2 != null))) {
            p3.d(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        } else {
            return 0;
        }
    }

    public final void y(android.view.View p1, android.graphics.Rect p2)
    {
        super.y(p1, p2);
        p2.centerY();
        if (this.E0()) {
            p2.centerX();
        }
        throw 0;
    }
}
