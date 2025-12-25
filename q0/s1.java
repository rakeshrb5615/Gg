package q0;
public final class s1 {
    public static final q0.s1 b;
    public final q0.p1 a;

    static s1()
    {
        q0.s1 v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 34) {
            if (v0_0 < 30) {
                q0.s1.b = q0.p1.b;
                return;
            } else {
                q0.s1.b = q0.n1.r;
                return;
            }
        } else {
            q0.s1.b = q0.o1.s;
            return;
        }
    }

    public s1()
    {
        this.a = new q0.p1(this);
        return;
    }

    public s1(android.view.WindowInsets p3)
    {
        q0.k1 v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 34) {
            if (v0_0 < 30) {
                if (v0_0 < 29) {
                    if (v0_0 < 28) {
                        this.a = new q0.k1(this, p3);
                        return;
                    } else {
                        this.a = new q0.l1(this, p3);
                        return;
                    }
                } else {
                    this.a = new q0.m1(this, p3);
                    return;
                }
            } else {
                this.a = new q0.n1(this, p3);
                return;
            }
        } else {
            this.a = new q0.o1(this, p3);
            return;
        }
    }

    public static h0.b e(h0.b p5, int p6, int p7, int p8, int p9)
    {
        int v0_2 = Math.max(0, (p5.a - p6));
        int v2_2 = Math.max(0, (p5.b - p7));
        int v3_1 = Math.max(0, (p5.c - p8));
        int v1_0 = Math.max(0, (p5.d - p9));
        if ((v0_2 != p6) || ((v2_2 != p7) || ((v3_1 != p8) || (v1_0 != p9)))) {
            return h0.b.b(v0_2, v2_2, v3_1, v1_0);
        } else {
            return p5;
        }
    }

    public static q0.s1 g(android.view.View p2, android.view.WindowInsets p3)
    {
        p3.getClass();
        q0.s1 v0_1 = new q0.s1(p3);
        if ((p2 != 0) && (p2.isAttachedToWindow())) {
            q0.p1 v1 = v0_1.a;
            v1.p(q0.j0.a(p2));
            v1.d(p2.getRootView());
            v1.r(p2.getWindowSystemUiVisibility());
        }
        return v0_1;
    }

    public final int a()
    {
        return this.a.j().d;
    }

    public final int b()
    {
        return this.a.j().a;
    }

    public final int c()
    {
        return this.a.j().c;
    }

    public final int d()
    {
        return this.a.j().b;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof q0.s1)) {
                return java.util.Objects.equals(this.a, ((q0.s1) p2).a);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final android.view.WindowInsets f()
    {
        int v0_0 = this.a;
        if (!(v0_0 instanceof q0.j1)) {
            return 0;
        } else {
            return ((q0.j1) v0_0).c;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            return v0_0.hashCode();
        } else {
            return 0;
        }
    }
}
