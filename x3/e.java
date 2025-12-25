package x3;
public abstract class e extends android.view.View {
    public static final synthetic int b1;
    public final int A;
    public int A0;
    public final int B;
    public boolean B0;
    public final int C;
    public boolean C0;
    public final int D;
    public android.content.res.ColorStateList D0;
    public final int E;
    public android.content.res.ColorStateList E0;
    public int F;
    public android.content.res.ColorStateList F0;
    public final int G;
    public android.content.res.ColorStateList G0;
    public int H;
    public android.content.res.ColorStateList H0;
    public int I;
    public final android.graphics.Path I0;
    public int J;
    public final android.graphics.RectF J0;
    public int K;
    public final android.graphics.RectF K0;
    public int L;
    public final android.graphics.RectF L0;
    public int M;
    public final android.graphics.RectF M0;
    public int N;
    public final android.graphics.Rect N0;
    public int O;
    public final android.graphics.RectF O0;
    public int P;
    public final android.graphics.Rect P0;
    public int Q;
    public final android.graphics.Matrix Q0;
    public int R;
    public final v3.k R0;
    public int S;
    public android.graphics.drawable.Drawable S0;
    public int T;
    public java.util.List T0;
    public boolean U;
    public float U0;
    public android.graphics.drawable.Drawable V;
    public int V0;
    public boolean W;
    public final int W0;
    public final x3.a X0;
    public final x3.b Y0;
    public final androidx.lifecycle.g0 Z0;
    public final android.graphics.Paint a;
    public android.graphics.drawable.Drawable a0;
    public boolean a1;
    public final android.graphics.Paint b;
    public boolean b0;
    public final android.graphics.Paint c;
    public android.content.res.ColorStateList c0;
    public final android.graphics.Paint d;
    public android.graphics.drawable.Drawable d0;
    public final android.graphics.Paint e;
    public boolean e0;
    public final android.graphics.Paint f;
    public android.graphics.drawable.Drawable f0;
    public boolean g0;
    public android.content.res.ColorStateList h0;
    public int i0;
    public final int j0;
    public final int k0;
    public float l0;
    public final android.graphics.Paint m;
    public float m0;
    public final x3.c n;
    public android.view.MotionEvent n0;
    public final android.view.accessibility.AccessibilityManager o;
    public x3.f o0;
    public com.google.android.material.datepicker.g p;
    public boolean p0;
    public final int q;
    public float q0;
    public final java.util.ArrayList r;
    public float r0;
    public final java.util.ArrayList s;
    public java.util.ArrayList s0;
    public final java.util.ArrayList t;
    public int t0;
    public boolean u;
    public int u0;
    public android.animation.ValueAnimator v;
    public float v0;
    public android.animation.ValueAnimator w;
    public float[] w0;
    public final int x;
    public int x0;
    public final int y;
    public int y0;
    public final int z;
    public int z0;

    public e(android.content.Context p13, android.util.AttributeSet p14)
    {
        int v11_0;
        super(a4.a.a(p13, p14, 2130969754, 2132018429), p14, 2130969754);
        super.r = new java.util.ArrayList();
        super.s = new java.util.ArrayList();
        super.t = new java.util.ArrayList();
        super.u = 0;
        super.P = -1;
        super.Q = -1;
        super.U = 0;
        super.W = 0;
        super.b0 = 0;
        super.e0 = 0;
        super.g0 = 0;
        super.p0 = 0;
        super.s0 = new java.util.ArrayList();
        super.t0 = -1;
        super.u0 = -1;
        super.v0 = 0;
        super.B0 = 0;
        super.I0 = new android.graphics.Path();
        super.J0 = new android.graphics.RectF();
        super.K0 = new android.graphics.RectF();
        super.L0 = new android.graphics.RectF();
        super.M0 = new android.graphics.RectF();
        super.N0 = new android.graphics.Rect();
        super.O0 = new android.graphics.RectF();
        super.P0 = new android.graphics.Rect();
        super.Q0 = new android.graphics.Matrix();
        v3.k v8_1 = new v3.k();
        super.R0 = v8_1;
        super.T0 = java.util.Collections.EMPTY_LIST;
        super.V0 = 0;
        super.X0 = new x3.a(((com.google.android.material.slider.Slider) super));
        super.Y0 = new x3.b(((com.google.android.material.slider.Slider) super));
        super.Z0 = new androidx.lifecycle.g0(((com.google.android.material.slider.Slider) super), 15);
        android.content.Context v1_27 = super.getContext();
        super.a1 = super.isShown();
        super.a = new android.graphics.Paint();
        super.b = new android.graphics.Paint();
        int v2_19 = new android.graphics.Paint(1);
        super.c = v2_19;
        int v3_27 = android.graphics.Paint$Style.FILL;
        v2_19.setStyle(v3_27);
        v2_19.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff$Mode.CLEAR));
        int v2_0 = new android.graphics.Paint(1);
        super.d = v2_0;
        v2_0.setStyle(v3_27);
        int v2_2 = new android.graphics.Paint();
        super.e = v2_2;
        int v5_0 = android.graphics.Paint$Style.STROKE;
        v2_2.setStyle(v5_0);
        int v6_0 = android.graphics.Paint$Cap.ROUND;
        v2_2.setStrokeCap(v6_0);
        int v2_4 = new android.graphics.Paint();
        super.f = v2_4;
        v2_4.setStyle(v5_0);
        v2_4.setStrokeCap(v6_0);
        int v2_6 = new android.graphics.Paint();
        super.m = v2_6;
        v2_6.setStyle(v3_27);
        v2_6.setStrokeCap(v6_0);
        int v2_7 = v1_27.getResources();
        super.G = v2_7.getDimensionPixelSize(2131166185);
        int v3_3 = v2_7.getDimensionPixelOffset(2131166184);
        super.y = v3_3;
        super.K = v3_3;
        super.z = v2_7.getDimensionPixelSize(2131166180);
        super.A = v2_7.getDimensionPixelSize(2131166183);
        super.B = v2_7.getDimensionPixelSize(2131166182);
        super.C = v2_7.getDimensionPixelSize(2131166182);
        super.D = v2_7.getDimensionPixelSize(2131166181);
        super.k0 = v2_7.getDimensionPixelSize(2131166176);
        super.j0 = v2_7.getDimensionPixelOffset(2131165898);
        int v6_1 = new int[0];
        q3.k.a(v1_27, p14, 2130969754, 2132018429);
        int v3_15 = c3.a.B;
        q3.k.b(v1_27, p14, v3_15, 2130969754, 2132018429, v6_1);
        int v14_1 = v1_27.obtainStyledAttributes(p14, v3_15, 2130969754, 2132018429);
        super.setOrientation(v14_1.getInt(2, 0));
        super.q = v14_1.getResourceId(10, 2132018463);
        super.q0 = v14_1.getFloat(4, 0);
        super.r0 = v14_1.getFloat(5, 1065353216);
        super.setValues(new Float[] {Float.valueOf(super.q0)}));
        super.setCentered(v14_1.getBoolean(6, 0));
        super.v0 = v14_1.getFloat(3, 0);
        super.E = ((int) Math.ceil(((double) v14_1.getDimension(11, ((float) c4.b.V(v1_27))))));
        int v4_12 = 27;
        int v5_4 = v14_1.hasValue(27);
        if (v5_4 == 0) {
            v11_0 = 29;
        } else {
            v11_0 = 27;
        }
        if (v5_4 == 0) {
            v4_12 = 28;
        }
        int v5_5 = j5.t1.v(v1_27, v14_1, v11_0);
        if (v5_5 == 0) {
            v5_5 = e0.c.getColorStateList(v1_27, 2131100572);
        }
        super.setTrackInactiveTintList(v5_5);
        int v4_13 = j5.t1.v(v1_27, v14_1, v4_12);
        if (v4_13 == 0) {
            v4_13 = e0.c.getColorStateList(v1_27, 2131100569);
        }
        super.setTrackActiveTintList(v4_13);
        v8_1.o(j5.t1.v(v1_27, v14_1, 12));
        if (v14_1.hasValue(16)) {
            super.setThumbStrokeColor(j5.t1.v(v1_27, v14_1, 16));
        }
        super.setThumbStrokeWidth(v14_1.getDimension(17, 0));
        int v4_22 = j5.t1.v(v1_27, v14_1, 7);
        if (v4_22 == 0) {
            v4_22 = e0.c.getColorStateList(v1_27, 2131100570);
        }
        int v4_27;
        super.setHaloTintList(v4_22);
        if (!v14_1.hasValue(25)) {
            if (!v14_1.getBoolean(26, 1)) {
                v4_27 = 2;
            } else {
                v4_27 = 0;
            }
        } else {
            v4_27 = v14_1.getInt(25, -1);
        }
        int v11_1;
        super.x0 = v4_27;
        int v4_28 = 20;
        int v5_9 = v14_1.hasValue(20);
        if (v5_9 == 0) {
            v11_1 = 22;
        } else {
            v11_1 = 20;
        }
        if (v5_9 == 0) {
            v4_28 = 21;
        }
        int v5_10 = j5.t1.v(v1_27, v14_1, v11_1);
        if (v5_10 == 0) {
            v5_10 = e0.c.getColorStateList(v1_27, 2131100571);
        }
        super.setTickInactiveTintList(v5_10);
        int v4_29 = j5.t1.v(v1_27, v14_1, v4_28);
        if (v4_29 == 0) {
            v4_29 = e0.c.getColorStateList(v1_27, 2131100568);
        }
        super.setTickActiveTintList(v4_29);
        super.setThumbTrackGapSize(v14_1.getDimensionPixelSize(18, 0));
        super.setTrackStopIndicatorSize(v14_1.getDimensionPixelSize(40, 0));
        super.setTrackCornerSize(v14_1.getDimensionPixelSize(30, -1));
        super.setTrackInsideCornerSize(v14_1.getDimensionPixelSize(39, 0));
        super.setTrackIconActiveStart(j5.t1.B(v1_27, v14_1, 34));
        super.setTrackIconActiveEnd(j5.t1.B(v1_27, v14_1, 33));
        super.setTrackIconActiveColor(j5.t1.v(v1_27, v14_1, 32));
        super.setTrackIconInactiveStart(j5.t1.B(v1_27, v14_1, 37));
        super.setTrackIconInactiveEnd(j5.t1.B(v1_27, v14_1, 36));
        super.setTrackIconInactiveColor(j5.t1.v(v1_27, v14_1, 35));
        super.setTrackIconSize(v14_1.getDimensionPixelSize(38, 0));
        boolean v0_21 = (v14_1.getDimensionPixelSize(15, 0) * 2);
        int v4_37 = v14_1.getDimensionPixelSize(19, v0_21);
        boolean v0_22 = v14_1.getDimensionPixelSize(14, v0_21);
        super.setThumbWidth(v4_37);
        super.setThumbHeight(v0_22);
        super.setHaloRadius(v14_1.getDimensionPixelSize(8, 0));
        super.setThumbElevation(v14_1.getDimension(13, 0));
        super.setTrackHeight(v14_1.getDimensionPixelSize(31, 0));
        super.setTickActiveRadius(v14_1.getDimensionPixelSize(23, (super.R / 2)));
        super.setTickInactiveRadius(v14_1.getDimensionPixelSize(24, (super.R / 2)));
        super.setLabelBehavior(v14_1.getInt(9, 0));
        if (!v14_1.getBoolean(0, 1)) {
            super.setEnabled(0);
        }
        v14_1.recycle();
        super.setFocusable(1);
        super.setClickable(1);
        v8_1.p();
        super.x = android.view.ViewConfiguration.get(v1_27).getScaledTouchSlop();
        int v13_8 = new x3.c(((com.google.android.material.slider.Slider) super));
        super.n = v13_8;
        q0.q0.n(super, v13_8);
        int v13_11 = ((android.view.accessibility.AccessibilityManager) super.getContext().getSystemService("accessibility"));
        super.o = v13_11;
        if (android.os.Build$VERSION.SDK_INT < 29) {
            super.W0 = 120000;
            return;
        } else {
            super.W0 = v13_11.getRecommendedTimeoutMillis(10000, 6);
            return;
        }
    }

    public final void A()
    {
        double v2_2;
        float v0_0 = this.U0;
        int v1_0 = this.v0;
        if (v1_0 <= 0) {
            v2_2 = ((double) v0_0);
        } else {
            int v1_1 = ((int) ((this.r0 - this.q0) / v1_0));
            v2_2 = (((double) Math.round((v0_0 * ((float) v1_1)))) / ((double) v1_1));
        }
        if ((this.r()) || (this.s())) {
            v2_2 = (4607182418800017408 - v2_2);
        }
        int v1_2 = this.q0;
        this.z(this.t0, ((float) ((v2_2 * ((double) (this.r0 - v1_2))) + ((double) v1_2))));
        return;
    }

    public final void B(int p7, android.graphics.Rect p8)
    {
        int v0_1 = (this.K + ((int) (this.v(((Float) this.getValues().get(p7)).floatValue()) * ((float) this.A0))));
        int v7_3 = this.c();
        int v1_5 = Math.max((this.L / 2), (this.E / 2));
        int v2_4 = Math.max((this.M / 2), (this.E / 2));
        android.graphics.RectF v3_3 = new android.graphics.RectF(((float) (v0_1 - v1_5)), ((float) (v7_3 - v2_4)), ((float) (v0_1 + v1_5)), ((float) (v7_3 + v2_4)));
        if (this.s()) {
            this.Q0.mapRect(v3_3);
        }
        p8.set(((int) v3_3.left), ((int) v3_3.top), ((int) v3_3.right), ((int) v3_3.bottom));
        return;
    }

    public final void C()
    {
        if (((this.getBackground() instanceof android.graphics.drawable.RippleDrawable)) && (this.getMeasuredWidth() > 0)) {
            android.graphics.drawable.Drawable v0_3 = this.getBackground();
            if ((v0_3 instanceof android.graphics.drawable.RippleDrawable)) {
                int v1_6 = ((this.v(((Float) this.s0.get(this.u0)).floatValue()) * ((float) this.A0)) + ((float) this.K));
                int v2_5 = this.c();
                float[] v3_0 = this.N;
                int v4_0 = ((float) v3_0);
                int v6_1 = ((float) (v2_5 - v3_0));
                int v1_7 = (v1_6 + v4_0);
                int v2_7 = ((float) (v2_5 + v3_0));
                float[] v3_2 = new float[4];
                v3_2[0] = (v1_6 - v4_0);
                v3_2[1] = v6_1;
                v3_2[2] = v1_7;
                v3_2[3] = v2_7;
                if (this.s()) {
                    this.Q0.mapPoints(v3_2);
                }
                v0_3.setHotspotBounds(((int) v3_2[0]), ((int) v3_2[1]), ((int) v3_2[2]), ((int) v3_2[3]));
            }
        }
        return;
    }

    public final void D()
    {
        android.view.ViewGroup v1_0;
        boolean v0_0 = this.s();
        android.view.ViewGroup v1_3 = this.r();
        int v2_0 = 1056964608;
        if ((!v0_0) || (v1_3 == null)) {
            v1_0 = 1067030938;
            if (v0_0) {
                v2_0 = 1067030938;
                v1_0 = 1056964608;
            }
        } else {
            v1_0 = 1056964608;
            v2_0 = -1102263091;
        }
        boolean v0_2 = this.r;
        int v3 = v0_2.size();
        int v4 = 0;
        while (v4 < v3) {
            b4.b v5_0 = v0_2.get(v4);
            v4++;
            b4.b v5_1 = ((b4.b) v5_0);
            v5_1.b0 = v2_0;
            v5_1.c0 = v1_0;
            v5_1.invalidateSelf();
        }
        boolean v0_3 = this.I;
        if ((!v0_3) || (v0_3 == 1)) {
            if ((this.t0 == -1) || (!this.isEnabled())) {
                this.k();
                return;
            } else {
                this.j();
                return;
            }
        } else {
            if (v0_3 == 2) {
                this.k();
                return;
            } else {
                if (v0_3 != 3) {
                    android.view.ViewGroup v1_7 = new StringBuilder("Unexpected labelBehavior: ");
                    v1_7.append(this.I);
                    throw new IllegalArgumentException(v1_7.toString());
                } else {
                    if (this.isEnabled()) {
                        boolean v0_10 = new android.graphics.Rect();
                        q3.k.d(this).getHitRect(v0_10);
                        if ((this.getLocalVisibleRect(v0_10)) && (this.a1)) {
                            this.j();
                            return;
                        }
                    }
                    this.k();
                    return;
                }
            }
        }
    }

    public final void E()
    {
        int v0_0 = this.O;
        if (v0_0 > 0) {
            int v1_3 = this.L;
            this.P = v1_3;
            this.Q = v0_0;
            int v0_5 = Math.round((((float) v1_3) * 1056964608));
            int v1_1 = (this.L - v0_5);
            this.setThumbWidth(v0_5);
            this.setThumbTrackGapSize((this.O - (v1_1 / 2)));
        }
        return;
    }

    public final void F()
    {
        this.N();
        IllegalStateException v0_0 = this.v0;
        IllegalStateException v2_2 = 0;
        if (v0_0 > 0) {
            String v1_19 = this.x0;
            if (v1_19 == null) {
                v2_2 = Math.min(((int) (((this.r0 - this.q0) / v0_0) + 1065353216)), ((this.A0 / this.D) + 1));
            } else {
                if (v1_19 == 1) {
                    IllegalStateException v0_2 = ((int) (((this.r0 - this.q0) / v0_0) + 1065353216));
                    if (v0_2 <= ((this.A0 / this.D) + 1)) {
                        v2_2 = v0_2;
                    }
                } else {
                    if (v1_19 != 2) {
                        String v1_17 = new StringBuilder("Unexpected tickVisibilityMode: ");
                        v1_17.append(this.x0);
                        throw new IllegalStateException(v1_17.toString());
                    }
                }
            }
            this.G(v2_2);
            return;
        } else {
            this.G(0);
            return;
        }
    }

    public final void G(int p8)
    {
        if (p8 != null) {
            float[] v0_0 = this.w0;
            if ((v0_0 == null) || (v0_0.length != (p8 * 2))) {
                float[] v0_6 = new float[(p8 * 2)];
                this.w0 = v0_6;
            }
            float v1_3 = ((float) this.c());
            int v2 = 0;
            while (v2 < (p8 * 2)) {
                float[] v3_1 = this.w0;
                v3_1[v2] = (((((float) v2) / 1073741824) * (((float) this.A0) / ((float) (p8 - 1)))) + ((float) this.K));
                v3_1[(v2 + 1)] = v1_3;
                v2 += 2;
            }
            if (this.s()) {
                this.Q0.mapPoints(this.w0);
            }
            return;
        } else {
            this.w0 = 0;
            return;
        }
    }

    public final void H(android.graphics.Canvas p18, android.graphics.Paint p19, android.graphics.RectF p20, float p21, int p22)
    {
        if (!p20.isEmpty()) {
            if ((this.s0.isEmpty()) || (this.O <= 0)) {
                android.graphics.Path$Direction v4_13 = p21;
            } else {
                if ((!this.r()) && (!this.s())) {
                    android.graphics.Path$Direction v4_5 = 0;
                } else {
                    v4_5 = (this.s0.size() - 1);
                }
                android.graphics.Path$Direction v4_12 = (this.P(((Float) this.s0.get(v4_5)).floatValue()) - ((float) this.K));
                if (v4_12 >= p21) {
                } else {
                    v4_13 = Math.max(v4_12, ((float) this.T));
                }
            }
            if ((this.s0.isEmpty()) || (this.O <= 0)) {
                float v7_27 = p21;
            } else {
                if ((!this.r()) && (!this.s())) {
                    float v7_21 = (this.s0.size() - 1);
                } else {
                    v7_21 = 0;
                }
                float v7_26 = (this.P(((Float) this.s0.get(v7_21)).floatValue()) - ((float) this.K));
                android.graphics.RectF v8_8 = ((float) this.A0);
                if (v7_26 <= (v8_8 - p21)) {
                } else {
                    v7_27 = Math.max((v8_8 - v7_26), ((float) this.T));
                }
            }
            android.graphics.RectF v8_10 = u.e.c(p22);
            if (v8_10 == 1) {
                v7_27 = ((float) this.T);
            } else {
                if (v8_10 == 2) {
                    v4_13 = ((float) this.T);
                } else {
                    if (v8_10 == 3) {
                        v4_13 = ((float) this.T);
                        v7_27 = v4_13;
                    }
                }
            }
            p19.setStyle(android.graphics.Paint$Style.FILL);
            p19.setStrokeCap(android.graphics.Paint$Cap.BUTT);
            if (this.O > 0) {
                p19.setAntiAlias(1);
            }
            android.graphics.RectF v8_2 = new android.graphics.RectF(p20);
            int v12_0 = this.Q0;
            if (this.s()) {
                v12_0.mapRect(v8_2);
            }
            android.graphics.Path v11_1 = this.I0;
            v11_1.reset();
            if (p20.width() < (v4_13 + v7_27)) {
                float v5_0 = Math.min(v4_13, v7_27);
                android.graphics.Path$Direction v4_1 = Math.max(v4_13, v7_27);
                p18.save();
                v11_1.addRoundRect(v8_2, v5_0, v5_0, android.graphics.Path$Direction.CW);
                p18.clipPath(v11_1);
                float v5_1 = u.e.c(p22);
                android.graphics.RectF v8_3 = this.M0;
                if (v5_1 == 1) {
                    float v5_2 = p20.left;
                    v8_3.set(v5_2, p20.top, ((1073741824 * v4_1) + v5_2), p20.bottom);
                } else {
                    if (v5_1 == 2) {
                        float v5_3 = p20.right;
                        v8_3.set((v5_3 - (1073741824 * v4_1)), p20.top, v5_3, p20.bottom);
                    } else {
                        v8_3.set((p20.centerX() - v4_1), p20.top, (p20.centerX() + v4_1), p20.bottom);
                    }
                }
                if (this.s()) {
                    v12_0.mapRect(v8_3);
                }
                p18.drawRoundRect(v8_3, v4_1, v4_1, p19);
                p18.restore();
                return;
            } else {
                boolean v3_5;
                if (!this.s()) {
                    v3_5 = new float[8];
                    v3_5[0] = v4_13;
                    v3_5[1] = v4_13;
                    v3_5[2] = v7_27;
                    v3_5[3] = v7_27;
                    v3_5[4] = v7_27;
                    v3_5[5] = v7_27;
                    v3_5[6] = v4_13;
                    v3_5[7] = v4_13;
                } else {
                    v3_5 = new float[8];
                    v3_5[0] = v4_13;
                    v3_5[1] = v4_13;
                    v3_5[2] = v4_13;
                    v3_5[3] = v4_13;
                    v3_5[4] = v7_27;
                    v3_5[5] = v7_27;
                    v3_5[6] = v7_27;
                    v3_5[7] = v7_27;
                }
                v11_1.addRoundRect(v8_2, v3_5, android.graphics.Path$Direction.CW);
                p18.drawPath(v11_1, p19);
                return;
            }
        } else {
            return;
        }
    }

    public final void I()
    {
        android.graphics.drawable.Drawable v0_0 = this.a0;
        if (v0_0 != null) {
            if ((!this.b0) && (this.c0 != null)) {
                this.a0 = v0_0.mutate();
                this.b0 = 1;
            }
            if (this.b0) {
                this.a0.setTintList(this.c0);
            }
        }
        return;
    }

    public final void J()
    {
        android.graphics.drawable.Drawable v0_0 = this.V;
        if (v0_0 != null) {
            if ((!this.W) && (this.c0 != null)) {
                this.V = v0_0.mutate();
                this.W = 1;
            }
            if (this.W) {
                this.V.setTintList(this.c0);
            }
        }
        return;
    }

    public final void K()
    {
        android.graphics.drawable.Drawable v0_0 = this.f0;
        if (v0_0 != null) {
            if ((!this.g0) && (this.h0 != null)) {
                this.f0 = v0_0.mutate();
                this.g0 = 1;
            }
            if (this.g0) {
                this.f0.setTintList(this.h0);
            }
        }
        return;
    }

    public final void L()
    {
        android.graphics.drawable.Drawable v0_0 = this.d0;
        if (v0_0 != null) {
            if ((!this.e0) && (this.h0 != null)) {
                this.d0 = v0_0.mutate();
                this.e0 = 1;
            }
            if (this.e0) {
                this.d0.setTintList(this.h0);
            }
        }
        return;
    }

    public final void M(boolean p9)
    {
        int v1_0;
        int v0_6;
        if (!this.s()) {
            v0_6 = this.getPaddingTop();
            v1_0 = this.getPaddingBottom();
        } else {
            v0_6 = this.getPaddingLeft();
            v1_0 = this.getPaddingRight();
        }
        int v0_5;
        int v1_1 = (v1_0 + v0_6);
        int v0_4 = Math.max(this.G, Math.max((this.J + v1_1), (this.M + v1_1)));
        int v2_2 = 1;
        if (v0_4 != this.H) {
            this.H = v0_4;
            v0_5 = 1;
        } else {
            v0_5 = 0;
        }
        int v1_10 = (Math.max(Math.max(Math.max(((this.L / 2) - this.z), 0), Math.max(((this.J - this.A) / 2), 0)), Math.max(Math.max((this.y0 - this.B), 0), Math.max((this.z0 - this.C), 0))) + this.y);
        if (this.K != v1_10) {
            this.K = v1_10;
            if (this.isLaidOut()) {
                int v1_13;
                if (!this.s()) {
                    v1_13 = this.getWidth();
                } else {
                    v1_13 = this.getHeight();
                }
                this.A0 = Math.max((v1_13 - (this.K * 2)), 0);
                this.F();
            }
        } else {
            v2_2 = 0;
        }
        if (this.s()) {
            int v1_18 = ((float) this.c());
            android.graphics.Matrix v3_1 = this.Q0;
            v3_1.reset();
            v3_1.setRotate(1119092736, v1_18, v1_18);
        }
        if ((v0_5 == 0) && (!p9)) {
            if (v2_2 != 0) {
                this.postInvalidate();
            }
            return;
        } else {
            this.requestLayout();
            return;
        }
    }

    public final void N()
    {
        if (!this.C0) {
            return;
        } else {
            if (this.q0 >= this.r0) {
                IllegalStateException v2_15 = this.q0;
                float v3_0 = this.r0;
                String v4_2 = new StringBuilder("valueFrom(");
                v4_2.append(v2_15);
                v4_2.append(") must be smaller than valueTo(");
                v4_2.append(v3_0);
                v4_2.append(")");
                throw new IllegalStateException(v4_2.toString());
            } else {
                String v0_14 = this.s0;
                IllegalStateException v2_8 = v0_14.size();
                String v4_3 = 0;
                while (v4_3 < v2_8) {
                    double v7_0 = v0_14.get(v4_3);
                    v4_3++;
                    double v7_1 = ((Float) v7_0);
                    if ((v7_1.floatValue() < this.q0) || (v7_1.floatValue() > this.r0)) {
                        IllegalStateException v2_4 = this.q0;
                        float v3_2 = this.r0;
                        String v4_5 = new StringBuilder("Slider value(");
                        v4_5.append(v7_1);
                        v4_5.append(") must be greater or equal to valueFrom(");
                        v4_5.append(v2_4);
                        v4_5.append("), and lower or equal to valueTo(");
                        v4_5.append(v3_2);
                        v4_5.append(")");
                        throw new IllegalStateException(v4_5.toString());
                    } else {
                        if ((this.v0 > 0) && (!this.O(v7_1.floatValue()))) {
                            IllegalStateException v2_6 = this.q0;
                            float v3_3 = this.v0;
                            String v4_7 = new StringBuilder("Value(");
                            v4_7.append(v7_1);
                            v4_7.append(") must be equal to valueFrom(");
                            v4_7.append(v2_6);
                            v4_7.append(") plus a multiple of stepSize(");
                            v4_7.append(v3_3);
                            v4_7.append(") when using stepSize(");
                            v4_7.append(v3_3);
                            v4_7.append(")");
                            throw new IllegalStateException(v4_7.toString());
                        }
                    }
                }
                if ((this.v0 > 0) && (!this.O(this.r0))) {
                    StringBuilder v1_19 = this.v0;
                    IllegalStateException v2_9 = this.q0;
                    float v3_5 = this.r0;
                    String v4_9 = new StringBuilder("The stepSize(");
                    v4_9.append(v1_19);
                    v4_9.append(") must be 0, or a factor of the valueFrom(");
                    v4_9.append(v2_9);
                    v4_9.append(")-valueTo(");
                    v4_9.append(v3_5);
                    v4_9.append(") range");
                    throw new IllegalStateException(v4_9.toString());
                } else {
                    String v0_23 = this.getMinSeparation();
                    if (v0_23 < 0) {
                        IllegalStateException v2_12 = new StringBuilder("minSeparation(");
                        v2_12.append(v0_23);
                        v2_12.append(") must be greater or equal to 0");
                        throw new IllegalStateException(v2_12.toString());
                    } else {
                        IllegalStateException v2_13 = this.v0;
                        if ((v2_13 > 0) && (v0_23 > 0)) {
                            if (this.V0 != 1) {
                                float v3_6 = this.v0;
                                String v5_9 = new StringBuilder("minSeparation(");
                                v5_9.append(v0_23);
                                v5_9.append(") cannot be set as a dimension when using stepSize(");
                                v5_9.append(v3_6);
                                v5_9.append(")");
                                throw new IllegalStateException(v5_9.toString());
                            } else {
                                if ((v0_23 < v2_13) || (!this.o(((double) v0_23)))) {
                                    float v3_1 = this.v0;
                                    StringBuilder v6_1 = new StringBuilder("minSeparation(");
                                    v6_1.append(v0_23);
                                    v6_1.append(") must be greater or equal and a multiple of stepSize(");
                                    v6_1.append(v3_1);
                                    v6_1.append(") when using stepSize(");
                                    v6_1.append(v3_1);
                                    v6_1.append(")");
                                    throw new IllegalStateException(v6_1.toString());
                                }
                            }
                        }
                        String v0_3 = this.v0;
                        if (v0_3 != 0) {
                            if (((float) ((int) v0_3)) != v0_3) {
                                StringBuilder v1_5 = new StringBuilder("Floating point value used for stepSize(");
                                v1_5.append(v0_3);
                                v1_5.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                                android.util.Log.w("e", v1_5.toString());
                            }
                            String v0_5 = this.q0;
                            if (((float) ((int) v0_5)) != v0_5) {
                                StringBuilder v1_10 = new StringBuilder("Floating point value used for valueFrom(");
                                v1_10.append(v0_5);
                                v1_10.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                                android.util.Log.w("e", v1_10.toString());
                            }
                            String v0_7 = this.r0;
                            if (((float) ((int) v0_7)) != v0_7) {
                                StringBuilder v1_15 = new StringBuilder("Floating point value used for valueTo(");
                                v1_15.append(v0_7);
                                v1_15.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                                android.util.Log.w("e", v1_15.toString());
                            }
                        }
                        this.C0 = 0;
                        return;
                    }
                }
            }
        }
    }

    public final boolean O(float p3)
    {
        return this.o(new java.math.BigDecimal(Float.toString(p3)).subtract(new java.math.BigDecimal(Float.toString(this.q0)), java.math.MathContext.DECIMAL64).doubleValue());
    }

    public final float P(float p2)
    {
        return ((this.v(p2) * ((float) this.A0)) + ((float) this.K));
    }

    public final void a(android.graphics.drawable.Drawable p6)
    {
        int v0_0 = p6.getIntrinsicWidth();
        int v1_4 = p6.getIntrinsicHeight();
        if ((v0_0 != -1) || (v1_4 != -1)) {
            float v3_2 = (((float) Math.max(this.L, this.M)) / ((float) Math.max(v0_0, v1_4)));
            p6.setBounds(0, 0, ((int) (((float) v0_0) * v3_2)), ((int) (((float) v1_4) * v3_2)));
            return;
        } else {
            p6.setBounds(0, 0, this.L, this.M);
            return;
        }
    }

    public final void b(android.graphics.Canvas p5, android.graphics.RectF p6, android.graphics.drawable.Drawable p7, boolean p8)
    {
        if (p7 != null) {
            float v0_0 = this.i0;
            int v2_1 = this.j0;
            android.graphics.RectF v3_0 = this.O0;
            if ((p6.right - p6.left) < ((float) ((v2_1 * 2) + v0_0))) {
                v3_0.setEmpty();
            } else {
                if ((!this.r()) && (!this.s())) {
                    float v1_2 = 0;
                } else {
                    v1_2 = 1;
                }
                android.graphics.Rect v6_3;
                if ((p8 ^ v1_2) == 0) {
                    v6_3 = ((p6.right - ((float) v2_1)) - ((float) v0_0));
                } else {
                    v6_3 = (p6.left + ((float) v2_1));
                }
                float v0_1 = ((float) v0_0);
                float v8_7 = (((float) this.c()) - (v0_1 / 1073741824));
                v3_0.set(v6_3, v8_7, (v6_3 + v0_1), (v0_1 + v8_7));
            }
            if (!v3_0.isEmpty()) {
                if (this.s()) {
                    this.Q0.mapRect(v3_0);
                }
                android.graphics.Rect v6_8 = this.P0;
                v3_0.round(v6_8);
                p7.setBounds(v6_8);
                p7.draw(p5);
            }
        }
        return;
    }

    public final int c()
    {
        int v0_1 = (this.H / 2);
        b4.b v1_2 = this.I;
        int v3 = 0;
        if ((v1_2 == 1) || (v1_2 == 3)) {
            v3 = ((b4.b) this.r.get(0)).getIntrinsicHeight();
        }
        return (v0_1 + v3);
    }

    public final android.animation.ValueAnimator d(boolean p6)
    {
        long v2_2;
        android.animation.ValueAnimator v0_0 = 1065353216;
        if (p6 == null) {
            v2_2 = 1065353216;
        } else {
            v2_2 = 0;
        }
        l1.a v3_3;
        if (p6 == null) {
            v3_3 = this.v;
        } else {
            v3_3 = this.w;
        }
        if ((v3_3 != null) && (v3_3.isRunning())) {
            v2_2 = ((Float) v3_3.getAnimatedValue()).floatValue();
            v3_3.cancel();
        }
        if (p6 == null) {
            v0_0 = 0;
        }
        int v1_5;
        i2.j v6_2;
        int v1_2 = new float[2];
        v1_2[0] = v2_2;
        v1_2[1] = v0_0;
        android.animation.ValueAnimator v0_1 = android.animation.ValueAnimator.ofFloat(v1_2);
        if (p6 == null) {
            v6_2 = j5.t1.P(this.getContext(), 2130969532, 117);
            v1_5 = j5.t1.Q(this.getContext(), 2130969537, d3.a.c);
        } else {
            v6_2 = j5.t1.P(this.getContext(), 2130969529, 83);
            v1_5 = j5.t1.Q(this.getContext(), 2130969539, d3.a.e);
        }
        v0_1.setDuration(((long) v6_2));
        v0_1.setInterpolator(v1_5);
        v0_1.addUpdateListener(new i2.j(this, 3));
        return v0_1;
    }

    public final boolean dispatchHoverEvent(android.view.MotionEvent p2)
    {
        if ((!this.n.m(p2)) && (!super.dispatchHoverEvent(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        this.a.setColor(this.n(this.H0));
        this.b.setColor(this.n(this.G0));
        this.e.setColor(this.n(this.F0));
        this.f.setColor(this.n(this.E0));
        this.m.setColor(this.n(this.F0));
        int v0_7 = this.r;
        android.graphics.Paint v1_3 = v0_7.size();
        int v2 = 0;
        while (v2 < v1_3) {
            b4.b v3_0 = v0_7.get(v2);
            v2++;
            b4.b v3_1 = ((b4.b) v3_0);
            if (v3_1.isStateful()) {
                v3_1.setState(this.getDrawableState());
            }
        }
        int v0_9 = this.R0;
        if (v0_9.isStateful()) {
            v0_9.setState(this.getDrawableState());
        }
        android.graphics.Paint v1_7 = this.d;
        v1_7.setColor(this.n(this.D0));
        v1_7.setAlpha(63);
        return;
    }

    public final void e(float p4, float p5, float p6, float p7, android.graphics.Canvas p8, android.graphics.RectF p9, int p10)
    {
        if ((p5 - p4) <= ((float) (this.getTrackCornerSize() - this.O))) {
            p9.setEmpty();
        } else {
            p9.set(p4, p6, p5, p7);
        }
        this.H(p8, this.a, p9, ((float) this.getTrackCornerSize()), p10);
        return;
    }

    public final void f(android.graphics.Canvas p8, float p9, float p10)
    {
        boolean v0_0 = this.s0;
        android.graphics.Paint v1_0 = v0_0.size();
        int v2 = 0;
        while (v2 < v1_0) {
            float v3_0 = v0_0.get(v2);
            v2++;
            float v3_3 = this.P(((Float) v3_0).floatValue());
            float v5_3 = ((((float) this.L) / 1073741824) + ((float) this.O));
            if ((p9 >= (v3_3 - v5_3)) && (p9 <= (v3_3 + v5_3))) {
                return;
            }
        }
        android.graphics.Paint v1_1 = this.m;
        if (!this.s()) {
            p8.drawPoint(p9, p10, v1_1);
            return;
        } else {
            p8.drawPoint(p10, p9, v1_1);
            return;
        }
    }

    public final void g(android.graphics.Canvas p2, int p3, int p4, float p5, android.graphics.drawable.Drawable p6)
    {
        p2.save();
        if (this.s()) {
            p2.concat(this.Q0);
        }
        p2.translate((((float) (this.K + ((int) (this.v(p5) * ((float) p3))))) - (((float) p6.getBounds().width()) / 1073741824)), (((float) p4) - (((float) p6.getBounds().height()) / 1073741824)));
        p6.draw(p2);
        p2.restore();
        return;
    }

    public final int getAccessibilityFocusedVirtualViewId()
    {
        return this.n.k;
    }

    public float getMinSeparation()
    {
        return 0;
    }

    public abstract int getThumbRadius();

    public abstract int getTrackCornerSize();

    public java.util.List getValues()
    {
        return new java.util.ArrayList(this.s0);
    }

    public final void h(int p6, int p7, android.graphics.Canvas p8, android.graphics.Paint p9)
    {
        while (p6 < p7) {
            float v0_5;
            if (!this.s()) {
                v0_5 = this.w0[p6];
            } else {
                v0_5 = this.w0[(p6 + 1)];
            }
            int v2_3 = ((((float) this.L) / 1073741824) + ((float) this.O));
            float v1_3 = this.s0.iterator();
            if (!v1_3.hasNext()) {
                if (this.U) {
                    int v2_7 = ((((float) this.L) / 1073741824) + ((float) this.O));
                    float v1_15 = (((float) ((this.K * 2) + this.A0)) / 1073741824);
                    if ((v0_5 >= (v1_15 - v2_7)) && (v0_5 <= (v1_15 + v2_7))) {
                        p6 += 2;
                    }
                }
                float v0_3 = this.w0;
                p8.drawPoint(v0_3[p6], v0_3[(p6 + 1)], p9);
            } else {
                float v1_7 = this.P(((Float) v1_3.next()).floatValue());
                if ((v0_5 < (v1_7 - v2_3)) || (v0_5 > (v1_7 + v2_3))) {
                }
            }
        }
        return;
    }

    public final void i(android.graphics.Canvas p4, android.graphics.RectF p5, android.graphics.RectF p6)
    {
        if ((this.V == null) && ((this.a0 == null) && ((this.d0 == null) && (this.f0 == null)))) {
            return;
        } else {
            if (this.s0.size() > 1) {
                android.util.Log.w("e", "Track icons can only be used when only 1 thumb is present.");
            }
            this.b(p4, p5, this.V, 1);
            this.b(p4, p6, this.d0, 1);
            this.b(p4, p5, this.a0, 0);
            this.b(p4, p6, this.f0, 0);
            return;
        }
    }

    public final void j()
    {
        if (!this.u) {
            this.u = 1;
            String v0_9 = this.d(1);
            this.v = v0_9;
            this.w = 0;
            v0_9.start();
        }
        String v0_1 = this.r;
        IllegalStateException v1_0 = v0_1.iterator();
        int v2_0 = 0;
        while ((v2_0 < this.s0.size()) && (v1_0.hasNext())) {
            if (v2_0 != this.u0) {
                this.x(((b4.b) v1_0.next()), ((Float) this.s0.get(v2_0)).floatValue());
            }
            v2_0++;
        }
        if (!v1_0.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[] {Integer.valueOf(v0_1.size()), Integer.valueOf(this.s0.size())})));
        } else {
            this.x(((b4.b) v1_0.next()), ((Float) this.s0.get(this.u0)).floatValue());
            return;
        }
    }

    public final void k()
    {
        if (this.u) {
            this.u = 0;
            android.animation.ValueAnimator v0_3 = this.d(0);
            this.w = v0_3;
            this.v = 0;
            v0_3.addListener(new f2.o(this, 9));
            this.w.start();
        }
        return;
    }

    public final String l(float p4)
    {
        String v0_0 = this.o0;
        if (v0_0 == null) {
            String v0_6;
            if (((float) ((int) p4)) != p4) {
                v0_6 = "%.2f";
            } else {
                v0_6 = "%.0f";
            }
            return String.format(v0_6, new Object[] {Float.valueOf(p4)}));
        } else {
            String v0_2 = ((l2.f) v0_0).a;
            v0_2.getClass();
            String v4_4 = v0_2.J2[Math.round(p4)];
            if (v4_4 >= 60) {
                if (v4_4 >= 1440) {
                    return v0_2.getString(2131951807);
                } else {
                    StringBuilder v2_2 = new StringBuilder();
                    v2_2.append((v4_4 / 60));
                    v2_2.append(v0_2.getString(2131951886));
                    return v2_2.toString();
                }
            } else {
                StringBuilder v1_3 = new StringBuilder();
                v1_3.append(v4_4);
                v1_3.append(v0_2.getString(2131952082));
                return v1_3.toString();
            }
        }
    }

    public final float[] m()
    {
        float v0_1 = ((Float) this.s0.get(0)).floatValue();
        float v2_4 = this.s0;
        float v2_2 = ((Float) v2_4.get((v2_4.size() - 1))).floatValue();
        if (this.s0.size() == 1) {
            v0_1 = this.q0;
        }
        float v0_2 = this.v(v0_1);
        float v2_3 = this.v(v2_2);
        if (this.U) {
            float[] v3_4 = Math.min(1056964608, v2_3);
            v2_3 = Math.max(1056964608, v2_3);
            v0_2 = v3_4;
        }
        if ((this.U) || ((!this.r()) && (!this.s()))) {
            float[] v3_8 = new float[2];
            v3_8[0] = v0_2;
            v3_8[1] = v2_3;
            return v3_8;
        } else {
            float[] v3_9 = new float[2];
            v3_9[0] = v2_3;
            v3_9[1] = v0_2;
            return v3_9;
        }
    }

    public final int n(android.content.res.ColorStateList p3)
    {
        return p3.getColorForState(this.getDrawableState(), p3.getDefaultColor());
    }

    public final boolean o(double p3)
    {
        int v3_2 = new java.math.BigDecimal(Double.toString(p3)).divide(new java.math.BigDecimal(Float.toString(this.v0)), java.math.MathContext.DECIMAL64).doubleValue();
        if (Math.abs((((double) Math.round(v3_2)) - v3_2)) >= 4547007122018943789) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        this.a1 = this.isShown();
        this.getViewTreeObserver().addOnScrollChangedListener(this.X0);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.Y0);
        java.util.ArrayList v0_0 = this.r;
        int v1_1 = v0_0.size();
        int v3 = 0;
        while (v3 < v1_1) {
            b4.a v4_0 = v0_0.get(v3);
            v3++;
            b4.a v4_1 = ((b4.b) v4_0);
            android.view.ViewGroup v5 = q3.k.d(this);
            if (v5 != null) {
                v4_1.getClass();
                android.graphics.Rect v6_1 = new int[2];
                v5.getLocationOnScreen(v6_1);
                v4_1.Y = v6_1[0];
                v5.getWindowVisibleDisplayFrame(v4_1.R);
                v5.addOnLayoutChangeListener(v4_1.Q);
            } else {
                v4_1.getClass();
            }
        }
        return;
    }

    public final void onDetachedFromWindow()
    {
        android.view.ViewTreeObserver v0_0 = this.p;
        if (v0_0 != null) {
            this.removeCallbacks(v0_0);
        }
        android.view.ViewTreeObserver v0_3 = 0;
        this.u = 0;
        x3.b v1_2 = this.r;
        int v2 = v1_2.size();
        while (v0_3 < v2) {
            b4.a v3_0 = v1_2.get(v0_3);
            v0_3++;
            b4.a v3_1 = ((b4.b) v3_0);
            android.view.ViewGroup v4 = q3.k.d(this);
            if (v4 != null) {
                v4.getOverlay().remove(v3_1);
                v4.removeOnLayoutChangeListener(v3_1.Q);
            }
        }
        this.getViewTreeObserver().removeOnScrollChangedListener(this.X0);
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.Y0);
        super.onDetachedFromWindow();
        return;
    }

    public final void onDraw(android.graphics.Canvas p19)
    {
        float v0_0 = this;
        if (this.C0) {
            this.N();
            this.F();
        }
        void v18_1 = super.onDraw(p19);
        float v8 = this.c();
        android.graphics.RectF v9_1 = this.A0;
        int v10_0 = this.m();
        float v11 = ((float) v8);
        int v12_1 = 1073741824;
        android.graphics.Canvas v1_14 = (((float) this.J) / 1073741824);
        float v3_0 = (v11 - v1_14);
        android.graphics.Paint v4_7 = (v1_14 + v11);
        int v13 = 0;
        float[] v14_0 = ((float) v9_1);
        float v6_2 = this.K0;
        this.e(((float) (this.K - this.getTrackCornerSize())), (((v10_0[0] * v14_0) + ((float) this.K)) - ((float) this.O)), v3_0, v4_7, p19, v6_2, 2);
        android.graphics.Canvas v1_23 = this.K;
        float v6_6 = this.L0;
        android.graphics.RectF v9_0 = v6_2;
        android.graphics.Paint v7_1 = 3;
        int v10_2 = 1;
        this.e((((v10_0[1] * v14_0) + ((float) v1_23)) + ((float) this.O)), ((float) (this.getTrackCornerSize() + (v1_23 + v9_1))), v3_0, v4_7, p19, v6_6, 3);
        android.graphics.Canvas v1_32 = this.A0;
        float[] v14_1 = this.m();
        float v2_72 = ((float) this.K);
        android.graphics.Canvas v1_33 = ((float) v1_32);
        float v3_26 = ((v14_1[1] * v1_33) + v2_72);
        android.graphics.Paint v4_3 = ((v14_1[0] * v1_33) + v2_72);
        float v2_18 = 2;
        v3.k v5_0 = v3_26;
        float v3_27 = this.J0;
        if (v4_3 < v3_26) {
            if ((this.s0.size() != 1) || (this.U)) {
                v7_1 = 4;
            } else {
                if ((!this.r()) && (!this.s())) {
                    v7_1 = 2;
                }
            }
            int v15_0 = 0;
            while (v15_0 < this.s0.size()) {
                if (this.s0.size() > v10_2) {
                    if (v15_0 <= 0) {
                        v5_0 = v4_3;
                    } else {
                        v5_0 = this.P(((Float) this.s0.get((v15_0 - 1))).floatValue());
                    }
                    android.graphics.Canvas v1_10 = this.P(((Float) this.s0.get(v15_0)).floatValue());
                    if ((!this.r()) && (!this.s())) {
                        v4_3 = v5_0;
                        v5_0 = v1_10;
                    } else {
                        v4_3 = v1_10;
                    }
                }
                float v2_1;
                float v2_11;
                android.graphics.Canvas v1_13 = this.getTrackCornerSize();
                int v16_0 = v12_1;
                int v12_0 = u.e.c(v7_1);
                if (v12_0 == v10_2) {
                    v4_3 -= ((float) v1_13);
                    v2_1 = this.O;
                    v2_11 = ((float) v2_1);
                    v5_0 -= v2_11;
                } else {
                    if (v12_0 == v2_18) {
                        v4_3 += ((float) this.O);
                        v5_0 += ((float) v1_13);
                    } else {
                        if (v12_0 == 3) {
                            if (this.U) {
                                if (v14_1[v10_2] != 1056964608) {
                                    if (v14_1[0] == 1056964608) {
                                        v2_1 = this.O;
                                    }
                                } else {
                                    v4_3 += ((float) this.O);
                                }
                            } else {
                                v2_11 = ((float) this.O);
                                v4_3 += v2_11;
                            }
                        }
                    }
                }
                int v12_3 = v4_3;
                float v2_15 = v5_0;
                v3.k v5_3;
                int v10_1;
                android.graphics.Paint v7_0;
                int v17_0;
                if (v12_3 < v2_15) {
                    android.graphics.Paint v4_8 = (((float) this.J) / v16_0);
                    v3_27.set(v12_3, (v11 - v4_8), v2_15, (v4_8 + v11));
                    v7_0 = v2_15;
                    v5_3 = v7_1;
                    v17_0 = v10_2;
                    v10_1 = 2;
                    v0_0.H(p19, v0_0.b, v3_27, ((float) v1_13), v5_3);
                } else {
                    v3_27.setEmpty();
                    v5_3 = v7_1;
                    v17_0 = v10_2;
                    v10_1 = 2;
                    v7_0 = v2_15;
                }
                v15_0++;
                v7_1 = v5_3;
                v5_0 = v7_0;
                v2_18 = v10_1;
                v4_3 = v12_3;
                v12_1 = v16_0;
                v10_2 = v17_0;
            }
        } else {
            v3_27.setEmpty();
        }
        android.graphics.Canvas v1_18 = p19;
        int v17_1 = v10_2;
        int v16_1 = v12_1;
        int v10_3 = v2_18;
        if ((!this.r()) && (!this.s())) {
            this.i(p19, v3_27, v6_6);
        } else {
            this.i(p19, v3_27, v9_0);
        }
        float v2_22 = this.w0;
        if ((v2_22 != 0) && (v2_22.length != 0)) {
            float v2_24 = this.m();
            float v3_4 = ((int) Math.ceil(((double) (((((float) this.w0.length) / v16_1) - 1065353216) * v2_24[0]))));
            float v2_27 = ((int) Math.floor(((double) (((((float) this.w0.length) / v16_1) - 1065353216) * v2_24[v17_1]))));
            android.graphics.Paint v4_25 = this.e;
            if (v3_4 > 0) {
                this.h(0, (v3_4 * 2), p19, v4_25);
            }
            if (v3_4 <= v2_27) {
                v0_0.h((v3_4 * v10_3), ((v2_27 + 1) * v10_3), p19, v0_0.f);
            }
            float v2_30 = ((v2_27 + 1) * v10_3);
            float v3_6 = this.w0;
            if (v2_30 < v3_6.length) {
                this.h(v2_30, v3_6.length, p19, v4_25);
            }
        }
        if ((this.R > 0) && (!this.s0.isEmpty())) {
            float v2_34 = this.s0;
            float v3_10 = this.r0;
            if (((Float) v2_34.get((v2_34.size() - 1))).floatValue() < v3_10) {
                this.f(p19, this.P(v3_10), v11);
            }
            if ((this.U) || ((this.s0.size() > v17_1) && (((Float) this.s0.get(0)).floatValue() > this.q0))) {
                this.f(p19, this.P(this.q0), v11);
            }
        }
        if (((!this.p0) && (!this.isFocused())) || ((!this.isEnabled()) || ((this.getBackground() instanceof android.graphics.drawable.RippleDrawable)))) {
            android.graphics.Paint v7_2 = this;
        } else {
            float v6_1 = new float[v10_3];
            v6_1[0] = ((this.v(((Float) this.s0.get(this.u0)).floatValue()) * ((float) this.A0)) + ((float) this.K));
            v6_1[1] = v11;
            if (this.s()) {
                this.Q0.mapPoints(v6_1);
            }
            int v17_3;
            if (android.os.Build$VERSION.SDK_INT >= 28) {
                v7_2 = this;
                v17_3 = 1;
            } else {
                float v2_61 = v6_1[0];
                float v3_19 = ((float) this.N);
                v17_3 = 1;
                android.graphics.Paint v4_33 = v6_1[1];
                v7_2 = this;
                p19.clipRect((v2_61 - v3_19), (v4_33 - v3_19), (v2_61 + v3_19), (v4_33 + v3_19), android.graphics.Region$Op.UNION);
                v1_18 = p19;
            }
            v1_18.drawCircle(v6_1[0], v6_1[v17_3], ((float) v7_2.N), v7_2.d);
        }
        v7_2.D();
        float v2_64 = v7_2.A0;
        while (v13 < v7_2.s0.size()) {
            float v3_23;
            android.graphics.Paint v4_36 = ((Float) v7_2.s0.get(v13)).floatValue();
            v3.k v5_17 = v7_2.S0;
            if (v5_17 == null) {
                float v0_8 = v7_2;
                v3_23 = v8;
                if (v13 >= v0_8.T0.size()) {
                    if (!v0_8.isEnabled()) {
                        p19.drawCircle(((v0_8.v(v4_36) * ((float) v2_64)) + ((float) v0_8.K)), v11, ((float) v0_8.getThumbRadius()), v0_8.c);
                    }
                    v0_8.g(p19, v2_64, v3_23, v4_36, v0_8.R0);
                } else {
                    v0_8.g(p19, v2_64, v3_23, v4_36, ((android.graphics.drawable.Drawable) v0_8.T0.get(v13)));
                }
            } else {
                v3_23 = v8;
                v7_2.g(v1_18, v2_64, v3_23, v4_36, v5_17);
            }
            v13++;
            v7_2 = v18_1;
            v1_18 = p19;
            v8 = v3_23;
        }
        return;
    }

    public final void onFocusChanged(boolean p3, int p4, android.graphics.Rect p5)
    {
        super.onFocusChanged(p3, p4, p5);
        x3.c v5_1 = this.n;
        if (p3 != 0) {
            if (p4 == 1) {
                this.t(2147483647);
            } else {
                if (p4 == 2) {
                    this.t(-2147483648);
                } else {
                    if (p4 == 17) {
                        this.u(2147483647);
                    } else {
                        if (p4 == 66) {
                            this.u(-2147483648);
                        }
                    }
                }
            }
            v5_1.w(this.u0);
            return;
        } else {
            this.t0 = -1;
            v5_1.j(this.u0);
            return;
        }
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p2)
    {
        super.onInitializeAccessibilityNodeInfo(p2);
        p2.setVisibleToUser(0);
        return;
    }

    public final boolean onKeyDown(int p14, android.view.KeyEvent p15)
    {
        if (this.isEnabled()) {
            if (this.s0.size() == 1) {
                this.t0 = 0;
            }
            Float v3 = 0;
            if (this.t0 != -1) {
                float v0_8 = (this.B0 | p15.isLongPress());
                this.B0 = v0_8;
                float v10_1 = 1065353216;
                if (v0_8 == 0) {
                    float v0_9 = this.v0;
                    if (v0_9 != 0) {
                        v10_1 = v0_9;
                    }
                } else {
                    float v0_11 = this.v0;
                    if (v0_11 != 0) {
                        v10_1 = v0_11;
                    }
                    float v0_14 = ((this.r0 - this.q0) / v10_1);
                    if (v0_14 > ((float) 20)) {
                        v10_1 *= ((float) Math.round((v0_14 / ((float) 20))));
                    }
                }
                if (p14 == 69) {
                    v3 = Float.valueOf((- v10_1));
                } else {
                    if ((p14 == 70) || (p14 == 81)) {
                        v3 = Float.valueOf(v10_1);
                    } else {
                        switch (p14) {
                            case 19:
                                if (this.s()) {
                                    v3 = Float.valueOf(v10_1);
                                }
                                break;
                            case 20:
                                if (this.s()) {
                                    v3 = Float.valueOf((- v10_1));
                                }
                                break;
                            case 21:
                                if (!this.r()) {
                                    v10_1 = (- v10_1);
                                }
                                v3 = Float.valueOf(v10_1);
                                break;
                            case 22:
                                if (this.r()) {
                                    v10_1 = (- v10_1);
                                }
                                v3 = Float.valueOf(v10_1);
                                break;
                            default:
                        }
                    }
                }
                if (v3 == null) {
                    if (p14 != 23) {
                        if (p14 == 61) {
                            if (!p15.hasNoModifiers()) {
                                if (!p15.isShiftPressed()) {
                                    return 0;
                                } else {
                                    return this.t(-1);
                                }
                            } else {
                                return this.t(1);
                            }
                        } else {
                            if (p14 != 66) {
                                return super.onKeyDown(p14, p15);
                            }
                        }
                    }
                    this.t0 = -1;
                    this.postInvalidate();
                    return 1;
                } else {
                    if (this.z(this.t0, (v3.floatValue() + ((Float) this.s0.get(this.t0)).floatValue()))) {
                        this.C();
                        this.postInvalidate();
                    }
                    return 1;
                }
            } else {
                if (p14 == 61) {
                    if (!p15.hasNoModifiers()) {
                        if (!p15.isShiftPressed()) {
                            v3 = Boolean.FALSE;
                        } else {
                            v3 = Boolean.valueOf(this.t(-1));
                        }
                    } else {
                        v3 = Boolean.valueOf(this.t(1));
                    }
                } else {
                    if (p14 != 66) {
                        if (p14 != 81) {
                            if (p14 == 69) {
                                this.t(-1);
                                v3 = Boolean.TRUE;
                                if (v3 == null) {
                                    return super.onKeyDown(p14, p15);
                                } else {
                                    return v3.booleanValue();
                                }
                            } else {
                                if (p14 != 70) {
                                    switch (p14) {
                                        case 21:
                                            this.u(-1);
                                            v3 = Boolean.TRUE;
                                        case 22:
                                            this.u(1);
                                            v3 = Boolean.TRUE;
                                            break;
                                        case 23:
                                            break;
                                        default:
                                    }
                                    this.t0 = this.u0;
                                    this.postInvalidate();
                                    v3 = Boolean.TRUE;
                                }
                            }
                        }
                        this.t(1);
                        v3 = Boolean.TRUE;
                    }
                }
            }
        } else {
            return super.onKeyDown(p14, p15);
        }
    }

    public final boolean onKeyUp(int p2, android.view.KeyEvent p3)
    {
        this.B0 = 0;
        return super.onKeyUp(p2, p3);
    }

    public final void onMeasure(int p4, int p5)
    {
        int v0_0 = this.I;
        int v2 = 0;
        if ((v0_0 == 1) || (v0_0 == 3)) {
            v2 = ((b4.b) this.r.get(0)).getIntrinsicHeight();
        }
        int v0_3 = android.view.View$MeasureSpec.makeMeasureSpec((this.H + v2), 1073741824);
        if (!this.s()) {
            super.onMeasure(p4, v0_3);
            return;
        } else {
            super.onMeasure(v0_3, p5);
            return;
        }
    }

    public final void onRestoreInstanceState(android.os.Parcelable p2)
    {
        super.onRestoreInstanceState(((x3.d) p2).getSuperState());
        this.q0 = ((x3.d) p2).a;
        this.r0 = ((x3.d) p2).b;
        this.y(((x3.d) p2).c);
        this.v0 = ((x3.d) p2).d;
        if (((x3.d) p2).e) {
            this.requestFocus();
        }
        return;
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        x3.d v1_1 = new x3.d(super.onSaveInstanceState());
        v1_1.a = this.q0;
        v1_1.b = this.r0;
        v1_1.c = new java.util.ArrayList(this.s0);
        v1_1.d = this.v0;
        v1_1.e = this.hasFocus();
        return v1_1;
    }

    public final void onSizeChanged(int p1, int p2, int p3, int p4)
    {
        if (this.s()) {
            p1 = p2;
        }
        this.A0 = Math.max((p1 - (this.K * 2)), 0);
        this.F();
        this.C();
        return;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p9)
    {
        if (this.isEnabled()) {
            int v0_1;
            if (!this.s()) {
                v0_1 = p9.getX();
            } else {
                v0_1 = p9.getY();
            }
            float v2_5;
            if (!this.s()) {
                v2_5 = p9.getY();
            } else {
                v2_5 = p9.getX();
            }
            int v3_4 = ((v0_1 - ((float) this.K)) / ((float) this.A0));
            this.U0 = v3_4;
            int v3_5 = Math.max(0, v3_4);
            this.U0 = v3_5;
            this.U0 = Math.min(1065353216, v3_5);
            int v3_7 = p9.getActionMasked();
            if (v3_7 == 0) {
                this.l0 = v0_1;
                this.m0 = v2_5;
                if (((this.s()) || (!this.q(p9))) && ((!this.s()) || (!this.p(p9)))) {
                    this.getParent().requestDisallowInterceptTouchEvent(1);
                    if (((com.google.android.material.slider.Slider) this).getActiveThumbIndex() == -1) {
                        ((com.google.android.material.slider.Slider) this).setActiveThumbIndex(0);
                    }
                    this.requestFocus();
                    this.p0 = 1;
                    this.E();
                    this.w();
                    this.A();
                    this.C();
                    this.invalidate();
                }
            } else {
                int v6 = this.x;
                if (v3_7 != 1) {
                    if (v3_7 == 2) {
                        if (!this.p0) {
                            if (((this.s()) || ((!this.q(p9)) || (Math.abs((v0_1 - this.l0)) >= ((float) v6)))) && ((!this.s()) || ((!this.p(p9)) || (Math.abs((v2_5 - this.m0)) >= (((float) v6) * 1061997773))))) {
                                this.getParent().requestDisallowInterceptTouchEvent(1);
                                if (((com.google.android.material.slider.Slider) this).getActiveThumbIndex() == -1) {
                                    ((com.google.android.material.slider.Slider) this).setActiveThumbIndex(0);
                                }
                                this.p0 = 1;
                                this.E();
                                this.w();
                            } else {
                                return 0;
                            }
                        }
                        this.A();
                        this.C();
                        this.invalidate();
                        this.setPressed(this.p0);
                        this.n0 = android.view.MotionEvent.obtain(p9);
                        return 1;
                    } else {
                        if (v3_7 != 3) {
                            this.setPressed(this.p0);
                            this.n0 = android.view.MotionEvent.obtain(p9);
                            return 1;
                        }
                    }
                }
                this.p0 = 0;
                int v0_7 = this.n0;
                if ((v0_7 != 0) && (v0_7.getActionMasked() == 0)) {
                    float v2_3 = ((float) v6);
                    if ((Math.abs((this.n0.getX() - p9.getX())) <= v2_3) && (Math.abs((this.n0.getY() - p9.getY())) <= v2_3)) {
                        if (((com.google.android.material.slider.Slider) this).getActiveThumbIndex() == -1) {
                            ((com.google.android.material.slider.Slider) this).setActiveThumbIndex(0);
                        }
                        this.w();
                    }
                }
                if (this.t0 != -1) {
                    this.A();
                    this.C();
                    if (this.O > 0) {
                        int v0_23 = this.P;
                        if ((v0_23 != -1) && (this.Q != -1)) {
                            this.setThumbWidth(v0_23);
                            this.setThumbTrackGapSize(this.Q);
                        }
                    }
                    this.t0 = -1;
                    int v0_26 = this.t.iterator();
                    if (v0_26.hasNext()) {
                        throw v1.a.e(v0_26);
                    }
                }
                this.invalidate();
            }
            this.setPressed(this.p0);
            this.n0 = android.view.MotionEvent.obtain(p9);
            return 1;
        }
        return 0;
    }

    public final void onVisibilityAggregated(boolean p1)
    {
        super.onVisibilityAggregated(p1);
        this.a1 = p1;
        return;
    }

    public final void onVisibilityChanged(android.view.View p4, int p5)
    {
        super.onVisibilityChanged(p4, p5);
        if (p5 != null) {
            android.view.ViewOverlay v4_2;
            android.view.ViewOverlay v4_1 = q3.k.d(this);
            if (v4_1 != null) {
                v4_2 = v4_1.getOverlay();
            } else {
                v4_2 = 0;
            }
            if (v4_2 != null) {
                java.util.ArrayList v5_1 = this.r;
                int v0 = v5_1.size();
                int v1 = 0;
                while (v1 < v0) {
                    b4.b v2_0 = v5_1.get(v1);
                    v1++;
                    v4_2.remove(((b4.b) v2_0));
                }
            }
        }
        return;
    }

    public final boolean p(android.view.MotionEvent p5)
    {
        if (p5.getToolType(0) != 3) {
            android.view.ViewParent v5_2 = this.getParent();
            while ((v5_2 instanceof android.view.ViewGroup)) {
                boolean v1_0 = ((android.view.ViewGroup) v5_2);
                if (((!v1_0.canScrollHorizontally(1)) && (!v1_0.canScrollHorizontally(-1))) || (!v1_0.shouldDelayChildPressedState())) {
                    v5_2 = v5_2.getParent();
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final boolean q(android.view.MotionEvent p5)
    {
        if (p5.getToolType(0) != 3) {
            android.view.ViewParent v5_2 = this.getParent();
            while ((v5_2 instanceof android.view.ViewGroup)) {
                boolean v1_0 = ((android.view.ViewGroup) v5_2);
                if (((!v1_0.canScrollVertically(1)) && (!v1_0.canScrollVertically(-1))) || (!v1_0.shouldDelayChildPressedState())) {
                    v5_2 = v5_2.getParent();
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final boolean r()
    {
        if (this.getLayoutDirection() != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean s()
    {
        if (this.F != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public void setActiveThumbIndex(int p1)
    {
        this.t0 = p1;
        return;
    }

    public abstract void setCentered();

    public varargs void setCustomThumbDrawablesForValues(int[] p5)
    {
        android.graphics.drawable.Drawable[] v0_1 = new android.graphics.drawable.Drawable[p5.length];
        int v1 = 0;
        while (v1 < p5.length) {
            v0_1[v1] = this.getResources().getDrawable(p5[v1]);
            v1++;
        }
        this.setCustomThumbDrawablesForValues(v0_1);
        return;
    }

    public varargs void setCustomThumbDrawablesForValues(android.graphics.drawable.Drawable[] p5)
    {
        this.S0 = 0;
        this.T0 = new java.util.ArrayList();
        int v0_3 = p5.length;
        int v1 = 0;
        while (v1 < v0_3) {
            java.util.List v3 = this.T0;
            android.graphics.drawable.Drawable v2_3 = p5[v1].mutate().getConstantState().newDrawable();
            this.a(v2_3);
            v3.add(v2_3);
            v1++;
        }
        this.postInvalidate();
        return;
    }

    public void setEnabled(boolean p2)
    {
        int v2_1;
        super.setEnabled(p2);
        if (p2 == 0) {
            v2_1 = 2;
        } else {
            v2_1 = 0;
        }
        this.setLayerType(v2_1, 0);
        return;
    }

    public abstract void setHaloRadius();

    public abstract void setHaloTintList();

    public abstract void setLabelBehavior();

    public abstract void setOrientation();

    public void setSeparationUnit(int p1)
    {
        this.V0 = p1;
        this.C0 = 1;
        this.postInvalidate();
        return;
    }

    public abstract void setThumbElevation();

    public abstract void setThumbHeight();

    public abstract void setThumbStrokeColor();

    public abstract void setThumbStrokeWidth();

    public abstract void setThumbTrackGapSize();

    public abstract void setThumbWidth();

    public abstract void setTickActiveRadius();

    public abstract void setTickActiveTintList();

    public abstract void setTickInactiveRadius();

    public abstract void setTickInactiveTintList();

    public abstract void setTrackActiveTintList();

    public abstract void setTrackCornerSize();

    public abstract void setTrackHeight();

    public abstract void setTrackIconActiveColor();

    public abstract void setTrackIconActiveEnd();

    public abstract void setTrackIconActiveStart();

    public abstract void setTrackIconInactiveColor();

    public abstract void setTrackIconInactiveEnd();

    public abstract void setTrackIconInactiveStart();

    public abstract void setTrackIconSize();

    public abstract void setTrackInactiveTintList();

    public abstract void setTrackInsideCornerSize();

    public abstract void setTrackStopIndicatorSize();

    public void setValues(java.util.List p2)
    {
        this.y(new java.util.ArrayList(p2));
        return;
    }

    public varargs void setValues(Float[] p2)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Collections.addAll(v0_1, p2);
        this.y(v0_1);
        return;
    }

    public final boolean t(int p9)
    {
        int v0_0 = this.u0;
        int v1_1 = (((long) v0_0) + ((long) p9));
        long v4 = ((long) (this.s0.size() - 1));
        if (v1_1 >= 0) {
            if (v1_1 > v4) {
                v1_1 = v4;
            }
        } else {
            v1_1 = 0;
        }
        int v9_3 = ((int) v1_1);
        this.u0 = v9_3;
        if (v9_3 != v0_0) {
            if (this.t0 != -1) {
                this.t0 = v9_3;
            }
            this.C();
            this.postInvalidate();
            return 1;
        } else {
            return 0;
        }
    }

    public final void u(int p2)
    {
        if ((this.r()) || (this.s())) {
            if (p2 != -2147483648) {
                p2 = (- p2);
            } else {
                p2 = 2147483647;
            }
        }
        this.t(p2);
        return;
    }

    public final float v(float p3)
    {
        float v0_0 = this.q0;
        float v3_2 = ((p3 - v0_0) / (this.r0 - v0_0));
        if ((!this.r()) && (!this.s())) {
            return v3_2;
        } else {
            return (1065353216 - v3_2);
        }
    }

    public final void w()
    {
        ClassCastException v0_1 = this.t.iterator();
        if (v0_1.hasNext()) {
            throw v1.a.e(v0_1);
        } else {
            return;
        }
    }

    public final void x(b4.b p5, float p6)
    {
        android.graphics.Matrix v0_0 = this.l(p6);
        if (!android.text.TextUtils.equals(p5.M, v0_0)) {
            p5.M = v0_0;
            p5.P.d = 1;
            p5.invalidateSelf();
        }
        int v2_7;
        int v1_4;
        int v2_3;
        android.graphics.Matrix v0_4;
        android.view.ViewOverlay v6_7;
        if (!this.s()) {
            v0_4 = ((this.K + ((int) (this.v(p6) * ((float) this.A0)))) - (p5.getIntrinsicWidth() / 2));
            v6_7 = (p5.getIntrinsicWidth() + v0_4);
            v1_4 = (this.c() - ((this.M / 2) + this.k0));
            v2_3 = p5.getIntrinsicHeight();
            v2_7 = (v1_4 - v2_3);
        } else {
            v0_4 = ((this.K + ((int) (this.v(p6) * ((float) this.A0)))) - (p5.getIntrinsicHeight() / 2));
            v6_7 = (p5.getIntrinsicHeight() + v0_4);
            if (!this.r()) {
                v2_7 = (((this.M / 2) + this.k0) + this.c());
                v1_4 = (p5.getIntrinsicWidth() + v2_7);
            } else {
                v1_4 = (this.c() - ((this.M / 2) + this.k0));
                v2_3 = p5.getIntrinsicWidth();
            }
        }
        android.graphics.Rect v3_3 = this.N0;
        v3_3.set(v0_4, v2_7, v6_7, v1_4);
        if (this.s()) {
            android.view.ViewOverlay v6_16 = new android.graphics.RectF(v3_3);
            this.Q0.mapRect(v6_16);
            v6_16.round(v3_3);
        }
        android.view.ViewOverlay v6_19;
        q3.c.b(q3.k.d(this), this, v3_3);
        p5.setBounds(v3_3);
        android.view.ViewOverlay v6_18 = q3.k.d(this);
        if (v6_18 != null) {
            v6_19 = v6_18.getOverlay();
        } else {
            v6_19 = 0;
        }
        if (v6_19 != null) {
            v6_19.add(p5);
            return;
        } else {
            return;
        }
    }

    public final void y(java.util.ArrayList p11)
    {
        if (p11.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        } else {
            java.util.Collections.sort(p11);
            if ((this.s0.size() != p11.size()) || (!this.s0.equals(p11))) {
                this.s0 = p11;
                java.util.ArrayList v11_1 = 1;
                this.C0 = 1;
                this.u0 = 0;
                this.C();
                int v1_1 = this.r;
                if (v1_1.size() > this.s0.size()) {
                    android.view.ViewGroup v2_6 = v1_1.subList(this.s0.size(), v1_1.size());
                    b4.a v3_4 = v2_6.iterator();
                    while (v3_4.hasNext()) {
                        android.graphics.Rect v4_8 = ((b4.b) v3_4.next());
                        if (this.isAttachedToWindow()) {
                            int v5_32 = q3.k.d(this);
                            if (v5_32 != 0) {
                                v5_32.getOverlay().remove(v4_8);
                                v5_32.removeOnLayoutChangeListener(v4_8.Q);
                            }
                        }
                    }
                    v2_6.clear();
                }
                while (v1_1.size() < this.s0.size()) {
                    int v8_5 = this.q;
                    b4.a v3_11 = new b4.b(this.getContext(), v8_5);
                    int[] v9 = new int[0];
                    android.view.ViewGroup v2_0 = q3.k.f(v3_11.N, 0, c3.a.H, 0, v8_5, v9);
                    android.graphics.Rect v4_0 = v3_11.N;
                    v3_11.X = v4_0.getResources().getDimensionPixelSize(2131166208);
                    int v5_4 = v2_0.getBoolean(8, 1);
                    v3_11.W = v5_4;
                    if (v5_4 == 0) {
                        v3_11.X = 0;
                    } else {
                        int v5_7 = v3_11.b.a.f();
                        v5_7.k = v3_11.x();
                        v3_11.setShapeAppearanceModel(v5_7.a());
                    }
                    int v5_10 = v2_0.getText(6);
                    int v7_1 = v3_11.P;
                    if (!android.text.TextUtils.equals(v3_11.M, v5_10)) {
                        v3_11.M = v5_10;
                        v7_1.d = 1;
                        v3_11.invalidateSelf();
                    }
                    int v6_4;
                    if (!v2_0.hasValue(0)) {
                        v6_4 = 0;
                    } else {
                        int v5_12 = v2_0.getResourceId(0, 0);
                        if (v5_12 == 0) {
                        } else {
                            v6_4 = new s3.d(v4_0, v5_12);
                        }
                    }
                    if ((v6_4 != 0) && (v2_0.hasValue(1))) {
                        v6_4.k = j5.t1.v(v4_0, v2_0, 1);
                    }
                    int v5_17;
                    v7_1.b(v6_4, v4_0);
                    int v5_16 = c4.b.W(v4_0, 2130968852, b4.b.getCanonicalName());
                    int v7_3 = v5_16.resourceId;
                    if (v7_3 == 0) {
                        v5_17 = v5_16.data;
                    } else {
                        v5_17 = e0.c.getColor(v4_0, v7_3);
                    }
                    int v7_6;
                    int v7_5 = c4.b.W(v4_0, 16842801, b4.b.getCanonicalName());
                    int v8_1 = v7_5.resourceId;
                    if (v8_1 == 0) {
                        v7_6 = v7_5.data;
                    } else {
                        v7_6 = e0.c.getColor(v4_0, v8_1);
                    }
                    android.graphics.Rect v4_1;
                    v3_11.o(android.content.res.ColorStateList.valueOf(v2_0.getColor(7, h0.a.e(h0.a.h(v5_17, 153), h0.a.h(v7_6, 229)))));
                    int v5_23 = c4.b.W(v4_0, 2130968890, b4.b.getCanonicalName());
                    int v6_8 = v5_23.resourceId;
                    if (v6_8 == 0) {
                        v4_1 = v5_23.data;
                    } else {
                        v4_1 = e0.c.getColor(v4_0, v6_8);
                    }
                    v3_11.r(android.content.res.ColorStateList.valueOf(v4_1));
                    v3_11.S = v2_0.getDimensionPixelSize(2, 0);
                    v3_11.T = v2_0.getDimensionPixelSize(4, 0);
                    v3_11.U = v2_0.getDimensionPixelSize(5, 0);
                    v3_11.V = v2_0.getDimensionPixelSize(3, 0);
                    v2_0.recycle();
                    v1_1.add(v3_11);
                    if (this.isAttachedToWindow()) {
                        android.view.ViewGroup v2_2 = q3.k.d(this);
                        if (v2_2 != null) {
                            android.graphics.Rect v4_4 = new int[2];
                            v2_2.getLocationOnScreen(v4_4);
                            v3_11.Y = v4_4[0];
                            v2_2.getWindowVisibleDisplayFrame(v3_11.R);
                            v2_2.addOnLayoutChangeListener(v3_11.Q);
                        }
                    }
                }
                if (v1_1.size() == 1) {
                    v11_1 = 0;
                }
                android.view.ViewGroup v2_9 = v1_1.size();
                b4.a v3_7 = 0;
                while (v3_7 < v2_9) {
                    android.graphics.Rect v4_12 = v1_1.get(v3_7);
                    v3_7++;
                    android.graphics.Rect v4_13 = ((b4.b) v4_12);
                    v4_13.b.k = ((float) v11_1);
                    v4_13.invalidateSelf();
                }
                java.util.ArrayList v11_4 = this.s;
                int v1_2 = v11_4.size();
                android.view.ViewGroup v2_10 = 0;
                while (v2_10 < v1_2) {
                    b4.a v3_8 = v11_4.get(v2_10);
                    v2_10++;
                    b4.a v3_9 = ((x3.g) v3_8);
                    android.graphics.Rect v4_11 = this.s0;
                    int v5_33 = v4_11.size();
                    int v6_10 = 0;
                    while (v6_10 < v5_33) {
                        int v7_9 = v4_11.get(v6_10);
                        v6_10++;
                        int v7_11 = ((Float) v7_9).floatValue();
                        v3_9.getClass();
                        v3_9.a(v7_11);
                    }
                }
                this.postInvalidate();
                return;
            } else {
                return;
            }
        }
    }

    public final boolean z(int p6, float p7)
    {
        this.u0 = p6;
        long v1_0 = 0;
        if (((double) Math.abs((p7 - ((Float) this.s0.get(p6)).floatValue()))) >= 4547007122018943789) {
            com.google.android.material.datepicker.g v0_3 = this.getMinSeparation();
            if (this.V0 == 0) {
                if (v0_3 != 0) {
                    v0_3 = g2.g.b(this.q0, this.r0, ((v0_3 - ((float) this.K)) / ((float) this.A0)), this.q0);
                } else {
                    v0_3 = 0;
                }
            }
            if ((this.r()) || (this.s())) {
                v0_3 = (- v0_3);
            }
            x3.g v2_14;
            x3.g v2_10 = (p6 + 1);
            if (v2_10 < this.s0.size()) {
                v2_14 = (((Float) this.s0.get(v2_10)).floatValue() - v0_3);
            } else {
                v2_14 = this.r0;
            }
            com.google.android.material.datepicker.g v0_9;
            float v3_5 = (p6 - 1);
            if (v3_5 >= 0) {
                v0_9 = (v0_3 + ((Float) this.s0.get(v3_5)).floatValue());
            } else {
                v0_9 = this.q0;
            }
            this.s0.set(p6, Float.valueOf(c4.b.g(p7, v0_9, v2_14)));
            int v7_3 = this.s;
            com.google.android.material.datepicker.g v0_12 = v7_3.size();
            while (v1_0 < v0_12) {
                x3.g v2_15 = v7_3.get(v1_0);
                v1_0++;
                x3.g v2_16 = ((x3.g) v2_15);
                float v3_12 = ((Float) this.s0.get(p6)).floatValue();
                v2_16.getClass();
                v2_16.a(v3_12);
            }
            com.google.android.material.datepicker.g v0_13 = this.o;
            if ((v0_13 != null) && (v0_13.isEnabled())) {
                com.google.android.material.datepicker.g v0_15 = this.p;
                if (v0_15 != null) {
                    this.removeCallbacks(v0_15);
                } else {
                    this.p = new com.google.android.material.datepicker.g(this);
                }
                com.google.android.material.datepicker.g v0_18 = this.p;
                v0_18.b = p6;
                this.postDelayed(v0_18, 200);
            }
            return 1;
        } else {
            return 0;
        }
    }
}
