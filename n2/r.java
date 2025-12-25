package n2;
public final class r extends c4.b {
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public float D;
    public final float[] E;
    public final float[] F;
    public float G;
    public float H;
    public float I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public final n2.f c;
    public final android.content.Context d;
    public int e;
    public int f;
    public java.nio.FloatBuffer g;
    public java.nio.FloatBuffer h;
    public java.nio.FloatBuffer i;
    public int j;
    public int k;
    public boolean l;
    public float[] m;
    public float[] n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public float w;
    public float x;
    public final float[] y;
    public final float[] z;

    public r(android.content.Context p3, n2.f p4)
    {
        this.l = 0;
        float[] v1_6 = new float[0];
        this.m = v1_6;
        float[] v1_7 = new float[0];
        this.n = v1_7;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 2;
        this.u = 0;
        float[] v1_1 = new float[16];
        this.y = v1_1;
        float[] v1_2 = new float[16];
        this.z = v1_2;
        float[] v1_3 = new float[16];
        this.A = v1_3;
        float[] v1_4 = new float[16];
        this.B = v1_4;
        float[] v0_2 = new float[16];
        this.C = v0_2;
        float[] v1_5 = new float[3];
        v1_5 = {1063675494, 1063675494, 1065353216};
        this.E = v1_5;
        float[] v0_4 = new float[3];
        v0_4 = {1061158912, 1063675494, 1065353216};
        this.F = v0_4;
        this.d = p3;
        this.c = p4;
        return;
    }

    public static boolean m0(float p2, float p3, float p4, float p5)
    {
        if (((Math.abs(p2) >= 1008981770) || (Math.abs(p3) >= 1008981770)) && (((Math.abs(p4) >= 1008981770) || (Math.abs(p5) >= 1008981770)) && ((Math.abs((p2 - p4)) >= 1008981770) || (Math.abs((p3 - p5)) >= 1008981770)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void k0()
    {
        n2.r v0 = this;
        if ((this.W) && ((this.l) && (this.u))) {
            int v4_11;
            int v1_14 = 3042;
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(770, 771);
            android.opengl.GLES20.glUseProgram(this.j);
            int v4_9 = m2.a.e(this.d);
            this.v = v4_9;
            int v5_3 = ((((float) this.q) / ((float) this.m.length)) * 1077936128);
            if (v4_9 == 0) {
                v4_11 = 1056964608;
            } else {
                v4_11 = 1060320051;
            }
            if (v5_3 >= 1036831949) {
                int v5_7 = ((1065353216 - ((v5_3 - 1036831949) / 1063675494)) * v4_11);
                this.D = v5_7;
                this.D = Math.max(0, v5_7);
            } else {
                this.D = (v5_3 / 1036831949);
            }
            int v11_0;
            int v4_23 = this.v;
            int v8_3 = this.F;
            int v9_6 = this.E;
            if (v4_23 == 0) {
                v11_0 = v8_3[0];
            } else {
                v11_0 = v9_6[0];
            }
            int v12_0;
            this.G = v11_0;
            if (v4_23 == 0) {
                v12_0 = v8_3[1];
            } else {
                v12_0 = v9_6[1];
            }
            int v4_24;
            this.H = v12_0;
            if (v4_23 == 0) {
                v4_24 = v8_3[2];
            } else {
                v4_24 = v9_6[2];
            }
            this.I = v4_24;
            android.opengl.GLES20.glUniform1f(this.S, this.D);
            android.opengl.GLES20.glUniform1f(v0.P, v0.G);
            android.opengl.GLES20.glUniform1f(v0.Q, v0.H);
            android.opengl.GLES20.glUniform1f(v0.R, v0.I);
            android.opengl.GLES20.glEnableVertexAttribArray(this.M);
            android.opengl.GLES20.glEnableVertexAttribArray(this.N);
            int v4_31 = this.y;
            android.opengl.Matrix.setIdentityM(v4_31, 0);
            android.opengl.Matrix.translateM(v4_31, 0, (- this.w), this.x, (((float) this.t) + 1056964608));
            android.opengl.Matrix.scaleM(v4_31, 0, 1065353216, 1065353216, 1065353216);
            int v13_15 = this.A;
            float v15_3 = this.z;
            android.opengl.Matrix.multiplyMM(v13_15, 0, v15_3, 0, v4_31, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.O, 1, 0, v13_15, 0);
            this.g.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.M, 3, 5126, 0, 20, this.g);
            this.g.position(3);
            android.opengl.GLES20.glVertexAttribPointer(this.N, 2, 5126, 0, 20, this.g);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.M);
            android.opengl.GLES20.glDisableVertexAttribArray(this.S);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glUseProgram(0);
            android.opengl.GLES20.glDisable(3042);
            android.opengl.GLES20.glUseProgram(this.k);
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(770, 771);
            if ((this.T >= 0) && ((this.U >= 0) && (this.V >= 0))) {
                float v2_3 = this.B;
                android.opengl.Matrix.setIdentityM(v2_3, 0);
                android.opengl.Matrix.translateM(v2_3, 0, (- this.w), this.x, (((float) this.t) + 1056964608));
                int v19_1 = this.C;
                android.opengl.Matrix.multiplyMM(v19_1, 0, v15_3, 0, v2_3, 0);
                android.opengl.GLES20.glUniformMatrix4fv(this.V, 1, 0, v19_1, 0);
                float v2_5 = this.q;
                if (v2_5 >= (this.m.length / 3)) {
                    if (this.l) {
                        this.l = 0;
                        this.n0();
                    }
                } else {
                    this.q = (v2_5 + this.s);
                    this.c.n.s = Math.max(this.D, 1047589105);
                    this.q = Math.min(this.q, (this.m.length / 3));
                }
                float v2_14;
                if (!this.v) {
                    v2_14 = (this.D * 1077936128);
                } else {
                    v2_14 = (this.D * 1086324736);
                }
                float v2_16 = Math.min(v2_14, 1065353216);
                java.nio.FloatBuffer v3_18 = (this.m.length / 6);
                int v6_0 = 0;
                while (v6_0 < v3_18) {
                    float v10_9;
                    float v10_11;
                    int v7_3 = this.J;
                    if (v6_0 >= v7_3) {
                        if (v6_0 < (v3_18 - v7_3)) {
                            v10_9 = v2_16;
                        } else {
                            v10_11 = ((float) (v3_18 - v6_0));
                            v10_9 = ((v10_11 / ((float) v7_3)) * v2_16);
                        }
                    } else {
                        v10_11 = ((float) v6_0);
                    }
                    int v7_5 = this.m;
                    int v13_10 = (v6_0 * 6);
                    v7_5[(v13_10 + 2)] = v10_9;
                    v7_5[(v13_10 + 5)] = v10_9;
                    v6_0++;
                }
                this.h.position(0);
                int v7_0 = this.m;
                this.h.put(v7_0, 0, this.length);
                this.h.position(0);
                android.opengl.GLES20.glVertexAttribPointer(this.T, 2, 5126, 0, 12, this.h);
                android.opengl.GLES20.glEnableVertexAttribArray(this.T);
                int v6_10 = this.h.duplicate();
                v6_10.position(2);
                android.opengl.GLES20.glVertexAttribPointer(this.U, 1, 5126, 0, 12, v6_10);
                android.opengl.GLES20.glEnableVertexAttribArray(this.U);
                android.opengl.GLES20.glLineWidth(this.L);
                android.opengl.GLES20.glDrawArrays(1, 0, this.q);
                int v6_16 = (this.n.length / 6);
                int v7_1 = 0;
                int v9_3 = 0;
                while (v7_1 < v6_16) {
                    int v4_15;
                    int v4_13;
                    float v10_0 = this.n;
                    int v13_4 = (v7_1 * 3);
                    int v14_5 = v10_0[v13_4];
                    float v15_2 = v10_0[(v13_4 + 1)];
                    int v16_4 = v1_14;
                    int v1_8 = this.K;
                    if (v7_1 >= v1_8) {
                        if (v7_1 < (v3_18 - v1_8)) {
                            v4_13 = v2_16;
                        } else {
                            v4_15 = ((float) (v3_18 - v7_1));
                            v4_13 = ((v4_15 / ((float) v1_8)) * v2_16);
                        }
                    } else {
                        v4_15 = ((float) v7_1);
                    }
                    v10_0[(v13_4 + 2)] = v4_13;
                    v10_0[(v13_4 + 5)] = v4_13;
                    int vtmp19 = Math.min((this.q * 3), (this.m.length - 3));
                    int v4_20 = 0;
                    while (v4_20 < vtmp19) {
                        float v10_2 = this.m;
                        if ((((v10_2[(v4_20 + 1)] - v15_2) * (v10_2[(v4_20 + 1)] - v15_2)) + ((v10_2[v4_20] - v14_5) * (v10_2[v4_20] - v14_5))) >= 970045207) {
                            v4_20 += 3;
                        } else {
                            v9_3 += 2;
                            break;
                        }
                    }
                    v7_1 += 2;
                    v1_14 = v16_4;
                }
                int v16_3 = v1_14;
                int v1_2 = (this.r + this.s);
                this.r = v1_2;
                int v1_3 = Math.min(v9_3, v1_2);
                this.r = v1_3;
                this.i.position(0);
                java.nio.FloatBuffer v3_19 = this.n;
                this.i.put(v3_19, 0, this.length);
                this.i.position(0);
                android.opengl.GLES20.glVertexAttribPointer(this.T, 2, 5126, 0, 12, this.i);
                android.opengl.GLES20.glEnableVertexAttribArray(this.T);
                float v2_23 = this.i;
                if ((v2_23 != 0) && (v2_23.limit() >= 3)) {
                    this.i.position(2);
                    android.opengl.GLES20.glVertexAttribPointer(this.U, 1, 5126, 0, 12, this.i);
                    android.opengl.GLES20.glEnableVertexAttribArray(this.U);
                    android.opengl.GLES20.glLineWidth(this.L);
                    android.opengl.GLES20.glDrawArrays(1, 0, v1_3);
                }
                android.opengl.GLES20.glDisableVertexAttribArray(this.T);
                android.opengl.GLES20.glDisableVertexAttribArray(this.U);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glUseProgram(0);
                android.opengl.GLES20.glDisable(v16_3);
            }
        }
        return;
    }

    public final void l0(float p18, float p19, java.util.ArrayList p20, int p21)
    {
        Float v3_1 = Float.valueOf(0);
        if (p21 <= 2) {
            int v4_0;
            if (this.f <= this.e) {
                v4_0 = 0;
            } else {
                v4_0 = 1;
            }
            int v9;
            boolean v5_0 = i2.k0.a;
            int v8_2 = (v5_0.nextInt(50) + 15);
            boolean v5_1 = v5_0.nextBoolean();
            if (v4_0 == 0) {
                v9 = 1008981770;
            } else {
                v9 = 1025758986;
            }
            float v10 = p19;
            int v11 = 0;
            float v6_1 = p18;
            while (v11 < v8_2) {
                float v12_0;
                if (!v5_1) {
                    v12_0 = v9;
                } else {
                    v12_0 = (- v9);
                }
                boolean v16_0;
                float v12_1 = (v12_0 + v6_1);
                java.util.Random v13 = i2.k0.a;
                float v14_1 = (v13.nextFloat() - 1056964608);
                if (v4_0 == 0) {
                    v16_0 = 1022739087;
                } else {
                    v16_0 = 1036831949;
                }
                float v12_2 = (v12_1 + (v14_1 * v16_0));
                float v14_6 = (v10 - ((v13.nextFloat() * 1017370378) + 981668463));
                if (!n2.r.m0(v6_1, v10, v12_2, v14_6)) {
                    p20.add(Float.valueOf(v6_1));
                    p20.add(Float.valueOf(v10));
                    p20.add(v3_1);
                    p20.add(Float.valueOf(v12_2));
                    p20.add(Float.valueOf(v14_6));
                    p20.add(v3_1);
                }
                if (v13.nextFloat() < 1036831949) {
                    this.l0(v12_2, v14_6, p20, (p21 + 1));
                }
                v11++;
                v6_1 = v12_2;
                v10 = v14_6;
            }
        }
        return;
    }

    public final void n0()
    {
        n2.r v0 = this;
        n2.m v2_9 = (this.p + 1017370378);
        this.p = v2_9;
        if ((!this.l) && (v2_9 >= this.o)) {
            int v9_1;
            this.u = 0;
            this.q = 0;
            this.D = 0;
            this.o = ((new java.util.Random().nextFloat() * 1091043328) + 1056964608);
            java.nio.FloatBuffer v3_23 = Float.valueOf(0);
            int v5_10 = i2.k0.a;
            int v6_6 = ((v5_10.nextFloat() * 1073741824) - 1065353216);
            float v8_1 = v5_10.nextFloat();
            if (this.f <= this.e) {
                v9_1 = 0;
            } else {
                v9_1 = 1;
            }
            this.J = (v5_10.nextInt(15) + 10);
            this.K = (v5_10.nextInt(15) + 10);
            int v14_2 = (v6_6 - 1085066444);
            boolean v16_7 = (v8_1 - 1075419546);
            java.util.ArrayList v12_10 = (1085066444 + v6_6);
            java.util.Random v15_2 = (1075419546 + v8_1);
            int v7_6 = new float[20];
            v7_6[0] = v14_2;
            v7_6[1] = v16_7;
            v7_6[2] = 0;
            float[] v4_9 = 3;
            v7_6[3] = 0;
            v7_6[4] = 0;
            v7_6[5] = v12_10;
            v7_6[6] = v16_7;
            v7_6[7] = 0;
            v7_6[8] = 1065353216;
            v7_6[9] = 0;
            v7_6[10] = v14_2;
            v7_6[11] = v15_2;
            v7_6[12] = 0;
            v7_6[13] = 0;
            v7_6[14] = 1065353216;
            v7_6[15] = v12_10;
            v7_6[16] = v15_2;
            v7_6[17] = 0;
            v7_6[18] = 1065353216;
            v7_6[19] = 1065353216;
            java.util.ArrayList v12_2 = java.nio.ByteBuffer.allocateDirect(80).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            this.g = v12_2;
            v12_2.put(v7_6).position(0);
            int v7_3 = (v5_10.nextInt(100) + 20);
            int v5_1 = (v5_10.nextInt(10) + 1);
            java.util.ArrayList v12_4 = new java.util.ArrayList();
            java.util.ArrayList v13_1 = new java.util.ArrayList();
            int v14_1 = 0;
            while (v14_1 < v7_3) {
                int v19_1;
                java.util.Random v15_0 = i2.k0.a;
                boolean v16_0 = v15_0.nextFloat();
                if (v9_1 == 0) {
                    v19_1 = 1022739087;
                } else {
                    v19_1 = 1036831949;
                }
                int v19_2 = v4_9;
                float[] v4_8 = (((v16_0 - 1056964608) * v19_1) + v6_6);
                int v10_0 = (v8_1 - ((v15_0.nextFloat() * 1022739087) + 990057071));
                if (!n2.r.m0(v6_6, v8_1, v4_8, v10_0)) {
                    v12_4.add(Float.valueOf(v6_6));
                    v12_4.add(Float.valueOf(v8_1));
                    v12_4.add(v3_23);
                    v12_4.add(Float.valueOf(v4_8));
                    v12_4.add(Float.valueOf(v10_0));
                    v12_4.add(v3_23);
                }
                if ((v15_0.nextFloat() < 1050253722) && (v5_1 > 0)) {
                    v5_1--;
                    this.l0(v4_8, v10_0, v13_1, 0);
                }
                v14_1++;
                v6_6 = v4_8;
                v8_1 = v10_0;
                v4_9 = v19_2;
            }
            int v19_0 = v4_9;
            java.nio.FloatBuffer v3_1 = new float[v12_4.size()];
            float[] v4_0 = 0;
            while (v4_0 < v12_4.size()) {
                v3_1[v4_0] = ((Float) v12_4.get(v4_0)).floatValue();
                v4_0++;
            }
            this.m = v3_1;
            java.nio.FloatBuffer v3_3 = new float[v13_1.size()];
            float[] v4_1 = 0;
            while (v4_1 < v13_1.size()) {
                v3_3[v4_1] = ((Float) v13_1.get(v4_1)).floatValue();
                v4_1++;
            }
            this.n = v3_3;
            java.nio.FloatBuffer v3_10 = java.nio.ByteBuffer.allocateDirect((this.m.length * 4)).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            this.h = v3_10;
            v3_10.put(this.m).position(0);
            java.nio.FloatBuffer v3_18 = java.nio.ByteBuffer.allocateDirect((this.n.length * 4)).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            this.i = v3_18;
            v3_18.put(this.n).position(0);
            this.l = 1;
            this.p = 0;
            float v1_2 = i2.k0.a;
            this.s = (v1_2.nextInt(7) + 3);
            this.t = v1_2.nextInt(v19_0);
            v0.c.n.s = Math.max(v0.D, 1047589105);
            this.u = 1;
        }
        return;
    }
}
