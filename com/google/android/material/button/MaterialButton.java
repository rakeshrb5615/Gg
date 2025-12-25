package com.google.android.material.button;
public class MaterialButton extends n.q implements android.widget.Checkable, v3.a0 {
    public static final int[] L;
    public static final int[] M;
    public static final i3.a N;
    public int A;
    public android.widget.LinearLayout$LayoutParams B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public v3.f0 G;
    public int H;
    public float I;
    public float J;
    public f1.g K;
    public final i3.f d;
    public final java.util.LinkedHashSet e;
    public i3.b f;
    public android.graphics.PorterDuff$Mode m;
    public android.content.res.ColorStateList n;
    public android.graphics.drawable.Drawable o;
    public String p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public float y;
    public int z;

    static MaterialButton()
    {
        com.google.android.material.button.MaterialButton.L = new int[] {16842911});
        com.google.android.material.button.MaterialButton.M = new int[] {16842912});
        com.google.android.material.button.MaterialButton.N = new i3.a(5);
        return;
    }

    public MaterialButton(android.content.Context p10, android.util.AttributeSet p11)
    {
        int v1_14;
        super(a4.a.b(p10, p11, 2130969441, 2132018359, new int[] {2130969477})), p11, 2130969441);
        super.e = new java.util.LinkedHashSet();
        int v10_1 = 0;
        super.u = 0;
        super.v = 0;
        super.x = -1;
        super.y = -1082130432;
        super.z = -1;
        super.A = -1;
        super.F = -1;
        int v1_12 = super.getContext();
        int v6_0 = new int[0];
        android.graphics.drawable.Drawable v11_3 = q3.k.f(v1_12, p11, c3.a.j, 2130969441, 2132018359, v6_0);
        super.t = v11_3.getDimensionPixelSize(13, 0);
        int v5_3 = android.graphics.PorterDuff$Mode.SRC_IN;
        super.m = q3.k.g(v11_3.getInt(16, -1), v5_3);
        super.n = j5.t1.v(super.getContext(), v11_3, 15);
        super.o = j5.t1.B(super.getContext(), v11_3, 11);
        super.w = v11_3.getInteger(12, 1);
        super.q = v11_3.getDimensionPixelSize(14, 0);
        v3.d0 v3_15 = v3.d0.b(v1_12, v11_3, 19);
        if (v3_15 == null) {
            v1_14 = v3.p.b(v1_12, p11, 2130969441, 2132018359).a();
        } else {
            v1_14 = v3_15.c();
        }
        boolean v2_2 = v11_3.getBoolean(17, 0);
        i3.f v4_2 = new i3.f(super, v1_14);
        super.d = v4_2;
        v4_2.f = v11_3.getDimensionPixelOffset(2, 0);
        v4_2.g = v11_3.getDimensionPixelOffset(3, 0);
        v4_2.h = v11_3.getDimensionPixelOffset(4, 0);
        v4_2.i = v11_3.getDimensionPixelOffset(5, 0);
        if (v11_3.hasValue(9)) {
            int v1_24 = v11_3.getDimensionPixelSize(9, -1);
            v4_2.j = v1_24;
            int v1_0 = ((float) v1_24);
            int v7_1 = v4_2.b.f();
            v7_1.e = new v3.a(v1_0);
            v7_1.f = new v3.a(v1_0);
            v7_1.g = new v3.a(v1_0);
            v7_1.h = new v3.a(v1_0);
            v4_2.b = v7_1.a();
            v4_2.c = 0;
            v4_2.d();
            v4_2.s = 1;
        }
        v4_2.k = v11_3.getDimensionPixelSize(22, 0);
        v4_2.l = q3.k.g(v11_3.getInt(8, -1), v5_3);
        v4_2.m = j5.t1.v(super.getContext(), v11_3, 7);
        v4_2.n = j5.t1.v(super.getContext(), v11_3, 21);
        v4_2.o = j5.t1.v(super.getContext(), v11_3, 18);
        v4_2.t = v11_3.getBoolean(6, 0);
        v4_2.w = v11_3.getDimensionPixelSize(10, 0);
        v4_2.u = v11_3.getBoolean(23, 1);
        v3.d0 v0_16 = super.getPaddingStart();
        int v1_10 = super.getPaddingTop();
        int v5_0 = super.getPaddingEnd();
        int v7_2 = super.getPaddingBottom();
        if (!v11_3.hasValue(0)) {
            v4_2.c();
        } else {
            v4_2.r = 1;
            super.setSupportBackgroundTintList(v4_2.m);
            super.setSupportBackgroundTintMode(v4_2.l);
        }
        super.setPaddingRelative((v0_16 + v4_2.f), (v1_10 + v4_2.h), (v5_0 + v4_2.g), (v7_2 + v4_2.i));
        super.setCheckedInternal(v11_3.getBoolean(1, 0));
        if (v3_15 != null) {
            v4_2.d = super.d();
            if (v4_2.c != null) {
                v4_2.d();
            }
            v4_2.c = v3_15;
            v4_2.d();
        }
        super.setOpticalCenterEnabled(v2_2);
        v11_3.recycle();
        super.setCompoundDrawablePadding(super.t);
        if (super.o != null) {
            v10_1 = 1;
        }
        super.h(v10_1);
        return;
    }

    public static synthetic void a(com.google.android.material.button.MaterialButton p1)
    {
        p1.D = p1.getOpticalCenterShift();
        p1.j();
        p1.invalidate();
        return;
    }

    public static synthetic float b(com.google.android.material.button.MaterialButton p0)
    {
        return p0.getDisplayedWidthIncrease();
    }

    public static synthetic void c(com.google.android.material.button.MaterialButton p0, float p1)
    {
        p0.setDisplayedWidthIncrease(p1);
        return;
    }

    private android.text.Layout$Alignment getActualTextAlignment()
    {
        android.text.Layout$Alignment v0_0 = this.getTextAlignment();
        if (v0_0 == 1) {
            return this.getGravityTextAlignment();
        } else {
            if ((v0_0 == 6) || (v0_0 == 3)) {
                return android.text.Layout$Alignment.ALIGN_OPPOSITE;
            } else {
                if (v0_0 == 4) {
                    return android.text.Layout$Alignment.ALIGN_CENTER;
                } else {
                    return android.text.Layout$Alignment.ALIGN_NORMAL;
                }
            }
        }
    }

    private float getDisplayedWidthIncrease()
    {
        return this.I;
    }

    private android.text.Layout$Alignment getGravityTextAlignment()
    {
        android.text.Layout$Alignment v0_3 = (this.getGravity() & 8388615);
        if (v0_3 == 1) {
            return android.text.Layout$Alignment.ALIGN_CENTER;
        } else {
            if ((v0_3 == 5) || (v0_3 == 8388613)) {
                return android.text.Layout$Alignment.ALIGN_OPPOSITE;
            } else {
                return android.text.Layout$Alignment.ALIGN_NORMAL;
            }
        }
    }

    private int getOpticalCenterShift()
    {
        if ((this.C) && (this.E)) {
            int v0_6 = this.d.a(0);
            if (v0_6 != 0) {
                return ((int) (v0_6.i() * 1038174126));
            }
        }
        return 0;
    }

    private int getTextHeight()
    {
        if (this.getLineCount() <= 1) {
            int v0_5 = this.getPaint();
            int v1_1 = this.getText().toString();
            if (this.getTransformationMethod() != null) {
                v1_1 = this.getTransformationMethod().getTransformation(v1_1, this).toString();
            }
            android.graphics.Rect v2_3 = new android.graphics.Rect();
            v0_5.getTextBounds(v1_1, 0, v1_1.length(), v2_3);
            return Math.min(v2_3.height(), this.getLayout().getHeight());
        } else {
            return this.getLayout().getHeight();
        }
    }

    private int getTextLayoutWidth()
    {
        int v0_0 = this.getLineCount();
        float v1 = 0;
        int v2 = 0;
        while (v2 < v0_0) {
            v1 = Math.max(v1, this.getLayout().getLineWidth(v2));
            v2++;
        }
        return ((int) Math.ceil(((double) v1)));
    }

    private void setCheckedInternal(boolean p3)
    {
        boolean v0_0 = this.d;
        if ((v0_0) && ((v0_0.t) && (this.u != p3))) {
            this.u = p3;
            this.refreshDrawableState();
            if ((this.getParent() instanceof com.google.android.material.button.MaterialButtonToggleGroup)) {
                ClassCastException v3_3 = ((com.google.android.material.button.MaterialButtonToggleGroup) this.getParent());
                if (!v3_3.r) {
                    v3_3.f(this.getId(), this.u);
                }
            }
            if (!this.v) {
                this.v = 1;
                ClassCastException v3_7 = this.e.iterator();
                if (v3_7.hasNext()) {
                    throw v1.a.e(v3_7);
                } else {
                    this.v = 0;
                    return;
                }
            }
        }
        return;
    }

    private void setDisplayedWidthIncrease(float p7)
    {
        if (this.I != p7) {
            this.I = p7;
            this.j();
            this.invalidate();
            if ((this.getParent() instanceof i3.e)) {
                int v7_2 = ((i3.e) this.getParent());
                int v0_3 = ((int) this.I);
                int v1 = v7_2.indexOfChild(this);
                if (v1 >= 0) {
                    int v2_0 = (v1 - 1);
                    while(true) {
                        int v2_1;
                        com.google.android.material.button.MaterialButton v3_0 = 0;
                        if (v2_0 < 0) {
                            break;
                        }
                        if (!v7_2.c(v2_0)) {
                            v2_0--;
                        } else {
                            v2_1 = ((com.google.android.material.button.MaterialButton) v7_2.getChildAt(v2_0));
                        }
                        int v4_1 = v7_2.getChildCount();
                        do {
                            v1++;
                            if (v1 < v4_1) {
                            }
                            if ((v2_1 != 0) || (v3_0 != null)) {
                                if (v2_1 == 0) {
                                    v3_0.setDisplayedWidthDecrease(v0_3);
                                }
                                if (v3_0 == null) {
                                    v2_1.setDisplayedWidthDecrease(v0_3);
                                }
                                if ((v2_1 != 0) && (v3_0 != null)) {
                                    v2_1.setDisplayedWidthDecrease((v0_3 / 2));
                                    v3_0.setDisplayedWidthDecrease(((v0_3 + 1) / 2));
                                }
                            }
                        } while(!v7_2.c(v1));
                        v3_0 = ((com.google.android.material.button.MaterialButton) v7_2.getChildAt(v1));
                    }
                    v2_1 = 0;
                }
            }
        }
        return;
    }

    public final f1.h d()
    {
        android.content.res.TypedArray v0_1;
        android.content.res.TypedArray v0_0 = this.getContext();
        IllegalArgumentException v1_9 = c4.b.T(v0_0, 2130969561);
        double v3_5 = c3.a.s;
        if (v1_9 != null) {
            v0_1 = v0_0.obtainStyledAttributes(v1_9.resourceId, v3_5);
        } else {
            v0_1 = v0_0.obtainStyledAttributes(0, v3_5, 0, 2132017476);
        }
        IllegalArgumentException v1_2 = new f1.h();
        float v4_2 = v0_1.getFloat(1, 1);
        if (v4_2 == 1) {
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } else {
            float v5_1 = v0_1.getFloat(0, 1);
            if (v5_1 == 1) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            } else {
                if (v4_2 <= 0) {
                    throw new IllegalArgumentException("Spring stiffness constant must be positive.");
                } else {
                    v1_2.a = Math.sqrt(((double) v4_2));
                    v1_2.c = 0;
                    if (v5_1 < 0) {
                        throw new IllegalArgumentException("Damping ratio must be non-negative");
                    } else {
                        v1_2.b = ((double) v5_1);
                        v1_2.c = 0;
                        v0_1.recycle();
                        return v1_2;
                    }
                }
            }
        }
    }

    public final boolean e()
    {
        int v0_0 = this.d;
        if ((v0_0 == 0) || (v0_0.r)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void f(boolean p9)
    {
        if (this.G != null) {
            if (this.K == null) {
                float v0_5 = new f1.g(this, com.google.android.material.button.MaterialButton.N);
                this.K = v0_5;
                v0_5.j = this.d();
            }
            if (this.E) {
                float v0_2 = this.H;
                f1.g v1_0 = this.G;
                int v2_0 = this.getDrawableState();
                int v4 = 0;
                int v5_0 = 0;
                while(true) {
                    int v7 = -1;
                    if (v5_0 >= v1_0.a) {
                        break;
                    }
                    if (!android.util.StateSet.stateSetMatches(v1_0.c[v5_0], v2_0)) {
                        v5_0++;
                    }
                    if (v5_0 < 0) {
                        int v5_1 = 0;
                        while (v5_1 < v1_0.a) {
                            if (!android.util.StateSet.stateSetMatches(v1_0.c[v5_1], android.util.StateSet.WILD_CARD)) {
                                v5_1++;
                            } else {
                                v7 = v5_1;
                                break;
                            }
                        }
                        v5_0 = v7;
                    }
                    f1.g v1_2;
                    if (v5_0 >= 0) {
                        v1_2 = v1_0.d[v5_0];
                    } else {
                        v1_2 = v1_0.b;
                    }
                    f1.g v1_4 = ((v3.e0) v1_2.b);
                    int v2_2 = this.getWidth();
                    float v3_2 = v1_4.b;
                    f1.g v1_6 = v1_4.a;
                    if (v1_6 != 1) {
                        if (v1_6 == 2) {
                            v4 = ((int) v3_2);
                        }
                    } else {
                        v3_2 *= ((float) v2_2);
                    }
                    this.K.a(((float) Math.min(v0_2, v4)));
                    if (p9 != null) {
                        this.K.d();
                    }
                }
                v5_0 = -1;
            }
        }
        return;
    }

    public final void g()
    {
        android.graphics.drawable.Drawable v0_0 = this.w;
        if ((v0_0 != 1) && (v0_0 != 2)) {
            if ((v0_0 != 3) && (v0_0 != 4)) {
                if ((v0_0 != 16) && (v0_0 != 32)) {
                    return;
                } else {
                    this.setCompoundDrawablesRelative(0, this.o, 0, 0);
                    return;
                }
            } else {
                this.setCompoundDrawablesRelative(0, 0, this.o, 0);
                return;
            }
        } else {
            this.setCompoundDrawablesRelative(this.o, 0, 0, 0);
            return;
        }
    }

    public String getA11yClassName()
    {
        if (android.text.TextUtils.isEmpty(this.p)) {
            String v0_6;
            String v0_4 = this.d;
            if ((v0_4 == null) || (!v0_4.t)) {
                v0_6 = android.widget.Button;
            } else {
                v0_6 = android.widget.CompoundButton;
            }
            return v0_6.getName();
        } else {
            return this.p;
        }
    }

    public int getAllowedWidthDecrease()
    {
        return this.F;
    }

    public android.content.res.ColorStateList getBackgroundTintList()
    {
        return this.getSupportBackgroundTintList();
    }

    public android.graphics.PorterDuff$Mode getBackgroundTintMode()
    {
        return this.getSupportBackgroundTintMode();
    }

    public int getCornerRadius()
    {
        if (!this.e()) {
            return 0;
        } else {
            return this.d.j;
        }
    }

    public f1.h getCornerSpringForce()
    {
        return this.d.d;
    }

    public android.graphics.drawable.Drawable getIcon()
    {
        return this.o;
    }

    public int getIconGravity()
    {
        return this.w;
    }

    public int getIconPadding()
    {
        return this.t;
    }

    public int getIconSize()
    {
        return this.q;
    }

    public android.content.res.ColorStateList getIconTint()
    {
        return this.n;
    }

    public android.graphics.PorterDuff$Mode getIconTintMode()
    {
        return this.m;
    }

    public int getInsetBottom()
    {
        return this.d.i;
    }

    public int getInsetTop()
    {
        return this.d.h;
    }

    public android.content.res.ColorStateList getRippleColor()
    {
        if (!this.e()) {
            return 0;
        } else {
            return this.d.o;
        }
    }

    public v3.p getShapeAppearanceModel()
    {
        if (!this.e()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        } else {
            return this.d.b;
        }
    }

    public v3.d0 getStateListShapeAppearanceModel()
    {
        if (!this.e()) {
            throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        } else {
            return this.d.c;
        }
    }

    public android.content.res.ColorStateList getStrokeColor()
    {
        if (!this.e()) {
            return 0;
        } else {
            return this.d.n;
        }
    }

    public int getStrokeWidth()
    {
        if (!this.e()) {
            return 0;
        } else {
            return this.d.k;
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList()
    {
        if (!this.e()) {
            return super.getSupportBackgroundTintList();
        } else {
            return this.d.m;
        }
    }

    public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()
    {
        if (!this.e()) {
            return super.getSupportBackgroundTintMode();
        } else {
            return this.d.l;
        }
    }

    public final void h(boolean p7)
    {
        android.graphics.drawable.Drawable v0_0 = this.o;
        if (v0_0 != null) {
            android.graphics.drawable.Drawable v0_7 = v0_0.mutate();
            this.o = v0_7;
            v0_7.setTintList(this.n);
            android.graphics.drawable.Drawable v0_11 = this.m;
            if (v0_11 != null) {
                this.o.setTintMode(v0_11);
            }
            android.graphics.drawable.Drawable v0_1 = this.q;
            if (v0_1 == null) {
                v0_1 = this.o.getIntrinsicWidth();
            }
            int v2_1 = this.q;
            if (v2_1 == 0) {
                v2_1 = this.o.getIntrinsicHeight();
            }
            int v4_0 = this.r;
            int v5 = this.s;
            this.o.setBounds(v4_0, v5, (v0_1 + v4_0), (v2_1 + v5));
            this.o.setVisible(1, p7);
        }
        if (p7 == null) {
            android.graphics.drawable.Drawable v7_1 = this.getCompoundDrawablesRelative();
            int v4_1 = this.w;
            if ((((v4_1 != 1) && (v4_1 != 2)) || (v7_1[0] == this.o)) && (((v4_1 != 3) && (v4_1 != 4)) || (v7_1[2] == this.o))) {
                if ((v4_1 != 16) && (v4_1 != 32)) {
                    return;
                } else {
                    if (v7_1[1] == this.o) {
                        return;
                    }
                }
            }
            this.g();
            return;
        } else {
            this.g();
            return;
        }
    }

    public final void i(int p7, int p8)
    {
        if ((this.o != null) && (this.getLayout() != null)) {
            int v0_4 = this.w;
            int v3 = 1;
            if ((v0_4 != 1) && ((v0_4 != 2) && ((v0_4 != 3) && (v0_4 != 4)))) {
                if ((v0_4 != 16) && (v0_4 != 32)) {
                    return;
                } else {
                    this.r = 0;
                    if (v0_4 != 16) {
                        int v7_2 = this.q;
                        if (v7_2 == 0) {
                            v7_2 = this.o.getIntrinsicHeight();
                        }
                        int v7_6 = Math.max(0, ((((((p8 - this.getTextHeight()) - this.getPaddingTop()) - v7_2) - this.t) - this.getPaddingBottom()) / 2));
                        if (this.s != v7_6) {
                            this.s = v7_6;
                            this.h(0);
                            return;
                        }
                    } else {
                        this.s = 0;
                        this.h(0);
                        return;
                    }
                }
            } else {
                this.s = 0;
                int v8_8 = this.getActualTextAlignment();
                int v0_5 = this.w;
                if (((v0_5 != 1) && ((v0_5 != 3) && ((v0_5 != 2) || (v8_8 != android.text.Layout$Alignment.ALIGN_NORMAL)))) && ((v0_5 != 4) || (v8_8 != android.text.Layout$Alignment.ALIGN_OPPOSITE))) {
                    int v0_7 = this.q;
                    if (v0_7 == 0) {
                        v0_7 = this.o.getIntrinsicWidth();
                    }
                    int v7_11 = (((((p7 - this.getTextLayoutWidth()) - this.getPaddingEnd()) - v0_7) - this.t) - this.getPaddingStart());
                    if (v8_8 == android.text.Layout$Alignment.ALIGN_CENTER) {
                        v7_11 /= 2;
                    }
                    int v8_10;
                    if (this.getLayoutDirection() != 1) {
                        v8_10 = 0;
                    } else {
                        v8_10 = 1;
                    }
                    if (this.w != 4) {
                        v3 = 0;
                    }
                    if (v8_10 != v3) {
                        v7_11 = (- v7_11);
                    }
                    if (this.r != v7_11) {
                        this.r = v7_11;
                        this.h(0);
                        return;
                    }
                } else {
                    this.r = 0;
                    this.h(0);
                }
            }
        }
        return;
    }

    public final boolean isChecked()
    {
        return this.u;
    }

    public final void j()
    {
        int v0_3 = ((int) (this.I - this.J));
        int v1_2 = ((v0_3 / 2) + this.D);
        this.getLayoutParams().width = ((int) (this.y + ((float) v0_3)));
        this.setPaddingRelative((this.z + v1_2), this.getPaddingTop(), ((this.A + v0_3) - v1_2), this.getPaddingBottom());
        return;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (this.e()) {
            q4.b.O(this, this.d.a(0));
        }
        return;
    }

    public final int[] onCreateDrawableState(int p2)
    {
        int[] v2_2 = super.onCreateDrawableState((p2 + 2));
        int[] v0_1 = this.d;
        if ((v0_1 != null) && (v0_1.t)) {
            android.view.View.mergeDrawableStates(v2_2, com.google.android.material.button.MaterialButton.L);
        }
        if (this.u) {
            android.view.View.mergeDrawableStates(v2_2, com.google.android.material.button.MaterialButton.M);
        }
        return v2_2;
    }

    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
    {
        super.onInitializeAccessibilityEvent(p2);
        p2.setClassName(this.getA11yClassName());
        p2.setChecked(this.u);
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p2)
    {
        boolean v0_5;
        super.onInitializeAccessibilityNodeInfo(p2);
        p2.setClassName(this.getA11yClassName());
        boolean v0_3 = this.d;
        if ((!v0_3) || (!v0_3.t)) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        p2.setCheckable(v0_5);
        p2.setChecked(this.u);
        p2.setClickable(this.isClickable());
        return;
    }

    public final void onLayout(boolean p2, int p3, int p4, int p5, int p6)
    {
        this = super.onLayout(p2, p3, p4, p5, p6);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        int v3_2 = this.getResources().getConfiguration().orientation;
        if (this.x != v3_2) {
            this.x = v3_2;
            this.y = -1082130432;
        }
        if (this.y == -1082130432) {
            this.y = ((float) this.getMeasuredWidth());
            if ((this.B == null) && (((this.getParent() instanceof i3.e)) && (((i3.e) this.getParent()).getButtonSizeChange() != null))) {
                this.B = ((android.widget.LinearLayout$LayoutParams) this.getLayoutParams());
                int v3_17 = new android.widget.LinearLayout$LayoutParams(this.B);
                v3_17.width = ((int) this.y);
                this.setLayoutParams(v3_17);
            }
        }
        int v4_5 = 0;
        if (this.F == -1) {
            int v3_21;
            if (this.o != null) {
                int v3_20 = this.getIconPadding();
                int v6_1 = this.q;
                if (v6_1 == 0) {
                    v6_1 = this.o.getIntrinsicWidth();
                }
                v3_21 = (v3_20 + v6_1);
            } else {
                v3_21 = 0;
            }
            this.F = ((this.getMeasuredWidth() - this.getTextLayoutWidth()) - v3_21);
        }
        if (this.z == -1) {
            this.z = this.getPaddingStart();
        }
        if (this.A == -1) {
            this.A = this.getPaddingEnd();
        }
        if (((this.getParent() instanceof i3.e)) && (((i3.e) this.getParent()).getOrientation() == 0)) {
            v4_5 = 1;
        }
        this.E = v4_5;
        return;
    }

    public final void onRestoreInstanceState(android.os.Parcelable p2)
    {
        if ((p2 instanceof i3.c)) {
            super.onRestoreInstanceState(((i3.c) p2).a);
            this.setChecked(((i3.c) p2).c);
            return;
        } else {
            super.onRestoreInstanceState(p2);
            return;
        }
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        i3.c v1_1 = new i3.c(super.onSaveInstanceState());
        v1_1.c = this.u;
        return v1_1;
    }

    public final void onTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        super.onTextChanged(p1, p2, p3, p4);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        return;
    }

    public final boolean performClick()
    {
        if ((this.isEnabled()) && (this.d.u)) {
            this.toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState()
    {
        super.refreshDrawableState();
        if ((this.o != null) && (this.o.setState(this.getDrawableState()))) {
            this.invalidate();
        }
        return;
    }

    public void setA11yClassName(String p1)
    {
        this.p = p1;
        return;
    }

    public void setBackground(android.graphics.drawable.Drawable p1)
    {
        this.setBackgroundDrawable(p1);
        return;
    }

    public void setBackgroundColor(int p4)
    {
        if (!this.e()) {
            super.setBackgroundColor(p4);
            return;
        } else {
            v3.k v0_2 = this.d;
            if (v0_2.a(0) != null) {
                v0_2.a(0).setTint(p4);
            }
            return;
        }
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p4)
    {
        if (!this.e()) {
            super.setBackgroundDrawable(p4);
            return;
        } else {
            if (p4 == this.getBackground()) {
                this.getBackground().setState(p4.getState());
                return;
            } else {
                android.util.Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                android.graphics.PorterDuff$Mode v1_1 = this.d;
                v1_1.r = 1;
                android.graphics.drawable.Drawable v0_3 = v1_1.a;
                v0_3.setSupportBackgroundTintList(v1_1.m);
                v0_3.setSupportBackgroundTintMode(v1_1.l);
                super.setBackgroundDrawable(p4);
                return;
            }
        }
    }

    public void setBackgroundResource(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = j5.t1.A(this.getContext(), p2);
        }
        this.setBackgroundDrawable(v2_1);
        return;
    }

    public void setBackgroundTintList(android.content.res.ColorStateList p1)
    {
        this.setSupportBackgroundTintList(p1);
        return;
    }

    public void setBackgroundTintMode(android.graphics.PorterDuff$Mode p1)
    {
        this.setSupportBackgroundTintMode(p1);
        return;
    }

    public void setCheckable(boolean p2)
    {
        if (this.e()) {
            this.d.t = p2;
        }
        return;
    }

    public void setChecked(boolean p1)
    {
        this.setCheckedInternal(p1);
        return;
    }

    public void setCornerRadius(int p4)
    {
        if (this.e()) {
            i3.f v0_1 = this.d;
            if ((!v0_1.s) || (v0_1.j != p4)) {
                v0_1.j = p4;
                v0_1.s = 1;
                v3.o v1_1 = v0_1.b.f();
                v1_1.e = new v3.a(((float) p4));
                v1_1.f = new v3.a(((float) p4));
                v1_1.g = new v3.a(((float) p4));
                v1_1.h = new v3.a(((float) p4));
                v0_1.b = v1_1.a();
                v0_1.c = 0;
                v0_1.d();
            }
        }
        return;
    }

    public void setCornerRadiusResource(int p2)
    {
        if (this.e()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(p2));
        }
        return;
    }

    public void setCornerSpringForce(f1.h p2)
    {
        i3.f v0 = this.d;
        v0.d = p2;
        if (v0.c != null) {
            v0.d();
        }
        return;
    }

    public void setDisplayedWidthDecrease(int p2)
    {
        this.J = ((float) Math.min(p2, this.F));
        this.j();
        this.invalidate();
        return;
    }

    public void setElevation(float p3)
    {
        super.setElevation(p3);
        if (this.e()) {
            this.d.a(0).n(p3);
        }
        return;
    }

    public void setIcon(android.graphics.drawable.Drawable p2)
    {
        if (this.o != p2) {
            this.o = p2;
            this.h(1);
            this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
        return;
    }

    public void setIconGravity(int p2)
    {
        if (this.w != p2) {
            this.w = p2;
            this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
        return;
    }

    public void setIconPadding(int p2)
    {
        if (this.t != p2) {
            this.t = p2;
            this.setCompoundDrawablePadding(p2);
        }
        return;
    }

    public void setIconResource(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = j5.t1.A(this.getContext(), p2);
        }
        this.setIcon(v2_1);
        return;
    }

    public void setIconSize(int p2)
    {
        if (p2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else {
            if (this.q != p2) {
                this.q = p2;
                this.h(1);
            }
            return;
        }
    }

    public void setIconTint(android.content.res.ColorStateList p2)
    {
        if (this.n != p2) {
            this.n = p2;
            this.h(0);
        }
        return;
    }

    public void setIconTintMode(android.graphics.PorterDuff$Mode p2)
    {
        if (this.m != p2) {
            this.m = p2;
            this.h(0);
        }
        return;
    }

    public void setIconTintResource(int p2)
    {
        this.setIconTint(e0.c.getColorStateList(this.getContext(), p2));
        return;
    }

    public void setInsetBottom(int p3)
    {
        i3.f v0 = this.d;
        v0.b(v0.h, p3);
        return;
    }

    public void setInsetTop(int p3)
    {
        i3.f v0 = this.d;
        v0.b(p3, v0.i);
        return;
    }

    public void setInternalBackground(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        return;
    }

    public void setOnPressedChangeListenerInternal(i3.b p1)
    {
        this.f = p1;
        return;
    }

    public void setOpticalCenterEnabled(boolean p4)
    {
        if (this.C != p4) {
            this.C = p4;
            i3.f v1 = this.d;
            if (p4 == null) {
                v1.e = 0;
                int v0_4 = v1.a(0);
                if (v0_4 != 0) {
                    v0_4.J = 0;
                }
            } else {
                androidx.lifecycle.g0 v4_2 = new a5.a(this, 9);
                v1.e = v4_2;
                int v0_1 = v1.a(0);
                if (v0_1 != 0) {
                    v0_1.J = v4_2;
                }
            }
            this.post(new androidx.lifecycle.g0(this, 7));
        }
        return;
    }

    public void setPressed(boolean p2)
    {
        com.google.android.material.button.MaterialButtonToggleGroup v0_0 = this.f;
        if (v0_0 != null) {
            ((com.google.android.material.button.MaterialButtonToggleGroup) ((l6.c) v0_0).b).invalidate();
        }
        super.setPressed(p2);
        this.f(0);
        return;
    }

    public void setRippleColor(android.content.res.ColorStateList p4)
    {
        if (this.e()) {
            android.graphics.drawable.RippleDrawable v0_4 = this.d;
            com.google.android.material.button.MaterialButton v1 = v0_4.a;
            if (v0_4.o != p4) {
                v0_4.o = p4;
                if ((v1.getBackground() instanceof android.graphics.drawable.RippleDrawable)) {
                    ((android.graphics.drawable.RippleDrawable) v1.getBackground()).setColor(t3.a.a(p4));
                }
            }
        }
        return;
    }

    public void setRippleColorResource(int p2)
    {
        if (this.e()) {
            this.setRippleColor(e0.c.getColorStateList(this.getContext(), p2));
        }
        return;
    }

    public void setShapeAppearanceModel(v3.p p2)
    {
        if (!this.e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        } else {
            String v0_2 = this.d;
            v0_2.b = p2;
            v0_2.c = 0;
            v0_2.d();
            return;
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean p2)
    {
        if (this.e()) {
            i3.f v0_1 = this.d;
            v0_1.q = p2;
            v0_1.e();
        }
        return;
    }

    public void setSizeChange(v3.f0 p2)
    {
        if (this.G != p2) {
            this.G = p2;
            this.f(1);
        }
        return;
    }

    public void setStateListShapeAppearanceModel(v3.d0 p3)
    {
        if (!this.e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        } else {
            String v0_2 = this.d;
            if ((v0_2.d == null) && (p3.d())) {
                v0_2.d = this.d();
                if (v0_2.c != null) {
                    v0_2.d();
                }
            }
            v0_2.c = p3;
            v0_2.d();
            return;
        }
    }

    public void setStrokeColor(android.content.res.ColorStateList p3)
    {
        if (this.e()) {
            i3.f v0_1 = this.d;
            if (v0_1.n != p3) {
                v0_1.n = p3;
                v0_1.e();
            }
        }
        return;
    }

    public void setStrokeColorResource(int p2)
    {
        if (this.e()) {
            this.setStrokeColor(e0.c.getColorStateList(this.getContext(), p2));
        }
        return;
    }

    public void setStrokeWidth(int p3)
    {
        if (this.e()) {
            i3.f v0_1 = this.d;
            if (v0_1.k != p3) {
                v0_1.k = p3;
                v0_1.e();
            }
        }
        return;
    }

    public void setStrokeWidthResource(int p2)
    {
        if (this.e()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(p2));
        }
        return;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList p3)
    {
        if (!this.e()) {
            super.setSupportBackgroundTintList(p3);
            return;
        } else {
            android.content.res.ColorStateList v0_2 = this.d;
            if (v0_2.m != p3) {
                v0_2.m = p3;
                if (v0_2.a(0) != null) {
                    v0_2.a(0).setTintList(v0_2.m);
                }
            }
            return;
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode p3)
    {
        if (!this.e()) {
            super.setSupportBackgroundTintMode(p3);
            return;
        } else {
            android.graphics.PorterDuff$Mode v0_2 = this.d;
            if (v0_2.l != p3) {
                v0_2.l = p3;
                if ((v0_2.a(0) != null) && (v0_2.l != null)) {
                    v0_2.a(0).setTintMode(v0_2.l);
                }
            }
            return;
        }
    }

    public void setTextAlignment(int p2)
    {
        super.setTextAlignment(p2);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        return;
    }

    public void setToggleCheckedStateOnClick(boolean p2)
    {
        this.d.u = p2;
        return;
    }

    public void setWidth(int p2)
    {
        this.y = -1082130432;
        super.setWidth(p2);
        return;
    }

    public void setWidthChangeMax(int p2)
    {
        if (this.H != p2) {
            this.H = p2;
            this.f(1);
        }
        return;
    }

    public final void toggle()
    {
        this.setChecked((this.u ^ 1));
        return;
    }
}
