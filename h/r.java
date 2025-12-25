package h;
public final class r implements q0.t, n.i1, m.x {
    public final synthetic int a;
    public final synthetic h.c0 b;

    public synthetic r(h.c0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public void a(m.m p10, boolean p11)
    {
        switch (this.a) {
            case 2:
                this.b.u(p10);
                return;
            default:
                int v3;
                m.m v0_1 = p10.k();
                int v1 = 0;
                if (v0_1 == p10) {
                    v3 = 0;
                } else {
                    v3 = 1;
                }
                if (v3 != 0) {
                    p10 = v0_1;
                }
                int v6;
                h.c0 v4 = this.b;
                h.b0[] v5 = v4.S;
                if (v5 == null) {
                    v6 = 0;
                } else {
                    v6 = v5.length;
                }
                while (v1 < v6) {
                    int v7 = v5[v1];
                    if ((v7 == 0) || (v7.h != p10)) {
                        v1++;
                    }
                    if (v7 != 0) {
                        if (v3 == 0) {
                            v4.v(v7, p11);
                        } else {
                            v4.t(v7.a, v7, v0_1);
                            v4.v(v7, 1);
                        }
                    }
                    return;
                }
                v7 = 0;
        }
    }

    public boolean h(m.m p3)
    {
        switch (this.a) {
            case 2:
                int v0_7 = this.b.r.getCallback();
                if (v0_7 != 0) {
                    v0_7.onMenuOpened(108, p3);
                }
                return 1;
            default:
                if (p3 == p3.k()) {
                    int v0_2 = this.b;
                    if (v0_2.M) {
                        android.view.Window$Callback v1_2 = v0_2.r.getCallback();
                        if ((v1_2 != null) && (!v0_2.X)) {
                            v1_2.onMenuOpened(108, p3);
                        }
                    }
                }
                return 1;
        }
    }

    public q0.s1 i(android.view.View p17, q0.s1 p18)
    {
        int v0_14;
        int v6_0;
        android.view.WindowInsets v3_2 = p18.d();
        int v5_2 = this.b;
        int v6_8 = v5_2.q;
        int v7 = p18.d();
        int v0_32 = v5_2.B;
        if ((v0_32 == 0) || (!(v0_32.getLayoutParams() instanceof android.view.ViewGroup$MarginLayoutParams))) {
            v6_0 = 0;
            v0_14 = 0;
        } else {
            android.view.ViewGroup$MarginLayoutParams v11_1 = ((android.view.ViewGroup$MarginLayoutParams) v5_2.B.getLayoutParams());
            int v12 = 1;
            if (!v5_2.B.isShown()) {
                v6_0 = 0;
                if (v11_1.topMargin == 0) {
                    v0_14 = 0;
                    v12 = 0;
                } else {
                    v11_1.topMargin = 0;
                    v0_14 = 0;
                }
            } else {
                if (v5_2.j0 == null) {
                    v5_2.j0 = new android.graphics.Rect();
                    v5_2.k0 = new android.graphics.Rect();
                }
                android.view.View v13_1 = v5_2.j0;
                int v0_28 = v5_2.k0;
                v13_1.set(p18.b(), p18.d(), p18.c(), p18.a());
                int v9_12 = v5_2.H;
                if (android.os.Build$VERSION.SDK_INT < 29) {
                    if (!n.k3.a) {
                        n.k3.a = 1;
                        try {
                            int v8_7 = android.view.View.getDeclaredMethod("computeFitSystemWindows", new Class[] {android.graphics.Rect, android.graphics.Rect}));
                            n.k3.b = v8_7;
                        } catch (NoSuchMethodException) {
                            android.util.Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                        if (!v8_7.isAccessible()) {
                            n.k3.b.setAccessible(1);
                        }
                    }
                    int v8_11 = n.k3.b;
                    if (v8_11 != 0) {
                        try {
                            v8_11.invoke(v9_12, new Object[] {v13_1, v0_28}));
                        } catch (int v0_30) {
                            android.util.Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", v0_30);
                        }
                    }
                } else {
                    n.j3.a(v9_12, v13_1, v0_28);
                }
                android.view.View v13_2;
                int v0_31 = v13_1.top;
                int v8_13 = v13_1.left;
                int v9_13 = v13_1.right;
                android.view.ViewGroup v10_6 = q0.j0.a(v5_2.H);
                if (v10_6 != null) {
                    v13_2 = v10_6.b();
                } else {
                    v13_2 = 0;
                }
                android.view.ViewGroup v10_0;
                if (v10_6 != null) {
                    v10_0 = v10_6.c();
                } else {
                    v10_0 = 0;
                }
                if ((v11_1.topMargin == v0_31) && ((v11_1.leftMargin == v8_13) && (v11_1.rightMargin == v9_13))) {
                    int v8_1 = 0;
                } else {
                    v11_1.topMargin = v0_31;
                    v11_1.leftMargin = v8_13;
                    v11_1.rightMargin = v9_13;
                    v8_1 = 1;
                }
                if ((v0_31 <= 0) || (v5_2.J != null)) {
                    int v0_1 = v5_2.J;
                    if (v0_1 != 0) {
                        int v0_3 = ((android.view.ViewGroup$MarginLayoutParams) v0_1.getLayoutParams());
                        int v14_3 = v11_1.topMargin;
                        if ((v0_3.height != v14_3) || ((v0_3.leftMargin != v13_2) || (v0_3.rightMargin != v10_0))) {
                            v0_3.height = v14_3;
                            v0_3.leftMargin = v13_2;
                            v0_3.rightMargin = v10_0;
                            v5_2.J.setLayoutParams(v0_3);
                        }
                    }
                } else {
                    int v0_6 = new android.view.View(v6_8);
                    v5_2.J = v0_6;
                    v0_6.setVisibility(8);
                    int v0_9 = new android.widget.FrameLayout$LayoutParams(-1, v11_1.topMargin, 51);
                    v0_9.leftMargin = v13_2;
                    v0_9.rightMargin = v10_0;
                    v5_2.H.addView(v5_2.J, -1, v0_9);
                }
                int v0_10 = v5_2.J;
                if (v0_10 == 0) {
                    v12 = 0;
                }
                if ((v12 != 0) && (v0_10.getVisibility() != 0)) {
                    int v6_1;
                    int v0_12 = v5_2.J;
                    if ((v0_12.getWindowSystemUiVisibility() & 8192) == 0) {
                        v6_1 = e0.c.getColor(v6_8, 2131099653);
                    } else {
                        v6_1 = e0.c.getColor(v6_8, 2131099654);
                    }
                    v0_12.setBackgroundColor(v6_1);
                }
                if ((!v5_2.O) && (v12 != 0)) {
                    v7 = 0;
                }
                v0_14 = v12;
                v6_0 = 0;
                v12 = v8_1;
            }
            if (v12 != 0) {
                v5_2.B.setLayoutParams(v11_1);
            }
        }
        int v5_0 = v5_2.J;
        if (v5_0 != 0) {
            int v9_10;
            if (v0_14 == 0) {
                v9_10 = 8;
            } else {
                v9_10 = v6_0;
            }
            v5_0.setVisibility(v9_10);
        }
        int v0_16;
        if (v3_2 == v7) {
            v0_16 = p18;
        } else {
            int v6_4;
            int v0_17 = p18.b();
            android.view.WindowInsets v3_0 = p18.c();
            int v5_1 = p18.a();
            int v6_2 = android.os.Build$VERSION.SDK_INT;
            if (v6_2 < 34) {
                if (v6_2 < 30) {
                    if (v6_2 < 29) {
                        v6_4 = new q0.d1(p18);
                    } else {
                        v6_4 = new q0.f1(p18);
                    }
                } else {
                    v6_4 = new q0.g1(p18);
                }
            } else {
                v6_4 = new q0.h1(p18);
            }
            v6_4.g(h0.b.b(v0_17, v7, v3_0, v5_1));
            v0_16 = v6_4.b();
        }
        boolean v2_1 = v0_16.f();
        if (v2_1) {
            android.view.WindowInsets v3_1 = q0.g0.b(p17, v2_1);
            if (!v3_1.equals(v2_1)) {
                v0_16 = q0.s1.g(p17, v3_1);
            }
        }
        return v0_16;
    }
}
