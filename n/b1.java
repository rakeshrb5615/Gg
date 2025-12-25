package n;
public class b1 extends android.widget.TextView {
    public final n.p a;
    public final n.x0 b;
    public final n.c0 c;
    public n.x d;
    public boolean e;
    public j6.o f;
    public java.util.concurrent.Future m;

    public b1(android.content.Context p2, android.util.AttributeSet p3)
    {
        this(p2, p3, 16842884);
        return;
    }

    public b1(android.content.Context p1, android.util.AttributeSet p2, int p3)
    {
        n.u2.a(p1);
        super(p1, p2, p3);
        super.e = 0;
        super.f = 0;
        n.t2.a(super, super.getContext());
        n.x v1_1 = new n.p(super);
        super.a = v1_1;
        v1_1.q(p2, p3);
        n.x v1_3 = new n.x0(super);
        super.b = v1_3;
        v1_3.f(p2, p3);
        v1_3.b();
        n.x v1_5 = new n.c0();
        v1_5.b = super;
        super.c = v1_5;
        super.getEmojiTextViewHelper().b(p2, p3);
        return;
    }

    public static synthetic void d(n.b1 p0, int p1)
    {
        super.setFirstBaselineToTopHeight(p1);
        return;
    }

    public static synthetic void e(n.b1 p0, int p1)
    {
        super.setLastBaselineToBottomHeight(p1);
        return;
    }

    public static synthetic void f(n.b1 p0, int p1, float p2)
    {
        super.setLineHeight(p1, p2);
        return;
    }

    private n.x getEmojiTextViewHelper()
    {
        if (this.d == null) {
            this.d = new n.x(this);
        }
        return this.d;
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        n.x0 v0_0 = this.a;
        if (v0_0 != null) {
            v0_0.a();
        }
        n.x0 v0_1 = this.b;
        if (v0_1 != null) {
            v0_1.b();
        }
        return;
    }

    public int getAutoSizeMaxTextSize()
    {
        if (!n.k3.c) {
            int v0_5 = this.b;
            if (v0_5 == 0) {
                return -1;
            } else {
                return Math.round(v0_5.i.e);
            }
        } else {
            this.getSuperCaller();
            return super.getAutoSizeMaxTextSize();
        }
    }

    public int getAutoSizeMinTextSize()
    {
        if (!n.k3.c) {
            int v0_5 = this.b;
            if (v0_5 == 0) {
                return -1;
            } else {
                return Math.round(v0_5.i.d);
            }
        } else {
            this.getSuperCaller();
            return super.getAutoSizeMinTextSize();
        }
    }

    public int getAutoSizeStepGranularity()
    {
        if (!n.k3.c) {
            int v0_5 = this.b;
            if (v0_5 == 0) {
                return -1;
            } else {
                return Math.round(v0_5.i.c);
            }
        } else {
            this.getSuperCaller();
            return super.getAutoSizeStepGranularity();
        }
    }

    public int[] getAutoSizeTextAvailableSizes()
    {
        if (!n.k3.c) {
            int[] v0_5 = this.b;
            if (v0_5 == null) {
                int[] v0_7 = new int[0];
                return v0_7;
            } else {
                return v0_5.i.f;
            }
        } else {
            this.getSuperCaller();
            return super.getAutoSizeTextAvailableSizes();
        }
    }

    public int getAutoSizeTextType()
    {
        if (!n.k3.c) {
            int v0_4 = this.b;
            if (v0_4 != 0) {
                return v0_4.i.a;
            }
        } else {
            this.getSuperCaller();
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
        }
        return 0;
    }

    public android.view.ActionMode$Callback getCustomSelectionActionModeCallback()
    {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight()
    {
        return (this.getPaddingTop() - this.getPaint().getFontMetricsInt().top);
    }

    public int getLastBaselineToBottomHeight()
    {
        return (this.getPaddingBottom() + this.getPaint().getFontMetricsInt().bottom);
    }

    public n.y0 getSuperCaller()
    {
        if (this.f == null) {
            j6.o v0_6 = android.os.Build$VERSION.SDK_INT;
            if (v0_6 < 34) {
                if (v0_6 < 28) {
                    this.f = new j6.o(this, 6);
                } else {
                    this.f = new n.z0(this);
                }
            } else {
                this.f = new n.a1(this);
            }
        }
        return this.f;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.o();
        }
    }

    public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.p();
        }
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList()
    {
        return this.b.d();
    }

    public android.graphics.PorterDuff$Mode getSupportCompoundDrawablesTintMode()
    {
        return this.b.e();
    }

    public CharSequence getText()
    {
        ClassCastException v0_0 = this.m;
        try {
            if (v0_0 != null) {
                this.m = 0;
                if (v0_0.get() != null) {
                    throw new ClassCastException();
                } else {
                    if (android.os.Build$VERSION.SDK_INT < 29) {
                        c4.b.E(this);
                        throw 0;
                    } else {
                        throw 0;
                    }
                }
            } else {
                return super.getText();
            }
        } catch (java.util.concurrent.ExecutionException) {
            return super.getText();
        }
    }

    public android.view.textclassifier.TextClassifier getTextClassifier()
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            android.view.textclassifier.TextClassifier v0_7 = this.c;
            if (v0_7 != null) {
                android.view.textclassifier.TextClassifier v1_2 = ((android.view.textclassifier.TextClassifier) v0_7.c);
                if (v1_2 != null) {
                    return v1_2;
                } else {
                    return n.s0.a(((android.widget.TextView) v0_7.b));
                }
            }
        }
        this.getSuperCaller();
        return super.getTextClassifier();
    }

    public o0.c getTextMetricsParamsCompat()
    {
        return c4.b.E(this);
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p3)
    {
        android.view.inputmethod.InputConnection v0 = super.onCreateInputConnection(p3);
        this.b.getClass();
        n.x0.h(p3, v0, this);
        a.a.M(p3, v0, this);
        return v0;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        android.view.inputmethod.InputMethodManager v0_0 = android.os.Build$VERSION.SDK_INT;
        if ((v0_0 >= 30) && ((v0_0 < 33) && (this.onCheckIsTextEditor()))) {
            ((android.view.inputmethod.InputMethodManager) this.getContext().getSystemService("input_method")).isActive(this);
        }
        return;
    }

    public final void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        n.g1 v2_1 = super.onLayout(p1, p2, p3, p4, p5).b;
        if ((v2_1 != null) && (!n.k3.c)) {
            v2_1.i.a();
        }
        return;
    }

    public void onMeasure(int p4, int p5)
    {
        ClassCastException v0_0 = this.m;
        try {
            if (v0_0 != null) {
                this.m = 0;
                if (v0_0.get() != null) {
                    throw new ClassCastException();
                } else {
                    if (android.os.Build$VERSION.SDK_INT < 29) {
                        c4.b.E(this);
                        throw 0;
                    } else {
                        throw 0;
                    }
                }
            } else {
                super.onMeasure(p4, p5);
                return;
            }
        } catch (java.util.concurrent.ExecutionException) {
            super.onMeasure(p4, p5);
            return;
        }
    }

    public final void onTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        super.onTextChanged(p1, p2, p3, p4);
        n.g1 v1_1 = this.b;
        if (v1_1 != null) {
            n.g1 v1_2 = v1_1.i;
            if ((!n.k3.c) && (v1_2.f())) {
                v1_2.a();
            }
        }
        return;
    }

    public void setAllCaps(boolean p2)
    {
        super.setAllCaps(p2);
        this.getEmojiTextViewHelper().c(p2);
        return;
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int p2, int p3, int p4, int p5)
    {
        if (!n.k3.c) {
            n.x0 v0_1 = this.b;
            if (v0_1 != null) {
                v0_1.i(p2, p3, p4, p5);
            }
            return;
        } else {
            this.getSuperCaller();
            super.setAutoSizeTextTypeUniformWithConfiguration(p2, p3, p4, p5);
            return;
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] p2, int p3)
    {
        if (!n.k3.c) {
            n.x0 v0_1 = this.b;
            if (v0_1 != null) {
                v0_1.j(p2, p3);
            }
            return;
        } else {
            this.getSuperCaller();
            super.setAutoSizeTextTypeUniformWithPresetSizes(p2, p3);
            return;
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int p2)
    {
        if (!n.k3.c) {
            n.x0 v0_1 = this.b;
            if (v0_1 != null) {
                v0_1.k(p2);
            }
            return;
        } else {
            this.getSuperCaller();
            super.setAutoSizeTextTypeWithDefaults(p2);
            return;
        }
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        n.p v1_1 = this.a;
        if (v1_1 != null) {
            v1_1.r();
        }
        return;
    }

    public void setBackgroundResource(int p2)
    {
        super.setBackgroundResource(p2);
        n.p v0 = this.a;
        if (v0 != null) {
            v0.s(p2);
        }
        return;
    }

    public final void setCompoundDrawables(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawables(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawablesRelative(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int p3, int p4, int p5, int p6)
    {
        n.x0 v3_2;
        android.content.Context v0 = this.getContext();
        android.graphics.drawable.Drawable v1 = 0;
        if (p3 == null) {
            v3_2 = 0;
        } else {
            v3_2 = j5.t1.A(v0, p3);
        }
        int v4_1;
        if (p4 == 0) {
            v4_1 = 0;
        } else {
            v4_1 = j5.t1.A(v0, p4);
        }
        int v5_1;
        if (p5 == 0) {
            v5_1 = 0;
        } else {
            v5_1 = j5.t1.A(v0, p5);
        }
        if (p6 != 0) {
            v1 = j5.t1.A(v0, p6);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(v3_2, v4_1, v5_1, v1);
        n.x0 v3_1 = this.b;
        if (v3_1 != null) {
            v3_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int p3, int p4, int p5, int p6)
    {
        n.x0 v3_2;
        android.content.Context v0 = this.getContext();
        android.graphics.drawable.Drawable v1 = 0;
        if (p3 == null) {
            v3_2 = 0;
        } else {
            v3_2 = j5.t1.A(v0, p3);
        }
        int v4_1;
        if (p4 == 0) {
            v4_1 = 0;
        } else {
            v4_1 = j5.t1.A(v0, p4);
        }
        int v5_1;
        if (p5 == 0) {
            v5_1 = 0;
        } else {
            v5_1 = j5.t1.A(v0, p5);
        }
        if (p6 != 0) {
            v1 = j5.t1.A(v0, p6);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(v3_2, v4_1, v5_1, v1);
        n.x0 v3_1 = this.b;
        if (v3_1 != null) {
            v3_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawablesWithIntrinsicBounds(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public void setCustomSelectionActionModeCallback(android.view.ActionMode$Callback p1)
    {
        super.setCustomSelectionActionModeCallback(c4.b.i0(p1, this));
        return;
    }

    public void setEmojiCompatEnabled(boolean p2)
    {
        this.getEmojiTextViewHelper().d(p2);
        return;
    }

    public void setFilters(android.text.InputFilter[] p2)
    {
        super.setFilters(this.getEmojiTextViewHelper().a(p2));
        return;
    }

    public void setFirstBaselineToTopHeight(int p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            c4.b.X(p3, this);
            return;
        } else {
            this.getSuperCaller().k(p3);
            return;
        }
    }

    public void setLastBaselineToBottomHeight(int p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            c4.b.Y(p3, this);
            return;
        } else {
            this.getSuperCaller().c(p3);
            return;
        }
    }

    public void setLineHeight(int p1)
    {
        c4.b.Z(p1, this);
        return;
    }

    public final void setLineHeight(int p3, float p4)
    {
        android.util.DisplayMetrics v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 34) {
            if (v0_0 < 34) {
                c4.b.Z(Math.round(android.util.TypedValue.applyDimension(p3, p4, this.getResources().getDisplayMetrics())), this);
                return;
            } else {
                q0.a0.h(this, p3, p4);
                return;
            }
        } else {
            this.getSuperCaller().m(p3, p4);
            return;
        }
    }

    public void setPrecomputedText(o0.d p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            c4.b.E(this);
            throw 0;
        } else {
            throw 0;
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.u(p2);
        }
        return;
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.v(p2);
        }
        return;
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList p2)
    {
        n.x0 v0 = this.b;
        v0.l(p2);
        v0.b();
        return;
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.x0 v0 = this.b;
        v0.m(p2);
        v0.b();
        return;
    }

    public void setTextAppearance(android.content.Context p2, int p3)
    {
        super.setTextAppearance(p2, p3);
        n.x0 v0 = this.b;
        if (v0 != null) {
            v0.g(p2, p3);
        }
        return;
    }

    public void setTextClassifier(android.view.textclassifier.TextClassifier p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            n.b1 v0_2 = this.c;
            if (v0_2 != null) {
                v0_2.c = p3;
                return;
            }
        }
        this.getSuperCaller();
        super.setTextClassifier(p3);
        return;
    }

    public void setTextFuture(java.util.concurrent.Future p1)
    {
        this.m = p1;
        if (p1 != null) {
            this.requestLayout();
        }
        return;
    }

    public void setTextMetricsParamsCompat(o0.c p6)
    {
        int v0_0 = p6.b;
        android.text.TextPaint v1_0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int v2 = 1;
        if (v0_0 != v1_0) {
            android.text.TextDirectionHeuristic v3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            if (v0_0 != v3) {
                if (v0_0 != android.text.TextDirectionHeuristics.ANYRTL_LTR) {
                    if (v0_0 != android.text.TextDirectionHeuristics.LTR) {
                        if (v0_0 != android.text.TextDirectionHeuristics.RTL) {
                            if (v0_0 != android.text.TextDirectionHeuristics.LOCALE) {
                                if (v0_0 != v3) {
                                    if (v0_0 == v1_0) {
                                        v2 = 7;
                                    }
                                } else {
                                    v2 = 6;
                                }
                            } else {
                                v2 = 5;
                            }
                        } else {
                            v2 = 4;
                        }
                    } else {
                        v2 = 3;
                    }
                } else {
                    v2 = 2;
                }
            }
        }
        this.setTextDirection(v2);
        this.getPaint().set(p6.a);
        this.setBreakStrategy(p6.c);
        this.setHyphenationFrequency(p6.d);
        return;
    }

    public final void setTextSize(int p3, float p4)
    {
        boolean v0_0 = n.k3.c;
        if (!v0_0) {
            n.g1 v1_0 = this.b;
            if (v1_0 != null) {
                n.g1 v1_1 = v1_0.i;
                if ((!v0_0) && (!v1_1.f())) {
                    v1_1.g(p3, p4);
                }
            }
            return;
        } else {
            super.setTextSize(p3, p4);
            return;
        }
    }

    public final void setTypeface(android.graphics.Typeface p3, int p4)
    {
        if (!this.e) {
            if ((p3 == null) || (p4 <= null)) {
                int v0_1 = 0;
            } else {
                if (this.getContext() == null) {
                    throw new IllegalArgumentException("Context cannot be null");
                } else {
                    v0_1 = android.graphics.Typeface.create(p3, p4);
                }
            }
            this.e = 1;
            if (v0_1 != 0) {
                p3 = v0_1;
            }
            try {
                super.setTypeface(p3, p4);
                this.e = 0;
                return;
            } catch (Throwable v3_2) {
                this.e = 0;
                throw v3_2;
            }
        } else {
            return;
        }
    }
}
