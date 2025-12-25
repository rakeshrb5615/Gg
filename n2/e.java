package n2;
public final class e extends c4.b {
    public final android.content.Context A;
    public int B;
    public int C;
    public float D;
    public final float[] E;
    public final i2.v0 F;
    public final n2.f G;
    public final i2.w0 H;
    public final android.content.SharedPreferences I;
    public float J;
    public final String K;
    public final String L;
    public final String M;
    public final String N;
    public final String O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public int V;
    public int W;
    public float X;
    public final n2.d Y;
    public final int[] Z;
    public int a0;
    public String b0;
    public final int c;
    public boolean c0;
    public final int d;
    public boolean d0;
    public final int e;
    public boolean e0;
    public final int f;
    public float f0;
    public final int g;
    public int[] g0;
    public final int h;
    public int[] h0;
    public final int i;
    public float i0;
    public final int j;
    public float j0;
    public final int k;
    public float k0;
    public final int l;
    public int l0;
    public final int m;
    public boolean m0;
    public final int n;
    public final int o;
    public final int p;
    public java.nio.FloatBuffer q;
    public java.nio.FloatBuffer r;
    public final int[] s;
    public final float[] t;
    public final int[] u;
    public final int[] v;
    public final java.util.ArrayList w;
    public final java.util.Random x;
    public final float[][] y;
    public float z;

    public e(android.content.Context p9, n2.f p10, i2.v0 p11, android.content.SharedPreferences p12, long p13)
    {
        this.w = new java.util.ArrayList();
        int[] v1_31 = new float[4];
        v1_31 = {1065353216, 1065353216, 1065353216, 1065353216};
        this.y = new float[][] {v1_31});
        int[] v1_1 = new float[16];
        this.E = v1_1;
        int[] v1_3 = new n2.d();
        int v3_2 = Integer.valueOf(0);
        int v5_0 = Integer.valueOf(1);
        v1_3.put(v3_2, v5_0);
        v1_3.put(v5_0, Integer.valueOf(2));
        int v5_5 = Integer.valueOf(4);
        v1_3.put(v5_5, v3_2);
        v1_3.put(Integer.valueOf(5), v3_2);
        v1_3.put(Integer.valueOf(6), v5_5);
        this.Y = v1_3;
        int[] v1_29 = new int[3];
        this.Z = v1_29;
        this.d0 = 1;
        this.f0 = -1082130432;
        int v3_8 = new int[4];
        this.g0 = v3_8;
        int v0_3 = new int[4];
        this.h0 = v0_3;
        this.i0 = -1082130432;
        this.l0 = -1;
        this.m0 = 1;
        this.A = p9;
        this.G = p10;
        this.F = p11;
        this.I = p12;
        this.x = new java.util.Random(p13);
        this.H = p11.i;
        this.K = p9.getString(2131952216);
        this.L = p9.getString(2131952087);
        this.M = p9.getString(2131951749);
        p9.getString(2131952500);
        this.N = p9.getString(2131952299);
        this.O = p9.getString(2131952363);
        int[] v11_1 = new int[7];
        v11_1 = {2131231279, 2131231427, 2131231443, 2131231445, 2131231211, 2131231171, 2131231446};
        this.R = p9.getColor(2131099719);
        this.P = p9.getColor(2131099714);
        this.S = p9.getColor(2131099718);
        this.U = p9.getColor(2131099717);
        this.T = p9.getColor(2131099722);
        this.Q = p9.getColor(2131099720);
        p9.getColor(2131099723);
        p9.getColor(2131099716);
        p9.getColor(2131099724);
        p9.getColor(2131099721);
        p9.getColor(2131099715);
        this.m0 = p12.getBoolean(p9.getString(2131951753), 1);
        this.X = Math.max(1065353216, ((((float) p12.getInt(p9.getString(2131951876), 100)) * 981668463) + int v14_2));
        int v13_23 = c4.b.M(35633, q4.b.l("KOd+G86ICKS0CZskYfaItNM/flQcTqrdUvGUwjWAZI1/cj95E2xiHgCZsQ9HhM+GsXEEgi9s3pwRgavBg0L2P/QQNa7Uw8tZo5bjvEh8a2adexS0DpdmCU38rPzF7XDDTrIzRfqiv5QGlj9OnZq5CVUypK2on2b5AP0B90XrOcpaUFq7QXltTbb+CG9RcvRADMy2di4ZzcKz4eXCcXxQiWO/ik3Watd4hfDbKM9zNOe3nZo2ZoHBoeZ1HoDvAw4TmGiQXk6i1Jtm8cQVZNSUiEx11mZKOXdwMfxQQSqQmNlaIGQYgXq+5FS3miUjDn/fHKLumv2MNp9WoYJ7ZcveJVx9Szx4d6Gszi1US7io4jBLZkXIlQjYjepGQ7kBROP+69lZrrO2P+xOq1eWSMbjjiI41+XcQzMiXmR8empcqyyCB+htBDLsaeRWkWvIe2Tm1Q7yUIpcsWNtQ24PYV982+EhEObHNpAQSzu053UWSLL9P5qhdWF7h2NQObfjp0LpTp9ogMxYrOUiTrtWBnKDFsibJlpoQMjhXVGIXDOR1/nxIsV2ExLIWC9TLAfR+7eV6d2pMlC1RTiqZIQf0qv90T4a7bw4qbIFK+D8SvcZLrNCDWyjUt+vAXA4/OuMJ/a8WpHHasG8SPBJsjgWh4xRoCi7tIz7xPTykdtVsGwn/IhhcuNkRKG0OBR9SpJ/IkraGtvQi/Nq50pYy/utd8FiadGWQleSNFiXAdvofXHYMDWkreOSwLHtCBbMkQs+i+TwGhvNXyWx5QdQcaqb2dBSRA=="));
        int[] v1_7 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItEzE4YLlflhTcRtN/7tyM6B1ROdtglAUxbwxPDMw65g8gomKW1XOg1KjYRRpQKYI1/3inZ2ySetjg2DyGJ5OkCWt0IYnMkvEpffJVnxG7HJVJZJojokCHe9boNSageeVUERJHhZwK1ptN6OuQq8E/ciQhtp6sBdvVx3Rx4UwCqeuO1PPrmmZUMuBKi6ndfdNIZYvFyKVCm0yfrkJtMuicWecZ0PKjl0ZHHKv2lZ0tNKGYjgSaTTuOMi9Ar2QNwGTpOI6Pz2M6EWzDBtSOOw38lAL00ilVk/eGbThHpclyB79+0AoAj5XuJNL2Jk2VN/+gtxmOTU2mGZXQmKos0Yq6ej4IsuPsU0QJPg1sCKHXzpCEZRatnfC3BRaCoCPi20EMsJvJQ2PWBgN+wgpFK2x4upDv1oWBr3YigPtsFUaq5J7w1Vj51+S4xY1ln1DJQcTF7z0F8Pfef0eJXDY2T5hChbLFkkxMOufqc+pXeJMak4eHNJ0SiScOFh7Su3YY/QYzCWzWl4yIw0fCNo7UavyfvIv4/VqOIdW/5Od8ME66emN4NBhcMm20J5kjI1jKrLAYYws6iqfFkYTe4KLFem3LAFLh76xHgcGuEe8HzY3W/m8XgUjqfRHWENQlfbYF19N8EGPTnWPFs+a85iys7xsn7VMaDMtkyC88eWJXdx55NgK9D68QT6KWlaOm8pqT8OV6VJa+lly0daqQ5aixvJE4zFApuh7h5q7/eWjvKe38kaHbw090cGUWvefgjyExp5radMavRJxxBerCchuu7q2ARdty12nVOI3hPCrjL05+GmsrqtuIzVwCQIP+OWvhhSd6VSYE9fKzs56t8iGkyukJldct5TqfE4yGC784CrAVRjRQLUB8jR/aQvrcsu0NpykhYnNsStqasnya28e1ZpO2iriv0mIIRvQsu23QyNEAhPWIzuJIQXPjwZwj8UdQWDhtDJiS9fdzb5FmVQgMmBraMb0l7xZFDm4hhKsb5RWpYIOQEjZuCJnk4raeCRe2OW4fYYQc+LpE9j1le7urAvA7BGCxUPB/FkpvLG5Vp+dN0+cHbhctLRk9ryqqyJnsTSvJ0aJngLiILZXezTfejuy7oUE1bw2KS+M+2H4lE3FFd5jhbqXhh7K2407k/SEqge8gDvONuvvi450giRlM5V0X8sJc5XFw22gDfzDeVxWSvkzVw57xdaveei36XLg56jAjt7tNrn0rlFJeBWvoDXG2xuXlE2jHZYkOgC3TbA+wxZFUiQLY3y0yIN8BMwcGKON5hxaXX34GLawex9dgwdjxCIJd0yljSsNMYYkTqGYOpJJ"));
        int v3_1 = android.opengl.GLES20.glCreateProgram();
        this.c = v3_1;
        android.opengl.GLES20.glAttachShader(v3_1, v13_23);
        android.opengl.GLES20.glAttachShader(this.c, v1_7);
        android.opengl.GLES20.glLinkProgram(this.c);
        this.d = android.opengl.GLES20.glGetAttribLocation(this.c, "a_Position");
        this.e = android.opengl.GLES20.glGetAttribLocation(this.c, "a_TexCoordinate");
        this.f = android.opengl.GLES20.glGetUniformLocation(this.c, "u_MVPMatrix");
        this.g = android.opengl.GLES20.glGetUniformLocation(this.c, "u_Texture");
        this.h = android.opengl.GLES20.glGetUniformLocation(this.c, "u_GradientTexture");
        this.i = android.opengl.GLES20.glGetUniformLocation(this.c, "u_AspectRatio");
        this.j = android.opengl.GLES20.glGetUniformLocation(this.c, "u_CloudInstanceData");
        this.k = android.opengl.GLES20.glGetUniformLocation(this.c, "u_CloudZ");
        this.l = android.opengl.GLES20.glGetUniformLocation(this.c, "u_CloudTopColor");
        this.m = android.opengl.GLES20.glGetUniformLocation(this.c, "u_CloudBotColor");
        this.n = android.opengl.GLES20.glGetUniformLocation(this.c, "u_WindOffset");
        this.o = android.opengl.GLES20.glGetUniformLocation(this.c, "u_CloudOpacity");
        this.p = android.opengl.GLES20.glGetUniformLocation(this.c, "u_HDR");
        int v13_52 = new int[7];
        this.s = v13_52;
        int v13_53 = new float[7];
        this.t = v13_53;
        int v13_54 = new int[7];
        this.u = v13_54;
        int v13_55 = new int[7];
        this.v = v13_55;
        int v13_56 = 0;
        while (v13_56 < 7) {
            try {
                int[] v1_22 = j5.t1.A(p9, v11_1[v13_56]);
            } catch (Exception) {
                this.s[v13_56] = 0;
                this.t[v13_56] = 1065353216;
                this.u[v13_56] = 0;
                this.v[v13_56] = 0;
                v13_56++;
            }
            if (v1_22 != null) {
                int v3_3 = v1_22.getIntrinsicWidth();
                android.graphics.Canvas v4_1 = v1_22.getIntrinsicHeight();
                if ((v3_3 <= 0) || (v4_1 <= null)) {
                    v3_3 = 128;
                    v4_1 = 128;
                }
                this.u[v13_56] = v3_3;
                this.v[v13_56] = v4_1;
                this.t[v13_56] = (((float) v3_3) / ((float) v4_1));
                int v3_4 = android.graphics.Bitmap.createBitmap(v3_3, v4_1, android.graphics.Bitmap$Config.ARGB_8888);
                android.graphics.Canvas v4_3 = new android.graphics.Canvas(v3_4);
                v1_22.setBounds(0, 0, v4_3.getWidth(), v4_3.getHeight());
                v1_22.draw(v4_3);
                this.s[v13_56] = c4.b.N(v3_4);
            } else {
            }
        }
        String v9_1 = p9.getString(2131951809);
        boolean v10_2 = this.b0;
        if ((!v10_2) || (v10_2.isEmpty())) {
            this.b0 = p12.getString(v9_1, v9_1);
        }
        this.l0 = -1;
        return;
    }

    public final void k0(n2.c p11)
    {
        int v0_0 = this.g0;
        float v5_5 = (((float) v0_0[2]) / 1132396544);
        int v0_3 = (((float) v0_0[3]) / 1132396544);
        float v8_0 = new float[4];
        v8_0[0] = (((float) v0_0[1]) / 1132396544);
        v8_0[1] = v5_5;
        v8_0[2] = v0_3;
        v8_0[3] = 1065353216;
        p11.e = v8_0;
        float v2_1 = this.h0;
        float v8_3 = (((float) v2_1[2]) / 1132396544);
        float v2_5 = (((float) v2_1[3]) / 1132396544);
        float[] v3_0 = new float[4];
        v3_0[0] = (((float) v2_1[1]) / 1132396544);
        v3_0[1] = v8_3;
        v3_0[2] = v2_5;
        v3_0[3] = 1065353216;
        p11.f = v3_0;
        return;
    }

    public final void l0(float p20)
    {
        float v2_11;
        n2.e v0 = this;
        int v1_3 = Math.min(p20, 1015222895);
        float v2_13 = this.i0;
        if (v2_13 >= 0) {
            int v4_0 = (this.k0 - v2_13);
            this.j0 = v4_0;
            if (Math.abs(v4_0) < 953267991) {
                this.j0 = 0;
            }
            float v2_4 = (this.k0 - this.i0);
            this.j0 = v2_4;
            if (v2_4 >= -1052770304) {
                if (v2_4 > 1094713344) {
                    this.j0 = (v2_4 - 1103101952);
                }
            } else {
                this.j0 = (v2_4 + 1103101952);
            }
            if (Math.abs(this.j0) < 973279855) {
                this.j0 = 0;
            }
            v2_11 = (1022739087 * v1_3);
            if (this.m0) {
                v2_11 += (this.j0 * 1054448026);
            }
        } else {
            this.i0 = this.k0;
            this.j0 = 0;
            v2_11 = 0;
        }
        this.i0 = this.k0;
        int v4_36 = 3042;
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFunc(770, 771);
        android.opengl.GLES20.glUseProgram(this.c);
        android.opengl.GLES20.glEnableVertexAttribArray(this.d);
        android.opengl.GLES20.glVertexAttribPointer(this.d, 2, 5126, 0, 0, this.q);
        android.opengl.GLES20.glEnableVertexAttribArray(this.e);
        android.opengl.GLES20.glVertexAttribPointer(this.e, 2, 5126, 0, 0, this.r);
        android.opengl.GLES20.glActiveTexture(33985);
        int v6_12 = 1;
        android.opengl.GLES20.glUniform1i(this.h, 1);
        android.opengl.GLES20.glUniformMatrix4fv(this.f, 1, 0, this.E, 0);
        boolean v5_13 = (this.F.D1 / ((float) this.B));
        this.z = v5_13;
        int v7_26 = 981668463;
        if (Math.abs(v5_13) < 981668463) {
            this.z = 0;
        }
        java.util.ArrayList v9_2 = this.w;
        v9_2.sort(new g5.i(5));
        boolean v5_0 = v9_2.size();
        int v10_0 = 0;
        while (v10_0 < v5_0) {
            n2.c v12_1 = ((n2.c) v9_2.get(v10_0));
            float v13_1 = this.s[v12_1.g];
            if (v13_1 != this.l0) {
                android.opengl.GLES20.glBindTexture(3553, v13_1);
                android.opengl.GLES20.glUniform1i(this.g, 0);
                this.l0 = v13_1;
            }
            float v13_10;
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, this.s[v12_1.g]);
            android.opengl.GLES20.glUniform1i(this.g, 0);
            v12_1.j = (v12_1.j + v1_3);
            if (((float) v10_0) >= (((float) v5_0) * this.J)) {
                v13_10 = 0;
            } else {
                v13_10 = v6_12;
            }
            if (((this.d0) || ((this.c0) || (this.e0))) && ((v10_0 == 0) || ((v10_0 == v6_12) || (v10_0 == 2)))) {
                v13_10 = 0;
            }
            float v15_3;
            boolean v14_12 = ((v12_1.c + 1092616192) / 1101004800);
            if (v13_10 == 0) {
                v15_3 = 0;
            } else {
                v15_3 = Math.max(1048576000, v14_12);
            }
            v12_1.m = v15_3;
            float v20_2 = v4_36;
            int v16 = v7_26;
            if ((v13_10 == 0) || (v12_1.g != 0)) {
                if ((v13_10 != 0) && (v14_12 >= 1056964608)) {
                    v12_1.m = 1065353216;
                }
            } else {
                v12_1.m = 1065353216;
            }
            float v17_2;
            float v18;
            int v7_3 = (v12_1.m - v12_1.k);
            float v13_13 = (v12_1.l * v1_3);
            if (Math.abs(v7_3) <= v16) {
                v17_2 = 1065353216;
                v18 = 1056964608;
                v12_1.k = v12_1.m;
            } else {
                v17_2 = 1065353216;
                v18 = 1056964608;
                v12_1.k = (Math.max((- v13_13), Math.min(v13_13, v7_3)) + v12_1.k);
            }
            int v7_21;
            if (v12_1.k > 0) {
                if (v12_1.j > v12_1.i) {
                    this.m0(v12_1, 0);
                }
                int v4_13 = ((((v14_12 * v14_12) * v14_12) * 1081291571) + 1045220557);
                int v7_11 = ((v2_11 * v4_13) * this.f0);
                if (v12_1.g != 4) {
                    v12_1.a = (v12_1.a - v7_11);
                } else {
                    v12_1.a = (v12_1.a + v7_11);
                }
                this.i0 = this.k0;
                float v13_22 = ((this.z * v4_13) + v12_1.a);
                int v7_14 = this.D;
                float v17_3 = 1051931443;
                if (v7_14 > v17_2) {
                    v17_3 = (1051931443 * v7_14);
                }
                int v7_15 = (v7_14 + v17_3);
                float v15_9 = ((v7_15 * v18) + v17_3);
                boolean v14_14 = v12_1.h;
                if (!v14_14) {
                    int v6_1 = v13_22 cmp (- v7_15);
                    if ((v6_1 < 0) || (v13_22 > v7_15)) {
                        int v6_10;
                        if (v6_1 >= 0) {
                            v6_10 = 0;
                        } else {
                            v6_10 = 1;
                        }
                        this.m0(v12_1, 0);
                        int v7_22 = this.z;
                        if ((v7_22 < -1138501878) || (v7_22 > 1008981770)) {
                            int v4_33;
                            int v7_24 = ((- v7_22) * v4_13);
                            int v4_30 = this.x;
                            if (v6_10 == 0) {
                                v4_33 = ((v4_30.nextFloat() * (- v15_9)) - v15_9);
                            } else {
                                v4_33 = ((v4_30.nextFloat() * v15_9) + v15_9);
                            }
                            v12_1.a = (v7_24 + v4_33);
                        }
                        v7_21 = 1;
                        v10_0++;
                        v4_36 = v20_2;
                        v6_12 = v7_21;
                        v7_26 = v16;
                    }
                }
                int v4_16;
                if (!v14_14) {
                    v4_16 = 33071;
                } else {
                    v4_16 = 10497;
                }
                int v6_3;
                android.opengl.GLES20.glTexParameteri(3553, 10242, v4_16);
                int v4_17 = v12_1.h;
                if (v4_17 == 0) {
                    v6_3 = v13_22;
                } else {
                    v6_3 = 0;
                }
                int v4_18;
                if (v4_17 == 0) {
                    v4_18 = 0;
                } else {
                    v4_18 = (- v13_22);
                }
                android.opengl.GLES20.glUniform2f(this.n, v4_18, 0);
                android.opengl.GLES20.glUniform1f(this.i, this.t[v12_1.g]);
                android.opengl.GLES20.glUniform3f(this.j, v6_3, v12_1.b, v12_1.d);
                android.opengl.GLES20.glUniform1f(this.k, v12_1.c);
                v7_21 = 1;
                android.opengl.GLES20.glUniform4fv(this.l, 1, v12_1.e, 0);
                android.opengl.GLES20.glUniform4fv(this.m, 1, v12_1.f, 0);
                android.opengl.GLES20.glUniform1f(this.o, v12_1.k);
                android.opengl.GLES20.glUniform1f(v0.p, v0.X);
                android.opengl.GLES20.glDrawArrays(5, 0, 4);
            } else {
                v7_21 = v6_12;
            }
        }
        float v20_1 = v4_36;
        android.opengl.GLES20.glDisableVertexAttribArray(this.d);
        android.opengl.GLES20.glDisableVertexAttribArray(this.e);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glDisable(v20_1);
        return;
    }

    public final void m0(n2.c p20, boolean p21)
    {
        int v2_21 = this.F;
        float v3_7 = v2_21.l1;
        if (v3_7 != 0) {
            float v3_11 = v3_7.q;
            if ((v3_11 != 0) && (v3_11.length != 0)) {
                float v3_0 = this.I.getInt(this.N, 0);
                this.a0 = v3_0;
                int v7_3 = 1073741824;
                float v4_13 = (1065353216 - ((1065353216 - v2_21.L0[0]) * 1073741824));
                if (v3_0 != 9) {
                    if ((v3_0 == 6) || ((v3_0 == 3) || (v3_0 == 5))) {
                        v4_13 = -1096223293;
                    }
                } else {
                    v4_13 = -1098907648;
                }
                float v3_13;
                int v16_1;
                int v2_35 = (1065353216 - ((((float) v2_21.T1[0]) / ((float) this.C)) * 1073741824));
                java.util.Random v11_1 = this.x;
                if (p21 != 0) {
                    v16_1 = 1073741824;
                    v3_13 = 0;
                } else {
                    int v13_0;
                    int v12_2 = new java.util.ArrayList();
                    if (this.s.length <= 1) {
                        v13_0 = 0;
                    } else {
                        v13_0 = 1;
                    }
                    while (v13_0 < this.s.length) {
                        long v14_7;
                        long v14_6 = ((Integer) this.Y.get(Integer.valueOf(v13_0)));
                        if (v14_6 == 0) {
                            v14_7 = 2147483647;
                        } else {
                            v14_7 = v14_6.intValue();
                        }
                        java.util.ArrayList v15_4 = this.w;
                        int v5_27 = v15_4.size();
                        int v16_0 = v7_3;
                        int v7_4 = 0;
                        int v8_2 = 0;
                        while (v8_2 < v5_27) {
                            Object v17_1 = v15_4.get(v8_2);
                            v8_2++;
                            if (((n2.c) v17_1).g == v13_0) {
                                v7_4++;
                            }
                        }
                        if (v7_4 < v14_7) {
                            v12_2.add(Integer.valueOf(v13_0));
                        }
                        v13_0++;
                        v7_3 = v16_0;
                        int v5 = 0;
                    }
                    v16_1 = v7_3;
                    if (v12_2.isEmpty()) {
                    } else {
                        v3_13 = ((Integer) v12_2.get(v11_1.nextInt(v12_2.size()))).intValue();
                    }
                }
                int v21_1;
                int v8_0;
                p20.g = v3_13;
                int v5_32 = ((((float) this.v[v3_13]) / ((float) this.C)) * v16_1);
                int v7_9 = ((v11_1.nextFloat() * 1056964608) + 1056964608);
                p20.a = ((- this.z) + (((v11_1.nextFloat() * v16_1) - 1065353216) * ((this.D + 1051931443) * 1069547520)));
                p20.j = 0;
                p20.i = ((v11_1.nextFloat() * 1114636288) + 1126170624);
                p20.l = 1065353216;
                long v14_2 = p20.g;
                if (v14_2 != 0) {
                    v21_1 = 1056964608;
                    v8_0 = 1;
                    if (v14_2 != 1) {
                        if (v14_2 != 4) {
                            if (v14_2 != 5) {
                                int v2_4 = ((v11_1.nextFloat() * -1060110336) + 1075838976);
                                p20.c = v2_4;
                                int v2_7 = ((float) Math.pow(((double) (1065353216 - ((v2_4 - 1075838976) / -1060110336))), 4612811918334230528));
                                p20.d = (((v5_32 * v7_9) * 1069128090) * ((v2_7 * 1056964608) + 1056964608));
                                int v2_9 = ((v2_7 * 1063675494) + v4_13);
                                p20.b = v2_9;
                                p20.b = (((v11_1.nextFloat() - 1056964608) * 1028443341) + v2_9);
                            } else {
                                p20.d = (v5_32 * v7_9);
                                p20.b = (1061997773 - (v11_1.nextFloat() * v16_1));
                                p20.c = ((v11_1.nextFloat() * -1082130432) + 1069547520);
                            }
                        } else {
                            int v5_6 = (v5_32 * v7_9);
                            p20.d = v5_6;
                            p20.b = ((1065353216 - (v5_6 * 1056964608)) + 1036831949);
                            p20.c = -1063046349;
                            p20.l = 1092616192;
                        }
                    } else {
                        int v5_9 = ((v5_32 * v7_9) * 1061158912);
                        p20.d = v5_9;
                        int v7_2 = this.a0;
                        if (v7_2 != 3) {
                            if (v7_2 != 9) {
                                p20.b = v4_13;
                                p20.b = (v4_13 - (v11_1.nextFloat() * v2_35));
                            } else {
                                p20.b = (((v5_9 * 1056964608) + v4_13) - 1028443341);
                            }
                        } else {
                            p20.b = (1048576000 - v11_1.nextFloat());
                        }
                        p20.c = 1066192077;
                    }
                } else {
                    p20.i = 1232348160;
                    int v2_22 = this.a0;
                    if (v2_22 != 3) {
                        if (v2_22 != 9) {
                            p20.d = ((v5_32 * v7_9) * 1066192077);
                            p20.b = v4_13;
                        } else {
                            int v5_18 = ((v5_32 * v7_9) * 1066192077);
                            p20.d = v5_18;
                            p20.b = (((v5_18 * 1056964608) + v4_13) - 1028443341);
                        }
                    } else {
                        int v5_23 = ((v5_32 * v7_9) * 1069547520);
                        p20.d = v5_23;
                        p20.b = ((v5_23 * 1056964608) + -1082130432);
                    }
                    p20.c = -1056964608;
                    v21_1 = 1056964608;
                    v8_0 = 1;
                }
                int v5_26;
                int v2_24 = this.y;
                p20.e = v2_24[v11_1.nextInt(v2_24.length)];
                p20.f = v2_24[v11_1.nextInt(v2_24.length)];
                if (v3_13 != 0) {
                    v5_26 = 0;
                } else {
                    v5_26 = v8_0;
                }
                p20.h = v5_26;
                p20.k = 0;
                int v2_27 = (p20.d * v21_1);
                p20.d = v2_27;
                float v3_1 = p20.g;
                if (v3_1 == 0) {
                    float v3_2 = this.t[v3_1];
                    if (v3_2 > 0) {
                        float v4_22 = (this.D / v3_2);
                        if (v2_27 < v4_22) {
                            p20.d = (v4_22 * 1065772646);
                        }
                    }
                }
                this.k0(p20);
            }
        }
        return;
    }
}
