package x;
public final class e {
    public w.e a;
    public boolean b;
    public boolean c;
    public w.e d;
    public java.util.ArrayList e;
    public z.f f;
    public x.b g;
    public java.util.ArrayList h;

    public final void a(x.f p10, int p11, java.util.ArrayList p12, x.l p13)
    {
        java.util.ArrayList v10_1 = p10.d;
        x.f v1_0 = v10_1.i;
        int v2_0 = v10_1.h;
        if (v10_1.c == null) {
            int v0_8 = this.a;
            if ((v10_1 != v0_8.d) && (v10_1 != v0_8.e)) {
                if (p13 == null) {
                    p13 = new x.l();
                    p13.a = 0;
                    p13.b = new java.util.ArrayList();
                    p13.a = v10_1;
                    p12.add(p13);
                }
                v10_1.c = p13;
                p13.b.add(v10_1);
                int v0_5 = v2_0.k;
                int v3_0 = v0_5.size();
                int v4 = 0;
                x.f v5_0 = 0;
                while (v5_0 < v3_0) {
                    int v6_7 = v0_5.get(v5_0);
                    v5_0++;
                    int v6_8 = ((x.d) v6_7);
                    if ((v6_8 instanceof x.f)) {
                        this.a(((x.f) v6_8), p11, p12, p13);
                    }
                }
                int v0_6 = v1_0.k;
                int v3_1 = v0_6.size();
                x.f v5_1 = 0;
                while (v5_1 < v3_1) {
                    int v6_4 = v0_6.get(v5_1);
                    v5_1++;
                    int v6_5 = ((x.d) v6_4);
                    if ((v6_5 instanceof x.f)) {
                        this.a(((x.f) v6_5), p11, p12, p13);
                    }
                }
                if ((p11 == 1) && ((v10_1 instanceof x.m))) {
                    int v3_6 = ((x.m) v10_1).k.k;
                    x.f v5_2 = v3_6.size();
                    int v6_1 = 0;
                    while (v6_1 < v5_2) {
                        x.f v7_1 = v3_6.get(v6_1);
                        v6_1++;
                        x.f v7_2 = ((x.d) v7_1);
                        if ((v7_2 instanceof x.f)) {
                            this.a(((x.f) v7_2), p11, p12, p13);
                        }
                    }
                }
                int v2_1 = v2_0.l;
                int v3_7 = v2_1.size();
                x.f v5_3 = 0;
                while (v5_3 < v3_7) {
                    int v6_2 = v2_1.get(v5_3);
                    v5_3++;
                    this.a(((x.f) v6_2), p11, p12, p13);
                }
                x.f v1_1 = v1_0.l;
                int v2_2 = v1_1.size();
                int v3_8 = 0;
                while (v3_8 < v2_2) {
                    x.f v5_4 = v1_1.get(v3_8);
                    v3_8++;
                    this.a(((x.f) v5_4), p11, p12, p13);
                }
                if ((p11 == 1) && ((v10_1 instanceof x.m))) {
                    java.util.ArrayList v10_4 = ((x.m) v10_1).k.l;
                    int v0_10 = v10_4.size();
                    while (v4 < v0_10) {
                        x.f v1_2 = v10_4.get(v4);
                        v4++;
                        this.a(((x.f) v1_2), p11, p12, p13);
                    }
                }
            }
        }
        return;
    }

    public final void b(w.e p25)
    {
        int v1_0 = p25.q0;
        int[] v2 = p25.p0;
        int v3 = v1_0.size();
        float v4_10 = 0;
        int v5 = 0;
        while (v5 < v3) {
            int v6_0 = v1_0.get(v5);
            v5++;
            w.d v12_1 = ((w.d) v6_0);
            int v6_2 = v12_1.p0;
            x.e v7_2 = v12_1.Q;
            w.c v8_2 = v12_1.L;
            int v9_5 = v12_1.J;
            w.c v10_4 = v12_1.K;
            int v11_2 = v12_1.I;
            int v13 = v6_2[v4_10];
            int v6_9 = v6_2[1];
            int v16 = v4_10;
            if (v12_1.g0 != 8) {
                float v4_3 = v12_1.w;
                if ((v4_3 < 1065353216) && (v13 == 3)) {
                    v12_1.r = 2;
                }
                float v14_6 = v12_1.z;
                if ((v14_6 < 1065353216) && (v6_9 == 3)) {
                    v12_1.s = 2;
                }
                x.g v0_78;
                if (v12_1.W <= 0) {
                    v0_78 = 3;
                } else {
                    int v15_11;
                    if (v13 != 3) {
                        v0_78 = 3;
                        v15_11 = 2;
                    } else {
                        v15_11 = 2;
                        if ((v6_9 != 2) && (v6_9 != 1)) {
                            v0_78 = 3;
                        } else {
                            v0_78 = 3;
                            v12_1.r = 3;
                            if ((v13 == v0_78) && ((v12_1.r == 1) && ((v11_2.f == null) || (v10_4.f == null)))) {
                                v13 = 2;
                            }
                            if ((v6_9 == 3) && ((v12_1.s == 1) && ((v9_5.f == null) || (v8_2.f == null)))) {
                                v6_9 = 2;
                            }
                            x.g v0_2;
                            x.g v0_85 = v12_1.d;
                            v0_85.d = v13;
                            int v15_18 = v12_1.r;
                            v0_85.a = v15_18;
                            x.g v0_86 = v12_1.e;
                            v0_86.d = v6_9;
                            java.util.ArrayList v22 = v1_0;
                            int v1_29 = v12_1.s;
                            v0_86.a = v1_29;
                            if ((v13 == 4) || (v13 == 1)) {
                                x.e v7_0;
                                x.g v0_5;
                                int v21_0;
                                if (v6_9 == 4) {
                                    v7_0 = v6_9;
                                    v0_5 = v13;
                                    v21_0 = 1;
                                } else {
                                    if (v6_9 == 1) {
                                        v21_0 = 1;
                                        v7_0 = v6_9;
                                        v0_5 = v13;
                                    } else {
                                        v0_2 = 2;
                                        if (v6_9 != 2) {
                                            int v6_1;
                                            w.c v10_0;
                                            w.c v8_1;
                                            x.g v0_6;
                                            if (v13 != 3) {
                                                v8_1 = v0_2;
                                                v10_0 = v6_9;
                                                v6_1 = 1;
                                                v0_6 = 3;
                                            } else {
                                                if ((v6_9 != v0_2) && (v6_9 != 1)) {
                                                    v8_1 = v0_2;
                                                    v0_6 = 3;
                                                    v10_0 = v6_9;
                                                    v6_1 = 1;
                                                } else {
                                                    if (v15_18 != 3) {
                                                        v8_1 = v0_2;
                                                        if (v15_18 != 1) {
                                                            if (v15_18 != 2) {
                                                                v10_0 = v6_9;
                                                                v6_1 = 1;
                                                                if ((v7_2[v16].f != null) && (v7_2[1].f != null)) {
                                                                } else {
                                                                    this.f(v8_1, 0, v10_0, 0, v12_1);
                                                                    v12_1.d.e.d(v12_1.q());
                                                                    v12_1.e.e.d(v12_1.k());
                                                                    v12_1.a = 1;
                                                                    v4_10 = v16;
                                                                    v1_0 = v22;
                                                                }
                                                            } else {
                                                                x.g v0_16 = v2[v16];
                                                                if ((v0_16 != 1) && (v0_16 != 4)) {
                                                                    v10_0 = v6_9;
                                                                    v6_1 = 1;
                                                                } else {
                                                                    this.f(1, ((int) ((v4_3 * ((float) p25.q())) + 1056964608)), v6_9, v12_1.k(), v12_1);
                                                                    v12_1.d.e.d(v12_1.q());
                                                                    v12_1.e.e.d(v12_1.k());
                                                                    v12_1.a = 1;
                                                                }
                                                            }
                                                        } else {
                                                            this.f(v8_1, 0, v6_9, 0, v12_1);
                                                            v12_1.d.e.m = v12_1.q();
                                                        }
                                                    } else {
                                                        if (v6_9 == v0_2) {
                                                            this.f(v0_2, 0, v0_2, 0, v12_1);
                                                        }
                                                        int v11_13 = v12_1.k();
                                                        this.f(1, ((int) ((((float) v11_13) * v12_1.W) + 1056964608)), 1, v11_13, v12_1);
                                                        v12_1.d.e.d(v12_1.q());
                                                        v12_1.e.e.d(v12_1.k());
                                                        v12_1.a = 1;
                                                    }
                                                }
                                            }
                                            x.e v7_3;
                                            int v6_7;
                                            int v9_6;
                                            w.c v8_3;
                                            x.g v0_18;
                                            w.c v10_3;
                                            if (v10_0 != v0_6) {
                                                v7_3 = v10_0;
                                                v0_18 = v13;
                                                v10_3 = v8_1;
                                                v8_3 = v6_1;
                                                v6_7 = 1;
                                                v9_6 = 3;
                                            } else {
                                                if ((v13 != v8_1) && (v13 != v6_1)) {
                                                    v9_6 = v0_6;
                                                    v7_3 = v10_0;
                                                    v0_18 = v13;
                                                    v10_3 = v8_1;
                                                } else {
                                                    if (v1_29 != v0_6) {
                                                        if (v1_29 != 1) {
                                                            int v11_1 = v8_1;
                                                            w.c v8_4 = v13;
                                                            if (v1_29 != 2) {
                                                                v0_18 = v8_4;
                                                                v8_3 = v6_1;
                                                                if ((v7_2[2].f != null) && (v7_2[3].f != null)) {
                                                                    v7_3 = v10_0;
                                                                    v10_3 = v11_1;
                                                                } else {
                                                                    this.f(v11_1, 0, v10_0, 0, v12_1);
                                                                    v12_1.d.e.d(v12_1.q());
                                                                    v12_1.e.e.d(v12_1.k());
                                                                    v12_1.a = 1;
                                                                }
                                                            } else {
                                                                x.e v7_5 = v2[1];
                                                                if ((v7_5 != v6_1) && (v7_5 != 4)) {
                                                                    v0_18 = v8_4;
                                                                    v7_3 = v10_0;
                                                                    v10_3 = v11_1;
                                                                    v9_6 = 3;
                                                                } else {
                                                                    this.f(v8_4, v12_1.q(), v6_1, ((int) ((v14_6 * ((float) p25.k())) + 1056964608)), v12_1);
                                                                    v12_1.d.e.d(v12_1.q());
                                                                    v12_1.e.e.d(v12_1.k());
                                                                    v12_1.a = 1;
                                                                }
                                                            }
                                                        } else {
                                                            this.f(v13, 0, v8_1, 0, v12_1);
                                                            v12_1.e.e.m = v12_1.k();
                                                        }
                                                    } else {
                                                        if (v13 == v8_1) {
                                                            this.f(v8_1, 0, v8_1, 0, v12_1);
                                                        }
                                                        int v9_14 = v12_1.q();
                                                        x.g v0_48 = v12_1.W;
                                                        if (v12_1.X == -1) {
                                                            v0_48 = (1065353216 / v0_48);
                                                        }
                                                        this.f(v6_1, v9_14, v6_1, ((int) ((((float) v9_14) * v0_48) + 1056964608)), v12_1);
                                                        v12_1.d.e.d(v12_1.q());
                                                        v12_1.e.e.d(v12_1.k());
                                                        v12_1.a = 1;
                                                    }
                                                }
                                                v8_3 = v6_1;
                                                v6_7 = 1;
                                            }
                                            if ((v0_18 != v9_6) || (v7_3 != v9_6)) {
                                            } else {
                                                if ((v15_18 != v6_7) && (v1_29 != v6_7)) {
                                                    if ((v1_29 != 2) || ((v15_18 != 2) || ((v2[v16] != v8_3) || (v2[v6_7] != v8_3)))) {
                                                    } else {
                                                        this.f(v8_3, ((int) ((v4_3 * ((float) p25.q())) + 1056964608)), v8_3, ((int) ((v14_6 * ((float) p25.k())) + 1056964608)), v12_1);
                                                        v12_1.d.e.d(v12_1.q());
                                                        v12_1.e.e.d(v12_1.k());
                                                        v12_1.a = 1;
                                                    }
                                                } else {
                                                    this.f(v10_3, 0, v10_3, 0, v12_1);
                                                    v12_1.d.e.m = v12_1.q();
                                                    v12_1.e.e.m = v12_1.k();
                                                }
                                            }
                                        }
                                    }
                                }
                                int v1_24 = v12_1.q();
                                if (v0_5 == 4) {
                                    v1_24 = ((p25.q() - v11_2.g) - v10_4.g);
                                    v0_5 = v21_0;
                                }
                                x.e v7_16;
                                int v11_14;
                                int v9_19;
                                w.c v10_14;
                                w.c v8_12;
                                int v6_10 = v12_1.k();
                                if (v7_0 != 4) {
                                    v10_14 = v7_0;
                                    v8_12 = v0_5;
                                    v9_19 = v1_24;
                                    v11_14 = v6_10;
                                    v7_16 = this;
                                } else {
                                    v10_14 = v21_0;
                                    v7_16 = this;
                                    v8_12 = v0_5;
                                    v9_19 = v1_24;
                                    v11_14 = ((p25.k() - v9_5.g) - v8_2.g);
                                }
                                v7_16.f(v8_12, v9_19, v10_14, v11_14, v12_1);
                                v12_1.d.e.d(v12_1.q());
                                v12_1.e.e.d(v12_1.k());
                                v12_1.a = 1;
                            } else {
                                v0_2 = 2;
                                if (v13 != 2) {
                                }
                            }
                        }
                    }
                    if ((v6_9 != v0_78) || ((v13 != v15_11) && (v13 != 1))) {
                        if ((v13 == v0_78) && (v6_9 == v0_78)) {
                            if (v12_1.r == 0) {
                                v12_1.r = v0_78;
                            }
                            if (v12_1.s == 0) {
                                v12_1.s = v0_78;
                            }
                        }
                    } else {
                        v12_1.s = v0_78;
                    }
                }
            } else {
                v12_1.a = 1;
                v4_10 = v16;
            }
        }
        return;
    }

    public final void c()
    {
        x.m v0_0 = this.a;
        java.util.ArrayList v1 = this.h;
        x.k v2_0 = this.e;
        v2_0.clear();
        w.e v3 = this.d;
        v3.d.f();
        v3.e.f();
        v2_0.add(v3.d);
        v2_0.add(v3.e);
        int v4_1 = v3.q0;
        int v5_0 = v4_1.size();
        java.util.HashSet v6_0 = 0;
        w.d v8_0 = 0;
        while (v8_0 < v5_0) {
            int v10_0 = v4_1.get(v8_0);
            v8_0++;
            int v10_1 = ((w.d) v10_0);
            if (!(v10_1 instanceof w.h)) {
                if (!v10_1.x()) {
                    v2_0.add(v10_1.d);
                } else {
                    if (v10_1.b == null) {
                        v10_1.b = new x.c(v10_1, 0);
                    }
                    if (v6_0 == null) {
                        v6_0 = new java.util.HashSet();
                    }
                    v6_0.add(v10_1.b);
                }
                if (!v10_1.y()) {
                    v2_0.add(v10_1.e);
                } else {
                    if (v10_1.c == null) {
                        v10_1.c = new x.c(v10_1, 1);
                    }
                    if (v6_0 == null) {
                        v6_0 = new java.util.HashSet();
                    }
                    v6_0.add(v10_1.c);
                }
                if ((v10_1 instanceof w.i)) {
                    v2_0.add(new x.j(v10_1));
                }
            } else {
                x.j v9_7 = new x.i(v10_1);
                v10_1.d.f();
                v10_1.e.f();
                v9_7.f = ((w.h) v10_1).u0;
                v2_0.add(v9_7);
            }
        }
        if (v6_0 != null) {
            v2_0.addAll(v6_0);
        }
        int v4_2 = v2_0.size();
        int v5_1 = 0;
        while (v5_1 < v4_2) {
            java.util.HashSet v6_3 = v2_0.get(v5_1);
            v5_1++;
            ((x.o) v6_3).f();
        }
        int v4_3 = v2_0.size();
        int v5_2 = 0;
        while (v5_2 < v4_3) {
            java.util.HashSet v6_1 = v2_0.get(v5_2);
            v5_2++;
            java.util.HashSet v6_2 = ((x.o) v6_1);
            if (v6_2.b != v3) {
                v6_2.d();
            }
        }
        v1.clear();
        this.e(v0_0.d, 0, v1);
        this.e(v0_0.e, 1, v1);
        this.b = 0;
        return;
    }

    public final int d(w.e p20, int p21)
    {
        long v0_0 = p20;
        long v3_4 = this.h;
        int v4_5 = v3_4.size();
        int v5_1 = 0;
        int v7 = 0;
        long v8 = 0;
        while (v7 < v4_5) {
            java.util.ArrayList v17;
            int v18;
            long v0_12;
            long v10_5 = ((x.l) v3_4.get(v7)).a;
            if (!(v10_5 instanceof x.c)) {
                if (p21 != 0) {
                    if ((v10_5 instanceof x.m)) {
                        long v11_6;
                        if (p21 != 0) {
                            v11_6 = v0_0.e;
                        } else {
                            v11_6 = v0_0.d;
                        }
                        boolean v12_0;
                        if (p21 != 0) {
                            v12_0 = v0_0.e;
                        } else {
                            v12_0 = v0_0.d;
                        }
                        boolean v12_1 = v12_0.i;
                        x.f v13 = v10_5.h;
                        x.f v14 = v10_5.i;
                        long v11_8 = v13.l.contains(v11_6.h);
                        boolean v12_2 = v14.l.contains(v12_1);
                        long v15_2 = v10_5.j();
                        if ((v11_8 == 0) || (!v12_2)) {
                            v17 = v3_4;
                            v18 = v4_5;
                            if (v11_8 == 0) {
                                if (!v12_2) {
                                    v0_12 = ((v10_5.j() + ((long) v13.f)) - ((long) v14.f));
                                } else {
                                    v0_12 = Math.max((- x.l.a(v14, ((long) v14.f))), (((long) (- v14.f)) + v15_2));
                                }
                            } else {
                                v0_12 = Math.max(x.l.b(v13, ((long) v13.f)), (((long) v13.f) + v15_2));
                            }
                        } else {
                            long v11_9 = x.l.b(v13, v5_1);
                            long v0_24 = x.l.a(v14, v5_1);
                            long v11_10 = (v11_9 - v15_2);
                            int v5_2 = v14.f;
                            v17 = v3_4;
                            v18 = v4_5;
                            if (v11_10 >= ((long) (- v5_2))) {
                                v11_10 += ((long) v5_2);
                            }
                            long v3_18 = ((long) v13.f);
                            long v0_2 = (((- v0_24) - v15_2) - v3_18);
                            if (v0_2 >= v3_18) {
                                v0_2 -= v3_18;
                            }
                            long v3_1;
                            long v3_0 = v10_5.b;
                            if (p21 != 0) {
                                if (p21 != 1) {
                                    v3_0.getClass();
                                    v3_1 = -1082130432;
                                } else {
                                    v3_1 = v3_0.e0;
                                }
                            } else {
                                v3_1 = v3_0.d0;
                            }
                            long v0_3;
                            if (v3_1 <= 0) {
                                v0_3 = 0;
                            } else {
                                v0_3 = ((long) ((((float) v11_10) / (1065353216 - v3_1)) + (((float) v0_2) / v3_1)));
                            }
                            long v0_6 = ((float) v0_3);
                            v0_12 = ((((long) v13.f) + ((((long) ((v0_6 * v3_1) + 1056964608)) + v15_2) + ((long) g2.g.b(1065353216, v3_1, v0_6, 1056964608)))) - ((long) v14.f));
                        }
                    } else {
                        v17 = v3_4;
                        v18 = v4_5;
                        v0_12 = v5_1;
                    }
                } else {
                    if ((v10_5 instanceof x.k)) {
                    }
                }
            } else {
                if (((x.c) v10_5).f == p21) {
                }
            }
            v8 = Math.max(v8, v0_12);
            v7++;
            v0_0 = p20;
            v3_4 = v17;
            v4_5 = v18;
            v5_1 = 0;
        }
        return ((int) v8);
    }

    public final void e(x.o p9, int p10, java.util.ArrayList p11)
    {
        x.f v1_0 = p9.i;
        int v0_2 = p9.h.k;
        boolean v2_2 = v0_2.size();
        int v3 = 0;
        x.f v4_5 = 0;
        while (v4_5 < v2_2) {
            boolean v6_2 = v0_2.get(v4_5);
            v4_5++;
            boolean v6_3 = ((x.d) v6_2);
            if (!(v6_3 instanceof x.f)) {
                if ((v6_3 instanceof x.o)) {
                    this.a(((x.o) v6_3).h, p10, p11, 0);
                }
            } else {
                this.a(((x.f) v6_3), p10, p11, 0);
            }
        }
        int v0_4 = v1_0.k;
        x.f v1_1 = v0_4.size();
        boolean v2_0 = 0;
        while (v2_0 < v1_1) {
            x.f v4_0 = v0_4.get(v2_0);
            v2_0++;
            x.f v4_1 = ((x.d) v4_0);
            if (!(v4_1 instanceof x.f)) {
                if ((v4_1 instanceof x.o)) {
                    this.a(((x.o) v4_1).i, p10, p11, 0);
                }
            } else {
                this.a(((x.f) v4_1), p10, p11, 0);
            }
        }
        if (p10 == 1) {
            java.util.ArrayList v9_3 = ((x.m) p9).k.k;
            int v0_3 = v9_3.size();
            while (v3 < v0_3) {
                x.f v1_2 = v9_3.get(v3);
                v3++;
                x.f v1_3 = ((x.d) v1_2);
                if ((v1_3 instanceof x.f)) {
                    this.a(((x.f) v1_3), p10, p11, 0);
                }
            }
        }
        return;
    }

    public final void f(int p2, int p3, int p4, int p5, w.d p6)
    {
        x.b v0 = this.g;
        v0.a = p2;
        v0.b = p4;
        v0.c = p3;
        v0.d = p5;
        this.f.b(p6, v0);
        p6.O(v0.e);
        p6.L(v0.f);
        p6.E = v0.h;
        p6.I(v0.g);
        return;
    }

    public final void g()
    {
        x.g v0_0 = this;
        java.util.ArrayList v6 = this.a.q0;
        int v7 = v6.size();
        int v1_8 = 0;
        while (v1_8 < v7) {
            int v9 = (v1_8 + 1);
            w.d v5_1 = ((w.d) v6.get(v1_8));
            if (!v5_1.a) {
                int v1_4;
                int v1_2 = v5_1.p0;
                int v10 = v1_2[0];
                int v12 = v1_2[1];
                if ((v10 != 2) && ((v10 != 3) || (v5_1.r != 1))) {
                    v1_4 = 0;
                } else {
                    v1_4 = 1;
                }
                if ((v12 != 2) && ((v12 != 3) || (v5_1.s != 1))) {
                    int v2_2 = 0;
                } else {
                    v2_2 = 1;
                }
                int v4_1 = v5_1.d.e;
                boolean v14 = v4_1.j;
                x.g v15_1 = v5_1.e.e;
                int v3_1 = v15_1.j;
                if ((!v14) || (v3_1 == 0)) {
                    if ((!v14) || (v2_2 == 0)) {
                        if ((v3_1 != 0) && (v1_4 != 0)) {
                            this.f(2, v4_1.g, 1, v15_1.g, v5_1);
                            if (v10 != 3) {
                                v5_1.d.e.d(v5_1.q());
                                v5_1.a = 1;
                            } else {
                                v5_1.d.e.m = v5_1.q();
                            }
                        }
                    } else {
                        this.f(1, v4_1.g, 2, v15_1.g, v5_1);
                        if (v12 != 3) {
                            v5_1.e.e.d(v5_1.k());
                            v5_1.a = 1;
                        } else {
                            v5_1.e.e.m = v5_1.k();
                        }
                    }
                } else {
                    v0_0.f(1, v4_1.g, 1, v15_1.g, v5_1);
                    v5_1.a = 1;
                }
                if (v5_1.a) {
                    x.g v0_13 = v5_1.e.l;
                    if (v0_13 != null) {
                        v0_13.d(v5_1.a0);
                    }
                }
                v0_0 = this;
            }
            v1_8 = v9;
        }
        return;
    }
}
