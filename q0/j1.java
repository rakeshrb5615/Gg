package q0;
public abstract class j1 extends q0.p1 {
    public static boolean i = False;
    public static reflect.Method j;
    public static Class k;
    public static reflect.Field l;
    public static reflect.Field m;
    public final android.view.WindowInsets c;
    public h0.b[] d;
    public h0.b e;
    public q0.s1 f;
    public h0.b g;
    public int h;

    public j1(q0.s1 p1, android.view.WindowInsets p2)
    {
        super(p1);
        super.e = 0;
        super.c = p2;
        return;
    }

    private h0.b s(int p4, boolean p5)
    {
        h0.b v0 = h0.b.e;
        int v1 = 1;
        while (v1 <= 512) {
            if ((p4 & v1) != 0) {
                v0 = h0.b.a(v0, this.t(v1, p5));
            }
            v1 <<= 1;
        }
        return v0;
    }

    private h0.b u()
    {
        h0.b v0_0 = this.f;
        if (v0_0 == null) {
            return h0.b.e;
        } else {
            return v0_0.a.h();
        }
    }

    private h0.b v(android.view.View p6)
    {
        if (android.os.Build$VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        } else {
            if (!q0.j1.i) {
                q0.j1.w();
            }
            int v1_1 = q0.j1.j;
            if ((v1_1 != 0) && ((q0.j1.k != null) && (q0.j1.l != null))) {
                h0.b v6_1 = v1_1.invoke(p6, 0);
                if (v6_1 != null) {
                    h0.b v6_4 = ((android.graphics.Rect) q0.j1.l.get(q0.j1.m.get(v6_1)));
                    if (v6_4 != null) {
                        return h0.b.b(v6_4.left, v6_4.top, v6_4.right, v6_4.bottom);
                    }
                } else {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return 0;
                }
            }
            return 0;
        }
    }

    private static void w()
    {
        try {
            q0.j1.j = android.view.View.getDeclaredMethod("getViewRootImpl", 0);
            ReflectiveOperationException v1_10 = Class.forName("android.view.View$AttachInfo");
            q0.j1.k = v1_10;
            q0.j1.l = v1_10.getDeclaredField("mVisibleInsets");
            q0.j1.m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q0.j1.l.setAccessible(1);
            q0.j1.m.setAccessible(1);
        } catch (ReflectiveOperationException v1_7) {
            String v2_4 = new StringBuilder("Failed to get visible insets. (Reflection error). ");
            v2_4.append(v1_7.getMessage());
            android.util.Log.e("WindowInsetsCompat", v2_4.toString(), v1_7);
        }
        q0.j1.i = 1;
        return;
    }

    public static boolean y(int p0, int p1)
    {
        if ((p0 & 6) != (p1 & 6)) {
            return 0;
        } else {
            return 1;
        }
    }

    public void d(android.view.View p1)
    {
        h0.b v1_1 = this.v(p1);
        if (v1_1 == null) {
            v1_1 = h0.b.e;
        }
        this.x(v1_1);
        return;
    }

    public boolean equals(Object p4)
    {
        if (super.equals(p4)) {
            if ((!java.util.Objects.equals(this.g, ((q0.j1) p4).g)) || (!q0.j1.y(this.h, ((q0.j1) p4).h))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public h0.b f(int p2)
    {
        return this.s(p2, 0);
    }

    public final h0.b j()
    {
        if (this.e == null) {
            h0.b v0_4 = this.c;
            this.e = h0.b.b(v0_4.getSystemWindowInsetLeft(), v0_4.getSystemWindowInsetTop(), v0_4.getSystemWindowInsetRight(), v0_4.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    public q0.s1 l(int p4, int p5, int p6, int p7)
    {
        q0.d1 v1_2;
        h0.b v0_4 = q0.s1.g(0, this.c);
        q0.d1 v1_6 = android.os.Build$VERSION.SDK_INT;
        if (v1_6 < 34) {
            if (v1_6 < 30) {
                if (v1_6 < 29) {
                    v1_2 = new q0.d1(v0_4);
                } else {
                    v1_2 = new q0.f1(v0_4);
                }
            } else {
                v1_2 = new q0.g1(v0_4);
            }
        } else {
            v1_2 = new q0.h1(v0_4);
        }
        v1_2.g(q0.s1.e(this.j(), p4, p5, p6, p7));
        v1_2.e(q0.s1.e(this.h(), p4, p5, p6, p7));
        return v1_2.b();
    }

    public boolean n()
    {
        return this.c.isRound();
    }

    public void o(h0.b[] p1)
    {
        this.d = p1;
        return;
    }

    public void p(q0.s1 p1)
    {
        this.f = p1;
        return;
    }

    public void r(int p1)
    {
        this.h = p1;
        return;
    }

    public h0.b t(int p6, boolean p7)
    {
        int v1_0 = h0.b.e;
        int v2 = 0;
        if (p6 == 1) {
            if (p7 == 0) {
                if ((this.h & 4) == 0) {
                    return h0.b.b(0, this.j().b, 0, 0);
                }
            } else {
                return h0.b.b(0, Math.max(this.u().b, this.j().b), 0, 0);
            }
        } else {
            int v0_2 = 0;
            if (p6 == 2) {
                if (p7 == 0) {
                    if ((this.h & 2) == 0) {
                        h0.b v6_17 = this.j();
                        int v7_7 = this.f;
                        if (v7_7 != 0) {
                            v0_2 = v7_7.a.h();
                        }
                        int v7_9 = v6_17.d;
                        if (v0_2 != 0) {
                            v7_9 = Math.min(v7_9, v0_2.d);
                        }
                        return h0.b.b(v6_17.a, 0, v6_17.c, v7_9);
                    }
                } else {
                    h0.b v6_21 = this.u();
                    int v7_10 = this.h();
                    return h0.b.b(Math.max(v6_21.a, v7_10.a), 0, Math.max(v6_21.c, v7_10.c), Math.max(v6_21.d, v7_10.d));
                }
            } else {
                if (p6 == 8) {
                    h0.b v6_26 = this.d;
                    if (v6_26 != null) {
                        v0_2 = v6_26[q4.b.B(8)];
                    }
                    if (v0_2 == 0) {
                        h0.b v6_27 = this.j();
                        int v7_14 = this.u();
                        h0.b v6_28 = v6_27.d;
                        if (v6_28 <= v7_14.d) {
                            h0.b v6_29 = this.g;
                            if ((v6_29 != null) && (!v6_29.equals(v1_0))) {
                                h0.b v6_32 = this.g.d;
                                if (v6_32 > v7_14.d) {
                                    return h0.b.b(0, 0, 0, v6_32);
                                }
                            }
                        } else {
                            return h0.b.b(0, 0, 0, v6_28);
                        }
                    } else {
                        return v0_2;
                    }
                } else {
                    if (p6 == 16) {
                        return this.i();
                    } else {
                        if (p6 == 32) {
                            return this.g();
                        } else {
                            if (p6 == 64) {
                                return this.k();
                            } else {
                                if (p6 == 128) {
                                    h0.b v6_6;
                                    h0.b v6_5 = this.f;
                                    if (v6_5 == null) {
                                        v6_6 = this.e();
                                    } else {
                                        v6_6 = v6_5.a.e();
                                    }
                                    if (v6_6 != null) {
                                        int v1_1;
                                        int v7_4 = android.os.Build$VERSION.SDK_INT;
                                        if (v7_4 < 28) {
                                            v1_1 = 0;
                                        } else {
                                            v1_1 = e0.a.i(v6_6.a);
                                        }
                                        int v3_0;
                                        if (v7_4 < 28) {
                                            v3_0 = 0;
                                        } else {
                                            v3_0 = e0.a.k(v6_6.a);
                                        }
                                        int v4_0;
                                        if (v7_4 < 28) {
                                            v4_0 = 0;
                                        } else {
                                            v4_0 = e0.a.j(v6_6.a);
                                        }
                                        if (v7_4 >= 28) {
                                            v2 = e0.a.h(v6_6.a);
                                        }
                                        return h0.b.b(v1_1, v3_0, v4_0, v2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return v1_0;
    }

    public void x(h0.b p1)
    {
        this.g = p1;
        return;
    }
}
