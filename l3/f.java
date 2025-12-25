package l3;
public final class f extends v3.k implements android.graphics.drawable.Drawable$Callback, q3.h {
    public static final int[] U0;
    public static final android.graphics.drawable.ShapeDrawable V0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public int H0;
    public int I0;
    public android.graphics.ColorFilter J0;
    public android.graphics.PorterDuffColorFilter K0;
    public android.content.res.ColorStateList L0;
    public android.content.res.ColorStateList M;
    public android.graphics.PorterDuff$Mode M0;
    public android.content.res.ColorStateList N;
    public int[] N0;
    public float O;
    public android.content.res.ColorStateList O0;
    public float P;
    public ref.WeakReference P0;
    public android.content.res.ColorStateList Q;
    public android.text.TextUtils$TruncateAt Q0;
    public float R;
    public boolean R0;
    public android.content.res.ColorStateList S;
    public int S0;
    public CharSequence T;
    public boolean T0;
    public boolean U;
    public android.graphics.drawable.Drawable V;
    public android.content.res.ColorStateList W;
    public float X;
    public boolean Y;
    public boolean Z;
    public android.graphics.drawable.Drawable a0;
    public android.graphics.drawable.RippleDrawable b0;
    public android.content.res.ColorStateList c0;
    public float d0;
    public android.text.SpannableStringBuilder e0;
    public boolean f0;
    public boolean g0;
    public android.graphics.drawable.Drawable h0;
    public android.content.res.ColorStateList i0;
    public d3.b j0;
    public d3.b k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public final android.content.Context t0;
    public final android.graphics.Paint u0;
    public final android.graphics.Paint$FontMetrics v0;
    public final android.graphics.RectF w0;
    public final android.graphics.PointF x0;
    public final android.graphics.Path y0;
    public final q3.i z0;

    static f()
    {
        l3.f.U0 = new int[] {16842910});
        l3.f.V0 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        return;
    }

    public f(android.content.Context p3, android.util.AttributeSet p4)
    {
        super(p3, p4, 2130968800, 2132018373);
        super.P = -1082130432;
        super.u0 = new android.graphics.Paint(1);
        super.v0 = new android.graphics.Paint$FontMetrics();
        super.w0 = new android.graphics.RectF();
        super.x0 = new android.graphics.PointF();
        super.y0 = new android.graphics.Path();
        super.I0 = 255;
        super.M0 = android.graphics.PorterDuff$Mode.SRC_IN;
        super.P0 = new ref.WeakReference(0);
        super.l(p3);
        super.t0 = p3;
        int v4_14 = new q3.i(super);
        super.z0 = v4_14;
        super.T = "";
        v4_14.a.density = p3.getResources().getDisplayMetrics().density;
        android.graphics.drawable.ShapeDrawable v3_4 = l3.f.U0;
        super.setState(v3_4);
        super.U(v3_4);
        super.R0 = 1;
        l3.f.V0.setTint(-1);
        return;
    }

    public static boolean B(android.content.res.ColorStateList p0)
    {
        if ((p0 == 0) || (!p0.isStateful())) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean C(android.graphics.drawable.Drawable p0)
    {
        if ((p0 == 0) || (!p0.isStateful())) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void d0(android.graphics.drawable.Drawable p1)
    {
        if (p1 != null) {
            p1.setCallback(0);
        }
        return;
    }

    public final float A()
    {
        if (!this.T0) {
            return this.P;
        } else {
            float v0_4 = this.H;
            if (v0_4 == 0) {
                return this.b.a.e.a(this.h());
            } else {
                return v0_4[3];
            }
        }
    }

    public final void D()
    {
        com.google.android.material.chip.Chip v0_2 = ((l3.e) this.P0.get());
        if (v0_2 != null) {
            com.google.android.material.chip.Chip v0_3 = ((com.google.android.material.chip.Chip) v0_2);
            v0_3.c(v0_3.v);
            v0_3.requestLayout();
            v0_3.invalidateOutline();
        }
        return;
    }

    public final boolean E(int[] p10, int[] p11)
    {
        int v1_8;
        int[] v0_0 = super.onStateChange(p10);
        int v1_4 = this.M;
        if (v1_4 == 0) {
            v1_8 = 0;
        } else {
            v1_8 = v1_4.getColorForState(p10, this.A0);
        }
        int v1_0 = this.d(v1_8);
        int v4 = 1;
        if (this.A0 != v1_0) {
            this.A0 = v1_0;
            v0_0 = 1;
        }
        int v3_10;
        int v3_6 = this.N;
        if (v3_6 == 0) {
            v3_10 = 0;
        } else {
            v3_10 = v3_6.getColorForState(p10, this.B0);
        }
        int v3_12 = this.d(v3_10);
        if (this.B0 != v3_12) {
            this.B0 = v3_12;
            v0_0 = 1;
        }
        int v3_14;
        int v1_5 = h0.a.e(v3_12, v1_0);
        if (this.C0 == v1_5) {
            v3_14 = 0;
        } else {
            v3_14 = 1;
        }
        android.graphics.PorterDuffColorFilter v5_10;
        if (this.b.d != null) {
            v5_10 = 0;
        } else {
            v5_10 = 1;
        }
        if ((v3_14 | v5_10) != 0) {
            this.C0 = v1_5;
            this.o(android.content.res.ColorStateList.valueOf(v1_5));
            v0_0 = 1;
        }
        int v1_7;
        int v1_6 = this.Q;
        if (v1_6 == 0) {
            v1_7 = 0;
        } else {
            v1_7 = v1_6.getColorForState(p10, this.D0);
        }
        if (this.D0 != v1_7) {
            this.D0 = v1_7;
            v0_0 = 1;
        }
        int v1_11;
        if (this.O0 == null) {
            v1_11 = 0;
        } else {
            int v3_11 = 0;
            android.graphics.PorterDuffColorFilter v5_6 = 0;
            int v6_0 = 0;
            while (v3_11 < p10.length) {
                int v7_0 = p10[v3_11];
                if (v7_0 != 16842910) {
                    if ((v7_0 == 16842908) || ((v7_0 == 16842919) || (v7_0 == 16843623))) {
                        v6_0 = 1;
                    }
                } else {
                    v5_6 = 1;
                }
                v3_11++;
            }
            if ((v5_6 == null) || (v6_0 == 0)) {
            } else {
                v1_11 = this.O0.getColorForState(p10, this.E0);
            }
        }
        if (this.E0 != v1_11) {
            this.E0 = v1_11;
        }
        int v1_16;
        int v1_14 = this.z0.f;
        if (v1_14 == 0) {
            v1_16 = 0;
        } else {
            int v1_15 = v1_14.k;
            if (v1_15 == 0) {
            } else {
                v1_16 = v1_15.getColorForState(p10, this.F0);
            }
        }
        if (this.F0 != v1_16) {
            this.F0 = v1_16;
            v0_0 = 1;
        }
        int v1_1;
        int v1_17 = this.getState();
        if (v1_17 != 0) {
            android.graphics.PorterDuffColorFilter v5_11 = 0;
            while (v5_11 < v1_17.length) {
                if (v1_17[v5_11] != 16842912) {
                    v5_11++;
                } else {
                    if (!this.f0) {
                        break;
                    }
                    v1_1 = 1;
                }
            }
            v1_1 = 0;
        }
        if ((this.G0 == v1_1) || (this.h0 == null)) {
            int v1_2 = 0;
        } else {
            int[] v0_1 = this.y();
            this.G0 = v1_1;
            if (v0_1 == this.y()) {
                v1_2 = 0;
                v0_0 = 1;
            } else {
                v0_0 = 1;
                v1_2 = 1;
            }
        }
        int v3_4;
        int v3_3 = this.L0;
        if (v3_3 == 0) {
            v3_4 = 0;
        } else {
            v3_4 = v3_3.getColorForState(p10, this.H0);
        }
        if (this.H0 == v3_4) {
            v4 = v0_0;
        } else {
            android.graphics.PorterDuffColorFilter v5_4;
            this.H0 = v3_4;
            int[] v0_3 = this.L0;
            int v3_5 = this.M0;
            if ((v0_3 != null) && (v3_5 != 0)) {
                v5_4 = new android.graphics.PorterDuffColorFilter(v0_3.getColorForState(this.getState(), 0), v3_5);
            } else {
                v5_4 = 0;
            }
            this.K0 = v5_4;
        }
        if (l3.f.C(this.V)) {
            v4 |= this.V.setState(p10);
        }
        if (l3.f.C(this.h0)) {
            v4 |= this.h0.setState(p10);
        }
        if (l3.f.C(this.a0)) {
            int[] v0_17 = new int[(p10.length + p11.length)];
            System.arraycopy(p10, 0, v0_17, 0, p10.length);
            System.arraycopy(p11, 0, v0_17, p10.length, p11.length);
            v4 |= this.a0.setState(v0_17);
        }
        if (l3.f.C(this.b0)) {
            v4 |= this.b0.setState(p11);
        }
        if (v4 != 0) {
            this.invalidateSelf();
        }
        if (v1_2 != 0) {
            this.D();
        }
        return v4;
    }

    public final void F(boolean p2)
    {
        if (this.f0 != p2) {
            this.f0 = p2;
            float v0_1 = this.y();
            if ((p2 == 0) && (this.G0)) {
                this.G0 = 0;
            }
            int v2_1 = this.y();
            this.invalidateSelf();
            if (v0_1 != v2_1) {
                this.D();
            }
        }
        return;
    }

    public final void G(android.graphics.drawable.Drawable p3)
    {
        if (this.h0 != p3) {
            float v0_1 = this.y();
            this.h0 = p3;
            float v3_2 = this.y();
            l3.f.d0(this.h0);
            this.w(this.h0);
            this.invalidateSelf();
            if (v0_1 != v3_2) {
                this.D();
            }
        }
        return;
    }

    public final void H(android.content.res.ColorStateList p3)
    {
        if (this.i0 != p3) {
            this.i0 = p3;
            if (this.g0) {
                android.graphics.drawable.Drawable v0_2 = this.h0;
                if ((v0_2 != null) && (this.f0)) {
                    v0_2.setTintList(p3);
                }
            }
            this.onStateChange(this.getState());
        }
        return;
    }

    public final void I(boolean p2)
    {
        if (this.g0 != p2) {
            boolean v0_1 = this.a0();
            this.g0 = p2;
            android.graphics.drawable.Drawable v2_2 = this.a0();
            if (v0_1 != v2_2) {
                if (v2_2 == null) {
                    l3.f.d0(this.h0);
                } else {
                    this.w(this.h0);
                }
                this.invalidateSelf();
                this.D();
            }
        }
        return;
    }

    public final void J(float p3)
    {
        if (this.P != p3) {
            this.P = p3;
            v3.o v0_4 = this.b.a.f();
            v0_4.e = new v3.a(p3);
            v0_4.f = new v3.a(p3);
            v0_4.g = new v3.a(p3);
            v0_4.h = new v3.a(p3);
            this.setShapeAppearanceModel(v0_4.a());
        }
        return;
    }

    public final void K(android.graphics.drawable.Drawable p4)
    {
        android.graphics.drawable.Drawable v0_0 = this.V;
        android.graphics.drawable.Drawable v1 = 0;
        if (v0_0 == null) {
            v0_0 = 0;
        } else {
            if ((v0_0 instanceof i0.a)) {
                v0_0 = 0;
            }
        }
        if (v0_0 != p4) {
            float v2_0 = this.y();
            if (p4 != 0) {
                v1 = p4.mutate();
            }
            this.V = v1;
            float v4_1 = this.y();
            l3.f.d0(v0_0);
            if (this.b0()) {
                this.w(this.V);
            }
            this.invalidateSelf();
            if (v2_0 != v4_1) {
                this.D();
            }
        }
        return;
    }

    public final void L(float p2)
    {
        if (this.X != p2) {
            float v0_2 = this.y();
            this.X = p2;
            float v2_1 = this.y();
            this.invalidateSelf();
            if (v0_2 != v2_1) {
                this.D();
            }
        }
        return;
    }

    public final void M(android.content.res.ColorStateList p2)
    {
        this.Y = 1;
        if (this.W != p2) {
            this.W = p2;
            if (this.b0()) {
                this.V.setTintList(p2);
            }
            this.onStateChange(this.getState());
        }
        return;
    }

    public final void N(boolean p2)
    {
        if (this.U != p2) {
            boolean v0_1 = this.b0();
            this.U = p2;
            android.graphics.drawable.Drawable v2_2 = this.b0();
            if (v0_1 != v2_2) {
                if (v2_2 == null) {
                    l3.f.d0(this.V);
                } else {
                    this.w(this.V);
                }
                this.invalidateSelf();
                this.D();
            }
        }
        return;
    }

    public final void O(android.content.res.ColorStateList p2)
    {
        if (this.Q != p2) {
            this.Q = p2;
            if (this.T0) {
                this.r(p2);
            }
            this.onStateChange(this.getState());
        }
        return;
    }

    public final void P(float p2)
    {
        if (this.R != p2) {
            this.R = p2;
            this.u0.setStrokeWidth(p2);
            if (this.T0) {
                this.b.k = p2;
                this.invalidateSelf();
            }
            this.invalidateSelf();
        }
        return;
    }

    public final void Q(android.graphics.drawable.Drawable p6)
    {
        android.graphics.drawable.Drawable v0_0 = this.a0;
        android.content.res.ColorStateList v1_0 = 0;
        if (v0_0 == null) {
            v0_0 = 0;
        } else {
            if ((v0_0 instanceof i0.a)) {
                v0_0 = 0;
            }
        }
        if (v0_0 != p6) {
            float v2_0 = this.z();
            if (p6 != 0) {
                v1_0 = p6.mutate();
            }
            this.a0 = v1_0;
            this.b0 = new android.graphics.drawable.RippleDrawable(t3.a.a(this.S), this.a0, l3.f.V0);
            float v6_3 = this.z();
            l3.f.d0(v0_0);
            if (this.c0()) {
                this.w(this.a0);
            }
            this.invalidateSelf();
            if (v2_0 != v6_3) {
                this.D();
            }
        }
        return;
    }

    public final void R(float p2)
    {
        if (this.r0 != p2) {
            this.r0 = p2;
            this.invalidateSelf();
            if (this.c0()) {
                this.D();
            }
        }
        return;
    }

    public final void S(float p2)
    {
        if (this.d0 != p2) {
            this.d0 = p2;
            this.invalidateSelf();
            if (this.c0()) {
                this.D();
            }
        }
        return;
    }

    public final void T(float p2)
    {
        if (this.q0 != p2) {
            this.q0 = p2;
            this.invalidateSelf();
            if (this.c0()) {
                this.D();
            }
        }
        return;
    }

    public final boolean U(int[] p2)
    {
        if (!java.util.Arrays.equals(this.N0, p2)) {
            this.N0 = p2;
            if (this.c0()) {
                return this.E(this.getState(), p2);
            }
        }
        return 0;
    }

    public final void V(android.content.res.ColorStateList p2)
    {
        if (this.c0 != p2) {
            this.c0 = p2;
            if (this.c0()) {
                this.a0.setTintList(p2);
            }
            this.onStateChange(this.getState());
        }
        return;
    }

    public final void W(boolean p2)
    {
        if (this.Z != p2) {
            boolean v0_1 = this.c0();
            this.Z = p2;
            android.graphics.drawable.Drawable v2_2 = this.c0();
            if (v0_1 != v2_2) {
                if (v2_2 == null) {
                    l3.f.d0(this.a0);
                } else {
                    this.w(this.a0);
                }
                this.invalidateSelf();
                this.D();
            }
        }
        return;
    }

    public final void X(float p2)
    {
        if (this.n0 != p2) {
            float v0_2 = this.y();
            this.n0 = p2;
            float v2_1 = this.y();
            this.invalidateSelf();
            if (v0_2 != v2_1) {
                this.D();
            }
        }
        return;
    }

    public final void Y(float p2)
    {
        if (this.m0 != p2) {
            float v0_2 = this.y();
            this.m0 = p2;
            float v2_1 = this.y();
            this.invalidateSelf();
            if (v0_2 != v2_1) {
                this.D();
            }
        }
        return;
    }

    public final void Z(android.content.res.ColorStateList p2)
    {
        if (this.S != p2) {
            this.S = p2;
            this.O0 = 0;
            this.onStateChange(this.getState());
        }
        return;
    }

    public final void a()
    {
        this.D();
        this.invalidateSelf();
        return;
    }

    public final boolean a0()
    {
        if ((!this.g0) || ((this.h0 == null) || (!this.G0))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean b0()
    {
        if ((!this.U) || (this.V == null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean c0()
    {
        if ((!this.Z) || (this.a0 == null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void draw(android.graphics.Canvas p23)
    {
        android.graphics.Canvas v0_0 = this;
        android.graphics.Rect v7 = this.getBounds();
        if (!v7.isEmpty()) {
            float v6_8 = this.I0;
            if (v6_8 != 0) {
                android.graphics.Canvas v1_0;
                int v10;
                if (v6_8 >= 255) {
                    v1_0 = p23;
                    v10 = 0;
                } else {
                    v1_0 = p23;
                    v10 = p23.saveLayerAlpha(((float) v7.left), ((float) v7.top), ((float) v7.right), ((float) v7.bottom), v6_8);
                }
                CharSequence v2_14 = this.u0;
                android.graphics.RectF v11 = this.w0;
                if (!this.T0) {
                    v2_14.setColor(this.A0);
                    v2_14.setStyle(android.graphics.Paint$Style.FILL);
                    v11.set(v7);
                    v1_0.drawRoundRect(v11, this.A(), this.A(), v2_14);
                }
                if (!this.T0) {
                    v2_14.setColor(this.B0);
                    v2_14.setStyle(android.graphics.Paint$Style.FILL);
                    float v3_62 = this.J0;
                    if (v3_62 == 0) {
                        v3_62 = this.K0;
                    }
                    v2_14.setColorFilter(v3_62);
                    v11.set(v7);
                    v1_0.drawRoundRect(v11, this.A(), this.A(), v2_14);
                }
                if (this.T0) {
                    super.draw(p23);
                }
                if ((this.R > 0) && (!this.T0)) {
                    v2_14.setColor(this.D0);
                    v2_14.setStyle(android.graphics.Paint$Style.STROKE);
                    if (!this.T0) {
                        float v3_71 = this.J0;
                        if (v3_71 == 0) {
                            v3_71 = this.K0;
                        }
                        v2_14.setColorFilter(v3_71);
                    }
                    android.text.TextUtils$TruncateAt v4_20 = (this.R / 1073741824);
                    v11.set((((float) v7.left) + v4_20), (((float) v7.top) + v4_20), (((float) v7.right) - v4_20), (((float) v7.bottom) - v4_20));
                    v1_0.drawRoundRect(v11, (this.P - (this.R / 1073741824)), (this.P - (this.R / 1073741824)), v2_14);
                }
                int v21;
                v2_14.setColor(this.E0);
                v2_14.setStyle(android.graphics.Paint$Style.FILL);
                v11.set(v7);
                if (this.T0) {
                    android.text.TextUtils$TruncateAt v4_0 = this.b;
                    v21 = 1073741824;
                    android.graphics.Path v20 = this.y0;
                    this.y.a(v4_0.a, this.H, v4_0.j, new android.graphics.RectF(v7), this.x, v20);
                    v0_0.f(v1_0, v2_14, v20, v0_0.b.a, v0_0.H, this.h());
                } else {
                    v1_0.drawRoundRect(v11, this.A(), this.A(), v2_14);
                    v21 = 1073741824;
                }
                if (this.b0()) {
                    this.x(v7, v11);
                    android.graphics.Canvas v0_2 = v11.left;
                    CharSequence v2_0 = v11.top;
                    v1_0.translate(v0_2, v2_0);
                    this.V.setBounds(0, 0, ((int) v11.width()), ((int) v11.height()));
                    this.V.draw(v1_0);
                    v1_0.translate((- v0_2), (- v2_0));
                }
                if (this.a0()) {
                    this.x(v7, v11);
                    android.graphics.Canvas v0_5 = v11.left;
                    CharSequence v2_3 = v11.top;
                    v1_0.translate(v0_5, v2_3);
                    this.h0.setBounds(0, 0, ((int) v11.width()), ((int) v11.height()));
                    this.h0.draw(v1_0);
                    v1_0.translate((- v0_5), (- v2_3));
                }
                if ((this.R0) && (this.T != null)) {
                    android.graphics.Canvas v0_9 = this.x0;
                    v0_9.set(0, 0);
                    CharSequence v2_5 = android.graphics.Paint$Align.LEFT;
                    android.text.TextUtils$TruncateAt v4_10 = this.z0;
                    if (this.T != null) {
                        float v5_8 = ((this.y() + this.l0) + this.o0);
                        if (this.getLayoutDirection() != 0) {
                            v0_9.x = (((float) v7.right) - v5_8);
                            v2_5 = android.graphics.Paint$Align.RIGHT;
                        } else {
                            v0_9.x = (((float) v7.left) + v5_8);
                        }
                        float v3_18 = ((float) v7.centerY());
                        float v6_2 = this.v0;
                        v4_10.a.getFontMetrics(v6_2);
                        v0_9.y = (v3_18 - ((v6_2.descent + v6_2.ascent) / v21));
                    }
                    v11.setEmpty();
                    if (this.T != null) {
                        float v5_16 = ((this.y() + this.l0) + this.o0);
                        float v6_6 = ((this.z() + this.s0) + this.p0);
                        if (this.getLayoutDirection() != 0) {
                            v11.left = (((float) v7.left) + v6_6);
                            v11.right = (((float) v7.right) - v5_16);
                        } else {
                            v11.left = (((float) v7.left) + v5_16);
                            v11.right = (((float) v7.right) - v6_6);
                        }
                        v11.top = ((float) v7.top);
                        v11.bottom = ((float) v7.bottom);
                    }
                    float v6_7 = v4_10.a;
                    if (v4_10.f != null) {
                        v6_7.drawableState = this.getState();
                        v4_10.f.d(this.t0, v6_7, v4_10.b);
                    }
                    int v12_1;
                    v6_7.setTextAlign(v2_5);
                    if (Math.round(v4_10.a(this.T.toString())) <= Math.round(v11.width())) {
                        v12_1 = 0;
                    } else {
                        v12_1 = 1;
                    }
                    int v14_1;
                    if (v12_1 == 0) {
                        v14_1 = 0;
                    } else {
                        CharSequence v2_17 = v1_0.save();
                        v1_0.clipRect(v11);
                        v14_1 = v2_17;
                    }
                    CharSequence v2_18 = this.T;
                    if ((v12_1 != 0) && (this.Q0 != null)) {
                        v2_18 = android.text.TextUtils.ellipsize(v2_18, v6_7, v11.width(), this.Q0);
                    }
                    p23.drawText(v2_18, 0, v2_18.length(), v0_9.x, v0_9.y, v6_7);
                    v1_0 = p23;
                    if (v12_1 != 0) {
                        p23.restoreToCount(v14_1);
                    }
                }
                if (this.c0()) {
                    v11.setEmpty();
                    if (this.c0()) {
                        android.graphics.Canvas v0_14 = (this.s0 + this.r0);
                        if (this.getLayoutDirection() != 0) {
                            CharSequence v2_24 = (((float) v7.left) + v0_14);
                            v11.left = v2_24;
                            v11.right = (v2_24 + this.d0);
                        } else {
                            CharSequence v2_28 = (((float) v7.right) - v0_14);
                            v11.right = v2_28;
                            v11.left = (v2_28 - this.d0);
                        }
                        CharSequence v2_30 = this.d0;
                        android.graphics.Canvas v0_18 = (v7.exactCenterY() - (v2_30 / v21));
                        v11.top = v0_18;
                        v11.bottom = (v0_18 + v2_30);
                    }
                    android.graphics.Canvas v0_20 = v11.left;
                    CharSequence v2_31 = v11.top;
                    v1_0.translate(v0_20, v2_31);
                    this.a0.setBounds(0, 0, ((int) v11.width()), ((int) v11.height()));
                    this.b0.setBounds(this.a0.getBounds());
                    this.b0.jumpToCurrentState();
                    this.b0.draw(v1_0);
                    v1_0.translate((- v0_20), (- v2_31));
                }
                if (this.I0 < 255) {
                    v1_0.restoreToCount(v10);
                }
            }
        }
        return;
    }

    public final int getAlpha()
    {
        return this.I0;
    }

    public final android.graphics.ColorFilter getColorFilter()
    {
        return this.J0;
    }

    public final int getIntrinsicHeight()
    {
        return ((int) this.O);
    }

    public final int getIntrinsicWidth()
    {
        return Math.min(Math.round(((this.z() + ((this.z0.a(this.T.toString()) + ((this.y() + this.l0) + this.o0)) + this.p0)) + this.s0)), this.S0);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void getOutline(android.graphics.Outline p9)
    {
        if (!this.T0) {
            android.graphics.Outline v2;
            int v0_2 = this.getBounds();
            if (v0_2.isEmpty()) {
                v2 = p9;
                p9.setRoundRect(0, 0, this.getIntrinsicWidth(), ((int) this.O), this.P);
            } else {
                p9.setRoundRect(v0_2, this.P);
                v2 = p9;
            }
            v2.setAlpha((((float) this.I0) / 1132396544));
            return;
        } else {
            super.getOutline(p9);
            return;
        }
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable p1)
    {
        p1 = this.getCallback();
        if (p1 != null) {
            p1.invalidateDrawable(this);
        }
        return;
    }

    public final boolean isStateful()
    {
        if ((!l3.f.B(this.M)) && ((!l3.f.B(this.N)) && (!l3.f.B(this.Q)))) {
            int v0_3 = this.z0.f;
            if (v0_3 != 0) {
                int v0_4 = v0_3.k;
                if ((v0_4 != 0) && (v0_4.isStateful())) {
                    return 1;
                }
            }
            if (((!this.g0) || ((this.h0 == null) || (!this.f0))) && ((!l3.f.C(this.V)) && ((!l3.f.C(this.h0)) && (!l3.f.B(this.L0))))) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean onLayoutDirectionChanged(int p3)
    {
        int v0 = super.onLayoutDirectionChanged(p3);
        if (this.b0()) {
            v0 |= this.V.setLayoutDirection(p3);
        }
        if (this.a0()) {
            v0 |= this.h0.setLayoutDirection(p3);
        }
        if (this.c0()) {
            v0 |= this.a0.setLayoutDirection(p3);
        }
        if (v0 != 0) {
            this.invalidateSelf();
        }
        return 1;
    }

    public final boolean onLevelChange(int p3)
    {
        int v0 = super.onLevelChange(p3);
        if (this.b0()) {
            v0 |= this.V.setLevel(p3);
        }
        if (this.a0()) {
            v0 |= this.h0.setLevel(p3);
        }
        if (this.c0()) {
            v0 |= this.a0.setLevel(p3);
        }
        if (v0 != 0) {
            this.invalidateSelf();
        }
        return v0;
    }

    public final boolean onStateChange(int[] p2)
    {
        if (this.T0) {
            super.onStateChange(p2);
        }
        return this.E(p2, this.N0);
    }

    public final void scheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2, long p3)
    {
        p1 = this.getCallback();
        if (p1 != null) {
            p1.scheduleDrawable(this, p2, p3);
        }
        return;
    }

    public final void setAlpha(int p2)
    {
        if (this.I0 != p2) {
            this.I0 = p2;
            this.invalidateSelf();
        }
        return;
    }

    public final void setColorFilter(android.graphics.ColorFilter p2)
    {
        if (this.J0 != p2) {
            this.J0 = p2;
            this.invalidateSelf();
        }
        return;
    }

    public final void setTintList(android.content.res.ColorStateList p2)
    {
        if (this.L0 != p2) {
            this.L0 = p2;
            this.onStateChange(this.getState());
        }
        return;
    }

    public final void setTintMode(android.graphics.PorterDuff$Mode p4)
    {
        if (this.M0 != p4) {
            android.graphics.PorterDuffColorFilter v1_1;
            this.M0 = p4;
            int v0_2 = this.L0;
            if ((v0_2 != 0) && (p4 != null)) {
                v1_1 = new android.graphics.PorterDuffColorFilter(v0_2.getColorForState(this.getState(), 0), p4);
            } else {
                v1_1 = 0;
            }
            this.K0 = v1_1;
            this.invalidateSelf();
        }
        return;
    }

    public final boolean setVisible(boolean p3, boolean p4)
    {
        int v0 = super.setVisible(p3, p4);
        if (this.b0()) {
            v0 |= this.V.setVisible(p3, p4);
        }
        if (this.a0()) {
            v0 |= this.h0.setVisible(p3, p4);
        }
        if (this.c0()) {
            v0 |= this.a0.setVisible(p3, p4);
        }
        if (v0 != 0) {
            this.invalidateSelf();
        }
        return v0;
    }

    public final void unscheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2)
    {
        p1 = this.getCallback();
        if (p1 != null) {
            p1.unscheduleDrawable(this, p2);
        }
        return;
    }

    public final void w(android.graphics.drawable.Drawable p3)
    {
        if (p3 != null) {
            p3.setCallback(this);
            p3.setLayoutDirection(this.getLayoutDirection());
            p3.setLevel(this.getLevel());
            p3.setVisible(this.isVisible(), 0);
            if (p3 != this.a0) {
                int[] v0_1 = this.V;
                if ((p3 == v0_1) && (this.Y)) {
                    v0_1.setTintList(this.W);
                }
                if (p3.isStateful()) {
                    p3.setState(this.getState());
                }
            } else {
                if (p3.isStateful()) {
                    p3.setState(this.N0);
                }
                p3.setTintList(this.c0);
                return;
            }
        }
        return;
    }

    public final void x(android.graphics.Rect p6, android.graphics.RectF p7)
    {
        p7.setEmpty();
        if ((!this.b0()) && (!this.a0())) {
            return;
        } else {
            float v1_1;
            int v0_0 = (this.l0 + this.m0);
            if (!this.G0) {
                v1_1 = this.V;
            } else {
                v1_1 = this.h0;
            }
            float v2_0 = this.X;
            if ((v2_0 <= 0) && (v1_1 != 0)) {
                v2_0 = ((float) v1_1.getIntrinsicWidth());
            }
            if (this.getLayoutDirection() != 0) {
                float v1_6 = (((float) p6.right) - v0_0);
                p7.right = v1_6;
                p7.left = (v1_6 - v2_0);
            } else {
                float v1_10 = (((float) p6.left) + v0_0);
                p7.left = v1_10;
                p7.right = (v1_10 + v2_0);
            }
            int v0_3;
            if (!this.G0) {
                v0_3 = this.V;
            } else {
                v0_3 = this.h0;
            }
            float v1_12 = this.X;
            if ((v1_12 <= 0) && (v0_3 != 0)) {
                v1_12 = ((float) Math.ceil(((double) android.util.TypedValue.applyDimension(1, ((float) 24), this.t0.getResources().getDisplayMetrics()))));
                if (((float) v0_3.getIntrinsicHeight()) <= v1_12) {
                    v1_12 = ((float) v0_3.getIntrinsicHeight());
                }
            }
            float v6_2 = (p6.exactCenterY() - (v1_12 / 1073741824));
            p7.top = v6_2;
            p7.bottom = (v6_2 + v1_12);
            return;
        }
    }

    public final float y()
    {
        if ((!this.b0()) && (!this.a0())) {
            return 0;
        } else {
            android.graphics.drawable.Drawable v2_0;
            if (!this.G0) {
                v2_0 = this.V;
            } else {
                v2_0 = this.h0;
            }
            float v3_0 = this.X;
            if ((v3_0 <= 0) && (v2_0 != null)) {
                v3_0 = ((float) v2_0.getIntrinsicWidth());
            }
            return ((v3_0 + this.m0) + this.n0);
        }
    }

    public final float z()
    {
        if (!this.c0()) {
            return 0;
        } else {
            return ((this.q0 + this.d0) + this.r0);
        }
    }
}
