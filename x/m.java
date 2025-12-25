package x;
public final class m extends x.o {
    public x.f k;
    public x.a l;

    public final void a(x.d p11)
    {
        if (u.e.c(this.j) == 3) {
            int v11_4 = this.b;
            this.l(v11_4.J, v11_4.L, 1);
            return;
        } else {
            int v11_1 = this.e;
            if ((v11_1.c) && ((!v11_1.j) && (this.d == 3))) {
                int v2_3 = this.b;
                float v5_0 = v2_3.s;
                if (v5_0 == 2) {
                    float v5_1 = v2_3.T;
                    if (v5_1 != 0) {
                        float v5_3 = v5_1.e.e;
                        if (v5_3.j) {
                            v11_1.d(((int) ((((float) v5_3.g) * v2_3.z) + 1056964608)));
                        }
                    }
                } else {
                    if (v5_0 == 3) {
                        float v5_9 = v2_3.d.e;
                        if (v5_9.j) {
                            float v5_14;
                            int v2_8;
                            float v5_11;
                            int v2_6;
                            int v6_5 = v2_3.X;
                            if (v6_5 == -1) {
                                v5_11 = ((float) v5_9.g);
                                v2_6 = v2_3.W;
                                v5_14 = (v5_11 / v2_6);
                                v2_8 = ((int) (v5_14 + 1056964608));
                            } else {
                                if (v6_5 == 0) {
                                    v5_14 = (((float) v5_9.g) * v2_3.W);
                                } else {
                                    if (v6_5 == 1) {
                                        v5_11 = ((float) v5_9.g);
                                        v2_6 = v2_3.W;
                                    } else {
                                        v2_8 = 0;
                                    }
                                }
                            }
                            v11_1.d(v2_8);
                        }
                    }
                }
            }
            int v2_9 = this.h;
            int v6_6 = v2_9.l;
            if (v2_9.c) {
                float v5_18 = this.i;
                int v8_2 = v5_18.l;
                if ((v5_18.c) && ((!v2_9.j) || ((!v5_18.j) || (!v11_1.j)))) {
                    if ((!v11_1.j) && (this.d == 3)) {
                        int v7_12 = this.b;
                        if ((v7_12.r == 0) && (!v7_12.y())) {
                            int v0_18 = (((x.f) v6_6.get(0)).g + v2_9.f);
                            float v1_13 = (((x.f) v8_2.get(0)).g + v5_18.f);
                            int v3_3 = (v1_13 - v0_18);
                            v2_9.d(v0_18);
                            v5_18.d(v1_13);
                            v11_1.d(v3_3);
                            return;
                        }
                    }
                    if ((!v11_1.j) && ((this.d == 3) && ((this.a == 1) && ((v6_6.size() > 0) && (v8_2.size() > 0))))) {
                        float v1_4 = ((((x.f) v8_2.get(0)).g + v5_18.f) - (((x.f) v6_6.get(0)).g + v2_9.f));
                        int v0_3 = v11_1.m;
                        if (v1_4 >= v0_3) {
                            v11_1.d(v0_3);
                        } else {
                            v11_1.d(v1_4);
                        }
                    }
                    if ((v11_1.j) && ((v6_6.size() > 0) && (v8_2.size() > 0))) {
                        int v0_8 = ((x.f) v6_6.get(0));
                        float v1_6 = ((x.f) v8_2.get(0));
                        int v4_0 = v0_8.g;
                        int v7_2 = v1_6.g;
                        int v9_1 = this.b.e0;
                        if (v0_8 != v1_6) {
                            v4_0 = (v2_9.f + v4_0);
                            v7_2 = (v5_18.f + v7_2);
                        } else {
                            v9_1 = 1056964608;
                        }
                        v2_9.d(((int) ((((float) ((v7_2 - v4_0) - v11_1.g)) * v9_1) + (((float) v4_0) + 1056964608))));
                        v5_18.d((v2_9.g + v11_1.g));
                    }
                }
            }
            return;
        }
    }

    public final void d()
    {
        x.g v0_0 = this.k;
        int v1_0 = this.b;
        x.g v3 = this.e;
        if (v1_0.a) {
            v3.d(v1_0.k());
        }
        x.f v2_55 = v3.k;
        w.c v4_0 = v3.l;
        x.f v8 = this.i;
        x.f v9 = this.h;
        if (v3.j) {
            if (this.d == 4) {
                int v1_20 = this.b;
                w.d v10_0 = v1_20.T;
                if ((v10_0 != null) && (v10_0.p0[1] == 1)) {
                    x.o.b(v9, v10_0.e.h, v1_20.J.e());
                    x.o.b(v8, v10_0.e.i, (- this.b.L.e()));
                    return;
                }
            }
        } else {
            int v1_100 = this.b;
            this.d = v1_100.p0[1];
            if (v1_100.E) {
                this.l = new x.a(this);
            }
            int v1_106 = this.d;
            if (v1_106 != 3) {
                if (v1_106 == 4) {
                    w.d v10_4 = this.b.T;
                    if ((v10_4 != null) && (v10_4.p0[1] == 1)) {
                        x.g v0_25 = ((v10_4.k() - this.b.J.e()) - this.b.L.e());
                        x.o.b(v9, v10_4.e.h, this.b.J.e());
                        x.o.b(v8, v10_4.e.i, (- this.b.L.e()));
                        v3.d(v0_25);
                        return;
                    }
                }
                if (v1_106 == 1) {
                    v3.d(this.b.k());
                }
            }
        }
        int v1_110 = v3.j;
        if (v1_110 == 0) {
            if ((v1_110 != 0) || (this.d != 3)) {
                v3.b(this);
            } else {
                int v1_112 = this.b;
                int v12_3 = v1_112.s;
                if (v12_3 == 2) {
                    int v1_113 = v1_112.T;
                    if (v1_113 != 0) {
                        int v1_116 = v1_113.e.e;
                        v4_0.add(v1_116);
                        v1_116.k.add(v3);
                        v3.b = 1;
                        v2_55.add(v9);
                        v2_55.add(v8);
                    }
                } else {
                    if ((v12_3 == 3) && (!v1_112.y())) {
                        int v1_119 = this.b;
                        if (v1_119.r != 3) {
                            int v1_121 = v1_119.d.e;
                            v4_0.add(v1_121);
                            v1_121.k.add(v3);
                            v3.b = 1;
                            v2_55.add(v9);
                            v2_55.add(v8);
                        }
                    }
                }
            }
            int v1_1 = this.b;
            x.f v2_0 = v1_1.Q;
            int v12_0 = v2_0[2];
            int v13_0 = v12_0.f;
            if ((v13_0 == 0) || (v2_0[3].f == null)) {
                if (v13_0 == 0) {
                    w.c v11_0 = v2_0[3];
                    if (v11_0.f == null) {
                        x.f v2_1 = v2_0[4];
                        if (v2_1.f == null) {
                            if (!(v1_1 instanceof w.i)) {
                                x.f v2_3 = v1_1.T;
                                if (v2_3 != null) {
                                    x.o.b(v9, v2_3.e.h, v1_1.s());
                                    this.c(v8, v9, 1, v3);
                                    if (this.b.E) {
                                        this.c(v0_0, v9, 1, this.l);
                                    }
                                    if (this.d == 3) {
                                        x.g v0_2 = this.b;
                                        if (v0_2.W > 0) {
                                            x.g v0_3 = v0_2.d;
                                            if (v0_3.d == 3) {
                                                v0_3.e.k.add(v3);
                                                v4_0.add(this.b.d.e);
                                                v3.a = this;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int v1_9 = x.o.h(v2_1);
                            if (v1_9 != 0) {
                                x.o.b(v0_0, v1_9, 0);
                                this.c(v9, v0_0, -1, this.l);
                                this.c(v8, v9, 1, v3);
                            }
                        }
                    } else {
                        int v1_11 = x.o.h(v11_0);
                        if (v1_11 != 0) {
                            x.o.b(v8, v1_11, (- this.b.Q[3].e()));
                            this.c(v9, v8, -1, v3);
                            if (this.b.E) {
                                this.c(v0_0, v9, 1, this.l);
                            }
                        }
                    }
                } else {
                    int v1_16 = x.o.h(v12_0);
                    if (v1_16 != 0) {
                        x.o.b(v9, v1_16, this.b.Q[2].e());
                        this.c(v8, v9, 1, v3);
                        if (this.b.E) {
                            this.c(v0_0, v9, 1, this.l);
                        }
                        if (this.d == 3) {
                            x.g v0_10 = this.b;
                            if (v0_10.W > 0) {
                                x.g v0_11 = v0_10.d;
                                if (v0_11.d == 3) {
                                    v0_11.e.k.add(v3);
                                    v4_0.add(this.b.d.e);
                                    v3.a = this;
                                }
                            }
                        }
                    }
                }
            } else {
                if (!v1_1.y()) {
                    int v1_28 = x.o.h(this.b.Q[2]);
                    x.f v2_19 = x.o.h(this.b.Q[3]);
                    if (v1_28 != 0) {
                        v1_28.b(this);
                    }
                    if (v2_19 != null) {
                        v2_19.b(this);
                    }
                    this.j = 4;
                } else {
                    v9.f = this.b.Q[2].e();
                    v8.f = (- this.b.Q[3].e());
                }
                if (this.b.E) {
                    this.c(v0_0, v9, 1, this.l);
                }
            }
            if (v4_0.size() == 0) {
                v3.c = 1;
            }
        } else {
            int v12_2 = this.b;
            if (!v12_2.a) {
            } else {
                int v1_41 = v12_2.Q;
                x.f v2_20 = v1_41[2];
                w.c v4_1 = v2_20.f;
                if ((v4_1 == null) || (v1_41[3].f == null)) {
                    if (v4_1 == null) {
                        x.f v2_21 = v1_41[3];
                        if (v2_21.f == null) {
                            int v1_42 = v1_41[4];
                            if (v1_42.f == null) {
                                if ((!(v12_2 instanceof w.i)) && ((v12_2.T != null) && (v12_2.i(7).f == null))) {
                                    int v1_48 = this.b;
                                    x.o.b(v9, v1_48.T.e.h, v1_48.s());
                                    x.o.b(v8, v9, v3.g);
                                    int v1_52 = this.b;
                                    if (v1_52.E) {
                                        x.o.b(v0_0, v9, v1_52.a0);
                                        return;
                                    }
                                }
                            } else {
                                int v1_54 = x.o.h(v1_42);
                                if (v1_54 != 0) {
                                    x.o.b(v0_0, v1_54, 0);
                                    x.o.b(v9, v0_0, (- this.b.a0));
                                    x.o.b(v8, v9, v3.g);
                                    return;
                                }
                            }
                        } else {
                            int v1_59 = x.o.h(v2_21);
                            if (v1_59 != 0) {
                                x.o.b(v8, v1_59, (- this.b.Q[3].e()));
                                x.o.b(v9, v8, (- v3.g));
                            }
                            int v1_62 = this.b;
                            if (v1_62.E) {
                                x.o.b(v0_0, v9, v1_62.a0);
                                return;
                            }
                        }
                    } else {
                        int v1_64 = x.o.h(v2_20);
                        if (v1_64 != 0) {
                            x.o.b(v9, v1_64, this.b.Q[2].e());
                            x.o.b(v8, v9, v3.g);
                            int v1_66 = this.b;
                            if (v1_66.E) {
                                x.o.b(v0_0, v9, v1_66.a0);
                                return;
                            }
                        }
                    }
                } else {
                    if (!v12_2.y()) {
                        int v1_73 = x.o.h(this.b.Q[2]);
                        if (v1_73 != 0) {
                            x.o.b(v9, v1_73, this.b.Q[2].e());
                        }
                        int v1_78 = x.o.h(this.b.Q[3]);
                        if (v1_78 != 0) {
                            x.o.b(v8, v1_78, (- this.b.Q[3].e()));
                        }
                        v9.b = 1;
                        v8.b = 1;
                    } else {
                        v9.f = this.b.Q[2].e();
                        v8.f = (- this.b.Q[3].e());
                    }
                    int v1_90 = this.b;
                    if (v1_90.E) {
                        x.o.b(v0_0, v9, v1_90.a0);
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
            this.b.Z = v0_0.g;
        }
        return;
    }

    public final void f()
    {
        this.c = 0;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = 0;
        return;
    }

    public final boolean k()
    {
        if ((this.d == 3) && (this.b.s != 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void m()
    {
        this.g = 0;
        x.g v1_1 = this.h;
        v1_1.c();
        v1_1.j = 0;
        x.g v1_2 = this.i;
        v1_2.c();
        v1_2.j = 0;
        x.g v1_3 = this.k;
        v1_3.c();
        v1_3.j = 0;
        this.e.j = 0;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("VerticalRun ");
        v0_1.append(this.b.h0);
        return v0_1.toString();
    }
}
