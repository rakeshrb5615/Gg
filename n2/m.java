package n2;
public final class m extends c4.b {
    public final float[] A;
    public boolean B;
    public int C;
    public int c;
    public int d;
    public float e;
    public java.nio.FloatBuffer f;
    public java.nio.ShortBuffer g;
    public final float[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final float[] q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public final float[] y;
    public final float[] z;

    public m(android.content.Context p3, android.content.SharedPreferences p4)
    {
        int v0_4 = new float[8000];
        this.h = v0_4;
        int v0_10 = new float[3];
        v0_10 = {1065353216, 1065353216, 1065353216};
        this.q = v0_10;
        this.r = 1018712556;
        this.s = 0;
        this.t = 0;
        this.u = 1065353216;
        this.w = 0;
        this.x = System.nanoTime();
        float[] v1_1 = new float[16];
        this.y = v1_1;
        float[] v1_2 = new float[16];
        this.z = v1_2;
        int v0_5 = new float[16];
        this.A = v0_5;
        this.C = 4;
        this.B = p4.getBoolean(p3.getString(2131952246), 1);
        return;
    }

    public final void k0()
    {
        n2.m v0 = this;
        java.nio.FloatBuffer v1_0 = this.B;
        if ((v1_0 != null) && (this.C != 4)) {
            if (v1_0 != null) {
                float v5_18 = System.nanoTime();
                java.nio.FloatBuffer v1_2 = (((float) (v5_18 - this.x)) * 814313567);
                this.x = v5_18;
                if (v1_2 > 1028443341) {
                    v1_2 = 1028443341;
                }
                this.w = (((1080033280 * v1_2) * 1045220557) + this.w);
                float v5_14 = (this.r * 1101004800);
                float v6_14 = ((float) (4607182418800017408 / Math.sqrt((((double) (v5_14 * v5_14)) + 4607182418800017408))));
                float v5_13 = (v5_14 * v6_14);
                float v6_6 = (v6_14 * -1082130432);
                int v8_6 = 1065353216;
                int v7_11 = ((Math.abs(this.r) * 1092616192) + 1065353216);
                this.s = Math.min((this.s + 1008981770), 1065353216);
                this.t = Math.min((this.t + 1014350479), 1065353216);
                this.f.clear();
                float v10_4 = (v5_13 * 1053609165);
                float v9_9 = (1053609165 * v6_6);
                float v11_2 = (- v9_9);
                float v12_4 = ((float) Math.sqrt(((double) ((v10_4 * v10_4) + (v11_2 * v11_2)))));
                float v11_3 = (v11_2 / v12_4);
                float v12_5 = (v10_4 / v12_4);
                int v13_0 = 0;
                while (v13_0 < 600) {
                    float v15_6;
                    float v14_4 = (v13_0 * 8);
                    float v3_13 = this.h;
                    if (v3_13[(v14_4 + 6)] <= 1056964608) {
                        v15_6 = 0;
                    } else {
                        v15_6 = 1;
                    }
                    float v17_4;
                    if (v15_6 == 0) {
                        v17_4 = v8_6;
                    } else {
                        v17_4 = 1056964608;
                    }
                    float v16_0;
                    int v7_10;
                    float v17_2;
                    float v21_2;
                    float v18_4;
                    if (((float) v13_0) < ((this.u * 1142292480) * v17_4)) {
                        java.nio.FloatBuffer v4_4;
                        float v5_2;
                        float v17_0 = (v14_4 + 1);
                        float v19_1 = v3_13[(v14_4 + 2)];
                        float v20_1 = v3_13[(v14_4 + 3)];
                        float v22_1 = v3_13[(v14_4 + 5)];
                        if (v15_6 == 0) {
                            float v23_3 = (((1045891645 * v1_2) * v7_11) * v20_1);
                            v21_2 = v5_13;
                            v4_4 = ((((float) Math.cos(((double) (this.w + v3_13[(v14_4 + 4)])))) * 1000593162) + (v23_3 * v21_2));
                            v5_2 = (v23_3 * v6_6);
                        } else {
                            float v21_6 = (((1075629261 * v1_2) * v7_11) * v20_1);
                            v21_2 = v5_13;
                            v5_2 = (v21_6 * v6_6);
                            v4_4 = (v21_6 * v5_13);
                        }
                        java.nio.FloatBuffer v2_1 = (v3_13[v14_4] + v4_4);
                        float v18_1 = (v3_13[v17_0] + v5_2);
                        if (v18_1 < -1080452710) {
                            v2_1 = ((i2.k0.a.nextFloat() * 1075419546) - 1067030938);
                            v18_1 = 1067030938;
                        }
                        float v5_5 = this.e;
                        if (v2_1 < (-1080452710 - v5_5)) {
                            v2_1 += 1075419546;
                        }
                        if (v2_1 > (1067030938 - v5_5)) {
                            v2_1 -= 1075419546;
                        }
                        float v3_0;
                        v3_13[v14_4] = v2_1;
                        v3_13[v17_0] = v18_1;
                        if (v15_6 == 0) {
                            v3_0 = this.t;
                        } else {
                            v3_0 = this.s;
                        }
                        float v15_0;
                        float v14_0;
                        java.nio.FloatBuffer v1_3;
                        java.nio.FloatBuffer v4_15;
                        int v8_3;
                        float v5_8;
                        java.nio.FloatBuffer v2_5;
                        float v6_1;
                        float v3_1 = (v3_0 * v19_1);
                        if (v15_6 == 0) {
                            float v22_2 = (v22_1 * 1017370378);
                            v15_0 = (v2_1 - v22_2);
                            java.nio.FloatBuffer v4_14 = ((((float) this.c) / ((float) this.d)) * v22_2);
                            v14_0 = (v2_1 + v22_2);
                            v16_0 = v1_2;
                            v2_5 = v14_0;
                            v5_8 = v15_0;
                            v4_15 = (v18_1 - v4_14);
                            v8_3 = v4_15;
                            v1_3 = (v18_1 + v4_14);
                            v17_2 = v6_6;
                            v6_1 = v1_3;
                        } else {
                            java.nio.FloatBuffer v4_18 = ((1024685244 * v22_1) * 1056964608);
                            float v5_11 = ((v10_4 * v22_1) * 1056964608);
                            float v22_4 = ((v22_1 * v9_9) * 1056964608);
                            int v8_4 = (v11_3 * v4_18);
                            java.nio.FloatBuffer v4_19 = (v4_18 * v12_5);
                            float v14_1 = (v2_1 - v5_11);
                            v15_0 = (v14_1 - v8_4);
                            float v16_1 = (v18_1 - v22_4);
                            v14_0 = (v14_1 + v8_4);
                            java.nio.FloatBuffer v2_6 = (v2_1 + v5_11);
                            v5_8 = (v2_6 - v8_4);
                            float v18_2 = (v18_1 + v22_4);
                            v2_5 = (v2_6 + v8_4);
                            v4_15 = (v16_1 + v4_19);
                            v8_3 = (v16_1 - v4_19);
                            v16_0 = v1_2;
                            v17_2 = v6_6;
                            v1_3 = (v18_2 + v4_19);
                            v6_1 = (v18_2 - v4_19);
                        }
                        v18_4 = v7_11;
                        this.f.put(v15_0).put(v8_3).put(0).put(0).put(v3_1);
                        v7_10 = 1065353216;
                        this.f.put(v14_0).put(v4_15).put(1065353216).put(0).put(v3_1);
                        this.f.put(v5_8).put(v6_1).put(0).put(1065353216).put(v3_1);
                        this.f.put(v2_5).put(v1_3).put(1065353216).put(1065353216).put(v3_1);
                    } else {
                        java.nio.FloatBuffer v2_8 = 0;
                        while (v2_8 < 20) {
                            this.f.put(0);
                            v2_8++;
                        }
                        v16_0 = v1_2;
                        v21_2 = v5_13;
                        v17_2 = v6_6;
                        v18_4 = v7_11;
                        v7_10 = v8_6;
                    }
                    v13_0++;
                    v8_6 = v7_10;
                    v1_2 = v16_0;
                    v6_6 = v17_2;
                    v7_11 = v18_4;
                    v5_13 = v21_2;
                }
                this.f.position(0);
            }
            android.opengl.GLES20.glUseProgram(this.i);
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(1, 771);
            android.opengl.GLES20.glBlendFunc(770, 771);
            c4.b.g0(v0.i, this.y, this.z, v0.A, this.v);
            android.opengl.GLES20.glUniform1i(this.k, 0);
            java.nio.FloatBuffer v2_12 = this.j;
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, v2_12);
            android.opengl.GLES20.glUniform1f(this.o, this.q[0]);
            this.f.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.l, 2, 5126, 0, 20, this.f);
            android.opengl.GLES20.glEnableVertexAttribArray(this.l);
            this.f.position(2);
            android.opengl.GLES20.glVertexAttribPointer(this.m, 2, 5126, 0, 20, this.f);
            android.opengl.GLES20.glEnableVertexAttribArray(this.m);
            this.f.position(4);
            android.opengl.GLES20.glVertexAttribPointer(v0.n, 1, 5126, 0, 20, v0.f);
            android.opengl.GLES20.glEnableVertexAttribArray(this.n);
            android.opengl.GLES20.glUniform1f(this.p, this.e);
            android.opengl.GLES20.glDrawElements(4, 3600, 5123, this.g);
            android.opengl.GLES20.glDisable(3042);
        }
        return;
    }

    public final void l0()
    {
        if (this.B) {
            this.x = System.nanoTime();
            int v1 = 0;
            while (v1 < 600) {
                int v3_1;
                int v2_2 = (v1 * 8);
                int v3_0 = this.C;
                if (v3_0 != 3) {
                    if (v3_0 != 1) {
                        v3_1 = 0;
                    } else {
                        v3_1 = 1;
                    }
                } else {
                    v3_1 = i2.k0.a.nextBoolean();
                }
                float v11_0;
                int v4_2 = i2.k0.a;
                int v7 = 1065353216;
                int v5_3 = (((v4_2.nextFloat() * 1073741824) - 1065353216) - this.e);
                float v8_3 = ((v4_2.nextFloat() * 1073741824) - 1065353216);
                float v6_1 = v4_2.nextFloat();
                if (v3_1 == 0) {
                    v11_0 = 4616189618054758400;
                } else {
                    v11_0 = 4620693217682128896;
                }
                float v6_5;
                int v4_5;
                float v11_4;
                float v10_2;
                float v6_2 = ((float) Math.pow(((double) v6_1), v11_0));
                if (v3_1 == 0) {
                    v6_5 = (v4_2.nextFloat() * 1086918619);
                    v4_5 = ((1067869798 * v6_2) + 1060320051);
                    v11_4 = (1053609165 + (1058642330 * v6_2));
                    v10_2 = ((v6_2 * 1069547520) + 1056964608);
                } else {
                    v4_5 = ((1066192077 * v6_2) + 1053609165);
                    v11_4 = ((1050253722 * v6_2) + 1036831949);
                    v10_2 = (v6_2 + 1053609165);
                    v6_5 = 0;
                }
                float[] v12_7 = this.h;
                v12_7[v2_2] = v5_3;
                v12_7[(v2_2 + 1)] = v8_3;
                v12_7[(v2_2 + 2)] = v11_4;
                v12_7[(v2_2 + 3)] = v4_5;
                v12_7[(v2_2 + 4)] = v6_5;
                v12_7[(v2_2 + 5)] = v10_2;
                if (v3_1 == 0) {
                    v7 = 0;
                }
                v12_7[(v2_2 + 6)] = v7;
                v1++;
            }
        }
        return;
    }
}
