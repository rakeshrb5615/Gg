package v3;
public final class r {
    public final v3.z[] a;
    public final android.graphics.Matrix[] b;
    public final android.graphics.Matrix[] c;
    public final android.graphics.PointF d;
    public final android.graphics.Path e;
    public final android.graphics.Path f;
    public final v3.z g;
    public final float[] h;
    public final float[] i;
    public final android.graphics.Path j;
    public final android.graphics.Path k;
    public final boolean l;

    public r()
    {
        int v1_6 = new v3.z[4];
        this.a = v1_6;
        int v1_15 = new android.graphics.Matrix[4];
        this.b = v1_15;
        int v1_16 = new android.graphics.Matrix[4];
        this.c = v1_16;
        this.d = new android.graphics.PointF();
        this.e = new android.graphics.Path();
        this.f = new android.graphics.Path();
        this.g = new v3.z();
        android.graphics.Matrix[] v2_0 = new float[2];
        this.h = v2_0;
        int v1_8 = new float[2];
        this.i = v1_8;
        this.j = new android.graphics.Path();
        this.k = new android.graphics.Path();
        this.l = 1;
        int v1_14 = 0;
        while (v1_14 < 4) {
            this.a[v1_14] = new v3.z();
            this.b[v1_14] = new android.graphics.Matrix();
            this.c[v1_14] = new android.graphics.Matrix();
            v1_14++;
        }
        return;
    }

    public final void a(v3.p p23, float[] p24, float p25, android.graphics.RectF p26, v3.h p27, android.graphics.Path p28)
    {
        p28.rewind();
        android.graphics.Path v6 = this.e;
        v6.rewind();
        android.graphics.Path v7 = this.f;
        v7.rewind();
        v7.addRect(p26, android.graphics.Path$Direction.CW);
        java.util.ArrayList v9_0 = 0;
        while(true) {
            android.graphics.Matrix[] v10 = this.c;
            float v13_0 = this.h;
            int v14_11 = 4;
            v3.z[] v15_6 = this.a;
            int v16_3 = 0;
            int v8_1 = this.b;
            if (v9_0 >= 4) {
                break;
            }
            int v14_14;
            if (p24 != 0) {
                v14_14 = new v3.c(p24[v9_0]);
            } else {
                if (v9_0 == 1) {
                    v14_14 = p23.g;
                } else {
                    if (v9_0 == 2) {
                        v14_14 = p23.h;
                    } else {
                        if (v9_0 == 3) {
                            v14_14 = p23.e;
                        } else {
                            v14_14 = p23.f;
                        }
                    }
                }
            }
            v3.y[] v11_10;
            if (v9_0 == 1) {
                v11_10 = p23.c;
            } else {
                if (v9_0 == 2) {
                    v11_10 = p23.d;
                } else {
                    if (v9_0 == 3) {
                        v11_10 = p23.a;
                    } else {
                        v11_10 = p23.b;
                    }
                }
            }
            float v17;
            android.graphics.Matrix v12_11 = v15_6[v9_0];
            v11_10.getClass();
            v11_10.x(v12_11, p25, v14_14.a(p26));
            v3.y[] v11_13 = (v9_0 + 1);
            android.graphics.Matrix v12_14 = ((float) ((v11_13 % 4) * 90));
            v8_1[v9_0].reset();
            int v14_18 = this.d;
            int v19_1 = v8_1;
            if (v9_0 == 1) {
                v17 = v9_0;
                v14_18.set(p26.right, p26.bottom);
            } else {
                if (v9_0 == 2) {
                    v17 = v9_0;
                    v14_18.set(p26.left, p26.bottom);
                } else {
                    if (v9_0 == 3) {
                        v17 = v9_0;
                        v14_18.set(p26.left, p26.top);
                    } else {
                        v17 = v9_0;
                        v14_18.set(p26.right, p26.top);
                    }
                }
            }
            v19_1[v17].setTranslate(v14_18.x, v14_18.y);
            v19_1[v17].preRotate(v12_14);
            int v8_12 = v15_6[v17];
            v13_0[0] = v8_12.c;
            v13_0[1] = v8_12.d;
            v19_1[v17].mapPoints(v13_0);
            v10[v17].reset();
            v10[v17].setTranslate(v13_0[0], v13_0[1]);
            v10[v17].preRotate(v12_14);
            v9_0 = v11_13;
        }
        int v19_0 = v8_1;
        int v18_0 = 1;
        int v8_2 = 0;
        while (v8_2 < v14_11) {
            java.util.ArrayList v9_19 = v15_6[v8_2];
            v13_0[v16_3] = v9_19.a;
            v13_0[v18_0] = v9_19.b;
            v19_0[v8_2].mapPoints(v13_0);
            if (v8_2 != 0) {
                p28.lineTo(v13_0[v16_3], v13_0[v18_0]);
            } else {
                p28.moveTo(v13_0[v16_3], v13_0[v18_0]);
            }
            v15_6[v8_2].b(v19_0[v8_2], p28);
            if (p27 != null) {
                java.util.ArrayList v9_25 = v15_6[v8_2];
                v3.y[] v11_18 = v19_0[v8_2];
                android.graphics.Matrix v12_15 = p27.a;
                int v14_20 = v12_15.e;
                v9_25.getClass();
                v14_20.set(v8_2, v16_3);
                android.graphics.RectF v3_6 = v12_15.c;
                v9_25.a(v9_25.f);
                v3_6[v8_2] = new v3.s(new java.util.ArrayList(v9_25.h), new android.graphics.Matrix(v11_18));
            }
            int v14_6;
            android.graphics.RectF v3_7 = (v8_2 + 1);
            java.util.ArrayList v9_29 = (v3_7 % 4);
            v3.y[] v11_21 = v15_6[v8_2];
            v13_0[0] = v11_21.c;
            v13_0[1] = v11_21.d;
            v19_0[v8_2].mapPoints(v13_0);
            v3.y[] v11_24 = v15_6[v9_29];
            int v14_21 = this.i;
            v14_21[0] = v11_24.a;
            v14_21[1] = v11_24.b;
            v19_0[v9_29].mapPoints(v14_21);
            v3.z[] v20_1 = v15_6;
            v3.y[] v11_3 = Math.max((((float) Math.hypot(((double) (v13_0[0] - v14_21[0])), ((double) (v13_0[1] - v14_21[1])))) - 981668463), 0);
            int v14_0 = v20_1[v8_2];
            v13_0[0] = v14_0.c;
            v13_0[1] = v14_0.d;
            v19_0[v8_2].mapPoints(v13_0);
            if ((v8_2 == 1) || (v8_2 == 3)) {
                v14_6 = Math.abs((p26.centerX() - v13_0[0]));
            } else {
                v14_6 = Math.abs((p26.centerY() - v13_0[1]));
            }
            android.graphics.Matrix v12_2;
            int v24_1 = v3_7;
            android.graphics.RectF v3_0 = this.g;
            v3_0.d(0, 0, 1132920832, 0);
            if (v8_2 == 1) {
                v12_2 = p23.k;
            } else {
                if (v8_2 == 2) {
                    v12_2 = p23.l;
                } else {
                    if (v8_2 == 3) {
                        v12_2 = p23.i;
                    } else {
                        v12_2 = p23.j;
                    }
                }
            }
            v12_2.k(v11_3, v14_6, p25, v3_0);
            v3.y[] v11_4 = this.j;
            v11_4.reset();
            v3_0.b(v10[v8_2], v11_4);
            if ((!this.l) || ((!v12_2.j()) && ((!this.b(v11_4, v8_2)) && (!this.b(v11_4, v9_29))))) {
                v18_0 = 1;
                v3_0.b(v10[v8_2], p28);
            } else {
                v11_4.op(v11_4, v7, android.graphics.Path$Op.DIFFERENCE);
                v13_0[0] = v3_0.a;
                v18_0 = 1;
                v13_0[1] = v3_0.b;
                v10[v8_2].mapPoints(v13_0);
                v6.moveTo(v13_0[0], v13_0[1]);
                v3_0.b(v10[v8_2], v6);
            }
            v3.z[] v15_7;
            if (p27 == null) {
                v15_7 = 0;
            } else {
                java.util.ArrayList v9_9 = v10[v8_2];
                v3.y[] v11_7 = p27.a;
                v15_7 = 0;
                v11_7.e.set((v8_2 + 4), 0);
                v3.y[] v11_8 = v11_7.d;
                v3_0.a(v3_0.f);
                v11_8[v8_2] = new v3.s(new java.util.ArrayList(v3_0.h), new android.graphics.Matrix(v9_9));
            }
            v8_2 = v24_1;
            v16_3 = v15_7;
            v15_6 = v20_1;
            v14_11 = 4;
        }
        p28.close();
        v6.close();
        if (!v6.isEmpty()) {
            p28.op(v6, android.graphics.Path$Op.UNION);
        }
        return;
    }

    public final boolean b(android.graphics.Path p4, int p5)
    {
        int v0_0 = this.k;
        v0_0.reset();
        this.a[p5].b(this.b[p5], v0_0);
        android.graphics.RectF v5_3 = new android.graphics.RectF();
        p4.computeBounds(v5_3, 1);
        v0_0.computeBounds(v5_3, 1);
        p4.op(v0_0, android.graphics.Path$Op.INTERSECT);
        p4.computeBounds(v5_3, 1);
        if ((v5_3.isEmpty()) && ((v5_3.width() <= 1065353216) || (v5_3.height() <= 1065353216))) {
            return 0;
        } else {
            return 1;
        }
    }
}
