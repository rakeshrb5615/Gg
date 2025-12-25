package com.google.android.material.textfield;
public class TextInputLayout extends android.widget.LinearLayout implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
    public static final int[][] J0;
    public n.b1 A;
    public int A0;
    public android.content.res.ColorStateList B;
    public boolean B0;
    public int C;
    public final q3.b C0;
    public f2.h D;
    public boolean D0;
    public f2.h E;
    public boolean E0;
    public android.content.res.ColorStateList F;
    public android.animation.ValueAnimator F0;
    public android.content.res.ColorStateList G;
    public boolean G0;
    public android.content.res.ColorStateList H;
    public boolean H0;
    public android.content.res.ColorStateList I;
    public boolean I0;
    public boolean J;
    public CharSequence K;
    public boolean L;
    public v3.k M;
    public v3.k N;
    public android.graphics.drawable.StateListDrawable O;
    public boolean P;
    public v3.k Q;
    public v3.k R;
    public v3.p S;
    public boolean T;
    public final int U;
    public int V;
    public int W;
    public final android.widget.FrameLayout a;
    public int a0;
    public final z3.w b;
    public int b0;
    public final z3.o c;
    public int c0;
    public final int d;
    public int d0;
    public android.widget.EditText e;
    public int e0;
    public CharSequence f;
    public final android.graphics.Rect f0;
    public final android.graphics.Rect g0;
    public final android.graphics.RectF h0;
    public android.graphics.Typeface i0;
    public android.graphics.drawable.ColorDrawable j0;
    public int k0;
    public final java.util.LinkedHashSet l0;
    public int m;
    public android.graphics.drawable.ColorDrawable m0;
    public int n;
    public int n0;
    public int o;
    public android.graphics.drawable.Drawable o0;
    public int p;
    public android.content.res.ColorStateList p0;
    public final z3.s q;
    public android.content.res.ColorStateList q0;
    public boolean r;
    public int r0;
    public int s;
    public int s0;
    public boolean t;
    public int t0;
    public z3.z u;
    public android.content.res.ColorStateList u0;
    public n.b1 v;
    public int v0;
    public int w;
    public int w0;
    public int x;
    public int x0;
    public CharSequence y;
    public int y0;
    public boolean z;
    public int z0;

    static TextInputLayout()
    {
        int[] v1_1 = new int[0];
        com.google.android.material.textfield.TextInputLayout.J0 = new int[][] {new int[] {16842919}), v1_1});
        return;
    }

    public TextInputLayout(android.content.Context p21, android.util.AttributeSet p22)
    {
        com.google.android.material.textfield.TextInputLayout v0_1 = super(a4.a.a(p21, p22, 2130969940, 2132018134), p22, 2130969940);
        v0_1.m = -1;
        v0_1.n = -1;
        v0_1.o = -1;
        v0_1.p = -1;
        v0_1.q = new z3.s(v0_1);
        v0_1.u = new r2.q(24);
        v0_1.f0 = new android.graphics.Rect();
        v0_1.g0 = new android.graphics.Rect();
        v0_1.h0 = new android.graphics.RectF();
        v0_1.l0 = new java.util.LinkedHashSet();
        CharSequence v1_22 = new q3.b(v0_1);
        v0_1.C0 = v1_22;
        v0_1.I0 = 0;
        int v3_1 = v0_1.getContext();
        v0_1.setOrientation(1);
        v0_1.setWillNotDraw(0);
        v0_1.setAddStatesFromChildren(1);
        android.widget.FrameLayout v11_1 = new android.widget.FrameLayout(v3_1);
        v0_1.a = v11_1;
        v11_1.setAddStatesFromChildren(1);
        z3.w v5_0 = d3.a.a;
        v1_22.R = v5_0;
        v1_22.j(0);
        v1_22.Q = v5_0;
        v1_22.j(0);
        if (v1_22.g != 8388659) {
            v1_22.g = 8388659;
            v1_22.j(0);
        }
        q3.k.a(v3_1, p22, 2130969940, 2132018134);
        CharSequence v1_42 = v3_1;
        int v3_4 = c3.a.F;
        q3.k.b(v1_42, p22, v3_4, 2130969940, 2132018134, new int[] {22, 20, 40, 45, 50}));
        int v3_5 = v1_42.obtainStyledAttributes(p22, v3_4, 2130969940, 2132018134);
        b8.g v6_3 = new b8.g(v1_42, v3_5);
        z3.w v5_4 = new z3.w(v0_1, v6_3);
        v0_1.b = v5_4;
        v0_1.J = v3_5.getBoolean(48, 1);
        v0_1.setHint(v3_5.getText(4));
        v0_1.E0 = v3_5.getBoolean(47, 1);
        v0_1.D0 = v3_5.getBoolean(42, 1);
        if (!v3_5.hasValue(6)) {
            if (v3_5.hasValue(3)) {
                v0_1.setMinWidth(v3_5.getDimensionPixelSize(3, -1));
            }
        } else {
            v0_1.setMinEms(v3_5.getInt(6, -1));
        }
        if (!v3_5.hasValue(5)) {
            if (v3_5.hasValue(2)) {
                v0_1.setMaxWidth(v3_5.getDimensionPixelSize(2, -1));
            }
        } else {
            v0_1.setMaxEms(v3_5.getInt(5, -1));
        }
        v0_1.S = v3.p.b(v1_42, p22, 2130969940, 2132018134).a();
        v0_1.U = v1_42.getResources().getDimensionPixelOffset(2131166200);
        v0_1.W = v3_5.getDimensionPixelOffset(9, 0);
        v0_1.d = v0_1.getResources().getDimensionPixelSize(2131165835);
        v0_1.b0 = v3_5.getDimensionPixelSize(16, v1_42.getResources().getDimensionPixelSize(2131166201));
        v0_1.c0 = v3_5.getDimensionPixelSize(17, v1_42.getResources().getDimensionPixelSize(2131166202));
        v0_1.a0 = v0_1.b0;
        int v2_17 = v3_5.getDimension(13, -1082130432);
        boolean v7_1 = v3_5.getDimension(12, -1082130432);
        int v12_7 = v3_5.getDimension(10, -1082130432);
        boolean v4_7 = v3_5.getDimension(11, -1082130432);
        int v15_3 = v0_1.S.f();
        if (v2_17 >= 0) {
            v15_3.e = new v3.a(v2_17);
        }
        if (v7_1 >= 0) {
            v15_3.f = new v3.a(v7_1);
        }
        if (v12_7 >= 0) {
            v15_3.g = new v3.a(v12_7);
        }
        if (v4_7 >= 0) {
            v15_3.h = new v3.a(v4_7);
        }
        v0_1.S = v15_3.a();
        int v2_29 = j5.t1.w(v1_42, v6_3, 7);
        if (v2_29 == 0) {
            v0_1.e0 = 0;
            v0_1.v0 = 0;
            v0_1.w0 = 0;
            v0_1.x0 = 0;
            v0_1.y0 = 0;
        } else {
            boolean v4_9 = v2_29.getDefaultColor();
            v0_1.v0 = v4_9;
            v0_1.e0 = v4_9;
            if (!v2_29.isStateful()) {
                v0_1.x0 = v0_1.v0;
                int v2_32 = e0.c.getColorStateList(v1_42, 2131100637);
                v0_1.w0 = v2_32.getColorForState(new int[] {-16842910}), -1);
                v0_1.y0 = v2_32.getColorForState(new int[] {16843623}), -1);
            } else {
                v0_1.w0 = v2_29.getColorForState(new int[] {-16842910}), -1);
                v0_1.x0 = v2_29.getColorForState(new int[] {16842908, 16842910}), -1);
                v0_1.y0 = v2_29.getColorForState(new int[] {16843623, 16842910}), -1);
            }
        }
        if (v3_5.hasValue(1)) {
            int v2_36 = v6_3.h(1);
            v0_1.q0 = v2_36;
            v0_1.p0 = v2_36;
        }
        boolean v4_20 = j5.t1.w(v1_42, v6_3, 14);
        v0_1.t0 = v3_5.getColor(14, 0);
        v0_1.r0 = e0.c.getColor(v1_42, 2131100664);
        v0_1.z0 = e0.c.getColor(v1_42, 2131100665);
        v0_1.s0 = e0.c.getColor(v1_42, 2131100668);
        if (v4_20) {
            v0_1.setBoxStrokeColorStateList(v4_20);
        }
        if (v3_5.hasValue(15)) {
            v0_1.setBoxStrokeErrorColor(j5.t1.w(v1_42, v6_3, 15));
        }
        if (v3_5.getResourceId(50, -1) != -1) {
            v0_1.setHintTextAppearance(v3_5.getResourceId(50, 0));
        }
        v0_1.H = v6_3.h(24);
        v0_1.I = v6_3.h(25);
        CharSequence v1_20 = v3_5.getResourceId(40, 0);
        int v2_47 = v3_5.getText(35);
        boolean v4_23 = v3_5.getInt(34, 1);
        boolean v7_5 = v3_5.getBoolean(36, 0);
        int v12_11 = v3_5.getResourceId(45, 0);
        boolean v13_1 = v3_5.getBoolean(44, 0);
        int v14_3 = v3_5.getText(43);
        int v15_5 = v3_5.getResourceId(58, 0);
        CharSequence v10_1 = v3_5.getText(57);
        boolean v8_1 = v3_5.getBoolean(18, 0);
        CharSequence v22_1 = v14_3;
        v0_1.setCounterMaxLength(v3_5.getInt(19, -1));
        v0_1.x = v3_5.getResourceId(22, 0);
        v0_1.w = v3_5.getResourceId(20, 0);
        v0_1.setBoxBackgroundMode(v3_5.getInt(8, 0));
        v0_1.setErrorContentDescription(v2_47);
        v0_1.setErrorAccessibilityLiveRegion(v4_23);
        v0_1.setCounterOverflowTextAppearance(v0_1.w);
        v0_1.setHelperTextTextAppearance(v12_11);
        v0_1.setErrorTextAppearance(v1_20);
        v0_1.setCounterTextAppearance(v0_1.x);
        v0_1.setPlaceholderText(v10_1);
        v0_1.setPlaceholderTextAppearance(v15_5);
        if (v3_5.hasValue(41)) {
            v0_1.setErrorTextColor(v6_3.h(41));
        }
        if (v3_5.hasValue(46)) {
            v0_1.setHelperTextColor(v6_3.h(46));
        }
        if (v3_5.hasValue(51)) {
            v0_1.setHintTextColor(v6_3.h(51));
        }
        if (v3_5.hasValue(23)) {
            v0_1.setCounterTextColor(v6_3.h(23));
        }
        if (v3_5.hasValue(21)) {
            v0_1.setCounterOverflowTextColor(v6_3.h(21));
        }
        if (v3_5.hasValue(59)) {
            v0_1.setPlaceholderTextColor(v6_3.h(59));
        }
        CharSequence v1_38 = new z3.o(v0_1, v6_3);
        v0_1.c = v1_38;
        boolean v4_24 = v3_5.getBoolean(0, 1);
        v0_1.setHintMaxLines(v3_5.getInt(49, 1));
        v6_3.r();
        v0_1.setImportantForAccessibility(2);
        v0_1.setImportantForAutofill(1);
        v11_1.addView(v5_4);
        v11_1.addView(v1_38);
        v0_1.addView(v11_1);
        v0_1.setEnabled(v4_24);
        v0_1.setHelperTextEnabled(v13_1);
        v0_1.setErrorEnabled(v7_5);
        v0_1.setCounterEnabled(v8_1);
        v0_1.setHelperText(v22_1);
        return;
    }

    private android.graphics.drawable.Drawable getEditTextBoxBackground()
    {
        android.graphics.drawable.Drawable[] v0_0 = this.e;
        if (((v0_0 instanceof android.widget.AutoCompleteTextView)) && (v0_0.getInputType() == 0)) {
            android.graphics.drawable.Drawable[] v0_14 = j5.t1.u(this.e, 2130968848);
            android.graphics.drawable.LayerDrawable v1_1 = this.V;
            android.graphics.drawable.RippleDrawable v5_0 = com.google.android.material.textfield.TextInputLayout.J0;
            if (v1_1 != 2) {
                if (v1_1 != 1) {
                    return 0;
                } else {
                    android.content.res.ColorStateList v2_1 = this.e0;
                    return new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(v5_0, new int[] {j5.t1.L(v0_14, v2_1, 1036831949), v2_1})), this.M, this.M);
                }
            } else {
                android.graphics.drawable.LayerDrawable v1_4;
                android.graphics.drawable.LayerDrawable v1_3 = this.getContext();
                v3.k v6 = this.M;
                v3.k v7_1 = c4.b.W(v1_3, 2130968890, "TextInputLayout");
                int[] v8_1 = v7_1.resourceId;
                if (v8_1 == null) {
                    v1_4 = v7_1.data;
                } else {
                    v1_4 = e0.c.getColor(v1_3, v8_1);
                }
                v3.k v7_3 = new v3.k(v6.b.a);
                android.graphics.drawable.Drawable[] v0_7 = j5.t1.L(v0_14, v1_4, 1036831949);
                v7_3.o(new android.content.res.ColorStateList(v5_0, new int[] {v0_7, 0})));
                v7_3.setTint(v1_4);
                android.graphics.drawable.LayerDrawable v1_6 = new android.content.res.ColorStateList(v5_0, new int[] {v0_7, v1_4}));
                android.graphics.drawable.Drawable[] v0_11 = new v3.k(v6.b.a);
                v0_11.setTint(-1);
                android.graphics.drawable.Drawable[] v0_12 = new android.graphics.drawable.Drawable[2];
                v0_12[0] = new android.graphics.drawable.RippleDrawable(v1_6, v7_3, v0_11);
                v0_12[1] = v6;
                return new android.graphics.drawable.LayerDrawable(v0_12);
            }
        } else {
            return this.M;
        }
    }

    private android.graphics.drawable.Drawable getOrCreateFilledDropDownMenuBackground()
    {
        if (this.O == null) {
            android.graphics.drawable.StateListDrawable v0_4 = new android.graphics.drawable.StateListDrawable();
            this.O = v0_4;
            v0_4.addState(new int[] {16842922}), this.getOrCreateOutlinedDropDownMenuBackground());
            int[] v2_0 = new int[0];
            this.O.addState(v2_0, this.h(0));
        }
        return this.O;
    }

    private android.graphics.drawable.Drawable getOrCreateOutlinedDropDownMenuBackground()
    {
        if (this.N == null) {
            this.N = this.h(1);
        }
        return this.N;
    }

    public static void m(android.view.ViewGroup p4, boolean p5)
    {
        int v0 = p4.getChildCount();
        int v1 = 0;
        while (v1 < v0) {
            android.view.ViewGroup v2_1 = p4.getChildAt(v1);
            v2_1.setEnabled(p5);
            if ((v2_1 instanceof android.view.ViewGroup)) {
                com.google.android.material.textfield.TextInputLayout.m(((android.view.ViewGroup) v2_1), p5);
            }
            v1++;
        }
        return;
    }

    private void setEditText(android.widget.EditText p6)
    {
        if (this.e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        } else {
            if ((this.getEndIconMode() != 3) && (!(p6 instanceof com.google.android.material.textfield.TextInputEditText))) {
                android.util.Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.e = p6;
            int v0_3 = this.m;
            if (v0_3 == -1) {
                this.setMinWidth(this.o);
            } else {
                this.setMinEms(v0_3);
            }
            int v0_5 = this.n;
            if (v0_5 == -1) {
                this.setMaxWidth(this.p);
            } else {
                this.setMaxEms(v0_5);
            }
            this.P = 0;
            this.k();
            this.setTextInputAccessibilityDelegate(new z3.y(this));
            int v2_0 = this.C0;
            v2_0.n(this.e.getTypeface());
            boolean v1_14 = this.e.getTextSize();
            if (v2_0.h != v1_14) {
                v2_0.h = v1_14;
                v2_0.j(0);
            }
            boolean v1_16 = this.e.getLetterSpacing();
            if (v2_0.X != v1_16) {
                v2_0.X = v1_16;
                v2_0.j(0);
            }
            boolean v1_18 = this.e.getGravity();
            java.util.Iterator v3_7 = ((v1_18 & -113) | 48);
            if (v2_0.g != v3_7) {
                v2_0.g = v3_7;
                v2_0.j(0);
            }
            if (v2_0.f != v1_18) {
                v2_0.f = v1_18;
                v2_0.j(0);
            }
            this.A0 = p6.getMinimumHeight();
            this.e.addTextChangedListener(new z3.x(this, p6));
            if (this.p0 == null) {
                this.p0 = this.e.getHintTextColors();
            }
            if (this.J) {
                if (android.text.TextUtils.isEmpty(this.K)) {
                    boolean v1_29 = this.e.getHint();
                    this.f = v1_29;
                    this.setHint(v1_29);
                    this.e.setHint(0);
                }
                this.L = 1;
            }
            if (android.os.Build$VERSION.SDK_INT >= 29) {
                this.r();
            }
            if (this.v != null) {
                this.p(this.e.getText());
            }
            this.t();
            this.q.b();
            this.b.bringToFront();
            boolean v1_5 = this.c;
            v1_5.bringToFront();
            java.util.Iterator v3_1 = this.l0.iterator();
            while (v3_1.hasNext()) {
                ((z3.m) v3_1.next()).a(this);
            }
            v1_5.m();
            if (!this.isEnabled()) {
                p6.setEnabled(0);
            }
            this.w(0, 1);
            return;
        }
    }

    private void setHintInternal(CharSequence p3)
    {
        if (!android.text.TextUtils.equals(p3, this.K)) {
            this.K = p3;
            q3.b v0_2 = this.C0;
            if ((!p3) || (!android.text.TextUtils.equals(v0_2.B, p3))) {
                v0_2.B = p3;
                v0_2.C = 0;
                v0_2.j(0);
            }
            if (!this.B0) {
                this.l();
            }
        }
        return;
    }

    private void setPlaceholderTextEnabled(boolean p3)
    {
        if (this.z != p3) {
            if (!p3) {
                int v0_2 = this.A;
                if (v0_2 != 0) {
                    v0_2.setVisibility(8);
                }
                this.A = 0;
            } else {
                int v0_4 = this.A;
                if (v0_4 != 0) {
                    this.a.addView(v0_4);
                    this.A.setVisibility(0);
                }
            }
            this.z = p3;
            return;
        } else {
            return;
        }
    }

    public final void a()
    {
        if ((this.e != null) && (this.V == 1)) {
            if (this.getHintMaxLines() != 1) {
                android.widget.EditText v0_12 = this.e;
                v0_12.setPaddingRelative(v0_12.getPaddingStart(), ((int) (this.C0.f() + ((float) this.d))), this.e.getPaddingEnd(), this.getResources().getDimensionPixelSize(2131166000));
            } else {
                if (this.getContext().getResources().getConfiguration().fontScale < 1073741824) {
                    if (j5.t1.J(this.getContext())) {
                        android.widget.EditText v0_9 = this.e;
                        v0_9.setPaddingRelative(v0_9.getPaddingStart(), this.getResources().getDimensionPixelSize(2131166001), this.e.getPaddingEnd(), this.getResources().getDimensionPixelSize(2131166000));
                        return;
                    }
                } else {
                    android.widget.EditText v0_10 = this.e;
                    v0_10.setPaddingRelative(v0_10.getPaddingStart(), this.getResources().getDimensionPixelSize(2131166003), this.e.getPaddingEnd(), this.getResources().getDimensionPixelSize(2131166002));
                    return;
                }
            }
        }
        return;
    }

    public final void addView(android.view.View p2, int p3, android.view.ViewGroup$LayoutParams p4)
    {
        if (!(p2 instanceof android.widget.EditText)) {
            super.addView(p2, p3, p4);
            return;
        } else {
            android.widget.FrameLayout$LayoutParams v3_2 = new android.widget.FrameLayout$LayoutParams(p4);
            v3_2.gravity = ((v3_2.gravity & -113) | 16);
            android.widget.FrameLayout v0_1 = this.a;
            v0_1.addView(p2, v3_2);
            v0_1.setLayoutParams(p4);
            this.v();
            this.setEditText(((android.widget.EditText) p2));
            return;
        }
    }

    public final void b(float p7)
    {
        int v0_0 = this.C0;
        if (v0_0.b != p7) {
            if (this.F0 == null) {
                android.animation.ValueAnimator v1_7 = new android.animation.ValueAnimator();
                this.F0 = v1_7;
                v1_7.setInterpolator(j5.t1.Q(this.getContext(), 2130969539, d3.a.b));
                this.F0.setDuration(((long) j5.t1.P(this.getContext(), 2130969529, 167)));
                this.F0.addUpdateListener(new a2.o(this, 2));
            }
            android.animation.ValueAnimator v1_4 = this.F0;
            float[] v2_0 = new float[2];
            v2_0[0] = v0_0.b;
            v2_0[1] = p7;
            v1_4.setFloatValues(v2_0);
            this.F0.start();
            return;
        } else {
            return;
        }
    }

    public final void c()
    {
        v3.k v0_0 = this.M;
        if (v0_0 != null) {
            int v2_0 = this.S;
            if (v0_0.b.a != v2_0) {
                v0_0.setShapeAppearanceModel(v2_0);
            }
            if (this.V == 2) {
                v3.k v0_1 = this.a0;
                if (v0_1 > -1) {
                    android.content.res.ColorStateList v1_0 = this.d0;
                    if (v1_0 != null) {
                        v3.k v3_0 = this.M;
                        v3_0.b.k = ((float) v0_1);
                        v3_0.invalidateSelf();
                        v3_0.r(android.content.res.ColorStateList.valueOf(v1_0));
                    }
                }
            }
            v3.k v0_4 = this.e0;
            if (this.V == 1) {
                v0_4 = h0.a.e(this.e0, j5.t1.t(this.getContext(), 2130968890, 0));
            }
            this.e0 = v0_4;
            this.M.o(android.content.res.ColorStateList.valueOf(v0_4));
            v3.k v0_8 = this.Q;
            if ((v0_8 != null) && (this.R != null)) {
                if ((this.a0 > -1) && (this.d0 != 0)) {
                    android.content.res.ColorStateList v1_13;
                    if (!this.e.isFocused()) {
                        v1_13 = android.content.res.ColorStateList.valueOf(this.d0);
                    } else {
                        v1_13 = android.content.res.ColorStateList.valueOf(this.r0);
                    }
                    v0_8.o(v1_13);
                    this.R.o(android.content.res.ColorStateList.valueOf(this.d0));
                }
                this.invalidate();
            }
            this.u();
            return;
        } else {
            return;
        }
    }

    public final android.graphics.Rect d(android.graphics.Rect p5)
    {
        if (this.e == null) {
            throw new IllegalStateException();
        } else {
            int v0_1;
            if (this.getLayoutDirection() != 1) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
            android.graphics.Rect v3 = this.g0;
            v3.bottom = p5.bottom;
            int v2_1 = this.V;
            if (v2_1 == 1) {
                v3.left = this.i(p5.left, v0_1);
                v3.top = (p5.top + this.W);
                v3.right = this.j(p5.right, v0_1);
                return v3;
            } else {
                if (v2_1 == 2) {
                    v3.left = (this.e.getPaddingLeft() + p5.left);
                    v3.top = (p5.top - this.e());
                    v3.right = (p5.right - this.e.getPaddingRight());
                    return v3;
                } else {
                    v3.left = this.i(p5.left, v0_1);
                    v3.top = this.getPaddingTop();
                    v3.right = this.j(p5.right, v0_1);
                    return v3;
                }
            }
        }
    }

    public final void dispatchProvideAutofillStructure(android.view.ViewStructure p6, int p7)
    {
        android.widget.FrameLayout v0_0 = this.e;
        if (v0_0 != null) {
            int v2_0 = 0;
            if (this.f == null) {
                p6.setAutofillId(this.getAutofillId());
                this.onProvideAutofillStructure(p6, p7);
                this.onProvideAutofillVirtualStructure(p6, p7);
                android.widget.FrameLayout v0_1 = this.a;
                p6.setChildCount(v0_1.getChildCount());
                while (v2_0 < v0_1.getChildCount()) {
                    CharSequence v1_2 = v0_1.getChildAt(v2_0);
                    android.view.ViewStructure v3_0 = p6.newChild(v2_0);
                    v1_2.dispatchProvideAutofillStructure(v3_0, p7);
                    if (v1_2 == this.e) {
                        v3_0.setHint(this.getHint());
                    }
                    v2_0++;
                }
                return;
            } else {
                CharSequence v1_5 = this.L;
                this.L = 0;
                android.widget.FrameLayout v0_2 = v0_0.getHint();
                this.e.setHint(this.f);
                try {
                    super.dispatchProvideAutofillStructure(p6, p7);
                    this.e.setHint(v0_2);
                    this.L = v1_5;
                    return;
                } catch (Throwable v6_2) {
                    this.e.setHint(v0_2);
                    this.L = v1_5;
                    throw v6_2;
                }
            }
        } else {
            super.dispatchProvideAutofillStructure(p6, p7);
            return;
        }
    }

    public final void dispatchRestoreInstanceState(android.util.SparseArray p2)
    {
        this.H0 = 1;
        super.dispatchRestoreInstanceState(p2);
        this.H0 = 0;
        return;
    }

    public final void draw(android.graphics.Canvas p18)
    {
        android.graphics.Canvas v1_0 = p18;
        super.draw(p18);
        q3.b v8 = this.C0;
        if (this.J) {
            android.text.TextPaint v7 = v8.O;
            String v2_25 = v8.e;
            int v9 = p18.save();
            if ((v8.C != null) && ((v2_25.width() > 0) && (v2_25.height() > 0))) {
                v7.setTextSize(v8.G);
                String v2_17 = v8.q;
                int v3_10 = v8.r;
                int v4_4 = v8.F;
                if (v4_4 != 1065353216) {
                    p18.scale(v4_4, v4_4, v2_17, v3_10);
                }
                if (((v8.e0 <= 1) && (v8.f0 <= 1)) || ((v8.D) || (!v8.o()))) {
                    p18.translate(v2_17, v3_10);
                    v8.Z.draw(p18);
                } else {
                    String v2_20 = (v8.q - ((float) v8.Z.getLineStart(0)));
                    int v12 = v7.getAlpha();
                    p18.translate(v2_20, v3_10);
                    int v3_11 = ((float) v12);
                    v7.setAlpha(((int) (v8.c0 * v3_11)));
                    int v13 = android.os.Build$VERSION.SDK_INT;
                    if (v13 >= 31) {
                        float v6_2 = v8.K;
                        v7.setShadowLayer(v8.H, v8.I, v8.J, h0.a.h(v6_2, ((v7.getAlpha() * android.graphics.Color.alpha(v6_2)) / 255)));
                    }
                    v8.Z.draw(p18);
                    v7.setAlpha(((int) (v8.b0 * v3_11)));
                    if (v13 >= 31) {
                        int v5_6 = v8.K;
                        v7.setShadowLayer(v8.H, v8.I, v8.J, h0.a.h(v5_6, ((android.graphics.Color.alpha(v5_6) * v7.getAlpha()) / 255)));
                    }
                    int v3_13 = v8.d0;
                    float v6_5 = ((float) v8.Z.getLineBaseline(0));
                    p18.drawText(v3_13, 0, v3_13.length(), 0, v6_5, v7);
                    if (v13 >= 31) {
                        v7.setShadowLayer(v8.H, v8.I, v8.J, v8.K);
                    }
                    android.graphics.Canvas v1_4 = v8.d0.toString().trim();
                    if (v1_4.endsWith("\u2026")) {
                        v1_4 = v1_4.substring(0, (v1_4.length() - 1));
                    }
                    String v2_5 = v1_4;
                    v7.setAlpha(v12);
                    v1_0 = p18;
                    p18.drawText(v2_5, 0, Math.min(v8.Z.getLineEnd(0), v2_5.length()), 0, v6_5, v7);
                }
                v1_0.restoreToCount(v9);
            }
        }
        if (this.R != null) {
            String v2_8 = this.Q;
            if (v2_8 != null) {
                v2_8.draw(v1_0);
                if (this.e.isFocused()) {
                    String v2_12 = this.R.getBounds();
                    int v3_7 = this.Q.getBounds();
                    int v4_3 = v8.b;
                    int v5_2 = v3_7.centerX();
                    v2_12.left = d3.a.c(v5_2, v3_7.left, v4_3);
                    v2_12.right = d3.a.c(v5_2, v3_7.right, v4_3);
                    this.R.draw(v1_0);
                }
            }
        }
        return;
    }

    public final void drawableStateChanged()
    {
        if (!this.G0) {
            boolean v1_4;
            int v0_1 = 1;
            this.G0 = 1;
            super.drawableStateChanged();
            boolean v1_5 = this.getDrawableState();
            boolean v3_3 = this.C0;
            if (!v3_3) {
                v1_4 = 0;
            } else {
                v3_3.M = v1_5;
                boolean v1_0 = v3_3.k;
                if ((!v1_0) || (!v1_0.isStateful())) {
                    boolean v1_2 = v3_3.j;
                    if ((!v1_2) || (!v1_2.isStateful())) {
                    }
                }
                v3_3.j(0);
                v1_4 = 1;
            }
            if (this.e != null) {
                if ((!this.isLaidOut()) || (!this.isEnabled())) {
                    v0_1 = 0;
                }
                this.w(v0_1, 0);
            }
            this.t();
            this.z();
            if (v1_4) {
                this.invalidate();
            }
            this.G0 = 0;
            return;
        } else {
            return;
        }
    }

    public final int e()
    {
        if (this.J) {
            int v0_3 = this.V;
            float v2_4 = this.C0;
            if (v0_3 == 0) {
                return ((int) v2_4.f());
            } else {
                if (v0_3 == 2) {
                    if (this.getHintMaxLines() != 1) {
                        int v0_2 = v2_4.f();
                        android.text.TextPaint v3_2 = v2_4.P;
                        v3_2.setTextSize(v2_4.i);
                        v3_2.setTypeface(v2_4.s);
                        v3_2.setLetterSpacing(v2_4.W);
                        return Math.max(0, ((int) (v0_2 - ((- v3_2.ascent()) / 1073741824))));
                    } else {
                        return ((int) (v2_4.f() / 1073741824));
                    }
                }
            }
        }
        return 0;
    }

    public final f2.h f()
    {
        f2.h v0_1 = new f2.h();
        v0_1.c = ((long) j5.t1.P(this.getContext(), 2130969531, 87));
        v0_1.d = j5.t1.Q(this.getContext(), 2130969541, d3.a.a);
        return v0_1;
    }

    public final boolean g()
    {
        if ((!this.J) || ((android.text.TextUtils.isEmpty(this.K)) || (!(this.M instanceof z3.g)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getBaseline()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return super.getBaseline();
        } else {
            return (this.e() + (this.getPaddingTop() + v0_0.getBaseline()));
        }
    }

    public v3.k getBoxBackground()
    {
        IllegalStateException v0_0 = this.V;
        if ((v0_0 != 1) && (v0_0 != 2)) {
            throw new IllegalStateException();
        } else {
            return this.M;
        }
    }

    public int getBoxBackgroundColor()
    {
        return this.e0;
    }

    public int getBoxBackgroundMode()
    {
        return this.V;
    }

    public int getBoxCollapsedPaddingTop()
    {
        return this.W;
    }

    public float getBoxCornerRadiusBottomEnd()
    {
        android.graphics.RectF v2 = this.h0;
        if (this.getLayoutDirection() != 1) {
            return this.S.g.a(v2);
        } else {
            return this.S.h.a(v2);
        }
    }

    public float getBoxCornerRadiusBottomStart()
    {
        android.graphics.RectF v2 = this.h0;
        if (this.getLayoutDirection() != 1) {
            return this.S.h.a(v2);
        } else {
            return this.S.g.a(v2);
        }
    }

    public float getBoxCornerRadiusTopEnd()
    {
        android.graphics.RectF v2 = this.h0;
        if (this.getLayoutDirection() != 1) {
            return this.S.f.a(v2);
        } else {
            return this.S.e.a(v2);
        }
    }

    public float getBoxCornerRadiusTopStart()
    {
        android.graphics.RectF v2 = this.h0;
        if (this.getLayoutDirection() != 1) {
            return this.S.e.a(v2);
        } else {
            return this.S.f.a(v2);
        }
    }

    public int getBoxStrokeColor()
    {
        return this.t0;
    }

    public android.content.res.ColorStateList getBoxStrokeErrorColor()
    {
        return this.u0;
    }

    public int getBoxStrokeWidth()
    {
        return this.b0;
    }

    public int getBoxStrokeWidthFocused()
    {
        return this.c0;
    }

    public int getCounterMaxLength()
    {
        return this.s;
    }

    public CharSequence getCounterOverflowDescription()
    {
        if ((this.r) && (this.t)) {
            CharSequence v0_2 = this.v;
            if (v0_2 != null) {
                return v0_2.getContentDescription();
            }
        }
        return 0;
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor()
    {
        return this.G;
    }

    public android.content.res.ColorStateList getCounterTextColor()
    {
        return this.F;
    }

    public android.content.res.ColorStateList getCursorColor()
    {
        return this.H;
    }

    public android.content.res.ColorStateList getCursorErrorColor()
    {
        return this.I;
    }

    public android.content.res.ColorStateList getDefaultHintTextColor()
    {
        return this.p0;
    }

    public android.widget.EditText getEditText()
    {
        return this.e;
    }

    public CharSequence getEndIconContentDescription()
    {
        return this.c.m.getContentDescription();
    }

    public android.graphics.drawable.Drawable getEndIconDrawable()
    {
        return this.c.m.getDrawable();
    }

    public int getEndIconMinSize()
    {
        return this.c.s;
    }

    public int getEndIconMode()
    {
        return this.c.o;
    }

    public android.widget.ImageView$ScaleType getEndIconScaleType()
    {
        return this.c.t;
    }

    public com.google.android.material.internal.CheckableImageButton getEndIconView()
    {
        return this.c.m;
    }

    public CharSequence getError()
    {
        int v0_0 = this.q;
        if (!v0_0.q) {
            return 0;
        } else {
            return v0_0.p;
        }
    }

    public int getErrorAccessibilityLiveRegion()
    {
        return this.q.t;
    }

    public CharSequence getErrorContentDescription()
    {
        return this.q.s;
    }

    public int getErrorCurrentTextColors()
    {
        int v0_1 = this.q.r;
        if (v0_1 == 0) {
            return -1;
        } else {
            return v0_1.getCurrentTextColor();
        }
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable()
    {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText()
    {
        int v0_0 = this.q;
        if (!v0_0.x) {
            return 0;
        } else {
            return v0_0.w;
        }
    }

    public int getHelperTextCurrentTextColor()
    {
        int v0_1 = this.q.y;
        if (v0_1 == 0) {
            return -1;
        } else {
            return v0_1.getCurrentTextColor();
        }
    }

    public CharSequence getHint()
    {
        if (!this.J) {
            return 0;
        } else {
            return this.K;
        }
    }

    public final float getHintCollapsedTextHeight()
    {
        return this.C0.f();
    }

    public final int getHintCurrentCollapsedTextColor()
    {
        int v0_0 = this.C0;
        return v0_0.g(v0_0.k);
    }

    public int getHintMaxLines()
    {
        return this.C0.e0;
    }

    public android.content.res.ColorStateList getHintTextColor()
    {
        return this.q0;
    }

    public z3.z getLengthCounter()
    {
        return this.u;
    }

    public int getMaxEms()
    {
        return this.n;
    }

    public int getMaxWidth()
    {
        return this.p;
    }

    public int getMinEms()
    {
        return this.m;
    }

    public int getMinWidth()
    {
        return this.o;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription()
    {
        return this.c.m.getContentDescription();
    }

    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable()
    {
        return this.c.m.getDrawable();
    }

    public CharSequence getPlaceholderText()
    {
        if (!this.z) {
            return 0;
        } else {
            return this.y;
        }
    }

    public int getPlaceholderTextAppearance()
    {
        return this.C;
    }

    public android.content.res.ColorStateList getPlaceholderTextColor()
    {
        return this.B;
    }

    public CharSequence getPrefixText()
    {
        return this.b.c;
    }

    public android.content.res.ColorStateList getPrefixTextColor()
    {
        return this.b.b.getTextColors();
    }

    public android.widget.TextView getPrefixTextView()
    {
        return this.b.b;
    }

    public v3.p getShapeAppearanceModel()
    {
        return this.S;
    }

    public CharSequence getStartIconContentDescription()
    {
        return this.b.d.getContentDescription();
    }

    public android.graphics.drawable.Drawable getStartIconDrawable()
    {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize()
    {
        return this.b.m;
    }

    public android.widget.ImageView$ScaleType getStartIconScaleType()
    {
        return this.b.n;
    }

    public CharSequence getSuffixText()
    {
        return this.c.v;
    }

    public android.content.res.ColorStateList getSuffixTextColor()
    {
        return this.c.w.getTextColors();
    }

    public android.widget.TextView getSuffixTextView()
    {
        return this.c.w;
    }

    public android.graphics.Typeface getTypeface()
    {
        return this.i0;
    }

    public final v3.k h(boolean p15)
    {
        android.content.res.ColorStateList v15_8;
        int v0_3 = ((float) this.getResources().getDimensionPixelOffset(2131166174));
        if (p15 == null) {
            v15_8 = 0;
        } else {
            v15_8 = v0_3;
        }
        float v1_2;
        float v1_5 = this.e;
        if (!(v1_5 instanceof z3.u)) {
            v1_2 = ((float) this.getResources().getDimensionPixelOffset(2131165653));
        } else {
            v1_2 = ((z3.u) v1_5).getPopupElevation();
        }
        android.content.res.ColorStateList v15_6;
        int v2_3 = this.getResources().getDimensionPixelOffset(2131166111);
        android.content.Context v3_2 = new v3.n();
        v3.k v4_1 = new v3.n();
        v3.n v5_1 = new v3.n();
        v3.n v6_1 = new v3.n();
        v3.f v7_1 = new v3.f();
        v3.f v8_1 = new v3.f();
        v3.f v9_1 = new v3.f();
        v3.f v10_1 = new v3.f();
        v3.a v11_1 = new v3.a(v15_8);
        v3.a v12_1 = new v3.a(v15_8);
        android.content.res.ColorStateList v15_4 = new v3.a(v0_3);
        v3.a v13_1 = new v3.a(v0_3);
        int v0_5 = new v3.p();
        v0_5.a = v3_2;
        v0_5.b = v4_1;
        v0_5.c = v5_1;
        v0_5.d = v6_1;
        v0_5.e = v11_1;
        v0_5.f = v12_1;
        v0_5.g = v13_1;
        v0_5.h = v15_4;
        v0_5.i = v7_1;
        v0_5.j = v8_1;
        v0_5.k = v9_1;
        v0_5.l = v10_1;
        android.content.res.ColorStateList v15_5 = this.e;
        if (!(v15_5 instanceof z3.u)) {
            v15_6 = 0;
        } else {
            v15_6 = ((z3.u) v15_5).getDropDownBackgroundTintList();
        }
        android.content.Context v3_4 = this.getContext();
        if (v15_6 == null) {
            android.content.res.ColorStateList v15_12;
            android.content.res.ColorStateList v15_11 = c4.b.W(v3_4, 2130968890, v3.k.getSimpleName());
            v3.k v4_3 = v15_11.resourceId;
            if (v4_3 == null) {
                v15_12 = v15_11.data;
            } else {
                v15_12 = e0.c.getColor(v3_4, v4_3);
            }
            v15_6 = android.content.res.ColorStateList.valueOf(v15_12);
        }
        v3.k v4_5 = new v3.k();
        v4_5.l(v3_4);
        v4_5.o(v15_6);
        v4_5.n(v1_2);
        v4_5.setShapeAppearanceModel(v0_5);
        android.content.res.ColorStateList v15_13 = v4_5.b;
        if (v15_13.h == null) {
            v15_13.h = new android.graphics.Rect();
        }
        v4_5.b.h.set(0, v2_3, 0, v2_3);
        v4_5.invalidateSelf();
        return v4_5;
    }

    public final int i(int p2, boolean p3)
    {
        if ((p3 != 0) || (this.getPrefixText() == null)) {
            if ((p3 == 0) || (this.getSuffixText() == null)) {
                int v3_1 = this.e.getCompoundPaddingLeft();
            } else {
                v3_1 = this.c.c();
            }
        } else {
            v3_1 = this.b.a();
        }
        return (v3_1 + p2);
    }

    public final int j(int p2, boolean p3)
    {
        if ((p3 != 0) || (this.getSuffixText() == null)) {
            if ((p3 == 0) || (this.getPrefixText() == null)) {
                int v3_1 = this.e.getCompoundPaddingRight();
            } else {
                v3_1 = this.b.a();
            }
        } else {
            v3_1 = this.c.c();
        }
        return (p2 - v3_1);
    }

    public final void k()
    {
        z3.g v0_0 = this.V;
        if (v0_0 == null) {
            this.M = 0;
            this.Q = 0;
            this.R = 0;
        } else {
            if (v0_0 == 1) {
                this.M = new v3.k(this.S);
                this.Q = new v3.k();
                this.R = new v3.k();
            } else {
                if (v0_0 != 2) {
                    android.graphics.drawable.Drawable v1_4 = new StringBuilder();
                    v1_4.append(this.V);
                    v1_4.append(" is illegal; only @BoxBackgroundMode constants are supported.");
                    throw new IllegalArgumentException(v1_4.toString());
                } else {
                    if ((!this.J) || ((this.M instanceof z3.g))) {
                        this.M = new v3.k(this.S);
                    } else {
                        z3.g v0_13 = this.S;
                        if (v0_13 == null) {
                            v0_13 = new v3.p();
                        }
                        z3.f v4_2 = new z3.f(v0_13, new android.graphics.RectF());
                        z3.g v0_16 = new z3.g(v4_2);
                        v0_16.M = v4_2;
                        this.M = v0_16;
                    }
                    this.Q = 0;
                    this.R = 0;
                }
            }
        }
        this.u();
        this.z();
        if (this.V == 1) {
            if (this.getContext().getResources().getConfiguration().fontScale < 1073741824) {
                if (j5.t1.J(this.getContext())) {
                    this.W = this.getResources().getDimensionPixelSize(2131166004);
                }
            } else {
                this.W = this.getResources().getDimensionPixelSize(2131166005);
            }
        }
        this.a();
        if (this.V != 0) {
            this.v();
        }
        z3.g v0_31 = this.e;
        if ((v0_31 instanceof android.widget.AutoCompleteTextView)) {
            z3.g v0_32 = ((android.widget.AutoCompleteTextView) v0_31);
            if (v0_32.getDropDownBackground() == null) {
                int v3_7 = this.V;
                if (v3_7 != 2) {
                    if (v3_7 == 1) {
                        v0_32.setDropDownBackgroundDrawable(this.getOrCreateFilledDropDownMenuBackground());
                    }
                } else {
                    v0_32.setDropDownBackgroundDrawable(this.getOrCreateOutlinedDropDownMenuBackground());
                    return;
                }
            }
        }
        return;
    }

    public final void l()
    {
        if (this.g()) {
            float v3_11;
            float v10_3;
            float v3_9;
            z3.g v0_20 = this.e.getWidth();
            float v1_7 = this.e.getGravity();
            float v2_8 = this.C0;
            float v3_1 = v2_8.c(v2_8.B);
            v2_8.D = v3_1;
            float v4_0 = v2_8.d;
            if ((v1_7 != 17) && ((v1_7 & 7) != 1)) {
                if (((v1_7 & 8388613) != 8388613) && ((v1_7 & 5) != 5)) {
                    if (v3_1 == 0) {
                        float v3_7 = v4_0.left;
                    } else {
                        v3_9 = ((float) v4_0.right);
                        v10_3 = v2_8.a0;
                        v3_11 = (v3_9 - v10_3);
                        z3.g v0_27;
                        float v3_13 = Math.max(v3_11, ((float) v4_0.left));
                        float v10_7 = this.h0;
                        v10_7.left = v3_13;
                        v10_7.top = ((float) v4_0.top);
                        if ((v1_7 != 17) && ((v1_7 & 7) != 1)) {
                            if (((v1_7 & 8388613) != 8388613) && ((v1_7 & 5) != 5)) {
                                if (!v2_8.D) {
                                    z3.g v0_24 = v2_8.a0;
                                    v0_27 = (v0_24 + v3_13);
                                    v10_7.right = Math.min(v0_27, ((float) v4_0.right));
                                    v10_7.bottom = (v2_8.f() + ((float) v4_0.top));
                                    if ((v2_8.Z != null) && (!v2_8.o())) {
                                        z3.g v0_35 = v2_8.Z;
                                        float v1_14 = ((v2_8.i / v2_8.h) * v0_35.getLineWidth((v0_35.getLineCount() - 1)));
                                        if (!v2_8.D) {
                                            v10_7.right = (v10_7.left + v1_14);
                                        } else {
                                            v10_7.left = (v10_7.right - v1_14);
                                        }
                                    }
                                    if ((v10_7.width() > 0) && (v10_7.height() > 0)) {
                                        float v2_1 = ((float) this.U);
                                        v10_7.left = (v10_7.left - v2_1);
                                        v10_7.right = (v10_7.right + v2_1);
                                        v10_7.offset(((float) (- this.getPaddingLeft())), ((((float) (- this.getPaddingTop())) - (v10_7.height() / 1073741824)) + ((float) this.a0)));
                                        v10_7.top = 0;
                                        z3.g v0_18 = ((z3.g) this.M);
                                        v0_18.getClass();
                                        v0_18.w(v10_7.left, v10_7.top, v10_7.right, v10_7.bottom);
                                    }
                                    return;
                                } else {
                                    z3.g v0_25 = v4_0.right;
                                }
                            } else {
                                if (!v2_8.D) {
                                    v0_25 = v4_0.right;
                                } else {
                                    v0_24 = v2_8.a0;
                                }
                            }
                            v0_27 = ((float) v0_25);
                        } else {
                            v0_27 = ((((float) v0_20) / 1073741824) + (v2_8.a0 / 1073741824));
                        }
                    }
                } else {
                    if (v3_1 == 0) {
                        v3_9 = ((float) v4_0.right);
                        v10_3 = v2_8.a0;
                    } else {
                        v3_7 = v4_0.left;
                    }
                }
                v3_11 = ((float) v3_7);
            } else {
                v3_9 = (((float) v0_20) / 1073741824);
                v10_3 = (v2_8.a0 / 1073741824);
            }
        }
        return;
    }

    public final void n(n.b1 p2, int p3)
    {
        try {
            p2.setTextAppearance(p3);
        } catch (Exception) {
            p2.setTextAppearance(2132017641);
            p2.setTextColor(e0.c.getColor(this.getContext(), 2131099766));
            return;
        }
        if (p2.getTextColors().getDefaultColor() != -65281) {
            return;
        } else {
            p2.setTextAppearance(2132017641);
            p2.setTextColor(e0.c.getColor(this.getContext(), 2131099766));
            return;
        }
    }

    public final boolean o()
    {
        boolean v0_0 = this.q;
        if ((v0_0.o != 1) || ((v0_0.r == null) || (android.text.TextUtils.isEmpty(v0_0.p)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void onConfigurationChanged(android.content.res.Configuration p2)
    {
        super.onConfigurationChanged(p2);
        this.C0.i(p2);
        return;
    }

    public final void onGlobalLayout()
    {
        android.widget.EditText v0_0 = this.c;
        v0_0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        androidx.lifecycle.g0 v1_2 = 0;
        this.I0 = 0;
        if (this.e != null) {
            android.widget.EditText v0_1 = Math.max(v0_0.getMeasuredHeight(), this.b.getMeasuredHeight());
            if (this.e.getMeasuredHeight() < v0_1) {
                this.e.setMinimumHeight(v0_1);
                v1_2 = 1;
            }
        }
        android.widget.EditText v0_2 = this.s();
        if ((v1_2 == null) && (v0_2 == null)) {
            return;
        } else {
            this.e.post(new androidx.lifecycle.g0(this, 18));
            return;
        }
    }

    public final void onLayout(boolean p8, int p9, int p10, int p11, int p12)
    {
        this = super.onLayout(p8, p9, p10, p11, p12);
        boolean v9_8 = this.e;
        if (v9_8) {
            int v12_7 = this.f0;
            v12_7.set(0, 0, v9_8.getWidth(), v9_8.getHeight());
            q3.c.b(this, v9_8, v12_7);
            boolean v9_3 = this.Q;
            if (v9_3) {
                q3.b v10_1 = v12_7.bottom;
                v9_3.setBounds(v12_7.left, (v10_1 - this.b0), v12_7.right, v10_1);
            }
            boolean v9_9 = this.R;
            if (v9_9) {
                q3.b v10_2 = v12_7.bottom;
                v9_9.setBounds(v12_7.left, (v10_2 - this.c0), v12_7.right, v10_2);
            }
            if (this.J) {
                boolean v9_12 = this.e.getTextSize();
                q3.b v10_3 = this.C0;
                int v1_16 = v10_3.P;
                if (v10_3.h != v9_12) {
                    v10_3.h = v9_12;
                    v10_3.j(0);
                }
                boolean v9_14 = this.e.getGravity();
                int v11_11 = ((v9_14 & -113) | 48);
                if (v10_3.g != v11_11) {
                    v10_3.g = v11_11;
                    v10_3.j(0);
                }
                if (v10_3.f != v9_14) {
                    v10_3.f = v9_14;
                    v10_3.j(0);
                }
                boolean v9_15 = this.d(v12_7);
                int v11_13 = v9_15.left;
                android.graphics.Rect v2_19 = v9_15.top;
                boolean v3_9 = v9_15.right;
                boolean v9_16 = v9_15.bottom;
                android.graphics.Rect v4 = v10_3.d;
                if ((v4.left != v11_13) || ((v4.top != v2_19) || ((v4.right != v3_9) || (v4.bottom != v9_16)))) {
                    v4.set(v11_13, v2_19, v3_9, v9_16);
                    v10_3.N = 1;
                }
                if (this.e == null) {
                    throw new IllegalStateException();
                } else {
                    boolean v9_2;
                    if (this.getHintMaxLines() != 1) {
                        v1_16.setTextSize(v10_3.h);
                        v1_16.setTypeface(v10_3.v);
                        v1_16.setLetterSpacing(v10_3.X);
                        v9_2 = (((float) v10_3.l) * (v1_16.descent() + (- v1_16.ascent())));
                    } else {
                        v1_16.setTextSize(v10_3.h);
                        v1_16.setTypeface(v10_3.v);
                        v1_16.setLetterSpacing(v10_3.X);
                        v9_2 = (- v1_16.ascent());
                    }
                    int v1_4;
                    int v11_2 = this.g0;
                    v11_2.left = (this.e.getCompoundPaddingLeft() + v12_7.left);
                    if ((this.V != 1) || (this.e.getMinLines() > 1)) {
                        if ((this.V == 0) && (this.getHintMaxLines() != 1)) {
                            v1_16.setTextSize(v10_3.h);
                            v1_16.setTypeface(v10_3.v);
                            v1_16.setLetterSpacing(v10_3.X);
                            int v1_3 = ((int) ((- v1_16.ascent()) / 1073741824));
                        } else {
                            v1_3 = 0;
                        }
                        v1_4 = ((this.e.getCompoundPaddingTop() + v12_7.top) - v1_3);
                    } else {
                        v1_4 = ((int) (((float) v12_7.centerY()) - (v9_2 / 1073741824)));
                    }
                    boolean v9_5;
                    v11_2.top = v1_4;
                    v11_2.right = (v12_7.right - this.e.getCompoundPaddingRight());
                    if ((this.V != 1) || (this.e.getMinLines() > 1)) {
                        v9_5 = (v12_7.bottom - this.e.getCompoundPaddingBottom());
                    } else {
                        v9_5 = ((int) (((float) v11_2.top) + v9_2));
                    }
                    v11_2.bottom = v9_5;
                    int v12_6 = v11_2.left;
                    int v1_13 = v11_2.top;
                    int v11_5 = v11_2.right;
                    android.graphics.Rect v2_15 = v10_3.c;
                    if ((v2_15.left != v12_6) || ((v2_15.top != v1_13) || ((v2_15.right != v11_5) || ((v2_15.bottom != v9_5) || (1 != v10_3.k0))))) {
                        v2_15.set(v12_6, v1_13, v11_5, v9_5);
                        v10_3.N = 1;
                        v10_3.k0 = 1;
                    }
                    v10_3.j(0);
                    if ((this.g()) && (!this.B0)) {
                        this.l();
                        return;
                    }
                }
            }
        }
        return;
    }

    public final void onMeasure(int p9, int p10)
    {
        super.onMeasure(p9, p10);
        float v0_4 = this.c;
        if (!this.I0) {
            v0_4.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.I0 = 1;
        }
        if (this.A != null) {
            float v9_2 = this.e;
            if (v9_2 != 0) {
                this.A.setGravity(v9_2.getGravity());
                this.A.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
            }
        }
        v0_4.m();
        if (this.getHintMaxLines() != 1) {
            float v9_19 = ((this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight());
            float v0_9 = this.C0;
            int v2_13 = v0_9.P;
            v2_13.setTextSize(v0_9.i);
            v2_13.setTypeface(v0_9.s);
            v2_13.setLetterSpacing(v0_9.W);
            q3.g v6_2 = ((float) v9_19);
            v0_9.i0 = v0_9.e(v0_9.f0, v2_13, v0_9.B, ((v0_9.i / v0_9.h) * v6_2), v0_9.D).getHeight();
            v2_13.setTextSize(v0_9.h);
            v2_13.setTypeface(v0_9.v);
            v2_13.setLetterSpacing(v0_9.X);
            v0_9.j0 = v0_9.e(v0_9.e0, v2_13, v0_9.B, v6_2, v0_9.D).getHeight();
            float v1_20 = this.e;
            CharSequence v4_16 = this.f0;
            float v5_0 = 0;
            v4_16.set(0, 0, v1_20.getWidth(), v1_20.getHeight());
            q3.c.b(this, v1_20, v4_16);
            float v1_21 = this.d(v4_16);
            int v2_15 = v1_21.left;
            float v3_6 = v1_21.top;
            CharSequence v4_17 = v1_21.right;
            float v1_22 = v1_21.bottom;
            q3.g v6_3 = v0_9.d;
            if ((v6_3.left != v2_15) || ((v6_3.top != v3_6) || ((v6_3.right != v4_17) || (v6_3.bottom != v1_22)))) {
                v6_3.set(v2_15, v3_6, v4_17, v1_22);
                v0_9.N = 1;
            }
            this.v();
            this.a();
            if (this.e != null) {
                float v1_4;
                float v1_1 = v0_9.j0;
                if (v1_1 == -1) {
                    float v1_2 = v0_9.P;
                    v1_2.setTextSize(v0_9.h);
                    v1_2.setTypeface(v0_9.v);
                    v1_2.setLetterSpacing(v0_9.X);
                    v1_4 = (- v1_2.ascent());
                } else {
                    v1_4 = ((float) v1_1);
                }
                float v3_0 = 0;
                if (this.y != null) {
                    int v2_6 = new android.text.TextPaint(129);
                    v2_6.set(this.A.getPaint());
                    v2_6.setTextSize(this.A.getTextSize());
                    v2_6.setTypeface(this.A.getTypeface());
                    v2_6.setLetterSpacing(this.A.getLetterSpacing());
                    q3.g v6_1 = new q3.g(this.y, v2_6, v9_19);
                    if (this.getLayoutDirection() == 1) {
                        v5_0 = 1;
                    }
                    v6_1.k = v5_0;
                    v6_1.j = 1;
                    float v9_6 = this.A.getLineSpacingExtra();
                    int v2_8 = this.A.getLineSpacingMultiplier();
                    v6_1.g = v9_6;
                    v6_1.h = v2_8;
                    v6_1.m = new a5.a(this, 28);
                    float v9_10 = v6_1.a();
                    if (this.V == 1) {
                        v3_0 = ((v0_9.f() + ((float) this.W)) + ((float) this.d));
                    }
                    v3_0 += ((float) v9_10.getHeight());
                }
                float v9_13 = Math.max(v1_4, v3_0);
                if (((float) this.e.getMeasuredHeight()) < v9_13) {
                    this.e.setMinimumHeight(Math.round(v9_13));
                }
            }
        }
        return;
    }

    public final void onRestoreInstanceState(android.os.Parcelable p2)
    {
        if ((p2 instanceof z3.a0)) {
            super.onRestoreInstanceState(((z3.a0) p2).a);
            this.setError(((z3.a0) p2).c);
            if (((z3.a0) p2).d) {
                this.post(new a2.l(this, 10));
            }
            this.requestLayout();
            return;
        } else {
            super.onRestoreInstanceState(p2);
            return;
        }
    }

    public final void onRtlPropertiesChanged(int p14)
    {
        super.onRtlPropertiesChanged(p14);
        int v0 = 1;
        if (p14 != 1) {
            v0 = 0;
        }
        if (v0 != this.T) {
            v3.a v1_3 = this.h0;
            v3.a v14_1 = this.S.e.a(v1_3);
            v3.a v2_2 = this.S.f.a(v1_3);
            v3.p v3_2 = this.S.h.a(v1_3);
            v3.a v1_0 = this.S.g.a(v1_3);
            j5.t1 v4_2 = this.S;
            j5.t1 v5 = v4_2.a;
            j5.t1 v6 = v4_2.b;
            j5.t1 v7 = v4_2.d;
            j5.t1 v4_3 = v4_2.c;
            v3.f v8_1 = new v3.f();
            v3.f v9_1 = new v3.f();
            v3.f v10_1 = new v3.f();
            v3.f v11_1 = new v3.f();
            v3.a v12_1 = new v3.a(v2_2);
            v3.a v2_4 = new v3.a(v14_1);
            v3.a v14_4 = new v3.a(v1_0);
            v3.a v1_2 = new v3.a(v3_2);
            v3.p v3_4 = new v3.p();
            v3_4.a = v6;
            v3_4.b = v5;
            v3_4.c = v7;
            v3_4.d = v4_3;
            v3_4.e = v12_1;
            v3_4.f = v2_4;
            v3_4.g = v1_2;
            v3_4.h = v14_4;
            v3_4.i = v8_1;
            v3_4.j = v9_1;
            v3_4.k = v10_1;
            v3_4.l = v11_1;
            this.T = v0;
            this.setShapeAppearanceModel(v3_4);
        }
        return;
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        z3.a0 v1_1 = new z3.a0(super.onSaveInstanceState());
        if (this.o()) {
            v1_1.c = this.getError();
        }
        int v0_4;
        int v0_1 = this.c;
        if ((v0_1.o == 0) || (!v0_1.m.d)) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        v1_1.d = v0_4;
        return v1_1;
    }

    public final void p(android.text.Editable p10)
    {
        android.text.SpannableStringBuilder v10_1;
        ((r2.q) this.u).getClass();
        if (p10 == null) {
            v10_1 = 0;
        } else {
            v10_1 = p10.length();
        }
        boolean v1 = this.t;
        o0.b v2_8 = this.s;
        String v4 = 0;
        if (v2_8 != -1) {
            o0.b v2_0;
            if (v10_1 <= v2_8) {
                v2_0 = 0;
            } else {
                v2_0 = 1;
            }
            int v7_1;
            this.t = v2_0;
            o0.b v2_1 = this.getContext();
            if (!this.t) {
                v7_1 = 2131951737;
            } else {
                v7_1 = 2131951738;
            }
            this.v.setContentDescription(v2_1.getString(v7_1, new Object[] {Integer.valueOf(v10_1), Integer.valueOf(this.s)})));
            if (v1 != this.t) {
                this.q();
            }
            o0.b v2_6;
            if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) != 1) {
                v2_6 = o0.b.d;
            } else {
                v2_6 = o0.b.e;
            }
            n.b1 v3_2 = this.v;
            android.text.SpannableStringBuilder v10_4 = this.getContext().getString(2131951739, new Object[] {Integer.valueOf(v10_1), Integer.valueOf(this.s)}));
            v2_6.getClass();
            if (v10_4 != null) {
                v4 = v2_6.c(v10_4).toString();
            }
            v3_2.setText(v4);
        } else {
            this.v.setText(String.valueOf(v10_1));
            this.v.setContentDescription(0);
            this.t = 0;
        }
        if ((this.e != null) && (v1 != this.t)) {
            this.w(0, 0);
            this.z();
            this.t();
        }
        return;
    }

    public final void q()
    {
        android.content.res.ColorStateList v0_0 = this.v;
        if (v0_0 != null) {
            n.b1 v1_3;
            if (!this.t) {
                v1_3 = this.x;
            } else {
                v1_3 = this.w;
            }
            this.n(v0_0, v1_3);
            if (!this.t) {
                android.content.res.ColorStateList v0_4 = this.F;
                if (v0_4 != null) {
                    this.v.setTextColor(v0_4);
                }
            }
            if (this.t) {
                android.content.res.ColorStateList v0_2 = this.G;
                if (v0_2 != null) {
                    this.v.setTextColor(v0_2);
                }
            }
        }
        return;
    }

    public final void r()
    {
        boolean v0_0 = this.H;
        if (!v0_0) {
            boolean v0_2 = this.getContext();
            android.graphics.drawable.Drawable v1_6 = c4.b.T(v0_2, 2130968847);
            if (v1_6 != null) {
                int v3 = v1_6.resourceId;
                if (v3 == 0) {
                    boolean v0_1 = v1_6.data;
                    if (v0_1) {
                        v0_0 = android.content.res.ColorStateList.valueOf(v0_1);
                        android.graphics.drawable.Drawable v1_0 = this.e;
                        if ((v1_0 != null) && (v1_0.getTextCursorDrawable() != null)) {
                            android.graphics.drawable.Drawable vtmp6 = this.e.getTextCursorDrawable().mutate();
                            if ((this.o()) || ((this.v != null) && (this.t))) {
                                boolean v2_3 = this.I;
                                if (v2_3) {
                                    v0_0 = v2_3;
                                }
                            }
                            vtmp6.setTintList(v0_0);
                        }
                        return;
                    }
                } else {
                    v0_0 = e0.c.getColorStateList(v0_2, v3);
                }
            }
            v0_0 = 0;
        }
    }

    public final boolean s()
    {
        if (this.e != null) {
            android.widget.EditText v0_16;
            com.google.android.material.internal.CheckableImageButton v2_0 = 0;
            android.widget.EditText v5 = 1;
            if ((this.getStartIconDrawable() == null) && ((this.getPrefixText() == null) || (this.getPrefixTextView().getVisibility() != 0))) {
                if (this.j0 == null) {
                    v0_16 = 0;
                } else {
                    android.widget.EditText v0_9 = this.e.getCompoundDrawablesRelative();
                    this.e.setCompoundDrawablesRelative(0, v0_9[1], v0_9[2], v0_9[3]);
                    this.j0 = 0;
                    v0_16 = 1;
                }
            } else {
                android.widget.EditText v0_6 = this.b;
                if (v0_6.getMeasuredWidth() <= 0) {
                } else {
                    android.widget.EditText v0_12 = (v0_6.getMeasuredWidth() - this.e.getPaddingLeft());
                    if ((this.j0 == null) || (this.k0 != v0_12)) {
                        android.graphics.drawable.ColorDrawable v6_14 = new android.graphics.drawable.ColorDrawable();
                        this.j0 = v6_14;
                        this.k0 = v0_12;
                        v6_14.setBounds(0, 0, v0_12, 1);
                    }
                    android.widget.EditText v0_15 = this.e.getCompoundDrawablesRelative();
                    int v7_2 = this.j0;
                    if (v0_15[0] == v7_2) {
                    } else {
                        this.e.setCompoundDrawablesRelative(v7_2, v0_15[1], v0_15[2], v0_15[3]);
                    }
                }
            }
            android.graphics.drawable.ColorDrawable v6_17 = this.c;
            if ((((!v6_17.e()) && ((v6_17.o == 0) || (!v6_17.d()))) && (v6_17.v == null)) || (v6_17.getMeasuredWidth() <= 0)) {
                if (this.m0 != null) {
                    android.graphics.drawable.ColorDrawable v6_20 = this.e.getCompoundDrawablesRelative();
                    if (v6_20[2] != this.m0) {
                        v5 = v0_16;
                    } else {
                        this.e.setCompoundDrawablesRelative(v6_20[0], v6_20[1], this.o0, v6_20[3]);
                    }
                    this.m0 = 0;
                    return v5;
                }
            } else {
                int v7_0 = (v6_17.w.getMeasuredWidth() - this.e.getPaddingRight());
                if (!v6_17.e()) {
                    if ((v6_17.o != 0) && (v6_17.d())) {
                        v2_0 = v6_17.m;
                    }
                } else {
                    v2_0 = v6_17.c;
                }
                if (v2_0 != null) {
                    v7_0 = (((android.view.ViewGroup$MarginLayoutParams) v2_0.getLayoutParams()).getMarginStart() + (v2_0.getMeasuredWidth() + v7_0));
                }
                com.google.android.material.internal.CheckableImageButton v2_5 = this.e.getCompoundDrawablesRelative();
                android.graphics.drawable.ColorDrawable v6_2 = this.m0;
                if ((v6_2 == null) || (this.n0 == v7_0)) {
                    if (v6_2 == null) {
                        android.graphics.drawable.ColorDrawable v6_4 = new android.graphics.drawable.ColorDrawable();
                        this.m0 = v6_4;
                        this.n0 = v7_0;
                        v6_4.setBounds(0, 0, v7_0, 1);
                    }
                    com.google.android.material.internal.CheckableImageButton v3_0 = v2_5[2];
                    android.graphics.drawable.ColorDrawable v6_5 = this.m0;
                    if (v3_0 != v6_5) {
                        this.o0 = v3_0;
                        this.e.setCompoundDrawablesRelative(v2_5[0], v2_5[1], v6_5, v2_5[3]);
                        return 1;
                    }
                } else {
                    this.n0 = v7_0;
                    v6_2.setBounds(0, 0, v7_0, 1);
                    this.e.setCompoundDrawablesRelative(v2_5[0], v2_5[1], this.m0, v2_5[3]);
                    return 1;
                }
            }
            return v0_16;
        } else {
            return 0;
        }
    }

    public void setBoxBackgroundColor(int p2)
    {
        if (this.e0 != p2) {
            this.e0 = p2;
            this.v0 = p2;
            this.x0 = p2;
            this.y0 = p2;
            this.c();
        }
        return;
    }

    public void setBoxBackgroundColorResource(int p2)
    {
        this.setBoxBackgroundColor(e0.c.getColor(this.getContext(), p2));
        return;
    }

    public void setBoxBackgroundColorStateList(android.content.res.ColorStateList p4)
    {
        int[] v0_0 = p4.getDefaultColor();
        this.v0 = v0_0;
        this.e0 = v0_0;
        this.w0 = p4.getColorForState(new int[] {-16842910}), -1);
        this.x0 = p4.getColorForState(new int[] {16842908, 16842910}), -1);
        this.y0 = p4.getColorForState(new int[] {16843623, 16842910}), -1);
        this.c();
        return;
    }

    public void setBoxBackgroundMode(int p2)
    {
        if (p2 != this.V) {
            this.V = p2;
            if (this.e != null) {
                this.k();
            }
        }
        return;
    }

    public void setBoxCollapsedPaddingTop(int p1)
    {
        this.W = p1;
        return;
    }

    public void setBoxCornerFamily(int p4)
    {
        v3.o v0_1 = this.S.f();
        v3.d v1_6 = this.S.e;
        v0_1.a = q4.b.j(p4);
        v0_1.e = v1_6;
        v3.d v1_0 = this.S.f;
        v0_1.b = q4.b.j(p4);
        v0_1.f = v1_0;
        v3.d v1_2 = this.S.h;
        v0_1.d = q4.b.j(p4);
        v0_1.h = v1_2;
        v3.d v1_4 = this.S.g;
        v0_1.c = q4.b.j(p4);
        v0_1.g = v1_4;
        this.S = v0_1.a();
        this.c();
        return;
    }

    public void setBoxStrokeColor(int p2)
    {
        if (this.t0 != p2) {
            this.t0 = p2;
            this.z();
        }
        return;
    }

    public void setBoxStrokeColorStateList(android.content.res.ColorStateList p4)
    {
        if (!p4.isStateful()) {
            if (this.t0 != p4.getDefaultColor()) {
                this.t0 = p4.getDefaultColor();
            }
        } else {
            this.r0 = p4.getDefaultColor();
            this.z0 = p4.getColorForState(new int[] {-16842910}), -1);
            this.s0 = p4.getColorForState(new int[] {16843623, 16842910}), -1);
            this.t0 = p4.getColorForState(new int[] {16842908, 16842910}), -1);
        }
        this.z();
        return;
    }

    public void setBoxStrokeErrorColor(android.content.res.ColorStateList p2)
    {
        if (this.u0 != p2) {
            this.u0 = p2;
            this.z();
        }
        return;
    }

    public void setBoxStrokeWidth(int p1)
    {
        this.b0 = p1;
        this.z();
        return;
    }

    public void setBoxStrokeWidthFocused(int p1)
    {
        this.c0 = p1;
        this.z();
        return;
    }

    public void setBoxStrokeWidthFocusedResource(int p2)
    {
        this.setBoxStrokeWidthFocused(this.getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setBoxStrokeWidthResource(int p2)
    {
        this.setBoxStrokeWidth(this.getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setCounterEnabled(boolean p6)
    {
        if (this.r != p6) {
            int v1_0 = this.q;
            android.text.Editable v2 = 0;
            if (!p6) {
                v1_0.g(this.v, 2);
                this.v = 0;
            } else {
                int v3_0 = new n.b1(this.getContext(), 0);
                this.v = v3_0;
                v3_0.setId(2131362503);
                int v3_1 = this.i0;
                if (v3_1 != 0) {
                    this.v.setTypeface(v3_1);
                }
                this.v.setMaxLines(1);
                v1_0.a(this.v, 2);
                ((android.view.ViewGroup$MarginLayoutParams) this.v.getLayoutParams()).setMarginStart(this.getResources().getDimensionPixelOffset(2131166203));
                this.q();
                if (this.v != null) {
                    android.widget.EditText v0_6 = this.e;
                    if (v0_6 != null) {
                        v2 = v0_6.getText();
                    }
                    this.p(v2);
                }
            }
            this.r = p6;
        }
        return;
    }

    public void setCounterMaxLength(int p2)
    {
        if (this.s != p2) {
            if (p2 <= null) {
                this.s = -1;
            } else {
                this.s = p2;
            }
            if ((this.r) && (this.v != null)) {
                android.text.Editable v2_2;
                android.text.Editable v2_1 = this.e;
                if (v2_1 != null) {
                    v2_2 = v2_1.getText();
                } else {
                    v2_2 = 0;
                }
                this.p(v2_2);
            }
        }
        return;
    }

    public void setCounterOverflowTextAppearance(int p2)
    {
        if (this.w != p2) {
            this.w = p2;
            this.q();
        }
        return;
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList p2)
    {
        if (this.G != p2) {
            this.G = p2;
            this.q();
        }
        return;
    }

    public void setCounterTextAppearance(int p2)
    {
        if (this.x != p2) {
            this.x = p2;
            this.q();
        }
        return;
    }

    public void setCounterTextColor(android.content.res.ColorStateList p2)
    {
        if (this.F != p2) {
            this.F = p2;
            this.q();
        }
        return;
    }

    public void setCursorColor(android.content.res.ColorStateList p2)
    {
        if (this.H != p2) {
            this.H = p2;
            this.r();
        }
        return;
    }

    public void setCursorErrorColor(android.content.res.ColorStateList p2)
    {
        if (this.I != p2) {
            this.I = p2;
            if ((!this.o()) && ((this.v == null) || (!this.t))) {
                return;
            } else {
                this.r();
            }
        }
        return;
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList p1)
    {
        this.p0 = p1;
        this.q0 = p1;
        if (this.e != null) {
            this.w(0, 0);
        }
        return;
    }

    public void setEnabled(boolean p1)
    {
        com.google.android.material.textfield.TextInputLayout.m(this, p1);
        super.setEnabled(p1);
        return;
    }

    public void setEndIconActivated(boolean p2)
    {
        this.c.m.setActivated(p2);
        return;
    }

    public void setEndIconCheckable(boolean p2)
    {
        this.c.m.setCheckable(p2);
        return;
    }

    public void setEndIconContentDescription(int p3)
    {
        int v3_1;
        com.google.android.material.internal.CheckableImageButton v0_0 = this.c;
        if (p3 == 0) {
            v3_1 = 0;
        } else {
            v3_1 = v0_0.getResources().getText(p3);
        }
        com.google.android.material.internal.CheckableImageButton v0_1 = v0_0.m;
        if (v0_1.getContentDescription() != v3_1) {
            v0_1.setContentDescription(v3_1);
        }
        return;
    }

    public void setEndIconContentDescription(CharSequence p3)
    {
        com.google.android.material.internal.CheckableImageButton v0_1 = this.c.m;
        if (v0_1.getContentDescription() != p3) {
            v0_1.setContentDescription(p3);
        }
        return;
    }

    public void setEndIconDrawable(int p5)
    {
        android.content.res.ColorStateList v5_3;
        z3.o v0 = this.c;
        if (p5 == null) {
            v5_3 = 0;
        } else {
            v5_3 = j5.t1.A(v0.getContext(), p5);
        }
        com.google.android.material.textfield.TextInputLayout v1_1 = v0.a;
        com.google.android.material.internal.CheckableImageButton v2 = v0.m;
        v2.setImageDrawable(v5_3);
        if (v5_3 != null) {
            y0.d.a(v1_1, v2, v0.q, v0.r);
            y0.d.h(v1_1, v2, v0.q);
        }
        return;
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable p5)
    {
        z3.o v0 = this.c;
        com.google.android.material.textfield.TextInputLayout v1 = v0.a;
        com.google.android.material.internal.CheckableImageButton v2 = v0.m;
        v2.setImageDrawable(p5);
        if (p5 != null) {
            y0.d.a(v1, v2, v0.q, v0.r);
            y0.d.h(v1, v2, v0.q);
        }
        return;
    }

    public void setEndIconMinSize(int p3)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.c;
        if (p3 < null) {
            v0_0.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else {
            if (p3 != v0_0.s) {
                v0_0.s = p3;
                com.google.android.material.internal.CheckableImageButton v1_0 = v0_0.m;
                v1_0.setMinimumWidth(p3);
                v1_0.setMinimumHeight(p3);
                com.google.android.material.internal.CheckableImageButton v0_1 = v0_0.c;
                v0_1.setMinimumWidth(p3);
                v0_1.setMinimumHeight(p3);
            }
            return;
        }
    }

    public void setEndIconMode(int p2)
    {
        this.c.g(p2);
        return;
    }

    public void setEndIconOnClickListener(android.view.View$OnClickListener p3)
    {
        android.view.View$OnLongClickListener v0_0 = this.c;
        com.google.android.material.internal.CheckableImageButton v1 = v0_0.m;
        android.view.View$OnLongClickListener v0_1 = v0_0.u;
        v1.setOnClickListener(p3);
        y0.d.i(v1, v0_1);
        return;
    }

    public void setEndIconOnLongClickListener(android.view.View$OnLongClickListener p2)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.c;
        v0_0.u = p2;
        com.google.android.material.internal.CheckableImageButton v0_1 = v0_0.m;
        v0_1.setOnLongClickListener(p2);
        y0.d.i(v0_1, p2);
        return;
    }

    public void setEndIconScaleType(android.widget.ImageView$ScaleType p3)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.c;
        v0_0.t = p3;
        v0_0.m.setScaleType(p3);
        v0_0.c.setScaleType(p3);
        return;
    }

    public void setEndIconTintList(android.content.res.ColorStateList p4)
    {
        android.graphics.PorterDuff$Mode v0_0 = this.c;
        if (v0_0.q != p4) {
            v0_0.q = p4;
            y0.d.a(v0_0.a, v0_0.m, p4, v0_0.r);
        }
        return;
    }

    public void setEndIconTintMode(android.graphics.PorterDuff$Mode p4)
    {
        android.content.res.ColorStateList v0_0 = this.c;
        if (v0_0.r != p4) {
            v0_0.r = p4;
            y0.d.a(v0_0.a, v0_0.m, v0_0.q, p4);
        }
        return;
    }

    public void setEndIconVisible(boolean p2)
    {
        this.c.h(p2);
        return;
    }

    public void setError(CharSequence p5)
    {
        z3.s v0 = this.q;
        if (!v0.q) {
            if (!android.text.TextUtils.isEmpty(p5)) {
                this.setErrorEnabled(1);
            } else {
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(p5)) {
            v0.f();
            return;
        } else {
            v0.c();
            v0.p = p5;
            v0.r.setText(p5);
            int v1_2 = v0.n;
            if (v1_2 != 1) {
                v0.o = 1;
            }
            v0.i(v1_2, v0.h(v0.r, p5), v0.o);
            return;
        }
    }

    public void setErrorAccessibilityLiveRegion(int p2)
    {
        n.b1 v0_0 = this.q;
        v0_0.t = p2;
        n.b1 v0_1 = v0_0.r;
        if (v0_1 != null) {
            v0_1.setAccessibilityLiveRegion(p2);
        }
        return;
    }

    public void setErrorContentDescription(CharSequence p2)
    {
        n.b1 v0_0 = this.q;
        v0_0.s = p2;
        n.b1 v0_1 = v0_0.r;
        if (v0_1 != null) {
            v0_1.setContentDescription(p2);
        }
        return;
    }

    public void setErrorEnabled(boolean p6)
    {
        z3.s v0 = this.q;
        n.b1 v1_0 = v0.h;
        if (v0.q != p6) {
            v0.c();
            if (!p6) {
                v0.f();
                v0.g(v0.r, 0);
                v0.r = 0;
                v1_0.t();
                v1_0.z();
            } else {
                n.b1 v1_2 = new n.b1(v0.g, 0);
                v0.r = v1_2;
                v1_2.setId(2131362504);
                v0.r.setTextAlignment(5);
                n.b1 v1_4 = v0.B;
                if (v1_4 != null) {
                    v0.r.setTypeface(v1_4);
                }
                n.b1 v1_5 = v0.u;
                v0.u = v1_5;
                int v3_3 = v0.r;
                if (v3_3 != 0) {
                    v0.h.n(v3_3, v1_5);
                }
                n.b1 v1_6 = v0.v;
                v0.v = v1_6;
                int v3_4 = v0.r;
                if ((v3_4 != 0) && (v1_6 != null)) {
                    v3_4.setTextColor(v1_6);
                }
                n.b1 v1_7 = v0.s;
                v0.s = v1_7;
                int v3_5 = v0.r;
                if (v3_5 != 0) {
                    v3_5.setContentDescription(v1_7);
                }
                n.b1 v1_8 = v0.t;
                v0.t = v1_8;
                int v3_6 = v0.r;
                if (v3_6 != 0) {
                    v3_6.setAccessibilityLiveRegion(v1_8);
                }
                v0.r.setVisibility(4);
                v0.a(v0.r, 0);
            }
            v0.q = p6;
            return;
        } else {
            return;
        }
    }

    public void setErrorIconDrawable(int p3)
    {
        com.google.android.material.textfield.TextInputLayout v3_1;
        android.content.res.ColorStateList v0_0 = this.c;
        if (p3 == null) {
            v3_1 = 0;
        } else {
            v3_1 = j5.t1.A(v0_0.getContext(), p3);
        }
        v0_0.i(v3_1);
        y0.d.h(v0_0.a, v0_0.c, v0_0.d);
        return;
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable p2)
    {
        this.c.i(p2);
        return;
    }

    public void setErrorIconOnClickListener(android.view.View$OnClickListener p3)
    {
        android.view.View$OnLongClickListener v0_0 = this.c;
        com.google.android.material.internal.CheckableImageButton v1 = v0_0.c;
        android.view.View$OnLongClickListener v0_1 = v0_0.f;
        v1.setOnClickListener(p3);
        y0.d.i(v1, v0_1);
        return;
    }

    public void setErrorIconOnLongClickListener(android.view.View$OnLongClickListener p2)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.c;
        v0_0.f = p2;
        com.google.android.material.internal.CheckableImageButton v0_1 = v0_0.c;
        v0_1.setOnLongClickListener(p2);
        y0.d.i(v0_1, p2);
        return;
    }

    public void setErrorIconTintList(android.content.res.ColorStateList p4)
    {
        android.graphics.PorterDuff$Mode v0_0 = this.c;
        if (v0_0.d != p4) {
            v0_0.d = p4;
            y0.d.a(v0_0.a, v0_0.c, p4, v0_0.e);
        }
        return;
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff$Mode p4)
    {
        android.content.res.ColorStateList v0_0 = this.c;
        if (v0_0.e != p4) {
            v0_0.e = p4;
            y0.d.a(v0_0.a, v0_0.c, v0_0.d, p4);
        }
        return;
    }

    public void setErrorTextAppearance(int p3)
    {
        com.google.android.material.textfield.TextInputLayout v0_0 = this.q;
        v0_0.u = p3;
        n.b1 v1 = v0_0.r;
        if (v1 != null) {
            v0_0.h.n(v1, p3);
        }
        return;
    }

    public void setErrorTextColor(android.content.res.ColorStateList p2)
    {
        n.b1 v0_0 = this.q;
        v0_0.v = p2;
        n.b1 v0_1 = v0_0.r;
        if ((v0_1 != null) && (p2 != null)) {
            v0_1.setTextColor(p2);
        }
        return;
    }

    public void setExpandedHintEnabled(boolean p2)
    {
        if (this.D0 != p2) {
            this.D0 = p2;
            this.w(0, 0);
        }
        return;
    }

    public void setHelperText(CharSequence p5)
    {
        z3.s v1 = this.q;
        if (!android.text.TextUtils.isEmpty(p5)) {
            if (!v1.x) {
                this.setHelperTextEnabled(1);
            }
            v1.c();
            v1.w = p5;
            v1.y.setText(p5);
            int v0_2 = v1.n;
            if (v0_2 != 2) {
                v1.o = 2;
            }
            v1.i(v0_2, v1.h(v1.y, p5), v1.o);
            return;
        } else {
            if (v1.x) {
                this.setHelperTextEnabled(0);
            }
            return;
        }
    }

    public void setHelperTextColor(android.content.res.ColorStateList p2)
    {
        n.b1 v0_0 = this.q;
        v0_0.A = p2;
        n.b1 v0_1 = v0_0.y;
        if ((v0_1 != null) && (p2 != null)) {
            v0_1.setTextColor(p2);
        }
        return;
    }

    public void setHelperTextEnabled(boolean p9)
    {
        z3.s v0 = this.q;
        n.b1 v1_0 = v0.h;
        if (v0.x != p9) {
            v0.c();
            if (!p9) {
                v0.c();
                n.b1 v4_2 = v0.n;
                if (v4_2 == 2) {
                    v0.o = 0;
                }
                v0.i(v4_2, v0.h(v0.y, ""), v0.o);
                v0.g(v0.y, 1);
                v0.y = 0;
                v1_0.t();
                v1_0.z();
            } else {
                n.b1 v1_2 = new n.b1(v0.g, 0);
                v0.y = v1_2;
                v1_2.setId(2131362505);
                v0.y.setTextAlignment(5);
                n.b1 v1_4 = v0.B;
                if (v1_4 != null) {
                    v0.y.setTypeface(v1_4);
                }
                v0.y.setVisibility(4);
                v0.y.setAccessibilityLiveRegion(1);
                n.b1 v1_7 = v0.z;
                v0.z = v1_7;
                z3.r v2_5 = v0.y;
                if (v2_5 != null) {
                    v2_5.setTextAppearance(v1_7);
                }
                n.b1 v1_8 = v0.A;
                v0.A = v1_8;
                z3.r v2_7 = v0.y;
                if ((v2_7 != null) && (v1_8 != null)) {
                    v2_7.setTextColor(v1_8);
                }
                v0.a(v0.y, 1);
                v0.y.setAccessibilityDelegate(new z3.r(v0));
            }
            v0.x = p9;
            return;
        } else {
            return;
        }
    }

    public void setHelperTextTextAppearance(int p2)
    {
        n.b1 v0_0 = this.q;
        v0_0.z = p2;
        n.b1 v0_1 = v0_0.y;
        if (v0_1 != null) {
            v0_1.setTextAppearance(p2);
        }
        return;
    }

    public void setHint(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = this.getResources().getText(p2);
        }
        this.setHint(v2_1);
        return;
    }

    public void setHint(CharSequence p2)
    {
        if (this.J) {
            this.setHintInternal(p2);
            this.sendAccessibilityEvent(2048);
        }
        return;
    }

    public void setHintAnimationEnabled(boolean p1)
    {
        this.E0 = p1;
        return;
    }

    public void setHintEnabled(boolean p3)
    {
        if (p3 != this.J) {
            this.J = p3;
            if (p3 != null) {
                android.widget.EditText v3_12 = this.e.getHint();
                if (!android.text.TextUtils.isEmpty(v3_12)) {
                    if (android.text.TextUtils.isEmpty(this.K)) {
                        this.setHint(v3_12);
                    }
                    this.e.setHint(0);
                }
                this.L = 1;
            } else {
                this.L = 0;
                if ((!android.text.TextUtils.isEmpty(this.K)) && (android.text.TextUtils.isEmpty(this.e.getHint()))) {
                    this.e.setHint(this.K);
                }
                this.setHintInternal(0);
            }
            if (this.e != null) {
                this.v();
            }
        }
        return;
    }

    public void setHintMaxLines(int p4)
    {
        q3.b v0 = this.C0;
        if (p4 != v0.f0) {
            v0.f0 = p4;
            v0.j(0);
        }
        if (p4 != v0.e0) {
            v0.e0 = p4;
            v0.j(0);
        }
        this.requestLayout();
        return;
    }

    public void setHintTextAppearance(int p6)
    {
        q3.b v1 = this.C0;
        s3.a v2_0 = v1.a;
        android.widget.EditText v0_3 = new s3.d(v2_0.getContext(), p6);
        int v6_11 = v0_3.k;
        if (v6_11 != 0) {
            v1.k = v6_11;
        }
        int v6_12 = v0_3.l;
        if (v6_12 != 0) {
            v1.i = v6_12;
        }
        int v6_1 = v0_3.a;
        if (v6_1 != 0) {
            v1.V = v6_1;
        }
        v1.T = v0_3.f;
        v1.U = v0_3.g;
        v1.S = v0_3.h;
        v1.W = v0_3.j;
        int v6_6 = v1.z;
        if (v6_6 != 0) {
            v6_6.h = 1;
        }
        j6.o v3_4 = new j6.o(v1, 10);
        v0_3.a();
        v1.z = new s3.a(v3_4, v0_3.p);
        v0_3.b(v2_0.getContext(), v1.z);
        v1.j(0);
        this.q0 = v1.k;
        if (this.e != null) {
            this.w(0, 0);
            this.v();
        }
        return;
    }

    public void setHintTextColor(android.content.res.ColorStateList p4)
    {
        if (this.q0 != p4) {
            if (this.p0 == null) {
                q3.b v0_2 = this.C0;
                if (v0_2.k != p4) {
                    v0_2.k = p4;
                    v0_2.j(0);
                }
            }
            this.q0 = p4;
            if (this.e != null) {
                this.w(0, 0);
            }
        }
        return;
    }

    public void setLengthCounter(z3.z p1)
    {
        this.u = p1;
        return;
    }

    public void setMaxEms(int p3)
    {
        this.n = p3;
        android.widget.EditText v0 = this.e;
        if ((v0 != null) && (p3 != -1)) {
            v0.setMaxEms(p3);
        }
        return;
    }

    public void setMaxWidth(int p3)
    {
        this.p = p3;
        android.widget.EditText v0 = this.e;
        if ((v0 != null) && (p3 != -1)) {
            v0.setMaxWidth(p3);
        }
        return;
    }

    public void setMaxWidthResource(int p2)
    {
        this.setMaxWidth(this.getContext().getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setMinEms(int p3)
    {
        this.m = p3;
        android.widget.EditText v0 = this.e;
        if ((v0 != null) && (p3 != -1)) {
            v0.setMinEms(p3);
        }
        return;
    }

    public void setMinWidth(int p3)
    {
        this.o = p3;
        android.widget.EditText v0 = this.e;
        if ((v0 != null) && (p3 != -1)) {
            v0.setMinWidth(p3);
        }
        return;
    }

    public void setMinWidthResource(int p2)
    {
        this.setMinWidth(this.getContext().getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setPasswordVisibilityToggleContentDescription(int p3)
    {
        int v3_1;
        com.google.android.material.internal.CheckableImageButton v0_0 = this.c;
        if (p3 == 0) {
            v3_1 = 0;
        } else {
            v3_1 = v0_0.getResources().getText(p3);
        }
        v0_0.m.setContentDescription(v3_1);
        return;
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence p2)
    {
        this.c.m.setContentDescription(p2);
        return;
    }

    public void setPasswordVisibilityToggleDrawable(int p3)
    {
        int v3_1;
        com.google.android.material.internal.CheckableImageButton v0_0 = this.c;
        if (p3 == 0) {
            v3_1 = 0;
        } else {
            v3_1 = j5.t1.A(v0_0.getContext(), p3);
        }
        v0_0.m.setImageDrawable(v3_1);
        return;
    }

    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable p2)
    {
        this.c.m.setImageDrawable(p2);
        return;
    }

    public void setPasswordVisibilityToggleEnabled(boolean p4)
    {
        z3.o v0 = this.c;
        if ((p4 == 0) || (v0.o == 1)) {
            if (p4 != 0) {
                v0.getClass();
                return;
            } else {
                v0.g(0);
                return;
            }
        } else {
            v0.g(1);
            return;
        }
    }

    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList p4)
    {
        android.graphics.PorterDuff$Mode v0_0 = this.c;
        v0_0.q = p4;
        y0.d.a(v0_0.a, v0_0.m, p4, v0_0.r);
        return;
    }

    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff$Mode p4)
    {
        android.content.res.ColorStateList v0_0 = this.c;
        v0_0.r = p4;
        y0.d.a(v0_0.a, v0_0.m, v0_0.q, p4);
        return;
    }

    public void setPlaceholderText(CharSequence p6)
    {
        android.text.Editable v1 = 0;
        if (this.A == null) {
            boolean v0_11 = new n.b1(this.getContext(), 0);
            this.A = v0_11;
            v0_11.setId(2131362506);
            this.A.setImportantForAccessibility(1);
            this.A.setAccessibilityLiveRegion(1);
            boolean v0_3 = this.f();
            this.D = v0_3;
            v0_3.b = 67;
            this.E = this.f();
            this.setPlaceholderTextAppearance(this.C);
            this.setPlaceholderTextColor(this.B);
            q0.q0.n(this.A, new com.google.android.material.datepicker.h(4));
        }
        if (!android.text.TextUtils.isEmpty(p6)) {
            if (!this.z) {
                this.setPlaceholderTextEnabled(1);
            }
            this.y = p6;
        } else {
            this.setPlaceholderTextEnabled(0);
        }
        android.widget.EditText v6_2 = this.e;
        if (v6_2 != null) {
            v1 = v6_2.getText();
        }
        this.x(v1);
        return;
    }

    public void setPlaceholderTextAppearance(int p2)
    {
        this.C = p2;
        n.b1 v0 = this.A;
        if (v0 != null) {
            v0.setTextAppearance(p2);
        }
        return;
    }

    public void setPlaceholderTextColor(android.content.res.ColorStateList p2)
    {
        if (this.B != p2) {
            this.B = p2;
            n.b1 v0_1 = this.A;
            if ((v0_1 != null) && (p2 != null)) {
                v0_1.setTextColor(p2);
            }
        }
        return;
    }

    public void setPrefixText(CharSequence p3)
    {
        n.b1 v1_1;
        z3.w v0 = this.b;
        v0.getClass();
        if (!android.text.TextUtils.isEmpty(p3)) {
            v1_1 = p3;
        } else {
            v1_1 = 0;
        }
        v0.c = v1_1;
        v0.b.setText(p3);
        v0.e();
        return;
    }

    public void setPrefixTextAppearance(int p2)
    {
        this.b.b.setTextAppearance(p2);
        return;
    }

    public void setPrefixTextColor(android.content.res.ColorStateList p2)
    {
        this.b.b.setTextColor(p2);
        return;
    }

    public void setShapeAppearanceModel(v3.p p2)
    {
        v3.p v0_0 = this.M;
        if ((v0_0 != null) && (v0_0.b.a != p2)) {
            this.S = p2;
            this.c();
        }
        return;
    }

    public void setStartIconCheckable(boolean p2)
    {
        this.b.d.setCheckable(p2);
        return;
    }

    public void setStartIconContentDescription(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = this.getResources().getText(p2);
        }
        this.setStartIconContentDescription(v2_1);
        return;
    }

    public void setStartIconContentDescription(CharSequence p3)
    {
        com.google.android.material.internal.CheckableImageButton v0_1 = this.b.d;
        if (v0_1.getContentDescription() != p3) {
            v0_1.setContentDescription(p3);
        }
        return;
    }

    public void setStartIconDrawable(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = j5.t1.A(this.getContext(), p2);
        }
        this.setStartIconDrawable(v2_1);
        return;
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable p2)
    {
        this.b.b(p2);
        return;
    }

    public void setStartIconMinSize(int p3)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.b;
        if (p3 < null) {
            v0_0.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else {
            if (p3 != v0_0.m) {
                v0_0.m = p3;
                com.google.android.material.internal.CheckableImageButton v0_1 = v0_0.d;
                v0_1.setMinimumWidth(p3);
                v0_1.setMinimumHeight(p3);
            }
            return;
        }
    }

    public void setStartIconOnClickListener(android.view.View$OnClickListener p3)
    {
        android.view.View$OnLongClickListener v0_0 = this.b;
        com.google.android.material.internal.CheckableImageButton v1 = v0_0.d;
        android.view.View$OnLongClickListener v0_1 = v0_0.o;
        v1.setOnClickListener(p3);
        y0.d.i(v1, v0_1);
        return;
    }

    public void setStartIconOnLongClickListener(android.view.View$OnLongClickListener p2)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.b;
        v0_0.o = p2;
        com.google.android.material.internal.CheckableImageButton v0_1 = v0_0.d;
        v0_1.setOnLongClickListener(p2);
        y0.d.i(v0_1, p2);
        return;
    }

    public void setStartIconScaleType(android.widget.ImageView$ScaleType p2)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.b;
        v0_0.n = p2;
        v0_0.d.setScaleType(p2);
        return;
    }

    public void setStartIconTintList(android.content.res.ColorStateList p4)
    {
        android.graphics.PorterDuff$Mode v0_0 = this.b;
        if (v0_0.e != p4) {
            v0_0.e = p4;
            y0.d.a(v0_0.a, v0_0.d, p4, v0_0.f);
        }
        return;
    }

    public void setStartIconTintMode(android.graphics.PorterDuff$Mode p4)
    {
        android.content.res.ColorStateList v0_0 = this.b;
        if (v0_0.f != p4) {
            v0_0.f = p4;
            y0.d.a(v0_0.a, v0_0.d, v0_0.e, p4);
        }
        return;
    }

    public void setStartIconVisible(boolean p2)
    {
        this.b.c(p2);
        return;
    }

    public void setSuffixText(CharSequence p3)
    {
        n.b1 v1_1;
        z3.o v0 = this.c;
        v0.getClass();
        if (!android.text.TextUtils.isEmpty(p3)) {
            v1_1 = p3;
        } else {
            v1_1 = 0;
        }
        v0.v = v1_1;
        v0.w.setText(p3);
        v0.n();
        return;
    }

    public void setSuffixTextAppearance(int p2)
    {
        this.c.w.setTextAppearance(p2);
        return;
    }

    public void setSuffixTextColor(android.content.res.ColorStateList p2)
    {
        this.c.w.setTextColor(p2);
        return;
    }

    public void setTextInputAccessibilityDelegate(z3.y p2)
    {
        android.widget.EditText v0 = this.e;
        if (v0 != null) {
            q0.q0.n(v0, p2);
        }
        return;
    }

    public void setTypeface(android.graphics.Typeface p3)
    {
        if (p3 != this.i0) {
            this.i0 = p3;
            this.C0.n(p3);
            n.b1 v0_4 = this.q;
            if (p3 != v0_4.B) {
                v0_4.B = p3;
                n.b1 v1_1 = v0_4.r;
                if (v1_1 != null) {
                    v1_1.setTypeface(p3);
                }
                n.b1 v0_1 = v0_4.y;
                if (v0_1 != null) {
                    v0_1.setTypeface(p3);
                }
            }
            n.b1 v0_2 = this.v;
            if (v0_2 != null) {
                v0_2.setTypeface(p3);
            }
        }
        return;
    }

    public final void t()
    {
        android.widget.EditText v0_0 = this.e;
        if ((v0_0 != null) && (this.V == 0)) {
            android.widget.EditText v0_2 = v0_0.getBackground();
            if (v0_2 != null) {
                android.widget.EditText v0_3 = v0_2.mutate();
                if (!this.o()) {
                    if (this.t) {
                        android.graphics.PorterDuffColorFilter v1_2 = this.v;
                        if (v1_2 != null) {
                            v0_3.setColorFilter(n.u.c(v1_2.getCurrentTextColor(), android.graphics.PorterDuff$Mode.SRC_IN));
                            return;
                        }
                    }
                    v0_3.clearColorFilter();
                    this.e.refreshDrawableState();
                } else {
                    v0_3.setColorFilter(n.u.c(this.getErrorCurrentTextColors(), android.graphics.PorterDuff$Mode.SRC_IN));
                    return;
                }
            }
        }
        return;
    }

    public final void u()
    {
        int v0_0 = this.e;
        if (((v0_0 != 0) && ((this.M != null) && ((this.P) || (v0_0.getBackground() == null)))) && (this.V != 0)) {
            this.e.setBackground(this.getEditTextBoxBackground());
            this.P = 1;
        }
        return;
    }

    public final void v()
    {
        if (this.V != 1) {
            android.widget.FrameLayout v0_1 = this.a;
            android.widget.LinearLayout$LayoutParams v1_2 = ((android.widget.LinearLayout$LayoutParams) v0_1.getLayoutParams());
            int v2 = this.e();
            if (v2 != v1_2.topMargin) {
                v1_2.topMargin = v2;
                v0_1.requestLayout();
            }
        }
        return;
    }

    public final void w(boolean p10, boolean p11)
    {
        boolean v1_0;
        android.content.res.ColorStateList v0_0 = this.isEnabled();
        boolean v1_1 = this.e;
        if ((!v1_1) || (android.text.TextUtils.isEmpty(v1_1.getText()))) {
            v1_0 = 0;
        } else {
            v1_0 = 1;
        }
        int v4_2;
        int v4_0 = this.e;
        if ((v4_0 == 0) || (!v4_0.hasFocus())) {
            v4_2 = 0;
        } else {
            v4_2 = 1;
        }
        android.text.Editable v5_1 = this.p0;
        q3.b v6 = this.C0;
        if (v5_1 != null) {
            v6.k(v5_1);
        }
        android.text.Editable v5_0 = 0;
        if (v0_0 != null) {
            if (!this.o()) {
                if (this.t) {
                    android.content.res.ColorStateList v0_3 = this.v;
                    if (v0_3 != null) {
                        v6.k(v0_3.getTextColors());
                        android.content.res.ColorStateList v0_12 = this.c;
                        android.content.res.ColorStateList v7_3 = this.b;
                        if ((!v1_0) && ((this.D0) && ((!this.isEnabled()) || (v4_2 == 0)))) {
                            if ((p11 != 0) || (!this.B0)) {
                                int v11_10 = this.F0;
                                if ((v11_10 != 0) && (v11_10.isRunning())) {
                                    this.F0.cancel();
                                }
                                if ((p10 == null) || (!this.E0)) {
                                    v6.m(0);
                                } else {
                                    this.b(0);
                                }
                                if ((this.g()) && ((!((z3.g) this.M).M.s.isEmpty()) && (this.g()))) {
                                    ((z3.g) this.M).w(0, 0, 0, 0);
                                }
                                this.B0 = 1;
                                n.b1 v10_3 = this.A;
                                if ((v10_3 != null) && (this.z)) {
                                    v10_3.setText(0);
                                    f2.w.a(this.a, this.E);
                                    this.A.setVisibility(4);
                                }
                                v7_3.p = 1;
                                v7_3.e();
                                v0_12.x = 1;
                                v0_12.n();
                                return;
                            }
                        } else {
                            if ((p11 != 0) || (this.B0)) {
                                int v11_5 = this.F0;
                                if ((v11_5 != 0) && (v11_5.isRunning())) {
                                    this.F0.cancel();
                                }
                                if ((p10 == null) || (!this.E0)) {
                                    v6.m(1065353216);
                                } else {
                                    this.b(1065353216);
                                }
                                this.B0 = 0;
                                if (this.g()) {
                                    this.l();
                                }
                                n.b1 v10_8 = this.e;
                                if (v10_8 != null) {
                                    v5_0 = v10_8.getText();
                                }
                                this.x(v5_0);
                                v7_3.p = 0;
                                v7_3.e();
                                v0_12.x = 0;
                                v0_12.n();
                                return;
                            }
                        }
                        return;
                    }
                }
                if (v4_2 != 0) {
                    android.content.res.ColorStateList v0_4 = this.q0;
                    if ((v0_4 != null) && (v6.k != v0_4)) {
                        v6.k = v0_4;
                        v6.j(0);
                    }
                }
            } else {
                android.content.res.ColorStateList v0_8;
                android.content.res.ColorStateList v0_7 = this.q.r;
                if (v0_7 == null) {
                    v0_8 = 0;
                } else {
                    v0_8 = v0_7.getTextColors();
                }
                v6.k(v0_8);
            }
        } else {
            android.content.res.ColorStateList v0_10;
            android.content.res.ColorStateList v0_9 = this.p0;
            if (v0_9 == null) {
                v0_10 = this.z0;
            } else {
                v0_10 = v0_9.getColorForState(new int[] {-16842910}), this.z0);
            }
            v6.k(android.content.res.ColorStateList.valueOf(v0_10));
        }
    }

    public final void x(android.text.Editable p4)
    {
        n.b1 v4_13;
        ((r2.q) this.u).getClass();
        if (p4 == null) {
            v4_13 = 0;
        } else {
            v4_13 = p4.length();
        }
        android.widget.FrameLayout v1 = this.a;
        if ((v4_13 != null) || (this.B0)) {
            n.b1 v4_2 = this.A;
            if ((v4_2 != null) && (this.z)) {
                v4_2.setText(0);
                f2.w.a(v1, this.E);
                this.A.setVisibility(4);
            }
        } else {
            if ((this.A != null) && ((this.z) && (!android.text.TextUtils.isEmpty(this.y)))) {
                this.A.setText(this.y);
                f2.w.a(v1, this.D);
                this.A.setVisibility(0);
                this.A.bringToFront();
                return;
            }
        }
        return;
    }

    public final void y(boolean p6, boolean p7)
    {
        int v0_1 = this.u0.getDefaultColor();
        int v1_1 = this.u0.getColorForState(new int[] {16843623, 16842910}), v0_1);
        int v2_1 = this.u0.getColorForState(new int[] {16843518, 16842910}), v0_1);
        if (!p6) {
            if (!p7) {
                this.d0 = v0_1;
                return;
            } else {
                this.d0 = v1_1;
                return;
            }
        } else {
            this.d0 = v2_1;
            return;
        }
    }

    public final void z()
    {
        if ((this.M != null) && (this.V != 0)) {
            int v0_6;
            int v1 = 0;
            if (this.isFocused()) {
                v0_6 = 1;
            } else {
                int v0_9 = this.e;
                if ((v0_9 == 0) || (!v0_9.hasFocus())) {
                    v0_6 = 0;
                }
            }
            if (this.isHovered()) {
                v1 = 1;
            } else {
                z3.g v3_8 = this.e;
                if ((v3_8 != null) && (v3_8.isHovered())) {
                }
            }
            if (this.isEnabled()) {
                if (!this.o()) {
                    if (this.t) {
                        z3.g v3_13 = this.v;
                        if (v3_13 != null) {
                            if (this.u0 == null) {
                                this.d0 = v3_13.getCurrentTextColor();
                                if (android.os.Build$VERSION.SDK_INT >= 29) {
                                    this.r();
                                }
                                z3.g v3_22 = this.c;
                                int v4_7 = v3_22.a;
                                com.google.android.material.internal.CheckableImageButton v5_0 = v3_22.m;
                                android.content.res.ColorStateList v6_0 = v3_22.a;
                                v3_22.l();
                                y0.d.h(v6_0, v3_22.c, v3_22.d);
                                y0.d.h(v6_0, v5_0, v3_22.q);
                                if ((v3_22.b() instanceof z3.k)) {
                                    if ((!v4_7.o()) || (v5_0.getDrawable() == null)) {
                                        y0.d.a(v4_7, v5_0, v3_22.q, v3_22.r);
                                    } else {
                                        z3.g v3_25 = v5_0.getDrawable().mutate();
                                        v3_25.setTint(v4_7.getErrorCurrentTextColors());
                                        v5_0.setImageDrawable(v3_25);
                                    }
                                }
                                z3.g v3_26 = this.b;
                                y0.d.h(v3_26.a, v3_26.d, v3_26.e);
                                if (this.V == 2) {
                                    z3.g v3_0 = this.a0;
                                    if ((v0_6 == 0) || (!this.isEnabled())) {
                                        this.a0 = this.b0;
                                    } else {
                                        this.a0 = this.c0;
                                    }
                                    if ((this.a0 != v3_0) && ((this.g()) && (!this.B0))) {
                                        if (this.g()) {
                                            ((z3.g) this.M).w(0, 0, 0, 0);
                                        }
                                        this.l();
                                    }
                                }
                                if (this.V == 1) {
                                    if (this.isEnabled()) {
                                        if ((v1 == 0) || (v0_6 != 0)) {
                                            if (v0_6 == 0) {
                                                this.e0 = this.v0;
                                            } else {
                                                this.e0 = this.x0;
                                            }
                                        } else {
                                            this.e0 = this.y0;
                                        }
                                    } else {
                                        this.e0 = this.w0;
                                    }
                                }
                                this.c();
                                return;
                            } else {
                                this.y(v0_6, v1);
                            }
                        }
                    }
                    if (v0_6 == 0) {
                        if (v1 == 0) {
                            this.d0 = this.r0;
                        } else {
                            this.d0 = this.s0;
                        }
                    } else {
                        this.d0 = this.t0;
                    }
                } else {
                    if (this.u0 == null) {
                        this.d0 = this.getErrorCurrentTextColors();
                    } else {
                        this.y(v0_6, v1);
                    }
                }
            } else {
                this.d0 = this.z0;
            }
        }
        return;
    }
}
