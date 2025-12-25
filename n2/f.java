package n2;
public final class f extends c4.b implements android.opengl.GLSurfaceView$Renderer {
    public boolean A;
    public boolean B;
    public float[] C;
    public float[] D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public final float I;
    public final android.content.SharedPreferences J;
    public final long K;
    public final int[] L;
    public long M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public Float S;
    public boolean T;
    public float U;
    public float V;
    public float W;
    public java.util.ArrayList X;
    public final android.content.Context c;
    public i2.v0 d;
    public int e;
    public int f;
    public n2.h g;
    public n2.p h;
    public final String i;
    public final String j;
    public final java.util.ArrayList k;
    public n2.e l;
    public n2.n m;
    public n2.m n;
    public n2.r o;
    public n2.s p;
    public n2.o q;
    public n2.q r;
    public n2.l s;
    public n2.b t;
    public n2.j u;
    public n2.t v;
    public n2.v w;
    public n2.i x;
    public int y;
    public boolean z;

    public f(android.content.Context p3, i2.v0 p4, android.content.SharedPreferences p5)
    {
        this.k = new java.util.ArrayList();
        this.x = new n2.i();
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.H = 1;
        this.L = new int[] {0, 1});
        this.M = -1;
        this.N = 1099258921;
        this.O = 1015222895;
        this.Q = 0;
        this.S = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = new java.util.ArrayList();
        this.c = p3.getApplicationContext();
        this.d = p4;
        this.J = p5;
        this.K = System.nanoTime();
        this.i = p3.getString(2131952057);
        this.j = p3.getString(2131951706);
        this.p = new n2.s(p3);
        try {
            i2.m.d().f(p3);
        } catch (java.io.IOException) {
        }
        this.I = i2.m.d().e("sky");
        return;
    }

    public static void q0(n2.g p1, android.graphics.Bitmap[] p2, float[] p3, float[] p4, float[] p5, float[] p6, float[] p7, float[] p8, float[] p9)
    {
        n2.a v0 = p1.a;
        v0.t = p5;
        v0.u = p6;
        v0.v = p7;
        v0.w = p8;
        v0.x = p9;
        v0.r = 0;
        v0.s = 0;
        v0.k0();
        v0.l0(p2);
        v0.k0();
        n2.h v1_1 = p1.b;
        v1_1.p0(p3);
        v1_1.o0(p4[0], p4[1], p4[2]);
        return;
    }

    public static void t0(n2.g p6, android.graphics.Bitmap p7, float[] p8, float[] p9, float p10, float p11, float p12, float p13, float p14)
    {
        n2.h v0 = p6.b;
        float v6_1 = p6.a;
        v6_1.l0(new android.graphics.Bitmap[] {p7}));
        float v1 = (p10 / 1065353216);
        float v2 = (p11 / 1065353216);
        v6_1.r = v1;
        v6_1.s = v2;
        v6_1.k0();
        v6_1.k0();
        v0.n0(v1, v2, p12, (p13 / 1065353216), (p14 / 1065353216));
        v0.p0(p8);
        v0.o0(p9[0], p9[1], p9[2]);
        return;
    }

    public final void k0()
    {
        if (this.g != null) {
            this.l0(0);
        }
        this.k.clear();
        android.content.Context v2 = this.c;
        this.g = new n2.h(v2, 0);
        this.l = new n2.e(this.c, this, this.d, this.J, this.K);
        this.m = new n2.n(v2);
        android.content.SharedPreferences v1_1 = this.J;
        this.n = new n2.m(v2, v1_1);
        this.o = new n2.r(v2, this);
        this.q = new n2.o(v2);
        n2.i v0_10 = new n2.q(this, v2, this.A, v1_1);
        this.r = v0_10;
        if (this.h == null) {
            this.h = new n2.p(v2, v0_10, v1_1);
        }
        this.s = new n2.l(v2, v1_1);
        this.t = new n2.b(v2);
        this.v = new n2.t(v2, v1_1);
        if (!m2.a.d()) {
            this.u = 0;
        } else {
            this.u = new n2.j(v2, v1_1);
        }
        this.w = new n2.v(v2, v1_1);
        if (this.x == null) {
            n2.i v0_27 = new n2.i();
            this.x = v0_27;
            v0_27.k0(v2, v1_1);
        }
        return;
    }

    public final void l0(boolean p7)
    {
        int v0_0 = 0;
        java.nio.FloatBuffer[] v1_0 = 0;
        while(true) {
            int v2_13 = this.k;
            if (v1_0 >= v2_13.size()) {
                break;
            }
            int v2_11 = ((n2.g) v2_13.get(v1_0));
            java.util.ArrayList v3_0 = v2_11.b;
            c4.b.k(0);
            c4.b.k(v3_0.k);
            v3_0.k = 0;
            c4.b.i(v3_0.d);
            v3_0.d = 0;
            c4.b.i(v3_0.e);
            v3_0.e = 0;
            c4.b.j(v3_0.f);
            v3_0.f = 0;
            int v2_12 = v2_11.a;
            java.util.ArrayList v3_1 = v2_12.d;
            if (v3_1 != null) {
                android.opengl.GLES20.glDeleteTextures(v3_1.length, v3_1, 0);
            }
            v2_12.d = 0;
            c4.b.i(v2_12.k);
            v2_12.k = 0;
            c4.b.i(v2_12.l);
            v2_12.k = 0;
            c4.b.j(v2_12.c);
            v2_12.c = 0;
            java.util.ArrayList v3_5 = v2_12.D;
            if (v3_5 != null) {
                c4.b.i(v3_5.g);
                v3_5.g = 0;
                c4.b.j(v3_5.c);
                v3_5.c = 0;
                int v5_7 = v3_5.h;
                if (v5_7 != 0) {
                    v5_7.clear();
                }
                int v5_8 = v3_5.i;
                if (v5_8 != 0) {
                    v5_8.clear();
                }
                v3_5.h = 0;
                v3_5.i = 0;
            }
            v2_12.D = 0;
            v1_0++;
        }
        java.nio.FloatBuffer[] v1_19 = this.m;
        if (v1_19 != null) {
            c4.b.i(v1_19.c);
            c4.b.j(v1_19.d);
            v1_19.r = 0;
        }
        java.nio.FloatBuffer[] v1_7 = this.n;
        if (v1_7 != null) {
            c4.b.j(v1_7.i);
            c4.b.k(v1_7.j);
        }
        java.nio.FloatBuffer[] v1_14 = this.o;
        if (v1_14 != null) {
            c4.b.i(v1_14.h);
            v1_14.h = 0;
            c4.b.i(v1_14.i);
            v1_14.i = 0;
            c4.b.i(v1_14.g);
            v1_14.g = 0;
            c4.b.j(v1_14.j);
            c4.b.j(v1_14.k);
            v1_14.j = 0;
            v1_14.k = 0;
            v1_14.m = 0;
            v1_14.n = 0;
        }
        java.nio.FloatBuffer[] v1_15 = this.q;
        if (v1_15 != null) {
            int v2_19 = v1_15.f;
            if (v2_19 != 0) {
                v2_19.clear();
                v1_15.f = 0;
            }
            int v2_20 = v1_15.c;
            if (v2_20 != 0) {
                android.opengl.GLES20.glDeleteProgram(v2_20);
                v1_15.c = 0;
            }
            v1_15.h = 0;
        }
        java.nio.FloatBuffer[] v1_16 = this.r;
        if (v1_16 != null) {
            c4.b.k(v1_16.g);
            c4.b.i(v1_16.c);
            c4.b.i(v1_16.d);
            c4.b.j(v1_16.f);
        }
        java.nio.FloatBuffer[] v1_18 = this.l;
        if (v1_18 != null) {
            int v2_24 = v1_18.G;
            java.util.ArrayList v3_7 = v1_18.w;
            v2_24.getClass();
            v2_24.X = new java.util.ArrayList(v3_7);
            c4.b.j(v1_18.c);
            int v2_26 = v1_18.s;
            if (v2_26 != 0) {
                android.opengl.GLES20.glDeleteTextures(v2_26.length, v2_26, 0);
            }
            c4.b.i(v1_18.q);
            c4.b.i(v1_18.r);
            v3_7.clear();
        }
        java.nio.FloatBuffer[] v1_21 = this.s;
        if (v1_21 != null) {
            c4.b.j(v1_21.e);
            c4.b.k(v1_21.f);
        }
        java.nio.FloatBuffer[] v1_23 = this.t;
        if (v1_23 != null) {
            android.opengl.GLES20.glDeleteProgram(v1_23.e);
        }
        java.nio.FloatBuffer[] v1_25 = this.u;
        if (v1_25 != null) {
            c4.b.j(v1_25.d);
            c4.b.k(v1_25.e);
            c4.b.i(v1_25.f);
            c4.b.i(v1_25.g);
        }
        java.nio.FloatBuffer[] v1_27 = this.v;
        if (v1_27 != null) {
            c4.b.j(v1_27.g);
            c4.b.k(0);
            c4.b.i(v1_27.h);
            c4.b.i(v1_27.i);
        }
        java.nio.FloatBuffer[] v1_2 = this.w;
        if (v1_2 != null) {
            c4.b.j(v1_2.c);
            c4.b.i(v1_2.o);
            java.nio.FloatBuffer[] v1_3 = v1_2.p;
            if (v1_3 != null) {
                v1_3.clear();
            }
        }
        java.nio.FloatBuffer[] v1_4 = this.x;
        if (v1_4 != null) {
            c4.b.i(v1_4.k);
            c4.b.j(v1_4.l);
        }
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.q = 0;
        this.r = 0;
        this.l = 0;
        this.s = 0;
        this.t = 0;
        this.v = 0;
        this.x = 0;
        if (p7 != 0) {
            int v7_1 = this.p;
            if (v7_1 != 0) {
                java.nio.FloatBuffer[] v1_6 = v7_1.o;
                if (v1_6 != null) {
                    android.opengl.GLES20.glDeleteTextures(v1_6.length, v1_6, 0);
                }
                java.nio.FloatBuffer[] v1_8 = v7_1.p;
                if (v1_8 != null) {
                    android.opengl.GLES20.glDeleteTextures(v1_8.length, v1_8, 0);
                }
                if (v7_1.l != null) {
                    while(true) {
                        java.nio.FloatBuffer[] v1_10 = v7_1.l;
                        if (v0_0 >= v1_10.length) {
                            break;
                        }
                        c4.b.i(v1_10[v0_0]);
                        v7_1.l[v0_0] = 0;
                        v0_0++;
                    }
                }
                c4.b.i(v7_1.m);
                v7_1.m = 0;
                c4.b.j(v7_1.n);
                v7_1.r = 0;
                v7_1.s = 0;
                v7_1.t = 0;
            }
            this.p = 0;
            int v7_2 = this.h;
            if (v7_2 != 0) {
                c4.b.i(v7_2.g);
                v7_2.g = 0;
                c4.b.i(v7_2.f);
                v7_2.f = 0;
                c4.b.j(v7_2.h);
            }
            this.h = 0;
        }
        return;
    }

    public final void m0(int p5)
    {
        java.util.ArrayList v0 = this.k;
        if (v0.size() > p5) {
            int v1_2 = (v0.size() - p5);
            int v2 = 1;
            while (v2 < v1_2) {
                v0.remove((v0.size() - 1));
                v2++;
            }
        }
        return;
    }

    public final void n0()
    {
        int v21_0;
        int v19_1;
        int v22_0;
        int v18_0;
        int v23_1;
        int v20_2;
        int v0_0 = this.d;
        int v2_53 = v0_0.l1;
        if ((v2_53 != 0) && (v2_53.Q)) {
            if (!v0_0.I1) {
                v18_0 = 1008981770;
            } else {
                int v2_50 = v0_0.J0;
                if (v2_50 == 0) {
                } else {
                    v18_0 = 1008981770;
                    if (v2_50.length != 0) {
                        int v2_54 = v2_50.length;
                        float v14_27 = 0;
                        while (v14_27 < v2_54) {
                            int v6_25 = v0_0.J0[v14_27];
                            if ((v6_25 != 0) && (!v6_25.isRecycled())) {
                                v0_0.S1[v14_27] = v0_0.J0[v14_27].getWidth();
                                v0_0.T1[v14_27] = v0_0.J0[v14_27].getHeight();
                            }
                            v14_27++;
                        }
                    }
                }
            }
            v19_1 = 1056964608;
            v20_2 = 2;
            if (v0_0.K1) {
                v0_0.v();
                v0_0.J1 = 1;
            }
            if (v0_0.L1) {
                v0_0.n(v0_0.M1, 0);
            }
            if ((v0_0.J1) || (v0_0.I1)) {
                v0_0.w();
                v0_0.z();
                v0_0.A();
                v0_0.B();
                v0_0.b();
                v0_0.h();
                v0_0.x();
                v0_0.f();
                if (v0_0.a1 == 9) {
                    int v6_38 = v0_0.b.v;
                    if (v6_38 != 0) {
                        v6_38.l0(v0_0);
                    }
                }
            }
            int v2_58;
            v0_0.p();
            if (!v0_0.J1) {
                v23_1 = 1;
                v2_58 = 0;
                v21_0 = 4;
                v22_0 = 0;
            } else {
                if (!v0_0.b.A) {
                    v0_0.f();
                }
                int v28_2;
                int v24_0;
                int v2_112 = v0_0.b.l;
                if (v2_112 == 0) {
                    v23_1 = 1;
                    v28_2 = 0;
                    v21_0 = 4;
                    v22_0 = 0;
                    v24_0 = 1065353216;
                } else {
                    int v6_2 = v0_0.Q;
                    float v12_1 = v0_0.c1[0];
                    float v14_0 = v12_1[0];
                    float v12_2 = v12_1[1];
                    v21_0 = 4;
                    float v7_7 = v2_112.w;
                    v22_0 = 0;
                    int v8_10 = v2_112.Z;
                    v23_1 = 1;
                    System.arraycopy(v6_2, 0, v8_10, 0, v6_2.length);
                    int v3_8 = v2_112.I;
                    v24_0 = 1065353216;
                    v2_112.J = (((float) v3_8.getInt(v2_112.M, 50)) * v18_0);
                    if (v2_112.a0 == 5) {
                        v28_2 = 0;
                        v2_112.V = v14_0;
                        v2_112.W = v12_2;
                    } else {
                        float v13_11;
                        float v4_7;
                        int v6_10 = v2_112.F;
                        int v9_18 = v6_10.j();
                        float v12_3 = v9_18[0];
                        float v14_7 = v9_18[1];
                        float v25_1 = v9_18[2];
                        float v26_1 = v9_18[3];
                        int v9_19 = v9_18[4];
                        int v3_27 = v3_8.getBoolean("isSnowing", 0);
                        float v5_31 = v2_112.H.b(0)[0];
                        v28_2 = 0;
                        int v10_4 = v2_112.J;
                        if (v6_10.a1 == 3) {
                            v4_7 = v2_112.U;
                            v13_11 = v2_112.T;
                        } else {
                            v4_7 = v2_112.S;
                            v13_11 = v2_112.Q;
                        }
                        n2.s v32_2;
                        int v6_23 = v6_10.l();
                        float v11_8 = v2_112.a0;
                        if (v11_8 != 9) {
                            v32_2 = 1065353216;
                        } else {
                            v32_2 = 1073741824;
                        }
                        int v3_44;
                        int v8_22;
                        int v9_21;
                        float v12_10;
                        float v11_9;
                        float v4_13;
                        float v5_35;
                        int v8_20;
                        int v3_53;
                        int v10_8;
                        float v5_37;
                        if (v12_3 == 0) {
                            if (v14_7 == 0) {
                                if (v25_1 == 0) {
                                    if ((v26_1 == 0) || (v9_19 != 0)) {
                                        if (v9_19 == 0) {
                                            float v4_11 = v8_10[2];
                                            v2_112.W = v4_11;
                                            if ((v5_31 == 0) || (v3_27 != 0)) {
                                                if (v3_27 == 0) {
                                                    v2_112.V = v13_11;
                                                } else {
                                                    v2_112.V = v4_11;
                                                }
                                            } else {
                                                v2_112.V = v4_11;
                                                v2_112.W = v4_11;
                                            }
                                            if (v2_112.J != 0) {
                                                v2_112.V = i2.l.d(v13_11, v2_112.V, ((double) v10_4));
                                            }
                                        } else {
                                            float v5_34;
                                            int v3_42;
                                            int v9_20 = v6_23[2];
                                            if ((v5_31 == 0) || (v3_27 != 0)) {
                                                if (v3_27 == 0) {
                                                    v5_34 = 5;
                                                    if (v11_8 == 5) {
                                                        v4_7 = v8_10[1];
                                                    }
                                                    v3_42 = v4_7;
                                                } else {
                                                    v3_42 = v8_10[2];
                                                    v13_11 = v3_42;
                                                    v5_34 = 5;
                                                }
                                            } else {
                                                v3_42 = v8_10[2];
                                            }
                                            if (v11_8 != v5_34) {
                                                if (v11_8 != 0) {
                                                    v4_13 = v8_10[2];
                                                } else {
                                                    v4_13 = v8_10[2];
                                                }
                                                v8_20 = v3_42;
                                                v5_35 = v4_13;
                                            } else {
                                                v4_13 = v8_10[1];
                                                v5_35 = v8_10[2];
                                                v8_20 = v3_42;
                                            }
                                            v11_9 = v9_20;
                                            v12_10 = (v9_20 + v32_2);
                                            v9_21 = v13_11;
                                            v3_44 = 0;
                                            if (v3_44 == 0) {
                                                v2_112.V = i2.l.f(v8_20, v9_21, v6_23[1], v11_9, v12_10, 1065353216);
                                                v2_112.W = i2.l.f(v4_13, v5_35, v6_23[1], v11_9, v12_10, 1065353216);
                                            }
                                            int v3_56 = v2_112.b0;
                                            if ((v3_56 != 0) && (v3_56.toLowerCase().contains(v2_112.K.toLowerCase()))) {
                                                int v3_59 = v2_112.V;
                                                v2_112.V = v2_112.W;
                                                v2_112.W = v3_59;
                                            }
                                            v2_112.V = i2.l.e(v2_112.V);
                                            v2_112.W = i2.l.e(v2_112.W);
                                            v2_112.g0 = i2.l.h(v2_112.V);
                                            v2_112.h0 = i2.l.h(v2_112.W);
                                            int v3_68 = v28_2;
                                            while (v3_68 < v7_7.size()) {
                                                v2_112.k0(((n2.c) v7_7.get(v3_68)));
                                                v3_68++;
                                            }
                                            int v6_33;
                                            int v2_55 = v0_0.b;
                                            int v3_69 = v0_0.j();
                                            float v4_21 = v2_55.k;
                                            int v6_28 = v2_55.c;
                                            float v5_42 = ((((float) v2_55.J.getInt(v6_28.getString(2131951876), 100)) * v18_0) * 1036831949);
                                            int v6_30 = m2.a.c(v6_28, v2_55.y)[3];
                                            if (v3_69[v28_2] == 0) {
                                                int v3_71;
                                                if (v3_69[v23_1] == 0) {
                                                    if ((v3_69[2] != 0) || (v3_69[3] == 0)) {
                                                        v6_33 = (v5_42 * 1045220557);
                                                        if (v2_55.y == 5) {
                                                            v6_33 *= 1056964608;
                                                        }
                                                        int v3_73 = v2_55.g;
                                                        float v5_45 = (1053609165 * v6_33);
                                                        v3_73.getClass();
                                                        float v7_37 = v24_0;
                                                        v3_73.E = Math.max(v7_37, (v5_45 + v24_0));
                                                        int v2_56 = v2_55.l;
                                                        int v3_74 = (v6_33 * 1056964608);
                                                        v2_56.getClass();
                                                        v2_56.X = Math.max(v7_37, (v3_74 + v7_37));
                                                        int v2_57 = v28_2;
                                                        while (v2_57 < v4_21.size()) {
                                                            ((n2.g) v4_21.get(v2_57)).b.E = Math.max(v7_37, (v6_33 + v7_37));
                                                            v2_57++;
                                                            v7_37 = 1065353216;
                                                        }
                                                        v2_58 = v28_2;
                                                        v0_0.J1 = v2_58;
                                                        if (v0_0.I1) {
                                                            v0_0.b.r.k0(v0_0, v0_0.g);
                                                        }
                                                        v0_0.K1 = v2_58;
                                                        v0_0.L1 = v2_58;
                                                        v0_0.M1 = v2_58;
                                                        float v25_2;
                                                        this.g.l0(0);
                                                        int v0_7 = this.u;
                                                        float v5_15 = 3553;
                                                        int v6_20 = 33984;
                                                        float v7_25 = 771;
                                                        int v8_16 = 3042;
                                                        if (v0_7 == 0) {
                                                            v25_2 = 4614256656552045848;
                                                        } else {
                                                            int v9_29 = v0_7.m;
                                                            if ((v0_7.d != 0) && ((v0_7.e != 0) && (v0_7.v))) {
                                                                android.opengl.GLES20.glEnable(3042);
                                                                android.opengl.GLES20.glBlendFunc(v23_1, 771);
                                                                c4.b.g0(v0_7.d, v0_7.m, v0_7.n, v0_7.o, -1055286886);
                                                                android.opengl.GLES20.glUseProgram(v0_7.d);
                                                                int v10_29 = (((((float) Math.sin((((double) (((((float) System.nanoTime()) / 1315859240) * v19_1) * 1073741824)) * 4614256656552045848))) * 1028443341) + 1065353216) * 1041865114);
                                                                android.opengl.Matrix.setIdentityM(v9_29, 0);
                                                                v25_2 = 4614256656552045848;
                                                                android.opengl.Matrix.translateM(v9_29, 0, v0_7.p, v0_7.q, v22_0);
                                                                android.opengl.Matrix.scaleM(v9_29, 0, (v10_29 * 1065353216), v10_29, 1065353216);
                                                                android.opengl.Matrix.multiplyMM(v0_7.o, 0, v0_7.n, 0, v0_7.m, 0);
                                                                android.opengl.GLES20.glUniformMatrix4fv(v0_7.j, 1, 0, v0_7.o, 0);
                                                                android.opengl.GLES20.glUniform1f(v0_7.l, v0_7.w);
                                                                android.opengl.GLES20.glEnableVertexAttribArray(v0_7.h);
                                                                v0_7.f.position(0);
                                                                android.opengl.GLES20.glVertexAttribPointer(v0_7.h, 3, 5126, 0, 12, v0_7.f);
                                                                android.opengl.GLES20.glEnableVertexAttribArray(v0_7.i);
                                                                v0_7.g.position(0);
                                                                android.opengl.GLES20.glVertexAttribPointer(v0_7.i, 2, 5126, 0, 8, v0_7.g);
                                                                android.opengl.GLES20.glActiveTexture(33984);
                                                                android.opengl.GLES20.glBindTexture(3553, v0_7.e);
                                                                android.opengl.GLES20.glUniform1i(v0_7.k, 0);
                                                                android.opengl.GLES20.glDrawArrays(5, 0, v21_0);
                                                                android.opengl.GLES20.glDisableVertexAttribArray(v0_7.h);
                                                                android.opengl.GLES20.glDisableVertexAttribArray(v0_7.i);
                                                                android.opengl.GLES20.glDisable(3042);
                                                            }
                                                        }
                                                        float v12_22;
                                                        android.opengl.GLES20.glEnable(2929);
                                                        int v0_10 = this.h;
                                                        int v2_80 = v0_10.E;
                                                        int v3_90 = v0_10.A;
                                                        android.opengl.GLES20.glEnable(3042);
                                                        android.opengl.GLES20.glBlendFunc(770, 771);
                                                        android.opengl.GLES20.glUseProgram(v0_10.h);
                                                        c4.b.g0(v0_10.h, v0_10.W, v0_10.X, v0_10.Y, v0_10.R);
                                                        if (v0_10.G) {
                                                            v12_22 = 0;
                                                        } else {
                                                            v0_10.f.position(0);
                                                            android.opengl.GLES20.glVertexAttribPointer(v0_10.i, 2, 5126, 0, 16, v0_10.f);
                                                            android.opengl.GLES20.glEnableVertexAttribArray(v0_10.i);
                                                            v0_10.f.position(v20_2);
                                                            android.opengl.GLES20.glVertexAttribPointer(v0_10.j, 1, 5126, 0, 16, v0_10.f);
                                                            android.opengl.GLES20.glEnableVertexAttribArray(v0_10.j);
                                                            v0_10.f.position(3);
                                                            android.opengl.GLES20.glVertexAttribPointer(v0_10.k, 1, 5126, 0, 16, v0_10.f);
                                                            android.opengl.GLES20.glEnableVertexAttribArray(v0_10.k);
                                                            android.opengl.GLES20.glUniform1i(v0_10.q, 1);
                                                            v12_22 = 0;
                                                            android.opengl.GLES20.glDrawArrays(0, 0, 7500);
                                                        }
                                                        float v13_17;
                                                        float v11_24;
                                                        android.opengl.GLES20.glDisableVertexAttribArray(v0_10.k);
                                                        v0_10.g.position(v12_22);
                                                        android.opengl.GLES20.glVertexAttribPointer(v0_10.i, 2, 5126, 0, 16, v0_10.g);
                                                        android.opengl.GLES20.glEnableVertexAttribArray(v0_10.i);
                                                        v0_10.g.position(2);
                                                        android.opengl.GLES20.glVertexAttribPointer(v0_10.j, 1, 5126, 0, 16, v0_10.g);
                                                        android.opengl.GLES20.glEnableVertexAttribArray(v0_10.j);
                                                        android.opengl.GLES20.glUniform1i(v0_10.q, 0);
                                                        if (v0_10.G) {
                                                            v11_24 = 2;
                                                            v13_17 = 1;
                                                        } else {
                                                            android.opengl.GLES20.glLineWidth(v3_90[0]);
                                                            v13_17 = 1;
                                                            android.opengl.GLES20.glUniform4fv(v0_10.l, 1, v2_80[0], 0);
                                                            v11_24 = 2;
                                                            android.opengl.GLES20.glDrawArrays(1, 0, 2);
                                                        }
                                                        int v18_1;
                                                        android.opengl.GLES20.glLineWidth(v3_90[v13_17]);
                                                        android.opengl.GLES20.glUniform4fv(v0_10.l, v13_17, v2_80[v13_17], 0);
                                                        android.opengl.GLES20.glDrawArrays(v13_17, v11_24, v11_24);
                                                        android.opengl.GLES20.glUseProgram(0);
                                                        android.opengl.GLES20.glDisable(3042);
                                                        int v0_12 = this.r;
                                                        int v2_84 = v0_12.z;
                                                        if ((v0_12.G) && (v2_84[3] >= v18_0)) {
                                                            android.opengl.GLES20.glUseProgram(v0_12.f);
                                                            android.opengl.GLES20.glEnable(3042);
                                                            android.opengl.GLES20.glBlendFunc(1, 771);
                                                            int v3_96 = v0_12.x;
                                                            float v4_26 = v0_12.x;
                                                            float v12_26 = (1064933786 * v4_26);
                                                            float v4_28 = ((v4_26 - v12_26) / 1073741824);
                                                            float v4_32 = g2.g.b((((v4_28 * ((float) Math.sin(((double) ((float) (((double) ((((((float) System.nanoTime()) / 1315859240) * 1048576000) % 1065353216) * 1073741824)) * v25_2)))))) + (v12_26 + v4_28)) * 1048576000), v0_12.J0, 1065353216, v0_12.J0);
                                                            v0_12.J0 = v4_32;
                                                            float v4_34 = v0_12.s;
                                                            float v11_35 = ((v4_34 / 1132462080) * ((v3_96 * v4_32) * 1057803469));
                                                            float v4_35 = (v4_34 * v19_1);
                                                            int v10_64 = (1132462080 * v11_35);
                                                            float v4_36 = (v10_64 / v4_35);
                                                            int v10_65 = (v10_64 / (v4_35 / v0_12.t));
                                                            float v12_29 = Math.toRadians(((double) (- v0_12.l0)));
                                                            v18_1 = 33985;
                                                            android.opengl.GLES20.glUniform2f(v0_12.n0, ((float) Math.cos(v12_29)), ((float) Math.sin(v12_29)));
                                                            android.opengl.GLES20.glUniform1f(v0_12.s0, v0_12.v);
                                                            android.opengl.GLES20.glUniform1f(v0_12.t0, (1084227584 - (v0_12.v * 1084227584)));
                                                            android.opengl.GLES20.glEnableVertexAttribArray(v0_12.m0);
                                                            android.opengl.GLES20.glVertexAttribPointer(v0_12.m0, 2, 5126, 0, 0, v0_12.c);
                                                            android.opengl.GLES20.glEnableVertexAttribArray(v0_12.o0);
                                                            android.opengl.GLES20.glVertexAttribPointer(v0_12.o0, 2, 5126, 0, 0, v0_12.d);
                                                            android.opengl.GLES20.glUniform2f(v0_12.n0, 1065353216, 0);
                                                            android.opengl.GLES20.glUniform2f(v0_12.p0, v0_12.j, v0_12.k);
                                                            android.opengl.GLES20.glUniform2f(v0_12.q0, v4_36, v10_65);
                                                            android.opengl.GLES20.glUniform1f(v0_12.u0, v0_12.k);
                                                            android.opengl.GLES20.glUniform1f(v0_12.v0, v11_35);
                                                            android.opengl.GLES20.glUniform1f(v0_12.w0, v0_12.u);
                                                            android.opengl.GLES20.glUniform4fv(v0_12.x0, 1, v2_84, 0);
                                                            android.opengl.GLES20.glActiveTexture(33984);
                                                            android.opengl.GLES20.glBindTexture(3553, v0_12.g);
                                                            android.opengl.GLES20.glUniform1i(v0_12.r0, 0);
                                                            android.opengl.GLES20.glActiveTexture(33985);
                                                            android.opengl.GLES20.glBindTexture(3553, v0_12.A0);
                                                            android.opengl.GLES20.glUniform1i(v0_12.B0, 1);
                                                            android.opengl.GLES20.glUniform1f(v0_12.C0, v0_12.t);
                                                            c4.b.g0(v0_12.f, v0_12.c0, v0_12.d0, v0_12.e0, v0_12.w);
                                                            android.opengl.GLES20.glDrawArrays(5, 0, 4);
                                                            android.opengl.GLES20.glDisableVertexAttribArray(v0_12.m0);
                                                            android.opengl.GLES20.glDisableVertexAttribArray(v0_12.o0);
                                                            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
                                                            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
                                                            android.opengl.GLES20.glActiveTexture(33984);
                                                            android.opengl.GLES20.glBindTexture(3553, 0);
                                                            android.opengl.GLES20.glUseProgram(0);
                                                            android.opengl.GLES20.glDisable(3042);
                                                        } else {
                                                            v18_1 = 33985;
                                                        }
                                                        android.opengl.GLES20.glDisable(3042);
                                                        int v0_18 = this.x;
                                                        int v2_94 = v0_18.c;
                                                        if (v0_18.G) {
                                                            int v2_106;
                                                            android.opengl.GLES20.glUseProgram(v0_18.l);
                                                            android.opengl.Matrix.setIdentityM(v2_94, 0);
                                                            android.opengl.Matrix.translateM(v2_94, 0, v0_18.w, v0_18.x, -1055496602);
                                                            android.opengl.Matrix.scaleM(v2_94, 0, v19_1, v19_1, 1065353216);
                                                            android.opengl.Matrix.rotateM(v0_18.c, 0, v0_18.y, 0, 0, 1065353216);
                                                            android.opengl.Matrix.multiplyMM(v0_18.e, 0, v0_18.d, 0, v0_18.c, 0);
                                                            android.opengl.GLES20.glUniformMatrix4fv(v0_18.n, 1, 0, v0_18.e, 0);
                                                            android.opengl.GLES20.glUniform4fv(v0_18.o, 1, v0_18.B, 0);
                                                            android.opengl.GLES20.glUniform1f(v0_18.p, v0_18.z);
                                                            android.opengl.GLES20.glUniform1f(v0_18.q, v0_18.A);
                                                            android.opengl.GLES20.glUniform1f(v0_18.s, v0_18.C);
                                                            android.opengl.GLES20.glUniform1f(v0_18.t, v0_18.D);
                                                            android.opengl.GLES20.glUniform1f(v0_18.u, v0_18.E);
                                                            android.opengl.GLES20.glUniform1f(v0_18.v, v0_18.F);
                                                            int v2_105 = v0_18.j;
                                                            if (v2_105 <= 0) {
                                                                v2_106 = 981668463;
                                                            } else {
                                                                v2_106 = (1065353216 / v2_105);
                                                            }
                                                            android.opengl.GLES20.glUniform1f(v0_18.r, v2_106);
                                                            android.opengl.GLES20.glEnableVertexAttribArray(v0_18.m);
                                                            android.opengl.GLES20.glVertexAttribPointer(v0_18.m, 3, 5126, 0, 12, v0_18.k);
                                                            android.opengl.GLES20.glEnable(3042);
                                                            android.opengl.GLES20.glBlendFunc(770, 771);
                                                            android.opengl.GLES20.glDrawArrays(5, 0, 4);
                                                            android.opengl.GLES20.glDisable(3042);
                                                            android.opengl.GLES20.glDisableVertexAttribArray(v0_18.m);
                                                        }
                                                        n2.s v32_1;
                                                        float v26_2;
                                                        android.opengl.GLES20.glEnable(3042);
                                                        int v2_35 = 6;
                                                        if ((this.d.I1) || (!this.d.l1.Q)) {
                                                            v32_1 = 6;
                                                            v26_2 = 3042;
                                                        } else {
                                                            int v0_25 = this.y;
                                                            if ((v0_25 != 6) && (v0_25 != 9)) {
                                                                int v0_1 = 0;
                                                                while (v0_1 < this.k.size()) {
                                                                    if ((v0_1 < this.C.length) && (v0_1 < this.D.length)) {
                                                                        if (!this.H) {
                                                                            float v4_67 = this.L;
                                                                            float v11_41 = 0;
                                                                            while (v11_41 < v4_67.length) {
                                                                                if (v4_67[v11_41] != v0_1) {
                                                                                    v11_41++;
                                                                                }
                                                                            }
                                                                            n2.s v32_0 = v2_35;
                                                                            float v25_0 = v6_20;
                                                                            float v26_0 = v8_16;
                                                                            int v10 = 5;
                                                                            int v19 = 9;
                                                                            int v23 = 1;
                                                                            int v27 = 1045220557;
                                                                            v0_1++;
                                                                            v6_20 = v25_0;
                                                                            v8_16 = v26_0;
                                                                            v2_35 = v32_0;
                                                                            v5_15 = 3553;
                                                                            v7_25 = 771;
                                                                        }
                                                                        float v15_10;
                                                                        float v4_70 = ((n2.g) this.k.get(v0_1));
                                                                        int v10_76 = v4_70.b;
                                                                        float v12_51 = this.D[v0_1];
                                                                        float v13_29 = v10_76.h;
                                                                        float v14_40 = v10_76.g;
                                                                        if (v13_29 <= v14_40) {
                                                                            v15_10 = 1065353216;
                                                                        } else {
                                                                            v15_10 = 1055286886;
                                                                        }
                                                                        int v10_80;
                                                                        v10_76.F = (((- this.C[v0_1]) / v14_40) * v15_10);
                                                                        v10_76.G = (((- v12_51) / v13_29) * 1083179008);
                                                                        float v11_50 = v4_70.a;
                                                                        v11_50.y = v10_76;
                                                                        int v10_77 = this.y;
                                                                        if (((v10_77 == 3) || ((v10_77 == 5) && (v0_1 == this.E))) || ((this.G) && (v0_1 == 0))) {
                                                                            v10_80 = 0;
                                                                        } else {
                                                                            v10_80 = 1;
                                                                        }
                                                                        float v12_55 = this.B;
                                                                        float v13_30 = v11_50.h;
                                                                        float v14_41 = v11_50.g;
                                                                        if (!v11_50.e) {
                                                                            v32_0 = v2_35;
                                                                            v25_0 = v6_20;
                                                                            v26_0 = v8_16;
                                                                            v10 = 5;
                                                                        } else {
                                                                            float v15_12 = v11_50.d;
                                                                            if ((v15_12 != 0) && (v15_12.length != 0)) {
                                                                                int v3_3;
                                                                                android.opengl.GLES20.glUseProgram(v11_50.c);
                                                                                v25_0 = v6_20;
                                                                                v26_0 = v8_16;
                                                                                android.opengl.GLES20.glUniformMatrix4fv(v11_50.f, 1, 0, v11_50.o, 0);
                                                                                android.opengl.GLES20.glBlendFunc(1, v7_25);
                                                                                android.opengl.GLES20.glUniform1f(v11_50.j, 1065353216);
                                                                                int v3_1 = v11_50.A;
                                                                                int v6_1 = v11_50.z;
                                                                                if (v3_1 <= v6_1) {
                                                                                    v3_3 = (((float) v6_1) / ((float) v3_1));
                                                                                } else {
                                                                                    v3_3 = (((float) v3_1) / ((float) v6_1));
                                                                                }
                                                                                int v3_5 = (v3_3 * ((float) v6_1));
                                                                                int v6_4 = ((float) v0_1);
                                                                                int v8_3 = (v6_4 + 1065353216);
                                                                                v32_0 = v2_35;
                                                                                float v15_0 = 0;
                                                                                while (v15_0 < v11_50.d.length) {
                                                                                    int v2_11;
                                                                                    android.opengl.GLES20.glEnableVertexAttribArray(v14_41);
                                                                                    android.opengl.GLES20.glEnableVertexAttribArray(v13_30);
                                                                                    android.opengl.GLES20.glActiveTexture(v25_0);
                                                                                    android.opengl.GLES20.glBindTexture(v5_15, v11_50.d[v15_0]);
                                                                                    android.opengl.GLES20.glUniform1i(v11_50.i, 0);
                                                                                    android.opengl.GLES20.glVertexAttribPointer(v11_50.h, 2, 5126, 0, 0, v11_50.l);
                                                                                    int v2_10 = v11_50.t[v15_0];
                                                                                    if (v11_50.d.length <= 1) {
                                                                                        v2_11 = (v2_10 + v11_50.B[v0_1]);
                                                                                        int v37_3 = v2_11;
                                                                                        int v39_3 = v8_3;
                                                                                        n2.h v38_3 = (v11_50.u[v15_0] - v11_50.C[v0_1]);
                                                                                        int v2_19 = (v38_3 + v11_50.x[v15_0]);
                                                                                        float v5_7 = (v37_3 + v11_50.w[v15_0]);
                                                                                        float v7_20 = new float[12];
                                                                                        v7_20[0] = v37_3;
                                                                                        v7_20[1] = v38_3;
                                                                                        v7_20[2] = 0;
                                                                                        v7_20[3] = v37_3;
                                                                                        v7_20[4] = v2_19;
                                                                                        v7_20[5] = 0;
                                                                                        v7_20[v32_0] = v5_7;
                                                                                        v7_20[7] = v38_3;
                                                                                        v7_20[8] = 0;
                                                                                        v7_20[9] = v5_7;
                                                                                        v7_20[10] = v2_19;
                                                                                        v7_20[11] = 0;
                                                                                        int v2_24 = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
                                                                                        v11_50.k = v2_24;
                                                                                        v2_24.put(v7_20).position(0);
                                                                                        android.opengl.GLES20.glVertexAttribPointer(v11_50.g, 3, 5126, 0, 0, v11_50.k);
                                                                                        android.opengl.GLES20.glDisableVertexAttribArray(v14_41);
                                                                                        android.opengl.GLES20.glDisableVertexAttribArray(v13_30);
                                                                                        int v2_27 = v11_50.y;
                                                                                        if ((v2_27 != 0) && (v11_50.d.length > 0)) {
                                                                                            if (v10_80 == 0) {
                                                                                                v2_27.n0(v37_3, v38_3, v39_3, v11_50.w[v15_0], v11_50.x[v15_0]);
                                                                                            } else {
                                                                                                float v41_4 = v39_3;
                                                                                                v2_27.n0(v11_50.r, v11_50.s, v41_4, v11_50.w[v15_0], v11_50.x[v15_0]);
                                                                                                v39_3 = v41_4;
                                                                                            }
                                                                                            v11_50.y.l0(v10_80);
                                                                                        }
                                                                                        v8_3 = v39_3;
                                                                                    } else {
                                                                                        v8_3 = v11_50.v[v0_1];
                                                                                        float v7_15 = (v3_5 / 1073741824);
                                                                                        int v2_14 = (((v2_10 + v11_50.B[v0_1]) + v7_15) % v3_5);
                                                                                        if (v2_14 < 0) {
                                                                                            v2_14 += v3_5;
                                                                                        }
                                                                                        v2_11 = (v2_14 - v7_15);
                                                                                        float v7_16 = v11_50.z;
                                                                                        if ((v2_11 >= (((float) (- v7_16)) * 1045220557)) && (v2_11 <= ((float) v7_16))) {
                                                                                        }
                                                                                    }
                                                                                    v15_0++;
                                                                                    v5_15 = 3553;
                                                                                    int v9 = 770;
                                                                                }
                                                                                float v13_1;
                                                                                int v2_2 = v11_50.D;
                                                                                if (v2_2 == 0) {
                                                                                    v10 = 5;
                                                                                    v13_1 = 0;
                                                                                } else {
                                                                                    int v3_6 = v2_2.d;
                                                                                    float v5_0 = v2_2.j;
                                                                                    if (!v2_2.h.isEmpty()) {
                                                                                        android.opengl.GLES20.glUseProgram(v2_2.c);
                                                                                        android.opengl.GLES20.glEnable(v26_0);
                                                                                        android.opengl.GLES20.glBlendFunc(770, 771);
                                                                                        android.opengl.GLES20.glEnableVertexAttribArray(v3_6);
                                                                                        android.opengl.GLES20.glVertexAttribPointer(v2_2.d, 3, 5126, 0, 0, v2_2.g);
                                                                                        float v7_6 = (v2_2.n * v2_2.m);
                                                                                        android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(v2_2.c, "uZ"), 0);
                                                                                        int v8_9 = 0;
                                                                                        while (v8_9 < v2_2.h.size()) {
                                                                                            int v9_5 = ((float[]) v2_2.h.get(v8_9));
                                                                                            int v10_2 = ((float[]) v2_2.i.get(v8_9));
                                                                                            float v11_1 = (v9_5[0] + v2_2.o);
                                                                                            if (v12_55 != 0) {
                                                                                                float v13_3 = (v7_6 / 1073741824);
                                                                                                float v11_3 = ((v11_1 + v13_3) % v7_6);
                                                                                                if (v11_3 < 0) {
                                                                                                    v11_3 += v7_6;
                                                                                                }
                                                                                                v11_1 = (v11_3 - v13_3);
                                                                                            }
                                                                                            android.opengl.Matrix.setIdentityM(v5_0, 0);
                                                                                            android.opengl.Matrix.translateM(v5_0, 0, v11_1, (v9_5[1] + v2_2.p), (v6_4 + 1069547520));
                                                                                            android.opengl.Matrix.scaleM(v5_0, 0, v9_5[2], v9_5[3], 0);
                                                                                            android.opengl.Matrix.multiplyMM(v2_2.l, 0, v2_2.k, 0, v2_2.j, 0);
                                                                                            android.opengl.GLES20.glUniformMatrix4fv(v2_2.f, 1, 0, v2_2.l, 0);
                                                                                            android.opengl.GLES20.glUniform4fv(v2_2.e, 1, v10_2, 0);
                                                                                            android.opengl.GLES20.glDrawArrays(5, 0, 4);
                                                                                            v8_9++;
                                                                                        }
                                                                                        v10 = 5;
                                                                                        v13_1 = 0;
                                                                                        android.opengl.GLES20.glDisableVertexAttribArray(v3_6);
                                                                                    }
                                                                                }
                                                                                android.opengl.GLES20.glBindTexture(3553, v13_1);
                                                                                android.opengl.GLES20.glUseProgram(v13_1);
                                                                            }
                                                                        }
                                                                        if (!this.G) {
                                                                        } else {
                                                                            int v2_32 = this.p;
                                                                            int v3_9 = this.y;
                                                                            v2_32.getClass();
                                                                            float v4_0 = v4_70.b;
                                                                            float v5_16 = v2_32.r;
                                                                            if ((v5_16 != 0) && ((v0_1 > 0) && (v0_1 < v5_16.length))) {
                                                                                float v5_17 = v5_16[v0_1];
                                                                                if ((v5_17 != 0) && (v2_32.x != null)) {
                                                                                    if ((v3_9 != 2) || (v0_1 != 1)) {
                                                                                        if (v2_32.t[v0_1].length >= v5_17.length) {
                                                                                            if ((v2_32.g0) || (v0_1 == 1)) {
                                                                                                android.opengl.GLES20.glUseProgram(v2_32.n);
                                                                                                android.opengl.GLES20.glEnableVertexAttribArray(v2_32.W);
                                                                                                android.opengl.GLES20.glEnableVertexAttribArray(v2_32.X);
                                                                                                android.opengl.GLES20.glActiveTexture(v18_1);
                                                                                                android.opengl.GLES20.glBindTexture(3553, v4_0.k);
                                                                                                android.opengl.GLES20.glUniform1i(v2_32.Z, 1);
                                                                                                android.opengl.GLES20.glUniform2f(v2_32.a0, v2_32.d, v2_32.e);
                                                                                                android.opengl.GLES20.glUniform1f(v2_32.c0, (1065353216 / v4_0.o));
                                                                                                android.opengl.GLES20.glUniform1f(v2_32.d0, (v4_0.m - v2_32.e));
                                                                                                v2_32.h0 = v4_0.E;
                                                                                                int v3_26 = ((v2_32.I[v0_1] * 1073741824) / v2_32.d);
                                                                                                float v4_5 = ((v2_32.J[v0_1] * 1073741824) / v2_32.e);
                                                                                                float v5_27 = (v2_32.K / 1073741824);
                                                                                                int v6_19 = v2_32.r[v0_1].length;
                                                                                                float v7_24 = ((v2_32.U * v6_19) / 100);
                                                                                                int v8_15 = 0;
                                                                                                while ((v8_15 < v6_19) && (v8_15 < v7_24)) {
                                                                                                    float v12_6 = v2_32.r[v0_1][v8_15];
                                                                                                    float v12_8 = (v12_6[1] + v4_5);
                                                                                                    if (v12_8 >= (v2_32.j - 1045220557)) {
                                                                                                        if (v12_8 <= (v2_32.k + 1045220557)) {
                                                                                                            float v14_14 = v2_32.K;
                                                                                                            float v13_8 = (((v12_6[0] + v3_26) + v5_27) % v14_14);
                                                                                                            if (v13_8 < 0) {
                                                                                                                v13_8 += v14_14;
                                                                                                            }
                                                                                                            float v13_9 = (v13_8 - v5_27);
                                                                                                            if ((v13_9 >= (v2_32.h - 1045220557)) && (v13_9 <= (v2_32.i + 1045220557))) {
                                                                                                                v2_32.k0(v13_9, v12_8, v0_1, v8_15);
                                                                                                                float v14_22 = (v13_9 - v2_32.K);
                                                                                                                if (v14_22 > v2_32.j) {
                                                                                                                    v2_32.k0(v14_22, v12_8, v0_1, v8_15);
                                                                                                                }
                                                                                                                float v13_10 = (v13_9 + v2_32.K);
                                                                                                                if (v13_10 < v2_32.k) {
                                                                                                                    v2_32.k0(v13_10, v12_8, v0_1, v8_15);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            v27 = 1045220557;
                                                                                                        }
                                                                                                    }
                                                                                                    v8_15++;
                                                                                                }
                                                                                                v23 = 1;
                                                                                                android.opengl.GLES20.glDisableVertexAttribArray(v2_32.W);
                                                                                                android.opengl.GLES20.glDisableVertexAttribArray(v2_32.X);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int v22 = 0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                v32_1 = v2_35;
                                                                v26_2 = v8_16;
                                                                android.opengl.GLES20.glDisable(v26_2);
                                                            }
                                                        }
                                                        this.l.l0(this.P);
                                                        this.o.k0();
                                                        int v0_4 = this.m;
                                                        if ((v0_4.s) && (v0_4.t)) {
                                                            android.opengl.GLES20.glEnable(v26_2);
                                                            android.opengl.GLES20.glBlendFunc(770, 771);
                                                            android.opengl.GLES20.glUseProgram(v0_4.d);
                                                            android.opengl.GLES20.glUniform2f(v0_4.h, v0_4.n, v0_4.o);
                                                            android.opengl.GLES20.glUniform1f(v0_4.i, v0_4.p);
                                                            android.opengl.GLES20.glUniform1f(v0_4.j, v0_4.q);
                                                            android.opengl.GLES20.glUniform1f(v0_4.k, v0_4.u);
                                                            android.opengl.GLES20.glEnable(v26_2);
                                                            android.opengl.GLES20.glBlendFunc(770, 771);
                                                            c4.b.g0(v0_4.d, v0_4.w, v0_4.x, v0_4.y, 1076677837);
                                                            android.opengl.GLES20.glEnableVertexAttribArray(v0_4.e);
                                                            android.opengl.GLES20.glVertexAttribPointer(v0_4.e, 3, 5126, 0, 0, v0_4.c);
                                                            android.opengl.GLES20.glUniform1f(v0_4.f, v0_4.l);
                                                            android.opengl.GLES20.glUniform1f(v0_4.g, v0_4.m);
                                                            android.opengl.GLES20.glDrawArrays(v32_1, 0, (v0_4.r.length / 3));
                                                            android.opengl.GLES20.glDisableVertexAttribArray(v0_4.e);
                                                            android.opengl.GLES20.glBindTexture(3553, 0);
                                                            android.opengl.GLES20.glUseProgram(0);
                                                            android.opengl.GLES20.glDisable(v26_2);
                                                        }
                                                        return;
                                                    } else {
                                                        v3_71 = Math.max(1045220557, (v6_30 * 1069547520));
                                                    }
                                                } else {
                                                    v3_71 = Math.max(1045220557, ((v24_0 - v6_30) * 1073741824));
                                                }
                                                v6_33 = (v3_71 * v5_42);
                                            } else {
                                                v6_33 = ((v6_30 * 1073741824) * v5_42);
                                            }
                                        }
                                    } else {
                                        float v5_36;
                                        int v3_43;
                                        int v9_22 = v6_23[2];
                                        if ((v5_31 == 0) || (v3_27 != 0)) {
                                            if (v3_27 == 0) {
                                                v3_43 = v2_112.P;
                                                v5_36 = 5;
                                                if (v11_8 == 5) {
                                                    v4_7 = v8_10[1];
                                                }
                                            } else {
                                                v3_43 = v8_10[2];
                                                v4_7 = v3_43;
                                                v5_36 = 5;
                                            }
                                        } else {
                                            v3_43 = v8_10[2];
                                        }
                                        if (v11_8 != v5_36) {
                                            if (v11_8 != 0) {
                                                v5_35 = v8_10[2];
                                            } else {
                                                v5_35 = v8_10[2];
                                            }
                                        } else {
                                            v5_35 = v8_10[1];
                                        }
                                        v8_20 = v3_43;
                                        v12_10 = v9_22;
                                        v11_9 = (v9_22 - v32_2);
                                        v3_44 = 0;
                                        v9_21 = v4_7;
                                        v4_13 = v5_35;
                                    }
                                } else {
                                    if ((v5_31 == 0) || (v3_27 != 0)) {
                                        if (v3_27 == 0) {
                                            v2_112.V = v2_112.P;
                                        } else {
                                            v2_112.V = v8_10[2];
                                        }
                                    } else {
                                        v2_112.V = v8_10[2];
                                    }
                                    v2_112.W = v8_10[2];
                                    if (v2_112.J != 0) {
                                        v2_112.V = i2.l.d(v2_112.P, v2_112.V, ((double) v10_4));
                                    }
                                }
                                v11_9 = 0;
                                v12_10 = 0;
                                v3_44 = 1;
                                v4_13 = 0;
                                v5_35 = 0;
                                v8_20 = 0;
                                v9_21 = 0;
                            } else {
                                float v4_15 = v6_23[0];
                                int v9_23 = (v4_15 + v32_2);
                                if ((v5_31 == 0) || (v3_27 != 0)) {
                                    if (v3_27 == 0) {
                                        v3_53 = v2_112.R;
                                        v5_37 = v2_112.P;
                                    } else {
                                        v3_53 = v8_10[2];
                                        v5_37 = v3_53;
                                    }
                                } else {
                                    v3_53 = v8_10[2];
                                }
                                if (v11_8 != 3) {
                                    v10_8 = v8_10[1];
                                    v8_22 = v8_10[2];
                                    v11_9 = v4_15;
                                    v12_10 = v9_23;
                                    v4_13 = v10_8;
                                    v9_21 = v5_37;
                                    v5_35 = v8_22;
                                    v8_20 = v3_53;
                                } else {
                                    v11_9 = v4_15;
                                    v4_13 = v8_10[2];
                                    v12_10 = v9_23;
                                    v8_20 = v3_53;
                                    v9_21 = v5_37;
                                    v5_35 = v4_13;
                                }
                            }
                        } else {
                            float v4_16 = v6_23[0];
                            int v9_24 = (v4_16 - v32_2);
                            if ((v5_31 == 0) || (v3_27 != 0)) {
                                if (v3_27 == 0) {
                                    v3_53 = v8_10[2];
                                    v5_37 = v2_112.R;
                                } else {
                                    v3_53 = v8_10[2];
                                    v5_37 = v3_53;
                                }
                            } else {
                                v3_53 = v8_10[2];
                            }
                            if (v11_8 != 3) {
                                v10_8 = v8_10[2];
                                v8_22 = v8_10[1];
                                v12_10 = v4_16;
                                v11_9 = v9_24;
                            } else {
                                v12_10 = v4_16;
                                v4_13 = v8_10[2];
                                v11_9 = v9_24;
                            }
                        }
                    }
                }
            }
        } else {
            v23_1 = 1;
            v18_0 = 1008981770;
            v19_1 = 1056964608;
            v20_2 = 2;
            v21_0 = 4;
            v22_0 = 0;
        }
    }

    public final void o0(int p3, float[] p4, float[] p5)
    {
        if (p3 < this.k.size()) {
            n2.a v3_4 = ((n2.g) this.k.get(p3)).a;
            v3_4.B = p4;
            v3_4.C = p5;
        }
        return;
    }

    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 p18)
    {
        n2.f v1 = this;
        float v2_0 = System.nanoTime();
        int v4_9 = this.M;
        if (v4_9 != -1) {
            n2.o v0_43 = ((float) (v2_0 - v4_9));
            this.O = (v0_43 / 1315859240);
            this.N = (((v0_43 / 1232348160) * 1036831949) + (this.N * 1063675494));
        }
        this.M = v2_0;
        this.P = (this.N / 1148846080);
        this.d.getClass();
        float v2_2 = this.S;
        if (v2_2 != 0) {
            float v5_5 = (this.V + this.P);
            this.V = v5_5;
            float v5_6 = (v5_5 / 1077936128);
            if (v5_6 < 1065353216) {
                n2.o v0_33;
                if (v5_6 >= 1056964608) {
                    v0_33 = (1065353216 - (((float) Math.pow(((double) ((v5_6 * -1073741824) + 1073741824)), 4613937818241073152)) / 1073741824));
                } else {
                    v0_33 = (((1082130432 * v5_6) * v5_6) * v5_6);
                }
                float v5_13 = ((this.W * v0_33) + this.U);
                this.R = v5_13;
                if (v5_13 >= 1103101952) {
                    this.R = (v5_13 - 1103101952);
                }
            } else {
                this.R = v2_2.floatValue();
                this.S = 0;
            }
            n2.o v0_40 = this.d;
            v0_40.x0 = this.R;
            v0_40.J1 = 1;
            this.J.edit().putInt(this.i, ((int) (this.R / 1015580809))).apply();
        }
        if (this.z) {
            n2.o v0_46 = this.d;
            if (v0_46.i() != v0_46.x0) {
                v0_46.J1 = 1;
            }
            n2.o v0_47 = this.t;
            android.opengl.GLES20.glBindFramebuffer(36160, v0_47.m);
            android.opengl.GLES20.glViewport(0, 0, v0_47.j, v0_47.k);
            android.opengl.GLES20.glClearColor(0, 0, 0, 1065353216);
            android.opengl.GLES20.glClear(16640);
            this.n0();
            n2.t v8_0 = this.t;
            android.opengl.GLES20.glBindFramebuffer(36160, v8_0.n);
            android.opengl.GLES20.glViewport(0, 0, v8_0.j, v8_0.k);
            android.opengl.GLES20.glClearColor(0, 0, 0, 1065353216);
            android.opengl.GLES20.glClear(16640);
            int v4_1 = this.t;
            v4_1.l = 0;
            v4_1.m0(v4_1.o, 0);
            if (!this.H) {
                n2.t v8_2 = this.v;
                int v9_2 = this.t.o;
                n2.o v0_6 = this.r;
                float[] v10 = v0_6.M0;
                v10[0] = v0_6.l;
                v10[1] = v0_6.m;
                n2.o v0_7 = this.d;
                v8_2.k0(v9_2, v10, v0_6.z, v0_7.g2, v0_7.h2, ((float) this.e), ((float) this.f), this.O);
            } else {
                if (this.y == 9) {
                }
            }
            this.s.k0(this.P);
            v1.w.k0(v1.P);
            android.opengl.GLES20.glDisable(2929);
            this.n.k0();
            n2.o v0_15 = this.t;
            v0_15.getClass();
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glFlush();
            android.opengl.GLES20.glViewport(0, 0, v0_15.j, v0_15.k);
            v0_15.k0();
            this.t.l0(this.Q);
            this.q.k0();
            return;
        } else {
            return;
        }
    }

    public final void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 p42, int p43, int p44)
    {
        if ((p43 != 0) && (p44 != 0)) {
            android.opengl.GLES20.glViewport(0, 0, p43, p44);
            this.e = p43;
            this.f = p44;
            this.k0();
            if (this.g == null) {
                this.k0();
            }
            int v4_8 = this.t;
            v4_8.j = p43;
            v4_8.k = p44;
            int v5_30 = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaOp4gT1gzV92jhwaKXBAYIgnbgv6ycr+UmTEm/ZEUr3w/b82MelkrwRmPhM5NCa0F3IRzoSttUJtBLiGc3raJTzBOFschXeWRdvY/9C3Bn2/7XvP5t+QHD/4JSklKsZ8p1xpW0UW02otikc2FqaKBQMw1W3hTrJFMKYB5CfsW7bYghqEeCboh84RWpjWdr67fg=="));
            int v7_3 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItEzE4YLlflhTcRtN/7tyM6DEvFHWpTlXEp9HerHhRVzJNK8YkGiwi3P+DYsSUFh9UaOOO/8eQMqEKUWwiKZUO47u7BbER3oiqz1m9Ftglg2CdUpIiZypxEls1P48Kgw4J3pXiwo0hQs2ZHiB26koP11rRkMDYng1ToSpD8jlu0Ivk6B2ZSoPchm3cUAMdPCRBMHs8IbasGmZpQejImWPwTwMVNqHqL+B2KhuQinkfzxqYLdRkOpVp9G2SzG6piFDHWaAgoTdl4ueEk61gPWlnHuFMwEenHLjlFpdf7zbuxzYUti2l3tLi+nieRDAZ/4dWvl95N/dUG7yAsxVvva37tLPAwf5CGsvgpBsumK96GWdA7sRLRXpVSa8LonFhmGl7kxFLoXrR9+dqBwFv4VljLq9LtQizIMmDId+zJJzE8Fd5oC6lVO9QTw1UTfRCBEZ/EJSN77GBfGMJ+8KWvG5KxbP9BJ4jDG+ZmUe95BUjrxrXArB0duHk/n6E+j1w/mdQtirvDYYVG3mHtPV2VNiOQPAd/5v+KB3f4kazvIEpB9E2NZN4onB3EzLA4XnTgpKnPkIAzR845506UysptZiR5swZv76cO9isuLzT4rXAFi7jwyUd/oPantmpmJOnqzZsX/J8IvZR7iUKt2GtQT8CU5G2zs4GTgxveJjXgpgG0y3Pasvmjr939iJhwOIVWkTS4Fvn3LoNRmZO412IzJThSLVQZlhm0/ho0AMx3bfjEiidw8Q1+KgkbK2vupJw0Wc2MzAgWo24ADCe10hjRG//KU8fyCwQfVS5cm7Uu0T1yK9CnXfnsKGKjS1PnJIi73kOu/C/GPDB4HDMgNuMCwljzGdJpro3Yvi8AJyDK+omocWnS50+afiVTemJFbFiskYGuQz/s6r+T2davHUjiAVKTGtlPbzf5wU4J1euVf5S9kswwuO+/XXEBbJO20wppiY2e/HloRKvM0gcEvIba4M5obCFmk+c/pObWmuktseyz3OjUZXN9eugxaqc50Ty355Tw=="));
            int v9_3 = android.opengl.GLES20.glCreateProgram();
            v4_8.e = v9_3;
            android.opengl.GLES20.glAttachShader(v9_3, v5_30);
            android.opengl.GLES20.glAttachShader(v4_8.e, v7_3);
            android.opengl.GLES20.glLinkProgram(v4_8.e);
            v4_8.f = android.opengl.GLES20.glGetAttribLocation(v4_8.e, "aPosition");
            v4_8.g = android.opengl.GLES20.glGetAttribLocation(v4_8.e, "aTexCoord");
            v4_8.h = android.opengl.GLES20.glGetUniformLocation(v4_8.e, "uTexture");
            v4_8.i = android.opengl.GLES20.glGetUniformLocation(v4_8.e, "uTexOffset");
            int v12_18 = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            v4_8.c = v12_18;
            v12_18.put(n2.b.w);
            v4_8.c.position(0);
            this.g.q0(((float) p43), ((float) p44));
            int v4_102 = this.l;
            v4_102.B = p43;
            v4_102.C = p44;
            int v12_20 = (((float) p43) / ((float) p44));
            v4_102.D = v12_20;
            int v14_65 = new float[8];
            v14_65 = {-1082130432, -1082130432, 1065353216, -1082130432, -1082130432, 1065353216, 1065353216, 1065353216};
            v4_102.q = c4.b.q(v14_65);
            int v14_69 = new float[8];
            v14_69 = {0, 1065353216, 1065353216, 1065353216, 0, 0, 1065353216, 0};
            v4_102.r = c4.b.q(v14_69);
            int v4_105 = v4_102.D;
            android.opengl.Matrix.orthoM(v4_102.E, 0, (- v4_105), v4_105, -1082130432, 1065353216, -1054867456, 1092616192);
            int v4_1 = this.n;
            v4_1.getClass();
            android.opengl.GLES20.glViewport(0, 0, p43, p44);
            v4_1.c = p43;
            v4_1.d = p44;
            c4.b.k(v4_1.j);
            c4.b.j(v4_1.i);
            int v13_5 = q4.b.l("ch7DYGGJXo0oFQmp/ccnQGlJtP3OForzSm9yC+k6OjgN+2QxMmR54e8N8YQKHWhYQETy6qDKSGpM0ZpKx3dSpXMAWQf3KThutV8K2/JnZm5OXzXaIOgclHKYSvWGRq+SZoczDV6Z3cLhsCAfReBKBndm3MYzMqX58QTOohPrHNOD4davDQAEfs/J/ClQ1QxYRoUheDoKXETAdp/fYaHnoZrDbZJA1gZF89JTrEyiQ4q2c+iz99TpisiviByTt+LWaLloUHCnJ983aa/D+gkRdfQEpQ4zM42MnmaYfiX4L5S4oFsdv8hBatPFuLcuwSKf4AtRQmEVrYVhnkqx0O5QYuc3Stbk4TMFvumSXD2ZQmIYVfcXFP6uShCOdO8J2Fid4Sh3yDAn58TCGFT5z/l9RKa8zC2+aRk8RL7C1C4MDxE=");
            int v14_7 = q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzYxfWIvnOvaJW+Vz8RjvGBU36j+kOzS2+uhP2xJUBIbGGv9DdGmh3z+MsKfvMn8ICoPTjN60cEZOHpgsPC0QBgBqCdj7mDnMAHxMWLMlkS/8spfq0gaIBwB59ldFlJD2wtsYZhXtOrtIjz6yzOcTcwiRpL3AB3PzhrtdHn8jzji2RwYqYpmgg7ZgAdka+tviw8Qtzf9PGY2V/p+JADFujW672y4BfQtPBATqn6uDkHN9likAhnTmFpSEBEKg4guNPB9PjpSfZq1FbmYZmG27f4HKgcH1cANsWFUBoqMlAraoEOOLvobpI96tcGBEU1zbo8kxuCsMUxG55+Pd2Hk+RH4moG15HYoH02mryDPQSOA7A==");
            int v3_6 = android.opengl.GLES20.glCreateProgram();
            int v13_8 = c4.b.M(35633, v13_5);
            int v14_11 = c4.b.M(35632, v14_7);
            android.opengl.GLES20.glAttachShader(v3_6, v13_8);
            android.opengl.GLES20.glAttachShader(v3_6, v14_11);
            android.opengl.GLES20.glLinkProgram(v3_6);
            android.opengl.GLES20.glGetUniformLocation(v3_6, "u_MVPMatrix");
            v4_1.k = android.opengl.GLES20.glGetUniformLocation(v3_6, "u_Texture");
            android.opengl.GLES20.glGetUniformLocation(v3_6, "uZ");
            v4_1.l = android.opengl.GLES20.glGetAttribLocation(v3_6, "a_Position");
            v4_1.m = android.opengl.GLES20.glGetAttribLocation(v3_6, "a_TexCoord");
            v4_1.n = android.opengl.GLES20.glGetAttribLocation(v3_6, "a_Alpha");
            v4_1.o = android.opengl.GLES20.glGetUniformLocation(v3_6, "u_snowColor");
            v4_1.p = android.opengl.GLES20.glGetUniformLocation(v3_6, "uX");
            v4_1.i = v3_6;
            int v3_10 = android.graphics.Bitmap.createBitmap(64, 64, android.graphics.Bitmap$Config.ARGB_8888);
            int v11_38 = new android.graphics.Canvas(v3_10);
            int v17_6 = v3_10;
            int v3_12 = new android.graphics.Paint();
            v3_12.setAntiAlias(1);
            int v25_1 = (((float) 64) / 1073741824);
            int v5_27 = v25_1;
            v3_12.setShader(new android.graphics.RadialGradient(v25_1, v25_1, v25_1, -1, 0, android.graphics.Shader$TileMode.CLAMP));
            v11_38.drawCircle(v5_27, v5_27, v5_27, v3_12);
            v4_1.j = c4.b.N(v17_6);
            int v3_15 = java.nio.ByteBuffer.allocateDirect(80000);
            v3_15.order(java.nio.ByteOrder.nativeOrder());
            v4_1.f = v3_15.asFloatBuffer();
            int v3_18 = java.nio.ByteBuffer.allocateDirect(12000);
            v3_18.order(java.nio.ByteOrder.nativeOrder());
            v4_1.g = v3_18.asShortBuffer();
            int v3_21 = new short[6000];
            int v5_24 = 0;
            while (v5_24 < 1000) {
                int v11_29 = (v5_24 * 4);
                int v14_24 = (v5_24 * 6);
                int v17_5 = v5_24;
                v3_21[v14_24] = ((short) v11_29);
                int v5_19 = ((short) (v11_29 + 1));
                v3_21[(v14_24 + 1)] = v5_19;
                int v25_0 = v5_19;
                int v5_21 = ((short) (v11_29 + 2));
                v3_21[(v14_24 + 2)] = v5_21;
                v3_21[(v14_24 + 3)] = v5_21;
                v3_21[(v14_24 + 4)] = v25_0;
                v3_21[(v14_24 + 5)] = ((short) (v11_29 + 3));
                v5_24 = (v17_5 + 1);
            }
            v4_1.g.put(v3_21);
            v4_1.g.position(0);
            v4_1.l0();
            c4.b.a0(v4_1.y, v4_1.z, v4_1.A, -1082130432, 1065353216, -1082130432, 1065353216);
            v4_1.v = i2.m.d().e("rain");
            int v3_26 = this.o;
            v3_26.e = p43;
            v3_26.f = p44;
            int v5_35 = q4.b.l("iNTFXzuz/36A/EciPxE9nxmBuVOdJr+0bBPLt6M4vZdb84nbfsYK7yyG8nPXKJNc2DZTwNWSDZ1QQzaSWDw4vE5/49cRuLDcEphJ6zaKXQeUnHKzpoViJ1vwnkXUQOPcwwtgdUOMgkvfOde4YA9/W7CCJt/St2/qSx7jJxCrP1pYHV+0timCbiVbM0X3xA/diKyQK5r378hx1MkRQrkAXY4stC/kBFNDnhPLWBMQMOsWNqprK5SHgL/Ba4Ec4nthlWRoigqeO4TzHzeb8eSmEVcfOWb2TZaBn2vYwOLAlfiQTmrCaJmgxXh524UrZiD5T5iHGIPUO0iGTcOhUDhuJg==");
            int v11_42 = q4.b.l("KOd+G86ICKS0CZskYfaItChDyj7X1xDlt3w9NqcSKLENXJCVQigic85A/smgfmejJNhXZLjqx4+AMzvwNBs+sICYt8tvrfao3SbvtGEbU2msXAZZoFQEIOx9WEsoKK4zjOBGvgHCQZflW84I2gOuySgBpttrF4+vyquF5Kk4B/csiLHoB2jf5ckxvekc270UMllzVTVGR94EeZQn5Sq2e7yu0CrJnk/KtcfQTV+sN3RBvSmiAUUsJgRXMY3nexw/VniwbKIDgzrQpUINuehq9eA1tGAYKYhEZRDHUqprC/URYMRPq0b4B6iRsjptW2910FI5V05cBjWxdfeftAMHL5xqXzKJzMRrRP9itA5nTc01w2Hu6+hrwNMChzNHM7VXGaKbo+w1D5q4W89k4RbE92nGJIO9gsdDzTqxVUVvAHUl2SJtTQaGUwxcYKGJu7rktOIDq1OvNZugumIKl7orDk/y29GKL1/cttumskHJ0vyyUzrPBDPkQQN5ywN32vsG");
            int v5_36 = c4.b.M(35633, v5_35);
            int v11_43 = c4.b.M(35632, v11_42);
            int v14_33 = android.opengl.GLES20.glCreateProgram();
            android.opengl.GLES20.glAttachShader(v14_33, v5_36);
            android.opengl.GLES20.glAttachShader(v14_33, v11_43);
            android.opengl.GLES20.glLinkProgram(v14_33);
            v3_26.j = v14_33;
            int v4_20 = q4.b.l("iNTFXzuz/36A/EciPxE9nxmBuVOdJr+0bBPLt6M4vZdb84nbfsYK7yyG8nPXKJNc2DZTwNWSDZ1QQzaSWDw4vE5/49cRuLDcEphJ6zaKXQeUnHKzpoViJ1vwnkXUQOPcwwtgdUOMgkvfOde4YA9/W7CCJt/St2/qSx7jJxCrP1pYHV+0timCbiVbM0X3xA/diKyQK5r378hx1MkRQrkAXY4stC/kBFNDnhPLWBMQMOsWNqprK5SHgL/Ba4Ec4nthlWRoigqeO4TzHzeb8eSmEVcfOWb2TZaBn2vYwOLAlfiQTmrCaJmgxXh524UrZiD5T5iHGIPUO0iGTcOhUDhuJg==");
            int v5_38 = q4.b.l("KOd+G86ICKS0CZskYfaItChDyj7X1xDlt3w9NqcSKLG93w01kTZYkSoK7s/NTyNaEqS6dtF3ZwopvmOs8t9NEl/Y1diZST/wvKanYyvcYIoXYlALnGDcDgl/PXMppwaciMnK9Mme/39Gj59TsrP2+w==");
            int v4_21 = c4.b.M(35633, v4_20);
            int v5_39 = c4.b.M(35632, v5_38);
            int v11_44 = android.opengl.GLES20.glCreateProgram();
            android.opengl.GLES20.glAttachShader(v11_44, v4_21);
            android.opengl.GLES20.glAttachShader(v11_44, v5_39);
            android.opengl.GLES20.glLinkProgram(v11_44);
            v3_26.k = v11_44;
            c4.b.a0(v3_26.y, v3_26.z, v3_26.A, -1082130432, 1065353216, -1082130432, 1065353216);
            int v4_23 = v3_26.d;
            v3_26.W = j5.t1.z(v4_23).getBoolean(v4_23.getString(2131952391), 1);
            int v4_26 = android.util.TypedValue.applyDimension(1, 1073741824, v4_23.getResources().getDisplayMetrics());
            int v5_44 = new float[2];
            android.opengl.GLES20.glGetFloatv(33902, v5_44, 0);
            v3_26.L = Math.min(v5_44[1], Math.max(v5_44[0], v4_26));
            v3_26.M = android.opengl.GLES20.glGetAttribLocation(v3_26.j, "vPosition");
            v3_26.N = android.opengl.GLES20.glGetAttribLocation(v3_26.j, "a_TexCoord");
            v3_26.O = android.opengl.GLES20.glGetUniformLocation(v3_26.j, "u_MVPMatrix");
            v3_26.P = android.opengl.GLES20.glGetUniformLocation(v3_26.j, "u_red");
            v3_26.Q = android.opengl.GLES20.glGetUniformLocation(v3_26.j, "u_green");
            v3_26.R = android.opengl.GLES20.glGetUniformLocation(v3_26.j, "u_blue");
            v3_26.S = android.opengl.GLES20.glGetUniformLocation(v3_26.j, "u_alpha");
            v3_26.T = android.opengl.GLES20.glGetAttribLocation(v3_26.k, "vPosition");
            v3_26.U = android.opengl.GLES20.glGetAttribLocation(v3_26.k, "a_Alpha");
            v3_26.V = android.opengl.GLES20.glGetUniformLocation(v3_26.k, "u_MVPMatrix");
            int v3_28 = this.m;
            v3_28.v = ((float) p43);
            v3_28.m = v12_20;
            android.opengl.Matrix.setIdentityM(v3_28.w, 0);
            android.opengl.Matrix.setIdentityM(v3_28.x, 0);
            android.opengl.Matrix.setIdentityM(v3_28.y, 0);
            int v3_30 = v12_20;
            android.opengl.Matrix.orthoM(v3_28.x, 0, 0, ((float) p43), ((float) p44), 0, -1054867456, 1092616192);
            int v12_14 = ((float) p44);
            int v13_20 = this.p;
            v13_20.d = ((float) p43);
            v13_20.e = ((float) p44);
            c4.b.j(v13_20.n);
            v13_20.n = 0;
            int v14_45 = c4.b.M(35633, q4.b.l("43XE9/ssbp/rM5RbQZ+B94Fkf99XYURv7W93MrIerilrg0M9JYxP6RoVtXcZ0lEPTOP35kSx2MyHiEBmZLrMVloJMnI2sLBNRWbuonwgoBA28CxrODwvAAcN+VFf+uTxVDhEp9WfH9rdOtAwXMxxTnL8CufwwXEIIIUBGeqa7Xv2RqQzADgICMOyburVbeoiTIdYq23zVl6rvEgIT5Fghq28lVlYgyv0vVpfJC5IWywQPuR771s3A4Ua6DXVc9Lk/1AOAwZRr39K0VlGP+22gmAlISnIwYUfKmOhWloPuVI="));
            int v4_56 = c4.b.M(35632, q4.b.l("43XE9/ssbp/rM5RbQZ+B9770YSmwDXUFdrqYRL1wVLgL6CKtbZqKQv5NvdPVny8OvwOD4v0hnte/vG3S9MrwaluQxVfVDQqleODwrUqOckXaFTBn8apIevYiL7R9ZI4gfXZ+9qfm5lbDjWL63+rzidvlAWgo3jC1ejk6UeD7oyMIhvJuqRALd0wdpUnex970lbd04jrpsWlxSzTGvrwToezlx5l9v7KQp/ZdbEKIWwQiqV+YdR0++5ISBHWGrMVZb3t3lXo/nwUnt9z7jgG/zoWoUdMt4Nai1PnB9tOZcixKsTX00hs8HS+D3f5EBK3Uhm6KzhiRH5+UPD2XuPfoCkAug9ujz/jT4ISdwcU31b4Y0jCACXtmdrERtTkQt7fYDyRjl66mwaqf8bYDSZ9Khcx4QNGNucuU3isrJk2Qf/4s+BhtWVgNQHK9XcWkANxVRdy91BMw8wERwi0DLcxugY+S0Qnn6AY40o4NANqs565dYC5kT95g/QheSKLCQU+cRYMBn9AWblFqckGhrVo/6Cl8EhsU52L98lbzd4bxLgZXRc2g62qdLPkkwkjY5DG3vhKjZ2cZZFWmy+AUuU6v6Dh3VMkAe9GiaTxFyA9FSI21Onecs/VcX/gO28VJoYMX2O86NIHYlirH3MUFxJT07yzAIz4b+j6UqRzAI63Tgd25TjJL5F3DmdqSPdVHkEXXUtk+ntuOqN7pICXb2KCkNedjqsTqIDFN2/xRr2g6qdL9buELuGO57WfOjuqyeC65CpJvEKiLwV3jl2N4XIBB5r1KcrmGOTIhFhVBtS3/i7+X10cejbQX76CbcqQ08u6w7yu/2UPw4WIFJD49yvufb3M+wJLTLNb7eQI49tzANHBOHdDoWwwWhdX7eYybJqkgsGFyK+AB5UgxtoNmGLqlWbPu1c7r/P+NRwemvY3rSJyRIWMRSGxd6kN2CFM0ll0GOYbDq50PmUlz3pAHffEmcSm3wxspsNRbMyCDnozovFEauSXI7OP00PnZPbVc/WUvUuTlPVal3qMjcKH0yCS091cajwJJwzzVYeRwgOi27cktV+LcSPYWrjDOt/ukrA2lQcwz3+zen9oiJ7bpURIfV1h6Lurcq8j+ltSkibQ8Eoo="));
            int v11_52 = android.opengl.GLES20.glCreateProgram();
            android.opengl.GLES20.glAttachShader(v11_52, v14_45);
            android.opengl.GLES20.glAttachShader(v11_52, v4_56);
            android.opengl.GLES20.glLinkProgram(v11_52);
            v13_20.n = v11_52;
            v13_20.W = android.opengl.GLES20.glGetAttribLocation(v11_52, "vPosition");
            v13_20.X = android.opengl.GLES20.glGetAttribLocation(v13_20.n, "aTexCoord");
            v13_20.Y = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "uTexture");
            v13_20.Z = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "uGradientTexture");
            v13_20.a0 = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "screenSize");
            v13_20.b0 = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "uMVPMatrix");
            v13_20.c0 = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "invBoxH");
            v13_20.d0 = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "boxY");
            v13_20.e0 = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "uColor");
            v13_20.f0 = android.opengl.GLES20.glGetUniformLocation(v13_20.n, "u_HDR");
            int v4_76 = v13_20.A;
            v13_20.U = v4_76.getInt(v13_20.V, 100);
            int v11_56 = v13_20.l0;
            int v14_47 = v13_20.c;
            v11_56.add(j5.t1.A(v14_47, 2131231391));
            v11_56.add(j5.t1.A(v14_47, 2131231387));
            v11_56.add(j5.t1.A(v14_47, 2131231388));
            v11_56.add(j5.t1.A(v14_47, 2131231389));
            v11_56.add(j5.t1.A(v14_47, 2131231390));
            if (!v4_76.getBoolean(v13_20.q, 0)) {
                v11_56.add(j5.t1.A(v14_47, 2131231503));
                v11_56.add(j5.t1.A(v14_47, 2131231506));
            }
            int v4_82;
            v13_20.p = new int[] {c4.b.O(v14_47, 2131231505), c4.b.O(v14_47, 2131231507)});
            v13_20.k0 = v4_76.getBoolean(v14_47.getString(2131951819), 1);
            if (((java.util.Calendar.getInstance().get(2) + 1) != 12) || (!v13_20.k0)) {
                v4_82 = 0;
            } else {
                v4_82 = 1;
            }
            v13_20.l0(v4_82);
            int v4_85 = new java.nio.FloatBuffer[v13_20.O.length];
            v13_20.l = v4_85;
            int v8_50 = new float[8];
            v8_50 = {0, 1065353216, 1065353216, 1065353216, 0, 0, 1065353216, 0};
            v13_20.m = c4.b.q(v8_50);
            int v4_89 = v13_20.O.length;
            int v8_51 = new int[v4_89];
            v13_20.o = v8_51;
            android.opengl.GLES20.glGenTextures(v4_89, v8_51, 0);
            int v4_90 = v13_20.O;
            int v8_53 = new float[v4_90.length];
            v13_20.f = v8_53;
            int v4_92 = new float[v4_90.length];
            v13_20.g = v4_92;
            int v4_18 = 0;
            while(true) {
                int v8_54 = v13_20.O;
                if (v4_18 >= v8_54.length) {
                    break;
                }
                int v8_20 = v8_54[v4_18];
                int v6_6 = android.graphics.Bitmap.createBitmap(v8_20.getIntrinsicWidth(), v8_20.getIntrinsicHeight(), android.graphics.Bitmap$Config.ARGB_8888);
                int v11_26 = new android.graphics.Canvas(v6_6);
                float[] v29_0 = v4_18;
                v8_20.setBounds(0, 0, v11_26.getWidth(), v11_26.getHeight());
                v8_20.draw(v11_26);
                int v1_56 = (((float) v6_6.getWidth()) / ((float) v6_6.getHeight()));
                int v4_13 = (v13_20.d / v13_20.e);
                if (v4_13 <= v1_56) {
                    v13_20.f[v29_0] = 1065353216;
                    v13_20.g[v29_0] = (v4_13 / v1_56);
                } else {
                    v13_20.f[v29_0] = (v1_56 / v4_13);
                    v13_20.g[v29_0] = 1065353216;
                }
                v13_20.l[v29_0] = c4.b.q(c4.b.A());
                android.opengl.GLES20.glBindTexture(3553, v13_20.o[v29_0]);
                android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
                android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
                android.opengl.GLUtils.texImage2D(3553, 0, v6_6, 0);
                v6_6.recycle();
                v4_18 = (v29_0 + 1);
                int v6 = 2131951819;
            }
            c4.b.a0(v13_20.u, v13_20.v, v13_20.w, -1082130432, 1065353216, -1082130432, 1065353216);
            int v1_66 = (v13_20.d / v13_20.e);
            if (v1_66 <= 1065353216) {
                v13_20.h = -1082130432;
                v13_20.i = 1065353216;
                v13_20.j = (-1082130432 / v1_66);
                v13_20.k = (1065353216 / v1_66);
            } else {
                v13_20.h = (- v1_66);
                v13_20.i = v1_66;
                v13_20.j = -1082130432;
                v13_20.k = 1065353216;
            }
            int v11_23;
            int v1_67 = this.r;
            v1_67.r = ((float) p43);
            v1_67.s = ((float) p44);
            v1_67.t = v3_30;
            int v4_99 = v1_67.e;
            v1_67.G = j5.t1.z(v4_99).getBoolean(v1_67.H, 1);
            int v11_62 = new float[8];
            v11_62 = {-1090519040, 1056964608, -1090519040, -1090519040, 1056964608, 1056964608, 1056964608, -1090519040};
            int v8_59 = new float[8];
            v8_59 = {0, 0, 0, 1065353216, 1065353216, 0, 1065353216, 1065353216};
            int v13_24 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            v1_67.c = v13_24;
            v13_24.put(v11_62).position(0);
            int v11_66 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            v1_67.d = v11_66;
            v11_66.put(v8_59).position(0);
            int v8_63 = c4.b.M(35633, q4.b.l("ch7DYGGJXo0oFQmp/ccnQDZ+phPWIgMUaCT3wTQ9iJq6cBam5Dgh613rVzNs8qHwAUL8faqoQRbnqpoITbE8oq6PARRN4PNZJXdo/8P1PC2Od+cZAY3vIFRUPQrtVozQgz5eR6YVoHZaQMpZUoIOMhKKLP/1txXMHKc8+Hy3E2nVlu+C7MLBTIOpzcxSRrLoKeOn1QYZCViUDtk7KvMBAl7+vgU6AkG8hml3Pbm4jLt49xM57uZpQV0mSJNUqF0KOK8w61SPuqDLfmzjbHviL3WLX8js7/ge/cjliBtNwSUkf56QZlaTpF+qVqMIRj7lHBnfBIBN/dm/bM9RAq21Dh4KxFTe3OC9sjk27cw5M5JkOWcMPZcXQskZ4mBotvVPNjT14YVHswfGJ5uywIdwNDUwg/Q/lKxaXsu+7hLb9ABp9L0m8V0cIe3SGgzDlf66ESvA60hdwWT6hKS6/vE4GUTCZAzseXB2l0TeE1UVmYCsIkY0NAN1fOhqqserhpYwVlDVagryQmu7OHF1IUSSdo5uI0brT6LbGR2x2BfuAs92hFBHJ5j8ZClCWApALMx0YH343UkwVReswvAIH26bCMjtyTAIMu3Klog5kdkbmfo="));
            int v11_69 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKC4FZ/CF5dRpT1jcn7NllFz3Z7IILbJWmLKt5Qcpo0ZmDjHPY+5KWcSCApVbkcfpAI/qADUV9HJhqgm16C+H0SAkivW4H1xqxc2qvPZw1qK2c+AjyqOyF0AVwdMWY7ujPhC6RlmpunFlUtvuOxBBKgxBTwBExgmrtTN5trUfUH9SWEFR53NwvkyT4neRwWhcJ2PW9RjoHGSK8dHfsCButMBHst+Y5LYe/a5kU19iy5C/kuQ47E73Fo82D3OeIMTfwaFHwh2xRmvqOIZWaGBpHreVUd9KTfaw9gJhpzU9E9vt9n/iX9Jqs81E72AwBw1AaPW1iVhRWq7LVJGwbwg/vxUHR4+41LUCqKDIUFUQVeDhU8cnuB/r2rZ1XdJoARg+4SfxHy4R1alOnXORLWkI+XtbOXprxQsAO/1bSjLsMa/n2zPga4aVqbh2qi3x/EgQDtfWb00En0qYVBCDhEoA3sfG7oKe455eM/1MaVayI9Un//dI0dB6ut9uB5PAm9ibQ5jU7WnE08Ksetem3luJdZRy0wC+xLDv5PCeXjprT/8FyHDq883sEge+NvtL8tYKrX1BGtQJ2mZxhn/9Qb3kSDegmeyUcnsSzzxXbMRKZ3J3tS9v3YWQtyI0nAuL1tKm8SuwuioqT9FhHh2tacy0oa1UKeyOoIWgP4elPR+4zI1zu5h2tpJsBLJ+Og+V57lfL7o8YOYVygFJ8tdXqcLRYSP25hYy9+y/G593tRzB4XUgLfe4qce15couEnATI5FTm/ON8wHS900xng4zBG7dTe+dguCyLGCuAbeHyyVfNMHOG8Y9xIaWRvR5EEsSrZgvIN0t9znIv8ymi3UlgUCoM5hkPB7yjOBQ72Lutgxdmxs9qjUjunR5nF1PuyTv8RaqD7v6sOOTr8S56nDRX602wbCD60TrLLSP3Nb+sQ7UytbTf7vHCQo8Ayse5u091xau0AeQOSI85wL4ABDR8Y/SSv1riXC6bn8pecJP02oN5w9GfpnT8+sRUYgHZ6GS0S5fVCWaXM2te16pMm90otsKpLu4xj3qPqsgTZh2dXDcvvfR5opM9CfyZ5XCahnZm6kqWS9vNwCl0KGyxk1h0iop36y+gj86eR3f/mPpN1JjL9GSugMQCy78fft61rBGs0/u+U6jh4f4FhVAKSpjmDGheKEZKo41S57mne7bcVPu9GhEmC1EpNkq4pEQNrn2+l7d9RL9tHIdGIoKuik+xWK/HyU5Ny0C8MW1ZGg+Jh4/G+m7OtTSAY4JB6lthnEwyTdlgu1SlZi0oJAhH+KjEpQx5zDXUOfHfAxhrYL91UzHFshlx5ZUCfKvb3CIkjjTmRIKsmXpvXH6cXY3k1efMGBDPVLHrYM3Y21f/5wnDUMsdCZeof7v/Zy8P39bDI/LH83Z1bnOPPtOQ+MkSOWHAwbM47mHoN7hYt44I/g0nszz6zvWtERX0Lbo2CrkEK/ZJ01yw/OtCNmiSM+wc71hob/sRvCtorQna/C7f6qeW1VFtu7bW3VcIfXoEYwvwOxr1aDPy47JPy/qEgIHGaoLTReXoAMtadzZYtbmBqo7dcU9JmBXZwzFbyLLnkAj1fPbcIQw6jQjpRBwdh0rOANMMZls50jRtkX1D/2girKuTvvng0G7IZBlDt8JVOjYX8BbNLIvMmfkOvSC04PaTbgMoNDOhhUw8wmRLdxIz5mKc/GhJCOXgWDQ25BnJ2J9YCQi1SudX99alp4UAqxd3v84PvRSzu2KtBSWqdKHIA0u2kw89RAW8E00Iogsdg/ixhYkZZ9U9UenCt24lI87XMSIO22pAzHiYQBSn1xCW096kAexlkd27+On1z6x6HYvpp6+CtwbsqPDm0P1D+DlpFC8h7anXhwvfzSdDE6hsIUg92Frp1/iTkFIFz6rk4eGHRyYJPbUNb0WQycF4xfPs/hXWm23AGsV9T8k3CrZzk7HkUW3vNjcttfRmm3fdIMHhjPmmoAEvXHdkm3qYzN2tmVVSHl5bH0LWqQf+6fKjONGi11XQf4vPAjlgb3Tpbf+yUwM8zfjfrSglWCKfyYnX/OkeGAX0Eg4PH5TqpZv3BHLcY45TpOu97B0xrt6Qvpbe6ipveLPLdcptMUrXp41O+7rIRyI2ydErcq4dbVAnGWBLm5wgvIdxtQd4ORn2Q+32oiSbODp35eN7fsQxc51G3HHTMkFo4PZRea6TKcoaf2+S8+eF6BLYvLXgKYEfquGe9ayUTNEU20pu/Ck2hhxwFjqD5NdkxJIE7xBUgvm28qUfolZlnv68m+9WJwqoV2P5GGemXjTXjkTYLQEgcpw20qFj08BMqMPkPUnCgDJOXTUwjwnQGVAIpjFIE2uwKASVvoa9Pe/OZw+hrLfvdh2lS2ZA15oWo="));
            int v13_27 = android.opengl.GLES20.glCreateProgram();
            v1_67.f = v13_27;
            android.opengl.GLES20.glAttachShader(v13_27, v8_63);
            android.opengl.GLES20.glAttachShader(v1_67.f, v11_69);
            android.opengl.GLES20.glLinkProgram(v1_67.f);
            int v8_66 = v1_67.s;
            int v11_70 = v1_67.r;
            if (v8_66 <= v11_70) {
                v11_23 = ((int) (v11_70 * 1036831949));
            } else {
                v11_23 = ((int) (1036831949 * v8_66));
            }
            int v13_29 = ((float) v11_23);
            v1_67.y = ((v8_66 / v13_29) * 1039516303);
            int v8_69 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v8_69, 0);
            v1_67.g = v8_69[0];
            int v13_30 = (v13_29 / 1073741824);
            int v6_22 = (v13_30 * v13_30);
            int v8_0 = ((1058642330 * v13_30) * (1058642330 * v13_30));
            int v32_1 = android.graphics.Bitmap.createBitmap(v11_23, v11_23, android.graphics.Bitmap$Config.ARGB_8888);
            int v14_21 = new int[(v11_23 * v11_23)];
            float[] v29_3 = v6_22;
            float[] v30_2 = v13_30;
            int v6_4 = 0;
            while (v6_4 < v11_23) {
                int v13_16 = 0;
                while (v13_16 < v11_23) {
                    int v34_4;
                    int v8_9;
                    int v40_0;
                    int v35_1;
                    int v33_1 = v8_0;
                    int v8_8 = ((((((float) v6_4) - v30_2) + 1056964608) * ((((float) v6_4) - v30_2) + 1056964608)) + (((((float) v13_16) - v30_2) + 1056964608) * ((((float) v13_16) - v30_2) + 1056964608)));
                    if (v8_8 > v33_1) {
                        if (v8_8 > v29_3) {
                            v35_1 = v11_23;
                            v40_0 = v12_14;
                            v34_4 = v13_16;
                            v8_9 = v14_21;
                            v8_9[((v6_4 * v35_1) + v34_4)] = 0;
                        } else {
                            v35_1 = v11_23;
                            v40_0 = v12_14;
                            v34_4 = v13_16;
                            v8_9 = v14_21;
                            v8_9[((v6_4 * v35_1) + v34_4)] = ((((int) (((float) Math.pow(((double) (1065353216 - Math.min(Math.max(((float) Math.sqrt(((double) ((v8_8 - v33_1) / (v29_3 - v33_1))))), 0), 1065353216))), 4612811918334230528)) * 1132396544)) << 24) | 16777215);
                        }
                    } else {
                        v14_21[((v6_4 * v11_23) + v13_16)] = -1;
                        v35_1 = v11_23;
                        v40_0 = v12_14;
                        v34_4 = v13_16;
                        v8_9 = v14_21;
                    }
                    v13_16 = (v34_4 + 1);
                    v14_21 = v8_9;
                    v8_0 = v33_1;
                    v11_23 = v35_1;
                    v12_14 = v40_0;
                }
                int v40 = v12_14;
                v6_4++;
            }
            int v5_76;
            int v35_3 = v11_23;
            int v40_1 = v12_14;
            v32_1.setPixels(v14_21, 0, v35_3, 0, 0, v35_3, v35_3);
            int v6_23 = v32_1;
            android.opengl.GLES20.glBindTexture(3553, v1_67.g);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLUtils.texImage2D(3553, 0, v6_23, 0);
            v6_23.recycle();
            v1_67.m0 = android.opengl.GLES20.glGetAttribLocation(v1_67.f, "aPosition");
            v1_67.o0 = android.opengl.GLES20.glGetAttribLocation(v1_67.f, "aTexCoord");
            v1_67.p0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uPosition");
            v1_67.q0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uScale");
            v1_67.r0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uTexture");
            v1_67.s0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uInnerRadius");
            v1_67.t0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uGlowPower");
            v1_67.u0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uSunCenterY");
            v1_67.v0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uSunSize");
            v1_67.w0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uHorizonY");
            v1_67.x0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uColor");
            v1_67.n0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uRot");
            v1_67.B0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uPumpkinTex");
            v1_67.C0 = android.opengl.GLES20.glGetUniformLocation(v1_67.f, "uAspect_Ratio");
            v1_67.k0 = v1_67.E0.getBoolean(v4_99.getString(2131951819), 1);
            int v5_74 = java.util.Calendar.getInstance();
            int v6_50 = new java.util.GregorianCalendar(v5_74.get(1), 9, 26);
            int v7_15 = new java.util.GregorianCalendar(v5_74.get(1), 10, 1);
            if ((!v5_74.equals(v6_50)) && ((!v5_74.after(v6_50)) || (!v5_74.before(v7_15)))) {
                v5_76 = 0;
            } else {
                v5_76 = 1;
            }
            v1_67.j0 = v5_76;
            v1_67.y0 = j5.t1.M(v4_99, 2131231397);
            int v4_103 = j5.t1.M(v4_99, 2131231398);
            v1_67.z0 = v4_103;
            if ((v1_67.j0) && (v1_67.k0)) {
                v4_103 = v1_67.y0;
            }
            v1_67.A0 = v4_103;
            c4.b.a0(v1_67.c0, v1_67.d0, v1_67.e0, -1082130432, 1065353216, -1082130432, 1065353216);
            int v1_68 = this.h;
            v1_68.getClass();
            android.opengl.GLES20.glViewport(0, 0, p43, p44);
            v1_68.d = p43;
            v1_68.e = p44;
            c4.b.j(v1_68.h);
            int v5_86 = c4.b.M(35633, q4.b.l("KOd+G86ICKS0CZskYfaItAqhEKncxfasEyPvT4HKllw8IuxBI8UYNCxcz17HYcJsD28fsZ8se4Hybg23XL0eEo26+3ZZRIIp2vPUfPtIpU6K9z3d6OxiuqgBWXlRzfd28kllXtxryEaDYQtwsqP0K8hYQv0K4ZSZXEELAn6q2wZB7S17WLvWq7SdC1vh7i9ABK/eogxLcbAp6drytk91UYv3Hsa7J75k8RsS5wHAkZXaNM2GRs5u9APCFf5vc3DiOXQKtIhExXLZAEckCdgLXUGJy4kwSMxwSLYEyeIeShgPeEewlpg/VSdWvidgwzIoJ3OsPZYwITs5/8kr4jAMhIe8wduFeEl8YzdX2Jq60LgRNOpTnroCXLc7oKZltJXfs/tHaaWD1rYYD2dtHc+LFoxwkB+XiWA58jS1IzfeDeg2D6L6oE9/s7WyraK+HIAD9b5Dv2+hzwXBBFv1gPmEjrLm9A//O3r4HSgTrCjZRVHOPfidwDN/razHFTHOtnaq9EvHRs0zTtUZLW6vAo0pbNtKYyHwFeL3YSzQwPG4un560Q4OBXPjjm1G1HcOxLGtZoHjUx0Xgax6ek10RuvlGTIO9/e4ZQBDz7N0RX04ddf520PzQoVuWfI7PTz5LqAzu2eOZuzI2EKgf7v/oHHnPIJJESNhmy1MV7AHZlriVKo="));
            int v6_55 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItAqhEKncxfasEyPvT4HKllw8IuxBI8UYNCxcz17HYcJsJUeBNlvlPBF16LBRqUfTYLQW5d1slIJl5inqvvKH3vf9qS1g2UjJURVDaJfH5q0dG6vlmWBM7hw3/AYjfkcAZ02UodRO3Ef1giFdyee6kN7LJcVtj0aPIGCzDDKYyKMUAS8/2uvFVI9IZ5+9MQmEn1putS9QC2rAm5gHkVaYDQANk6epYsjBbyMGEt6y8kckiA1/OsUzKLGcvva6H95HgrcXViK6GYMcl5Be5Ff95yxYBe6mkbxIF0WLT+ZocAv2fyAm4OMdWUnAVAqFFeoeSEnn7P0TMIPOLm3QX8gF9oGWZ4Ga/5mWR05n9Am5aOoN4nAlojT+iC59SBHPuETtdKXf1sqRxSTZHyV6AVGo01Hn7YxFhAoCcstF/IakF3xg"));
            int v7_17 = android.opengl.GLES20.glCreateProgram();
            android.opengl.GLES20.glAttachShader(v7_17, v5_86);
            android.opengl.GLES20.glAttachShader(v7_17, v6_55);
            android.opengl.GLES20.glLinkProgram(v7_17);
            int v5_87 = new int[1];
            android.opengl.GLES20.glGetProgramiv(v7_17, 35714, v5_87, 0);
            if (v5_87[0] == 0) {
                android.opengl.GLES20.glDeleteProgram(v7_17);
            }
            int v44_1;
            v1_68.i = android.opengl.GLES20.glGetAttribLocation(v7_17, "a_Position");
            v1_68.j = android.opengl.GLES20.glGetAttribLocation(v7_17, "a_Alpha");
            v1_68.k = android.opengl.GLES20.glGetAttribLocation(v7_17, "a_Size");
            v1_68.l = android.opengl.GLES20.glGetUniformLocation(v7_17, "u_Color");
            v1_68.h = v7_17;
            int v6_64 = v1_68.c;
            v1_68.F = j5.t1.z(v6_64).getBoolean("night", 0);
            v1_68.G = j5.t1.z(v6_64).getBoolean("isDay", 0);
            c4.b.a0(v1_68.W, v1_68.X, v1_68.Y, -1082130432, 1065353216, -1082130432, 1065353216);
            v1_68.q = android.opengl.GLES20.glGetUniformLocation(v1_68.h, "u_starType");
            v1_68.O = v1_68.T.getInt("hemisphere", 1);
            int v1_69 = this.s;
            v1_69.m = p43;
            v1_69.n = p44;
            v1_69.y = v1_69.d.getInt("secondaryHintColor", 0);
            n2.b v2_32 = (((float) v1_69.n) * 1028443341);
            v1_69.D = v2_32;
            v1_69.W = v2_32;
            v1_69.X = v2_32;
            v1_69.m0(1000593162, 1014350479);
            n2.b v2_35 = ((float) v1_69.m);
            v1_69.p = (1006834287 * v2_35);
            v1_69.q = (v2_35 * 1015222895);
            v1_69.t = 1084227584;
            v1_69.u = 1092616192;
            v1_69.v = -1063256064;
            v1_69.w = 1084227584;
            v1_69.n0(0);
            android.opengl.Matrix.setIdentityM(v1_69.i, 0);
            android.opengl.Matrix.setIdentityM(v1_69.j, 0);
            android.opengl.Matrix.setIdentityM(v1_69.k, 0);
            int v16_10 = v40_1;
            android.opengl.Matrix.orthoM(v1_69.j, 0, 0, ((float) p43), v16_10, 0, -1054867456, 1092616192);
            int v12_22 = v16_10;
            v1_69.G = ((float) p43);
            v1_69.H = v12_22;
            if (!m2.a.d()) {
                v44_1 = 1028443341;
            } else {
                int v1_71 = this.u;
                v1_71.r = ((float) p43);
                v1_71.s = v12_22;
                int v12_25 = c4.b.M(35633, q4.b.l("31CvLSW49ZsWqEJmlVijDDdAoq6h4MhYrB3Gp+jaLYn6qcQaX5fc2ysd4A/rIOM6NiS5iAdVx/SKYcvjL0CM/ACRZ/awXabKMJZrzUK96ERfReDeVKzEgd62RIEhmYSP8LJ5EBVf1o7AoBqgh446W6MCj4924oidVR0qx6KDEVlwRbLGF3itIouFf/PwEOWNtbr4cmxFrhnkL+dOl7Yq8HXJ39umWK/bLymreeiIitzYQXR9nDz+iPFtzdo/iei5dyHRsQwdcCv/2X4m39AMzA=="));
                int v13_37 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzYxfWIvnOvaJW+Vz8RjvGBU2DDl9761DwP0H3WO2jeI//JCSTnVRxpXwAEtKU92nQ5wOyzvggfeeSoG7h21FCll0MRZBmtgO8vFfRfGgm7S+jGEyKfiIOl3ERMcNk4xB/93hc1uN8jZI5nGekGGYmO0kl7GROWRa2Y9t/duqTx2cgTpWui2qquhLVaUN6ck1UBXnuC3f16iZ0o3+YV8IrTlMQD7TKoMDo1vlc10FTIZb2gTqyVb5V/i32VmeWsPb6lzpFJpVrYddrH3b3+X8PPJRl/PwKYZDGcKY2KejDiyde4WxBaw9MLh7KvJ+MHrv/e7+e9fD9dpv+16Et+nXGEFHCKaKQ8D77RbJf7y3kFB67upIyITpmCC7uT1cWYUVRADOPbzG2jYOYM+HrPOD9qt"));
                v44_1 = 1028443341;
                c4.b.g0(v1_71.d, v1_71.m, v1_71.n, v1_71.o, 0);
                n2.b v2_0 = android.opengl.GLES20.glCreateProgram();
                v1_71.d = v2_0;
                android.opengl.GLES20.glAttachShader(v2_0, v12_25);
                android.opengl.GLES20.glAttachShader(v1_71.d, v13_37);
                android.opengl.GLES20.glLinkProgram(v1_71.d);
                v1_71.h = android.opengl.GLES20.glGetAttribLocation(v1_71.d, "a_Position");
                v1_71.i = android.opengl.GLES20.glGetAttribLocation(v1_71.d, "a_TexCoordinate");
                v1_71.j = android.opengl.GLES20.glGetUniformLocation(v1_71.d, "u_MVPMatrix");
                v1_71.k = android.opengl.GLES20.glGetUniformLocation(v1_71.d, "u_TextureSampler");
                v1_71.l = android.opengl.GLES20.glGetUniformLocation(v1_71.d, "uAlpha");
                n2.b v2_13 = v1_71.c;
                v1_71.e = c4.b.O(v2_13, 2131231356);
                android.opengl.GLES20.glEnable(3042);
                android.opengl.GLES20.glBlendFunc(1, 771);
                v1_71.f = c4.b.q(c4.b.A());
                v1_71.g = c4.b.q(n2.j.x);
                android.opengl.Matrix.setIdentityM(v1_71.m, 0);
                v1_71.t = v3_30;
                c4.b.a0(v1_71.m, v1_71.n, v1_71.o, (- v3_30), v3_30, -1082130432, 1065353216);
                v1_71.v = v1_71.u.getBoolean(v2_13.getString(2131951819), 1);
            }
            this.v.c = p43;
            int v1_2 = this.w;
            v1_2.v = ((float) p43);
            v1_2.x = 1092616192;
            int v12_0 = (v3_30 * 1092616192);
            v1_2.w = v12_0;
            android.opengl.Matrix.orthoM(v1_2.r, 0, ((- v12_0) / 1073741824), (v12_0 / 1073741824), -1063256064, 1084227584, -1054867456, 1092616192);
            n2.b v2_17 = 0;
            while (v2_17 < 7) {
                int v3_8 = v1_2.t;
                int v4_7 = new n2.u();
                v3_8[v2_17] = v4_7;
                v1_2.m0(v4_7, 1);
                v2_17++;
            }
            int v1_3 = this.x;
            int v3_2 = ((float) this.f);
            n2.b v2_20 = (((float) this.e) / v3_2);
            v1_3.j = v3_2;
            v1_3.h = -1082130432;
            v1_3.i = 1065353216;
            v1_3.f = (- v2_20);
            v1_3.g = v2_20;
            android.opengl.Matrix.setIdentityM(v1_3.d, 0);
            android.opengl.Matrix.orthoM(v1_3.d, 0, v1_3.f, v1_3.g, v1_3.h, v1_3.i, -1054867456, 1092616192);
            int v1_5 = this.d;
            v1_5.b.x.G = v1_5.c.getBoolean(v1_5.F, 1);
            this.d.I1 = 1;
            this.d.K1 = 1;
            this.d.L1 = 1;
            this.d.J1 = 1;
            this.H = this.d.P1;
            this.z = 1;
            this.S = 0;
            m2.a.e(this.c);
            int v1_19 = (((float) this.J.getInt(this.j, 0)) * v44_1);
            this.Q = v1_19;
            n2.b v2_26 = this.t;
            v2_26.l = v1_19;
            int v1_20 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, v1_20, 0);
            v2_26.m = v1_20[0];
            int v1_22 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v1_22, 0);
            int v1_23 = v1_22[0];
            v2_26.o = v1_23;
            android.opengl.GLES20.glBindTexture(3553, v1_23);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6408, v2_26.j, v2_26.k, 0, 6408, 5121, 0);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLES20.glBindFramebuffer(36160, v2_26.m);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, v2_26.o, 0);
            int v1_26 = new int[1];
            android.opengl.GLES20.glGenRenderbuffers(1, v1_26, 0);
            int v1_27 = v1_26[0];
            android.opengl.GLES20.glBindRenderbuffer(36161, v1_27);
            android.opengl.GLES20.glRenderbufferStorage(36161, 33189, v2_26.j, v2_26.k);
            android.opengl.GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, v1_27);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int v1_28 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, v1_28, 0);
            v2_26.n = v1_28[0];
            int v1_30 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v1_30, 0);
            int v1_31 = v1_30[0];
            v2_26.p = v1_31;
            android.opengl.GLES20.glBindTexture(3553, v1_31);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6408, v2_26.j, v2_26.k, 0, 6408, 5121, 0);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLES20.glBindFramebuffer(36160, v2_26.n);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, v2_26.p, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            v2_26.u = Math.max(1, (v2_26.j / 4));
            v2_26.v = Math.max(1, (v2_26.k / 4));
            int v1_40 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, v1_40, 0);
            v2_26.q = v1_40[0];
            int v1_42 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v1_42, 0);
            int v1_43 = v1_42[0];
            v2_26.r = v1_43;
            android.opengl.GLES20.glBindTexture(3553, v1_43);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6408, v2_26.u, v2_26.v, 0, 6408, 5121, 0);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLES20.glBindFramebuffer(36160, v2_26.q);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, v2_26.r, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int v1_46 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, v1_46, 0);
            v2_26.s = v1_46[0];
            int v1_48 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v1_48, 0);
            int v1_49 = v1_48[0];
            v2_26.t = v1_49;
            android.opengl.GLES20.glBindTexture(3553, v1_49);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6408, v2_26.u, v2_26.v, 0, 6408, 5121, 0);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLES20.glBindFramebuffer(36160, v2_26.s);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, v2_26.t, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            return;
        } else {
            this.z = 0;
            return;
        }
    }

    public final void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 p2, javax.microedition.khronos.egl.EGLConfig p3)
    {
        android.opengl.GLES20.glClearColor(0, 0, 0, 1065353216);
        java.util.Objects.requireNonNull(this.d.l1);
        this.E = 2;
        android.opengl.GLES20.glEnable(2929);
        android.opengl.GLES20.glDepthFunc(515);
        n2.i v2_2 = this.x;
        if (v2_2 != null) {
            v2_2.k0(this.c, this.J);
        }
        return;
    }

    public final void p0(float p4)
    {
        n2.o v0 = this.q;
        if (v0 != null) {
            int v2_2;
            if (p4 == 0) {
                v2_2 = 0;
            } else {
                v2_2 = 1;
            }
            v0.l = v2_2;
            if (v0.g != p4) {
                v0.g = Math.max(0, Math.min(1065353216, p4));
            }
        }
        return;
    }

    public final void r0(boolean p10)
    {
        int v2 = 0;
        while (v2 < this.k.size()) {
            int v4_2;
            Object vtmp2 = this.k.get(v2);
            int v4_0 = this.y;
            int v6 = 1;
            if ((v4_0 == 4) || (v4_0 == 8)) {
                if (p10 == null) {
                    v4_2 = 0;
                } else {
                    v4_2 = 1;
                }
            } else {
                if ((v4_0 != 5) || (v2 == this.E)) {
                } else {
                }
            }
            n2.h v3_2 = ((n2.g) vtmp2).b;
            float v5_3 = v3_2.g;
            float v7 = v3_2.h;
            if (v5_3 >= v7) {
                if (v4_2 == 0) {
                    v6 = 0;
                } else {
                }
            }
            v3_2.J = v6;
            v3_2.q0(v5_3, v7);
            v2++;
        }
        return;
    }

    public final void s0(int p10, int p11, android.graphics.Bitmap p12, float[] p13, float[] p14, float p15, float p16, float p17, float p18, float p19)
    {
        if ((p12 != 0) && (!p12.isRecycled())) {
            this.m0(p10);
            if (p11 >= this.k.size()) {
                if (this.y != 3) {
                }
                int v11_3 = new n2.g(new n2.a(), new n2.h(this.c, 1));
                this.k.add(v11_3);
                n2.g v0_5 = v11_3;
                n2.f.t0(v0_5, p12, p13, p14, p15, p16, p17, p18, p19);
                v0_5.a(this.e, this.f);
            } else {
                n2.g v0_8 = ((n2.g) this.k.get(p11));
                int v11_7 = v0_8.a.D;
                if (v11_7 != 0) {
                    v11_7.h.clear();
                    v11_7.i.clear();
                }
                n2.f.t0(v0_8, p12, p13, p14, p15, p16, p17, p18, p19);
            }
            return;
        } else {
            return;
        }
    }

    public final void u0(float[] p3, int p4)
    {
        if (p3.length >= 8) {
            if (p4 < this.k.size()) {
                ((n2.g) this.k.get(p4)).b.p0(p3);
            }
            return;
        } else {
            return;
        }
    }

    public final void v0(float p3, float p4, int p5)
    {
        if (p5 < this.k.size()) {
            n2.w v5_1 = ((n2.g) this.k.get(p5)).a.D;
            if (v5_1 != null) {
                v5_1.o = p3;
                v5_1.p = p4;
            }
        }
        return;
    }
}
