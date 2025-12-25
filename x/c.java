package x;
public final class c extends x.o {
    public final java.util.ArrayList k;
    public int l;

    public c(w.d p6, int p7)
    {
        super(p6);
        w.d v6_2 = new java.util.ArrayList();
        super.k = v6_2;
        super.f = p7;
        int v0_4 = super.b;
        int v7_12 = v0_4.m(p7);
        while(true) {
            w.d v4 = v0_4;
            v0_4 = v7_12;
            int v7_1 = v4;
            if (v0_4 == 0) {
                break;
            }
            v7_12 = v0_4.m(super.f);
        }
        int v0_1;
        super.b = v7_1;
        int v0_0 = super.f;
        if (v0_0 != 0) {
            if (v0_0 != 1) {
                v0_1 = 0;
            } else {
                v0_1 = v7_1.e;
            }
        } else {
            v0_1 = v7_1.d;
        }
        v6_2.add(v0_1);
        int v7_2 = v7_1.l(super.f);
        while (v7_2 != 0) {
            int v0_6;
            int v0_5 = super.f;
            if (v0_5 != 0) {
                if (v0_5 != 1) {
                    v0_6 = 0;
                } else {
                    v0_6 = v7_2.e;
                }
            } else {
                v0_6 = v7_2.d;
            }
            v6_2.add(v0_6);
            v7_2 = v7_2.l(super.f);
        }
        int v7_3 = v6_2.size();
        int v0_3 = 0;
        while (v0_3 < v7_3) {
            w.d v1_1 = v6_2.get(v0_3);
            v0_3++;
            w.d v1_2 = ((x.o) v1_1);
            int v3 = super.f;
            if (v3 != 0) {
                if (v3 == 1) {
                    v1_2.b.c = super;
                }
            } else {
                v1_2.b.b = super;
            }
        }
        if ((super.f == 0) && ((((w.e) super.b.T).v0) && (v6_2.size() > 1))) {
            super.b = ((x.o) v6_2.get((v6_2.size() - 1))).b;
        }
        w.d v6_8;
        if (super.f != 0) {
            v6_8 = super.b.j0;
        } else {
            v6_8 = super.b.i0;
        }
        super.l = v6_8;
        return;
    }

    public final void a(x.d p28)
    {
        int v1_0 = this.h;
        if (v1_0.j) {
            int v2_37 = this.i;
            if (v2_37.j) {
                x.g v3_1;
                x.g v3_35 = this.b.T;
                if (!(v3_35 instanceof w.e)) {
                    v3_1 = 0;
                } else {
                    v3_1 = ((w.e) v3_35).v0;
                }
                x.f v4_6 = (v2_37.g - v1_0.g);
                java.util.ArrayList v6_1 = this.k;
                int v7 = v6_1.size();
                int v8 = 0;
                while(true) {
                    int v9 = -1;
                    x.f v10_2 = 8;
                    if (v8 >= v7) {
                        break;
                    }
                    if (((x.o) v6_1.get(v8)).b.g0 == 8) {
                        v8++;
                    }
                    int v11_4 = (v7 - 1);
                    int v12_4 = v11_4;
                    while (v12_4 >= 0) {
                        if (((x.o) v6_1.get(v12_4)).b.g0 != 8) {
                            v9 = v12_4;
                            break;
                        } else {
                            v12_4--;
                        }
                    }
                    int v12_12 = 0;
                    while (v12_12 < 2) {
                        float v19 = 0;
                        int v5_8 = 0;
                        int v15_0 = 0;
                        int v17_2 = 0;
                        x.o v18_2 = 0;
                        while (v5_8 < v7) {
                            int v24_1;
                            int v13_12 = ((x.o) v6_1.get(v5_8));
                            int v14_6 = v13_12.b;
                            if (v14_6.g0 != v10_2) {
                                v18_2++;
                                if ((v5_8 > 0) && (v5_8 >= v8)) {
                                    v15_0 += v13_12.h.f;
                                }
                                x.f v10_23;
                                x.g v3_22 = v13_12.e;
                                x.g v23_2 = v3_22.g;
                                v24_1 = v12_12;
                                if (v13_12.d == 3) {
                                    v10_23 = 0;
                                } else {
                                    v10_23 = 1;
                                }
                                x.f v10_25;
                                int v25_1;
                                if (v10_23 == null) {
                                    v25_1 = v10_23;
                                    if ((v13_12.a != 1) || (v24_1 != 0)) {
                                        if (!v3_22.j) {
                                            v10_25 = v23_2;
                                            if (v25_1 != 0) {
                                                v15_0 += v10_25;
                                            } else {
                                                v17_2++;
                                                x.g v3_29 = v14_6.k0[this.f];
                                                if (v3_29 >= 0) {
                                                    v19 += v3_29;
                                                }
                                            }
                                            if ((v5_8 < v11_4) && (v5_8 < v9)) {
                                                v15_0 += (- v13_12.i.f);
                                            }
                                            v5_8++;
                                            v12_12 = v24_1;
                                            v10_2 = 8;
                                        } else {
                                            v10_25 = v23_2;
                                        }
                                    } else {
                                        v10_25 = v3_22.m;
                                        v17_2++;
                                    }
                                    v25_1 = 1;
                                } else {
                                    x.g v3_24 = this.f;
                                    if (((v3_24 != null) || (v14_6.d.e.j)) && ((v3_24 != 1) || (v14_6.e.e.j))) {
                                        v25_1 = v10_23;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                v24_1 = v12_12;
                            }
                        }
                        int v22_1 = v3_1;
                        if ((v15_0 >= v4_6) && (v17_2 != 0)) {
                            v12_12++;
                            v3_1 = v22_1;
                            v10_2 = 8;
                        } else {
                            x.g v3_0 = v17_2;
                            int v5_7 = v18_2;
                        }
                        int v1_19 = v1_0.g;
                        if (v22_1 != 0) {
                            v1_19 = v2_37.g;
                        }
                        int v2_38 = 1056964608;
                        if (v15_0 > v4_6) {
                            if (v22_1 == 0) {
                                v1_19 -= ((int) ((((float) (v15_0 - v4_6)) / 1073741824) + 1056964608));
                            } else {
                                v1_19 += ((int) ((((float) (v15_0 - v4_6)) / 1073741824) + 1056964608));
                            }
                        }
                        int v17_3;
                        int v2_0;
                        int v1_3;
                        x.o v18_0;
                        if (v3_0 <= null) {
                            v17_3 = v1_19;
                            v18_0 = 1056964608;
                            v1_3 = 0;
                            v2_0 = 2;
                        } else {
                            x.f v10_20 = ((float) (v4_6 - v15_0));
                            int v12_13 = ((int) ((v10_20 / ((float) v3_0)) + 1056964608));
                            int v13_10 = 0;
                            int v14_5 = 0;
                            while (v13_10 < v7) {
                                int v26;
                                x.o v18_1 = v2_38;
                                int v2_33 = ((x.o) v6_1.get(v13_10));
                                int v17_1 = v1_19;
                                int v1_16 = v2_33.b;
                                x.g v23_1 = v3_0;
                                x.g v3_18 = v2_33.e;
                                int v24_0 = v10_20;
                                int v25_0 = v12_13;
                                if ((v1_16.g0 == 8) || ((v2_33.d != 3) || (v3_18.j))) {
                                    v26 = v13_10;
                                } else {
                                    x.f v10_14;
                                    if (v19 <= 0) {
                                        v10_14 = v25_0;
                                    } else {
                                        v10_14 = ((int) (((v1_16.k0[this.f] * v24_0) / v19) + v18_1));
                                    }
                                    int v12_11;
                                    int v1_17;
                                    if (this.f != 0) {
                                        v12_11 = v1_16.y;
                                        v1_17 = v1_16.x;
                                    } else {
                                        v12_11 = v1_16.v;
                                        v1_17 = v1_16.u;
                                    }
                                    int v2_35;
                                    v26 = v13_10;
                                    if (v2_33.a != 1) {
                                        v2_35 = v10_14;
                                    } else {
                                        v2_35 = Math.min(v10_14, v3_18.m);
                                    }
                                    int v1_18 = Math.max(v1_17, v2_35);
                                    if (v12_11 > 0) {
                                        v1_18 = Math.min(v12_11, v1_18);
                                    }
                                    if (v1_18 != v10_14) {
                                        v14_5++;
                                        v10_14 = v1_18;
                                    }
                                    v3_18.d(v10_14);
                                }
                                v13_10 = (v26 + 1);
                                v1_19 = v17_1;
                                v2_38 = v18_1;
                                v3_0 = v23_1;
                                v10_20 = v24_0;
                                v12_13 = v25_0;
                            }
                            v17_3 = v1_19;
                            v18_0 = v2_38;
                            x.g v23_0 = v3_0;
                            if (v14_5 <= 0) {
                                v3_0 = v23_0;
                            } else {
                                v3_0 = (v23_0 - v14_5);
                                int v1_1 = 0;
                                v15_0 = 0;
                                while (v1_1 < v7) {
                                    int v2_28 = ((x.o) v6_1.get(v1_1));
                                    if (v2_28.b.g0 != 8) {
                                        if ((v1_1 > 0) && (v1_1 >= v8)) {
                                            v15_0 += v2_28.h.f;
                                        }
                                        v15_0 += v2_28.e.g;
                                        if ((v1_1 < v11_4) && (v1_1 < v9)) {
                                            v15_0 += (- v2_28.i.f);
                                        }
                                    }
                                    v1_1++;
                                }
                            }
                            v2_0 = 2;
                            if ((this.l != 2) || (v14_5 != 0)) {
                                v1_3 = 0;
                            } else {
                                v1_3 = 0;
                                this.l = 0;
                            }
                        }
                        if (v15_0 > v4_6) {
                            this.l = v2_0;
                        }
                        if ((v5_7 > 0) && ((v3_0 == null) && (v8 == v9))) {
                            this.l = v2_0;
                        }
                        int v2_1 = this.l;
                        if (v2_1 != 1) {
                            if (v2_1 != 0) {
                                if (v2_1 == 2) {
                                    int v2_4;
                                    if (this.f != 0) {
                                        v2_4 = this.b.e0;
                                    } else {
                                        v2_4 = this.b.d0;
                                    }
                                    if (v22_1 != 0) {
                                        v2_4 = (1065353216 - v2_4);
                                    }
                                    int v2_6 = ((int) ((((float) (v4_6 - v15_0)) * v2_4) + v18_0));
                                    if ((v2_6 < 0) || (v3_0 > null)) {
                                        v2_6 = v1_3;
                                    }
                                    int v2_7;
                                    if (v22_1 == 0) {
                                        v2_7 = (v17_3 + v2_6);
                                    } else {
                                        v2_7 = (v17_3 - v2_6);
                                    }
                                    int v5_2 = v1_3;
                                    while (v5_2 < v7) {
                                        int v1_4;
                                        if (v22_1 == 0) {
                                            v1_4 = v5_2;
                                        } else {
                                            v1_4 = (v7 - (v5_2 + 1));
                                        }
                                        int v1_7 = ((x.o) v6_1.get(v1_4));
                                        x.f v4_5 = v1_7.i;
                                        x.f v10_0 = v1_7.h;
                                        if (v1_7.b.g0 != 8) {
                                            if ((v5_2 > 0) && (v5_2 >= v8)) {
                                                if (v22_1 == 0) {
                                                    v2_7 += v10_0.f;
                                                } else {
                                                    v2_7 -= v10_0.f;
                                                }
                                            }
                                            if (v22_1 == 0) {
                                                v10_0.d(v2_7);
                                            } else {
                                                v4_5.d(v2_7);
                                            }
                                            x.g v3_7 = v1_7.e;
                                            int v13_0 = v3_7.g;
                                            if ((v1_7.d == 3) && (v1_7.a == 1)) {
                                                v13_0 = v3_7.m;
                                            }
                                            if (v22_1 == 0) {
                                                v2_7 += v13_0;
                                            } else {
                                                v2_7 -= v13_0;
                                            }
                                            if (v22_1 == 0) {
                                                v4_5.d(v2_7);
                                            } else {
                                                v10_0.d(v2_7);
                                            }
                                            if ((v5_2 < v11_4) && (v5_2 < v9)) {
                                                if (v22_1 == 0) {
                                                    v2_7 += (- v4_5.f);
                                                } else {
                                                    v2_7 -= (- v4_5.f);
                                                }
                                            }
                                        } else {
                                            v10_0.d(v2_7);
                                            v4_5.d(v2_7);
                                            int v15 = 3;
                                        }
                                        v5_2++;
                                    }
                                }
                            } else {
                                x.f v4_8 = ((v4_6 - v15_0) / (v5_7 + 1));
                                if (v3_0 > null) {
                                    v4_8 = v1_3;
                                }
                                int v5_4 = v1_3;
                                int v1_13 = v17_3;
                                while (v5_4 < v7) {
                                    int v2_9;
                                    if (v22_1 == 0) {
                                        v2_9 = v5_4;
                                    } else {
                                        v2_9 = (v7 - (v5_4 + 1));
                                    }
                                    int v2_12 = ((x.o) v6_1.get(v2_9));
                                    x.f v10_1 = v2_12.i;
                                    int v12_2 = v2_12.h;
                                    if (v2_12.b.g0 != 8) {
                                        int v1_14;
                                        if (v22_1 == 0) {
                                            v1_14 = (v1_13 + v4_8);
                                        } else {
                                            v1_14 = (v1_13 - v4_8);
                                        }
                                        if ((v5_4 > 0) && (v5_4 >= v8)) {
                                            if (v22_1 == 0) {
                                                v1_14 += v12_2.f;
                                            } else {
                                                v1_14 -= v12_2.f;
                                            }
                                        }
                                        if (v22_1 == 0) {
                                            v12_2.d(v1_14);
                                        } else {
                                            v10_1.d(v1_14);
                                        }
                                        x.g v3_12 = v2_12.e;
                                        int v13_2 = v3_12.g;
                                        if ((v2_12.d == 3) && (v2_12.a == 1)) {
                                            v13_2 = Math.min(v13_2, v3_12.m);
                                        }
                                        if (v22_1 == 0) {
                                            v1_13 = (v1_14 + v13_2);
                                        } else {
                                            v1_13 = (v1_14 - v13_2);
                                        }
                                        if (v22_1 == 0) {
                                            v10_1.d(v1_13);
                                        } else {
                                            v12_2.d(v1_13);
                                        }
                                        if ((v5_4 < v11_4) && (v5_4 < v9)) {
                                            if (v22_1 == 0) {
                                                v1_13 += (- v10_1.f);
                                            } else {
                                                v1_13 -= (- v10_1.f);
                                            }
                                        }
                                    } else {
                                        v12_2.d(v1_13);
                                        v10_1.d(v1_13);
                                    }
                                    v5_4++;
                                }
                            }
                        } else {
                            x.f v4_9;
                            if (v5_7 <= 1) {
                                if (v5_7 != 1) {
                                    v4_9 = v1_3;
                                } else {
                                    v4_9 = ((v4_6 - v15_0) / 2);
                                }
                            } else {
                                v4_9 = ((v4_6 - v15_0) / (v5_7 - 1));
                            }
                            if (v3_0 > null) {
                                v4_9 = v1_3;
                            }
                            int v5_6 = v1_3;
                            int v1_15 = v17_3;
                            while (v5_6 < v7) {
                                int v2_19;
                                if (v22_1 == 0) {
                                    v2_19 = v5_6;
                                } else {
                                    v2_19 = (v7 - (v5_6 + 1));
                                }
                                int v2_22 = ((x.o) v6_1.get(v2_19));
                                x.f v10_3 = v2_22.i;
                                int v12_3 = v2_22.h;
                                if (v2_22.b.g0 != 8) {
                                    if (v5_6 > 0) {
                                        if (v22_1 == 0) {
                                            v1_15 += v4_9;
                                        } else {
                                            v1_15 -= v4_9;
                                        }
                                    }
                                    if ((v5_6 > 0) && (v5_6 >= v8)) {
                                        if (v22_1 == 0) {
                                            v1_15 += v12_3.f;
                                        } else {
                                            v1_15 -= v12_3.f;
                                        }
                                    }
                                    if (v22_1 == 0) {
                                        v12_3.d(v1_15);
                                    } else {
                                        v10_3.d(v1_15);
                                    }
                                    x.g v3_17 = v2_22.e;
                                    int v13_4 = v3_17.g;
                                    if ((v2_22.d == 3) && (v2_22.a == 1)) {
                                        v13_4 = v3_17.m;
                                    }
                                    if (v22_1 == 0) {
                                        v1_15 += v13_4;
                                    } else {
                                        v1_15 -= v13_4;
                                    }
                                    if (v22_1 == 0) {
                                        v10_3.d(v1_15);
                                    } else {
                                        v12_3.d(v1_15);
                                    }
                                    v2_22.g = 1;
                                    if ((v5_6 < v11_4) && (v5_6 < v9)) {
                                        if (v22_1 == 0) {
                                            v1_15 += (- v10_3.f);
                                        } else {
                                            v1_15 -= (- v10_3.f);
                                        }
                                    }
                                } else {
                                    v12_3.d(v1_15);
                                    v10_3.d(v1_15);
                                }
                                v5_6++;
                            }
                        }
                    }
                    v22_1 = v3_1;
                    v19 = 0;
                    v3_0 = 0;
                    v5_7 = 0;
                    v15_0 = 0;
                }
                v8 = -1;
            }
        }
        return;
    }

    public final void d()
    {
        int v0_0 = this.k;
        x.f v1_2 = v0_0.size();
        x.f v3_0 = 0;
        while (v3_0 < v1_2) {
            w.d v4_5 = v0_0.get(v3_0);
            v3_0++;
            ((x.o) v4_5).d();
        }
        x.f v1_11 = v0_0.size();
        if (v1_11 >= 1) {
            w.d v4_2 = ((x.o) v0_0.get(0)).b;
            int v0_3 = ((x.o) v0_0.get((v1_11 - 1))).b;
            x.f v5 = this.i;
            x.f v6 = this.h;
            if (this.f != 0) {
                x.f v1_3 = v4_2.J;
                int v0_4 = v0_3.L;
                w.d v2_0 = x.o.i(v1_3, 1);
                x.f v1_4 = v1_3.e();
                w.d v4_3 = this.m();
                if (v4_3 != null) {
                    v1_4 = v4_3.J.e();
                }
                if (v2_0 != null) {
                    x.o.b(v6, v2_0, v1_4);
                }
                x.f v1_6 = x.o.i(v0_4, 1);
                int v0_5 = v0_4.e();
                w.d v2_2 = this.n();
                if (v2_2 != null) {
                    v0_5 = v2_2.L.e();
                }
                if (v1_6 != null) {
                    x.o.b(v5, v1_6, (- v0_5));
                }
            } else {
                x.f v1_7 = v4_2.I;
                int v0_8 = v0_3.K;
                x.f v3_1 = x.o.i(v1_7, 0);
                x.f v1_8 = v1_7.e();
                w.d v4_4 = this.m();
                if (v4_4 != null) {
                    v1_8 = v4_4.I.e();
                }
                if (v3_1 != null) {
                    x.o.b(v6, v3_1, v1_8);
                }
                x.f v1_10 = x.o.i(v0_8, 0);
                int v0_9 = v0_8.e();
                w.d v2_3 = this.n();
                if (v2_3 != null) {
                    v0_9 = v2_3.K.e();
                }
                if (v1_10 != null) {
                    x.o.b(v5, v1_10, (- v0_9));
                }
            }
            v6.a = this;
            v5.a = this;
            return;
        } else {
            return;
        }
    }

    public final void e()
    {
        int v0 = 0;
        while(true) {
            x.o v1_0 = this.k;
            if (v0 >= v1_0.size()) {
                break;
            }
            ((x.o) v1_0.get(v0)).e();
            v0++;
        }
        return;
    }

    public final void f()
    {
        this.c = 0;
        java.util.ArrayList v0_1 = this.k;
        int v1 = v0_1.size();
        int v2 = 0;
        while (v2 < v1) {
            x.o v3_1 = v0_1.get(v2);
            v2++;
            ((x.o) v3_1).f();
        }
        return;
    }

    public final long j()
    {
        java.util.ArrayList v0 = this.k;
        int v1 = v0.size();
        long v2_4 = 0;
        int v4 = 0;
        while (v4 < v1) {
            x.o v5_1 = ((x.o) v0.get(v4));
            v2_4 = (((long) v5_1.i.f) + (v5_1.j() + (v2_4 + ((long) v5_1.h.f))));
            v4++;
        }
        return v2_4;
    }

    public final boolean k()
    {
        int v0_0 = this.k;
        int v1 = v0_0.size();
        int v3 = 0;
        while (v3 < v1) {
            if (((x.o) v0_0.get(v3)).k()) {
                v3++;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public final w.d m()
    {
        int v0_0 = 0;
        while(true) {
            w.d v1_0 = this.k;
            if (v0_0 >= v1_0.size()) {
                return 0;
            } else {
                w.d v1_1 = ((x.o) v1_0.get(v0_0)).b;
                if (v1_1.g0 != 8) {
                    break;
                }
                v0_0++;
            }
        }
        return v1_1;
    }

    public final w.d n()
    {
        int v0_0 = this.k;
        int v1_0 = (v0_0.size() - 1);
        while (v1_0 >= 0) {
            w.d v2_0 = ((x.o) v0_0.get(v1_0)).b;
            if (v2_0.g0 == 8) {
                v1_0--;
            } else {
                return v2_0;
            }
        }
        return 0;
    }

    public final String toString()
    {
        java.util.ArrayList v1_2;
        String v0_2 = new StringBuilder("ChainRun ");
        if (this.f != 0) {
            v1_2 = "vertical : ";
        } else {
            v1_2 = "horizontal : ";
        }
        v0_2.append(v1_2);
        java.util.ArrayList v1_3 = this.k;
        int v2 = v1_3.size();
        int v3 = 0;
        while (v3 < v2) {
            String v4_0 = v1_3.get(v3);
            v3++;
            String v4_1 = ((x.o) v4_0);
            v0_2.append("<");
            v0_2.append(v4_1);
            v0_2.append("> ");
        }
        return v0_2.toString();
    }
}
