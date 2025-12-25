package i2;
public final class q0 {
    public int[] A;
    public float[] B;
    public float[] C;
    public i2.i D;
    public final android.graphics.Bitmap E;
    public int F;
    public float[] G;
    public float[] H;
    public float[] I;
    public float[] J;
    public float[] K;
    public float[] L;
    public float[] M;
    public float N;
    public final String O;
    public final android.content.SharedPreferences P;
    public boolean Q;
    public boolean R;
    public java.util.Random S;
    public android.graphics.drawable.Drawable[] T;
    public android.graphics.Bitmap[] U;
    public final android.content.Context a;
    public int b;
    public int c;
    public float d;
    public float e;
    public final float f;
    public final i2.v0 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int[][] m;
    public final int[] n;
    public final android.graphics.BitmapFactory$Options o;
    public android.graphics.drawable.Drawable[] p;
    public android.graphics.Bitmap[] q;
    public int[] r;
    public int[] s;
    public int[] t;
    public int[] u;
    public int[] v;
    public float[] w;
    public int[] x;
    public int y;
    public int[] z;

    public q0(android.content.Context p10, int p11, i2.v0 p12, float p13, float p14)
    {
        this.o = new android.graphics.BitmapFactory$Options();
        int v0_2 = 0;
        this.Q = 0;
        this.R = 1;
        new m2.a();
        this.a = p10;
        this.g = p12;
        this.d = p13;
        this.e = p14;
        if (p14 <= p13) {
            this.f = (p13 / p14);
        } else {
            this.f = (p14 / p13);
        }
        this.S = p12.O0;
        if (p11 == 6) {
            p11 = 4;
        }
        this.c = p11;
        this.l();
        if (!this.k) {
            int[] v11_19 = this.c;
            if (v11_19 != 4) {
                if (v11_19 != 5) {
                    if (v11_19 != 8) {
                        if (v11_19 == 9) {
                            int[] v11_20 = new int[5];
                            this.A = v11_20;
                            v11_20[0] = 2131231347;
                            v11_20[1] = 2131231348;
                            v11_20[2] = 2131231347;
                            v11_20[3] = 2131231346;
                            v11_20[4] = 2131231345;
                        }
                    } else {
                        int[] v11_22 = new int[10];
                        this.A = v11_22;
                        v11_22[0] = 2131231118;
                        v11_22[1] = 2131231119;
                        v11_22[2] = 2131231120;
                        v11_22[3] = 2131231121;
                        v11_22[4] = 2131231122;
                        v11_22[5] = 2131231123;
                        v11_22[6] = 2131231124;
                        v11_22[7] = 2131231125;
                        v11_22[8] = 2131231126;
                        v11_22[9] = 2131231122;
                    }
                } else {
                    int[] v11_24 = new int[this.b];
                    this.A = v11_24;
                    int v12_14 = 0;
                    while (v0_2 < this.b) {
                        if (v0_2 != 2) {
                            int v2_4 = (v12_14 + 1);
                            this.A[v0_2] = new int[] {2131231111, 2131231112, 2131231113, 2131231114, 2131231115})[v12_14];
                            v12_14 = v2_4;
                        } else {
                            this.A[v0_2] = 2131231110;
                        }
                        v0_2++;
                    }
                }
            } else {
                this.k();
            }
        } else {
            int[] v11_4;
            int[] v11_27 = new int[2];
            v11_27[1] = 4;
            v11_27[0] = 3;
            int[] v11_2 = ((int[][]) reflect.Array.newInstance(Integer.TYPE, v11_27));
            this.m = v11_2;
            int v12_3 = new int[] {2131231187, 2131231188, 2131231186, 2131231191});
            v11_2[0] = v12_3;
            int v4_2 = new int[] {2131231382, 2131231383, 2131231381, 2131231386});
            v11_2[1] = v4_2;
            int v5_3 = new int[] {2131231241, 2131231242, 2131231240, 2131231245});
            v11_2[2] = v5_3;
            int[] v11_3 = this.c;
            if (v11_3 != null) {
                if (v11_3 != 1) {
                    if (v11_3 != 2) {
                        v11_4 = 0;
                    } else {
                        this.z = v5_3;
                        v11_4 = 1;
                    }
                } else {
                    this.z = v4_2;
                }
            } else {
                this.z = v12_3;
            }
            int v12_4 = new int[2];
            this.n = v12_4;
            v12_4[0] = 2131231302;
            v12_4[1] = 2131231239;
            int[] v13_1 = new int[4];
            this.A = v13_1;
            v13_1[0] = v12_4[v11_4];
            v13_1[1] = 2131231303;
            v13_1[2] = 2131231304;
            v13_1[3] = 2131231305;
        }
        int[] v11_10 = this.a.getResources();
        int v12_5 = this.o;
        int[] v13_2 = android.graphics.Bitmap$Config.ARGB_8888;
        v12_5.inPreferredConfig = v13_2;
        v12_5.inScaled = 1;
        v12_5.inMutable = 1;
        v12_5.inDensity = v11_10.getDisplayMetrics().densityDpi;
        if (this.j) {
            this.e();
        }
        this.d();
        this.E = android.graphics.Bitmap.createBitmap(1, ((int) p14), v13_2);
        this.O = p10.getString(2131951735);
        this.P = j5.t1.z(p10);
        return;
    }

    public final void a(int p4)
    {
        if (p4 != null) {
            if (p4 != 1) {
                if (p4 == 2) {
                    this.z = this.m[2];
                    this.A[0] = this.n[1];
                }
                return;
            } else {
                this.z = this.m[1];
                this.A[0] = this.n[0];
                return;
            }
        } else {
            this.z = this.m[0];
            this.A[0] = this.n[0];
            return;
        }
    }

    public final void b()
    {
        android.graphics.Canvas v0_1 = new android.graphics.Canvas();
        int v1 = this.k;
        int v2_2 = this.q;
        if ((v2_2 == 0) || (v2_2.length < 5)) {
            int v2_4 = new android.graphics.Bitmap[5];
            this.q = v2_4;
        }
        int v2_1;
        if (this.c != 8) {
            v2_1 = 1065353216;
        } else {
            v2_1 = 1061158912;
        }
        while (v1 < this.q.length) {
            android.graphics.drawable.Drawable v3_7 = (((this.S.nextFloat() * 1053609166) + 1061997773) * v2_1);
            int v5_1 = this.C[v1];
            int v4_6 = ((int) (((float) this.r[v1]) * v5_1));
            int v5_2 = ((int) ((((float) this.s[v1]) * v5_1) * v3_7));
            if ((v4_6 > 0) && (v5_2 > 0)) {
                this.q[v1] = android.graphics.Bitmap.createBitmap(v4_6, v5_2, android.graphics.Bitmap$Config.ARGB_8888);
                v0_1.setBitmap(this.q[v1]);
                v0_1.save();
                int v4_11 = this.C[v1];
                v0_1.scale(v4_11, (v3_7 * v4_11));
                this.p[this.v[v1]].draw(v0_1);
                v0_1.restore();
            }
            v1++;
        }
        return;
    }

    public final void c(int p24, int p25, boolean p26, float p27, float p28)
    {
        int v2_6 = this.y;
        this.y = p25;
        this.d = p27;
        this.e = p28;
        int[] v3_20 = 0;
        this.Q = 0;
        android.graphics.drawable.Drawable v4_0 = this.g;
        this.S = v4_0.O0;
        int v7 = p24;
        if (p24 == 6) {
            this.c = 4;
            this.l();
            this.k();
            this.f();
            v7 = 4;
        }
        int v11_10 = 1;
        if (!this.k) {
            if ((v7 != 4) && ((v7 != 8) && (v7 != 9))) {
                if (v7 != 3) {
                    int v25_1 = 0;
                    if (v7 == 5) {
                        this.d();
                        int[] v3_22 = new java.util.ArrayList();
                        int v5_28 = 0;
                        while (v5_28 < this.b) {
                            if (v5_28 != 2) {
                                v3_22.add(Integer.valueOf(v5_28));
                            }
                            v5_28++;
                        }
                        java.util.Collections.shuffle(v3_22, this.S);
                        int v5_54 = this.q;
                        if ((v5_54 == 0) || (v5_54.length == 0)) {
                            int v5_56 = new android.graphics.Bitmap[6];
                            this.q = v5_56;
                        }
                        int v5_27 = 0;
                        int v6_22 = 0;
                        while (v5_27 < this.q.length) {
                            if (v5_27 != 2) {
                                this.v[v5_27] = ((Integer) v3_22.get(v6_22)).intValue();
                                v6_22++;
                                int v9_8 = this.v;
                                int v11_3 = v9_8[v5_27];
                                if (v11_3 == 2) {
                                    v9_8[v5_27] = (v11_3 + 1);
                                }
                                this.w[v5_27] = ((((float) v4_0.s(60)) * 1008981770) + 1061997773);
                                int v9_13 = this.e;
                                int v11_6 = this.d;
                                if (v9_13 <= v11_6) {
                                    this.C[v5_27] = ((v9_13 * this.f) / ((float) this.r[this.v[v5_27]]));
                                } else {
                                    this.C[v5_27] = ((v11_6 * this.f) / ((float) this.r[this.v[v5_27]]));
                                }
                            }
                            v5_27++;
                        }
                        int v1_62 = this.e;
                        int v2_16 = this.d;
                        if (v1_62 <= v2_16) {
                            this.C[2] = (((v1_62 * this.f) / ((float) this.r[2])) * 1036831949);
                        } else {
                            this.C[2] = (((this.f * v2_16) / ((float) this.r[2])) * 1050253722);
                        }
                        v4_0.s(((int) (v2_16 * 1053609165)));
                        int v1_74 = new android.graphics.Canvas();
                        int v2_5 = 1065353216;
                        int[] v3_8 = 0;
                        while(true) {
                            android.graphics.drawable.Drawable v4_28 = this.q;
                            if (v3_8 >= v4_28.length) {
                                break;
                            }
                            if (v3_8 != 2) {
                                if (this.e < this.d) {
                                    v2_5 = 1056964608;
                                }
                                int v6_14 = this.C[v3_8];
                                v4_28[v3_8] = android.graphics.Bitmap.createBitmap(((int) ((((float) this.r[v3_8]) * v6_14) * v2_5)), ((int) (((((float) this.s[this.v[v3_8]]) * this.w[v3_8]) * v6_14) * v2_5)), android.graphics.Bitmap$Config.ARGB_8888);
                                int v5_18 = this.v[v3_8];
                                int v8_8 = this.C[v3_8];
                                this.p[v5_18].setBounds(v25_1, v25_1, ((int) ((((float) this.r[v3_8]) * v8_8) * v2_5)), ((int) (((((float) this.s[v5_18]) * this.w[v3_8]) * v8_8) * v2_5)));
                                v1_74.setBitmap(this.q[v3_8]);
                                v1_74.save();
                                this.p[this.v[v3_8]].draw(v1_74);
                                v1_74.restore();
                            }
                            v3_8++;
                            v25_1 = 0;
                        }
                        if (this.e < this.d) {
                            v2_5 = 1077936128;
                        }
                        int v5_1 = this.C[2];
                        v4_28[2] = android.graphics.Bitmap.createBitmap(((int) ((((float) this.r[2]) * v5_1) * v2_5)), ((int) ((((float) this.s[2]) * v5_1) * v2_5)), android.graphics.Bitmap$Config.ARGB_8888);
                        int v5_5 = this.C[2];
                        this.p[2].setBounds(0, 0, ((int) ((((float) this.r[2]) * v5_5) * v2_5)), ((int) ((((float) this.s[2]) * v5_5) * v2_5)));
                        v1_74.setBitmap(this.q[2]);
                        this.p[2].draw(v1_74);
                    }
                } else {
                    this.d();
                    int v1_1 = this.e;
                    int v2_7 = this.q;
                    if ((v2_7 == 0) || (v2_7.length == 0)) {
                        int v2_9 = new android.graphics.Bitmap[3];
                        this.q = v2_9;
                    }
                    int v2_10 = 0;
                    while(true) {
                        android.graphics.drawable.Drawable v4_13 = this.q;
                        if (v2_10 >= v4_13.length) {
                            break;
                        }
                        v4_13[v2_10] = android.graphics.Bitmap.createBitmap(((int) (this.d * this.f)), ((int) v1_1), android.graphics.Bitmap$Config.ARGB_8888);
                        v2_10++;
                    }
                    int v1_2 = v4_13.length;
                    int v2_11 = 0;
                    while (v2_11 < v1_2) {
                        v4_13[v2_11].eraseColor(0);
                        v2_11++;
                    }
                    int v1_3 = this.D;
                    int v2_12 = this.q;
                    android.graphics.drawable.Drawable v4_14 = v1_3.i;
                    int v6_24 = v2_12.length;
                    int v8_11 = new int[][v6_24];
                    v1_3.r = v8_11;
                    int v8_12 = new int[v6_24];
                    v1_3.d = v8_12;
                    int v8_13 = new float[][v6_24];
                    v1_3.n = v8_13;
                    int v8_14 = new float[][v6_24];
                    v1_3.o = v8_14;
                    int v8_15 = new int[][v6_24];
                    v1_3.p = v8_15;
                    int v8_16 = new int[][v6_24];
                    v1_3.q = v8_16;
                    int v8_17 = new int[][v6_24];
                    v1_3.s = v8_17;
                    int v8_18 = new int[][][v6_24];
                    v1_3.t = v8_18;
                    int v8_19 = new int[][][v6_24];
                    v1_3.u = v8_19;
                    int v8_20 = new int[][][][v6_24];
                    v1_3.w = v8_20;
                    int v8_21 = new int[][][][v6_24];
                    v1_3.x = v8_21;
                    int v8_22 = new int[][][v6_24];
                    v1_3.v = v8_22;
                    int v8_23 = 0;
                    while(true) {
                        int v9_19 = 10;
                        if (v8_23 >= v6_24) {
                            break;
                        }
                        v1_3.d[v8_23] = (v4_14.s(15) + 10);
                        float[] v10_5 = v1_3.d[v8_23];
                        int v12_17 = new float[v10_5];
                        v1_3.n[v8_23] = v12_17;
                        int v12_18 = new float[v10_5];
                        v1_3.o[v8_23] = v12_18;
                        int v12_19 = new int[v10_5];
                        v1_3.q[v8_23] = v12_19;
                        int v12_20 = new int[v10_5];
                        v1_3.s[v8_23] = v12_20;
                        int v12_21 = new int[][v10_5];
                        v1_3.t[v8_23] = v12_21;
                        int v12_22 = new int[][v10_5];
                        v1_3.u[v8_23] = v12_22;
                        int v12_23 = new int[][][v10_5];
                        v1_3.w[v8_23] = v12_23;
                        int v12_24 = new int[][][v10_5];
                        v1_3.x[v8_23] = v12_24;
                        int v12_25 = new int[][v10_5];
                        v1_3.v[v8_23] = v12_25;
                        int v12_26 = new int[v10_5];
                        v1_3.p[v8_23] = v12_26;
                        float[] v10_6 = new int[v10_5];
                        v1_3.r[v8_23] = v10_6;
                        int v9_35 = 0;
                        while (v9_35 < v1_3.d[v8_23]) {
                            float[] v10_10 = v1_3.r[v8_23];
                            int v12_28 = v1_3.l.length;
                            int v14_15 = v1_3.z;
                            if ((v14_15 == 0) || ((v14_15.length != v12_28) || (v1_3.A >= v12_28))) {
                                int v14_18 = new int[v12_28];
                                v1_3.z = v14_18;
                                int v14_19 = 0;
                                while (v14_19 < v12_28) {
                                    v1_3.z[v14_19] = v14_19;
                                    v14_19++;
                                }
                                int v12_29 = (v12_28 - 1);
                                while (v12_29 > 0) {
                                    int v14_41 = ((int) (v1_3.y.nextFloat() * ((float) (v12_29 + 1))));
                                    int[] v15_17 = v1_3.z;
                                    int v16_9 = v15_17[v12_29];
                                    v15_17[v12_29] = v15_17[v14_41];
                                    v15_17[v14_41] = v16_9;
                                    v12_29--;
                                }
                                v1_3.A = 0;
                            }
                            int v12_30 = v1_3.z;
                            int v14_20 = v1_3.A;
                            v1_3.A = (v14_20 + 1);
                            v10_10[v9_35] = v12_30[v14_20];
                            float[] v10_12 = v1_3.q[v8_23];
                            int v14_22 = v1_3.r[v8_23];
                            v10_12[v9_35] = v1_3.e[v14_22[v9_35]];
                            v1_3.p[v8_23][v9_35] = v1_3.m[v14_22[v9_35]];
                            if (v9_35 > 0) {
                                int v12_37 = v1_3.n[v8_23];
                                int v14_25 = (v9_35 - 1);
                                int[] v15_9 = v12_37[v14_25];
                                v12_37[v9_35] = v15_9;
                                v12_37[v9_35] = (v15_9 + ((float) v10_12[v14_25]));
                            }
                            float[] v10_16 = v1_3.n[v8_23];
                            v10_16[v9_35] = (v10_16[v9_35] + ((float) v4_14.s(((int) ((v1_3.c * v1_3.g) / ((float) v1_3.d[v8_23]))))));
                            v1_3.o[v8_23][v9_35] = ((float) (- v1_3.l[v1_3.r[v8_23][v9_35]].getHeight()));
                            float[] v10_20 = v1_3.o[v8_23];
                            v10_20[v9_35] = (v10_20[v9_35] + ((float) v2_12[v8_23].getHeight()));
                            v9_35++;
                        }
                        v8_23++;
                    }
                    int v1_5 = 0;
                    while (v1_5 < this.b) {
                        int v2_15 = this.D;
                        android.graphics.drawable.Drawable v4_15 = v2_15.i;
                        int v6_25 = v3_20;
                        while (v6_25 < v2_15.d[v1_5]) {
                            int v8_29 = v2_15.r[v1_5][v6_25];
                            float[] v10_2 = v2_15.l[v8_29];
                            int v12_12 = v2_15.q[v1_5][v6_25];
                            int v8_30 = v2_15.f[v8_29];
                            int v9_20 = ((float) v8_30);
                            v2_15.s[v1_5][v6_25] = ((int) ((1014350479 * v9_20) + ((float) v4_15.s(v9_19))));
                            int v14_3 = v2_15.s;
                            int[] v15_5 = v14_3[v1_5][v6_25];
                            int v25_2 = v3_20;
                            int v27_1 = v11_10;
                            int v11_11 = new int[][v15_5];
                            v2_15.w[v1_5][v6_25] = v11_11;
                            int v11_14 = new int[][v14_3[v1_5][v6_25]];
                            v2_15.x[v1_5][v6_25] = v11_14;
                            int v11_17 = new int[v14_3[v1_5][v6_25]];
                            v2_15.u[v1_5][v6_25] = v11_17;
                            int[] v3_16 = v2_15.t;
                            int v14_6 = new int[v14_3[v1_5][v6_25]];
                            v3_16[v1_5][v6_25] = v14_6;
                            v3_16[v1_5][v6_25][v25_2] = v25_2;
                            int[] v3_19 = v25_2;
                            while (v3_19 < v15_5) {
                                int v11_22 = v2_15.t[v1_5][v6_25][v3_19];
                                int v5_30 = ((int) (v9_20 * 1033476506));
                                if (v3_19 != null) {
                                    int v5_36 = v2_15.t[v1_5][v6_25][(v3_19 - 1)];
                                    v11_22 = ((v11_22 + v5_36) + ((int) (((v9_20 / ((float) v15_5)) + ((float) v4_15.s(v5_30))) - ((float) v4_15.s(v5_30)))));
                                    if ((v5_36 - Math.abs(v11_22)) <= 8) {
                                        v11_22 += 8;
                                    }
                                }
                                if (v11_22 < v8_30) {
                                    if (v11_22 <= 0) {
                                        v11_22 = v27_1;
                                    }
                                } else {
                                    v11_22 = (v8_30 - 1);
                                }
                                v2_15.t[v1_5][v6_25][v3_19] = v11_22;
                                v2_15.u[v1_5][v6_25][v3_19] = (v4_15.s(4) + 1);
                                int v13_11 = v2_15.u;
                                int v14_13 = new int[v13_11[v1_5][v6_25][v3_19]];
                                v2_15.w[v1_5][v6_25][v3_19] = v14_13;
                                int v13_15 = new int[v13_11[v1_5][v6_25][v3_19]];
                                v2_15.x[v1_5][v6_25][v3_19] = v13_15;
                                int v5_52 = ((v2_15.b - v9_20) + ((float) v11_22));
                                int v11_25 = v25_2;
                                int v13_16 = v11_25;
                                int v14_14 = v13_16;
                                int v16_8 = v1_5;
                                while (v11_25 < v2_15.u[v16_8][v6_25][v3_19]) {
                                    int v1_37;
                                    int v17_1 = v2_15.w[v16_8][v6_25][v3_19][v11_25];
                                    int v20_0 = ((float) v12_12);
                                    v2_15.x[v16_8][v6_25][v3_19][v11_25] = (v4_15.s(((int) (v20_0 * 1041865114))) + 1);
                                    int v18_1 = v2_15.x[v16_8][v6_25][v3_19][v11_25];
                                    android.graphics.drawable.Drawable v19_6 = (((1017370378 * v20_0) + ((float) v4_15.s(((int) (v20_0 * 1048576000))))) + (((float) v13_16) + ((float) v14_14)));
                                    if (v19_6 <= v20_0) {
                                        v1_37 = v19_6;
                                    } else {
                                        v1_37 = ((float) (v12_12 - v18_1));
                                    }
                                    int v1_40 = (v17_1 + ((int) v1_37));
                                    int v17_2 = v3_19;
                                    int[] v3_24 = v27_1;
                                    if (v1_40 >= v3_24) {
                                        if (v1_40 >= v12_12) {
                                            v1_40 = (v12_12 - 1);
                                        }
                                        v27_1 = v3_24;
                                    } else {
                                        v27_1 = v3_24;
                                        v1_40 = v27_1;
                                    }
                                    if ((v1_40 + v18_1) >= v12_12) {
                                        v1_40 = ((v12_12 - v18_1) - 1);
                                    }
                                    int v22;
                                    int[] v3_26 = ((int) v5_52);
                                    android.graphics.drawable.Drawable v19_7 = v4_15;
                                    android.graphics.drawable.Drawable v4_16 = v10_2.getPixel(v1_40, v3_26);
                                    if (android.graphics.Color.alpha(v4_16) == 0) {
                                        v22 = v5_52;
                                        v2_15.w[v16_8][v6_25][v17_2][v11_25] = -1;
                                    } else {
                                        int v20_2 = v1_40;
                                        v22 = v5_52;
                                        if (android.graphics.Color.red(v4_16) != 255) {
                                            int v1_44 = v10_2.getPixel((v20_2 + v18_1), v3_26);
                                            if ((android.graphics.Color.alpha(v1_44) != 0) && (android.graphics.Color.red(v1_44) != 255)) {
                                                if (v4_16 == v1_44) {
                                                    int v1_49 = v2_15.x[v16_8][v6_25][v17_2][v11_25];
                                                    v2_15.w[v16_8][v6_25][v17_2][v11_25] = v20_2;
                                                    v14_14 = v1_49;
                                                    v13_16 = v20_2;
                                                } else {
                                                    v2_15.w[v16_8][v6_25][v17_2][v11_25] = -1;
                                                }
                                            } else {
                                                v2_15.w[v16_8][v6_25][v17_2][v11_25] = -1;
                                            }
                                        }
                                    }
                                    v11_25++;
                                    v3_19 = v17_2;
                                    v4_15 = v19_7;
                                    v5_52 = v22;
                                }
                                v3_19++;
                                v1_5 = v16_8;
                                int v13 = 8;
                            }
                            android.graphics.drawable.Drawable v19 = v4_15;
                            v6_25++;
                            v3_20 = v25_2;
                            v11_10 = v27_1;
                            v9_19 = 10;
                        }
                        p27 = v11_10;
                        v1_5++;
                        v9_19 = 10;
                    }
                }
            } else {
                int v5_63 = 0;
                this.d();
                int[] v3_38 = new java.util.ArrayList();
                int v6_32 = this.p.length;
                int v9_37 = 0;
                while (v9_37 <= (v6_32 - 1)) {
                    v3_38.add(Integer.valueOf(v9_37));
                    v9_37++;
                }
                java.util.Collections.shuffle(v3_38, this.S);
                while (v5_63 < v6_32) {
                    if (this.c == 9) {
                        this.v[v5_63] = v5_63;
                    } else {
                        this.v[v5_63] = ((Integer) v3_38.get((v5_63 % v3_38.size()))).intValue();
                    }
                    this.w[v5_63] = ((((float) v4_0.s(60)) * 1008981770) + 1061997773);
                    this.r[v5_63] = this.p[this.v[v5_63]].getBounds().right;
                    if (this.e <= this.d) {
                        this.s[v5_63] = this.p[this.v[v5_63]].getBounds().bottom;
                        this.C[v5_63] = (this.d / ((float) this.r[v5_63]));
                        int v9_51 = this.s;
                        v9_51[v5_63] = ((int) (((float) v9_51[v5_63]) * 1058642330));
                    } else {
                        this.s[v5_63] = this.p[this.v[v5_63]].getBounds().bottom;
                        this.C[v5_63] = ((this.d * this.f) / ((float) this.r[this.v[v5_63]]));
                    }
                    v5_63++;
                }
                this.b();
            }
        } else {
            if ((this.y != v2_6) || (this.c != v7)) {
                int v2_22 = 1;
            } else {
                int v2_18 = this.q;
                if ((v2_18 != 0) && ((v2_18[1] != 0) && (this.l == p26))) {
                    v2_22 = 0;
                }
            }
            // Both branches of the condition point to the same code.
            // if (this.q == null) {
                if (((v7 != 0) && (v7 != 1)) || (this.c != 2)) {
                    android.graphics.drawable.Drawable v4_20 = 0;
                } else {
                    v4_20 = 1;
                }
                int v6_34;
                int v6_33 = this.c;
                if (((v6_33 != 0) && (v6_33 != 1)) || (v7 != 2)) {
                    v6_34 = 0;
                } else {
                    v6_34 = 1;
                }
                if ((v4_20 == null) && (v6_34 == 0)) {
                    v11_10 = 0;
                }
                this.R = v11_10;
                this.c = v7;
                this.l = p26;
                if ((v2_22 == 0) || (!this.j)) {
                    this.n();
                } else {
                    this.b = 5;
                    int v1_71 = new android.graphics.Bitmap[5];
                    this.q = v1_71;
                    this.e();
                    this.n();
                    int v1_72 = new android.graphics.Bitmap[4];
                    this.U = v1_72;
                    int v1_73 = 0;
                    while (v1_73 < this.T.length) {
                        int v5_69 = this.C[0];
                        this.U[v1_73] = android.graphics.Bitmap.createBitmap(((int) (((float) this.r[0]) * v5_69)), ((int) (((float) this.s[0]) * v5_69)), android.graphics.Bitmap$Config.ARGB_8888);
                        int v2_29 = new android.graphics.Canvas(this.U[v1_73]);
                        v2_29.scale(this.C[0], this.C[0]);
                        this.T[v1_73].draw(v2_29);
                        v1_73++;
                    }
                    this.q[0] = this.U[this.y];
                }
                if (this.R) {
                    this.d();
                }
                this.b();
            // }
        }
        this.c = v7;
        return;
    }

    public final void d()
    {
        if (this.R) {
            int v1_32 = this.c;
            int[] v2_1 = this.f;
            android.graphics.Bitmap$Config v4_1 = this.a;
            if ((v1_32 != 0) && ((v1_32 != 1) && (v1_32 != 2))) {
                if ((v1_32 != 4) && ((v1_32 != 8) && (v1_32 != 9))) {
                    if (v1_32 != 3) {
                        if (v1_32 == 5) {
                            int v1_31;
                            int v1_29 = new android.graphics.drawable.Drawable[this.A.length];
                            this.p = v1_29;
                            if (!this.l) {
                                v1_31 = 1036831949;
                            } else {
                                v1_31 = 1050253722;
                            }
                            int v6_7 = 0;
                            while(true) {
                                int[] v7_7 = this.A;
                                if (v6_7 >= v7_7.length) {
                                    break;
                                }
                                this.p[v6_7] = j5.t1.A(v4_1, v7_7[v6_7]);
                                int[] v7_11 = this.p[v6_7];
                                if (v7_11 != null) {
                                    int[] v7_13 = ((float) v7_11.getIntrinsicWidth());
                                    float v10_3 = ((this.d / v7_13) * v2_1);
                                    this.p[v6_7].setBounds(0, 0, ((int) (v7_13 * v10_3)), ((int) (((float) this.p[v6_7].getIntrinsicHeight()) * v10_3)));
                                    this.r[v6_7] = this.p[v6_7].getBounds().right;
                                    this.s[v6_7] = this.p[v6_7].getBounds().bottom;
                                    this.x[v6_7] = this.g.s(1);
                                    if (v6_7 == 2) {
                                        int[] v7_19 = this.s;
                                        v7_19[v6_7] = ((int) (((float) v7_19[v6_7]) * v1_31));
                                        int[] v7_20 = this.r;
                                        v7_20[v6_7] = ((int) (((float) v7_20[v6_7]) * v1_31));
                                    }
                                }
                                v6_7++;
                            }
                        }
                    } else {
                        int v8_26 = this.e;
                        i2.i v3_12 = new i2.i(v4_1, this.f, this.g, this.d, v8_26);
                        this.D = v3_12;
                        int v1_1 = 16;
                        int[] v2_0 = new int[16];
                        v2_0 = {2131231091, 2131231100, 2131231101, 2131231102, 2131231103, 2131231104, 2131231105, 2131231106, 2131231107, 2131231092, 2131231093, 2131231094, 2131231095, 2131231096, 2131231097, 2131231098};
                        android.graphics.Canvas v5_2 = new android.graphics.Canvas();
                        int v6_0 = new android.graphics.drawable.Drawable[16];
                        int[] v7_0 = new int[16];
                        v3_12.e = v7_0;
                        int[] v7_1 = new int[16];
                        v3_12.f = v7_1;
                        int[] v7_2 = new android.graphics.Bitmap[16];
                        v3_12.l = v7_2;
                        int[] v7_3 = new int[16];
                        v3_12.m = v7_3;
                        int[] v7_4 = 0;
                        while (v7_4 < v1_1) {
                            v6_0[v7_4] = j5.t1.A(v3_12.a, v2_0[v7_4]);
                            if (v7_4 == null) {
                                v3_12.h = v8_26;
                                int v13_2 = v6_0[0];
                                java.util.Objects.requireNonNull(v13_2);
                                v3_12.h = ((v8_26 / ((float) v13_2.getIntrinsicHeight())) * 1057803469);
                            }
                            int v1_2 = v3_12.h;
                            v6_0[v7_4].setBounds(0, 0, ((int) (((float) v6_0[v7_4].getIntrinsicWidth()) * v1_2)), ((int) (((float) v6_0[v7_4].getIntrinsicHeight()) * v1_2)));
                            v3_12.e[v7_4] = v6_0[v7_4].getBounds().right;
                            v3_12.f[v7_4] = v6_0[v7_4].getBounds().bottom;
                            v3_12.l[v7_4] = android.graphics.Bitmap.createBitmap(v3_12.e[v7_4], ((int) v8_26), android.graphics.Bitmap$Config.ARGB_8888);
                            v5_2.setBitmap(v3_12.l[v7_4]);
                            v5_2.save();
                            v5_2.translate(0, (v8_26 - ((float) v6_0[v7_4].getBounds().bottom)));
                            v6_0[v7_4].draw(v5_2);
                            v5_2.restore();
                            if (v7_4 != 9) {
                                v3_12.m[v7_4] = 0;
                            } else {
                                v3_12.m[v7_4] = 8;
                            }
                            v7_4++;
                            v1_1 = 16;
                        }
                        this.b = 3;
                    }
                } else {
                    this.f();
                }
            } else {
                this.p[0] = this.T[this.y].mutate();
                int v1_18 = 0;
                while(true) {
                    i2.i v3_3 = this.A;
                    if (v1_18 >= v3_3.length) {
                        break;
                    }
                    android.graphics.Canvas v5_5 = (v1_18 + 1);
                    this.p[v5_5] = j5.t1.A(v4_1, v3_3[v1_18]);
                    int v1_22 = this.p[v5_5];
                    if (v1_22 != 0) {
                        int v1_25 = ((float) v1_22.getIntrinsicWidth());
                        int v6_6 = ((this.d / v1_25) * v2_1);
                        this.p[v5_5].setBounds(0, 0, ((int) (v1_25 * v6_6)), ((int) (((float) this.p[v5_5].getIntrinsicHeight()) * v6_6)));
                    }
                    v1_18 = v5_5;
                }
            }
            this.R = 0;
            return;
        } else {
            return;
        }
    }

    public final void e()
    {
        if (this.k) {
            int v0_2 = new android.graphics.drawable.Drawable[4];
            this.T = v0_2;
            int v1 = 0;
            while(true) {
                int v2_6 = this.T;
                if (v1 >= v2_6.length) {
                    break;
                }
                v2_6[v1] = j5.t1.A(this.a, this.z[v1]);
                int v2_1 = this.T[v1];
                if (v2_1 != 0) {
                    int v2_3 = ((float) v2_1.getIntrinsicWidth());
                    float v4_3 = ((this.d / v2_3) * this.f);
                    this.T[v1].setBounds(0, 0, ((int) (v2_3 * v4_3)), ((int) (((float) this.T[v1].getIntrinsicHeight()) * v4_3)));
                }
                v1++;
            }
        }
        return;
    }

    public final void f()
    {
        int v1 = 0;
        while(true) {
            int[] v2_4 = this.A;
            if (v1 >= v2_4.length) {
                break;
            }
            this.p[v1] = j5.t1.A(this.a, v2_4[v1]);
            int[] v2_2 = this.p[v1];
            if (v2_2 != null) {
                int[] v2_5 = ((float) v2_2.getIntrinsicWidth());
                float v4_2 = ((this.d / v2_5) * this.f);
                this.p[v1].setBounds(0, 0, ((int) (v2_5 * v4_2)), ((int) (((float) this.p[v1].getIntrinsicHeight()) * v4_2)));
                this.r[v1] = this.p[v1].getBounds().right;
                this.s[v1] = this.p[v1].getBounds().bottom;
            }
            v1++;
        }
        return;
    }

    public final void finalize()
    {
        try {
            this.g();
            super.finalize();
            return;
        } catch (Throwable v0) {
            super.finalize();
            throw v0;
        }
    }

    public final void g()
    {
        int v0_0 = this.q;
        if (v0_0 != 0) {
            int v1 = v0_0.length;
            int v2 = 0;
            while (v2 < v1) {
                int v3 = v0_0[v2];
                if ((v3 != 0) && (!v3.isRecycled())) {
                    v3.recycle();
                }
                v2++;
            }
        }
        this.q = 0;
        return;
    }

    public final int[] h(android.graphics.Bitmap[] p14)
    {
        if ((p14 != 0) && (p14.length != 0)) {
            int v2_1;
            int v0_1 = p14.length;
            int[] v1 = new int[v0_1];
            if (this.c != 5) {
                v2_1 = 30;
            } else {
                v2_1 = 170;
            }
            int[] v3_0 = new int[v2_1];
            int v4 = 1;
            while (v4 < v0_1) {
                int v5_1 = p14[v4].getWidth();
                int v6_1 = p14[v4].getHeight();
                int v7 = (v5_1 / v2_1);
                int v8 = 0;
                int v9 = 0;
                while (v9 < v2_1) {
                    int v10 = 0;
                    while (v10 < v6_1) {
                        int v11_0 = (v7 * v9);
                        if ((v11_0 > v5_1) || ((v11_0 < 0) || (android.graphics.Color.red(p14[v4].getPixel(v11_0, v10)) == 0))) {
                            v10 += 5;
                        } else {
                            v3_0[v9] = v10;
                            break;
                        }
                    }
                    v9++;
                }
                int v5_2 = v3_0[0];
                while (v8 < v2_1) {
                    int v6_2 = v3_0[v8];
                    if (v6_2 > v5_2) {
                        v5_2 = v6_2;
                    }
                    v8++;
                }
                v1[v4] = v5_2;
                v4++;
            }
            return v1;
        } else {
            return 0;
        }
    }

    public final boolean i()
    {
        if (this.c != 6) {
            return this.k;
        } else {
            return 0;
        }
    }

    public final int j()
    {
        int v0_0 = this.c;
        if ((v0_0 != 0) && ((v0_0 != 1) && (v0_0 != 2))) {
            if (v0_0 != 3) {
                if (v0_0 != 4) {
                    if (v0_0 != 5) {
                        if (v0_0 != 8) {
                            if (v0_0 != 9) {
                                return 0;
                            } else {
                                return 5;
                            }
                        } else {
                            return 10;
                        }
                    } else {
                        return 6;
                    }
                } else {
                    return 5;
                }
            } else {
                return 3;
            }
        } else {
            return 5;
        }
    }

    public final void k()
    {
        int[] v0_1 = new int[5];
        this.A = v0_1;
        v0_1[0] = 2131231172;
        v0_1[1] = 2131231173;
        v0_1[2] = 2131231174;
        v0_1[3] = 2131231175;
        v0_1[4] = 2131231176;
        return;
    }

    public final void l()
    {
        int v4;
        int v0_0 = this.c;
        int v3_0 = 1;
        if ((v0_0 != 0) && ((v0_0 != 1) && (v0_0 != 2))) {
            v4 = 0;
        } else {
            v4 = 1;
        }
        this.k = v4;
        this.j = v4;
        if ((v0_0 != 0) && ((v0_0 != 1) && (v0_0 != 2))) {
            v3_0 = 0;
        }
        this.i = v3_0;
        this.h = (v4 ^ 1);
        if (v4 != 0) {
            int v0_2 = this.D;
            if (v0_2 != 0) {
                v0_2.a();
                this.D = 0;
            }
        }
        if (!this.k) {
            int v0_5 = this.c;
            if (v0_5 != 4) {
                if (v0_5 != 5) {
                    if (v0_5 != 6) {
                        if (v0_5 != 8) {
                            if (v0_5 != 9) {
                                this.b = 3;
                            } else {
                                this.b = 5;
                            }
                        } else {
                            this.b = 10;
                        }
                    } else {
                        this.b = 0;
                    }
                } else {
                    this.b = 6;
                }
            } else {
                this.b = 5;
            }
        } else {
            this.b = 5;
        }
        int v0_8 = this.b;
        int[] v1_2 = new int[v0_8];
        this.r = v1_2;
        int[] v1_3 = new int[v0_8];
        this.s = v1_3;
        int[] v1_4 = new int[v0_8];
        this.t = v1_4;
        int[] v1_5 = new int[v0_8];
        this.u = v1_5;
        int[] v1_6 = new float[v0_8];
        this.C = v1_6;
        int[] v1_7 = new android.graphics.drawable.Drawable[v0_8];
        this.p = v1_7;
        int[] v1_8 = new android.graphics.Bitmap[v0_8];
        this.q = v1_8;
        int[] v1_9 = new int[v0_8];
        this.v = v1_9;
        int[] v1_10 = new int[v0_8];
        this.x = v1_10;
        int v0_9 = new float[v0_8];
        this.w = v0_9;
        return;
    }

    public final void m(android.graphics.Bitmap[] p26)
    {
        i2.q0 v0 = this;
        if ((p26 != null) && (p26.length != 0)) {
            int v2_20 = 0;
            int v3_14 = 0;
            while (v3_14 < this.j()) {
                this.t[v3_14] = p26[v3_14].getWidth();
                this.u[v3_14] = p26[v3_14].getHeight();
                v3_14++;
            }
            int v3_3 = this.j();
            float[] v4_0 = new float[v3_3];
            this.B = v4_0;
            float v6_0 = 1020054733;
            int v9_3 = 1;
            if (this.c != 3) {
                float[] v4_5 = this.h(p26);
                if (v4_5 != null) {
                    int v10_1 = (v3_3 - 1);
                    this.B[v10_1] = (((float) p26[v10_1].getHeight()) / this.e);
                    int v11_14 = this.c;
                    if ((v11_14 == 5) || (v11_14 == 4)) {
                        int v11_32 = this.B;
                        v11_32[v10_1] = (v11_32[v10_1] - 1017370378);
                    }
                    int v3_13 = (v3_3 - 2);
                    while (v3_13 >= 0) {
                        if ((this.c != 5) || (v3_13 != 2)) {
                            float[] v13_4 = this.e;
                            this.B[v3_13] = (((float) p26[v3_13].getHeight()) / v13_4);
                            int v10_6 = this.B;
                            int v14_3 = (v3_13 + 1);
                            int v11_20 = (v10_6[v3_13] + v10_6[v14_3]);
                            v10_6[v3_13] = v11_20;
                            int v11_21 = (v11_20 - (((float) v4_5[v14_3]) / v13_4));
                            v10_6[v3_13] = v11_21;
                            int v11_22 = (v11_21 - 1022739087);
                            v10_6[v3_13] = v11_22;
                            float[] v13_6 = this.c;
                            if ((v13_6 != 2) || (v3_13 != 1)) {
                                if (v13_6 == 5) {
                                    v10_6[2] = (v10_6[2] - 1033476506);
                                }
                            } else {
                                v10_6[v3_13] = (v11_22 - 1020054733);
                            }
                            if ((v13_6 == 8) && (!this.l)) {
                                v10_6[v3_13] = (v10_6[v3_13] + 1017370378);
                            }
                            if ((v13_6 == null) && (v3_13 == 0)) {
                                v10_6[0] = (v10_6[0] + 1020054733);
                            }
                        } else {
                            int v10_7 = (v3_13 + 1);
                            v4_5[2] = v4_5[v10_7];
                            int v11_34 = this.B;
                            v11_34[v3_13] = v11_34[v10_7];
                        }
                        v3_13--;
                    }
                } else {
                    return;
                }
            }
            float v19_0;
            int v17_0;
            float v22_0;
            int v3_15 = this.B;
            int v10_3 = 1064514355;
            v3_15[0] = Math.min(v3_15[0], 1064514355);
            int v3_16 = this.c;
            float[] v4_11 = this.g;
            if (v3_16 != 5) {
                v17_0 = 0;
                v19_0 = 1020054733;
                v22_0 = 1;
                if (v3_16 == 3) {
                    int v2_29 = 0;
                    while (v2_29 < p26.length) {
                        this.B[v2_29] = (((float) this.u[v2_29]) / this.e);
                        v2_29++;
                    }
                }
            } else {
                int v11_4 = 20;
                if (this.e <= this.d) {
                    this.B[2] = ((((float) v4_11.s(20)) * 1008981770) + 1060320051);
                } else {
                    this.B[2] = ((((float) v4_11.s(20)) * 1008981770) + 1056964608);
                }
                int v3_0;
                if (!this.P.getBoolean(this.O, 1)) {
                    v3_0 = ((this.S.nextFloat() * this.d) * 1056964608);
                } else {
                    v3_0 = ((float) (((double) (this.d - ((float) this.t[2]))) * 4602678819172646912));
                }
                this.N = v3_0;
                this.F = 200;
                float v5_3 = new float[200];
                this.G = v5_3;
                float v5_4 = new float[200];
                this.H = v5_4;
                float v5_5 = new float[200];
                this.I = v5_5;
                float v5_6 = new float[200];
                this.J = v5_6;
                float v5_7 = new float[200];
                this.K = v5_7;
                float v5_8 = new float[200];
                this.L = v5_8;
                int v3_5 = new float[200];
                this.M = v3_5;
                int v3_7 = this.t[2];
                float v5_14 = ((float) ((int) (((float) this.u[2]) * 1048576000)));
                int v12_3 = 1065353216;
                float[] v8_3 = (((1065353216 - v0.B[2]) * v0.e) + (1036831949 * v5_14));
                int v7_3 = 7;
                float[] v13_1 = new float[7];
                v13_1 = {1043207291, 1042536202, 1040522936, 1041865114, 1028443341, 1036831949, 1028443341};
                int v14_1 = new float[7];
                v14_1 = {1045220557, 1046562734, 1051931443, 1054280253, 1056293519, 1060320051, 1060739482};
                int v15_0 = 0;
                int v16_0 = 0;
                while (v15_0 < v7_3) {
                    int v17_1 = v2_20;
                    int v2_19 = (this.S.nextInt(v11_4) + 10);
                    float[] v18_0 = v13_1[v15_0];
                    float v19_1 = v6_0;
                    float v6_2 = ((float) v3_7);
                    float v20 = (v18_0 * v6_2);
                    float[] v18_2 = ((v12_3 - v18_0) * v6_2);
                    float v6_5 = ((v14_1[v15_0] * v5_14) + v8_3);
                    int v7_7 = new java.util.ArrayList();
                    while ((v20 + 1092616192) < v18_2) {
                        float v22_4 = v9_3;
                        v7_7.add(Float.valueOf(v20));
                        v20 = (((this.S.nextFloat() * 1106247680) + 1084227584) + v20);
                        v9_3 = v22_4;
                    }
                    float v22_3 = v9_3;
                    java.util.Collections.shuffle(v7_7, this.S);
                    float[] v18_3 = v10_3;
                    int v9_5 = v16_0;
                    int v10_2 = v17_1;
                    while ((v10_2 < v2_19) && ((v9_5 < this.F) && (v10_2 < v7_7.size()))) {
                        int v11_8 = ((this.S.nextFloat() * 1092616192) + 1073741824);
                        int v23_1 = v12_3;
                        int v12_10 = (this.S.nextFloat() + v23_1);
                        int v24 = v2_19;
                        this.I[v9_5] = v11_8;
                        this.J[v9_5] = v12_10;
                        this.G[v9_5] = (((Float) v7_7.get(v10_2)).floatValue() + this.N);
                        this.H[v9_5] = v6_5;
                        this.K[v9_5] = v23_1;
                        this.L[v9_5] = v18_3;
                        this.M[v9_5] = 1062836634;
                        v10_2++;
                        v9_5++;
                        v12_3 = v23_1;
                        v2_19 = v24;
                    }
                    v15_0++;
                    v16_0 = v9_5;
                    v2_20 = v17_1;
                    v10_3 = v18_3;
                    v6_0 = v19_1;
                    v9_3 = v22_3;
                    v7_3 = 7;
                    v11_4 = 20;
                }
                v17_0 = v2_20;
                v19_0 = v6_0;
                v22_0 = v9_3;
                float v5_17 = ((v5_14 * 1058306785) + v8_3);
                int v2_1 = this.I;
                v2_1[v16_0] = 1082130432;
                int v7_4 = this.J;
                v7_4[v16_0] = 1082130432;
                float[] v8_4 = this.G;
                int v9_0 = this.N;
                v8_4[v16_0] = v9_0;
                int v10_0 = this.H;
                v10_0[v16_0] = v5_17;
                int v11_0 = this.K;
                v11_0[v16_0] = 1061997773;
                float[] v13_2 = this.L;
                v13_2[v16_0] = 0;
                int v15_1 = this.M;
                v15_1[v16_0] = 0;
                int v16_1 = (v16_0 + 1);
                v2_1[v16_1] = 1082130432;
                v7_4[v16_1] = 1082130432;
                v8_4[v16_1] = ((v9_0 + ((float) v3_7)) - 1082130432);
                v10_0[v16_1] = v5_17;
                v11_0[v16_1] = 1061997773;
                v13_2[v16_1] = 0;
                v15_1[v16_1] = 0;
            }
            if ((!v4_11.P1) && (this.c == 0)) {
                int v2_6 = this.u[v22_0];
                int v3_9 = (((float) v2_6) / this.e);
                if (!this.l) {
                    float[] v4_4 = this.B;
                    v4_4[v22_0] = (v3_9 + 1050924810);
                    v4_4[v17_0] = ((((float) ((v2_6 - this.h(p26)[v22_0]) + this.u[v17_0])) / this.e) + 1050924810);
                    float[] v1_8 = this.B;
                    v1_8[v17_0] = (v1_8[v17_0] - 1028443341);
                } else {
                    float[] v4_6 = this.B;
                    v4_6[v22_0] = (v3_9 + 1050924810);
                    v4_6[v17_0] = ((((float) ((v2_6 - this.h(p26)[v22_0]) + this.u[v17_0])) / this.e) + 1050924810);
                    float[] v1_16 = this.B;
                    v1_16[v17_0] = (v1_16[v17_0] - v19_0);
                    return;
                }
            }
        }
        return;
    }

    public final void n()
    {
        java.util.ArrayList v0_0 = this.q;
        if ((v0_0 != null) && (v0_0.length != 0)) {
            int v1_0;
            java.util.ArrayList v0_3 = new java.util.ArrayList();
            if (this.c != 2) {
                v1_0 = 1;
            } else {
                v1_0 = 2;
            }
            int v4_2 = (this.b - 1);
            while (v1_0 <= v4_2) {
                v0_3.add(Integer.valueOf(v1_0));
                v1_0++;
            }
            java.util.Collections.shuffle(v0_3, this.S);
            int v4_0 = 0;
            while (v4_0 < this.q.length) {
                this.v[v4_0] = ((Integer) v0_3.get((v4_0 % v0_3.size()))).intValue();
                int v5_4 = (v4_0 + 1);
                int[] v6_7 = Math.min((((float) v5_4) * 1053609165), 1065353216);
                if (v4_0 != 0) {
                    if ((v4_0 != 1) || (this.c != 2)) {
                        this.s[v4_0] = ((int) (((float) this.p[this.v[v4_0]].getBounds().bottom) * v6_7));
                    } else {
                        this.v[1] = 1;
                        this.s[1] = this.p[1].getBounds().bottom;
                    }
                } else {
                    this.v[0] = 0;
                    this.s[0] = this.T[0].getBounds().bottom;
                }
                this.r[v4_0] = this.p[this.v[v4_0]].getBounds().right;
                if (!this.l) {
                    this.C[v4_0] = (this.d / ((float) this.r[v4_0]));
                    if (v4_0 != 0) {
                        int[] v6_16 = this.s;
                        v6_16[v4_0] = ((int) (((double) v6_16[v4_0]) * 4603579539098121011));
                    }
                } else {
                    this.C[v4_0] = ((this.d * this.f) / ((float) this.r[v4_0]));
                }
                v4_0 = v5_4;
            }
        }
        return;
    }
}
