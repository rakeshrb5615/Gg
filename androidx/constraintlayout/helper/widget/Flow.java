package androidx.constraintlayout.helper.widget;
public class Flow extends z.t {
    public final w.g p;

    public Flow(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(p8, p9);
        int v0_2 = new int[32];
        super.a = v0_2;
        super.m = new java.util.HashMap();
        super.c = p8;
        super.g(p9);
        w.g v8_1 = new w.g();
        v8_1.s0 = 0;
        v8_1.t0 = 0;
        v8_1.u0 = 0;
        v8_1.v0 = 0;
        v8_1.w0 = 0;
        v8_1.x0 = 0;
        v8_1.y0 = 0;
        v8_1.z0 = 0;
        v8_1.A0 = 0;
        v8_1.B0 = new x.b();
        v8_1.C0 = 0;
        v8_1.D0 = -1;
        v8_1.E0 = -1;
        v8_1.F0 = -1;
        v8_1.G0 = -1;
        v8_1.H0 = -1;
        v8_1.I0 = -1;
        v8_1.J0 = 1056964608;
        v8_1.K0 = 1056964608;
        v8_1.L0 = 1056964608;
        v8_1.M0 = 1056964608;
        v8_1.N0 = 1056964608;
        v8_1.O0 = 1056964608;
        v8_1.P0 = 0;
        v8_1.Q0 = 0;
        v8_1.R0 = 2;
        v8_1.S0 = 2;
        v8_1.T0 = 0;
        v8_1.U0 = -1;
        v8_1.V0 = 0;
        v8_1.W0 = new java.util.ArrayList();
        v8_1.X0 = 0;
        v8_1.Y0 = 0;
        v8_1.Z0 = 0;
        v8_1.b1 = 0;
        super.p = v8_1;
        if (p9 != 0) {
            w.g v8_3 = super.getContext().obtainStyledAttributes(p9, z.r.b);
            int v9_1 = v8_3.getIndexCount();
            int v1_2 = 0;
            while (v1_2 < v9_1) {
                int v5_28 = v8_3.getIndex(v1_2);
                if (v5_28 != 0) {
                    if (v5_28 != 1) {
                        if (v5_28 != 18) {
                            if (v5_28 != 19) {
                                if (v5_28 != 2) {
                                    if (v5_28 != 3) {
                                        if (v5_28 != 4) {
                                            if (v5_28 != 5) {
                                                if (v5_28 != 54) {
                                                    if (v5_28 != 44) {
                                                        if (v5_28 != 53) {
                                                            if (v5_28 != 38) {
                                                                if (v5_28 != 46) {
                                                                    if (v5_28 != 40) {
                                                                        if (v5_28 != 48) {
                                                                            if (v5_28 != 42) {
                                                                                if (v5_28 != 37) {
                                                                                    if (v5_28 != 45) {
                                                                                        if (v5_28 != 39) {
                                                                                            if (v5_28 != 47) {
                                                                                                if (v5_28 != 51) {
                                                                                                    if (v5_28 != 41) {
                                                                                                        if (v5_28 != 50) {
                                                                                                            if (v5_28 != 43) {
                                                                                                                if (v5_28 != 52) {
                                                                                                                    if (v5_28 == 49) {
                                                                                                                        super.p.U0 = v8_3.getInt(v5_28, -1);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    super.p.Q0 = v8_3.getDimensionPixelSize(v5_28, 0);
                                                                                                                }
                                                                                                            } else {
                                                                                                                super.p.P0 = v8_3.getDimensionPixelSize(v5_28, 0);
                                                                                                            }
                                                                                                        } else {
                                                                                                            super.p.S0 = v8_3.getInt(v5_28, 2);
                                                                                                        }
                                                                                                    } else {
                                                                                                        super.p.R0 = v8_3.getInt(v5_28, 2);
                                                                                                    }
                                                                                                } else {
                                                                                                    super.p.K0 = v8_3.getFloat(v5_28, 1056964608);
                                                                                                }
                                                                                            } else {
                                                                                                super.p.O0 = v8_3.getFloat(v5_28, 1056964608);
                                                                                            }
                                                                                        } else {
                                                                                            super.p.M0 = v8_3.getFloat(v5_28, 1056964608);
                                                                                        }
                                                                                    } else {
                                                                                        super.p.N0 = v8_3.getFloat(v5_28, 1056964608);
                                                                                    }
                                                                                } else {
                                                                                    super.p.L0 = v8_3.getFloat(v5_28, 1056964608);
                                                                                }
                                                                            } else {
                                                                                super.p.J0 = v8_3.getFloat(v5_28, 1056964608);
                                                                            }
                                                                        } else {
                                                                            super.p.I0 = v8_3.getInt(v5_28, 0);
                                                                        }
                                                                    } else {
                                                                        super.p.G0 = v8_3.getInt(v5_28, 0);
                                                                    }
                                                                } else {
                                                                    super.p.H0 = v8_3.getInt(v5_28, 0);
                                                                }
                                                            } else {
                                                                super.p.F0 = v8_3.getInt(v5_28, 0);
                                                            }
                                                        } else {
                                                            super.p.E0 = v8_3.getInt(v5_28, 0);
                                                        }
                                                    } else {
                                                        super.p.D0 = v8_3.getInt(v5_28, 0);
                                                    }
                                                } else {
                                                    super.p.T0 = v8_3.getInt(v5_28, 0);
                                                }
                                            } else {
                                                super.p.t0 = v8_3.getDimensionPixelSize(v5_28, 0);
                                            }
                                        } else {
                                            super.p.x0 = v8_3.getDimensionPixelSize(v5_28, 0);
                                        }
                                    } else {
                                        super.p.s0 = v8_3.getDimensionPixelSize(v5_28, 0);
                                    }
                                } else {
                                    super.p.w0 = v8_3.getDimensionPixelSize(v5_28, 0);
                                }
                            } else {
                                super.p.v0 = v8_3.getDimensionPixelSize(v5_28, 0);
                            }
                        } else {
                            w.g v6_34 = super.p;
                            int v5_23 = v8_3.getDimensionPixelSize(v5_28, 0);
                            v6_34.u0 = v5_23;
                            v6_34.w0 = v5_23;
                            v6_34.x0 = v5_23;
                        }
                    } else {
                        w.g v6_35 = super.p;
                        int v5_24 = v8_3.getDimensionPixelSize(v5_28, 0);
                        v6_35.s0 = v5_24;
                        v6_35.t0 = v5_24;
                        v6_35.u0 = v5_24;
                        v6_35.v0 = v5_24;
                    }
                } else {
                    super.p.V0 = v8_3.getInt(v5_28, 0);
                }
                v1_2++;
            }
            v8_3.recycle();
        }
        super.d = super.p;
        super.i();
        return;
    }

    public final void h(w.d p3, boolean p4)
    {
        p3 = this.p;
        int v0 = p3.u0;
        if ((v0 <= 0) && (p3.v0 <= 0)) {
            return;
        } else {
            if (p4 == 0) {
                p3.w0 = v0;
                p3.x0 = p3.v0;
                return;
            } else {
                p3.w0 = p3.v0;
                p3.x0 = v0;
                return;
            }
        }
    }

    public final void j(w.g p39, int p40, int p41)
    {
        int v9 = android.view.View$MeasureSpec.getMode(p40);
        int v10 = android.view.View$MeasureSpec.getSize(p40);
        int v11 = android.view.View$MeasureSpec.getMode(p41);
        w.d[] v12_30 = android.view.View$MeasureSpec.getSize(p41);
        if (p39 == null) {
            this.setMeasuredDimension(0, 0);
            return;
        } else {
            int v14_0 = p39.p0;
            int v15_0 = p39.J;
            int v1_5 = p39.I;
            int v3_3 = p39.K;
            int v4_4 = p39.L;
            int v5_4 = p39.W0;
            if (p39.r0 <= 0) {
                int v19_0 = v1_5;
                int v20_0 = v3_3;
                int v21_0 = v4_4;
                w.f v22_1 = v5_4;
                int v13_3 = p39.w0;
                int v1_11 = p39.x0;
                int v3_4 = p39.s0;
                int v4_27 = p39.t0;
                int v6_23 = new int[2];
                int v5_18 = ((v10 - v13_3) - v1_11);
                int v7_32 = p39.V0;
                if (v7_32 == 1) {
                    v5_18 = ((v12_30 - v3_4) - v4_27);
                }
                int v23_4;
                int v8_2 = v5_18;
                if (v7_32 != 0) {
                    v23_4 = v1_11;
                    if (p39.D0 == -1) {
                        p39.D0 = 0;
                    }
                    if (p39.E0 == -1) {
                        p39.E0 = 0;
                    }
                } else {
                    int v7_50;
                    if (p39.D0 != -1) {
                        v7_50 = 0;
                    } else {
                        v7_50 = 0;
                        p39.D0 = 0;
                    }
                    v23_4 = v1_11;
                    if (p39.E0 == -1) {
                        p39.E0 = v7_50;
                    }
                }
                int v5_48 = 0;
                int v7_63 = 0;
                while(true) {
                    int v1_28 = p39.r0;
                    int v25_3 = v3_4;
                    if (v5_48 >= v1_28) {
                        break;
                    }
                    if (p39.q0[v5_48].g0 == 8) {
                        v7_63++;
                    }
                    v5_48++;
                    v3_4 = v25_3;
                }
                int v3_18;
                int v1_29;
                if (v7_63 <= 0) {
                    v3_18 = v1_28;
                    v1_29 = p39.q0;
                } else {
                    v1_29 = new w.d[(v1_28 - v7_63)];
                    int v5_52 = 0;
                    int v7_74 = 0;
                    while (v5_52 < p39.r0) {
                        int v3_29 = p39.q0[v5_52];
                        int v24_9 = v1_29;
                        if (v3_29.g0 != 8) {
                            v24_9[v7_74] = v3_29;
                            v7_74++;
                        }
                        v5_52++;
                        v1_29 = v24_9;
                    }
                    v3_18 = v7_74;
                }
                int v37_0;
                int v35;
                int v18_0;
                w.c v36;
                int v17;
                w.c v34;
                w.f v22_0;
                w.d[] v12_1;
                p39.a1 = v1_29;
                p39.b1 = v3_18;
                int v5_53 = p39.T0;
                if (v5_53 == 0) {
                    int v14_14 = v1_29;
                    int v15_5 = v3_18;
                    v35 = v4_27;
                    v36 = v6_23;
                    v37_0 = v12_30;
                    v17 = v13_3;
                    int v13_16 = v22_1;
                    v22_0 = v23_4;
                    v34 = v25_3;
                    int v3_0 = p39.V0;
                    if (v15_5 != 0) {
                        int v1_3;
                        if (v13_16.size() != 0) {
                            int v0_2 = ((w.f) v13_16.get(0));
                            v0_2.c = 0;
                            v0_2.b = 0;
                            v0_2.l = 0;
                            v0_2.m = 0;
                            v0_2.n = 0;
                            v0_2.o = 0;
                            v0_2.p = 0;
                            int v23_0 = v0_2;
                            v23_0.f(v3_0, p39.I, p39.J, p39.K, p39.L, p39.w0, p39.s0, p39.x0, p39.t0, v8_2);
                            v1_3 = v23_0;
                        } else {
                            v1_3 = new w.f(p39, v3_0, p39.I, p39.J, p39.K, p39.L, v8_2);
                            v13_16.add(v1_3);
                        }
                        int v0_4 = 0;
                        while (v0_4 < v15_5) {
                            v1_3.a(v14_14[v0_4]);
                            v0_4++;
                        }
                        v18_0 = 0;
                        v36[0] = v1_3.d();
                        v12_1 = 1;
                        v36[1] = v1_3.c();
                    } else {
                        v12_1 = 1;
                        v18_0 = 0;
                    }
                } else {
                    if (v5_53 == 1) {
                        v35 = v4_27;
                        v36 = v6_23;
                        v37_0 = v12_30;
                        v17 = v13_3;
                        int v24_1 = v15_0;
                        int v13_1 = v22_1;
                        v22_0 = v23_4;
                        v34 = v25_3;
                        int v15_1 = v3_18;
                        int v23_1 = v14_0;
                        int v14_1 = v1_29;
                        int v3_2 = p39.V0;
                        if (v15_1 != 0) {
                            int v4_3;
                            v13_1.clear();
                            int v1_7 = new w.f(p39, v3_2, p39.I, p39.J, p39.K, p39.L, v8_2);
                            v13_1.add(v1_7);
                            if (v3_2 != 0) {
                                int v0_7 = 0;
                                v4_3 = 0;
                                int v5_3 = 0;
                                while (v0_7 < v15_1) {
                                    w.d[] v12_2 = v14_1[v0_7];
                                    int v16_0 = p39.T(v12_2, v8_2);
                                    if (v12_2.p0[1] == 3) {
                                        v4_3++;
                                    }
                                    int v4_9;
                                    int v26_1 = v4_3;
                                    if (((v5_3 != v8_2) && (((p39.Q0 + v5_3) + v16_0) <= v8_2)) || (v1_7.b == null)) {
                                        v4_9 = 0;
                                    } else {
                                        v4_9 = 1;
                                    }
                                    if ((v4_9 == 0) && (v0_7 > 0)) {
                                        int v6_6 = p39.U0;
                                        if ((v6_6 > 0) && ((v0_7 % v6_6) == 0)) {
                                            v4_9 = 1;
                                        }
                                    }
                                    if (v4_9 == 0) {
                                        if (v0_7 <= 0) {
                                            v5_3 = v16_0;
                                        } else {
                                            v5_3 = ((p39.Q0 + v16_0) + v5_3);
                                        }
                                    } else {
                                        v1_7 = new w.f(p39, v3_2, p39.I, p39.J, p39.K, p39.L, v8_2);
                                        v1_7.n = v0_7;
                                        v13_1.add(v1_7);
                                    }
                                    v1_7.a(v12_2);
                                    v0_7++;
                                    v4_3 = v26_1;
                                }
                            } else {
                                int v0_8 = 0;
                                v4_3 = 0;
                                int v5_6 = 0;
                                while (v0_8 < v15_1) {
                                    w.d[] v12_10 = v14_1[v0_8];
                                    int v16_1 = p39.U(v12_10, v8_2);
                                    if (v12_10.p0[0] == 3) {
                                        v4_3++;
                                    }
                                    int v4_22;
                                    int v26_3 = v4_3;
                                    if (((v5_6 != v8_2) && (((p39.P0 + v5_6) + v16_1) <= v8_2)) || (v1_7.b == null)) {
                                        v4_22 = 0;
                                    } else {
                                        v4_22 = 1;
                                    }
                                    if ((v4_22 == 0) && (v0_8 > 0)) {
                                        int v6_20 = p39.U0;
                                        if ((v6_20 > 0) && ((v0_8 % v6_20) == 0)) {
                                            v4_22 = 1;
                                        }
                                    }
                                    if (v4_22 == 0) {
                                        if (v0_8 <= 0) {
                                            v5_6 = v16_1;
                                        } else {
                                            v5_6 = ((p39.P0 + v16_1) + v5_6);
                                        }
                                    } else {
                                        v1_7 = new w.f(p39, v3_2, p39.I, p39.J, p39.K, p39.L, v8_2);
                                        v1_7.n = v0_8;
                                        v13_1.add(v1_7);
                                    }
                                    v1_7.a(v12_10);
                                    v0_8++;
                                    v4_3 = v26_3;
                                }
                            }
                            w.d[] v12_5;
                            int v0_9 = v13_1.size();
                            int v1_9 = p39.w0;
                            int v5_7 = p39.s0;
                            int v6_11 = p39.x0;
                            int v7_8 = p39.t0;
                            if ((v23_1[0] != 2) && (v23_1[1] != 2)) {
                                v12_5 = 0;
                            } else {
                                v12_5 = 1;
                            }
                            if ((v4_3 > 0) && (v12_5 != null)) {
                                int v4_14 = 0;
                                while (v4_14 < v0_9) {
                                    w.d[] v12_9 = ((w.f) v13_1.get(v4_14));
                                    if (v3_2 != 0) {
                                        v12_9.e((v8_2 - v12_9.c()));
                                    } else {
                                        v12_9.e((v8_2 - v12_9.d()));
                                    }
                                    v4_14++;
                                }
                            }
                            int v29_1 = v1_9;
                            int v30_1 = v5_7;
                            int v31_1 = v6_11;
                            int v32_1 = v7_8;
                            int v25_1 = v19_0;
                            int v27_1 = v20_0;
                            int v28_1 = v21_0;
                            int v26_2 = v24_1;
                            int v1_10 = 0;
                            int v4_15 = 0;
                            int v5_8 = 0;
                            while (v1_10 < v0_9) {
                                int v6_13 = ((w.f) v13_1.get(v1_10));
                                if (v3_2 != 0) {
                                    if (v1_10 >= (v0_9 - 1)) {
                                        v31_1 = p39.x0;
                                        v27_1 = v20_0;
                                    } else {
                                        v27_1 = ((w.f) v13_1.get((v1_10 + 1))).b.I;
                                        v31_1 = 0;
                                    }
                                    int v7_19 = v6_13.b.K;
                                    int v23_2 = v6_13;
                                    v23_2.f(v3_2, v25_1, v26_2, v27_1, v28_1, v29_1, v30_1, v31_1, v32_1, v8_2);
                                    int v6_15 = (v23_2.d() + v4_15);
                                    int v4_17 = Math.max(v5_8, v23_2.c());
                                    if (v1_10 > 0) {
                                        v6_15 += p39.P0;
                                    }
                                    v5_8 = v4_17;
                                    v4_15 = v6_15;
                                    v25_1 = v7_19;
                                    v29_1 = 0;
                                } else {
                                    if (v1_10 >= (v0_9 - 1)) {
                                        v32_1 = p39.t0;
                                        v28_1 = v21_0;
                                    } else {
                                        v28_1 = ((w.f) v13_1.get((v1_10 + 1))).b.J;
                                        v32_1 = 0;
                                    }
                                    int v7_28 = v6_13.b.L;
                                    v6_13.f(v3_2, v25_1, v26_2, v27_1, v28_1, v29_1, v30_1, v31_1, v32_1, v8_2);
                                    v4_15 = Math.max(v4_15, v6_13.d());
                                    int v6_17 = (v6_13.c() + v5_8);
                                    if (v1_10 > 0) {
                                        v6_17 += p39.Q0;
                                    }
                                    v5_8 = v6_17;
                                    v26_2 = v7_28;
                                    v30_1 = 0;
                                }
                                v1_10++;
                            }
                            v36[0] = v4_15;
                            v36[1] = v5_8;
                        }
                    } else {
                        if (v5_53 == 2) {
                            int v4_29;
                            int v1_13;
                            int v14_7 = v1_29;
                            int v15_3 = v3_18;
                            v35 = v4_27;
                            v36 = v6_23;
                            v37_0 = v12_30;
                            v17 = v13_3;
                            v22_0 = v23_4;
                            v34 = v25_3;
                            int v0_10 = p39.V0;
                            if (v0_10 != 0) {
                                v1_13 = p39.U0;
                                if (v1_13 <= 0) {
                                    int v1_14 = 0;
                                    int v3_5 = 0;
                                    int v4_28 = 0;
                                    while (v1_14 < v15_3) {
                                        if (v1_14 > 0) {
                                            v3_5 += p39.Q0;
                                        }
                                        int v5_14 = v14_7[v1_14];
                                        if (v5_14 != 0) {
                                            int v5_16 = (p39.T(v5_14, v8_2) + v3_5);
                                            if (v5_16 > v8_2) {
                                                break;
                                            }
                                            v4_28++;
                                            v3_5 = v5_16;
                                        }
                                        v1_14++;
                                    }
                                    v1_13 = v4_28;
                                }
                                v4_29 = 0;
                            } else {
                                int v1_15 = p39.U0;
                                if (v1_15 > 0) {
                                    v4_29 = v1_15;
                                } else {
                                    int v1_16 = 0;
                                    int v3_6 = 0;
                                    v4_29 = 0;
                                    while (v1_16 < v15_3) {
                                        if (v1_16 > 0) {
                                            v3_6 += p39.P0;
                                        }
                                        int v5_20 = v14_7[v1_16];
                                        if (v5_20 != 0) {
                                            int v5_22 = (p39.U(v5_20, v8_2) + v3_6);
                                            if (v5_22 > v8_2) {
                                                break;
                                            }
                                            v4_29++;
                                            v3_6 = v5_22;
                                        }
                                        v1_16++;
                                    }
                                }
                                v1_13 = 0;
                            }
                            if (p39.Z0 == null) {
                                int v3_8 = new int[2];
                                p39.Z0 = v3_8;
                            }
                            if (((v1_13 != 0) || (v0_10 != 1)) && ((v4_29 != 0) || (v0_10 != 0))) {
                                int v3_9 = 0;
                            } else {
                                v3_9 = 1;
                            }
                            while (v3_9 == 0) {
                                if (v0_10 != 0) {
                                    v4_29 = ((int) Math.ceil(((double) (((float) v15_3) / ((float) v1_13)))));
                                } else {
                                    v1_13 = ((int) Math.ceil(((double) (((float) v15_3) / ((float) v4_29)))));
                                }
                                int v6_25;
                                int v5_29 = p39.Y0;
                                if ((v5_29 != 0) && (v5_29.length >= v4_29)) {
                                    v6_25 = 0;
                                    java.util.Arrays.fill(v5_29, 0);
                                } else {
                                    v6_25 = 0;
                                    int v5_30 = new w.d[v4_29];
                                    p39.Y0 = v5_30;
                                }
                                int v5_31 = p39.X0;
                                if ((v5_31 != 0) && (v5_31.length >= v1_13)) {
                                    java.util.Arrays.fill(v5_31, v6_25);
                                } else {
                                    int v5_32 = new w.d[v1_13];
                                    p39.X0 = v5_32;
                                }
                                int v5_33 = 0;
                                while (v5_33 < v4_29) {
                                    int v6_27 = 0;
                                    while (v6_27 < v1_13) {
                                        int v7_42 = ((v6_27 * v4_29) + v5_33);
                                        if (v0_10 == 1) {
                                            v7_42 = ((v5_33 * v1_13) + v6_27);
                                        }
                                        if (v7_42 < v14_7.length) {
                                            int v7_44 = v14_7[v7_42];
                                            if (v7_44 != 0) {
                                                w.d[] v12_19 = p39.U(v7_44, v8_2);
                                                int v13_6 = p39.Y0[v5_33];
                                                if ((v13_6 == 0) || (v13_6.q() < v12_19)) {
                                                    p39.Y0[v5_33] = v7_44;
                                                }
                                                w.d[] v12_21 = p39.T(v7_44, v8_2);
                                                int v13_9 = p39.X0[v6_27];
                                                if ((v13_9 == 0) || (v13_9.k() < v12_21)) {
                                                    p39.X0[v6_27] = v7_44;
                                                }
                                            }
                                        }
                                        v6_27++;
                                    }
                                    v5_33++;
                                }
                                int v5_34 = 0;
                                int v6_26 = 0;
                                while (v5_34 < v4_29) {
                                    int v7_37 = p39.Y0[v5_34];
                                    if (v7_37 != 0) {
                                        if (v5_34 > 0) {
                                            v6_26 += p39.P0;
                                        }
                                        v6_26 = (p39.U(v7_37, v8_2) + v6_26);
                                    }
                                    v5_34++;
                                }
                                int v5_35 = 0;
                                int v7_35 = 0;
                                while (v5_35 < v1_13) {
                                    w.d[] v12_13 = p39.X0[v5_35];
                                    if (v12_13 != null) {
                                        if (v5_35 > 0) {
                                            v7_35 += p39.Q0;
                                        }
                                        v7_35 = (p39.T(v12_13, v8_2) + v7_35);
                                    }
                                    v5_35++;
                                }
                                v36[0] = v6_26;
                                v36[1] = v7_35;
                                if (v0_10 != 0) {
                                    if ((v7_35 > v8_2) && (v1_13 > 1)) {
                                        v1_13--;
                                    }
                                } else {
                                    if ((v6_26 > v8_2) && (v4_29 > 1)) {
                                        v4_29--;
                                    }
                                }
                                v3_9 = 1;
                            }
                            v12_1 = 1;
                            int v0_11 = p39.Z0;
                            v0_11[0] = v4_29;
                            v0_11[1] = v1_13;
                        } else {
                            if (v5_53 == 3) {
                                int v40_2;
                                int v5_37 = v3_18;
                                int v3_10 = p39.V0;
                                if (v5_37 != 0) {
                                    int v6_30;
                                    v22_1.clear();
                                    v17 = v13_3;
                                    v35 = v4_27;
                                    int v13_11 = v22_1;
                                    v22_0 = v23_4;
                                    v34 = v25_3;
                                    v36 = v6_23;
                                    v40_2 = 1;
                                    int v23_5 = v14_0;
                                    int v14_8 = v1_29;
                                    int v24_5 = v15_0;
                                    int v15_4 = v5_37;
                                    int v1_22 = new w.f(p39, v3_10, p39.I, p39.J, p39.K, p39.L, v8_2);
                                    v13_11.add(v1_22);
                                    if (v3_10 != 0) {
                                        v37_0 = v12_30;
                                        int v0_12 = 0;
                                        int v4_35 = 0;
                                        int v5_39 = 0;
                                        int v6_29 = 0;
                                        while (v0_12 < v15_4) {
                                            v4_35++;
                                            w.d[] v12_23 = v14_8[v0_12];
                                            int v16_3 = p39.T(v12_23, v8_2);
                                            int v26_5 = v3_10;
                                            if (v12_23.p0[1] == 3) {
                                                v5_39++;
                                            }
                                            int v3_16;
                                            int v27_3 = v5_39;
                                            if (((v6_29 != v8_2) && (((p39.Q0 + v6_29) + v16_3) <= v8_2)) || (v1_22.b == null)) {
                                                v3_16 = 0;
                                            } else {
                                                v3_16 = 1;
                                            }
                                            if ((v3_16 == 0) && (v0_12 > 0)) {
                                                int v5_40 = p39.U0;
                                                if ((v5_40 > 0) && (v4_35 > v5_40)) {
                                                    v3_16 = 1;
                                                }
                                            }
                                            if (v3_16 == 0) {
                                                v3_10 = v26_5;
                                                if (v0_12 <= 0) {
                                                    v6_29 = v16_3;
                                                } else {
                                                    v6_29 = ((p39.Q0 + v16_3) + v6_29);
                                                }
                                            } else {
                                                v3_10 = v26_5;
                                                v1_22 = new w.f(p39, v3_10, p39.I, p39.J, p39.K, p39.L, v8_2);
                                                v1_22.n = v0_12;
                                                v13_11.add(v1_22);
                                                v4_35 = 1;
                                            }
                                            v1_22.a(v12_23);
                                            v0_12++;
                                            v5_39 = v27_3;
                                        }
                                        v6_30 = v5_39;
                                    } else {
                                        int v4_37 = 0;
                                        int v5_45 = 0;
                                        v6_30 = 0;
                                        int v7_52 = 0;
                                        while (v4_37 < v15_4) {
                                            v5_45++;
                                            int v0_14 = v14_8[v4_37];
                                            int v16_4 = p39.U(v0_14, v8_2);
                                            int v26_7 = v3_10;
                                            int v27_5 = v4_37;
                                            if (v0_14.p0[0] == 3) {
                                                v6_30++;
                                            }
                                            int v3_25;
                                            int v28_4 = v6_30;
                                            if (((v7_52 != v8_2) && (((p39.P0 + v7_52) + v16_4) <= v8_2)) || (v1_22.b == null)) {
                                                v3_25 = 0;
                                            } else {
                                                v3_25 = 1;
                                            }
                                            if ((v3_25 == 0) && (v27_5 > 0)) {
                                                int v4_43 = p39.U0;
                                                if ((v4_43 > 0) && (v5_45 > v4_43)) {
                                                    v3_25 = 1;
                                                }
                                            }
                                            int v37_1;
                                            w.d[] v12_31;
                                            if (v3_25 == 0) {
                                                v37_1 = v12_30;
                                                v3_10 = v26_7;
                                                v12_31 = v27_5;
                                                if (v12_31 <= null) {
                                                    v7_52 = v16_4;
                                                } else {
                                                    v7_52 = ((p39.P0 + v16_4) + v7_52);
                                                }
                                            } else {
                                                v37_1 = v12_30;
                                                v3_10 = v26_7;
                                                v12_31 = v27_5;
                                                v1_22 = new w.f(p39, v3_10, p39.I, p39.J, p39.K, p39.L, v8_2);
                                                v1_22.n = v12_31;
                                                v13_11.add(v1_22);
                                                v5_45 = 1;
                                            }
                                            v1_22.a(v0_14);
                                            v4_37 = (v12_31 + 1);
                                            v6_30 = v28_4;
                                            v12_30 = v37_1;
                                        }
                                        v37_0 = v12_30;
                                    }
                                    w.d[] v12_26;
                                    int v0_13 = v13_11.size();
                                    int v1_25 = p39.w0;
                                    int v4_38 = p39.s0;
                                    int v5_46 = p39.x0;
                                    int v7_53 = p39.t0;
                                    if ((v23_5[0] != 2) && (v23_5[1] != 2)) {
                                        v12_26 = 0;
                                    } else {
                                        v12_26 = 1;
                                    }
                                    if ((v6_30 > 0) && (v12_26 != null)) {
                                        int v6_32 = 0;
                                        while (v6_32 < v0_13) {
                                            w.d[] v12_29 = ((w.f) v13_11.get(v6_32));
                                            if (v3_10 != 0) {
                                                v12_29.e((v8_2 - v12_29.c()));
                                            } else {
                                                v12_29.e((v8_2 - v12_29.d()));
                                            }
                                            v6_32++;
                                        }
                                    }
                                    int v29_2 = v1_25;
                                    int v30_2 = v4_38;
                                    int v31_2 = v5_46;
                                    int v32_2 = v7_53;
                                    int v25_2 = v19_0;
                                    int v27_4 = v20_0;
                                    int v28_3 = v21_0;
                                    int v26_6 = v24_5;
                                    int v1_26 = 0;
                                    int v4_39 = 0;
                                    int v5_47 = 0;
                                    while (v1_26 < v0_13) {
                                        int v6_34 = ((w.f) v13_11.get(v1_26));
                                        if (v3_10 != 0) {
                                            if (v1_26 >= (v0_13 - 1)) {
                                                v31_2 = p39.x0;
                                                v27_4 = v20_0;
                                            } else {
                                                v27_4 = ((w.f) v13_11.get((v1_26 + 1))).b.I;
                                                v31_2 = 0;
                                            }
                                            int v7_62 = v6_34.b.K;
                                            int v23_6 = v6_34;
                                            v23_6.f(v3_10, v25_2, v26_6, v27_4, v28_3, v29_2, v30_2, v31_2, v32_2, v8_2);
                                            int v6_36 = (v23_6.d() + v4_39);
                                            int v4_41 = Math.max(v5_47, v23_6.c());
                                            if (v1_26 > 0) {
                                                v6_36 += p39.P0;
                                            }
                                            v5_47 = v4_41;
                                            v4_39 = v6_36;
                                            v25_2 = v7_62;
                                            v29_2 = 0;
                                        } else {
                                            if (v1_26 >= (v0_13 - 1)) {
                                                v32_2 = p39.t0;
                                                v28_3 = v21_0;
                                            } else {
                                                v28_3 = ((w.f) v13_11.get((v1_26 + 1))).b.J;
                                                v32_2 = 0;
                                            }
                                            int v7_72 = v6_34.b.L;
                                            v6_34.f(v3_10, v25_2, v26_6, v27_4, v28_3, v29_2, v30_2, v31_2, v32_2, v8_2);
                                            v4_39 = Math.max(v4_39, v6_34.d());
                                            int v6_38 = (v6_34.c() + v5_47);
                                            if (v1_26 > 0) {
                                                v6_38 += p39.Q0;
                                            }
                                            v5_47 = v6_38;
                                            v26_6 = v7_72;
                                            v30_2 = 0;
                                        }
                                        v1_26++;
                                    }
                                    v36[0] = v4_39;
                                    v36[1] = v5_47;
                                } else {
                                    v35 = v4_27;
                                    v36 = v6_23;
                                    v37_0 = v12_30;
                                    v17 = v13_3;
                                    v22_0 = v23_4;
                                    v34 = v25_3;
                                    v40_2 = 1;
                                }
                                v12_1 = v40_2;
                            } else {
                                v35 = v4_27;
                                v36 = v6_23;
                                v37_0 = v12_30;
                                v17 = v13_3;
                                v22_0 = v23_4;
                                v34 = v25_3;
                            }
                        }
                    }
                }
                int v0_17 = ((v36[v18_0] + v17) + v22_0);
                int v1_34 = ((v36[v12_1] + v34) + v35);
                if (v9 != 1073741824) {
                    if (v9 != -2147483648) {
                        if (v9 != 0) {
                            v10 = 0;
                        } else {
                            v10 = v0_17;
                        }
                    } else {
                        v10 = Math.min(v0_17, v10);
                    }
                }
                int v0_18;
                if (v11 != 1073741824) {
                    if (v11 != -2147483648) {
                        if (v11 != 0) {
                            v0_18 = 0;
                        } else {
                            v0_18 = v1_34;
                        }
                    } else {
                        v0_18 = Math.min(v1_34, v37_0);
                    }
                } else {
                    v0_18 = v37_0;
                }
                int v13_12;
                p39.z0 = v10;
                p39.A0 = v0_18;
                p39.O(v10);
                p39.L(v0_18);
                if (p39.r0 <= 0) {
                    v13_12 = 0;
                } else {
                    v13_12 = v12_1;
                }
                p39.y0 = v13_12;
            } else {
                int v7_9;
                int v6_10 = p39.B0;
                int v7_7 = p39.T;
                if (v7_7 == 0) {
                    v7_9 = 0;
                } else {
                    v7_9 = ((w.e) v7_7).u0;
                }
                if (v7_9 != 0) {
                    int v8_0 = 0;
                    while (v8_0 < p39.r0) {
                        int v20_1;
                        int v23_8;
                        int v21_1;
                        int v19_1;
                        w.f v22_2;
                        int v13_15 = p39.q0[v8_0];
                        if (v13_15 != 0) {
                            v19_1 = v1_5;
                            if (!(v13_15 instanceof w.h)) {
                                v20_1 = v3_3;
                                int v3_31 = v13_15.j(0);
                                v21_1 = v4_4;
                                int v4_49 = v13_15.j(1);
                                v22_2 = v5_4;
                                if (v3_31 != 3) {
                                    v23_8 = v8_0;
                                } else {
                                    v23_8 = v8_0;
                                    if ((v13_15.r != 1) && ((v4_49 == 3) && (v13_15.s != 1))) {
                                        v8_0 = (v23_8 + 1);
                                        v1_5 = v19_1;
                                        v3_3 = v20_1;
                                        v4_4 = v21_1;
                                        v5_4 = v22_2;
                                    }
                                }
                                if (v3_31 == 3) {
                                    v3_31 = 2;
                                }
                                if (v4_49 == 3) {
                                    v4_49 = 2;
                                }
                                v6_10.a = v3_31;
                                v6_10.b = v4_49;
                                v6_10.c = v13_15.q();
                                v6_10.d = v13_15.k();
                                v7_9.b(v13_15, v6_10);
                                v13_15.O(v6_10.e);
                                v13_15.L(v6_10.f);
                                v13_15.I(v6_10.g);
                            } else {
                                v20_1 = v3_3;
                                v21_1 = v4_4;
                                v22_2 = v5_4;
                                v23_8 = v8_0;
                            }
                        } else {
                            v19_1 = v1_5;
                        }
                    }
                } else {
                    p39.z0 = 0;
                    p39.A0 = 0;
                    p39.y0 = 0;
                }
            }
            this.setMeasuredDimension(p39.z0, p39.A0);
            return;
        }
    }

    public final void onMeasure(int p2, int p3)
    {
        this.j(this.p, p2, p3);
        return;
    }

    public void setFirstHorizontalBias(float p2)
    {
        this.p.L0 = p2;
        this.requestLayout();
        return;
    }

    public void setFirstHorizontalStyle(int p2)
    {
        this.p.F0 = p2;
        this.requestLayout();
        return;
    }

    public void setFirstVerticalBias(float p2)
    {
        this.p.M0 = p2;
        this.requestLayout();
        return;
    }

    public void setFirstVerticalStyle(int p2)
    {
        this.p.G0 = p2;
        this.requestLayout();
        return;
    }

    public void setHorizontalAlign(int p2)
    {
        this.p.R0 = p2;
        this.requestLayout();
        return;
    }

    public void setHorizontalBias(float p2)
    {
        this.p.J0 = p2;
        this.requestLayout();
        return;
    }

    public void setHorizontalGap(int p2)
    {
        this.p.P0 = p2;
        this.requestLayout();
        return;
    }

    public void setHorizontalStyle(int p2)
    {
        this.p.D0 = p2;
        this.requestLayout();
        return;
    }

    public void setLastHorizontalBias(float p2)
    {
        this.p.N0 = p2;
        this.requestLayout();
        return;
    }

    public void setLastHorizontalStyle(int p2)
    {
        this.p.H0 = p2;
        this.requestLayout();
        return;
    }

    public void setLastVerticalBias(float p2)
    {
        this.p.O0 = p2;
        this.requestLayout();
        return;
    }

    public void setLastVerticalStyle(int p2)
    {
        this.p.I0 = p2;
        this.requestLayout();
        return;
    }

    public void setMaxElementsWrap(int p2)
    {
        this.p.U0 = p2;
        this.requestLayout();
        return;
    }

    public void setOrientation(int p2)
    {
        this.p.V0 = p2;
        this.requestLayout();
        return;
    }

    public void setPadding(int p2)
    {
        w.g v0 = this.p;
        v0.s0 = p2;
        v0.t0 = p2;
        v0.u0 = p2;
        v0.v0 = p2;
        this.requestLayout();
        return;
    }

    public void setPaddingBottom(int p2)
    {
        this.p.t0 = p2;
        this.requestLayout();
        return;
    }

    public void setPaddingLeft(int p2)
    {
        this.p.w0 = p2;
        this.requestLayout();
        return;
    }

    public void setPaddingRight(int p2)
    {
        this.p.x0 = p2;
        this.requestLayout();
        return;
    }

    public void setPaddingTop(int p2)
    {
        this.p.s0 = p2;
        this.requestLayout();
        return;
    }

    public void setVerticalAlign(int p2)
    {
        this.p.S0 = p2;
        this.requestLayout();
        return;
    }

    public void setVerticalBias(float p2)
    {
        this.p.K0 = p2;
        this.requestLayout();
        return;
    }

    public void setVerticalGap(int p2)
    {
        this.p.Q0 = p2;
        this.requestLayout();
        return;
    }

    public void setVerticalStyle(int p2)
    {
        this.p.E0 = p2;
        this.requestLayout();
        return;
    }

    public void setWrapMode(int p2)
    {
        this.p.T0 = p2;
        this.requestLayout();
        return;
    }
}
