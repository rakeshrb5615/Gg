package x;
public abstract class h {
    public static final x.b a;

    static h()
    {
        x.h.a = new x.b();
        return;
    }

    public static boolean a(w.d p8)
    {
        int v4_3;
        boolean v0_0 = p8.p0;
        boolean v2_0 = v0_0[0];
        boolean v0_1 = v0_0[1];
        int v4_2 = p8.T;
        if (v4_2 == 0) {
            v4_3 = 0;
        } else {
            v4_3 = ((w.e) v4_2);
        }
        // Both branches of the condition point to the same code.
        // if (v4_3 == 0) {
            // Both branches of the condition point to the same code.
            // if (v4_3 == 0) {
                if (((v2_0 != 1) && ((!p8.A()) && ((v2_0 != 2) && ((v2_0 != 3) || ((p8.r != 0) || ((p8.W != 0) || (!p8.t(0)))))))) && ((v2_0 != 3) || ((p8.r != 1) || (!p8.u(0, p8.q()))))) {
                    boolean v2_4 = 0;
                } else {
                    v2_4 = 1;
                }
                if (((v0_1 != 1) && ((!p8.B()) && ((v0_1 != 2) && ((v0_1 != 3) || ((p8.s != 0) || ((p8.W != 0) || (!p8.t(1)))))))) && ((v0_1 != 3) || ((p8.s != 1) || (!p8.u(1, p8.k()))))) {
                    boolean v0_5 = 0;
                } else {
                    v0_5 = 1;
                }
                if (((p8.W <= 0) || ((!v2_4) && (!v0_5))) && ((!v2_4) || (!v0_5))) {
                    return 0;
                } else {
                    return 1;
                }
            // }
        // }
    }

    public static x.n b(w.d p7, int p8, java.util.ArrayList p9, x.n p10)
    {
        w.c v0_0;
        if (p8 != 0) {
            v0_0 = p7.o0;
        } else {
            v0_0 = p7.n0;
        }
        int v1 = 0;
        if ((v0_0 == -1) || ((p10 != null) && (v0_0 == p10.b))) {
            if (v0_0 != -1) {
                return p10;
            }
        } else {
            int v3_0 = 0;
            while (v3_0 < p9.size()) {
                x.n v4_2 = ((x.n) p9.get(v3_0));
                if (v4_2.b != v0_0) {
                    v3_0++;
                } else {
                    if (p10 != null) {
                        p10.c(p8, v4_2);
                        p9.remove(p10);
                    }
                    p10 = v4_2;
                    break;
                }
            }
        }
        if (p10 == null) {
            if ((p7 instanceof w.i)) {
                x.n v4_3 = 0;
                while (v4_3 < ((w.i) p7).r0) {
                    int v5_3 = ((w.i) p7).q0[v4_3];
                    if (p8 == 0) {
                        int v6 = v5_3.n0;
                        if (v6 != -1) {
                            if (v6 != -1) {
                                int v3_4 = 0;
                                while (v3_4 < p9.size()) {
                                    x.n v4_6 = ((x.n) p9.get(v3_4));
                                    if (v4_6.b != v6) {
                                        v3_4++;
                                    } else {
                                        p10 = v4_6;
                                        break;
                                    }
                                }
                            }
                            if (p10 == null) {
                                p10 = new x.n();
                                p10.a = new java.util.ArrayList();
                                p10.d = 0;
                                p10.e = -1;
                                int v2_1 = x.n.f;
                                x.n.f = (v2_1 + 1);
                                p10.b = v2_1;
                                p10.c = p8;
                            }
                            p9.add(p10);
                            int v2_2 = p10.b;
                            int v3_10 = p10.a;
                            if (!v3_10.contains(p7)) {
                                v3_10.add(p7);
                                if ((p7 instanceof w.h)) {
                                    if (((w.h) p7).u0 == 0) {
                                        v1 = 1;
                                    }
                                    ((w.h) p7).t0.c(v1, p9, p10);
                                }
                                if (p8 != 0) {
                                    p7.o0 = v2_2;
                                    p7.J.c(p8, p9, p10);
                                    p7.M.c(p8, p9, p10);
                                    p7.L.c(p8, p9, p10);
                                } else {
                                    p7.n0 = v2_2;
                                    p7.I.c(p8, p9, p10);
                                    p7.K.c(p8, p9, p10);
                                }
                                p7.P.c(p8, p9, p10);
                                return p10;
                            } else {
                                return p10;
                            }
                        }
                    }
                    if (p8 == 1) {
                        v6 = v5_3.o0;
                        if (v6 != -1) {
                        }
                    }
                    v4_3++;
                }
                v6 = -1;
            }
        }
    }

    public static void c(int p19, w.d p20, z.f p21, boolean p22)
    {
        if (!p20.m) {
            if ((!(p20 instanceof w.e)) && ((p20.z()) && (x.h.a(p20)))) {
                w.e.V(p20, p21, new x.b());
            }
            java.util.Iterator v3_4 = p20.i(2);
            boolean v4_10 = p20.i(4);
            w.d v5_0 = v3_4.d();
            int v6 = v4_10.d();
            boolean v7_17 = v3_4.a;
            if ((v7_17) && (v3_4.c)) {
                java.util.Iterator v3_7 = v7_17.iterator();
                while (v3_7.hasNext()) {
                    int v18_1;
                    boolean v7_1 = ((w.c) v3_7.next());
                    w.c v13_2 = v7_1.d;
                    int v14 = (p19 + 1);
                    boolean v15 = x.h.a(v13_2);
                    int v8_4 = v13_2.I;
                    boolean v11_0 = v13_2.K;
                    if ((!v13_2.z()) || (!v15)) {
                        v18_1 = 1;
                    } else {
                        v18_1 = 1;
                        w.e.V(v13_2, p21, new x.b());
                    }
                    boolean v12_6;
                    if (v7_1 != v8_4) {
                        if (v7_1 == v11_0) {
                            boolean v12_4 = v8_4.f;
                            if ((v12_4) && (v12_4.c)) {
                                v12_6 = v18_1;
                                w.c v9_1 = v13_2.p0[0];
                                if ((v9_1 == 3) && (!v15)) {
                                    if (((v9_1 == 3) && ((v13_2.v >= 0) && ((v13_2.u >= 0) && ((v13_2.g0 == 8) || ((v13_2.r == 0) && (v13_2.W == 0)))))) && ((!v13_2.x()) && ((!v13_2.F) && ((v12_6) && (!v13_2.x()))))) {
                                        x.h.e(v14, p20, p21, v13_2, p22);
                                    }
                                } else {
                                    if (!v13_2.z()) {
                                        if ((v7_1 != v8_4) || (v11_0.f != null)) {
                                            if ((v7_1 != v11_0) || (v8_4.f != null)) {
                                                if ((v12_6) && (!v13_2.x())) {
                                                    x.h.d(v14, v13_2, p21, p22);
                                                }
                                            } else {
                                                boolean v7_14 = (v5_0 - v11_0.e());
                                                v13_2.J((v7_14 - v13_2.q()), v7_14);
                                                x.h.c(v14, v13_2, p21, p22);
                                            }
                                        } else {
                                            boolean v7_16 = (v8_4.e() + v5_0);
                                            v13_2.J(v7_16, (v13_2.q() + v7_16));
                                            x.h.c(v14, v13_2, p21, p22);
                                        }
                                    }
                                }
                            }
                        }
                        v12_6 = 0;
                    } else {
                        boolean v12_2 = v11_0.f;
                        if ((v12_2) && (v12_2.c)) {
                        }
                    }
                }
            }
            if (!(p20 instanceof w.h)) {
                java.util.Iterator v3_9 = v4_10.a;
                if ((v3_9 != null) && (v4_10.c)) {
                    java.util.Iterator v3_10 = v3_9.iterator();
                    while (v3_10.hasNext()) {
                        boolean v4_14 = ((w.c) v3_10.next());
                        w.d v5_1 = v4_14.d;
                        boolean v12_7 = (p19 + 1);
                        boolean v7_19 = x.h.a(v5_1);
                        int v8_10 = v5_1.I;
                        w.c v9_4 = v5_1.K;
                        if ((v5_1.z()) && (v7_19)) {
                            w.e.V(v5_1, p21, new x.b());
                        }
                        boolean v11_8;
                        if (v4_14 != v8_10) {
                            if (v4_14 == v9_4) {
                                boolean v11_6 = v8_10.f;
                                if ((v11_6) && (v11_6.c)) {
                                    v11_8 = 1;
                                    w.c v13_4 = v5_1.p0[0];
                                    if ((v13_4 == 3) && (!v7_19)) {
                                        if (((v13_4 == 3) && ((v5_1.v >= 0) && ((v5_1.u >= 0) && ((v5_1.g0 == 8) || ((v5_1.r == 0) && (v5_1.W == 0)))))) && ((!v5_1.x()) && ((!v5_1.F) && ((v11_8) && (!v5_1.x()))))) {
                                            x.h.e(v12_7, p20, p21, v5_1, p22);
                                        }
                                    } else {
                                        if (!v5_1.z()) {
                                            if ((v4_14 != v8_10) || (v9_4.f != null)) {
                                                if ((v4_14 != v9_4) || (v8_10.f != null)) {
                                                    if ((v11_8) && (!v5_1.x())) {
                                                        x.h.d(v12_7, v5_1, p21, p22);
                                                    }
                                                } else {
                                                    boolean v4_6 = (v6 - v9_4.e());
                                                    v5_1.J((v4_6 - v5_1.q()), v4_6);
                                                    x.h.c(v12_7, v5_1, p21, p22);
                                                }
                                            } else {
                                                boolean v4_8 = (v8_10.e() + v6);
                                                v5_1.J(v4_8, (v5_1.q() + v4_8));
                                                x.h.c(v12_7, v5_1, p21, p22);
                                            }
                                        }
                                    }
                                }
                            }
                            v11_8 = 0;
                        } else {
                            boolean v11_4 = v9_4.f;
                            if ((v11_4) && (v11_4.c)) {
                            }
                        }
                    }
                }
                p20.m = 1;
                return;
            }
        }
        return;
    }

    public static void d(int p6, w.d p7, z.f p8, boolean p9)
    {
        int v0_0 = p7.d0;
        int v1_0 = p7.I;
        int v2_0 = v1_0.f.d();
        int v3_8 = p7.K;
        int v4_0 = v3_8.f.d();
        int v1_2 = (v1_0.e() + v2_0);
        int v3_0 = v3_8.e();
        if (v2_0 != v4_0) {
            v2_0 = v1_2;
            v4_0 -= v3_0;
        } else {
            v0_0 = 1056964608;
        }
        int v1_3 = p7.q();
        int v3_3 = ((v4_0 - v2_0) - v1_3);
        if (v2_0 > v4_0) {
            v3_3 = ((v2_0 - v4_0) - v1_3);
        }
        int v0_1;
        if (v3_3 <= 0) {
            v0_1 = (v0_0 * ((float) v3_3));
        } else {
            v0_1 = ((v0_0 * ((float) v3_3)) + 1056964608);
        }
        int v0_4 = (((int) v0_1) + v2_0);
        int v3_7 = (v0_4 + v1_3);
        if (v2_0 > v4_0) {
            v3_7 = (v0_4 - v1_3);
        }
        p7.J(v0_4, v3_7);
        x.h.c((p6 + 1), p7, p8, p9);
        return;
    }

    public static void e(int p7, w.d p8, z.f p9, w.d p10, boolean p11)
    {
        float v0_0 = p10.d0;
        int v1_0 = p10.I;
        int v1_3 = (v1_0.e() + v1_0.f.d());
        int v2_9 = p10.K;
        int v3_1 = (v2_9.f.d() - v2_9.e());
        if (v3_1 >= v1_3) {
            int v2_1 = p10.q();
            if (p10.g0 != 8) {
                int v4_1 = p10.r;
                if (v4_1 != 2) {
                    if (v4_1 == 0) {
                        v2_1 = (v3_1 - v1_3);
                    }
                } else {
                    float v8_2;
                    if (!(p8 instanceof w.e)) {
                        v8_2 = p8.T.q();
                    } else {
                        v8_2 = p8.q();
                    }
                    v2_1 = ((int) ((p10.d0 * 1056964608) * ((float) v8_2)));
                }
                v2_1 = Math.max(p10.u, v2_1);
                float v8_5 = p10.v;
                if (v8_5 > 0) {
                    v2_1 = Math.min(v8_5, v2_1);
                }
            }
            int v1_1 = (v1_3 + ((int) ((v0_0 * ((float) ((v3_1 - v1_3) - v2_1))) + 1056964608)));
            p10.J(v1_1, (v2_1 + v1_1));
            x.h.c((p7 + 1), p10, p9, p11);
        }
        return;
    }

    public static void f(int p6, w.d p7, z.f p8)
    {
        int v0_0 = p7.e0;
        int v1_0 = p7.J;
        int v2_0 = v1_0.f.d();
        int v3_8 = p7.L;
        int v4_0 = v3_8.f.d();
        int v1_2 = (v1_0.e() + v2_0);
        int v3_0 = v3_8.e();
        if (v2_0 != v4_0) {
            v2_0 = v1_2;
            v4_0 -= v3_0;
        } else {
            v0_0 = 1056964608;
        }
        int v1_3 = p7.k();
        int v3_3 = ((v4_0 - v2_0) - v1_3);
        if (v2_0 > v4_0) {
            v3_3 = ((v2_0 - v4_0) - v1_3);
        }
        int v0_1;
        if (v3_3 <= 0) {
            v0_1 = (v0_0 * ((float) v3_3));
        } else {
            v0_1 = ((v0_0 * ((float) v3_3)) + 1056964608);
        }
        int v0_3 = ((int) v0_1);
        int v3_7 = (v2_0 + v0_3);
        int v5_1 = (v3_7 + v1_3);
        if (v2_0 > v4_0) {
            v3_7 = (v2_0 - v0_3);
            v5_1 = (v3_7 - v1_3);
        }
        p7.K(v3_7, v5_1);
        x.h.i((p6 + 1), p7, p8);
        return;
    }

    public static void g(int p7, w.d p8, z.f p9, w.d p10)
    {
        float v0_0 = p10.e0;
        int v1_0 = p10.J;
        int v1_3 = (v1_0.e() + v1_0.f.d());
        int v2_8 = p10.L;
        int v3_1 = (v2_8.f.d() - v2_8.e());
        if (v3_1 >= v1_3) {
            int v2_1 = p10.k();
            if (p10.g0 != 8) {
                int v4_1 = p10.s;
                if (v4_1 != 2) {
                    if (v4_1 == 0) {
                        v2_1 = (v3_1 - v1_3);
                    }
                } else {
                    float v8_2;
                    if (!(p8 instanceof w.e)) {
                        v8_2 = p8.T.k();
                    } else {
                        v8_2 = p8.k();
                    }
                    v2_1 = ((int) ((v0_0 * 1056964608) * ((float) v8_2)));
                }
                v2_1 = Math.max(p10.x, v2_1);
                float v8_5 = p10.y;
                if (v8_5 > 0) {
                    v2_1 = Math.min(v8_5, v2_1);
                }
            }
            int v1_1 = (v1_3 + ((int) ((v0_0 * ((float) ((v3_1 - v1_3) - v2_1))) + 1056964608)));
            p10.K(v1_1, (v2_1 + v1_1));
            x.h.i((p7 + 1), p10, p9);
        }
        return;
    }

    public static boolean h(int p4, int p5, int p6, int p7)
    {
        if ((p6 != 1) && ((p6 != 2) && ((p6 != 4) || (p4 == 2)))) {
            int v4_1 = 0;
        } else {
            v4_1 = 1;
        }
        if ((p7 != 1) && ((p7 != 2) && ((p7 != 4) || (p5 == 2)))) {
            int v5_1 = 0;
        } else {
            v5_1 = 1;
        }
        if ((v4_1 == 0) && (v5_1 == 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void i(int p19, w.d p20, z.f p21)
    {
        if (!p20.n) {
            if ((!(p20 instanceof w.e)) && ((p20.z()) && (x.h.a(p20)))) {
                w.e.V(p20, p21, new x.b());
            }
            java.util.Iterator v3_0 = p20.i(3);
            boolean v4_18 = p20.i(5);
            int v5_2 = v3_0.d();
            w.d v6_0 = v4_18.d();
            boolean v7_13 = v3_0.a;
            if ((v7_13) && (v3_0.c)) {
                java.util.Iterator v3_2 = v7_13.iterator();
                while (v3_2.hasNext()) {
                    boolean v7_3 = ((w.c) v3_2.next());
                    boolean v12_8 = v7_3.d;
                    int v13_2 = (p19 + 1);
                    boolean v14 = x.h.a(v12_8);
                    w.c v15 = v12_8.J;
                    int v8_7 = v12_8.L;
                    if ((v12_8.z()) && (v14)) {
                        w.e.V(v12_8, p21, new x.b());
                    }
                    w.c v10_8;
                    if (v7_3 != v15) {
                        if (v7_3 == v8_7) {
                            w.c v10_6 = v15.f;
                            if ((v10_6 != null) && (v10_6.c)) {
                                v10_8 = 1;
                                w.c v11_2 = v12_8.p0[1];
                                if ((v11_2 == 3) && (!v14)) {
                                    if (((v11_2 == 3) && ((v12_8.y >= 0) && ((v12_8.x >= 0) && ((v12_8.g0 == 8) || ((v12_8.s == 0) && (v12_8.W == 0)))))) && ((!v12_8.y()) && ((!v12_8.F) && ((v10_8 != null) && (!v12_8.y()))))) {
                                        x.h.g(v13_2, p20, p21, v12_8);
                                    }
                                } else {
                                    if (!v12_8.z()) {
                                        if ((v7_3 != v15) || (v8_7.f != null)) {
                                            if ((v7_3 != v8_7) || (v15.f != null)) {
                                                if ((v10_8 != null) && (!v12_8.y())) {
                                                    x.h.f(v13_2, v12_8, p21);
                                                }
                                            } else {
                                                boolean v7_17 = (v5_2 - v8_7.e());
                                                v12_8.K((v7_17 - v12_8.k()), v7_17);
                                                x.h.i(v13_2, v12_8, p21);
                                            }
                                        } else {
                                            boolean v7_19 = (v15.e() + v5_2);
                                            v12_8.K(v7_19, (v12_8.k() + v7_19));
                                            x.h.i(v13_2, v12_8, p21);
                                        }
                                    }
                                }
                            }
                        }
                        v10_8 = 0;
                    } else {
                        w.c v10_4 = v8_7.f;
                        if ((v10_4 != null) && (v10_4.c)) {
                        }
                    }
                }
            }
            int v18_0 = 1;
            if (!(p20 instanceof w.h)) {
                java.util.Iterator v3_4 = v4_18.a;
                if ((v3_4 != null) && (v4_18.c)) {
                    java.util.Iterator v3_5 = v3_4.iterator();
                    while (v3_5.hasNext()) {
                        boolean v4_1 = ((w.c) v3_5.next());
                        int v5_1 = v4_1.d;
                        boolean v7_1 = (p19 + 1);
                        int v8_0 = x.h.a(v5_1);
                        w.c v10_1 = v5_1.J;
                        w.c v11_0 = v5_1.L;
                        if ((v5_1.z()) && (v8_0 != 0)) {
                            w.e.V(v5_1, p21, new x.b());
                        }
                        boolean v12_7;
                        if (v4_1 != v10_1) {
                            if (v4_1 == v11_0) {
                                boolean v12_5 = v10_1.f;
                                if ((v12_5) && (v12_5.c)) {
                                    v12_7 = 1;
                                    int v13_1 = v5_1.p0[1];
                                    if ((v13_1 == 3) && (v8_0 == 0)) {
                                        if (((v13_1 == 3) && ((v5_1.y >= 0) && ((v5_1.x >= 0) && ((v5_1.g0 == 8) || ((v5_1.s == 0) && (v5_1.W == 0)))))) && ((!v5_1.y()) && ((!v5_1.F) && ((v12_7) && (!v5_1.y()))))) {
                                            x.h.g(v7_1, p20, p21, v5_1);
                                        }
                                    } else {
                                        if (!v5_1.z()) {
                                            if ((v4_1 != v10_1) || (v11_0.f != null)) {
                                                if ((v4_1 != v11_0) || (v10_1.f != null)) {
                                                    if ((v12_7) && (!v5_1.y())) {
                                                        x.h.f(v7_1, v5_1, p21);
                                                    }
                                                } else {
                                                    boolean v4_15 = (v6_0 - v11_0.e());
                                                    v5_1.K((v4_15 - v5_1.k()), v4_15);
                                                    x.h.i(v7_1, v5_1, p21);
                                                }
                                            } else {
                                                boolean v4_17 = (v10_1.e() + v6_0);
                                                v5_1.K(v4_17, (v5_1.k() + v4_17));
                                                x.h.i(v7_1, v5_1, p21);
                                            }
                                        }
                                    }
                                }
                            }
                            v12_7 = 0;
                        } else {
                            boolean v12_3 = v11_0.f;
                            if ((v12_3) && (v12_3.c)) {
                            }
                        }
                    }
                }
                java.util.Iterator v3_7 = p20.i(6);
                if ((v3_7.a != null) && (v3_7.c)) {
                    boolean v4_23 = v3_7.d();
                    java.util.Iterator v3_9 = v3_7.a.iterator();
                    while (v3_9.hasNext()) {
                        int v5_6 = ((w.c) v3_9.next());
                        w.d v6_1 = v5_6.d;
                        w.c v11_5 = (p19 + 1);
                        boolean v7_21 = x.h.a(v6_1);
                        int v8_12 = v6_1.M;
                        if ((v6_1.z()) && (v7_21)) {
                            w.e.V(v6_1, p21, new x.b());
                        }
                        if ((v6_1.p0[v18_0] == 3) && (!v7_21)) {
                            int v5_0 = v18_0;
                        } else {
                            if (!v6_1.z()) {
                                if (v5_6 != v8_12) {
                                } else {
                                    int v5_8 = (v5_6.e() + v4_23);
                                    if (v6_1.E) {
                                        boolean v7_25 = (v5_8 - v6_1.a0);
                                        int v9_7 = (v6_1.V + v7_25);
                                        v6_1.Z = v7_25;
                                        v6_1.J.l(v7_25);
                                        v6_1.L.l(v9_7);
                                        v8_12.l(v5_8);
                                        v5_0 = v18_0;
                                        v6_1.l = v5_0;
                                    } else {
                                        v5_0 = v18_0;
                                    }
                                    x.h.i(v11_5, v6_1, p21);
                                }
                            }
                        }
                        v18_0 = v5_0;
                    }
                }
                p20.n = v18_0;
                return;
            }
        }
        return;
    }
}
