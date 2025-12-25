package com.google.android.material.chip;
public class Chip extends n.r implements l3.e, v3.a0, android.widget.Checkable {
    public static final android.graphics.Rect C;
    public static final int[] D;
    public static final int[] E;
    public final android.graphics.RectF A;
    public final l3.b B;
    public l3.f e;
    public android.graphics.drawable.InsetDrawable f;
    public android.graphics.drawable.RippleDrawable m;
    public android.view.View$OnClickListener n;
    public android.widget.CompoundButton$OnCheckedChangeListener o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public CharSequence w;
    public final l3.d x;
    public boolean y;
    public final android.graphics.Rect z;

    static Chip()
    {
        com.google.android.material.chip.Chip.C = new android.graphics.Rect();
        com.google.android.material.chip.Chip.D = new int[] {16842913});
        com.google.android.material.chip.Chip.E = new int[] {16842911});
        return;
    }

    public Chip(android.content.Context p17, android.util.AttributeSet p18)
    {
        com.google.android.material.chip.Chip v0_1 = super(a4.a.a(p17, p18, 2130968800, 2132018373), p18, 2130968800);
        v0_1.z = new android.graphics.Rect();
        v0_1.A = new android.graphics.RectF();
        v0_1.B = new l3.b(v0_1, 0);
        int v7_0 = v0_1.getContext();
        if (p18 != null) {
            if (p18.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                android.util.Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (p18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else {
                if (p18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                } else {
                    if (p18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    } else {
                        if (p18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        } else {
                            if ((!p18.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", 1)) || ((p18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1) || ((p18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1) || (p18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1)))) {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            } else {
                                if (p18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    android.util.Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            }
                        }
                    }
                }
            }
        }
        l3.f v10_1 = new l3.f(v7_0, p18);
        int[] v6_21 = new int[0];
        int[] v3_3 = c3.a.c;
        l3.a v1_57 = q3.k.f(v10_1.t0, p18, v3_3, 2130968800, 2132018373, v6_21);
        v10_1.T0 = v1_57.hasValue(37);
        int[] v6_0 = v10_1.t0;
        int v5_1 = j5.t1.v(v6_0, v1_57, 24);
        if (v10_1.M != v5_1) {
            v10_1.M = v5_1;
            v10_1.onStateChange(v10_1.getState());
        }
        int v5_4 = j5.t1.v(v6_0, v1_57, 11);
        if (v10_1.N != v5_4) {
            v10_1.N = v5_4;
            v10_1.onStateChange(v10_1.getState());
        }
        int v5_7 = v1_57.getDimension(19, 0);
        if (v10_1.O != v5_7) {
            v10_1.O = v5_7;
            v10_1.invalidateSelf();
            v10_1.D();
        }
        if (v1_57.hasValue(12)) {
            v10_1.J(v1_57.getDimension(12, 0));
        }
        v10_1.O(j5.t1.v(v6_0, v1_57, 22));
        v10_1.P(v1_57.getDimension(23, 0));
        v10_1.Z(j5.t1.v(v6_0, v1_57, 36));
        int v5_17 = v1_57.getText(5);
        if (v5_17 == 0) {
            v5_17 = "";
        }
        int v15_0 = v10_1.z0;
        if (!android.text.TextUtils.equals(v10_1.T, v5_17)) {
            v10_1.T = v5_17;
            v15_0.d = 1;
            v10_1.invalidateSelf();
            v10_1.D();
        }
        d3.b v14_5;
        if (!v1_57.hasValue(0)) {
            v14_5 = 0;
        } else {
            int v5_19 = v1_57.getResourceId(0, 0);
            if (v5_19 == 0) {
            } else {
                v14_5 = new s3.d(v6_0, v5_19);
            }
        }
        v14_5.l = v1_57.getDimension(1, v14_5.l);
        v15_0.b(v14_5, v6_0);
        d3.b v14_7 = v1_57.getInt(3, 0);
        if (v14_7 == 1) {
            v10_1.Q0 = android.text.TextUtils$TruncateAt.START;
        } else {
            if (v14_7 == 2) {
                v10_1.Q0 = android.text.TextUtils$TruncateAt.MIDDLE;
            } else {
                if (v14_7 == 3) {
                    v10_1.Q0 = android.text.TextUtils$TruncateAt.END;
                }
            }
        }
        v10_1.N(v1_57.getBoolean(18, 0));
        if ((p18 != null) && ((p18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null) && (p18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null))) {
            v10_1.N(v1_57.getBoolean(15, 0));
        }
        v10_1.K(j5.t1.B(v6_0, v1_57, 14));
        if (v1_57.hasValue(17)) {
            v10_1.M(j5.t1.v(v6_0, v1_57, 17));
        }
        v10_1.L(v1_57.getDimension(16, -1082130432));
        v10_1.W(v1_57.getBoolean(31, 0));
        if ((p18 != null) && ((p18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null) && (p18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null))) {
            v10_1.W(v1_57.getBoolean(26, 0));
        }
        v10_1.Q(j5.t1.B(v6_0, v1_57, 25));
        v10_1.V(j5.t1.v(v6_0, v1_57, 30));
        v10_1.S(v1_57.getDimension(28, 0));
        v10_1.F(v1_57.getBoolean(6, 0));
        v10_1.I(v1_57.getBoolean(10, 0));
        if ((p18 != null) && ((p18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null) && (p18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null))) {
            v10_1.I(v1_57.getBoolean(8, 0));
        }
        v10_1.G(j5.t1.B(v6_0, v1_57, 7));
        if (v1_57.hasValue(9)) {
            v10_1.H(j5.t1.v(v6_0, v1_57, 9));
        }
        int v5_39;
        if (!v1_57.hasValue(39)) {
            v5_39 = 0;
        } else {
            int v5_38 = v1_57.getResourceId(39, 0);
            if (v5_38 == 0) {
            } else {
                v5_39 = d3.b.a(v6_0, v5_38);
            }
        }
        d3.b v14_44;
        v10_1.j0 = v5_39;
        if (!v1_57.hasValue(33)) {
            v14_44 = 0;
        } else {
            int v5_41 = v1_57.getResourceId(33, 0);
            if (v5_41 == 0) {
            } else {
                v14_44 = d3.b.a(v6_0, v5_41);
            }
        }
        v10_1.k0 = v14_44;
        int v5_43 = v1_57.getDimension(21, 0);
        if (v10_1.l0 != v5_43) {
            v10_1.l0 = v5_43;
            v10_1.invalidateSelf();
            v10_1.D();
        }
        v10_1.Y(v1_57.getDimension(35, 0));
        v10_1.X(v1_57.getDimension(34, 0));
        int v5_49 = v1_57.getDimension(41, 0);
        if (v10_1.o0 != v5_49) {
            v10_1.o0 = v5_49;
            v10_1.invalidateSelf();
            v10_1.D();
        }
        int v5_51 = v1_57.getDimension(40, 0);
        if (v10_1.p0 != v5_51) {
            v10_1.p0 = v5_51;
            v10_1.invalidateSelf();
            v10_1.D();
        }
        v10_1.T(v1_57.getDimension(29, 0));
        v10_1.R(v1_57.getDimension(27, 0));
        int v5_57 = v1_57.getDimension(13, 0);
        if (v10_1.s0 != v5_57) {
            v10_1.s0 = v5_57;
            v10_1.invalidateSelf();
            v10_1.D();
        }
        v10_1.S0 = v1_57.getDimensionPixelSize(4, 2147483647);
        v1_57.recycle();
        int[] v6_10 = new int[0];
        q3.k.a(v7_0, p18, 2130968800, 2132018373);
        l3.a v1_11 = v7_0;
        q3.k.b(v1_11, p18, v3_3, 2130968800, 2132018373, v6_10);
        int v5_61 = v1_11.obtainStyledAttributes(p18, v3_3, 2130968800, 2132018373);
        v0_1.t = v5_61.getBoolean(32, 0);
        v0_1.v = ((int) Math.ceil(((double) v5_61.getDimension(20, ((float) c4.b.V(v1_11))))));
        v5_61.recycle();
        v0_1.setChipDrawable(v10_1);
        v10_1.n(v0_1.getElevation());
        int[] v6_19 = new int[0];
        q3.k.a(v1_11, p18, 2130968800, 2132018373);
        q3.k.b(v1_11, p18, v3_3, 2130968800, 2132018373, v6_19);
        l3.a v1_14 = v1_11.obtainStyledAttributes(p18, v3_3, 2130968800, 2132018373);
        boolean v2_2 = v1_14.hasValue(37);
        v1_14.recycle();
        v0_1.x = new l3.d(v0_1, v0_1);
        v0_1.e();
        if (!v2_2) {
            v0_1.setOutlineProvider(new l3.c(v0_1));
        }
        v0_1.setChecked(v0_1.p);
        v0_1.setText(v10_1.T);
        v0_1.setEllipsize(v10_1.Q0);
        v0_1.h();
        if (!v0_1.e.R0) {
            v0_1.setLines(1);
            v0_1.setHorizontallyScrolling(1);
        }
        v0_1.setGravity(8388627);
        v0_1.g();
        if (v0_1.t) {
            v0_1.setMinHeight(v0_1.v);
        }
        v0_1.u = v0_1.getLayoutDirection();
        super.setOnCheckedChangeListener(new l3.a(v0_1));
        return;
    }

    public static synthetic android.graphics.RectF a(com.google.android.material.chip.Chip p0)
    {
        return p0.getCloseIconTouchBounds();
    }

    public static synthetic android.graphics.Rect b(com.google.android.material.chip.Chip p0)
    {
        return p0.getCloseIconTouchBoundsInt();
    }

    private android.graphics.RectF getCloseIconTouchBounds()
    {
        android.graphics.RectF v0 = this.A;
        v0.setEmpty();
        if ((this.d()) && (this.n != null)) {
            float v1_13 = this.e;
            android.graphics.Rect v2 = v1_13.getBounds();
            v0.setEmpty();
            if (v1_13.c0()) {
                float v3_5 = ((((v1_13.s0 + v1_13.r0) + v1_13.d0) + v1_13.q0) + v1_13.p0);
                if (v1_13.getLayoutDirection() != 0) {
                    float v1_2 = ((float) v2.left);
                    v0.left = v1_2;
                    v0.right = (v1_2 + v3_5);
                } else {
                    float v1_6 = ((float) v2.right);
                    v0.right = v1_6;
                    v0.left = (v1_6 - v3_5);
                }
                v0.top = ((float) v2.top);
                v0.bottom = ((float) v2.bottom);
            }
        }
        return v0;
    }

    private android.graphics.Rect getCloseIconTouchBoundsInt()
    {
        int v0_0 = this.getCloseIconTouchBounds();
        android.graphics.Rect v4 = this.z;
        v4.set(((int) v0_0.left), ((int) v0_0.top), ((int) v0_0.right), ((int) v0_0.bottom));
        return v4;
    }

    private s3.d getTextAppearance()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.z0.f;
        }
    }

    private void setCloseIconHovered(boolean p2)
    {
        if (this.r != p2) {
            this.r = p2;
            this.refreshDrawableState();
        }
        return;
    }

    private void setCloseIconPressed(boolean p2)
    {
        if (this.q != p2) {
            this.q = p2;
            this.refreshDrawableState();
        }
        return;
    }

    public final void c(int p11)
    {
        this.v = p11;
        int v2 = 0;
        if (this.t) {
            int v0_1 = Math.max(0, (p11 - ((int) this.e.O)));
            int v3_3 = Math.max(0, (p11 - this.e.getIntrinsicWidth()));
            if ((v3_3 > 0) || (v0_1 > 0)) {
                int v6;
                if (v3_3 <= 0) {
                    v6 = 0;
                } else {
                    v6 = (v3_3 / 2);
                }
                if (v0_1 > 0) {
                    v2 = (v0_1 / 2);
                }
                int v7 = v2;
                if (this.f != null) {
                    int v0_4 = new android.graphics.Rect();
                    this.f.getPadding(v0_4);
                    if ((v0_4.top == v7) && ((v0_4.bottom == v7) && ((v0_4.left == v6) && (v0_4.right == v6)))) {
                        this.f();
                        return;
                    }
                }
                if (this.getMinHeight() != p11) {
                    this.setMinHeight(p11);
                }
                if (this.getMinWidth() != p11) {
                    this.setMinWidth(p11);
                }
                this.f = new android.graphics.drawable.InsetDrawable(this.e, v6, v7, v6, v7);
                this.f();
                return;
            } else {
                int v11_1 = this.f;
                if (v11_1 == 0) {
                    this.f();
                    return;
                } else {
                    if (v11_1 != 0) {
                        this.f = 0;
                        this.setMinWidth(0);
                        this.setMinHeight(((int) this.getChipMinHeight()));
                        this.f();
                    }
                }
            }
        } else {
            int v11_4 = this.f;
            if (v11_4 == 0) {
                this.f();
                return;
            } else {
                if (v11_4 != 0) {
                    this.f = 0;
                    this.setMinWidth(0);
                    this.setMinHeight(((int) this.getChipMinHeight()));
                    this.f();
                    return;
                }
            }
        }
        return;
    }

    public final boolean d()
    {
        int v0_0 = this.e;
        if (v0_0 != 0) {
            int v0_2 = v0_0.a0;
            if ((v0_2 == 0) || ((v0_2 instanceof i0.a))) {
                v0_2 = 0;
            }
            if (v0_2 != 0) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean dispatchHoverEvent(android.view.MotionEvent p2)
    {
        if (this.y) {
            if ((!this.x.m(p2)) && (!super.dispatchHoverEvent(p2))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return super.dispatchHoverEvent(p2);
        }
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p10)
    {
        if (this.y) {
            int v0_1 = this.x;
            v0_1.getClass();
            int v4_0 = 0;
            if (p10.getAction() != 1) {
                int v1_0 = p10.getKeyCode();
                if (v1_0 == 61) {
                    if (!p10.hasNoModifiers()) {
                        if (p10.hasModifiers(1)) {
                            v4_0 = v0_1.q(1, 0);
                        }
                    } else {
                        v4_0 = v0_1.q(2, 0);
                    }
                } else {
                    int v5_1 = 66;
                    if (v1_0 != 66) {
                        switch (v1_0) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                if (p10.hasNoModifiers()) {
                                    if (v1_0 == 19) {
                                        v5_1 = 33;
                                    } else {
                                        if (v1_0 == 21) {
                                            v5_1 = 17;
                                        } else {
                                            if (v1_0 != 22) {
                                                v5_1 = 130;
                                            }
                                        }
                                    }
                                    int v1_9 = (p10.getRepeatCount() + 1);
                                    int v7_4 = 0;
                                    while ((v4_0 < v1_9) && (v0_1.q(v5_1, 0))) {
                                        v4_0++;
                                        v7_4 = 1;
                                    }
                                    v4_0 = v7_4;
                                }
                                if ((v4_0 == 0) || (v0_1.l == -2147483648)) {
                                    return super.dispatchKeyEvent(p10);
                                } else {
                                    return 1;
                                }
                            case 23:
                                break;
                            default:
                        }
                    }
                    if ((p10.hasNoModifiers()) && (p10.getRepeatCount() == 0)) {
                        int v1_6 = v0_1.l;
                        if (v1_6 != -2147483648) {
                            v0_1.s(v1_6, 16, 0);
                        }
                        v4_0 = 1;
                    }
                }
            }
        } else {
            return super.dispatchKeyEvent(p10);
        }
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        l3.f v0_0 = this.e;
        boolean v1 = 0;
        if ((v0_0 != null) && (l3.f.C(v0_0.a0))) {
            l3.f v0_3 = this.e;
            int[] v2_0 = this.isEnabled();
            if (this.s) {
                v2_0++;
            }
            if (this.r) {
                v2_0++;
            }
            if (this.q) {
                v2_0++;
            }
            if (this.isChecked()) {
                v2_0++;
            }
            int[] v2_1 = new int[v2_0];
            if (this.isEnabled()) {
                v2_1[0] = 16842910;
                v1 = 1;
            }
            if (this.s) {
                v2_1[v1] = 16842908;
                v1++;
            }
            if (this.r) {
                v2_1[v1] = 16843623;
                v1++;
            }
            if (this.q) {
                v2_1[v1] = 16842919;
                v1++;
            }
            if (this.isChecked()) {
                v2_1[v1] = 16842913;
            }
            v1 = v0_3.U(v2_1);
        }
        if (v1) {
            this.invalidate();
        }
        return;
    }

    public final void e()
    {
        if (this.d()) {
            int v0_4 = this.e;
            if ((v0_4 != 0) && ((v0_4.Z) && (this.n != null))) {
                q0.q0.n(this, this.x);
                this.y = 1;
                return;
            }
        }
        q0.q0.n(this, 0);
        this.y = 0;
        return;
    }

    public final void f()
    {
        this.m = new android.graphics.drawable.RippleDrawable(t3.a.a(this.e.S), this.getBackgroundDrawable(), 0);
        this.e.getClass();
        this.setBackground(this.m);
        this.g();
        return;
    }

    public final void g()
    {
        if (!android.text.TextUtils.isEmpty(this.getText())) {
            int v0_5 = this.e;
            if (v0_5 != 0) {
                int v0_3 = ((int) (v0_5.z() + (v0_5.s0 + v0_5.p0)));
                int v1_0 = this.e;
                int v1_3 = ((int) (v1_0.y() + (v1_0.l0 + v1_0.o0)));
                if (this.f != null) {
                    int v2_4 = new android.graphics.Rect();
                    this.f.getPadding(v2_4);
                    v1_3 += v2_4.left;
                    v0_3 += v2_4.right;
                }
                this.setPaddingRelative(v1_3, this.getPaddingTop(), v0_3, this.getPaddingBottom());
            }
        }
        return;
    }

    public CharSequence getAccessibilityClassName()
    {
        if (android.text.TextUtils.isEmpty(this.w)) {
            String v0_5 = this.e;
            if ((v0_5 == null) || (!v0_5.f0)) {
                if (!this.isClickable()) {
                    return "android.view.View";
                } else {
                    return "android.widget.Button";
                }
            } else {
                this.getParent();
                return "android.widget.Button";
            }
        } else {
            return this.w;
        }
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable()
    {
        l3.f v0 = this.f;
        if (v0 == null) {
            v0 = this.e;
        }
        return v0;
    }

    public android.graphics.drawable.Drawable getCheckedIcon()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.h0;
        }
    }

    public android.content.res.ColorStateList getCheckedIconTint()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.i0;
        }
    }

    public android.content.res.ColorStateList getChipBackgroundColor()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.N;
        }
    }

    public float getChipCornerRadius()
    {
        float v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return Math.max(0, v0_0.A());
        }
    }

    public android.graphics.drawable.Drawable getChipDrawable()
    {
        return this.e;
    }

    public float getChipEndPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.s0;
        }
    }

    public android.graphics.drawable.Drawable getChipIcon()
    {
        int v0_0 = this.e;
        if (v0_0 != 0) {
            int v0_1 = v0_0.V;
            if (v0_1 != 0) {
                if ((v0_1 instanceof i0.a)) {
                    v0_1 = 0;
                }
                return v0_1;
            }
        }
        return 0;
    }

    public float getChipIconSize()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.X;
        }
    }

    public android.content.res.ColorStateList getChipIconTint()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.W;
        }
    }

    public float getChipMinHeight()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.O;
        }
    }

    public float getChipStartPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.l0;
        }
    }

    public android.content.res.ColorStateList getChipStrokeColor()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.Q;
        }
    }

    public float getChipStrokeWidth()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.R;
        }
    }

    public CharSequence getChipText()
    {
        return this.getText();
    }

    public android.graphics.drawable.Drawable getCloseIcon()
    {
        int v0_0 = this.e;
        if (v0_0 != 0) {
            int v0_1 = v0_0.a0;
            if (v0_1 != 0) {
                if ((v0_1 instanceof i0.a)) {
                    v0_1 = 0;
                }
                return v0_1;
            }
        }
        return 0;
    }

    public CharSequence getCloseIconContentDescription()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.e0;
        }
    }

    public float getCloseIconEndPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.r0;
        }
    }

    public float getCloseIconSize()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.d0;
        }
    }

    public float getCloseIconStartPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.q0;
        }
    }

    public android.content.res.ColorStateList getCloseIconTint()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.c0;
        }
    }

    public android.text.TextUtils$TruncateAt getEllipsize()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.Q0;
        }
    }

    public final void getFocusedRect(android.graphics.Rect p4)
    {
        if (this.y) {
            android.graphics.Rect v0_2 = this.x;
            if ((v0_2.l == 1) || (v0_2.k == 1)) {
                p4.set(this.getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(p4);
        return;
    }

    public d3.b getHideMotionSpec()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.k0;
        }
    }

    public float getIconEndPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.n0;
        }
    }

    public float getIconStartPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.m0;
        }
    }

    public android.content.res.ColorStateList getRippleColor()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.S;
        }
    }

    public v3.p getShapeAppearanceModel()
    {
        return this.e.b.a;
    }

    public d3.b getShowMotionSpec()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.j0;
        }
    }

    public float getTextEndPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.p0;
        }
    }

    public float getTextStartPadding()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.o0;
        }
    }

    public final void h()
    {
        android.text.TextPaint v0 = this.getPaint();
        s3.d v1_0 = this.e;
        if (v1_0 != null) {
            v0.drawableState = v1_0.getState();
        }
        s3.d v1_2 = this.getTextAppearance();
        if (v1_2 != null) {
            v1_2.d(this.getContext(), v0, this.B);
        }
        return;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        q4.b.O(this, this.e);
        return;
    }

    public final int[] onCreateDrawableState(int p2)
    {
        int[] v2_2 = super.onCreateDrawableState((p2 + 2));
        if (this.isChecked()) {
            android.view.View.mergeDrawableStates(v2_2, com.google.android.material.chip.Chip.D);
        }
        int[] v0_4 = this.e;
        if ((v0_4 != null) && (v0_4.f0)) {
            android.view.View.mergeDrawableStates(v2_2, com.google.android.material.chip.Chip.E);
        }
        return v2_2;
    }

    public final void onFocusChanged(boolean p4, int p5, android.graphics.Rect p6)
    {
        super.onFocusChanged(p4, p5, p6);
        if (this.y) {
            l3.d v0_1 = this.x;
            int v1 = v0_1.l;
            if (v1 != -2147483648) {
                v0_1.j(v1);
            }
            if (p4) {
                v0_1.q(p5, p6);
            }
        }
        return;
    }

    public final boolean onHoverEvent(android.view.MotionEvent p4)
    {
        int v0_0 = p4.getActionMasked();
        if (v0_0 == 7) {
            this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(p4.getX(), p4.getY()));
        } else {
            if (v0_0 == 10) {
                this.setCloseIconHovered(0);
            }
        }
        return super.onHoverEvent(p4);
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p2)
    {
        boolean v0_4;
        super.onInitializeAccessibilityNodeInfo(p2);
        p2.setClassName(this.getAccessibilityClassName());
        boolean v0_2 = this.e;
        if ((!v0_2) || (!v0_2.f0)) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        p2.setCheckable(v0_4);
        p2.setClickable(this.isClickable());
        this.getParent();
        return;
    }

    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p4, int p5)
    {
        if ((!this.getCloseIconTouchBounds().contains(p4.getX(), p4.getY())) || (!this.isEnabled())) {
            return super.onResolvePointerIcon(p4, p5);
        } else {
            return android.view.PointerIcon.getSystemIcon(this.getContext(), 1002);
        }
    }

    public final void onRtlPropertiesChanged(int p2)
    {
        super.onRtlPropertiesChanged(p2);
        if (this.u != p2) {
            this.u = p2;
            this.g();
        }
        return;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p6)
    {
        int v0_5;
        int v0_0 = p6.getActionMasked();
        int v1_2 = this.getCloseIconTouchBounds().contains(p6.getX(), p6.getY());
        if (v0_0 == 0) {
            if (v1_2 == 0) {
                v0_5 = 0;
            } else {
                this.setCloseIconPressed(1);
                v0_5 = 1;
            }
        } else {
            if (v0_0 == 1) {
                if (!this.q) {
                    v0_5 = 0;
                } else {
                    this.playSoundEffect(0);
                    int v0_2 = this.n;
                    if (v0_2 != 0) {
                        v0_2.onClick(this);
                    }
                    if (this.y) {
                        this.x.x(1, 1);
                    }
                    v0_5 = 1;
                }
            } else {
                if (v0_0 == 2) {
                    if (!this.q) {
                    } else {
                        if (v1_2 != 0) {
                        } else {
                            this.setCloseIconPressed(0);
                        }
                    }
                } else {
                    if (v0_0 == 3) {
                    }
                }
            }
            this.setCloseIconPressed(0);
        }
        if ((v0_5 == 0) && (!super.onTouchEvent(p6))) {
            return 0;
        } else {
            return 1;
        }
    }

    public void setAccessibilityClassName(CharSequence p1)
    {
        this.w = p1;
        return;
    }

    public void setBackground(android.graphics.drawable.Drawable p2)
    {
        if ((p2 == this.getBackgroundDrawable()) || (p2 == this.m)) {
            super.setBackground(p2);
            return;
        } else {
            android.util.Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            return;
        }
    }

    public void setBackgroundColor(int p2)
    {
        android.util.Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
        return;
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p2)
    {
        if ((p2 == this.getBackgroundDrawable()) || (p2 == this.m)) {
            super.setBackgroundDrawable(p2);
            return;
        } else {
            android.util.Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
            return;
        }
    }

    public void setBackgroundResource(int p2)
    {
        android.util.Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
        return;
    }

    public void setBackgroundTintList(android.content.res.ColorStateList p2)
    {
        android.util.Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
        return;
    }

    public void setBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        android.util.Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
        return;
    }

    public void setCheckable(boolean p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.F(p2);
        }
        return;
    }

    public void setCheckableResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.F(v0.t0.getResources().getBoolean(p3));
        }
        return;
    }

    public void setChecked(boolean p2)
    {
        boolean v0_0 = this.e;
        if (v0_0) {
            if (v0_0.f0) {
                super.setChecked(p2);
            }
            return;
        } else {
            this.p = p2;
            return;
        }
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.G(p2);
        }
        return;
    }

    public void setCheckedIconEnabled(boolean p1)
    {
        this.setCheckedIconVisible(p1);
        return;
    }

    public void setCheckedIconEnabledResource(int p1)
    {
        this.setCheckedIconVisible(p1);
        return;
    }

    public void setCheckedIconResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.G(j5.t1.A(v0.t0, p3));
        }
        return;
    }

    public void setCheckedIconTint(android.content.res.ColorStateList p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.H(p2);
        }
        return;
    }

    public void setCheckedIconTintResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.H(e0.c.getColorStateList(v0.t0, p3));
        }
        return;
    }

    public void setCheckedIconVisible(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.I(v0.t0.getResources().getBoolean(p3));
        }
        return;
    }

    public void setCheckedIconVisible(boolean p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.I(p2);
        }
        return;
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList p3)
    {
        l3.f v0 = this.e;
        if ((v0 != null) && (v0.N != p3)) {
            v0.N = p3;
            v0.onStateChange(v0.getState());
        }
        return;
    }

    public void setChipBackgroundColorResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            int[] v3_1 = e0.c.getColorStateList(v0.t0, p3);
            if (v0.N != v3_1) {
                v0.N = v3_1;
                v0.onStateChange(v0.getState());
            }
        }
        return;
    }

    public void setChipCornerRadius(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.J(p2);
        }
        return;
    }

    public void setChipCornerRadiusResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.J(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setChipDrawable(l3.f p4)
    {
        ref.WeakReference v0_0 = this.e;
        if (v0_0 != p4) {
            if (v0_0 != null) {
                v0_0.P0 = new ref.WeakReference(0);
            }
            this.e = p4;
            p4.R0 = 0;
            p4.P0 = new ref.WeakReference(this);
            this.c(this.v);
        }
        return;
    }

    public void setChipEndPadding(float p3)
    {
        l3.f v0 = this.e;
        if ((v0 != null) && (v0.s0 != p3)) {
            v0.s0 = p3;
            v0.invalidateSelf();
            v0.D();
        }
        return;
    }

    public void setChipEndPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            float v3_1 = v0.t0.getResources().getDimension(p3);
            if (v0.s0 != v3_1) {
                v0.s0 = v3_1;
                v0.invalidateSelf();
                v0.D();
            }
        }
        return;
    }

    public void setChipIcon(android.graphics.drawable.Drawable p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.K(p2);
        }
        return;
    }

    public void setChipIconEnabled(boolean p1)
    {
        this.setChipIconVisible(p1);
        return;
    }

    public void setChipIconEnabledResource(int p1)
    {
        this.setChipIconVisible(p1);
        return;
    }

    public void setChipIconResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.K(j5.t1.A(v0.t0, p3));
        }
        return;
    }

    public void setChipIconSize(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.L(p2);
        }
        return;
    }

    public void setChipIconSizeResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.L(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setChipIconTint(android.content.res.ColorStateList p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.M(p2);
        }
        return;
    }

    public void setChipIconTintResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.M(e0.c.getColorStateList(v0.t0, p3));
        }
        return;
    }

    public void setChipIconVisible(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.N(v0.t0.getResources().getBoolean(p3));
        }
        return;
    }

    public void setChipIconVisible(boolean p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.N(p2);
        }
        return;
    }

    public void setChipMinHeight(float p3)
    {
        l3.f v0 = this.e;
        if ((v0 != null) && (v0.O != p3)) {
            v0.O = p3;
            v0.invalidateSelf();
            v0.D();
        }
        return;
    }

    public void setChipMinHeightResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            float v3_1 = v0.t0.getResources().getDimension(p3);
            if (v0.O != v3_1) {
                v0.O = v3_1;
                v0.invalidateSelf();
                v0.D();
            }
        }
        return;
    }

    public void setChipStartPadding(float p3)
    {
        l3.f v0 = this.e;
        if ((v0 != null) && (v0.l0 != p3)) {
            v0.l0 = p3;
            v0.invalidateSelf();
            v0.D();
        }
        return;
    }

    public void setChipStartPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            float v3_1 = v0.t0.getResources().getDimension(p3);
            if (v0.l0 != v3_1) {
                v0.l0 = v3_1;
                v0.invalidateSelf();
                v0.D();
            }
        }
        return;
    }

    public void setChipStrokeColor(android.content.res.ColorStateList p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.O(p2);
        }
        return;
    }

    public void setChipStrokeColorResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.O(e0.c.getColorStateList(v0.t0, p3));
        }
        return;
    }

    public void setChipStrokeWidth(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.P(p2);
        }
        return;
    }

    public void setChipStrokeWidthResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.P(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setChipText(CharSequence p1)
    {
        this.setText(p1);
        return;
    }

    public void setChipTextResource(int p2)
    {
        this.setText(this.getResources().getString(p2));
        return;
    }

    public void setCloseIcon(android.graphics.drawable.Drawable p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.Q(p2);
        }
        this.e();
        return;
    }

    public void setCloseIconContentDescription(CharSequence p4)
    {
        l3.f v0 = this.e;
        if ((v0 != null) && (v0.e0 != p4)) {
            o0.b v1_0;
            if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) != 1) {
                v1_0 = o0.b.d;
            } else {
                v1_0 = o0.b.e;
            }
            v1_0.getClass();
            v0.e0 = v1_0.c(p4);
            v0.invalidateSelf();
        }
        return;
    }

    public void setCloseIconEnabled(boolean p1)
    {
        this.setCloseIconVisible(p1);
        return;
    }

    public void setCloseIconEnabledResource(int p1)
    {
        this.setCloseIconVisible(p1);
        return;
    }

    public void setCloseIconEndPadding(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.R(p2);
        }
        return;
    }

    public void setCloseIconEndPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.R(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setCloseIconResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.Q(j5.t1.A(v0.t0, p3));
        }
        this.e();
        return;
    }

    public void setCloseIconSize(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.S(p2);
        }
        return;
    }

    public void setCloseIconSizeResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.S(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setCloseIconStartPadding(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.T(p2);
        }
        return;
    }

    public void setCloseIconStartPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.T(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setCloseIconTint(android.content.res.ColorStateList p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.V(p2);
        }
        return;
    }

    public void setCloseIconTintResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.V(e0.c.getColorStateList(v0.t0, p3));
        }
        return;
    }

    public void setCloseIconVisible(int p2)
    {
        this.setCloseIconVisible(this.getResources().getBoolean(p2));
        return;
    }

    public void setCloseIconVisible(boolean p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.W(p2);
        }
        this.e();
        return;
    }

    public final void setCompoundDrawables(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        if (p1 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else {
            if (p3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else {
                super.setCompoundDrawables(p1, p2, p3, p4);
                return;
            }
        }
    }

    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        if (p1 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else {
            if (p3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else {
                super.setCompoundDrawablesRelative(p1, p2, p3, p4);
                return;
            }
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int p1, int p2, int p3, int p4)
    {
        if (p1 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else {
            if (p3 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(p1, p2, p3, p4);
                return;
            }
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        if (p1 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else {
            if (p3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(p1, p2, p3, p4);
                return;
            }
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int p1, int p2, int p3, int p4)
    {
        if (p1 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else {
            if (p3 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else {
                super.setCompoundDrawablesWithIntrinsicBounds(p1, p2, p3, p4);
                return;
            }
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        if (p1 != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else {
            if (p3 != null) {
                throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
            } else {
                super.setCompoundDrawablesWithIntrinsicBounds(p1, p2, p3, p4);
                return;
            }
        }
    }

    public void setElevation(float p2)
    {
        super.setElevation(p2);
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.n(p2);
        }
        return;
    }

    public void setEllipsize(android.text.TextUtils$TruncateAt p2)
    {
        if (this.e != null) {
            if (p2 == android.text.TextUtils$TruncateAt.MARQUEE) {
                throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
            } else {
                super.setEllipsize(p2);
                String v0_3 = this.e;
                if (v0_3 != null) {
                    v0_3.Q0 = p2;
                }
            }
        }
        return;
    }

    public void setEnsureMinTouchTargetSize(boolean p1)
    {
        this.t = p1;
        this.c(this.v);
        return;
    }

    public void setGravity(int p2)
    {
        if (p2 == 8388627) {
            super.setGravity(p2);
            return;
        } else {
            android.util.Log.w("Chip", "Chip text must be vertically center and start aligned");
            return;
        }
    }

    public void setHideMotionSpec(d3.b p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.k0 = p2;
        }
        return;
    }

    public void setHideMotionSpecResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.k0 = d3.b.a(v0.t0, p3);
        }
        return;
    }

    public void setIconEndPadding(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.X(p2);
        }
        return;
    }

    public void setIconEndPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.X(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setIconStartPadding(float p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.Y(p2);
        }
        return;
    }

    public void setIconStartPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.Y(v0.t0.getResources().getDimension(p3));
        }
        return;
    }

    public void setInternalOnCheckedChangeListener(q3.e p1)
    {
        return;
    }

    public void setLayoutDirection(int p2)
    {
        if (this.e != null) {
            super.setLayoutDirection(p2);
            return;
        } else {
            return;
        }
    }

    public void setLines(int p2)
    {
        if (p2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        } else {
            super.setLines(p2);
            return;
        }
    }

    public void setMaxLines(int p2)
    {
        if (p2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        } else {
            super.setMaxLines(p2);
            return;
        }
    }

    public void setMaxWidth(int p2)
    {
        super.setMaxWidth(p2);
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.S0 = p2;
        }
        return;
    }

    public void setMinLines(int p2)
    {
        if (p2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        } else {
            super.setMinLines(p2);
            return;
        }
    }

    public void setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener p1)
    {
        this.o = p1;
        return;
    }

    public void setOnCloseIconClickListener(android.view.View$OnClickListener p1)
    {
        this.n = p1;
        this.e();
        return;
    }

    public void setRippleColor(android.content.res.ColorStateList p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.Z(p2);
        }
        this.e.getClass();
        this.f();
        return;
    }

    public void setRippleColorResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.Z(e0.c.getColorStateList(v0.t0, p3));
            this.e.getClass();
            this.f();
        }
        return;
    }

    public void setShapeAppearanceModel(v3.p p2)
    {
        this.e.setShapeAppearanceModel(p2);
        return;
    }

    public void setShowMotionSpec(d3.b p2)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.j0 = p2;
        }
        return;
    }

    public void setShowMotionSpecResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            v0.j0 = d3.b.a(v0.t0, p3);
        }
        return;
    }

    public void setSingleLine(boolean p2)
    {
        if (p2 == null) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        } else {
            super.setSingleLine(p2);
            return;
        }
    }

    public final void setText(CharSequence p2, android.widget.TextView$BufferType p3)
    {
        int v0_0 = this.e;
        if (v0_0 != 0) {
            if (p2 == null) {
                p2 = "";
            }
            int v0_5;
            if (!v0_0.R0) {
                v0_5 = p2;
            } else {
                v0_5 = 0;
            }
            super.setText(v0_5, p3);
            l3.f v3_1 = this.e;
            if ((v3_1 != null) && (!android.text.TextUtils.equals(v3_1.T, p2))) {
                v3_1.T = p2;
                v3_1.z0.d = 1;
                v3_1.invalidateSelf();
                v3_1.D();
            }
        }
        return;
    }

    public void setTextAppearance(int p4)
    {
        super.setTextAppearance(p4);
        l3.f v0 = this.e;
        if (v0 != null) {
            android.content.Context v2 = v0.t0;
            v0.z0.b(new s3.d(v2, p4), v2);
        }
        this.h();
        return;
    }

    public final void setTextAppearance(android.content.Context p3, int p4)
    {
        super.setTextAppearance(p3, p4);
        q3.i v3_1 = this.e;
        if (v3_1 != null) {
            android.content.Context v1 = v3_1.t0;
            v3_1.z0.b(new s3.d(v1, p4), v1);
        }
        this.h();
        return;
    }

    public void setTextAppearance(s3.d p3)
    {
        android.content.Context v0_0 = this.e;
        if (v0_0 != null) {
            v0_0.z0.b(p3, v0_0.t0);
        }
        this.h();
        return;
    }

    public void setTextAppearanceResource(int p2)
    {
        this.setTextAppearance(this.getContext(), p2);
        return;
    }

    public void setTextEndPadding(float p3)
    {
        l3.f v0 = this.e;
        if ((v0 != null) && (v0.p0 != p3)) {
            v0.p0 = p3;
            v0.invalidateSelf();
            v0.D();
        }
        return;
    }

    public void setTextEndPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            float v3_1 = v0.t0.getResources().getDimension(p3);
            if (v0.p0 != v3_1) {
                v0.p0 = v3_1;
                v0.invalidateSelf();
                v0.D();
            }
        }
        return;
    }

    public final void setTextSize(int p3, float p4)
    {
        super.setTextSize(p3, p4);
        l3.f v0 = this.e;
        if (v0 != null) {
            float v3_1 = android.util.TypedValue.applyDimension(p3, p4, this.getResources().getDisplayMetrics());
            android.text.TextPaint v4_2 = v0.z0;
            s3.d v1_0 = v4_2.f;
            if (v1_0 != null) {
                v1_0.l = v3_1;
                v4_2.a.setTextSize(v3_1);
                v0.a();
            }
        }
        this.h();
        return;
    }

    public void setTextStartPadding(float p3)
    {
        l3.f v0 = this.e;
        if ((v0 != null) && (v0.o0 != p3)) {
            v0.o0 = p3;
            v0.invalidateSelf();
            v0.D();
        }
        return;
    }

    public void setTextStartPaddingResource(int p3)
    {
        l3.f v0 = this.e;
        if (v0 != null) {
            float v3_1 = v0.t0.getResources().getDimension(p3);
            if (v0.o0 != v3_1) {
                v0.o0 = v3_1;
                v0.invalidateSelf();
                v0.D();
            }
        }
        return;
    }
}
