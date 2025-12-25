package z;
public final class f {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final synthetic androidx.constraintlayout.widget.ConstraintLayout h;

    public f(androidx.constraintlayout.widget.ConstraintLayout p1, androidx.constraintlayout.widget.ConstraintLayout p2)
    {
        this.h = p1;
        this.a = p2;
        return;
    }

    public static boolean a(int p2, int p3, int p4)
    {
        if (p2 != p3) {
            int v2_3 = android.view.View$MeasureSpec.getMode(p2);
            int v0_0 = android.view.View$MeasureSpec.getMode(p3);
            int v3_1 = android.view.View$MeasureSpec.getSize(p3);
            if (((v0_0 != 1073741824) || ((v2_3 != -2147483648) && (v2_3 != 0))) || (p4 != v3_1)) {
                return 0;
            }
        }
        return 1;
    }

    public final void b(w.d p18, x.b p19)
    {
        if (p18 != null) {
            int v3_14 = p18.K;
            int v4_20 = p18.I;
            if (p18.g0 != 8) {
                if (p18.T != null) {
                    int v8_1;
                    int v5_1 = p19.a;
                    float v6_0 = p19.b;
                    int v8_0 = p19.c;
                    int v9_6 = p19.d;
                    int v10_13 = (this.b + this.c);
                    int v11_6 = this.d;
                    android.view.View v12 = p18.f0;
                    int v13_5 = u.e.c(v5_1);
                    if (v13_5 == 0) {
                        v8_1 = android.view.View$MeasureSpec.makeMeasureSpec(v8_0, 1073741824);
                    } else {
                        if (v13_5 == 1) {
                            v8_1 = android.view.ViewGroup.getChildMeasureSpec(this.f, v11_6, -2);
                        } else {
                            if (v13_5 == 2) {
                                int v11_11;
                                v8_1 = android.view.ViewGroup.getChildMeasureSpec(this.f, v11_6, -2);
                                if (p18.r != 1) {
                                    v11_11 = 0;
                                } else {
                                    v11_11 = 1;
                                }
                                int v13_11 = p19.j;
                                if ((v13_11 == 1) || (v13_11 == 2)) {
                                    int v13_13;
                                    if (v12.getMeasuredHeight() != p18.k()) {
                                        v13_13 = 0;
                                    } else {
                                        v13_13 = 1;
                                    }
                                    if (((p19.j == 2) || ((v11_11 == 0) || ((v11_11 != 0) && (v13_13 != 0)))) || (p18.A())) {
                                        v8_1 = android.view.View$MeasureSpec.makeMeasureSpec(p18.q(), 1073741824);
                                    }
                                }
                            } else {
                                if (v13_5 == 3) {
                                    int v13_15;
                                    if (v4_20 == 0) {
                                        v13_15 = 0;
                                    } else {
                                        v13_15 = v4_20.g;
                                    }
                                    if (v3_14 != 0) {
                                        v13_15 += v3_14.g;
                                    }
                                    v8_1 = android.view.ViewGroup.getChildMeasureSpec(this.f, (v11_6 + v13_15), -1);
                                } else {
                                    v8_1 = 0;
                                }
                            }
                        }
                    }
                    int v3_1;
                    int v11_14 = u.e.c(v6_0);
                    if (v11_14 == 0) {
                        v3_1 = android.view.View$MeasureSpec.makeMeasureSpec(v9_6, 1073741824);
                    } else {
                        if (v11_14 == 1) {
                            v3_1 = android.view.ViewGroup.getChildMeasureSpec(this.g, v10_13, -2);
                        } else {
                            if (v11_14 == 2) {
                                int v4_0;
                                v3_1 = android.view.ViewGroup.getChildMeasureSpec(this.g, v10_13, -2);
                                if (p18.s != 1) {
                                    v4_0 = 0;
                                } else {
                                    v4_0 = 1;
                                }
                                int v9_0 = p19.j;
                                if ((v9_0 == 1) || (v9_0 == 2)) {
                                    int v9_2;
                                    if (v12.getMeasuredWidth() != p18.q()) {
                                        v9_2 = 0;
                                    } else {
                                        v9_2 = 1;
                                    }
                                    if (((p19.j == 2) || ((v4_0 == 0) || ((v4_0 != 0) && (v9_2 != 0)))) || (p18.B())) {
                                        v3_1 = android.view.View$MeasureSpec.makeMeasureSpec(p18.k(), 1073741824);
                                    }
                                }
                            } else {
                                if (v11_14 == 3) {
                                    int v4_2;
                                    if (v4_20 == 0) {
                                        v4_2 = 0;
                                    } else {
                                        v4_2 = p18.J.g;
                                    }
                                    if (v3_14 != 0) {
                                        v4_2 += p18.L.g;
                                    }
                                    v3_1 = android.view.ViewGroup.getChildMeasureSpec(this.g, (v10_13 + v4_2), -1);
                                } else {
                                    v3_1 = 0;
                                }
                            }
                        }
                    }
                    int v4_5 = ((w.e) p18.T);
                    int v9_5 = this.h;
                    if ((v4_5 == 0) || ((!w.j.c(v9_5.o, 256)) || ((v12.getMeasuredWidth() != p18.q()) || ((v12.getMeasuredWidth() >= v4_5.q()) || ((v12.getMeasuredHeight() != p18.k()) || ((v12.getMeasuredHeight() >= v4_5.k()) || ((v12.getBaseline() != p18.a0) || ((p18.z()) || ((!z.f.a(p18.G, v8_1, p18.q())) || (!z.f.a(p18.H, v3_1, p18.k()))))))))))) {
                        int v10_14;
                        if (v5_1 != 3) {
                            v10_14 = 0;
                        } else {
                            v10_14 = 1;
                        }
                        int v4_14;
                        if (v6_0 != 3) {
                            v4_14 = 0;
                        } else {
                            v4_14 = 1;
                        }
                        if ((v6_0 != 4) && (v6_0 != 1)) {
                            float v6_1 = 0;
                        } else {
                            v6_1 = 1;
                        }
                        if ((v5_1 != 4) && (v5_1 != 1)) {
                            int v5_2 = 0;
                        } else {
                            v5_2 = 1;
                        }
                        if ((v10_14 == 0) || (p18.W <= 0)) {
                            int v13_4 = 0;
                        } else {
                            v13_4 = 1;
                        }
                        if ((v4_14 == 0) || (p18.W <= 0)) {
                            int v11_9 = 0;
                        } else {
                            v11_9 = 1;
                        }
                        if (v12 != null) {
                            int v13_6;
                            int v14_0;
                            int v0_4;
                            int v3_4;
                            int v5_3;
                            z.e v15_2 = ((z.e) v12.getLayoutParams());
                            int v0_1 = p19.j;
                            if ((v0_1 != 1) && ((v0_1 != 2) && ((v10_14 != 0) && ((p18.r == 0) && ((v4_14 != 0) && (p18.s == 0)))))) {
                                v0_4 = 0;
                                v3_4 = 0;
                                v5_3 = 0;
                                v13_6 = -1;
                                v14_0 = 0;
                            } else {
                                if ((!(v12 instanceof z.t)) || (!(p18 instanceof w.g))) {
                                    v12.measure(v8_1, v3_1);
                                } else {
                                    ((z.t) v12).j(((w.g) p18), v8_1, v3_1);
                                }
                                int v10_16;
                                p18.G = v8_1;
                                p18.H = v3_1;
                                p18.g = 0;
                                int v0_10 = v12.getMeasuredWidth();
                                int v4_17 = v12.getMeasuredHeight();
                                int v7_0 = v12.getBaseline();
                                int v10_15 = p18.u;
                                if (v10_15 <= 0) {
                                    v10_16 = v0_10;
                                } else {
                                    v10_16 = Math.max(v10_15, v0_10);
                                }
                                int v14_2 = p18.v;
                                if (v14_2 > 0) {
                                    v10_16 = Math.min(v14_2, v10_16);
                                }
                                int v14_3 = p18.x;
                                if (v14_3 <= 0) {
                                    v14_0 = v4_17;
                                } else {
                                    v14_0 = Math.max(v14_3, v4_17);
                                }
                                int v16 = v3_1;
                                int v3_5 = p18.y;
                                if (v3_5 > 0) {
                                    v14_0 = Math.min(v3_5, v14_0);
                                }
                                if (!w.j.c(v9_5.o, 1)) {
                                    if ((v13_4 == 0) || (v6_1 == 0)) {
                                        if ((v11_9 != 0) && (v5_2 != 0)) {
                                            v14_0 = ((int) ((((float) v10_16) / p18.W) + 1056964608));
                                        }
                                    } else {
                                        v10_16 = ((int) ((((float) v14_0) * p18.W) + 1056964608));
                                    }
                                }
                                if ((v0_10 == v10_16) && (v4_17 == v14_0)) {
                                    v5_3 = v7_0;
                                    v3_4 = v10_16;
                                    v0_4 = 0;
                                } else {
                                    if (v0_10 != v10_16) {
                                        v8_1 = android.view.View$MeasureSpec.makeMeasureSpec(v10_16, 1073741824);
                                    }
                                    int v3_11;
                                    if (v4_17 == v14_0) {
                                        v3_11 = v16;
                                    } else {
                                        v3_11 = android.view.View$MeasureSpec.makeMeasureSpec(v14_0, 1073741824);
                                    }
                                    v12.measure(v8_1, v3_11);
                                    p18.G = v8_1;
                                    p18.H = v3_11;
                                    v0_4 = 0;
                                    p18.g = 0;
                                    v3_4 = v12.getMeasuredWidth();
                                    int v4_18 = v12.getMeasuredHeight();
                                    v5_3 = v12.getBaseline();
                                    v14_0 = v4_18;
                                }
                                v13_6 = -1;
                            }
                            int v4_19;
                            if (v5_3 == v13_6) {
                                v4_19 = v0_4;
                            } else {
                                v4_19 = 1;
                            }
                            if ((v3_4 == p19.c) && (v14_0 == p19.d)) {
                                int v7_2 = v0_4;
                            } else {
                                v7_2 = 1;
                            }
                            int v9_8;
                            p19.i = v7_2;
                            if (!v15_2.c0) {
                                v9_8 = v4_19;
                            } else {
                                v9_8 = 1;
                            }
                            if ((v9_8 != 0) && ((v5_3 != -1) && (p18.a0 != v5_3))) {
                                p19.i = 1;
                            }
                            p19.e = v3_4;
                            p19.f = v14_0;
                            p19.h = v9_8;
                            p19.g = v5_3;
                            return;
                        }
                    } else {
                        p19.e = p18.q();
                        p19.f = p18.k();
                        p19.g = p18.a0;
                        return;
                    }
                }
            } else {
                p19.e = 0;
                p19.f = 0;
                p19.g = 0;
                return;
            }
        }
        return;
    }
}
