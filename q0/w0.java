package q0;
public final class w0 implements android.view.View$OnApplyWindowInsetsListener {
    public final h3.k a;
    public q0.s1 b;

    public w0(android.view.View p2, h3.k p3)
    {
        q0.s1 v2_1;
        this.a = p3;
        q0.s1 v2_2 = q0.j0.a(p2);
        if (v2_2 == null) {
            v2_1 = 0;
        } else {
            q0.d1 v3_2;
            q0.d1 v3_6 = android.os.Build$VERSION.SDK_INT;
            if (v3_6 < 34) {
                if (v3_6 < 30) {
                    if (v3_6 < 29) {
                        v3_2 = new q0.d1(v2_2);
                    } else {
                        v3_2 = new q0.f1(v2_2);
                    }
                } else {
                    v3_2 = new q0.g1(v2_2);
                }
            } else {
                v3_2 = new q0.h1(v2_2);
            }
            v2_1 = v3_2.b();
        }
        this.b = v2_1;
        return;
    }

    public final android.view.WindowInsets onApplyWindowInsets(android.view.View p21, android.view.WindowInsets p22)
    {
        if (p21.isLaidOut()) {
            q0.s1 v3 = q0.s1.g(p21, p22);
            android.view.WindowInsets v1_15 = v3.a;
            if (this.b == null) {
                this.b = q0.j0.a(p21);
            }
            if (this.b != null) {
                int v2_11 = q0.x0.j(p21);
                if ((v2_11 == 0) || (!java.util.Objects.equals(((q0.s1) v2_11.c), v3))) {
                    q0.s1 v4_3 = new int[1];
                    int v5_1 = new int[1];
                    h0.b v7_0 = this.b;
                    android.animation.ValueAnimator v8_0 = 1;
                    while (v8_0 <= 512) {
                        q0.s1 v4_2;
                        int v18_0;
                        n0.a v9_3 = v1_15.f(v8_0);
                        int v11_1 = v7_0.a.f(v8_0);
                        int v12_0 = v9_3.a;
                        int v13_0 = v9_3.d;
                        int v14_0 = v9_3.c;
                        n0.a v9_4 = v9_3.b;
                        int v15_0 = v11_1.a;
                        int v2_5 = v11_1.d;
                        int v10_0 = v11_1.c;
                        int v11_2 = v11_1.b;
                        if ((v12_0 <= v15_0) && ((v9_4 <= v11_2) && ((v14_0 <= v10_0) && (v13_0 <= v2_5)))) {
                            v18_0 = v4_3;
                            v4_2 = 0;
                        } else {
                            v18_0 = v4_3;
                            v4_2 = 1;
                        }
                        if ((v12_0 >= v15_0) && ((v9_4 >= v11_2) && ((v14_0 >= v10_0) && (v13_0 >= v2_5)))) {
                            int v2_6 = 0;
                        } else {
                            v2_6 = 1;
                        }
                        if (v4_2 != v2_6) {
                            if (v4_2 == null) {
                                v5_1[0] = (v5_1[0] | v8_0);
                            } else {
                                v18_0[0] = (v18_0[0] | v8_0);
                            }
                        }
                        v8_0 <<= 1;
                        v4_3 = v18_0;
                    }
                    int v2_16 = v4_3[0];
                    q0.s1 v4_4 = v5_1[0];
                    int v5_2 = (v2_16 | v4_4);
                    if (v5_2 != 0) {
                        int v2_19;
                        h0.b v7_1 = this.b;
                        if ((v2_16 & 8) == 0) {
                            if ((v4_4 & 8) == 0) {
                                if ((v2_16 & 519) == 0) {
                                    if ((v4_4 & 519) == 0) {
                                        v2_19 = 0;
                                    } else {
                                        v2_19 = q0.x0.h;
                                    }
                                } else {
                                    v2_19 = q0.x0.g;
                                }
                            } else {
                                v2_19 = q0.x0.f;
                            }
                        } else {
                            v2_19 = q0.x0.e;
                        }
                        android.animation.ValueAnimator v8_4;
                        if ((v5_2 & 8) == 0) {
                            v8_4 = 250;
                        } else {
                            v8_4 = 160;
                        }
                        q0.s1 v4_6 = new q0.c1(v5_2, v2_19, v8_4);
                        v4_6.a.d(0);
                        int v2_22 = new float[2];
                        v2_22 = {0, 1065353216};
                        android.animation.ValueAnimator v8_8 = android.animation.ValueAnimator.ofFloat(v2_22).setDuration(v4_6.a.a());
                        android.view.WindowInsets v1_16 = v1_15.f(v5_2);
                        int v2_25 = v7_1.a.f(v5_2);
                        int v10_2 = v1_16.b;
                        int v11_3 = v2_25.b;
                        int v13_1 = v1_16.c;
                        int v14_1 = v2_25.c;
                        q0.c1 v16 = v4_6;
                        q0.s1 v4_7 = v1_16.d;
                        int v18_2 = v5_2;
                        int v5_3 = v2_25.d;
                        q0.s1 v19 = v7_1;
                        n0.a v9_2 = new n0.a(6, h0.b.b(Math.min(v1_16.a, v2_25.a), Math.min(v10_2, v11_3), Math.min(v13_1, v14_1), Math.min(v4_7, v5_3)), h0.b.b(Math.max(v1_16.a, v2_25.a), Math.max(v10_2, v11_3), Math.max(v13_1, v14_1), Math.max(v4_7, v5_3)));
                        q0.x0.f(p21, v3, 0);
                        int v2_2 = v16;
                        v8_8.addUpdateListener(new q0.v0(v2_2, v3, v19, v18_2, p21));
                        v8_8.addListener(new f2.n(v2_2, p21));
                        q0.v.a(p21, new n0.l(p21, v2_2, v9_2, v8_8));
                        this.b = v3;
                        return q0.x0.i(p21, p22);
                    } else {
                        this.b = v3;
                        return q0.x0.i(p21, p22);
                    }
                } else {
                    return q0.x0.i(p21, p22);
                }
            } else {
                this.b = v3;
                return q0.x0.i(p21, p22);
            }
        } else {
            this.b = q0.s1.g(p21, p22);
            return q0.x0.i(p21, p22);
        }
    }
}
