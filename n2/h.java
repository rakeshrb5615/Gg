package n2;
public final class h extends c4.b {
    public static final float[] L;
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public final float H;
    public float[] I;
    public boolean J;
    public boolean K;
    public final boolean c;
    public java.nio.FloatBuffer d;
    public java.nio.FloatBuffer e;
    public int f;
    public float g;
    public float h;
    public float[] i;
    public boolean j;
    public int k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public final float[] t;
    public final float[] u;
    public final float[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    static h()
    {
        float[] v0_1 = new float[12];
        v0_1 = {-1082130432, 1065353216, 0, -1082130432, -1082130432, 0, 1065353216, 1065353216, 0, 1065353216, -1082130432, 0};
        n2.h.L = v0_1;
        return;
    }

    public h(android.content.Context p5, boolean p6)
    {
        this.i = 0;
        this.q = 1065353216;
        this.r = 1056964608;
        this.s = 0;
        float[] v3_0 = new float[16];
        this.t = v3_0;
        float[] v3_1 = new float[16];
        this.u = v3_1;
        int v2_0 = new float[16];
        this.v = v2_0;
        this.E = 1065353216;
        int v2_2 = new float[8];
        v2_2 = {0, 0, 0, 1065353216, 1065353216, 0, 1065353216, 1065353216};
        this.I = v2_2;
        this.J = 1;
        this.K = 1;
        this.c = p6;
        int v5_2 = j5.t1.z(p5).getFloat(p5.getString(2131951715), 1065353216);
        this.H = v5_2;
        if ((((v5_2 * v5_2) - v5_2) + 1076132576) >= 1087851488) {
            this.H = 0;
            return;
        } else {
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(this.f, "vPosition"), 0);
            return;
        }
    }

    public static float[] m0(float[] p7, float[] p8, float p9)
    {
        float v1_1 = g2.g.b(p8[0], p7[0], p9, p7[0]);
        float v3_1 = g2.g.b(p8[1], p7[1], p9, p7[1]);
        float v5_1 = g2.g.b(p8[2], p7[2], p9, p7[2]);
        float v7_2 = g2.g.b(p8[3], p7[3], p9, p7[3]);
        float[] v8_3 = new float[4];
        v8_3[0] = v1_1;
        v8_3[1] = v3_1;
        v8_3[2] = v5_1;
        v8_3[3] = v7_2;
        return v8_3;
    }

    public final void k0()
    {
        if ((this.K) || (this.k == 0)) {
            float v1_26 = this.k;
            if (v1_26 != 0) {
                c4.b.k(v1_26);
                this.k = 0;
            }
            float v1_1 = 1;
            int v3_0 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v3_0, 0);
            int v3_1 = v3_0[0];
            this.k = v3_1;
            android.opengl.GLES20.glBindTexture(3553, v3_1);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            java.nio.ByteBuffer v13 = java.nio.ByteBuffer.allocateDirect(1024).order(java.nio.ByteOrder.nativeOrder());
            int v3_3 = 0;
            while (v3_3 < 256) {
                float v17;
                float v4_10 = (((float) v3_3) / 1132396544);
                float[] v7_0 = new float[4];
                float v8_3 = new float[4];
                int v9_1 = new float[4];
                float v10_4 = this.j;
                if (v10_4 == 0) {
                    v17 = v1_1;
                    float v1_27 = this.i;
                    v7_0[0] = v1_27[0];
                    v7_0[v17] = v1_27[v17];
                    v7_0[2] = v1_27[int v11_1];
                    v7_0[3] = v1_27[int v12_1];
                    v9_1[0] = v1_27[4];
                    v9_1[v17] = v1_27[5];
                    v9_1[2] = v1_27[6];
                    v9_1[3] = v1_27[7];
                    v8_3 = v7_0;
                } else {
                    v17 = v1_1;
                    float v1_29 = this.i;
                    v7_0[0] = v1_29[0];
                    v7_0[v17] = v1_29[v17];
                    v7_0[2] = v1_29[v11_1];
                    v7_0[3] = v1_29[v12_1];
                    v8_3[0] = v1_29[4];
                    v8_3[v17] = v1_29[5];
                    v8_3[2] = v1_29[6];
                    v8_3[3] = v1_29[7];
                    v9_1[0] = v1_29[8];
                    v9_1[v17] = v1_29[9];
                    v9_1[2] = v1_29[10];
                    v9_1[3] = v1_29[11];
                }
                float v1_3 = this.s;
                if (v4_10 > v1_3) {
                    float v14_0 = 0;
                    if (v10_4 == 0) {
                        float v8_0 = this.q;
                        if (v4_10 <= v8_0) {
                            float v4_1 = ((v4_10 - v1_3) / (v8_0 - v1_3));
                            if (v4_1 >= 0) {
                                v14_0 = Math.min(v4_1, 1065353216);
                            }
                            v7_0 = n2.h.m0(v7_0, v9_1, v14_0);
                            v13.put(((byte) ((int) (v7_0[0] * 1132396544))));
                            v13.put(((byte) ((int) (v7_0[v17] * 1132396544))));
                            v13.put(((byte) ((int) (v7_0[2] * 1132396544))));
                            v13.put(((byte) ((int) (v7_0[3] * 1132396544))));
                            v3_3++;
                            v1_1 = v17;
                        }
                    } else {
                        float v10_1 = this.r;
                        if (v4_10 > v10_1) {
                            float v1_5 = this.q;
                            if (v4_10 <= v1_5) {
                                float v4_3 = ((v4_10 - v10_1) / (v1_5 - v10_1));
                                if (v4_3 >= 0) {
                                    v14_0 = Math.min(v4_3, 1065353216);
                                }
                                v7_0 = n2.h.m0(v8_3, v9_1, v14_0);
                            }
                        } else {
                            float v4_5 = ((v4_10 - v1_3) / (v10_1 - v1_3));
                            if (v4_5 >= 0) {
                                v14_0 = Math.min(v4_5, 1065353216);
                            }
                            v7_0 = n2.h.m0(v7_0, v8_3, v14_0);
                        }
                    }
                    v7_0 = v9_1;
                }
            }
            v13.position(0);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6408, 1, 256, 0, 6408, 5121, v13);
            this.K = 0;
            return;
        } else {
            return;
        }
    }

    public final void l0(boolean p8)
    {
        if (this.k != 0) {
            android.opengl.GLES20.glUseProgram(this.f);
            android.opengl.GLES20.glEnableVertexAttribArray(this.w);
            android.opengl.GLES20.glVertexAttribPointer(this.w, (((int) this.H) + 3), 5126, 0, 0, this.d);
            android.opengl.GLES20.glEnableVertexAttribArray(this.x);
            android.opengl.GLES20.glVertexAttribPointer(this.x, 2, 5126, 0, 0, this.e);
            android.opengl.GLES20.glUniformMatrix4fv(this.y, 1, 0, this.v, 0);
            android.opengl.GLES20.glUniform1i(this.z, this.c);
            android.opengl.GLES20.glUniform1i(this.D, 1);
            android.opengl.GLES20.glUniform1f(this.A, this.E);
            if (p8 == 0) {
                android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            } else {
                android.opengl.GLES20.glTexParameteri(3553, 10242, 10497);
            }
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLES20.glActiveTexture(33985);
            android.opengl.GLES20.glBindTexture(3553, this.k);
            int v0_14 = (this.F % 1065353216);
            float v4_2 = this.G;
            if (v0_14 < 0) {
                v0_14 += 1065353216;
            }
            if (p8 == 0) {
                android.opengl.GLES20.glUniform1f(this.B, 0);
                android.opengl.GLES20.glUniform1f(this.C, 0);
            } else {
                android.opengl.GLES20.glUniform1f(this.B, v0_14);
                android.opengl.GLES20.glUniform1f(this.C, v4_2);
            }
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.w);
            android.opengl.GLES20.glDisableVertexAttribArray(this.x);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, 0);
            return;
        } else {
            return;
        }
    }

    public final void n0(float p8, float p9, float p10, float p11, float p12)
    {
        this.l = p8;
        this.m = p9;
        this.p = p10;
        if (!this.J) {
            p11 = this.g;
        }
        this.n = p11;
        this.o = p12;
        float[] v8_2 = this.t;
        android.opengl.Matrix.setIdentityM(v8_2, 0);
        android.opengl.Matrix.translateM(v8_2, 0, ((this.n / 1073741824) + this.l), ((this.o / 1073741824) + this.m), this.p);
        int v11_4 = 1065353216;
        android.opengl.Matrix.scaleM(v8_2, 0, ((this.n / 1073741824) * 1065353216), ((this.o / 1073741824) * v11_4), v11_4);
        android.opengl.Matrix.multiplyMM(this.v, 0, this.u, 0, this.t, 0);
        return;
    }

    public final void o0(float p4, float p5, float p6)
    {
        if (!this.j) {
            float v5_5 = Math.max(0, Math.min(1065353216, (p6 / 1065353216)));
            this.s = v5_5;
            this.r = v5_5;
            this.q = Math.max(v5_5, Math.min(1065353216, (p4 / 1065353216)));
        } else {
            float v6_3 = Math.max(0, Math.min(1065353216, (p6 / 1065353216)));
            this.s = v6_3;
            float v5_3 = Math.max(v6_3, Math.min(1065353216, (p5 / 1065353216)));
            this.r = v5_3;
            this.q = Math.max(v5_3, Math.min(1065353216, (p4 / 1065353216)));
        }
        this.K = 1;
        return;
    }

    public final void p0(float[] p4)
    {
        if (p4 != null) {
            if (p4.length != 8) {
                if (p4.length != 12) {
                    throw new IllegalArgumentException("Gradient colors must be 8 or 12 floats.");
                } else {
                    this.j = 1;
                }
            } else {
                this.j = 0;
            }
            this.i = ((float[]) p4.clone());
            this.K = 1;
            return;
        } else {
            return;
        }
    }

    public final void q0(float p8, float p9)
    {
        int v8_11;
        this.g = p8;
        this.h = p9;
        c4.b.j(this.f);
        c4.b.i(this.e);
        c4.b.i(this.d);
        this.e = 0;
        this.d = 0;
        if (!this.J) {
            v8_11 = 1073741824;
        } else {
            v8_11 = 1065353216;
        }
        float[] v0_2 = new float[8];
        v0_2[0] = 0;
        v0_2[1] = 0;
        v0_2[2] = 0;
        v0_2[3] = 1065353216;
        v0_2[4] = v8_11;
        v0_2[5] = 0;
        v0_2[6] = v8_11;
        v0_2[7] = 1065353216;
        this.I = v0_2;
        int v8_18 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.e = v8_18;
        v8_18.put(this.I).position(0);
        int v8_23 = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.d = v8_23;
        v8_23.put(n2.h.L).position(0);
        int v8_28 = c4.b.M(35633, q4.b.l("KOd+G86ICKS0CZskYfaItHosVcZjihJuIqyhZLbGbkRQjSXzTbIRFNXqeXo4XxzPZk6P+8EN3tSZO4h4qFx/IoZu5ua4SIb9hmWCnXS6QY0qXB/ozBrxZUWWL5mFgLWm38pPbgKbXqtCz7xLdRiwnpqIDQ2pfRm0HTwXEOYInv2vPsyDpip7A0IkUbtg/kKbiaCYaanSZSUx5f8XOHcLqaG67rGd7P5iBLNoqzut2wcWVe1SylVqBvNChbDsDCV4axrtGtmhFS5Vemx7kvoSBG2UavkCMz14osqjccb0fr18EePS4DNZxIQRxyL6LMQFBxMHPig81X+LhgM4mrx2minc1bAAM0TWRMvji27Aw+IG58nxcdyv0CQRxu0L/mHDS+tVJ2AXRTF3XSIe4kbZABYFb8EEsWKKhOa9E3U35QL1nfN5axLkawV+pEhWTUgekNZQZ1fENkAiabR4Bruk9bihWYRTuV2aDurozWZvY2GqcgTp5vYglI9n0P9PmEgu+TWG2aMEW6bPRCQWNSmo6GHWj1dOngZzqAzhaOOr2Xs="));
        String v9_14 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItHosVcZjihJuIqyhZLbGbkRQjSXzTbIRFNXqeXo4XxzPUXsjFQQOtpo6kA4ewkz8W3C0pYWCavng/77/BAqFdrAUXOwRMjdnQR+ukg2LKRopMjnyK3iHsJgpYJFGQ5WlTjQrJqMc7F7oTVXe1SlqPiuW4Vl9CBkOZqbFiDrNqPBgt43L7T9lBC7MNG4B6D4Pn6WVYc4SdTj8KQ451ZyOuc99JjoBY9UhjmMhJ28vKlB6KGSkiGhbwOowj0uHTy6D1ggVPC6EEpZpNL8JMxXgUPjRs/fmbdfoUhKJyk9IvZT+uM+vO2nSijgCDL7in4OStp+Q0bfJfhxGDd+vJYrdgylBSPKS8JYkrZCjKiwnf/hLoRRaDYVhLm8EVLJhb4r0Fe8/4QBweVo4B1z3sCN62iEsdFQN27Cdx4OSYENSiltIBLsQ4+Q71AkTxBnElU4nj2cc0DqT5tZb3TdApi5MUk0FABTfh8OMR/ZqlexTfEi4hryknD2u3O5/wBUF3DRDomOi5roIq4MrbUYfzn3911P+vfg35rbqlvzUgpJUa0nrIFsmy1Y5V0B9GdCdNwZa/HSiCLwmNojFXg6G+s8R2TVYGS5cY1OhU5GMPhqz3O7IAk9X1xRFNqPoZl8wp2LfCNrPDBu8RzxzQxAFQi1pivSKtXFilyraeZ1NZKulLOAeibgo9t4OX2C0uQIccKqS1JjATyUaGYEbVtsxW2dJ2eiLKIaD61WMZVgCXGHubnWSNoCu9Hh9HAuuyX/YDRyLxbtaEbug/LrLZKQ5oKoss7MHwJ78234eS78gOm7d0BjVOa3pEDUZB+7uyjDXg9copxmA+QytPl6q6fsDF2w+7MsIejD05bOrt/d2pw1KfE/3Gcp12olRKUMj2puPcHnEbI+hu1p7CieHsvtVcin8s5tqESJleKCAlHpl7EFzv3OBIYqn41zHoMzZlXG/kuP94CPnMom3Azh2X3oJDYW2wow="));
        float[] v0_4 = android.opengl.GLES20.glCreateProgram();
        this.f = v0_4;
        android.opengl.GLES20.glAttachShader(v0_4, v8_28);
        android.opengl.GLES20.glAttachShader(this.f, v9_14);
        android.opengl.GLES20.glLinkProgram(this.f);
        this.w = android.opengl.GLES20.glGetAttribLocation(this.f, "vPosition");
        this.x = android.opengl.GLES20.glGetAttribLocation(this.f, "aTexCoord");
        this.y = android.opengl.GLES20.glGetUniformLocation(this.f, "uMVPMatrix");
        this.z = android.opengl.GLES20.glGetUniformLocation(this.f, "u_alpha");
        this.B = android.opengl.GLES20.glGetUniformLocation(this.f, "u_xScroll");
        this.C = android.opengl.GLES20.glGetUniformLocation(this.f, "u_yScroll");
        this.D = android.opengl.GLES20.glGetUniformLocation(this.f, "uGradient");
        this.A = android.opengl.GLES20.glGetUniformLocation(this.f, "u_HDR");
        c4.b.a0(this.t, this.u, this.v, 0, this.g, this.h, 0);
        return;
    }
}
