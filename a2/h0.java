package a2;
public final class h0 implements q0.i {
    public final synthetic androidx.recyclerview.widget.RecyclerView a;

    public synthetic h0(androidx.recyclerview.widget.RecyclerView p1)
    {
        this.a = p1;
        return;
    }

    public void a(a2.a p4)
    {
        a2.t0 v0_0 = p4.a;
        androidx.recyclerview.widget.RecyclerView v2 = this.a;
        if (v0_0 == 1) {
            v2.s.Y(p4.b, p4.c);
            return;
        } else {
            if (v0_0 == 2) {
                v2.s.b0(p4.b, p4.c);
                return;
            } else {
                if (v0_0 == 4) {
                    v2.s.c0(p4.b, p4.c);
                    return;
                } else {
                    if (v0_0 == 8) {
                        v2.s.a0(p4.b, p4.c);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public a2.k1 b(int p8)
    {
        String v0_0 = this.a;
        int v1_1 = v0_0.f.u();
        int v3 = 0;
        a2.k1 v4_4 = 0;
        while (v3 < v1_1) {
            a2.k1 v5_1 = androidx.recyclerview.widget.RecyclerView.M(v0_0.f.t(v3));
            if ((v5_1 != null) && ((!v5_1.h()) && (v5_1.c == p8))) {
                if (!((java.util.ArrayList) v0_0.f.e).contains(v5_1.a)) {
                    v4_4 = v5_1;
                    break;
                } else {
                    v4_4 = v5_1;
                }
            }
            v3++;
        }
        if (v4_4 != null) {
            if (!((java.util.ArrayList) v0_0.f.e).contains(v4_4.a)) {
                return v4_4;
            } else {
                if (androidx.recyclerview.widget.RecyclerView.G0) {
                    android.util.Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            }
        }
        return 0;
    }

    public void c(int p9, int p10)
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.a;
        a2.z0 v1_1 = v0.f.u();
        int v10_1 = (p10 + p9);
        int v2_1 = 0;
        while (v2_1 < v1_1) {
            int v5_3 = v0.f.t(v2_1);
            a2.k1 v6_2 = androidx.recyclerview.widget.RecyclerView.M(v5_3);
            if ((v6_2 != null) && (!v6_2.o())) {
                int v7_2 = v6_2.c;
                if ((v7_2 >= p9) && (v7_2 < v10_1)) {
                    v6_2.a(2);
                    v6_2.a(1024);
                    ((a2.u0) v5_3.getLayoutParams()).c = 1;
                }
            }
            v2_1++;
        }
        a2.z0 v1_2 = v0.c;
        int v2_0 = v1_2.c;
        int v5_1 = (v2_0.size() - 1);
        while (v5_1 >= 0) {
            a2.k1 v6_1 = ((a2.k1) v2_0.get(v5_1));
            if (v6_1 != null) {
                int v7_0 = v6_1.c;
                if ((v7_0 >= p9) && (v7_0 < v10_1)) {
                    v6_1.a(2);
                    v1_2.h(v5_1);
                }
            }
            v5_1--;
        }
        v0.o0 = 1;
        return;
    }

    public void d(int p13, int p14)
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.a;
        java.util.ArrayList v1_3 = v0.f.u();
        int v3_1 = 0;
        while (v3_1 < v1_3) {
            int v8_3 = androidx.recyclerview.widget.RecyclerView.M(v0.f.t(v3_1));
            if ((v8_3 != 0) && ((!v8_3.o()) && (v8_3.c >= p13))) {
                if (androidx.recyclerview.widget.RecyclerView.G0) {
                    StringBuilder v9_6 = new StringBuilder("offsetPositionRecordsForInsert attached child ");
                    v9_6.append(v3_1);
                    v9_6.append(" holder ");
                    v9_6.append(v8_3);
                    v9_6.append(" now at position ");
                    v9_6.append((v8_3.c + p14));
                    android.util.Log.d("RecyclerView", v9_6.toString());
                }
                v8_3.l(p14, 0);
                v0.k0.f = 1;
            }
            v3_1++;
        }
        java.util.ArrayList v1_2 = v0.c.c;
        int v3_0 = v1_2.size();
        int v8_0 = 0;
        while (v8_0 < v3_0) {
            StringBuilder v9_1 = ((a2.k1) v1_2.get(v8_0));
            if ((v9_1 != null) && (v9_1.c >= p13)) {
                if (androidx.recyclerview.widget.RecyclerView.G0) {
                    String v10_3 = new StringBuilder("offsetPositionRecordsForInsert cached ");
                    v10_3.append(v8_0);
                    v10_3.append(" holder ");
                    v10_3.append(v9_1);
                    v10_3.append(" now at position ");
                    v10_3.append((v9_1.c + p14));
                    android.util.Log.d("RecyclerView", v10_3.toString());
                }
                v9_1.l(p14, 0);
            }
            v8_0++;
        }
        v0.requestLayout();
        v0.n0 = 1;
        return;
    }

    public void e(int p17, int p18)
    {
        int v8_0;
        int v9_0;
        int v7_0;
        androidx.recyclerview.widget.RecyclerView v3 = this.a;
        java.util.ArrayList v4_3 = v3.f.u();
        if (p17 >= p18) {
            v8_0 = p17;
            v7_0 = p18;
            v9_0 = 1;
        } else {
            v7_0 = p17;
            v8_0 = p18;
            v9_0 = -1;
        }
        String v10_0 = 0;
        int v11_0 = 0;
        while (v11_0 < v4_3) {
            a2.k1 v14_4 = androidx.recyclerview.widget.RecyclerView.M(v3.f.t(v11_0));
            if (v14_4 != null) {
                StringBuilder v15_5 = v14_4.c;
                if ((v15_5 >= v7_0) && (v15_5 <= v8_0)) {
                    if (androidx.recyclerview.widget.RecyclerView.G0) {
                        StringBuilder v15_8 = new StringBuilder("offsetPositionRecordsForMove attached child ");
                        v15_8.append(v11_0);
                        v15_8.append(" holder ");
                        v15_8.append(v14_4);
                        android.util.Log.d("RecyclerView", v15_8.toString());
                    }
                    if (v14_4.c != p17) {
                        v14_4.l(v9_0, 0);
                    } else {
                        v14_4.l((p18 - p17), 0);
                    }
                    v3.k0.f = 1;
                }
            }
            v11_0++;
        }
        int v7_1;
        a2.g1 v5_0;
        int v8_1;
        java.util.ArrayList v4_1 = v3.c.c;
        if (p17 >= p18) {
            v8_1 = p17;
            v7_1 = p18;
            v5_0 = 1;
        } else {
            v7_1 = p17;
            v8_1 = p18;
            v5_0 = -1;
        }
        int v9_1 = v4_1.size();
        int v11_1 = 0;
        while (v11_1 < v9_1) {
            a2.k1 v14_1 = ((a2.k1) v4_1.get(v11_1));
            if (v14_1 != null) {
                StringBuilder v15_0 = v14_1.c;
                if ((v15_0 >= v7_1) && (v15_0 <= v8_1)) {
                    if (v15_0 != p17) {
                        v14_1.l(v5_0, v10_0);
                    } else {
                        v14_1.l((p18 - p17), v10_0);
                    }
                    if (androidx.recyclerview.widget.RecyclerView.G0) {
                        StringBuilder v15_4 = new StringBuilder("offsetPositionRecordsForMove cached child ");
                        v15_4.append(v11_1);
                        v15_4.append(" holder ");
                        v15_4.append(v14_1);
                        android.util.Log.d("RecyclerView", v15_4.toString());
                    }
                }
            }
            v11_1++;
            v10_0 = 0;
        }
        v3.requestLayout();
        v3.n0 = 1;
        return;
    }

    public void f(a2.k1 p9, a2.o0 p10, a2.o0 p11)
    {
        int v9_3;
        androidx.recyclerview.widget.RecyclerView v0 = this.a;
        v0.getClass();
        p9.n(0);
        a2.k v2_1 = ((a2.k) v0.P);
        if (p10 == 0) {
            v2_1.l(p9);
            p9.a.setAlpha(0);
            v2_1.i.add(p9);
            v9_3 = 1;
        } else {
            v2_1.getClass();
            int v4 = p10.a;
            int v6 = p11.a;
            if ((v4 == v6) && (p10.b == p11.b)) {
            } else {
                v9_3 = v2_1.g(p9, v4, p10.b, v6, p11.b);
            }
        }
        if (v9_3 != 0) {
            v0.W();
        }
        return;
    }

    public boolean g(float p5)
    {
        boolean v5_1;
        int v1_1;
        androidx.recyclerview.widget.RecyclerView v0 = this.a;
        if (!v0.s.e()) {
            if (!v0.s.d()) {
                v5_1 = 0;
                v1_1 = 0;
            } else {
                v5_1 = ((int) p5);
                v1_1 = 0;
            }
        } else {
            v1_1 = ((int) p5);
            v5_1 = 0;
        }
        if ((v5_1) || (v1_1 != 0)) {
            v0.n0();
            return v0.I(v5_1, v1_1, 0, 2147483647);
        } else {
            return 0;
        }
    }

    public void h(a2.k1 p9, a2.o0 p10, a2.o0 p11)
    {
        int v1_1;
        androidx.recyclerview.widget.RecyclerView v0 = this.a;
        v0.c.m(p9);
        v0.h(p9);
        p9.n(0);
        a2.k v2_1 = ((a2.k) v0.P);
        v2_1.getClass();
        int v4 = p10.a;
        int v5 = p10.b;
        android.view.View v10_1 = p9.a;
        if (p11 != 0) {
            v1_1 = p11.a;
        } else {
            v1_1 = v10_1.getLeft();
        }
        int v6 = v1_1;
        int v11_1;
        if (p11 != 0) {
            v11_1 = p11.b;
        } else {
            v11_1 = v10_1.getTop();
        }
        int v7 = v11_1;
        if ((p9.h()) || ((v4 == v6) && (v5 == v7))) {
            v2_1.l(p9);
            v2_1.h.add(p9);
            int v9_2 = 1;
        } else {
            v10_1.layout(v6, v7, (v10_1.getWidth() + v6), (v10_1.getHeight() + v7));
            v9_2 = v2_1.g(p9, v4, v5, v6, v7);
        }
        if (v9_2 != 0) {
            v0.W();
        }
        return;
    }

    public void i(int p3)
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.a;
        android.view.View v1 = v0.getChildAt(p3);
        if (v1 != null) {
            androidx.recyclerview.widget.RecyclerView.M(v1);
            v1.clearAnimation();
        }
        v0.removeViewAt(p3);
        return;
    }

    public float l()
    {
        int v0_1;
        int v0_0 = this.a;
        if (!v0_0.s.e()) {
            if (!v0_0.s.d()) {
                return 0;
            } else {
                v0_1 = v0_0.e0;
            }
        } else {
            v0_1 = v0_0.f0;
        }
        return (- v0_1);
    }

    public void o()
    {
        this.a.n0();
        return;
    }
}
