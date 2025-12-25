package x;
public final class k extends x.o {
    public static final int[] k;

    static k()
    {
        int[] v0_1 = new int[2];
        x.k.k = v0_1;
        return;
    }

    public static void m(int[] p2, int p3, int p4, int p5, int p6, float p7, int p8)
    {
        int v4_1 = (p4 - p3);
        int v6_1 = (p6 - p5);
        if (p8 == -1) {
            int v3_1 = ((int) ((((float) v6_1) * p7) + 1056964608));
            int v7_1 = ((int) ((((float) v4_1) / p7) + 1056964608));
            if (v3_1 > v4_1) {
                if (v7_1 <= v6_1) {
                    p2[0] = v4_1;
                    p2[1] = v7_1;
                }
            } else {
                p2[0] = v3_1;
                p2[1] = v6_1;
                return;
            }
        } else {
            if (p8 == 0) {
                p2[0] = ((int) ((((float) v6_1) * p7) + 1056964608));
                p2[1] = v6_1;
                return;
            } else {
                if (p8 == 1) {
                    int v3_10 = ((int) ((((float) v4_1) * p7) + 1056964608));
                    p2[0] = v4_1;
                    p2[1] = v3_10;
                    return;
                }
            }
        }
        return;
    }

    public final void a(x.d p24)
    {
        if (u.e.c(this.j) == 3) {
            x.g v1_7 = this.b;
            this.l(v1_7.I, v1_7.K, 0);
            return;
        } else {
            x.g v1_1 = this.e;
            int v7_0 = this.h;
            x.f v8 = this.i;
            if ((v1_1.j) || (this.d != 3)) {
                p24 = 1056964608;
                int v5_32 = v7_0.l;
                if (v7_0.c) {
                    int v9_26 = v8.l;
                    if ((v8.c) && ((!v7_0.j) || ((!v8.j) || (!v1_1.j)))) {
                        if ((!v1_1.j) && (this.d == 3)) {
                            x.g v4_66 = this.b;
                            if ((v4_66.r == 0) && (!v4_66.x())) {
                                int v2_37 = (((x.f) v5_32.get(0)).g + v7_0.f);
                                float v3_8 = (((x.f) v9_26.get(0)).g + v8.f);
                                x.g v4_81 = (v3_8 - v2_37);
                                v7_0.d(v2_37);
                                v8.d(v3_8);
                                v1_1.d(v4_81);
                                return;
                            }
                        }
                        if ((!v1_1.j) && ((this.d == 3) && ((this.a == 1) && ((v5_32.size() > 0) && (v9_26.size() > 0))))) {
                            x.g v4_76 = this.b;
                            int v6_3 = v4_76.v;
                            int v2_23 = Math.max(v4_76.u, Math.min(((((x.f) v9_26.get(0)).g + v8.f) - (((x.f) v5_32.get(0)).g + v7_0.f)), v1_1.m));
                            if (v6_3 > 0) {
                                v2_23 = Math.min(v6_3, v2_23);
                            }
                            v1_1.d(v2_23);
                        }
                        if (v1_1.j) {
                            int v2_27 = ((x.f) v5_32.get(0));
                            float v3_1 = ((x.f) v9_26.get(0));
                            x.g v4_78 = v2_27.g;
                            int v6_4 = v3_1.g;
                            int v10_10 = this.b.d0;
                            if (v2_27 != v3_1) {
                                v4_78 = (v7_0.f + v4_78);
                                v6_4 = (v8.f + v6_4);
                            } else {
                                v10_10 = p24;
                            }
                            v7_0.d(((int) ((((float) ((v6_4 - v4_78) - v1_1.g)) * v10_10) + (((float) v4_78) + p24))));
                            v8.d((v7_0.g + v1_1.g));
                        }
                    }
                }
            } else {
                x.g v4_13 = this.b;
                int v9_24 = v4_13.r;
                if (v9_24 == 2) {
                    p24 = 1056964608;
                    int v5_21 = v4_13.T;
                    if (v5_21 == 0) {
                    } else {
                        int v5_26 = v5_21.d.e;
                        if (!v5_26.j) {
                        } else {
                            v1_1.d(((int) ((((float) v5_26.g) * v4_13.w) + 1056964608)));
                        }
                    }
                } else {
                    if (v9_24 == 3) {
                        int v9_27 = v4_13.s;
                        if ((v9_27 != 0) && (v9_27 != 3)) {
                            int v9_34;
                            x.g v4_84;
                            x.g v4_82;
                            int v9_39;
                            int v9_30 = v4_13.X;
                            if (v9_30 == -1) {
                                v9_34 = ((float) v4_13.e.e.g);
                                v4_82 = v4_13.W;
                                v9_39 = (v9_34 * v4_82);
                                v4_84 = ((int) (v9_39 + 1056964608));
                            } else {
                                if (v9_30 == 0) {
                                    v9_39 = (((float) v4_13.e.e.g) / v4_13.W);
                                } else {
                                    if (v9_30 == 1) {
                                        v9_34 = ((float) v4_13.e.e.g);
                                        v4_82 = v4_13.W;
                                    } else {
                                        v4_84 = 0;
                                    }
                                }
                            }
                            v1_1.d(v4_84);
                        } else {
                            int v12_11;
                            int v9_44 = v4_13.e;
                            int v11_16 = v9_44.h;
                            int v9_45 = v9_44.i;
                            if (v4_13.I.f == null) {
                                v12_11 = 0;
                            } else {
                                v12_11 = 1;
                            }
                            int v13_2;
                            if (v4_13.J.f == null) {
                                v13_2 = 0;
                            } else {
                                v13_2 = 1;
                            }
                            int v14_2;
                            if (v4_13.K.f == null) {
                                v14_2 = 0;
                            } else {
                                v14_2 = 1;
                            }
                            float v15_2;
                            if (v4_13.L.f == null) {
                                v15_2 = 0;
                            } else {
                                v15_2 = 1;
                            }
                            p24 = 1056964608;
                            int v5_37 = v4_13.X;
                            if ((v12_11 == 0) || ((v13_2 == 0) || ((v14_2 == 0) || (v15_2 == 0)))) {
                                if ((v12_11 == 0) || (v14_2 == 0)) {
                                    if ((v13_2 == 0) || (v15_2 == 0)) {
                                    } else {
                                        if ((v11_16.c) && (v9_45.c)) {
                                            x.g v4_0 = v4_13.W;
                                            int v12_6 = (((x.f) v11_16.l.get(0)).g + v11_16.f);
                                            int v11_5 = (((x.f) v9_45.l.get(0)).g - v9_45.f);
                                            if (v5_37 != -1) {
                                                if (v5_37 == 0) {
                                                    int v5_0 = this.g((v11_5 - v12_6), 1);
                                                    int v9_4 = ((int) ((((float) v5_0) * v4_0) + 1056964608));
                                                    int v10_0 = this.g(v9_4, 0);
                                                    if (v9_4 != v10_0) {
                                                        v5_0 = ((int) ((((float) v10_0) / v4_0) + 1056964608));
                                                    }
                                                    v1_1.d(v10_0);
                                                    this.b.e.e.d(v5_0);
                                                } else {
                                                    if (v5_37 != 1) {
                                                    }
                                                }
                                            }
                                            int v5_5 = this.g((v11_5 - v12_6), 1);
                                            int v9_8 = ((int) ((((float) v5_5) / v4_0) + 1056964608));
                                            int v10_1 = this.g(v9_8, 0);
                                            if (v9_8 != v10_1) {
                                                v5_5 = ((int) ((((float) v10_1) * v4_0) + 1056964608));
                                            }
                                            v1_1.d(v10_1);
                                            this.b.e.e.d(v5_5);
                                        }
                                    }
                                } else {
                                    if ((v7_0.c) && (v8.c)) {
                                        x.g v4_8 = v4_13.W;
                                        int v9_15 = (((x.f) v7_0.l.get(0)).g + v7_0.f);
                                        int v11_13 = (((x.f) v8.l.get(0)).g - v8.f);
                                        if ((v5_37 == -1) || (v5_37 == 0)) {
                                            int v5_9 = this.g((v11_13 - v9_15), 0);
                                            int v9_19 = ((int) ((((float) v5_9) * v4_8) + 1056964608));
                                            int v10_2 = this.g(v9_19, 1);
                                            if (v9_19 != v10_2) {
                                                v5_9 = ((int) ((((float) v10_2) / v4_8) + 1056964608));
                                            }
                                            v1_1.d(v5_9);
                                            this.b.e.e.d(v10_2);
                                        } else {
                                            if (v5_37 == 1) {
                                                int v5_13 = this.g((v11_13 - v9_15), 0);
                                                int v9_23 = ((int) ((((float) v5_13) / v4_8) + 1056964608));
                                                int v10_3 = this.g(v9_23, 1);
                                                if (v9_23 != v10_3) {
                                                    v5_13 = ((int) ((((float) v10_3) * v4_8) + 1056964608));
                                                }
                                                v1_1.d(v5_13);
                                                this.b.e.e.d(v10_3);
                                            }
                                        }
                                    }
                                }
                            } else {
                                x.g v4_17 = v4_13.W;
                                int v12_8 = v11_16.l;
                                int[] v16 = x.k.k;
                                if ((!v11_16.j) || (!v9_45.j)) {
                                    x.g v21_0 = v4_17;
                                    int v22_0 = v5_37;
                                    if ((v7_0.j) && (v8.j)) {
                                        if ((v11_16.c) && (v9_45.c)) {
                                            x.k.m(v16, (v7_0.g + v7_0.f), (v8.g - v8.f), (((x.f) v12_8.get(0)).g + v11_16.f), (((x.f) v9_45.l.get(0)).g - v9_45.f), v21_0, v22_0);
                                            v1_1.d(v16[0]);
                                            this.b.e.e.d(v16[1]);
                                        } else {
                                            return;
                                        }
                                    }
                                    if ((v7_0.c) && ((v8.c) && ((v11_16.c) && (v9_45.c)))) {
                                        x.k.m(v16, (((x.f) v7_0.l.get(0)).g + v7_0.f), (((x.f) v8.l.get(0)).g - v8.f), (((x.f) v12_8.get(0)).g + v11_16.f), (((x.f) v9_45.l.get(0)).g - v9_45.f), v21_0, v22_0);
                                        v1_1.d(v16[0]);
                                        this.b.e.e.d(v16[1]);
                                    }
                                } else {
                                    if ((v7_0.c) && (v8.c)) {
                                        x.k.m(v16, (((x.f) v7_0.l.get(0)).g + v7_0.f), (((x.f) v8.l.get(0)).g - v8.f), (v11_16.g + v11_16.f), (v9_45.g - v9_45.f), v4_17, v5_37);
                                        v1_1.d(v16[0]);
                                        this.b.e.e.d(v16[1]);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    public final void d()
    {
        int v0_0 = this.b;
        x.g v2 = this.e;
        if (v0_0.a) {
            v2.d(v0_0.q());
        }
        x.f v1_63 = v2.k;
        w.c v3_11 = v2.l;
        x.f v8 = this.i;
        x.f v9 = this.h;
        if (v2.j) {
            if (this.d == 4) {
                int v0_41 = this.b;
                x.f v10_3 = v0_41.T;
                if (v10_3 != null) {
                    int v11_1 = v10_3.p0[0];
                    if ((v11_1 == 1) || (v11_1 == 4)) {
                        x.o.b(v9, v10_3.d.h, v0_41.I.e());
                        x.o.b(v8, v10_3.d.i, (- this.b.K.e()));
                        return;
                    }
                }
            }
        } else {
            int v0_93 = this.b;
            x.f v10_5 = v0_93.p0[0];
            this.d = v10_5;
            if (v10_5 != 3) {
                if (v10_5 == 4) {
                    int v11_2 = v0_93.T;
                    if (v11_2 != 0) {
                        int v12_1 = v11_2.p0[0];
                        if ((v12_1 == 1) || (v12_1 == 4)) {
                            int v0_92 = ((v11_2.q() - this.b.I.e()) - this.b.K.e());
                            x.o.b(v9, v11_2.d.h, this.b.I.e());
                            x.o.b(v8, v11_2.d.i, (- this.b.K.e()));
                            v2.d(v0_92);
                            return;
                        }
                    }
                }
                if (v10_5 == 1) {
                    v2.d(v0_93.q());
                }
            }
        }
        if (!v2.j) {
            if (this.d == 3) {
                int v0_99 = this.b;
                x.f v10_7 = v0_99.r;
                if (v10_7 == 2) {
                    int v0_100 = v0_99.T;
                    if (v0_100 != 0) {
                        int v0_103 = v0_100.e.e;
                        v3_11.add(v0_103);
                        v0_103.k.add(v2);
                        v2.b = 1;
                        v1_63.add(v9);
                        v1_63.add(v8);
                    }
                } else {
                    if (v10_7 == 3) {
                        if (v0_99.s != 3) {
                            int v0_106 = v0_99.e.e;
                            v3_11.add(v0_106);
                            v0_106.k.add(v2);
                            this.b.e.h.k.add(v2);
                            this.b.e.i.k.add(v2);
                            v2.b = 1;
                            v1_63.add(v9);
                            v1_63.add(v8);
                            v9.l.add(v2);
                            v8.l.add(v2);
                        } else {
                            v9.a = this;
                            v8.a = this;
                            x.f v4_1 = v0_99.e;
                            v4_1.h.a = this;
                            v4_1.i.a = this;
                            v2.a = this;
                            if (!v0_99.y()) {
                                if (!this.b.x()) {
                                    this.b.e.e.l.add(v2);
                                } else {
                                    this.b.e.e.l.add(v2);
                                    v1_63.add(this.b.e.e);
                                }
                            } else {
                                v3_11.add(this.b.e.e);
                                this.b.e.e.k.add(v2);
                                int v0_24 = this.b.e;
                                v0_24.e.a = this;
                                v3_11.add(v0_24.h);
                                v3_11.add(this.b.e.i);
                                this.b.e.h.k.add(v2);
                                this.b.e.i.k.add(v2);
                            }
                        }
                    }
                }
            }
            int v0_37 = this.b;
            x.f v1_2 = v0_37.Q;
            w.c v3_0 = v1_2[0];
            x.f v4_3 = v3_0.f;
            if ((v4_3 == null) || (v1_2[1].f == null)) {
                if (v4_3 == null) {
                    x.f v1_3 = v1_2[1];
                    if (v1_3.f == null) {
                        if (!(v0_37 instanceof w.i)) {
                            x.f v1_5 = v0_37.T;
                            if (v1_5 != null) {
                                x.o.b(v9, v1_5.d.h, v0_37.r());
                                this.c(v8, v9, 1, v2);
                            }
                        }
                    } else {
                        int v0_40 = x.o.h(v1_3);
                        if (v0_40 != 0) {
                            x.o.b(v8, v0_40, (- this.b.Q[1].e()));
                            this.c(v9, v8, -1, v2);
                            return;
                        }
                    }
                } else {
                    int v0_43 = x.o.h(v3_0);
                    if (v0_43 != 0) {
                        x.o.b(v9, v0_43, this.b.Q[0].e());
                        this.c(v8, v9, 1, v2);
                        return;
                    }
                }
            } else {
                if (!v0_37.x()) {
                    int v0_48 = x.o.h(this.b.Q[0]);
                    x.f v1_20 = x.o.h(this.b.Q[1]);
                    if (v0_48 != 0) {
                        v0_48.b(this);
                    }
                    if (v1_20 != null) {
                        v1_20.b(this);
                    }
                    this.j = 4;
                    return;
                } else {
                    v9.f = this.b.Q[0].e();
                    v8.f = (- this.b.Q[1].e());
                    return;
                }
            }
        } else {
            int v0_97 = this.b;
            if (!v0_97.a) {
            } else {
                x.f v1_21 = v0_97.Q;
                w.c v3_2 = v1_21[0];
                x.f v4_4 = v3_2.f;
                if ((v4_4 == null) || (v1_21[1].f == null)) {
                    if (v4_4 == null) {
                        x.f v1_22 = v1_21[1];
                        if (v1_22.f == null) {
                            if ((!(v0_97 instanceof w.i)) && ((v0_97.T != null) && (v0_97.i(7).f == null))) {
                                int v0_60 = this.b;
                                x.o.b(v9, v0_60.T.d.h, v0_60.r());
                                x.o.b(v8, v9, v2.g);
                                return;
                            }
                        } else {
                            int v0_63 = x.o.h(v1_22);
                            if (v0_63 != 0) {
                                x.o.b(v8, v0_63, (- this.b.Q[1].e()));
                                x.o.b(v9, v8, (- v2.g));
                                return;
                            }
                        }
                    } else {
                        int v0_67 = x.o.h(v3_2);
                        if (v0_67 != 0) {
                            x.o.b(v9, v0_67, this.b.Q[0].e());
                            x.o.b(v8, v9, v2.g);
                            return;
                        }
                    }
                } else {
                    if (!v0_97.x()) {
                        int v0_74 = x.o.h(this.b.Q[0]);
                        if (v0_74 != 0) {
                            x.o.b(v9, v0_74, this.b.Q[0].e());
                        }
                        int v0_78 = x.o.h(this.b.Q[1]);
                        if (v0_78 != 0) {
                            x.o.b(v8, v0_78, (- this.b.Q[1].e()));
                        }
                        v9.b = 1;
                        v8.b = 1;
                        return;
                    } else {
                        v9.f = this.b.Q[0].e();
                        v8.f = (- this.b.Q[1].e());
                        return;
                    }
                }
            }
        }
        return;
    }

    public final void e()
    {
        int v0_0 = this.h;
        if (v0_0.j) {
            this.b.Y = v0_0.g;
        }
        return;
    }

    public final void f()
    {
        this.c = 0;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = 0;
        return;
    }

    public final boolean k()
    {
        if ((this.d == 3) && (this.b.r != 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void n()
    {
        this.g = 0;
        x.g v1_0 = this.h;
        v1_0.c();
        v1_0.j = 0;
        x.g v1_1 = this.i;
        v1_1.c();
        v1_1.j = 0;
        this.e.j = 0;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("HorizontalRun ");
        v0_1.append(this.b.h0);
        return v0_1.toString();
    }
}
