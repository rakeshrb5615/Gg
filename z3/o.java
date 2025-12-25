package z3;
public final class o extends android.widget.LinearLayout {
    public android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener A;
    public final z3.l B;
    public final com.google.android.material.textfield.TextInputLayout a;
    public final android.widget.FrameLayout b;
    public final com.google.android.material.internal.CheckableImageButton c;
    public android.content.res.ColorStateList d;
    public android.graphics.PorterDuff$Mode e;
    public android.view.View$OnLongClickListener f;
    public final com.google.android.material.internal.CheckableImageButton m;
    public final z3.n n;
    public int o;
    public final java.util.LinkedHashSet p;
    public android.content.res.ColorStateList q;
    public android.graphics.PorterDuff$Mode r;
    public int s;
    public android.widget.ImageView$ScaleType t;
    public android.view.View$OnLongClickListener u;
    public CharSequence v;
    public final n.b1 w;
    public boolean x;
    public android.widget.EditText y;
    public final android.view.accessibility.AccessibilityManager z;

    public o(com.google.android.material.textfield.TextInputLayout p18, b8.g p19)
    {
        z3.o v0_1 = super(p18.getContext());
        v0_1.o = 0;
        v0_1.p = new java.util.LinkedHashSet();
        v0_1.B = new z3.l(v0_1);
        z3.m v4_3 = new z3.m(v0_1);
        v0_1.z = ((android.view.accessibility.AccessibilityManager) v0_1.getContext().getSystemService("accessibility"));
        v0_1.a = p18;
        v0_1.setVisibility(8);
        v0_1.setOrientation(0);
        v0_1.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-2, -1, 8388613));
        android.widget.FrameLayout v6_4 = new android.widget.FrameLayout(v0_1.getContext());
        v0_1.b = v6_4;
        v6_4.setVisibility(8);
        v6_4.setLayoutParams(new android.widget.LinearLayout$LayoutParams(-2, -1));
        com.google.android.material.internal.CheckableImageButton v7_5 = android.view.LayoutInflater.from(v0_1.getContext());
        com.google.android.material.internal.CheckableImageButton v10_1 = v0_1.a(v0_1, v7_5, 2131362501);
        v0_1.c = v10_1;
        com.google.android.material.internal.CheckableImageButton v7_6 = v0_1.a(v6_4, v7_5, 2131362500);
        v0_1.m = v7_6;
        v0_1.n = new z3.n(v0_1, p19);
        CharSequence v13 = 0;
        n.b1 v11_4 = new n.b1(v0_1.getContext(), 0);
        v0_1.w = v11_4;
        android.content.res.TypedArray v12_2 = ((android.content.res.TypedArray) p19.c);
        if (v12_2.hasValue(38)) {
            v0_1.d = j5.t1.w(v0_1.getContext(), p19, 38);
        }
        if (v12_2.hasValue(39)) {
            v0_1.e = q3.k.g(v12_2.getInt(39, -1), 0);
        }
        if (v12_2.hasValue(37)) {
            v0_1.i(p19.i(37));
        }
        v10_1.setContentDescription(v0_1.getResources().getText(2131951834));
        v10_1.setImportantForAccessibility(2);
        v10_1.setClickable(0);
        v10_1.setPressable(0);
        v10_1.setCheckable(0);
        v10_1.setFocusable(0);
        if (!v12_2.hasValue(54)) {
            if (v12_2.hasValue(32)) {
                v0_1.q = j5.t1.w(v0_1.getContext(), p19, 32);
            }
            if (v12_2.hasValue(33)) {
                v0_1.r = q3.k.g(v12_2.getInt(33, -1), 0);
            }
        }
        if (!v12_2.hasValue(30)) {
            if (v12_2.hasValue(54)) {
                if (v12_2.hasValue(55)) {
                    v0_1.q = j5.t1.w(v0_1.getContext(), p19, 55);
                }
                if (v12_2.hasValue(56)) {
                    v0_1.r = q3.k.g(v12_2.getInt(56, -1), 0);
                }
                v0_1.g(v12_2.getBoolean(54, 0));
                android.widget.LinearLayout$LayoutParams v8_14 = v12_2.getText(52);
                if (v7_6.getContentDescription() != v8_14) {
                    v7_6.setContentDescription(v8_14);
                }
            }
        } else {
            v0_1.g(v12_2.getInt(30, 0));
            if (v12_2.hasValue(27)) {
                android.widget.LinearLayout$LayoutParams v8_17 = v12_2.getText(27);
                if (v7_6.getContentDescription() != v8_17) {
                    v7_6.setContentDescription(v8_17);
                }
            }
            v7_6.setCheckable(v12_2.getBoolean(26, 1));
        }
        android.widget.LinearLayout$LayoutParams v8_22 = v12_2.getDimensionPixelSize(29, v0_1.getResources().getDimensionPixelSize(2131166140));
        if (v8_22 < null) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else {
            if (v8_22 != v0_1.s) {
                v0_1.s = v8_22;
                v7_6.setMinimumWidth(v8_22);
                v7_6.setMinimumHeight(v8_22);
                v10_1.setMinimumWidth(v8_22);
                v10_1.setMinimumHeight(v8_22);
            }
            if (v12_2.hasValue(31)) {
                android.widget.LinearLayout$LayoutParams v8_25 = y0.d.d(v12_2.getInt(31, -1));
                v0_1.t = v8_25;
                v7_6.setScaleType(v8_25);
                v10_1.setScaleType(v8_25);
            }
            v11_4.setVisibility(8);
            v11_4.setId(2131362508);
            v11_4.setLayoutParams(new android.widget.LinearLayout$LayoutParams(-2, -2, 1117782016));
            v11_4.setAccessibilityLiveRegion(1);
            v11_4.setTextAppearance(v12_2.getResourceId(73, 0));
            if (v12_2.hasValue(74)) {
                v11_4.setTextColor(p19.h(74));
            }
            int v2_4 = v12_2.getText(72);
            if (!android.text.TextUtils.isEmpty(v2_4)) {
                v13 = v2_4;
            }
            v0_1.v = v13;
            v11_4.setText(v2_4);
            v0_1.n();
            v6_4.addView(v7_6);
            v0_1.addView(v11_4);
            v0_1.addView(v6_4);
            v0_1.addView(v10_1);
            p18.l0.add(v4_3);
            if (p18.e != null) {
                v4_3.a(p18);
            }
            v0_1.addOnAttachStateChangeListener(new f3.b(v0_1, 4));
            return;
        }
    }

    public final com.google.android.material.internal.CheckableImageButton a(android.view.ViewGroup p3, android.view.LayoutInflater p4, int p5)
    {
        com.google.android.material.internal.CheckableImageButton v3_2 = ((com.google.android.material.internal.CheckableImageButton) p4.inflate(2131558448, p3, 0));
        v3_2.setId(p5);
        if (j5.t1.J(this.getContext())) {
            ((android.view.ViewGroup$MarginLayoutParams) v3_2.getLayoutParams()).setMarginStart(0);
        }
        return v3_2;
    }

    public final z3.p b()
    {
        String v0_0 = this.o;
        IllegalArgumentException v1_0 = this.n;
        String v2_0 = v1_0.a;
        z3.o v3_1 = ((z3.p) v2_0.get(v0_0));
        if (v3_1 != null) {
            return v3_1;
        } else {
            IllegalArgumentException v1_2;
            z3.o v3_2 = v1_0.b;
            if (v0_0 == -1) {
                v1_2 = new z3.e(v3_2, 0);
            } else {
                if (v0_0 == null) {
                    v1_2 = new z3.e(v3_2, 1);
                } else {
                    if (v0_0 == 1) {
                        v1_2 = new z3.v(v3_2, v1_0.d);
                    } else {
                        if (v0_0 == 2) {
                            v1_2 = new z3.d(v3_2);
                        } else {
                            if (v0_0 != 3) {
                                throw new IllegalArgumentException(g2.g.c(v0_0, "Invalid end icon mode: "));
                            } else {
                                v1_2 = new z3.k(v3_2);
                            }
                        }
                    }
                }
            }
            v2_0.append(v0_0, v1_2);
            return v1_2;
        }
    }

    public final int c()
    {
        if ((!this.d()) && (!this.e())) {
            int v0_4 = 0;
        } else {
            int v0_6 = this.m;
            v0_4 = (((android.view.ViewGroup$MarginLayoutParams) v0_6.getLayoutParams()).getMarginStart() + v0_6.getMeasuredWidth());
        }
        return ((this.w.getPaddingEnd() + this.getPaddingEnd()) + v0_4);
    }

    public final boolean d()
    {
        if ((this.b.getVisibility() != 0) || (this.m.getVisibility() != 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean e()
    {
        if (this.c.getVisibility() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void f(boolean p6)
    {
        int v1_0;
        android.content.res.ColorStateList v0_0 = this.b();
        com.google.android.material.internal.CheckableImageButton v2 = this.m;
        int v3 = 1;
        if (!v0_0.j()) {
            v1_0 = 0;
        } else {
            int v1_3 = v2.d;
            if (v1_3 == v0_0.k()) {
            } else {
                v2.setChecked((v1_3 ^ 1));
                v1_0 = 1;
            }
        }
        if (!(v0_0 instanceof z3.k)) {
            v3 = v1_0;
        } else {
            boolean v4_1 = v2.isActivated();
            if (v4_1 == ((z3.k) v0_0).l) {
            } else {
                v2.setActivated((v4_1 ^ 1));
            }
        }
        if ((p6 == null) && (v3 == 0)) {
            return;
        } else {
            y0.d.h(this.a, v2, this.q);
            return;
        }
    }

    public final void g(int p9)
    {
        if (this.o != p9) {
            IllegalStateException v0_4 = this.b();
            android.graphics.PorterDuff$Mode v1_1 = this.A;
            String v2_0 = this.z;
            if ((v1_1 != null) && (v2_0 != null)) {
                v2_0.removeTouchExplorationStateChangeListener(v1_1);
            }
            android.graphics.PorterDuff$Mode v1_3 = 0;
            this.A = 0;
            v0_4.r();
            this.o = p9;
            IllegalStateException v0_2 = this.p.iterator();
            if (v0_2.hasNext()) {
                throw v1.a.e(v0_2);
            } else {
                z3.p v3_1;
                if (p9 == null) {
                    v3_1 = 0;
                } else {
                    v3_1 = 1;
                }
                this.h(v3_1);
                z3.p v3_2 = this.b();
                CharSequence v4_1 = this.n.c;
                if (v4_1 == null) {
                    v4_1 = v3_2.d();
                }
                CharSequence v4_2;
                if (v4_1 == null) {
                    v4_2 = 0;
                } else {
                    v4_2 = j5.t1.A(this.getContext(), v4_1);
                }
                com.google.android.material.internal.CheckableImageButton v5_1 = this.m;
                v5_1.setImageDrawable(v4_2);
                com.google.android.material.textfield.TextInputLayout v6 = this.a;
                if (v4_2 != null) {
                    y0.d.a(v6, v5_1, this.q, this.r);
                    y0.d.h(v6, v5_1, this.q);
                }
                CharSequence v4_5 = v3_2.c();
                if (v4_5 != null) {
                    v1_3 = this.getResources().getText(v4_5);
                }
                if (v5_1.getContentDescription() != v1_3) {
                    v5_1.setContentDescription(v1_3);
                }
                v5_1.setCheckable(v3_2.j());
                if (!v3_2.i(v6.getBoxBackgroundMode())) {
                    android.graphics.PorterDuff$Mode v1_8 = new StringBuilder("The current box background mode ");
                    v1_8.append(v6.getBoxBackgroundMode());
                    v1_8.append(" is not supported by the end icon mode ");
                    v1_8.append(p9);
                    throw new IllegalStateException(v1_8.toString());
                } else {
                    v3_2.q();
                    android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener v9_4 = v3_2.h();
                    this.A = v9_4;
                    if ((v9_4 != null) && ((v2_0 != null) && (this.isAttachedToWindow()))) {
                        v2_0.addTouchExplorationStateChangeListener(this.A);
                    }
                    android.graphics.PorterDuff$Mode v1_9 = this.u;
                    v5_1.setOnClickListener(v3_2.f());
                    y0.d.i(v5_1, v1_9);
                    android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener v9_8 = this.y;
                    if (v9_8 != null) {
                        v3_2.l(v9_8);
                        this.j(v3_2);
                    }
                    y0.d.a(v6, v5_1, this.q, this.r);
                    this.f(1);
                    return;
                }
            }
        } else {
            return;
        }
    }

    public final void h(boolean p2)
    {
        if (this.d() != p2) {
            com.google.android.material.textfield.TextInputLayout v2_2;
            if (p2 == null) {
                v2_2 = 8;
            } else {
                v2_2 = 0;
            }
            this.m.setVisibility(v2_2);
            this.k();
            this.m();
            this.a.s();
        }
        return;
    }

    public final void i(android.graphics.drawable.Drawable p4)
    {
        com.google.android.material.internal.CheckableImageButton v0 = this.c;
        v0.setImageDrawable(p4);
        this.l();
        y0.d.a(this.a, v0, this.d, this.e);
        return;
    }

    public final void j(z3.p p3)
    {
        if (this.y != null) {
            if (p3.e() != null) {
                this.y.setOnFocusChangeListener(p3.e());
            }
            if (p3.g() != null) {
                this.m.setOnFocusChangeListener(p3.g());
            }
        }
        return;
    }

    public final void k()
    {
        int v0_1;
        int v1 = 8;
        if ((this.m.getVisibility() != 0) || (this.e())) {
            v0_1 = 8;
        } else {
            v0_1 = 0;
        }
        int v0_4;
        this.b.setVisibility(v0_1);
        if ((this.v == null) || (this.x)) {
            v0_4 = 8;
        } else {
            v0_4 = 0;
        }
        if ((this.d()) || ((this.e()) || (v0_4 == 0))) {
            v1 = 0;
        }
        this.setVisibility(v1);
        return;
    }

    public final void l()
    {
        int v1_0;
        int v0_0 = this.c;
        com.google.android.material.textfield.TextInputLayout v2 = this.a;
        if ((v0_0.getDrawable() == null) || ((!v2.q.q) || (!v2.o()))) {
            v1_0 = 8;
        } else {
            v1_0 = 0;
        }
        v0_0.setVisibility(v1_0);
        this.k();
        this.m();
        if (this.o == 0) {
            v2.s();
            return;
        } else {
            return;
        }
    }

    public final void m()
    {
        int v0_0 = this.a;
        if (v0_0.e != null) {
            if ((!this.d()) && (!this.e())) {
                int v1_1 = v0_0.e.getPaddingEnd();
            } else {
                v1_1 = 0;
            }
            this.w.setPaddingRelative(this.getContext().getResources().getDimensionPixelSize(2131166009), v0_0.e.getPaddingTop(), v1_1, v0_0.e.getPaddingBottom());
            return;
        } else {
            return;
        }
    }

    public final void n()
    {
        int v2_2;
        com.google.android.material.textfield.TextInputLayout v0_0 = this.w;
        z3.p v1_1 = v0_0.getVisibility();
        int v3 = 0;
        if ((this.v == null) || (this.x)) {
            v2_2 = 8;
        } else {
            v2_2 = 0;
        }
        if (v1_1 != v2_2) {
            z3.p v1_0 = this.b();
            if (v2_2 == 0) {
                v3 = 1;
            }
            v1_0.o(v3);
        }
        this.k();
        v0_0.setVisibility(v2_2);
        this.a.s();
        return;
    }
}
