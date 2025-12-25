package g2;
public final class n {
    public static final android.graphics.Matrix p;
    public final android.graphics.Path a;
    public final android.graphics.Path b;
    public final android.graphics.Matrix c;
    public android.graphics.Paint d;
    public android.graphics.Paint e;
    public android.graphics.PathMeasure f;
    public final g2.k g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final r.e o;

    static n()
    {
        g2.n.p = new android.graphics.Matrix();
        return;
    }

    public n()
    {
        this.c = new android.graphics.Matrix();
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 255;
        this.m = 0;
        this.n = 0;
        this.o = new r.e(0);
        this.g = new g2.k();
        this.a = new android.graphics.Path();
        this.b = new android.graphics.Path();
        return;
    }

    public n(g2.n p4)
    {
        this.c = new android.graphics.Matrix();
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 255;
        this.m = 0;
        this.n = 0;
        r.e v0_3 = new r.e(0);
        this.o = v0_3;
        this.g = new g2.k(p4.g, v0_3);
        this.a = new android.graphics.Path(p4.a);
        this.b = new android.graphics.Path(p4.b);
        this.h = p4.h;
        this.i = p4.i;
        this.j = p4.j;
        this.k = p4.k;
        this.l = p4.l;
        this.m = p4.m;
        String v1_13 = p4.m;
        if (v1_13 != null) {
            v0_3.put(v1_13, this);
        }
        this.n = p4.n;
        return;
    }

    public final void a(g2.k p21, android.graphics.Matrix p22, android.graphics.Canvas p23, int p24, int p25)
    {
        java.util.ArrayList v6 = p21.b;
        p21.a.set(p22);
        android.graphics.Matrix v2_1 = p21.a;
        v2_1.preConcat(p21.j);
        p23.save();
        android.graphics.Paint v7_16 = 0;
        int v8_0 = 0;
        while (v8_0 < v6.size()) {
            int v18;
            float v0_3 = ((g2.l) v6.get(v8_0));
            if (!(v0_3 instanceof g2.k)) {
                if (!(v0_3 instanceof g2.m)) {
                    v18 = v8_0;
                } else {
                    int v8_4;
                    float v0_9 = ((g2.m) v0_3);
                    int v5_18 = (((float) p24) / this.j);
                    android.graphics.Path v10_1 = (((float) p25) / this.k);
                    float v11_23 = Math.min(v5_18, v10_1);
                    float v12_3 = this.c;
                    v12_3.set(v2_1);
                    v12_3.postScale(v5_18, v10_1);
                    int v5_20 = new float[4];
                    v5_20 = {0, 1065353216, 1065353216, 0};
                    v2_1.mapVectors(v5_20);
                    float v21_1 = v11_23;
                    int v17 = v7_16;
                    v18 = v8_0;
                    int v8_3 = ((v5_20[v17] * v5_20[3]) - (v5_20[1] * v5_20[2]));
                    int v5_22 = Math.max(((float) Math.hypot(((double) v5_20[v7_16]), ((double) v5_20[1]))), ((float) Math.hypot(((double) v5_20[2]), ((double) v5_20[3]))));
                    if (v5_22 <= 0) {
                        v8_4 = 0;
                    } else {
                        v8_4 = (Math.abs(v8_3) / v5_22);
                    }
                    if (v8_4 != 0) {
                        int v5_24 = this.a;
                        v5_24.reset();
                        android.graphics.Path v10_8 = v0_9.a;
                        if (v10_8 != null) {
                            h0.d.b(v10_8, v5_24);
                        }
                        android.graphics.Path v10_9 = this.b;
                        v10_9.reset();
                        if (!(v0_9 instanceof g2.i)) {
                            float v0_11 = ((g2.j) v0_9);
                            float v11_29 = v0_11.i;
                            if ((v11_29 != 0) || (v0_11.j != 1065353216)) {
                                int v13_2 = v0_11.k;
                                float v11_1 = ((v11_29 + v13_2) % 1065353216);
                                float v15_2 = ((v0_11.j + v13_2) % 1065353216);
                                if (this.f == null) {
                                    this.f = new android.graphics.PathMeasure();
                                }
                                int v13_9;
                                this.f.setPath(v5_24, v17);
                                int v13_8 = this.f.getLength();
                                float v11_2 = (v11_1 * v13_8);
                                float v15_3 = (v15_2 * v13_8);
                                v5_24.reset();
                                if (v11_2 <= v15_3) {
                                    v13_9 = 0;
                                    this.f.getSegment(v11_2, v15_3, v5_24, 1);
                                } else {
                                    this.f.getSegment(v11_2, v13_8, v5_24, 1);
                                    v13_9 = 0;
                                    this.f.getSegment(0, v15_3, v5_24, 1);
                                }
                                v5_24.rLineTo(v13_9, v13_9);
                            }
                            int v16_1;
                            float v19;
                            v10_9.addPath(v5_24, v12_3);
                            int v5_0 = v0_11.f;
                            if ((((android.graphics.Shader) v5_0.c) == null) && (v5_0.b == 0)) {
                                v19 = 1132396544;
                                v16_1 = 16777215;
                            } else {
                                if (this.e != null) {
                                    v16_1 = 16777215;
                                } else {
                                    v16_1 = 16777215;
                                    android.graphics.Paint v7_7 = new android.graphics.Paint(1);
                                    this.e = v7_7;
                                    v7_7.setStyle(android.graphics.Paint$Style.FILL);
                                }
                                android.graphics.Paint v7_8 = this.e;
                                float v11_7 = ((android.graphics.Shader) v5_0.c);
                                if (v11_7 == 0) {
                                    v7_8.setShader(0);
                                    v7_8.setAlpha(255);
                                    int v5_1 = v5_0.b;
                                    v19 = 1132396544;
                                    v7_8.setColor(((v5_1 & v16_1) | (((int) (((float) android.graphics.Color.alpha(v5_1)) * v0_11.h)) << 24)));
                                } else {
                                    v11_7.setLocalMatrix(v12_3);
                                    v7_8.setShader(v11_7);
                                    v7_8.setAlpha(Math.round((v0_11.h * 1132396544)));
                                    v19 = 1132396544;
                                }
                                int v5_8;
                                v7_8.setColorFilter(0);
                                if (v0_11.c != 0) {
                                    v5_8 = android.graphics.Path$FillType.EVEN_ODD;
                                } else {
                                    v5_8 = android.graphics.Path$FillType.WINDING;
                                }
                                v10_9.setFillType(v5_8);
                                p23.drawPath(v10_9, v7_8);
                            }
                            int v5_9 = v0_11.d;
                            if ((((android.graphics.Shader) v5_9.c) != null) || (v5_9.b != 0)) {
                                if (this.d == null) {
                                    android.graphics.Paint v7_14 = new android.graphics.Paint(1);
                                    this.d = v7_14;
                                    v7_14.setStyle(android.graphics.Paint$Style.STROKE);
                                }
                                android.graphics.Paint v7_15 = this.d;
                                float v11_13 = v0_11.m;
                                if (v11_13 != 0) {
                                    v7_15.setStrokeJoin(v11_13);
                                }
                                float v11_14 = v0_11.l;
                                if (v11_14 != 0) {
                                    v7_15.setStrokeCap(v11_14);
                                }
                                v7_15.setStrokeMiter(v0_11.n);
                                float v11_17 = ((android.graphics.Shader) v5_9.c);
                                if (v11_17 == 0) {
                                    v7_15.setShader(0);
                                    v7_15.setAlpha(255);
                                    int v5_10 = v5_9.b;
                                    v7_15.setColor(((v5_10 & v16_1) | (((int) (((float) android.graphics.Color.alpha(v5_10)) * v0_11.g)) << 24)));
                                } else {
                                    v11_17.setLocalMatrix(v12_3);
                                    v7_15.setShader(v11_17);
                                    v7_15.setAlpha(Math.round((v0_11.g * v19)));
                                }
                                v7_15.setColorFilter(0);
                                v7_15.setStrokeWidth((v0_11.e * (v21_1 * v8_4)));
                                p23.drawPath(v10_9, v7_15);
                            }
                        } else {
                            float v0_7;
                            if (v0_9.c != 0) {
                                v0_7 = android.graphics.Path$FillType.EVEN_ODD;
                            } else {
                                v0_7 = android.graphics.Path$FillType.WINDING;
                            }
                            v10_9.setFillType(v0_7);
                            v10_9.addPath(v5_24, v12_3);
                            p23.clipPath(v10_9);
                        }
                    }
                }
            } else {
                this.a(((g2.k) v0_3), v2_1, p23, p24, p25);
            }
            v8_0 = (v18 + 1);
            v7_16 = 0;
        }
        p23.restore();
        return;
    }

    public float getAlpha()
    {
        return (((float) this.getRootAlpha()) / 1132396544);
    }

    public int getRootAlpha()
    {
        return this.l;
    }

    public void setAlpha(float p2)
    {
        this.setRootAlpha(((int) (p2 * 1132396544)));
        return;
    }

    public void setRootAlpha(int p1)
    {
        this.l = p1;
        return;
    }
}
