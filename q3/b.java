package q3;
public final class b {
    public final android.text.TextUtils$TruncateAt A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public final boolean E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final android.text.TextPaint O;
    public final android.text.TextPaint P;
    public android.animation.TimeInterpolator Q;
    public android.animation.TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public android.content.res.ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public android.text.StaticLayout Z;
    public final com.google.android.material.textfield.TextInputLayout a;
    public float a0;
    public float b;
    public float b0;
    public final android.graphics.Rect c;
    public float c0;
    public final android.graphics.Rect d;
    public CharSequence d0;
    public final android.graphics.RectF e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public final float g0;
    public float h;
    public final int h0;
    public float i;
    public int i0;
    public android.content.res.ColorStateList j;
    public int j0;
    public android.content.res.ColorStateList k;
    public boolean k0;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public android.graphics.Typeface s;
    public android.graphics.Typeface t;
    public android.graphics.Typeface u;
    public android.graphics.Typeface v;
    public android.graphics.Typeface w;
    public android.graphics.Typeface x;
    public android.graphics.Typeface y;
    public s3.a z;

    public b(com.google.android.material.textfield.TextInputLayout p3)
    {
        this.f = 16;
        this.g = 16;
        this.h = 1097859072;
        this.i = 1097859072;
        this.A = android.text.TextUtils$TruncateAt.END;
        this.E = 1;
        this.e0 = 1;
        this.f0 = 1;
        this.g0 = 1065353216;
        this.h0 = 1;
        this.i0 = -1;
        this.j0 = -1;
        this.a = p3;
        android.graphics.RectF v0_3 = new android.text.TextPaint(129);
        this.O = v0_3;
        this.P = new android.text.TextPaint(v0_3);
        this.d = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.e = new android.graphics.RectF();
        this.i(p3.getContext().getResources().getConfiguration());
        return;
    }

    public static int a(int p5, int p6, float p7)
    {
        int v0_1 = (1065353216 - p7);
        return android.graphics.Color.argb(Math.round(((((float) android.graphics.Color.alpha(p6)) * p7) + (((float) android.graphics.Color.alpha(p5)) * v0_1))), Math.round(((((float) android.graphics.Color.red(p6)) * p7) + (((float) android.graphics.Color.red(p5)) * v0_1))), Math.round(((((float) android.graphics.Color.green(p6)) * p7) + (((float) android.graphics.Color.green(p5)) * v0_1))), Math.round(((((float) android.graphics.Color.blue(p6)) * p7) + (((float) android.graphics.Color.blue(p5)) * v0_1))));
    }

    public static float h(float p0, float p1, float p2, android.animation.TimeInterpolator p3)
    {
        if (p3 != null) {
            p2 = p3.getInterpolation(p2);
        }
        return d3.a.a(p0, p1, p2);
    }

    public final void b()
    {
        int v0_0 = this.b;
        float v1_0 = this.c;
        float v3_4 = this.d;
        float v4_0 = this.e;
        v4_0.left = q3.b.h(((float) v1_0.left), ((float) v3_4.left), v0_0, this.Q);
        v4_0.top = q3.b.h(this.m, this.n, v0_0, this.Q);
        v4_0.right = q3.b.h(((float) v1_0.right), ((float) v3_4.right), v0_0, this.Q);
        v4_0.bottom = q3.b.h(((float) v1_0.bottom), ((float) v3_4.bottom), v0_0, this.Q);
        this.q = q3.b.h(this.o, this.p, v0_0, this.Q);
        this.r = q3.b.h(this.m, this.n, v0_0, this.Q);
        this.d(v0_0, 0);
        com.google.android.material.textfield.TextInputLayout v2_11 = this.a;
        v2_11.postInvalidateOnAnimation();
        l1.a v5_3 = d3.a.b;
        this.b0 = (1065353216 - q3.b.h(0, 1065353216, (1065353216 - v0_0), v5_3));
        v2_11.postInvalidateOnAnimation();
        this.c0 = q3.b.h(1065353216, 0, v0_0, v5_3);
        v2_11.postInvalidateOnAnimation();
        float v3_8 = this.k;
        float v4_7 = this.j;
        android.text.TextPaint v7 = this.O;
        if (v3_8 == v4_7) {
            v7.setColor(this.g(v3_8));
        } else {
            v7.setColor(q3.b.a(this.g(v4_7), this.g(this.k), v0_0));
        }
        float v3_12 = this.W;
        float v4_10 = this.X;
        if (v3_12 == v4_10) {
            v7.setLetterSpacing(v3_12);
        } else {
            v7.setLetterSpacing(q3.b.h(v4_10, v3_12, v0_0, v5_3));
        }
        this.H = d3.a.a(0, this.S, v0_0);
        this.I = d3.a.a(0, this.T, v0_0);
        this.J = d3.a.a(0, this.U, v0_0);
        int v0_1 = q3.b.a(0, this.g(this.V), v0_0);
        this.K = v0_1;
        v7.setShadowLayer(this.H, this.I, this.J, v0_1);
        v2_11.postInvalidateOnAnimation();
        return;
    }

    public final boolean c(CharSequence p3)
    {
        int v1_1 = 1;
        if (this.a.getLayoutDirection() != 1) {
            v1_1 = 0;
        }
        if (!this.E) {
            return v1_1;
        } else {
            i2.m v0_1;
            if (v1_1 == 0) {
                v0_1 = o0.f.c;
            } else {
                v0_1 = o0.f.d;
            }
            return v0_1.g(p3, p3.length());
        }
    }

    public final void d(float p16, boolean p17)
    {
        if (this.B != null) {
            android.graphics.Typeface v8_0;
            float v5_7;
            float v4_7;
            int v1_12 = ((float) this.d.width());
            CharSequence v2_0 = ((float) this.c.width());
            float v3 = 1065353216;
            if (Math.abs((p16 - 1065353216)) >= 925353388) {
                v4_7 = this.h;
                int v7_1 = this.X;
                v8_0 = this.v;
                if (Math.abs((p16 - 0)) >= 925353388) {
                    this.F = (q3.b.h(this.h, this.i, p16, this.R) / this.h);
                } else {
                    this.F = 1065353216;
                }
                float v5_6 = (this.i / this.h);
                if ((!p17) && (((v2_0 * v5_6) > v1_12) && (this.o()))) {
                    v2_0 = Math.min((v1_12 / v5_6), v2_0);
                }
                v5_7 = v7_1;
            } else {
                if (!this.o()) {
                    v4_7 = this.h;
                } else {
                    v4_7 = this.i;
                }
                if (!this.o()) {
                    v5_7 = this.X;
                } else {
                    v5_7 = this.W;
                }
                int v7_5;
                if (!this.o()) {
                    v7_5 = (q3.b.h(this.h, this.i, p16, this.R) / this.h);
                } else {
                    v7_5 = 1065353216;
                }
                this.F = v7_5;
                if (!this.o()) {
                    v1_12 = v2_0;
                }
                v8_0 = this.s;
                v2_0 = v1_12;
            }
            CharSequence v0_5;
            if (p16 >= 1056964608) {
                v0_5 = this.f0;
            } else {
                v0_5 = this.e0;
            }
            android.text.TextPaint v11 = this.O;
            int v7_0 = 0;
            if (v2_0 > 0) {
                int v1_17;
                if (this.G == v4_7) {
                    v1_17 = 0;
                } else {
                    v1_17 = 1;
                }
                q3.b v9_12;
                if (this.Y == v5_7) {
                    v9_12 = 0;
                } else {
                    v9_12 = 1;
                }
                int v10_0;
                if (this.y == v8_0) {
                    v10_0 = 0;
                } else {
                    v10_0 = 1;
                }
                int v12_4;
                int v12_0 = this.Z;
                if ((v12_0 == 0) || (v2_0 == ((float) v12_0.getWidth()))) {
                    v12_4 = 0;
                } else {
                    v12_4 = 1;
                }
                int v13_1;
                if (this.L == v0_5) {
                    v13_1 = 0;
                } else {
                    v13_1 = 1;
                }
                if ((v1_17 == 0) && ((v9_12 == null) && ((v12_4 == 0) && ((v10_0 == 0) && ((v13_1 == 0) && (!this.N)))))) {
                    int v1_2 = 0;
                } else {
                    v1_2 = 1;
                }
                this.G = v4_7;
                this.Y = v5_7;
                this.y = v8_0;
                this.N = 0;
                this.L = v0_5;
                if (this.F != 1065353216) {
                    v7_0 = 1;
                }
                v11.setLinearText(v7_0);
                v7_0 = v1_2;
            }
            if ((this.C == null) || (v7_0 != 0)) {
                int v10_1;
                v11.setTextSize(this.G);
                v11.setTypeface(this.y);
                v11.setLetterSpacing(this.Y);
                int v1_8 = this.c(this.B);
                this.D = v1_8;
                if (((this.e0 > 1) || (this.f0 > 1)) && (v1_8 == 0)) {
                    v10_1 = v0_5;
                } else {
                    v10_1 = 1;
                }
                if (!this.o()) {
                    v3 = this.F;
                }
                CharSequence v0_2 = this.e(v10_1, v11, this.B, (v2_0 * v3), this.D);
                this.Z = v0_2;
                this.C = v0_2.getText();
                return;
            }
        }
        return;
    }

    public final android.text.StaticLayout e(int p5, android.text.TextPaint p6, CharSequence p7, float p8, boolean p9)
    {
        android.text.Layout$Alignment v1_3;
        if (p5 != 1) {
            q3.g v2_4 = (android.view.Gravity.getAbsoluteGravity(this.f, this.D) & 7);
            if (v2_4 == 1) {
                v1_3 = android.text.Layout$Alignment.ALIGN_CENTER;
            } else {
                if (v2_4 == 5) {
                    if (!this.D) {
                        v1_3 = android.text.Layout$Alignment.ALIGN_OPPOSITE;
                    } else {
                        v1_3 = android.text.Layout$Alignment.ALIGN_NORMAL;
                    }
                } else {
                    if (!this.D) {
                        v1_3 = android.text.Layout$Alignment.ALIGN_NORMAL;
                    } else {
                        v1_3 = android.text.Layout$Alignment.ALIGN_OPPOSITE;
                    }
                }
            }
        } else {
            v1_3 = android.text.Layout$Alignment.ALIGN_NORMAL;
        }
        q3.g v2_1 = new q3.g(p7, p6, ((int) p8));
        v2_1.l = this.A;
        v2_1.k = p9;
        v2_1.e = v1_3;
        v2_1.j = 0;
        v2_1.f = p5;
        android.text.StaticLayout v5_1 = this.g0;
        v2_1.g = 0;
        v2_1.h = v5_1;
        v2_1.i = this.h0;
        v2_1.m = 0;
        android.text.StaticLayout v5_3 = v2_1.a();
        v5_3.getClass();
        return v5_3;
    }

    public final float f()
    {
        float v0_0 = this.i0;
        if (v0_0 == -1) {
            android.text.TextPaint v1_1 = this.P;
            v1_1.setTextSize(this.i);
            v1_1.setTypeface(this.s);
            v1_1.setLetterSpacing(this.W);
            return (- v1_1.ascent());
        } else {
            return ((float) v0_0);
        }
    }

    public final int g(android.content.res.ColorStateList p3)
    {
        if (p3 != 0) {
            int[] v1 = this.M;
            if (v1 == null) {
                return p3.getDefaultColor();
            } else {
                return p3.getColorForState(v1, 0);
            }
        } else {
            return 0;
        }
    }

    public final void i(android.content.res.Configuration p3)
    {
        if (android.os.Build$VERSION.SDK_INT >= 31) {
            android.graphics.Typeface v0_1 = this.u;
            if (v0_1 != null) {
                this.t = k0.a.b(p3, v0_1);
            }
            android.graphics.Typeface v0_3 = this.x;
            if (v0_3 != null) {
                this.w = k0.a.b(p3, v0_3);
            }
            int v3_2 = this.t;
            if (v3_2 == 0) {
                v3_2 = this.u;
            }
            this.s = v3_2;
            int v3_3 = this.w;
            if (v3_3 == 0) {
                v3_3 = this.x;
            }
            this.v = v3_3;
            this.j(1);
        }
        return;
    }

    public final void j(boolean p15)
    {
        com.google.android.material.textfield.TextInputLayout v0 = this.a;
        if (((v0.getHeight() > 0) && (v0.getWidth() > 0)) || (p15 != 0)) {
            this.d(1065353216, p15);
            float v2_0 = this.O;
            if ((this.C != null) && (this.Z != null)) {
                float v1_26;
                if (!this.o()) {
                    v1_26 = this.C;
                } else {
                    v1_26 = android.text.TextUtils.ellipsize(this.C, v2_0, ((float) this.Z.getWidth()), this.A);
                }
                this.d0 = v1_26;
            }
            float v1_30 = this.d0;
            float v4_0 = 0;
            if (v1_30 == 0) {
                this.a0 = 0;
            } else {
                this.a0 = v2_0.measureText(v1_30, 0, v1_30.length());
            }
            float v1_33 = android.view.Gravity.getAbsoluteGravity(this.g, this.D);
            int v5_2 = (v1_33 & 112);
            int v9_8 = this.d;
            if (v5_2 == 48) {
                this.n = ((float) v9_8.top);
            } else {
                if (v5_2 == 80) {
                    this.n = (v2_0.ascent() + ((float) v9_8.bottom));
                } else {
                    this.n = (((float) v9_8.centerY()) - ((v2_0.descent() - v2_0.ascent()) / 1073741824));
                }
            }
            float v1_35 = (v1_33 & 8388615);
            if (v1_35 == 1) {
                this.p = (((float) v9_8.centerX()) - (this.a0 / 1073741824));
            } else {
                if (v1_35 == 5) {
                    this.p = (((float) v9_8.right) - this.a0);
                } else {
                    this.p = ((float) v9_8.left);
                }
            }
            if (this.a0 <= ((float) v9_8.width())) {
                float v1_47 = this.p;
                int v12_1 = (Math.max(0, (((float) v9_8.left) - v1_47)) + v1_47);
                this.p = v12_1;
                this.p = (Math.min(0, (((float) v9_8.right) - (this.a0 + v12_1))) + v12_1);
            }
            int v12_2 = this.P;
            v12_2.setTextSize(this.i);
            v12_2.setTypeface(this.s);
            v12_2.setLetterSpacing(this.W);
            if ((v12_2.descent() + (- v12_2.ascent())) <= ((float) v9_8.height())) {
                float v1_15 = this.n;
                int v12_9 = (Math.max(0, (((float) v9_8.top) - v1_15)) + v1_15);
                this.n = v12_9;
                this.n = (Math.min(0, (((float) v9_8.bottom) - (this.f() + v12_9))) + v12_9);
            }
            float v15_2;
            this.d(0, p15);
            float v15_1 = this.Z;
            if (v15_1 == 0) {
                v15_2 = 0;
            } else {
                v15_2 = ((float) v15_1.getHeight());
            }
            float v1_24;
            float v1_21 = this.Z;
            if ((v1_21 == 0) || (this.e0 <= 1)) {
                float v1_23 = this.C;
                if (v1_23 == 0) {
                    v1_24 = 0;
                } else {
                    v1_24 = v2_0.measureText(v1_23, 0, v1_23.length());
                }
            } else {
                v1_24 = ((float) v1_21.getWidth());
            }
            int v9_5;
            int v9_4 = this.Z;
            if (v9_4 == 0) {
                v9_5 = 0;
            } else {
                v9_5 = v9_4.getLineCount();
            }
            this.l = v9_5;
            int v9_7 = android.view.Gravity.getAbsoluteGravity(this.f, this.D);
            int v12_11 = (v9_7 & 112);
            android.graphics.Rect v13_2 = this.c;
            if (v12_11 == 48) {
                this.m = ((float) v13_2.top);
            } else {
                if (v12_11 == 80) {
                    float v6_2 = (((float) v13_2.bottom) - v15_2);
                    if (this.k0) {
                        v4_0 = v2_0.descent();
                    }
                    this.m = (v6_2 + v4_0);
                } else {
                    this.m = (((float) v13_2.centerY()) - (v15_2 / 1073741824));
                }
            }
            float v15_8 = (v9_7 & 8388615);
            if (v15_8 == 1) {
                this.o = (((float) v13_2.centerX()) - (v1_24 / 1073741824));
            } else {
                if (v15_8 == 5) {
                    this.o = (((float) v13_2.right) - v1_24);
                } else {
                    this.o = ((float) v13_2.left);
                }
            }
            this.d(this.b, 0);
            v0.postInvalidateOnAnimation();
            this.b();
        }
        return;
    }

    public final void k(android.content.res.ColorStateList p2)
    {
        if ((this.k == p2) && (this.j == p2)) {
            return;
        } else {
            this.k = p2;
            this.j = p2;
            this.j(0);
            return;
        }
    }

    public final boolean l(android.graphics.Typeface p3)
    {
        android.content.res.Configuration v0_0 = this.z;
        if (v0_0 != null) {
            v0_0.h = 1;
        }
        if (this.u == p3) {
            return 0;
        } else {
            this.u = p3;
            android.graphics.Typeface v3_1 = k0.a.b(this.a.getContext().getResources().getConfiguration(), p3);
            this.t = v3_1;
            if (v3_1 == null) {
                v3_1 = this.u;
            }
            this.s = v3_1;
            return 1;
        }
    }

    public final void m(float p3)
    {
        float v3_1 = c4.b.g(p3, 0, 1065353216);
        if (v3_1 != this.b) {
            this.b = v3_1;
            this.b();
        }
        return;
    }

    public final void n(android.graphics.Typeface p4)
    {
        int v4_2;
        boolean v0 = this.l(p4);
        if (this.x == p4) {
            v4_2 = 0;
        } else {
            this.x = p4;
            int v4_1 = k0.a.b(this.a.getContext().getResources().getConfiguration(), p4);
            this.w = v4_1;
            if (v4_1 == 0) {
                v4_1 = this.x;
            }
            this.v = v4_1;
            v4_2 = 1;
        }
        if ((!v0) && (v4_2 == 0)) {
            return;
        } else {
            this.j(0);
            return;
        }
    }

    public final boolean o()
    {
        if (this.f0 != 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
