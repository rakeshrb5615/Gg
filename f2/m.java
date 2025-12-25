package f2;
public class m extends androidx.fragment.app.u1 {

    public m()
    {
        return;
    }

    public final void a(android.view.View p1, Object p2)
    {
        ((f2.s) p2).b(p1);
        return;
    }

    public final void b(Object p4, java.util.ArrayList p5)
    {
        if (((f2.s) p4) != null) {
            int v1 = 0;
            if (!(((f2.s) p4) instanceof f2.y)) {
                if ((androidx.fragment.app.u1.h(((f2.s) p4).e)) && (androidx.fragment.app.u1.h(((f2.s) p4).f))) {
                    int v0_1 = p5.size();
                    while (v1 < v0_1) {
                        ((f2.s) p4).b(((android.view.View) p5.get(v1)));
                        v1++;
                    }
                }
            } else {
                int v0_4 = ((f2.y) ((f2.s) p4)).H.size();
                while (v1 < v0_4) {
                    if ((v1 >= 0) && (v1 < ((f2.y) ((f2.s) p4)).H.size())) {
                        android.view.View v2_6 = ((f2.s) ((f2.y) ((f2.s) p4)).H.get(v1));
                    } else {
                        v2_6 = 0;
                    }
                    this.b(v2_6, p5);
                    v1++;
                }
            }
        }
        return;
    }

    public final void c(android.view.ViewGroup p1, Object p2)
    {
        f2.w.a(p1, ((f2.s) p2));
        return;
    }

    public final boolean e(Object p1)
    {
        return (p1 instanceof f2.s);
    }

    public final Object f(Object p1)
    {
        if (p1 == 0) {
            return 0;
        } else {
            return ((f2.s) p1).m();
        }
    }

    public final Object i(Object p2, Object p3, Object p4)
    {
        int v2_1 = ((f2.s) p2);
        if ((((f2.s) p2) == null) || (((f2.s) p3) == null)) {
            if (((f2.s) p2) == null) {
                if (((f2.s) p3) == null) {
                    v2_1 = 0;
                } else {
                    v2_1 = ((f2.s) p3);
                }
            }
        } else {
            f2.y v0_0 = new f2.y();
            v0_0.M(((f2.s) p2));
            v0_0.M(((f2.s) p3));
            v0_0.I = 0;
            v2_1 = v0_0;
        }
        if (((f2.s) p4) == null) {
            return v2_1;
        } else {
            f2.y v3_3 = new f2.y();
            if (v2_1 != 0) {
                v3_3.M(v2_1);
            }
            v3_3.M(((f2.s) p4));
            return v3_3;
        }
    }

    public final Object j(Object p2, Object p3)
    {
        f2.y v0_1 = new f2.y();
        if (p2 != null) {
            v0_1.M(((f2.s) p2));
        }
        v0_1.M(((f2.s) p3));
        return v0_1;
    }

    public final void k(Object p2, android.view.View p3, java.util.ArrayList p4)
    {
        ((f2.s) p2).a(new f2.j(p3, p4));
        return;
    }

    public final void l(Object p7, Object p8, java.util.ArrayList p9, Object p10, java.util.ArrayList p11)
    {
        ((f2.s) p7).a(new f2.k(this, p8, p9, p10, p11));
        return;
    }

    public final void m(android.view.View p2, Object p3)
    {
        if (p2 != null) {
            androidx.fragment.app.u1.g(p2, new android.graphics.Rect());
            ((f2.s) p3).F(new f2.i());
        }
        return;
    }

    public final void n(Object p1, android.graphics.Rect p2)
    {
        ((f2.s) p1).F(new f2.i());
        return;
    }

    public final void o(Object p3, m0.d p4, androidx.fragment.app.d p5)
    {
        p4.a(new a5.u(1, ((f2.s) p3), p5));
        ((f2.s) p3).a(new f2.l(p5));
        return;
    }

    public final void p(Object p5, android.view.View p6, java.util.ArrayList p7)
    {
        java.util.ArrayList v0 = ((f2.y) p5).f;
        v0.clear();
        int v1 = p7.size();
        int v2 = 0;
        while (v2 < v1) {
            androidx.fragment.app.u1.d(v0, ((android.view.View) p7.get(v2)));
            v2++;
        }
        v0.add(p6);
        p7.add(p6);
        this.b(((f2.y) p5), p7);
        return;
    }

    public final void q(Object p2, java.util.ArrayList p3, java.util.ArrayList p4)
    {
        if (((f2.y) p2) != null) {
            java.util.ArrayList v0 = ((f2.y) p2).f;
            v0.clear();
            v0.addAll(p4);
            this.s(((f2.y) p2), p3, p4);
        }
        return;
    }

    public final Object r(Object p2)
    {
        if (p2 != null) {
            f2.y v0_1 = new f2.y();
            v0_1.M(((f2.s) p2));
            return v0_1;
        } else {
            return 0;
        }
    }

    public final void s(Object p5, java.util.ArrayList p6, java.util.ArrayList p7)
    {
        int v1 = 0;
        if (!(((f2.s) p5) instanceof f2.y)) {
            if (androidx.fragment.app.u1.h(((f2.s) p5).e)) {
                android.view.View v0_9 = ((f2.s) p5).f;
                if ((v0_9.size() == p6.size()) && (v0_9.containsAll(p6))) {
                    android.view.View v0_2;
                    if (p7 != 0) {
                        v0_2 = p7.size();
                    } else {
                        v0_2 = 0;
                    }
                    while (v1 < v0_2) {
                        ((f2.s) p5).b(((android.view.View) p7.get(v1)));
                        v1++;
                    }
                    int v7_2 = (p6.size() - 1);
                    while (v7_2 >= 0) {
                        ((f2.s) p5).B(((android.view.View) p6.get(v7_2)));
                        v7_2--;
                    }
                }
            }
        } else {
            android.view.View v0_6 = ((f2.y) ((f2.s) p5)).H.size();
            while (v1 < v0_6) {
                if ((v1 >= 0) && (v1 < ((f2.y) ((f2.s) p5)).H.size())) {
                    android.view.View v2_7 = ((f2.s) ((f2.y) ((f2.s) p5)).H.get(v1));
                } else {
                    v2_7 = 0;
                }
                this.s(v2_7, p6, p7);
                v1++;
            }
        }
        return;
    }
}
